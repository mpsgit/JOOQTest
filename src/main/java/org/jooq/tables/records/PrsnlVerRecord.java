/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Record5;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.PrsnlVer;


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
public class PrsnlVerRecord extends UpdatableRecordImpl<PrsnlVerRecord> implements Record13<BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, String, String, String, Date, String, Date, String> {

	private static final long serialVersionUID = 426979562;

	/**
	 * Setter for <code>WETRN.PRSNL_VER.CLSTR_ID</code>.
	 */
	public void setClstrId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_VER.CLSTR_ID</code>.
	 */
	public BigDecimal getClstrId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_VER.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_VER.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_VER.USER_NM</code>.
	 */
	public void setUserNm(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_VER.USER_NM</code>.
	 */
	public String getUserNm() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_VER.PRSNL_VER_ID</code>.
	 */
	public void setPrsnlVerId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_VER.PRSNL_VER_ID</code>.
	 */
	public BigDecimal getPrsnlVerId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_VER.YR_NR</code>.
	 */
	public void setYrNr(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_VER.YR_NR</code>.
	 */
	public BigDecimal getYrNr() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_VER.SYS_ID</code>.
	 */
	public void setSysId(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_VER.SYS_ID</code>.
	 */
	public BigDecimal getSysId() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_VER.PRSNL_VER_DESC_TXT</code>.
	 */
	public void setPrsnlVerDescTxt(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_VER.PRSNL_VER_DESC_TXT</code>.
	 */
	public String getPrsnlVerDescTxt() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_VER.PRVT_IND</code>.
	 */
	public void setPrvtInd(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_VER.PRVT_IND</code>.
	 */
	public String getPrvtInd() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_VER.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_VER.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_VER.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_VER.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_VER.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_VER.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_VER.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_VER.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.PRSNL_VER.SHR_IND</code>.
	 */
	public void setShrInd(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.PRSNL_VER.SHR_IND</code>.
	 */
	public String getShrInd() {
		return (String) getValue(12);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record5<BigDecimal, BigDecimal, String, BigDecimal, BigDecimal> key() {
		return (Record5) super.key();
	}

	// -------------------------------------------------------------------------
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, String, String, String, Date, String, Date, String> fieldsRow() {
		return (Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, String, String, String, Date, String, Date, String> valuesRow() {
		return (Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return PrsnlVer.PRSNL_VER.CLSTR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return PrsnlVer.PRSNL_VER.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return PrsnlVer.PRSNL_VER.USER_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return PrsnlVer.PRSNL_VER.PRSNL_VER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return PrsnlVer.PRSNL_VER.YR_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return PrsnlVer.PRSNL_VER.SYS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return PrsnlVer.PRSNL_VER.PRSNL_VER_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return PrsnlVer.PRSNL_VER.PRVT_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return PrsnlVer.PRSNL_VER.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return PrsnlVer.PRSNL_VER.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return PrsnlVer.PRSNL_VER.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field12() {
		return PrsnlVer.PRSNL_VER.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return PrsnlVer.PRSNL_VER.SHR_IND;
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
	public String value3() {
		return getUserNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getPrsnlVerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getYrNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getSysId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getPrsnlVerDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getPrvtInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value10() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value12() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getShrInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlVerRecord value1(BigDecimal value) {
		setClstrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlVerRecord value2(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlVerRecord value3(String value) {
		setUserNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlVerRecord value4(BigDecimal value) {
		setPrsnlVerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlVerRecord value5(BigDecimal value) {
		setYrNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlVerRecord value6(BigDecimal value) {
		setSysId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlVerRecord value7(String value) {
		setPrsnlVerDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlVerRecord value8(String value) {
		setPrvtInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlVerRecord value9(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlVerRecord value10(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlVerRecord value11(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlVerRecord value12(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlVerRecord value13(String value) {
		setShrInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlVerRecord values(BigDecimal value1, BigDecimal value2, String value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, String value7, String value8, String value9, Date value10, String value11, Date value12, String value13) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PrsnlVerRecord
	 */
	public PrsnlVerRecord() {
		super(PrsnlVer.PRSNL_VER);
	}

	/**
	 * Create a detached, initialised PrsnlVerRecord
	 */
	public PrsnlVerRecord(BigDecimal clstrId, BigDecimal mrktId, String userNm, BigDecimal prsnlVerId, BigDecimal yrNr, BigDecimal sysId, String prsnlVerDescTxt, String prvtInd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String shrInd) {
		super(PrsnlVer.PRSNL_VER);

		setValue(0, clstrId);
		setValue(1, mrktId);
		setValue(2, userNm);
		setValue(3, prsnlVerId);
		setValue(4, yrNr);
		setValue(5, sysId);
		setValue(6, prsnlVerDescTxt);
		setValue(7, prvtInd);
		setValue(8, creatUserId);
		setValue(9, creatTs);
		setValue(10, lastUpdtUserId);
		setValue(11, lastUpdtTs);
		setValue(12, shrInd);
	}
}
