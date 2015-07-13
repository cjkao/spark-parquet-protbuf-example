/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package acid;
@org.apache.avro.specific.AvroGenerated
public class AminoAcid extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AminoAcid\",\"namespace\":\"acid\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"AminoAcidType\",\"symbols\":[\"ALIPHATIC\",\"HYDROXYL\",\"CYCLIC\",\"AROMATIC\",\"BASIC\",\"ACIDIC\"]}},{\"name\":\"fullName\",\"type\":\"string\"},{\"name\":\"abbreviation\",\"type\":\"string\"},{\"name\":\"molecularWeight\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public acid.AminoAcidType type;
  @Deprecated public java.lang.CharSequence fullName;
  @Deprecated public java.lang.CharSequence abbreviation;
  @Deprecated public float molecularWeight;

  /**
   * Default constructor.
   */
  public AminoAcid() {}

  /**
   * All-args constructor.
   */
  public AminoAcid(acid.AminoAcidType type, java.lang.CharSequence fullName, java.lang.CharSequence abbreviation, java.lang.Float molecularWeight) {
    this.type = type;
    this.fullName = fullName;
    this.abbreviation = abbreviation;
    this.molecularWeight = molecularWeight;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return fullName;
    case 2: return abbreviation;
    case 3: return molecularWeight;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (acid.AminoAcidType)value$; break;
    case 1: fullName = (java.lang.CharSequence)value$; break;
    case 2: abbreviation = (java.lang.CharSequence)value$; break;
    case 3: molecularWeight = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   */
  public acid.AminoAcidType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(acid.AminoAcidType value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'fullName' field.
   */
  public java.lang.CharSequence getFullName() {
    return fullName;
  }

  /**
   * Sets the value of the 'fullName' field.
   * @param value the value to set.
   */
  public void setFullName(java.lang.CharSequence value) {
    this.fullName = value;
  }

  /**
   * Gets the value of the 'abbreviation' field.
   */
  public java.lang.CharSequence getAbbreviation() {
    return abbreviation;
  }

  /**
   * Sets the value of the 'abbreviation' field.
   * @param value the value to set.
   */
  public void setAbbreviation(java.lang.CharSequence value) {
    this.abbreviation = value;
  }

  /**
   * Gets the value of the 'molecularWeight' field.
   */
  public java.lang.Float getMolecularWeight() {
    return molecularWeight;
  }

  /**
   * Sets the value of the 'molecularWeight' field.
   * @param value the value to set.
   */
  public void setMolecularWeight(java.lang.Float value) {
    this.molecularWeight = value;
  }

  /** Creates a new AminoAcid RecordBuilder */
  public static acid.AminoAcid.Builder newBuilder() {
    return new acid.AminoAcid.Builder();
  }
  
  /** Creates a new AminoAcid RecordBuilder by copying an existing Builder */
  public static acid.AminoAcid.Builder newBuilder(acid.AminoAcid.Builder other) {
    return new acid.AminoAcid.Builder(other);
  }
  
  /** Creates a new AminoAcid RecordBuilder by copying an existing AminoAcid instance */
  public static acid.AminoAcid.Builder newBuilder(acid.AminoAcid other) {
    return new acid.AminoAcid.Builder(other);
  }
  
  /**
   * RecordBuilder for AminoAcid instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AminoAcid>
    implements org.apache.avro.data.RecordBuilder<AminoAcid> {

    private acid.AminoAcidType type;
    private java.lang.CharSequence fullName;
    private java.lang.CharSequence abbreviation;
    private float molecularWeight;

    /** Creates a new Builder */
    private Builder() {
      super(acid.AminoAcid.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(acid.AminoAcid.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing AminoAcid instance */
    private Builder(acid.AminoAcid other) {
            super(acid.AminoAcid.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.fullName)) {
        this.fullName = data().deepCopy(fields()[1].schema(), other.fullName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.abbreviation)) {
        this.abbreviation = data().deepCopy(fields()[2].schema(), other.abbreviation);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.molecularWeight)) {
        this.molecularWeight = data().deepCopy(fields()[3].schema(), other.molecularWeight);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public acid.AminoAcidType getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public acid.AminoAcid.Builder setType(acid.AminoAcidType value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'type' field */
    public acid.AminoAcid.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'fullName' field */
    public java.lang.CharSequence getFullName() {
      return fullName;
    }
    
    /** Sets the value of the 'fullName' field */
    public acid.AminoAcid.Builder setFullName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.fullName = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'fullName' field has been set */
    public boolean hasFullName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'fullName' field */
    public acid.AminoAcid.Builder clearFullName() {
      fullName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'abbreviation' field */
    public java.lang.CharSequence getAbbreviation() {
      return abbreviation;
    }
    
    /** Sets the value of the 'abbreviation' field */
    public acid.AminoAcid.Builder setAbbreviation(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.abbreviation = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'abbreviation' field has been set */
    public boolean hasAbbreviation() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'abbreviation' field */
    public acid.AminoAcid.Builder clearAbbreviation() {
      abbreviation = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'molecularWeight' field */
    public java.lang.Float getMolecularWeight() {
      return molecularWeight;
    }
    
    /** Sets the value of the 'molecularWeight' field */
    public acid.AminoAcid.Builder setMolecularWeight(float value) {
      validate(fields()[3], value);
      this.molecularWeight = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'molecularWeight' field has been set */
    public boolean hasMolecularWeight() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'molecularWeight' field */
    public acid.AminoAcid.Builder clearMolecularWeight() {
      fieldSetFlags()[3] = false;
      return this;
    }

    public AminoAcid build() {
      try {
        AminoAcid record = new AminoAcid();
        record.type = fieldSetFlags()[0] ? this.type : (acid.AminoAcidType) defaultValue(fields()[0]);
        record.fullName = fieldSetFlags()[1] ? this.fullName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.abbreviation = fieldSetFlags()[2] ? this.abbreviation : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.molecularWeight = fieldSetFlags()[3] ? this.molecularWeight : (java.lang.Float) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}