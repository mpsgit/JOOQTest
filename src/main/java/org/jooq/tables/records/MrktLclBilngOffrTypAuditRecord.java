/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.MrktLclBilngOffrTypAudit;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MrktLclBilngOffrTypAuditRecord extends TableRecordImpl<MrktLclBilngOffrTypAuditRecord> implements Record9<BigDecimal, String, String, String, Byte, String, Date, String, Date> {

	private static final long serialVersionUID = -475291336;

	/**
	 * Setter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LCL_BILNG_OFFR_TYP</code>.
	 */
	public void setLclBilngOffrTyp(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LCL_BILNG_OFFR_TYP</code>.
	 */
	public String getLclBilngOffrTyp() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LCL_BILNG_OFFR_TYP_SDESC_TXT</code>.
	 */
	public void setLclBilngOffrTypSdescTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LCL_BILNG_OFFR_TYP_SDESC_TXT</code>.
	 */
	public String getLclBilngOffrTypSdescTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LCL_BILNG_OFFR_TYP_DESC_TXT</code>.
	 */
	public void setLclBilngOffrTypDescTxt(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LCL_BILNG_OFFR_TYP_DESC_TXT</code>.
	 */
	public String getLclBilngOffrTypDescTxt() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.SEQ_NR</code>.
	 */
	public void setSeqNr(Byte value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.SEQ_NR</code>.
	 */
	public Byte getSeqNr() {
		return (Byte) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, String, String, String, Byte, String, Date, String, Date> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, String, String, String, Byte, String, Date, String, Date> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MrktLclBilngOffrTypAudit.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return MrktLclBilngOffrTypAudit.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LCL_BILNG_OFFR_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return MrktLclBilngOffrTypAudit.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LCL_BILNG_OFFR_TYP_SDESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return MrktLclBilngOffrTypAudit.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LCL_BILNG_OFFR_TYP_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field5() {
		return MrktLclBilngOffrTypAudit.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.SEQ_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return MrktLclBilngOffrTypAudit.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return MrktLclBilngOffrTypAudit.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return MrktLclBilngOffrTypAudit.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field9() {
		return MrktLclBilngOffrTypAudit.MRKT_LCL_BILNG_OFFR_TYP_AUDIT.LAST_UPDT_TS;
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
	public String value2() {
		return getLclBilngOffrTyp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getLclBilngOffrTypSdescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getLclBilngOffrTypDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value5() {
		return getSeqNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value7() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value9() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktLclBilngOffrTypAuditRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktLclBilngOffrTypAuditRecord value2(String value) {
		setLclBilngOffrTyp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktLclBilngOffrTypAuditRecord value3(String value) {
		setLclBilngOffrTypSdescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktLclBilngOffrTypAuditRecord value4(String value) {
		setLclBilngOffrTypDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktLclBilngOffrTypAuditRecord value5(Byte value) {
		setSeqNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktLclBilngOffrTypAuditRecord value6(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktLclBilngOffrTypAuditRecord value7(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktLclBilngOffrTypAuditRecord value8(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktLclBilngOffrTypAuditRecord value9(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktLclBilngOffrTypAuditRecord values(BigDecimal value1, String value2, String value3, String value4, Byte value5, String value6, Date value7, String value8, Date value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MrktLclBilngOffrTypAuditRecord
	 */
	public MrktLclBilngOffrTypAuditRecord() {
		super(MrktLclBilngOffrTypAudit.MRKT_LCL_BILNG_OFFR_TYP_AUDIT);
	}

	/**
	 * Create a detached, initialised MrktLclBilngOffrTypAuditRecord
	 */
	public MrktLclBilngOffrTypAuditRecord(BigDecimal mrktId, String lclBilngOffrTyp, String lclBilngOffrTypSdescTxt, String lclBilngOffrTypDescTxt, Byte seqNr, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(MrktLclBilngOffrTypAudit.MRKT_LCL_BILNG_OFFR_TYP_AUDIT);

		setValue(0, mrktId);
		setValue(1, lclBilngOffrTyp);
		setValue(2, lclBilngOffrTypSdescTxt);
		setValue(3, lclBilngOffrTypDescTxt);
		setValue(4, seqNr);
		setValue(5, creatUserId);
		setValue(6, creatTs);
		setValue(7, lastUpdtUserId);
		setValue(8, lastUpdtTs);
	}
}