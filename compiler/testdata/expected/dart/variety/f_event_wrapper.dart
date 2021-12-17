// Autogenerated by Frugal Compiler (3.14.12)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

// ignore_for_file: unused_import
// ignore_for_file: unused_field
import 'dart:typed_data' show Uint8List;

import 'package:collection/collection.dart';
import 'package:thrift/thrift.dart' as thrift;
import 'package:variety/variety.dart' as t_variety;
import 'package:actual_base_dart/actual_base_dart.dart' as t_actual_base_dart;
import 'package:intermediate_include/intermediate_include.dart' as t_intermediate_include;
import 'package:validStructs/validStructs.dart' as t_validStructs;
import 'package:ValidTypes/ValidTypes.dart' as t_ValidTypes;
import 'package:subdir_include_ns/subdir_include_ns.dart' as t_subdir_include_ns;

class EventWrapper implements thrift.TBase {
  static final thrift.TStruct _STRUCT_DESC = thrift.TStruct('EventWrapper');
  static final thrift.TField _ID_FIELD_DESC = thrift.TField('ID', thrift.TType.I64, 1);
  static final thrift.TField _EV_FIELD_DESC = thrift.TField('Ev', thrift.TType.STRUCT, 2);
  static final thrift.TField _EVENTS_FIELD_DESC = thrift.TField('Events', thrift.TType.LIST, 3);
  static final thrift.TField _EVENTS2_FIELD_DESC = thrift.TField('Events2', thrift.TType.SET, 4);
  static final thrift.TField _EVENT_MAP_FIELD_DESC = thrift.TField('EventMap', thrift.TType.MAP, 5);
  static final thrift.TField _NUMS_FIELD_DESC = thrift.TField('Nums', thrift.TType.LIST, 6);
  static final thrift.TField _ENUMS_FIELD_DESC = thrift.TField('Enums', thrift.TType.LIST, 7);
  static final thrift.TField _A_BOOL_FIELD_FIELD_DESC = thrift.TField('aBoolField', thrift.TType.BOOL, 8);
  static final thrift.TField _A_UNION_FIELD_DESC = thrift.TField('a_union', thrift.TType.STRUCT, 9);
  static final thrift.TField _TYPEDEF_OF_TYPEDEF_FIELD_DESC = thrift.TField('typedefOfTypedef', thrift.TType.STRING, 10);
  static final thrift.TField _DEPR_FIELD_DESC = thrift.TField('depr', thrift.TType.BOOL, 11);
  static final thrift.TField _DEPR_BINARY_FIELD_DESC = thrift.TField('deprBinary', thrift.TType.STRING, 12);
  static final thrift.TField _DEPR_LIST_FIELD_DESC = thrift.TField('deprList', thrift.TType.LIST, 13);
  static final thrift.TField _EVENTS_DEFAULT_FIELD_DESC = thrift.TField('EventsDefault', thrift.TType.LIST, 14);
  static final thrift.TField _EVENT_MAP_DEFAULT_FIELD_DESC = thrift.TField('EventMapDefault', thrift.TType.MAP, 15);
  static final thrift.TField _EVENT_SET_DEFAULT_FIELD_DESC = thrift.TField('EventSetDefault', thrift.TType.SET, 16);

  int _iD;
  static const int ID = 1;
  t_variety.Event _ev;
  static const int EV = 2;
  List<t_variety.Event> _events;
  static const int EVENTS = 3;
  Set<t_variety.Event> _events2;
  static const int EVENTS2 = 4;
  Map<int, t_variety.Event> _eventMap;
  static const int EVENTMAP = 5;
  List<List<int>> _nums;
  static const int NUMS = 6;
  List<int> _enums;
  static const int ENUMS = 7;
  bool _aBoolField = false;
  static const int ABOOLFIELD = 8;
  t_variety.TestingUnions _a_union;
  static const int A_UNION = 9;
  String _typedefOfTypedef;
  static const int TYPEDEFOFTYPEDEF = 10;
  /// This is a docstring comment for a deprecated field that has been spread
  /// across two lines.
  /// Deprecated: use something else
  @deprecated
  bool _depr = false;
  static const int DEPR = 11;
  /// Deprecated: use something else
  @deprecated
  Uint8List _deprBinary;
  static const int DEPRBINARY = 12;
  /// Deprecated: use something else
  @deprecated
  List<bool> _deprList;
  static const int DEPRLIST = 13;
  List<t_variety.Event> _eventsDefault;
  static const int EVENTSDEFAULT = 14;
  Map<int, t_variety.Event> _eventMapDefault;
  static const int EVENTMAPDEFAULT = 15;
  Set<t_variety.Event> _eventSetDefault;
  static const int EVENTSETDEFAULT = 16;

