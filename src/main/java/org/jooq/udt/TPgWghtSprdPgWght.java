/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TPgWghtSprdPgWghtRecord;


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
public class TPgWghtSprdPgWght extends UDTImpl<TPgWghtSprdPgWghtRecord> {

	private static final long serialVersionUID = 897749721;

	/**
	 * The reference instance of <code>WETRN.T_PG_WGHT_SPRD_PG_WGHT</code>
	 */
	public static final TPgWghtSprdPgWght T_PG_WGHT_SPRD_PG_WGHT = new TPgWghtSprdPgWght();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TPgWghtSprdPgWghtRecord> getRecordType() {
		return TPgWghtSprdPgWghtRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_PG_WGHT_SPRD_PG_WGHT.SPREAD</code>.
	 */
	public static final UDTField<TPgWghtSprdPgWghtRecord, BigDecimal> SPREAD = createField("SPREAD", org.jooq.impl.SQLDataType.NUMERIC, T_PG_WGHT_SPRD_PG_WGHT, "");

	/**
	 * The attribute <code>WETRN.T_PG_WGHT_SPRD_PG_WGHT.PG_WGHT_PCT</code>.
	 */
	public static final UDTField<TPgWghtSprdPgWghtRecord, BigDecimal> PG_WGHT_PCT = createField("PG_WGHT_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 3), T_PG_WGHT_SPRD_PG_WGHT, "");

	/**
	 * No further instances allowed
	 */
	private TPgWghtSprdPgWght() {
		super("T_PG_WGHT_SPRD_PG_WGHT", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}
