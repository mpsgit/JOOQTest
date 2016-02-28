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
public class SysPlsql_290210_15_1Record extends ArrayRecordImpl<String> {

	private static final long serialVersionUID = -972335145;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #SysPlsql_290210_15_1Record()} constructor instead
	 */
	@java.lang.Deprecated
	public SysPlsql_290210_15_1Record(Configuration configuration) {
		super(Wetrn.WETRN, "SYS_PLSQL_290210_15_1", org.jooq.impl.SQLDataType.VARCHAR.length(16384), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #SysPlsql_290210_15_1Record()} constructor instead
	 */
	@java.lang.Deprecated
	public SysPlsql_290210_15_1Record(Configuration configuration, String... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #SysPlsql_290210_15_1Record()} constructor instead
	 */
	@java.lang.Deprecated
	public SysPlsql_290210_15_1Record(Configuration configuration, List<? extends String> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.SYS_PLSQL_290210_15_1</code> record
	 */
	public SysPlsql_290210_15_1Record() {
		super(Wetrn.WETRN, "SYS_PLSQL_290210_15_1", org.jooq.impl.SQLDataType.VARCHAR.length(16384));
	}

	/**
	 * Create a new <code>WETRN.SYS_PLSQL_290210_15_1</code> record
	 */
	public SysPlsql_290210_15_1Record(String... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.SYS_PLSQL_290210_15_1</code> record
	 */
	public SysPlsql_290210_15_1Record(Collection<? extends String> collection) {
		this();
		set(collection);
	}
}