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
import org.jooq.tables.Catgry;


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
public class CatgryRecord extends UpdatableRecordImpl<CatgryRecord> implements Record8<BigDecimal, String, BigDecimal, String, Date, String, Date, String> {

	private static final long serialVersionUID = -823279912;

	/**
	 * Setter for <code>WETRN.CATGRY.CATGRY_ID</code>.
	 */
	public void setCatgryId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.CATGRY.CATGRY_ID</code>.
	 */
	public BigDecimal getCatgryId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.CATGRY.CATGRY_NM</code>.
	 */
	public void setCatgryNm(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.CATGRY.CATGRY_NM</code>.
	 */
	public String getCatgryNm() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.CATGRY.BUS_ID</code>.
	 */
	public void setBusId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.CATGRY.BUS_ID</code>.
	 */
	public BigDecimal getBusId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.CATGRY.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.CATGRY.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.CATGRY.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.CATGRY.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.CATGRY.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.CATGRY.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.CATGRY.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.CATGRY.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.CATGRY.DLTD_IND</code>.
	 */
	public void setDltdInd(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.CATGRY.DLTD_IND</code>.
	 */
	public String getDltdInd() {
		return (String) getValue(7);
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
	public Row8<BigDecimal, String, BigDecimal, String, Date, String, Date, String> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, String, BigDecimal, String, Date, String, Date, String> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return Catgry.CATGRY.CATGRY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Catgry.CATGRY.CATGRY_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return Catgry.CATGRY.BUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Catgry.CATGRY.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return Catgry.CATGRY.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Catgry.CATGRY.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return Catgry.CATGRY.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return Catgry.CATGRY.DLTD_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getCatgryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getCatgryNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getBusId();
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
	public String value8() {
		return getDltdInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgryRecord value1(BigDecimal value) {
		setCatgryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgryRecord value2(String value) {
		setCatgryNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgryRecord value3(BigDecimal value) {
		setBusId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgryRecord value4(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgryRecord value5(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgryRecord value6(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgryRecord value7(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgryRecord value8(String value) {
		setDltdInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgryRecord values(BigDecimal value1, String value2, BigDecimal value3, String value4, Date value5, String value6, Date value7, String value8) {
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
	 * Create a detached CatgryRecord
	 */
	public CatgryRecord() {
		super(Catgry.CATGRY);
	}

	/**
	 * Create a detached, initialised CatgryRecord
	 */
	public CatgryRecord(BigDecimal catgryId, String catgryNm, BigDecimal busId, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String dltdInd) {
		super(Catgry.CATGRY);

		setValue(0, catgryId);
		setValue(1, catgryNm);
		setValue(2, busId);
		setValue(3, creatUserId);
		setValue(4, creatTs);
		setValue(5, lastUpdtUserId);
		setValue(6, lastUpdtTs);
		setValue(7, dltdInd);
	}
}
