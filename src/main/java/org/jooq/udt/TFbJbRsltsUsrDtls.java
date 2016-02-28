/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TFbJbRsltsUsrDtlsRecord;


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
public class TFbJbRsltsUsrDtls extends UDTImpl<TFbJbRsltsUsrDtlsRecord> {

	private static final long serialVersionUID = 893443015;

	/**
	 * The reference instance of <code>WETRN.T_FB_JB_RSLTS_USR_DTLS</code>
	 */
	public static final TFbJbRsltsUsrDtls T_FB_JB_RSLTS_USR_DTLS = new TFbJbRsltsUsrDtls();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TFbJbRsltsUsrDtlsRecord> getRecordType() {
		return TFbJbRsltsUsrDtlsRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_FB_JB_RSLTS_USR_DTLS.USER_ID</code>.
	 */
	public static final UDTField<TFbJbRsltsUsrDtlsRecord, String> USER_ID = createField("USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_FB_JB_RSLTS_USR_DTLS, "");

	/**
	 * The attribute <code>WETRN.T_FB_JB_RSLTS_USR_DTLS.USER_FRST_LST_NM</code>.
	 */
	public static final UDTField<TFbJbRsltsUsrDtlsRecord, String> USER_FRST_LST_NM = createField("USER_FRST_LST_NM", org.jooq.impl.SQLDataType.VARCHAR.length(75), T_FB_JB_RSLTS_USR_DTLS, "");

	/**
	 * No further instances allowed
	 */
	private TFbJbRsltsUsrDtls() {
		super("T_FB_JB_RSLTS_USR_DTLS", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}