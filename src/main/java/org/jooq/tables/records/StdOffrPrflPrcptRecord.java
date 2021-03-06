/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.StdOffrPrflPrcpt;


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
public class StdOffrPrflPrcptRecord extends UpdatableRecordImpl<StdOffrPrflPrcptRecord> implements Record17<BigDecimal, BigDecimal, String, Integer, BigDecimal, BigDecimal, String, String, BigDecimal, String, Integer, BigDecimal, String, Date, String, Date, String> {

	private static final long serialVersionUID = 1604429727;

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.STD_OFFR_PRFL_PRCPT_ID</code>.
	 */
	public void setStdOffrPrflPrcptId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.STD_OFFR_PRFL_PRCPT_ID</code>.
	 */
	public BigDecimal getStdOffrPrflPrcptId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.STD_OFFR_ID</code>.
	 */
	public void setStdOffrId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.STD_OFFR_ID</code>.
	 */
	public BigDecimal getStdOffrId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.SLS_CLS_CD</code>.
	 */
	public void setSlsClsCd(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.SLS_CLS_CD</code>.
	 */
	public String getSlsClsCd() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.PRFL_CD</code>.
	 */
	public void setPrflCd(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.PRFL_CD</code>.
	 */
	public Integer getPrflCd() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.PG_OFS_NR</code>.
	 */
	public void setPgOfsNr(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.PG_OFS_NR</code>.
	 */
	public BigDecimal getPgOfsNr() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.CRNCY_CD</code>.
	 */
	public void setCrncyCd(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.CRNCY_CD</code>.
	 */
	public String getCrncyCd() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.FEATRD_SIDE_CD</code>.
	 */
	public void setFeatrdSideCd(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.FEATRD_SIDE_CD</code>.
	 */
	public String getFeatrdSideCd() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.PROMTN_CLM_ID</code>.
	 */
	public void setPromtnClmId(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.PROMTN_CLM_ID</code>.
	 */
	public BigDecimal getPromtnClmId() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.PRC_POINT_DESC_TXT</code>.
	 */
	public void setPrcPointDescTxt(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.PRC_POINT_DESC_TXT</code>.
	 */
	public String getPrcPointDescTxt() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.NR_FOR_QTY</code>.
	 */
	public void setNrForQty(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.NR_FOR_QTY</code>.
	 */
	public Integer getNrForQty() {
		return (Integer) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.SLS_PRC_AMT</code>.
	 */
	public void setSlsPrcAmt(BigDecimal value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.SLS_PRC_AMT</code>.
	 */
	public BigDecimal getSlsPrcAmt() {
		return (BigDecimal) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(15);
	}

	/**
	 * Setter for <code>WETRN.STD_OFFR_PRFL_PRCPT.COMSN_TYP</code>.
	 */
	public void setComsnTyp(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>WETRN.STD_OFFR_PRFL_PRCPT.COMSN_TYP</code>.
	 */
	public String getComsnTyp() {
		return (String) getValue(16);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<BigDecimal> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record17 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row17<BigDecimal, BigDecimal, String, Integer, BigDecimal, BigDecimal, String, String, BigDecimal, String, Integer, BigDecimal, String, Date, String, Date, String> fieldsRow() {
		return (Row17) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row17<BigDecimal, BigDecimal, String, Integer, BigDecimal, BigDecimal, String, String, BigDecimal, String, Integer, BigDecimal, String, Date, String, Date, String> valuesRow() {
		return (Row17) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.STD_OFFR_PRFL_PRCPT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.STD_OFFR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.SLS_CLS_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.PRFL_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.PG_OFS_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.CRNCY_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.FEATRD_SIDE_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.PROMTN_CLM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.PRC_POINT_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field11() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.NR_FOR_QTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field12() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.SLS_PRC_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field14() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field15() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field16() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field17() {
		return StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT.COMSN_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getStdOffrPrflPrcptId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getStdOffrId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getSlsClsCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getPrflCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getPgOfsNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getCrncyCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getFeatrdSideCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value9() {
		return getPromtnClmId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getPrcPointDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value11() {
		return getNrForQty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value12() {
		return getSlsPrcAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value14() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value15() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value16() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value17() {
		return getComsnTyp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value1(BigDecimal value) {
		setStdOffrPrflPrcptId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value2(BigDecimal value) {
		setStdOffrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value3(String value) {
		setSlsClsCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value4(Integer value) {
		setPrflCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value5(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value6(BigDecimal value) {
		setPgOfsNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value7(String value) {
		setCrncyCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value8(String value) {
		setFeatrdSideCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value9(BigDecimal value) {
		setPromtnClmId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value10(String value) {
		setPrcPointDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value11(Integer value) {
		setNrForQty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value12(BigDecimal value) {
		setSlsPrcAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value13(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value14(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value15(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value16(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord value17(String value) {
		setComsnTyp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflPrcptRecord values(BigDecimal value1, BigDecimal value2, String value3, Integer value4, BigDecimal value5, BigDecimal value6, String value7, String value8, BigDecimal value9, String value10, Integer value11, BigDecimal value12, String value13, Date value14, String value15, Date value16, String value17) {
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
		value15(value15);
		value16(value16);
		value17(value17);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StdOffrPrflPrcptRecord
	 */
	public StdOffrPrflPrcptRecord() {
		super(StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT);
	}

	/**
	 * Create a detached, initialised StdOffrPrflPrcptRecord
	 */
	public StdOffrPrflPrcptRecord(BigDecimal stdOffrPrflPrcptId, BigDecimal stdOffrId, String slsClsCd, Integer prflCd, BigDecimal mrktId, BigDecimal pgOfsNr, String crncyCd, String featrdSideCd, BigDecimal promtnClmId, String prcPointDescTxt, Integer nrForQty, BigDecimal slsPrcAmt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String comsnTyp) {
		super(StdOffrPrflPrcpt.STD_OFFR_PRFL_PRCPT);

		setValue(0, stdOffrPrflPrcptId);
		setValue(1, stdOffrId);
		setValue(2, slsClsCd);
		setValue(3, prflCd);
		setValue(4, mrktId);
		setValue(5, pgOfsNr);
		setValue(6, crncyCd);
		setValue(7, featrdSideCd);
		setValue(8, promtnClmId);
		setValue(9, prcPointDescTxt);
		setValue(10, nrForQty);
		setValue(11, slsPrcAmt);
		setValue(12, creatUserId);
		setValue(13, creatTs);
		setValue(14, lastUpdtUserId);
		setValue(15, lastUpdtTs);
		setValue(16, comsnTyp);
	}
}
