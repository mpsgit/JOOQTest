/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_product_launch;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppProductLaunch;


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
public class GetMetricsDataForHeader extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -459095852;

	/**
	 * The parameter <code>WETRN.APP_PRODUCT_LAUNCH.GET_METRICS_DATA_FOR_HEADER.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_PRODUCT_LAUNCH.GET_METRICS_DATA_FOR_HEADER.PMRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> PMRKT_ID = createParameter("PMRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_PRODUCT_LAUNCH.GET_METRICS_DATA_FOR_HEADER.PPRFL_CD</code>.
	 */
	public static final Parameter<BigDecimal> PPRFL_CD = createParameter("PPRFL_CD", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetMetricsDataForHeader() {
		super("GET_METRICS_DATA_FOR_HEADER", Wetrn.WETRN, AppProductLaunch.APP_PRODUCT_LAUNCH, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(PMRKT_ID);
		addInParameter(PPRFL_CD);
	}

	/**
	 * Set the <code>PMRKT_ID</code> parameter IN value to the routine
	 */
	public void setPmrktId(Number value) {
		setNumber(PMRKT_ID, value);
	}

	/**
	 * Set the <code>PMRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPmrktId(Field<? extends Number> field) {
		setNumber(PMRKT_ID, field);
	}

	/**
	 * Set the <code>PPRFL_CD</code> parameter IN value to the routine
	 */
	public void setPprflCd(Number value) {
		setNumber(PPRFL_CD, value);
	}

	/**
	 * Set the <code>PPRFL_CD</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPprflCd(Field<? extends Number> field) {
		setNumber(PPRFL_CD, field);
	}
}
