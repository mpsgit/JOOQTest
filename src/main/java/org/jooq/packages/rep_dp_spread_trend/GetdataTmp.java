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
public class GetdataTmp extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -1338687198;

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.GETDATA_TMP.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.GETDATA_TMP.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.GETDATA_TMP.P_VEH_IDS</code>.
	 */
	public static final Parameter<String> P_VEH_IDS = createParameter("P_VEH_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.GETDATA_TMP.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.GETDATA_TMP.P_BRCHR_PLCMT_ID</code>.
	 */
	public static final Parameter<String> P_BRCHR_PLCMT_ID = createParameter("P_BRCHR_PLCMT_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.GETDATA_TMP.P_VER_ID1</code>.
	 */
	public static final Parameter<BigDecimal> P_VER_ID1 = createParameter("P_VER_ID1", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.GETDATA_TMP.P_VER_ID2</code>.
	 */
	public static final Parameter<BigDecimal> P_VER_ID2 = createParameter("P_VER_ID2", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.GETDATA_TMP.P_VER_ID3</code>.
	 */
	public static final Parameter<BigDecimal> P_VER_ID3 = createParameter("P_VER_ID3", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.GETDATA_TMP.P_OFFSET_MIN</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFSET_MIN = createParameter("P_OFFSET_MIN", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.GETDATA_TMP.P_OFFSET_MAX</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFSET_MAX = createParameter("P_OFFSET_MAX", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_DP_SPREAD_TREND.GETDATA_TMP.P_CURRENCY</code>.
	 */
	public static final Parameter<String> P_CURRENCY = createParameter("P_CURRENCY", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetdataTmp() {
		super("GETDATA_TMP", Wetrn.WETRN, RepDpSpreadTrend.REP_DP_SPREAD_TREND, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_VEH_IDS);
		addInParameter(P_OFFR_PERD_ID);
		addInParameter(P_BRCHR_PLCMT_ID);
		addInParameter(P_VER_ID1);
		addInParameter(P_VER_ID2);
		addInParameter(P_VER_ID3);
		addInParameter(P_OFFSET_MIN);
		addInParameter(P_OFFSET_MAX);
		addInParameter(P_CURRENCY);
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

	/**
	 * Set the <code>P_BRCHR_PLCMT_ID</code> parameter IN value to the routine
	 */
	public void setPBrchrPlcmtId(String value) {
		setValue(P_BRCHR_PLCMT_ID, value);
	}

	/**
	 * Set the <code>P_BRCHR_PLCMT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPBrchrPlcmtId(Field<String> field) {
		setField(P_BRCHR_PLCMT_ID, field);
	}

	/**
	 * Set the <code>P_VER_ID1</code> parameter IN value to the routine
	 */
	public void setPVerId1(Number value) {
		setNumber(P_VER_ID1, value);
	}

	/**
	 * Set the <code>P_VER_ID1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPVerId1(Field<? extends Number> field) {
		setNumber(P_VER_ID1, field);
	}

	/**
	 * Set the <code>P_VER_ID2</code> parameter IN value to the routine
	 */
	public void setPVerId2(Number value) {
		setNumber(P_VER_ID2, value);
	}

	/**
	 * Set the <code>P_VER_ID2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPVerId2(Field<? extends Number> field) {
		setNumber(P_VER_ID2, field);
	}

	/**
	 * Set the <code>P_VER_ID3</code> parameter IN value to the routine
	 */
	public void setPVerId3(Number value) {
		setNumber(P_VER_ID3, value);
	}

	/**
	 * Set the <code>P_VER_ID3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPVerId3(Field<? extends Number> field) {
		setNumber(P_VER_ID3, field);
	}

	/**
	 * Set the <code>P_OFFSET_MIN</code> parameter IN value to the routine
	 */
	public void setPOffsetMin(Number value) {
		setNumber(P_OFFSET_MIN, value);
	}

	/**
	 * Set the <code>P_OFFSET_MIN</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffsetMin(Field<? extends Number> field) {
		setNumber(P_OFFSET_MIN, field);
	}

	/**
	 * Set the <code>P_OFFSET_MAX</code> parameter IN value to the routine
	 */
	public void setPOffsetMax(Number value) {
		setNumber(P_OFFSET_MAX, value);
	}

	/**
	 * Set the <code>P_OFFSET_MAX</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffsetMax(Field<? extends Number> field) {
		setNumber(P_OFFSET_MAX, field);
	}

	/**
	 * Set the <code>P_CURRENCY</code> parameter IN value to the routine
	 */
	public void setPCurrency(String value) {
		setValue(P_CURRENCY, value);
	}

	/**
	 * Set the <code>P_CURRENCY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPCurrency(Field<String> field) {
		setField(P_CURRENCY, field);
	}
}
