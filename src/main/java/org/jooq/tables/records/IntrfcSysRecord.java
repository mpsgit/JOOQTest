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
import org.jooq.tables.IntrfcSys;


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
public class IntrfcSysRecord extends UpdatableRecordImpl<IntrfcSysRecord> implements Record8<BigDecimal, String, String, String, String, Date, String, Date> {

	private static final long serialVersionUID = 492861305;

	/**
	 * Setter for <code>WETRN.INTRFC_SYS.INTRFC_SYS_ID</code>.
	 */
	public void setIntrfcSysId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.INTRFC_SYS.INTRFC_SYS_ID</code>.
	 */
	public BigDecimal getIntrfcSysId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.INTRFC_SYS.INTRFC_SYS_NM</code>.
	 */
	public void setIntrfcSysNm(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.INTRFC_SYS.INTRFC_SYS_NM</code>.
	 */
	public String getIntrfcSysNm() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.INTRFC_SYS.IP_ADDR_TXT</code>.
	 */
	public void setIpAddrTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.INTRFC_SYS.IP_ADDR_TXT</code>.
	 */
	public String getIpAddrTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.INTRFC_SYS.HOST_SERVR_NM</code>.
	 */
	public void setHostServrNm(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.INTRFC_SYS.HOST_SERVR_NM</code>.
	 */
	public String getHostServrNm() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.INTRFC_SYS.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.INTRFC_SYS.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.INTRFC_SYS.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.INTRFC_SYS.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.INTRFC_SYS.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.INTRFC_SYS.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.INTRFC_SYS.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.INTRFC_SYS.LAST_UPDT_TS</code>.
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
	public Record1<BigDecimal> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, String, String, String, String, Date, String, Date> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, String, String, String, String, Date, String, Date> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return IntrfcSys.INTRFC_SYS.INTRFC_SYS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return IntrfcSys.INTRFC_SYS.INTRFC_SYS_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return IntrfcSys.INTRFC_SYS.IP_ADDR_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return IntrfcSys.INTRFC_SYS.HOST_SERVR_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return IntrfcSys.INTRFC_SYS.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return IntrfcSys.INTRFC_SYS.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return IntrfcSys.INTRFC_SYS.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return IntrfcSys.INTRFC_SYS.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getIntrfcSysId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getIntrfcSysNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getIpAddrTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getHostServrNm();
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
	public IntrfcSysRecord value1(BigDecimal value) {
		setIntrfcSysId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IntrfcSysRecord value2(String value) {
		setIntrfcSysNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IntrfcSysRecord value3(String value) {
		setIpAddrTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IntrfcSysRecord value4(String value) {
		setHostServrNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IntrfcSysRecord value5(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IntrfcSysRecord value6(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IntrfcSysRecord value7(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IntrfcSysRecord value8(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IntrfcSysRecord values(BigDecimal value1, String value2, String value3, String value4, String value5, Date value6, String value7, Date value8) {
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
	 * Create a detached IntrfcSysRecord
	 */
	public IntrfcSysRecord() {
		super(IntrfcSys.INTRFC_SYS);
	}

	/**
	 * Create a detached, initialised IntrfcSysRecord
	 */
	public IntrfcSysRecord(BigDecimal intrfcSysId, String intrfcSysNm, String ipAddrTxt, String hostServrNm, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(IntrfcSys.INTRFC_SYS);

		setValue(0, intrfcSysId);
		setValue(1, intrfcSysNm);
		setValue(2, ipAddrTxt);
		setValue(3, hostServrNm);
		setValue(4, creatUserId);
		setValue(5, creatTs);
		setValue(6, lastUpdtUserId);
		setValue(7, lastUpdtTs);
	}
}
