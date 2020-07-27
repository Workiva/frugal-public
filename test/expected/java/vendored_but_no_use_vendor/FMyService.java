/**
 * Autogenerated by Frugal Compiler (3.9.7)
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */

package include_vendor.java;

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

import com.workiva.frugal.FContext;
import com.workiva.frugal.exception.TApplicationExceptionType;
import com.workiva.frugal.exception.TTransportExceptionType;
import com.workiva.frugal.middleware.InvocationHandler;
import com.workiva.frugal.middleware.ServiceMiddleware;
import com.workiva.frugal.processor.FBaseProcessor;
import com.workiva.frugal.processor.FProcessor;
import com.workiva.frugal.processor.FProcessorFunction;
import com.workiva.frugal.protocol.*;
import com.workiva.frugal.provider.FServiceProvider;
import com.workiva.frugal.transport.FTransport;
import com.workiva.frugal.transport.TMemoryOutputBuffer;
import org.apache.thrift.TApplicationException;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TMessageType;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import java.util.Arrays;
import java.util.concurrent.*;


public class FMyService {

	private static final Logger logger = LoggerFactory.getLogger(FMyService.class);

	public interface Iface extends vendor_namespace.java.FVendoredBase.Iface {

		public vendor_namespace.java.Item getItem(FContext ctx) throws TException, InvalidData;

	}

	public static class Client extends vendor_namespace.java.FVendoredBase.Client implements Iface {

		private Iface proxy;

		public Client(FServiceProvider provider, ServiceMiddleware... middleware) {
			super(provider, middleware);
			Iface client = new InternalClient(provider);
			List<ServiceMiddleware> combined = new ArrayList<ServiceMiddleware>(Arrays.asList(middleware));
			combined.addAll(provider.getMiddleware());
			middleware = combined.toArray(new ServiceMiddleware[0]);
			proxy = InvocationHandler.composeMiddleware(client, Iface.class, middleware);
		}

		public vendor_namespace.java.Item getItem(FContext ctx) throws TException, InvalidData {
			return proxy.getItem(ctx);
		}

	}

	private static class InternalClient extends vendor_namespace.java.FVendoredBase.Client implements Iface {

		private FTransport transport;
		private FProtocolFactory protocolFactory;
		public InternalClient(FServiceProvider provider) {
			super(provider);
			this.transport = provider.getTransport();
			this.protocolFactory = provider.getProtocolFactory();
		}

		public vendor_namespace.java.Item getItem(FContext ctx) throws TException, InvalidData {
			TMemoryOutputBuffer memoryBuffer = new TMemoryOutputBuffer(this.transport.getRequestSizeLimit());
			FProtocol oprot = this.protocolFactory.getProtocol(memoryBuffer);
			oprot.writeRequestHeader(ctx);
			oprot.writeMessageBegin(new TMessage("getItem", TMessageType.CALL, 0));
			getItem_args args = new getItem_args();
			args.write(oprot);
			oprot.writeMessageEnd();
			TTransport response = this.transport.request(ctx, memoryBuffer.getWriteBytes());

			FProtocol iprot = this.protocolFactory.getProtocol(response);
			iprot.readResponseHeader(ctx);
			TMessage message = iprot.readMessageBegin();
			if (!message.name.equals("getItem")) {
				throw new TApplicationException(TApplicationExceptionType.WRONG_METHOD_NAME, "getItem failed: wrong method name");
			}
			if (message.type == TMessageType.EXCEPTION) {
				TApplicationException e = TApplicationException.read(iprot);
				iprot.readMessageEnd();
				TException returnedException = e;
				if (e.getType() == TApplicationExceptionType.RESPONSE_TOO_LARGE) {
					returnedException = new TTransportException(TTransportExceptionType.RESPONSE_TOO_LARGE, e.getMessage());
				}
				throw returnedException;
			}
			if (message.type != TMessageType.REPLY) {
				throw new TApplicationException(TApplicationExceptionType.INVALID_MESSAGE_TYPE, "getItem failed: invalid message type");
			}
			getItem_result res = new getItem_result();
			res.read(iprot);
			iprot.readMessageEnd();
			if (res.isSetSuccess()) {
				return res.success;
			}
			if (res.d != null) {
				throw res.d;
			}
			throw new TApplicationException(TApplicationExceptionType.MISSING_RESULT, "getItem failed: unknown result");
		}
	}

