/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.BilngLineNrGrpLkup;


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
public class BilngLineNrGrpLkupRecord extends UpdatableRecordImpl<BilngLineNrGrpLkupRecord> implements Record8<BigDecimal, BigDecimal, BigDecimal, String, String, Date, String, Date> {

	private static final long serialVersionUID = -824354479;

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.CLSTR_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public void setClstrId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.CLSTR_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public BigDecimal getClstrId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.BILNG_LINE_NR_GRP_ID</code>.
	 */
	public void setBilngLineNrGrpId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.BILNG_LINE_NR_GRP_ID</code>.
	 */
	public BigDecimal getBilngLineNrGrpId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.BILNG_LINE_NR_GRP_DESC_TXT</code>.
	 */
	public void setBilngLineNrGrpDescTxt(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.BILNG_LINE_NR_GRP_DESC_TXT</code>.
	 */
	public String getBilngLineNrGrpDescTxt() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public void setCreatUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public String getCreatUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.CREAT_TS</code>. The date and time the row was created.
	 */
	public void setCreatTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.CREAT_TS</code>. The date and time the row was created.
	 */
	public Date getCreatTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_GRP_LKUP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record3<BigDecimal, BigDecimal, BigDecimal> key() {
		return (Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, BigDecimal, BigDecimal, String, String, Date, String, Date> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, BigDecimal, BigDecimal, String, String, Date, String, Date> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return BilngLineNrGrpLkup.BILNG_LINE_NR_GRP_LKUP.CLSTR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return BilngLineNrGrpLkup.BILNG_LINE_NR_GRP_LKUP.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return BilngLineNrGrpLkup.BILNG_LINE_NR_GRP_LKUP.BILNG_LINE_NR_GRP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return BilngLineNrGrpLkup.BILNG_LINE_NR_GRP_LKUP.BILNG_LINE_NR_GRP_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return BilngLineNrGrpLkup.BILNG_LINE_NR_GRP_LKUP.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return BilngLineNrGrpLkup.BILNG_LINE_NR_GRP_LKUP.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return BilngLineNrGrpLkup.BILNG_LINE_NR_GRP_LKUP.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return BilngLineNrGrpLkup.BILNG_LINE_NR_GRP_LKUP.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getClstrId();
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
		return getBilngLineNrGrpId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getBilngLineNrGrpDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value6() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value8() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BilngLineNrGrpLkupRecord value1(BigDecimal value) {
		setClstrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BilngLineNrGrpLkupRecord value2(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BilngLineNrGrpLkupRecord value3(BigDecimal value) {
		setBilngLineNrGrpId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BilngLineNrGrpLkupRecord value4(String value) {
		setBilngLineNrGrpDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BilngLineNrGrpLkupRecord value5(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BilngLineNrGrpLkupRecord value6(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BilngLineNrGrpLkupRecord value7(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BilngLineNrGrpLkupRecord value8(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BilngLineNrGrpLkupRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, String value4, String value5, Date value6, String value7, Date value8) {
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
	 * Create a detached BilngLineNrGrpLkupRecord
	 */
	public BilngLineNrGrpLkupRecord() {
		super(BilngLineNrGrpLkup.BILNG_LINE_NR_GRP_LKUP);
	}

	/**
	 * Create a detached, initialised BilngLineNrGrpLkupRecord
	 */
	public BilngLineNrGrpLkupRecord(BigDecimal clstrId, BigDecimal mrktId, BigDecimal bilngLineNrGrpId, String bilngLineNrGrpDescTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(BilngLineNrGrpLkup.BILNG_LINE_NR_GRP_LKUP);

		setValue(0, clstrId);
		setValue(1, mrktId);
		setValue(2, bilngLineNrGrpId);
		setValue(3, bilngLineNrGrpDescTxt);
		setValue(4, creatUserId);
		setValue(5, creatTs);
		setValue(6, lastUpdtUserId);
		setValue(7, lastUpdtTs);
	}
}
