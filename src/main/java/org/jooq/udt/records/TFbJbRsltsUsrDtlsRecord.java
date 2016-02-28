/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.TFbJbRsltsUsrDtls;


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
public class TFbJbRsltsUsrDtlsRecord extends UDTRecordImpl<TFbJbRsltsUsrDtlsRecord> implements Record2<String, String> {

	private static final long serialVersionUID = 2137668177;

	/**
	 * Setter for <code>WETRN.T_FB_JB_RSLTS_USR_DTLS.USER_ID</code>.
	 */
	public void setUserId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_JB_RSLTS_USR_DTLS.USER_ID</code>.
	 */
	public String getUserId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.T_FB_JB_RSLTS_USR_DTLS.USER_FRST_LST_NM</code>.
	 */
	public void setUserFrstLstNm(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.T_FB_JB_RSLTS_USR_DTLS.USER_FRST_LST_NM</code>.
	 */
	public String getUserFrstLstNm() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return TFbJbRsltsUsrDtls.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TFbJbRsltsUsrDtls.USER_FRST_LST_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getUserFrstLstNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbJbRsltsUsrDtlsRecord value1(String value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbJbRsltsUsrDtlsRecord value2(String value) {
		setUserFrstLstNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TFbJbRsltsUsrDtlsRecord values(String value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TFbJbRsltsUsrDtlsRecord
	 */
	public TFbJbRsltsUsrDtlsRecord() {
		super(TFbJbRsltsUsrDtls.T_FB_JB_RSLTS_USR_DTLS);
	}

	/**
	 * Create a detached, initialised TFbJbRsltsUsrDtlsRecord
	 */
	public TFbJbRsltsUsrDtlsRecord(String userId, String userFrstLstNm) {
		super(TFbJbRsltsUsrDtls.T_FB_JB_RSLTS_USR_DTLS);

		setValue(0, userId);
		setValue(1, userFrstLstNm);
	}
}