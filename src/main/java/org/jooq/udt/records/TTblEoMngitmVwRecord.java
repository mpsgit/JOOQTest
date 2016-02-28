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
public class TTblEoMngitmVwRecord extends ArrayRecordImpl<TEoMngitmVwRecord> {

	private static final long serialVersionUID = -738271435;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblEoMngitmVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblEoMngitmVwRecord(Configuration configuration) {
		super(Wetrn.WETRN, "T_TBL_EO_MNGITM_VW", org.jooq.udt.TEoMngitmVw.T_EO_MNGITM_VW.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblEoMngitmVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblEoMngitmVwRecord(Configuration configuration, TEoMngitmVwRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblEoMngitmVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblEoMngitmVwRecord(Configuration configuration, List<? extends TEoMngitmVwRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_EO_MNGITM_VW</code> record
	 */
	public TTblEoMngitmVwRecord() {
		super(Wetrn.WETRN, "T_TBL_EO_MNGITM_VW", org.jooq.udt.TEoMngitmVw.T_EO_MNGITM_VW.getDataType());
	}

	/**
	 * Create a new <code>WETRN.T_TBL_EO_MNGITM_VW</code> record
	 */
	public TTblEoMngitmVwRecord(TEoMngitmVwRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_EO_MNGITM_VW</code> record
	 */
	public TTblEoMngitmVwRecord(Collection<? extends TEoMngitmVwRecord> collection) {
		this();
		set(collection);
	}
}
