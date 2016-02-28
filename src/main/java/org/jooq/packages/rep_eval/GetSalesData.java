/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.rep_eval;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.RepEval;


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
public class GetSalesData extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 1044622663;

	/**
	 * The parameter <code>WETRN.REP_EVAL.GET_SALES_DATA.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.REP_EVAL.GET_SALES_DATA.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_EVAL.GET_SALES_DATA.P_VER_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_VER_ID = createParameter("P_VER_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_EVAL.GET_SALES_DATA.P_VEH_ID_LIST</code>.
	 */
	public static final Parameter<String> P_VEH_ID_LIST = createParameter("P_VEH_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_EVAL.GET_SALES_DATA.P_FROM_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_FROM_PERD_ID = createParameter("P_FROM_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_EVAL.GET_SALES_DATA.P_TO_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_TO_PERD_ID = createParameter("P_TO_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_EVAL.GET_SALES_DATA.P_CATEGRY_ID_LIST</code>.
	 */
	public static final Parameter<String> P_CATEGRY_ID_LIST = createParameter("P_CATEGRY_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_EVAL.GET_SALES_DATA.P_MIN_OFFSET</code>.
	 */
	public static final Parameter<BigDecimal> P_MIN_OFFSET = createParameter("P_MIN_OFFSET", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_EVAL.GET_SALES_DATA.P_MAX_OFFSET</code>.
	 */
	public static final Parameter<BigDecimal> P_MAX_OFFSET = createParameter("P_MAX_OFFSET", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_EVAL.GET_SALES_DATA.P_CAMPAIGN_OF_SALE_YN</code>.
	 */
	public static final Parameter<String> P_CAMPAIGN_OF_SALE_YN = createParameter("P_CAMPAIGN_OF_SALE_YN", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.REP_EVAL.GET_SALES_DATA.P_SALES_AIDS_YN</code>.
	 */
	public static final Parameter<String> P_SALES_AIDS_YN = createParameter("P_SALES_AIDS_YN", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.REP_EVAL.GET_SALES_DATA.P_IMPACT_CATEGORY_YN</code>.
	 */
	public static final Parameter<String> P_IMPACT_CATEGORY_YN = createParameter("P_IMPACT_CATEGORY_YN", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.REP_EVAL.GET_SALES_DATA.P_SUPPORT_BUDGET_ITEMS_YN</code>.
	 */
	public static final Parameter<String> P_SUPPORT_BUDGET_ITEMS_YN = createParameter("P_SUPPORT_BUDGET_ITEMS_YN", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.REP_EVAL.GET_SALES_DATA.P_LOCAL_CURRENCY</code>.
	 */
	public static final Parameter<String> P_LOCAL_CURRENCY = createParameter("P_LOCAL_CURRENCY", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetSalesData() {
		super("GET_SALES_DATA", Wetrn.WETRN, RepEval.REP_EVAL, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_VER_ID);
		addInParameter(P_VEH_ID_LIST);
		addInParameter(P_FROM_PERD_ID);
		addInParameter(P_TO_PERD_ID);
		addInParameter(P_CATEGRY_ID_LIST);
		addInParameter(P_MIN_OFFSET);
		addInParameter(P_MAX_OFFSET);
		addInParameter(P_CAMPAIGN_OF_SALE_YN);
		addInParameter(P_SALES_AIDS_YN);
		addInParameter(P_IMPACT_CATEGORY_YN);
		addInParameter(P_SUPPORT_BUDGET_ITEMS_YN);
		addInParameter(P_LOCAL_CURRENCY);
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
	 * Set the <code>P_VER_ID</code> parameter IN value to the routine
	 */
	public void setPVerId(Number value) {
		setNumber(P_VER_ID, value);
	}

	/**
	 * Set the <code>P_VER_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPVerId(Field<? extends Number> field) {
		setNumber(P_VER_ID, field);
	}

	/**
	 * Set the <code>P_VEH_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPVehIdList(String value) {
		setValue(P_VEH_ID_LIST, value);
	}

	/**
	 * Set the <code>P_VEH_ID_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPVehIdList(Field<String> field) {
		setField(P_VEH_ID_LIST, field);
	}

	/**
	 * Set the <code>P_FROM_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPFromPerdId(Number value) {
		setNumber(P_FROM_PERD_ID, value);
	}

	/**
	 * Set the <code>P_FROM_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPFromPerdId(Field<? extends Number> field) {
		setNumber(P_FROM_PERD_ID, field);
	}

	/**
	 * Set the <code>P_TO_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPToPerdId(Number value) {
		setNumber(P_TO_PERD_ID, value);
	}

	/**
	 * Set the <code>P_TO_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPToPerdId(Field<? extends Number> field) {
		setNumber(P_TO_PERD_ID, field);
	}

	/**
	 * Set the <code>P_CATEGRY_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPCategryIdList(String value) {
		setValue(P_CATEGRY_ID_LIST, value);
	}

	/**
	 * Set the <code>P_CATEGRY_ID_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPCategryIdList(Field<String> field) {
		setField(P_CATEGRY_ID_LIST, field);
	}

	/**
	 * Set the <code>P_MIN_OFFSET</code> parameter IN value to the routine
	 */
	public void setPMinOffset(Number value) {
		setNumber(P_MIN_OFFSET, value);
	}

	/**
	 * Set the <code>P_MIN_OFFSET</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMinOffset(Field<? extends Number> field) {
		setNumber(P_MIN_OFFSET, field);
	}

	/**
	 * Set the <code>P_MAX_OFFSET</code> parameter IN value to the routine
	 */
	public void setPMaxOffset(Number value) {
		setNumber(P_MAX_OFFSET, value);
	}

	/**
	 * Set the <code>P_MAX_OFFSET</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMaxOffset(Field<? extends Number> field) {
		setNumber(P_MAX_OFFSET, field);
	}

	/**
	 * Set the <code>P_CAMPAIGN_OF_SALE_YN</code> parameter IN value to the routine
	 */
	public void setPCampaignOfSaleYn(String value) {
		setValue(P_CAMPAIGN_OF_SALE_YN, value);
	}

	/**
	 * Set the <code>P_CAMPAIGN_OF_SALE_YN</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPCampaignOfSaleYn(Field<String> field) {
		setField(P_CAMPAIGN_OF_SALE_YN, field);
	}

	/**
	 * Set the <code>P_SALES_AIDS_YN</code> parameter IN value to the routine
	 */
	public void setPSalesAidsYn(String value) {
		setValue(P_SALES_AIDS_YN, value);
	}

	/**
	 * Set the <code>P_SALES_AIDS_YN</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSalesAidsYn(Field<String> field) {
		setField(P_SALES_AIDS_YN, field);
	}

	/**
	 * Set the <code>P_IMPACT_CATEGORY_YN</code> parameter IN value to the routine
	 */
	public void setPImpactCategoryYn(String value) {
		setValue(P_IMPACT_CATEGORY_YN, value);
	}

	/**
	 * Set the <code>P_IMPACT_CATEGORY_YN</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPImpactCategoryYn(Field<String> field) {
		setField(P_IMPACT_CATEGORY_YN, field);
	}

	/**
	 * Set the <code>P_SUPPORT_BUDGET_ITEMS_YN</code> parameter IN value to the routine
	 */
	public void setPSupportBudgetItemsYn(String value) {
		setValue(P_SUPPORT_BUDGET_ITEMS_YN, value);
	}

	/**
	 * Set the <code>P_SUPPORT_BUDGET_ITEMS_YN</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSupportBudgetItemsYn(Field<String> field) {
		setField(P_SUPPORT_BUDGET_ITEMS_YN, field);
	}

	/**
	 * Set the <code>P_LOCAL_CURRENCY</code> parameter IN value to the routine
	 */
	public void setPLocalCurrency(String value) {
		setValue(P_LOCAL_CURRENCY, value);
	}

	/**
	 * Set the <code>P_LOCAL_CURRENCY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLocalCurrency(Field<String> field) {
		setField(P_LOCAL_CURRENCY, field);
	}
}
