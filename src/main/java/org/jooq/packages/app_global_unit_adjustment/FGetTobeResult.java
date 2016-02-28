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
public class FGetTobeResult extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 601474506;

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT.P_VEHICLE_IDS</code>.
	 */
	public static final Parameter<String> P_VEHICLE_IDS = createParameter("P_VEHICLE_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT.P_VARIANCE</code>.
	 */
	public static final Parameter<String> P_VARIANCE = createParameter("P_VARIANCE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<String> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT.P_SALES_TYPE_ID</code>.
	 */
	public static final Parameter<String> P_SALES_TYPE_ID = createParameter("P_SALES_TYPE_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT.P_SUPPORT_BUDGET</code>.
	 */
	public static final Parameter<String> P_SUPPORT_BUDGET = createParameter("P_SUPPORT_BUDGET", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT.P_SALES_AIDS</code>.
	 */
	public static final Parameter<String> P_SALES_AIDS = createParameter("P_SALES_AIDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT.P_IMPACT_CATEGORY</code>.
	 */
	public static final Parameter<String> P_IMPACT_CATEGORY = createParameter("P_IMPACT_CATEGORY", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT.P_GRPBY_FLAG</code>.
	 */
	public static final Parameter<String> P_GRPBY_FLAG = createParameter("P_GRPBY_FLAG", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT.P_CATEGORY_IDS</code>.
	 */
	public static final Parameter<String> P_CATEGORY_IDS = createParameter("P_CATEGORY_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public FGetTobeResult() {
		super("F_GET_TOBE_RESULT", Wetrn.WETRN, AppGlobalUnitAdjustment.APP_GLOBAL_UNIT_ADJUSTMENT, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_VEHICLE_IDS);
		addInParameter(P_VARIANCE);
		addInParameter(P_OFFR_PERD_ID);
		addInParameter(P_SALES_TYPE_ID);
		addInParameter(P_SUPPORT_BUDGET);
		addInParameter(P_SALES_AIDS);
		addInParameter(P_IMPACT_CATEGORY);
		addInParameter(P_GRPBY_FLAG);
		addInParameter(P_CATEGORY_IDS);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPMrktId(Number value) {
		setNumber(P_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMrktId(Field<? extends Number> field) {
		setNumber(P_MRKT_ID, field);
	}

	/**
	 * Set the <code>P_VEHICLE_IDS</code> parameter IN value to the routine
	 */
	public void setPVehicleIds(String value) {
		setValue(P_VEHICLE_IDS, value);
	}

	/**
	 * Set the <code>P_VEHICLE_IDS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPVehicleIds(Field<String> field) {
		setField(P_VEHICLE_IDS, field);
	}

	/**
	 * Set the <code>P_VARIANCE</code> parameter IN value to the routine
	 */
	public void setPVariance(String value) {
		setValue(P_VARIANCE, value);
	}

	/**
	 * Set the <code>P_VARIANCE</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPVariance(Field<String> field) {
		setField(P_VARIANCE, field);
	}

	/**
	 * Set the <code>P_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPOffrPerdId(String value) {
		setValue(P_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffrPerdId(Field<String> field) {
		setField(P_OFFR_PERD_ID, field);
	}

	/**
	 * Set the <code>P_SALES_TYPE_ID</code> parameter IN value to the routine
	 */
	public void setPSalesTypeId(String value) {
		setValue(P_SALES_TYPE_ID, value);
	}

	/**
	 * Set the <code>P_SALES_TYPE_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSalesTypeId(Field<String> field) {
		setField(P_SALES_TYPE_ID, field);
	}

	/**
	 * Set the <code>P_SUPPORT_BUDGET</code> parameter IN value to the routine
	 */
	public void setPSupportBudget(String value) {
		setValue(P_SUPPORT_BUDGET, value);
	}

	/**
	 * Set the <code>P_SUPPORT_BUDGET</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSupportBudget(Field<String> field) {
		setField(P_SUPPORT_BUDGET, field);
	}

	/**
	 * Set the <code>P_SALES_AIDS</code> parameter IN value to the routine
	 */
	public void setPSalesAids(String value) {
		setValue(P_SALES_AIDS, value);
	}

	/**
	 * Set the <code>P_SALES_AIDS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSalesAids(Field<String> field) {
		setField(P_SALES_AIDS, field);
	}

	/**
	 * Set the <code>P_IMPACT_CATEGORY</code> parameter IN value to the routine
	 */
	public void setPImpactCategory(String value) {
		setValue(P_IMPACT_CATEGORY, value);
	}

	/**
	 * Set the <code>P_IMPACT_CATEGORY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPImpactCategory(Field<String> field) {
		setField(P_IMPACT_CATEGORY, field);
	}

	/**
	 * Set the <code>P_GRPBY_FLAG</code> parameter IN value to the routine
	 */
	public void setPGrpbyFlag(String value) {
		setValue(P_GRPBY_FLAG, value);
	}

	/**
	 * Set the <code>P_GRPBY_FLAG</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPGrpbyFlag(Field<String> field) {
		setField(P_GRPBY_FLAG, field);
	}

	/**
	 * Set the <code>P_CATEGORY_IDS</code> parameter IN value to the routine
	 */
	public void setPCategoryIds(String value) {
		setValue(P_CATEGORY_IDS, value);
	}

	/**
	 * Set the <code>P_CATEGORY_IDS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPCategoryIds(Field<String> field) {
		setField(P_CATEGORY_IDS, field);
	}
}
