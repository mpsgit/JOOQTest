/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_cpy_offr_trgt_prfls_info;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppCpyOffrTrgtPrflsInfo;


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
public class InitTrgtSkuInfo extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1902827488;

	/**
	 * The parameter <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO.INIT_TRGT_SKU_INFO.P_SRCE_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SRCE_MRKT_ID = createParameter("P_SRCE_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO.INIT_TRGT_SKU_INFO.P_SRCE_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SRCE_PERD_ID = createParameter("P_SRCE_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO.INIT_TRGT_SKU_INFO.P_TRGT_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_TRGT_MRKT_ID = createParameter("P_TRGT_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO.INIT_TRGT_SKU_INFO.P_TRGT_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_TRGT_PERD_ID = createParameter("P_TRGT_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public InitTrgtSkuInfo() {
		super("INIT_TRGT_SKU_INFO", Wetrn.WETRN, AppCpyOffrTrgtPrflsInfo.APP_CPY_OFFR_TRGT_PRFLS_INFO);

		addInParameter(P_SRCE_MRKT_ID);
		addInParameter(P_SRCE_PERD_ID);
		addInParameter(P_TRGT_MRKT_ID);
		addInParameter(P_TRGT_PERD_ID);
	}

	/**
	 * Set the <code>P_SRCE_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPSrceMrktId(Number value) {
		setNumber(P_SRCE_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_SRCE_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPSrcePerdId(Number value) {
		setNumber(P_SRCE_PERD_ID, value);
	}

	/**
	 * Set the <code>P_TRGT_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPTrgtMrktId(Number value) {
		setNumber(P_TRGT_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_TRGT_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPTrgtPerdId(Number value) {
		setNumber(P_TRGT_PERD_ID, value);
	}
}
