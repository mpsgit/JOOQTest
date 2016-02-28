/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_cena_reassign_bi_ms;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmCenaReassignBiMs;


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
public class GetBireassignSets extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -777008469;

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_REASSIGN_BI_MS.GET_BIREASSIGN_SETS.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_REASSIGN_BI_MS.GET_BIREASSIGN_SETS.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_REASSIGN_BI_MS.GET_BIREASSIGN_SETS.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_REASSIGN_BI_MS.GET_BIREASSIGN_SETS.P_FSC_CD</code>.
	 */
	public static final Parameter<BigDecimal> P_FSC_CD = createParameter("P_FSC_CD", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetBireassignSets() {
		super("GET_BIREASSIGN_SETS", Wetrn.WETRN, AppLnmCenaReassignBiMs.APP_LNM_CENA_REASSIGN_BI_MS, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
		addInParameter(P_FSC_CD);
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
	 * Set the <code>P_FSC_CD</code> parameter IN value to the routine
	 */
	public void setPFscCd(Number value) {
		setNumber(P_FSC_CD, value);
	}

	/**
	 * Set the <code>P_FSC_CD</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPFscCd(Field<? extends Number> field) {
		setNumber(P_FSC_CD, field);
	}
}
