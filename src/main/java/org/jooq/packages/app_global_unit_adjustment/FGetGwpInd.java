/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_global_unit_adjustment;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppGlobalUnitAdjustment;


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
public class FGetGwpInd extends AbstractRoutine<String> {

	private static final long serialVersionUID = 291497161;

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_GWP_IND.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_GWP_IND.P_OFFR_SKU_LINE_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_SKU_LINE_ID = createParameter("P_OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_GWP_IND.P_OFFR_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_ID = createParameter("P_OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public FGetGwpInd() {
		super("F_GET_GWP_IND", Wetrn.WETRN, AppGlobalUnitAdjustment.APP_GLOBAL_UNIT_ADJUSTMENT, org.jooq.impl.SQLDataType.CHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_OFFR_SKU_LINE_ID);
		addInParameter(P_OFFR_ID);
	}

	/**
	 * Set the <code>P_OFFR_SKU_LINE_ID</code> parameter IN value to the routine
	 */
	public void setPOffrSkuLineId(Number value) {
		setNumber(P_OFFR_SKU_LINE_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_SKU_LINE_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffrSkuLineId(Field<? extends Number> field) {
		setNumber(P_OFFR_SKU_LINE_ID, field);
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
}