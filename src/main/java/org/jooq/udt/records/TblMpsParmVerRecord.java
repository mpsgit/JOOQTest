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
public class TblMpsParmVerRecord extends ArrayRecordImpl<TMpsParmVerRecord> {

	private static final long serialVersionUID = -1014685080;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblMpsParmVerRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblMpsParmVerRecord(Configuration configuration) {
		super(Wetrn.WETRN, "TBL_MPS_PARM_VER", org.jooq.udt.TMpsParmVer.T_MPS_PARM_VER.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblMpsParmVerRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblMpsParmVerRecord(Configuration configuration, TMpsParmVerRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblMpsParmVerRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblMpsParmVerRecord(Configuration configuration, List<? extends TMpsParmVerRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.TBL_MPS_PARM_VER</code> record
	 */
	public TblMpsParmVerRecord() {
		super(Wetrn.WETRN, "TBL_MPS_PARM_VER", org.jooq.udt.TMpsParmVer.T_MPS_PARM_VER.getDataType());
	}

	/**
	 * Create a new <code>WETRN.TBL_MPS_PARM_VER</code> record
	 */
	public TblMpsParmVerRecord(TMpsParmVerRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.TBL_MPS_PARM_VER</code> record
	 */
	public TblMpsParmVerRecord(Collection<? extends TMpsParmVerRecord> collection) {
		this();
		set(collection);
	}
}