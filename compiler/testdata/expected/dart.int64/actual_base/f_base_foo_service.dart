// @dart=2.11
// Autogenerated by Frugal Compiler (3.17.0)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING



// ignore_for_file: unused_import
// ignore_for_file: unused_field
import 'dart:async';
import 'dart:typed_data' show Uint8List;

import 'package:collection/collection.dart';
import 'package:fixnum/fixnum.dart' as fixnum;
import 'package:logging/logging.dart' as logging;
import 'package:thrift/thrift.dart' as thrift;
import 'package:frugal/frugal.dart' as frugal;
import 'package:w_common/disposable.dart' as disposable;

import 'package:actual_base_dart/actual_base_dart.dart' as t_actual_base_dart;


abstract class FBaseFoo {
  Future basePing(frugal.FContext ctx);
}

FBaseFooClient fBaseFooClientFactory(frugal.FServiceProvider provider, {List<frugal.Middleware> middleware}) =>
    FBaseFooClient(provider, middleware);

class FBaseFooClient extends disposable.Disposable implements FBaseFoo {
  static final logging.Logger _frugalLog = logging.Logger('BaseFoo');
  Map<String, frugal.FMethod> _methods = {};

  FBaseFooClient(frugal.FServiceProvider provider, [List<frugal.Middleware> middleware])
      : this._provider = provider,
    _transport = provider.transport,
    _protocolFactory = provider.protocolFactory {
    var combined = middleware ?? [];
    combined.addAll(provider.middleware);
    this._methods['basePing'] = frugal.FMethod(this._basePing, 'BaseFoo', 'basePing', combined);
  }

  frugal.FServiceProvider _provider;
  frugal.FTransport _transport;
  frugal.FProtocolFactory _protocolFactory;

  @override
  Future<Null> onDispose() async {
    if (_provider is disposable.Disposable && !_provider.isOrWillBeDisposed)  {
      return _provider.dispose();
    }
    return null;
  }

  @override
  Future basePing(frugal.FContext ctx) {
    return this._methods['basePing']([ctx]);
  }

  Future _basePing(frugal.FContext ctx) async {
    final args = basePing_args();
    final message = frugal.prepareMessage(ctx, 'basePing', args, thrift.TMessageType.CALL, _protocolFactory, _transport.requestSizeLimit);
    var response = (await _transport.request(ctx, message));

    final result = basePing_result();
    frugal.processReply(ctx, result, response, _protocolFactory);
  }
}

// ignore: camel_case_types
class basePing_args extends frugal.FGeneratedArgsResultBase {
  static final thrift.TStruct _STRUCT_DESC = thrift.TStruct('basePing_args');



  @override
  write(thrift.TProtocol oprot) {
    validate();

    oprot.writeStructBegin(_STRUCT_DESC);
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  validate() {
  }
}
// ignore: camel_case_types
class basePing_result extends frugal.FGeneratedArgsResultBase {


  @override
  read(thrift.TProtocol iprot) {
    iprot.readStructBegin();
    for (thrift.TField field = iprot.readFieldBegin();
        field.type != thrift.TType.STOP;
        field = iprot.readFieldBegin()) {
      switch (field.id) {
        default:
          thrift.TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    validate();
  }

  validate() {
  }
}
