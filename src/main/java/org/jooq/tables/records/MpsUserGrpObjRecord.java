/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.MpsUserGrpObj;


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
public class MpsUserGrpObjRecord extends UpdatableRecordImpl<MpsUserGrpObjRecord> implements Record8<BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, BigDecimal> {

	private static final long serialVersionUID = 1785975239;

	/**
	 * Setter for <code>WETRN.MPS_USER_GRP_OBJ.OBJ_ID</code>.
	 */
	public void setObjId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_GRP_OBJ.OBJ_ID</code>.
	 */
	public BigDecimal getObjId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_GRP_OBJ.CLSTR_ID</code>.
	 */
	public void setClstrId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_GRP_OBJ.CLSTR_ID</code>.
	 */
	public BigDecimal getClstrId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_GRP_OBJ.USER_GRP_ID</code>.
	 */
	public void setUserGrpId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_GRP_OBJ.USER_GRP_ID</code>.
	 */
	public BigDecimal getUserGrpId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_GRP_OBJ.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_GRP_OBJ.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_GRP_OBJ.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_GRP_OBJ.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_GRP_OBJ.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_GRP_OBJ.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_GRP_OBJ.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_GRP_OBJ.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_GRP_OBJ.SYS_ID</code>.
	 */
	public void setSysId(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_GRP_OBJ.SYS_ID</code>.
	 */
	public BigDecimal getSysId() {
		return (BigDecimal) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record4<BigDecimal, BigDecimal, BigDecimal, BigDecimal> key() {
		return (Record4) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, BigDecimal> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, BigDecimal> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MpsUserGrpObj.MPS_USER_GRP_OBJ.OBJ_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MpsUserGrpObj.MPS_USER_GRP_OBJ.CLSTR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return MpsUserGrpObj.MPS_USER_GRP_OBJ.USER_GRP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return MpsUserGrpObj.MPS_USER_GRP_OBJ.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return MpsUserGrpObj.MPS_USER_GRP_OBJ.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return MpsUserGrpObj.MPS_USER_GRP_OBJ.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return MpsUserGrpObj.MPS_USER_GRP_OBJ.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field8() {
		return MpsUserGrpObj.MPS_USER_GRP_OBJ.SYS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getObjId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getClstrId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getUserGrpId();
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
	public BigDecimal value8() {
		return getSysId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserGrpObjRecord value1(BigDecimal value) {
		setObjId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserGrpObjRecord value2(BigDecimal value) {
		setClstrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserGrpObjRecord value3(BigDecimal value) {
		setUserGrpId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserGrpObjRecord value4(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserGrpObjRecord value5(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserGrpObjRecord value6(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserGrpObjRecord value7(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserGrpObjRecord value8(BigDecimal value) {
		setSysId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserGrpObjRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, String value4, Date value5, String value6, Date value7, BigDecimal value8) {
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
	 * Create a detached MpsUserGrpObjRecord
	 */
	public MpsUserGrpObjRecord() {
		super(MpsUserGrpObj.MPS_USER_GRP_OBJ);
	}

	/**
	 * Create a detached, initialised MpsUserGrpObjRecord
	 */
	public MpsUserGrpObjRecord(BigDecimal objId, BigDecimal clstrId, BigDecimal userGrpId, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, BigDecimal sysId) {
		super(MpsUserGrpObj.MPS_USER_GRP_OBJ);

		setValue(0, objId);
		setValue(1, clstrId);
		setValue(2, userGrpId);
		setValue(3, creatUserId);
		setValue(4, creatTs);
		setValue(5, lastUpdtUserId);
		setValue(6, lastUpdtTs);
		setValue(7, sysId);
	}
}