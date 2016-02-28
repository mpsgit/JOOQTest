/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Record3;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.PlugGrp;


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
public class PlugGrpRecord extends UpdatableRecordImpl<PlugGrpRecord> implements Record11<BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, String, Date, String, Date, BigDecimal> {

	private static final long serialVersionUID = 930238152;

	/**
	 * Setter for <code>WETRN.PLUG_GRP.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_GRP.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.PLUG_GRP.VEH_ID</code>.
	 */
	public void setVehId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_GRP.VEH_ID</code>.
	 */
	public BigDecimal getVehId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.PLUG_GRP.PLUG_GRP_ID</code>.
	 */
	public void setPlugGrpId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_GRP.PLUG_GRP_ID</code>.
	 */
	public BigDecimal getPlugGrpId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.PLUG_GRP.PLUG_GRP_DESC_TXT</code>.
	 */
	public void setPlugGrpDescTxt(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_GRP.PLUG_GRP_DESC_TXT</code>.
	 */
	public String getPlugGrpDescTxt() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.PLUG_GRP.PLUG_TYPE_ID</code>.
	 */
	public void setPlugTypeId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_GRP.PLUG_TYPE_ID</code>.
	 */
	public BigDecimal getPlugTypeId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.PLUG_GRP.DLTD_IND</code>.
	 */
	public void setDltdInd(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_GRP.DLTD_IND</code>.
	 */
	public String getDltdInd() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.PLUG_GRP.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_GRP.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.PLUG_GRP.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_GRP.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.PLUG_GRP.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_GRP.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.PLUG_GRP.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_GRP.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.PLUG_GRP.SRCE_OF_SLS_ELMNT_ID</code>.
	 */
	public void setSrceOfSlsElmntId(BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_GRP.SRCE_OF_SLS_ELMNT_ID</code>.
	 */
	public BigDecimal getSrceOfSlsElmntId() {
		return (BigDecimal) getValue(10);
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
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, String, Date, String, Date, BigDecimal> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, String, Date, String, Date, BigDecimal> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return PlugGrp.PLUG_GRP.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return PlugGrp.PLUG_GRP.VEH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return PlugGrp.PLUG_GRP.PLUG_GRP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return PlugGrp.PLUG_GRP.PLUG_GRP_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return PlugGrp.PLUG_GRP.PLUG_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return PlugGrp.PLUG_GRP.DLTD_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return PlugGrp.PLUG_GRP.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return PlugGrp.PLUG_GRP.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return PlugGrp.PLUG_GRP.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return PlugGrp.PLUG_GRP.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field11() {
		return PlugGrp.PLUG_GRP.SRCE_OF_SLS_ELMNT_ID;
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
		return getVehId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getPlugGrpId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getPlugGrpDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getPlugTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getDltdInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value8() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value10() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value11() {
		return getSrceOfSlsElmntId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugGrpRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugGrpRecord value2(BigDecimal value) {
		setVehId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugGrpRecord value3(BigDecimal value) {
		setPlugGrpId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugGrpRecord value4(String value) {
		setPlugGrpDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugGrpRecord value5(BigDecimal value) {
		setPlugTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugGrpRecord value6(String value) {
		setDltdInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugGrpRecord value7(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugGrpRecord value8(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugGrpRecord value9(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugGrpRecord value10(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugGrpRecord value11(BigDecimal value) {
		setSrceOfSlsElmntId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugGrpRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, String value4, BigDecimal value5, String value6, String value7, Date value8, String value9, Date value10, BigDecimal value11) {
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
	 * Create a detached PlugGrpRecord
	 */
	public PlugGrpRecord() {
		super(PlugGrp.PLUG_GRP);
	}

	/**
	 * Create a detached, initialised PlugGrpRecord
	 */
	public PlugGrpRecord(BigDecimal mrktId, BigDecimal vehId, BigDecimal plugGrpId, String plugGrpDescTxt, BigDecimal plugTypeId, String dltdInd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, BigDecimal srceOfSlsElmntId) {
		super(PlugGrp.PLUG_GRP);

		setValue(0, mrktId);
		setValue(1, vehId);
		setValue(2, plugGrpId);
		setValue(3, plugGrpDescTxt);
		setValue(4, plugTypeId);
		setValue(5, dltdInd);
		setValue(6, creatUserId);
		setValue(7, creatTs);
		setValue(8, lastUpdtUserId);
		setValue(9, lastUpdtTs);
		setValue(10, srceOfSlsElmntId);
	}
}