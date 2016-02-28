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
public class TblSaSugMatchOffrVwRecord extends ArrayRecordImpl<TSaSugMatchOffrVwRecord> {

	private static final long serialVersionUID = -1185691360;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSaSugMatchOffrVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSaSugMatchOffrVwRecord(Configuration configuration) {
		super(Wetrn.WETRN, "TBL_SA_SUG_MATCH_OFFR_VW", org.jooq.udt.TSaSugMatchOffrVw.T_SA_SUG_MATCH_OFFR_VW.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSaSugMatchOffrVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSaSugMatchOffrVwRecord(Configuration configuration, TSaSugMatchOffrVwRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSaSugMatchOffrVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSaSugMatchOffrVwRecord(Configuration configuration, List<? extends TSaSugMatchOffrVwRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.TBL_SA_SUG_MATCH_OFFR_VW</code> record
	 */
	public TblSaSugMatchOffrVwRecord() {
		super(Wetrn.WETRN, "TBL_SA_SUG_MATCH_OFFR_VW", org.jooq.udt.TSaSugMatchOffrVw.T_SA_SUG_MATCH_OFFR_VW.getDataType());
	}

	/**
	 * Create a new <code>WETRN.TBL_SA_SUG_MATCH_OFFR_VW</code> record
	 */
	public TblSaSugMatchOffrVwRecord(TSaSugMatchOffrVwRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.TBL_SA_SUG_MATCH_OFFR_VW</code> record
	 */
	public TblSaSugMatchOffrVwRecord(Collection<? extends TSaSugMatchOffrVwRecord> collection) {
		this();
		set(collection);
	}
}