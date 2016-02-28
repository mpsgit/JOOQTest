/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.MpsParmReplctnMovMrkt;


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
public class MpsParmReplctnMovMrktRecord extends UpdatableRecordImpl<MpsParmReplctnMovMrktRecord> implements Record7<BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> {

	private static final long serialVersionUID = 240422834;

	/**
	 * Setter for <code>WETRN.MPS_PARM_REPLCTN_MOV_MRKT.MPS_PARM_ID</code>.
	 */
	public void setMpsParmId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_REPLCTN_MOV_MRKT.MPS_PARM_ID</code>.
	 */
	public BigDecimal getMpsParmId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MPS_PARM_REPLCTN_MOV_MRKT.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_REPLCTN_MOV_MRKT.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MPS_PARM_REPLCTN_MOV_MRKT.SEQ_NR</code>.
	 */
	public void setSeqNr(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_REPLCTN_MOV_MRKT.SEQ_NR</code>.
	 */
	public BigDecimal getSeqNr() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MPS_PARM_REPLCTN_MOV_MRKT.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_REPLCTN_MOV_MRKT.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MPS_PARM_REPLCTN_MOV_MRKT.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_REPLCTN_MOV_MRKT.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.MPS_PARM_REPLCTN_MOV_MRKT.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_REPLCTN_MOV_MRKT.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.MPS_PARM_REPLCTN_MOV_MRKT.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.MPS_PARM_REPLCTN_MOV_MRKT.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<BigDecimal, BigDecimal> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<BigDecimal, BigDecimal, BigDecimal, String, Date, String, Date> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return MpsParmReplctnMovMrkt.MPS_PARM_REPLCTN_MOV_MRKT.MPS_PARM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return MpsParmReplctnMovMrkt.MPS_PARM_REPLCTN_MOV_MRKT.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return MpsParmReplctnMovMrkt.MPS_PARM_REPLCTN_MOV_MRKT.SEQ_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return MpsParmReplctnMovMrkt.MPS_PARM_REPLCTN_MOV_MRKT.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return MpsParmReplctnMovMrkt.MPS_PARM_REPLCTN_MOV_MRKT.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return MpsParmReplctnMovMrkt.MPS_PARM_REPLCTN_MOV_MRKT.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return MpsParmReplctnMovMrkt.MPS_PARM_REPLCTN_MOV_MRKT.LAST_UPDT_TS;
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
		return getSeqNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value5() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value7() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmReplctnMovMrktRecord value1(BigDecimal value) {
		setMpsParmId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmReplctnMovMrktRecord value2(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmReplctnMovMrktRecord value3(BigDecimal value) {
		setSeqNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmReplctnMovMrktRecord value4(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmReplctnMovMrktRecord value5(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmReplctnMovMrktRecord value6(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmReplctnMovMrktRecord value7(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmReplctnMovMrktRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, String value4, Date value5, String value6, Date value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MpsParmReplctnMovMrktRecord
	 */
	public MpsParmReplctnMovMrktRecord() {
		super(MpsParmReplctnMovMrkt.MPS_PARM_REPLCTN_MOV_MRKT);
	}

	/**
	 * Create a detached, initialised MpsParmReplctnMovMrktRecord
	 */
	public MpsParmReplctnMovMrktRecord(BigDecimal mpsParmId, BigDecimal mrktId, BigDecimal seqNr, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(MpsParmReplctnMovMrkt.MPS_PARM_REPLCTN_MOV_MRKT);

		setValue(0, mpsParmId);
		setValue(1, mrktId);
		setValue(2, seqNr);
		setValue(3, creatUserId);
		setValue(4, creatTs);
		setValue(5, lastUpdtUserId);
		setValue(6, lastUpdtTs);
	}
}
