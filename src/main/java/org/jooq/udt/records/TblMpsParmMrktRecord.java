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
public class TblMpsParmMrktRecord extends ArrayRecordImpl<TMpsParmMrktRecord> {

	private static final long serialVersionUID = 133899620;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblMpsParmMrktRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblMpsParmMrktRecord(Configuration configuration) {
		super(Wetrn.WETRN, "TBL_MPS_PARM_MRKT", org.jooq.udt.TMpsParmMrkt.T_MPS_PARM_MRKT.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblMpsParmMrktRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblMpsParmMrktRecord(Configuration configuration, TMpsParmMrktRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblMpsParmMrktRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblMpsParmMrktRecord(Configuration configuration, List<? extends TMpsParmMrktRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.TBL_MPS_PARM_MRKT</code> record
	 */
	public TblMpsParmMrktRecord() {
		super(Wetrn.WETRN, "TBL_MPS_PARM_MRKT", org.jooq.udt.TMpsParmMrkt.T_MPS_PARM_MRKT.getDataType());
	}

	/**
	 * Create a new <code>WETRN.TBL_MPS_PARM_MRKT</code> record
	 */
	public TblMpsParmMrktRecord(TMpsParmMrktRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.TBL_MPS_PARM_MRKT</code> record
	 */
	public TblMpsParmMrktRecord(Collection<? extends TMpsParmMrktRecord> collection) {
		this();
		set(collection);
	}
}
