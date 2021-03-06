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
import org.jooq.packages.pa_updt_ts.CreateTriggers;
import org.jooq.packages.pa_updt_ts.DropTriggers;
import org.jooq.packages.pa_updt_ts.GetUserName;
import org.jooq.packages.pa_updt_ts.UpdateTimestamps1;
import org.jooq.packages.pa_updt_ts.UpdateTimestamps2;


/**
 * Convenience access to all stored procedures and functions in PA_UPDT_TS
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaUpdtTs extends PackageImpl {

	private static final long serialVersionUID = -389461988;

	/**
	 * The reference instance of <code>WETRN.PA_UPDT_TS</code>
	 */
	public static final PaUpdtTs PA_UPDT_TS = new PaUpdtTs();

	/**
	 * Call <code>WETRN.PA_UPDT_TS.CREATE_TRIGGERS</code>
	 */
	public static void createTriggers(Configuration configuration) {
		CreateTriggers p = new CreateTriggers();

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.PA_UPDT_TS.DROP_TRIGGERS</code>
	 */
	public static void dropTriggers(Configuration configuration) {
		DropTriggers p = new DropTriggers();

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.PA_UPDT_TS.GET_USER_NAME</code>
	 */
	public static String getUserName(Configuration configuration) {
		GetUserName f = new GetUserName();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_UPDT_TS.GET_USER_NAME</code> as a field.
	 */
	public static Field<String> getUserName() {
		GetUserName f = new GetUserName();

		return f.asField();
	}

	/**
	 * Call <code>WETRN.PA_UPDT_TS.UPDATE_TIMESTAMPS</code>
	 */
	public static BigDecimal updateTimestamps1(Configuration configuration, Number pUpdateTimestamps) {
		UpdateTimestamps1 f = new UpdateTimestamps1();
		f.setPUpdateTimestamps(pUpdateTimestamps);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_UPDT_TS.UPDATE_TIMESTAMPS</code> as a field.
	 */
	public static Field<BigDecimal> updateTimestamps1(Number pUpdateTimestamps) {
		UpdateTimestamps1 f = new UpdateTimestamps1();
		f.setPUpdateTimestamps(pUpdateTimestamps);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_UPDT_TS.UPDATE_TIMESTAMPS</code> as a field.
	 */
	public static Field<BigDecimal> updateTimestamps1(Field<? extends Number> pUpdateTimestamps) {
		UpdateTimestamps1 f = new UpdateTimestamps1();
		f.setPUpdateTimestamps(pUpdateTimestamps);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.PA_UPDT_TS.UPDATE_TIMESTAMPS</code>
	 */
	public static void updateTimestamps2(Configuration configuration, Number pUpdateTimestamps) {
		UpdateTimestamps2 p = new UpdateTimestamps2();
		p.setPUpdateTimestamps(pUpdateTimestamps);

		p.execute(configuration);
	}

	/**
	 * No further instances allowed
	 */
	private PaUpdtTs() {
		super("PA_UPDT_TS", Wetrn.WETRN);
	}
}
