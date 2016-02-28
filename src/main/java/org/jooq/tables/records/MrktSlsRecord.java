/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.MrktSls;


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
public class MrktSlsRecord extends TableRecordImpl<MrktSlsRecord> implements Record18<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, BigDecimal, BigDecimal, BigDecimal> {

	private static final long serialVersionUID = 1166102111;

	/**
	 * Setter for <code>WETRN.MRKT_SLS.OFFR_SKU_LINE_ID</code>.
	 */
	public void setOffrSkuLineId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.OFFR_SKU_LINE_ID</code>.
	 */
	public BigDecimal getOffrSkuLineId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.SLS_TYP_ID</code>.
	 */
	public void setSlsTypId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.SLS_TYP_ID</code>.
	 */
	public BigDecimal getSlsTypId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.VEH_ID</code>.
	 */
	public void setVehId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.VEH_ID</code>.
	 */
	public BigDecimal getVehId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.STUS_CD</code>.
	 */
	public void setStusCd(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.STUS_CD</code>.
	 */
	public String getStusCd() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.CURRNT_EST_IND</code>.
	 */
	public void setCurrntEstInd(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.CURRNT_EST_IND</code>.
	 */
	public String getCurrntEstInd() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.CURRNT_SLS_SRCE_ID</code>.
	 */
	public void setCurrntSlsSrceId(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.CURRNT_SLS_SRCE_ID</code>.
	 */
	public BigDecimal getCurrntSlsSrceId() {
		return (BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.CURRNT_UNIT_QTY</code>.
	 */
	public void setCurrntUnitQty(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.CURRNT_UNIT_QTY</code>.
	 */
	public BigDecimal getCurrntUnitQty() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.PREV_SLS_SRCE_ID</code>.
	 */
	public void setPrevSlsSrceId(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.PREV_SLS_SRCE_ID</code>.
	 */
	public BigDecimal getPrevSlsSrceId() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.PREV_UNIT_QTY</code>.
	 */
	public void setPrevUnitQty(BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.PREV_UNIT_QTY</code>.
	 */
	public BigDecimal getPrevUnitQty() {
		return (BigDecimal) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.COMSN_AMT</code>.
	 */
	public void setComsnAmt(BigDecimal value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.COMSN_AMT</code>.
	 */
	public BigDecimal getComsnAmt() {
		return (BigDecimal) getValue(15);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.TAX_AMT</code>.
	 */
	public void setTaxAmt(BigDecimal value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.TAX_AMT</code>.
	 */
	public BigDecimal getTaxAmt() {
		return (BigDecimal) getValue(16);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SLS.NET_TO_AVON_FCT</code>.
	 */
	public void setNetToAvonFct(BigDecimal value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SLS.NET_TO_AVON_FCT</code>.
	 */
	public BigDecimal getNetToAvonFct() {
		return (BigDecimal) getValue(17);
	}

	// -------------------------------------------------------------------------
	// Record18 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row18<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
		return (Row18) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row18<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
		return (Row18) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MrktSls.MRKT_SLS.OFFR_SKU_LINE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MrktSls.MRKT_SLS.SLS_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return MrktSls.MRKT_SLS.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return MrktSls.MRKT_SLS.VEH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return MrktSls.MRKT_SLS.OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return MrktSls.MRKT_SLS.STUS_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return MrktSls.MRKT_SLS.CURRNT_EST_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field8() {
		return MrktSls.MRKT_SLS.CURRNT_SLS_SRCE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return MrktSls.MRKT_SLS.CURRNT_UNIT_QTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field10() {
		return MrktSls.MRKT_SLS.PREV_SLS_SRCE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field11() {
		return MrktSls.MRKT_SLS.PREV_UNIT_QTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return MrktSls.MRKT_SLS.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field13() {
		return MrktSls.MRKT_SLS.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field14() {
		return MrktSls.MRKT_SLS.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field15() {
		return MrktSls.MRKT_SLS.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field16() {
		return MrktSls.MRKT_SLS.COMSN_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field17() {
		return MrktSls.MRKT_SLS.TAX_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field18() {
		return MrktSls.MRKT_SLS.NET_TO_AVON_FCT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getOffrSkuLineId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getSlsTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getVehId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getOffrPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getStusCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getCurrntEstInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value8() {
		return getCurrntSlsSrceId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value9() {
		return getCurrntUnitQty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value10() {
		return getPrevSlsSrceId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value11() {
		return getPrevUnitQty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value13() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value14() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value15() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value16() {
		return getComsnAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value17() {
		return getTaxAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value18() {
		return getNetToAvonFct();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value1(BigDecimal value) {
		setOffrSkuLineId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value2(BigDecimal value) {
		setSlsTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value3(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value4(BigDecimal value) {
		setVehId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value5(BigDecimal value) {
		setOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value6(String value) {
		setStusCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value7(String value) {
		setCurrntEstInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value8(BigDecimal value) {
		setCurrntSlsSrceId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value9(BigDecimal value) {
		setCurrntUnitQty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value10(BigDecimal value) {
		setPrevSlsSrceId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value11(BigDecimal value) {
		setPrevUnitQty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value12(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value13(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value14(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value15(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value16(BigDecimal value) {
		setComsnAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value17(BigDecimal value) {
		setTaxAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord value18(BigDecimal value) {
		setNetToAvonFct(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, BigDecimal value5, String value6, String value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, BigDecimal value11, String value12, Date value13, String value14, Date value15, BigDecimal value16, BigDecimal value17, BigDecimal value18) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MrktSlsRecord
	 */
	public MrktSlsRecord() {
		super(MrktSls.MRKT_SLS);
	}

	/**
	 * Create a detached, initialised MrktSlsRecord
	 */
	public MrktSlsRecord(BigDecimal offrSkuLineId, BigDecimal slsTypId, BigDecimal mrktId, BigDecimal vehId, BigDecimal offrPerdId, String stusCd, String currntEstInd, BigDecimal currntSlsSrceId, BigDecimal currntUnitQty, BigDecimal prevSlsSrceId, BigDecimal prevUnitQty, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, BigDecimal comsnAmt, BigDecimal taxAmt, BigDecimal netToAvonFct) {
		super(MrktSls.MRKT_SLS);

		setValue(0, offrSkuLineId);
		setValue(1, slsTypId);
		setValue(2, mrktId);
		setValue(3, vehId);
		setValue(4, offrPerdId);
		setValue(5, stusCd);
		setValue(6, currntEstInd);
		setValue(7, currntSlsSrceId);
		setValue(8, currntUnitQty);
		setValue(9, prevSlsSrceId);
		setValue(10, prevUnitQty);
		setValue(11, creatUserId);
		setValue(12, creatTs);
		setValue(13, lastUpdtUserId);
		setValue(14, lastUpdtTs);
		setValue(15, comsnAmt);
		setValue(16, taxAmt);
		setValue(17, netToAvonFct);
	}
}