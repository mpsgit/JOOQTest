/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.TFbFrcstBoostCreVer;


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
public class TFbFrcstBoostCreVerRecord extends UDTRecordImpl<TFbFrcstBoostCreVerRecord> implements Record13<BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, String, Date, String, String, String, String, String> {

	private static final long serialVersionUID = 1102525416;

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.VEH_ID</code>.
	 */
	public void setVehId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.VEH_ID</code>.
	 */
	public BigDecimal getVehId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.LCL_VEH_DESC_TXT</code>.
	 */
	public void setLclVehDescTxt(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.LCL_VEH_DESC_TXT</code>.
	 */
	public String getLclVehDescTxt() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.VER_ID</code>.
	 */
	public void setVerId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.VER_ID</code>.
	 */
	public BigDecimal getVerId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.VER_DESC_TXT</code>.
	 */
	public void setVerDescTxt(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.VER_DESC_TXT</code>.
	 */
	public String getVerDescTxt() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.CMPGN_VER_CREAT_USER_ID</code>.
	 */
	public void setCmpgnVerCreatUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.CMPGN_VER_CREAT_USER_ID</code>.
	 */
	public String getCmpgnVerCreatUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.CMPGN_VER_CREAT_DT</code>.
	 */
	public void setCmpgnVerCreatDt(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.CMPGN_VER_CREAT_DT</code>.
	 */
	public Date getCmpgnVerCreatDt() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.CMPGN_VER_LOCK_IND</code>.
	 */
	public void setCmpgnVerLockInd(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.CMPGN_VER_LOCK_IND</code>.
	 */
	public String getCmpgnVerLockInd() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.USER_HAS_MRKT_ACS_IND</code>.
	 */
	public void setUserHasMrktAcsInd(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.USER_HAS_MRKT_ACS_IND</code>.
	 */
	public String getUserHasMrktAcsInd() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.USER_HAS_VEH_ACS_IND</code>.
	 */
	public void setUserHasVehAcsInd(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.USER_HAS_VEH_ACS_IND</code>.
	 */
	public String getUserHasVehAcsInd() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.CB_CREAT_TICKED_IND</code>.
	 */
	public void setCbCreatTickedInd(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.CB_CREAT_TICKED_IND</code>.
	 */
	public String getCbCreatTickedInd() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.CB_DLT_TICKED_IND</code>.
	 */
	public void setCbDltTickedInd(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_FRCST_BOOST_CRE_VER.CB_DLT_TICKED_IND</code>.
	 */
	public String getCbDltTickedInd() {
		return (String) getValue(12);
	}

	// -------------------------------------------------------------------------
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, String, Date, String, String, String, String, String> fieldsRow() {
		return (Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, String, Date, String, String, String, String, String> valuesRow() {
		return (Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return TFbFrcstBoostCreVer.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return TFbFrcstBoostCreVer.OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return TFbFrcstBoostCreVer.VEH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TFbFrcstBoostCreVer.LCL_VEH_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return TFbFrcstBoostCreVer.VER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return TFbFrcstBoostCreVer.VER_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return TFbFrcstBoostCreVer.CMPGN_VER_CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return TFbFrcstBoostCreVer.CMPGN_VER_CREAT_DT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return TFbFrcstBoostCreVer.CMPGN_VER_LOCK_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return TFbFrcstBoostCreVer.USER_HAS_MRKT_ACS_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return TFbFrcstBoostCreVer.USER_HAS_VEH_ACS_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return TFbFrcstBoostCreVer.CB_CREAT_TICKED_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return TFbFrcstBoostCreVer.CB_DLT_TICKED_IND;
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
		return getVehId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getLclVehDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getVerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getVerDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getCmpgnVerCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value8() {
		return getCmpgnVerCreatDt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getCmpgnVerLockInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getUserHasMrktAcsInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getUserHasVehAcsInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getCbCreatTickedInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getCbDltTickedInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostCreVerRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostCreVerRecord value2(BigDecimal value) {
		setOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostCreVerRecord value3(BigDecimal value) {
		setVehId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostCreVerRecord value4(String value) {
		setLclVehDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostCreVerRecord value5(BigDecimal value) {
		setVerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostCreVerRecord value6(String value) {
		setVerDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostCreVerRecord value7(String value) {
		setCmpgnVerCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostCreVerRecord value8(Date value) {
		setCmpgnVerCreatDt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostCreVerRecord value9(String value) {
		setCmpgnVerLockInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostCreVerRecord value10(String value) {
		setUserHasMrktAcsInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostCreVerRecord value11(String value) {
		setUserHasVehAcsInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostCreVerRecord value12(String value) {
		setCbCreatTickedInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostCreVerRecord value13(String value) {
		setCbDltTickedInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbFrcstBoostCreVerRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, String value4, BigDecimal value5, String value6, String value7, Date value8, String value9, String value10, String value11, String value12, String value13) {
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
	 * Create a detached TFbFrcstBoostCreVerRecord
	 */
	public TFbFrcstBoostCreVerRecord() {
		super(TFbFrcstBoostCreVer.T_FB_FRCST_BOOST_CRE_VER);
	}

	/**
	 * Create a detached, initialised TFbFrcstBoostCreVerRecord
	 */
	public TFbFrcstBoostCreVerRecord(BigDecimal mrktId, BigDecimal offrPerdId, BigDecimal vehId, String lclVehDescTxt, BigDecimal verId, String verDescTxt, String cmpgnVerCreatUserId, Date cmpgnVerCreatDt, String cmpgnVerLockInd, String userHasMrktAcsInd, String userHasVehAcsInd, String cbCreatTickedInd, String cbDltTickedInd) {
		super(TFbFrcstBoostCreVer.T_FB_FRCST_BOOST_CRE_VER);

		setValue(0, mrktId);
		setValue(1, offrPerdId);
		setValue(2, vehId);
		setValue(3, lclVehDescTxt);
		setValue(4, verId);
		setValue(5, verDescTxt);
		setValue(6, cmpgnVerCreatUserId);
		setValue(7, cmpgnVerCreatDt);
		setValue(8, cmpgnVerLockInd);
		setValue(9, userHasMrktAcsInd);
		setValue(10, userHasVehAcsInd);
		setValue(11, cbCreatTickedInd);
		setValue(12, cbDltTickedInd);
	}
}