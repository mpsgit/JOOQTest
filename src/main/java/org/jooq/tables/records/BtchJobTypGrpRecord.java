/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.BtchJobTypGrp;


/**
 * Batch job type group.  The group that the batch job type belongs to (for 
 * grouping related job types).  Job types within the same job type group 
 * should not be run at the same time.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BtchJobTypGrpRecord extends UpdatableRecordImpl<BtchJobTypGrpRecord> implements Record8<BigDecimal, String, String, String, String, Date, String, Date> {

	private static final long serialVersionUID = 755067298;

	/**
	 * Setter for <code>WETRN.BTCH_JOB_TYP_GRP.BTCH_JOB_TYP_GRP_ID</code>.
	 */
	public void setBtchJobTypGrpId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_TYP_GRP.BTCH_JOB_TYP_GRP_ID</code>.
	 */
	public BigDecimal getBtchJobTypGrpId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB_TYP_GRP.BTCH_JOB_TYP_GRP_SDESC_TXT</code>.
	 */
	public void setBtchJobTypGrpSdescTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_TYP_GRP.BTCH_JOB_TYP_GRP_SDESC_TXT</code>.
	 */
	public String getBtchJobTypGrpSdescTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB_TYP_GRP.BTCH_JOB_TYP_GRP_DESC_TXT</code>.
	 */
	public void setBtchJobTypGrpDescTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_TYP_GRP.BTCH_JOB_TYP_GRP_DESC_TXT</code>.
	 */
	public String getBtchJobTypGrpDescTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB_TYP_GRP.BTCH_JOB_TYP_GRP_ACTV_IND</code>. Batch job type group active indicator.  Indicates if job types in this group are to be processed.  Valid values are {'N', 'Y'}.
	 */
	public void setBtchJobTypGrpActvInd(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_TYP_GRP.BTCH_JOB_TYP_GRP_ACTV_IND</code>. Batch job type group active indicator.  Indicates if job types in this group are to be processed.  Valid values are {'N', 'Y'}.
	 */
	public String getBtchJobTypGrpActvInd() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB_TYP_GRP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public void setCreatUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_TYP_GRP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public String getCreatUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB_TYP_GRP.CREAT_TS</code>. The date and time the row was created.
	 */
	public void setCreatTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_TYP_GRP.CREAT_TS</code>. The date and time the row was created.
	 */
	public Date getCreatTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB_TYP_GRP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_TYP_GRP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.BTCH_JOB_TYP_GRP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.BTCH_JOB_TYP_GRP.LAST_UPDT_TS</code>. The date and time the row was last updated.
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
	public Record1<BigDecimal> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, String, String, String, String, Date, String, Date> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, String, String, String, String, Date, String, Date> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return BtchJobTypGrp.BTCH_JOB_TYP_GRP.BTCH_JOB_TYP_GRP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return BtchJobTypGrp.BTCH_JOB_TYP_GRP.BTCH_JOB_TYP_GRP_SDESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return BtchJobTypGrp.BTCH_JOB_TYP_GRP.BTCH_JOB_TYP_GRP_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return BtchJobTypGrp.BTCH_JOB_TYP_GRP.BTCH_JOB_TYP_GRP_ACTV_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return BtchJobTypGrp.BTCH_JOB_TYP_GRP.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return BtchJobTypGrp.BTCH_JOB_TYP_GRP.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return BtchJobTypGrp.BTCH_JOB_TYP_GRP.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return BtchJobTypGrp.BTCH_JOB_TYP_GRP.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getBtchJobTypGrpId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getBtchJobTypGrpSdescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getBtchJobTypGrpDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getBtchJobTypGrpActvInd();
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
	public BtchJobTypGrpRecord value1(BigDecimal value) {
		setBtchJobTypGrpId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobTypGrpRecord value2(String value) {
		setBtchJobTypGrpSdescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobTypGrpRecord value3(String value) {
		setBtchJobTypGrpDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobTypGrpRecord value4(String value) {
		setBtchJobTypGrpActvInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobTypGrpRecord value5(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobTypGrpRecord value6(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobTypGrpRecord value7(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobTypGrpRecord value8(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobTypGrpRecord values(BigDecimal value1, String value2, String value3, String value4, String value5, Date value6, String value7, Date value8) {
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
	 * Create a detached BtchJobTypGrpRecord
	 */
	public BtchJobTypGrpRecord() {
		super(BtchJobTypGrp.BTCH_JOB_TYP_GRP);
	}

	/**
	 * Create a detached, initialised BtchJobTypGrpRecord
	 */
	public BtchJobTypGrpRecord(BigDecimal btchJobTypGrpId, String btchJobTypGrpSdescTxt, String btchJobTypGrpDescTxt, String btchJobTypGrpActvInd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(BtchJobTypGrp.BTCH_JOB_TYP_GRP);

		setValue(0, btchJobTypGrpId);
		setValue(1, btchJobTypGrpSdescTxt);
		setValue(2, btchJobTypGrpDescTxt);
		setValue(3, btchJobTypGrpActvInd);
		setValue(4, creatUserId);
		setValue(5, creatTs);
		setValue(6, lastUpdtUserId);
		setValue(7, lastUpdtTs);
	}
}
