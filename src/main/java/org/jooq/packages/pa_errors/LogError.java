/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_errors;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaErrors;


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
public class LogError extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 781812459;

	/**
	 * The parameter <code>WETRN.PA_ERRORS.LOG_ERROR.P_CALLER</code>.
	 */
	public static final Parameter<String> P_CALLER = createParameter("P_CALLER", org.jooq.impl.SQLDataType.VARCHAR.length(61), false);

	/**
	 * The parameter <code>WETRN.PA_ERRORS.LOG_ERROR.P_ERROR_TYPE</code>.
	 */
	public static final Parameter<String> P_ERROR_TYPE = createParameter("P_ERROR_TYPE", org.jooq.impl.SQLDataType.CHAR.length(1), false);

	/**
	 * The parameter <code>WETRN.PA_ERRORS.LOG_ERROR.P_ERROR_NUMBER</code>.
	 */
	public static final Parameter<BigDecimal> P_ERROR_NUMBER = createParameter("P_ERROR_NUMBER", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_ERRORS.LOG_ERROR.P_ERROR_TEXT</code>.
	 */
	public static final Parameter<String> P_ERROR_TEXT = createParameter("P_ERROR_TEXT", org.jooq.impl.SQLDataType.VARCHAR.length(500), false);

	/**
	 * The parameter <code>WETRN.PA_ERRORS.LOG_ERROR.P_SPECIFIC_DETAILS</code>.
	 */
	public static final Parameter<String> P_SPECIFIC_DETAILS = createParameter("P_SPECIFIC_DETAILS", org.jooq.impl.SQLDataType.VARCHAR.length(2000), false);

	/**
	 * Create a new routine call instance
	 */
	public LogError() {
		super("LOG_ERROR", Wetrn.WETRN, PaErrors.PA_ERRORS);

		addInParameter(P_CALLER);
		addInParameter(P_ERROR_TYPE);
		addInParameter(P_ERROR_NUMBER);
		addInParameter(P_ERROR_TEXT);
		addInParameter(P_SPECIFIC_DETAILS);
	}

	/**
	 * Set the <code>P_CALLER</code> parameter IN value to the routine
	 */
	public void setPCaller(String value) {
		setValue(P_CALLER, value);
	}

	/**
	 * Set the <code>P_ERROR_TYPE</code> parameter IN value to the routine
	 */
	public void setPErrorType(String value) {
		setValue(P_ERROR_TYPE, value);
	}

	/**
	 * Set the <code>P_ERROR_NUMBER</code> parameter IN value to the routine
	 */
	public void setPErrorNumber(Number value) {
		setNumber(P_ERROR_NUMBER, value);
	}

	/**
	 * Set the <code>P_ERROR_TEXT</code> parameter IN value to the routine
	 */
	public void setPErrorText(String value) {
		setValue(P_ERROR_TEXT, value);
	}

	/**
	 * Set the <code>P_SPECIFIC_DETAILS</code> parameter IN value to the routine
	 */
	public void setPSpecificDetails(String value) {
		setValue(P_SPECIFIC_DETAILS, value);
	}
}