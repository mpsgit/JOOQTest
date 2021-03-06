/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.MrktSaGtaOvrrdAudit;


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
public class MrktSaGtaOvrrdAuditRecord extends TableRecordImpl<MrktSaGtaOvrrdAuditRecord> implements Record10<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, Date, String, Date, String> {

	private static final long serialVersionUID = 511355507;

	/**
	 * Setter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.STRT_SLS_PERD_ID</code>.
	 */
	public void setStrtSlsPerdId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.STRT_SLS_PERD_ID</code>.
	 */
	public BigDecimal getStrtSlsPerdId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.END_SLS_PERD_ID</code>.
	 */
	public void setEndSlsPerdId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.END_SLS_PERD_ID</code>.
	 */
	public BigDecimal getEndSlsPerdId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.SLS_TYP_ID</code>.
	 */
	public void setSlsTypId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.SLS_TYP_ID</code>.
	 */
	public BigDecimal getSlsTypId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.LCL_BILNG_ACTN_CD</code>.
	 */
	public void setLclBilngActnCd(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.LCL_BILNG_ACTN_CD</code>.
	 */
	public String getLclBilngActnCd() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.SLS_CHNL_CD</code>.
	 */
	public void setSlsChnlCd(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_SA_GTA_OVRRD_AUDIT.SLS_CHNL_CD</code>.
	 */
	public String getSlsChnlCd() {
		return (String) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, Date, String, Date, String> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, Date, String, Date, String> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MrktSaGtaOvrrdAudit.MRKT_SA_GTA_OVRRD_AUDIT.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MrktSaGtaOvrrdAudit.MRKT_SA_GTA_OVRRD_AUDIT.STRT_SLS_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return MrktSaGtaOvrrdAudit.MRKT_SA_GTA_OVRRD_AUDIT.END_SLS_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return MrktSaGtaOvrrdAudit.MRKT_SA_GTA_OVRRD_AUDIT.SLS_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return MrktSaGtaOvrrdAudit.MRKT_SA_GTA_OVRRD_AUDIT.LCL_BILNG_ACTN_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return MrktSaGtaOvrrdAudit.MRKT_SA_GTA_OVRRD_AUDIT.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return MrktSaGtaOvrrdAudit.MRKT_SA_GTA_OVRRD_AUDIT.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return MrktSaGtaOvrrdAudit.MRKT_SA_GTA_OVRRD_AUDIT.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field9() {
		return MrktSaGtaOvrrdAudit.MRKT_SA_GTA_OVRRD_AUDIT.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return MrktSaGtaOvrrdAudit.MRKT_SA_GTA_OVRRD_AUDIT.SLS_CHNL_CD;
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
		return getStrtSlsPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getEndSlsPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getSlsTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getLclBilngActnCd();
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
	public String value10() {
		return getSlsChnlCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSaGtaOvrrdAuditRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSaGtaOvrrdAuditRecord value2(BigDecimal value) {
		setStrtSlsPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSaGtaOvrrdAuditRecord value3(BigDecimal value) {
		setEndSlsPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSaGtaOvrrdAuditRecord value4(BigDecimal value) {
		setSlsTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSaGtaOvrrdAuditRecord value5(String value) {
		setLclBilngActnCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSaGtaOvrrdAuditRecord value6(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSaGtaOvrrdAuditRecord value7(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSaGtaOvrrdAuditRecord value8(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSaGtaOvrrdAuditRecord value9(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSaGtaOvrrdAuditRecord value10(String value) {
		setSlsChnlCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSaGtaOvrrdAuditRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, String value5, String value6, Date value7, String value8, Date value9, String value10) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MrktSaGtaOvrrdAuditRecord
	 */
	public MrktSaGtaOvrrdAuditRecord() {
		super(MrktSaGtaOvrrdAudit.MRKT_SA_GTA_OVRRD_AUDIT);
	}

	/**
	 * Create a detached, initialised MrktSaGtaOvrrdAuditRecord
	 */
	public MrktSaGtaOvrrdAuditRecord(BigDecimal mrktId, BigDecimal strtSlsPerdId, BigDecimal endSlsPerdId, BigDecimal slsTypId, String lclBilngActnCd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String slsChnlCd) {
		super(MrktSaGtaOvrrdAudit.MRKT_SA_GTA_OVRRD_AUDIT);

		setValue(0, mrktId);
		setValue(1, strtSlsPerdId);
		setValue(2, endSlsPerdId);
		setValue(3, slsTypId);
		setValue(4, lclBilngActnCd);
		setValue(5, creatUserId);
		setValue(6, creatTs);
		setValue(7, lastUpdtUserId);
		setValue(8, lastUpdtTs);
		setValue(9, slsChnlCd);
	}
}
