/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_anz_reassign_normal;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmAnzReassignNormal;


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
public class GetReassignItemsSpecific extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 1583809246;

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_NORMAL.GET_REASSIGN_ITEMS_SPECIFIC.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_NORMAL.GET_REASSIGN_ITEMS_SPECIFIC.P_LEAD_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LEAD_MRKT_ID = createParameter("P_LEAD_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_NORMAL.GET_REASSIGN_ITEMS_SPECIFIC.P_PRFL_CD</code>.
	 */
	public static final Parameter<BigDecimal> P_PRFL_CD = createParameter("P_PRFL_CD", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_NORMAL.GET_REASSIGN_ITEMS_SPECIFIC.P_PRFL_NM</code>.
	 */
	public static final Parameter<String> P_PRFL_NM = createParameter("P_PRFL_NM", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_NORMAL.GET_REASSIGN_ITEMS_SPECIFIC.P_SKU_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SKU_ID = createParameter("P_SKU_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_NORMAL.GET_REASSIGN_ITEMS_SPECIFIC.P_SKU_NM</code>.
	 */
	public static final Parameter<String> P_SKU_NM = createParameter("P_SKU_NM", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_NORMAL.GET_REASSIGN_ITEMS_SPECIFIC.P_FSC_CD</code>.
	 */
	public static final Parameter<String> P_FSC_CD = createParameter("P_FSC_CD", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_REASSIGN_NORMAL.GET_REASSIGN_ITEMS_SPECIFIC.P_LINE_NR</code>.
	 */
	public static final Parameter<String> P_LINE_NR = createParameter("P_LINE_NR", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetReassignItemsSpecific() {
		super("GET_REASSIGN_ITEMS_SPECIFIC", Wetrn.WETRN, AppLnmAnzReassignNormal.APP_LNM_ANZ_REASSIGN_NORMAL, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_LEAD_MRKT_ID);
		addInParameter(P_PRFL_CD);
		addInParameter(P_PRFL_NM);
		addInParameter(P_SKU_ID);
		addInParameter(P_SKU_NM);
		addInParameter(P_FSC_CD);
		addInParameter(P_LINE_NR);
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
	 * Set the <code>P_PRFL_CD</code> parameter IN value to the routine
	 */
	public void setPPrflCd(Number value) {
		setNumber(P_PRFL_CD, value);
	}

	/**
	 * Set the <code>P_PRFL_CD</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPPrflCd(Field<? extends Number> field) {
		setNumber(P_PRFL_CD, field);
	}

	/**
	 * Set the <code>P_PRFL_NM</code> parameter IN value to the routine
	 */
	public void setPPrflNm(String value) {
		setValue(P_PRFL_NM, value);
	}

	/**
	 * Set the <code>P_PRFL_NM</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPPrflNm(Field<String> field) {
		setField(P_PRFL_NM, field);
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
	 * Set the <code>P_SKU_NM</code> parameter IN value to the routine
	 */
	public void setPSkuNm(String value) {
		setValue(P_SKU_NM, value);
	}

	/**
	 * Set the <code>P_SKU_NM</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSkuNm(Field<String> field) {
		setField(P_SKU_NM, field);
	}

	/**
	 * Set the <code>P_FSC_CD</code> parameter IN value to the routine
	 */
	public void setPFscCd(String value) {
		setValue(P_FSC_CD, value);
	}

	/**
	 * Set the <code>P_FSC_CD</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPFscCd(Field<String> field) {
		setField(P_FSC_CD, field);
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
}
