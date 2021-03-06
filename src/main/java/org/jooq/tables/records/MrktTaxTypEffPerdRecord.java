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
import org.jooq.tables.MrktTaxTypEffPerd;


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
public class MrktTaxTypEffPerdRecord extends UpdatableRecordImpl<MrktTaxTypEffPerdRecord> implements Record8<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> {

	private static final long serialVersionUID = 633088462;

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.TAX_TYPE_ID</code>.
	 */
	public void setTaxTypeId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.TAX_TYPE_ID</code>.
	 */
	public BigDecimal getTaxTypeId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.EFF_PERD_ID</code>.
	 */
	public void setEffPerdId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.EFF_PERD_ID</code>.
	 */
	public BigDecimal getEffPerdId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.TAX_RTE</code>.
	 */
	public void setTaxRte(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.TAX_RTE</code>.
	 */
	public BigDecimal getTaxRte() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_EFF_PERD.LAST_UPDT_TS</code>.
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
	public Row8<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MrktTaxTypEffPerd.MRKT_TAX_TYP_EFF_PERD.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MrktTaxTypEffPerd.MRKT_TAX_TYP_EFF_PERD.TAX_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return MrktTaxTypEffPerd.MRKT_TAX_TYP_EFF_PERD.EFF_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return MrktTaxTypEffPerd.MRKT_TAX_TYP_EFF_PERD.TAX_RTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return MrktTaxTypEffPerd.MRKT_TAX_TYP_EFF_PERD.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return MrktTaxTypEffPerd.MRKT_TAX_TYP_EFF_PERD.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return MrktTaxTypEffPerd.MRKT_TAX_TYP_EFF_PERD.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return MrktTaxTypEffPerd.MRKT_TAX_TYP_EFF_PERD.LAST_UPDT_TS;
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
		return getTaxTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getEffPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getTaxRte();
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
	public MrktTaxTypEffPerdRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypEffPerdRecord value2(BigDecimal value) {
		setTaxTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypEffPerdRecord value3(BigDecimal value) {
		setEffPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypEffPerdRecord value4(BigDecimal value) {
		setTaxRte(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypEffPerdRecord value5(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypEffPerdRecord value6(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypEffPerdRecord value7(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypEffPerdRecord value8(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypEffPerdRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, String value5, Date value6, String value7, Date value8) {
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
	 * Create a detached MrktTaxTypEffPerdRecord
	 */
	public MrktTaxTypEffPerdRecord() {
		super(MrktTaxTypEffPerd.MRKT_TAX_TYP_EFF_PERD);
	}

	/**
	 * Create a detached, initialised MrktTaxTypEffPerdRecord
	 */
	public MrktTaxTypEffPerdRecord(BigDecimal mrktId, BigDecimal taxTypeId, BigDecimal effPerdId, BigDecimal taxRte, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(MrktTaxTypEffPerd.MRKT_TAX_TYP_EFF_PERD);

		setValue(0, mrktId);
		setValue(1, taxTypeId);
		setValue(2, effPerdId);
		setValue(3, taxRte);
		setValue(4, creatUserId);
		setValue(5, creatTs);
		setValue(6, lastUpdtUserId);
		setValue(7, lastUpdtTs);
	}
}
