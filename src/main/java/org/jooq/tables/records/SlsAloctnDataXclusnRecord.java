/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Record5;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.SlsAloctnDataXclusn;


/**
 * Sales allocation data exclusion.  Data exclusion rules for specific sales 
 * channel, billing offer type and data exclusion type.  Some screens and 
 * reports need to exclude data that would otherwise be shown if the default 
 * rules were used.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlsAloctnDataXclusnRecord extends UpdatableRecordImpl<SlsAloctnDataXclusnRecord> implements Record10<BigDecimal, String, BigDecimal, String, BigDecimal, BigDecimal, String, Date, String, Date> {

	private static final long serialVersionUID = -1370637219;

	/**
	 * Setter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.SLS_CHNL_CD</code>.
	 */
	public void setSlsChnlCd(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.SLS_CHNL_CD</code>.
	 */
	public String getSlsChnlCd() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.STRT_SLS_PERD_ID</code>.
	 */
	public void setStrtSlsPerdId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.STRT_SLS_PERD_ID</code>.
	 */
	public BigDecimal getStrtSlsPerdId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.LCL_BILNG_OFFR_TYP</code>.
	 */
	public void setLclBilngOffrTyp(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.LCL_BILNG_OFFR_TYP</code>.
	 */
	public String getLclBilngOffrTyp() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.DATA_XCLUSN_TYP_ID</code>.
	 */
	public void setDataXclusnTypId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.DATA_XCLUSN_TYP_ID</code>.
	 */
	public BigDecimal getDataXclusnTypId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.END_SLS_PERD_ID</code>.
	 */
	public void setEndSlsPerdId(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.END_SLS_PERD_ID</code>.
	 */
	public BigDecimal getEndSlsPerdId() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public void setCreatUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public String getCreatUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.CREAT_TS</code>. The date and time the row was created.
	 */
	public void setCreatTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.CREAT_TS</code>. The date and time the row was created.
	 */
	public Date getCreatTs() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record5<BigDecimal, String, BigDecimal, String, BigDecimal> key() {
		return (Record5) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<BigDecimal, String, BigDecimal, String, BigDecimal, BigDecimal, String, Date, String, Date> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<BigDecimal, String, BigDecimal, String, BigDecimal, BigDecimal, String, Date, String, Date> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return SlsAloctnDataXclusn.SLS_ALOCTN_DATA_XCLUSN.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return SlsAloctnDataXclusn.SLS_ALOCTN_DATA_XCLUSN.SLS_CHNL_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return SlsAloctnDataXclusn.SLS_ALOCTN_DATA_XCLUSN.STRT_SLS_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return SlsAloctnDataXclusn.SLS_ALOCTN_DATA_XCLUSN.LCL_BILNG_OFFR_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return SlsAloctnDataXclusn.SLS_ALOCTN_DATA_XCLUSN.DATA_XCLUSN_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return SlsAloctnDataXclusn.SLS_ALOCTN_DATA_XCLUSN.END_SLS_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return SlsAloctnDataXclusn.SLS_ALOCTN_DATA_XCLUSN.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return SlsAloctnDataXclusn.SLS_ALOCTN_DATA_XCLUSN.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return SlsAloctnDataXclusn.SLS_ALOCTN_DATA_XCLUSN.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return SlsAloctnDataXclusn.SLS_ALOCTN_DATA_XCLUSN.LAST_UPDT_TS;
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
	public String value2() {
		return getSlsChnlCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getStrtSlsPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getLclBilngOffrTyp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getDataXclusnTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getEndSlsPerdId();
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
	public SlsAloctnDataXclusnRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsAloctnDataXclusnRecord value2(String value) {
		setSlsChnlCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsAloctnDataXclusnRecord value3(BigDecimal value) {
		setStrtSlsPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsAloctnDataXclusnRecord value4(String value) {
		setLclBilngOffrTyp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsAloctnDataXclusnRecord value5(BigDecimal value) {
		setDataXclusnTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsAloctnDataXclusnRecord value6(BigDecimal value) {
		setEndSlsPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsAloctnDataXclusnRecord value7(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsAloctnDataXclusnRecord value8(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsAloctnDataXclusnRecord value9(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsAloctnDataXclusnRecord value10(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsAloctnDataXclusnRecord values(BigDecimal value1, String value2, BigDecimal value3, String value4, BigDecimal value5, BigDecimal value6, String value7, Date value8, String value9, Date value10) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SlsAloctnDataXclusnRecord
	 */
	public SlsAloctnDataXclusnRecord() {
		super(SlsAloctnDataXclusn.SLS_ALOCTN_DATA_XCLUSN);
	}

	/**
	 * Create a detached, initialised SlsAloctnDataXclusnRecord
	 */
	public SlsAloctnDataXclusnRecord(BigDecimal mrktId, String slsChnlCd, BigDecimal strtSlsPerdId, String lclBilngOffrTyp, BigDecimal dataXclusnTypId, BigDecimal endSlsPerdId, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(SlsAloctnDataXclusn.SLS_ALOCTN_DATA_XCLUSN);

		setValue(0, mrktId);
		setValue(1, slsChnlCd);
		setValue(2, strtSlsPerdId);
		setValue(3, lclBilngOffrTyp);
		setValue(4, dataXclusnTypId);
		setValue(5, endSlsPerdId);
		setValue(6, creatUserId);
		setValue(7, creatTs);
		setValue(8, lastUpdtUserId);
		setValue(9, lastUpdtTs);
	}
}
