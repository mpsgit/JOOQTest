/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record19;
import org.jooq.Record3;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.MrktVehPerd;


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
public class MrktVehPerdRecord extends UpdatableRecordImpl<MrktVehPerdRecord> implements Record19<BigDecimal, BigDecimal, BigDecimal, String, String, Integer, String, String, String, Date, String, Date, Date, String, String, Date, String, BigDecimal, String> {

	private static final long serialVersionUID = 1043819779;

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.VEH_ID</code>.
	 */
	public void setVehId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.VEH_ID</code>.
	 */
	public BigDecimal getVehId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.THEME_DESC_TXT</code>.
	 */
	public void setThemeDescTxt(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.THEME_DESC_TXT</code>.
	 */
	public String getThemeDescTxt() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.ENRGY_CHRT_CMNT_TXT</code>.
	 */
	public void setEnrgyChrtCmntTxt(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.ENRGY_CHRT_CMNT_TXT</code>.
	 */
	public String getEnrgyChrtCmntTxt() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.PG_CNT</code>.
	 */
	public void setPgCnt(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.PG_CNT</code>.
	 */
	public Integer getPgCnt() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.CMPGN_STUS_CD</code>.
	 */
	public void setCmpgnStusCd(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.CMPGN_STUS_CD</code>.
	 */
	public String getCmpgnStusCd() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.CMPGN_LOCK_IND</code>.
	 */
	public void setCmpgnLockInd(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.CMPGN_LOCK_IND</code>.
	 */
	public String getCmpgnLockInd() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.CMPGN_LOCK_DT</code>.
	 */
	public void setCmpgnLockDt(Date value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.CMPGN_LOCK_DT</code>.
	 */
	public Date getCmpgnLockDt() {
		return (Date) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.CMPGN_LOCK_USER_ID</code>.
	 */
	public void setCmpgnLockUserId(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.CMPGN_LOCK_USER_ID</code>.
	 */
	public String getCmpgnLockUserId() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.ENRGY_CHRT_LOCK_IND</code>.
	 */
	public void setEnrgyChrtLockInd(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.ENRGY_CHRT_LOCK_IND</code>.
	 */
	public String getEnrgyChrtLockInd() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.ENRGY_CHRT_LOCK_DT</code>.
	 */
	public void setEnrgyChrtLockDt(Date value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.ENRGY_CHRT_LOCK_DT</code>.
	 */
	public Date getEnrgyChrtLockDt() {
		return (Date) getValue(15);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.ENRGY_CHRT_LOCK_USER_ID</code>.
	 */
	public void setEnrgyChrtLockUserId(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.ENRGY_CHRT_LOCK_USER_ID</code>.
	 */
	public String getEnrgyChrtLockUserId() {
		return (String) getValue(16);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.MPS_SLS_TYP_ID</code>.
	 */
	public void setMpsSlsTypId(BigDecimal value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.MPS_SLS_TYP_ID</code>.
	 */
	public BigDecimal getMpsSlsTypId() {
		return (BigDecimal) getValue(17);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD.PLND_VEH_IND</code>. Planned vehicle indicator {'N'|'Y'} for this mrkt/veh/offr_perd.
	 */
	public void setPlndVehInd(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD.PLND_VEH_IND</code>. Planned vehicle indicator {'N'|'Y'} for this mrkt/veh/offr_perd.
	 */
	public String getPlndVehInd() {
		return (String) getValue(18);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record3<BigDecimal, BigDecimal, BigDecimal> key() {
		return (Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record19 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row19<BigDecimal, BigDecimal, BigDecimal, String, String, Integer, String, String, String, Date, String, Date, Date, String, String, Date, String, BigDecimal, String> fieldsRow() {
		return (Row19) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row19<BigDecimal, BigDecimal, BigDecimal, String, String, Integer, String, String, String, Date, String, Date, Date, String, String, Date, String, BigDecimal, String> valuesRow() {
		return (Row19) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MrktVehPerd.MRKT_VEH_PERD.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MrktVehPerd.MRKT_VEH_PERD.VEH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return MrktVehPerd.MRKT_VEH_PERD.OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return MrktVehPerd.MRKT_VEH_PERD.THEME_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return MrktVehPerd.MRKT_VEH_PERD.ENRGY_CHRT_CMNT_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return MrktVehPerd.MRKT_VEH_PERD.PG_CNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return MrktVehPerd.MRKT_VEH_PERD.CMPGN_STUS_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return MrktVehPerd.MRKT_VEH_PERD.CMPGN_LOCK_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return MrktVehPerd.MRKT_VEH_PERD.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return MrktVehPerd.MRKT_VEH_PERD.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return MrktVehPerd.MRKT_VEH_PERD.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field12() {
		return MrktVehPerd.MRKT_VEH_PERD.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field13() {
		return MrktVehPerd.MRKT_VEH_PERD.CMPGN_LOCK_DT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field14() {
		return MrktVehPerd.MRKT_VEH_PERD.CMPGN_LOCK_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field15() {
		return MrktVehPerd.MRKT_VEH_PERD.ENRGY_CHRT_LOCK_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field16() {
		return MrktVehPerd.MRKT_VEH_PERD.ENRGY_CHRT_LOCK_DT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field17() {
		return MrktVehPerd.MRKT_VEH_PERD.ENRGY_CHRT_LOCK_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field18() {
		return MrktVehPerd.MRKT_VEH_PERD.MPS_SLS_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field19() {
		return MrktVehPerd.MRKT_VEH_PERD.PLND_VEH_IND;
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
		return getVehId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getOffrPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getThemeDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getEnrgyChrtCmntTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getPgCnt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getCmpgnStusCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getCmpgnLockInd();
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
	public Date value13() {
		return getCmpgnLockDt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value14() {
		return getCmpgnLockUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value15() {
		return getEnrgyChrtLockInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value16() {
		return getEnrgyChrtLockDt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value17() {
		return getEnrgyChrtLockUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value18() {
		return getMpsSlsTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value19() {
		return getPlndVehInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value2(BigDecimal value) {
		setVehId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value3(BigDecimal value) {
		setOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value4(String value) {
		setThemeDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value5(String value) {
		setEnrgyChrtCmntTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value6(Integer value) {
		setPgCnt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value7(String value) {
		setCmpgnStusCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value8(String value) {
		setCmpgnLockInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value9(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value10(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value11(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value12(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value13(Date value) {
		setCmpgnLockDt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value14(String value) {
		setCmpgnLockUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value15(String value) {
		setEnrgyChrtLockInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value16(Date value) {
		setEnrgyChrtLockDt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value17(String value) {
		setEnrgyChrtLockUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value18(BigDecimal value) {
		setMpsSlsTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord value19(String value) {
		setPlndVehInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, String value4, String value5, Integer value6, String value7, String value8, String value9, Date value10, String value11, Date value12, Date value13, String value14, String value15, Date value16, String value17, BigDecimal value18, String value19) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MrktVehPerdRecord
	 */
	public MrktVehPerdRecord() {
		super(MrktVehPerd.MRKT_VEH_PERD);
	}

	/**
	 * Create a detached, initialised MrktVehPerdRecord
	 */
	public MrktVehPerdRecord(BigDecimal mrktId, BigDecimal vehId, BigDecimal offrPerdId, String themeDescTxt, String enrgyChrtCmntTxt, Integer pgCnt, String cmpgnStusCd, String cmpgnLockInd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, Date cmpgnLockDt, String cmpgnLockUserId, String enrgyChrtLockInd, Date enrgyChrtLockDt, String enrgyChrtLockUserId, BigDecimal mpsSlsTypId, String plndVehInd) {
		super(MrktVehPerd.MRKT_VEH_PERD);

		setValue(0, mrktId);
		setValue(1, vehId);
		setValue(2, offrPerdId);
		setValue(3, themeDescTxt);
		setValue(4, enrgyChrtCmntTxt);
		setValue(5, pgCnt);
		setValue(6, cmpgnStusCd);
		setValue(7, cmpgnLockInd);
		setValue(8, creatUserId);
		setValue(9, creatTs);
		setValue(10, lastUpdtUserId);
		setValue(11, lastUpdtTs);
		setValue(12, cmpgnLockDt);
		setValue(13, cmpgnLockUserId);
		setValue(14, enrgyChrtLockInd);
		setValue(15, enrgyChrtLockDt);
		setValue(16, enrgyChrtLockUserId);
		setValue(17, mpsSlsTypId);
		setValue(18, plndVehInd);
	}
}