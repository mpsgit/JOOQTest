/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_plsql_log;


import java.math.BigDecimal;

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
public class GetRunId extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -404113257;

	/**
	 * The parameter <code>WETRN.APP_PLSQL_LOG.GET_RUN_ID.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetRunId() {
		super("GET_RUN_ID", Wetrn.WETRN, AppPlsqlLog.APP_PLSQL_LOG, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
	}
}
