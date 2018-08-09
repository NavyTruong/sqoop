// ORM class for table 'EMPLOYEES'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Aug 09 14:41:14 CEST 2018
// For connector: org.apache.sqoop.manager.oracle.OraOopConnManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class EMPLOYEES extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMPLOYEES.this.ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMPLOYEES.this.NAME = (String)value;
      }
    });
    setters.put("START_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMPLOYEES.this.START_DATE = (String)value;
      }
    });
    setters.put("SALARY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMPLOYEES.this.SALARY = (java.math.BigDecimal)value;
      }
    });
    setters.put("DEPT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMPLOYEES.this.DEPT = (String)value;
      }
    });
    setters.put("TIMESTAMP_TZ", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMPLOYEES.this.TIMESTAMP_TZ = (String)value;
      }
    });
    setters.put("TIMESTAMP_LTZ", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EMPLOYEES.this.TIMESTAMP_LTZ = (String)value;
      }
    });
  }
  public EMPLOYEES() {
    init0();
  }
  private java.math.BigDecimal ID;
  public java.math.BigDecimal get_ID() {
    return ID;
  }
  public void set_ID(java.math.BigDecimal ID) {
    this.ID = ID;
  }
  public EMPLOYEES with_ID(java.math.BigDecimal ID) {
    this.ID = ID;
    return this;
  }
  private String NAME;
  public String get_NAME() {
    return NAME;
  }
  public void set_NAME(String NAME) {
    this.NAME = NAME;
  }
  public EMPLOYEES with_NAME(String NAME) {
    this.NAME = NAME;
    return this;
  }
  private String START_DATE;
  public String get_START_DATE() {
    return START_DATE;
  }
  public void set_START_DATE(String START_DATE) {
    this.START_DATE = START_DATE;
  }
  public EMPLOYEES with_START_DATE(String START_DATE) {
    this.START_DATE = START_DATE;
    return this;
  }
  private java.math.BigDecimal SALARY;
  public java.math.BigDecimal get_SALARY() {
    return SALARY;
  }
  public void set_SALARY(java.math.BigDecimal SALARY) {
    this.SALARY = SALARY;
  }
  public EMPLOYEES with_SALARY(java.math.BigDecimal SALARY) {
    this.SALARY = SALARY;
    return this;
  }
  private String DEPT;
  public String get_DEPT() {
    return DEPT;
  }
  public void set_DEPT(String DEPT) {
    this.DEPT = DEPT;
  }
  public EMPLOYEES with_DEPT(String DEPT) {
    this.DEPT = DEPT;
    return this;
  }
  private String TIMESTAMP_TZ;
  public String get_TIMESTAMP_TZ() {
    return TIMESTAMP_TZ;
  }
  public void set_TIMESTAMP_TZ(String TIMESTAMP_TZ) {
    this.TIMESTAMP_TZ = TIMESTAMP_TZ;
  }
  public EMPLOYEES with_TIMESTAMP_TZ(String TIMESTAMP_TZ) {
    this.TIMESTAMP_TZ = TIMESTAMP_TZ;
    return this;
  }
  private String TIMESTAMP_LTZ;
  public String get_TIMESTAMP_LTZ() {
    return TIMESTAMP_LTZ;
  }
  public void set_TIMESTAMP_LTZ(String TIMESTAMP_LTZ) {
    this.TIMESTAMP_LTZ = TIMESTAMP_LTZ;
  }
  public EMPLOYEES with_TIMESTAMP_LTZ(String TIMESTAMP_LTZ) {
    this.TIMESTAMP_LTZ = TIMESTAMP_LTZ;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof EMPLOYEES)) {
      return false;
    }
    EMPLOYEES that = (EMPLOYEES) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.NAME == null ? that.NAME == null : this.NAME.equals(that.NAME));
    equal = equal && (this.START_DATE == null ? that.START_DATE == null : this.START_DATE.equals(that.START_DATE));
    equal = equal && (this.SALARY == null ? that.SALARY == null : this.SALARY.equals(that.SALARY));
    equal = equal && (this.DEPT == null ? that.DEPT == null : this.DEPT.equals(that.DEPT));
    equal = equal && (this.TIMESTAMP_TZ == null ? that.TIMESTAMP_TZ == null : this.TIMESTAMP_TZ.equals(that.TIMESTAMP_TZ));
    equal = equal && (this.TIMESTAMP_LTZ == null ? that.TIMESTAMP_LTZ == null : this.TIMESTAMP_LTZ.equals(that.TIMESTAMP_LTZ));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof EMPLOYEES)) {
      return false;
    }
    EMPLOYEES that = (EMPLOYEES) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.NAME == null ? that.NAME == null : this.NAME.equals(that.NAME));
    equal = equal && (this.START_DATE == null ? that.START_DATE == null : this.START_DATE.equals(that.START_DATE));
    equal = equal && (this.SALARY == null ? that.SALARY == null : this.SALARY.equals(that.SALARY));
    equal = equal && (this.DEPT == null ? that.DEPT == null : this.DEPT.equals(that.DEPT));
    equal = equal && (this.TIMESTAMP_TZ == null ? that.TIMESTAMP_TZ == null : this.TIMESTAMP_TZ.equals(that.TIMESTAMP_TZ));
    equal = equal && (this.TIMESTAMP_LTZ == null ? that.TIMESTAMP_LTZ == null : this.TIMESTAMP_LTZ.equals(that.TIMESTAMP_LTZ));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.START_DATE = JdbcWritableBridge.readString(3, __dbResults);
    this.SALARY = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.DEPT = JdbcWritableBridge.readString(5, __dbResults);
    this.TIMESTAMP_TZ = JdbcWritableBridge.readString(6, __dbResults);
    this.TIMESTAMP_LTZ = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.START_DATE = JdbcWritableBridge.readString(3, __dbResults);
    this.SALARY = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.DEPT = JdbcWritableBridge.readString(5, __dbResults);
    this.TIMESTAMP_TZ = JdbcWritableBridge.readString(6, __dbResults);
    this.TIMESTAMP_LTZ = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(START_DATE, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SALARY, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(DEPT, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TIMESTAMP_TZ, 6 + __off, -101, __dbStmt);
    JdbcWritableBridge.writeString(TIMESTAMP_LTZ, 7 + __off, -102, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(START_DATE, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SALARY, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(DEPT, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TIMESTAMP_TZ, 6 + __off, -101, __dbStmt);
    JdbcWritableBridge.writeString(TIMESTAMP_LTZ, 7 + __off, -102, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ID = null;
    } else {
    this.ID = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NAME = null;
    } else {
    this.NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.START_DATE = null;
    } else {
    this.START_DATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SALARY = null;
    } else {
    this.SALARY = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DEPT = null;
    } else {
    this.DEPT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TIMESTAMP_TZ = null;
    } else {
    this.TIMESTAMP_TZ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TIMESTAMP_LTZ = null;
    } else {
    this.TIMESTAMP_LTZ = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.ID, __dataOut);
    }
    if (null == this.NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NAME);
    }
    if (null == this.START_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, START_DATE);
    }
    if (null == this.SALARY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.SALARY, __dataOut);
    }
    if (null == this.DEPT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DEPT);
    }
    if (null == this.TIMESTAMP_TZ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TIMESTAMP_TZ);
    }
    if (null == this.TIMESTAMP_LTZ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TIMESTAMP_LTZ);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.ID, __dataOut);
    }
    if (null == this.NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NAME);
    }
    if (null == this.START_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, START_DATE);
    }
    if (null == this.SALARY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.SALARY, __dataOut);
    }
    if (null == this.DEPT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DEPT);
    }
    if (null == this.TIMESTAMP_TZ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TIMESTAMP_TZ);
    }
    if (null == this.TIMESTAMP_LTZ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TIMESTAMP_LTZ);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NAME==null?"null":NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(START_DATE==null?"null":START_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SALARY==null?"null":SALARY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEPT==null?"null":DEPT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TIMESTAMP_TZ==null?"null":TIMESTAMP_TZ, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TIMESTAMP_LTZ==null?"null":TIMESTAMP_LTZ, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NAME==null?"null":NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(START_DATE==null?"null":START_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SALARY==null?"null":SALARY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEPT==null?"null":DEPT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TIMESTAMP_TZ==null?"null":TIMESTAMP_TZ, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TIMESTAMP_LTZ==null?"null":TIMESTAMP_LTZ, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.NAME = null; } else {
      this.NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.START_DATE = null; } else {
      this.START_DATE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SALARY = null; } else {
      this.SALARY = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.DEPT = null; } else {
      this.DEPT = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.TIMESTAMP_TZ = null; } else {
      this.TIMESTAMP_TZ = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.TIMESTAMP_LTZ = null; } else {
      this.TIMESTAMP_LTZ = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.NAME = null; } else {
      this.NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.START_DATE = null; } else {
      this.START_DATE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SALARY = null; } else {
      this.SALARY = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.DEPT = null; } else {
      this.DEPT = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.TIMESTAMP_TZ = null; } else {
      this.TIMESTAMP_TZ = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.TIMESTAMP_LTZ = null; } else {
      this.TIMESTAMP_LTZ = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    EMPLOYEES o = (EMPLOYEES) super.clone();
    return o;
  }

  public void clone0(EMPLOYEES o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("NAME", this.NAME);
    __sqoop$field_map.put("START_DATE", this.START_DATE);
    __sqoop$field_map.put("SALARY", this.SALARY);
    __sqoop$field_map.put("DEPT", this.DEPT);
    __sqoop$field_map.put("TIMESTAMP_TZ", this.TIMESTAMP_TZ);
    __sqoop$field_map.put("TIMESTAMP_LTZ", this.TIMESTAMP_LTZ);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("NAME", this.NAME);
    __sqoop$field_map.put("START_DATE", this.START_DATE);
    __sqoop$field_map.put("SALARY", this.SALARY);
    __sqoop$field_map.put("DEPT", this.DEPT);
    __sqoop$field_map.put("TIMESTAMP_TZ", this.TIMESTAMP_TZ);
    __sqoop$field_map.put("TIMESTAMP_LTZ", this.TIMESTAMP_LTZ);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
