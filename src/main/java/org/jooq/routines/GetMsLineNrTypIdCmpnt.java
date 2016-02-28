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
public class GetMsLineNrTypIdCmpnt extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -1357608205;

	/**
	 * The parameter <code>WETRN.GET_MS_LINE_NR_TYP_ID_CMPNT.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_MS_LINE_NR_TYP_ID_CMPNT.P_SET_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SET_ID = createParameter("P_SET_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetMsLineNrTypIdCmpnt() {
		super("GET_MS_LINE_NR_TYP_ID_CMPNT", Wetrn.WETRN, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_SET_ID);
	}

	/**
	 * Set the <code>P_SET_ID</code> parameter IN value to the routine
	 */
	public void setPSetId(Number value) {
		setNumber(P_SET_ID, value);
	}

	/**
	 * Set the <code>P_SET_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSetId(Field<? extends Number> field) {
		setNumber(P_SET_ID, field);
	}
}
