/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.CncptlOffr;


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
public class CncptlOffrRecord extends UpdatableRecordImpl<CncptlOffrRecord> implements Record16<BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> {

	private static final long serialVersionUID = -810520340;

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.CNCPTL_OFFR_ID</code>.
	 */
	public void setCncptlOffrId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.CNCPTL_OFFR_ID</code>.
	 */
	public BigDecimal getCncptlOffrId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.CNCPTL_OFFR_DESC_TXT</code>.
	 */
	public void setCncptlOffrDescTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.CNCPTL_OFFR_DESC_TXT</code>.
	 */
	public String getCncptlOffrDescTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.VEH_ID</code>.
	 */
	public void setVehId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.VEH_ID</code>.
	 */
	public BigDecimal getVehId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.OFFR_PERD_ID</code>.
	 */
	public void setOffrPerdId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.OFFR_PERD_ID</code>.
	 */
	public BigDecimal getOffrPerdId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.PRFL_CD</code>.
	 */
	public void setPrflCd(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.PRFL_CD</code>.
	 */
	public Integer getPrflCd() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.SUPLR_ID</code>.
	 */
	public void setSuplrId(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.SUPLR_ID</code>.
	 */
	public BigDecimal getSuplrId() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.BRND_FMLY_ID</code>.
	 */
	public void setBrndFmlyId(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.BRND_FMLY_ID</code>.
	 */
	public BigDecimal getBrndFmlyId() {
		return (BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.BRND_ID</code>.
	 */
	public void setBrndId(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.BRND_ID</code>.
	 */
	public BigDecimal getBrndId() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.FORM_ID</code>.
	 */
	public void setFormId(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.FORM_ID</code>.
	 */
	public BigDecimal getFormId() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.FORM_GRP_ID</code>.
	 */
	public void setFormGrpId(BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.FORM_GRP_ID</code>.
	 */
	public BigDecimal getFormGrpId() {
		return (BigDecimal) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.SGMT_ID</code>.
	 */
	public void setSgmtId(BigDecimal value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.SGMT_ID</code>.
	 */
	public BigDecimal getSgmtId() {
		return (BigDecimal) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.CNCPTL_OFFR.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.CNCPTL_OFFR.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(15);
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
	// Record16 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> fieldsRow() {
		return (Row16) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> valuesRow() {
		return (Row16) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return CncptlOffr.CNCPTL_OFFR.CNCPTL_OFFR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return CncptlOffr.CNCPTL_OFFR.CNCPTL_OFFR_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return CncptlOffr.CNCPTL_OFFR.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return CncptlOffr.CNCPTL_OFFR.VEH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return CncptlOffr.CNCPTL_OFFR.OFFR_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return CncptlOffr.CNCPTL_OFFR.PRFL_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field7() {
		return CncptlOffr.CNCPTL_OFFR.SUPLR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field8() {
		return CncptlOffr.CNCPTL_OFFR.BRND_FMLY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return CncptlOffr.CNCPTL_OFFR.BRND_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field10() {
		return CncptlOffr.CNCPTL_OFFR.FORM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field11() {
		return CncptlOffr.CNCPTL_OFFR.FORM_GRP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field12() {
		return CncptlOffr.CNCPTL_OFFR.SGMT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return CncptlOffr.CNCPTL_OFFR.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field14() {
		return CncptlOffr.CNCPTL_OFFR.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field15() {
		return CncptlOffr.CNCPTL_OFFR.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field16() {
		return CncptlOffr.CNCPTL_OFFR.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getCncptlOffrId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getCncptlOffrDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getVehId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getOffrPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getPrflCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value7() {
		return getSuplrId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value8() {
		return getBrndFmlyId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value9() {
		return getBrndId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value10() {
		return getFormId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value11() {
		return getFormGrpId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value12() {
		return getSgmtId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value14() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value15() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value16() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value1(BigDecimal value) {
		setCncptlOffrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value2(String value) {
		setCncptlOffrDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value3(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value4(BigDecimal value) {
		setVehId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value5(BigDecimal value) {
		setOffrPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value6(Integer value) {
		setPrflCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value7(BigDecimal value) {
		setSuplrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value8(BigDecimal value) {
		setBrndFmlyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value9(BigDecimal value) {
		setBrndId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value10(BigDecimal value) {
		setFormId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value11(BigDecimal value) {
		setFormGrpId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value12(BigDecimal value) {
		setSgmtId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value13(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value14(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value15(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord value16(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CncptlOffrRecord values(BigDecimal value1, String value2, BigDecimal value3, BigDecimal value4, BigDecimal value5, Integer value6, BigDecimal value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, BigDecimal value11, BigDecimal value12, String value13, Date value14, String value15, Date value16) {
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
	 * Create a detached CncptlOffrRecord
	 */
	public CncptlOffrRecord() {
		super(CncptlOffr.CNCPTL_OFFR);
	}

	/**
	 * Create a detached, initialised CncptlOffrRecord
	 */
	public CncptlOffrRecord(BigDecimal cncptlOffrId, String cncptlOffrDescTxt, BigDecimal mrktId, BigDecimal vehId, BigDecimal offrPerdId, Integer prflCd, BigDecimal suplrId, BigDecimal brndFmlyId, BigDecimal brndId, BigDecimal formId, BigDecimal formGrpId, BigDecimal sgmtId, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(CncptlOffr.CNCPTL_OFFR);

		setValue(0, cncptlOffrId);
		setValue(1, cncptlOffrDescTxt);
		setValue(2, mrktId);
		setValue(3, vehId);
		setValue(4, offrPerdId);
		setValue(5, prflCd);
		setValue(6, suplrId);
		setValue(7, brndFmlyId);
		setValue(8, brndId);
		setValue(9, formId);
		setValue(10, formGrpId);
		setValue(11, sgmtId);
		setValue(12, creatUserId);
		setValue(13, creatTs);
		setValue(14, lastUpdtUserId);
		setValue(15, lastUpdtTs);
	}
}
