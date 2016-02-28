/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_demo_offers;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppDemoOffers;


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
public class Getsourcedatanewoffersinvalid extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -24718954;

	/**
	 * The parameter <code>WETRN.APP_DEMO_OFFERS.GETSOURCEDATANEWOFFERSINVALID.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_DEMO_OFFERS.GETSOURCEDATANEWOFFERSINVALID.PMARKET_ID</code>.
	 */
	public static final Parameter<BigDecimal> PMARKET_ID = createParameter("PMARKET_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_DEMO_OFFERS.GETSOURCEDATANEWOFFERSINVALID.PVEH_ID</code>.
	 */
	public static final Parameter<BigDecimal> PVEH_ID = createParameter("PVEH_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_DEMO_OFFERS.GETSOURCEDATANEWOFFERSINVALID.PPERIOD_ID</code>.
	 */
	public static final Parameter<BigDecimal> PPERIOD_ID = createParameter("PPERIOD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public Getsourcedatanewoffersinvalid() {
		super("GETSOURCEDATANEWOFFERSINVALID", Wetrn.WETRN, AppDemoOffers.APP_DEMO_OFFERS, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(PMARKET_ID);
		addInParameter(PVEH_ID);
		addInParameter(PPERIOD_ID);
	}

	/**
	 * Set the <code>PMARKET_ID</code> parameter IN value to the routine
	 */
	public void setPmarketId(Number value) {
		setNumber(PMARKET_ID, value);
	}

	/**
	 * Set the <code>PMARKET_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPmarketId(Field<? extends Number> field) {
		setNumber(PMARKET_ID, field);
	}

	/**
	 * Set the <code>PVEH_ID</code> parameter IN value to the routine
	 */
	public void setPvehId(Number value) {
		setNumber(PVEH_ID, value);
	}

	/**
	 * Set the <code>PVEH_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPvehId(Field<? extends Number> field) {
		setNumber(PVEH_ID, field);
	}

	/**
	 * Set the <code>PPERIOD_ID</code> parameter IN value to the routine
	 */
	public void setPperiodId(Number value) {
		setNumber(PPERIOD_ID, value);
	}

	/**
	 * Set the <code>PPERIOD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPperiodId(Field<? extends Number> field) {
		setNumber(PPERIOD_ID, field);
	}
}