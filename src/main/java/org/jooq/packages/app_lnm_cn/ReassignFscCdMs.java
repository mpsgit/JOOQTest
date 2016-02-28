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
public class ReassignFscCdMs extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -173569911;

	/**
	 * The parameter <code>WETRN.APP_LNM_CN.REASSIGN_FSC_CD_MS.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CN.REASSIGN_FSC_CD_MS.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CN.REASSIGN_FSC_CD_MS.P_OFFR_SKU_SET_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_SKU_SET_ID = createParameter("P_OFFR_SKU_SET_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CN.REASSIGN_FSC_CD_MS.P_FSC_CD</code>.
	 */
	public static final Parameter<String> P_FSC_CD = createParameter("P_FSC_CD", org.jooq.impl.SQLDataType.VARCHAR.length(8), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CN.REASSIGN_FSC_CD_MS.P_OLD_FSC_CD</code>.
	 */
	public static final Parameter<String> P_OLD_FSC_CD = createParameter("P_OLD_FSC_CD", org.jooq.impl.SQLDataType.VARCHAR.length(8), false);

	/**
	 * Create a new routine call instance
	 */
	public ReassignFscCdMs() {
		super("REASSIGN_FSC_CD_MS", Wetrn.WETRN, AppLnmCn.APP_LNM_CN);

		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
		addInOutParameter(P_OFFR_SKU_SET_ID);
		addInParameter(P_FSC_CD);
		addInOutParameter(P_OLD_FSC_CD);
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
	 * Set the <code>P_OFFR_SKU_SET_ID</code> parameter IN value to the routine
	 */
	public void setPOffrSkuSetId(Number value) {
		setNumber(P_OFFR_SKU_SET_ID, value);
	}

	/**
	 * Set the <code>P_FSC_CD</code> parameter IN value to the routine
	 */
	public void setPFscCd(String value) {
		setValue(P_FSC_CD, value);
	}

	/**
	 * Set the <code>P_OLD_FSC_CD</code> parameter IN value to the routine
	 */
	public void setPOldFscCd(String value) {
		setValue(P_OLD_FSC_CD, value);
	}

	/**
	 * Get the <code>P_OFFR_SKU_SET_ID</code> parameter OUT value from the routine
	 */
	public BigDecimal getPOffrSkuSetId() {
		return getValue(P_OFFR_SKU_SET_ID);
	}

	/**
	 * Get the <code>P_OLD_FSC_CD</code> parameter OUT value from the routine
	 */
	public String getPOldFscCd() {
		return getValue(P_OLD_FSC_CD);
	}
}