/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.Sku;


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
public class SkuRecord extends UpdatableRecordImpl<SkuRecord> implements Record13<BigDecimal, Integer, String, Short, String, BigDecimal, String, Date, String, Date, BigDecimal, String, BigDecimal> {

	private static final long serialVersionUID = 1147876827;

	/**
	 * Setter for <code>WETRN.SKU.SKU_ID</code>.
	 */
	public void setSkuId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.SKU.SKU_ID</code>.
	 */
	public BigDecimal getSkuId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.SKU.PRFL_CD</code>.
	 */
	public void setPrflCd(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.SKU.PRFL_CD</code>.
	 */
	public Integer getPrflCd() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.SKU.VARIANT_PMOL_CD</code>.
	 */
	public void setVariantPmolCd(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.SKU.VARIANT_PMOL_CD</code>.
	 */
	public String getVariantPmolCd() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.SKU.VARIANT_PMOL_SEQ_ID</code>.
	 */
	public void setVariantPmolSeqId(Short value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.SKU.VARIANT_PMOL_SEQ_ID</code>.
	 */
	public Short getVariantPmolSeqId() {
		return (Short) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.SKU.SKU_NM</code>.
	 */
	public void setSkuNm(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.SKU.SKU_NM</code>.
	 */
	public String getSkuNm() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.SKU.BRND_ID</code>.
	 */
	public void setBrndId(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.SKU.BRND_ID</code>.
	 */
	public BigDecimal getBrndId() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.SKU.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.SKU.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.SKU.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.SKU.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.SKU.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.SKU.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.SKU.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.SKU.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.SKU.PROD_LIFE_TYP_ID</code>.
	 */
	public void setProdLifeTypId(BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.SKU.PROD_LIFE_TYP_ID</code>.
	 */
	public BigDecimal getProdLifeTypId() {
		return (BigDecimal) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.SKU.DLTD_IND</code>.
	 */
	public void setDltdInd(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.SKU.DLTD_IND</code>.
	 */
	public String getDltdInd() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.SKU.DVLPD_SSNL_EVNT_ID</code>.
	 */
	public void setDvlpdSsnlEvntId(BigDecimal value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.SKU.DVLPD_SSNL_EVNT_ID</code>.
	 */
	public BigDecimal getDvlpdSsnlEvntId() {
		return (BigDecimal) getValue(12);
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
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<BigDecimal, Integer, String, Short, String, BigDecimal, String, Date, String, Date, BigDecimal, String, BigDecimal> fieldsRow() {
		return (Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<BigDecimal, Integer, String, Short, String, BigDecimal, String, Date, String, Date, BigDecimal, String, BigDecimal> valuesRow() {
		return (Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return Sku.SKU.SKU_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Sku.SKU.PRFL_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Sku.SKU.VARIANT_PMOL_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field4() {
		return Sku.SKU.VARIANT_PMOL_SEQ_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Sku.SKU.SKU_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return Sku.SKU.BRND_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Sku.SKU.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return Sku.SKU.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return Sku.SKU.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return Sku.SKU.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field11() {
		return Sku.SKU.PROD_LIFE_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return Sku.SKU.DLTD_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field13() {
		return Sku.SKU.DVLPD_SSNL_EVNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getSkuId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getPrflCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getVariantPmolCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value4() {
		return getVariantPmolSeqId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getSkuNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getBrndId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value8() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value10() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value11() {
		return getProdLifeTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getDltdInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value13() {
		return getDvlpdSsnlEvntId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuRecord value1(BigDecimal value) {
		setSkuId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuRecord value2(Integer value) {
		setPrflCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuRecord value3(String value) {
		setVariantPmolCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuRecord value4(Short value) {
		setVariantPmolSeqId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuRecord value5(String value) {
		setSkuNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuRecord value6(BigDecimal value) {
		setBrndId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuRecord value7(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuRecord value8(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuRecord value9(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuRecord value10(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuRecord value11(BigDecimal value) {
		setProdLifeTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuRecord value12(String value) {
		setDltdInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuRecord value13(BigDecimal value) {
		setDvlpdSsnlEvntId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SkuRecord values(BigDecimal value1, Integer value2, String value3, Short value4, String value5, BigDecimal value6, String value7, Date value8, String value9, Date value10, BigDecimal value11, String value12, BigDecimal value13) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SkuRecord
	 */
	public SkuRecord() {
		super(Sku.SKU);
	}

	/**
	 * Create a detached, initialised SkuRecord
	 */
	public SkuRecord(BigDecimal skuId, Integer prflCd, String variantPmolCd, Short variantPmolSeqId, String skuNm, BigDecimal brndId, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, BigDecimal prodLifeTypId, String dltdInd, BigDecimal dvlpdSsnlEvntId) {
		super(Sku.SKU);

		setValue(0, skuId);
		setValue(1, prflCd);
		setValue(2, variantPmolCd);
		setValue(3, variantPmolSeqId);
		setValue(4, skuNm);
		setValue(5, brndId);
		setValue(6, creatUserId);
		setValue(7, creatTs);
		setValue(8, lastUpdtUserId);
		setValue(9, lastUpdtTs);
		setValue(10, prodLifeTypId);
		setValue(11, dltdInd);
		setValue(12, dvlpdSsnlEvntId);
	}
}
