/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import java.math.BigDecimal;
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
public class TblSkuRecord extends ArrayRecordImpl<BigDecimal> {

	private static final long serialVersionUID = 516175150;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSkuRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSkuRecord(Configuration configuration) {
		super(Wetrn.WETRN, "TBL_SKU", org.jooq.impl.SQLDataType.NUMERIC, configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSkuRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSkuRecord(Configuration configuration, BigDecimal... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #TblSkuRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public TblSkuRecord(Configuration configuration, List<? extends BigDecimal> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>WETRN.TBL_SKU</code> record
	 */
	public TblSkuRecord() {
		super(Wetrn.WETRN, "TBL_SKU", org.jooq.impl.SQLDataType.NUMERIC);
	}

	/**
	 * Create a new <code>WETRN.TBL_SKU</code> record
	 */
	public TblSkuRecord(BigDecimal... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>WETRN.TBL_SKU</code> record
	 */
	public TblSkuRecord(Collection<? extends BigDecimal> collection) {
		this();
		set(collection);
	}
}
