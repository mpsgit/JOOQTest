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
import org.jooq.tables.MrktTaxTypGrp;


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
public class MrktTaxTypGrpRecord extends UpdatableRecordImpl<MrktTaxTypGrpRecord> implements Record7<BigDecimal, BigDecimal, String, String, Date, String, Date> {

	private static final long serialVersionUID = 2013534456;

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_GRP.MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_GRP.MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_GRP.MRKT_TAX_TYP_GRP_ID</code>.
	 */
	public void setMrktTaxTypGrpId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_GRP.MRKT_TAX_TYP_GRP_ID</code>.
	 */
	public BigDecimal getMrktTaxTypGrpId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_GRP.MRKT_TAX_TYP_GRP_DESC_TXT</code>.
	 */
	public void setMrktTaxTypGrpDescTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_GRP.MRKT_TAX_TYP_GRP_DESC_TXT</code>.
	 */
	public String getMrktTaxTypGrpDescTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_GRP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public void setCreatUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_GRP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public String getCreatUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_GRP.CREAT_TS</code>. The date and time the row was created.
	 */
	public void setCreatTs(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_GRP.CREAT_TS</code>. The date and time the row was created.
	 */
	public Date getCreatTs() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_GRP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_GRP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_GRP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_GRP.LAST_UPDT_TS</code>. The date and time the row was last updated.
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
		return MrktTaxTypGrp.MRKT_TAX_TYP_GRP.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MrktTaxTypGrp.MRKT_TAX_TYP_GRP.MRKT_TAX_TYP_GRP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return MrktTaxTypGrp.MRKT_TAX_TYP_GRP.MRKT_TAX_TYP_GRP_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return MrktTaxTypGrp.MRKT_TAX_TYP_GRP.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return MrktTaxTypGrp.MRKT_TAX_TYP_GRP.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return MrktTaxTypGrp.MRKT_TAX_TYP_GRP.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return MrktTaxTypGrp.MRKT_TAX_TYP_GRP.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getMrktTaxTypGrpId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getMrktTaxTypGrpDescTxt();
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
	public MrktTaxTypGrpRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypGrpRecord value2(BigDecimal value) {
		setMrktTaxTypGrpId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypGrpRecord value3(String value) {
		setMrktTaxTypGrpDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypGrpRecord value4(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypGrpRecord value5(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypGrpRecord value6(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypGrpRecord value7(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypGrpRecord values(BigDecimal value1, BigDecimal value2, String value3, String value4, Date value5, String value6, Date value7) {
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
	 * Create a detached MrktTaxTypGrpRecord
	 */
	public MrktTaxTypGrpRecord() {
		super(MrktTaxTypGrp.MRKT_TAX_TYP_GRP);
	}

	/**
	 * Create a detached, initialised MrktTaxTypGrpRecord
	 */
	public MrktTaxTypGrpRecord(BigDecimal mrktId, BigDecimal mrktTaxTypGrpId, String mrktTaxTypGrpDescTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(MrktTaxTypGrp.MRKT_TAX_TYP_GRP);

		setValue(0, mrktId);
		setValue(1, mrktTaxTypGrpId);
		setValue(2, mrktTaxTypGrpDescTxt);
		setValue(3, creatUserId);
		setValue(4, creatTs);
		setValue(5, lastUpdtUserId);
		setValue(6, lastUpdtTs);
	}
}
