/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cubeiosample.webservices.thirft.thirft;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-10-09")
public class StoreInfo implements org.apache.thrift.TBase<StoreInfo, StoreInfo._Fields>, java.io.Serializable, Cloneable, Comparable<StoreInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StoreInfo");

  private static final org.apache.thrift.protocol.TField STORE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("storeId", org.apache.thrift.protocol.TType.I32, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new StoreInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new StoreInfoTupleSchemeFactory();

  public int storeId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STORE_ID((short)1, "storeId");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STORE_ID
          return STORE_ID;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STOREID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STORE_ID, new org.apache.thrift.meta_data.FieldMetaData("storeId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StoreInfo.class, metaDataMap);
  }

  public StoreInfo() {
  }

  public StoreInfo(
    int storeId)
  {
    this();
    this.storeId = storeId;
    setStoreIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StoreInfo(StoreInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.storeId = other.storeId;
  }

  public StoreInfo deepCopy() {
    return new StoreInfo(this);
  }

  @Override
  public void clear() {
    setStoreIdIsSet(false);
    this.storeId = 0;
  }

  public int getStoreId() {
    return this.storeId;
  }

  public StoreInfo setStoreId(int storeId) {
    this.storeId = storeId;
    setStoreIdIsSet(true);
    return this;
  }

  public void unsetStoreId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STOREID_ISSET_ID);
  }

  /** Returns true if field storeId is set (has been assigned a value) and false otherwise */
  public boolean isSetStoreId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STOREID_ISSET_ID);
  }

  public void setStoreIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STOREID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STORE_ID:
      if (value == null) {
        unsetStoreId();
      } else {
        setStoreId((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STORE_ID:
      return getStoreId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STORE_ID:
      return isSetStoreId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof StoreInfo)
      return this.equals((StoreInfo)that);
    return false;
  }

  public boolean equals(StoreInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_storeId = true;
    boolean that_present_storeId = true;
    if (this_present_storeId || that_present_storeId) {
      if (!(this_present_storeId && that_present_storeId))
        return false;
      if (this.storeId != that.storeId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + storeId;

    return hashCode;
  }

  @Override
  public int compareTo(StoreInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStoreId()).compareTo(other.isSetStoreId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStoreId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storeId, other.storeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("StoreInfo(");
    boolean first = true;

    sb.append("storeId:");
    sb.append(this.storeId);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StoreInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StoreInfoStandardScheme getScheme() {
      return new StoreInfoStandardScheme();
    }
  }

  private static class StoreInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<StoreInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StoreInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STORE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.storeId = iprot.readI32();
              struct.setStoreIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StoreInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(STORE_ID_FIELD_DESC);
      oprot.writeI32(struct.storeId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StoreInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StoreInfoTupleScheme getScheme() {
      return new StoreInfoTupleScheme();
    }
  }

  private static class StoreInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<StoreInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StoreInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStoreId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetStoreId()) {
        oprot.writeI32(struct.storeId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StoreInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.storeId = iprot.readI32();
        struct.setStoreIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
