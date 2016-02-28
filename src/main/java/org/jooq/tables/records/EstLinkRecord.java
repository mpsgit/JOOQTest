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
import org.jooq.tables.EstLink;


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
public class EstLinkRecord extends UpdatableRecordImpl<EstLinkRecord> implements Record7<BigDecimal, String, String, String, Date, String, Date> {

	private static final long serialVersionUID = -210510601;

	/**
	 * Setter for <code>WETRN.EST_LINK.EST_LINK_ID</code>.
	 */
	public void setEstLinkId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.EST_LINK.EST_LINK_ID</code>.
	 */
	public BigDecimal getEstLinkId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.EST_LINK.EST_CALCLTN_MTHD_NM</code>.
	 */
	public void setEstCalcltnMthdNm(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.EST_LINK.EST_CALCLTN_MTHD_NM</code>.
	 */
	public String getEstCalcltnMthdNm() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.EST_LINK.EST_LINK_RSN_DESC_TXT</code>.
	 */
	public void setEstLinkRsnDescTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.EST_LINK.EST_LINK_RSN_DESC_TXT</code>.
	 */
	public String getEstLinkRsnDescTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.EST_LINK.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.EST_LINK.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.EST_LINK.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.EST_LINK.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.EST_LINK.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.EST_LINK.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.EST_LINK.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.EST_LINK.LAST_UPDT_TS</code>.
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
		return EstLink.EST_LINK.EST_LINK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return EstLink.EST_LINK.EST_CALCLTN_MTHD_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return EstLink.EST_LINK.EST_LINK_RSN_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return EstLink.EST_LINK.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return EstLink.EST_LINK.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return EstLink.EST_LINK.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return EstLink.EST_LINK.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getEstLinkId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getEstCalcltnMthdNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getEstLinkRsnDescTxt();
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
	public EstLinkRecord value1(BigDecimal value) {
		setEstLinkId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EstLinkRecord value2(String value) {
		setEstCalcltnMthdNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EstLinkRecord value3(String value) {
		setEstLinkRsnDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EstLinkRecord value4(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EstLinkRecord value5(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EstLinkRecord value6(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EstLinkRecord value7(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EstLinkRecord values(BigDecimal value1, String value2, String value3, String value4, Date value5, String value6, Date value7) {
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
	 * Create a detached EstLinkRecord
	 */
	public EstLinkRecord() {
		super(EstLink.EST_LINK);
	}

	/**
	 * Create a detached, initialised EstLinkRecord
	 */
	public EstLinkRecord(BigDecimal estLinkId, String estCalcltnMthdNm, String estLinkRsnDescTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(EstLink.EST_LINK);

		setValue(0, estLinkId);
		setValue(1, estCalcltnMthdNm);
		setValue(2, estLinkRsnDescTxt);
		setValue(3, creatUserId);
		setValue(4, creatTs);
		setValue(5, lastUpdtUserId);
		setValue(6, lastUpdtTs);
	}
}
