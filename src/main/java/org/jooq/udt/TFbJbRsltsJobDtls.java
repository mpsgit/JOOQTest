/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TFbJbRsltsJobDtlsRecord;


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
public class TFbJbRsltsJobDtls extends UDTImpl<TFbJbRsltsJobDtlsRecord> {

	private static final long serialVersionUID = -853404142;

	/**
	 * The reference instance of <code>WETRN.T_FB_JB_RSLTS_JOB_DTLS</code>
	 */
	public static final TFbJbRsltsJobDtls T_FB_JB_RSLTS_JOB_DTLS = new TFbJbRsltsJobDtls();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TFbJbRsltsJobDtlsRecord> getRecordType() {
		return TFbJbRsltsJobDtlsRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_FB_JB_RSLTS_JOB_DTLS.JOB_ID</code>.
	 */
	public static final UDTField<TFbJbRsltsJobDtlsRecord, BigDecimal> JOB_ID = createField("JOB_ID", org.jooq.impl.SQLDataType.NUMERIC, T_FB_JB_RSLTS_JOB_DTLS, "");

	/**
	 * The attribute <code>WETRN.T_FB_JB_RSLTS_JOB_DTLS.JOB_DESC</code>.
	 */
	public static final UDTField<TFbJbRsltsJobDtlsRecord, String> JOB_DESC = createField("JOB_DESC", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_FB_JB_RSLTS_JOB_DTLS, "");

	/**
	 * No further instances allowed
	 */
	private TFbJbRsltsJobDtls() {
		super("T_FB_JB_RSLTS_JOB_DTLS", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}
