/**
 * Autogenerated by Frugal Compiler (3.9.2)
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package actual_base.java;

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

public class nested_thing implements org.apache.thrift.TBase<nested_thing, nested_thing._Fields>, java.io.Serializable, Cloneable, Comparable<nested_thing> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("nested_thing");

	private static final org.apache.thrift.protocol.TField THINGS_FIELD_DESC = new org.apache.thrift.protocol.TField("things", org.apache.thrift.protocol.TType.LIST, (short)1);

	public java.util.List<thing> things;
	/** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		THINGS((short)1, "things")
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
				case 1: // THINGS
					return THINGS;
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
	public nested_thing() {
	}

	public nested_thing(
		java.util.List<thing> things) {
		this();
		this.things = things;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public nested_thing(nested_thing other) {
		if (other.isSetThings()) {
			this.things = new ArrayList<thing>(other.things.size());
			for (thing elem227 : other.things) {
				thing elem228 = new thing(elem227);
				this.things.add(elem228);
			}
		}
	}

	public nested_thing deepCopy() {
		return new nested_thing(this);
	}

	@Override
	public void clear() {
		this.things = null;

	}

	public int getThingsSize() {
		return (this.things == null) ? 0 : this.things.size();
	}

	public java.util.Iterator<thing> getThingsIterator() {
		return (this.things == null) ? null : this.things.iterator();
	}

	public void addToThings(thing elem) {
		if (this.things == null) {
			this.things = new ArrayList<thing>();
		}
		this.things.add(elem);
	}

	public java.util.List<thing> getThings() {
		return this.things;
	}

	public nested_thing setThings(java.util.List<thing> things) {
		this.things = things;
		return this;
	}

	public void unsetThings() {
		this.things = null;
	}

	/** Returns true if field things is set (has been assigned a value) and false otherwise */
	public boolean isSetThings() {
		return this.things != null;
	}

	public void setThingsIsSet(boolean value) {
		if (!value) {
			this.things = null;
		}
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case THINGS:
			if (value == null) {
				unsetThings();
			} else {
				setThings((java.util.List<thing>)value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case THINGS:
			return getThings();

		}
		throw new IllegalStateException();
	}

	/** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new IllegalArgumentException();
		}

		switch (field) {
		case THINGS:
			return isSetThings();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof nested_thing)
			return this.equals((nested_thing)that);
		return false;
	}

	public boolean equals(nested_thing that) {
		if (that == null)
			return false;
		if (!Objects.equals(this.things, that.things))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		List<Object> list = new ArrayList<Object>();

		boolean present_things = true && (isSetThings());
		list.add(present_things);
		if (present_things)
			list.add(things);

		return list.hashCode();
	}

	@Override
	public int compareTo(nested_thing other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = Boolean.compare(isSetThings(), other.isSetThings());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetThings()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.things, other.things);
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
		new nested_thingStandardScheme().read(iprot, this);
	}

	public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
		if (oprot.getScheme() != StandardScheme.class) {
			throw new UnsupportedOperationException();
		}
		new nested_thingStandardScheme().write(oprot, this);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("nested_thing(");
		boolean first = true;

		sb.append("things:");
		sb.append(this.things);
		first = false;
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException {
		// check for required fields
		// check for sub-struct validity
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

	private static class nested_thingStandardScheme extends StandardScheme<nested_thing> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, nested_thing struct) throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
					case 1: // THINGS
						if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
							org.apache.thrift.protocol.TList elem229 = iprot.readListBegin();
							struct.things = new ArrayList<thing>(elem229.size);
							for (int elem230 = 0; elem230 < elem229.size; ++elem230) {
								thing elem231 = new thing();
								elem231.read(iprot);
								struct.things.add(elem231);
							}
							iprot.readListEnd();
							struct.setThingsIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, nested_thing struct) throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.isSetThings()) {
				oprot.writeFieldBegin(THINGS_FIELD_DESC);
				oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.things.size()));
				for (thing elem232 : struct.things) {
					elem232.write(oprot);
				}
				oprot.writeListEnd();
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

}