	public static class Processor extends vendor_namespace.java.FVendoredBase.Processor implements FProcessor {

		private Iface handler;

		public Processor(Iface iface, ServiceMiddleware... middleware) {
			super(iface, middleware);
			handler = InvocationHandler.composeMiddleware(iface, Iface.class, middleware);
		}

		protected java.util.Map<String, FProcessorFunction> getProcessMap() {
			java.util.Map<String, FProcessorFunction> processMap = super.getProcessMap();
			processMap.put("getItem", new GetItem());
			return processMap;
		}

		protected java.util.Map<String, java.util.Map<String, String>> getAnnotationsMap() {
			java.util.Map<String, java.util.Map<String, String>> annotationsMap = super.getAnnotationsMap();
			return annotationsMap;
		}

		@Override
		public void addMiddleware(ServiceMiddleware middleware) {
			super.addMiddleware(middleware);
			handler = InvocationHandler.composeMiddleware(handler, Iface.class, new ServiceMiddleware[]{middleware});
		}

		private class GetItem implements FProcessorFunction {

			public void process(FContext ctx, FProtocol iprot, FProtocol oprot) throws TException {
				getItem_args args = new getItem_args();
				try {
					args.read(iprot);
				} catch (TException e) {
					iprot.readMessageEnd();
					synchronized (WRITE_LOCK) {
						e = writeApplicationException(ctx, oprot, TApplicationExceptionType.PROTOCOL_ERROR, "getItem", e.getMessage());
					}
					throw e;
				}

				iprot.readMessageEnd();
				getItem_result result = new getItem_result();
				try {
					result.success = handler.getItem(ctx);
					result.setSuccessIsSet(true);
				} catch (InvalidData d) {
					result.d = d;
				} catch (TApplicationException e) {
					oprot.writeResponseHeader(ctx);
					oprot.writeMessageBegin(new TMessage("getItem", TMessageType.EXCEPTION, 0));
					e.write(oprot);
					oprot.writeMessageEnd();
					oprot.getTransport().flush();
					return;
				} catch (TException e) {
					synchronized (WRITE_LOCK) {
						e = (TApplicationException) writeApplicationException(ctx, oprot, TApplicationExceptionType.INTERNAL_ERROR, "getItem", "Internal error processing getItem: " + e.getMessage()).initCause(e);
					}
					throw e;
				}
				synchronized (WRITE_LOCK) {
					try {
						oprot.writeResponseHeader(ctx);
						oprot.writeMessageBegin(new TMessage("getItem", TMessageType.REPLY, 0));
						result.write(oprot);
						oprot.writeMessageEnd();
						oprot.getTransport().flush();
					} catch (TTransportException e) {
						if (e.getType() == TTransportExceptionType.REQUEST_TOO_LARGE) {
							throw (TApplicationException) writeApplicationException(ctx, oprot, TApplicationExceptionType.RESPONSE_TOO_LARGE, "getItem", "response too large: " + e.getMessage()).initCause(e);
						}
						throw e;
					}
				}
			}
		}

	}

	public static class getItem_args implements org.apache.thrift.TBase<getItem_args, getItem_args._Fields>, java.io.Serializable, Cloneable, Comparable<getItem_args> {
		private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getItem_args");


		/** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
		public enum _Fields implements org.apache.thrift.TFieldIdEnum {
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
		public getItem_args() {
		}

		/**
		 * Performs a deep copy on <i>other</i>.
		 */
		public getItem_args(getItem_args other) {
		}

		public getItem_args deepCopy() {
			return new getItem_args(this);
		}

		@Override
		public void clear() {
		}

		public void setFieldValue(_Fields field, Object value) {
			switch (field) {
			}
		}

		public Object getFieldValue(_Fields field) {
			switch (field) {
			}
			throw new IllegalStateException();
		}

