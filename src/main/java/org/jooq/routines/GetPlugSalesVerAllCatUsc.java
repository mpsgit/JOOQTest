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
public class GetPlugSalesVerAllCatUsc extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -931191176;

	/**
	 * The parameter <code>WETRN.GET_PLUG_SALES_VER_ALL_CAT_USC.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_PLUG_SALES_VER_ALL_CAT_USC.MARKET_ID</code>.
	 */
	public static final Parameter<BigDecimal> MARKET_ID = createParameter("MARKET_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_PLUG_SALES_VER_ALL_CAT_USC.VEHICLE_ID</code>.
	 */
	public static final Parameter<BigDecimal> VEHICLE_ID = createParameter("VEHICLE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_PLUG_SALES_VER_ALL_CAT_USC.FROM_OFFER_PERIOD_ID</code>.
	 */
	public static final Parameter<BigDecimal> FROM_OFFER_PERIOD_ID = createParameter("FROM_OFFER_PERIOD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_PLUG_SALES_VER_ALL_CAT_USC.TO_OFFER_PERIOD_ID</code>.
	 */
	public static final Parameter<BigDecimal> TO_OFFER_PERIOD_ID = createParameter("TO_OFFER_PERIOD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_PLUG_SALES_VER_ALL_CAT_USC.MIN_OFFSET</code>.
	 */
	public static final Parameter<BigDecimal> MIN_OFFSET = createParameter("MIN_OFFSET", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_PLUG_SALES_VER_ALL_CAT_USC.MAX_OFFSET</code>.
	 */
	public static final Parameter<BigDecimal> MAX_OFFSET = createParameter("MAX_OFFSET", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_PLUG_SALES_VER_ALL_CAT_USC.VERSION_ID</code>.
	 */
	public static final Parameter<BigDecimal> VERSION_ID = createParameter("VERSION_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetPlugSalesVerAllCatUsc() {
		super("GET_PLUG_SALES_VER_ALL_CAT_USC", Wetrn.WETRN, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(MARKET_ID);
		addInParameter(VEHICLE_ID);
		addInParameter(FROM_OFFER_PERIOD_ID);
		addInParameter(TO_OFFER_PERIOD_ID);
		addInParameter(MIN_OFFSET);
		addInParameter(MAX_OFFSET);
		addInParameter(VERSION_ID);
	}

	/**
	 * Set the <code>MARKET_ID</code> parameter IN value to the routine
	 */
	public void setMarketId(Number value) {
		setNumber(MARKET_ID, value);
	}

	/**
	 * Set the <code>MARKET_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setMarketId(Field<? extends Number> field) {
		setNumber(MARKET_ID, field);
	}

	/**
	 * Set the <code>VEHICLE_ID</code> parameter IN value to the routine
	 */
	public void setVehicleId(Number value) {
		setNumber(VEHICLE_ID, value);
	}

	/**
	 * Set the <code>VEHICLE_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setVehicleId(Field<? extends Number> field) {
		setNumber(VEHICLE_ID, field);
	}

	/**
	 * Set the <code>FROM_OFFER_PERIOD_ID</code> parameter IN value to the routine
	 */
	public void setFromOfferPeriodId(Number value) {
		setNumber(FROM_OFFER_PERIOD_ID, value);
	}

	/**
	 * Set the <code>FROM_OFFER_PERIOD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setFromOfferPeriodId(Field<? extends Number> field) {
		setNumber(FROM_OFFER_PERIOD_ID, field);
	}

	/**
	 * Set the <code>TO_OFFER_PERIOD_ID</code> parameter IN value to the routine
	 */
	public void setToOfferPeriodId(Number value) {
		setNumber(TO_OFFER_PERIOD_ID, value);
	}

	/**
	 * Set the <code>TO_OFFER_PERIOD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setToOfferPeriodId(Field<? extends Number> field) {
		setNumber(TO_OFFER_PERIOD_ID, field);
	}

	/**
	 * Set the <code>MIN_OFFSET</code> parameter IN value to the routine
	 */
	public void setMinOffset(Number value) {
		setNumber(MIN_OFFSET, value);
	}

	/**
	 * Set the <code>MIN_OFFSET</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setMinOffset(Field<? extends Number> field) {
		setNumber(MIN_OFFSET, field);
	}

	/**
	 * Set the <code>MAX_OFFSET</code> parameter IN value to the routine
	 */
	public void setMaxOffset(Number value) {
		setNumber(MAX_OFFSET, value);
	}

	/**
	 * Set the <code>MAX_OFFSET</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setMaxOffset(Field<? extends Number> field) {
		setNumber(MAX_OFFSET, field);
	}

	/**
	 * Set the <code>VERSION_ID</code> parameter IN value to the routine
	 */
	public void setVersionId(Number value) {
		setNumber(VERSION_ID, value);
	}

	/**
	 * Set the <code>VERSION_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setVersionId(Field<? extends Number> field) {
		setNumber(VERSION_ID, field);
	}
}
