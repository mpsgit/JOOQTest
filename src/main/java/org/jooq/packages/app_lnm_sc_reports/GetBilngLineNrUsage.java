/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_sc_reports;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmScReports;


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
public class GetBilngLineNrUsage extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -533078611;

	/**
	 * The parameter <code>WETRN.APP_LNM_SC_REPORTS.GET_BILNG_LINE_NR_USAGE.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SC_REPORTS.GET_BILNG_LINE_NR_USAGE.P_CLSTR_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_CLSTR_ID = createParameter("P_CLSTR_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SC_REPORTS.GET_BILNG_LINE_NR_USAGE.P_LEAD_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LEAD_MRKT_ID = createParameter("P_LEAD_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SC_REPORTS.GET_BILNG_LINE_NR_USAGE.P_LINE_NR</code>.
	 */
	public static final Parameter<String> P_LINE_NR = createParameter("P_LINE_NR", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SC_REPORTS.GET_BILNG_LINE_NR_USAGE.P_MIN_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MIN_OFFR_PERD_ID = createParameter("P_MIN_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SC_REPORTS.GET_BILNG_LINE_NR_USAGE.P_MAX_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MAX_OFFR_PERD_ID = createParameter("P_MAX_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetBilngLineNrUsage() {
		super("GET_BILNG_LINE_NR_USAGE", Wetrn.WETRN, AppLnmScReports.APP_LNM_SC_REPORTS, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_CLSTR_ID);
		addInParameter(P_LEAD_MRKT_ID);
		addInParameter(P_LINE_NR);
		addInParameter(P_MIN_OFFR_PERD_ID);
		addInParameter(P_MAX_OFFR_PERD_ID);
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

	/**
	 * Set the <code>P_MIN_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPMinOffrPerdId(Number value) {
		setNumber(P_MIN_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_MIN_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMinOffrPerdId(Field<? extends Number> field) {
		setNumber(P_MIN_OFFR_PERD_ID, field);
	}

	/**
	 * Set the <code>P_MAX_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPMaxOffrPerdId(Number value) {
		setNumber(P_MAX_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_MAX_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMaxOffrPerdId(Field<? extends Number> field) {
		setNumber(P_MAX_OFFR_PERD_ID, field);
	}
}
