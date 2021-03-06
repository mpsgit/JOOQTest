/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.rep_dp_spread_trend;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.RepDpSpreadTrend;


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
public class FGetCollection extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 1633940538;

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.F_GET_COLLECTION.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.F_GET_COLLECTION.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.F_GET_COLLECTION.P_VEH_IDS</code>.
	 */
	public static final Parameter<String> P_VEH_IDS = createParameter("P_VEH_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.F_GET_COLLECTION.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public FGetCollection() {
		super("F_GET_COLLECTION", Wetrn.WETRN, RepDpSpreadTrend.REP_DP_SPREAD_TREND, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_VEH_IDS);
		addInParameter(P_OFFR_PERD_ID);
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
	 * Set the <code>P_VEH_IDS</code> parameter IN value to the routine
	 */
	public void setPVehIds(String value) {
		setValue(P_VEH_IDS, value);
	}

	/**
	 * Set the <code>P_VEH_IDS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPVehIds(Field<String> field) {
		setField(P_VEH_IDS, field);
	}

	/**
	 * Set the <code>P_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPOffrPerdId(Number value) {
		setNumber(P_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffrPerdId(Field<? extends Number> field) {
		setNumber(P_OFFR_PERD_ID, field);
	}
}
