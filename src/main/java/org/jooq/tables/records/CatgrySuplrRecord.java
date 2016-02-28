/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.CatgrySuplr;


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
public class CatgrySuplrRecord extends UpdatableRecordImpl<CatgrySuplrRecord> implements Record6<BigDecimal, BigDecimal, String, Date, String, Date> {

	private static final long serialVersionUID = 481014829;

	/**
	 * Setter for <code>WETRN.CATGRY_SUPLR.CATGRY_ID</code>.
	 */
	public void setCatgryId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.CATGRY_SUPLR.CATGRY_ID</code>.
	 */
	public BigDecimal getCatgryId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.CATGRY_SUPLR.SUPLR_ID</code>.
	 */
	public void setSuplrId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.CATGRY_SUPLR.SUPLR_ID</code>.
	 */
	public BigDecimal getSuplrId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.CATGRY_SUPLR.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.CATGRY_SUPLR.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.CATGRY_SUPLR.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.CATGRY_SUPLR.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.CATGRY_SUPLR.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.CATGRY_SUPLR.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.CATGRY_SUPLR.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.CATGRY_SUPLR.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<BigDecimal, BigDecimal> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<BigDecimal, BigDecimal, String, Date, String, Date> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<BigDecimal, BigDecimal, String, Date, String, Date> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return CatgrySuplr.CATGRY_SUPLR.CATGRY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return CatgrySuplr.CATGRY_SUPLR.SUPLR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return CatgrySuplr.CATGRY_SUPLR.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return CatgrySuplr.CATGRY_SUPLR.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return CatgrySuplr.CATGRY_SUPLR.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return CatgrySuplr.CATGRY_SUPLR.LAST_UPDT_TS;
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
	public BigDecimal value2() {
		return getSuplrId();
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
	public CatgrySuplrRecord value1(BigDecimal value) {
		setCatgryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgrySuplrRecord value2(BigDecimal value) {
		setSuplrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgrySuplrRecord value3(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgrySuplrRecord value4(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgrySuplrRecord value5(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgrySuplrRecord value6(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgrySuplrRecord values(BigDecimal value1, BigDecimal value2, String value3, Date value4, String value5, Date value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CatgrySuplrRecord
	 */
	public CatgrySuplrRecord() {
		super(CatgrySuplr.CATGRY_SUPLR);
	}

	/**
	 * Create a detached, initialised CatgrySuplrRecord
	 */
	public CatgrySuplrRecord(BigDecimal catgryId, BigDecimal suplrId, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(CatgrySuplr.CATGRY_SUPLR);

		setValue(0, catgryId);
		setValue(1, suplrId);
		setValue(2, creatUserId);
		setValue(3, creatTs);
		setValue(4, lastUpdtUserId);
		setValue(5, lastUpdtTs);
	}
}
