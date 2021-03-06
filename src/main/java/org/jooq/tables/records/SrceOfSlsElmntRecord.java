/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.SrceOfSlsElmnt;


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
public class SrceOfSlsElmntRecord extends UpdatableRecordImpl<SrceOfSlsElmntRecord> implements Record9<BigDecimal, String, String, Date, String, Date, String, BigDecimal, String> {

	private static final long serialVersionUID = -1671130715;

	/**
	 * Setter for <code>WETRN.SRCE_OF_SLS_ELMNT.SRCE_OF_SLS_ELMNT_ID</code>.
	 */
	public void setSrceOfSlsElmntId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.SRCE_OF_SLS_ELMNT.SRCE_OF_SLS_ELMNT_ID</code>.
	 */
	public BigDecimal getSrceOfSlsElmntId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.SRCE_OF_SLS_ELMNT.SRCE_OF_SLS_ELMNT_NM</code>.
	 */
	public void setSrceOfSlsElmntNm(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.SRCE_OF_SLS_ELMNT.SRCE_OF_SLS_ELMNT_NM</code>.
	 */
	public String getSrceOfSlsElmntNm() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.SRCE_OF_SLS_ELMNT.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.SRCE_OF_SLS_ELMNT.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.SRCE_OF_SLS_ELMNT.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.SRCE_OF_SLS_ELMNT.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.SRCE_OF_SLS_ELMNT.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.SRCE_OF_SLS_ELMNT.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.SRCE_OF_SLS_ELMNT.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.SRCE_OF_SLS_ELMNT.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.SRCE_OF_SLS_ELMNT.OFF_SCHDL_IND</code>.
	 */
	public void setOffSchdlInd(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.SRCE_OF_SLS_ELMNT.OFF_SCHDL_IND</code>.
	 */
	public String getOffSchdlInd() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.SRCE_OF_SLS_ELMNT.OTHR_SRCE_OF_SLS_ELMNT_LINK_ID</code>.
	 */
	public void setOthrSrceOfSlsElmntLinkId(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.SRCE_OF_SLS_ELMNT.OTHR_SRCE_OF_SLS_ELMNT_LINK_ID</code>.
	 */
	public BigDecimal getOthrSrceOfSlsElmntLinkId() {
		return (BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.SRCE_OF_SLS_ELMNT.PLUG_IND</code>.
	 */
	public void setPlugInd(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.SRCE_OF_SLS_ELMNT.PLUG_IND</code>.
	 */
	public String getPlugInd() {
		return (String) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, String, String, Date, String, Date, String, BigDecimal, String> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, String, String, Date, String, Date, String, BigDecimal, String> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return SrceOfSlsElmnt.SRCE_OF_SLS_ELMNT.SRCE_OF_SLS_ELMNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return SrceOfSlsElmnt.SRCE_OF_SLS_ELMNT.SRCE_OF_SLS_ELMNT_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return SrceOfSlsElmnt.SRCE_OF_SLS_ELMNT.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return SrceOfSlsElmnt.SRCE_OF_SLS_ELMNT.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return SrceOfSlsElmnt.SRCE_OF_SLS_ELMNT.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return SrceOfSlsElmnt.SRCE_OF_SLS_ELMNT.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return SrceOfSlsElmnt.SRCE_OF_SLS_ELMNT.OFF_SCHDL_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field8() {
		return SrceOfSlsElmnt.SRCE_OF_SLS_ELMNT.OTHR_SRCE_OF_SLS_ELMNT_LINK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return SrceOfSlsElmnt.SRCE_OF_SLS_ELMNT.PLUG_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getSrceOfSlsElmntId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getSrceOfSlsElmntNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value4() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value6() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getOffSchdlInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value8() {
		return getOthrSrceOfSlsElmntLinkId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getPlugInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SrceOfSlsElmntRecord value1(BigDecimal value) {
		setSrceOfSlsElmntId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SrceOfSlsElmntRecord value2(String value) {
		setSrceOfSlsElmntNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SrceOfSlsElmntRecord value3(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SrceOfSlsElmntRecord value4(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SrceOfSlsElmntRecord value5(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SrceOfSlsElmntRecord value6(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SrceOfSlsElmntRecord value7(String value) {
		setOffSchdlInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SrceOfSlsElmntRecord value8(BigDecimal value) {
		setOthrSrceOfSlsElmntLinkId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SrceOfSlsElmntRecord value9(String value) {
		setPlugInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SrceOfSlsElmntRecord values(BigDecimal value1, String value2, String value3, Date value4, String value5, Date value6, String value7, BigDecimal value8, String value9) {
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
	 * Create a detached SrceOfSlsElmntRecord
	 */
	public SrceOfSlsElmntRecord() {
		super(SrceOfSlsElmnt.SRCE_OF_SLS_ELMNT);
	}

	/**
	 * Create a detached, initialised SrceOfSlsElmntRecord
	 */
	public SrceOfSlsElmntRecord(BigDecimal srceOfSlsElmntId, String srceOfSlsElmntNm, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String offSchdlInd, BigDecimal othrSrceOfSlsElmntLinkId, String plugInd) {
		super(SrceOfSlsElmnt.SRCE_OF_SLS_ELMNT);

		setValue(0, srceOfSlsElmntId);
		setValue(1, srceOfSlsElmntNm);
		setValue(2, creatUserId);
		setValue(3, creatTs);
		setValue(4, lastUpdtUserId);
		setValue(5, lastUpdtTs);
		setValue(6, offSchdlInd);
		setValue(7, othrSrceOfSlsElmntLinkId);
		setValue(8, plugInd);
	}
}
