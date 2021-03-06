/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.AlternateLineNr;


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
public class AlternateLineNrRecord extends UDTRecordImpl<AlternateLineNrRecord> implements Record7<BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal> {

	private static final long serialVersionUID = -488581313;

	/**
	 * Setter for <code>WETRN.ALTERNATE_LINE_NR.BILNG_SYS_ID</code>.
	 */
	public void setBilngSysId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.ALTERNATE_LINE_NR.BILNG_SYS_ID</code>.
	 */
	public BigDecimal getBilngSysId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.ALTERNATE_LINE_NR.MARKET_ID</code>.
	 */
	public void setMarketId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.ALTERNATE_LINE_NR.MARKET_ID</code>.
	 */
	public BigDecimal getMarketId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.ALTERNATE_LINE_NR.LINE_NR</code>.
	 */
	public void setLineNr(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.ALTERNATE_LINE_NR.LINE_NR</code>.
	 */
	public String getLineNr() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.ALTERNATE_LINE_NR.LINE_NR_TYP_ID</code>.
	 */
	public void setLineNrTypId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.ALTERNATE_LINE_NR.LINE_NR_TYP_ID</code>.
	 */
	public BigDecimal getLineNrTypId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.ALTERNATE_LINE_NR.FRST_USED_PERD</code>.
	 */
	public void setFrstUsedPerd(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.ALTERNATE_LINE_NR.FRST_USED_PERD</code>.
	 */
	public BigDecimal getFrstUsedPerd() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.ALTERNATE_LINE_NR.LAST_USED_PERD</code>.
	 */
	public void setLastUsedPerd(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.ALTERNATE_LINE_NR.LAST_USED_PERD</code>.
	 */
	public BigDecimal getLastUsedPerd() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.ALTERNATE_LINE_NR.RNG_SEQ_NR</code>.
	 */
	public void setRngSeqNr(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.ALTERNATE_LINE_NR.RNG_SEQ_NR</code>.
	 */
	public BigDecimal getRngSeqNr() {
		return (BigDecimal) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return AlternateLineNr.BILNG_SYS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return AlternateLineNr.MARKET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return AlternateLineNr.LINE_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return AlternateLineNr.LINE_NR_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return AlternateLineNr.FRST_USED_PERD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return AlternateLineNr.LAST_USED_PERD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field7() {
		return AlternateLineNr.RNG_SEQ_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getBilngSysId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getMarketId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getLineNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getLineNrTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getFrstUsedPerd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getLastUsedPerd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value7() {
		return getRngSeqNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlternateLineNrRecord value1(BigDecimal value) {
		setBilngSysId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlternateLineNrRecord value2(BigDecimal value) {
		setMarketId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlternateLineNrRecord value3(String value) {
		setLineNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlternateLineNrRecord value4(BigDecimal value) {
		setLineNrTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlternateLineNrRecord value5(BigDecimal value) {
		setFrstUsedPerd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlternateLineNrRecord value6(BigDecimal value) {
		setLastUsedPerd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlternateLineNrRecord value7(BigDecimal value) {
		setRngSeqNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlternateLineNrRecord values(BigDecimal value1, BigDecimal value2, String value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, BigDecimal value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AlternateLineNrRecord
	 */
	public AlternateLineNrRecord() {
		super(AlternateLineNr.ALTERNATE_LINE_NR);
	}

	/**
	 * Create a detached, initialised AlternateLineNrRecord
	 */
	public AlternateLineNrRecord(BigDecimal bilngSysId, BigDecimal marketId, String lineNr, BigDecimal lineNrTypId, BigDecimal frstUsedPerd, BigDecimal lastUsedPerd, BigDecimal rngSeqNr) {
		super(AlternateLineNr.ALTERNATE_LINE_NR);

		setValue(0, bilngSysId);
		setValue(1, marketId);
		setValue(2, lineNr);
		setValue(3, lineNrTypId);
		setValue(4, frstUsedPerd);
		setValue(5, lastUsedPerd);
		setValue(6, rngSeqNr);
	}
}
