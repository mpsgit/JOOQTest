/**
 * This class is generated by jOOQ
 */
package org.jooq.routines;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;


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
public class GetEqualSet extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -1113251041;

	/**
	 * The parameter <code>WETRN.GET_EQUAL_SET.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_EQUAL_SET.T_SET_ID</code>.
	 */
	public static final Parameter<BigDecimal> T_SET_ID = createParameter("T_SET_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_EQUAL_SET.S_SET_ID</code>.
	 */
	public static final Parameter<BigDecimal> S_SET_ID = createParameter("S_SET_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetEqualSet() {
		super("GET_EQUAL_SET", Wetrn.WETRN, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(T_SET_ID);
		addInParameter(S_SET_ID);
	}

	/**
	 * Set the <code>T_SET_ID</code> parameter IN value to the routine
	 */
	public void setTSetId(Number value) {
		setNumber(T_SET_ID, value);
	}

	/**
	 * Set the <code>T_SET_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setTSetId(Field<? extends Number> field) {
		setNumber(T_SET_ID, field);
	}

	/**
	 * Set the <code>S_SET_ID</code> parameter IN value to the routine
	 */
	public void setSSetId(Number value) {
		setNumber(S_SET_ID, value);
	}

	/**
	 * Set the <code>S_SET_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setSSetId(Field<? extends Number> field) {
		setNumber(S_SET_ID, field);
	}
}