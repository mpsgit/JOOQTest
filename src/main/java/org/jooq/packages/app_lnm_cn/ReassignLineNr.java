/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_cn;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmCn;


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
public class ReassignLineNr extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1648908980;

	/**
	 * The parameter <code>WETRN.APP_LNM_CN.REASSIGN_LINE_NR.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CN.REASSIGN_LINE_NR.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CN.REASSIGN_LINE_NR.P_OFFR_SKU_LINE_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_SKU_LINE_ID = createParameter("P_OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CN.REASSIGN_LINE_NR.P_LINE_NR</code>.
	 */
	public static final Parameter<String> P_LINE_NR = createParameter("P_LINE_NR", org.jooq.impl.SQLDataType.VARCHAR.length(8), false);

	/**
	 * Create a new routine call instance
	 */
	public ReassignLineNr() {
		super("REASSIGN_LINE_NR", Wetrn.WETRN, AppLnmCn.APP_LNM_CN);

		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
		addInOutParameter(P_OFFR_SKU_LINE_ID);
		addInParameter(P_LINE_NR);
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
	 * Set the <code>P_OFFR_SKU_LINE_ID</code> parameter IN value to the routine
	 */
	public void setPOffrSkuLineId(Number value) {
		setNumber(P_OFFR_SKU_LINE_ID, value);
	}

	/**
	 * Set the <code>P_LINE_NR</code> parameter IN value to the routine
	 */
	public void setPLineNr(String value) {
		setValue(P_LINE_NR, value);
	}

	/**
	 * Get the <code>P_OFFR_SKU_LINE_ID</code> parameter OUT value from the routine
	 */
	public BigDecimal getPOffrSkuLineId() {
		return getValue(P_OFFR_SKU_LINE_ID);
	}
}