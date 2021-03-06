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
public class TblPageWeightVwRecord extends ArrayRecordImpl<TPageWeightVwRecord> {

	private static final long serialVersionUID = 113323966;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblPageWeightVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblPageWeightVwRecord(Configuration configuration) {
		super(Wetrn.WETRN, "TBL_PAGE_WEIGHT_VW", org.jooq.udt.TPageWeightVw.T_PAGE_WEIGHT_VW.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblPageWeightVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblPageWeightVwRecord(Configuration configuration, TPageWeightVwRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblPageWeightVwRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblPageWeightVwRecord(Configuration configuration, List<? extends TPageWeightVwRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.TBL_PAGE_WEIGHT_VW</code> record
	 */
	public TblPageWeightVwRecord() {
		super(Wetrn.WETRN, "TBL_PAGE_WEIGHT_VW", org.jooq.udt.TPageWeightVw.T_PAGE_WEIGHT_VW.getDataType());
	}

	/**
	 * Create a new <code>WETRN.TBL_PAGE_WEIGHT_VW</code> record
	 */
	public TblPageWeightVwRecord(TPageWeightVwRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.TBL_PAGE_WEIGHT_VW</code> record
	 */
	public TblPageWeightVwRecord(Collection<? extends TPageWeightVwRecord> collection) {
		this();
		set(collection);
	}
}
