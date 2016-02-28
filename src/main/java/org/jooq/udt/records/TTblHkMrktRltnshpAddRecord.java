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
public class TTblHkMrktRltnshpAddRecord extends ArrayRecordImpl<THkMrktRltnshpAddRecord> {

	private static final long serialVersionUID = -1018323718;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblHkMrktRltnshpAddRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblHkMrktRltnshpAddRecord(Configuration configuration) {
		super(Wetrn.WETRN, "T_TBL_HK_MRKT_RLTNSHP_ADD", org.jooq.udt.THkMrktRltnshpAdd.T_HK_MRKT_RLTNSHP_ADD.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblHkMrktRltnshpAddRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblHkMrktRltnshpAddRecord(Configuration configuration, THkMrktRltnshpAddRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblHkMrktRltnshpAddRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblHkMrktRltnshpAddRecord(Configuration configuration, List<? extends THkMrktRltnshpAddRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_HK_MRKT_RLTNSHP_ADD</code> record
	 */
	public TTblHkMrktRltnshpAddRecord() {
		super(Wetrn.WETRN, "T_TBL_HK_MRKT_RLTNSHP_ADD", org.jooq.udt.THkMrktRltnshpAdd.T_HK_MRKT_RLTNSHP_ADD.getDataType());
	}

	/**
	 * Create a new <code>WETRN.T_TBL_HK_MRKT_RLTNSHP_ADD</code> record
	 */
	public TTblHkMrktRltnshpAddRecord(THkMrktRltnshpAddRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_HK_MRKT_RLTNSHP_ADD</code> record
	 */
	public TTblHkMrktRltnshpAddRecord(Collection<? extends THkMrktRltnshpAddRecord> collection) {
		this();
		set(collection);
	}
}
