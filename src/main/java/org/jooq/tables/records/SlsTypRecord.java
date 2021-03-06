/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.SlsTyp;


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
public class SlsTypRecord extends UpdatableRecordImpl<SlsTypRecord> implements Record12<BigDecimal, String, String, String, String, Date, String, Date, BigDecimal, BigDecimal, String, String> {

	private static final long serialVersionUID = 293433042;

	/**
	 * Setter for <code>WETRN.SLS_TYP.SLS_TYP_ID</code>.
	 */
	public void setSlsTypId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_TYP.SLS_TYP_ID</code>.
	 */
	public BigDecimal getSlsTypId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.SLS_TYP.SLS_TYP_NM</code>.
	 */
	public void setSlsTypNm(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_TYP.SLS_TYP_NM</code>.
	 */
	public String getSlsTypNm() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.SLS_TYP.SLS_TYP_DESC_TXT</code>.
	 */
	public void setSlsTypDescTxt(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_TYP.SLS_TYP_DESC_TXT</code>.
	 */
	public String getSlsTypDescTxt() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.SLS_TYP.SLS_TYP_GRP_NM</code>.
	 */
	public void setSlsTypGrpNm(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_TYP.SLS_TYP_GRP_NM</code>.
	 */
	public String getSlsTypGrpNm() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.SLS_TYP.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_TYP.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.SLS_TYP.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_TYP.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.SLS_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.SLS_TYP.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_TYP.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.SLS_TYP.SEQ_NR</code>.
	 */
	public void setSeqNr(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_TYP.SEQ_NR</code>.
	 */
	public BigDecimal getSeqNr() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.SLS_TYP.SLS_TYP_GRP_ID</code>.
	 */
	public void setSlsTypGrpId(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_TYP.SLS_TYP_GRP_ID</code>.
	 */
	public BigDecimal getSlsTypGrpId() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.SLS_TYP.COST_TYP</code>.
	 */
	public void setCostTyp(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_TYP.COST_TYP</code>.
	 */
	public String getCostTyp() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.SLS_TYP.UNIT_SPLT_ENBLD_IND</code>.
	 */
	public void setUnitSpltEnbldInd(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.SLS_TYP.UNIT_SPLT_ENBLD_IND</code>.
	 */
	public String getUnitSpltEnbldInd() {
		return (String) getValue(11);
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
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<BigDecimal, String, String, String, String, Date, String, Date, BigDecimal, BigDecimal, String, String> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<BigDecimal, String, String, String, String, Date, String, Date, BigDecimal, BigDecimal, String, String> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return SlsTyp.SLS_TYP.SLS_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return SlsTyp.SLS_TYP.SLS_TYP_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return SlsTyp.SLS_TYP.SLS_TYP_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return SlsTyp.SLS_TYP.SLS_TYP_GRP_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return SlsTyp.SLS_TYP.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return SlsTyp.SLS_TYP.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return SlsTyp.SLS_TYP.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return SlsTyp.SLS_TYP.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return SlsTyp.SLS_TYP.SEQ_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field10() {
		return SlsTyp.SLS_TYP.SLS_TYP_GRP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return SlsTyp.SLS_TYP.COST_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return SlsTyp.SLS_TYP.UNIT_SPLT_ENBLD_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getSlsTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getSlsTypNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getSlsTypDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getSlsTypGrpNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value6() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value8() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value9() {
		return getSeqNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value10() {
		return getSlsTypGrpId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getCostTyp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getUnitSpltEnbldInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsTypRecord value1(BigDecimal value) {
		setSlsTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsTypRecord value2(String value) {
		setSlsTypNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsTypRecord value3(String value) {
		setSlsTypDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsTypRecord value4(String value) {
		setSlsTypGrpNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsTypRecord value5(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsTypRecord value6(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsTypRecord value7(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsTypRecord value8(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsTypRecord value9(BigDecimal value) {
		setSeqNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsTypRecord value10(BigDecimal value) {
		setSlsTypGrpId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsTypRecord value11(String value) {
		setCostTyp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsTypRecord value12(String value) {
		setUnitSpltEnbldInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsTypRecord values(BigDecimal value1, String value2, String value3, String value4, String value5, Date value6, String value7, Date value8, BigDecimal value9, BigDecimal value10, String value11, String value12) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SlsTypRecord
	 */
	public SlsTypRecord() {
		super(SlsTyp.SLS_TYP);
	}

	/**
	 * Create a detached, initialised SlsTypRecord
	 */
	public SlsTypRecord(BigDecimal slsTypId, String slsTypNm, String slsTypDescTxt, String slsTypGrpNm, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, BigDecimal seqNr, BigDecimal slsTypGrpId, String costTyp, String unitSpltEnbldInd) {
		super(SlsTyp.SLS_TYP);

		setValue(0, slsTypId);
		setValue(1, slsTypNm);
		setValue(2, slsTypDescTxt);
		setValue(3, slsTypGrpNm);
		setValue(4, creatUserId);
		setValue(5, creatTs);
		setValue(6, lastUpdtUserId);
		setValue(7, lastUpdtTs);
		setValue(8, seqNr);
		setValue(9, slsTypGrpId);
		setValue(10, costTyp);
		setValue(11, unitSpltEnbldInd);
	}
}