		/** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
		public boolean isSet(_Fields field) {
			if (field == null) {
				throw new IllegalArgumentException();
			}

			switch (field) {
			}
			throw new IllegalStateException();
		}

		@Override
		public boolean equals(Object that) {
			if (that == null)
				return false;
			if (that instanceof getItem_args)
				return this.equals((getItem_args)that);
			return false;
		}

		public boolean equals(getItem_args that) {
			if (that == null)
				return false;
			return true;
		}

		@Override
		public int hashCode() {
			List<Object> list = new ArrayList<Object>();

			return list.hashCode();
		}

		@Override
		public int compareTo(getItem_args other) {
			if (!getClass().equals(other.getClass())) {
				return getClass().getName().compareTo(other.getClass().getName());
			}

			int lastComparison = 0;

			return 0;
		}

		public _Fields fieldForId(int fieldId) {
			return _Fields.findByThriftId(fieldId);
		}

		public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
			if (iprot.getScheme() != StandardScheme.class) {
				throw new UnsupportedOperationException();
			}
			new getItem_argsStandardScheme().read(iprot, this);
		}

		public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
			if (oprot.getScheme() != StandardScheme.class) {
				throw new UnsupportedOperationException();
			}
			new getItem_argsStandardScheme().write(oprot, this);
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder("getItem_args(");
			boolean first = true;

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

		private static class getItem_argsStandardScheme extends StandardScheme<getItem_args> {

			public void read(org.apache.thrift.protocol.TProtocol iprot, getItem_args struct) throws org.apache.thrift.TException {
				org.apache.thrift.protocol.TField schemeField;
				iprot.readStructBegin();
				while (true) {
					schemeField = iprot.readFieldBegin();
					if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
						break;
					}
					switch (schemeField.id) {
						default:
							org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					iprot.readFieldEnd();
				}
				iprot.readStructEnd();

				// check for required fields of primitive type, which can't be checked in the validate method
				struct.validate();
			}

			public void write(org.apache.thrift.protocol.TProtocol oprot, getItem_args struct) throws org.apache.thrift.TException {
				struct.validate();

				oprot.writeStructBegin(STRUCT_DESC);
				oprot.writeFieldStop();
				oprot.writeStructEnd();
			}

		}

	}

	public static class getItem_result implements org.apache.thrift.TBase<getItem_result, getItem_result._Fields>, java.io.Serializable, Cloneable, Comparable<getItem_result> {
		private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getItem_result");

		private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRUCT, (short)0);
		private static final org.apache.thrift.protocol.TField D_FIELD_DESC = new org.apache.thrift.protocol.TField("d", org.apache.thrift.protocol.TType.STRUCT, (short)1);

		public vendor_namespace.java.Item success;
		public InvalidData d;
		/** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
		public enum _Fields implements org.apache.thrift.TFieldIdEnum {
			SUCCESS((short)0, "success"),
			D((short)1, "d")
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
					case 0: // SUCCESS
						return SUCCESS;
					case 1: // D
						return D;
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
		public getItem_result() {
		}

		public getItem_result(
			vendor_namespace.java.Item success,
			InvalidData d) {
			this();
			this.success = success;
			this.d = d;
		}

		/**
		 * Performs a deep copy on <i>other</i>.
		 */
		public getItem_result(getItem_result other) {
			if (other.isSetSuccess()) {
				this.success = new vendor_namespace.java.Item(other.success);
			}
			if (other.isSetD()) {
				this.d = new InvalidData(other.d);
			}
		}

		public getItem_result deepCopy() {
			return new getItem_result(this);
		}

		@Override
		public void clear() {
			this.success = null;

			this.d = null;

		}

		public vendor_namespace.java.Item getSuccess() {
			return this.success;
		}

		public getItem_result setSuccess(vendor_namespace.java.Item success) {
			this.success = success;
			return this;
		}

		public void unsetSuccess() {
			this.success = null;
		}

		/** Returns true if field success is set (has been assigned a value) and false otherwise */
		public boolean isSetSuccess() {
			return this.success != null;
		}

		public void setSuccessIsSet(boolean value) {
			if (!value) {
				this.success = null;
			}
		}

		public InvalidData getD() {
			return this.d;
		}

		public getItem_result setD(InvalidData d) {
			this.d = d;
			return this;
		}

		public void unsetD() {
			this.d = null;
		}

		/** Returns true if field d is set (has been assigned a value) and false otherwise */
		public boolean isSetD() {
			return this.d != null;
		}

		public void setDIsSet(boolean value) {
			if (!value) {
				this.d = null;
			}
		}

