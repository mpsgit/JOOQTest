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
public class TTblPgWghtSprdPgWghtRecord extends ArrayRecordImpl<TPgWghtSprdPgWghtRecord> {

	private static final long serialVersionUID = 1543332371;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblPgWghtSprdPgWghtRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblPgWghtSprdPgWghtRecord(Configuration configuration) {
		super(Wetrn.WETRN, "T_TBL_PG_WGHT_SPRD_PG_WGHT", org.jooq.udt.TPgWghtSprdPgWght.T_PG_WGHT_SPRD_PG_WGHT.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblPgWghtSprdPgWghtRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblPgWghtSprdPgWghtRecord(Configuration configuration, TPgWghtSprdPgWghtRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblPgWghtSprdPgWghtRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblPgWghtSprdPgWghtRecord(Configuration configuration, List<? extends TPgWghtSprdPgWghtRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_PG_WGHT_SPRD_PG_WGHT</code> record
	 */
	public TTblPgWghtSprdPgWghtRecord() {
		super(Wetrn.WETRN, "T_TBL_PG_WGHT_SPRD_PG_WGHT", org.jooq.udt.TPgWghtSprdPgWght.T_PG_WGHT_SPRD_PG_WGHT.getDataType());
	}

	/**
	 * Create a new <code>WETRN.T_TBL_PG_WGHT_SPRD_PG_WGHT</code> record
	 */
	public TTblPgWghtSprdPgWghtRecord(TPgWghtSprdPgWghtRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_PG_WGHT_SPRD_PG_WGHT</code> record
	 */
	public TTblPgWghtSprdPgWghtRecord(Collection<? extends TPgWghtSprdPgWghtRecord> collection) {
		this();
		set(collection);
	}
}
