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
public class TblEditOffrDataRecord extends ArrayRecordImpl<TEditOffrDataRecord> {

	private static final long serialVersionUID = 100581066;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblEditOffrDataRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblEditOffrDataRecord(Configuration configuration) {
		super(Wetrn.WETRN, "TBL_EDIT_OFFR_DATA", org.jooq.udt.TEditOffrData.T_EDIT_OFFR_DATA.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblEditOffrDataRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblEditOffrDataRecord(Configuration configuration, TEditOffrDataRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblEditOffrDataRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblEditOffrDataRecord(Configuration configuration, List<? extends TEditOffrDataRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.TBL_EDIT_OFFR_DATA</code> record
	 */
	public TblEditOffrDataRecord() {
		super(Wetrn.WETRN, "TBL_EDIT_OFFR_DATA", org.jooq.udt.TEditOffrData.T_EDIT_OFFR_DATA.getDataType());
	}

	/**
	 * Create a new <code>WETRN.TBL_EDIT_OFFR_DATA</code> record
	 */
	public TblEditOffrDataRecord(TEditOffrDataRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.TBL_EDIT_OFFR_DATA</code> record
	 */
	public TblEditOffrDataRecord(Collection<? extends TEditOffrDataRecord> collection) {
		this();
		set(collection);
	}
}
