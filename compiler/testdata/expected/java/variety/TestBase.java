/**
 * Autogenerated by Frugal Compiler (3.17.6)
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

public class TestBase implements org.apache.thrift.TBase<TestBase, TestBase._Fields>, java.io.Serializable, Cloneable, Comparable<TestBase> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TestBase");

	private static final org.apache.thrift.protocol.TField BASE_STRUCT_FIELD_DESC = new org.apache.thrift.protocol.TField("base_struct", org.apache.thrift.protocol.TType.STRUCT, (short)1);

	public actual_base.java.thing base_struct;
	/** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		BASE_STRUCT((short)1, "base_struct")
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
				case 1: // BASE_STRUCT
					return BASE_STRUCT;
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

	// isset id assignments
	public TestBase() {
	}

	public TestBase(
		actual_base.java.thing base_struct) {
		this();
		this.base_struct = base_struct;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public TestBase(TestBase other) {
		if (other.isSetBase_struct()) {
			this.base_struct = new actual_base.java.thing(other.base_struct);
		}
	}

	public TestBase deepCopy() {
		return new TestBase(this);
	}

	@Override
	public void clear() {
		this.base_struct = null;

	}

	public actual_base.java.thing getBase_struct() {
		return this.base_struct;
	}

	public TestBase setBase_struct(actual_base.java.thing base_struct) {
		this.base_struct = base_struct;
		return this;
	}

	public void unsetBase_struct() {
		this.base_struct = null;
	}

	/** Returns true if field base_struct is set (has been assigned a value) and false otherwise */
	public boolean isSetBase_struct() {
		return this.base_struct != null;
	}

	public void setBase_structIsSet(boolean value) {
		if (!value) {
			this.base_struct = null;
		}
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case BASE_STRUCT:
			if (value == null) {
				unsetBase_struct();
			} else {
				setBase_struct((actual_base.java.thing)value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case BASE_STRUCT:
			return getBase_struct();

		}
		throw new IllegalStateException();
	}

	/** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new IllegalArgumentException();
		}

		switch (field) {
		case BASE_STRUCT:
			return isSetBase_struct();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof TestBase)
			return this.equals((TestBase)that);
		return false;
	}

	public boolean equals(TestBase that) {
		if (that == null)
			return false;
		if (!Objects.equals(this.base_struct, that.base_struct))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		List<Object> list = new ArrayList<Object>();

		boolean present_base_struct = true && (isSetBase_struct());
		list.add(present_base_struct);
		if (present_base_struct)
			list.add(base_struct);

		return list.hashCode();
	}

	@Override
	public int compareTo(TestBase other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = Boolean.compare(isSetBase_struct(), other.isSetBase_struct());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetBase_struct()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.base_struct, other.base_struct);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		return 0;
	}

	public _Fields fieldForId(int fieldId) {
		return _Fields.findByThriftId(fieldId);
	}

	public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
		if (iprot.getScheme() != StandardScheme.class) {
			throw new UnsupportedOperationException();
		}
		new TestBaseStandardScheme().read(iprot, this);
	}

	public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
		if (oprot.getScheme() != StandardScheme.class) {
			throw new UnsupportedOperationException();
		}
		new TestBaseStandardScheme().write(oprot, this);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("TestBase(");
		boolean first = true;

		sb.append("base_struct:");
		sb.append(this.base_struct);
		first = false;
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException {
		// check for required fields
		// check for sub-struct validity
		if (base_struct != null) {
			base_struct.validate();
		}
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
			// it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
			read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private static class TestBaseStandardScheme extends StandardScheme<TestBase> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, TestBase struct) throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
					case 1: // BASE_STRUCT
						if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
							struct.base_struct = new actual_base.java.thing();
							struct.base_struct.read(iprot);
							struct.setBase_structIsSet(true);
						} else {
							org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
						}
						break;
					default:
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
				}
				iprot.readFieldEnd();
			}
			iprot.readStructEnd();

			// check for required fields of primitive type, which can't be checked in the validate method
			struct.validate();
		}

		public void write(org.apache.thrift.protocol.TProtocol oprot, TestBase struct) throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.isSetBase_struct()) {
				oprot.writeFieldBegin(BASE_STRUCT_FIELD_DESC);
				struct.base_struct.write(oprot);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

}
