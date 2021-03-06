/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.TEditOffrMsData;


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
public class TEditOffrMsDataRecord extends UDTRecordImpl<TEditOffrMsDataRecord> implements Record16<BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, Integer, BigDecimal, String, String, String, String, String, String, String, BigDecimal> {

	private static final long serialVersionUID = 997464751;

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.OFFR_PRFL_PRCPT_ID</code>.
	 */
	public void setOffrPrflPrcptId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.OFFR_PRFL_PRCPT_ID</code>.
	 */
	public BigDecimal getOffrPrflPrcptId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.OFFR_SKU_LINE_ID</code>.
	 */
	public void setOffrSkuLineId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.OFFR_SKU_LINE_ID</code>.
	 */
	public BigDecimal getOffrSkuLineId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.ITEM_ID</code>.
	 */
	public void setItemId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.ITEM_ID</code>.
	 */
	public BigDecimal getItemId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.ITEM_DESC</code>.
	 */
	public void setItemDesc(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.ITEM_DESC</code>.
	 */
	public String getItemDesc() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.SET_ID</code>.
	 */
	public void setSetId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.SET_ID</code>.
	 */
	public BigDecimal getSetId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.SET_DESC</code>.
	 */
	public void setSetDesc(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.SET_DESC</code>.
	 */
	public String getSetDesc() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.NR_FOR_QTY</code>.
	 */
	public void setNrForQty(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.NR_FOR_QTY</code>.
	 */
	public Integer getNrForQty() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.SLS_PRC_AMT</code>.
	 */
	public void setSlsPrcAmt(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.SLS_PRC_AMT</code>.
	 */
	public BigDecimal getSlsPrcAmt() {
		return (BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.PRLFL_NM</code>.
	 */
	public void setPrlflNm(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.PRLFL_NM</code>.
	 */
	public String getPrlflNm() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.PROMTN_DESC_TXT</code>.
	 */
	public void setPromtnDescTxt(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.PROMTN_DESC_TXT</code>.
	 */
	public String getPromtnDescTxt() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.PROMTN_CLM_DESC_TXT</code>.
	 */
	public void setPromtnClmDescTxt(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.PROMTN_CLM_DESC_TXT</code>.
	 */
	public String getPromtnClmDescTxt() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.SET_CMPNT_QTY</code>.
	 */
	public void setSetCmpntQty(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.SET_CMPNT_QTY</code>.
	 */
	public String getSetCmpntQty() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.FEATRD_SIDE_CD</code>.
	 */
	public void setFeatrdSideCd(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.FEATRD_SIDE_CD</code>.
	 */
	public String getFeatrdSideCd() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.PG_OFS_NR</code>.
	 */
	public void setPgOfsNr(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.PG_OFS_NR</code>.
	 */
	public String getPgOfsNr() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.SET_PRC_TYP_ID</code>.
	 */
	public void setSetPrcTypId(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.SET_PRC_TYP_ID</code>.
	 */
	public String getSetPrcTypId() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.T_EDIT_OFFR_MS_DATA.SET_PRC_AMT</code>.
	 */
	public void setSetPrcAmt(BigDecimal value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.T_EDIT_OFFR_MS_DATA.SET_PRC_AMT</code>.
	 */
	public BigDecimal getSetPrcAmt() {
		return (BigDecimal) getValue(15);
	}

	// -------------------------------------------------------------------------
	// Record16 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, Integer, BigDecimal, String, String, String, String, String, String, String, BigDecimal> fieldsRow() {
		return (Row16) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, Integer, BigDecimal, String, String, String, String, String, String, String, BigDecimal> valuesRow() {
		return (Row16) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return TEditOffrMsData.OFFR_PRFL_PRCPT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return TEditOffrMsData.OFFR_SKU_LINE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return TEditOffrMsData.ITEM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TEditOffrMsData.ITEM_DESC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return TEditOffrMsData.SET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return TEditOffrMsData.SET_DESC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return TEditOffrMsData.NR_FOR_QTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field8() {
		return TEditOffrMsData.SLS_PRC_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return TEditOffrMsData.PRLFL_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return TEditOffrMsData.PROMTN_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return TEditOffrMsData.PROMTN_CLM_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return TEditOffrMsData.SET_CMPNT_QTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return TEditOffrMsData.FEATRD_SIDE_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field14() {
		return TEditOffrMsData.PG_OFS_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field15() {
		return TEditOffrMsData.SET_PRC_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field16() {
		return TEditOffrMsData.SET_PRC_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getOffrPrflPrcptId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getOffrSkuLineId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getItemDesc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getSetId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getSetDesc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getNrForQty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value8() {
		return getSlsPrcAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getPrlflNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getPromtnDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getPromtnClmDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getSetCmpntQty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getFeatrdSideCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value14() {
		return getPgOfsNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value15() {
		return getSetPrcTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value16() {
		return getSetPrcAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value1(BigDecimal value) {
		setOffrPrflPrcptId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value2(BigDecimal value) {
		setOffrSkuLineId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value3(BigDecimal value) {
		setItemId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value4(String value) {
		setItemDesc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value5(BigDecimal value) {
		setSetId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value6(String value) {
		setSetDesc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value7(Integer value) {
		setNrForQty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value8(BigDecimal value) {
		setSlsPrcAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value9(String value) {
		setPrlflNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value10(String value) {
		setPromtnDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value11(String value) {
		setPromtnClmDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value12(String value) {
		setSetCmpntQty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value13(String value) {
		setFeatrdSideCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value14(String value) {
		setPgOfsNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value15(String value) {
		setSetPrcTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord value16(BigDecimal value) {
		setSetPrcAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TEditOffrMsDataRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, String value4, BigDecimal value5, String value6, Integer value7, BigDecimal value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, BigDecimal value16) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TEditOffrMsDataRecord
	 */
	public TEditOffrMsDataRecord() {
		super(TEditOffrMsData.T_EDIT_OFFR_MS_DATA);
	}

	/**
	 * Create a detached, initialised TEditOffrMsDataRecord
	 */
	public TEditOffrMsDataRecord(BigDecimal offrPrflPrcptId, BigDecimal offrSkuLineId, BigDecimal itemId, String itemDesc, BigDecimal setId, String setDesc, Integer nrForQty, BigDecimal slsPrcAmt, String prlflNm, String promtnDescTxt, String promtnClmDescTxt, String setCmpntQty, String featrdSideCd, String pgOfsNr, String setPrcTypId, BigDecimal setPrcAmt) {
		super(TEditOffrMsData.T_EDIT_OFFR_MS_DATA);

		setValue(0, offrPrflPrcptId);
		setValue(1, offrSkuLineId);
		setValue(2, itemId);
		setValue(3, itemDesc);
		setValue(4, setId);
		setValue(5, setDesc);
		setValue(6, nrForQty);
		setValue(7, slsPrcAmt);
		setValue(8, prlflNm);
		setValue(9, promtnDescTxt);
		setValue(10, promtnClmDescTxt);
		setValue(11, setCmpntQty);
		setValue(12, featrdSideCd);
		setValue(13, pgOfsNr);
		setValue(14, setPrcTypId);
		setValue(15, setPrcAmt);
	}
}
