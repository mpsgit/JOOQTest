/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.app_plsql_output.AddKey;
import org.jooq.packages.app_plsql_output.AddMsg;
import org.jooq.packages.app_plsql_output.GenerateNewRunId;
import org.jooq.packages.app_plsql_output.GetRunId;
import org.jooq.packages.app_plsql_output.SetRunId;


/**
 * Convenience access to all stored procedures and functions in APP_PLSQL_OUTPUT
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppPlsqlOutput extends PackageImpl {

	private static final long serialVersionUID = -1638448811;

	/**
	 * The reference instance of <code>WETRN.APP_PLSQL_OUTPUT</code>
	 */
	public static final AppPlsqlOutput APP_PLSQL_OUTPUT = new AppPlsqlOutput();

	/**
	 * Call <code>WETRN.APP_PLSQL_OUTPUT.ADD_KEY</code>
	 */
	public static void addKey(Configuration configuration, String pMsgType, Number pKeyValue) {
		AddKey p = new AddKey();
		p.setPMsgType(pMsgType);
		p.setPKeyValue(pKeyValue);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.APP_PLSQL_OUTPUT.ADD_MSG</code>
	 */
	public static void addMsg(Configuration configuration, String pMsgType, String pMsgValue) {
		AddMsg p = new AddMsg();
		p.setPMsgType(pMsgType);
		p.setPMsgValue(pMsgValue);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.APP_PLSQL_OUTPUT.GENERATE_NEW_RUN_ID</code>
	 */
	public static BigDecimal generateNewRunId(Configuration configuration) {
		GenerateNewRunId f = new GenerateNewRunId();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_PLSQL_OUTPUT.GENERATE_NEW_RUN_ID</code> as a field.
	 */
	public static Field<BigDecimal> generateNewRunId() {
		GenerateNewRunId f = new GenerateNewRunId();

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_PLSQL_OUTPUT.GET_RUN_ID</code>
	 */
	public static BigDecimal getRunId(Configuration configuration) {
		GetRunId f = new GetRunId();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_PLSQL_OUTPUT.GET_RUN_ID</code> as a field.
	 */
	public static Field<BigDecimal> getRunId() {
		GetRunId f = new GetRunId();

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_PLSQL_OUTPUT.SET_RUN_ID</code>
	 */
	public static void setRunId(Configuration configuration, Number pRunId) {
		SetRunId p = new SetRunId();
		p.setPRunId(pRunId);

		p.execute(configuration);
	}

	/**
	 * No further instances allowed
	 */
	private AppPlsqlOutput() {
		super("APP_PLSQL_OUTPUT", Wetrn.WETRN);
	}
}