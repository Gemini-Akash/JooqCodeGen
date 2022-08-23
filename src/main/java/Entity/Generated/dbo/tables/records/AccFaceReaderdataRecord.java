/*
 * This file is generated by jOOQ.
 */
package Entity.Generated.dbo.tables.records;


import Entity.Generated.dbo.tables.AccFaceReaderdata;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(
    name = "ACC_FACE_READERDATA",
    schema = "DBO"
)
public class AccFaceReaderdataRecord extends TableRecordImpl<AccFaceReaderdataRecord> implements Record8<String, LocalDateTime, String, String, String, Double, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DBO.ACC_FACE_READERDATA.READER</code>.
     */
    public void setReader(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>DBO.ACC_FACE_READERDATA.READER</code>.
     */
    @Column(name = "READER", length = 2)
    @Size(max = 2)
    public String getReader() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DBO.ACC_FACE_READERDATA.DT</code>.
     */
    public void setDt(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>DBO.ACC_FACE_READERDATA.DT</code>.
     */
    @Column(name = "DT", precision = 6)
    public LocalDateTime getDt() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>DBO.ACC_FACE_READERDATA.CARDID</code>.
     */
    public void setCardid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>DBO.ACC_FACE_READERDATA.CARDID</code>.
     */
    @Column(name = "CARDID", length = 8)
    @Size(max = 8)
    public String getCardid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DBO.ACC_FACE_READERDATA.REASON</code>.
     */
    public void setReason(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>DBO.ACC_FACE_READERDATA.REASON</code>.
     */
    @Column(name = "REASON", length = 2)
    @Size(max = 2)
    public String getReason() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DBO.ACC_FACE_READERDATA.NEWCARDID</code>.
     */
    public void setNewcardid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>DBO.ACC_FACE_READERDATA.NEWCARDID</code>.
     */
    @Column(name = "NEWCARDID", length = 10)
    @Size(max = 10)
    public String getNewcardid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DBO.ACC_FACE_READERDATA.TEMPERATURE</code>.
     */
    public void setTemperature(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>DBO.ACC_FACE_READERDATA.TEMPERATURE</code>.
     */
    @Column(name = "TEMPERATURE", precision = 17)
    public Double getTemperature() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>DBO.ACC_FACE_READERDATA.ID</code>.
     */
    public void setId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>DBO.ACC_FACE_READERDATA.ID</code>.
     */
    @Column(name = "ID", nullable = false, precision = 10)
    @NotNull
    public Integer getId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>DBO.ACC_FACE_READERDATA.DEVICELOGID</code>.
     */
    public void setDevicelogid(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>DBO.ACC_FACE_READERDATA.DEVICELOGID</code>.
     */
    @Column(name = "DEVICELOGID", nullable = false, precision = 10)
    public Integer getDevicelogid() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, LocalDateTime, String, String, String, Double, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, LocalDateTime, String, String, String, Double, Integer, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return AccFaceReaderdata.ACC_FACE_READERDATA.READER;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return AccFaceReaderdata.ACC_FACE_READERDATA.DT;
    }

    @Override
    public Field<String> field3() {
        return AccFaceReaderdata.ACC_FACE_READERDATA.CARDID;
    }

    @Override
    public Field<String> field4() {
        return AccFaceReaderdata.ACC_FACE_READERDATA.REASON;
    }

    @Override
    public Field<String> field5() {
        return AccFaceReaderdata.ACC_FACE_READERDATA.NEWCARDID;
    }

    @Override
    public Field<Double> field6() {
        return AccFaceReaderdata.ACC_FACE_READERDATA.TEMPERATURE;
    }

    @Override
    public Field<Integer> field7() {
        return AccFaceReaderdata.ACC_FACE_READERDATA.ID;
    }

    @Override
    public Field<Integer> field8() {
        return AccFaceReaderdata.ACC_FACE_READERDATA.DEVICELOGID;
    }

    @Override
    public String component1() {
        return getReader();
    }

    @Override
    public LocalDateTime component2() {
        return getDt();
    }

    @Override
    public String component3() {
        return getCardid();
    }

    @Override
    public String component4() {
        return getReason();
    }

    @Override
    public String component5() {
        return getNewcardid();
    }

    @Override
    public Double component6() {
        return getTemperature();
    }

    @Override
    public Integer component7() {
        return getId();
    }

    @Override
    public Integer component8() {
        return getDevicelogid();
    }

    @Override
    public String value1() {
        return getReader();
    }

    @Override
    public LocalDateTime value2() {
        return getDt();
    }

    @Override
    public String value3() {
        return getCardid();
    }

    @Override
    public String value4() {
        return getReason();
    }

    @Override
    public String value5() {
        return getNewcardid();
    }

    @Override
    public Double value6() {
        return getTemperature();
    }

    @Override
    public Integer value7() {
        return getId();
    }

    @Override
    public Integer value8() {
        return getDevicelogid();
    }

    @Override
    public AccFaceReaderdataRecord value1(String value) {
        setReader(value);
        return this;
    }

    @Override
    public AccFaceReaderdataRecord value2(LocalDateTime value) {
        setDt(value);
        return this;
    }

    @Override
    public AccFaceReaderdataRecord value3(String value) {
        setCardid(value);
        return this;
    }

    @Override
    public AccFaceReaderdataRecord value4(String value) {
        setReason(value);
        return this;
    }

    @Override
    public AccFaceReaderdataRecord value5(String value) {
        setNewcardid(value);
        return this;
    }

    @Override
    public AccFaceReaderdataRecord value6(Double value) {
        setTemperature(value);
        return this;
    }

    @Override
    public AccFaceReaderdataRecord value7(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AccFaceReaderdataRecord value8(Integer value) {
        setDevicelogid(value);
        return this;
    }

    @Override
    public AccFaceReaderdataRecord values(String value1, LocalDateTime value2, String value3, String value4, String value5, Double value6, Integer value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccFaceReaderdataRecord
     */
    public AccFaceReaderdataRecord() {
        super(AccFaceReaderdata.ACC_FACE_READERDATA);
    }

    /**
     * Create a detached, initialised AccFaceReaderdataRecord
     */
    @ConstructorProperties({ "READER", "DT", "CARDID", "REASON", "NEWCARDID", "TEMPERATURE", "ID", "DEVICELOGID" })
    public AccFaceReaderdataRecord(String READER, LocalDateTime DT, String CARDID, String REASON, String NEWCARDID, Double TEMPERATURE, Integer ID, Integer DEVICELOGID) {
        super(AccFaceReaderdata.ACC_FACE_READERDATA);

        setReader(READER);
        setDt(DT);
        setCardid(CARDID);
        setReason(REASON);
        setNewcardid(NEWCARDID);
        setTemperature(TEMPERATURE);
        setId(ID);
        setDevicelogid(DEVICELOGID);
    }
}