/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.TEditOffrPlannedTrgtMtrcs;


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
public class TEditOffrPlannedTrgtMtrcsRecord extends UDTRecordImpl<TEditOffrPlannedTrgtMtrcsRecord> implements Record9<BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> {

	private static final long serialVersionUID = 1964254044;

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.OFFR_CLS_ID</code>.
	 */
	public void setOffrClsId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.OFFR_CLS_ID</code>.
	 */
	public BigDecimal getOffrClsId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.SLSDESC</code>.
	 */
	public void setSlsdesc(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.SLSDESC</code>.
	 */
	public String getSlsdesc() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.UNITS</code>.
	 */
	public void setUnits(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.UNITS</code>.
	 */
	public BigDecimal getUnits() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.SALES</code>.
	 */
	public void setSales(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.SALES</code>.
	 */
	public BigDecimal getSales() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.SALES_DOLLARS</code>.
	 */
	public void setSalesDollars(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.SALES_DOLLARS</code>.
	 */
	public BigDecimal getSalesDollars() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.COST</code>.
	 */
	public void setCost(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.COST</code>.
	 */
	public BigDecimal getCost() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.COST_DOLLARS</code>.
	 */
	public void setCostDollars(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.COST_DOLLARS</code>.
	 */
	public BigDecimal getCostDollars() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.NUM_REPS</code>.
	 */
	public void setNumReps(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.NUM_REPS</code>.
	 */
	public BigDecimal getNumReps() {
		return (BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.ORDER_COUNT</code>.
	 */
	public void setOrderCount(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.ORDER_COUNT</code>.
	 */
	public BigDecimal getOrderCount() {
		return (BigDecimal) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return TEditOffrPlannedTrgtMtrcs.OFFR_CLS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TEditOffrPlannedTrgtMtrcs.SLSDESC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return TEditOffrPlannedTrgtMtrcs.UNITS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return TEditOffrPlannedTrgtMtrcs.SALES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return TEditOffrPlannedTrgtMtrcs.SALES_DOLLARS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return TEditOffrPlannedTrgtMtrcs.COST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field7() {
		return TEditOffrPlannedTrgtMtrcs.COST_DOLLARS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field8() {
		return TEditOffrPlannedTrgtMtrcs.NUM_REPS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return TEditOffrPlannedTrgtMtrcs.ORDER_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getOffrClsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getSlsdesc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getUnits();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getSales();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getSalesDollars();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getCost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value7() {
		return getCostDollars();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value8() {
		return getNumReps();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value9() {
		return getOrderCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrPlannedTrgtMtrcsRecord value1(BigDecimal value) {
		setOffrClsId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrPlannedTrgtMtrcsRecord value2(String value) {
		setSlsdesc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrPlannedTrgtMtrcsRecord value3(BigDecimal value) {
		setUnits(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrPlannedTrgtMtrcsRecord value4(BigDecimal value) {
		setSales(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrPlannedTrgtMtrcsRecord value5(BigDecimal value) {
		setSalesDollars(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrPlannedTrgtMtrcsRecord value6(BigDecimal value) {
		setCost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrPlannedTrgtMtrcsRecord value7(BigDecimal value) {
		setCostDollars(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrPlannedTrgtMtrcsRecord value8(BigDecimal value) {
		setNumReps(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrPlannedTrgtMtrcsRecord value9(BigDecimal value) {
		setOrderCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrPlannedTrgtMtrcsRecord values(BigDecimal value1, String value2, BigDecimal value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, BigDecimal value8, BigDecimal value9) {
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
	 * Create a detached TEditOffrPlannedTrgtMtrcsRecord
	 */
	public TEditOffrPlannedTrgtMtrcsRecord() {
		super(TEditOffrPlannedTrgtMtrcs.T_EDIT_OFFR_PLANNED_TRGT_MTRCS);
	}

	/**
	 * Create a detached, initialised TEditOffrPlannedTrgtMtrcsRecord
	 */
	public TEditOffrPlannedTrgtMtrcsRecord(BigDecimal offrClsId, String slsdesc, BigDecimal units, BigDecimal sales, BigDecimal salesDollars, BigDecimal cost, BigDecimal costDollars, BigDecimal numReps, BigDecimal orderCount) {
		super(TEditOffrPlannedTrgtMtrcs.T_EDIT_OFFR_PLANNED_TRGT_MTRCS);

		setValue(0, offrClsId);
		setValue(1, slsdesc);
		setValue(2, units);
		setValue(3, sales);
		setValue(4, salesDollars);
		setValue(5, cost);
		setValue(6, costDollars);
		setValue(7, numReps);
		setValue(8, orderCount);
	}
}
