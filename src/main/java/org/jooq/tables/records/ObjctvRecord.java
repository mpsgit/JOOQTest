/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.Objctv;


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
public class ObjctvRecord extends UpdatableRecordImpl<ObjctvRecord> implements Record14<BigDecimal, BigDecimal, String, String, BigDecimal, String, String, Date, String, Date, BigDecimal, BigDecimal, String, BigDecimal> {

	private static final long serialVersionUID = 1092428853;

	/**
	 * Setter for <code>WETRN.OBJCTV.OBJCTV_ID</code>.
	 */
	public void setObjctvId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.OBJCTV.OBJCTV_ID</code>.
	 */
	public BigDecimal getObjctvId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.OBJCTV.CLSTR_ID</code>.
	 */
	public void setClstrId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.OBJCTV.CLSTR_ID</code>.
	 */
	public BigDecimal getClstrId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.OBJCTV.OBJCTV_DESC_TXT</code>.
	 */
	public void setObjctvDescTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.OBJCTV.OBJCTV_DESC_TXT</code>.
	 */
	public String getObjctvDescTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.OBJCTV.TOP_LVL_IND</code>.
	 */
	public void setTopLvlInd(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.OBJCTV.TOP_LVL_IND</code>.
	 */
	public String getTopLvlInd() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.OBJCTV.PARNT_OBJCTV_ID</code>.
	 */
	public void setParntObjctvId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.OBJCTV.PARNT_OBJCTV_ID</code>.
	 */
	public BigDecimal getParntObjctvId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.OBJCTV.CMPGN_IND</code>.
	 */
	public void setCmpgnInd(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.OBJCTV.CMPGN_IND</code>.
	 */
	public String getCmpgnInd() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.OBJCTV.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.OBJCTV.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.OBJCTV.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.OBJCTV.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.OBJCTV.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.OBJCTV.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.OBJCTV.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.OBJCTV.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.OBJCTV.CATGRY_ID</code>.
	 */
	public void setCatgryId(BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.OBJCTV.CATGRY_ID</code>.
	 */
	public BigDecimal getCatgryId() {
		return (BigDecimal) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.OBJCTV.VEH_ID</code>.
	 */
	public void setVehId(BigDecimal value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.OBJCTV.VEH_ID</code>.
	 */
	public BigDecimal getVehId() {
		return (BigDecimal) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.OBJCTV.ENBLD_IND</code>.
	 */
	public void setEnbldInd(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.OBJCTV.ENBLD_IND</code>.
	 */
	public String getEnbldInd() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.OBJCTV.LCL_BUS_ID</code>.
	 */
	public void setLclBusId(BigDecimal value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.OBJCTV.LCL_BUS_ID</code>.
	 */
	public BigDecimal getLclBusId() {
		return (BigDecimal) getValue(13);
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
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<BigDecimal, BigDecimal, String, String, BigDecimal, String, String, Date, String, Date, BigDecimal, BigDecimal, String, BigDecimal> fieldsRow() {
		return (Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<BigDecimal, BigDecimal, String, String, BigDecimal, String, String, Date, String, Date, BigDecimal, BigDecimal, String, BigDecimal> valuesRow() {
		return (Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return Objctv.OBJCTV.OBJCTV_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return Objctv.OBJCTV.CLSTR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Objctv.OBJCTV.OBJCTV_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Objctv.OBJCTV.TOP_LVL_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return Objctv.OBJCTV.PARNT_OBJCTV_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Objctv.OBJCTV.CMPGN_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Objctv.OBJCTV.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return Objctv.OBJCTV.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return Objctv.OBJCTV.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return Objctv.OBJCTV.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field11() {
		return Objctv.OBJCTV.CATGRY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field12() {
		return Objctv.OBJCTV.VEH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return Objctv.OBJCTV.ENBLD_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field14() {
		return Objctv.OBJCTV.LCL_BUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getObjctvId();
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
	public String value3() {
		return getObjctvDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getTopLvlInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getParntObjctvId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getCmpgnInd();
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
		return getCatgryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value12() {
		return getVehId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getEnbldInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value14() {
		return getLclBusId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord value1(BigDecimal value) {
		setObjctvId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord value2(BigDecimal value) {
		setClstrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord value3(String value) {
		setObjctvDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord value4(String value) {
		setTopLvlInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord value5(BigDecimal value) {
		setParntObjctvId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord value6(String value) {
		setCmpgnInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord value7(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord value8(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord value9(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord value10(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord value11(BigDecimal value) {
		setCatgryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord value12(BigDecimal value) {
		setVehId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord value13(String value) {
		setEnbldInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord value14(BigDecimal value) {
		setLclBusId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjctvRecord values(BigDecimal value1, BigDecimal value2, String value3, String value4, BigDecimal value5, String value6, String value7, Date value8, String value9, Date value10, BigDecimal value11, BigDecimal value12, String value13, BigDecimal value14) {
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
		value12(value12);
		value13(value13);
		value14(value14);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ObjctvRecord
	 */
	public ObjctvRecord() {
		super(Objctv.OBJCTV);
	}

	/**
	 * Create a detached, initialised ObjctvRecord
	 */
	public ObjctvRecord(BigDecimal objctvId, BigDecimal clstrId, String objctvDescTxt, String topLvlInd, BigDecimal parntObjctvId, String cmpgnInd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, BigDecimal catgryId, BigDecimal vehId, String enbldInd, BigDecimal lclBusId) {
		super(Objctv.OBJCTV);

		setValue(0, objctvId);
		setValue(1, clstrId);
		setValue(2, objctvDescTxt);
		setValue(3, topLvlInd);
		setValue(4, parntObjctvId);
		setValue(5, cmpgnInd);
		setValue(6, creatUserId);
		setValue(7, creatTs);
		setValue(8, lastUpdtUserId);
		setValue(9, lastUpdtTs);
		setValue(10, catgryId);
		setValue(11, vehId);
		setValue(12, enbldInd);
		setValue(13, lclBusId);
	}
}
