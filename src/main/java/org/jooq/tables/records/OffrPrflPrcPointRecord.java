/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.OffrPrflPrcPoint;


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
public class OffrPrflPrcPointRecord extends UpdatableRecordImpl<OffrPrflPrcPointRecord> {

	private static final long serialVersionUID = 1471321987;

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.OFFR_PRFL_PRCPT_ID</code>.
	 */
	public void setOffrPrflPrcptId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.OFFR_PRFL_PRCPT_ID</code>.
	 */
	public BigDecimal getOffrPrflPrcptId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.OFFR_ID</code>.
	 */
	public void setOffrId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.OFFR_ID</code>.
	 */
	public BigDecimal getOffrId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PROMTN_CLM_ID</code>.
	 */
	public void setPromtnClmId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PROMTN_CLM_ID</code>.
	 */
	public BigDecimal getPromtnClmId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.VEH_ID</code>.
	 */
	public void setVehId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.VEH_ID</code>.
	 */
	public BigDecimal getVehId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PROMTN_ID</code>.
	 */
	public void setPromtnId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PROMTN_ID</code>.
	 */
	public BigDecimal getPromtnId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.SLS_CLS_CD</code>.
	 */
	public void setSlsClsCd(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.SLS_CLS_CD</code>.
	 */
	public String getSlsClsCd() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PRFL_CD</code>.
	 */
	public void setPrflCd(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PRFL_CD</code>.
	 */
	public Integer getPrflCd() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.SSNL_EVNT_ID</code>.
	 */
	public void setSsnlEvntId(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.SSNL_EVNT_ID</code>.
	 */
	public BigDecimal getSsnlEvntId() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.SLS_STUS_CD</code>.
	 */
	public void setSlsStusCd(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.SLS_STUS_CD</code>.
	 */
	public String getSlsStusCd() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.CRNCY_CD</code>.
	 */
	public void setCrncyCd(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.CRNCY_CD</code>.
	 */
	public String getCrncyCd() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.SKU_CNT</code>.
	 */
	public void setSkuCnt(BigDecimal value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.SKU_CNT</code>.
	 */
	public BigDecimal getSkuCnt() {
		return (BigDecimal) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.NR_FOR_QTY</code>.
	 */
	public void setNrForQty(Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.NR_FOR_QTY</code>.
	 */
	public Integer getNrForQty() {
		return (Integer) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.SKU_OFFR_STRGTH_PCT</code>.
	 */
	public void setSkuOffrStrgthPct(BigDecimal value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.SKU_OFFR_STRGTH_PCT</code>.
	 */
	public BigDecimal getSkuOffrStrgthPct() {
		return (BigDecimal) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.EST_UNIT_QTY</code>.
	 */
	public void setEstUnitQty(Integer value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.EST_UNIT_QTY</code>.
	 */
	public Integer getEstUnitQty() {
		return (Integer) getValue(15);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.EST_SLS_AMT</code>.
	 */
	public void setEstSlsAmt(BigDecimal value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.EST_SLS_AMT</code>.
	 */
	public BigDecimal getEstSlsAmt() {
		return (BigDecimal) getValue(16);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.EST_COST_AMT</code>.
	 */
	public void setEstCostAmt(BigDecimal value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.EST_COST_AMT</code>.
	 */
	public BigDecimal getEstCostAmt() {
		return (BigDecimal) getValue(17);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.SLS_SRCE_ID</code>.
	 */
	public void setSlsSrceId(BigDecimal value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.SLS_SRCE_ID</code>.
	 */
	public BigDecimal getSlsSrceId() {
		return (BigDecimal) getValue(18);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PRFL_STUS_RSN_DESC_TXT</code>.
	 */
	public void setPrflStusRsnDescTxt(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PRFL_STUS_RSN_DESC_TXT</code>.
	 */
	public String getPrflStusRsnDescTxt() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PRFL_STUS_CD</code>.
	 */
	public void setPrflStusCd(String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PRFL_STUS_CD</code>.
	 */
	public String getPrflStusCd() {
		return (String) getValue(20);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.SLS_PRC_AMT</code>.
	 */
	public void setSlsPrcAmt(BigDecimal value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.SLS_PRC_AMT</code>.
	 */
	public BigDecimal getSlsPrcAmt() {
		return (BigDecimal) getValue(21);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.TAX_AMT</code>.
	 */
	public void setTaxAmt(BigDecimal value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.TAX_AMT</code>.
	 */
	public BigDecimal getTaxAmt() {
		return (BigDecimal) getValue(22);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PYMT_TYP</code>.
	 */
	public void setPymtTyp(String value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PYMT_TYP</code>.
	 */
	public String getPymtTyp() {
		return (String) getValue(23);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.COMSN_AMT</code>.
	 */
	public void setComsnAmt(BigDecimal value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.COMSN_AMT</code>.
	 */
	public BigDecimal getComsnAmt() {
		return (BigDecimal) getValue(24);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.COMSN_TYP</code>.
	 */
	public void setComsnTyp(String value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.COMSN_TYP</code>.
	 */
	public String getComsnTyp() {
		return (String) getValue(25);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.NET_TO_AVON_FCT</code>.
	 */
	public void setNetToAvonFct(BigDecimal value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.NET_TO_AVON_FCT</code>.
	 */
	public BigDecimal getNetToAvonFct() {
		return (BigDecimal) getValue(26);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PRC_POINT_DESC_TXT</code>.
	 */
	public void setPrcPointDescTxt(String value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PRC_POINT_DESC_TXT</code>.
	 */
	public String getPrcPointDescTxt() {
		return (String) getValue(27);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(28);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(29);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(30);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(31);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PRMRY_OFFR_IND</code>.
	 */
	public void setPrmryOffrInd(String value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PRMRY_OFFR_IND</code>.
	 */
	public String getPrmryOffrInd() {
		return (String) getValue(32);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.IMPCT_CATGRY_ID</code>.
	 */
	public void setImpctCatgryId(BigDecimal value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.IMPCT_CATGRY_ID</code>.
	 */
	public BigDecimal getImpctCatgryId() {
		return (BigDecimal) getValue(33);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PG_OFS_NR</code>.
	 */
	public void setPgOfsNr(BigDecimal value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PG_OFS_NR</code>.
	 */
	public BigDecimal getPgOfsNr() {
		return (BigDecimal) getValue(34);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.FEATRD_SIDE_CD</code>.
	 */
	public void setFeatrdSideCd(String value) {
		setValue(35, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.FEATRD_SIDE_CD</code>.
	 */
	public String getFeatrdSideCd() {
		return (String) getValue(35);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.CNSMR_INVSTMT_BDGT_ID</code>.
	 */
	public void setCnsmrInvstmtBdgtId(BigDecimal value) {
		setValue(36, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.CNSMR_INVSTMT_BDGT_ID</code>.
	 */
	public BigDecimal getCnsmrInvstmtBdgtId() {
		return (BigDecimal) getValue(36);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.OFFR_PRFL_PRCPT_LINK_ID</code>.
	 */
	public void setOffrPrflPrcptLinkId(BigDecimal value) {
		setValue(37, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.OFFR_PRFL_PRCPT_LINK_ID</code>.
	 */
	public BigDecimal getOffrPrflPrcptLinkId() {
		return (BigDecimal) getValue(37);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.SLS_PROMTN_IND</code>.
	 */
	public void setSlsPromtnInd(String value) {
		setValue(38, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.SLS_PROMTN_IND</code>.
	 */
	public String getSlsPromtnInd() {
		return (String) getValue(38);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.IMPCT_PRFL_CD</code>.
	 */
	public void setImpctPrflCd(Integer value) {
		setValue(39, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.IMPCT_PRFL_CD</code>.
	 */
	public Integer getImpctPrflCd() {
		return (Integer) getValue(39);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.AWRD_SLS_PRC_AMT</code>.
	 */
	public void setAwrdSlsPrcAmt(BigDecimal value) {
		setValue(40, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.AWRD_SLS_PRC_AMT</code>.
	 */
	public BigDecimal getAwrdSlsPrcAmt() {
		return (BigDecimal) getValue(40);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.CHRTY_AMT</code>.
	 */
	public void setChrtyAmt(BigDecimal value) {
		setValue(41, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.CHRTY_AMT</code>.
	 */
	public BigDecimal getChrtyAmt() {
		return (BigDecimal) getValue(41);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.CHRTY_OVRRD_IND</code>.
	 */
	public void setChrtyOvrrdInd(String value) {
		setValue(42, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.CHRTY_OVRRD_IND</code>.
	 */
	public String getChrtyOvrrdInd() {
		return (String) getValue(42);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.TAX_TYPE_ID</code>.
	 */
	public void setTaxTypeId(BigDecimal value) {
		setValue(43, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.TAX_TYPE_ID</code>.
	 */
	public BigDecimal getTaxTypeId() {
		return (BigDecimal) getValue(43);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.ROYLT_PCT</code>.
	 */
	public void setRoyltPct(BigDecimal value) {
		setValue(44, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.ROYLT_PCT</code>.
	 */
	public BigDecimal getRoyltPct() {
		return (BigDecimal) getValue(44);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.ROYLT_OVRRD_IND</code>.
	 */
	public void setRoyltOvrrdInd(String value) {
		setValue(45, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.ROYLT_OVRRD_IND</code>.
	 */
	public String getRoyltOvrrdInd() {
		return (String) getValue(45);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.UNIT_CALC_IND</code>.
	 */
	public void setUnitCalcInd(String value) {
		setValue(46, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.UNIT_CALC_IND</code>.
	 */
	public String getUnitCalcInd() {
		return (String) getValue(46);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.DEMO_DISCNT_ID</code>.
	 */
	public void setDemoDiscntId(BigDecimal value) {
		setValue(47, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.DEMO_DISCNT_ID</code>.
	 */
	public BigDecimal getDemoDiscntId() {
		return (BigDecimal) getValue(47);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.FRC_MTCH_MTHD_ID</code>. Force match option for offer.
	 */
	public void setFrcMtchMthdId(BigDecimal value) {
		setValue(48, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.FRC_MTCH_MTHD_ID</code>. Force match option for offer.
	 */
	public BigDecimal getFrcMtchMthdId() {
		return (BigDecimal) getValue(48);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PRC_LVL_TYP_ID</code>.
	 */
	public void setPrcLvlTypId(BigDecimal value) {
		setValue(49, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PRC_LVL_TYP_ID</code>.
	 */
	public BigDecimal getPrcLvlTypId() {
		return (BigDecimal) getValue(49);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PRC_LVL_TYP_CD</code>.
	 */
	public void setPrcLvlTypCd(String value) {
		setValue(50, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PRC_LVL_TYP_CD</code>.
	 */
	public String getPrcLvlTypCd() {
		return (String) getValue(50);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.MIN_PRC_AMT</code>.
	 */
	public void setMinPrcAmt(BigDecimal value) {
		setValue(51, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.MIN_PRC_AMT</code>.
	 */
	public BigDecimal getMinPrcAmt() {
		return (BigDecimal) getValue(51);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.OPT_PRC_AMT</code>.
	 */
	public void setOptPrcAmt(BigDecimal value) {
		setValue(52, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.OPT_PRC_AMT</code>.
	 */
	public BigDecimal getOptPrcAmt() {
		return (BigDecimal) getValue(52);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.MAX_PRC_AMT</code>.
	 */
	public void setMaxPrcAmt(BigDecimal value) {
		setValue(53, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.MAX_PRC_AMT</code>.
	 */
	public BigDecimal getMaxPrcAmt() {
		return (BigDecimal) getValue(53);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PLND_PRC_LVL_TYP_ID</code>.
	 */
	public void setPlndPrcLvlTypId(BigDecimal value) {
		setValue(54, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PLND_PRC_LVL_TYP_ID</code>.
	 */
	public BigDecimal getPlndPrcLvlTypId() {
		return (BigDecimal) getValue(54);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PLND_PRC_LVL_TYP_CD</code>.
	 */
	public void setPlndPrcLvlTypCd(String value) {
		setValue(55, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PLND_PRC_LVL_TYP_CD</code>.
	 */
	public String getPlndPrcLvlTypCd() {
		return (String) getValue(55);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PLND_MIN_PRC_AMT</code>.
	 */
	public void setPlndMinPrcAmt(BigDecimal value) {
		setValue(56, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PLND_MIN_PRC_AMT</code>.
	 */
	public BigDecimal getPlndMinPrcAmt() {
		return (BigDecimal) getValue(56);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PLND_OPT_PRC_AMT</code>.
	 */
	public void setPlndOptPrcAmt(BigDecimal value) {
		setValue(57, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PLND_OPT_PRC_AMT</code>.
	 */
	public BigDecimal getPlndOptPrcAmt() {
		return (BigDecimal) getValue(57);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PLND_MAX_PRC_AMT</code>.
	 */
	public void setPlndMaxPrcAmt(BigDecimal value) {
		setValue(58, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PLND_MAX_PRC_AMT</code>.
	 */
	public BigDecimal getPlndMaxPrcAmt() {
		return (BigDecimal) getValue(58);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.KEY_PRFL_IND</code>.
	 */
	public void setKeyPrflInd(String value) {
		setValue(59, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.KEY_PRFL_IND</code>.
	 */
	public String getKeyPrflInd() {
		return (String) getValue(59);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.GRAIL_MIN_PRC_AMT</code>.
	 */
	public void setGrailMinPrcAmt(BigDecimal value) {
		setValue(60, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.GRAIL_MIN_PRC_AMT</code>.
	 */
	public BigDecimal getGrailMinPrcAmt() {
		return (BigDecimal) getValue(60);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.GRAIL_MAX_PRC_AMT</code>.
	 */
	public void setGrailMaxPrcAmt(BigDecimal value) {
		setValue(61, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.GRAIL_MAX_PRC_AMT</code>.
	 */
	public BigDecimal getGrailMaxPrcAmt() {
		return (BigDecimal) getValue(61);
	}

	/**
	 * Setter for <code>WETRN.OFFR_PRFL_PRC_POINT.PLND_PROMTN_ID</code>.
	 */
	public void setPlndPromtnId(BigDecimal value) {
		setValue(62, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_PRFL_PRC_POINT.PLND_PROMTN_ID</code>.
	 */
	public BigDecimal getPlndPromtnId() {
		return (BigDecimal) getValue(62);
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
	 * Create a detached OffrPrflPrcPointRecord
	 */
	public OffrPrflPrcPointRecord() {
		super(OffrPrflPrcPoint.OFFR_PRFL_PRC_POINT);
	}

	/**
	 * Create a detached, initialised OffrPrflPrcPointRecord
	 */
	public OffrPrflPrcPointRecord(BigDecimal offrPrflPrcptId, BigDecimal offrId, BigDecimal promtnClmId, BigDecimal vehId, BigDecimal promtnId, BigDecimal mrktId, String slsClsCd, Integer prflCd, BigDecimal ssnlEvntId, BigDecimal offrPerdId, String slsStusCd, String crncyCd, BigDecimal skuCnt, Integer nrForQty, BigDecimal skuOffrStrgthPct, Integer estUnitQty, BigDecimal estSlsAmt, BigDecimal estCostAmt, BigDecimal slsSrceId, String prflStusRsnDescTxt, String prflStusCd, BigDecimal slsPrcAmt, BigDecimal taxAmt, String pymtTyp, BigDecimal comsnAmt, String comsnTyp, BigDecimal netToAvonFct, String prcPointDescTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String prmryOffrInd, BigDecimal impctCatgryId, BigDecimal pgOfsNr, String featrdSideCd, BigDecimal cnsmrInvstmtBdgtId, BigDecimal offrPrflPrcptLinkId, String slsPromtnInd, Integer impctPrflCd, BigDecimal awrdSlsPrcAmt, BigDecimal chrtyAmt, String chrtyOvrrdInd, BigDecimal taxTypeId, BigDecimal royltPct, String royltOvrrdInd, String unitCalcInd, BigDecimal demoDiscntId, BigDecimal frcMtchMthdId, BigDecimal prcLvlTypId, String prcLvlTypCd, BigDecimal minPrcAmt, BigDecimal optPrcAmt, BigDecimal maxPrcAmt, BigDecimal plndPrcLvlTypId, String plndPrcLvlTypCd, BigDecimal plndMinPrcAmt, BigDecimal plndOptPrcAmt, BigDecimal plndMaxPrcAmt, String keyPrflInd, BigDecimal grailMinPrcAmt, BigDecimal grailMaxPrcAmt, BigDecimal plndPromtnId) {
		super(OffrPrflPrcPoint.OFFR_PRFL_PRC_POINT);

		setValue(0, offrPrflPrcptId);
		setValue(1, offrId);
		setValue(2, promtnClmId);
		setValue(3, vehId);
		setValue(4, promtnId);
		setValue(5, mrktId);
		setValue(6, slsClsCd);
		setValue(7, prflCd);
		setValue(8, ssnlEvntId);
		setValue(9, offrPerdId);
		setValue(10, slsStusCd);
		setValue(11, crncyCd);
		setValue(12, skuCnt);
		setValue(13, nrForQty);
		setValue(14, skuOffrStrgthPct);
		setValue(15, estUnitQty);
		setValue(16, estSlsAmt);
		setValue(17, estCostAmt);
		setValue(18, slsSrceId);
		setValue(19, prflStusRsnDescTxt);
		setValue(20, prflStusCd);
		setValue(21, slsPrcAmt);
		setValue(22, taxAmt);
		setValue(23, pymtTyp);
		setValue(24, comsnAmt);
		setValue(25, comsnTyp);
		setValue(26, netToAvonFct);
		setValue(27, prcPointDescTxt);
		setValue(28, creatUserId);
		setValue(29, creatTs);
		setValue(30, lastUpdtUserId);
		setValue(31, lastUpdtTs);
		setValue(32, prmryOffrInd);
		setValue(33, impctCatgryId);
		setValue(34, pgOfsNr);
		setValue(35, featrdSideCd);
		setValue(36, cnsmrInvstmtBdgtId);
		setValue(37, offrPrflPrcptLinkId);
		setValue(38, slsPromtnInd);
		setValue(39, impctPrflCd);
		setValue(40, awrdSlsPrcAmt);
		setValue(41, chrtyAmt);
		setValue(42, chrtyOvrrdInd);
		setValue(43, taxTypeId);
		setValue(44, royltPct);
		setValue(45, royltOvrrdInd);
		setValue(46, unitCalcInd);
		setValue(47, demoDiscntId);
		setValue(48, frcMtchMthdId);
		setValue(49, prcLvlTypId);
		setValue(50, prcLvlTypCd);
		setValue(51, minPrcAmt);
		setValue(52, optPrcAmt);
		setValue(53, maxPrcAmt);
		setValue(54, plndPrcLvlTypId);
		setValue(55, plndPrcLvlTypCd);
		setValue(56, plndMinPrcAmt);
		setValue(57, plndOptPrcAmt);
		setValue(58, plndMaxPrcAmt);
		setValue(59, keyPrflInd);
		setValue(60, grailMinPrcAmt);
		setValue(61, grailMaxPrcAmt);
		setValue(62, plndPromtnId);
	}
}