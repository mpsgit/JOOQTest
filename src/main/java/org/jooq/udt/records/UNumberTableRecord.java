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
public class UNumberTableRecord extends ArrayRecordImpl<Integer> {

	private static final long serialVersionUID = -1892490050;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #UNumberTableRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public UNumberTableRecord(Configuration configuration) {
		super(Wetrn.WETRN, "U_NUMBER_TABLE", org.jooq.impl.SQLDataType.INTEGER, configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #UNumberTableRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public UNumberTableRecord(Configuration configuration, Integer... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #UNumberTableRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public UNumberTableRecord(Configuration configuration, List<? extends Integer> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.U_NUMBER_TABLE</code> record
	 */
	public UNumberTableRecord() {
		super(Wetrn.WETRN, "U_NUMBER_TABLE", org.jooq.impl.SQLDataType.INTEGER);
	}

	/**
	 * Create a new <code>WETRN.U_NUMBER_TABLE</code> record
	 */
	public UNumberTableRecord(Integer... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.U_NUMBER_TABLE</code> record
	 */
	public UNumberTableRecord(Collection<? extends Integer> collection) {
		this();
		set(collection);
	}
}