  bool __isset_iD = false;
  bool __isset_aBoolField = false;
  bool __isset_depr = false;

  EventWrapper() {
    this._eventsDefault = [
    ];
    this._eventMapDefault = {
    };
    this._eventSetDefault = Set<t_variety.Event>.from([
    ]);
  }

  int get iD => this._iD;

  set iD(int iD) {
    this._iD = iD;
    this.__isset_iD = true;
  }

  bool isSetID() => this.__isset_iD;

  unsetID() {
    this.__isset_iD = false;
  }

  t_variety.Event get ev => this._ev;

  set ev(t_variety.Event ev) {
    this._ev = ev;
  }

  bool isSetEv() => this.ev != null;

  unsetEv() {
    this.ev = null;
  }

  List<t_variety.Event> get events => this._events;

  set events(List<t_variety.Event> events) {
    this._events = events;
  }

  bool isSetEvents() => this.events != null;

  unsetEvents() {
    this.events = null;
  }

  Set<t_variety.Event> get events2 => this._events2;

  set events2(Set<t_variety.Event> events2) {
    this._events2 = events2;
  }

  bool isSetEvents2() => this.events2 != null;

  unsetEvents2() {
    this.events2 = null;
  }

  Map<int, t_variety.Event> get eventMap => this._eventMap;

  set eventMap(Map<int, t_variety.Event> eventMap) {
    this._eventMap = eventMap;
  }

  bool isSetEventMap() => this.eventMap != null;

  unsetEventMap() {
    this.eventMap = null;
  }

  List<List<int>> get nums => this._nums;

  set nums(List<List<int>> nums) {
    this._nums = nums;
  }

  bool isSetNums() => this.nums != null;

  unsetNums() {
    this.nums = null;
  }

  List<int> get enums => this._enums;

  set enums(List<int> enums) {
    this._enums = enums;
  }

  bool isSetEnums() => this.enums != null;

  unsetEnums() {
    this.enums = null;
  }

  bool get aBoolField => this._aBoolField;

  set aBoolField(bool aBoolField) {
    this._aBoolField = aBoolField;
    this.__isset_aBoolField = true;
  }

  bool isSetABoolField() => this.__isset_aBoolField;

  unsetABoolField() {
    this.__isset_aBoolField = false;
  }

  t_variety.TestingUnions get a_union => this._a_union;

  set a_union(t_variety.TestingUnions a_union) {
    this._a_union = a_union;
  }

  bool isSetA_union() => this.a_union != null;

  unsetA_union() {
    this.a_union = null;
  }

  String get typedefOfTypedef => this._typedefOfTypedef;

  set typedefOfTypedef(String typedefOfTypedef) {
    this._typedefOfTypedef = typedefOfTypedef;
  }

  bool isSetTypedefOfTypedef() => this.typedefOfTypedef != null;

  unsetTypedefOfTypedef() {
    this.typedefOfTypedef = null;
  }

  /// This is a docstring comment for a deprecated field that has been spread
  /// across two lines.
  /// Deprecated: use something else
  @deprecated
  bool get depr => this._depr;

  /// This is a docstring comment for a deprecated field that has been spread
  /// across two lines.
  /// Deprecated: use something else
  @deprecated
  set depr(bool depr) {
    this._depr = depr;
    this.__isset_depr = true;
  }

  @deprecated  bool isSetDepr() => this.__isset_depr;

  unsetDepr() {
    this.__isset_depr = false;
  }

