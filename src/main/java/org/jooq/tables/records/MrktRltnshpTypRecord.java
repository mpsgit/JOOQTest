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
import org.jooq.tables.MrktRltnshpTyp;


/**
 * Market relationship type.  The type of relationship that is being modelled 
 * by the MRKT_RLTNSHP table.  The MRKT_ prefix indicates that the relationships 
 * are for MRKT_RLTNSHP (as opposed to any other kind of relationship).  The 
 * relationships are not at MRKT level (they apply to all markets).
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MrktRltnshpTypRecord extends UpdatableRecordImpl<MrktRltnshpTypRecord> implements Record7<BigDecimal, String, String, String, Date, String, Date> {

	private static final long serialVersionUID = -1100404808;

	/**
	 * Setter for <code>WETRN.MRKT_RLTNSHP_TYP.MRKT_RLTNSHP_TYP_ID</code>. Market relationship type id.  Unique identifier for a market relationship type.  The ID must not be changed as it is used in the application and database code.
	 */
	public void setMrktRltnshpTypId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_RLTNSHP_TYP.MRKT_RLTNSHP_TYP_ID</code>. Market relationship type id.  Unique identifier for a market relationship type.  The ID must not be changed as it is used in the application and database code.
	 */
	public BigDecimal getMrktRltnshpTypId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_RLTNSHP_TYP.MRKT_RLTNSHP_TYP_SDESC_TXT</code>.
	 */
	public void setMrktRltnshpTypSdescTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_RLTNSHP_TYP.MRKT_RLTNSHP_TYP_SDESC_TXT</code>.
	 */
	public String getMrktRltnshpTypSdescTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_RLTNSHP_TYP.MRKT_RLTNSHP_TYP_DESC_TXT</code>.
	 */
	public void setMrktRltnshpTypDescTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_RLTNSHP_TYP.MRKT_RLTNSHP_TYP_DESC_TXT</code>.
	 */
	public String getMrktRltnshpTypDescTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_RLTNSHP_TYP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public void setCreatUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_RLTNSHP_TYP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public String getCreatUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_RLTNSHP_TYP.CREAT_TS</code>. The date and time the row was created.
	 */
	public void setCreatTs(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_RLTNSHP_TYP.CREAT_TS</code>. The date and time the row was created.
	 */
	public Date getCreatTs() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_RLTNSHP_TYP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_RLTNSHP_TYP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_RLTNSHP_TYP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_RLTNSHP_TYP.LAST_UPDT_TS</code>. The date and time the row was last updated.
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
		return MrktRltnshpTyp.MRKT_RLTNSHP_TYP.MRKT_RLTNSHP_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return MrktRltnshpTyp.MRKT_RLTNSHP_TYP.MRKT_RLTNSHP_TYP_SDESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return MrktRltnshpTyp.MRKT_RLTNSHP_TYP.MRKT_RLTNSHP_TYP_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return MrktRltnshpTyp.MRKT_RLTNSHP_TYP.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return MrktRltnshpTyp.MRKT_RLTNSHP_TYP.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return MrktRltnshpTyp.MRKT_RLTNSHP_TYP.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return MrktRltnshpTyp.MRKT_RLTNSHP_TYP.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getMrktRltnshpTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getMrktRltnshpTypSdescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getMrktRltnshpTypDescTxt();
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
	public MrktRltnshpTypRecord value1(BigDecimal value) {
		setMrktRltnshpTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktRltnshpTypRecord value2(String value) {
		setMrktRltnshpTypSdescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktRltnshpTypRecord value3(String value) {
		setMrktRltnshpTypDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktRltnshpTypRecord value4(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktRltnshpTypRecord value5(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktRltnshpTypRecord value6(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktRltnshpTypRecord value7(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktRltnshpTypRecord values(BigDecimal value1, String value2, String value3, String value4, Date value5, String value6, Date value7) {
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
	 * Create a detached MrktRltnshpTypRecord
	 */
	public MrktRltnshpTypRecord() {
		super(MrktRltnshpTyp.MRKT_RLTNSHP_TYP);
	}

	/**
	 * Create a detached, initialised MrktRltnshpTypRecord
	 */
	public MrktRltnshpTypRecord(BigDecimal mrktRltnshpTypId, String mrktRltnshpTypSdescTxt, String mrktRltnshpTypDescTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(MrktRltnshpTyp.MRKT_RLTNSHP_TYP);

		setValue(0, mrktRltnshpTypId);
		setValue(1, mrktRltnshpTypSdescTxt);
		setValue(2, mrktRltnshpTypDescTxt);
		setValue(3, creatUserId);
		setValue(4, creatTs);
		setValue(5, lastUpdtUserId);
		setValue(6, lastUpdtTs);
	}
}