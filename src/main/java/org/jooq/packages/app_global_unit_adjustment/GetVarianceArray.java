/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_global_unit_adjustment;


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
public class GetVarianceArray extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -279689292;

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.GET_VARIANCE_ARRAY.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.GET_VARIANCE_ARRAY.P_VEHICLE_IDS</code>.
	 */
	public static final Parameter<String> P_VEHICLE_IDS = createParameter("P_VEHICLE_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.GET_VARIANCE_ARRAY.P_VARIANCE</code>.
	 */
	public static final Parameter<String> P_VARIANCE = createParameter("P_VARIANCE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetVarianceArray() {
		super("GET_VARIANCE_ARRAY", Wetrn.WETRN, AppGlobalUnitAdjustment.APP_GLOBAL_UNIT_ADJUSTMENT, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_VEHICLE_IDS);
		addInParameter(P_VARIANCE);
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
}
