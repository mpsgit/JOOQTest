/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_mca_bi_reassign;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmMcaBiReassign;


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
public class GetAssignedMiBl extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -543948578;

	/**
	 * The parameter <code>WETRN.APP_LNM_MCA_BI_REASSIGN.GET_ASSIGNED_MI_BL.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_MCA_BI_REASSIGN.GET_ASSIGNED_MI_BL.P_OFFR_SKU_LINE_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_SKU_LINE_ID = createParameter("P_OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetAssignedMiBl() {
		super("GET_ASSIGNED_MI_BL", Wetrn.WETRN, AppLnmMcaBiReassign.APP_LNM_MCA_BI_REASSIGN, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_OFFR_SKU_LINE_ID);
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
}
