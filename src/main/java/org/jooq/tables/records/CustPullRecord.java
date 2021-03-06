/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.CustPull;


/**
 * Customer Pulls are effectively a second Promotion Claim that can optionally 
 * be applied to any CENA offer
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustPullRecord extends UpdatableRecordImpl<CustPullRecord> implements Record9<BigDecimal, String, String, String, String, String, Date, String, Date> {

	private static final long serialVersionUID = -1775159423;

	/**
	 * Setter for <code>WETRN.CUST_PULL.CUST_PULL_ID</code>. identifies the unique occurrence of a Customer Pull
	 */
	public void setCustPullId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.CUST_PULL.CUST_PULL_ID</code>. identifies the unique occurrence of a Customer Pull
	 */
	public BigDecimal getCustPullId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.CUST_PULL.CUST_PULL_DESC_TXT</code>. The description of the CUSTOMER PULL
	 */
	public void setCustPullDescTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.CUST_PULL.CUST_PULL_DESC_TXT</code>. The description of the CUSTOMER PULL
	 */
	public String getCustPullDescTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.CUST_PULL.CUST_PULL_SDESC_TXT</code>. The short description of the CUSTOMER PULL
	 */
	public void setCustPullSdescTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.CUST_PULL.CUST_PULL_SDESC_TXT</code>. The short description of the CUSTOMER PULL
	 */
	public String getCustPullSdescTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.CUST_PULL.CUST_PULL_JDE_CD</code>. The JDE code of the CUSTOMER PULL
	 */
	public void setCustPullJdeCd(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.CUST_PULL.CUST_PULL_JDE_CD</code>. The JDE code of the CUSTOMER PULL
	 */
	public String getCustPullJdeCd() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.CUST_PULL.DLTD_IND</code>. Used to control a logical deletion of a value, user can not use in future, but history will show the value
	 */
	public void setDltdInd(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.CUST_PULL.DLTD_IND</code>. Used to control a logical deletion of a value, user can not use in future, but history will show the value
	 */
	public String getDltdInd() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.CUST_PULL.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public void setCreatUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.CUST_PULL.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public String getCreatUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.CUST_PULL.CREAT_TS</code>. The date and time the row was created.
	 */
	public void setCreatTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.CUST_PULL.CREAT_TS</code>. The date and time the row was created.
	 */
	public Date getCreatTs() {
		return (Date) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.CUST_PULL.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.CUST_PULL.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.CUST_PULL.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.CUST_PULL.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, String, String, String, String, String, Date, String, Date> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, String, String, String, String, String, Date, String, Date> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return CustPull.CUST_PULL.CUST_PULL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return CustPull.CUST_PULL.CUST_PULL_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return CustPull.CUST_PULL.CUST_PULL_SDESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return CustPull.CUST_PULL.CUST_PULL_JDE_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return CustPull.CUST_PULL.DLTD_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return CustPull.CUST_PULL.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return CustPull.CUST_PULL.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return CustPull.CUST_PULL.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field9() {
		return CustPull.CUST_PULL.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getCustPullId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getCustPullDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getCustPullSdescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getCustPullJdeCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getDltdInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value7() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value9() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustPullRecord value1(BigDecimal value) {
		setCustPullId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustPullRecord value2(String value) {
		setCustPullDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustPullRecord value3(String value) {
		setCustPullSdescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustPullRecord value4(String value) {
		setCustPullJdeCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustPullRecord value5(String value) {
		setDltdInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustPullRecord value6(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustPullRecord value7(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustPullRecord value8(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustPullRecord value9(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustPullRecord values(BigDecimal value1, String value2, String value3, String value4, String value5, String value6, Date value7, String value8, Date value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CustPullRecord
	 */
	public CustPullRecord() {
		super(CustPull.CUST_PULL);
	}

	/**
	 * Create a detached, initialised CustPullRecord
	 */
	public CustPullRecord(BigDecimal custPullId, String custPullDescTxt, String custPullSdescTxt, String custPullJdeCd, String dltdInd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(CustPull.CUST_PULL);

		setValue(0, custPullId);
		setValue(1, custPullDescTxt);
		setValue(2, custPullSdescTxt);
		setValue(3, custPullJdeCd);
		setValue(4, dltdInd);
		setValue(5, creatUserId);
		setValue(6, creatTs);
		setValue(7, lastUpdtUserId);
		setValue(8, lastUpdtTs);
	}
}
