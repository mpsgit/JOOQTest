/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_mca_mi_bl_reassign;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmMcaMiBlReassign;


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

	private static final long serialVersionUID = -857904788;

	/**
	 * The parameter <code>WETRN.APP_LNM_MCA_MI_BL_REASSIGN.GET_ASSIGNABLE_LINE_NRS.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_MCA_MI_BL_REASSIGN.GET_ASSIGNABLE_LINE_NRS.P_OFFR_SKU_LINE_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_SKU_LINE_ID = createParameter("P_OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_MCA_MI_BL_REASSIGN.GET_ASSIGNABLE_LINE_NRS.P_LINE_NR_TYP_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LINE_NR_TYP_ID = createParameter("P_LINE_NR_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_MCA_MI_BL_REASSIGN.GET_ASSIGNABLE_LINE_NRS.P_LINE_NR_GRP_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LINE_NR_GRP_ID = createParameter("P_LINE_NR_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetAssignableLineNrs() {
		super("GET_ASSIGNABLE_LINE_NRS", Wetrn.WETRN, AppLnmMcaMiBlReassign.APP_LNM_MCA_MI_BL_REASSIGN, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_OFFR_SKU_LINE_ID);
		addInParameter(P_LINE_NR_TYP_ID);
		addInParameter(P_LINE_NR_GRP_ID);
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
	 * Set the <code>P_LINE_NR_TYP_ID</code> parameter IN value to the routine
	 */
	public void setPLineNrTypId(Number value) {
		setNumber(P_LINE_NR_TYP_ID, value);
	}

	/**
	 * Set the <code>P_LINE_NR_TYP_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLineNrTypId(Field<? extends Number> field) {
		setNumber(P_LINE_NR_TYP_ID, field);
	}

	/**
	 * Set the <code>P_LINE_NR_GRP_ID</code> parameter IN value to the routine
	 */
	public void setPLineNrGrpId(Number value) {
		setNumber(P_LINE_NR_GRP_ID, value);
	}

	/**
	 * Set the <code>P_LINE_NR_GRP_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLineNrGrpId(Field<? extends Number> field) {
		setNumber(P_LINE_NR_GRP_ID, field);
	}
}
