/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_anz_reassign_bl_ms;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmAnzReassignBlMs;


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
public class GetReassignMsName extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 56457916;

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_REASSIGN_MS_NAME.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_REASSIGN_MS_NAME.P_LEAD_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LEAD_MRKT_ID = createParameter("P_LEAD_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_REASSIGN_MS_NAME.P_FROM_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_FROM_OFFR_PERD_ID = createParameter("P_FROM_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_REASSIGN_MS_NAME.P_TO_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_TO_OFFR_PERD_ID = createParameter("P_TO_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_REASSIGN_MS_NAME.P_SET_NAME</code>.
	 */
	public static final Parameter<String> P_SET_NAME = createParameter("P_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetReassignMsName() {
		super("GET_REASSIGN_MS_NAME", Wetrn.WETRN, AppLnmAnzReassignBlMs.APP_LNM_ANZ_REASSIGN_BL_MS, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_LEAD_MRKT_ID);
		addInParameter(P_FROM_OFFR_PERD_ID);
		addInParameter(P_TO_OFFR_PERD_ID);
		addInParameter(P_SET_NAME);
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
	 * Set the <code>P_FROM_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPFromOffrPerdId(Number value) {
		setNumber(P_FROM_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_FROM_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPFromOffrPerdId(Field<? extends Number> field) {
		setNumber(P_FROM_OFFR_PERD_ID, field);
	}

	/**
	 * Set the <code>P_TO_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPToOffrPerdId(Number value) {
		setNumber(P_TO_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_TO_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPToOffrPerdId(Field<? extends Number> field) {
		setNumber(P_TO_OFFR_PERD_ID, field);
	}

	/**
	 * Set the <code>P_SET_NAME</code> parameter IN value to the routine
	 */
	public void setPSetName(String value) {
		setValue(P_SET_NAME, value);
	}

	/**
	 * Set the <code>P_SET_NAME</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSetName(Field<String> field) {
		setField(P_SET_NAME, field);
	}
}
