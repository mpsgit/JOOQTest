/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record19;
import org.jooq.Record3;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.MrktTaxTypLkup;


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
public class MrktTaxTypLkupRecord extends UpdatableRecordImpl<MrktTaxTypLkupRecord> implements Record19<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String> {

	private static final long serialVersionUID = -440643596;

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.EFF_PERD_ID</code>.
	 */
	public void setEffPerdId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.EFF_PERD_ID</code>.
	 */
	public BigDecimal getEffPerdId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.TAX_TYPE_LKUP_ID</code>.
	 */
	public void setTaxTypeLkupId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.TAX_TYPE_LKUP_ID</code>.
	 */
	public BigDecimal getTaxTypeLkupId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.SEQ_NR</code>.
	 */
	public void setSeqNr(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.SEQ_NR</code>.
	 */
	public BigDecimal getSeqNr() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.PROD_TYP_ID</code>.
	 */
	public void setProdTypId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.PROD_TYP_ID</code>.
	 */
	public BigDecimal getProdTypId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.CATGRY_ID</code>.
	 */
	public void setCatgryId(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.CATGRY_ID</code>.
	 */
	public BigDecimal getCatgryId() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.BUS_ID</code>.
	 */
	public void setBusId(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.BUS_ID</code>.
	 */
	public BigDecimal getBusId() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.TAX_TYPE_ID</code>.
	 */
	public void setTaxTypeId(BigDecimal value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.TAX_TYPE_ID</code>.
	 */
	public BigDecimal getTaxTypeId() {
		return (BigDecimal) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.SGMT_ID</code>.
	 */
	public void setSgmtId(BigDecimal value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.SGMT_ID</code>.
	 */
	public BigDecimal getSgmtId() {
		return (BigDecimal) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.PRFL_CD</code>.
	 */
	public void setPrflCd(Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.PRFL_CD</code>.
	 */
	public Integer getPrflCd() {
		return (Integer) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.LCL_BUS_ID</code>.
	 */
	public void setLclBusId(BigDecimal value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.LCL_BUS_ID</code>.
	 */
	public BigDecimal getLclBusId() {
		return (BigDecimal) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.FORM_ID</code>.
	 */
	public void setFormId(BigDecimal value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.FORM_ID</code>.
	 */
	public BigDecimal getFormId() {
		return (BigDecimal) getValue(15);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.FORM_GRP_ID</code>.
	 */
	public void setFormGrpId(BigDecimal value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.FORM_GRP_ID</code>.
	 */
	public BigDecimal getFormGrpId() {
		return (BigDecimal) getValue(16);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.VEH_ID</code>.
	 */
	public void setVehId(BigDecimal value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.VEH_ID</code>.
	 */
	public BigDecimal getVehId() {
		return (BigDecimal) getValue(17);
	}

	/**
	 * Setter for <code>WETRN.MRKT_TAX_TYP_LKUP.SLS_CLS_CD</code>.
	 */
	public void setSlsClsCd(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_TAX_TYP_LKUP.SLS_CLS_CD</code>.
	 */
	public String getSlsClsCd() {
		return (String) getValue(18);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record3<BigDecimal, BigDecimal, BigDecimal> key() {
		return (Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record19 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row19<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String> fieldsRow() {
		return (Row19) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row19<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String> valuesRow() {
		return (Row19) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.EFF_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.TAX_TYPE_LKUP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.SEQ_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.PROD_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.CATGRY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field7() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.BUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field9() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field11() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field12() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.TAX_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field13() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.SGMT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field14() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.PRFL_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field15() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.LCL_BUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field16() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.FORM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field17() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.FORM_GRP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field18() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.VEH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field19() {
		return MrktTaxTypLkup.MRKT_TAX_TYP_LKUP.SLS_CLS_CD;
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
		return getEffPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getTaxTypeLkupId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getSeqNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getProdTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getCatgryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value7() {
		return getBusId();
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
	public BigDecimal value12() {
		return getTaxTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value13() {
		return getSgmtId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value14() {
		return getPrflCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value15() {
		return getLclBusId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value16() {
		return getFormId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value17() {
		return getFormGrpId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value18() {
		return getVehId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value19() {
		return getSlsClsCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value2(BigDecimal value) {
		setEffPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value3(BigDecimal value) {
		setTaxTypeLkupId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value4(BigDecimal value) {
		setSeqNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value5(BigDecimal value) {
		setProdTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value6(BigDecimal value) {
		setCatgryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value7(BigDecimal value) {
		setBusId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value8(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value9(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value10(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value11(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value12(BigDecimal value) {
		setTaxTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value13(BigDecimal value) {
		setSgmtId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value14(Integer value) {
		setPrflCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value15(BigDecimal value) {
		setLclBusId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value16(BigDecimal value) {
		setFormId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value17(BigDecimal value) {
		setFormGrpId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value18(BigDecimal value) {
		setVehId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord value19(String value) {
		setSlsClsCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTypLkupRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, String value8, Date value9, String value10, Date value11, BigDecimal value12, BigDecimal value13, Integer value14, BigDecimal value15, BigDecimal value16, BigDecimal value17, BigDecimal value18, String value19) {
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
		value12(value12);
		value13(value13);
		value14(value14);
		value15(value15);
		value16(value16);
		value17(value17);
		value18(value18);
		value19(value19);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MrktTaxTypLkupRecord
	 */
	public MrktTaxTypLkupRecord() {
		super(MrktTaxTypLkup.MRKT_TAX_TYP_LKUP);
	}

	/**
	 * Create a detached, initialised MrktTaxTypLkupRecord
	 */
	public MrktTaxTypLkupRecord(BigDecimal mrktId, BigDecimal effPerdId, BigDecimal taxTypeLkupId, BigDecimal seqNr, BigDecimal prodTypId, BigDecimal catgryId, BigDecimal busId, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, BigDecimal taxTypeId, BigDecimal sgmtId, Integer prflCd, BigDecimal lclBusId, BigDecimal formId, BigDecimal formGrpId, BigDecimal vehId, String slsClsCd) {
		super(MrktTaxTypLkup.MRKT_TAX_TYP_LKUP);

		setValue(0, mrktId);
		setValue(1, effPerdId);
		setValue(2, taxTypeLkupId);
		setValue(3, seqNr);
		setValue(4, prodTypId);
		setValue(5, catgryId);
		setValue(6, busId);
		setValue(7, creatUserId);
		setValue(8, creatTs);
		setValue(9, lastUpdtUserId);
		setValue(10, lastUpdtTs);
		setValue(11, taxTypeId);
		setValue(12, sgmtId);
		setValue(13, prflCd);
		setValue(14, lclBusId);
		setValue(15, formId);
		setValue(16, formGrpId);
		setValue(17, vehId);
		setValue(18, slsClsCd);
	}
}
