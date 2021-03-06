/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Record2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.MrktPerd;


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
public class MrktPerdRecord extends UpdatableRecordImpl<MrktPerdRecord> {

	private static final long serialVersionUID = -86522503;

	/**
	 * Setter for <code>WETRN.MRKT_PERD.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.PERD_ID</code>.
	 */
	public void setPerdId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.PERD_ID</code>.
	 */
	public BigDecimal getPerdId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.YR_NR</code>.
	 */
	public void setYrNr(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.YR_NR</code>.
	 */
	public BigDecimal getYrNr() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.PERD_TYP</code>.
	 */
	public void setPerdTyp(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.PERD_TYP</code>.
	 */
	public String getPerdTyp() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.PERD_DESC_TXT</code>.
	 */
	public void setPerdDescTxt(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.PERD_DESC_TXT</code>.
	 */
	public String getPerdDescTxt() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.PERD_NR</code>.
	 */
	public void setPerdNr(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.PERD_NR</code>.
	 */
	public BigDecimal getPerdNr() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.PARNT_PERD_ID</code>.
	 */
	public void setParntPerdId(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.PARNT_PERD_ID</code>.
	 */
	public BigDecimal getParntPerdId() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.STRT_DT</code>.
	 */
	public void setStrtDt(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.STRT_DT</code>.
	 */
	public Date getStrtDt() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.END_DT</code>.
	 */
	public void setEndDt(Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.END_DT</code>.
	 */
	public Date getEndDt() {
		return (Date) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.REP_CNT</code>.
	 */
	public void setRepCnt(BigDecimal value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.REP_CNT</code>.
	 */
	public BigDecimal getRepCnt() {
		return (BigDecimal) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.ORD_CNT</code>.
	 */
	public void setOrdCnt(BigDecimal value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.ORD_CNT</code>.
	 */
	public BigDecimal getOrdCnt() {
		return (BigDecimal) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.COMSN_ADJSTMT_AMT</code>.
	 */
	public void setComsnAdjstmtAmt(BigDecimal value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.COMSN_ADJSTMT_AMT</code>.
	 */
	public BigDecimal getComsnAdjstmtAmt() {
		return (BigDecimal) getValue(15);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.TRND_OTHR_ADJSTMT_AMT</code>.
	 */
	public void setTrndOthrAdjstmtAmt(BigDecimal value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.TRND_OTHR_ADJSTMT_AMT</code>.
	 */
	public BigDecimal getTrndOthrAdjstmtAmt() {
		return (BigDecimal) getValue(16);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.SLS_AID_AMT</code>.
	 */
	public void setSlsAidAmt(BigDecimal value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.SLS_AID_AMT</code>.
	 */
	public BigDecimal getSlsAidAmt() {
		return (BigDecimal) getValue(17);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.SBSTTN_AMT</code>.
	 */
	public void setSbsttnAmt(BigDecimal value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.SBSTTN_AMT</code>.
	 */
	public BigDecimal getSbsttnAmt() {
		return (BigDecimal) getValue(18);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.TEL_SLS_AMT</code>.
	 */
	public void setTelSlsAmt(BigDecimal value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.TEL_SLS_AMT</code>.
	 */
	public BigDecimal getTelSlsAmt() {
		return (BigDecimal) getValue(19);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.CRNCY_CD</code>.
	 */
	public void setCrncyCd(String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.CRNCY_CD</code>.
	 */
	public String getCrncyCd() {
		return (String) getValue(20);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.TRND_SLS_TYP_ID</code>.
	 */
	public void setTrndSlsTypId(BigDecimal value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.TRND_SLS_TYP_ID</code>.
	 */
	public BigDecimal getTrndSlsTypId() {
		return (BigDecimal) getValue(21);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.GTA_MTHD_ID</code>.
	 */
	public void setGtaMthdId(BigDecimal value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.GTA_MTHD_ID</code>.
	 */
	public BigDecimal getGtaMthdId() {
		return (BigDecimal) getValue(22);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.EST_ON_DMND_IND</code>.
	 */
	public void setEstOnDmndInd(String value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.EST_ON_DMND_IND</code>.
	 */
	public String getEstOnDmndInd() {
		return (String) getValue(23);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.EST_ON_DMND_ID</code>.
	 */
	public void setEstOnDmndId(BigDecimal value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.EST_ON_DMND_ID</code>.
	 */
	public BigDecimal getEstOnDmndId() {
		return (BigDecimal) getValue(24);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.FRCST_BOOST_TRGT_SLS_AMT</code>. Forecast Boost target sales amount.  The target sales for this target market period.
	 */
	public void setFrcstBoostTrgtSlsAmt(BigDecimal value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.FRCST_BOOST_TRGT_SLS_AMT</code>. Forecast Boost target sales amount.  The target sales for this target market period.
	 */
	public BigDecimal getFrcstBoostTrgtSlsAmt() {
		return (BigDecimal) getValue(25);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.FRCST_BOOST_TRGT_ACTV_IND</code>. Forecast Boost target active indicator.  'Y' if Forecast Boost is currently active for this target market period.  Some edit offer functions will not be allowed while Forecast Boost is active.  Changed to 'N' when manual estimating is started.
	 */
	public void setFrcstBoostTrgtActvInd(String value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.FRCST_BOOST_TRGT_ACTV_IND</code>. Forecast Boost target active indicator.  'Y' if Forecast Boost is currently active for this target market period.  Some edit offer functions will not be allowed while Forecast Boost is active.  Changed to 'N' when manual estimating is started.
	 */
	public String getFrcstBoostTrgtActvInd() {
		return (String) getValue(26);
	}

	/**
	 * Setter for <code>WETRN.MRKT_PERD.SMT_MRKT_IND</code>.
	 */
	public void setSmtMrktInd(String value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>WETRN.MRKT_PERD.SMT_MRKT_IND</code>.
	 */
	public String getSmtMrktInd() {
		return (String) getValue(27);
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
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MrktPerdRecord
	 */
	public MrktPerdRecord() {
		super(MrktPerd.MRKT_PERD);
	}

	/**
	 * Create a detached, initialised MrktPerdRecord
	 */
	public MrktPerdRecord(BigDecimal mrktId, BigDecimal perdId, BigDecimal yrNr, String perdTyp, String perdDescTxt, BigDecimal perdNr, BigDecimal parntPerdId, Date strtDt, Date endDt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, BigDecimal repCnt, BigDecimal ordCnt, BigDecimal comsnAdjstmtAmt, BigDecimal trndOthrAdjstmtAmt, BigDecimal slsAidAmt, BigDecimal sbsttnAmt, BigDecimal telSlsAmt, String crncyCd, BigDecimal trndSlsTypId, BigDecimal gtaMthdId, String estOnDmndInd, BigDecimal estOnDmndId, BigDecimal frcstBoostTrgtSlsAmt, String frcstBoostTrgtActvInd, String smtMrktInd) {
		super(MrktPerd.MRKT_PERD);

		setValue(0, mrktId);
		setValue(1, perdId);
		setValue(2, yrNr);
		setValue(3, perdTyp);
		setValue(4, perdDescTxt);
		setValue(5, perdNr);
		setValue(6, parntPerdId);
		setValue(7, strtDt);
		setValue(8, endDt);
		setValue(9, creatUserId);
		setValue(10, creatTs);
		setValue(11, lastUpdtUserId);
		setValue(12, lastUpdtTs);
		setValue(13, repCnt);
		setValue(14, ordCnt);
		setValue(15, comsnAdjstmtAmt);
		setValue(16, trndOthrAdjstmtAmt);
		setValue(17, slsAidAmt);
		setValue(18, sbsttnAmt);
		setValue(19, telSlsAmt);
		setValue(20, crncyCd);
		setValue(21, trndSlsTypId);
		setValue(22, gtaMthdId);
		setValue(23, estOnDmndInd);
		setValue(24, estOnDmndId);
		setValue(25, frcstBoostTrgtSlsAmt);
		setValue(26, frcstBoostTrgtActvInd);
		setValue(27, smtMrktInd);
	}
}
