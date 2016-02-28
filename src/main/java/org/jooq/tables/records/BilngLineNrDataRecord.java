/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Record4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.BilngLineNrData;


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
public class BilngLineNrDataRecord extends UpdatableRecordImpl<BilngLineNrDataRecord> {

	private static final long serialVersionUID = 788850664;

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.OFFR_SKU_ID</code>.
	 */
	public void setOffrSkuId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.OFFR_SKU_ID</code>.
	 */
	public BigDecimal getOffrSkuId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.ITEM_TYP</code>.
	 */
	public void setItemTyp(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.ITEM_TYP</code>.
	 */
	public String getItemTyp() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.BILNG_SYS_ID</code>.
	 */
	public void setBilngSysId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.BILNG_SYS_ID</code>.
	 */
	public BigDecimal getBilngSysId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.FSC_CD</code>.
	 */
	public void setFscCd(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.FSC_CD</code>.
	 */
	public String getFscCd() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.LINE_NR_TYP_CD</code>.
	 */
	public void setLineNrTypCd(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.LINE_NR_TYP_CD</code>.
	 */
	public String getLineNrTypCd() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.BILNG_LINE_NR</code>.
	 */
	public void setBilngLineNr(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.BILNG_LINE_NR</code>.
	 */
	public String getBilngLineNr() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.SKU_ID</code>.
	 */
	public void setSkuId(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.SKU_ID</code>.
	 */
	public BigDecimal getSkuId() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.ITEM_DESC_TEXT</code>.
	 */
	public void setItemDescText(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.ITEM_DESC_TEXT</code>.
	 */
	public String getItemDescText() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.SLS_PRC_AMT</code>.
	 */
	public void setSlsPrcAmt(BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.SLS_PRC_AMT</code>.
	 */
	public BigDecimal getSlsPrcAmt() {
		return (BigDecimal) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.SET_CMPNT_CNT</code>.
	 */
	public void setSetCmpntCnt(BigDecimal value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.SET_CMPNT_CNT</code>.
	 */
	public BigDecimal getSetCmpntCnt() {
		return (BigDecimal) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.SET_LINE_NR</code>.
	 */
	public void setSetLineNr(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.SET_LINE_NR</code>.
	 */
	public String getSetLineNr() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.SET_CMPNT_QTY</code>.
	 */
	public void setSetCmpntQty(Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.SET_CMPNT_QTY</code>.
	 */
	public Integer getSetCmpntQty() {
		return (Integer) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.MULT_FSC_PRC_NR_FOR_IND</code>.
	 */
	public void setMultFscPrcNrForInd(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.MULT_FSC_PRC_NR_FOR_IND</code>.
	 */
	public String getMultFscPrcNrForInd() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.DISCNT_PCT</code>.
	 */
	public void setDiscntPct(BigDecimal value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.DISCNT_PCT</code>.
	 */
	public BigDecimal getDiscntPct() {
		return (BigDecimal) getValue(15);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.BRCHR_LINE_IND</code>.
	 */
	public void setBrchrLineInd(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.BRCHR_LINE_IND</code>.
	 */
	public String getBrchrLineInd() {
		return (String) getValue(16);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(17);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(18);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(20);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.NR_FOR_QTY</code>.
	 */
	public void setNrForQty(Integer value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.NR_FOR_QTY</code>.
	 */
	public Integer getNrForQty() {
		return (Integer) getValue(21);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.OFFR_ID</code>.
	 */
	public void setOffrId(BigDecimal value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.OFFR_ID</code>.
	 */
	public BigDecimal getOffrId() {
		return (BigDecimal) getValue(22);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.CRNCY_CD</code>.
	 */
	public void setCrncyCd(String value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.CRNCY_CD</code>.
	 */
	public String getCrncyCd() {
		return (String) getValue(23);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.PG_NR</code>.
	 */
	public void setPgNr(Short value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.PG_NR</code>.
	 */
	public Short getPgNr() {
		return (Short) getValue(24);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.VEH_ID</code>.
	 */
	public void setVehId(BigDecimal value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.VEH_ID</code>.
	 */
	public BigDecimal getVehId() {
		return (BigDecimal) getValue(25);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.NET_TO_AVON_FCT</code>.
	 */
	public void setNetToAvonFct(BigDecimal value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.NET_TO_AVON_FCT</code>.
	 */
	public BigDecimal getNetToAvonFct() {
		return (BigDecimal) getValue(26);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.PYMT_TYP</code>.
	 */
	public void setPymtTyp(String value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.PYMT_TYP</code>.
	 */
	public String getPymtTyp() {
		return (String) getValue(27);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.OFFR_CLS_ID</code>.
	 */
	public void setOffrClsId(BigDecimal value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.OFFR_CLS_ID</code>.
	 */
	public BigDecimal getOffrClsId() {
		return (BigDecimal) getValue(28);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.ITEM_LINE_NR_TYP</code>.
	 */
	public void setItemLineNrTyp(String value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.ITEM_LINE_NR_TYP</code>.
	 */
	public String getItemLineNrTyp() {
		return (String) getValue(29);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.LATE_OFFR_IND</code>.
	 */
	public void setLateOffrInd(String value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.LATE_OFFR_IND</code>.
	 */
	public String getLateOffrInd() {
		return (String) getValue(30);
	}

	/**
	 * Setter for <code>WETRN.BILNG_LINE_NR_DATA.LATE_OFFR_SEQ_NR</code>.
	 */
	public void setLateOffrSeqNr(BigDecimal value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>WETRN.BILNG_LINE_NR_DATA.LATE_OFFR_SEQ_NR</code>.
	 */
	public BigDecimal getLateOffrSeqNr() {
		return (BigDecimal) getValue(31);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record4<BigDecimal, BigDecimal, BigDecimal, String> key() {
		return (Record4) super.key();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BilngLineNrDataRecord
	 */
	public BilngLineNrDataRecord() {
		super(BilngLineNrData.BILNG_LINE_NR_DATA);
	}

	/**
	 * Create a detached, initialised BilngLineNrDataRecord
	 */
	public BilngLineNrDataRecord(BigDecimal mrktId, BigDecimal offrSkuId, BigDecimal offrPerdId, String itemTyp, BigDecimal bilngSysId, String fscCd, String lineNrTypCd, String bilngLineNr, BigDecimal skuId, String itemDescText, BigDecimal slsPrcAmt, BigDecimal setCmpntCnt, String setLineNr, Integer setCmpntQty, String multFscPrcNrForInd, BigDecimal discntPct, String brchrLineInd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, Integer nrForQty, BigDecimal offrId, String crncyCd, Short pgNr, BigDecimal vehId, BigDecimal netToAvonFct, String pymtTyp, BigDecimal offrClsId, String itemLineNrTyp, String lateOffrInd, BigDecimal lateOffrSeqNr) {
		super(BilngLineNrData.BILNG_LINE_NR_DATA);

		setValue(0, mrktId);
		setValue(1, offrSkuId);
		setValue(2, offrPerdId);
		setValue(3, itemTyp);
		setValue(4, bilngSysId);
		setValue(5, fscCd);
		setValue(6, lineNrTypCd);
		setValue(7, bilngLineNr);
		setValue(8, skuId);
		setValue(9, itemDescText);
		setValue(10, slsPrcAmt);
		setValue(11, setCmpntCnt);
		setValue(12, setLineNr);
		setValue(13, setCmpntQty);
		setValue(14, multFscPrcNrForInd);
		setValue(15, discntPct);
		setValue(16, brchrLineInd);
		setValue(17, creatUserId);
		setValue(18, creatTs);
		setValue(19, lastUpdtUserId);
		setValue(20, lastUpdtTs);
		setValue(21, nrForQty);
		setValue(22, offrId);
		setValue(23, crncyCd);
		setValue(24, pgNr);
		setValue(25, vehId);
		setValue(26, netToAvonFct);
		setValue(27, pymtTyp);
		setValue(28, offrClsId);
		setValue(29, itemLineNrTyp);
		setValue(30, lateOffrInd);
		setValue(31, lateOffrSeqNr);
	}
}