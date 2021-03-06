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
public class PrSkuCostFixYear extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1668669904;

	/**
	 * The parameter <code>WETRN.PR_SKU_COST_FIX_YEAR.P_YEAR</code>.
	 */
	public static final Parameter<BigDecimal> P_YEAR = createParameter("P_YEAR", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public PrSkuCostFixYear() {
		super("PR_SKU_COST_FIX_YEAR", Wetrn.WETRN);

		addInParameter(P_YEAR);
	}

	/**
	 * Set the <code>P_YEAR</code> parameter IN value to the routine
	 */
	public void setPYear(Number value) {
		setNumber(P_YEAR, value);
	}
}
