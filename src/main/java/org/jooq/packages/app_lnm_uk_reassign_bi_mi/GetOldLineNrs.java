/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_uk_reassign_bi_mi;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmUkReassignBiMi;


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
public class GetOldLineNrs extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 809063229;

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_BI_MI.GET_OLD_LINE_NRS.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * Create a new routine call instance
	 */
	public GetOldLineNrs() {
		super("GET_OLD_LINE_NRS", Wetrn.WETRN, AppLnmUkReassignBiMi.APP_LNM_UK_REASSIGN_BI_MI, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
	}
}
