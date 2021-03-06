/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Record3;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.DlyBilngOffrSkuLine;


/**
 * Unit split and mapping between billing data and offers.  Data retained 
 * after matching for force matched (and related) rows.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DlyBilngOffrSkuLineRecord extends UpdatableRecordImpl<DlyBilngOffrSkuLineRecord> implements Record13<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, String, String, String> {

	private static final long serialVersionUID = 965506567;

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.DLY_BILNG_ID</code>.
	 */
	public void setDlyBilngId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.DLY_BILNG_ID</code>.
	 */
	public BigDecimal getDlyBilngId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.SLS_TYP_ID</code>.
	 */
	public void setSlsTypId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.SLS_TYP_ID</code>.
	 */
	public BigDecimal getSlsTypId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.OFFR_SKU_LINE_ID</code>.
	 */
	public void setOffrSkuLineId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.OFFR_SKU_LINE_ID</code>.
	 */
	public BigDecimal getOffrSkuLineId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.UNIT_QTY</code>.
	 */
	public void setUnitQty(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.UNIT_QTY</code>.
	 */
	public BigDecimal getUnitQty() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.COMSN_AMT</code>.
	 */
	public void setComsnAmt(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.COMSN_AMT</code>.
	 */
	public BigDecimal getComsnAmt() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.TAX_AMT</code>.
	 */
	public void setTaxAmt(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.TAX_AMT</code>.
	 */
	public BigDecimal getTaxAmt() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public void setCreatUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public String getCreatUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.CREAT_TS</code>. The date and time the row was created.
	 */
	public void setCreatTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.CREAT_TS</code>. The date and time the row was created.
	 */
	public Date getCreatTs() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.FRC_MTCH_IND</code>.
	 */
	public void setFrcMtchInd(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.FRC_MTCH_IND</code>.
	 */
	public String getFrcMtchInd() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.GTA_OVRRD_IND</code>.
	 */
	public void setGtaOvrrdInd(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.GTA_OVRRD_IND</code>.
	 */
	public String getGtaOvrrdInd() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.FRCE_MTCH_IND</code>.
	 */
	public void setFrceMtchInd(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_OFFR_SKU_LINE.FRCE_MTCH_IND</code>.
	 */
	public String getFrceMtchInd() {
		return (String) getValue(12);
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
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, String, String, String> fieldsRow() {
		return (Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, String, String, String> valuesRow() {
		return (Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE.DLY_BILNG_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE.SLS_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE.OFFR_SKU_LINE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE.UNIT_QTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE.COMSN_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE.TAX_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE.FRC_MTCH_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE.GTA_OVRRD_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE.FRCE_MTCH_IND;
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
		return getSlsTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getOffrSkuLineId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getUnitQty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getComsnAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getTaxAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value8() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value10() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getFrcMtchInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getGtaOvrrdInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getFrceMtchInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineRecord value1(BigDecimal value) {
		setDlyBilngId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineRecord value2(BigDecimal value) {
		setSlsTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineRecord value3(BigDecimal value) {
		setOffrSkuLineId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineRecord value4(BigDecimal value) {
		setUnitQty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineRecord value5(BigDecimal value) {
		setComsnAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineRecord value6(BigDecimal value) {
		setTaxAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineRecord value7(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineRecord value8(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineRecord value9(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineRecord value10(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineRecord value11(String value) {
		setFrcMtchInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineRecord value12(String value) {
		setGtaOvrrdInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineRecord value13(String value) {
		setFrceMtchInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOffrSkuLineRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, String value7, Date value8, String value9, Date value10, String value11, String value12, String value13) {
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
	 * Create a detached DlyBilngOffrSkuLineRecord
	 */
	public DlyBilngOffrSkuLineRecord() {
		super(DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE);
	}

	/**
	 * Create a detached, initialised DlyBilngOffrSkuLineRecord
	 */
	public DlyBilngOffrSkuLineRecord(BigDecimal dlyBilngId, BigDecimal slsTypId, BigDecimal offrSkuLineId, BigDecimal unitQty, BigDecimal comsnAmt, BigDecimal taxAmt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String frcMtchInd, String gtaOvrrdInd, String frceMtchInd) {
		super(DlyBilngOffrSkuLine.DLY_BILNG_OFFR_SKU_LINE);

		setValue(0, dlyBilngId);
		setValue(1, slsTypId);
		setValue(2, offrSkuLineId);
		setValue(3, unitQty);
		setValue(4, comsnAmt);
		setValue(5, taxAmt);
		setValue(6, creatUserId);
		setValue(7, creatTs);
		setValue(8, lastUpdtUserId);
		setValue(9, lastUpdtTs);
		setValue(10, frcMtchInd);
		setValue(11, gtaOvrrdInd);
		setValue(12, frceMtchInd);
	}
}
