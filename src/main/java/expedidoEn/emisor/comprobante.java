/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package expedidoEn.emisor;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class comprobante extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"comprobante\",\"namespace\":\"expedidoEn.emisor\",\"fields\":[{\"name\":\"noExterior\",\"type\":\"string\"},{\"name\":\"estado\",\"type\":\"string\"},{\"name\":\"codigoPostal\",\"type\":\"string\"},{\"name\":\"municipio\",\"type\":\"string\"},{\"name\":\"calle\",\"type\":\"string\"},{\"name\":\"colonia\",\"type\":\"string\"},{\"name\":\"pais\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence noExterior;
  @Deprecated public java.lang.CharSequence estado;
  @Deprecated public java.lang.CharSequence codigoPostal;
  @Deprecated public java.lang.CharSequence municipio;
  @Deprecated public java.lang.CharSequence calle;
  @Deprecated public java.lang.CharSequence colonia;
  @Deprecated public java.lang.CharSequence pais;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public comprobante() {}

  /**
   * All-args constructor.
   */
  public comprobante(java.lang.CharSequence noExterior, java.lang.CharSequence estado, java.lang.CharSequence codigoPostal, java.lang.CharSequence municipio, java.lang.CharSequence calle, java.lang.CharSequence colonia, java.lang.CharSequence pais) {
    this.noExterior = noExterior;
    this.estado = estado;
    this.codigoPostal = codigoPostal;
    this.municipio = municipio;
    this.calle = calle;
    this.colonia = colonia;
    this.pais = pais;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return noExterior;
    case 1: return estado;
    case 2: return codigoPostal;
    case 3: return municipio;
    case 4: return calle;
    case 5: return colonia;
    case 6: return pais;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: noExterior = (java.lang.CharSequence)value$; break;
    case 1: estado = (java.lang.CharSequence)value$; break;
    case 2: codigoPostal = (java.lang.CharSequence)value$; break;
    case 3: municipio = (java.lang.CharSequence)value$; break;
    case 4: calle = (java.lang.CharSequence)value$; break;
    case 5: colonia = (java.lang.CharSequence)value$; break;
    case 6: pais = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'noExterior' field.
   */
  public java.lang.CharSequence getNoExterior() {
    return noExterior;
  }

  /**
   * Sets the value of the 'noExterior' field.
   * @param value the value to set.
   */
  public void setNoExterior(java.lang.CharSequence value) {
    this.noExterior = value;
  }

  /**
   * Gets the value of the 'estado' field.
   */
  public java.lang.CharSequence getEstado() {
    return estado;
  }

  /**
   * Sets the value of the 'estado' field.
   * @param value the value to set.
   */
  public void setEstado(java.lang.CharSequence value) {
    this.estado = value;
  }

  /**
   * Gets the value of the 'codigoPostal' field.
   */
  public java.lang.CharSequence getCodigoPostal() {
    return codigoPostal;
  }

  /**
   * Sets the value of the 'codigoPostal' field.
   * @param value the value to set.
   */
  public void setCodigoPostal(java.lang.CharSequence value) {
    this.codigoPostal = value;
  }

  /**
   * Gets the value of the 'municipio' field.
   */
  public java.lang.CharSequence getMunicipio() {
    return municipio;
  }

  /**
   * Sets the value of the 'municipio' field.
   * @param value the value to set.
   */
  public void setMunicipio(java.lang.CharSequence value) {
    this.municipio = value;
  }

  /**
   * Gets the value of the 'calle' field.
   */
  public java.lang.CharSequence getCalle() {
    return calle;
  }

  /**
   * Sets the value of the 'calle' field.
   * @param value the value to set.
   */
  public void setCalle(java.lang.CharSequence value) {
    this.calle = value;
  }

  /**
   * Gets the value of the 'colonia' field.
   */
  public java.lang.CharSequence getColonia() {
    return colonia;
  }

  /**
   * Sets the value of the 'colonia' field.
   * @param value the value to set.
   */
  public void setColonia(java.lang.CharSequence value) {
    this.colonia = value;
  }

  /**
   * Gets the value of the 'pais' field.
   */
  public java.lang.CharSequence getPais() {
    return pais;
  }

  /**
   * Sets the value of the 'pais' field.
   * @param value the value to set.
   */
  public void setPais(java.lang.CharSequence value) {
    this.pais = value;
  }

  /** Creates a new comprobante RecordBuilder */
  public static expedidoEn.emisor.comprobante.Builder newBuilder() {
    return new expedidoEn.emisor.comprobante.Builder();
  }
  
  /** Creates a new comprobante RecordBuilder by copying an existing Builder */
  public static expedidoEn.emisor.comprobante.Builder newBuilder(expedidoEn.emisor.comprobante.Builder other) {
    return new expedidoEn.emisor.comprobante.Builder(other);
  }
  
  /** Creates a new comprobante RecordBuilder by copying an existing comprobante instance */
  public static expedidoEn.emisor.comprobante.Builder newBuilder(expedidoEn.emisor.comprobante other) {
    return new expedidoEn.emisor.comprobante.Builder(other);
  }
  
  /**
   * RecordBuilder for comprobante instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<comprobante>
    implements org.apache.avro.data.RecordBuilder<comprobante> {

    private java.lang.CharSequence noExterior;
    private java.lang.CharSequence estado;
    private java.lang.CharSequence codigoPostal;
    private java.lang.CharSequence municipio;
    private java.lang.CharSequence calle;
    private java.lang.CharSequence colonia;
    private java.lang.CharSequence pais;

    /** Creates a new Builder */
    private Builder() {
      super(expedidoEn.emisor.comprobante.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(expedidoEn.emisor.comprobante.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.noExterior)) {
        this.noExterior = data().deepCopy(fields()[0].schema(), other.noExterior);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.estado)) {
        this.estado = data().deepCopy(fields()[1].schema(), other.estado);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.codigoPostal)) {
        this.codigoPostal = data().deepCopy(fields()[2].schema(), other.codigoPostal);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.municipio)) {
        this.municipio = data().deepCopy(fields()[3].schema(), other.municipio);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.calle)) {
        this.calle = data().deepCopy(fields()[4].schema(), other.calle);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.colonia)) {
        this.colonia = data().deepCopy(fields()[5].schema(), other.colonia);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.pais)) {
        this.pais = data().deepCopy(fields()[6].schema(), other.pais);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing comprobante instance */
    private Builder(expedidoEn.emisor.comprobante other) {
            super(expedidoEn.emisor.comprobante.SCHEMA$);
      if (isValidValue(fields()[0], other.noExterior)) {
        this.noExterior = data().deepCopy(fields()[0].schema(), other.noExterior);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.estado)) {
        this.estado = data().deepCopy(fields()[1].schema(), other.estado);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.codigoPostal)) {
        this.codigoPostal = data().deepCopy(fields()[2].schema(), other.codigoPostal);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.municipio)) {
        this.municipio = data().deepCopy(fields()[3].schema(), other.municipio);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.calle)) {
        this.calle = data().deepCopy(fields()[4].schema(), other.calle);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.colonia)) {
        this.colonia = data().deepCopy(fields()[5].schema(), other.colonia);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.pais)) {
        this.pais = data().deepCopy(fields()[6].schema(), other.pais);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'noExterior' field */
    public java.lang.CharSequence getNoExterior() {
      return noExterior;
    }
    
    /** Sets the value of the 'noExterior' field */
    public expedidoEn.emisor.comprobante.Builder setNoExterior(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.noExterior = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'noExterior' field has been set */
    public boolean hasNoExterior() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'noExterior' field */
    public expedidoEn.emisor.comprobante.Builder clearNoExterior() {
      noExterior = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'estado' field */
    public java.lang.CharSequence getEstado() {
      return estado;
    }
    
    /** Sets the value of the 'estado' field */
    public expedidoEn.emisor.comprobante.Builder setEstado(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.estado = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'estado' field has been set */
    public boolean hasEstado() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'estado' field */
    public expedidoEn.emisor.comprobante.Builder clearEstado() {
      estado = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'codigoPostal' field */
    public java.lang.CharSequence getCodigoPostal() {
      return codigoPostal;
    }
    
    /** Sets the value of the 'codigoPostal' field */
    public expedidoEn.emisor.comprobante.Builder setCodigoPostal(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.codigoPostal = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'codigoPostal' field has been set */
    public boolean hasCodigoPostal() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'codigoPostal' field */
    public expedidoEn.emisor.comprobante.Builder clearCodigoPostal() {
      codigoPostal = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'municipio' field */
    public java.lang.CharSequence getMunicipio() {
      return municipio;
    }
    
    /** Sets the value of the 'municipio' field */
    public expedidoEn.emisor.comprobante.Builder setMunicipio(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.municipio = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'municipio' field has been set */
    public boolean hasMunicipio() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'municipio' field */
    public expedidoEn.emisor.comprobante.Builder clearMunicipio() {
      municipio = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'calle' field */
    public java.lang.CharSequence getCalle() {
      return calle;
    }
    
    /** Sets the value of the 'calle' field */
    public expedidoEn.emisor.comprobante.Builder setCalle(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.calle = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'calle' field has been set */
    public boolean hasCalle() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'calle' field */
    public expedidoEn.emisor.comprobante.Builder clearCalle() {
      calle = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'colonia' field */
    public java.lang.CharSequence getColonia() {
      return colonia;
    }
    
    /** Sets the value of the 'colonia' field */
    public expedidoEn.emisor.comprobante.Builder setColonia(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.colonia = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'colonia' field has been set */
    public boolean hasColonia() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'colonia' field */
    public expedidoEn.emisor.comprobante.Builder clearColonia() {
      colonia = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'pais' field */
    public java.lang.CharSequence getPais() {
      return pais;
    }
    
    /** Sets the value of the 'pais' field */
    public expedidoEn.emisor.comprobante.Builder setPais(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.pais = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'pais' field has been set */
    public boolean hasPais() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'pais' field */
    public expedidoEn.emisor.comprobante.Builder clearPais() {
      pais = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public comprobante build() {
      try {
        comprobante record = new comprobante();
        record.noExterior = fieldSetFlags()[0] ? this.noExterior : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.estado = fieldSetFlags()[1] ? this.estado : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.codigoPostal = fieldSetFlags()[2] ? this.codigoPostal : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.municipio = fieldSetFlags()[3] ? this.municipio : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.calle = fieldSetFlags()[4] ? this.calle : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.colonia = fieldSetFlags()[5] ? this.colonia : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.pais = fieldSetFlags()[6] ? this.pais : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
