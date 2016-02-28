/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.rep_main;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.RepMain;


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
public class GetPerdList extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 1198818538;

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_PERD_LIST.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_PERD_LIST.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_PERD_LIST.P_FROM_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_FROM_PERD_ID = createParameter("P_FROM_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_PERD_LIST.P_TO_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_TO_PERD_ID = createParameter("P_TO_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetPerdList() {
		super("GET_PERD_LIST", Wetrn.WETRN, RepMain.REP_MAIN, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_FROM_PERD_ID);
		addInParameter(P_TO_PERD_ID);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPMrktId(Number value) {
		setNumber(P_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMrktId(Field<? extends Number> field) {
		setNumber(P_MRKT_ID, field);
	}

	/**
	 * Set the <code>P_FROM_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPFromPerdId(Number value) {
		setNumber(P_FROM_PERD_ID, value);
	}

	/**
	 * Set the <code>P_FROM_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPFromPerdId(Field<? extends Number> field) {
		setNumber(P_FROM_PERD_ID, field);
	}

	/**
	 * Set the <code>P_TO_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPToPerdId(Number value) {
		setNumber(P_TO_PERD_ID, value);
	}

	/**
	 * Set the <code>P_TO_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPToPerdId(Field<? extends Number> field) {
		setNumber(P_TO_PERD_ID, field);
	}
}