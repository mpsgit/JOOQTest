/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.PatrnTyp;


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
public class PatrnTypRecord extends TableRecordImpl<PatrnTypRecord> implements Record12<BigDecimal, BigDecimal, String, String, String, Date, String, Date, BigDecimal, BigDecimal, BigDecimal, String> {

	private static final long serialVersionUID = -1381384151;

	/**
	 * Setter for <code>WETRN.PATRN_TYP.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.PATRN_TYP.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.PATRN_TYP.PATRN_TYP_ID</code>.
	 */
	public void setPatrnTypId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.PATRN_TYP.PATRN_TYP_ID</code>.
	 */
	public BigDecimal getPatrnTypId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.PATRN_TYP.PATRN_TYP_DESC_TXT</code>.
	 */
	public void setPatrnTypDescTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.PATRN_TYP.PATRN_TYP_DESC_TXT</code>.
	 */
	public String getPatrnTypDescTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.PATRN_TYP.ENBLD_IND</code>.
	 */
	public void setEnbldInd(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.PATRN_TYP.ENBLD_IND</code>.
	 */
	public String getEnbldInd() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.PATRN_TYP.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.PATRN_TYP.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.PATRN_TYP.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.PATRN_TYP.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.PATRN_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.PATRN_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.PATRN_TYP.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.PATRN_TYP.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.PATRN_TYP.PATRN_LEN</code>. Maximum length of the pattern
	 */
	public void setPatrnLen(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.PATRN_TYP.PATRN_LEN</code>. Maximum length of the pattern
	 */
	public BigDecimal getPatrnLen() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.PATRN_TYP.CMPGN_DFRNC_MIN</code>. COD - COI diffence (inclusive) lower threshold 
	 */
	public void setCmpgnDfrncMin(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.PATRN_TYP.CMPGN_DFRNC_MIN</code>. COD - COI diffence (inclusive) lower threshold 
	 */
	public BigDecimal getCmpgnDfrncMin() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.PATRN_TYP.CMPGN_DFRNC_MAX</code>. COD - COI diffence (inclusive) upper threshold 
	 */
	public void setCmpgnDfrncMax(BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.PATRN_TYP.CMPGN_DFRNC_MAX</code>. COD - COI diffence (inclusive) upper threshold 
	 */
	public BigDecimal getCmpgnDfrncMax() {
		return (BigDecimal) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.PATRN_TYP.CFT</code>.
	 */
	public void setCft(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.PATRN_TYP.CFT</code>.
	 */
	public String getCft() {
		return (String) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<BigDecimal, BigDecimal, String, String, String, Date, String, Date, BigDecimal, BigDecimal, BigDecimal, String> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<BigDecimal, BigDecimal, String, String, String, Date, String, Date, BigDecimal, BigDecimal, BigDecimal, String> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return PatrnTyp.PATRN_TYP.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return PatrnTyp.PATRN_TYP.PATRN_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return PatrnTyp.PATRN_TYP.PATRN_TYP_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return PatrnTyp.PATRN_TYP.ENBLD_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return PatrnTyp.PATRN_TYP.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return PatrnTyp.PATRN_TYP.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return PatrnTyp.PATRN_TYP.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return PatrnTyp.PATRN_TYP.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return PatrnTyp.PATRN_TYP.PATRN_LEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field10() {
		return PatrnTyp.PATRN_TYP.CMPGN_DFRNC_MIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field11() {
		return PatrnTyp.PATRN_TYP.CMPGN_DFRNC_MAX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return PatrnTyp.PATRN_TYP.CFT;
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
		return getPatrnTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getPatrnTypDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getEnbldInd();
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
	public BigDecimal value9() {
		return getPatrnLen();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value10() {
		return getCmpgnDfrncMin();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value11() {
		return getCmpgnDfrncMax();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getCft();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PatrnTypRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PatrnTypRecord value2(BigDecimal value) {
		setPatrnTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PatrnTypRecord value3(String value) {
		setPatrnTypDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PatrnTypRecord value4(String value) {
		setEnbldInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PatrnTypRecord value5(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PatrnTypRecord value6(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PatrnTypRecord value7(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PatrnTypRecord value8(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PatrnTypRecord value9(BigDecimal value) {
		setPatrnLen(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PatrnTypRecord value10(BigDecimal value) {
		setCmpgnDfrncMin(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PatrnTypRecord value11(BigDecimal value) {
		setCmpgnDfrncMax(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PatrnTypRecord value12(String value) {
		setCft(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PatrnTypRecord values(BigDecimal value1, BigDecimal value2, String value3, String value4, String value5, Date value6, String value7, Date value8, BigDecimal value9, BigDecimal value10, BigDecimal value11, String value12) {
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
	 * Create a detached PatrnTypRecord
	 */
	public PatrnTypRecord() {
		super(PatrnTyp.PATRN_TYP);
	}

	/**
	 * Create a detached, initialised PatrnTypRecord
	 */
	public PatrnTypRecord(BigDecimal mrktId, BigDecimal patrnTypId, String patrnTypDescTxt, String enbldInd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, BigDecimal patrnLen, BigDecimal cmpgnDfrncMin, BigDecimal cmpgnDfrncMax, String cft) {
		super(PatrnTyp.PATRN_TYP);

		setValue(0, mrktId);
		setValue(1, patrnTypId);
		setValue(2, patrnTypDescTxt);
		setValue(3, enbldInd);
		setValue(4, creatUserId);
		setValue(5, creatTs);
		setValue(6, lastUpdtUserId);
		setValue(7, lastUpdtTs);
		setValue(8, patrnLen);
		setValue(9, cmpgnDfrncMin);
		setValue(10, cmpgnDfrncMax);
		setValue(11, cft);
	}
}
