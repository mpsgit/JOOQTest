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
import org.jooq.tables.Form;


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
public class FormRecord extends UpdatableRecordImpl<FormRecord> implements Record8<BigDecimal, String, BigDecimal, BigDecimal, String, Date, String, Date> {

	private static final long serialVersionUID = -1037615603;

	/**
	 * Setter for <code>WETRN.FORM.FORM_ID</code>.
	 */
	public void setFormId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.FORM.FORM_ID</code>.
	 */
	public BigDecimal getFormId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.FORM.FORM_DESC_TXT</code>.
	 */
	public void setFormDescTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.FORM.FORM_DESC_TXT</code>.
	 */
	public String getFormDescTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.FORM.CNTNT_FORM_ID</code>.
	 */
	public void setCntntFormId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.FORM.CNTNT_FORM_ID</code>.
	 */
	public BigDecimal getCntntFormId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.FORM.FORM_GRP_ID</code>.
	 */
	public void setFormGrpId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.FORM.FORM_GRP_ID</code>.
	 */
	public BigDecimal getFormGrpId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.FORM.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.FORM.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.FORM.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.FORM.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.FORM.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.FORM.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.FORM.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.FORM.LAST_UPDT_TS</code>.
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
	public Row8<BigDecimal, String, BigDecimal, BigDecimal, String, Date, String, Date> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, String, BigDecimal, BigDecimal, String, Date, String, Date> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return Form.FORM.FORM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Form.FORM.FORM_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return Form.FORM.CNTNT_FORM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return Form.FORM.FORM_GRP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Form.FORM.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return Form.FORM.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Form.FORM.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return Form.FORM.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getFormId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getFormDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getCntntFormId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getFormGrpId();
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
	public FormRecord value1(BigDecimal value) {
		setFormId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FormRecord value2(String value) {
		setFormDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FormRecord value3(BigDecimal value) {
		setCntntFormId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FormRecord value4(BigDecimal value) {
		setFormGrpId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FormRecord value5(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FormRecord value6(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FormRecord value7(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FormRecord value8(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FormRecord values(BigDecimal value1, String value2, BigDecimal value3, BigDecimal value4, String value5, Date value6, String value7, Date value8) {
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
	 * Create a detached FormRecord
	 */
	public FormRecord() {
		super(Form.FORM);
	}

	/**
	 * Create a detached, initialised FormRecord
	 */
	public FormRecord(BigDecimal formId, String formDescTxt, BigDecimal cntntFormId, BigDecimal formGrpId, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(Form.FORM);

		setValue(0, formId);
		setValue(1, formDescTxt);
		setValue(2, cntntFormId);
		setValue(3, formGrpId);
		setValue(4, creatUserId);
		setValue(5, creatTs);
		setValue(6, lastUpdtUserId);
		setValue(7, lastUpdtTs);
	}
}