/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.OffrPrsntnStrnth;


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
public class OffrPrsntnStrnthRecord extends UpdatableRecordImpl<OffrPrsntnStrnthRecord> implements Record6<BigDecimal, String, String, Date, String, Date> {

	private static final long serialVersionUID = -293732753;

	/**
	 * Setter for <code>WETRN.OFFR_PRSNTN_STRNTH.OFFR_PRSNTN_STRNTH_ID</code>.
	 */
	public void setOffrPrsntnStrnthId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRSNTN_STRNTH.OFFR_PRSNTN_STRNTH_ID</code>.
	 */
	public BigDecimal getOffrPrsntnStrnthId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRSNTN_STRNTH.OFFR_PRSNTN_STRNTH_NM</code>.
	 */
	public void setOffrPrsntnStrnthNm(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRSNTN_STRNTH.OFFR_PRSNTN_STRNTH_NM</code>.
	 */
	public String getOffrPrsntnStrnthNm() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRSNTN_STRNTH.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRSNTN_STRNTH.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRSNTN_STRNTH.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRSNTN_STRNTH.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRSNTN_STRNTH.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRSNTN_STRNTH.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRSNTN_STRNTH.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRSNTN_STRNTH.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<BigDecimal> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<BigDecimal, String, String, Date, String, Date> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<BigDecimal, String, String, Date, String, Date> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return OffrPrsntnStrnth.OFFR_PRSNTN_STRNTH.OFFR_PRSNTN_STRNTH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return OffrPrsntnStrnth.OFFR_PRSNTN_STRNTH.OFFR_PRSNTN_STRNTH_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return OffrPrsntnStrnth.OFFR_PRSNTN_STRNTH.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return OffrPrsntnStrnth.OFFR_PRSNTN_STRNTH.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return OffrPrsntnStrnth.OFFR_PRSNTN_STRNTH.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return OffrPrsntnStrnth.OFFR_PRSNTN_STRNTH.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getOffrPrsntnStrnthId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getOffrPrsntnStrnthNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value4() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value6() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrPrsntnStrnthRecord value1(BigDecimal value) {
		setOffrPrsntnStrnthId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrPrsntnStrnthRecord value2(String value) {
		setOffrPrsntnStrnthNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrPrsntnStrnthRecord value3(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrPrsntnStrnthRecord value4(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrPrsntnStrnthRecord value5(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrPrsntnStrnthRecord value6(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrPrsntnStrnthRecord values(BigDecimal value1, String value2, String value3, Date value4, String value5, Date value6) {
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
	 * Create a detached OffrPrsntnStrnthRecord
	 */
	public OffrPrsntnStrnthRecord() {
		super(OffrPrsntnStrnth.OFFR_PRSNTN_STRNTH);
	}

	/**
	 * Create a detached, initialised OffrPrsntnStrnthRecord
	 */
	public OffrPrsntnStrnthRecord(BigDecimal offrPrsntnStrnthId, String offrPrsntnStrnthNm, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(OffrPrsntnStrnth.OFFR_PRSNTN_STRNTH);

		setValue(0, offrPrsntnStrnthId);
		setValue(1, offrPrsntnStrnthNm);
		setValue(2, creatUserId);
		setValue(3, creatTs);
		setValue(4, lastUpdtUserId);
		setValue(5, lastUpdtTs);
	}
}
