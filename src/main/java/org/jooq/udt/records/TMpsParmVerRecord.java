/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.TMpsParmVer;


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
public class TMpsParmVerRecord extends UDTRecordImpl<TMpsParmVerRecord> implements Record2<BigDecimal, BigDecimal> {

	private static final long serialVersionUID = -188892525;

	/**
	 * Setter for <code>WETRN.T_MPS_PARM_VER.VER_ID</code>.
	 */
	public void setVerId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.T_MPS_PARM_VER.VER_ID</code>.
	 */
	public BigDecimal getVerId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.T_MPS_PARM_VER.SEQ_NR</code>.
	 */
	public void setSeqNr(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.T_MPS_PARM_VER.SEQ_NR</code>.
	 */
	public BigDecimal getSeqNr() {
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
		return TMpsParmVer.VER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return TMpsParmVer.SEQ_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getVerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getSeqNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMpsParmVerRecord value1(BigDecimal value) {
		setVerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMpsParmVerRecord value2(BigDecimal value) {
		setSeqNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMpsParmVerRecord values(BigDecimal value1, BigDecimal value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TMpsParmVerRecord
	 */
	public TMpsParmVerRecord() {
		super(TMpsParmVer.T_MPS_PARM_VER);
	}

	/**
	 * Create a detached, initialised TMpsParmVerRecord
	 */
	public TMpsParmVerRecord(BigDecimal verId, BigDecimal seqNr) {
		super(TMpsParmVer.T_MPS_PARM_VER);

		setValue(0, verId);
		setValue(1, seqNr);
	}
}