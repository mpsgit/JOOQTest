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
public class TblMpsParmVehRecord extends ArrayRecordImpl<TMpsParmVehRecord> {

	private static final long serialVersionUID = 1169815356;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblMpsParmVehRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblMpsParmVehRecord(Configuration configuration) {
		super(Wetrn.WETRN, "TBL_MPS_PARM_VEH", org.jooq.udt.TMpsParmVeh.T_MPS_PARM_VEH.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblMpsParmVehRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblMpsParmVehRecord(Configuration configuration, TMpsParmVehRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblMpsParmVehRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblMpsParmVehRecord(Configuration configuration, List<? extends TMpsParmVehRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.TBL_MPS_PARM_VEH</code> record
	 */
	public TblMpsParmVehRecord() {
		super(Wetrn.WETRN, "TBL_MPS_PARM_VEH", org.jooq.udt.TMpsParmVeh.T_MPS_PARM_VEH.getDataType());
	}

	/**
	 * Create a new <code>WETRN.TBL_MPS_PARM_VEH</code> record
	 */
	public TblMpsParmVehRecord(TMpsParmVehRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.TBL_MPS_PARM_VEH</code> record
	 */
	public TblMpsParmVehRecord(Collection<? extends TMpsParmVehRecord> collection) {
		this();
		set(collection);
	}
}