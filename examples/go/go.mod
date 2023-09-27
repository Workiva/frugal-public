module github.com/Workiva/frugal/examples/go

go 1.20

require (
	github.com/Workiva/frugal/lib/go v0.0.0
	github.com/apache/thrift v0.19.0
	github.com/go-stomp/stomp v2.1.4+incompatible
	github.com/nats-io/nats.go v1.30.1
	github.com/rs/cors v1.10.0
	github.com/sirupsen/logrus v1.9.3
)

require (
	github.com/golang/protobuf v1.5.2 // indirect
	github.com/klauspost/compress v1.17.0 // indirect
	github.com/kr/text v0.2.0 // indirect
	github.com/nats-io/nkeys v0.4.5 // indirect
	github.com/nats-io/nuid v1.0.1 // indirect
	golang.org/x/crypto v0.12.0 // indirect
	golang.org/x/sys v0.11.0 // indirect
	google.golang.org/protobuf v1.28.1 // indirect
)

replace github.com/Workiva/frugal/lib/go v0.0.0 => ../../lib/go
