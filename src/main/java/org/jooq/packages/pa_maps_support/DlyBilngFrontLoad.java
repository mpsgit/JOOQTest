/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_support;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsSupport;


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
public class DlyBilngFrontLoad extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1375515831;

	/**
	 * The parameter <code>WETRN.PA_MAPS_SUPPORT.DLY_BILNG_FRONT_LOAD.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_SUPPORT.DLY_BILNG_FRONT_LOAD.P_SLS_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SLS_PERD_ID = createParameter("P_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_SUPPORT.DLY_BILNG_FRONT_LOAD.P_DEBUGGING</code>.
	 */
	public static final Parameter<BigDecimal> P_DEBUGGING = createParameter("P_DEBUGGING", org.jooq.impl.SQLDataType.NUMERIC.defaulted(true), true);

	/**
	 * Create a new routine call instance
	 */
	public DlyBilngFrontLoad() {
		super("DLY_BILNG_FRONT_LOAD", Wetrn.WETRN, PaMapsSupport.PA_MAPS_SUPPORT);

		addInParameter(P_MRKT_ID);
		addInParameter(P_SLS_PERD_ID);
		addInParameter(P_DEBUGGING);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPMrktId(Number value) {
		setNumber(P_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_SLS_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPSlsPerdId(Number value) {
		setNumber(P_SLS_PERD_ID, value);
	}

	/**
	 * Set the <code>P_DEBUGGING</code> parameter IN value to the routine
	 */
	public void setPDebugging(Number value) {
		setNumber(P_DEBUGGING, value);
	}
}
