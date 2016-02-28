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
public class PrOslUnitSplitFix extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -202140189;

	/**
	 * The parameter <code>WETRN.PR_OSL_UNIT_SPLIT_FIX.V_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> V_MRKT_ID = createParameter("V_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PR_OSL_UNIT_SPLIT_FIX.V_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> V_PERD_ID = createParameter("V_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public PrOslUnitSplitFix() {
		super("PR_OSL_UNIT_SPLIT_FIX", Wetrn.WETRN);

		addInParameter(V_MRKT_ID);
		addInParameter(V_PERD_ID);
	}

	/**
	 * Set the <code>V_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setVMrktId(Number value) {
		setNumber(V_MRKT_ID, value);
	}

	/**
	 * Set the <code>V_PERD_ID</code> parameter IN value to the routine
	 */
	public void setVPerdId(Number value) {
		setNumber(V_PERD_ID, value);
	}
}
