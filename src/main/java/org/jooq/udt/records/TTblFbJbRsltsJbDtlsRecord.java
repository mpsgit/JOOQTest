/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import java.util.Collection;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Wetrn;
import org.jooq.impl.ArrayRecordImpl;


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
public class TTblFbJbRsltsJbDtlsRecord extends ArrayRecordImpl<TFbJbRsltsJobDtlsRecord> {

	private static final long serialVersionUID = -1823309494;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblFbJbRsltsJbDtlsRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblFbJbRsltsJbDtlsRecord(Configuration configuration) {
		super(Wetrn.WETRN, "T_TBL_FB_JB_RSLTS_JB_DTLS", org.jooq.udt.TFbJbRsltsJobDtls.T_FB_JB_RSLTS_JOB_DTLS.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblFbJbRsltsJbDtlsRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblFbJbRsltsJbDtlsRecord(Configuration configuration, TFbJbRsltsJobDtlsRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblFbJbRsltsJbDtlsRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblFbJbRsltsJbDtlsRecord(Configuration configuration, List<? extends TFbJbRsltsJobDtlsRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_FB_JB_RSLTS_JB_DTLS</code> record
	 */
	public TTblFbJbRsltsJbDtlsRecord() {
		super(Wetrn.WETRN, "T_TBL_FB_JB_RSLTS_JB_DTLS", org.jooq.udt.TFbJbRsltsJobDtls.T_FB_JB_RSLTS_JOB_DTLS.getDataType());
	}

	/**
	 * Create a new <code>WETRN.T_TBL_FB_JB_RSLTS_JB_DTLS</code> record
	 */
	public TTblFbJbRsltsJbDtlsRecord(TFbJbRsltsJobDtlsRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_FB_JB_RSLTS_JB_DTLS</code> record
	 */
	public TTblFbJbRsltsJbDtlsRecord(Collection<? extends TFbJbRsltsJobDtlsRecord> collection) {
		this();
		set(collection);
	}
}