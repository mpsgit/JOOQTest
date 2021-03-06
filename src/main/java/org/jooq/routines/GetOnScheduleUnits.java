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
public class GetOnScheduleUnits extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 494402129;

	/**
	 * The parameter <code>WETRN.GET_ON_SCHEDULE_UNITS.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_ON_SCHEDULE_UNITS.CONCEPT_ID</code>.
	 */
	public static final Parameter<BigDecimal> CONCEPT_ID = createParameter("CONCEPT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetOnScheduleUnits() {
		super("GET_ON_SCHEDULE_UNITS", Wetrn.WETRN, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(CONCEPT_ID);
	}

	/**
	 * Set the <code>CONCEPT_ID</code> parameter IN value to the routine
	 */
	public void setConceptId(Number value) {
		setNumber(CONCEPT_ID, value);
	}

	/**
	 * Set the <code>CONCEPT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setConceptId(Field<? extends Number> field) {
		setNumber(CONCEPT_ID, field);
	}
}
