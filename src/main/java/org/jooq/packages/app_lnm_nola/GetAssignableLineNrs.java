/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_nola;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmNola;


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

	private static final long serialVersionUID = 134852769;

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.GET_ASSIGNABLE_LINE_NRS.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.GET_ASSIGNABLE_LINE_NRS.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.GET_ASSIGNABLE_LINE_NRS.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.GET_ASSIGNABLE_LINE_NRS.P_LINE_NR_TYP_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LINE_NR_TYP_ID = createParameter("P_LINE_NR_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.GET_ASSIGNABLE_LINE_NRS.P_LINE_NR_GRP_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LINE_NR_GRP_ID = createParameter("P_LINE_NR_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.GET_ASSIGNABLE_LINE_NRS.P_SKU_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SKU_ID = createParameter("P_SKU_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.GET_ASSIGNABLE_LINE_NRS.P_OFFR_SKU_SET_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_SKU_SET_ID = createParameter("P_OFFR_SKU_SET_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetAssignableLineNrs() {
		super("GET_ASSIGNABLE_LINE_NRS", Wetrn.WETRN, AppLnmNola.APP_LNM_NOLA, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
		addInParameter(P_LINE_NR_TYP_ID);
		addInParameter(P_LINE_NR_GRP_ID);
		addInParameter(P_SKU_ID);
		addInParameter(P_OFFR_SKU_SET_ID);
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

	/**
	 * Set the <code>P_SKU_ID</code> parameter IN value to the routine
	 */
	public void setPSkuId(Number value) {
		setNumber(P_SKU_ID, value);
	}

	/**
	 * Set the <code>P_SKU_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSkuId(Field<? extends Number> field) {
		setNumber(P_SKU_ID, field);
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
}
