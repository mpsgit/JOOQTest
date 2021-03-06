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
public class TTblFbReBoostTrgtMrktRecord extends ArrayRecordImpl<TFbReBoostTrgtMrktRecord> {

	private static final long serialVersionUID = 1939657197;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblFbReBoostTrgtMrktRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblFbReBoostTrgtMrktRecord(Configuration configuration) {
		super(Wetrn.WETRN, "T_TBL_FB_RE_BOOST_TRGT_MRKT", org.jooq.udt.TFbReBoostTrgtMrkt.T_FB_RE_BOOST_TRGT_MRKT.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblFbReBoostTrgtMrktRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblFbReBoostTrgtMrktRecord(Configuration configuration, TFbReBoostTrgtMrktRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblFbReBoostTrgtMrktRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblFbReBoostTrgtMrktRecord(Configuration configuration, List<? extends TFbReBoostTrgtMrktRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_FB_RE_BOOST_TRGT_MRKT</code> record
	 */
	public TTblFbReBoostTrgtMrktRecord() {
		super(Wetrn.WETRN, "T_TBL_FB_RE_BOOST_TRGT_MRKT", org.jooq.udt.TFbReBoostTrgtMrkt.T_FB_RE_BOOST_TRGT_MRKT.getDataType());
	}

	/**
	 * Create a new <code>WETRN.T_TBL_FB_RE_BOOST_TRGT_MRKT</code> record
	 */
	public TTblFbReBoostTrgtMrktRecord(TFbReBoostTrgtMrktRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_FB_RE_BOOST_TRGT_MRKT</code> record
	 */
	public TTblFbReBoostTrgtMrktRecord(Collection<? extends TFbReBoostTrgtMrktRecord> collection) {
		this();
		set(collection);
	}
}
