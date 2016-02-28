/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record20;
import org.jooq.Record9;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.PrsnlSrceOfSlsFinclObjctv;


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
public class PrsnlSrceOfSlsFinclObjctvRecord extends UpdatableRecordImpl<PrsnlSrceOfSlsFinclObjctvRecord> implements Record20<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Long, BigDecimal, BigDecimal, String, Date, String, Date> {

	private static final long serialVersionUID = 2020745646;

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.OBJCTV_ID</code>.
	 */
	public void setObjctvId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.OBJCTV_ID</code>.
	 */
	public BigDecimal getObjctvId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.CLSTR_ID</code>.
	 */
	public void setClstrId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.CLSTR_ID</code>.
	 */
	public BigDecimal getClstrId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.USER_NM</code>.
	 */
	public void setUserNm(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.USER_NM</code>.
	 */
	public String getUserNm() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.PRSNL_VER_ID</code>.
	 */
	public void setPrsnlVerId(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.PRSNL_VER_ID</code>.
	 */
	public BigDecimal getPrsnlVerId() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.OBJCTV_TYP</code>.
	 */
	public void setObjctvTyp(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.OBJCTV_TYP</code>.
	 */
	public String getObjctvTyp() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.SRCE_OF_SLS_ELMNT_ID</code>.
	 */
	public void setSrceOfSlsElmntId(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.SRCE_OF_SLS_ELMNT_ID</code>.
	 */
	public BigDecimal getSrceOfSlsElmntId() {
		return (BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.DIRCT_PRFT_AMT</code>.
	 */
	public void setDirctPrftAmt(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.DIRCT_PRFT_AMT</code>.
	 */
	public BigDecimal getDirctPrftAmt() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.SYS_ID</code>.
	 */
	public void setSysId(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.SYS_ID</code>.
	 */
	public BigDecimal getSysId() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.DIRCT_PRFT_PCT</code>.
	 */
	public void setDirctPrftPct(BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.DIRCT_PRFT_PCT</code>.
	 */
	public BigDecimal getDirctPrftPct() {
		return (BigDecimal) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.GRS_SLS_PER_UNIT_AMT</code>.
	 */
	public void setGrsSlsPerUnitAmt(BigDecimal value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.GRS_SLS_PER_UNIT_AMT</code>.
	 */
	public BigDecimal getGrsSlsPerUnitAmt() {
		return (BigDecimal) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.SLS_AMT</code>.
	 */
	public void setSlsAmt(BigDecimal value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.SLS_AMT</code>.
	 */
	public BigDecimal getSlsAmt() {
		return (BigDecimal) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.UNIT_QTY</code>.
	 */
	public void setUnitQty(Long value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.UNIT_QTY</code>.
	 */
	public Long getUnitQty() {
		return (Long) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.UNITS_PER_REP_QTY</code>.
	 */
	public void setUnitsPerRepQty(BigDecimal value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.UNITS_PER_REP_QTY</code>.
	 */
	public BigDecimal getUnitsPerRepQty() {
		return (BigDecimal) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.UNITS_PER_ORD_QTY</code>.
	 */
	public void setUnitsPerOrdQty(BigDecimal value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.UNITS_PER_ORD_QTY</code>.
	 */
	public BigDecimal getUnitsPerOrdQty() {
		return (BigDecimal) getValue(15);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(16);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(17);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(18);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(19);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record9<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, BigDecimal, BigDecimal> key() {
		return (Record9) super.key();
	}

	// -------------------------------------------------------------------------
	// Record20 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row20<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Long, BigDecimal, BigDecimal, String, Date, String, Date> fieldsRow() {
		return (Row20) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row20<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Long, BigDecimal, BigDecimal, String, Date, String, Date> valuesRow() {
		return (Row20) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.OBJCTV_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.CLSTR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.USER_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.PRSNL_VER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.OBJCTV_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field8() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.SRCE_OF_SLS_ELMNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.DIRCT_PRFT_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field10() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.SYS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field11() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.DIRCT_PRFT_PCT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field12() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.GRS_SLS_PER_UNIT_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field13() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.SLS_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field14() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.UNIT_QTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field15() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.UNITS_PER_REP_QTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field16() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.UNITS_PER_ORD_QTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field17() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field18() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field19() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field20() {
		return PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV.LAST_UPDT_TS;
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
	public BigDecimal value3() {
		return getObjctvId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getClstrId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getUserNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getPrsnlVerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getObjctvTyp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value8() {
		return getSrceOfSlsElmntId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value9() {
		return getDirctPrftAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value10() {
		return getSysId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value11() {
		return getDirctPrftPct();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value12() {
		return getGrsSlsPerUnitAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value13() {
		return getSlsAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value14() {
		return getUnitQty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value15() {
		return getUnitsPerRepQty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value16() {
		return getUnitsPerOrdQty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value17() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value18() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value19() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value20() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value2(BigDecimal value) {
		setOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value3(BigDecimal value) {
		setObjctvId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value4(BigDecimal value) {
		setClstrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value5(String value) {
		setUserNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value6(BigDecimal value) {
		setPrsnlVerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value7(String value) {
		setObjctvTyp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value8(BigDecimal value) {
		setSrceOfSlsElmntId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value9(BigDecimal value) {
		setDirctPrftAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value10(BigDecimal value) {
		setSysId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value11(BigDecimal value) {
		setDirctPrftPct(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value12(BigDecimal value) {
		setGrsSlsPerUnitAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value13(BigDecimal value) {
		setSlsAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value14(Long value) {
		setUnitQty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value15(BigDecimal value) {
		setUnitsPerRepQty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value16(BigDecimal value) {
		setUnitsPerOrdQty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value17(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value18(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value19(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord value20(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlSrceOfSlsFinclObjctvRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, String value5, BigDecimal value6, String value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, BigDecimal value11, BigDecimal value12, BigDecimal value13, Long value14, BigDecimal value15, BigDecimal value16, String value17, Date value18, String value19, Date value20) {
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
		value18(value18);
		value19(value19);
		value20(value20);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PrsnlSrceOfSlsFinclObjctvRecord
	 */
	public PrsnlSrceOfSlsFinclObjctvRecord() {
		super(PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV);
	}

	/**
	 * Create a detached, initialised PrsnlSrceOfSlsFinclObjctvRecord
	 */
	public PrsnlSrceOfSlsFinclObjctvRecord(BigDecimal mrktId, BigDecimal offrPerdId, BigDecimal objctvId, BigDecimal clstrId, String userNm, BigDecimal prsnlVerId, String objctvTyp, BigDecimal srceOfSlsElmntId, BigDecimal dirctPrftAmt, BigDecimal sysId, BigDecimal dirctPrftPct, BigDecimal grsSlsPerUnitAmt, BigDecimal slsAmt, Long unitQty, BigDecimal unitsPerRepQty, BigDecimal unitsPerOrdQty, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(PrsnlSrceOfSlsFinclObjctv.PRSNL_SRCE_OF_SLS_FINCL_OBJCTV);

		setValue(0, mrktId);
		setValue(1, offrPerdId);
		setValue(2, objctvId);
		setValue(3, clstrId);
		setValue(4, userNm);
		setValue(5, prsnlVerId);
		setValue(6, objctvTyp);
		setValue(7, srceOfSlsElmntId);
		setValue(8, dirctPrftAmt);
		setValue(9, sysId);
		setValue(10, dirctPrftPct);
		setValue(11, grsSlsPerUnitAmt);
		setValue(12, slsAmt);
		setValue(13, unitQty);
		setValue(14, unitsPerRepQty);
		setValue(15, unitsPerOrdQty);
		setValue(16, creatUserId);
		setValue(17, creatTs);
		setValue(18, lastUpdtUserId);
		setValue(19, lastUpdtTs);
	}
}
