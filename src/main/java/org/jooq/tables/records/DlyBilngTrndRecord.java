/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.DlyBilngTrnd;


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
public class DlyBilngTrndRecord extends UpdatableRecordImpl<DlyBilngTrndRecord> {

	private static final long serialVersionUID = 3839083;

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.DLY_BILNG_ID</code>.
	 */
	public void setDlyBilngId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.DLY_BILNG_ID</code>.
	 */
	public BigDecimal getDlyBilngId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.SLS_CHNL_CD</code>.
	 */
	public void setSlsChnlCd(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.SLS_CHNL_CD</code>.
	 */
	public String getSlsChnlCd() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.TRND_SLS_PERD_ID</code>.
	 */
	public void setTrndSlsPerdId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.TRND_SLS_PERD_ID</code>.
	 */
	public BigDecimal getTrndSlsPerdId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.LCL_BILNG_ACTN_CD</code>.
	 */
	public void setLclBilngActnCd(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.LCL_BILNG_ACTN_CD</code>.
	 */
	public String getLclBilngActnCd() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.LCL_BILNG_TRAN_TYP</code>.
	 */
	public void setLclBilngTranTyp(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.LCL_BILNG_TRAN_TYP</code>.
	 */
	public String getLclBilngTranTyp() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.FSC_CD</code>.
	 */
	public void setFscCd(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.FSC_CD</code>.
	 */
	public String getFscCd() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.SLS_PRC_AMT</code>.
	 */
	public void setSlsPrcAmt(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.SLS_PRC_AMT</code>.
	 */
	public BigDecimal getSlsPrcAmt() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.NR_FOR_QTY</code>.
	 */
	public void setNrForQty(Short value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.NR_FOR_QTY</code>.
	 */
	public Short getNrForQty() {
		return (Short) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.PRCSNG_DT</code>.
	 */
	public void setPrcsngDt(Date value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.PRCSNG_DT</code>.
	 */
	public Date getPrcsngDt() {
		return (Date) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.CRNCY_CD</code>.
	 */
	public void setCrncyCd(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.CRNCY_CD</code>.
	 */
	public String getCrncyCd() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.LCL_BILNG_OFFR_TYP</code>.
	 */
	public void setLclBilngOffrTyp(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.LCL_BILNG_OFFR_TYP</code>.
	 */
	public String getLclBilngOffrTyp() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.UNIT_QTY</code>.
	 */
	public void setUnitQty(Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.UNIT_QTY</code>.
	 */
	public Integer getUnitQty() {
		return (Integer) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.COMSN_AMT</code>.
	 */
	public void setComsnAmt(BigDecimal value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.COMSN_AMT</code>.
	 */
	public BigDecimal getComsnAmt() {
		return (BigDecimal) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.TAX_AMT</code>.
	 */
	public void setTaxAmt(BigDecimal value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.TAX_AMT</code>.
	 */
	public BigDecimal getTaxAmt() {
		return (BigDecimal) getValue(15);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.BILNG_LINE_NR</code>.
	 */
	public void setBilngLineNr(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.BILNG_LINE_NR</code>.
	 */
	public String getBilngLineNr() {
		return (String) getValue(16);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.REG_PRC_AMT</code>.
	 */
	public void setRegPrcAmt(BigDecimal value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.REG_PRC_AMT</code>.
	 */
	public BigDecimal getRegPrcAmt() {
		return (BigDecimal) getValue(17);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.MLPLN_CD</code>.
	 */
	public void setMlplnCd(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.MLPLN_CD</code>.
	 */
	public String getMlplnCd() {
		return (String) getValue(18);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.LCL_BILNG_DEFRD_CD</code>.
	 */
	public void setLclBilngDefrdCd(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.LCL_BILNG_DEFRD_CD</code>.
	 */
	public String getLclBilngDefrdCd() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.LCL_BILNG_SHPNG_CD</code>.
	 */
	public void setLclBilngShpngCd(String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.LCL_BILNG_SHPNG_CD</code>.
	 */
	public String getLclBilngShpngCd() {
		return (String) getValue(20);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.SBSTTD_FSC_CD</code>.
	 */
	public void setSbsttdFscCd(String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.SBSTTD_FSC_CD</code>.
	 */
	public String getSbsttdFscCd() {
		return (String) getValue(21);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.SBSTTD_BILNG_LINE_NR</code>.
	 */
	public void setSbsttdBilngLineNr(String value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.SBSTTD_BILNG_LINE_NR</code>.
	 */
	public String getSbsttdBilngLineNr() {
		return (String) getValue(22);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.BILNG_PLND_IND</code>.
	 */
	public void setBilngPlndInd(String value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.BILNG_PLND_IND</code>.
	 */
	public String getBilngPlndInd() {
		return (String) getValue(23);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.TRND_ALOCTN_AUTO_STUS_ID</code>.
	 */
	public void setTrndAloctnAutoStusId(BigDecimal value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.TRND_ALOCTN_AUTO_STUS_ID</code>.
	 */
	public BigDecimal getTrndAloctnAutoStusId() {
		return (BigDecimal) getValue(24);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.TRND_ALOCTN_MANUL_STUS_ID</code>.
	 */
	public void setTrndAloctnManulStusId(BigDecimal value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.TRND_ALOCTN_MANUL_STUS_ID</code>.
	 */
	public BigDecimal getTrndAloctnManulStusId() {
		return (BigDecimal) getValue(25);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.TRND_CLS_VLD_IND</code>.
	 */
	public void setTrndClsVldInd(String value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.TRND_CLS_VLD_IND</code>.
	 */
	public String getTrndClsVldInd() {
		return (String) getValue(26);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(27);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(28);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(29);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(30);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.SKU_ID</code>.
	 */
	public void setSkuId(BigDecimal value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.SKU_ID</code>.
	 */
	public BigDecimal getSkuId() {
		return (BigDecimal) getValue(31);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.OFFR_SKU_LINE_ID</code>.
	 */
	public void setOffrSkuLineId(BigDecimal value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.OFFR_SKU_LINE_ID</code>.
	 */
	public BigDecimal getOffrSkuLineId() {
		return (BigDecimal) getValue(32);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.FINSHD_GDS_CD</code>.
	 */
	public void setFinshdGdsCd(BigDecimal value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.FINSHD_GDS_CD</code>.
	 */
	public BigDecimal getFinshdGdsCd() {
		return (BigDecimal) getValue(33);
	}

	/**
	 * Setter for <code>WETRN.DLY_BILNG_TRND.SKU_MTCH_MTHD_ID</code>.
	 */
	public void setSkuMtchMthdId(BigDecimal value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>WETRN.DLY_BILNG_TRND.SKU_MTCH_MTHD_ID</code>.
	 */
	public BigDecimal getSkuMtchMthdId() {
		return (BigDecimal) getValue(34);
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
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DlyBilngTrndRecord
	 */
	public DlyBilngTrndRecord() {
		super(DlyBilngTrnd.DLY_BILNG_TRND);
	}

	/**
	 * Create a detached, initialised DlyBilngTrndRecord
	 */
	public DlyBilngTrndRecord(BigDecimal dlyBilngId, BigDecimal mrktId, String slsChnlCd, BigDecimal trndSlsPerdId, BigDecimal offrPerdId, String lclBilngActnCd, String lclBilngTranTyp, String fscCd, BigDecimal slsPrcAmt, Short nrForQty, Date prcsngDt, String crncyCd, String lclBilngOffrTyp, Integer unitQty, BigDecimal comsnAmt, BigDecimal taxAmt, String bilngLineNr, BigDecimal regPrcAmt, String mlplnCd, String lclBilngDefrdCd, String lclBilngShpngCd, String sbsttdFscCd, String sbsttdBilngLineNr, String bilngPlndInd, BigDecimal trndAloctnAutoStusId, BigDecimal trndAloctnManulStusId, String trndClsVldInd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, BigDecimal skuId, BigDecimal offrSkuLineId, BigDecimal finshdGdsCd, BigDecimal skuMtchMthdId) {
		super(DlyBilngTrnd.DLY_BILNG_TRND);

		setValue(0, dlyBilngId);
		setValue(1, mrktId);
		setValue(2, slsChnlCd);
		setValue(3, trndSlsPerdId);
		setValue(4, offrPerdId);
		setValue(5, lclBilngActnCd);
		setValue(6, lclBilngTranTyp);
		setValue(7, fscCd);
		setValue(8, slsPrcAmt);
		setValue(9, nrForQty);
		setValue(10, prcsngDt);
		setValue(11, crncyCd);
		setValue(12, lclBilngOffrTyp);
		setValue(13, unitQty);
		setValue(14, comsnAmt);
		setValue(15, taxAmt);
		setValue(16, bilngLineNr);
		setValue(17, regPrcAmt);
		setValue(18, mlplnCd);
		setValue(19, lclBilngDefrdCd);
		setValue(20, lclBilngShpngCd);
		setValue(21, sbsttdFscCd);
		setValue(22, sbsttdBilngLineNr);
		setValue(23, bilngPlndInd);
		setValue(24, trndAloctnAutoStusId);
		setValue(25, trndAloctnManulStusId);
		setValue(26, trndClsVldInd);
		setValue(27, creatUserId);
		setValue(28, creatTs);
		setValue(29, lastUpdtUserId);
		setValue(30, lastUpdtTs);
		setValue(31, skuId);
		setValue(32, offrSkuLineId);
		setValue(33, finshdGdsCd);
		setValue(34, skuMtchMthdId);
	}
}
