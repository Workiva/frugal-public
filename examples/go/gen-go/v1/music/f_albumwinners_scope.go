// Autogenerated by Frugal Compiler (2.0.0-RC8)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

package music

import (
	"fmt"

	"git.apache.org/thrift.git/lib/go/thrift"
	"github.com/Workiva/frugal/lib/go"
)

const delimiter = "."

// Scopes are a Frugal extension to the IDL for declaring PubSub
// semantics. Subscribers to this scope will be notified if they win a contest.
// Scopes must have a prefix.
type AlbumWinnersPublisher interface {
	Open() error
	Close() error
	PublishWinner(ctx frugal.FContext, req *Album) error
}

type albumWinnersPublisher struct {
	transport       frugal.FPublisherTransport
	protocolFactory *frugal.FProtocolFactory
	methods         map[string]*frugal.Method
}

func NewAlbumWinnersPublisher(provider *frugal.FScopeProvider, middleware ...frugal.ServiceMiddleware) AlbumWinnersPublisher {
	transport, protocolFactory := provider.NewPublisher()
	methods := make(map[string]*frugal.Method)
	publisher := &albumWinnersPublisher{
		transport:       transport,
		protocolFactory: protocolFactory,
		methods:         methods,
	}
	middleware = append(middleware, provider.GetMiddleware()...)
	methods["publishWinner"] = frugal.NewMethod(publisher, publisher.publishWinner, "publishWinner", middleware)
	return publisher
}

func (l *albumWinnersPublisher) Open() error {
	return l.transport.Open()
}

func (l *albumWinnersPublisher) Close() error {
	return l.transport.Close()
}

func (l *albumWinnersPublisher) PublishWinner(ctx frugal.FContext, req *Album) error {
	ret := l.methods["publishWinner"].Invoke([]interface{}{ctx, req})
	if ret[0] != nil {
		return ret[0].(error)
	}
	return nil
}

func (l *albumWinnersPublisher) publishWinner(ctx frugal.FContext, req *Album) error {
	op := "Winner"
	prefix := "v1.music."
	topic := fmt.Sprintf("%sAlbumWinners%s%s", prefix, delimiter, op)
	buffer := frugal.NewTMemoryOutputBuffer(l.transport.GetPublishSizeLimit())
	oprot := l.protocolFactory.GetProtocol(buffer)
	if err := oprot.WriteRequestHeader(ctx); err != nil {
		return err
	}
	if err := oprot.WriteMessageBegin(op, thrift.CALL, 0); err != nil {
		return err
	}
	if err := req.Write(oprot); err != nil {
		return err
	}
	if err := oprot.WriteMessageEnd(); err != nil {
		return err
	}
	if err := oprot.Flush(); err != nil {
		return err
	}
	return l.transport.Publish(topic, buffer.Bytes())
}

// Scopes are a Frugal extension to the IDL for declaring PubSub
// semantics. Subscribers to this scope will be notified if they win a contest.
// Scopes must have a prefix.
type AlbumWinnersSubscriber interface {
	SubscribeWinner(handler func(frugal.FContext, *Album)) (*frugal.FSubscription, error)
}

type albumWinnersSubscriber struct {
	provider   *frugal.FScopeProvider
	middleware []frugal.ServiceMiddleware
}

func NewAlbumWinnersSubscriber(provider *frugal.FScopeProvider, middleware ...frugal.ServiceMiddleware) AlbumWinnersSubscriber {
	middleware = append(middleware, provider.GetMiddleware()...)
	return &albumWinnersSubscriber{provider: provider, middleware: middleware}
}

func (l *albumWinnersSubscriber) SubscribeWinner(handler func(frugal.FContext, *Album)) (*frugal.FSubscription, error) {
	op := "Winner"
	prefix := "v1.music."
	topic := fmt.Sprintf("%sAlbumWinners%s%s", prefix, delimiter, op)
	transport, protocolFactory := l.provider.NewSubscriber()
	cb := l.recvWinner(op, protocolFactory, handler)
	if err := transport.Subscribe(topic, cb); err != nil {
		return nil, err
	}

	sub := frugal.NewFSubscription(topic, transport)
	return sub, nil
}

func (l *albumWinnersSubscriber) recvWinner(op string, pf *frugal.FProtocolFactory, handler func(frugal.FContext, *Album)) frugal.FAsyncCallback {
	method := frugal.NewMethod(l, handler, "SubscribeWinner", l.middleware)
	return func(transport thrift.TTransport) error {
		iprot := pf.GetProtocol(transport)
		ctx, err := iprot.ReadRequestHeader()
		if err != nil {
			return err
		}

		name, _, _, err := iprot.ReadMessageBegin()
		if err != nil {
			return err
		}

		if name != op {
			iprot.Skip(thrift.STRUCT)
			iprot.ReadMessageEnd()
			return thrift.NewTApplicationException(frugal.APPLICATION_EXCEPTION_UNKNOWN_METHOD, "Unknown function"+name)
		}
		req := &Album{}
		if err := req.Read(iprot); err != nil {
			return err
		}
		iprot.ReadMessageEnd()

		method.Invoke([]interface{}{ctx, req})
		return nil
	}
}
