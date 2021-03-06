/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.PlugType;


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
public class PlugTypeRecord extends UpdatableRecordImpl<PlugTypeRecord> implements Record7<BigDecimal, String, String, String, Date, String, Date> {

	private static final long serialVersionUID = -456951355;

	/**
	 * Setter for <code>WETRN.PLUG_TYPE.PLUG_TYPE_ID</code>.
	 */
	public void setPlugTypeId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_TYPE.PLUG_TYPE_ID</code>.
	 */
	public BigDecimal getPlugTypeId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.PLUG_TYPE.PLUG_TYPE_DESC_TXT</code>.
	 */
	public void setPlugTypeDescTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_TYPE.PLUG_TYPE_DESC_TXT</code>.
	 */
	public String getPlugTypeDescTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.PLUG_TYPE.DLTD_IND</code>.
	 */
	public void setDltdInd(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_TYPE.DLTD_IND</code>.
	 */
	public String getDltdInd() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.PLUG_TYPE.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_TYPE.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.PLUG_TYPE.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_TYPE.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.PLUG_TYPE.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_TYPE.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.PLUG_TYPE.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.PLUG_TYPE.LAST_UPDT_TS</code>.
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
	public Record1<BigDecimal> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<BigDecimal, String, String, String, Date, String, Date> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<BigDecimal, String, String, String, Date, String, Date> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return PlugType.PLUG_TYPE.PLUG_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return PlugType.PLUG_TYPE.PLUG_TYPE_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return PlugType.PLUG_TYPE.DLTD_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return PlugType.PLUG_TYPE.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return PlugType.PLUG_TYPE.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return PlugType.PLUG_TYPE.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return PlugType.PLUG_TYPE.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getPlugTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getPlugTypeDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getDltdInd();
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
	public PlugTypeRecord value1(BigDecimal value) {
		setPlugTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugTypeRecord value2(String value) {
		setPlugTypeDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugTypeRecord value3(String value) {
		setDltdInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugTypeRecord value4(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugTypeRecord value5(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugTypeRecord value6(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugTypeRecord value7(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlugTypeRecord values(BigDecimal value1, String value2, String value3, String value4, Date value5, String value6, Date value7) {
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
	 * Create a detached PlugTypeRecord
	 */
	public PlugTypeRecord() {
		super(PlugType.PLUG_TYPE);
	}

	/**
	 * Create a detached, initialised PlugTypeRecord
	 */
	public PlugTypeRecord(BigDecimal plugTypeId, String plugTypeDescTxt, String dltdInd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(PlugType.PLUG_TYPE);

		setValue(0, plugTypeId);
		setValue(1, plugTypeDescTxt);
		setValue(2, dltdInd);
		setValue(3, creatUserId);
		setValue(4, creatTs);
		setValue(5, lastUpdtUserId);
		setValue(6, lastUpdtTs);
	}
}
