/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_uk_reassign_bl_ms;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmUkReassignBlMs;


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
public class GetAssignableLineNrs extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 592423994;

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_BL_MS.GET_ASSIGNABLE_LINE_NRS.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_BL_MS.GET_ASSIGNABLE_LINE_NRS.P_CLUSTER_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_CLUSTER_ID = createParameter("P_CLUSTER_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_BL_MS.GET_ASSIGNABLE_LINE_NRS.P_LEAD_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LEAD_MRKT_ID = createParameter("P_LEAD_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_BL_MS.GET_ASSIGNABLE_LINE_NRS.P_OFFR_SKU_SET_IDS</code>.
	 */
	public static final Parameter<String> P_OFFR_SKU_SET_IDS = createParameter("P_OFFR_SKU_SET_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_BL_MS.GET_ASSIGNABLE_LINE_NRS.P_LINE_NR_TYPE_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LINE_NR_TYPE_ID = createParameter("P_LINE_NR_TYPE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_BL_MS.GET_ASSIGNABLE_LINE_NRS.P_SELECTED_LINE_NRS</code>.
	 */
	public static final Parameter<String> P_SELECTED_LINE_NRS = createParameter("P_SELECTED_LINE_NRS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetAssignableLineNrs() {
		super("GET_ASSIGNABLE_LINE_NRS", Wetrn.WETRN, AppLnmUkReassignBlMs.APP_LNM_UK_REASSIGN_BL_MS, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_CLUSTER_ID);
		addInParameter(P_LEAD_MRKT_ID);
		addInParameter(P_OFFR_SKU_SET_IDS);
		addInParameter(P_LINE_NR_TYPE_ID);
		addInParameter(P_SELECTED_LINE_NRS);
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
	 * Set the <code>P_OFFR_SKU_SET_IDS</code> parameter IN value to the routine
	 */
	public void setPOffrSkuSetIds(String value) {
		setValue(P_OFFR_SKU_SET_IDS, value);
	}

	/**
	 * Set the <code>P_OFFR_SKU_SET_IDS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffrSkuSetIds(Field<String> field) {
		setField(P_OFFR_SKU_SET_IDS, field);
	}

	/**
	 * Set the <code>P_LINE_NR_TYPE_ID</code> parameter IN value to the routine
	 */
	public void setPLineNrTypeId(Number value) {
		setNumber(P_LINE_NR_TYPE_ID, value);
	}

	/**
	 * Set the <code>P_LINE_NR_TYPE_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLineNrTypeId(Field<? extends Number> field) {
		setNumber(P_LINE_NR_TYPE_ID, field);
	}

	/**
	 * Set the <code>P_SELECTED_LINE_NRS</code> parameter IN value to the routine
	 */
	public void setPSelectedLineNrs(String value) {
		setValue(P_SELECTED_LINE_NRS, value);
	}

	/**
	 * Set the <code>P_SELECTED_LINE_NRS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSelectedLineNrs(Field<String> field) {
		setField(P_SELECTED_LINE_NRS, field);
	}
}
