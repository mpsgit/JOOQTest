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
public class TblEditOffrTrgtMrtcsRecord extends ArrayRecordImpl<TEditOffrTrgtMrtcsRecord> {

	private static final long serialVersionUID = -1160911583;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblEditOffrTrgtMrtcsRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblEditOffrTrgtMrtcsRecord(Configuration configuration) {
		super(Wetrn.WETRN, "TBL_EDIT_OFFR_TRGT_MRTCS", org.jooq.udt.TEditOffrTrgtMrtcs.T_EDIT_OFFR_TRGT_MRTCS.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblEditOffrTrgtMrtcsRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblEditOffrTrgtMrtcsRecord(Configuration configuration, TEditOffrTrgtMrtcsRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblEditOffrTrgtMrtcsRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblEditOffrTrgtMrtcsRecord(Configuration configuration, List<? extends TEditOffrTrgtMrtcsRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.TBL_EDIT_OFFR_TRGT_MRTCS</code> record
	 */
	public TblEditOffrTrgtMrtcsRecord() {
		super(Wetrn.WETRN, "TBL_EDIT_OFFR_TRGT_MRTCS", org.jooq.udt.TEditOffrTrgtMrtcs.T_EDIT_OFFR_TRGT_MRTCS.getDataType());
	}

	/**
	 * Create a new <code>WETRN.TBL_EDIT_OFFR_TRGT_MRTCS</code> record
	 */
	public TblEditOffrTrgtMrtcsRecord(TEditOffrTrgtMrtcsRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.TBL_EDIT_OFFR_TRGT_MRTCS</code> record
	 */
	public TblEditOffrTrgtMrtcsRecord(Collection<? extends TEditOffrTrgtMrtcsRecord> collection) {
		this();
		set(collection);
	}
}