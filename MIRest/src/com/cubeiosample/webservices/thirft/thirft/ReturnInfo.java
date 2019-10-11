/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cubeiosample.webservices.thirft.thirft;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-10-09")
public class ReturnInfo implements org.apache.thrift.TBase<ReturnInfo, ReturnInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ReturnInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReturnInfo");

  private static final org.apache.thrift.protocol.TField INVENTORY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("inventoryId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField STAFF_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("staffId", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField RENT_FIELD_DESC = new org.apache.thrift.protocol.TField("rent", org.apache.thrift.protocol.TType.DOUBLE, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ReturnInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ReturnInfoTupleSchemeFactory();

  public int inventoryId; // required
  public int userId; // required
  public int staffId; // required
  public double rent; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INVENTORY_ID((short)1, "inventoryId"),
    USER_ID((short)2, "userId"),
    STAFF_ID((short)3, "staffId"),
    RENT((short)4, "rent");

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
        case 1: // INVENTORY_ID
          return INVENTORY_ID;
        case 2: // USER_ID
          return USER_ID;
        case 3: // STAFF_ID
          return STAFF_ID;
        case 4: // RENT
          return RENT;
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
  private static final int __INVENTORYID_ISSET_ID = 0;
  private static final int __USERID_ISSET_ID = 1;
  private static final int __STAFFID_ISSET_ID = 2;
  private static final int __RENT_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INVENTORY_ID, new org.apache.thrift.meta_data.FieldMetaData("inventoryId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STAFF_ID, new org.apache.thrift.meta_data.FieldMetaData("staffId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RENT, new org.apache.thrift.meta_data.FieldMetaData("rent", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReturnInfo.class, metaDataMap);
  }

  public ReturnInfo() {
  }

  public ReturnInfo(
    int inventoryId,
    int userId,
    int staffId,
    double rent)
  {
    this();
    this.inventoryId = inventoryId;
    setInventoryIdIsSet(true);
    this.userId = userId;
    setUserIdIsSet(true);
    this.staffId = staffId;
    setStaffIdIsSet(true);
    this.rent = rent;
    setRentIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReturnInfo(ReturnInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.inventoryId = other.inventoryId;
    this.userId = other.userId;
    this.staffId = other.staffId;
    this.rent = other.rent;
  }

  public ReturnInfo deepCopy() {
    return new ReturnInfo(this);
  }

  @Override
  public void clear() {
    setInventoryIdIsSet(false);
    this.inventoryId = 0;
    setUserIdIsSet(false);
    this.userId = 0;
    setStaffIdIsSet(false);
    this.staffId = 0;
    setRentIsSet(false);
    this.rent = 0.0;
  }

  public int getInventoryId() {
    return this.inventoryId;
  }

  public ReturnInfo setInventoryId(int inventoryId) {
    this.inventoryId = inventoryId;
    setInventoryIdIsSet(true);
    return this;
  }

  public void unsetInventoryId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INVENTORYID_ISSET_ID);
  }

  /** Returns true if field inventoryId is set (has been assigned a value) and false otherwise */
  public boolean isSetInventoryId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INVENTORYID_ISSET_ID);
  }

  public void setInventoryIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INVENTORYID_ISSET_ID, value);
  }

  public int getUserId() {
    return this.userId;
  }

  public ReturnInfo setUserId(int userId) {
    this.userId = userId;
    setUserIdIsSet(true);
    return this;
  }

  public void unsetUserId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  public void setUserIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
  }

  public int getStaffId() {
    return this.staffId;
  }

  public ReturnInfo setStaffId(int staffId) {
    this.staffId = staffId;
    setStaffIdIsSet(true);
    return this;
  }

  public void unsetStaffId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STAFFID_ISSET_ID);
  }

  /** Returns true if field staffId is set (has been assigned a value) and false otherwise */
  public boolean isSetStaffId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STAFFID_ISSET_ID);
  }

  public void setStaffIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STAFFID_ISSET_ID, value);
  }

  public double getRent() {
    return this.rent;
  }

  public ReturnInfo setRent(double rent) {
    this.rent = rent;
    setRentIsSet(true);
    return this;
  }

  public void unsetRent() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RENT_ISSET_ID);
  }

  /** Returns true if field rent is set (has been assigned a value) and false otherwise */
  public boolean isSetRent() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RENT_ISSET_ID);
  }

  public void setRentIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RENT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case INVENTORY_ID:
      if (value == null) {
        unsetInventoryId();
      } else {
        setInventoryId((java.lang.Integer)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((java.lang.Integer)value);
      }
      break;

    case STAFF_ID:
      if (value == null) {
        unsetStaffId();
      } else {
        setStaffId((java.lang.Integer)value);
      }
      break;

    case RENT:
      if (value == null) {
        unsetRent();
      } else {
        setRent((java.lang.Double)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case INVENTORY_ID:
      return getInventoryId();

    case USER_ID:
      return getUserId();

    case STAFF_ID:
      return getStaffId();

    case RENT:
      return getRent();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case INVENTORY_ID:
      return isSetInventoryId();
    case USER_ID:
      return isSetUserId();
    case STAFF_ID:
      return isSetStaffId();
    case RENT:
      return isSetRent();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ReturnInfo)
      return this.equals((ReturnInfo)that);
    return false;
  }

  public boolean equals(ReturnInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_inventoryId = true;
    boolean that_present_inventoryId = true;
    if (this_present_inventoryId || that_present_inventoryId) {
      if (!(this_present_inventoryId && that_present_inventoryId))
        return false;
      if (this.inventoryId != that.inventoryId)
        return false;
    }

    boolean this_present_userId = true;
    boolean that_present_userId = true;
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (this.userId != that.userId)
        return false;
    }

    boolean this_present_staffId = true;
    boolean that_present_staffId = true;
    if (this_present_staffId || that_present_staffId) {
      if (!(this_present_staffId && that_present_staffId))
        return false;
      if (this.staffId != that.staffId)
        return false;
    }

    boolean this_present_rent = true;
    boolean that_present_rent = true;
    if (this_present_rent || that_present_rent) {
      if (!(this_present_rent && that_present_rent))
        return false;
      if (this.rent != that.rent)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + inventoryId;

    hashCode = hashCode * 8191 + userId;

    hashCode = hashCode * 8191 + staffId;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(rent);

    return hashCode;
  }

  @Override
  public int compareTo(ReturnInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetInventoryId()).compareTo(other.isSetInventoryId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInventoryId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inventoryId, other.inventoryId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStaffId()).compareTo(other.isSetStaffId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStaffId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.staffId, other.staffId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRent()).compareTo(other.isSetRent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rent, other.rent);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ReturnInfo(");
    boolean first = true;

    sb.append("inventoryId:");
    sb.append(this.inventoryId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("userId:");
    sb.append(this.userId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("staffId:");
    sb.append(this.staffId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rent:");
    sb.append(this.rent);
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

  private static class ReturnInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReturnInfoStandardScheme getScheme() {
      return new ReturnInfoStandardScheme();
    }
  }

  private static class ReturnInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ReturnInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReturnInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INVENTORY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.inventoryId = iprot.readI32();
              struct.setInventoryIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.userId = iprot.readI32();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STAFF_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.staffId = iprot.readI32();
              struct.setStaffIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RENT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.rent = iprot.readDouble();
              struct.setRentIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReturnInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(INVENTORY_ID_FIELD_DESC);
      oprot.writeI32(struct.inventoryId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeI32(struct.userId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STAFF_ID_FIELD_DESC);
      oprot.writeI32(struct.staffId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RENT_FIELD_DESC);
      oprot.writeDouble(struct.rent);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReturnInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReturnInfoTupleScheme getScheme() {
      return new ReturnInfoTupleScheme();
    }
  }

  private static class ReturnInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ReturnInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReturnInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetInventoryId()) {
        optionals.set(0);
      }
      if (struct.isSetUserId()) {
        optionals.set(1);
      }
      if (struct.isSetStaffId()) {
        optionals.set(2);
      }
      if (struct.isSetRent()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetInventoryId()) {
        oprot.writeI32(struct.inventoryId);
      }
      if (struct.isSetUserId()) {
        oprot.writeI32(struct.userId);
      }
      if (struct.isSetStaffId()) {
        oprot.writeI32(struct.staffId);
      }
      if (struct.isSetRent()) {
        oprot.writeDouble(struct.rent);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReturnInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.inventoryId = iprot.readI32();
        struct.setInventoryIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.userId = iprot.readI32();
        struct.setUserIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.staffId = iprot.readI32();
        struct.setStaffIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.rent = iprot.readDouble();
        struct.setRentIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

