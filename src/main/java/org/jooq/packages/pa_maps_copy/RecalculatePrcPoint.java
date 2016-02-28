/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_copy;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsCopy;


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
public class RecalculatePrcPoint extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -1580369181;

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.RECALCULATE_PRC_POINT.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.RECALCULATE_PRC_POINT.PAR_OLDOFFERID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_OLDOFFERID = createParameter("PAR_OLDOFFERID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.RECALCULATE_PRC_POINT.PAR_NEWOFFERID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_NEWOFFERID = createParameter("PAR_NEWOFFERID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.RECALCULATE_PRC_POINT.PAR_NEWMARKETID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_NEWMARKETID = createParameter("PAR_NEWMARKETID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.RECALCULATE_PRC_POINT.PAR_NEWOFFERPERIOD</code>.
	 */
	public static final Parameter<BigDecimal> PAR_NEWOFFERPERIOD = createParameter("PAR_NEWOFFERPERIOD", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.RECALCULATE_PRC_POINT.PAR_NEWVEHID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_NEWVEHID = createParameter("PAR_NEWVEHID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public RecalculatePrcPoint() {
		super("RECALCULATE_PRC_POINT", Wetrn.WETRN, PaMapsCopy.PA_MAPS_COPY, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(PAR_OLDOFFERID);
		addInParameter(PAR_NEWOFFERID);
		addInParameter(PAR_NEWMARKETID);
		addInParameter(PAR_NEWOFFERPERIOD);
		addInParameter(PAR_NEWVEHID);
	}

	/**
	 * Set the <code>PAR_OLDOFFERID</code> parameter IN value to the routine
	 */
	public void setParOldofferid(Number value) {
		setNumber(PAR_OLDOFFERID, value);
	}

	/**
	 * Set the <code>PAR_OLDOFFERID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParOldofferid(Field<? extends Number> field) {
		setNumber(PAR_OLDOFFERID, field);
	}

	/**
	 * Set the <code>PAR_NEWOFFERID</code> parameter IN value to the routine
	 */
	public void setParNewofferid(Number value) {
		setNumber(PAR_NEWOFFERID, value);
	}

	/**
	 * Set the <code>PAR_NEWOFFERID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParNewofferid(Field<? extends Number> field) {
		setNumber(PAR_NEWOFFERID, field);
	}

	/**
	 * Set the <code>PAR_NEWMARKETID</code> parameter IN value to the routine
	 */
	public void setParNewmarketid(Number value) {
		setNumber(PAR_NEWMARKETID, value);
	}

	/**
	 * Set the <code>PAR_NEWMARKETID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParNewmarketid(Field<? extends Number> field) {
		setNumber(PAR_NEWMARKETID, field);
	}

	/**
	 * Set the <code>PAR_NEWOFFERPERIOD</code> parameter IN value to the routine
	 */
	public void setParNewofferperiod(Number value) {
		setNumber(PAR_NEWOFFERPERIOD, value);
	}

	/**
	 * Set the <code>PAR_NEWOFFERPERIOD</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParNewofferperiod(Field<? extends Number> field) {
		setNumber(PAR_NEWOFFERPERIOD, field);
	}

	/**
	 * Set the <code>PAR_NEWVEHID</code> parameter IN value to the routine
	 */
	public void setParNewvehid(Number value) {
		setNumber(PAR_NEWVEHID, value);
	}

	/**
	 * Set the <code>PAR_NEWVEHID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParNewvehid(Field<? extends Number> field) {
		setNumber(PAR_NEWVEHID, field);
	}
}