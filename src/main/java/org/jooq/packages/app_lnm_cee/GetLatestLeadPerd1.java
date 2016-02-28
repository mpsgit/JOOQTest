/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_cee;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmCee;


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
public class GetLatestLeadPerd1 extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 640940781;

	/**
	 * The parameter <code>WETRN.APP_LNM_CEE.GET_LATEST_LEAD_PERD.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CEE.GET_LATEST_LEAD_PERD.P_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_PERD_ID = createParameter("P_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetLatestLeadPerd1() {
		super("GET_LATEST_LEAD_PERD", Wetrn.WETRN, AppLnmCee.APP_LNM_CEE, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_PERD_ID);
		setOverloaded(true);
	}

	/**
	 * Set the <code>P_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPPerdId(Number value) {
		setNumber(P_PERD_ID, value);
	}

	/**
	 * Set the <code>P_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPPerdId(Field<? extends Number> field) {
		setNumber(P_PERD_ID, field);
	}
}
