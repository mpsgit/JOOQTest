/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.CnsmrInvstmtBdgt;


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
public class CnsmrInvstmtBdgtRecord extends UpdatableRecordImpl<CnsmrInvstmtBdgtRecord> implements Record7<BigDecimal, String, String, Date, String, Date, String> {

	private static final long serialVersionUID = -75740426;

	/**
	 * Setter for <code>WETRN.CNSMR_INVSTMT_BDGT.CNSMR_INVSTMT_BDGT_ID</code>.
	 */
	public void setCnsmrInvstmtBdgtId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.CNSMR_INVSTMT_BDGT.CNSMR_INVSTMT_BDGT_ID</code>.
	 */
	public BigDecimal getCnsmrInvstmtBdgtId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.CNSMR_INVSTMT_BDGT.CNSMR_INVSTMT_BDGT_DESC_TXT</code>.
	 */
	public void setCnsmrInvstmtBdgtDescTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.CNSMR_INVSTMT_BDGT.CNSMR_INVSTMT_BDGT_DESC_TXT</code>.
	 */
	public String getCnsmrInvstmtBdgtDescTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.CNSMR_INVSTMT_BDGT.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.CNSMR_INVSTMT_BDGT.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.CNSMR_INVSTMT_BDGT.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.CNSMR_INVSTMT_BDGT.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.CNSMR_INVSTMT_BDGT.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.CNSMR_INVSTMT_BDGT.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.CNSMR_INVSTMT_BDGT.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.CNSMR_INVSTMT_BDGT.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.CNSMR_INVSTMT_BDGT.OFFR_AVLBL_IND</code>.
	 */
	public void setOffrAvlblInd(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.CNSMR_INVSTMT_BDGT.OFFR_AVLBL_IND</code>.
	 */
	public String getOffrAvlblInd() {
		return (String) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<BigDecimal, String, String, Date, String, Date, String> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<BigDecimal, String, String, Date, String, Date, String> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return CnsmrInvstmtBdgt.CNSMR_INVSTMT_BDGT.CNSMR_INVSTMT_BDGT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return CnsmrInvstmtBdgt.CNSMR_INVSTMT_BDGT.CNSMR_INVSTMT_BDGT_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return CnsmrInvstmtBdgt.CNSMR_INVSTMT_BDGT.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return CnsmrInvstmtBdgt.CNSMR_INVSTMT_BDGT.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return CnsmrInvstmtBdgt.CNSMR_INVSTMT_BDGT.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return CnsmrInvstmtBdgt.CNSMR_INVSTMT_BDGT.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return CnsmrInvstmtBdgt.CNSMR_INVSTMT_BDGT.OFFR_AVLBL_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getCnsmrInvstmtBdgtId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getCnsmrInvstmtBdgtDescTxt();
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
	public String value7() {
		return getOffrAvlblInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CnsmrInvstmtBdgtRecord value1(BigDecimal value) {
		setCnsmrInvstmtBdgtId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CnsmrInvstmtBdgtRecord value2(String value) {
		setCnsmrInvstmtBdgtDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CnsmrInvstmtBdgtRecord value3(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CnsmrInvstmtBdgtRecord value4(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CnsmrInvstmtBdgtRecord value5(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CnsmrInvstmtBdgtRecord value6(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CnsmrInvstmtBdgtRecord value7(String value) {
		setOffrAvlblInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CnsmrInvstmtBdgtRecord values(BigDecimal value1, String value2, String value3, Date value4, String value5, Date value6, String value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CnsmrInvstmtBdgtRecord
	 */
	public CnsmrInvstmtBdgtRecord() {
		super(CnsmrInvstmtBdgt.CNSMR_INVSTMT_BDGT);
	}

	/**
	 * Create a detached, initialised CnsmrInvstmtBdgtRecord
	 */
	public CnsmrInvstmtBdgtRecord(BigDecimal cnsmrInvstmtBdgtId, String cnsmrInvstmtBdgtDescTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String offrAvlblInd) {
		super(CnsmrInvstmtBdgt.CNSMR_INVSTMT_BDGT);

		setValue(0, cnsmrInvstmtBdgtId);
		setValue(1, cnsmrInvstmtBdgtDescTxt);
		setValue(2, creatUserId);
		setValue(3, creatTs);
		setValue(4, lastUpdtUserId);
		setValue(5, lastUpdtTs);
		setValue(6, offrAvlblInd);
	}
}
