/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_cos;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsCos;


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
public class GetOffsetPercent extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -613468757;

	/**
	 * The parameter <code>WETRN.PA_MAPS_COS.GET_OFFSET_PERCENT.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COS.GET_OFFSET_PERCENT.MARKETID</code>.
	 */
	public static final Parameter<BigDecimal> MARKETID = createParameter("MARKETID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COS.GET_OFFSET_PERCENT.VEHICLEID</code>.
	 */
	public static final Parameter<BigDecimal> VEHICLEID = createParameter("VEHICLEID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COS.GET_OFFSET_PERCENT.PERIODID</code>.
	 */
	public static final Parameter<BigDecimal> PERIODID = createParameter("PERIODID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COS.GET_OFFSET_PERCENT.OFFSET</code>.
	 */
	public static final Parameter<BigDecimal> OFFSET = createParameter("OFFSET", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COS.GET_OFFSET_PERCENT.CATEGORYID</code>.
	 */
	public static final Parameter<BigDecimal> CATEGORYID = createParameter("CATEGORYID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetOffsetPercent() {
		super("GET_OFFSET_PERCENT", Wetrn.WETRN, PaMapsCos.PA_MAPS_COS, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(MARKETID);
		addInParameter(VEHICLEID);
		addInParameter(PERIODID);
		addInParameter(OFFSET);
		addInParameter(CATEGORYID);
	}

	/**
	 * Set the <code>MARKETID</code> parameter IN value to the routine
	 */
	public void setMarketid(Number value) {
		setNumber(MARKETID, value);
	}

	/**
	 * Set the <code>MARKETID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setMarketid(Field<? extends Number> field) {
		setNumber(MARKETID, field);
	}

	/**
	 * Set the <code>VEHICLEID</code> parameter IN value to the routine
	 */
	public void setVehicleid(Number value) {
		setNumber(VEHICLEID, value);
	}

	/**
	 * Set the <code>VEHICLEID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setVehicleid(Field<? extends Number> field) {
		setNumber(VEHICLEID, field);
	}

	/**
	 * Set the <code>PERIODID</code> parameter IN value to the routine
	 */
	public void setPeriodid(Number value) {
		setNumber(PERIODID, value);
	}

	/**
	 * Set the <code>PERIODID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPeriodid(Field<? extends Number> field) {
		setNumber(PERIODID, field);
	}

	/**
	 * Set the <code>OFFSET</code> parameter IN value to the routine
	 */
	public void setOffset(Number value) {
		setNumber(OFFSET, value);
	}

	/**
	 * Set the <code>OFFSET</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setOffset(Field<? extends Number> field) {
		setNumber(OFFSET, field);
	}

	/**
	 * Set the <code>CATEGORYID</code> parameter IN value to the routine
	 */
	public void setCategoryid(Number value) {
		setNumber(CATEGORYID, value);
	}

	/**
	 * Set the <code>CATEGORYID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setCategoryid(Field<? extends Number> field) {
		setNumber(CATEGORYID, field);
	}
}
