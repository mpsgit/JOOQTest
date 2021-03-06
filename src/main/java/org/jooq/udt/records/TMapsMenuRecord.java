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
public class TMapsMenuRecord extends ArrayRecordImpl<ObjMapsMenuRecord> {

	private static final long serialVersionUID = 802867096;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TMapsMenuRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TMapsMenuRecord(Configuration configuration) {
		super(Wetrn.WETRN, "T_MAPS_MENU", org.jooq.udt.ObjMapsMenu.OBJ_MAPS_MENU.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TMapsMenuRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TMapsMenuRecord(Configuration configuration, ObjMapsMenuRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TMapsMenuRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TMapsMenuRecord(Configuration configuration, List<? extends ObjMapsMenuRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.T_MAPS_MENU</code> record
	 */
	public TMapsMenuRecord() {
		super(Wetrn.WETRN, "T_MAPS_MENU", org.jooq.udt.ObjMapsMenu.OBJ_MAPS_MENU.getDataType());
	}

	/**
	 * Create a new <code>WETRN.T_MAPS_MENU</code> record
	 */
	public TMapsMenuRecord(ObjMapsMenuRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.T_MAPS_MENU</code> record
	 */
	public TMapsMenuRecord(Collection<? extends ObjMapsMenuRecord> collection) {
		this();
		set(collection);
	}
}
