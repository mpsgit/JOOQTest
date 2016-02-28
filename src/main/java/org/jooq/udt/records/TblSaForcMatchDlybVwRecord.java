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
public class TblSaForcMatchDlybVwRecord extends ArrayRecordImpl<TSaForcMatchDlybVwRecord> {

	private static final long serialVersionUID = -920006104;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSaForcMatchDlybVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSaForcMatchDlybVwRecord(Configuration configuration) {
		super(Wetrn.WETRN, "TBL_SA_FORC_MATCH_DLYB_VW", org.jooq.udt.TSaForcMatchDlybVw.T_SA_FORC_MATCH_DLYB_VW.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSaForcMatchDlybVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSaForcMatchDlybVwRecord(Configuration configuration, TSaForcMatchDlybVwRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSaForcMatchDlybVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSaForcMatchDlybVwRecord(Configuration configuration, List<? extends TSaForcMatchDlybVwRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.TBL_SA_FORC_MATCH_DLYB_VW</code> record
	 */
	public TblSaForcMatchDlybVwRecord() {
		super(Wetrn.WETRN, "TBL_SA_FORC_MATCH_DLYB_VW", org.jooq.udt.TSaForcMatchDlybVw.T_SA_FORC_MATCH_DLYB_VW.getDataType());
	}

	/**
	 * Create a new <code>WETRN.TBL_SA_FORC_MATCH_DLYB_VW</code> record
	 */
	public TblSaForcMatchDlybVwRecord(TSaForcMatchDlybVwRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.TBL_SA_FORC_MATCH_DLYB_VW</code> record
	 */
	public TblSaForcMatchDlybVwRecord(Collection<? extends TSaForcMatchDlybVwRecord> collection) {
		this();
		set(collection);
	}
}
