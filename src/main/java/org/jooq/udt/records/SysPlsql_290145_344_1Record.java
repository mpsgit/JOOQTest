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
public class SysPlsql_290145_344_1Record extends ArrayRecordImpl<Object> {

	private static final long serialVersionUID = -331816353;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #SysPlsql_290145_344_1Record()} constructor instead
	 */
	@java.lang.Deprecated
	public SysPlsql_290145_344_1Record(Configuration configuration) {
		super(Wetrn.WETRN, "SYS_PLSQL_290145_344_1", org.jooq.impl.DefaultDataType.getDefaultDataType("SYS_PLSQL_290145_118_1"), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #SysPlsql_290145_344_1Record()} constructor instead
	 */
	@java.lang.Deprecated
	public SysPlsql_290145_344_1Record(Configuration configuration, Object... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #SysPlsql_290145_344_1Record()} constructor instead
	 */
	@java.lang.Deprecated
	public SysPlsql_290145_344_1Record(Configuration configuration, List<? extends Object> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.SYS_PLSQL_290145_344_1</code> record
	 */
	public SysPlsql_290145_344_1Record() {
		super(Wetrn.WETRN, "SYS_PLSQL_290145_344_1", org.jooq.impl.DefaultDataType.getDefaultDataType("SYS_PLSQL_290145_118_1"));
	}

	/**
	 * Create a new <code>WETRN.SYS_PLSQL_290145_344_1</code> record
	 */
	public SysPlsql_290145_344_1Record(Object... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.SYS_PLSQL_290145_344_1</code> record
	 */
	public SysPlsql_290145_344_1Record(Collection<? extends Object> collection) {
		this();
		set(collection);
	}
}
