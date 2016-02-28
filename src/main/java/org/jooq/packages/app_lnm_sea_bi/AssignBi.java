/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_sea_bi;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmSeaBi;


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
public class AssignBi extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1209869915;

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_BI.ASSIGN_BI.P_RUN_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_RUN_ID = createParameter("P_RUN_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_BI.ASSIGN_BI.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_BI.ASSIGN_BI.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_BI.ASSIGN_BI.P_CONTINGENCY</code>.
	 */
	public static final Parameter<String> P_CONTINGENCY = createParameter("P_CONTINGENCY", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_BI.ASSIGN_BI.P_USER_ID</code>.
	 */
	public static final Parameter<String> P_USER_ID = createParameter("P_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public AssignBi() {
		super("ASSIGN_BI", Wetrn.WETRN, AppLnmSeaBi.APP_LNM_SEA_BI);

		addInParameter(P_RUN_ID);
		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
		addInParameter(P_CONTINGENCY);
		addInParameter(P_USER_ID);
	}

	/**
	 * Set the <code>P_RUN_ID</code> parameter IN value to the routine
	 */
	public void setPRunId(Number value) {
		setNumber(P_RUN_ID, value);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPMrktId(Number value) {
		setNumber(P_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPOffrPerdId(Number value) {
		setNumber(P_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_CONTINGENCY</code> parameter IN value to the routine
	 */
	public void setPContingency(String value) {
		setValue(P_CONTINGENCY, value);
	}

	/**
	 * Set the <code>P_USER_ID</code> parameter IN value to the routine
	 */
	public void setPUserId(String value) {
		setValue(P_USER_ID, value);
	}
}
