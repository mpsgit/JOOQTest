/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_cena_ln_grp;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmCenaLnGrp;


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
public class GetBrchrLineNrGrpId extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -1159467697;

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_LN_GRP.GET_BRCHR_LINE_NR_GRP_ID.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_LN_GRP.GET_BRCHR_LINE_NR_GRP_ID.P_CLSTR_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_CLSTR_ID = createParameter("P_CLSTR_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_LN_GRP.GET_BRCHR_LINE_NR_GRP_ID.P_LEAD_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LEAD_MRKT_ID = createParameter("P_LEAD_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_LN_GRP.GET_BRCHR_LINE_NR_GRP_ID.P_LINE_NR_TYP_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LINE_NR_TYP_ID = createParameter("P_LINE_NR_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_LN_GRP.GET_BRCHR_LINE_NR_GRP_ID.P_LEAD_BUS_DIV_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LEAD_BUS_DIV_ID = createParameter("P_LEAD_BUS_DIV_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_LN_GRP.GET_BRCHR_LINE_NR_GRP_ID.P_BUS_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_BUS_ID = createParameter("P_BUS_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_LN_GRP.GET_BRCHR_LINE_NR_GRP_ID.P_CATGRY_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_CATGRY_ID = createParameter("P_CATGRY_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_LN_GRP.GET_BRCHR_LINE_NR_GRP_ID.P_SGMT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SGMT_ID = createParameter("P_SGMT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_LN_GRP.GET_BRCHR_LINE_NR_GRP_ID.P_PROD_TYP_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_PROD_TYP_ID = createParameter("P_PROD_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CENA_LN_GRP.GET_BRCHR_LINE_NR_GRP_ID.P_FORM_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_FORM_ID = createParameter("P_FORM_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetBrchrLineNrGrpId() {
		super("GET_BRCHR_LINE_NR_GRP_ID", Wetrn.WETRN, AppLnmCenaLnGrp.APP_LNM_CENA_LN_GRP, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_CLSTR_ID);
		addInParameter(P_LEAD_MRKT_ID);
		addInParameter(P_LINE_NR_TYP_ID);
		addInParameter(P_LEAD_BUS_DIV_ID);
		addInParameter(P_BUS_ID);
		addInParameter(P_CATGRY_ID);
		addInParameter(P_SGMT_ID);
		addInParameter(P_PROD_TYP_ID);
		addInParameter(P_FORM_ID);
	}

	/**
	 * Set the <code>P_CLSTR_ID</code> parameter IN value to the routine
	 */
	public void setPClstrId(Number value) {
		setNumber(P_CLSTR_ID, value);
	}

	/**
	 * Set the <code>P_CLSTR_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPClstrId(Field<? extends Number> field) {
		setNumber(P_CLSTR_ID, field);
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
	 * Set the <code>P_LEAD_BUS_DIV_ID</code> parameter IN value to the routine
	 */
	public void setPLeadBusDivId(Number value) {
		setNumber(P_LEAD_BUS_DIV_ID, value);
	}

	/**
	 * Set the <code>P_LEAD_BUS_DIV_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLeadBusDivId(Field<? extends Number> field) {
		setNumber(P_LEAD_BUS_DIV_ID, field);
	}

	/**
	 * Set the <code>P_BUS_ID</code> parameter IN value to the routine
	 */
	public void setPBusId(Number value) {
		setNumber(P_BUS_ID, value);
	}

	/**
	 * Set the <code>P_BUS_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPBusId(Field<? extends Number> field) {
		setNumber(P_BUS_ID, field);
	}

	/**
	 * Set the <code>P_CATGRY_ID</code> parameter IN value to the routine
	 */
	public void setPCatgryId(Number value) {
		setNumber(P_CATGRY_ID, value);
	}

	/**
	 * Set the <code>P_CATGRY_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPCatgryId(Field<? extends Number> field) {
		setNumber(P_CATGRY_ID, field);
	}

	/**
	 * Set the <code>P_SGMT_ID</code> parameter IN value to the routine
	 */
	public void setPSgmtId(Number value) {
		setNumber(P_SGMT_ID, value);
	}

	/**
	 * Set the <code>P_SGMT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSgmtId(Field<? extends Number> field) {
		setNumber(P_SGMT_ID, field);
	}

	/**
	 * Set the <code>P_PROD_TYP_ID</code> parameter IN value to the routine
	 */
	public void setPProdTypId(Number value) {
		setNumber(P_PROD_TYP_ID, value);
	}

	/**
	 * Set the <code>P_PROD_TYP_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPProdTypId(Field<? extends Number> field) {
		setNumber(P_PROD_TYP_ID, field);
	}

	/**
	 * Set the <code>P_FORM_ID</code> parameter IN value to the routine
	 */
	public void setPFormId(Number value) {
		setNumber(P_FORM_ID, value);
	}

	/**
	 * Set the <code>P_FORM_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPFormId(Field<? extends Number> field) {
		setNumber(P_FORM_ID, field);
	}
}