/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.VBrnd;


/**
 * snapshot table for snapshot V_BRND
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VBrndRecord extends TableRecordImpl<VBrndRecord> implements Record11<BigDecimal, String, Date, String, String, BigDecimal, String, String, String, BigDecimal, Date> {

	private static final long serialVersionUID = 2128121623;

	/**
	 * Setter for <code>WETRN.V_BRND.BRND_ID</code>.
	 */
	public void setBrndId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.V_BRND.BRND_ID</code>.
	 */
	public BigDecimal getBrndId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.V_BRND.BRND_NM</code>.
	 */
	public void setBrndNm(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.V_BRND.BRND_NM</code>.
	 */
	public String getBrndNm() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.V_BRND.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.V_BRND.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.V_BRND.BRND_GRP_NM</code>.
	 */
	public void setBrndGrpNm(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.V_BRND.BRND_GRP_NM</code>.
	 */
	public String getBrndGrpNm() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.V_BRND.BRND_TYP</code>.
	 */
	public void setBrndTyp(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.V_BRND.BRND_TYP</code>.
	 */
	public String getBrndTyp() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.V_BRND.BRND_GRP_ID</code>.
	 */
	public void setBrndGrpId(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.V_BRND.BRND_GRP_ID</code>.
	 */
	public BigDecimal getBrndGrpId() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.V_BRND.BRND_FMLY_NM</code>.
	 */
	public void setBrndFmlyNm(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.V_BRND.BRND_FMLY_NM</code>.
	 */
	public String getBrndFmlyNm() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.V_BRND.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.V_BRND.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.V_BRND.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.V_BRND.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.V_BRND.BRND_FMLY_ID</code>.
	 */
	public void setBrndFmlyId(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.V_BRND.BRND_FMLY_ID</code>.
	 */
	public BigDecimal getBrndFmlyId() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.V_BRND.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.V_BRND.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<BigDecimal, String, Date, String, String, BigDecimal, String, String, String, BigDecimal, Date> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<BigDecimal, String, Date, String, String, BigDecimal, String, String, String, BigDecimal, Date> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return VBrnd.V_BRND.BRND_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return VBrnd.V_BRND.BRND_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field3() {
		return VBrnd.V_BRND.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return VBrnd.V_BRND.BRND_GRP_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return VBrnd.V_BRND.BRND_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return VBrnd.V_BRND.BRND_GRP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return VBrnd.V_BRND.BRND_FMLY_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return VBrnd.V_BRND.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return VBrnd.V_BRND.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field10() {
		return VBrnd.V_BRND.BRND_FMLY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field11() {
		return VBrnd.V_BRND.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getBrndId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getBrndNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value3() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getBrndGrpNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getBrndTyp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getBrndGrpId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getBrndFmlyNm();
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
	public String value9() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value10() {
		return getBrndFmlyId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value11() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBrndRecord value1(BigDecimal value) {
		setBrndId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBrndRecord value2(String value) {
		setBrndNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBrndRecord value3(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBrndRecord value4(String value) {
		setBrndGrpNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBrndRecord value5(String value) {
		setBrndTyp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBrndRecord value6(BigDecimal value) {
		setBrndGrpId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBrndRecord value7(String value) {
		setBrndFmlyNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBrndRecord value8(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBrndRecord value9(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBrndRecord value10(BigDecimal value) {
		setBrndFmlyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBrndRecord value11(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBrndRecord values(BigDecimal value1, String value2, Date value3, String value4, String value5, BigDecimal value6, String value7, String value8, String value9, BigDecimal value10, Date value11) {
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
	 * Create a detached VBrndRecord
	 */
	public VBrndRecord() {
		super(VBrnd.V_BRND);
	}

	/**
	 * Create a detached, initialised VBrndRecord
	 */
	public VBrndRecord(BigDecimal brndId, String brndNm, Date lastUpdtTs, String brndGrpNm, String brndTyp, BigDecimal brndGrpId, String brndFmlyNm, String creatUserId, String lastUpdtUserId, BigDecimal brndFmlyId, Date creatTs) {
		super(VBrnd.V_BRND);

		setValue(0, brndId);
		setValue(1, brndNm);
		setValue(2, lastUpdtTs);
		setValue(3, brndGrpNm);
		setValue(4, brndTyp);
		setValue(5, brndGrpId);
		setValue(6, brndFmlyNm);
		setValue(7, creatUserId);
		setValue(8, lastUpdtUserId);
		setValue(9, brndFmlyId);
		setValue(10, creatTs);
	}
}
