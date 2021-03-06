/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_cena_reassign_bl_ms;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmCenaReassignBlMs;


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
public class GetReassignMsByLineNr extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -631666990;

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_REASSIGN_BL_MS.GET_REASSIGN_MS_BY_LINE_NR.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_REASSIGN_BL_MS.GET_REASSIGN_MS_BY_LINE_NR.P_LEAD_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LEAD_MRKT_ID = createParameter("P_LEAD_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_REASSIGN_BL_MS.GET_REASSIGN_MS_BY_LINE_NR.P_STRT_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_STRT_OFFR_PERD_ID = createParameter("P_STRT_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_REASSIGN_BL_MS.GET_REASSIGN_MS_BY_LINE_NR.P_END_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_END_OFFR_PERD_ID = createParameter("P_END_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_REASSIGN_BL_MS.GET_REASSIGN_MS_BY_LINE_NR.P_SET_LINE_NR</code>.
	 */
	public static final Parameter<String> P_SET_LINE_NR = createParameter("P_SET_LINE_NR", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetReassignMsByLineNr() {
		super("GET_REASSIGN_MS_BY_LINE_NR", Wetrn.WETRN, AppLnmCenaReassignBlMs.APP_LNM_CENA_REASSIGN_BL_MS, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_LEAD_MRKT_ID);
		addInParameter(P_STRT_OFFR_PERD_ID);
		addInParameter(P_END_OFFR_PERD_ID);
		addInParameter(P_SET_LINE_NR);
	}

	/**
	 * Set the <code>P_LEAD_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPLeadMrktId(Number value) {
		setNumber(P_LEAD_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_LEAD_MRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLeadMrktId(Field<? extends Number> field) {
		setNumber(P_LEAD_MRKT_ID, field);
	}

	/**
	 * Set the <code>P_STRT_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPStrtOffrPerdId(Number value) {
		setNumber(P_STRT_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_STRT_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPStrtOffrPerdId(Field<? extends Number> field) {
		setNumber(P_STRT_OFFR_PERD_ID, field);
	}

	/**
	 * Set the <code>P_END_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPEndOffrPerdId(Number value) {
		setNumber(P_END_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_END_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPEndOffrPerdId(Field<? extends Number> field) {
		setNumber(P_END_OFFR_PERD_ID, field);
	}

	/**
	 * Set the <code>P_SET_LINE_NR</code> parameter IN value to the routine
	 */
	public void setPSetLineNr(String value) {
		setValue(P_SET_LINE_NR, value);
	}

	/**
	 * Set the <code>P_SET_LINE_NR</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSetLineNr(Field<String> field) {
		setField(P_SET_LINE_NR, field);
	}
}
