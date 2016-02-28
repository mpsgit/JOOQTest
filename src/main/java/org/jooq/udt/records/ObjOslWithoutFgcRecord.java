/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.ObjOslWithoutFgc;


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
public class ObjOslWithoutFgcRecord extends UDTRecordImpl<ObjOslWithoutFgcRecord> implements Record5<String, BigDecimal, String, BigDecimal, String> {

	private static final long serialVersionUID = 1954911015;

	/**
	 * Setter for <code>WETRN.OBJ_OSL_WITHOUT_FGC.MRKT_NM</code>.
	 */
	public void setMrktNm(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.OBJ_OSL_WITHOUT_FGC.MRKT_NM</code>.
	 */
	public String getMrktNm() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.OBJ_OSL_WITHOUT_FGC.PRFL_CD</code>.
	 */
	public void setPrflCd(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.OBJ_OSL_WITHOUT_FGC.PRFL_CD</code>.
	 */
	public BigDecimal getPrflCd() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.OBJ_OSL_WITHOUT_FGC.LCL_SKU_NM</code>.
	 */
	public void setLclSkuNm(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.OBJ_OSL_WITHOUT_FGC.LCL_SKU_NM</code>.
	 */
	public String getLclSkuNm() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.OBJ_OSL_WITHOUT_FGC.SKU_ID</code>.
	 */
	public void setSkuId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.OBJ_OSL_WITHOUT_FGC.SKU_ID</code>.
	 */
	public BigDecimal getSkuId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.OBJ_OSL_WITHOUT_FGC.LCL_VEH_DESC_TXT</code>.
	 */
	public void setLclVehDescTxt(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.OBJ_OSL_WITHOUT_FGC.LCL_VEH_DESC_TXT</code>.
	 */
	public String getLclVehDescTxt() {
		return (String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, BigDecimal, String, BigDecimal, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, BigDecimal, String, BigDecimal, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return ObjOslWithoutFgc.MRKT_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return ObjOslWithoutFgc.PRFL_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return ObjOslWithoutFgc.LCL_SKU_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return ObjOslWithoutFgc.SKU_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return ObjOslWithoutFgc.LCL_VEH_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getMrktNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getPrflCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getLclSkuNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getSkuId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getLclVehDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjOslWithoutFgcRecord value1(String value) {
		setMrktNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjOslWithoutFgcRecord value2(BigDecimal value) {
		setPrflCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjOslWithoutFgcRecord value3(String value) {
		setLclSkuNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjOslWithoutFgcRecord value4(BigDecimal value) {
		setSkuId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjOslWithoutFgcRecord value5(String value) {
		setLclVehDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjOslWithoutFgcRecord values(String value1, BigDecimal value2, String value3, BigDecimal value4, String value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ObjOslWithoutFgcRecord
	 */
	public ObjOslWithoutFgcRecord() {
		super(ObjOslWithoutFgc.OBJ_OSL_WITHOUT_FGC);
	}

	/**
	 * Create a detached, initialised ObjOslWithoutFgcRecord
	 */
	public ObjOslWithoutFgcRecord(String mrktNm, BigDecimal prflCd, String lclSkuNm, BigDecimal skuId, String lclVehDescTxt) {
		super(ObjOslWithoutFgc.OBJ_OSL_WITHOUT_FGC);

		setValue(0, mrktNm);
		setValue(1, prflCd);
		setValue(2, lclSkuNm);
		setValue(3, skuId);
		setValue(4, lclVehDescTxt);
	}
}