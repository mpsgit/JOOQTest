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
public class TblSaForcMatchOffrVwRecord extends ArrayRecordImpl<TSaForcMatchOffrVwRecord> {

	private static final long serialVersionUID = -1036060744;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSaForcMatchOffrVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSaForcMatchOffrVwRecord(Configuration configuration) {
		super(Wetrn.WETRN, "TBL_SA_FORC_MATCH_OFFR_VW", org.jooq.udt.TSaForcMatchOffrVw.T_SA_FORC_MATCH_OFFR_VW.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSaForcMatchOffrVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSaForcMatchOffrVwRecord(Configuration configuration, TSaForcMatchOffrVwRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSaForcMatchOffrVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSaForcMatchOffrVwRecord(Configuration configuration, List<? extends TSaForcMatchOffrVwRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.TBL_SA_FORC_MATCH_OFFR_VW</code> record
	 */
	public TblSaForcMatchOffrVwRecord() {
		super(Wetrn.WETRN, "TBL_SA_FORC_MATCH_OFFR_VW", org.jooq.udt.TSaForcMatchOffrVw.T_SA_FORC_MATCH_OFFR_VW.getDataType());
	}

	/**
	 * Create a new <code>WETRN.TBL_SA_FORC_MATCH_OFFR_VW</code> record
	 */
	public TblSaForcMatchOffrVwRecord(TSaForcMatchOffrVwRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.TBL_SA_FORC_MATCH_OFFR_VW</code> record
	 */
	public TblSaForcMatchOffrVwRecord(Collection<? extends TSaForcMatchOffrVwRecord> collection) {
		this();
		set(collection);
	}
}