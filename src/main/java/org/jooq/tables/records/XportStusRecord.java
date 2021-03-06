/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.XportStus;


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
public class XportStusRecord extends UpdatableRecordImpl<XportStusRecord> implements Record17<BigDecimal, String, String, Date, String, Date, BigDecimal, String, BigDecimal, String, BigDecimal, String, String, String, String, String, BigDecimal> {

	private static final long serialVersionUID = 23396754;

	/**
	 * Setter for <code>WETRN.XPORT_STUS.XPORT_STUS_ID</code>.
	 */
	public void setXportStusId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.XPORT_STUS_ID</code>.
	 */
	public BigDecimal getXportStusId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.XPORT_STUS_DESC_TXT</code>.
	 */
	public void setXportStusDescTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.XPORT_STUS_DESC_TXT</code>.
	 */
	public String getXportStusDescTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.SEQ_NR</code>.
	 */
	public void setSeqNr(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.SEQ_NR</code>.
	 */
	public BigDecimal getSeqNr() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.ENBLD_IND</code>.
	 */
	public void setEnbldInd(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.ENBLD_IND</code>.
	 */
	public String getEnbldInd() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.CLSTR_ID</code>.
	 */
	public void setClstrId(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.CLSTR_ID</code>.
	 */
	public BigDecimal getClstrId() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.FNL_STUS_IND</code>.
	 */
	public void setFnlStusInd(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.FNL_STUS_IND</code>.
	 */
	public String getFnlStusInd() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.VER_TYP_ID</code>.
	 */
	public void setVerTypId(BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.VER_TYP_ID</code>.
	 */
	public BigDecimal getVerTypId() {
		return (BigDecimal) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.CMPGN_LVL_IND</code>.
	 */
	public void setCmpgnLvlInd(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.CMPGN_LVL_IND</code>.
	 */
	public String getCmpgnLvlInd() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.MANULY_SET_IND</code>.
	 */
	public void setManulySetInd(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.MANULY_SET_IND</code>.
	 */
	public String getManulySetInd() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.XPORT_STUS_SDESC_TXT</code>.
	 */
	public void setXportStusSdescTxt(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.XPORT_STUS_SDESC_TXT</code>.
	 */
	public String getXportStusSdescTxt() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.ON_DMND_ALWD_IND</code>.
	 */
	public void setOnDmndAlwdInd(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.ON_DMND_ALWD_IND</code>.
	 */
	public String getOnDmndAlwdInd() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.NRML_USER_AVLBLTY_IND</code>.
	 */
	public void setNrmlUserAvlbltyInd(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.NRML_USER_AVLBLTY_IND</code>.
	 */
	public String getNrmlUserAvlbltyInd() {
		return (String) getValue(15);
	}

	/**
	 * Setter for <code>WETRN.XPORT_STUS.XPORT_STUS_TYP_ID</code>.
	 */
	public void setXportStusTypId(BigDecimal value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>WETRN.XPORT_STUS.XPORT_STUS_TYP_ID</code>.
	 */
	public BigDecimal getXportStusTypId() {
		return (BigDecimal) getValue(16);
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
	// Record17 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row17<BigDecimal, String, String, Date, String, Date, BigDecimal, String, BigDecimal, String, BigDecimal, String, String, String, String, String, BigDecimal> fieldsRow() {
		return (Row17) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row17<BigDecimal, String, String, Date, String, Date, BigDecimal, String, BigDecimal, String, BigDecimal, String, String, String, String, String, BigDecimal> valuesRow() {
		return (Row17) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return XportStus.XPORT_STUS.XPORT_STUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return XportStus.XPORT_STUS.XPORT_STUS_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return XportStus.XPORT_STUS.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return XportStus.XPORT_STUS.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return XportStus.XPORT_STUS.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return XportStus.XPORT_STUS.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field7() {
		return XportStus.XPORT_STUS.SEQ_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return XportStus.XPORT_STUS.ENBLD_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return XportStus.XPORT_STUS.CLSTR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return XportStus.XPORT_STUS.FNL_STUS_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field11() {
		return XportStus.XPORT_STUS.VER_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return XportStus.XPORT_STUS.CMPGN_LVL_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return XportStus.XPORT_STUS.MANULY_SET_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field14() {
		return XportStus.XPORT_STUS.XPORT_STUS_SDESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field15() {
		return XportStus.XPORT_STUS.ON_DMND_ALWD_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field16() {
		return XportStus.XPORT_STUS.NRML_USER_AVLBLTY_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field17() {
		return XportStus.XPORT_STUS.XPORT_STUS_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getXportStusId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getXportStusDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value4() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value6() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value7() {
		return getSeqNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getEnbldInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value9() {
		return getClstrId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getFnlStusInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value11() {
		return getVerTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getCmpgnLvlInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getManulySetInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value14() {
		return getXportStusSdescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value15() {
		return getOnDmndAlwdInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value16() {
		return getNrmlUserAvlbltyInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value17() {
		return getXportStusTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value1(BigDecimal value) {
		setXportStusId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value2(String value) {
		setXportStusDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value3(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value4(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value5(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value6(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value7(BigDecimal value) {
		setSeqNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value8(String value) {
		setEnbldInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value9(BigDecimal value) {
		setClstrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value10(String value) {
		setFnlStusInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value11(BigDecimal value) {
		setVerTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value12(String value) {
		setCmpgnLvlInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value13(String value) {
		setManulySetInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value14(String value) {
		setXportStusSdescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value15(String value) {
		setOnDmndAlwdInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value16(String value) {
		setNrmlUserAvlbltyInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord value17(BigDecimal value) {
		setXportStusTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusRecord values(BigDecimal value1, String value2, String value3, Date value4, String value5, Date value6, BigDecimal value7, String value8, BigDecimal value9, String value10, BigDecimal value11, String value12, String value13, String value14, String value15, String value16, BigDecimal value17) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XportStusRecord
	 */
	public XportStusRecord() {
		super(XportStus.XPORT_STUS);
	}

	/**
	 * Create a detached, initialised XportStusRecord
	 */
	public XportStusRecord(BigDecimal xportStusId, String xportStusDescTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, BigDecimal seqNr, String enbldInd, BigDecimal clstrId, String fnlStusInd, BigDecimal verTypId, String cmpgnLvlInd, String manulySetInd, String xportStusSdescTxt, String onDmndAlwdInd, String nrmlUserAvlbltyInd, BigDecimal xportStusTypId) {
		super(XportStus.XPORT_STUS);

		setValue(0, xportStusId);
		setValue(1, xportStusDescTxt);
		setValue(2, creatUserId);
		setValue(3, creatTs);
		setValue(4, lastUpdtUserId);
		setValue(5, lastUpdtTs);
		setValue(6, seqNr);
		setValue(7, enbldInd);
		setValue(8, clstrId);
		setValue(9, fnlStusInd);
		setValue(10, verTypId);
		setValue(11, cmpgnLvlInd);
		setValue(12, manulySetInd);
		setValue(13, xportStusSdescTxt);
		setValue(14, onDmndAlwdInd);
		setValue(15, nrmlUserAvlbltyInd);
		setValue(16, xportStusTypId);
	}
}
