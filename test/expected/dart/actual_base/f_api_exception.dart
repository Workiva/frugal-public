// Autogenerated by Frugal Compiler (3.9.2)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

// ignore_for_file: unused_import
// ignore_for_file: unused_field
import 'dart:typed_data' show Uint8List;

import 'package:collection/collection.dart';
import 'package:thrift/thrift.dart' as thrift;
import 'package:actual_base_dart/actual_base_dart.dart' as t_actual_base_dart;

// ignore: camel_case_types
class api_exception extends Error implements thrift.TBase {
  static final thrift.TStruct _STRUCT_DESC = thrift.TStruct('api_exception');



  api_exception();

  @override
  getFieldValue(int fieldID) {
    switch (fieldID) {
      default:
        throw ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  @override
  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      default:
        throw ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if the field corresponding to fieldID is set (has been assigned a value) and false otherwise
  @override
  bool isSet(int fieldID) {
    switch (fieldID) {
      default:
        throw ArgumentError("Field $fieldID doesn't exist!");
    }
  }

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

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  @override
  write(thrift.TProtocol oprot) {
    validate();

    oprot.writeStructBegin(_STRUCT_DESC);
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @override
  String toString() {
    StringBuffer ret = StringBuffer('api_exception(');

    ret.write(')');

    return ret.toString();
  }

  @override
  bool operator ==(Object o) {
    return o is api_exception;
  }

  @override
  int get hashCode {
    var value = 17;
    return value;
  }

  api_exception clone() {
    return api_exception();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }
}
