/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.THkMrktRltnshpAdd;


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
public class THkMrktRltnshpAddRecord extends UDTRecordImpl<THkMrktRltnshpAddRecord> implements Record5<BigDecimal, String, BigDecimal, BigDecimal, BigDecimal> {

	private static final long serialVersionUID = 179734441;

	/**
	 * Setter for <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.SRCE_MRKT_ID</code>.
	 */
	public void setSrceMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.SRCE_MRKT_ID</code>.
	 */
	public BigDecimal getSrceMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.SRCE_MRKT_NM</code>.
	 */
	public void setSrceMrktNm(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.SRCE_MRKT_NM</code>.
	 */
	public String getSrceMrktNm() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.TRGT_MRKT_ID</code>.
	 */
	public void setTrgtMrktId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.TRGT_MRKT_ID</code>.
	 */
	public BigDecimal getTrgtMrktId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.TRGT_STRT_OFFR_PERD_ID</code>.
	 */
	public void setTrgtStrtOffrPerdId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.TRGT_STRT_OFFR_PERD_ID</code>.
	 */
	public BigDecimal getTrgtStrtOffrPerdId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.TRGT_END_OFFR_PERD_ID</code>.
	 */
	public void setTrgtEndOffrPerdId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.TRGT_END_OFFR_PERD_ID</code>.
	 */
	public BigDecimal getTrgtEndOffrPerdId() {
		return (BigDecimal) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<BigDecimal, String, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<BigDecimal, String, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return THkMrktRltnshpAdd.SRCE_MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return THkMrktRltnshpAdd.SRCE_MRKT_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return THkMrktRltnshpAdd.TRGT_MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return THkMrktRltnshpAdd.TRGT_STRT_OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return THkMrktRltnshpAdd.TRGT_END_OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getSrceMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getSrceMrktNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getTrgtMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getTrgtStrtOffrPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getTrgtEndOffrPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public THkMrktRltnshpAddRecord value1(BigDecimal value) {
		setSrceMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public THkMrktRltnshpAddRecord value2(String value) {
		setSrceMrktNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public THkMrktRltnshpAddRecord value3(BigDecimal value) {
		setTrgtMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public THkMrktRltnshpAddRecord value4(BigDecimal value) {
		setTrgtStrtOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public THkMrktRltnshpAddRecord value5(BigDecimal value) {
		setTrgtEndOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public THkMrktRltnshpAddRecord values(BigDecimal value1, String value2, BigDecimal value3, BigDecimal value4, BigDecimal value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached THkMrktRltnshpAddRecord
	 */
	public THkMrktRltnshpAddRecord() {
		super(THkMrktRltnshpAdd.T_HK_MRKT_RLTNSHP_ADD);
	}

	/**
	 * Create a detached, initialised THkMrktRltnshpAddRecord
	 */
	public THkMrktRltnshpAddRecord(BigDecimal srceMrktId, String srceMrktNm, BigDecimal trgtMrktId, BigDecimal trgtStrtOffrPerdId, BigDecimal trgtEndOffrPerdId) {
		super(THkMrktRltnshpAdd.T_HK_MRKT_RLTNSHP_ADD);

		setValue(0, srceMrktId);
		setValue(1, srceMrktNm);
		setValue(2, trgtMrktId);
		setValue(3, trgtStrtOffrPerdId);
		setValue(4, trgtEndOffrPerdId);
	}
}
