/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_sea_subclstr_info;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmSeaSubclstrInfo;


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
public class GetMappedPerd extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -333109461;

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_SUBCLSTR_INFO.GET_MAPPED_PERD.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_SUBCLSTR_INFO.GET_MAPPED_PERD.P_SRC_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SRC_MRKT_ID = createParameter("P_SRC_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_SUBCLSTR_INFO.GET_MAPPED_PERD.P_SRC_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SRC_PERD_ID = createParameter("P_SRC_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_SUBCLSTR_INFO.GET_MAPPED_PERD.P_TRG_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_TRG_MRKT_ID = createParameter("P_TRG_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetMappedPerd() {
		super("GET_MAPPED_PERD", Wetrn.WETRN, AppLnmSeaSubclstrInfo.APP_LNM_SEA_SUBCLSTR_INFO, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_SRC_MRKT_ID);
		addInParameter(P_SRC_PERD_ID);
		addInParameter(P_TRG_MRKT_ID);
	}

	/**
	 * Set the <code>P_SRC_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPSrcMrktId(Number value) {
		setNumber(P_SRC_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_SRC_MRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSrcMrktId(Field<? extends Number> field) {
		setNumber(P_SRC_MRKT_ID, field);
	}

	/**
	 * Set the <code>P_SRC_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPSrcPerdId(Number value) {
		setNumber(P_SRC_PERD_ID, value);
	}

	/**
	 * Set the <code>P_SRC_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSrcPerdId(Field<? extends Number> field) {
		setNumber(P_SRC_PERD_ID, field);
	}

	/**
	 * Set the <code>P_TRG_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPTrgMrktId(Number value) {
		setNumber(P_TRG_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_TRG_MRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPTrgMrktId(Field<? extends Number> field) {
		setNumber(P_TRG_MRKT_ID, field);
	}
}
