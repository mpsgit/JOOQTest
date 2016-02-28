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
import org.jooq.tables.Chnl;


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
public class ChnlRecord extends UpdatableRecordImpl<ChnlRecord> implements Record7<BigDecimal, String, String, Date, String, Date, String> {

	private static final long serialVersionUID = 780999244;

	/**
	 * Setter for <code>WETRN.CHNL.CHNL_ID</code>.
	 */
	public void setChnlId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.CHNL.CHNL_ID</code>.
	 */
	public BigDecimal getChnlId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.CHNL.CHNL_NM</code>.
	 */
	public void setChnlNm(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.CHNL.CHNL_NM</code>.
	 */
	public String getChnlNm() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.CHNL.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.CHNL.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.CHNL.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.CHNL.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.CHNL.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.CHNL.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.CHNL.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.CHNL.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.CHNL.DLTD_IND</code>.
	 */
	public void setDltdInd(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.CHNL.DLTD_IND</code>.
	 */
	public String getDltdInd() {
		return (String) getValue(6);
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
	public Row7<BigDecimal, String, String, Date, String, Date, String> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<BigDecimal, String, String, Date, String, Date, String> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return Chnl.CHNL.CHNL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Chnl.CHNL.CHNL_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Chnl.CHNL.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return Chnl.CHNL.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Chnl.CHNL.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return Chnl.CHNL.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Chnl.CHNL.DLTD_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getChnlId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getChnlNm();
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
		return getDltdInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChnlRecord value1(BigDecimal value) {
		setChnlId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChnlRecord value2(String value) {
		setChnlNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChnlRecord value3(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChnlRecord value4(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChnlRecord value5(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChnlRecord value6(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChnlRecord value7(String value) {
		setDltdInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChnlRecord values(BigDecimal value1, String value2, String value3, Date value4, String value5, Date value6, String value7) {
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
	 * Create a detached ChnlRecord
	 */
	public ChnlRecord() {
		super(Chnl.CHNL);
	}

	/**
	 * Create a detached, initialised ChnlRecord
	 */
	public ChnlRecord(BigDecimal chnlId, String chnlNm, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String dltdInd) {
		super(Chnl.CHNL);

		setValue(0, chnlId);
		setValue(1, chnlNm);
		setValue(2, creatUserId);
		setValue(3, creatTs);
		setValue(4, lastUpdtUserId);
		setValue(5, lastUpdtTs);
		setValue(6, dltdInd);
	}
}
