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
public class TXportStusRecord extends ArrayRecordImpl<ObjXportStusRecord> {

	private static final long serialVersionUID = -1742672710;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TXportStusRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TXportStusRecord(Configuration configuration) {
		super(Wetrn.WETRN, "T_XPORT_STUS", org.jooq.udt.ObjXportStus.OBJ_XPORT_STUS.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TXportStusRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TXportStusRecord(Configuration configuration, ObjXportStusRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TXportStusRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TXportStusRecord(Configuration configuration, List<? extends ObjXportStusRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.T_XPORT_STUS</code> record
	 */
	public TXportStusRecord() {
		super(Wetrn.WETRN, "T_XPORT_STUS", org.jooq.udt.ObjXportStus.OBJ_XPORT_STUS.getDataType());
	}

	/**
	 * Create a new <code>WETRN.T_XPORT_STUS</code> record
	 */
	public TXportStusRecord(ObjXportStusRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.T_XPORT_STUS</code> record
	 */
	public TXportStusRecord(Collection<? extends ObjXportStusRecord> collection) {
		this();
		set(collection);
	}
}
