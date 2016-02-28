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
import org.jooq.tables.LineNrTyp;


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
public class LineNrTypRecord extends UpdatableRecordImpl<LineNrTypRecord> implements Record7<BigDecimal, String, String, Date, String, Date, String> {

	private static final long serialVersionUID = 333598095;

	/**
	 * Setter for <code>WETRN.LINE_NR_TYP.LINE_NR_TYP_ID</code>.
	 */
	public void setLineNrTypId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.LINE_NR_TYP.LINE_NR_TYP_ID</code>.
	 */
	public BigDecimal getLineNrTypId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.LINE_NR_TYP.LINE_NR_TYP_SDESC_TXT</code>.
	 */
	public void setLineNrTypSdescTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.LINE_NR_TYP.LINE_NR_TYP_SDESC_TXT</code>.
	 */
	public String getLineNrTypSdescTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.LINE_NR_TYP.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.LINE_NR_TYP.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.LINE_NR_TYP.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.LINE_NR_TYP.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.LINE_NR_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.LINE_NR_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.LINE_NR_TYP.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.LINE_NR_TYP.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.LINE_NR_TYP.LINE_NR_TYP_CD</code>.
	 */
	public void setLineNrTypCd(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.LINE_NR_TYP.LINE_NR_TYP_CD</code>.
	 */
	public String getLineNrTypCd() {
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
		return LineNrTyp.LINE_NR_TYP.LINE_NR_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return LineNrTyp.LINE_NR_TYP.LINE_NR_TYP_SDESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return LineNrTyp.LINE_NR_TYP.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return LineNrTyp.LINE_NR_TYP.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return LineNrTyp.LINE_NR_TYP.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return LineNrTyp.LINE_NR_TYP.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return LineNrTyp.LINE_NR_TYP.LINE_NR_TYP_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getLineNrTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getLineNrTypSdescTxt();
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
		return getLineNrTypCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LineNrTypRecord value1(BigDecimal value) {
		setLineNrTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LineNrTypRecord value2(String value) {
		setLineNrTypSdescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LineNrTypRecord value3(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LineNrTypRecord value4(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LineNrTypRecord value5(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LineNrTypRecord value6(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LineNrTypRecord value7(String value) {
		setLineNrTypCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LineNrTypRecord values(BigDecimal value1, String value2, String value3, Date value4, String value5, Date value6, String value7) {
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
	 * Create a detached LineNrTypRecord
	 */
	public LineNrTypRecord() {
		super(LineNrTyp.LINE_NR_TYP);
	}

	/**
	 * Create a detached, initialised LineNrTypRecord
	 */
	public LineNrTypRecord(BigDecimal lineNrTypId, String lineNrTypSdescTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String lineNrTypCd) {
		super(LineNrTyp.LINE_NR_TYP);

		setValue(0, lineNrTypId);
		setValue(1, lineNrTypSdescTxt);
		setValue(2, creatUserId);
		setValue(3, creatTs);
		setValue(4, lastUpdtUserId);
		setValue(5, lastUpdtTs);
		setValue(6, lineNrTypCd);
	}
}