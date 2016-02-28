/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.trnd_aloctn;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.TrndAloctn;


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
public class GetCtgrySls1 extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -1280824577;

	/**
	 * The parameter <code>WETRN.TRND_ALOCTN.GET_CTGRY_SLS.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.TRND_ALOCTN.GET_CTGRY_SLS.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.TRND_ALOCTN.GET_CTGRY_SLS.P_SLS_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SLS_PERD_ID = createParameter("P_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.TRND_ALOCTN.GET_CTGRY_SLS.P_DAY_NUM</code>.
	 */
	public static final Parameter<BigDecimal> P_DAY_NUM = createParameter("P_DAY_NUM", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetCtgrySls1() {
		super("GET_CTGRY_SLS", Wetrn.WETRN, TrndAloctn.TRND_ALOCTN, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_SLS_PERD_ID);
		addInParameter(P_DAY_NUM);
		setOverloaded(true);
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
	 * Set the <code>P_SLS_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPSlsPerdId(Number value) {
		setNumber(P_SLS_PERD_ID, value);
	}

	/**
	 * Set the <code>P_SLS_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSlsPerdId(Field<? extends Number> field) {
		setNumber(P_SLS_PERD_ID, field);
	}

	/**
	 * Set the <code>P_DAY_NUM</code> parameter IN value to the routine
	 */
	public void setPDayNum(Number value) {
		setNumber(P_DAY_NUM, value);
	}

	/**
	 * Set the <code>P_DAY_NUM</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPDayNum(Field<? extends Number> field) {
		setNumber(P_DAY_NUM, field);
	}
}
