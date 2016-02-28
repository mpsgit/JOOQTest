/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.TSaAutoMatchLnm;


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
public class TSaAutoMatchLnmRecord extends UDTRecordImpl<TSaAutoMatchLnmRecord> implements Record6<TDlyBlngIdRecord, TblSaAutoMatchRecord, BigDecimal, BigDecimal, TSaAutoMatchRecord, TSaAutoMatchRecord> {

	private static final long serialVersionUID = 1107584956;

	/**
	 * Setter for <code>WETRN.T_SA_AUTO_MATCH_LNM.DLY_BILNG_REC</code>.
	 */
	public void setDlyBilngRec(TDlyBlngIdRecord value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.T_SA_AUTO_MATCH_LNM.DLY_BILNG_REC</code>.
	 */
	public TDlyBlngIdRecord getDlyBilngRec() {
		return (TDlyBlngIdRecord) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.T_SA_AUTO_MATCH_LNM.OSL_RECS</code>.
	 */
	public void setOslRecs(TblSaAutoMatchRecord value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.T_SA_AUTO_MATCH_LNM.OSL_RECS</code>.
	 */
	public TblSaAutoMatchRecord getOslRecs() {
		return (TblSaAutoMatchRecord) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.T_SA_AUTO_MATCH_LNM.MATCHED_DEMAND_RECS_NUM</code>.
	 */
	public void setMatchedDemandRecsNum(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.T_SA_AUTO_MATCH_LNM.MATCHED_DEMAND_RECS_NUM</code>.
	 */
	public BigDecimal getMatchedDemandRecsNum() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.T_SA_AUTO_MATCH_LNM.MATCHED_BILLED_RECS_NUM</code>.
	 */
	public void setMatchedBilledRecsNum(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.T_SA_AUTO_MATCH_LNM.MATCHED_BILLED_RECS_NUM</code>.
	 */
	public BigDecimal getMatchedBilledRecsNum() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.T_SA_AUTO_MATCH_LNM.OSL_DEMAND_MATCHED_REC</code>.
	 */
	public void setOslDemandMatchedRec(TSaAutoMatchRecord value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.T_SA_AUTO_MATCH_LNM.OSL_DEMAND_MATCHED_REC</code>.
	 */
	public TSaAutoMatchRecord getOslDemandMatchedRec() {
		return (TSaAutoMatchRecord) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.T_SA_AUTO_MATCH_LNM.OSL_BILLED_MATCHED_REC</code>.
	 */
	public void setOslBilledMatchedRec(TSaAutoMatchRecord value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.T_SA_AUTO_MATCH_LNM.OSL_BILLED_MATCHED_REC</code>.
	 */
	public TSaAutoMatchRecord getOslBilledMatchedRec() {
		return (TSaAutoMatchRecord) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<TDlyBlngIdRecord, TblSaAutoMatchRecord, BigDecimal, BigDecimal, TSaAutoMatchRecord, TSaAutoMatchRecord> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<TDlyBlngIdRecord, TblSaAutoMatchRecord, BigDecimal, BigDecimal, TSaAutoMatchRecord, TSaAutoMatchRecord> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<TDlyBlngIdRecord> field1() {
		return TSaAutoMatchLnm.DLY_BILNG_REC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<TblSaAutoMatchRecord> field2() {
		return TSaAutoMatchLnm.OSL_RECS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return TSaAutoMatchLnm.MATCHED_DEMAND_RECS_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return TSaAutoMatchLnm.MATCHED_BILLED_RECS_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<TSaAutoMatchRecord> field5() {
		return TSaAutoMatchLnm.OSL_DEMAND_MATCHED_REC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<TSaAutoMatchRecord> field6() {
		return TSaAutoMatchLnm.OSL_BILLED_MATCHED_REC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDlyBlngIdRecord value1() {
		return getDlyBilngRec();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblSaAutoMatchRecord value2() {
		return getOslRecs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getMatchedDemandRecsNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getMatchedBilledRecsNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSaAutoMatchRecord value5() {
		return getOslDemandMatchedRec();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSaAutoMatchRecord value6() {
		return getOslBilledMatchedRec();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSaAutoMatchLnmRecord value1(TDlyBlngIdRecord value) {
		setDlyBilngRec(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSaAutoMatchLnmRecord value2(TblSaAutoMatchRecord value) {
		setOslRecs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSaAutoMatchLnmRecord value3(BigDecimal value) {
		setMatchedDemandRecsNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSaAutoMatchLnmRecord value4(BigDecimal value) {
		setMatchedBilledRecsNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSaAutoMatchLnmRecord value5(TSaAutoMatchRecord value) {
		setOslDemandMatchedRec(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSaAutoMatchLnmRecord value6(TSaAutoMatchRecord value) {
		setOslBilledMatchedRec(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TSaAutoMatchLnmRecord values(TDlyBlngIdRecord value1, TblSaAutoMatchRecord value2, BigDecimal value3, BigDecimal value4, TSaAutoMatchRecord value5, TSaAutoMatchRecord value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TSaAutoMatchLnmRecord
	 */
	public TSaAutoMatchLnmRecord() {
		super(TSaAutoMatchLnm.T_SA_AUTO_MATCH_LNM);
	}

	/**
	 * Create a detached, initialised TSaAutoMatchLnmRecord
	 */
	public TSaAutoMatchLnmRecord(TDlyBlngIdRecord dlyBilngRec, TblSaAutoMatchRecord oslRecs, BigDecimal matchedDemandRecsNum, BigDecimal matchedBilledRecsNum, TSaAutoMatchRecord oslDemandMatchedRec, TSaAutoMatchRecord oslBilledMatchedRec) {
		super(TSaAutoMatchLnm.T_SA_AUTO_MATCH_LNM);

		setValue(0, dlyBilngRec);
		setValue(1, oslRecs);
		setValue(2, matchedDemandRecsNum);
		setValue(3, matchedBilledRecsNum);
		setValue(4, oslDemandMatchedRec);
		setValue(5, oslBilledMatchedRec);
	}
}
