/**
 * This class is generated by jOOQ
 */
package org.jooq.routines;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;


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
public class PgWghtInsert extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1089451044;

	/**
	 * The parameter <code>WETRN.PG_WGHT_INSERT.V_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> V_MRKT_ID = createParameter("V_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PG_WGHT_INSERT.V_PG_WGHT_PCT</code>.
	 */
	public static final Parameter<BigDecimal> V_PG_WGHT_PCT = createParameter("V_PG_WGHT_PCT", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public PgWghtInsert() {
		super("PG_WGHT_INSERT", Wetrn.WETRN);

		addInParameter(V_MRKT_ID);
		addInParameter(V_PG_WGHT_PCT);
	}

	/**
	 * Set the <code>V_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setVMrktId(Number value) {
		setNumber(V_MRKT_ID, value);
	}

	/**
	 * Set the <code>V_PG_WGHT_PCT</code> parameter IN value to the routine
	 */
	public void setVPgWghtPct(Number value) {
		setNumber(V_PG_WGHT_PCT, value);
	}
}
