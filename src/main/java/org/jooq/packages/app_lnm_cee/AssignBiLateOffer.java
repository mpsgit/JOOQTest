/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_cee;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmCee;


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
public class AssignBiLateOffer extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1412136938;

	/**
	 * The parameter <code>WETRN.APP_LNM_CEE.ASSIGN_BI_LATE_OFFER.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CEE.ASSIGN_BI_LATE_OFFER.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CEE.ASSIGN_BI_LATE_OFFER.P_CONTINGENCY_IND</code>.
	 */
	public static final Parameter<String> P_CONTINGENCY_IND = createParameter("P_CONTINGENCY_IND", org.jooq.impl.SQLDataType.CHAR.length(1), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CEE.ASSIGN_BI_LATE_OFFER.P_USER_ID</code>.
	 */
	public static final Parameter<String> P_USER_ID = createParameter("P_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CEE.ASSIGN_BI_LATE_OFFER.P_STATUS</code>.
	 */
	public static final Parameter<String> P_STATUS = createParameter("P_STATUS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public AssignBiLateOffer() {
		super("ASSIGN_BI_LATE_OFFER", Wetrn.WETRN, AppLnmCee.APP_LNM_CEE);

		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
		addInParameter(P_CONTINGENCY_IND);
		addInParameter(P_USER_ID);
		addOutParameter(P_STATUS);
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
	 * Set the <code>P_CONTINGENCY_IND</code> parameter IN value to the routine
	 */
	public void setPContingencyInd(String value) {
		setValue(P_CONTINGENCY_IND, value);
	}

	/**
	 * Set the <code>P_USER_ID</code> parameter IN value to the routine
	 */
	public void setPUserId(String value) {
		setValue(P_USER_ID, value);
	}

	/**
	 * Get the <code>P_STATUS</code> parameter OUT value from the routine
	 */
	public String getPStatus() {
		return getValue(P_STATUS);
	}
}
