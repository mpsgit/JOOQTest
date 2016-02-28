/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.TempOffrPrflPrcPoint;


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
public class TempOffrPrflPrcPointRecord extends TableRecordImpl<TempOffrPrflPrcPointRecord> implements Record2<BigDecimal, BigDecimal> {

	private static final long serialVersionUID = -1177311727;

	/**
	 * Setter for <code>WETRN.TEMP_OFFR_PRFL_PRC_POINT.OFFR_PRFL_PRCPT_ID</code>.
	 */
	public void setOffrPrflPrcptId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.TEMP_OFFR_PRFL_PRC_POINT.OFFR_PRFL_PRCPT_ID</code>.
	 */
	public BigDecimal getOffrPrflPrcptId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.TEMP_OFFR_PRFL_PRC_POINT.REG_PRC_AMT</code>.
	 */
	public void setRegPrcAmt(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.TEMP_OFFR_PRFL_PRC_POINT.REG_PRC_AMT</code>.
	 */
	public BigDecimal getRegPrcAmt() {
		return (BigDecimal) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<BigDecimal, BigDecimal> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<BigDecimal, BigDecimal> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return TempOffrPrflPrcPoint.TEMP_OFFR_PRFL_PRC_POINT.OFFR_PRFL_PRCPT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return TempOffrPrflPrcPoint.TEMP_OFFR_PRFL_PRC_POINT.REG_PRC_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getOffrPrflPrcptId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getRegPrcAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TempOffrPrflPrcPointRecord value1(BigDecimal value) {
		setOffrPrflPrcptId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TempOffrPrflPrcPointRecord value2(BigDecimal value) {
		setRegPrcAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TempOffrPrflPrcPointRecord values(BigDecimal value1, BigDecimal value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TempOffrPrflPrcPointRecord
	 */
	public TempOffrPrflPrcPointRecord() {
		super(TempOffrPrflPrcPoint.TEMP_OFFR_PRFL_PRC_POINT);
	}

	/**
	 * Create a detached, initialised TempOffrPrflPrcPointRecord
	 */
	public TempOffrPrflPrcPointRecord(BigDecimal offrPrflPrcptId, BigDecimal regPrcAmt) {
		super(TempOffrPrflPrcPoint.TEMP_OFFR_PRFL_PRC_POINT);

		setValue(0, offrPrflPrcptId);
		setValue(1, regPrcAmt);
	}
}