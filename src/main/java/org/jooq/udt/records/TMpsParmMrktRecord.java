/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.TMpsParmMrkt;


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
public class TMpsParmMrktRecord extends UDTRecordImpl<TMpsParmMrktRecord> implements Record4<BigDecimal, String, BigDecimal, BigDecimal> {

	private static final long serialVersionUID = 1551920223;

	/**
	 * Setter for <code>WETRN.T_MPS_PARM_MRKT.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.T_MPS_PARM_MRKT.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.T_MPS_PARM_MRKT.RTAIN_SLS_PRC_IND</code>.
	 */
	public void setRtainSlsPrcInd(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.T_MPS_PARM_MRKT.RTAIN_SLS_PRC_IND</code>.
	 */
	public String getRtainSlsPrcInd() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.T_MPS_PARM_MRKT.COPY_UNITS_RUL_ID</code>.
	 */
	public void setCopyUnitsRulId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.T_MPS_PARM_MRKT.COPY_UNITS_RUL_ID</code>.
	 */
	public BigDecimal getCopyUnitsRulId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.T_MPS_PARM_MRKT.SEQ_NR</code>.
	 */
	public void setSeqNr(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.T_MPS_PARM_MRKT.SEQ_NR</code>.
	 */
	public BigDecimal getSeqNr() {
		return (BigDecimal) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<BigDecimal, String, BigDecimal, BigDecimal> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<BigDecimal, String, BigDecimal, BigDecimal> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return TMpsParmMrkt.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TMpsParmMrkt.RTAIN_SLS_PRC_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return TMpsParmMrkt.COPY_UNITS_RUL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return TMpsParmMrkt.SEQ_NR;
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
	public String value2() {
		return getRtainSlsPrcInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getCopyUnitsRulId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getSeqNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMpsParmMrktRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMpsParmMrktRecord value2(String value) {
		setRtainSlsPrcInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMpsParmMrktRecord value3(BigDecimal value) {
		setCopyUnitsRulId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMpsParmMrktRecord value4(BigDecimal value) {
		setSeqNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMpsParmMrktRecord values(BigDecimal value1, String value2, BigDecimal value3, BigDecimal value4) {
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
	 * Create a detached TMpsParmMrktRecord
	 */
	public TMpsParmMrktRecord() {
		super(TMpsParmMrkt.T_MPS_PARM_MRKT);
	}

	/**
	 * Create a detached, initialised TMpsParmMrktRecord
	 */
	public TMpsParmMrktRecord(BigDecimal mrktId, String rtainSlsPrcInd, BigDecimal copyUnitsRulId, BigDecimal seqNr) {
		super(TMpsParmMrkt.T_MPS_PARM_MRKT);

		setValue(0, mrktId);
		setValue(1, rtainSlsPrcInd);
		setValue(2, copyUnitsRulId);
		setValue(3, seqNr);
	}
}
