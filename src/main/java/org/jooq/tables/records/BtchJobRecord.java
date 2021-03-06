/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.BtchJob;


/**
 * Batch job.  There are none, one or many batch jobs in a batch job type. 
 *  A batch job groups together tasks that are related but not necessarily 
 * dependent on each other.  They may have been submitted as part of one user 
 * request.  E.g. Copy offers to market.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BtchJobRecord extends UpdatableRecordImpl<BtchJobRecord> implements Record11<BigDecimal, String, String, BigDecimal, BigDecimal, Date, Date, String, Date, String, Date> {

	private static final long serialVersionUID = 207220430;

	/**
	 * Setter for <code>WETRN.BTCH_JOB.BTCH_JOB_ID</code>. Batch job id.  Unique identifier for a batch job.
	 */
	public void setBtchJobId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB.BTCH_JOB_ID</code>. Batch job id.  Unique identifier for a batch job.
	 */
	public BigDecimal getBtchJobId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB.BTCH_JOB_SDESC_TXT</code>.
	 */
	public void setBtchJobSdescTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB.BTCH_JOB_SDESC_TXT</code>.
	 */
	public String getBtchJobSdescTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB.BTCH_JOB_DESC_TXT</code>.
	 */
	public void setBtchJobDescTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB.BTCH_JOB_DESC_TXT</code>.
	 */
	public String getBtchJobDescTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB.BTCH_JOB_TYP_ID</code>. Batch job type id.  The batch job type that this batch job belongs to.
	 */
	public void setBtchJobTypId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB.BTCH_JOB_TYP_ID</code>. Batch job type id.  The batch job type that this batch job belongs to.
	 */
	public BigDecimal getBtchJobTypId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB.BTCH_JOB_STUS_ID</code>. Batch job status id.  The status of the batch job.
	 */
	public void setBtchJobStusId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB.BTCH_JOB_STUS_ID</code>. Batch job status id.  The status of the batch job.
	 */
	public BigDecimal getBtchJobStusId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB.BTCH_JOB_STRT_TS</code>. Batch job start timestamp.  The date/time that the job was started.
	 */
	public void setBtchJobStrtTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB.BTCH_JOB_STRT_TS</code>. Batch job start timestamp.  The date/time that the job was started.
	 */
	public Date getBtchJobStrtTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB.BTCH_JOB_END_TS</code>. Batch job end timestamp.  The date/time that the job finished.
	 */
	public void setBtchJobEndTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB.BTCH_JOB_END_TS</code>. Batch job end timestamp.  The date/time that the job finished.
	 */
	public Date getBtchJobEndTs() {
		return (Date) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public void setCreatUserId(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public String getCreatUserId() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB.CREAT_TS</code>. The date and time the row was created.
	 */
	public void setCreatTs(Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB.CREAT_TS</code>. The date and time the row was created.
	 */
	public Date getCreatTs() {
		return (Date) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(10);
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
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<BigDecimal, String, String, BigDecimal, BigDecimal, Date, Date, String, Date, String, Date> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<BigDecimal, String, String, BigDecimal, BigDecimal, Date, Date, String, Date, String, Date> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return BtchJob.BTCH_JOB.BTCH_JOB_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return BtchJob.BTCH_JOB.BTCH_JOB_SDESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return BtchJob.BTCH_JOB.BTCH_JOB_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return BtchJob.BTCH_JOB.BTCH_JOB_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return BtchJob.BTCH_JOB.BTCH_JOB_STUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return BtchJob.BTCH_JOB.BTCH_JOB_STRT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return BtchJob.BTCH_JOB.BTCH_JOB_END_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return BtchJob.BTCH_JOB.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field9() {
		return BtchJob.BTCH_JOB.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return BtchJob.BTCH_JOB.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field11() {
		return BtchJob.BTCH_JOB.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getBtchJobId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getBtchJobSdescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getBtchJobDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getBtchJobTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getBtchJobStusId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value6() {
		return getBtchJobStrtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value7() {
		return getBtchJobEndTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value9() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value11() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobRecord value1(BigDecimal value) {
		setBtchJobId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobRecord value2(String value) {
		setBtchJobSdescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobRecord value3(String value) {
		setBtchJobDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobRecord value4(BigDecimal value) {
		setBtchJobTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobRecord value5(BigDecimal value) {
		setBtchJobStusId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobRecord value6(Date value) {
		setBtchJobStrtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobRecord value7(Date value) {
		setBtchJobEndTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobRecord value8(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobRecord value9(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobRecord value10(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobRecord value11(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobRecord values(BigDecimal value1, String value2, String value3, BigDecimal value4, BigDecimal value5, Date value6, Date value7, String value8, Date value9, String value10, Date value11) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BtchJobRecord
	 */
	public BtchJobRecord() {
		super(BtchJob.BTCH_JOB);
	}

	/**
	 * Create a detached, initialised BtchJobRecord
	 */
	public BtchJobRecord(BigDecimal btchJobId, String btchJobSdescTxt, String btchJobDescTxt, BigDecimal btchJobTypId, BigDecimal btchJobStusId, Date btchJobStrtTs, Date btchJobEndTs, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(BtchJob.BTCH_JOB);

		setValue(0, btchJobId);
		setValue(1, btchJobSdescTxt);
		setValue(2, btchJobDescTxt);
		setValue(3, btchJobTypId);
		setValue(4, btchJobStusId);
		setValue(5, btchJobStrtTs);
		setValue(6, btchJobEndTs);
		setValue(7, creatUserId);
		setValue(8, creatTs);
		setValue(9, lastUpdtUserId);
		setValue(10, lastUpdtTs);
	}
}
