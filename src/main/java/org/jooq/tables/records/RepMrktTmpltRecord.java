/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.RepMrktTmplt;


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
public class RepMrktTmpltRecord extends UpdatableRecordImpl<RepMrktTmpltRecord> implements Record12<BigDecimal, BigDecimal, String, BigDecimal, String, String, String, String, String, Date, String, Date> {

	private static final long serialVersionUID = -720646438;

	/**
	 * Setter for <code>WETRN.REP_MRKT_TMPLT.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.REP_MRKT_TMPLT.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.REP_MRKT_TMPLT.TMPLT_ID</code>.
	 */
	public void setTmpltId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.REP_MRKT_TMPLT.TMPLT_ID</code>.
	 */
	public BigDecimal getTmpltId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.REP_MRKT_TMPLT.TMPLT_NM</code>.
	 */
	public void setTmpltNm(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.REP_MRKT_TMPLT.TMPLT_NM</code>.
	 */
	public String getTmpltNm() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.REP_MRKT_TMPLT.TMPLT_TYP_ID</code>.
	 */
	public void setTmpltTypId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.REP_MRKT_TMPLT.TMPLT_TYP_ID</code>.
	 */
	public BigDecimal getTmpltTypId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.REP_MRKT_TMPLT.PY_REP_IND</code>.
	 */
	public void setPyRepInd(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.REP_MRKT_TMPLT.PY_REP_IND</code>.
	 */
	public String getPyRepInd() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.REP_MRKT_TMPLT.SPLT_BY_SHEET</code>.
	 */
	public void setSpltBySheet(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.REP_MRKT_TMPLT.SPLT_BY_SHEET</code>.
	 */
	public String getSpltBySheet() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.REP_MRKT_TMPLT.REP_BY_SLS_TYP</code>.
	 */
	public void setRepBySlsTyp(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.REP_MRKT_TMPLT.REP_BY_SLS_TYP</code>.
	 */
	public String getRepBySlsTyp() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.REP_MRKT_TMPLT.REP_BY_VER</code>.
	 */
	public void setRepByVer(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.REP_MRKT_TMPLT.REP_BY_VER</code>.
	 */
	public String getRepByVer() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.REP_MRKT_TMPLT.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.REP_MRKT_TMPLT.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.REP_MRKT_TMPLT.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.REP_MRKT_TMPLT.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.REP_MRKT_TMPLT.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.REP_MRKT_TMPLT.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.REP_MRKT_TMPLT.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.REP_MRKT_TMPLT.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(11);
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
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<BigDecimal, BigDecimal, String, BigDecimal, String, String, String, String, String, Date, String, Date> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<BigDecimal, BigDecimal, String, BigDecimal, String, String, String, String, String, Date, String, Date> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return RepMrktTmplt.REP_MRKT_TMPLT.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return RepMrktTmplt.REP_MRKT_TMPLT.TMPLT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return RepMrktTmplt.REP_MRKT_TMPLT.TMPLT_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return RepMrktTmplt.REP_MRKT_TMPLT.TMPLT_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return RepMrktTmplt.REP_MRKT_TMPLT.PY_REP_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return RepMrktTmplt.REP_MRKT_TMPLT.SPLT_BY_SHEET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return RepMrktTmplt.REP_MRKT_TMPLT.REP_BY_SLS_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return RepMrktTmplt.REP_MRKT_TMPLT.REP_BY_VER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return RepMrktTmplt.REP_MRKT_TMPLT.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return RepMrktTmplt.REP_MRKT_TMPLT.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return RepMrktTmplt.REP_MRKT_TMPLT.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field12() {
		return RepMrktTmplt.REP_MRKT_TMPLT.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getTmpltId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTmpltNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getTmpltTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getPyRepInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getSpltBySheet();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getRepBySlsTyp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getRepByVer();
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
	public RepMrktTmpltRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepMrktTmpltRecord value2(BigDecimal value) {
		setTmpltId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepMrktTmpltRecord value3(String value) {
		setTmpltNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepMrktTmpltRecord value4(BigDecimal value) {
		setTmpltTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepMrktTmpltRecord value5(String value) {
		setPyRepInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepMrktTmpltRecord value6(String value) {
		setSpltBySheet(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepMrktTmpltRecord value7(String value) {
		setRepBySlsTyp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepMrktTmpltRecord value8(String value) {
		setRepByVer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepMrktTmpltRecord value9(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepMrktTmpltRecord value10(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepMrktTmpltRecord value11(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepMrktTmpltRecord value12(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepMrktTmpltRecord values(BigDecimal value1, BigDecimal value2, String value3, BigDecimal value4, String value5, String value6, String value7, String value8, String value9, Date value10, String value11, Date value12) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RepMrktTmpltRecord
	 */
	public RepMrktTmpltRecord() {
		super(RepMrktTmplt.REP_MRKT_TMPLT);
	}

	/**
	 * Create a detached, initialised RepMrktTmpltRecord
	 */
	public RepMrktTmpltRecord(BigDecimal mrktId, BigDecimal tmpltId, String tmpltNm, BigDecimal tmpltTypId, String pyRepInd, String spltBySheet, String repBySlsTyp, String repByVer, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(RepMrktTmplt.REP_MRKT_TMPLT);

		setValue(0, mrktId);
		setValue(1, tmpltId);
		setValue(2, tmpltNm);
		setValue(3, tmpltTypId);
		setValue(4, pyRepInd);
		setValue(5, spltBySheet);
		setValue(6, repBySlsTyp);
		setValue(7, repByVer);
		setValue(8, creatUserId);
		setValue(9, creatTs);
		setValue(10, lastUpdtUserId);
		setValue(11, lastUpdtTs);
	}
}
