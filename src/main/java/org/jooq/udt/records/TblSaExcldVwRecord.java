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
public class TblSaExcldVwRecord extends ArrayRecordImpl<TSaExcldVwRecord> {

	private static final long serialVersionUID = 215358628;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSaExcldVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSaExcldVwRecord(Configuration configuration) {
		super(Wetrn.WETRN, "TBL_SA_EXCLD_VW", org.jooq.udt.TSaExcldVw.T_SA_EXCLD_VW.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSaExcldVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSaExcldVwRecord(Configuration configuration, TSaExcldVwRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSaExcldVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSaExcldVwRecord(Configuration configuration, List<? extends TSaExcldVwRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.TBL_SA_EXCLD_VW</code> record
	 */
	public TblSaExcldVwRecord() {
		super(Wetrn.WETRN, "TBL_SA_EXCLD_VW", org.jooq.udt.TSaExcldVw.T_SA_EXCLD_VW.getDataType());
	}

	/**
	 * Create a new <code>WETRN.TBL_SA_EXCLD_VW</code> record
	 */
	public TblSaExcldVwRecord(TSaExcldVwRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.TBL_SA_EXCLD_VW</code> record
	 */
	public TblSaExcldVwRecord(Collection<? extends TSaExcldVwRecord> collection) {
		this();
		set(collection);
	}
}
