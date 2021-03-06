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
public class SetUnitReportingLevel extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -1228357438;

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.SET_UNIT_REPORTING_LEVEL.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.SET_UNIT_REPORTING_LEVEL.PAR_OFFRID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_OFFRID = createParameter("PAR_OFFRID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public SetUnitReportingLevel() {
		super("SET_UNIT_REPORTING_LEVEL", Wetrn.WETRN, PaMapsCopy.PA_MAPS_COPY, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(PAR_OFFRID);
	}

	/**
	 * Set the <code>PAR_OFFRID</code> parameter IN value to the routine
	 */
	public void setParOffrid(Number value) {
		setNumber(PAR_OFFRID, value);
	}

	/**
	 * Set the <code>PAR_OFFRID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParOffrid(Field<? extends Number> field) {
		setNumber(PAR_OFFRID, field);
	}
}
