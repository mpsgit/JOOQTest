/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.RepGlblTmplt;


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
public class RepGlblTmpltRecord extends UpdatableRecordImpl<RepGlblTmpltRecord> implements Record5<BigDecimal, String, Date, String, Date> {

	private static final long serialVersionUID = -1127237852;

	/**
	 * Setter for <code>WETRN.REP_GLBL_TMPLT.TMPLT_ID</code>.
	 */
	public void setTmpltId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.REP_GLBL_TMPLT.TMPLT_ID</code>.
	 */
	public BigDecimal getTmpltId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.REP_GLBL_TMPLT.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.REP_GLBL_TMPLT.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.REP_GLBL_TMPLT.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.REP_GLBL_TMPLT.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.REP_GLBL_TMPLT.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.REP_GLBL_TMPLT.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.REP_GLBL_TMPLT.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.REP_GLBL_TMPLT.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<BigDecimal, String, Date, String, Date> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<BigDecimal, String, Date, String, Date> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return RepGlblTmplt.REP_GLBL_TMPLT.TMPLT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return RepGlblTmplt.REP_GLBL_TMPLT.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field3() {
		return RepGlblTmplt.REP_GLBL_TMPLT.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return RepGlblTmplt.REP_GLBL_TMPLT.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return RepGlblTmplt.REP_GLBL_TMPLT.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getTmpltId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value3() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value5() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepGlblTmpltRecord value1(BigDecimal value) {
		setTmpltId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepGlblTmpltRecord value2(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepGlblTmpltRecord value3(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepGlblTmpltRecord value4(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepGlblTmpltRecord value5(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepGlblTmpltRecord values(BigDecimal value1, String value2, Date value3, String value4, Date value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RepGlblTmpltRecord
	 */
	public RepGlblTmpltRecord() {
		super(RepGlblTmplt.REP_GLBL_TMPLT);
	}

	/**
	 * Create a detached, initialised RepGlblTmpltRecord
	 */
	public RepGlblTmpltRecord(BigDecimal tmpltId, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(RepGlblTmplt.REP_GLBL_TMPLT);

		setValue(0, tmpltId);
		setValue(1, creatUserId);
		setValue(2, creatTs);
		setValue(3, lastUpdtUserId);
		setValue(4, lastUpdtTs);
	}
}
