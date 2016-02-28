/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Record2;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.MrktPrfl;


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
public class MrktPrflRecord extends UpdatableRecordImpl<MrktPrflRecord> implements Record14<BigDecimal, Integer, BigDecimal, String, String, Date, String, Date, String, String, String, BigDecimal, BigDecimal, BigDecimal> {

	private static final long serialVersionUID = -400673469;

	/**
	 * Setter for <code>WETRN.MRKT_PRFL.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PRFL.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PRFL.PRFL_CD</code>.
	 */
	public void setPrflCd(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PRFL.PRFL_CD</code>.
	 */
	public Integer getPrflCd() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PRFL.PROD_TYP_ID</code>.
	 */
	public void setProdTypId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PRFL.PROD_TYP_ID</code>.
	 */
	public BigDecimal getProdTypId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PRFL.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PRFL.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PRFL.DLTD_IND</code>.
	 */
	public void setDltdInd(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PRFL.DLTD_IND</code>.
	 */
	public String getDltdInd() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PRFL.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PRFL.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PRFL.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PRFL.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PRFL.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PRFL.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PRFL.LCL_PRFL_NM</code>.
	 */
	public void setLclPrflNm(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PRFL.LCL_PRFL_NM</code>.
	 */
	public String getLclPrflNm() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PRFL.CHRTY_IND</code>.
	 */
	public void setChrtyInd(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PRFL.CHRTY_IND</code>.
	 */
	public String getChrtyInd() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PRFL.COST_APRVD_IND</code>.
	 */
	public void setCostAprvdInd(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PRFL.COST_APRVD_IND</code>.
	 */
	public String getCostAprvdInd() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PRFL.COST_OBJCTV_AMT</code>.
	 */
	public void setCostObjctvAmt(BigDecimal value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PRFL.COST_OBJCTV_AMT</code>.
	 */
	public BigDecimal getCostObjctvAmt() {
		return (BigDecimal) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PRFL.REG_PRC_AMT</code>.
	 */
	public void setRegPrcAmt(BigDecimal value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PRFL.REG_PRC_AMT</code>.
	 */
	public BigDecimal getRegPrcAmt() {
		return (BigDecimal) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PRFL.MRKTG_PROD_RSPBLTY_ID</code>.
	 */
	public void setMrktgProdRspbltyId(BigDecimal value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PRFL.MRKTG_PROD_RSPBLTY_ID</code>.
	 */
	public BigDecimal getMrktgProdRspbltyId() {
		return (BigDecimal) getValue(13);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<BigDecimal, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<BigDecimal, Integer, BigDecimal, String, String, Date, String, Date, String, String, String, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
		return (Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<BigDecimal, Integer, BigDecimal, String, String, Date, String, Date, String, String, String, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
		return (Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MrktPrfl.MRKT_PRFL.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return MrktPrfl.MRKT_PRFL.PRFL_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return MrktPrfl.MRKT_PRFL.PROD_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return MrktPrfl.MRKT_PRFL.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return MrktPrfl.MRKT_PRFL.DLTD_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return MrktPrfl.MRKT_PRFL.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return MrktPrfl.MRKT_PRFL.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return MrktPrfl.MRKT_PRFL.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return MrktPrfl.MRKT_PRFL.LCL_PRFL_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return MrktPrfl.MRKT_PRFL.CHRTY_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return MrktPrfl.MRKT_PRFL.COST_APRVD_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field12() {
		return MrktPrfl.MRKT_PRFL.COST_OBJCTV_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field13() {
		return MrktPrfl.MRKT_PRFL.REG_PRC_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field14() {
		return MrktPrfl.MRKT_PRFL.MRKTG_PROD_RSPBLTY_ID;
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
	public Integer value2() {
		return getPrflCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getProdTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getDltdInd();
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
	public String value9() {
		return getLclPrflNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getChrtyInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getCostAprvdInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value12() {
		return getCostObjctvAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value13() {
		return getRegPrcAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value14() {
		return getMrktgProdRspbltyId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord value2(Integer value) {
		setPrflCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord value3(BigDecimal value) {
		setProdTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord value4(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord value5(String value) {
		setDltdInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord value6(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord value7(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord value8(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord value9(String value) {
		setLclPrflNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord value10(String value) {
		setChrtyInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord value11(String value) {
		setCostAprvdInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord value12(BigDecimal value) {
		setCostObjctvAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord value13(BigDecimal value) {
		setRegPrcAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord value14(BigDecimal value) {
		setMrktgProdRspbltyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPrflRecord values(BigDecimal value1, Integer value2, BigDecimal value3, String value4, String value5, Date value6, String value7, Date value8, String value9, String value10, String value11, BigDecimal value12, BigDecimal value13, BigDecimal value14) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MrktPrflRecord
	 */
	public MrktPrflRecord() {
		super(MrktPrfl.MRKT_PRFL);
	}

	/**
	 * Create a detached, initialised MrktPrflRecord
	 */
	public MrktPrflRecord(BigDecimal mrktId, Integer prflCd, BigDecimal prodTypId, String creatUserId, String dltdInd, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String lclPrflNm, String chrtyInd, String costAprvdInd, BigDecimal costObjctvAmt, BigDecimal regPrcAmt, BigDecimal mrktgProdRspbltyId) {
		super(MrktPrfl.MRKT_PRFL);

		setValue(0, mrktId);
		setValue(1, prflCd);
		setValue(2, prodTypId);
		setValue(3, creatUserId);
		setValue(4, dltdInd);
		setValue(5, creatTs);
		setValue(6, lastUpdtUserId);
		setValue(7, lastUpdtTs);
		setValue(8, lclPrflNm);
		setValue(9, chrtyInd);
		setValue(10, costAprvdInd);
		setValue(11, costObjctvAmt);
		setValue(12, regPrcAmt);
		setValue(13, mrktgProdRspbltyId);
	}
}