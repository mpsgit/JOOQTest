/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.SlsStus;


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
public class SlsStusRecord extends UpdatableRecordImpl<SlsStusRecord> implements Record8<String, String, String, Date, String, Date, BigDecimal, String> {

	private static final long serialVersionUID = 25198816;

	/**
	 * Setter for <code>WETRN.SLS_STUS.SLS_STUS_CD</code>.
	 */
	public void setSlsStusCd(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_STUS.SLS_STUS_CD</code>.
	 */
	public String getSlsStusCd() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.SLS_STUS.SLS_STUS_DESC_TXT</code>.
	 */
	public void setSlsStusDescTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_STUS.SLS_STUS_DESC_TXT</code>.
	 */
	public String getSlsStusDescTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.SLS_STUS.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_STUS.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.SLS_STUS.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_STUS.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.SLS_STUS.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_STUS.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.SLS_STUS.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_STUS.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.SLS_STUS.SEQ_NR</code>.
	 */
	public void setSeqNr(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_STUS.SEQ_NR</code>.
	 */
	public BigDecimal getSeqNr() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.SLS_STUS.DFALT_IND</code>.
	 */
	public void setDfaltInd(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_STUS.DFALT_IND</code>.
	 */
	public String getDfaltInd() {
		return (String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<String, String, String, Date, String, Date, BigDecimal, String> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<String, String, String, Date, String, Date, BigDecimal, String> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return SlsStus.SLS_STUS.SLS_STUS_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return SlsStus.SLS_STUS.SLS_STUS_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return SlsStus.SLS_STUS.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return SlsStus.SLS_STUS.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return SlsStus.SLS_STUS.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return SlsStus.SLS_STUS.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field7() {
		return SlsStus.SLS_STUS.SEQ_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return SlsStus.SLS_STUS.DFALT_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getSlsStusCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getSlsStusDescTxt();
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
	public BigDecimal value7() {
		return getSeqNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getDfaltInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsStusRecord value1(String value) {
		setSlsStusCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsStusRecord value2(String value) {
		setSlsStusDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsStusRecord value3(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsStusRecord value4(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsStusRecord value5(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsStusRecord value6(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsStusRecord value7(BigDecimal value) {
		setSeqNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsStusRecord value8(String value) {
		setDfaltInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsStusRecord values(String value1, String value2, String value3, Date value4, String value5, Date value6, BigDecimal value7, String value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SlsStusRecord
	 */
	public SlsStusRecord() {
		super(SlsStus.SLS_STUS);
	}

	/**
	 * Create a detached, initialised SlsStusRecord
	 */
	public SlsStusRecord(String slsStusCd, String slsStusDescTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, BigDecimal seqNr, String dfaltInd) {
		super(SlsStus.SLS_STUS);

		setValue(0, slsStusCd);
		setValue(1, slsStusDescTxt);
		setValue(2, creatUserId);
		setValue(3, creatTs);
		setValue(4, lastUpdtUserId);
		setValue(5, lastUpdtTs);
		setValue(6, seqNr);
		setValue(7, dfaltInd);
	}
}