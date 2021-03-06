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
import org.jooq.tables.MrktVehPerdBrchrPlcmt;


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
public class MrktVehPerdBrchrPlcmtRecord extends UpdatableRecordImpl<MrktVehPerdBrchrPlcmtRecord> implements Record9<BigDecimal, BigDecimal, BigDecimal, BigDecimal, Integer, String, Date, String, Date> {

	private static final long serialVersionUID = 924077241;

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.VEH_ID</code>.
	 */
	public void setVehId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.VEH_ID</code>.
	 */
	public BigDecimal getVehId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.BRCHR_PLCMT_ID</code>.
	 */
	public void setBrchrPlcmtId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.BRCHR_PLCMT_ID</code>.
	 */
	public BigDecimal getBrchrPlcmtId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.PG_CNT</code>.
	 */
	public void setPgCnt(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.PG_CNT</code>.
	 */
	public Integer getPgCnt() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_VEH_PERD_BRCHR_PLCMT.LAST_UPDT_TS</code>.
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
	public Record4<BigDecimal, BigDecimal, BigDecimal, BigDecimal> key() {
		return (Record4) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, BigDecimal, BigDecimal, BigDecimal, Integer, String, Date, String, Date> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, BigDecimal, BigDecimal, BigDecimal, Integer, String, Date, String, Date> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MrktVehPerdBrchrPlcmt.MRKT_VEH_PERD_BRCHR_PLCMT.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MrktVehPerdBrchrPlcmt.MRKT_VEH_PERD_BRCHR_PLCMT.VEH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return MrktVehPerdBrchrPlcmt.MRKT_VEH_PERD_BRCHR_PLCMT.OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return MrktVehPerdBrchrPlcmt.MRKT_VEH_PERD_BRCHR_PLCMT.BRCHR_PLCMT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return MrktVehPerdBrchrPlcmt.MRKT_VEH_PERD_BRCHR_PLCMT.PG_CNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return MrktVehPerdBrchrPlcmt.MRKT_VEH_PERD_BRCHR_PLCMT.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return MrktVehPerdBrchrPlcmt.MRKT_VEH_PERD_BRCHR_PLCMT.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return MrktVehPerdBrchrPlcmt.MRKT_VEH_PERD_BRCHR_PLCMT.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field9() {
		return MrktVehPerdBrchrPlcmt.MRKT_VEH_PERD_BRCHR_PLCMT.LAST_UPDT_TS;
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
	public BigDecimal value4() {
		return getBrchrPlcmtId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getPgCnt();
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
	public MrktVehPerdBrchrPlcmtRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdBrchrPlcmtRecord value2(BigDecimal value) {
		setVehId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdBrchrPlcmtRecord value3(BigDecimal value) {
		setOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdBrchrPlcmtRecord value4(BigDecimal value) {
		setBrchrPlcmtId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdBrchrPlcmtRecord value5(Integer value) {
		setPgCnt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdBrchrPlcmtRecord value6(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdBrchrPlcmtRecord value7(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdBrchrPlcmtRecord value8(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdBrchrPlcmtRecord value9(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerdBrchrPlcmtRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, Integer value5, String value6, Date value7, String value8, Date value9) {
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
	 * Create a detached MrktVehPerdBrchrPlcmtRecord
	 */
	public MrktVehPerdBrchrPlcmtRecord() {
		super(MrktVehPerdBrchrPlcmt.MRKT_VEH_PERD_BRCHR_PLCMT);
	}

	/**
	 * Create a detached, initialised MrktVehPerdBrchrPlcmtRecord
	 */
	public MrktVehPerdBrchrPlcmtRecord(BigDecimal mrktId, BigDecimal vehId, BigDecimal offrPerdId, BigDecimal brchrPlcmtId, Integer pgCnt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(MrktVehPerdBrchrPlcmt.MRKT_VEH_PERD_BRCHR_PLCMT);

		setValue(0, mrktId);
		setValue(1, vehId);
		setValue(2, offrPerdId);
		setValue(3, brchrPlcmtId);
		setValue(4, pgCnt);
		setValue(5, creatUserId);
		setValue(6, creatTs);
		setValue(7, lastUpdtUserId);
		setValue(8, lastUpdtTs);
	}
}
