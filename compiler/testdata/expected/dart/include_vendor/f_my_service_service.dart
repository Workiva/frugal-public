// Autogenerated by Frugal Compiler (3.16.26)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING



// ignore_for_file: unused_import
// ignore_for_file: unused_field
import 'dart:async';
import 'dart:typed_data' show Uint8List;

import 'package:collection/collection.dart';
import 'package:logging/logging.dart' as logging;
import 'package:thrift/thrift.dart' as thrift;
import 'package:frugal/frugal.dart' as frugal;
import 'package:w_common/disposable.dart' as disposable;

import 'package:some_vendored_place/vendor_namespace.dart' as t_vendor_namespace;
import 'package:excepts/excepts.dart' as t_excepts;
import 'package:include_vendor/include_vendor.dart' as t_include_vendor;


abstract class FMyService extends t_vendor_namespace.FVendoredBase {
  Future<t_vendor_namespace.Item?> getItem(frugal.FContext ctx);
}

FMyServiceClient fMyServiceClientFactory(frugal.FServiceProvider provider, {List<frugal.Middleware>? middleware}) =>
    FMyServiceClient(provider, middleware);

// The below ignore statement is only needed to workaround https://github.com/dart-lang/sdk/issues/29751, which is fixed on Dart 2.8.0 and later.
// Dart versions before 2.8.0 need this ignore to analyze properly.
// ignore: private_collision_in_mixin_application
class FMyServiceClient extends t_vendor_namespace.FVendoredBaseClient with disposable.Disposable implements FMyService {
  static final logging.Logger _frugalLog = logging.Logger('MyService');
  Map<String, frugal.FMethod> _methods = {};

  FMyServiceClient(frugal.FServiceProvider provider, [List<frugal.Middleware>? middleware])
      : this._provider = provider,
        super(provider, middleware) {
    _transport = provider.transport;
    _protocolFactory = provider.protocolFactory;
    var combined = middleware ?? [];
    combined.addAll(provider.middleware);
    this._methods['getItem'] = frugal.FMethod(this._getItem, 'MyService', 'getItem', combined);
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
  Future<t_vendor_namespace.Item?> getItem(frugal.FContext ctx) {
    return this._methods['getItem']([ctx]).then((value) => value as t_vendor_namespace.Item);
  }

  Future<t_vendor_namespace.Item?> _getItem(frugal.FContext ctx) async {
    final args = getItem_args();
    final message = frugal.prepareMessage(ctx, 'getItem', args, thrift.TMessageType.CALL, _protocolFactory, _transport.requestSizeLimit);
    var response = await _transport.request(ctx, message);

    final result = getItem_result();
    frugal.processReply(ctx, result, response, _protocolFactory);
    if (result.success != null) {
      return result.success;
    }

    if (result.d != null) {
      throw result.d;
    }
    throw thrift.TApplicationError(
      frugal.FrugalTApplicationErrorType.MISSING_RESULT, 'getItem failed: unknown result'
    );
  }
}

// ignore: camel_case_types
class getItem_args extends frugal.FGeneratedArgsResultBase {
  static final thrift.TStruct _STRUCT_DESC = thrift.TStruct('getItem_args');



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
class getItem_result extends frugal.FGeneratedArgsResultBase {
  t_vendor_namespace.Item? success;
  t_excepts.InvalidData? d;


  @override
  read(thrift.TProtocol iprot) {
    iprot.readStructBegin();
    for (thrift.TField field = iprot.readFieldBegin();
        field.type != thrift.TType.STOP;
        field = iprot.readFieldBegin()) {
      switch (field.id) {
        case 0:
          if (field.type == thrift.TType.STRUCT) {
            this.success = t_vendor_namespace.Item();
            success.read(iprot);
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 1:
          if (field.type == thrift.TType.STRUCT) {
            this.d = t_excepts.InvalidData();
            d.read(iprot);
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
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
