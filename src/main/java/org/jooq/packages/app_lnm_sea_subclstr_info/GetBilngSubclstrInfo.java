/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_sea_subclstr_info;


import javax.annotation.Generated;

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
public class GetBilngSubclstrInfo extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -1514481112;

	/**
	 * The parameter <code>WETRN.APP_LNM_SEA_SUBCLSTR_INFO.GET_BILNG_SUBCLSTR_INFO.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * Create a new routine call instance
	 */
	public GetBilngSubclstrInfo() {
		super("GET_BILNG_SUBCLSTR_INFO", Wetrn.WETRN, AppLnmSeaSubclstrInfo.APP_LNM_SEA_SUBCLSTR_INFO, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
	}
}