  /// Deprecated: use something else
  @deprecated
  Uint8List get deprBinary => this._deprBinary;

  /// Deprecated: use something else
  @deprecated
  set deprBinary(Uint8List deprBinary) {
    this._deprBinary = deprBinary;
  }

  @deprecated  bool isSetDeprBinary() => this.deprBinary != null;

  unsetDeprBinary() {
    // ignore: deprecated_member_use
    this.deprBinary = null;
  }

  /// Deprecated: use something else
  @deprecated
  List<bool> get deprList => this._deprList;

  /// Deprecated: use something else
  @deprecated
  set deprList(List<bool> deprList) {
    this._deprList = deprList;
  }

  @deprecated  bool isSetDeprList() => this.deprList != null;

  unsetDeprList() {
    // ignore: deprecated_member_use
    this.deprList = null;
  }

  List<t_variety.Event> get eventsDefault => this._eventsDefault;

  set eventsDefault(List<t_variety.Event> eventsDefault) {
    this._eventsDefault = eventsDefault;
  }

  bool isSetEventsDefault() => this.eventsDefault != null;

  unsetEventsDefault() {
    this.eventsDefault = null;
  }

  Map<int, t_variety.Event> get eventMapDefault => this._eventMapDefault;

  set eventMapDefault(Map<int, t_variety.Event> eventMapDefault) {
    this._eventMapDefault = eventMapDefault;
  }

  bool isSetEventMapDefault() => this.eventMapDefault != null;

  unsetEventMapDefault() {
    this.eventMapDefault = null;
  }

  Set<t_variety.Event> get eventSetDefault => this._eventSetDefault;

  set eventSetDefault(Set<t_variety.Event> eventSetDefault) {
    this._eventSetDefault = eventSetDefault;
  }

  bool isSetEventSetDefault() => this.eventSetDefault != null;

  unsetEventSetDefault() {
    this.eventSetDefault = null;
  }

