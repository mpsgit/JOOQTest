/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_sea_reassign_bi_mi;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmSeaReassignBiMi;


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
public class GetSeaClstrId extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -2052780239;

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_REASSIGN_BI_MI.GET_SEA_CLSTR_ID.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetSeaClstrId() {
		super("GET_SEA_CLSTR_ID", Wetrn.WETRN, AppLnmSeaReassignBiMi.APP_LNM_SEA_REASSIGN_BI_MI, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
	}
}
