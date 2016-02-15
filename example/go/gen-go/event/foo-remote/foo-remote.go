// Autogenerated by Thrift Compiler (1.0.0-dev)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

package main

import (
	"flag"
	"fmt"
	"git.apache.org/thrift.git/lib/go/thrift"
	"github.com/Workiva/frugal/example/go/gen-go/base"
	"github.com/Workiva/frugal/example/go/gen-go/event"
	"math"
	"net"
	"net/url"
	"os"
	"strconv"
	"strings"
)

func Usage() {
	fmt.Fprintln(os.Stderr, "Usage of ", os.Args[0], " [-h host:port] [-u url] [-f[ramed]] function [arg1 [arg2...]]:")
	flag.PrintDefaults()
	fmt.Fprintln(os.Stderr, "\nFunctions:")
	fmt.Fprintln(os.Stderr, "  void ping()")
	fmt.Fprintln(os.Stderr, "  i64 blah(i32 num, string Str, Event event)")
	fmt.Fprintln(os.Stderr, "  void oneWay(id id, request req)")
	fmt.Fprintln(os.Stderr, "  void basePing()")
	fmt.Fprintln(os.Stderr)
	os.Exit(0)
}

func main() {
	flag.Usage = Usage
	var host string
	var port int
	var protocol string
	var urlString string
	var framed bool
	var useHttp bool
	var parsedUrl url.URL
	var trans thrift.TTransport
	_ = strconv.Atoi
	_ = math.Abs
	flag.Usage = Usage
	flag.StringVar(&host, "h", "localhost", "Specify host and port")
	flag.IntVar(&port, "p", 9090, "Specify port")
	flag.StringVar(&protocol, "P", "binary", "Specify the protocol (binary, compact, simplejson, json)")
	flag.StringVar(&urlString, "u", "", "Specify the url")
	flag.BoolVar(&framed, "framed", false, "Use framed transport")
	flag.BoolVar(&useHttp, "http", false, "Use http")
	flag.Parse()

	if len(urlString) > 0 {
		parsedUrl, err := url.Parse(urlString)
		if err != nil {
			fmt.Fprintln(os.Stderr, "Error parsing URL: ", err)
			flag.Usage()
		}
		host = parsedUrl.Host
		useHttp = len(parsedUrl.Scheme) <= 0 || parsedUrl.Scheme == "http"
	} else if useHttp {
		_, err := url.Parse(fmt.Sprint("http://", host, ":", port))
		if err != nil {
			fmt.Fprintln(os.Stderr, "Error parsing URL: ", err)
			flag.Usage()
		}
	}

	cmd := flag.Arg(0)
	var err error
	if useHttp {
		trans, err = thrift.NewTHttpClient(parsedUrl.String())
	} else {
		portStr := fmt.Sprint(port)
		if strings.Contains(host, ":") {
			host, portStr, err = net.SplitHostPort(host)
			if err != nil {
				fmt.Fprintln(os.Stderr, "error with host:", err)
				os.Exit(1)
			}
		}
		trans, err = thrift.NewTSocket(net.JoinHostPort(host, portStr))
		if err != nil {
			fmt.Fprintln(os.Stderr, "error resolving address:", err)
			os.Exit(1)
		}
		if framed {
			trans = thrift.NewTFramedTransport(trans)
		}
	}
	if err != nil {
		fmt.Fprintln(os.Stderr, "Error creating transport", err)
		os.Exit(1)
	}
	defer trans.Close()
	var protocolFactory thrift.TProtocolFactory
	switch protocol {
	case "compact":
		protocolFactory = thrift.NewTCompactProtocolFactory()
		break
	case "simplejson":
		protocolFactory = thrift.NewTSimpleJSONProtocolFactory()
		break
	case "json":
		protocolFactory = thrift.NewTJSONProtocolFactory()
		break
	case "binary", "":
		protocolFactory = thrift.NewTBinaryProtocolFactoryDefault()
		break
	default:
		fmt.Fprintln(os.Stderr, "Invalid protocol specified: ", protocol)
		Usage()
		os.Exit(1)
	}
	client := event.NewFooClientFactory(trans, protocolFactory)
	if err := trans.Open(); err != nil {
		fmt.Fprintln(os.Stderr, "Error opening socket to ", host, ":", port, " ", err)
		os.Exit(1)
	}

	switch cmd {
	case "ping":
		if flag.NArg()-1 != 0 {
			fmt.Fprintln(os.Stderr, "Ping requires 0 args")
			flag.Usage()
		}
		fmt.Print(client.Ping())
		fmt.Print("\n")
		break
	case "blah":
		if flag.NArg()-1 != 3 {
			fmt.Fprintln(os.Stderr, "Blah requires 3 args")
			flag.Usage()
		}
		tmp0, err7 := (strconv.Atoi(flag.Arg(1)))
		if err7 != nil {
			Usage()
			return
		}
		argvalue0 := int32(tmp0)
		value0 := argvalue0
		argvalue1 := flag.Arg(2)
		value1 := argvalue1
		arg9 := flag.Arg(3)
		mbTrans10 := thrift.NewTMemoryBufferLen(len(arg9))
		defer mbTrans10.Close()
		_, err11 := mbTrans10.WriteString(arg9)
		if err11 != nil {
			Usage()
			return
		}
		factory12 := thrift.NewTSimpleJSONProtocolFactory()
		jsProt13 := factory12.GetProtocol(mbTrans10)
		argvalue2 := event.NewEvent()
		err14 := argvalue2.Read(jsProt13)
		if err14 != nil {
			Usage()
			return
		}
		value2 := argvalue2
		fmt.Print(client.Blah(value0, value1, value2))
		fmt.Print("\n")
		break
	case "oneWay":
		if flag.NArg()-1 != 2 {
			fmt.Fprintln(os.Stderr, "OneWay requires 2 args")
			flag.Usage()
		}
		argvalue0, err15 := (strconv.ParseInt(flag.Arg(1), 10, 64))
		if err15 != nil {
			Usage()
			return
		}
		value0 := event.ID(argvalue0)
		arg16 := flag.Arg(2)
		mbTrans17 := thrift.NewTMemoryBufferLen(len(arg16))
		defer mbTrans17.Close()
		_, err18 := mbTrans17.WriteString(arg16)
		if err18 != nil {
			Usage()
			return
		}
		factory19 := thrift.NewTSimpleJSONProtocolFactory()
		jsProt20 := factory19.GetProtocol(mbTrans17)
		containerStruct1 := event.NewFooOneWayArgs()
		err21 := containerStruct1.ReadField2(jsProt20)
		if err21 != nil {
			Usage()
			return
		}
		argvalue1 := containerStruct1.Req
		value1 := event.Request(argvalue1)
		fmt.Print(client.OneWay(value0, value1))
		fmt.Print("\n")
		break
	case "basePing":
		if flag.NArg()-1 != 0 {
			fmt.Fprintln(os.Stderr, "BasePing requires 0 args")
			flag.Usage()
		}
		fmt.Print(client.BasePing())
		fmt.Print("\n")
		break
	case "":
		Usage()
		break
	default:
		fmt.Fprintln(os.Stderr, "Invalid function ", cmd)
	}
}
