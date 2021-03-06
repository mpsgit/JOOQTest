/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.CubeConfig;


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
public class CubeConfigRecord extends TableRecordImpl<CubeConfigRecord> implements Record9<BigDecimal, BigDecimal, String, Date, String, Date, String, String, String> {

	private static final long serialVersionUID = 168896105;

	/**
	 * Setter for <code>WETRN.CUBE_CONFIG.CONFIG_ID</code>.
	 */
	public void setConfigId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.CUBE_CONFIG.CONFIG_ID</code>.
	 */
	public BigDecimal getConfigId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.CUBE_CONFIG.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.CUBE_CONFIG.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.CUBE_CONFIG.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.CUBE_CONFIG.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.CUBE_CONFIG.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.CUBE_CONFIG.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.CUBE_CONFIG.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.CUBE_CONFIG.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.CUBE_CONFIG.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.CUBE_CONFIG.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.CUBE_CONFIG.CAN_DSCNT_IND</code>.
	 */
	public void setCanDscntInd(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.CUBE_CONFIG.CAN_DSCNT_IND</code>.
	 */
	public String getCanDscntInd() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.CUBE_CONFIG.TRGT_CMPGN_TAG</code>.
	 */
	public void setTrgtCmpgnTag(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.CUBE_CONFIG.TRGT_CMPGN_TAG</code>.
	 */
	public String getTrgtCmpgnTag() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.CUBE_CONFIG.CMPLNC_STUS</code>.
	 */
	public void setCmplncStus(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.CUBE_CONFIG.CMPLNC_STUS</code>.
	 */
	public String getCmplncStus() {
		return (String) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, BigDecimal, String, Date, String, Date, String, String, String> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, BigDecimal, String, Date, String, Date, String, String, String> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return CubeConfig.CUBE_CONFIG.CONFIG_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return CubeConfig.CUBE_CONFIG.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return CubeConfig.CUBE_CONFIG.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return CubeConfig.CUBE_CONFIG.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return CubeConfig.CUBE_CONFIG.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return CubeConfig.CUBE_CONFIG.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return CubeConfig.CUBE_CONFIG.CAN_DSCNT_IND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return CubeConfig.CUBE_CONFIG.TRGT_CMPGN_TAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return CubeConfig.CUBE_CONFIG.CMPLNC_STUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getConfigId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getMrktId();
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
	public String value7() {
		return getCanDscntInd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getTrgtCmpgnTag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getCmplncStus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CubeConfigRecord value1(BigDecimal value) {
		setConfigId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CubeConfigRecord value2(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CubeConfigRecord value3(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CubeConfigRecord value4(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CubeConfigRecord value5(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CubeConfigRecord value6(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CubeConfigRecord value7(String value) {
		setCanDscntInd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CubeConfigRecord value8(String value) {
		setTrgtCmpgnTag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CubeConfigRecord value9(String value) {
		setCmplncStus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CubeConfigRecord values(BigDecimal value1, BigDecimal value2, String value3, Date value4, String value5, Date value6, String value7, String value8, String value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CubeConfigRecord
	 */
	public CubeConfigRecord() {
		super(CubeConfig.CUBE_CONFIG);
	}

	/**
	 * Create a detached, initialised CubeConfigRecord
	 */
	public CubeConfigRecord(BigDecimal configId, BigDecimal mrktId, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String canDscntInd, String trgtCmpgnTag, String cmplncStus) {
		super(CubeConfig.CUBE_CONFIG);

		setValue(0, configId);
		setValue(1, mrktId);
		setValue(2, creatUserId);
		setValue(3, creatTs);
		setValue(4, lastUpdtUserId);
		setValue(5, lastUpdtTs);
		setValue(6, canDscntInd);
		setValue(7, trgtCmpgnTag);
		setValue(8, cmplncStus);
	}
}
