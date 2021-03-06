/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_anz_reassign_bl_mi;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmAnzReassignBlMi;


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
public class CheckLineNrUsage extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -324155264;

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MI.CHECK_LINE_NR_USAGE.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MI.CHECK_LINE_NR_USAGE.P_CLUSTER_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_CLUSTER_ID = createParameter("P_CLUSTER_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MI.CHECK_LINE_NR_USAGE.P_LEAD_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LEAD_MRKT_ID = createParameter("P_LEAD_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MI.CHECK_LINE_NR_USAGE.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MI.CHECK_LINE_NR_USAGE.P_OFFR_SKU_LINE_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_SKU_LINE_ID = createParameter("P_OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MI.CHECK_LINE_NR_USAGE.P_LINE_NR</code>.
	 */
	public static final Parameter<String> P_LINE_NR = createParameter("P_LINE_NR", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MI.CHECK_LINE_NR_USAGE.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public CheckLineNrUsage() {
		super("CHECK_LINE_NR_USAGE", Wetrn.WETRN, AppLnmAnzReassignBlMi.APP_LNM_ANZ_REASSIGN_BL_MI, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_CLUSTER_ID);
		addInParameter(P_LEAD_MRKT_ID);
		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_SKU_LINE_ID);
		addInParameter(P_LINE_NR);
		addInParameter(P_OFFR_PERD_ID);
	}

	/**
	 * Set the <code>P_CLUSTER_ID</code> parameter IN value to the routine
	 */
	public void setPClusterId(Number value) {
		setNumber(P_CLUSTER_ID, value);
	}

	/**
	 * Set the <code>P_CLUSTER_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPClusterId(Field<? extends Number> field) {
		setNumber(P_CLUSTER_ID, field);
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
	 * Set the <code>P_LINE_NR</code> parameter IN value to the routine
	 */
	public void setPLineNr(String value) {
		setValue(P_LINE_NR, value);
	}

	/**
	 * Set the <code>P_LINE_NR</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLineNr(Field<String> field) {
		setField(P_LINE_NR, field);
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
