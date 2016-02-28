/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import java.math.BigDecimal;
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
public class SysPlsql_290147Dummy_1Record extends ArrayRecordImpl<BigDecimal> {

	private static final long serialVersionUID = 1151212889;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #SysPlsql_290147Dummy_1Record()} constructor instead
	 */
	@java.lang.Deprecated
	public SysPlsql_290147Dummy_1Record(Configuration configuration) {
		super(Wetrn.WETRN, "SYS_PLSQL_290147_DUMMY_1", org.jooq.impl.SQLDataType.NUMERIC, configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #SysPlsql_290147Dummy_1Record()} constructor instead
	 */
	@java.lang.Deprecated
	public SysPlsql_290147Dummy_1Record(Configuration configuration, BigDecimal... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #SysPlsql_290147Dummy_1Record()} constructor instead
	 */
	@java.lang.Deprecated
	public SysPlsql_290147Dummy_1Record(Configuration configuration, List<? extends BigDecimal> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.SYS_PLSQL_290147_DUMMY_1</code> record
	 */
	public SysPlsql_290147Dummy_1Record() {
		super(Wetrn.WETRN, "SYS_PLSQL_290147_DUMMY_1", org.jooq.impl.SQLDataType.NUMERIC);
	}

	/**
	 * Create a new <code>WETRN.SYS_PLSQL_290147_DUMMY_1</code> record
	 */
	public SysPlsql_290147Dummy_1Record(BigDecimal... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.SYS_PLSQL_290147_DUMMY_1</code> record
	 */
	public SysPlsql_290147Dummy_1Record(Collection<? extends BigDecimal> collection) {
		this();
		set(collection);
	}
}
