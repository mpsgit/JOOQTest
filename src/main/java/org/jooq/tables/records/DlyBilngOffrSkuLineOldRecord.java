/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.DlyBilngOffrSkuLineOld;


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
public class DlyBilngOffrSkuLineOldRecord extends TableRecordImpl<DlyBilngOffrSkuLineOldRecord> implements Record7<BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> {

	private static final long serialVersionUID = -910645277;

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE_OLD.DLY_BILNG_ID</code>.
	 */
	public void setDlyBilngId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE_OLD.DLY_BILNG_ID</code>.
	 */
	public BigDecimal getDlyBilngId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE_OLD.OFFR_SKU_LINE_ID</code>.
	 */
	public void setOffrSkuLineId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE_OLD.OFFR_SKU_LINE_ID</code>.
	 */
	public BigDecimal getOffrSkuLineId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE_OLD.UNIT_SPLT_PCT</code>.
	 */
	public void setUnitSpltPct(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE_OLD.UNIT_SPLT_PCT</code>.
	 */
	public BigDecimal getUnitSpltPct() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE_OLD.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE_OLD.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE_OLD.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE_OLD.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE_OLD.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE_OLD.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE_OLD.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE_OLD.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return DlyBilngOffrSkuLineOld.DLY_BILNG_OFFR_SKU_LINE_OLD.DLY_BILNG_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return DlyBilngOffrSkuLineOld.DLY_BILNG_OFFR_SKU_LINE_OLD.OFFR_SKU_LINE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return DlyBilngOffrSkuLineOld.DLY_BILNG_OFFR_SKU_LINE_OLD.UNIT_SPLT_PCT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return DlyBilngOffrSkuLineOld.DLY_BILNG_OFFR_SKU_LINE_OLD.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return DlyBilngOffrSkuLineOld.DLY_BILNG_OFFR_SKU_LINE_OLD.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return DlyBilngOffrSkuLineOld.DLY_BILNG_OFFR_SKU_LINE_OLD.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return DlyBilngOffrSkuLineOld.DLY_BILNG_OFFR_SKU_LINE_OLD.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getDlyBilngId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getOffrSkuLineId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getUnitSpltPct();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value5() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value7() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineOldRecord value1(BigDecimal value) {
		setDlyBilngId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineOldRecord value2(BigDecimal value) {
		setOffrSkuLineId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineOldRecord value3(BigDecimal value) {
		setUnitSpltPct(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineOldRecord value4(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineOldRecord value5(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineOldRecord value6(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineOldRecord value7(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineOldRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, String value4, Date value5, String value6, Date value7) {
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
	 * Create a detached DlyBilngOffrSkuLineOldRecord
	 */
	public DlyBilngOffrSkuLineOldRecord() {
		super(DlyBilngOffrSkuLineOld.DLY_BILNG_OFFR_SKU_LINE_OLD);
	}

	/**
	 * Create a detached, initialised DlyBilngOffrSkuLineOldRecord
	 */
	public DlyBilngOffrSkuLineOldRecord(BigDecimal dlyBilngId, BigDecimal offrSkuLineId, BigDecimal unitSpltPct, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(DlyBilngOffrSkuLineOld.DLY_BILNG_OFFR_SKU_LINE_OLD);

		setValue(0, dlyBilngId);
		setValue(1, offrSkuLineId);
		setValue(2, unitSpltPct);
		setValue(3, creatUserId);
		setValue(4, creatTs);
		setValue(5, lastUpdtUserId);
		setValue(6, lastUpdtTs);
	}
}