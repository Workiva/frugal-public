// Autogenerated by Frugal Compiler (3.17.2)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING



// ignore_for_file: unused_import
// ignore_for_file: unused_field
// ignore_for_file: invalid_null_aware_operator
// ignore_for_file: unnecessary_non_null_assertion
// ignore_for_file: unnecessary_null_comparison
import 'dart:async';
import 'dart:typed_data' show Uint8List;

import 'package:collection/collection.dart';
import 'package:logging/logging.dart' as logging;
import 'package:thrift/thrift.dart' as thrift;
import 'package:frugal/frugal.dart' as frugal;
import 'package:w_common/disposable.dart' as disposable;

import 'package:frugal_test/frugal_test.dart' as t_frugal_test;


abstract class FSuperService {
  Future testSuperClass(frugal.FContext ctx);
}

FSuperServiceClient fSuperServiceClientFactory(frugal.FServiceProvider provider, {List<frugal.Middleware> middleware}) =>
    FSuperServiceClient(provider, middleware);

class FSuperServiceClient extends disposable.Disposable implements FSuperService {
  static final logging.Logger _frugalLog = logging.Logger('SuperService');
  Map<String, frugal.FMethod> _methods;

  FSuperServiceClient(frugal.FServiceProvider provider, [List<frugal.Middleware> middleware])
      : this._provider = provider {
    _transport = provider.transport;
    _protocolFactory = provider.protocolFactory;
    var combined = middleware ?? [];
    combined.addAll(provider.middleware);
    this._methods = {};
    this._methods['testSuperClass'] = frugal.FMethod(this._testSuperClass, 'SuperService', 'testSuperClass', combined);
  }

  frugal.FServiceProvider _provider;
  frugal.FTransport _transport;
  frugal.FProtocolFactory _protocolFactory;

  @override
  Future<Null> onDispose() async {
    if (!_provider.isOrWillBeDisposed)  {
      return _provider.dispose();
    }
    return null;
  }

  @override
  Future testSuperClass(frugal.FContext ctx) {
    return this._methods['testSuperClass']([ctx]);
  }

  Future _testSuperClass(frugal.FContext ctx) async {
    final args = testSuperClass_args();
    final message = frugal.prepareMessage(ctx, 'testSuperClass', args, thrift.TMessageType.CALL, _protocolFactory, _transport.requestSizeLimit);
    var response = await _transport.request(ctx, message);

    final result = testSuperClass_result();
    frugal.processReply(ctx, result, response, _protocolFactory);
  }
}

// ignore: camel_case_types
class testSuperClass_args extends frugal.FGeneratedArgsResultBase {
  static final thrift.TStruct _STRUCT_DESC = thrift.TStruct('testSuperClass_args');



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
class testSuperClass_result extends frugal.FGeneratedArgsResultBase {


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
