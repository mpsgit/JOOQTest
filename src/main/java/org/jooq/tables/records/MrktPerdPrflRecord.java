/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Record3;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.MrktPerdPrfl;


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
public class MrktPerdPrflRecord extends UpdatableRecordImpl<MrktPerdPrflRecord> implements Record13<BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, String, Date, String, Date, String> {

	private static final long serialVersionUID = -1823514467;

	/**
	 * Setter for <code>WETRN.MRKT_PERD_PRFL.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_PRFL.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_PRFL.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_PRFL.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_PRFL.PRFL_CD</code>.
	 */
	public void setPrflCd(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_PRFL.PRFL_CD</code>.
	 */
	public Integer getPrflCd() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_PRFL.CURRNT_PRMRY_SUPLR_ID</code>.
	 */
	public void setCurrntPrmrySuplrId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_PRFL.CURRNT_PRMRY_SUPLR_ID</code>.
	 */
	public BigDecimal getCurrntPrmrySuplrId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_PRFL.NET_TO_AVON_FCT</code>.
	 */
	public void setNetToAvonFct(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_PRFL.NET_TO_AVON_FCT</code>.
	 */
	public BigDecimal getNetToAvonFct() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_PRFL.CRNCY_CD</code>.
	 */
	public void setCrncyCd(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_PRFL.CRNCY_CD</code>.
	 */
	public String getCrncyCd() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_PRFL.REG_PRC_AMT</code>.
	 */
	public void setRegPrcAmt(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_PRFL.REG_PRC_AMT</code>.
	 */
	public BigDecimal getRegPrcAmt() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_PRFL.WGHTD_AVG_COST_AMT</code>.
	 */
	public void setWghtdAvgCostAmt(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_PRFL.WGHTD_AVG_COST_AMT</code>.
	 */
	public BigDecimal getWghtdAvgCostAmt() {
		return (BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_PRFL.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_PRFL.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_PRFL.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_PRFL.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_PRFL.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_PRFL.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_PRFL.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_PRFL.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_PRFL.KEY_PRFL_IND</code>.
	 */
	public void setKeyPrflInd(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_PRFL.KEY_PRFL_IND</code>.
	 */
	public String getKeyPrflInd() {
		return (String) getValue(12);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record3<BigDecimal, BigDecimal, Integer> key() {
		return (Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, String, Date, String, Date, String> fieldsRow() {
		return (Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, String, Date, String, Date, String> valuesRow() {
		return (Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MrktPerdPrfl.MRKT_PERD_PRFL.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MrktPerdPrfl.MRKT_PERD_PRFL.OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return MrktPerdPrfl.MRKT_PERD_PRFL.PRFL_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return MrktPerdPrfl.MRKT_PERD_PRFL.CURRNT_PRMRY_SUPLR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return MrktPerdPrfl.MRKT_PERD_PRFL.NET_TO_AVON_FCT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return MrktPerdPrfl.MRKT_PERD_PRFL.CRNCY_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field7() {
		return MrktPerdPrfl.MRKT_PERD_PRFL.REG_PRC_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field8() {
		return MrktPerdPrfl.MRKT_PERD_PRFL.WGHTD_AVG_COST_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return MrktPerdPrfl.MRKT_PERD_PRFL.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return MrktPerdPrfl.MRKT_PERD_PRFL.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return MrktPerdPrfl.MRKT_PERD_PRFL.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field12() {
		return MrktPerdPrfl.MRKT_PERD_PRFL.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return MrktPerdPrfl.MRKT_PERD_PRFL.KEY_PRFL_IND;
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
		return getOffrPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getPrflCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getCurrntPrmrySuplrId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getNetToAvonFct();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getCrncyCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value7() {
		return getRegPrcAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value8() {
		return getWghtdAvgCostAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value10() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value12() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getKeyPrflInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdPrflRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdPrflRecord value2(BigDecimal value) {
		setOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdPrflRecord value3(Integer value) {
		setPrflCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdPrflRecord value4(BigDecimal value) {
		setCurrntPrmrySuplrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdPrflRecord value5(BigDecimal value) {
		setNetToAvonFct(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdPrflRecord value6(String value) {
		setCrncyCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdPrflRecord value7(BigDecimal value) {
		setRegPrcAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdPrflRecord value8(BigDecimal value) {
		setWghtdAvgCostAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdPrflRecord value9(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdPrflRecord value10(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdPrflRecord value11(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdPrflRecord value12(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdPrflRecord value13(String value) {
		setKeyPrflInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdPrflRecord values(BigDecimal value1, BigDecimal value2, Integer value3, BigDecimal value4, BigDecimal value5, String value6, BigDecimal value7, BigDecimal value8, String value9, Date value10, String value11, Date value12, String value13) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MrktPerdPrflRecord
	 */
	public MrktPerdPrflRecord() {
		super(MrktPerdPrfl.MRKT_PERD_PRFL);
	}

	/**
	 * Create a detached, initialised MrktPerdPrflRecord
	 */
	public MrktPerdPrflRecord(BigDecimal mrktId, BigDecimal offrPerdId, Integer prflCd, BigDecimal currntPrmrySuplrId, BigDecimal netToAvonFct, String crncyCd, BigDecimal regPrcAmt, BigDecimal wghtdAvgCostAmt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String keyPrflInd) {
		super(MrktPerdPrfl.MRKT_PERD_PRFL);

		setValue(0, mrktId);
		setValue(1, offrPerdId);
		setValue(2, prflCd);
		setValue(3, currntPrmrySuplrId);
		setValue(4, netToAvonFct);
		setValue(5, crncyCd);
		setValue(6, regPrcAmt);
		setValue(7, wghtdAvgCostAmt);
		setValue(8, creatUserId);
		setValue(9, creatTs);
		setValue(10, lastUpdtUserId);
		setValue(11, lastUpdtTs);
		setValue(12, keyPrflInd);
	}
}