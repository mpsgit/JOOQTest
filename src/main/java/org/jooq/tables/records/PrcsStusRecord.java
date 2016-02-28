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
import org.jooq.tables.PrcsStus;


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
public class PrcsStusRecord extends UpdatableRecordImpl<PrcsStusRecord> implements Record6<BigDecimal, String, String, Date, String, Date> {

	private static final long serialVersionUID = -140883540;

	/**
	 * Setter for <code>WETRN.PRCS_STUS.PRCS_STUS_ID</code>.
	 */
	public void setPrcsStusId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.PRCS_STUS.PRCS_STUS_ID</code>.
	 */
	public BigDecimal getPrcsStusId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.PRCS_STUS.PRCS_STUS_SDEC_TXT</code>.
	 */
	public void setPrcsStusSdecTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.PRCS_STUS.PRCS_STUS_SDEC_TXT</code>.
	 */
	public String getPrcsStusSdecTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.PRCS_STUS.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.PRCS_STUS.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.PRCS_STUS.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.PRCS_STUS.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.PRCS_STUS.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.PRCS_STUS.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.PRCS_STUS.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.PRCS_STUS.LAST_UPDT_TS</code>.
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
		return PrcsStus.PRCS_STUS.PRCS_STUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return PrcsStus.PRCS_STUS.PRCS_STUS_SDEC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return PrcsStus.PRCS_STUS.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return PrcsStus.PRCS_STUS.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return PrcsStus.PRCS_STUS.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return PrcsStus.PRCS_STUS.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getPrcsStusId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getPrcsStusSdecTxt();
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
	public PrcsStusRecord value1(BigDecimal value) {
		setPrcsStusId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrcsStusRecord value2(String value) {
		setPrcsStusSdecTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrcsStusRecord value3(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrcsStusRecord value4(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrcsStusRecord value5(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrcsStusRecord value6(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrcsStusRecord values(BigDecimal value1, String value2, String value3, Date value4, String value5, Date value6) {
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
	 * Create a detached PrcsStusRecord
	 */
	public PrcsStusRecord() {
		super(PrcsStus.PRCS_STUS);
	}

	/**
	 * Create a detached, initialised PrcsStusRecord
	 */
	public PrcsStusRecord(BigDecimal prcsStusId, String prcsStusSdecTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(PrcsStus.PRCS_STUS);

		setValue(0, prcsStusId);
		setValue(1, prcsStusSdecTxt);
		setValue(2, creatUserId);
		setValue(3, creatTs);
		setValue(4, lastUpdtUserId);
		setValue(5, lastUpdtTs);
	}
}