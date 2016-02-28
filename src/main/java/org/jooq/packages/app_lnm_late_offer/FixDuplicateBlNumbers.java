/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_late_offer;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class FixDuplicateBlNumbers extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -689977658;

	/**
	 * The parameter <code>WETRN.APP_LNM_LATE_OFFER.FIX_DUPLICATE_BL_NUMBERS.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_LATE_OFFER.FIX_DUPLICATE_BL_NUMBERS.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_LATE_OFFER.FIX_DUPLICATE_BL_NUMBERS.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_LATE_OFFER.FIX_DUPLICATE_BL_NUMBERS.P_CONTINGENCY_IND</code>.
	 */
	public static final Parameter<String> P_CONTINGENCY_IND = createParameter("P_CONTINGENCY_IND", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_LATE_OFFER.FIX_DUPLICATE_BL_NUMBERS.P_START_TS</code>.
	 */
	public static final Parameter<String> P_START_TS = createParameter("P_START_TS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public FixDuplicateBlNumbers() {
		super("FIX_DUPLICATE_BL_NUMBERS", Wetrn.WETRN, AppLnmLateOffer.APP_LNM_LATE_OFFER, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
		addInParameter(P_CONTINGENCY_IND);
		addInParameter(P_START_TS);
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
	 * Set the <code>P_CONTINGENCY_IND</code> parameter IN value to the routine
	 */
	public void setPContingencyInd(String value) {
		setValue(P_CONTINGENCY_IND, value);
	}

	/**
	 * Set the <code>P_CONTINGENCY_IND</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPContingencyInd(Field<String> field) {
		setField(P_CONTINGENCY_IND, field);
	}

	/**
	 * Set the <code>P_START_TS</code> parameter IN value to the routine
	 */
	public void setPStartTs(String value) {
		setValue(P_START_TS, value);
	}

	/**
	 * Set the <code>P_START_TS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPStartTs(Field<String> field) {
		setField(P_START_TS, field);
	}
}