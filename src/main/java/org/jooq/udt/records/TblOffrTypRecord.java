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
public class TblOffrTypRecord extends ArrayRecordImpl<String> {

	private static final long serialVersionUID = -1095539983;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblOffrTypRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblOffrTypRecord(Configuration configuration) {
		super(Wetrn.WETRN, "TBL_OFFR_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(255), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblOffrTypRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblOffrTypRecord(Configuration configuration, String... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblOffrTypRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblOffrTypRecord(Configuration configuration, List<? extends String> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.TBL_OFFR_TYP</code> record
	 */
	public TblOffrTypRecord() {
		super(Wetrn.WETRN, "TBL_OFFR_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(255));
	}

	/**
	 * Create a new <code>WETRN.TBL_OFFR_TYP</code> record
	 */
	public TblOffrTypRecord(String... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.TBL_OFFR_TYP</code> record
	 */
	public TblOffrTypRecord(Collection<? extends String> collection) {
		this();
		set(collection);
	}
}
