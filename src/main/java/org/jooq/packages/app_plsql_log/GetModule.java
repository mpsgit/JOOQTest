/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_plsql_log;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppPlsqlLog;


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
public class GetModule extends AbstractRoutine<String> {

	private static final long serialVersionUID = 1961848096;

	/**
	 * The parameter <code>WETRN.APP_PLSQL_LOG.GET_MODULE.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetModule() {
		super("GET_MODULE", Wetrn.WETRN, AppPlsqlLog.APP_PLSQL_LOG, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
	}
}
