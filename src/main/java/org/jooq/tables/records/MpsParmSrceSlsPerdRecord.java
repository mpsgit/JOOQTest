/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.MpsParmSrceSlsPerd;


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
public class MpsParmSrceSlsPerdRecord extends UpdatableRecordImpl<MpsParmSrceSlsPerdRecord> implements Record8<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> {

	private static final long serialVersionUID = 1687755189;

	/**
	 * Setter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.MPS_PARM_ID</code>.
	 */
	public void setMpsParmId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.MPS_PARM_ID</code>.
	 */
	public BigDecimal getMpsParmId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.SLS_PERD_ID</code>.
	 */
	public void setSlsPerdId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.SLS_PERD_ID</code>.
	 */
	public BigDecimal getSlsPerdId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.SEQ_NR</code>.
	 */
	public void setSeqNr(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.SEQ_NR</code>.
	 */
	public BigDecimal getSeqNr() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_SRCE_SLS_PERD.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record3<BigDecimal, BigDecimal, BigDecimal> key() {
		return (Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MpsParmSrceSlsPerd.MPS_PARM_SRCE_SLS_PERD.MPS_PARM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MpsParmSrceSlsPerd.MPS_PARM_SRCE_SLS_PERD.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return MpsParmSrceSlsPerd.MPS_PARM_SRCE_SLS_PERD.SLS_PERD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return MpsParmSrceSlsPerd.MPS_PARM_SRCE_SLS_PERD.SEQ_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return MpsParmSrceSlsPerd.MPS_PARM_SRCE_SLS_PERD.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return MpsParmSrceSlsPerd.MPS_PARM_SRCE_SLS_PERD.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return MpsParmSrceSlsPerd.MPS_PARM_SRCE_SLS_PERD.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field8() {
		return MpsParmSrceSlsPerd.MPS_PARM_SRCE_SLS_PERD.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getMpsParmId();
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
	public BigDecimal value3() {
		return getSlsPerdId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getSeqNr();
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
	public MpsParmSrceSlsPerdRecord value1(BigDecimal value) {
		setMpsParmId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmSrceSlsPerdRecord value2(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmSrceSlsPerdRecord value3(BigDecimal value) {
		setSlsPerdId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmSrceSlsPerdRecord value4(BigDecimal value) {
		setSeqNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmSrceSlsPerdRecord value5(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmSrceSlsPerdRecord value6(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmSrceSlsPerdRecord value7(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmSrceSlsPerdRecord value8(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmSrceSlsPerdRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, String value5, Date value6, String value7, Date value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MpsParmSrceSlsPerdRecord
	 */
	public MpsParmSrceSlsPerdRecord() {
		super(MpsParmSrceSlsPerd.MPS_PARM_SRCE_SLS_PERD);
	}

	/**
	 * Create a detached, initialised MpsParmSrceSlsPerdRecord
	 */
	public MpsParmSrceSlsPerdRecord(BigDecimal mpsParmId, BigDecimal mrktId, BigDecimal slsPerdId, BigDecimal seqNr, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(MpsParmSrceSlsPerd.MPS_PARM_SRCE_SLS_PERD);

		setValue(0, mpsParmId);
		setValue(1, mrktId);
		setValue(2, slsPerdId);
		setValue(3, seqNr);
		setValue(4, creatUserId);
		setValue(5, creatTs);
		setValue(6, lastUpdtUserId);
		setValue(7, lastUpdtTs);
	}
}
