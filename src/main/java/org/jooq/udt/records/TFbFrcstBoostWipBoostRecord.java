/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.TFbFrcstBoostWipBoost;


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
public class TFbFrcstBoostWipBoostRecord extends UDTRecordImpl<TFbFrcstBoostWipBoostRecord> implements Record12<BigDecimal, String, BigDecimal, BigDecimal, String, BigDecimal, String, Date, BigDecimal, String, String, String> {

	private static final long serialVersionUID = -438274711;

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.SRCE_MRKT_ID</code>.
	 */
	public void setSrceMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.SRCE_MRKT_ID</code>.
	 */
	public BigDecimal getSrceMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.SRCE_MRKT_NM</code>.
	 */
	public void setSrceMrktNm(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.SRCE_MRKT_NM</code>.
	 */
	public String getSrceMrktNm() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.SRCE_OFFR_PERD_ID</code>.
	 */
	public void setSrceOffrPerdId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.SRCE_OFFR_PERD_ID</code>.
	 */
	public BigDecimal getSrceOffrPerdId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_MRKT_ID</code>.
	 */
	public void setTrgtMrktId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_MRKT_ID</code>.
	 */
	public BigDecimal getTrgtMrktId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_MRKT_NM</code>.
	 */
	public void setTrgtMrktNm(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_MRKT_NM</code>.
	 */
	public String getTrgtMrktNm() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_OFFR_PERD_ID</code>.
	 */
	public void setTrgtOffrPerdId(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_OFFR_PERD_ID</code>.
	 */
	public BigDecimal getTrgtOffrPerdId() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_CMPGN_VER_CREAT_USER_ID</code>.
	 */
	public void setTrgtCmpgnVerCreatUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_CMPGN_VER_CREAT_USER_ID</code>.
	 */
	public String getTrgtCmpgnVerCreatUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_CMPGN_VER_CREAT_DT</code>.
	 */
	public void setTrgtCmpgnVerCreatDt(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_CMPGN_VER_CREAT_DT</code>.
	 */
	public Date getTrgtCmpgnVerCreatDt() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_GRS_SLS_AMT</code>.
	 */
	public void setTrgtGrsSlsAmt(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_GRS_SLS_AMT</code>.
	 */
	public BigDecimal getTrgtGrsSlsAmt() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_CMPGN_VER_LOCK_IND</code>.
	 */
	public void setTrgtCmpgnVerLockInd(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_CMPGN_VER_LOCK_IND</code>.
	 */
	public String getTrgtCmpgnVerLockInd() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_USER_HAS_MRKT_ACS_IND</code>.
	 */
	public void setTrgtUserHasMrktAcsInd(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_USER_HAS_MRKT_ACS_IND</code>.
	 */
	public String getTrgtUserHasMrktAcsInd() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_USER_HAS_VEH_ACS_IND</code>.
	 */
	public void setTrgtUserHasVehAcsInd(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_WIP_BOOST.TRGT_USER_HAS_VEH_ACS_IND</code>.
	 */
	public String getTrgtUserHasVehAcsInd() {
		return (String) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<BigDecimal, String, BigDecimal, BigDecimal, String, BigDecimal, String, Date, BigDecimal, String, String, String> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<BigDecimal, String, BigDecimal, BigDecimal, String, BigDecimal, String, Date, BigDecimal, String, String, String> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return TFbFrcstBoostWipBoost.SRCE_MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TFbFrcstBoostWipBoost.SRCE_MRKT_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return TFbFrcstBoostWipBoost.SRCE_OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return TFbFrcstBoostWipBoost.TRGT_MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TFbFrcstBoostWipBoost.TRGT_MRKT_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return TFbFrcstBoostWipBoost.TRGT_OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return TFbFrcstBoostWipBoost.TRGT_CMPGN_VER_CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return TFbFrcstBoostWipBoost.TRGT_CMPGN_VER_CREAT_DT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return TFbFrcstBoostWipBoost.TRGT_GRS_SLS_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return TFbFrcstBoostWipBoost.TRGT_CMPGN_VER_LOCK_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return TFbFrcstBoostWipBoost.TRGT_USER_HAS_MRKT_ACS_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return TFbFrcstBoostWipBoost.TRGT_USER_HAS_VEH_ACS_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getSrceMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getSrceMrktNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getSrceOffrPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getTrgtMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getTrgtMrktNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getTrgtOffrPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getTrgtCmpgnVerCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value8() {
		return getTrgtCmpgnVerCreatDt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value9() {
		return getTrgtGrsSlsAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getTrgtCmpgnVerLockInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getTrgtUserHasMrktAcsInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getTrgtUserHasVehAcsInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostWipBoostRecord value1(BigDecimal value) {
		setSrceMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostWipBoostRecord value2(String value) {
		setSrceMrktNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostWipBoostRecord value3(BigDecimal value) {
		setSrceOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostWipBoostRecord value4(BigDecimal value) {
		setTrgtMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostWipBoostRecord value5(String value) {
		setTrgtMrktNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostWipBoostRecord value6(BigDecimal value) {
		setTrgtOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostWipBoostRecord value7(String value) {
		setTrgtCmpgnVerCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostWipBoostRecord value8(Date value) {
		setTrgtCmpgnVerCreatDt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostWipBoostRecord value9(BigDecimal value) {
		setTrgtGrsSlsAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostWipBoostRecord value10(String value) {
		setTrgtCmpgnVerLockInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostWipBoostRecord value11(String value) {
		setTrgtUserHasMrktAcsInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostWipBoostRecord value12(String value) {
		setTrgtUserHasVehAcsInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostWipBoostRecord values(BigDecimal value1, String value2, BigDecimal value3, BigDecimal value4, String value5, BigDecimal value6, String value7, Date value8, BigDecimal value9, String value10, String value11, String value12) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TFbFrcstBoostWipBoostRecord
	 */
	public TFbFrcstBoostWipBoostRecord() {
		super(TFbFrcstBoostWipBoost.T_FB_FRCST_BOOST_WIP_BOOST);
	}

	/**
	 * Create a detached, initialised TFbFrcstBoostWipBoostRecord
	 */
	public TFbFrcstBoostWipBoostRecord(BigDecimal srceMrktId, String srceMrktNm, BigDecimal srceOffrPerdId, BigDecimal trgtMrktId, String trgtMrktNm, BigDecimal trgtOffrPerdId, String trgtCmpgnVerCreatUserId, Date trgtCmpgnVerCreatDt, BigDecimal trgtGrsSlsAmt, String trgtCmpgnVerLockInd, String trgtUserHasMrktAcsInd, String trgtUserHasVehAcsInd) {
		super(TFbFrcstBoostWipBoost.T_FB_FRCST_BOOST_WIP_BOOST);

		setValue(0, srceMrktId);
		setValue(1, srceMrktNm);
		setValue(2, srceOffrPerdId);
		setValue(3, trgtMrktId);
		setValue(4, trgtMrktNm);
		setValue(5, trgtOffrPerdId);
		setValue(6, trgtCmpgnVerCreatUserId);
		setValue(7, trgtCmpgnVerCreatDt);
		setValue(8, trgtGrsSlsAmt);
		setValue(9, trgtCmpgnVerLockInd);
		setValue(10, trgtUserHasMrktAcsInd);
		setValue(11, trgtUserHasVehAcsInd);
	}
}
