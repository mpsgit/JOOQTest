/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Record4;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.TrndAloctnAutoPrcsOvrrd;


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
public class TrndAloctnAutoPrcsOvrrdRecord extends UpdatableRecordImpl<TrndAloctnAutoPrcsOvrrdRecord> implements Record11<BigDecimal, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> {

	private static final long serialVersionUID = 2077115649;

	/**
	 * Setter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.SLS_CHNL_CD</code>.
	 */
	public void setSlsChnlCd(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.SLS_CHNL_CD</code>.
	 */
	public String getSlsChnlCd() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.STRT_TRND_SLS_PERD_ID</code>.
	 */
	public void setStrtTrndSlsPerdId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.STRT_TRND_SLS_PERD_ID</code>.
	 */
	public BigDecimal getStrtTrndSlsPerdId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.LCL_BILNG_OFFR_TYP</code>.
	 */
	public void setLclBilngOffrTyp(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.LCL_BILNG_OFFR_TYP</code>.
	 */
	public String getLclBilngOffrTyp() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.END_TRND_SLS_PERD_ID</code>.
	 */
	public void setEndTrndSlsPerdId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.END_TRND_SLS_PERD_ID</code>.
	 */
	public BigDecimal getEndTrndSlsPerdId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.TRND_ALOCTN_AUTO_STUS_ID</code>.
	 */
	public void setTrndAloctnAutoStusId(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.TRND_ALOCTN_AUTO_STUS_ID</code>.
	 */
	public BigDecimal getTrndAloctnAutoStusId() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.TRND_ALOCTN_MANUL_STUS_ID</code>.
	 */
	public void setTrndAloctnManulStusId(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.TRND_ALOCTN_MANUL_STUS_ID</code>.
	 */
	public BigDecimal getTrndAloctnManulStusId() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_ALOCTN_AUTO_PRCS_OVRRD.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record4<BigDecimal, String, BigDecimal, String> key() {
		return (Record4) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<BigDecimal, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<BigDecimal, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return TrndAloctnAutoPrcsOvrrd.TRND_ALOCTN_AUTO_PRCS_OVRRD.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TrndAloctnAutoPrcsOvrrd.TRND_ALOCTN_AUTO_PRCS_OVRRD.SLS_CHNL_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return TrndAloctnAutoPrcsOvrrd.TRND_ALOCTN_AUTO_PRCS_OVRRD.STRT_TRND_SLS_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TrndAloctnAutoPrcsOvrrd.TRND_ALOCTN_AUTO_PRCS_OVRRD.LCL_BILNG_OFFR_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return TrndAloctnAutoPrcsOvrrd.TRND_ALOCTN_AUTO_PRCS_OVRRD.END_TRND_SLS_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return TrndAloctnAutoPrcsOvrrd.TRND_ALOCTN_AUTO_PRCS_OVRRD.TRND_ALOCTN_AUTO_STUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field7() {
		return TrndAloctnAutoPrcsOvrrd.TRND_ALOCTN_AUTO_PRCS_OVRRD.TRND_ALOCTN_MANUL_STUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return TrndAloctnAutoPrcsOvrrd.TRND_ALOCTN_AUTO_PRCS_OVRRD.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field9() {
		return TrndAloctnAutoPrcsOvrrd.TRND_ALOCTN_AUTO_PRCS_OVRRD.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return TrndAloctnAutoPrcsOvrrd.TRND_ALOCTN_AUTO_PRCS_OVRRD.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field11() {
		return TrndAloctnAutoPrcsOvrrd.TRND_ALOCTN_AUTO_PRCS_OVRRD.LAST_UPDT_TS;
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
		return getStrtTrndSlsPerdId();
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
		return getEndTrndSlsPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getTrndAloctnAutoStusId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value7() {
		return getTrndAloctnManulStusId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value9() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value11() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrndAloctnAutoPrcsOvrrdRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrndAloctnAutoPrcsOvrrdRecord value2(String value) {
		setSlsChnlCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrndAloctnAutoPrcsOvrrdRecord value3(BigDecimal value) {
		setStrtTrndSlsPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrndAloctnAutoPrcsOvrrdRecord value4(String value) {
		setLclBilngOffrTyp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrndAloctnAutoPrcsOvrrdRecord value5(BigDecimal value) {
		setEndTrndSlsPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrndAloctnAutoPrcsOvrrdRecord value6(BigDecimal value) {
		setTrndAloctnAutoStusId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrndAloctnAutoPrcsOvrrdRecord value7(BigDecimal value) {
		setTrndAloctnManulStusId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrndAloctnAutoPrcsOvrrdRecord value8(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrndAloctnAutoPrcsOvrrdRecord value9(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrndAloctnAutoPrcsOvrrdRecord value10(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrndAloctnAutoPrcsOvrrdRecord value11(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrndAloctnAutoPrcsOvrrdRecord values(BigDecimal value1, String value2, BigDecimal value3, String value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, String value8, Date value9, String value10, Date value11) {
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
		value11(value11);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TrndAloctnAutoPrcsOvrrdRecord
	 */
	public TrndAloctnAutoPrcsOvrrdRecord() {
		super(TrndAloctnAutoPrcsOvrrd.TRND_ALOCTN_AUTO_PRCS_OVRRD);
	}

	/**
	 * Create a detached, initialised TrndAloctnAutoPrcsOvrrdRecord
	 */
	public TrndAloctnAutoPrcsOvrrdRecord(BigDecimal mrktId, String slsChnlCd, BigDecimal strtTrndSlsPerdId, String lclBilngOffrTyp, BigDecimal endTrndSlsPerdId, BigDecimal trndAloctnAutoStusId, BigDecimal trndAloctnManulStusId, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(TrndAloctnAutoPrcsOvrrd.TRND_ALOCTN_AUTO_PRCS_OVRRD);

		setValue(0, mrktId);
		setValue(1, slsChnlCd);
		setValue(2, strtTrndSlsPerdId);
		setValue(3, lclBilngOffrTyp);
		setValue(4, endTrndSlsPerdId);
		setValue(5, trndAloctnAutoStusId);
		setValue(6, trndAloctnManulStusId);
		setValue(7, creatUserId);
		setValue(8, creatTs);
		setValue(9, lastUpdtUserId);
		setValue(10, lastUpdtTs);
	}
}
