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
public class TTblFbJbRsltsJbStusIdRecord extends ArrayRecordImpl<TFbJbRsltsJbStusIdRecord> {

	private static final long serialVersionUID = -1964868230;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblFbJbRsltsJbStusIdRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblFbJbRsltsJbStusIdRecord(Configuration configuration) {
		super(Wetrn.WETRN, "T_TBL_FB_JB_RSLTS_JB_STUS_ID", org.jooq.udt.TFbJbRsltsJbStusId.T_FB_JB_RSLTS_JB_STUS_ID.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblFbJbRsltsJbStusIdRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblFbJbRsltsJbStusIdRecord(Configuration configuration, TFbJbRsltsJbStusIdRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblFbJbRsltsJbStusIdRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblFbJbRsltsJbStusIdRecord(Configuration configuration, List<? extends TFbJbRsltsJbStusIdRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_FB_JB_RSLTS_JB_STUS_ID</code> record
	 */
	public TTblFbJbRsltsJbStusIdRecord() {
		super(Wetrn.WETRN, "T_TBL_FB_JB_RSLTS_JB_STUS_ID", org.jooq.udt.TFbJbRsltsJbStusId.T_FB_JB_RSLTS_JB_STUS_ID.getDataType());
	}

	/**
	 * Create a new <code>WETRN.T_TBL_FB_JB_RSLTS_JB_STUS_ID</code> record
	 */
	public TTblFbJbRsltsJbStusIdRecord(TFbJbRsltsJbStusIdRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_FB_JB_RSLTS_JB_STUS_ID</code> record
	 */
	public TTblFbJbRsltsJbStusIdRecord(Collection<? extends TFbJbRsltsJbStusIdRecord> collection) {
		this();
		set(collection);
	}
}
