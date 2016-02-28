/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_cena_reassign_bl_mi;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmCenaReassignBlMi;


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
public class ModifyMiLineNr extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1034938042;

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_REASSIGN_BL_MI.MODIFY_MI_LINE_NR.P_OFFR_SKU_LINE_ID</code>.
	 */
	public static final Parameter<String> P_OFFR_SKU_LINE_ID = createParameter("P_OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_REASSIGN_BL_MI.MODIFY_MI_LINE_NR.P_LINE_NR_TYP_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LINE_NR_TYP_ID = createParameter("P_LINE_NR_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_REASSIGN_BL_MI.MODIFY_MI_LINE_NR.P_LINE_NR_GRP_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LINE_NR_GRP_ID = createParameter("P_LINE_NR_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_REASSIGN_BL_MI.MODIFY_MI_LINE_NR.P_LINE_NR</code>.
	 */
	public static final Parameter<String> P_LINE_NR = createParameter("P_LINE_NR", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_REASSIGN_BL_MI.MODIFY_MI_LINE_NR.P_USER_ID</code>.
	 */
	public static final Parameter<String> P_USER_ID = createParameter("P_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public ModifyMiLineNr() {
		super("MODIFY_MI_LINE_NR", Wetrn.WETRN, AppLnmCenaReassignBlMi.APP_LNM_CENA_REASSIGN_BL_MI);

		addInParameter(P_OFFR_SKU_LINE_ID);
		addInParameter(P_LINE_NR_TYP_ID);
		addInParameter(P_LINE_NR_GRP_ID);
		addInParameter(P_LINE_NR);
		addInParameter(P_USER_ID);
	}

	/**
	 * Set the <code>P_OFFR_SKU_LINE_ID</code> parameter IN value to the routine
	 */
	public void setPOffrSkuLineId(String value) {
		setValue(P_OFFR_SKU_LINE_ID, value);
	}

	/**
	 * Set the <code>P_LINE_NR_TYP_ID</code> parameter IN value to the routine
	 */
	public void setPLineNrTypId(Number value) {
		setNumber(P_LINE_NR_TYP_ID, value);
	}

	/**
	 * Set the <code>P_LINE_NR_GRP_ID</code> parameter IN value to the routine
	 */
	public void setPLineNrGrpId(Number value) {
		setNumber(P_LINE_NR_GRP_ID, value);
	}

	/**
	 * Set the <code>P_LINE_NR</code> parameter IN value to the routine
	 */
	public void setPLineNr(String value) {
		setValue(P_LINE_NR, value);
	}

	/**
	 * Set the <code>P_USER_ID</code> parameter IN value to the routine
	 */
	public void setPUserId(String value) {
		setValue(P_USER_ID, value);
	}
}
