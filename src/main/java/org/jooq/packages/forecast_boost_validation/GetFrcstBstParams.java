/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.forecast_boost_validation;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.ForecastBoostValidation;


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
public class GetFrcstBstParams extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -33532027;

	/**
	 * The parameter <code>WETRN.FORECAST_BOOST_VALIDATION.GET_FRCST_BST_PARAMS.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.FORECAST_BOOST_VALIDATION.GET_FRCST_BST_PARAMS.P_CLSTR_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_CLSTR_ID = createParameter("P_CLSTR_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.FORECAST_BOOST_VALIDATION.GET_FRCST_BST_PARAMS.P_SRCE_MRKT_IDS</code>.
	 */
	public static final Parameter<String> P_SRCE_MRKT_IDS = createParameter("P_SRCE_MRKT_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.FORECAST_BOOST_VALIDATION.GET_FRCST_BST_PARAMS.P_SRCE_PERD_IDS</code>.
	 */
	public static final Parameter<String> P_SRCE_PERD_IDS = createParameter("P_SRCE_PERD_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.FORECAST_BOOST_VALIDATION.GET_FRCST_BST_PARAMS.P_SRCE_VEH_IDS</code>.
	 */
	public static final Parameter<String> P_SRCE_VEH_IDS = createParameter("P_SRCE_VEH_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.FORECAST_BOOST_VALIDATION.GET_FRCST_BST_PARAMS.P_SRCE_VER_IDS</code>.
	 */
	public static final Parameter<String> P_SRCE_VER_IDS = createParameter("P_SRCE_VER_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.FORECAST_BOOST_VALIDATION.GET_FRCST_BST_PARAMS.P_USER_NM</code>.
	 */
	public static final Parameter<String> P_USER_NM = createParameter("P_USER_NM", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetFrcstBstParams() {
		super("GET_FRCST_BST_PARAMS", Wetrn.WETRN, ForecastBoostValidation.FORECAST_BOOST_VALIDATION, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_CLSTR_ID);
		addInParameter(P_SRCE_MRKT_IDS);
		addInParameter(P_SRCE_PERD_IDS);
		addInParameter(P_SRCE_VEH_IDS);
		addInParameter(P_SRCE_VER_IDS);
		addInParameter(P_USER_NM);
	}

	/**
	 * Set the <code>P_CLSTR_ID</code> parameter IN value to the routine
	 */
	public void setPClstrId(Number value) {
		setNumber(P_CLSTR_ID, value);
	}

	/**
	 * Set the <code>P_CLSTR_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPClstrId(Field<? extends Number> field) {
		setNumber(P_CLSTR_ID, field);
	}

	/**
	 * Set the <code>P_SRCE_MRKT_IDS</code> parameter IN value to the routine
	 */
	public void setPSrceMrktIds(String value) {
		setValue(P_SRCE_MRKT_IDS, value);
	}

	/**
	 * Set the <code>P_SRCE_MRKT_IDS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSrceMrktIds(Field<String> field) {
		setField(P_SRCE_MRKT_IDS, field);
	}

	/**
	 * Set the <code>P_SRCE_PERD_IDS</code> parameter IN value to the routine
	 */
	public void setPSrcePerdIds(String value) {
		setValue(P_SRCE_PERD_IDS, value);
	}

	/**
	 * Set the <code>P_SRCE_PERD_IDS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSrcePerdIds(Field<String> field) {
		setField(P_SRCE_PERD_IDS, field);
	}

	/**
	 * Set the <code>P_SRCE_VEH_IDS</code> parameter IN value to the routine
	 */
	public void setPSrceVehIds(String value) {
		setValue(P_SRCE_VEH_IDS, value);
	}

	/**
	 * Set the <code>P_SRCE_VEH_IDS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSrceVehIds(Field<String> field) {
		setField(P_SRCE_VEH_IDS, field);
	}

	/**
	 * Set the <code>P_SRCE_VER_IDS</code> parameter IN value to the routine
	 */
	public void setPSrceVerIds(String value) {
		setValue(P_SRCE_VER_IDS, value);
	}

	/**
	 * Set the <code>P_SRCE_VER_IDS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSrceVerIds(Field<String> field) {
		setField(P_SRCE_VER_IDS, field);
	}

	/**
	 * Set the <code>P_USER_NM</code> parameter IN value to the routine
	 */
	public void setPUserNm(String value) {
		setValue(P_USER_NM, value);
	}

	/**
	 * Set the <code>P_USER_NM</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPUserNm(Field<String> field) {
		setField(P_USER_NM, field);
	}
}
