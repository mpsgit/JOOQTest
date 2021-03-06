/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Record5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.TrndCtgrySlsNew;


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
public class TrndCtgrySlsNewRecord extends UpdatableRecordImpl<TrndCtgrySlsNewRecord> {

	private static final long serialVersionUID = 651504351;

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.OFFST</code>.
	 */
	public void setOffst(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.OFFST</code>.
	 */
	public BigDecimal getOffst() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.SLS_PERD_ID</code>.
	 */
	public void setSlsPerdId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.SLS_PERD_ID</code>.
	 */
	public BigDecimal getSlsPerdId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.PRCSNG_DT</code>.
	 */
	public void setPrcsngDt(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.PRCSNG_DT</code>.
	 */
	public Date getPrcsngDt() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.DAY_NUM</code>.
	 */
	public void setDayNum(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.DAY_NUM</code>.
	 */
	public BigDecimal getDayNum() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.CATGRY_ID</code>.
	 */
	public void setCatgryId(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.CATGRY_ID</code>.
	 */
	public BigDecimal getCatgryId() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.BILLED_UNITS</code>.
	 */
	public void setBilledUnits(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.BILLED_UNITS</code>.
	 */
	public BigDecimal getBilledUnits() {
		return (BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.BILLED_SLS_AMT</code>.
	 */
	public void setBilledSlsAmt(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.BILLED_SLS_AMT</code>.
	 */
	public BigDecimal getBilledSlsAmt() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.BILLED_COMSN_AMT</code>.
	 */
	public void setBilledComsnAmt(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.BILLED_COMSN_AMT</code>.
	 */
	public BigDecimal getBilledComsnAmt() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.BILLED_TAX_AMT</code>.
	 */
	public void setBilledTaxAmt(BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.BILLED_TAX_AMT</code>.
	 */
	public BigDecimal getBilledTaxAmt() {
		return (BigDecimal) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.DEMAND_UNITS</code>.
	 */
	public void setDemandUnits(BigDecimal value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.DEMAND_UNITS</code>.
	 */
	public BigDecimal getDemandUnits() {
		return (BigDecimal) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.DEMAND_SLS_AMT</code>.
	 */
	public void setDemandSlsAmt(BigDecimal value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.DEMAND_SLS_AMT</code>.
	 */
	public BigDecimal getDemandSlsAmt() {
		return (BigDecimal) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.DEMAND_COMSN_AMT</code>.
	 */
	public void setDemandComsnAmt(BigDecimal value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.DEMAND_COMSN_AMT</code>.
	 */
	public BigDecimal getDemandComsnAmt() {
		return (BigDecimal) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.DEMAND_TAX_AMT</code>.
	 */
	public void setDemandTaxAmt(BigDecimal value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.DEMAND_TAX_AMT</code>.
	 */
	public BigDecimal getDemandTaxAmt() {
		return (BigDecimal) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_BILLED_UNITS</code>.
	 */
	public void setBi24BilledUnits(BigDecimal value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_BILLED_UNITS</code>.
	 */
	public BigDecimal getBi24BilledUnits() {
		return (BigDecimal) getValue(15);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_BILLED_SLS_AMT</code>.
	 */
	public void setBi24BilledSlsAmt(BigDecimal value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_BILLED_SLS_AMT</code>.
	 */
	public BigDecimal getBi24BilledSlsAmt() {
		return (BigDecimal) getValue(16);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_BILLED_COMSN_AMT</code>.
	 */
	public void setBi24BilledComsnAmt(BigDecimal value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_BILLED_COMSN_AMT</code>.
	 */
	public BigDecimal getBi24BilledComsnAmt() {
		return (BigDecimal) getValue(17);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_BILLED_TAX_AMT</code>.
	 */
	public void setBi24BilledTaxAmt(BigDecimal value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_BILLED_TAX_AMT</code>.
	 */
	public BigDecimal getBi24BilledTaxAmt() {
		return (BigDecimal) getValue(18);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_DEMAND_UNITS</code>.
	 */
	public void setBi24DemandUnits(BigDecimal value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_DEMAND_UNITS</code>.
	 */
	public BigDecimal getBi24DemandUnits() {
		return (BigDecimal) getValue(19);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_DEMAND_SLS_AMT</code>.
	 */
	public void setBi24DemandSlsAmt(BigDecimal value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_DEMAND_SLS_AMT</code>.
	 */
	public BigDecimal getBi24DemandSlsAmt() {
		return (BigDecimal) getValue(20);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_DEMAND_COMSN_AMT</code>.
	 */
	public void setBi24DemandComsnAmt(BigDecimal value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_DEMAND_COMSN_AMT</code>.
	 */
	public BigDecimal getBi24DemandComsnAmt() {
		return (BigDecimal) getValue(21);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_DEMAND_TAX_AMT</code>.
	 */
	public void setBi24DemandTaxAmt(BigDecimal value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.BI24_DEMAND_TAX_AMT</code>.
	 */
	public BigDecimal getBi24DemandTaxAmt() {
		return (BigDecimal) getValue(22);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(23);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(24);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(25);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(26);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.TREND_UNITS</code>.
	 */
	public void setTrendUnits(BigDecimal value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.TREND_UNITS</code>.
	 */
	public BigDecimal getTrendUnits() {
		return (BigDecimal) getValue(27);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.TREND_SLS_AMT</code>.
	 */
	public void setTrendSlsAmt(BigDecimal value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.TREND_SLS_AMT</code>.
	 */
	public BigDecimal getTrendSlsAmt() {
		return (BigDecimal) getValue(28);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.TREND_COMSN_AMT</code>.
	 */
	public void setTrendComsnAmt(BigDecimal value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.TREND_COMSN_AMT</code>.
	 */
	public BigDecimal getTrendComsnAmt() {
		return (BigDecimal) getValue(29);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.TREND_TAX_AMT</code>.
	 */
	public void setTrendTaxAmt(BigDecimal value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.TREND_TAX_AMT</code>.
	 */
	public BigDecimal getTrendTaxAmt() {
		return (BigDecimal) getValue(30);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.EARLY_TREND_UNITS</code>.
	 */
	public void setEarlyTrendUnits(BigDecimal value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.EARLY_TREND_UNITS</code>.
	 */
	public BigDecimal getEarlyTrendUnits() {
		return (BigDecimal) getValue(31);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.EARLY_TREND_SLS_AMT</code>.
	 */
	public void setEarlyTrendSlsAmt(BigDecimal value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.EARLY_TREND_SLS_AMT</code>.
	 */
	public BigDecimal getEarlyTrendSlsAmt() {
		return (BigDecimal) getValue(32);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.EARLY_TREND_COMSN_AMT</code>.
	 */
	public void setEarlyTrendComsnAmt(BigDecimal value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.EARLY_TREND_COMSN_AMT</code>.
	 */
	public BigDecimal getEarlyTrendComsnAmt() {
		return (BigDecimal) getValue(33);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.EARLY_TREND_TAX_AMT</code>.
	 */
	public void setEarlyTrendTaxAmt(BigDecimal value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.EARLY_TREND_TAX_AMT</code>.
	 */
	public BigDecimal getEarlyTrendTaxAmt() {
		return (BigDecimal) getValue(34);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.FINAL_TREND_UNITS</code>.
	 */
	public void setFinalTrendUnits(BigDecimal value) {
		setValue(35, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.FINAL_TREND_UNITS</code>.
	 */
	public BigDecimal getFinalTrendUnits() {
		return (BigDecimal) getValue(35);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.FINAL_TREND_SLS_AMT</code>.
	 */
	public void setFinalTrendSlsAmt(BigDecimal value) {
		setValue(36, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.FINAL_TREND_SLS_AMT</code>.
	 */
	public BigDecimal getFinalTrendSlsAmt() {
		return (BigDecimal) getValue(36);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.FINAL_TREND_COMSN_AMT</code>.
	 */
	public void setFinalTrendComsnAmt(BigDecimal value) {
		setValue(37, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.FINAL_TREND_COMSN_AMT</code>.
	 */
	public BigDecimal getFinalTrendComsnAmt() {
		return (BigDecimal) getValue(37);
	}

	/**
	 * Setter for <code>WETRN.TRND_CTGRY_SLS_NEW.FINAL_TREND_TAX_AMT</code>.
	 */
	public void setFinalTrendTaxAmt(BigDecimal value) {
		setValue(38, value);
	}

	/**
	 * Getter for <code>WETRN.TRND_CTGRY_SLS_NEW.FINAL_TREND_TAX_AMT</code>.
	 */
	public BigDecimal getFinalTrendTaxAmt() {
		return (BigDecimal) getValue(38);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record5<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> key() {
		return (Record5) super.key();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TrndCtgrySlsNewRecord
	 */
	public TrndCtgrySlsNewRecord() {
		super(TrndCtgrySlsNew.TRND_CTGRY_SLS_NEW);
	}

	/**
	 * Create a detached, initialised TrndCtgrySlsNewRecord
	 */
	public TrndCtgrySlsNewRecord(BigDecimal mrktId, BigDecimal offst, BigDecimal offrPerdId, BigDecimal slsPerdId, Date prcsngDt, BigDecimal dayNum, BigDecimal catgryId, BigDecimal billedUnits, BigDecimal billedSlsAmt, BigDecimal billedComsnAmt, BigDecimal billedTaxAmt, BigDecimal demandUnits, BigDecimal demandSlsAmt, BigDecimal demandComsnAmt, BigDecimal demandTaxAmt, BigDecimal bi24BilledUnits, BigDecimal bi24BilledSlsAmt, BigDecimal bi24BilledComsnAmt, BigDecimal bi24BilledTaxAmt, BigDecimal bi24DemandUnits, BigDecimal bi24DemandSlsAmt, BigDecimal bi24DemandComsnAmt, BigDecimal bi24DemandTaxAmt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, BigDecimal trendUnits, BigDecimal trendSlsAmt, BigDecimal trendComsnAmt, BigDecimal trendTaxAmt, BigDecimal earlyTrendUnits, BigDecimal earlyTrendSlsAmt, BigDecimal earlyTrendComsnAmt, BigDecimal earlyTrendTaxAmt, BigDecimal finalTrendUnits, BigDecimal finalTrendSlsAmt, BigDecimal finalTrendComsnAmt, BigDecimal finalTrendTaxAmt) {
		super(TrndCtgrySlsNew.TRND_CTGRY_SLS_NEW);

		setValue(0, mrktId);
		setValue(1, offst);
		setValue(2, offrPerdId);
		setValue(3, slsPerdId);
		setValue(4, prcsngDt);
		setValue(5, dayNum);
		setValue(6, catgryId);
		setValue(7, billedUnits);
		setValue(8, billedSlsAmt);
		setValue(9, billedComsnAmt);
		setValue(10, billedTaxAmt);
		setValue(11, demandUnits);
		setValue(12, demandSlsAmt);
		setValue(13, demandComsnAmt);
		setValue(14, demandTaxAmt);
		setValue(15, bi24BilledUnits);
		setValue(16, bi24BilledSlsAmt);
		setValue(17, bi24BilledComsnAmt);
		setValue(18, bi24BilledTaxAmt);
		setValue(19, bi24DemandUnits);
		setValue(20, bi24DemandSlsAmt);
		setValue(21, bi24DemandComsnAmt);
		setValue(22, bi24DemandTaxAmt);
		setValue(23, creatUserId);
		setValue(24, creatTs);
		setValue(25, lastUpdtUserId);
		setValue(26, lastUpdtTs);
		setValue(27, trendUnits);
		setValue(28, trendSlsAmt);
		setValue(29, trendComsnAmt);
		setValue(30, trendTaxAmt);
		setValue(31, earlyTrendUnits);
		setValue(32, earlyTrendSlsAmt);
		setValue(33, earlyTrendComsnAmt);
		setValue(34, earlyTrendTaxAmt);
		setValue(35, finalTrendUnits);
		setValue(36, finalTrendSlsAmt);
		setValue(37, finalTrendComsnAmt);
		setValue(38, finalTrendTaxAmt);
	}
}
