/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.MrktConfigItemAudit;


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
public class MrktConfigItemAuditRecord extends TableRecordImpl<MrktConfigItemAuditRecord> implements Record9<BigDecimal, BigDecimal, String, String, String, String, Date, String, Date> {

	private static final long serialVersionUID = -1435771444;

	/**
	 * Setter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.CONFIG_ITEM_ID</code>.
	 */
	public void setConfigItemId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.CONFIG_ITEM_ID</code>.
	 */
	public BigDecimal getConfigItemId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.MRKT_CONFIG_ITEM_DESC_TXT</code>.
	 */
	public void setMrktConfigItemDescTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.MRKT_CONFIG_ITEM_DESC_TXT</code>.
	 */
	public String getMrktConfigItemDescTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.MRKT_CONFIG_ITEM_LABL_TXT</code>.
	 */
	public void setMrktConfigItemLablTxt(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.MRKT_CONFIG_ITEM_LABL_TXT</code>.
	 */
	public String getMrktConfigItemLablTxt() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.MRKT_CONFIG_ITEM_VAL_TXT</code>.
	 */
	public void setMrktConfigItemValTxt(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.MRKT_CONFIG_ITEM_VAL_TXT</code>.
	 */
	public String getMrktConfigItemValTxt() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, BigDecimal, String, String, String, String, Date, String, Date> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, BigDecimal, String, String, String, String, Date, String, Date> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MrktConfigItemAudit.MRKT_CONFIG_ITEM_AUDIT.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MrktConfigItemAudit.MRKT_CONFIG_ITEM_AUDIT.CONFIG_ITEM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return MrktConfigItemAudit.MRKT_CONFIG_ITEM_AUDIT.MRKT_CONFIG_ITEM_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return MrktConfigItemAudit.MRKT_CONFIG_ITEM_AUDIT.MRKT_CONFIG_ITEM_LABL_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return MrktConfigItemAudit.MRKT_CONFIG_ITEM_AUDIT.MRKT_CONFIG_ITEM_VAL_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return MrktConfigItemAudit.MRKT_CONFIG_ITEM_AUDIT.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return MrktConfigItemAudit.MRKT_CONFIG_ITEM_AUDIT.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return MrktConfigItemAudit.MRKT_CONFIG_ITEM_AUDIT.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field9() {
		return MrktConfigItemAudit.MRKT_CONFIG_ITEM_AUDIT.LAST_UPDT_TS;
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
		return getConfigItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getMrktConfigItemDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getMrktConfigItemLablTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getMrktConfigItemValTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value7() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value9() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktConfigItemAuditRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktConfigItemAuditRecord value2(BigDecimal value) {
		setConfigItemId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktConfigItemAuditRecord value3(String value) {
		setMrktConfigItemDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktConfigItemAuditRecord value4(String value) {
		setMrktConfigItemLablTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktConfigItemAuditRecord value5(String value) {
		setMrktConfigItemValTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktConfigItemAuditRecord value6(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktConfigItemAuditRecord value7(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktConfigItemAuditRecord value8(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktConfigItemAuditRecord value9(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktConfigItemAuditRecord values(BigDecimal value1, BigDecimal value2, String value3, String value4, String value5, String value6, Date value7, String value8, Date value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MrktConfigItemAuditRecord
	 */
	public MrktConfigItemAuditRecord() {
		super(MrktConfigItemAudit.MRKT_CONFIG_ITEM_AUDIT);
	}

	/**
	 * Create a detached, initialised MrktConfigItemAuditRecord
	 */
	public MrktConfigItemAuditRecord(BigDecimal mrktId, BigDecimal configItemId, String mrktConfigItemDescTxt, String mrktConfigItemLablTxt, String mrktConfigItemValTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(MrktConfigItemAudit.MRKT_CONFIG_ITEM_AUDIT);

		setValue(0, mrktId);
		setValue(1, configItemId);
		setValue(2, mrktConfigItemDescTxt);
		setValue(3, mrktConfigItemLablTxt);
		setValue(4, mrktConfigItemValTxt);
		setValue(5, creatUserId);
		setValue(6, creatTs);
		setValue(7, lastUpdtUserId);
		setValue(8, lastUpdtTs);
	}
}