		public void setFieldValue(_Fields field, Object value) {
			switch (field) {
			case SUCCESS:
				if (value == null) {
					unsetSuccess();
				} else {
					setSuccess((vendor_namespace.java.Item)value);
				}
				break;

			case D:
				if (value == null) {
					unsetD();
				} else {
					setD((InvalidData)value);
				}
				break;

			}
		}

		public Object getFieldValue(_Fields field) {
			switch (field) {
			case SUCCESS:
				return getSuccess();

			case D:
				return getD();

			}
			throw new IllegalStateException();
		}

		/** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
		public boolean isSet(_Fields field) {
			if (field == null) {
				throw new IllegalArgumentException();
			}

			switch (field) {
			case SUCCESS:
				return isSetSuccess();
			case D:
				return isSetD();
			}
			throw new IllegalStateException();
		}

		@Override
		public boolean equals(Object that) {
			if (that == null)
				return false;
			if (that instanceof getItem_result)
				return this.equals((getItem_result)that);
			return false;
		}

		public boolean equals(getItem_result that) {
			if (that == null)
				return false;
			if (!Objects.equals(this.success, that.success))
				return false;
			if (!Objects.equals(this.d, that.d))
				return false;
			return true;
		}

		@Override
		public int hashCode() {
			List<Object> list = new ArrayList<Object>();

			boolean present_success = true && (isSetSuccess());
			list.add(present_success);
			if (present_success)
				list.add(success);

			boolean present_d = true && (isSetD());
			list.add(present_d);
			if (present_d)
				list.add(d);

			return list.hashCode();
		}

		@Override
		public int compareTo(getItem_result other) {
			if (!getClass().equals(other.getClass())) {
				return getClass().getName().compareTo(other.getClass().getName());
			}

			int lastComparison = 0;

			lastComparison = Boolean.compare(isSetSuccess(), other.isSetSuccess());
			if (lastComparison != 0) {
				return lastComparison;
			}
			if (isSetSuccess()) {
				lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
				if (lastComparison != 0) {
					return lastComparison;
				}
			}
			lastComparison = Boolean.compare(isSetD(), other.isSetD());
			if (lastComparison != 0) {
				return lastComparison;
			}
			if (isSetD()) {
				lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.d, other.d);
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
			new getItem_resultStandardScheme().read(iprot, this);
		}

		public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
			if (oprot.getScheme() != StandardScheme.class) {
				throw new UnsupportedOperationException();
			}
			new getItem_resultStandardScheme().write(oprot, this);
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder("getItem_result(");
			boolean first = true;

			sb.append("success:");
			sb.append(this.success);
			first = false;
			if (!first) sb.append(", ");
			sb.append("d:");
			sb.append(this.d);
			first = false;
			sb.append(")");
			return sb.toString();
		}

		public void validate() throws org.apache.thrift.TException {
			// check for required fields
			// check for sub-struct validity
			if (success != null) {
				success.validate();
			}
			if (d != null) {
				d.validate();
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

		private static class getItem_resultStandardScheme extends StandardScheme<getItem_result> {

			public void read(org.apache.thrift.protocol.TProtocol iprot, getItem_result struct) throws org.apache.thrift.TException {
				org.apache.thrift.protocol.TField schemeField;
				iprot.readStructBegin();
				while (true) {
					schemeField = iprot.readFieldBegin();
					if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
						break;
					}
					switch (schemeField.id) {
						case 0: // SUCCESS
							if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
								struct.success = new vendor_namespace.java.Item();
								struct.success.read(iprot);
								struct.setSuccessIsSet(true);
							} else {
								org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
							}
							break;
						case 1: // D
							if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
								struct.d = new InvalidData();
								struct.d.read(iprot);
								struct.setDIsSet(true);
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

			public void write(org.apache.thrift.protocol.TProtocol oprot, getItem_result struct) throws org.apache.thrift.TException {
				struct.validate();

				oprot.writeStructBegin(STRUCT_DESC);
				if (struct.isSetSuccess()) {
					oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
					struct.success.write(oprot);
					oprot.writeFieldEnd();
				}
				if (struct.isSetD()) {
					oprot.writeFieldBegin(D_FIELD_DESC);
					struct.d.write(oprot);
					oprot.writeFieldEnd();
				}
				oprot.writeFieldStop();
				oprot.writeStructEnd();
			}

		}

	}

}