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
import org.jooq.tables.LclChnlAudit;


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
public class LclChnlAuditRecord extends TableRecordImpl<LclChnlAuditRecord> implements Record7<BigDecimal, String, String, String, Date, String, Date> {

	private static final long serialVersionUID = 847370852;

	/**
	 * Setter for <code>WETRN.LCL_CHNL_AUDIT.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.LCL_CHNL_AUDIT.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.LCL_CHNL_AUDIT.LCL_CHNL_ID</code>.
	 */
	public void setLclChnlId(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.LCL_CHNL_AUDIT.LCL_CHNL_ID</code>.
	 */
	public String getLclChnlId() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.LCL_CHNL_AUDIT.LCL_CHNL_DESC_TXT</code>.
	 */
	public void setLclChnlDescTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.LCL_CHNL_AUDIT.LCL_CHNL_DESC_TXT</code>.
	 */
	public String getLclChnlDescTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.LCL_CHNL_AUDIT.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.LCL_CHNL_AUDIT.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.LCL_CHNL_AUDIT.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.LCL_CHNL_AUDIT.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.LCL_CHNL_AUDIT.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.LCL_CHNL_AUDIT.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.LCL_CHNL_AUDIT.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.LCL_CHNL_AUDIT.LAST_UPDT_TS</code>.
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
	public Row7<BigDecimal, String, String, String, Date, String, Date> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<BigDecimal, String, String, String, Date, String, Date> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return LclChnlAudit.LCL_CHNL_AUDIT.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return LclChnlAudit.LCL_CHNL_AUDIT.LCL_CHNL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return LclChnlAudit.LCL_CHNL_AUDIT.LCL_CHNL_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return LclChnlAudit.LCL_CHNL_AUDIT.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return LclChnlAudit.LCL_CHNL_AUDIT.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return LclChnlAudit.LCL_CHNL_AUDIT.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return LclChnlAudit.LCL_CHNL_AUDIT.LAST_UPDT_TS;
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
	public String value2() {
		return getLclChnlId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getLclChnlDescTxt();
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
	public LclChnlAuditRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LclChnlAuditRecord value2(String value) {
		setLclChnlId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LclChnlAuditRecord value3(String value) {
		setLclChnlDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LclChnlAuditRecord value4(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LclChnlAuditRecord value5(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LclChnlAuditRecord value6(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LclChnlAuditRecord value7(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LclChnlAuditRecord values(BigDecimal value1, String value2, String value3, String value4, Date value5, String value6, Date value7) {
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
	 * Create a detached LclChnlAuditRecord
	 */
	public LclChnlAuditRecord() {
		super(LclChnlAudit.LCL_CHNL_AUDIT);
	}

	/**
	 * Create a detached, initialised LclChnlAuditRecord
	 */
	public LclChnlAuditRecord(BigDecimal mrktId, String lclChnlId, String lclChnlDescTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(LclChnlAudit.LCL_CHNL_AUDIT);

		setValue(0, mrktId);
		setValue(1, lclChnlId);
		setValue(2, lclChnlDescTxt);
		setValue(3, creatUserId);
		setValue(4, creatTs);
		setValue(5, lastUpdtUserId);
		setValue(6, lastUpdtTs);
	}
}
