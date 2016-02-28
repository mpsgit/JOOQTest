/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.StdOffrPrflPlcmt;


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
public class StdOffrPrflPlcmtRecord extends UpdatableRecordImpl<StdOffrPrflPlcmtRecord> implements Record9<BigDecimal, Integer, BigDecimal, String, BigDecimal, String, Date, String, Date> {

	private static final long serialVersionUID = -2070287987;

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PLCMT.STD_OFFR_ID</code>.
	 */
	public void setStdOffrId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PLCMT.STD_OFFR_ID</code>.
	 */
	public BigDecimal getStdOffrId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PLCMT.PRFL_CD</code>.
	 */
	public void setPrflCd(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PLCMT.PRFL_CD</code>.
	 */
	public Integer getPrflCd() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PLCMT.PG_OFS_NR</code>.
	 */
	public void setPgOfsNr(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PLCMT.PG_OFS_NR</code>.
	 */
	public BigDecimal getPgOfsNr() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PLCMT.FEATRD_SIDE_CD</code>.
	 */
	public void setFeatrdSideCd(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PLCMT.FEATRD_SIDE_CD</code>.
	 */
	public String getFeatrdSideCd() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PLCMT.PG_WGHT_PCT</code>.
	 */
	public void setPgWghtPct(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PLCMT.PG_WGHT_PCT</code>.
	 */
	public BigDecimal getPgWghtPct() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PLCMT.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PLCMT.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PLCMT.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PLCMT.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PLCMT.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PLCMT.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PLCMT.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PLCMT.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record4<BigDecimal, Integer, BigDecimal, String> key() {
		return (Record4) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, Integer, BigDecimal, String, BigDecimal, String, Date, String, Date> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, Integer, BigDecimal, String, BigDecimal, String, Date, String, Date> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return StdOffrPrflPlcmt.STD_OFFR_PRFL_PLCMT.STD_OFFR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return StdOffrPrflPlcmt.STD_OFFR_PRFL_PLCMT.PRFL_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return StdOffrPrflPlcmt.STD_OFFR_PRFL_PLCMT.PG_OFS_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return StdOffrPrflPlcmt.STD_OFFR_PRFL_PLCMT.FEATRD_SIDE_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return StdOffrPrflPlcmt.STD_OFFR_PRFL_PLCMT.PG_WGHT_PCT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return StdOffrPrflPlcmt.STD_OFFR_PRFL_PLCMT.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return StdOffrPrflPlcmt.STD_OFFR_PRFL_PLCMT.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return StdOffrPrflPlcmt.STD_OFFR_PRFL_PLCMT.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field9() {
		return StdOffrPrflPlcmt.STD_OFFR_PRFL_PLCMT.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getStdOffrId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getPrflCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getPgOfsNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getFeatrdSideCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getPgWghtPct();
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
	public StdOffrPrflPlcmtRecord value1(BigDecimal value) {
		setStdOffrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPlcmtRecord value2(Integer value) {
		setPrflCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPlcmtRecord value3(BigDecimal value) {
		setPgOfsNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPlcmtRecord value4(String value) {
		setFeatrdSideCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPlcmtRecord value5(BigDecimal value) {
		setPgWghtPct(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPlcmtRecord value6(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPlcmtRecord value7(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPlcmtRecord value8(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPlcmtRecord value9(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPlcmtRecord values(BigDecimal value1, Integer value2, BigDecimal value3, String value4, BigDecimal value5, String value6, Date value7, String value8, Date value9) {
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
	 * Create a detached StdOffrPrflPlcmtRecord
	 */
	public StdOffrPrflPlcmtRecord() {
		super(StdOffrPrflPlcmt.STD_OFFR_PRFL_PLCMT);
	}

	/**
	 * Create a detached, initialised StdOffrPrflPlcmtRecord
	 */
	public StdOffrPrflPlcmtRecord(BigDecimal stdOffrId, Integer prflCd, BigDecimal pgOfsNr, String featrdSideCd, BigDecimal pgWghtPct, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(StdOffrPrflPlcmt.STD_OFFR_PRFL_PLCMT);

		setValue(0, stdOffrId);
		setValue(1, prflCd);
		setValue(2, pgOfsNr);
		setValue(3, featrdSideCd);
		setValue(4, pgWghtPct);
		setValue(5, creatUserId);
		setValue(6, creatTs);
		setValue(7, lastUpdtUserId);
		setValue(8, lastUpdtTs);
	}
}
