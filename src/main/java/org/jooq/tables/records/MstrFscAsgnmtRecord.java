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
import org.jooq.tables.MstrFscAsgnmt;


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
public class MstrFscAsgnmtRecord extends UpdatableRecordImpl<MstrFscAsgnmtRecord> implements Record8<BigDecimal, BigDecimal, BigDecimal, String, String, Date, String, Date> {

	private static final long serialVersionUID = -434039545;

	/**
	 * Setter for <code>WETRN.MSTR_FSC_ASGNMT.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MSTR_FSC_ASGNMT.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MSTR_FSC_ASGNMT.SKU_ID</code>.
	 */
	public void setSkuId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MSTR_FSC_ASGNMT.SKU_ID</code>.
	 */
	public BigDecimal getSkuId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MSTR_FSC_ASGNMT.STRT_PERD_ID</code>.
	 */
	public void setStrtPerdId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MSTR_FSC_ASGNMT.STRT_PERD_ID</code>.
	 */
	public BigDecimal getStrtPerdId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MSTR_FSC_ASGNMT.MSTR_FSC_CD</code>.
	 */
	public void setMstrFscCd(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MSTR_FSC_ASGNMT.MSTR_FSC_CD</code>.
	 */
	public String getMstrFscCd() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MSTR_FSC_ASGNMT.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MSTR_FSC_ASGNMT.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MSTR_FSC_ASGNMT.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MSTR_FSC_ASGNMT.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MSTR_FSC_ASGNMT.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MSTR_FSC_ASGNMT.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MSTR_FSC_ASGNMT.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MSTR_FSC_ASGNMT.LAST_UPDT_TS</code>.
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
		return MstrFscAsgnmt.MSTR_FSC_ASGNMT.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MstrFscAsgnmt.MSTR_FSC_ASGNMT.SKU_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return MstrFscAsgnmt.MSTR_FSC_ASGNMT.STRT_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return MstrFscAsgnmt.MSTR_FSC_ASGNMT.MSTR_FSC_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return MstrFscAsgnmt.MSTR_FSC_ASGNMT.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return MstrFscAsgnmt.MSTR_FSC_ASGNMT.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return MstrFscAsgnmt.MSTR_FSC_ASGNMT.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return MstrFscAsgnmt.MSTR_FSC_ASGNMT.LAST_UPDT_TS;
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
		return getSkuId();
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
		return getMstrFscCd();
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
	public MstrFscAsgnmtRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MstrFscAsgnmtRecord value2(BigDecimal value) {
		setSkuId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MstrFscAsgnmtRecord value3(BigDecimal value) {
		setStrtPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MstrFscAsgnmtRecord value4(String value) {
		setMstrFscCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MstrFscAsgnmtRecord value5(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MstrFscAsgnmtRecord value6(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MstrFscAsgnmtRecord value7(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MstrFscAsgnmtRecord value8(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MstrFscAsgnmtRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, String value4, String value5, Date value6, String value7, Date value8) {
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
	 * Create a detached MstrFscAsgnmtRecord
	 */
	public MstrFscAsgnmtRecord() {
		super(MstrFscAsgnmt.MSTR_FSC_ASGNMT);
	}

	/**
	 * Create a detached, initialised MstrFscAsgnmtRecord
	 */
	public MstrFscAsgnmtRecord(BigDecimal mrktId, BigDecimal skuId, BigDecimal strtPerdId, String mstrFscCd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(MstrFscAsgnmt.MSTR_FSC_ASGNMT);

		setValue(0, mrktId);
		setValue(1, skuId);
		setValue(2, strtPerdId);
		setValue(3, mstrFscCd);
		setValue(4, creatUserId);
		setValue(5, creatTs);
		setValue(6, lastUpdtUserId);
		setValue(7, lastUpdtTs);
	}
}