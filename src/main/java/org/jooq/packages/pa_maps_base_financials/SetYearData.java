/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_base_financials;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsBaseFinancials;


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
public class SetYearData extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1080512502;

	/**
	 * The parameter <code>WETRN.PA_MAPS_BASE_FINANCIALS.SET_YEAR_DATA.PMRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> PMRKT_ID = createParameter("PMRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_BASE_FINANCIALS.SET_YEAR_DATA.PVER_ID</code>.
	 */
	public static final Parameter<BigDecimal> PVER_ID = createParameter("PVER_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_BASE_FINANCIALS.SET_YEAR_DATA.PPERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> PPERD_ID = createParameter("PPERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_BASE_FINANCIALS.SET_YEAR_DATA.POBJCTV_ID</code>.
	 */
	public static final Parameter<BigDecimal> POBJCTV_ID = createParameter("POBJCTV_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public SetYearData() {
		super("SET_YEAR_DATA", Wetrn.WETRN, PaMapsBaseFinancials.PA_MAPS_BASE_FINANCIALS);

		addInParameter(PMRKT_ID);
		addInParameter(PVER_ID);
		addInParameter(PPERD_ID);
		addInParameter(POBJCTV_ID);
	}

	/**
	 * Set the <code>PMRKT_ID</code> parameter IN value to the routine
	 */
	public void setPmrktId(Number value) {
		setNumber(PMRKT_ID, value);
	}

	/**
	 * Set the <code>PVER_ID</code> parameter IN value to the routine
	 */
	public void setPverId(Number value) {
		setNumber(PVER_ID, value);
	}

	/**
	 * Set the <code>PPERD_ID</code> parameter IN value to the routine
	 */
	public void setPperdId(Number value) {
		setNumber(PPERD_ID, value);
	}

	/**
	 * Set the <code>POBJCTV_ID</code> parameter IN value to the routine
	 */
	public void setPobjctvId(Number value) {
		setNumber(POBJCTV_ID, value);
	}
}
