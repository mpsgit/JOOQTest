/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.OffrTran;


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
public class OffrTranRecord extends UpdatableRecordImpl<OffrTranRecord> implements Record10<BigDecimal, BigDecimal, BigDecimal, Integer, String, BigDecimal, String, Date, String, Date> {

	private static final long serialVersionUID = -2080448177;

	/**
	 * Setter for <code>WETRN.OFFR_TRAN.OFFR_TRAN_ID</code>.
	 */
	public void setOffrTranId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_TRAN.OFFR_TRAN_ID</code>.
	 */
	public BigDecimal getOffrTranId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.OFFR_TRAN.TRAN_TYP_ID</code>.
	 */
	public void setTranTypId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_TRAN.TRAN_TYP_ID</code>.
	 */
	public BigDecimal getTranTypId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.OFFR_TRAN.OFFR_ID</code>.
	 */
	public void setOffrId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_TRAN.OFFR_ID</code>.
	 */
	public BigDecimal getOffrId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.OFFR_TRAN.PRFL_CD</code>.
	 */
	public void setPrflCd(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_TRAN.PRFL_CD</code>.
	 */
	public Integer getPrflCd() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.OFFR_TRAN.SLS_CLS_CD</code>.
	 */
	public void setSlsClsCd(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_TRAN.SLS_CLS_CD</code>.
	 */
	public String getSlsClsCd() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.OFFR_TRAN.SKU_ID</code>.
	 */
	public void setSkuId(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_TRAN.SKU_ID</code>.
	 */
	public BigDecimal getSkuId() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.OFFR_TRAN.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_TRAN.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.OFFR_TRAN.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_TRAN.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.OFFR_TRAN.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_TRAN.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.OFFR_TRAN.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.OFFR_TRAN.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(9);
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
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<BigDecimal, BigDecimal, BigDecimal, Integer, String, BigDecimal, String, Date, String, Date> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<BigDecimal, BigDecimal, BigDecimal, Integer, String, BigDecimal, String, Date, String, Date> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return OffrTran.OFFR_TRAN.OFFR_TRAN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return OffrTran.OFFR_TRAN.TRAN_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return OffrTran.OFFR_TRAN.OFFR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return OffrTran.OFFR_TRAN.PRFL_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return OffrTran.OFFR_TRAN.SLS_CLS_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return OffrTran.OFFR_TRAN.SKU_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return OffrTran.OFFR_TRAN.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return OffrTran.OFFR_TRAN.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return OffrTran.OFFR_TRAN.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return OffrTran.OFFR_TRAN.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getOffrTranId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getTranTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getOffrId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getPrflCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getSlsClsCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getSkuId();
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
	public OffrTranRecord value1(BigDecimal value) {
		setOffrTranId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrTranRecord value2(BigDecimal value) {
		setTranTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrTranRecord value3(BigDecimal value) {
		setOffrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrTranRecord value4(Integer value) {
		setPrflCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrTranRecord value5(String value) {
		setSlsClsCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrTranRecord value6(BigDecimal value) {
		setSkuId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrTranRecord value7(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrTranRecord value8(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrTranRecord value9(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrTranRecord value10(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrTranRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, Integer value4, String value5, BigDecimal value6, String value7, Date value8, String value9, Date value10) {
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
	 * Create a detached OffrTranRecord
	 */
	public OffrTranRecord() {
		super(OffrTran.OFFR_TRAN);
	}

	/**
	 * Create a detached, initialised OffrTranRecord
	 */
	public OffrTranRecord(BigDecimal offrTranId, BigDecimal tranTypId, BigDecimal offrId, Integer prflCd, String slsClsCd, BigDecimal skuId, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(OffrTran.OFFR_TRAN);

		setValue(0, offrTranId);
		setValue(1, tranTypId);
		setValue(2, offrId);
		setValue(3, prflCd);
		setValue(4, slsClsCd);
		setValue(5, skuId);
		setValue(6, creatUserId);
		setValue(7, creatTs);
		setValue(8, lastUpdtUserId);
		setValue(9, lastUpdtTs);
	}
}