/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_subclstr_info;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmSubclstrInfo;


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
public class GetSubclstrPerdInfo extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -968768136;

	/**
	 * The parameter <code>WETRN.APP_LNM_SUBCLSTR_INFO.GET_SUBCLSTR_PERD_INFO.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * Create a new routine call instance
	 */
	public GetSubclstrPerdInfo() {
		super("GET_SUBCLSTR_PERD_INFO", Wetrn.WETRN, AppLnmSubclstrInfo.APP_LNM_SUBCLSTR_INFO, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
	}
}
