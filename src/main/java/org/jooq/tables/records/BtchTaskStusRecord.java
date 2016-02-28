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
import org.jooq.tables.BtchTaskStus;


/**
 * Batch task status.  The status of the task.  E.g. 'Running'.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BtchTaskStusRecord extends UpdatableRecordImpl<BtchTaskStusRecord> implements Record7<BigDecimal, String, String, String, Date, String, Date> {

	private static final long serialVersionUID = -1153659171;

	/**
	 * Setter for <code>WETRN.BTCH_TASK_STUS.BTCH_TASK_STUS_ID</code>. Batch task status id.  Unique identifier for a batch task status.
	 */
	public void setBtchTaskStusId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_TASK_STUS.BTCH_TASK_STUS_ID</code>. Batch task status id.  Unique identifier for a batch task status.
	 */
	public BigDecimal getBtchTaskStusId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.BTCH_TASK_STUS.BTCH_TASK_STUS_SDESC_TXT</code>.
	 */
	public void setBtchTaskStusSdescTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_TASK_STUS.BTCH_TASK_STUS_SDESC_TXT</code>.
	 */
	public String getBtchTaskStusSdescTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.BTCH_TASK_STUS.BTCH_TASK_STUS_DESC_TXT</code>.
	 */
	public void setBtchTaskStusDescTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_TASK_STUS.BTCH_TASK_STUS_DESC_TXT</code>.
	 */
	public String getBtchTaskStusDescTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.BTCH_TASK_STUS.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public void setCreatUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_TASK_STUS.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public String getCreatUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.BTCH_TASK_STUS.CREAT_TS</code>. The date and time the row was created.
	 */
	public void setCreatTs(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_TASK_STUS.CREAT_TS</code>. The date and time the row was created.
	 */
	public Date getCreatTs() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.BTCH_TASK_STUS.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_TASK_STUS.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.BTCH_TASK_STUS.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_TASK_STUS.LAST_UPDT_TS</code>. The date and time the row was last updated.
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
		return BtchTaskStus.BTCH_TASK_STUS.BTCH_TASK_STUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return BtchTaskStus.BTCH_TASK_STUS.BTCH_TASK_STUS_SDESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return BtchTaskStus.BTCH_TASK_STUS.BTCH_TASK_STUS_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return BtchTaskStus.BTCH_TASK_STUS.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return BtchTaskStus.BTCH_TASK_STUS.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return BtchTaskStus.BTCH_TASK_STUS.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return BtchTaskStus.BTCH_TASK_STUS.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getBtchTaskStusId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getBtchTaskStusSdescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getBtchTaskStusDescTxt();
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
	public BtchTaskStusRecord value1(BigDecimal value) {
		setBtchTaskStusId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchTaskStusRecord value2(String value) {
		setBtchTaskStusSdescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchTaskStusRecord value3(String value) {
		setBtchTaskStusDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchTaskStusRecord value4(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchTaskStusRecord value5(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchTaskStusRecord value6(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchTaskStusRecord value7(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchTaskStusRecord values(BigDecimal value1, String value2, String value3, String value4, Date value5, String value6, Date value7) {
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
	 * Create a detached BtchTaskStusRecord
	 */
	public BtchTaskStusRecord() {
		super(BtchTaskStus.BTCH_TASK_STUS);
	}

	/**
	 * Create a detached, initialised BtchTaskStusRecord
	 */
	public BtchTaskStusRecord(BigDecimal btchTaskStusId, String btchTaskStusSdescTxt, String btchTaskStusDescTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(BtchTaskStus.BTCH_TASK_STUS);

		setValue(0, btchTaskStusId);
		setValue(1, btchTaskStusSdescTxt);
		setValue(2, btchTaskStusDescTxt);
		setValue(3, creatUserId);
		setValue(4, creatTs);
		setValue(5, lastUpdtUserId);
		setValue(6, lastUpdtTs);
	}
}