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
import org.jooq.tables.DfltMrktVehTax;


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
public class DfltMrktVehTaxRecord extends UpdatableRecordImpl<DfltMrktVehTaxRecord> implements Record8<BigDecimal, BigDecimal, BigDecimal, String, String, Date, String, Date> {

	private static final long serialVersionUID = -1238428035;

	/**
	 * Setter for <code>WETRN.DFLT_MRKT_VEH_TAX.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.DFLT_MRKT_VEH_TAX.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.DFLT_MRKT_VEH_TAX.VEH_ID</code>.
	 */
	public void setVehId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.DFLT_MRKT_VEH_TAX.VEH_ID</code>.
	 */
	public BigDecimal getVehId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.DFLT_MRKT_VEH_TAX.STRT_PERD_ID</code>.
	 */
	public void setStrtPerdId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.DFLT_MRKT_VEH_TAX.STRT_PERD_ID</code>.
	 */
	public BigDecimal getStrtPerdId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.DFLT_MRKT_VEH_TAX.DTAX_TYP</code>.
	 */
	public void setDtaxTyp(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.DFLT_MRKT_VEH_TAX.DTAX_TYP</code>.
	 */
	public String getDtaxTyp() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.DFLT_MRKT_VEH_TAX.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.DFLT_MRKT_VEH_TAX.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.DFLT_MRKT_VEH_TAX.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.DFLT_MRKT_VEH_TAX.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.DFLT_MRKT_VEH_TAX.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.DFLT_MRKT_VEH_TAX.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.DFLT_MRKT_VEH_TAX.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.DFLT_MRKT_VEH_TAX.LAST_UPDT_TS</code>.
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
	public Row8<BigDecimal, BigDecimal, BigDecimal, String, String, Date, String, Date> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, BigDecimal, BigDecimal, String, String, Date, String, Date> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return DfltMrktVehTax.DFLT_MRKT_VEH_TAX.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return DfltMrktVehTax.DFLT_MRKT_VEH_TAX.VEH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return DfltMrktVehTax.DFLT_MRKT_VEH_TAX.STRT_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return DfltMrktVehTax.DFLT_MRKT_VEH_TAX.DTAX_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return DfltMrktVehTax.DFLT_MRKT_VEH_TAX.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return DfltMrktVehTax.DFLT_MRKT_VEH_TAX.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return DfltMrktVehTax.DFLT_MRKT_VEH_TAX.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return DfltMrktVehTax.DFLT_MRKT_VEH_TAX.LAST_UPDT_TS;
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
		return getVehId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getStrtPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDtaxTyp();
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
	public DfltMrktVehTaxRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DfltMrktVehTaxRecord value2(BigDecimal value) {
		setVehId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DfltMrktVehTaxRecord value3(BigDecimal value) {
		setStrtPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DfltMrktVehTaxRecord value4(String value) {
		setDtaxTyp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DfltMrktVehTaxRecord value5(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DfltMrktVehTaxRecord value6(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DfltMrktVehTaxRecord value7(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DfltMrktVehTaxRecord value8(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DfltMrktVehTaxRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, String value4, String value5, Date value6, String value7, Date value8) {
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
	 * Create a detached DfltMrktVehTaxRecord
	 */
	public DfltMrktVehTaxRecord() {
		super(DfltMrktVehTax.DFLT_MRKT_VEH_TAX);
	}

	/**
	 * Create a detached, initialised DfltMrktVehTaxRecord
	 */
	public DfltMrktVehTaxRecord(BigDecimal mrktId, BigDecimal vehId, BigDecimal strtPerdId, String dtaxTyp, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(DfltMrktVehTax.DFLT_MRKT_VEH_TAX);

		setValue(0, mrktId);
		setValue(1, vehId);
		setValue(2, strtPerdId);
		setValue(3, dtaxTyp);
		setValue(4, creatUserId);
		setValue(5, creatTs);
		setValue(6, lastUpdtUserId);
		setValue(7, lastUpdtTs);
	}
}
