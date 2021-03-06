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
public class TTblDlyBilngFscRecord extends ArrayRecordImpl<TRecDlyBilngFscRecord> {

	private static final long serialVersionUID = -1049720923;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblDlyBilngFscRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblDlyBilngFscRecord(Configuration configuration) {
		super(Wetrn.WETRN, "T_TBL_DLY_BILNG_FSC", org.jooq.udt.TRecDlyBilngFsc.T_REC_DLY_BILNG_FSC.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblDlyBilngFscRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblDlyBilngFscRecord(Configuration configuration, TRecDlyBilngFscRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblDlyBilngFscRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblDlyBilngFscRecord(Configuration configuration, List<? extends TRecDlyBilngFscRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_DLY_BILNG_FSC</code> record
	 */
	public TTblDlyBilngFscRecord() {
		super(Wetrn.WETRN, "T_TBL_DLY_BILNG_FSC", org.jooq.udt.TRecDlyBilngFsc.T_REC_DLY_BILNG_FSC.getDataType());
	}

	/**
	 * Create a new <code>WETRN.T_TBL_DLY_BILNG_FSC</code> record
	 */
	public TTblDlyBilngFscRecord(TRecDlyBilngFscRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_DLY_BILNG_FSC</code> record
	 */
	public TTblDlyBilngFscRecord(Collection<? extends TRecDlyBilngFscRecord> collection) {
		this();
		set(collection);
	}
}
