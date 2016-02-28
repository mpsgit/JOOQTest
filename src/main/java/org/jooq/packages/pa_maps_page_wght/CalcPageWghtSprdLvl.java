/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_page_wght;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsPageWght;


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
public class CalcPageWghtSprdLvl extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 1831105982;

	/**
	 * The parameter <code>WETRN.PA_MAPS_PAGE_WGHT.CALC_PAGE_WGHT_SPRD_LVL.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_PAGE_WGHT.CALC_PAGE_WGHT_SPRD_LVL.P_OFFR_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_ID = createParameter("P_OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_PAGE_WGHT.CALC_PAGE_WGHT_SPRD_LVL.P_USER_ID</code>.
	 */
	public static final Parameter<String> P_USER_ID = createParameter("P_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public CalcPageWghtSprdLvl() {
		super("CALC_PAGE_WGHT_SPRD_LVL", Wetrn.WETRN, PaMapsPageWght.PA_MAPS_PAGE_WGHT, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_OFFR_ID);
		addInParameter(P_USER_ID);
	}

	/**
	 * Set the <code>P_OFFR_ID</code> parameter IN value to the routine
	 */
	public void setPOffrId(Number value) {
		setNumber(P_OFFR_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffrId(Field<? extends Number> field) {
		setNumber(P_OFFR_ID, field);
	}

	/**
	 * Set the <code>P_USER_ID</code> parameter IN value to the routine
	 */
	public void setPUserId(String value) {
		setValue(P_USER_ID, value);
	}

	/**
	 * Set the <code>P_USER_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPUserId(Field<String> field) {
		setField(P_USER_ID, field);
	}
}