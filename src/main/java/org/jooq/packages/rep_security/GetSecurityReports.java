/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.rep_security;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.RepSecurity;


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
public class GetSecurityReports extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -859327183;

	/**
	 * The parameter <code>WETRN.REP_SECURITY.GET_SECURITY_REPORTS.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * Create a new routine call instance
	 */
	public GetSecurityReports() {
		super("GET_SECURITY_REPORTS", Wetrn.WETRN, RepSecurity.REP_SECURITY, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
	}
}