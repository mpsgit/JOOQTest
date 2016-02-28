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
import org.jooq.udt.TFbJbRsltsMrktId;


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
public class TFbJbRsltsMrktIdRecord extends UDTRecordImpl<TFbJbRsltsMrktIdRecord> implements Record1<BigDecimal> {

	private static final long serialVersionUID = -1982160027;

	/**
	 * Setter for <code>WETRN.T_FB_JB_RSLTS_MRKT_ID.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_JB_RSLTS_MRKT_ID.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
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
		return TFbJbRsltsMrktId.MRKT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getMrktId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbJbRsltsMrktIdRecord value1(BigDecimal value) {
		setMrktId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbJbRsltsMrktIdRecord values(BigDecimal value1) {
		value1(value1);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TFbJbRsltsMrktIdRecord
	 */
	public TFbJbRsltsMrktIdRecord() {
		super(TFbJbRsltsMrktId.T_FB_JB_RSLTS_MRKT_ID);
	}

	/**
	 * Create a detached, initialised TFbJbRsltsMrktIdRecord
	 */
	public TFbJbRsltsMrktIdRecord(BigDecimal mrktId) {
		super(TFbJbRsltsMrktId.T_FB_JB_RSLTS_MRKT_ID);

		setValue(0, mrktId);
	}
}
