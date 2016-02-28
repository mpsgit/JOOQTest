/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.MrktgProdRspbltySgmt;


/**
 * snapshot table for snapshot ESCON.MRKTG_PROD_RSPBLTY_SGMT
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MrktgProdRspbltySgmtRecord extends TableRecordImpl<MrktgProdRspbltySgmtRecord> implements Record3<BigDecimal, BigDecimal, BigDecimal> {

	private static final long serialVersionUID = 1623226695;

	/**
	 * Setter for <code>WETRN.MRKTG_PROD_RSPBLTY_SGMT.MRKTG_PROD_RSPBLTY_ID</code>.
	 */
	public void setMrktgProdRspbltyId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKTG_PROD_RSPBLTY_SGMT.MRKTG_PROD_RSPBLTY_ID</code>.
	 */
	public BigDecimal getMrktgProdRspbltyId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKTG_PROD_RSPBLTY_SGMT.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKTG_PROD_RSPBLTY_SGMT.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKTG_PROD_RSPBLTY_SGMT.SGMT_ID</code>.
	 */
	public void setSgmtId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKTG_PROD_RSPBLTY_SGMT.SGMT_ID</code>.
	 */
	public BigDecimal getSgmtId() {
		return (BigDecimal) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<BigDecimal, BigDecimal, BigDecimal> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MrktgProdRspbltySgmt.MRKTG_PROD_RSPBLTY_SGMT.MRKTG_PROD_RSPBLTY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MrktgProdRspbltySgmt.MRKTG_PROD_RSPBLTY_SGMT.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return MrktgProdRspbltySgmt.MRKTG_PROD_RSPBLTY_SGMT.SGMT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getMrktgProdRspbltyId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getSgmtId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktgProdRspbltySgmtRecord value1(BigDecimal value) {
		setMrktgProdRspbltyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktgProdRspbltySgmtRecord value2(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktgProdRspbltySgmtRecord value3(BigDecimal value) {
		setSgmtId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktgProdRspbltySgmtRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MrktgProdRspbltySgmtRecord
	 */
	public MrktgProdRspbltySgmtRecord() {
		super(MrktgProdRspbltySgmt.MRKTG_PROD_RSPBLTY_SGMT);
	}

	/**
	 * Create a detached, initialised MrktgProdRspbltySgmtRecord
	 */
	public MrktgProdRspbltySgmtRecord(BigDecimal mrktgProdRspbltyId, BigDecimal mrktId, BigDecimal sgmtId) {
		super(MrktgProdRspbltySgmt.MRKTG_PROD_RSPBLTY_SGMT);

		setValue(0, mrktgProdRspbltyId);
		setValue(1, mrktId);
		setValue(2, sgmtId);
	}
}