/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.BtchJobStus;


/**
 * Batch job status.  The status of the job.  E.g. 'Scheduled'.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BtchJobStusRecord extends UpdatableRecordImpl<BtchJobStusRecord> implements Record7<BigDecimal, String, String, String, Date, String, Date> {

	private static final long serialVersionUID = -303337829;

	/**
	 * Setter for <code>WETRN.BTCH_JOB_STUS.BTCH_JOB_STUS_ID</code>. Batch job status id.  Unique identifier for a batch job status.  ID is manually entered (not from the SEQ).
	 */
	public void setBtchJobStusId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_STUS.BTCH_JOB_STUS_ID</code>. Batch job status id.  Unique identifier for a batch job status.  ID is manually entered (not from the SEQ).
	 */
	public BigDecimal getBtchJobStusId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB_STUS.BTCH_JOB_STUS_SDESC_TXT</code>.
	 */
	public void setBtchJobStusSdescTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_STUS.BTCH_JOB_STUS_SDESC_TXT</code>.
	 */
	public String getBtchJobStusSdescTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB_STUS.BTCH_JOB_STUS_DESC_TXT</code>.
	 */
	public void setBtchJobStusDescTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_STUS.BTCH_JOB_STUS_DESC_TXT</code>.
	 */
	public String getBtchJobStusDescTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB_STUS.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public void setCreatUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_STUS.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public String getCreatUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB_STUS.CREAT_TS</code>. The date and time the row was created.
	 */
	public void setCreatTs(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_STUS.CREAT_TS</code>. The date and time the row was created.
	 */
	public Date getCreatTs() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB_STUS.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_STUS.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB_STUS.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_STUS.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(6);
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
		return BtchJobStus.BTCH_JOB_STUS.BTCH_JOB_STUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return BtchJobStus.BTCH_JOB_STUS.BTCH_JOB_STUS_SDESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return BtchJobStus.BTCH_JOB_STUS.BTCH_JOB_STUS_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return BtchJobStus.BTCH_JOB_STUS.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return BtchJobStus.BTCH_JOB_STUS.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return BtchJobStus.BTCH_JOB_STUS.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return BtchJobStus.BTCH_JOB_STUS.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getBtchJobStusId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getBtchJobStusSdescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getBtchJobStusDescTxt();
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
	public BtchJobStusRecord value1(BigDecimal value) {
		setBtchJobStusId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobStusRecord value2(String value) {
		setBtchJobStusSdescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobStusRecord value3(String value) {
		setBtchJobStusDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobStusRecord value4(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobStusRecord value5(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobStusRecord value6(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobStusRecord value7(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobStusRecord values(BigDecimal value1, String value2, String value3, String value4, Date value5, String value6, Date value7) {
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
	 * Create a detached BtchJobStusRecord
	 */
	public BtchJobStusRecord() {
		super(BtchJobStus.BTCH_JOB_STUS);
	}

	/**
	 * Create a detached, initialised BtchJobStusRecord
	 */
	public BtchJobStusRecord(BigDecimal btchJobStusId, String btchJobStusSdescTxt, String btchJobStusDescTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(BtchJobStus.BTCH_JOB_STUS);

		setValue(0, btchJobStusId);
		setValue(1, btchJobStusSdescTxt);
		setValue(2, btchJobStusDescTxt);
		setValue(3, creatUserId);
		setValue(4, creatTs);
		setValue(5, lastUpdtUserId);
		setValue(6, lastUpdtTs);
	}
}