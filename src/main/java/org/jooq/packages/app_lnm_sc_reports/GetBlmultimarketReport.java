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
public class GetBlmultimarketReport extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -1402978957;

	/**
	 * The parameter <code>WETRN.APP_LNM_SC_REPORTS.GET_BLMULTIMARKET_REPORT.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SC_REPORTS.GET_BLMULTIMARKET_REPORT.P_MRKT_ID_LIST</code>.
	 */
	public static final Parameter<String> P_MRKT_ID_LIST = createParameter("P_MRKT_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SC_REPORTS.GET_BLMULTIMARKET_REPORT.P_START_PERIOD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_START_PERIOD_ID = createParameter("P_START_PERIOD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SC_REPORTS.GET_BLMULTIMARKET_REPORT.P_END_PERIOD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_END_PERIOD_ID = createParameter("P_END_PERIOD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SC_REPORTS.GET_BLMULTIMARKET_REPORT.P_VEH_ID_LIST</code>.
	 */
	public static final Parameter<String> P_VEH_ID_LIST = createParameter("P_VEH_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetBlmultimarketReport() {
		super("GET_BLMULTIMARKET_REPORT", Wetrn.WETRN, AppLnmScReports.APP_LNM_SC_REPORTS, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID_LIST);
		addInParameter(P_START_PERIOD_ID);
		addInParameter(P_END_PERIOD_ID);
		addInParameter(P_VEH_ID_LIST);
	}

	/**
	 * Set the <code>P_MRKT_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPMrktIdList(String value) {
		setValue(P_MRKT_ID_LIST, value);
	}

	/**
	 * Set the <code>P_MRKT_ID_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMrktIdList(Field<String> field) {
		setField(P_MRKT_ID_LIST, field);
	}

	/**
	 * Set the <code>P_START_PERIOD_ID</code> parameter IN value to the routine
	 */
	public void setPStartPeriodId(Number value) {
		setNumber(P_START_PERIOD_ID, value);
	}

	/**
	 * Set the <code>P_START_PERIOD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPStartPeriodId(Field<? extends Number> field) {
		setNumber(P_START_PERIOD_ID, field);
	}

	/**
	 * Set the <code>P_END_PERIOD_ID</code> parameter IN value to the routine
	 */
	public void setPEndPeriodId(Number value) {
		setNumber(P_END_PERIOD_ID, value);
	}

	/**
	 * Set the <code>P_END_PERIOD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPEndPeriodId(Field<? extends Number> field) {
		setNumber(P_END_PERIOD_ID, field);
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
}
