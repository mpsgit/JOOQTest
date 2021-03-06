/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Record3;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.OdsMrktFscCost;


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
public class OdsMrktFscCostRecord extends UpdatableRecordImpl<OdsMrktFscCostRecord> implements Record10<BigDecimal, String, String, Date, Byte, BigDecimal, String, String, Date, Date> {

	private static final long serialVersionUID = 823362163;

	/**
	 * Setter for <code>WETRN.ODS_MRKT_FSC_COST.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.ODS_MRKT_FSC_COST.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.ODS_MRKT_FSC_COST.FSC_CD</code>.
	 */
	public void setFscCd(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.ODS_MRKT_FSC_COST.FSC_CD</code>.
	 */
	public String getFscCd() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.ODS_MRKT_FSC_COST.COST_TYP_ID</code>.
	 */
	public void setCostTypId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.ODS_MRKT_FSC_COST.COST_TYP_ID</code>.
	 */
	public String getCostTypId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.ODS_MRKT_FSC_COST.EFF_DT</code>.
	 */
	public void setEffDt(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.ODS_MRKT_FSC_COST.EFF_DT</code>.
	 */
	public Date getEffDt() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.ODS_MRKT_FSC_COST.COST_TYP_STUS_ID</code>.
	 */
	public void setCostTypStusId(Byte value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.ODS_MRKT_FSC_COST.COST_TYP_STUS_ID</code>.
	 */
	public Byte getCostTypStusId() {
		return (Byte) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.ODS_MRKT_FSC_COST.COST_AMT</code>.
	 */
	public void setCostAmt(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.ODS_MRKT_FSC_COST.COST_AMT</code>.
	 */
	public BigDecimal getCostAmt() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.ODS_MRKT_FSC_COST.CRNCY_CD</code>.
	 */
	public void setCrncyCd(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.ODS_MRKT_FSC_COST.CRNCY_CD</code>.
	 */
	public String getCrncyCd() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.ODS_MRKT_FSC_COST.COST_STUS_CD</code>.
	 */
	public void setCostStusCd(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.ODS_MRKT_FSC_COST.COST_STUS_CD</code>.
	 */
	public String getCostStusCd() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.ODS_MRKT_FSC_COST.INTRFC_TS</code>.
	 */
	public void setIntrfcTs(Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.ODS_MRKT_FSC_COST.INTRFC_TS</code>.
	 */
	public Date getIntrfcTs() {
		return (Date) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.ODS_MRKT_FSC_COST.PRCSD_TS</code>.
	 */
	public void setPrcsdTs(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.ODS_MRKT_FSC_COST.PRCSD_TS</code>.
	 */
	public Date getPrcsdTs() {
		return (Date) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record3<BigDecimal, String, String> key() {
		return (Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<BigDecimal, String, String, Date, Byte, BigDecimal, String, String, Date, Date> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<BigDecimal, String, String, Date, Byte, BigDecimal, String, String, Date, Date> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return OdsMrktFscCost.ODS_MRKT_FSC_COST.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return OdsMrktFscCost.ODS_MRKT_FSC_COST.FSC_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return OdsMrktFscCost.ODS_MRKT_FSC_COST.COST_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return OdsMrktFscCost.ODS_MRKT_FSC_COST.EFF_DT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field5() {
		return OdsMrktFscCost.ODS_MRKT_FSC_COST.COST_TYP_STUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return OdsMrktFscCost.ODS_MRKT_FSC_COST.COST_AMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return OdsMrktFscCost.ODS_MRKT_FSC_COST.CRNCY_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return OdsMrktFscCost.ODS_MRKT_FSC_COST.COST_STUS_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field9() {
		return OdsMrktFscCost.ODS_MRKT_FSC_COST.INTRFC_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return OdsMrktFscCost.ODS_MRKT_FSC_COST.PRCSD_TS;
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
		return getFscCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getCostTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value4() {
		return getEffDt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value5() {
		return getCostTypStusId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getCostAmt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getCrncyCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getCostStusCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value9() {
		return getIntrfcTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value10() {
		return getPrcsdTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OdsMrktFscCostRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OdsMrktFscCostRecord value2(String value) {
		setFscCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OdsMrktFscCostRecord value3(String value) {
		setCostTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OdsMrktFscCostRecord value4(Date value) {
		setEffDt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OdsMrktFscCostRecord value5(Byte value) {
		setCostTypStusId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OdsMrktFscCostRecord value6(BigDecimal value) {
		setCostAmt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OdsMrktFscCostRecord value7(String value) {
		setCrncyCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OdsMrktFscCostRecord value8(String value) {
		setCostStusCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OdsMrktFscCostRecord value9(Date value) {
		setIntrfcTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OdsMrktFscCostRecord value10(Date value) {
		setPrcsdTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OdsMrktFscCostRecord values(BigDecimal value1, String value2, String value3, Date value4, Byte value5, BigDecimal value6, String value7, String value8, Date value9, Date value10) {
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
	 * Create a detached OdsMrktFscCostRecord
	 */
	public OdsMrktFscCostRecord() {
		super(OdsMrktFscCost.ODS_MRKT_FSC_COST);
	}

	/**
	 * Create a detached, initialised OdsMrktFscCostRecord
	 */
	public OdsMrktFscCostRecord(BigDecimal mrktId, String fscCd, String costTypId, Date effDt, Byte costTypStusId, BigDecimal costAmt, String crncyCd, String costStusCd, Date intrfcTs, Date prcsdTs) {
		super(OdsMrktFscCost.ODS_MRKT_FSC_COST);

		setValue(0, mrktId);
		setValue(1, fscCd);
		setValue(2, costTypId);
		setValue(3, effDt);
		setValue(4, costTypStusId);
		setValue(5, costAmt);
		setValue(6, crncyCd);
		setValue(7, costStusCd);
		setValue(8, intrfcTs);
		setValue(9, prcsdTs);
	}
}
