/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_bl_brazil;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaBlBrazil;


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
public class GetFreeFsc extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -379281981;

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.GET_FREE_FSC.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL RECORD"), false);

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.GET_FREE_FSC.PAR_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_MRKT_ID = createParameter("PAR_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetFreeFsc() {
		super("GET_FREE_FSC", Wetrn.WETRN, PaBlBrazil.PA_BL_BRAZIL, org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL RECORD"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(PAR_MRKT_ID);
	}

	/**
	 * Set the <code>PAR_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setParMrktId(Number value) {
		setNumber(PAR_MRKT_ID, value);
	}

	/**
	 * Set the <code>PAR_MRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParMrktId(Field<? extends Number> field) {
		setNumber(PAR_MRKT_ID, field);
	}
}
