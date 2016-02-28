/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_late_offer;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmLateOffer;


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
public class MaintainItemData extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1307784400;

	/**
	 * The parameter <code>WETRN.APP_LNM_LATE_OFFER.MAINTAIN_ITEM_DATA.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_LATE_OFFER.MAINTAIN_ITEM_DATA.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_LATE_OFFER.MAINTAIN_ITEM_DATA.P_CONTINGENCY_IND</code>.
	 */
	public static final Parameter<String> P_CONTINGENCY_IND = createParameter("P_CONTINGENCY_IND", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_LATE_OFFER.MAINTAIN_ITEM_DATA.P_USER_ID</code>.
	 */
	public static final Parameter<String> P_USER_ID = createParameter("P_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_LATE_OFFER.MAINTAIN_ITEM_DATA.P_START_TS</code>.
	 */
	public static final Parameter<String> P_START_TS = createParameter("P_START_TS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public MaintainItemData() {
		super("MAINTAIN_ITEM_DATA", Wetrn.WETRN, AppLnmLateOffer.APP_LNM_LATE_OFFER);

		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
		addInParameter(P_CONTINGENCY_IND);
		addInParameter(P_USER_ID);
		addOutParameter(P_START_TS);
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
	 * Get the <code>P_START_TS</code> parameter OUT value from the routine
	 */
	public String getPStartTs() {
		return getValue(P_START_TS);
	}
}