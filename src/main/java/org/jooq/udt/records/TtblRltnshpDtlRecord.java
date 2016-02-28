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
public class TtblRltnshpDtlRecord extends ArrayRecordImpl<TypRltnshpDtlRecord> {

	private static final long serialVersionUID = -869249250;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TtblRltnshpDtlRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TtblRltnshpDtlRecord(Configuration configuration) {
		super(Wetrn.WETRN, "TTBL_RLTNSHP_DTL", org.jooq.udt.TypRltnshpDtl.TYP_RLTNSHP_DTL.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TtblRltnshpDtlRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TtblRltnshpDtlRecord(Configuration configuration, TypRltnshpDtlRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TtblRltnshpDtlRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TtblRltnshpDtlRecord(Configuration configuration, List<? extends TypRltnshpDtlRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.TTBL_RLTNSHP_DTL</code> record
	 */
	public TtblRltnshpDtlRecord() {
		super(Wetrn.WETRN, "TTBL_RLTNSHP_DTL", org.jooq.udt.TypRltnshpDtl.TYP_RLTNSHP_DTL.getDataType());
	}

	/**
	 * Create a new <code>WETRN.TTBL_RLTNSHP_DTL</code> record
	 */
	public TtblRltnshpDtlRecord(TypRltnshpDtlRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.TTBL_RLTNSHP_DTL</code> record
	 */
	public TtblRltnshpDtlRecord(Collection<? extends TypRltnshpDtlRecord> collection) {
		this();
		set(collection);
	}
}
