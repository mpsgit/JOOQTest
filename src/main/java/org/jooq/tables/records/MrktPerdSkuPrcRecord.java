/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Record4;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.MrktPerdSkuPrc;


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
public class MrktPerdSkuPrcRecord extends UpdatableRecordImpl<MrktPerdSkuPrcRecord> implements Record11<BigDecimal, BigDecimal, BigDecimal, String, String, BigDecimal, BigDecimal, Date, String, Date, String> {

	private static final long serialVersionUID = 1913123793;

	/**
	 * Setter for <code>WETRN.MRKT_PERD_SKU_PRC.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_SKU_PRC.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_SKU_PRC.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_SKU_PRC.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_SKU_PRC.SKU_ID</code>.
	 */
	public void setSkuId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_SKU_PRC.SKU_ID</code>.
	 */
	public BigDecimal getSkuId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_SKU_PRC.PRC_LVL_TYP_CD</code>.
	 */
	public void setPrcLvlTypCd(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_SKU_PRC.PRC_LVL_TYP_CD</code>.
	 */
	public String getPrcLvlTypCd() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_SKU_PRC.CRNCY_CD</code>.
	 */
	public void setCrncyCd(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_SKU_PRC.CRNCY_CD</code>.
	 */
	public String getCrncyCd() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_SKU_PRC.SKU_PRC_AMT</code>.
	 */
	public void setSkuPrcAmt(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_SKU_PRC.SKU_PRC_AMT</code>.
	 */
	public BigDecimal getSkuPrcAmt() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_SKU_PRC.CMPNT_DISCNT_PCT</code>.
	 */
	public void setCmpntDiscntPct(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_SKU_PRC.CMPNT_DISCNT_PCT</code>.
	 */
	public BigDecimal getCmpntDiscntPct() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_SKU_PRC.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_SKU_PRC.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_SKU_PRC.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_SKU_PRC.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_SKU_PRC.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_SKU_PRC.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD_SKU_PRC.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD_SKU_PRC.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record4<BigDecimal, BigDecimal, BigDecimal, String> key() {
		return (Record4) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<BigDecimal, BigDecimal, BigDecimal, String, String, BigDecimal, BigDecimal, Date, String, Date, String> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<BigDecimal, BigDecimal, BigDecimal, String, String, BigDecimal, BigDecimal, Date, String, Date, String> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MrktPerdSkuPrc.MRKT_PERD_SKU_PRC.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MrktPerdSkuPrc.MRKT_PERD_SKU_PRC.OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return MrktPerdSkuPrc.MRKT_PERD_SKU_PRC.SKU_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return MrktPerdSkuPrc.MRKT_PERD_SKU_PRC.PRC_LVL_TYP_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return MrktPerdSkuPrc.MRKT_PERD_SKU_PRC.CRNCY_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return MrktPerdSkuPrc.MRKT_PERD_SKU_PRC.SKU_PRC_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field7() {
		return MrktPerdSkuPrc.MRKT_PERD_SKU_PRC.CMPNT_DISCNT_PCT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return MrktPerdSkuPrc.MRKT_PERD_SKU_PRC.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return MrktPerdSkuPrc.MRKT_PERD_SKU_PRC.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return MrktPerdSkuPrc.MRKT_PERD_SKU_PRC.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return MrktPerdSkuPrc.MRKT_PERD_SKU_PRC.LAST_UPDT_USER_ID;
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
		return getSkuId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getPrcLvlTypCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getCrncyCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getSkuPrcAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value7() {
		return getCmpntDiscntPct();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value8() {
		return getCreatTs();
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
		return getLastUpdtTs();
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
	public MrktPerdSkuPrcRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdSkuPrcRecord value2(BigDecimal value) {
		setOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdSkuPrcRecord value3(BigDecimal value) {
		setSkuId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdSkuPrcRecord value4(String value) {
		setPrcLvlTypCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdSkuPrcRecord value5(String value) {
		setCrncyCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdSkuPrcRecord value6(BigDecimal value) {
		setSkuPrcAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdSkuPrcRecord value7(BigDecimal value) {
		setCmpntDiscntPct(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdSkuPrcRecord value8(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdSkuPrcRecord value9(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdSkuPrcRecord value10(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdSkuPrcRecord value11(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdSkuPrcRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, String value4, String value5, BigDecimal value6, BigDecimal value7, Date value8, String value9, Date value10, String value11) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MrktPerdSkuPrcRecord
	 */
	public MrktPerdSkuPrcRecord() {
		super(MrktPerdSkuPrc.MRKT_PERD_SKU_PRC);
	}

	/**
	 * Create a detached, initialised MrktPerdSkuPrcRecord
	 */
	public MrktPerdSkuPrcRecord(BigDecimal mrktId, BigDecimal offrPerdId, BigDecimal skuId, String prcLvlTypCd, String crncyCd, BigDecimal skuPrcAmt, BigDecimal cmpntDiscntPct, Date creatTs, String creatUserId, Date lastUpdtTs, String lastUpdtUserId) {
		super(MrktPerdSkuPrc.MRKT_PERD_SKU_PRC);

		setValue(0, mrktId);
		setValue(1, offrPerdId);
		setValue(2, skuId);
		setValue(3, prcLvlTypCd);
		setValue(4, crncyCd);
		setValue(5, skuPrcAmt);
		setValue(6, cmpntDiscntPct);
		setValue(7, creatTs);
		setValue(8, creatUserId);
		setValue(9, lastUpdtTs);
		setValue(10, lastUpdtUserId);
	}
}