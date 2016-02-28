/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_sea_ms_bl_reassign;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmSeaMsBlReassign;


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
public class CheckMsFscUsage extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 1359522708;

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN.CHECK_MS_FSC_USAGE.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN.CHECK_MS_FSC_USAGE.P_OFFR_SKU_SET_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_SKU_SET_ID = createParameter("P_OFFR_SKU_SET_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN.CHECK_MS_FSC_USAGE.P_LEAD_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LEAD_MRKT_ID = createParameter("P_LEAD_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN.CHECK_MS_FSC_USAGE.P_FSC</code>.
	 */
	public static final Parameter<String> P_FSC = createParameter("P_FSC", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN.CHECK_MS_FSC_USAGE.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public CheckMsFscUsage() {
		super("CHECK_MS_FSC_USAGE", Wetrn.WETRN, AppLnmSeaMsBlReassign.APP_LNM_SEA_MS_BL_REASSIGN, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_OFFR_SKU_SET_ID);
		addInParameter(P_LEAD_MRKT_ID);
		addInParameter(P_FSC);
		addInParameter(P_OFFR_PERD_ID);
	}

	/**
	 * Set the <code>P_OFFR_SKU_SET_ID</code> parameter IN value to the routine
	 */
	public void setPOffrSkuSetId(Number value) {
		setNumber(P_OFFR_SKU_SET_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_SKU_SET_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffrSkuSetId(Field<? extends Number> field) {
		setNumber(P_OFFR_SKU_SET_ID, field);
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
	 * Set the <code>P_FSC</code> parameter IN value to the routine
	 */
	public void setPFsc(String value) {
		setValue(P_FSC, value);
	}

	/**
	 * Set the <code>P_FSC</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPFsc(Field<String> field) {
		setField(P_FSC, field);
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
