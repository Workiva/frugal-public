/**
 * Autogenerated by Frugal Compiler (3.17.12)
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package variety.java;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Objects;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestingUnions extends org.apache.thrift.TUnion<TestingUnions, TestingUnions._Fields> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TestingUnions");

	private static final org.apache.thrift.protocol.TField AN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("AnID", org.apache.thrift.protocol.TType.I64, (short)1);
	private static final org.apache.thrift.protocol.TField A_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("aString", org.apache.thrift.protocol.TType.STRING, (short)2);
	private static final org.apache.thrift.protocol.TField SOMEOTHERTHING_FIELD_DESC = new org.apache.thrift.protocol.TField("someotherthing", org.apache.thrift.protocol.TType.I32, (short)3);
	private static final org.apache.thrift.protocol.TField AN_INT16_FIELD_DESC = new org.apache.thrift.protocol.TField("AnInt16", org.apache.thrift.protocol.TType.I16, (short)4);
	private static final org.apache.thrift.protocol.TField REQUESTS_FIELD_DESC = new org.apache.thrift.protocol.TField("Requests", org.apache.thrift.protocol.TType.MAP, (short)5);
	private static final org.apache.thrift.protocol.TField BIN_FIELD_IN_UNION_FIELD_DESC = new org.apache.thrift.protocol.TField("bin_field_in_union", org.apache.thrift.protocol.TType.STRING, (short)6);
	private static final org.apache.thrift.protocol.TField DEPR_FIELD_DESC = new org.apache.thrift.protocol.TField("depr", org.apache.thrift.protocol.TType.BOOL, (short)7);
	private static final org.apache.thrift.protocol.TField WHO_A__BUDDY_FIELD_DESC = new org.apache.thrift.protocol.TField("WHOA_BUDDY", org.apache.thrift.protocol.TType.BOOL, (short)8);

	/** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		AN_ID((short)1, "AnID"),
		A_STRING((short)2, "aString"),
		SOMEOTHERTHING((short)3, "someotherthing"),
		AN_INT16((short)4, "AnInt16"),
		REQUESTS((short)5, "Requests"),
		BIN_FIELD_IN_UNION((short)6, "bin_field_in_union"),
		DEPR((short)7, "depr"),
		WHO_A__BUDDY((short)8, "WHOA_BUDDY")
		;

		private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

		static {
			for (_Fields field : EnumSet.allOf(_Fields.class)) {
				byName.put(field.getFieldName(), field);
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, or null if its not found.
		 */
		public static _Fields findByThriftId(int fieldId) {
			switch(fieldId) {
				case 1: // AN_ID
					return AN_ID;
				case 2: // A_STRING
					return A_STRING;
				case 3: // SOMEOTHERTHING
					return SOMEOTHERTHING;
				case 4: // AN_INT16
					return AN_INT16;
				case 5: // REQUESTS
					return REQUESTS;
				case 6: // BIN_FIELD_IN_UNION
					return BIN_FIELD_IN_UNION;
				case 7: // DEPR
					return DEPR;
				case 8: // WHO_A__BUDDY
					return WHO_A__BUDDY;
				default:
					return null;
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, throwing an exception
		 * if it is not found.
		 */
		public static _Fields findByThriftIdOrThrow(int fieldId) {
			_Fields fields = findByThriftId(fieldId);
			if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
			return fields;
		}

		/**
		 * Find the _Fields constant that matches name, or null if its not found.
		 */
		public static _Fields findByName(String name) {
			return byName.get(name);
		}

		private final short _thriftId;
		private final String _fieldName;

		_Fields(short thriftId, String fieldName) {
			_thriftId = thriftId;
			_fieldName = fieldName;
		}

		public short getThriftFieldId() {
			return _thriftId;
		}

		public String getFieldName() {
			return _fieldName;
		}
	}

	public TestingUnions() {
		super();
	}

	public TestingUnions(_Fields setField, Object value) {
		super(setField, value);
	}

	public TestingUnions(TestingUnions other) {
		super(other);
	}
	public TestingUnions deepCopy() {
		return new TestingUnions(this);
	}

	public static TestingUnions AnID(long value) {
		TestingUnions x = new TestingUnions();
		x.setAnID(value);
		return x;
	}

	public static TestingUnions aString(String value) {
		TestingUnions x = new TestingUnions();
		x.setAString(value);
		return x;
	}

	public static TestingUnions someotherthing(int value) {
		TestingUnions x = new TestingUnions();
		x.setSomeotherthing(value);
		return x;
	}

	public static TestingUnions AnInt16(short value) {
		TestingUnions x = new TestingUnions();
		x.setAnInt16(value);
		return x;
	}

	public static TestingUnions Requests(java.util.Map<Integer, String> value) {
		TestingUnions x = new TestingUnions();
		x.setRequests(value);
		return x;
	}

	public static TestingUnions bin_field_in_union(java.nio.ByteBuffer value) {
		TestingUnions x = new TestingUnions();
		x.setBin_field_in_union(value);
		return x;
	}

	/**
	 * @deprecated use something else
	 */
	@Deprecated
	public static TestingUnions depr(boolean value) {
		TestingUnions x = new TestingUnions();
		x.setDepr(value);
		return x;
	}

	public static TestingUnions WHOA_BUDDY(boolean value) {
		TestingUnions x = new TestingUnions();
		x.setWHOA_BUDDY(value);
		return x;
	}

	@Override
	protected void checkType(_Fields setField, Object value) throws ClassCastException {
		switch (setField) {
			case AN_ID:
				if (value instanceof Long) {
					break;
				}
				throw new ClassCastException("Was expecting value of type Long for field 'AnID', but got " + value.getClass().getSimpleName());
			case A_STRING:
				if (value instanceof String) {
					break;
				}
				throw new ClassCastException("Was expecting value of type String for field 'aString', but got " + value.getClass().getSimpleName());
			case SOMEOTHERTHING:
				if (value instanceof Integer) {
					break;
				}
				throw new ClassCastException("Was expecting value of type Integer for field 'someotherthing', but got " + value.getClass().getSimpleName());
			case AN_INT16:
				if (value instanceof Short) {
					break;
				}
				throw new ClassCastException("Was expecting value of type Short for field 'AnInt16', but got " + value.getClass().getSimpleName());
			case REQUESTS:
				if (value instanceof java.util.Map) {
					break;
				}
				throw new ClassCastException("Was expecting value of type java.util.Map<Integer, String> for field 'Requests', but got " + value.getClass().getSimpleName());
			case BIN_FIELD_IN_UNION:
				if (value instanceof java.nio.ByteBuffer) {
					break;
				}
				throw new ClassCastException("Was expecting value of type java.nio.ByteBuffer for field 'bin_field_in_union', but got " + value.getClass().getSimpleName());
			case DEPR:
				if (value instanceof Boolean) {
					break;
				}
				throw new ClassCastException("Was expecting value of type Boolean for field 'depr', but got " + value.getClass().getSimpleName());
			case WHO_A__BUDDY:
				if (value instanceof Boolean) {
					break;
				}
				throw new ClassCastException("Was expecting value of type Boolean for field 'WHOA_BUDDY', but got " + value.getClass().getSimpleName());
			default:
				throw new IllegalArgumentException("Unknown field id " + setField);
		}
	}

	@Override
	protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
		_Fields setField = _Fields.findByThriftId(field.id);
		if (setField != null) {
			switch (setField) {
				case AN_ID:
					if (field.type == AN_ID_FIELD_DESC.type) {
						Long AnID = iprot.readI64();
						return AnID;
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
						return null;
					}
				case A_STRING:
					if (field.type == A_STRING_FIELD_DESC.type) {
						String aString = iprot.readString();
						return aString;
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
						return null;
					}
				case SOMEOTHERTHING:
					if (field.type == SOMEOTHERTHING_FIELD_DESC.type) {
						Integer someotherthing = iprot.readI32();
						return someotherthing;
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
						return null;
					}
				case AN_INT16:
					if (field.type == AN_INT16_FIELD_DESC.type) {
						Short AnInt16 = iprot.readI16();
						return AnInt16;
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
						return null;
					}
				case REQUESTS:
					if (field.type == REQUESTS_FIELD_DESC.type) {
						org.apache.thrift.protocol.TMap elem151 = iprot.readMapBegin();
						java.util.Map<Integer, String> Requests = new HashMap<Integer,String>(2*elem151.size);
						for (int elem152 = 0; elem152 < elem151.size; ++elem152) {
							Integer elem154 = iprot.readI32();
							String elem153 = iprot.readString();
							Requests.put(elem154, elem153);
						}
						iprot.readMapEnd();
						return Requests;
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
						return null;
					}
				case BIN_FIELD_IN_UNION:
					if (field.type == BIN_FIELD_IN_UNION_FIELD_DESC.type) {
						java.nio.ByteBuffer bin_field_in_union = iprot.readBinary();
						return bin_field_in_union;
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
						return null;
					}
				case DEPR:
					if (field.type == DEPR_FIELD_DESC.type) {
						Boolean depr = iprot.readBool();
						return depr;
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
						return null;
					}
				case WHO_A__BUDDY:
					if (field.type == WHO_A__BUDDY_FIELD_DESC.type) {
						Boolean WHOA_BUDDY = iprot.readBool();
						return WHOA_BUDDY;
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
						return null;
					}
				default:
					throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
			}
		} else {
			org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
			return null;
		}
	}

	@Override
	protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
		switch (setField_) {
			case AN_ID:
				Long AnID = (Long)value_;
				long elem155 = AnID;
				oprot.writeI64(elem155);
				return;
			case A_STRING:
				String aString = (String)value_;
				String elem156 = aString;
				oprot.writeString(elem156);
				return;
			case SOMEOTHERTHING:
				Integer someotherthing = (Integer)value_;
				int elem157 = someotherthing;
				oprot.writeI32(elem157);
				return;
			case AN_INT16:
				Short AnInt16 = (Short)value_;
				short elem158 = AnInt16;
				oprot.writeI16(elem158);
				return;
			case REQUESTS:
				java.util.Map<Integer, String> Requests = (java.util.Map<Integer, String>)value_;
				oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, Requests.size()));
				for (Map.Entry<Integer, String> elem159 : Requests.entrySet()) {
					int elem160 = elem159.getKey();
					oprot.writeI32(elem160);
					String elem161 = elem159.getValue();
					oprot.writeString(elem161);
				}
				oprot.writeMapEnd();
				return;
			case BIN_FIELD_IN_UNION:
				java.nio.ByteBuffer bin_field_in_union = (java.nio.ByteBuffer)value_;
				java.nio.ByteBuffer elem162 = bin_field_in_union;
				oprot.writeBinary(elem162);
				return;
			case DEPR:
				Boolean depr = (Boolean)value_;
				boolean elem163 = depr;
				oprot.writeBool(elem163);
				return;
			case WHO_A__BUDDY:
				Boolean WHOA_BUDDY = (Boolean)value_;
				boolean elem164 = WHOA_BUDDY;
				oprot.writeBool(elem164);
				return;
			default:
				throw new IllegalStateException("Cannot write union with unknown field " + setField_);
		}
	}

	@Override
	protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
		_Fields setField = _Fields.findByThriftId(fieldID);
		if (setField != null) {
			switch (setField) {
				case AN_ID:
					Long AnID = iprot.readI64();
					return AnID;
				case A_STRING:
					String aString = iprot.readString();
					return aString;
				case SOMEOTHERTHING:
					Integer someotherthing = iprot.readI32();
					return someotherthing;
				case AN_INT16:
					Short AnInt16 = iprot.readI16();
					return AnInt16;
				case REQUESTS:
					org.apache.thrift.protocol.TMap elem165 = iprot.readMapBegin();
					java.util.Map<Integer, String> Requests = new HashMap<Integer,String>(2*elem165.size);
					for (int elem166 = 0; elem166 < elem165.size; ++elem166) {
						Integer elem168 = iprot.readI32();
						String elem167 = iprot.readString();
						Requests.put(elem168, elem167);
					}
					iprot.readMapEnd();
					return Requests;
				case BIN_FIELD_IN_UNION:
					java.nio.ByteBuffer bin_field_in_union = iprot.readBinary();
					return bin_field_in_union;
				case DEPR:
					Boolean depr = iprot.readBool();
					return depr;
				case WHO_A__BUDDY:
					Boolean WHOA_BUDDY = iprot.readBool();
					return WHOA_BUDDY;
				default:
					throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
			}
		} else {
			throw new TProtocolException("Couldn't find a field with field id " + fieldID);
		}
	}

	@Override
	protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
		switch (setField_) {
			case AN_ID:
				Long AnID = (Long)value_;
				long elem169 = AnID;
				oprot.writeI64(elem169);
				return;
			case A_STRING:
				String aString = (String)value_;
				String elem170 = aString;
				oprot.writeString(elem170);
				return;
			case SOMEOTHERTHING:
				Integer someotherthing = (Integer)value_;
				int elem171 = someotherthing;
				oprot.writeI32(elem171);
				return;
			case AN_INT16:
				Short AnInt16 = (Short)value_;
				short elem172 = AnInt16;
				oprot.writeI16(elem172);
				return;
			case REQUESTS:
				java.util.Map<Integer, String> Requests = (java.util.Map<Integer, String>)value_;
				oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, Requests.size()));
				for (Map.Entry<Integer, String> elem173 : Requests.entrySet()) {
					int elem174 = elem173.getKey();
					oprot.writeI32(elem174);
					String elem175 = elem173.getValue();
					oprot.writeString(elem175);
				}
				oprot.writeMapEnd();
				return;
			case BIN_FIELD_IN_UNION:
				java.nio.ByteBuffer bin_field_in_union = (java.nio.ByteBuffer)value_;
				java.nio.ByteBuffer elem176 = bin_field_in_union;
				oprot.writeBinary(elem176);
				return;
			case DEPR:
				Boolean depr = (Boolean)value_;
				boolean elem177 = depr;
				oprot.writeBool(elem177);
				return;
			case WHO_A__BUDDY:
				Boolean WHOA_BUDDY = (Boolean)value_;
				boolean elem178 = WHOA_BUDDY;
				oprot.writeBool(elem178);
				return;
			default:
				throw new IllegalStateException("Cannot write union with unknown field " + setField_);
		}
	}

	@Override
	protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
		switch (setField) {
			case AN_ID:
				return AN_ID_FIELD_DESC;
			case A_STRING:
				return A_STRING_FIELD_DESC;
			case SOMEOTHERTHING:
				return SOMEOTHERTHING_FIELD_DESC;
			case AN_INT16:
				return AN_INT16_FIELD_DESC;
			case REQUESTS:
				return REQUESTS_FIELD_DESC;
			case BIN_FIELD_IN_UNION:
				return BIN_FIELD_IN_UNION_FIELD_DESC;
			case DEPR:
				return DEPR_FIELD_DESC;
			case WHO_A__BUDDY:
				return WHO_A__BUDDY_FIELD_DESC;
			default:
				throw new IllegalArgumentException("Unknown field id " + setField);
		}
	}

	@Override
	protected org.apache.thrift.protocol.TStruct getStructDesc() {
		return STRUCT_DESC;
	}

	@Override
	protected _Fields enumForId(short id) {
		return _Fields.findByThriftIdOrThrow(id);
	}

	public _Fields fieldForId(int fieldId) {
		return _Fields.findByThriftId(fieldId);
	}


	public long getAnID() {
		if (getSetField() == _Fields.AN_ID) {
			return (Long)getFieldValue();
		} else {
			throw new RuntimeException("Cannot get field 'AnID' because union is currently set to " + getFieldDesc(getSetField()).name);
		}
	}

	public void setAnID(long value) {
		setField_ = _Fields.AN_ID;
		value_ = value;
	}

	public String getAString() {
		if (getSetField() == _Fields.A_STRING) {
			return (String)getFieldValue();
		} else {
			throw new RuntimeException("Cannot get field 'aString' because union is currently set to " + getFieldDesc(getSetField()).name);
		}
	}

	public void setAString(String value) {
		if (value == null) throw new NullPointerException();
		setField_ = _Fields.A_STRING;
		value_ = value;
	}

	public int getSomeotherthing() {
		if (getSetField() == _Fields.SOMEOTHERTHING) {
			return (Integer)getFieldValue();
		} else {
			throw new RuntimeException("Cannot get field 'someotherthing' because union is currently set to " + getFieldDesc(getSetField()).name);
		}
	}

	public void setSomeotherthing(int value) {
		setField_ = _Fields.SOMEOTHERTHING;
		value_ = value;
	}

	public short getAnInt16() {
		if (getSetField() == _Fields.AN_INT16) {
			return (Short)getFieldValue();
		} else {
			throw new RuntimeException("Cannot get field 'AnInt16' because union is currently set to " + getFieldDesc(getSetField()).name);
		}
	}

	public void setAnInt16(short value) {
		setField_ = _Fields.AN_INT16;
		value_ = value;
	}

	public java.util.Map<Integer, String> getRequests() {
		if (getSetField() == _Fields.REQUESTS) {
			return (java.util.Map<Integer, String>)getFieldValue();
		} else {
			throw new RuntimeException("Cannot get field 'Requests' because union is currently set to " + getFieldDesc(getSetField()).name);
		}
	}

	public void setRequests(java.util.Map<Integer, String> value) {
		if (value == null) throw new NullPointerException();
		setField_ = _Fields.REQUESTS;
		value_ = value;
	}

	public java.nio.ByteBuffer getBin_field_in_union() {
		if (getSetField() == _Fields.BIN_FIELD_IN_UNION) {
			return (java.nio.ByteBuffer)getFieldValue();
		} else {
			throw new RuntimeException("Cannot get field 'bin_field_in_union' because union is currently set to " + getFieldDesc(getSetField()).name);
		}
	}

	public void setBin_field_in_union(java.nio.ByteBuffer value) {
		if (value == null) throw new NullPointerException();
		setField_ = _Fields.BIN_FIELD_IN_UNION;
		value_ = value;
	}

	@Deprecated
	public boolean getDepr() {
		if (getSetField() == _Fields.DEPR) {
			return (Boolean)getFieldValue();
		} else {
			throw new RuntimeException("Cannot get field 'depr' because union is currently set to " + getFieldDesc(getSetField()).name);
		}
	}

	@Deprecated
	public void setDepr(boolean value) {
		setField_ = _Fields.DEPR;
		value_ = value;
	}

	public boolean getWHOA_BUDDY() {
		if (getSetField() == _Fields.WHO_A__BUDDY) {
			return (Boolean)getFieldValue();
		} else {
			throw new RuntimeException("Cannot get field 'WHOA_BUDDY' because union is currently set to " + getFieldDesc(getSetField()).name);
		}
	}

	public void setWHOA_BUDDY(boolean value) {
		setField_ = _Fields.WHO_A__BUDDY;
		value_ = value;
	}

	public boolean isSetAnID() {
		return setField_ == _Fields.AN_ID;
	}

	public boolean isSetAString() {
		return setField_ == _Fields.A_STRING;
	}

	public boolean isSetSomeotherthing() {
		return setField_ == _Fields.SOMEOTHERTHING;
	}

	public boolean isSetAnInt16() {
		return setField_ == _Fields.AN_INT16;
	}

	public boolean isSetRequests() {
		return setField_ == _Fields.REQUESTS;
	}

	public boolean isSetBin_field_in_union() {
		return setField_ == _Fields.BIN_FIELD_IN_UNION;
	}

	@Deprecated
	public boolean isSetDepr() {
		return setField_ == _Fields.DEPR;
	}

	public boolean isSetWHOA_BUDDY() {
		return setField_ == _Fields.WHO_A__BUDDY;
	}


	public boolean equals(Object other) {
		if (other instanceof TestingUnions) {
			return equals((TestingUnions)other);
		} else {
			return false;
		}
	}

	public boolean equals(TestingUnions other) {
		return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
	}

	@Override
	public int compareTo(TestingUnions other) {
		int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
		if (lastComparison == 0) {
			return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
		}
		return lastComparison;
	}


	@Override
	public int hashCode() {
		List<Object> list = new ArrayList<Object>();
		list.add(this.getClass().getName());
		org.apache.thrift.TFieldIdEnum setField = getSetField();
		if (setField != null) {
			list.add(setField.getThriftFieldId());
			Object value = getFieldValue();
			if (value instanceof org.apache.thrift.TEnum) {
				list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
			} else {
				list.add(value);
			}
		}
		return list.hashCode();
	}
	private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
		try {
			write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
		try {
			read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

}