  @override
  getFieldValue(int fieldID) {
    switch (fieldID) {
      case ID:
        return this.iD;
      case EV:
        return this.ev;
      case EVENTS:
        return this.events;
      case EVENTS2:
        return this.events2;
      case EVENTMAP:
        return this.eventMap;
      case NUMS:
        return this.nums;
      case ENUMS:
        return this.enums;
      case ABOOLFIELD:
        return this.aBoolField;
      case A_UNION:
        return this.a_union;
      case TYPEDEFOFTYPEDEF:
        return this.typedefOfTypedef;
      case DEPR:
        // ignore: deprecated_member_use
        return this.depr;
      case DEPRBINARY:
        // ignore: deprecated_member_use
        return this.deprBinary;
      case DEPRLIST:
        // ignore: deprecated_member_use
        return this.deprList;
      case EVENTSDEFAULT:
        return this.eventsDefault;
      case EVENTMAPDEFAULT:
        return this.eventMapDefault;
      case EVENTSETDEFAULT:
        return this.eventSetDefault;
      default:
        throw ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  @override
  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case ID:
        if (value == null) {
          unsetID();
        } else {
          this.iD = value as int;
        }
        break;

      case EV:
        if (value == null) {
          unsetEv();
        } else {
          this.ev = value as t_variety.Event;
        }
        break;

      case EVENTS:
        if (value == null) {
          unsetEvents();
        } else {
          this.events = value as List<t_variety.Event>;
        }
        break;

      case EVENTS2:
        if (value == null) {
          unsetEvents2();
        } else {
          this.events2 = value as Set<t_variety.Event>;
        }
        break;

      case EVENTMAP:
        if (value == null) {
          unsetEventMap();
        } else {
          this.eventMap = value as Map<int, t_variety.Event>;
        }
        break;

      case NUMS:
        if (value == null) {
          unsetNums();
        } else {
          this.nums = value as List<List<int>>;
        }
        break;

      case ENUMS:
        if (value == null) {
          unsetEnums();
        } else {
          this.enums = value as List<int>;
        }
        break;

      case ABOOLFIELD:
        if (value == null) {
          unsetABoolField();
        } else {
          this.aBoolField = value as bool;
        }
        break;

      case A_UNION:
        if (value == null) {
          unsetA_union();
        } else {
          this.a_union = value as t_variety.TestingUnions;
        }
        break;

      case TYPEDEFOFTYPEDEF:
        if (value == null) {
          unsetTypedefOfTypedef();
        } else {
          this.typedefOfTypedef = value as String;
        }
        break;

      case DEPR:
        if (value == null) {
          unsetDepr();
        } else {
          // ignore: deprecated_member_use
          this.depr = value as bool;
        }
        break;

      case DEPRBINARY:
        if (value == null) {
          unsetDeprBinary();
        } else {
          // ignore: deprecated_member_use
          this.deprBinary = value as Uint8List;
        }
        break;

      case DEPRLIST:
        if (value == null) {
          unsetDeprList();
        } else {
          // ignore: deprecated_member_use
          this.deprList = value as List<bool>;
        }
        break;

      case EVENTSDEFAULT:
        if (value == null) {
          unsetEventsDefault();
        } else {
          this.eventsDefault = value as List<t_variety.Event>;
        }
        break;

      case EVENTMAPDEFAULT:
        if (value == null) {
          unsetEventMapDefault();
        } else {
          this.eventMapDefault = value as Map<int, t_variety.Event>;
        }
        break;

      case EVENTSETDEFAULT:
        if (value == null) {
          unsetEventSetDefault();
        } else {
          this.eventSetDefault = value as Set<t_variety.Event>;
        }
        break;

      default:
        throw ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if the field corresponding to fieldID is set (has been assigned a value) and false otherwise
  @override
  bool isSet(int fieldID) {
    switch (fieldID) {
      case ID:
        return isSetID();
      case EV:
        return isSetEv();
      case EVENTS:
        return isSetEvents();
      case EVENTS2:
        return isSetEvents2();
      case EVENTMAP:
        return isSetEventMap();
      case NUMS:
        return isSetNums();
      case ENUMS:
        return isSetEnums();
      case ABOOLFIELD:
        return isSetABoolField();
      case A_UNION:
        return isSetA_union();
      case TYPEDEFOFTYPEDEF:
        return isSetTypedefOfTypedef();
      case DEPR:
        // ignore: deprecated_member_use
        return isSetDepr();
      case DEPRBINARY:
        // ignore: deprecated_member_use
        return isSetDeprBinary();
      case DEPRLIST:
        // ignore: deprecated_member_use
        return isSetDeprList();
      case EVENTSDEFAULT:
        return isSetEventsDefault();
      case EVENTMAPDEFAULT:
        return isSetEventMapDefault();
      case EVENTSETDEFAULT:
        return isSetEventSetDefault();
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
        case ID:
          if (field.type == thrift.TType.I64) {
            this.iD = iprot.readI64();
            this.__isset_iD = true;
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EV:
          if (field.type == thrift.TType.STRUCT) {
            this.ev = t_variety.Event();
            ev.read(iprot);
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EVENTS:
          if (field.type == thrift.TType.LIST) {
            thrift.TList elem21 = iprot.readListBegin();
            this.events = List<t_variety.Event>();
            for(int elem23 = 0; elem23 < elem21.length; ++elem23) {
              t_variety.Event elem22 = t_variety.Event();
              elem22.read(iprot);
              this.events.add(elem22);
            }
            iprot.readListEnd();
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EVENTS2:
          if (field.type == thrift.TType.SET) {
            thrift.TSet elem24 = iprot.readSetBegin();
            this.events2 = Set<t_variety.Event>();
            for(int elem26 = 0; elem26 < elem24.length; ++elem26) {
              t_variety.Event elem25 = t_variety.Event();
              elem25.read(iprot);
              this.events2.add(elem25);
            }
            iprot.readSetEnd();
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EVENTMAP:
          if (field.type == thrift.TType.MAP) {
            thrift.TMap elem27 = iprot.readMapBegin();
            this.eventMap = Map<int, t_variety.Event>();
            for(int elem29 = 0; elem29 < elem27.length; ++elem29) {
              int elem30 = iprot.readI64();
              t_variety.Event elem28 = t_variety.Event();
              elem28.read(iprot);
              this.eventMap[elem30] = elem28;
            }
            iprot.readMapEnd();
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case NUMS:
          if (field.type == thrift.TType.LIST) {
            thrift.TList elem31 = iprot.readListBegin();
            this.nums = List<List<int>>();
            for(int elem36 = 0; elem36 < elem31.length; ++elem36) {
              thrift.TList elem33 = iprot.readListBegin();
              List<int> elem32 = List<int>();
              for(int elem35 = 0; elem35 < elem33.length; ++elem35) {
                int elem34 = iprot.readI32();
                elem32.add(elem34);
              }
              iprot.readListEnd();
              this.nums.add(elem32);
            }
            iprot.readListEnd();
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ENUMS:
          if (field.type == thrift.TType.LIST) {
            thrift.TList elem37 = iprot.readListBegin();
            this.enums = List<int>();
            for(int elem39 = 0; elem39 < elem37.length; ++elem39) {
              int elem38 = iprot.readI32();
              this.enums.add(elem38);
            }
            iprot.readListEnd();
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ABOOLFIELD:
          if (field.type == thrift.TType.BOOL) {
            this.aBoolField = iprot.readBool();
            this.__isset_aBoolField = true;
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case A_UNION:
          if (field.type == thrift.TType.STRUCT) {
            this.a_union = t_variety.TestingUnions();
            a_union.read(iprot);
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TYPEDEFOFTYPEDEF:
          if (field.type == thrift.TType.STRING) {
            this.typedefOfTypedef = iprot.readString();
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DEPR:
          if (field.type == thrift.TType.BOOL) {
            // ignore: deprecated_member_use
            this.depr = iprot.readBool();
            this.__isset_depr = true;
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DEPRBINARY:
          if (field.type == thrift.TType.STRING) {
            // ignore: deprecated_member_use
            this.deprBinary = iprot.readBinary();
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DEPRLIST:
          if (field.type == thrift.TType.LIST) {
            thrift.TList elem40 = iprot.readListBegin();
            // ignore: deprecated_member_use
            this.deprList = List<bool>();
            for(int elem42 = 0; elem42 < elem40.length; ++elem42) {
              bool elem41 = iprot.readBool();
              // ignore: deprecated_member_use
              this.deprList.add(elem41);
            }
            iprot.readListEnd();
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EVENTSDEFAULT:
          if (field.type == thrift.TType.LIST) {
            thrift.TList elem43 = iprot.readListBegin();
            this.eventsDefault = List<t_variety.Event>();
            for(int elem45 = 0; elem45 < elem43.length; ++elem45) {
              t_variety.Event elem44 = t_variety.Event();
              elem44.read(iprot);
              this.eventsDefault.add(elem44);
            }
            iprot.readListEnd();
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EVENTMAPDEFAULT:
          if (field.type == thrift.TType.MAP) {
            thrift.TMap elem46 = iprot.readMapBegin();
            this.eventMapDefault = Map<int, t_variety.Event>();
            for(int elem48 = 0; elem48 < elem46.length; ++elem48) {
              int elem49 = iprot.readI64();
              t_variety.Event elem47 = t_variety.Event();
              elem47.read(iprot);
              this.eventMapDefault[elem49] = elem47;
            }
            iprot.readMapEnd();
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EVENTSETDEFAULT:
          if (field.type == thrift.TType.SET) {
            thrift.TSet elem50 = iprot.readSetBegin();
            this.eventSetDefault = Set<t_variety.Event>();
            for(int elem52 = 0; elem52 < elem50.length; ++elem52) {
              t_variety.Event elem51 = t_variety.Event();
              elem51.read(iprot);
              this.eventSetDefault.add(elem51);
            }
            iprot.readSetEnd();
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

  @override
  write(thrift.TProtocol oprot) {
    validate();

    oprot.writeStructBegin(_STRUCT_DESC);
    if (isSetID()) {
      oprot.writeFieldBegin(_ID_FIELD_DESC);
      oprot.writeI64(this.iD);
      oprot.writeFieldEnd();
    }
    if (this.ev != null) {
      oprot.writeFieldBegin(_EV_FIELD_DESC);
      this.ev.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.events != null) {
      oprot.writeFieldBegin(_EVENTS_FIELD_DESC);
      oprot.writeListBegin(thrift.TList(thrift.TType.STRUCT, this.events.length));
      for(var elem53 in this.events) {
        elem53.write(oprot);
      }
      oprot.writeListEnd();
      oprot.writeFieldEnd();
    }
    if (this.events2 != null) {
      oprot.writeFieldBegin(_EVENTS2_FIELD_DESC);
      oprot.writeSetBegin(thrift.TSet(thrift.TType.STRUCT, this.events2.length));
      for(var elem54 in this.events2) {
        elem54.write(oprot);
      }
      oprot.writeSetEnd();
      oprot.writeFieldEnd();
    }
    if (this.eventMap != null) {
      oprot.writeFieldBegin(_EVENT_MAP_FIELD_DESC);
      oprot.writeMapBegin(thrift.TMap(thrift.TType.I64, thrift.TType.STRUCT, this.eventMap.length));
      for(var elem55 in this.eventMap.keys) {
        oprot.writeI64(elem55);
        eventMap[elem55].write(oprot);
      }
      oprot.writeMapEnd();
      oprot.writeFieldEnd();
    }
    if (this.nums != null) {
      oprot.writeFieldBegin(_NUMS_FIELD_DESC);
      oprot.writeListBegin(thrift.TList(thrift.TType.LIST, this.nums.length));
      for(var elem56 in this.nums) {
        oprot.writeListBegin(thrift.TList(thrift.TType.I32, elem56.length));
        for(var elem57 in elem56) {
          oprot.writeI32(elem57);
        }
        oprot.writeListEnd();
      }
      oprot.writeListEnd();
      oprot.writeFieldEnd();
    }
    if (this.enums != null) {
      oprot.writeFieldBegin(_ENUMS_FIELD_DESC);
      oprot.writeListBegin(thrift.TList(thrift.TType.I32, this.enums.length));
      for(var elem58 in this.enums) {
        oprot.writeI32(elem58);
      }
      oprot.writeListEnd();
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_A_BOOL_FIELD_FIELD_DESC);
    oprot.writeBool(this.aBoolField);
    oprot.writeFieldEnd();
    if (this.a_union != null) {
      oprot.writeFieldBegin(_A_UNION_FIELD_DESC);
      this.a_union.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.typedefOfTypedef != null) {
      oprot.writeFieldBegin(_TYPEDEF_OF_TYPEDEF_FIELD_DESC);
      oprot.writeString(this.typedefOfTypedef);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_DEPR_FIELD_DESC);
    // ignore: deprecated_member_use
    oprot.writeBool(this.depr);
    oprot.writeFieldEnd();
    // ignore: deprecated_member_use
    if (this.deprBinary != null) {
      oprot.writeFieldBegin(_DEPR_BINARY_FIELD_DESC);
      // ignore: deprecated_member_use
      oprot.writeBinary(this.deprBinary);
      oprot.writeFieldEnd();
    }
    // ignore: deprecated_member_use
    if (this.deprList != null) {
      oprot.writeFieldBegin(_DEPR_LIST_FIELD_DESC);
      // ignore: deprecated_member_use
      oprot.writeListBegin(thrift.TList(thrift.TType.BOOL, this.deprList.length));
      // ignore: deprecated_member_use
      for(var elem59 in this.deprList) {
        oprot.writeBool(elem59);
      }
      oprot.writeListEnd();
      oprot.writeFieldEnd();
    }
    if (isSetEventsDefault() && this.eventsDefault != null) {
      oprot.writeFieldBegin(_EVENTS_DEFAULT_FIELD_DESC);
      oprot.writeListBegin(thrift.TList(thrift.TType.STRUCT, this.eventsDefault.length));
      for(var elem60 in this.eventsDefault) {
        elem60.write(oprot);
      }
      oprot.writeListEnd();
      oprot.writeFieldEnd();
    }
    if (isSetEventMapDefault() && this.eventMapDefault != null) {
      oprot.writeFieldBegin(_EVENT_MAP_DEFAULT_FIELD_DESC);
      oprot.writeMapBegin(thrift.TMap(thrift.TType.I64, thrift.TType.STRUCT, this.eventMapDefault.length));
      for(var elem61 in this.eventMapDefault.keys) {
        oprot.writeI64(elem61);
        eventMapDefault[elem61].write(oprot);
      }
      oprot.writeMapEnd();
      oprot.writeFieldEnd();
    }
    if (isSetEventSetDefault() && this.eventSetDefault != null) {
      oprot.writeFieldBegin(_EVENT_SET_DEFAULT_FIELD_DESC);
      oprot.writeSetBegin(thrift.TSet(thrift.TType.STRUCT, this.eventSetDefault.length));
      for(var elem62 in this.eventSetDefault) {
        elem62.write(oprot);
      }
      oprot.writeSetEnd();
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @override
  String toString() {
    StringBuffer ret = StringBuffer('EventWrapper(');

    if (isSetID()) {
      ret.write('iD:');
      ret.write(this.iD);
    }

    ret.write(', ');
    ret.write('ev:');
    if (this.ev == null) {
      ret.write('null');
    } else {
      ret.write(this.ev);
    }

    ret.write(', ');
    ret.write('events:');
    if (this.events == null) {
      ret.write('null');
    } else {
      ret.write(this.events);
    }

    ret.write(', ');
    ret.write('events2:');
    if (this.events2 == null) {
      ret.write('null');
    } else {
      ret.write(this.events2);
    }

    ret.write(', ');
    ret.write('eventMap:');
    if (this.eventMap == null) {
      ret.write('null');
    } else {
      ret.write(this.eventMap);
    }

    ret.write(', ');
    ret.write('nums:');
    if (this.nums == null) {
      ret.write('null');
    } else {
      ret.write(this.nums);
    }

    ret.write(', ');
    ret.write('enums:');
    if (this.enums == null) {
      ret.write('null');
    } else {
      ret.write(this.enums);
    }

    ret.write(', ');
    ret.write('aBoolField:');
    ret.write(this.aBoolField);

    ret.write(', ');
    ret.write('a_union:');
    if (this.a_union == null) {
      ret.write('null');
    } else {
      ret.write(this.a_union);
    }

    ret.write(', ');
    ret.write('typedefOfTypedef:');
    if (this.typedefOfTypedef == null) {
      ret.write('null');
    } else {
      ret.write(this.typedefOfTypedef);
    }

    ret.write(', ');
    ret.write('depr:');
    // ignore: deprecated_member_use
    ret.write(this.depr);

    ret.write(', ');
    ret.write('deprBinary:');
    // ignore: deprecated_member_use
    if (this.deprBinary == null) {
      ret.write('null');
    } else {
      ret.write('BINARY');
    }

    ret.write(', ');
    ret.write('deprList:');
    // ignore: deprecated_member_use
    if (this.deprList == null) {
      ret.write('null');
    } else {
      // ignore: deprecated_member_use
      ret.write(this.deprList);
    }

    if (isSetEventsDefault()) {
      ret.write(', ');
      ret.write('eventsDefault:');
      if (this.eventsDefault == null) {
        ret.write('null');
      } else {
        ret.write(this.eventsDefault);
      }
    }

    if (isSetEventMapDefault()) {
      ret.write(', ');
      ret.write('eventMapDefault:');
      if (this.eventMapDefault == null) {
        ret.write('null');
      } else {
        ret.write(this.eventMapDefault);
      }
    }

    if (isSetEventSetDefault()) {
      ret.write(', ');
      ret.write('eventSetDefault:');
      if (this.eventSetDefault == null) {
        ret.write('null');
      } else {
        ret.write(this.eventSetDefault);
      }
    }

    ret.write(')');

    return ret.toString();
  }

  @override
  bool operator ==(Object o) {
    if (o is EventWrapper) {
      return this.iD == o.iD &&
        this.ev == o.ev &&
        DeepCollectionEquality().equals(this.events, o.events) &&
        DeepCollectionEquality().equals(this.events2, o.events2) &&
        DeepCollectionEquality().equals(this.eventMap, o.eventMap) &&
        DeepCollectionEquality().equals(this.nums, o.nums) &&
        DeepCollectionEquality().equals(this.enums, o.enums) &&
        this.aBoolField == o.aBoolField &&
        this.a_union == o.a_union &&
        this.typedefOfTypedef == o.typedefOfTypedef &&
        // ignore: deprecated_member_use
        this.depr == o.depr &&
        // ignore: deprecated_member_use
        this.deprBinary == o.deprBinary &&
        // ignore: deprecated_member_use
        DeepCollectionEquality().equals(this.deprList, o.deprList) &&
        DeepCollectionEquality().equals(this.eventsDefault, o.eventsDefault) &&
        DeepCollectionEquality().equals(this.eventMapDefault, o.eventMapDefault) &&
        DeepCollectionEquality().equals(this.eventSetDefault, o.eventSetDefault);
    }
    return false;
  }

  @override
  int get hashCode {
    var value = 17;
    value = (value * 31) ^ this.iD.hashCode;
    value = (value * 31) ^ this.ev.hashCode;
    value = (value * 31) ^ this.events.hashCode;
    value = (value * 31) ^ this.events2.hashCode;
    value = (value * 31) ^ this.eventMap.hashCode;
    value = (value * 31) ^ this.nums.hashCode;
    value = (value * 31) ^ this.enums.hashCode;
    value = (value * 31) ^ this.aBoolField.hashCode;
    value = (value * 31) ^ this.a_union.hashCode;
    value = (value * 31) ^ this.typedefOfTypedef.hashCode;
    // ignore: deprecated_member_use
    value = (value * 31) ^ this.depr.hashCode;
    // ignore: deprecated_member_use
    value = (value * 31) ^ this.deprBinary.hashCode;
    // ignore: deprecated_member_use
    value = (value * 31) ^ this.deprList.hashCode;
    value = (value * 31) ^ this.eventsDefault.hashCode;
    value = (value * 31) ^ this.eventMapDefault.hashCode;
    value = (value * 31) ^ this.eventSetDefault.hashCode;
    return value;
  }

  EventWrapper clone({
    int iD,
    t_variety.Event ev,
    List<t_variety.Event> events,
    Set<t_variety.Event> events2,
    Map<int, t_variety.Event> eventMap,
    List<List<int>> nums,
    List<int> enums,
    bool aBoolField,
    t_variety.TestingUnions a_union,
    String typedefOfTypedef,
    // ignore: deprecated_member_use
    bool depr,
    // ignore: deprecated_member_use
    Uint8List deprBinary,
    // ignore: deprecated_member_use
    List<bool> deprList,
    List<t_variety.Event> eventsDefault,
    Map<int, t_variety.Event> eventMapDefault,
    Set<t_variety.Event> eventSetDefault,
  }) {
    return EventWrapper()
      ..iD = iD ?? this.iD
      ..ev = ev ?? this.ev
      ..events = events ?? this.events
      ..events2 = events2 ?? this.events2
      ..eventMap = eventMap ?? this.eventMap
      ..nums = nums ?? this.nums
      ..enums = enums ?? this.enums
      ..aBoolField = aBoolField ?? this.aBoolField
      ..a_union = a_union ?? this.a_union
      ..typedefOfTypedef = typedefOfTypedef ?? this.typedefOfTypedef
      // ignore: deprecated_member_use
      ..depr = depr ?? this.depr
      // ignore: deprecated_member_use
      ..deprBinary = deprBinary ?? this.deprBinary
      // ignore: deprecated_member_use
      ..deprList = deprList ?? this.deprList
      ..eventsDefault = eventsDefault ?? this.eventsDefault
      ..eventMapDefault = eventMapDefault ?? this.eventMapDefault
      ..eventSetDefault = eventSetDefault ?? this.eventSetDefault;
  }

  validate() {
    // check for required fields
    if (this.ev == null) {
      throw thrift.TProtocolError(thrift.TProtocolErrorType.INVALID_DATA, "Required field 'ev' was not present in struct EventWrapper");
    }
  }
}
