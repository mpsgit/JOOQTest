/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.ImgImprtDataPostn;


/**
 * Used by the MAPS application to identify part of the Image Filename as 
 * a data item.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ImgImprtDataPostnRecord extends UpdatableRecordImpl<ImgImprtDataPostnRecord> implements Record8<BigDecimal, BigDecimal, Byte, Byte, String, Date, String, Date> {

	private static final long serialVersionUID = 1731751385;

	/**
	 * Setter for <code>WETRN.IMG_IMPRT_DATA_POSTN.MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.IMG_IMPRT_DATA_POSTN.MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.IMG_IMPRT_DATA_POSTN.IMG_DATA_TYP_ID</code>. ID that identifies the type of Data to be used
	 */
	public void setImgDataTypId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.IMG_IMPRT_DATA_POSTN.IMG_DATA_TYP_ID</code>. ID that identifies the type of Data to be used
	 */
	public BigDecimal getImgDataTypId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.IMG_IMPRT_DATA_POSTN.STRT_POSTN_NR</code>. Start Position of Data to be used
	 */
	public void setStrtPostnNr(Byte value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.IMG_IMPRT_DATA_POSTN.STRT_POSTN_NR</code>. Start Position of Data to be used
	 */
	public Byte getStrtPostnNr() {
		return (Byte) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.IMG_IMPRT_DATA_POSTN.DATA_LNGTH_NR</code>. Length of Data to be used
	 */
	public void setDataLngthNr(Byte value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.IMG_IMPRT_DATA_POSTN.DATA_LNGTH_NR</code>. Length of Data to be used
	 */
	public Byte getDataLngthNr() {
		return (Byte) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.IMG_IMPRT_DATA_POSTN.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public void setCreatUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.IMG_IMPRT_DATA_POSTN.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public String getCreatUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.IMG_IMPRT_DATA_POSTN.CREAT_TS</code>. The date and time the row was created.
	 */
	public void setCreatTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.IMG_IMPRT_DATA_POSTN.CREAT_TS</code>. The date and time the row was created.
	 */
	public Date getCreatTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.IMG_IMPRT_DATA_POSTN.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.IMG_IMPRT_DATA_POSTN.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.IMG_IMPRT_DATA_POSTN.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.IMG_IMPRT_DATA_POSTN.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<BigDecimal, BigDecimal> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, BigDecimal, Byte, Byte, String, Date, String, Date> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, BigDecimal, Byte, Byte, String, Date, String, Date> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return ImgImprtDataPostn.IMG_IMPRT_DATA_POSTN.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return ImgImprtDataPostn.IMG_IMPRT_DATA_POSTN.IMG_DATA_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field3() {
		return ImgImprtDataPostn.IMG_IMPRT_DATA_POSTN.STRT_POSTN_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field4() {
		return ImgImprtDataPostn.IMG_IMPRT_DATA_POSTN.DATA_LNGTH_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return ImgImprtDataPostn.IMG_IMPRT_DATA_POSTN.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return ImgImprtDataPostn.IMG_IMPRT_DATA_POSTN.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return ImgImprtDataPostn.IMG_IMPRT_DATA_POSTN.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return ImgImprtDataPostn.IMG_IMPRT_DATA_POSTN.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getImgDataTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value3() {
		return getStrtPostnNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value4() {
		return getDataLngthNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value6() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value8() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgImprtDataPostnRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgImprtDataPostnRecord value2(BigDecimal value) {
		setImgDataTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgImprtDataPostnRecord value3(Byte value) {
		setStrtPostnNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgImprtDataPostnRecord value4(Byte value) {
		setDataLngthNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgImprtDataPostnRecord value5(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgImprtDataPostnRecord value6(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgImprtDataPostnRecord value7(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgImprtDataPostnRecord value8(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgImprtDataPostnRecord values(BigDecimal value1, BigDecimal value2, Byte value3, Byte value4, String value5, Date value6, String value7, Date value8) {
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
	 * Create a detached ImgImprtDataPostnRecord
	 */
	public ImgImprtDataPostnRecord() {
		super(ImgImprtDataPostn.IMG_IMPRT_DATA_POSTN);
	}

	/**
	 * Create a detached, initialised ImgImprtDataPostnRecord
	 */
	public ImgImprtDataPostnRecord(BigDecimal mrktId, BigDecimal imgDataTypId, Byte strtPostnNr, Byte dataLngthNr, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(ImgImprtDataPostn.IMG_IMPRT_DATA_POSTN);

		setValue(0, mrktId);
		setValue(1, imgDataTypId);
		setValue(2, strtPostnNr);
		setValue(3, dataLngthNr);
		setValue(4, creatUserId);
		setValue(5, creatTs);
		setValue(6, lastUpdtUserId);
		setValue(7, lastUpdtTs);
	}
}