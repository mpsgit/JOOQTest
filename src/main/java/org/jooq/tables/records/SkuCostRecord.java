/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Record4;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.SkuCost;


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
public class SkuCostRecord extends UpdatableRecordImpl<SkuCostRecord> implements Record12<BigDecimal, BigDecimal, BigDecimal, String, String, BigDecimal, String, Date, String, Date, String, String> {

	private static final long serialVersionUID = 1204509583;

	/**
	 * Setter for <code>WETRN.SKU_COST.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.SKU_COST.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.SKU_COST.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.SKU_COST.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.SKU_COST.SKU_ID</code>.
	 */
	public void setSkuId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.SKU_COST.SKU_ID</code>.
	 */
	public BigDecimal getSkuId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.SKU_COST.COST_TYP</code>.
	 */
	public void setCostTyp(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.SKU_COST.COST_TYP</code>.
	 */
	public String getCostTyp() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.SKU_COST.CRNCY_CD</code>.
	 */
	public void setCrncyCd(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.SKU_COST.CRNCY_CD</code>.
	 */
	public String getCrncyCd() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.SKU_COST.WGHTD_AVG_COST_AMT</code>.
	 */
	public void setWghtdAvgCostAmt(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.SKU_COST.WGHTD_AVG_COST_AMT</code>.
	 */
	public BigDecimal getWghtdAvgCostAmt() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.SKU_COST.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.SKU_COST.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.SKU_COST.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.SKU_COST.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.SKU_COST.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.SKU_COST.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.SKU_COST.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.SKU_COST.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.SKU_COST.HOLD_COSTS_IND</code>.
	 */
	public void setHoldCostsInd(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.SKU_COST.HOLD_COSTS_IND</code>.
	 */
	public String getHoldCostsInd() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.SKU_COST.LCL_COST_IND</code>.
	 */
	public void setLclCostInd(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.SKU_COST.LCL_COST_IND</code>.
	 */
	public String getLclCostInd() {
		return (String) getValue(11);
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
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<BigDecimal, BigDecimal, BigDecimal, String, String, BigDecimal, String, Date, String, Date, String, String> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<BigDecimal, BigDecimal, BigDecimal, String, String, BigDecimal, String, Date, String, Date, String, String> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return SkuCost.SKU_COST.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return SkuCost.SKU_COST.OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return SkuCost.SKU_COST.SKU_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return SkuCost.SKU_COST.COST_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return SkuCost.SKU_COST.CRNCY_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return SkuCost.SKU_COST.WGHTD_AVG_COST_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return SkuCost.SKU_COST.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return SkuCost.SKU_COST.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return SkuCost.SKU_COST.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return SkuCost.SKU_COST.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return SkuCost.SKU_COST.HOLD_COSTS_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return SkuCost.SKU_COST.LCL_COST_IND;
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
	public String value11() {
		return getHoldCostsInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getLclCostInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuCostRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuCostRecord value2(BigDecimal value) {
		setOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuCostRecord value3(BigDecimal value) {
		setSkuId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuCostRecord value4(String value) {
		setCostTyp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuCostRecord value5(String value) {
		setCrncyCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuCostRecord value6(BigDecimal value) {
		setWghtdAvgCostAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuCostRecord value7(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuCostRecord value8(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuCostRecord value9(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuCostRecord value10(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuCostRecord value11(String value) {
		setHoldCostsInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuCostRecord value12(String value) {
		setLclCostInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuCostRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, String value4, String value5, BigDecimal value6, String value7, Date value8, String value9, Date value10, String value11, String value12) {
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
	 * Create a detached SkuCostRecord
	 */
	public SkuCostRecord() {
		super(SkuCost.SKU_COST);
	}

	/**
	 * Create a detached, initialised SkuCostRecord
	 */
	public SkuCostRecord(BigDecimal mrktId, BigDecimal offrPerdId, BigDecimal skuId, String costTyp, String crncyCd, BigDecimal wghtdAvgCostAmt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String holdCostsInd, String lclCostInd) {
		super(SkuCost.SKU_COST);

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
		setValue(10, holdCostsInd);
		setValue(11, lclCostInd);
	}
}
