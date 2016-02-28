/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.MpsUserMrktVehAcs;


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
public class MpsUserMrktVehAcsRecord extends UpdatableRecordImpl<MpsUserMrktVehAcsRecord> implements Record9<String, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, BigDecimal> {

	private static final long serialVersionUID = 2060142008;

	/**
	 * Setter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.USER_NM</code>. Unique identifier for a USER of the Marketing Planning System.
	 */
	public void setUserNm(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.USER_NM</code>. Unique identifier for a USER of the Marketing Planning System.
	 */
	public String getUserNm() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.CLSTR_ID</code>. The unique identifier for a Cluster which is a grouping of markets that have similar consumer characteristics.
	 */
	public void setClstrId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.CLSTR_ID</code>. The unique identifier for a Cluster which is a grouping of markets that have similar consumer characteristics.
	 */
	public BigDecimal getClstrId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.VEH_ID</code>. A unique surrogate identifier for a VEHICLE, such as a piece of Literature.
	 */
	public void setVehId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.VEH_ID</code>. A unique surrogate identifier for a VEHICLE, such as a piece of Literature.
	 */
	public BigDecimal getVehId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public void setCreatUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public String getCreatUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.CREAT_TS</code>. The date and time the row was created.
	 */
	public void setCreatTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.CREAT_TS</code>. The date and time the row was created.
	 */
	public Date getCreatTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.SYS_ID</code>. A unique identifier for the MAPS System. Values are: 1 (MARKETING ANALYSIS PLANNING SYSTEM), and 2 (LINE NUMBER MANAGEMENT SYSTEM).
	 */
	public void setSysId(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_USER_MRKT_VEH_ACS.SYS_ID</code>. A unique identifier for the MAPS System. Values are: 1 (MARKETING ANALYSIS PLANNING SYSTEM), and 2 (LINE NUMBER MANAGEMENT SYSTEM).
	 */
	public BigDecimal getSysId() {
		return (BigDecimal) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record5<BigDecimal, String, BigDecimal, BigDecimal, BigDecimal> key() {
		return (Record5) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, BigDecimal> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, BigDecimal> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return MpsUserMrktVehAcs.MPS_USER_MRKT_VEH_ACS.USER_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MpsUserMrktVehAcs.MPS_USER_MRKT_VEH_ACS.CLSTR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return MpsUserMrktVehAcs.MPS_USER_MRKT_VEH_ACS.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return MpsUserMrktVehAcs.MPS_USER_MRKT_VEH_ACS.VEH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return MpsUserMrktVehAcs.MPS_USER_MRKT_VEH_ACS.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return MpsUserMrktVehAcs.MPS_USER_MRKT_VEH_ACS.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return MpsUserMrktVehAcs.MPS_USER_MRKT_VEH_ACS.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return MpsUserMrktVehAcs.MPS_USER_MRKT_VEH_ACS.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return MpsUserMrktVehAcs.MPS_USER_MRKT_VEH_ACS.SYS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getUserNm();
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
		return getMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getVehId();
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
	public BigDecimal value9() {
		return getSysId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserMrktVehAcsRecord value1(String value) {
		setUserNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserMrktVehAcsRecord value2(BigDecimal value) {
		setClstrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserMrktVehAcsRecord value3(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserMrktVehAcsRecord value4(BigDecimal value) {
		setVehId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserMrktVehAcsRecord value5(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserMrktVehAcsRecord value6(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserMrktVehAcsRecord value7(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserMrktVehAcsRecord value8(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserMrktVehAcsRecord value9(BigDecimal value) {
		setSysId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserMrktVehAcsRecord values(String value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, String value5, Date value6, String value7, Date value8, BigDecimal value9) {
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
	 * Create a detached MpsUserMrktVehAcsRecord
	 */
	public MpsUserMrktVehAcsRecord() {
		super(MpsUserMrktVehAcs.MPS_USER_MRKT_VEH_ACS);
	}

	/**
	 * Create a detached, initialised MpsUserMrktVehAcsRecord
	 */
	public MpsUserMrktVehAcsRecord(String userNm, BigDecimal clstrId, BigDecimal mrktId, BigDecimal vehId, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, BigDecimal sysId) {
		super(MpsUserMrktVehAcs.MPS_USER_MRKT_VEH_ACS);

		setValue(0, userNm);
		setValue(1, clstrId);
		setValue(2, mrktId);
		setValue(3, vehId);
		setValue(4, creatUserId);
		setValue(5, creatTs);
		setValue(6, lastUpdtUserId);
		setValue(7, lastUpdtTs);
		setValue(8, sysId);
	}
}