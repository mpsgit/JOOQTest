/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_sc_common;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmScCommon;


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
public class GetScClstrId extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 543969126;

	/**
	 * The parameter <code>WETRN.APP_LNM_SC_COMMON.GET_SC_CLSTR_ID.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetScClstrId() {
		super("GET_SC_CLSTR_ID", Wetrn.WETRN, AppLnmScCommon.APP_LNM_SC_COMMON, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
	}
}
