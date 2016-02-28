/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.ClstrSlsTyp;


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
public class ClstrSlsTypRecord extends UpdatableRecordImpl<ClstrSlsTypRecord> implements Record7<BigDecimal, BigDecimal, String, String, Date, String, Date> {

	private static final long serialVersionUID = 1455965973;

	/**
	 * Setter for <code>WETRN.CLSTR_SLS_TYP.SLS_TYP_ID</code>.
	 */
	public void setSlsTypId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.CLSTR_SLS_TYP.SLS_TYP_ID</code>.
	 */
	public BigDecimal getSlsTypId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.CLSTR_SLS_TYP.CLSTR_ID</code>.
	 */
	public void setClstrId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.CLSTR_SLS_TYP.CLSTR_ID</code>.
	 */
	public BigDecimal getClstrId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.CLSTR_SLS_TYP.USED_IND</code>.
	 */
	public void setUsedInd(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.CLSTR_SLS_TYP.USED_IND</code>.
	 */
	public String getUsedInd() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.CLSTR_SLS_TYP.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.CLSTR_SLS_TYP.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.CLSTR_SLS_TYP.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.CLSTR_SLS_TYP.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.CLSTR_SLS_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.CLSTR_SLS_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.CLSTR_SLS_TYP.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.CLSTR_SLS_TYP.LAST_UPDT_TS</code>.
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
	public Record2<BigDecimal, BigDecimal> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<BigDecimal, BigDecimal, String, String, Date, String, Date> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<BigDecimal, BigDecimal, String, String, Date, String, Date> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return ClstrSlsTyp.CLSTR_SLS_TYP.SLS_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return ClstrSlsTyp.CLSTR_SLS_TYP.CLSTR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return ClstrSlsTyp.CLSTR_SLS_TYP.USED_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return ClstrSlsTyp.CLSTR_SLS_TYP.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return ClstrSlsTyp.CLSTR_SLS_TYP.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return ClstrSlsTyp.CLSTR_SLS_TYP.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return ClstrSlsTyp.CLSTR_SLS_TYP.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getSlsTypId();
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
		return getUsedInd();
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
	public ClstrSlsTypRecord value1(BigDecimal value) {
		setSlsTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClstrSlsTypRecord value2(BigDecimal value) {
		setClstrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClstrSlsTypRecord value3(String value) {
		setUsedInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClstrSlsTypRecord value4(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClstrSlsTypRecord value5(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClstrSlsTypRecord value6(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClstrSlsTypRecord value7(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClstrSlsTypRecord values(BigDecimal value1, BigDecimal value2, String value3, String value4, Date value5, String value6, Date value7) {
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
	 * Create a detached ClstrSlsTypRecord
	 */
	public ClstrSlsTypRecord() {
		super(ClstrSlsTyp.CLSTR_SLS_TYP);
	}

	/**
	 * Create a detached, initialised ClstrSlsTypRecord
	 */
	public ClstrSlsTypRecord(BigDecimal slsTypId, BigDecimal clstrId, String usedInd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(ClstrSlsTyp.CLSTR_SLS_TYP);

		setValue(0, slsTypId);
		setValue(1, clstrId);
		setValue(2, usedInd);
		setValue(3, creatUserId);
		setValue(4, creatTs);
		setValue(5, lastUpdtUserId);
		setValue(6, lastUpdtTs);
	}
}
