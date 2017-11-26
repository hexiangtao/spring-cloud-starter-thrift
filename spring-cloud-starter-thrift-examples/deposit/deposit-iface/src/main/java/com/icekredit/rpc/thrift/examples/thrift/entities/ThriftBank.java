/**
 * Autogenerated by Thrift Compiler (0.10.0)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.icekredit.rpc.thrift.examples.thrift.entities;


import com.icekredit.rpc.thrift.examples.thrift.enums.ThriftRegion;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-11-21")
public class ThriftBank implements org.apache.thrift.TBase<ThriftBank, ThriftBank._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftBank> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftBank");

    private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short) 1);
    private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short) 2);
    private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short) 3);
    private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short) 4);
    private static final org.apache.thrift.protocol.TField BRANCHES_FIELD_DESC = new org.apache.thrift.protocol.TField("branches", org.apache.thrift.protocol.TType.MAP, (short) 5);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ThriftBankStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ThriftBankTupleSchemeFactory();

    public long id; // required
    public String code; // required
    public String name; // required
    public String description; // optional
    public java.util.Map<ThriftRegion, java.util.List<ThriftBranch>> branches; // optional

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        ID((short) 1, "id"),
        CODE((short) 2, "code"),
        NAME((short) 3, "name"),
        DESCRIPTION((short) 4, "description"),
        BRANCHES((short) 5, "branches");

        private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

        static {
            for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
                case 1: // ID
                    return ID;
                case 2: // CODE
                    return CODE;
                case 3: // NAME
                    return NAME;
                case 4: // DESCRIPTION
                    return DESCRIPTION;
                case 5: // BRANCHES
                    return BRANCHES;
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
    private static final int __ID_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    private static final _Fields optionals[] = {_Fields.DESCRIPTION, _Fields.BRANCHES};
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
        tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.BRANCHES, new org.apache.thrift.meta_data.FieldMetaData("branches", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP,
                        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftRegion.class),
                        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
                                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT, "ThriftBranch")))));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftBank.class, metaDataMap);
    }

    public ThriftBank() {
    }

    public ThriftBank(
            long id,
            String code,
            String name) {
        this();
        this.id = id;
        setIdIsSet(true);
        this.code = code;
        this.name = name;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public ThriftBank(ThriftBank other) {
        __isset_bitfield = other.__isset_bitfield;
        this.id = other.id;
        if (other.isSetCode()) {
            this.code = other.code;
        }
        if (other.isSetName()) {
            this.name = other.name;
        }
        if (other.isSetDescription()) {
            this.description = other.description;
        }
        if (other.isSetBranches()) {
            java.util.Map<ThriftRegion, java.util.List<ThriftBranch>> __this__branches = new java.util.HashMap<ThriftRegion, java.util.List<ThriftBranch>>(other.branches.size());
            for (java.util.Map.Entry<ThriftRegion, java.util.List<ThriftBranch>> other_element : other.branches.entrySet()) {

                ThriftRegion other_element_key = other_element.getKey();
                java.util.List<ThriftBranch> other_element_value = other_element.getValue();

                ThriftRegion __this__branches_copy_key = other_element_key;

                java.util.List<ThriftBranch> __this__branches_copy_value = new java.util.ArrayList<ThriftBranch>(other_element_value.size());
                for (ThriftBranch other_element_value_element : other_element_value) {
                    __this__branches_copy_value.add(other_element_value_element);
                }

                __this__branches.put(__this__branches_copy_key, __this__branches_copy_value);
            }
            this.branches = __this__branches;
        }
    }

    public ThriftBank deepCopy() {
        return new ThriftBank(this);
    }

    @Override
    public void clear() {
        setIdIsSet(false);
        this.id = 0;
        this.code = null;
        this.name = null;
        this.description = null;
        this.branches = null;
    }

    public long getId() {
        return this.id;
    }

    public ThriftBank setId(long id) {
        this.id = id;
        setIdIsSet(true);
        return this;
    }

    public void unsetId() {
        __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
    }

    /**
     * Returns true if field id is set (has been assigned a value) and false otherwise
     */
    public boolean isSetId() {
        return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
    }

    public void setIdIsSet(boolean value) {
        __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
    }

    public String getCode() {
        return this.code;
    }

    public ThriftBank setCode(String code) {
        this.code = code;
        return this;
    }

    public void unsetCode() {
        this.code = null;
    }

    /**
     * Returns true if field code is set (has been assigned a value) and false otherwise
     */
    public boolean isSetCode() {
        return this.code != null;
    }

    public void setCodeIsSet(boolean value) {
        if (!value) {
            this.code = null;
        }
    }

    public String getName() {
        return this.name;
    }

    public ThriftBank setName(String name) {
        this.name = name;
        return this;
    }

    public void unsetName() {
        this.name = null;
    }

    /**
     * Returns true if field name is set (has been assigned a value) and false otherwise
     */
    public boolean isSetName() {
        return this.name != null;
    }

    public void setNameIsSet(boolean value) {
        if (!value) {
            this.name = null;
        }
    }

    public String getDescription() {
        return this.description;
    }

    public ThriftBank setDescription(String description) {
        this.description = description;
        return this;
    }

    public void unsetDescription() {
        this.description = null;
    }

    /**
     * Returns true if field description is set (has been assigned a value) and false otherwise
     */
    public boolean isSetDescription() {
        return this.description != null;
    }

    public void setDescriptionIsSet(boolean value) {
        if (!value) {
            this.description = null;
        }
    }

    public int getBranchesSize() {
        return (this.branches == null) ? 0 : this.branches.size();
    }

    public void putToBranches(ThriftRegion key, java.util.List<ThriftBranch> val) {
        if (this.branches == null) {
            this.branches = new java.util.HashMap<ThriftRegion, java.util.List<ThriftBranch>>();
        }
        this.branches.put(key, val);
    }

    public java.util.Map<ThriftRegion, java.util.List<ThriftBranch>> getBranches() {
        return this.branches;
    }

    public ThriftBank setBranches(java.util.Map<ThriftRegion, java.util.List<ThriftBranch>> branches) {
        this.branches = branches;
        return this;
    }

    public void unsetBranches() {
        this.branches = null;
    }

    /**
     * Returns true if field branches is set (has been assigned a value) and false otherwise
     */
    public boolean isSetBranches() {
        return this.branches != null;
    }

    public void setBranchesIsSet(boolean value) {
        if (!value) {
            this.branches = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case ID:
                if (value == null) {
                    unsetId();
                } else {
                    setId((Long) value);
                }
                break;

            case CODE:
                if (value == null) {
                    unsetCode();
                } else {
                    setCode((String) value);
                }
                break;

            case NAME:
                if (value == null) {
                    unsetName();
                } else {
                    setName((String) value);
                }
                break;

            case DESCRIPTION:
                if (value == null) {
                    unsetDescription();
                } else {
                    setDescription((String) value);
                }
                break;

            case BRANCHES:
                if (value == null) {
                    unsetBranches();
                } else {
                    setBranches((java.util.Map<ThriftRegion, java.util.List<ThriftBranch>>) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case ID:
                return getId();

            case CODE:
                return getCode();

            case NAME:
                return getName();

            case DESCRIPTION:
                return getDescription();

            case BRANCHES:
                return getBranches();

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case ID:
                return isSetId();
            case CODE:
                return isSetCode();
            case NAME:
                return isSetName();
            case DESCRIPTION:
                return isSetDescription();
            case BRANCHES:
                return isSetBranches();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof ThriftBank)
            return this.equals((ThriftBank) that);
        return false;
    }

    public boolean equals(ThriftBank that) {
        if (that == null)
            return false;
        if (this == that)
            return true;

        boolean this_present_id = true;
        boolean that_present_id = true;
        if (this_present_id || that_present_id) {
            if (!(this_present_id && that_present_id))
                return false;
            if (this.id != that.id)
                return false;
        }

        boolean this_present_code = true && this.isSetCode();
        boolean that_present_code = true && that.isSetCode();
        if (this_present_code || that_present_code) {
            if (!(this_present_code && that_present_code))
                return false;
            if (!this.code.equals(that.code))
                return false;
        }

        boolean this_present_name = true && this.isSetName();
        boolean that_present_name = true && that.isSetName();
        if (this_present_name || that_present_name) {
            if (!(this_present_name && that_present_name))
                return false;
            if (!this.name.equals(that.name))
                return false;
        }

        boolean this_present_description = true && this.isSetDescription();
        boolean that_present_description = true && that.isSetDescription();
        if (this_present_description || that_present_description) {
            if (!(this_present_description && that_present_description))
                return false;
            if (!this.description.equals(that.description))
                return false;
        }

        boolean this_present_branches = true && this.isSetBranches();
        boolean that_present_branches = true && that.isSetBranches();
        if (this_present_branches || that_present_branches) {
            if (!(this_present_branches && that_present_branches))
                return false;
            if (!this.branches.equals(that.branches))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

        hashCode = hashCode * 8191 + ((isSetCode()) ? 131071 : 524287);
        if (isSetCode())
            hashCode = hashCode * 8191 + code.hashCode();

        hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
        if (isSetName())
            hashCode = hashCode * 8191 + name.hashCode();

        hashCode = hashCode * 8191 + ((isSetDescription()) ? 131071 : 524287);
        if (isSetDescription())
            hashCode = hashCode * 8191 + description.hashCode();

        hashCode = hashCode * 8191 + ((isSetBranches()) ? 131071 : 524287);
        if (isSetBranches())
            hashCode = hashCode * 8191 + branches.hashCode();

        return hashCode;
    }

    @Override
    public int compareTo(ThriftBank other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetCode()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetName()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetDescription()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetBranches()).compareTo(other.isSetBranches());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetBranches()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.branches, other.branches);
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
        scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        scheme(oprot).write(oprot, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ThriftBank(");
        boolean first = true;

        sb.append("id:");
        sb.append(this.id);
        first = false;
        if (!first) sb.append(", ");
        sb.append("code:");
        if (this.code == null) {
            sb.append("null");
        } else {
            sb.append(this.code);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("name:");
        if (this.name == null) {
            sb.append("null");
        } else {
            sb.append(this.name);
        }
        first = false;
        if (isSetDescription()) {
            if (!first) sb.append(", ");
            sb.append("description:");
            if (this.description == null) {
                sb.append("null");
            } else {
                sb.append(this.description);
            }
            first = false;
        }
        if (isSetBranches()) {
            if (!first) sb.append(", ");
            sb.append("branches:");
            if (this.branches == null) {
                sb.append("null");
            } else {
                sb.append(this.branches);
            }
            first = false;
        }
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
        if (code == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'code' was not present! Struct: " + toString());
        }
        if (name == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
        }
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
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class ThriftBankStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ThriftBankStandardScheme getScheme() {
            return new ThriftBankStandardScheme();
        }
    }

    private static class ThriftBankStandardScheme extends org.apache.thrift.scheme.StandardScheme<ThriftBank> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftBank struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            struct.id = iprot.readI64();
                            struct.setIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // CODE
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.code = iprot.readString();
                            struct.setCodeIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // NAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.name = iprot.readString();
                            struct.setNameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 4: // DESCRIPTION
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.description = iprot.readString();
                            struct.setDescriptionIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 5: // BRANCHES
                        if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
                            {
                                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                                struct.branches = new java.util.HashMap<ThriftRegion, java.util.List<ThriftBranch>>(2 * _map0.size);
                                ThriftRegion _key1;
                                java.util.List<ThriftBranch> _val2;
                                for (int _i3 = 0; _i3 < _map0.size; ++_i3) {
                                    _key1 = ThriftRegion.findByValue(iprot.readI32());
                                    {
                                        org.apache.thrift.protocol.TList _list4 = iprot.readListBegin();
                                        _val2 = new java.util.ArrayList<ThriftBranch>(_list4.size);
                                        ThriftBranch _elem5;
                                        for (int _i6 = 0; _i6 < _list4.size; ++_i6) {
                                            _elem5 = new ThriftBranch();
                                            _elem5.read(iprot);
                                            _val2.add(_elem5);
                                        }
                                        iprot.readListEnd();
                                    }
                                    struct.branches.put(_key1, _val2);
                                }
                                iprot.readMapEnd();
                            }
                            struct.setBranchesIsSet(true);
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
            if (!struct.isSetId()) {
                throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
            }
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftBank struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            oprot.writeFieldBegin(ID_FIELD_DESC);
            oprot.writeI64(struct.id);
            oprot.writeFieldEnd();
            if (struct.code != null) {
                oprot.writeFieldBegin(CODE_FIELD_DESC);
                oprot.writeString(struct.code);
                oprot.writeFieldEnd();
            }
            if (struct.name != null) {
                oprot.writeFieldBegin(NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            if (struct.description != null) {
                if (struct.isSetDescription()) {
                    oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
                    oprot.writeString(struct.description);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.branches != null) {
                if (struct.isSetBranches()) {
                    oprot.writeFieldBegin(BRANCHES_FIELD_DESC);
                    {
                        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.LIST, struct.branches.size()));
                        for (java.util.Map.Entry<ThriftRegion, java.util.List<ThriftBranch>> _iter7 : struct.branches.entrySet()) {
                            oprot.writeI32(_iter7.getKey().getValue());
                            {
                                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter7.getValue().size()));
                                for (ThriftBranch _iter8 : _iter7.getValue()) {
                                    _iter8.write(oprot);
                                }
                                oprot.writeListEnd();
                            }
                        }
                        oprot.writeMapEnd();
                    }
                    oprot.writeFieldEnd();
                }
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class ThriftBankTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ThriftBankTupleScheme getScheme() {
            return new ThriftBankTupleScheme();
        }
    }

    private static class ThriftBankTupleScheme extends org.apache.thrift.scheme.TupleScheme<ThriftBank> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, ThriftBank struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            oprot.writeI64(struct.id);
            oprot.writeString(struct.code);
            oprot.writeString(struct.name);
            java.util.BitSet optionals = new java.util.BitSet();
            if (struct.isSetDescription()) {
                optionals.set(0);
            }
            if (struct.isSetBranches()) {
                optionals.set(1);
            }
            oprot.writeBitSet(optionals, 2);
            if (struct.isSetDescription()) {
                oprot.writeString(struct.description);
            }
            if (struct.isSetBranches()) {
                {
                    oprot.writeI32(struct.branches.size());
                    for (java.util.Map.Entry<ThriftRegion, java.util.List<ThriftBranch>> _iter9 : struct.branches.entrySet()) {
                        oprot.writeI32(_iter9.getKey().getValue());
                        {
                            oprot.writeI32(_iter9.getValue().size());
                            for (ThriftBranch _iter10 : _iter9.getValue()) {
                                _iter10.write(oprot);
                            }
                        }
                    }
                }
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, ThriftBank struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            struct.id = iprot.readI64();
            struct.setIdIsSet(true);
            struct.code = iprot.readString();
            struct.setCodeIsSet(true);
            struct.name = iprot.readString();
            struct.setNameIsSet(true);
            java.util.BitSet incoming = iprot.readBitSet(2);
            if (incoming.get(0)) {
                struct.description = iprot.readString();
                struct.setDescriptionIsSet(true);
            }
            if (incoming.get(1)) {
                {
                    org.apache.thrift.protocol.TMap _map11 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.LIST, iprot.readI32());
                    struct.branches = new java.util.HashMap<ThriftRegion, java.util.List<ThriftBranch>>(2 * _map11.size);
                    ThriftRegion _key12;
                    java.util.List<ThriftBranch> _val13;
                    for (int _i14 = 0; _i14 < _map11.size; ++_i14) {
                        _key12 = ThriftRegion.findByValue(iprot.readI32());
                        {
                            org.apache.thrift.protocol.TList _list15 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
                            _val13 = new java.util.ArrayList<ThriftBranch>(_list15.size);
                            ThriftBranch _elem16;
                            for (int _i17 = 0; _i17 < _list15.size; ++_i17) {
                                _elem16 = new ThriftBranch();
                                _elem16.read(iprot);
                                _val13.add(_elem16);
                            }
                        }
                        struct.branches.put(_key12, _val13);
                    }
                }
                struct.setBranchesIsSet(true);
            }
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
}

