/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_dp_estimate_vehicle;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppDpEstimateVehicle;


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
public class DpEstimateVehicle extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 105423337;

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_VEH_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_VEH_ID = createParameter("P_VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_BRCHR_PLCMT_IDS</code>.
	 */
	public static final Parameter<String> P_BRCHR_PLCMT_IDS = createParameter("P_BRCHR_PLCMT_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_CATGRY_IDS</code>.
	 */
	public static final Parameter<String> P_CATGRY_IDS = createParameter("P_CATGRY_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_BRND_FMLY_IDS</code>.
	 */
	public static final Parameter<String> P_BRND_FMLY_IDS = createParameter("P_BRND_FMLY_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_SLS_TYP_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SLS_TYP_ID = createParameter("P_SLS_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_ORDER_COUNT</code>.
	 */
	public static final Parameter<BigDecimal> P_ORDER_COUNT = createParameter("P_ORDER_COUNT", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_PRICE_MATCHING_METHOD</code>.
	 */
	public static final Parameter<String> P_PRICE_MATCHING_METHOD = createParameter("P_PRICE_MATCHING_METHOD", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_PRICE_RANGE_PCT</code>.
	 */
	public static final Parameter<BigDecimal> P_PRICE_RANGE_PCT = createParameter("P_PRICE_RANGE_PCT", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_MATCH_NR_FOR_QTY</code>.
	 */
	public static final Parameter<String> P_MATCH_NR_FOR_QTY = createParameter("P_MATCH_NR_FOR_QTY", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_MATCH_VEH_ID</code>.
	 */
	public static final Parameter<String> P_MATCH_VEH_ID = createParameter("P_MATCH_VEH_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_MATCH_PROMTN_CLM_ID</code>.
	 */
	public static final Parameter<String> P_MATCH_PROMTN_CLM_ID = createParameter("P_MATCH_PROMTN_CLM_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_MATCH_ITEMS</code>.
	 */
	public static final Parameter<String> P_MATCH_ITEMS = createParameter("P_MATCH_ITEMS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_RUN_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_RUN_ID = createParameter("P_RUN_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_DP_ESTIMATE_VEHICLE.DP_ESTIMATE_VEHICLE.P_USER_ID</code>.
	 */
	public static final Parameter<String> P_USER_ID = createParameter("P_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public DpEstimateVehicle() {
		super("DP_ESTIMATE_VEHICLE", Wetrn.WETRN, AppDpEstimateVehicle.APP_DP_ESTIMATE_VEHICLE);

		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
		addInParameter(P_VEH_ID);
		addInParameter(P_BRCHR_PLCMT_IDS);
		addInParameter(P_CATGRY_IDS);
		addInParameter(P_BRND_FMLY_IDS);
		addInParameter(P_SLS_TYP_ID);
		addInParameter(P_ORDER_COUNT);
		addInParameter(P_PRICE_MATCHING_METHOD);
		addInParameter(P_PRICE_RANGE_PCT);
		addInParameter(P_MATCH_NR_FOR_QTY);
		addInParameter(P_MATCH_VEH_ID);
		addInParameter(P_MATCH_PROMTN_CLM_ID);
		addInParameter(P_MATCH_ITEMS);
		addInParameter(P_RUN_ID);
		addInParameter(P_USER_ID);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPMrktId(Number value) {
		setNumber(P_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPOffrPerdId(Number value) {
		setNumber(P_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_VEH_ID</code> parameter IN value to the routine
	 */
	public void setPVehId(Number value) {
		setNumber(P_VEH_ID, value);
	}

	/**
	 * Set the <code>P_BRCHR_PLCMT_IDS</code> parameter IN value to the routine
	 */
	public void setPBrchrPlcmtIds(String value) {
		setValue(P_BRCHR_PLCMT_IDS, value);
	}

	/**
	 * Set the <code>P_CATGRY_IDS</code> parameter IN value to the routine
	 */
	public void setPCatgryIds(String value) {
		setValue(P_CATGRY_IDS, value);
	}

	/**
	 * Set the <code>P_BRND_FMLY_IDS</code> parameter IN value to the routine
	 */
	public void setPBrndFmlyIds(String value) {
		setValue(P_BRND_FMLY_IDS, value);
	}

	/**
	 * Set the <code>P_SLS_TYP_ID</code> parameter IN value to the routine
	 */
	public void setPSlsTypId(Number value) {
		setNumber(P_SLS_TYP_ID, value);
	}

	/**
	 * Set the <code>P_ORDER_COUNT</code> parameter IN value to the routine
	 */
	public void setPOrderCount(Number value) {
		setNumber(P_ORDER_COUNT, value);
	}

	/**
	 * Set the <code>P_PRICE_MATCHING_METHOD</code> parameter IN value to the routine
	 */
	public void setPPriceMatchingMethod(String value) {
		setValue(P_PRICE_MATCHING_METHOD, value);
	}

	/**
	 * Set the <code>P_PRICE_RANGE_PCT</code> parameter IN value to the routine
	 */
	public void setPPriceRangePct(Number value) {
		setNumber(P_PRICE_RANGE_PCT, value);
	}

	/**
	 * Set the <code>P_MATCH_NR_FOR_QTY</code> parameter IN value to the routine
	 */
	public void setPMatchNrForQty(String value) {
		setValue(P_MATCH_NR_FOR_QTY, value);
	}

	/**
	 * Set the <code>P_MATCH_VEH_ID</code> parameter IN value to the routine
	 */
	public void setPMatchVehId(String value) {
		setValue(P_MATCH_VEH_ID, value);
	}

	/**
	 * Set the <code>P_MATCH_PROMTN_CLM_ID</code> parameter IN value to the routine
	 */
	public void setPMatchPromtnClmId(String value) {
		setValue(P_MATCH_PROMTN_CLM_ID, value);
	}

	/**
	 * Set the <code>P_MATCH_ITEMS</code> parameter IN value to the routine
	 */
	public void setPMatchItems(String value) {
		setValue(P_MATCH_ITEMS, value);
	}

	/**
	 * Set the <code>P_RUN_ID</code> parameter IN value to the routine
	 */
	public void setPRunId(Number value) {
		setNumber(P_RUN_ID, value);
	}

	/**
	 * Set the <code>P_USER_ID</code> parameter IN value to the routine
	 */
	public void setPUserId(String value) {
		setValue(P_USER_ID, value);
	}
}
