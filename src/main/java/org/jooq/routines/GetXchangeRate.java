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
public class GetXchangeRate extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 1061007543;

	/**
	 * The parameter <code>WETRN.GET_XCHANGE_RATE.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_XCHANGE_RATE.MARKET</code>.
	 */
	public static final Parameter<BigDecimal> MARKET = createParameter("MARKET", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_XCHANGE_RATE.PERIOD</code>.
	 */
	public static final Parameter<BigDecimal> PERIOD = createParameter("PERIOD", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetXchangeRate() {
		super("GET_XCHANGE_RATE", Wetrn.WETRN, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(MARKET);
		addInParameter(PERIOD);
	}

	/**
	 * Set the <code>MARKET</code> parameter IN value to the routine
	 */
	public void setMarket(Number value) {
		setNumber(MARKET, value);
	}

	/**
	 * Set the <code>MARKET</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setMarket(Field<? extends Number> field) {
		setNumber(MARKET, field);
	}

	/**
	 * Set the <code>PERIOD</code> parameter IN value to the routine
	 */
	public void setPeriod(Number value) {
		setNumber(PERIOD, value);
	}

	/**
	 * Set the <code>PERIOD</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPeriod(Field<? extends Number> field) {
		setNumber(PERIOD, field);
	}
}
