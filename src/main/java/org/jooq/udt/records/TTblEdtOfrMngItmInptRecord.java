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
public class TTblEdtOfrMngItmInptRecord extends ArrayRecordImpl<TEdtOfrMngItmInptRecord> {

	private static final long serialVersionUID = 1642935263;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblEdtOfrMngItmInptRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblEdtOfrMngItmInptRecord(Configuration configuration) {
		super(Wetrn.WETRN, "T_TBL_EDT_OFR_MNG_ITM_INPT", org.jooq.udt.TEdtOfrMngItmInpt.T_EDT_OFR_MNG_ITM_INPT.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblEdtOfrMngItmInptRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblEdtOfrMngItmInptRecord(Configuration configuration, TEdtOfrMngItmInptRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TTblEdtOfrMngItmInptRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TTblEdtOfrMngItmInptRecord(Configuration configuration, List<? extends TEdtOfrMngItmInptRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_EDT_OFR_MNG_ITM_INPT</code> record
	 */
	public TTblEdtOfrMngItmInptRecord() {
		super(Wetrn.WETRN, "T_TBL_EDT_OFR_MNG_ITM_INPT", org.jooq.udt.TEdtOfrMngItmInpt.T_EDT_OFR_MNG_ITM_INPT.getDataType());
	}

	/**
	 * Create a new <code>WETRN.T_TBL_EDT_OFR_MNG_ITM_INPT</code> record
	 */
	public TTblEdtOfrMngItmInptRecord(TEdtOfrMngItmInptRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.T_TBL_EDT_OFR_MNG_ITM_INPT</code> record
	 */
	public TTblEdtOfrMngItmInptRecord(Collection<? extends TEdtOfrMngItmInptRecord> collection) {
		this();
		set(collection);
	}
}