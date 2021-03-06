/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_mca_ms_bl_reassign;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmMcaMsBlReassign;


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
public class GetAssignableMsFscs extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -981254418;

	/**
	 * The parameter <code>WETRN.APP_LNM_MCA_MS_BL_REASSIGN.GET_ASSIGNABLE_MS_FSCS.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_MCA_MS_BL_REASSIGN.GET_ASSIGNABLE_MS_FSCS.P_OFFR_SKU_SET_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_SKU_SET_ID = createParameter("P_OFFR_SKU_SET_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_MCA_MS_BL_REASSIGN.GET_ASSIGNABLE_MS_FSCS.P_SELECTED_FSCS</code>.
	 */
	public static final Parameter<String> P_SELECTED_FSCS = createParameter("P_SELECTED_FSCS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetAssignableMsFscs() {
		super("GET_ASSIGNABLE_MS_FSCS", Wetrn.WETRN, AppLnmMcaMsBlReassign.APP_LNM_MCA_MS_BL_REASSIGN, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_OFFR_SKU_SET_ID);
		addInParameter(P_SELECTED_FSCS);
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
	 * Set the <code>P_SELECTED_FSCS</code> parameter IN value to the routine
	 */
	public void setPSelectedFscs(String value) {
		setValue(P_SELECTED_FSCS, value);
	}

	/**
	 * Set the <code>P_SELECTED_FSCS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSelectedFscs(Field<String> field) {
		setField(P_SELECTED_FSCS, field);
	}
}
