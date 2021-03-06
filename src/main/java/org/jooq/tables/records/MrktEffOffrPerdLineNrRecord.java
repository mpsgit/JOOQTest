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
import org.jooq.tables.MrktEffOffrPerdLineNr;


/**
 * Market effective offer period line number.  Stores the values used for 
 * line number length and check digit calculation.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MrktEffOffrPerdLineNrRecord extends UpdatableRecordImpl<MrktEffOffrPerdLineNrRecord> implements Record8<BigDecimal, BigDecimal, Byte, String, String, Date, String, Date> {

	private static final long serialVersionUID = 1578957115;

	/**
	 * Setter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.EFF_OFFR_PERD_ID</code>. Effective offer period id.  The effective period that the attributes start from.
	 */
	public void setEffOffrPerdId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.EFF_OFFR_PERD_ID</code>. Effective offer period id.  The effective period that the attributes start from.
	 */
	public BigDecimal getEffOffrPerdId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.MIN_LINE_NR_LEN_NR</code>. Minimum line_nr length number.  The minimum length for a displayed line_nr.  The line_nr is left padded with zero if required.
	 */
	public void setMinLineNrLenNr(Byte value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.MIN_LINE_NR_LEN_NR</code>. Minimum line_nr length number.  The minimum length for a displayed line_nr.  The line_nr is left padded with zero if required.
	 */
	public Byte getMinLineNrLenNr() {
		return (Byte) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.CHK_DIGT_CALCLTN_CD</code>. Check digit calculation code.  Identifier for the pa_maps_public.linedigit_calc() check digit algorithm.  Markets without a check digit use code '0'.
	 */
	public void setChkDigtCalcltnCd(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.CHK_DIGT_CALCLTN_CD</code>. Check digit calculation code.  Identifier for the pa_maps_public.linedigit_calc() check digit algorithm.  Markets without a check digit use code '0'.
	 */
	public String getChkDigtCalcltnCd() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public void setCreatUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public String getCreatUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.CREAT_TS</code>. The date and time the row was created.
	 */
	public void setCreatTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.CREAT_TS</code>. The date and time the row was created.
	 */
	public Date getCreatTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_EFF_OFFR_PERD_LINE_NR.LAST_UPDT_TS</code>. The date and time the row was last updated.
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
	public Row8<BigDecimal, BigDecimal, Byte, String, String, Date, String, Date> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, BigDecimal, Byte, String, String, Date, String, Date> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MrktEffOffrPerdLineNr.MRKT_EFF_OFFR_PERD_LINE_NR.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MrktEffOffrPerdLineNr.MRKT_EFF_OFFR_PERD_LINE_NR.EFF_OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field3() {
		return MrktEffOffrPerdLineNr.MRKT_EFF_OFFR_PERD_LINE_NR.MIN_LINE_NR_LEN_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return MrktEffOffrPerdLineNr.MRKT_EFF_OFFR_PERD_LINE_NR.CHK_DIGT_CALCLTN_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return MrktEffOffrPerdLineNr.MRKT_EFF_OFFR_PERD_LINE_NR.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return MrktEffOffrPerdLineNr.MRKT_EFF_OFFR_PERD_LINE_NR.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return MrktEffOffrPerdLineNr.MRKT_EFF_OFFR_PERD_LINE_NR.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return MrktEffOffrPerdLineNr.MRKT_EFF_OFFR_PERD_LINE_NR.LAST_UPDT_TS;
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
		return getEffOffrPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value3() {
		return getMinLineNrLenNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getChkDigtCalcltnCd();
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
	public MrktEffOffrPerdLineNrRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktEffOffrPerdLineNrRecord value2(BigDecimal value) {
		setEffOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktEffOffrPerdLineNrRecord value3(Byte value) {
		setMinLineNrLenNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktEffOffrPerdLineNrRecord value4(String value) {
		setChkDigtCalcltnCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktEffOffrPerdLineNrRecord value5(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktEffOffrPerdLineNrRecord value6(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktEffOffrPerdLineNrRecord value7(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktEffOffrPerdLineNrRecord value8(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktEffOffrPerdLineNrRecord values(BigDecimal value1, BigDecimal value2, Byte value3, String value4, String value5, Date value6, String value7, Date value8) {
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
	 * Create a detached MrktEffOffrPerdLineNrRecord
	 */
	public MrktEffOffrPerdLineNrRecord() {
		super(MrktEffOffrPerdLineNr.MRKT_EFF_OFFR_PERD_LINE_NR);
	}

	/**
	 * Create a detached, initialised MrktEffOffrPerdLineNrRecord
	 */
	public MrktEffOffrPerdLineNrRecord(BigDecimal mrktId, BigDecimal effOffrPerdId, Byte minLineNrLenNr, String chkDigtCalcltnCd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(MrktEffOffrPerdLineNr.MRKT_EFF_OFFR_PERD_LINE_NR);

		setValue(0, mrktId);
		setValue(1, effOffrPerdId);
		setValue(2, minLineNrLenNr);
		setValue(3, chkDigtCalcltnCd);
		setValue(4, creatUserId);
		setValue(5, creatTs);
		setValue(6, lastUpdtUserId);
		setValue(7, lastUpdtTs);
	}
}
