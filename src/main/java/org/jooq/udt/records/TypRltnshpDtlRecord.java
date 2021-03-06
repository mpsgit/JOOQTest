/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.TypRltnshpDtl;


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
public class TypRltnshpDtlRecord extends UDTRecordImpl<TypRltnshpDtlRecord> implements Record6<String, String, String, String, String, String> {

	private static final long serialVersionUID = 592763080;

	/**
	 * Setter for <code>WETRN.TYP_RLTNSHP_DTL.SRC_MRKT_ID</code>.
	 */
	public void setSrcMrktId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.TYP_RLTNSHP_DTL.SRC_MRKT_ID</code>.
	 */
	public String getSrcMrktId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.TYP_RLTNSHP_DTL.MRKT_ID</code>.
	 */
	public void setMrktId(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.TYP_RLTNSHP_DTL.MRKT_ID</code>.
	 */
	public String getMrktId() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.TYP_RLTNSHP_DTL.O_STRT_OFFR_PERD_ID</code>.
	 */
	public void setOStrtOffrPerdId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.TYP_RLTNSHP_DTL.O_STRT_OFFR_PERD_ID</code>.
	 */
	public String getOStrtOffrPerdId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.TYP_RLTNSHP_DTL.N_STRT_OFFR_PERD_ID</code>.
	 */
	public void setNStrtOffrPerdId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.TYP_RLTNSHP_DTL.N_STRT_OFFR_PERD_ID</code>.
	 */
	public String getNStrtOffrPerdId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.TYP_RLTNSHP_DTL.N_END_OFFR_PERD_ID</code>.
	 */
	public void setNEndOffrPerdId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.TYP_RLTNSHP_DTL.N_END_OFFR_PERD_ID</code>.
	 */
	public String getNEndOffrPerdId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.TYP_RLTNSHP_DTL.USER_NM</code>.
	 */
	public void setUserNm(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.TYP_RLTNSHP_DTL.USER_NM</code>.
	 */
	public String getUserNm() {
		return (String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, String, String, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, String, String, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return TypRltnshpDtl.SRC_MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TypRltnshpDtl.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return TypRltnshpDtl.O_STRT_OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TypRltnshpDtl.N_STRT_OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TypRltnshpDtl.N_END_OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return TypRltnshpDtl.USER_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getSrcMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getOStrtOffrPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getNStrtOffrPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getNEndOffrPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getUserNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TypRltnshpDtlRecord value1(String value) {
		setSrcMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TypRltnshpDtlRecord value2(String value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TypRltnshpDtlRecord value3(String value) {
		setOStrtOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TypRltnshpDtlRecord value4(String value) {
		setNStrtOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TypRltnshpDtlRecord value5(String value) {
		setNEndOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TypRltnshpDtlRecord value6(String value) {
		setUserNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TypRltnshpDtlRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TypRltnshpDtlRecord
	 */
	public TypRltnshpDtlRecord() {
		super(TypRltnshpDtl.TYP_RLTNSHP_DTL);
	}

	/**
	 * Create a detached, initialised TypRltnshpDtlRecord
	 */
	public TypRltnshpDtlRecord(String srcMrktId, String mrktId, String oStrtOffrPerdId, String nStrtOffrPerdId, String nEndOffrPerdId, String userNm) {
		super(TypRltnshpDtl.TYP_RLTNSHP_DTL);

		setValue(0, srcMrktId);
		setValue(1, mrktId);
		setValue(2, oStrtOffrPerdId);
		setValue(3, nStrtOffrPerdId);
		setValue(4, nEndOffrPerdId);
		setValue(5, userNm);
	}
}
