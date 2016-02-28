/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.TFbJbRsltsJbTypId;


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
public class TFbJbRsltsJbTypIdRecord extends UDTRecordImpl<TFbJbRsltsJbTypIdRecord> implements Record1<BigDecimal> {

	private static final long serialVersionUID = -1598525836;

	/**
	 * Setter for <code>WETRN.T_FB_JB_RSLTS_JB_TYP_ID.JOB_TYP_ID</code>.
	 */
	public void setJobTypId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_JB_RSLTS_JB_TYP_ID.JOB_TYP_ID</code>.
	 */
	public BigDecimal getJobTypId() {
		return (BigDecimal) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<BigDecimal> fieldsRow() {
		return (Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<BigDecimal> valuesRow() {
		return (Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return TFbJbRsltsJbTypId.JOB_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getJobTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbJbRsltsJbTypIdRecord value1(BigDecimal value) {
		setJobTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbJbRsltsJbTypIdRecord values(BigDecimal value1) {
		value1(value1);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TFbJbRsltsJbTypIdRecord
	 */
	public TFbJbRsltsJbTypIdRecord() {
		super(TFbJbRsltsJbTypId.T_FB_JB_RSLTS_JB_TYP_ID);
	}

	/**
	 * Create a detached, initialised TFbJbRsltsJbTypIdRecord
	 */
	public TFbJbRsltsJbTypIdRecord(BigDecimal jobTypId) {
		super(TFbJbRsltsJbTypId.T_FB_JB_RSLTS_JB_TYP_ID);

		setValue(0, jobTypId);
	}
}