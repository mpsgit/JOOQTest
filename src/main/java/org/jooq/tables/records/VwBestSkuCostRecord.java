/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.VwBestSkuCost;


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
public class VwBestSkuCostRecord extends TableRecordImpl<VwBestSkuCostRecord> implements Record10<BigDecimal, BigDecimal, BigDecimal, String, String, BigDecimal, String, Date, String, Date> {

	private static final long serialVersionUID = -885997264;

	/**
	 * Setter for <code>WETRN.VW_BEST_SKU_COST.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.VW_BEST_SKU_COST.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.VW_BEST_SKU_COST.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.VW_BEST_SKU_COST.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.VW_BEST_SKU_COST.SKU_ID</code>.
	 */
	public void setSkuId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.VW_BEST_SKU_COST.SKU_ID</code>.
	 */
	public BigDecimal getSkuId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.VW_BEST_SKU_COST.COST_TYP</code>.
	 */
	public void setCostTyp(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.VW_BEST_SKU_COST.COST_TYP</code>.
	 */
	public String getCostTyp() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.VW_BEST_SKU_COST.CRNCY_CD</code>.
	 */
	public void setCrncyCd(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.VW_BEST_SKU_COST.CRNCY_CD</code>.
	 */
	public String getCrncyCd() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.VW_BEST_SKU_COST.WGHTD_AVG_COST_AMT</code>.
	 */
	public void setWghtdAvgCostAmt(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.VW_BEST_SKU_COST.WGHTD_AVG_COST_AMT</code>.
	 */
	public BigDecimal getWghtdAvgCostAmt() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.VW_BEST_SKU_COST.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.VW_BEST_SKU_COST.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.VW_BEST_SKU_COST.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.VW_BEST_SKU_COST.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.VW_BEST_SKU_COST.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.VW_BEST_SKU_COST.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.VW_BEST_SKU_COST.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.VW_BEST_SKU_COST.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<BigDecimal, BigDecimal, BigDecimal, String, String, BigDecimal, String, Date, String, Date> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<BigDecimal, BigDecimal, BigDecimal, String, String, BigDecimal, String, Date, String, Date> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return VwBestSkuCost.VW_BEST_SKU_COST.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return VwBestSkuCost.VW_BEST_SKU_COST.OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return VwBestSkuCost.VW_BEST_SKU_COST.SKU_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return VwBestSkuCost.VW_BEST_SKU_COST.COST_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return VwBestSkuCost.VW_BEST_SKU_COST.CRNCY_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return VwBestSkuCost.VW_BEST_SKU_COST.WGHTD_AVG_COST_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return VwBestSkuCost.VW_BEST_SKU_COST.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return VwBestSkuCost.VW_BEST_SKU_COST.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return VwBestSkuCost.VW_BEST_SKU_COST.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return VwBestSkuCost.VW_BEST_SKU_COST.LAST_UPDT_TS;
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
		return getCostTyp();
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
		return getWghtdAvgCostAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getCreatUserId();
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
		return getLastUpdtUserId();
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
	public VwBestSkuCostRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VwBestSkuCostRecord value2(BigDecimal value) {
		setOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VwBestSkuCostRecord value3(BigDecimal value) {
		setSkuId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VwBestSkuCostRecord value4(String value) {
		setCostTyp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VwBestSkuCostRecord value5(String value) {
		setCrncyCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VwBestSkuCostRecord value6(BigDecimal value) {
		setWghtdAvgCostAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VwBestSkuCostRecord value7(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VwBestSkuCostRecord value8(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VwBestSkuCostRecord value9(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VwBestSkuCostRecord value10(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VwBestSkuCostRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, String value4, String value5, BigDecimal value6, String value7, Date value8, String value9, Date value10) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VwBestSkuCostRecord
	 */
	public VwBestSkuCostRecord() {
		super(VwBestSkuCost.VW_BEST_SKU_COST);
	}

	/**
	 * Create a detached, initialised VwBestSkuCostRecord
	 */
	public VwBestSkuCostRecord(BigDecimal mrktId, BigDecimal offrPerdId, BigDecimal skuId, String costTyp, String crncyCd, BigDecimal wghtdAvgCostAmt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(VwBestSkuCost.VW_BEST_SKU_COST);

		setValue(0, mrktId);
		setValue(1, offrPerdId);
		setValue(2, skuId);
		setValue(3, costTyp);
		setValue(4, crncyCd);
		setValue(5, wghtdAvgCostAmt);
		setValue(6, creatUserId);
		setValue(7, creatTs);
		setValue(8, lastUpdtUserId);
		setValue(9, lastUpdtTs);
	}
}
