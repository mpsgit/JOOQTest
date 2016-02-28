/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.VBestCost;


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
public class VBestCostRecord extends TableRecordImpl<VBestCostRecord> implements Record4<BigDecimal, BigDecimal, BigDecimal, BigDecimal> {

	private static final long serialVersionUID = -1886022833;

	/**
	 * Setter for <code>WETRN.V_BEST_COST.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.V_BEST_COST.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.V_BEST_COST.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.V_BEST_COST.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.V_BEST_COST.SKU_ID</code>.
	 */
	public void setSkuId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.V_BEST_COST.SKU_ID</code>.
	 */
	public BigDecimal getSkuId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.V_BEST_COST.BEST_COST</code>.
	 */
	public void setBestCost(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.V_BEST_COST.BEST_COST</code>.
	 */
	public BigDecimal getBestCost() {
		return (BigDecimal) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<BigDecimal, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return VBestCost.V_BEST_COST.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return VBestCost.V_BEST_COST.OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return VBestCost.V_BEST_COST.SKU_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return VBestCost.V_BEST_COST.BEST_COST;
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
	public BigDecimal value4() {
		return getBestCost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBestCostRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBestCostRecord value2(BigDecimal value) {
		setOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBestCostRecord value3(BigDecimal value) {
		setSkuId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBestCostRecord value4(BigDecimal value) {
		setBestCost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBestCostRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VBestCostRecord
	 */
	public VBestCostRecord() {
		super(VBestCost.V_BEST_COST);
	}

	/**
	 * Create a detached, initialised VBestCostRecord
	 */
	public VBestCostRecord(BigDecimal mrktId, BigDecimal offrPerdId, BigDecimal skuId, BigDecimal bestCost) {
		super(VBestCost.V_BEST_COST);

		setValue(0, mrktId);
		setValue(1, offrPerdId);
		setValue(2, skuId);
		setValue(3, bestCost);
	}
}
