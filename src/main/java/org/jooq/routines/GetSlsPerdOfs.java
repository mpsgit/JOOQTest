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
public class GetSlsPerdOfs extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 989104459;

	/**
	 * The parameter <code>WETRN.GET_SLS_PERD_OFS.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_SLS_PERD_OFS.V_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> V_MRKT_ID = createParameter("V_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_SLS_PERD_OFS.V_OFFR_PERD</code>.
	 */
	public static final Parameter<BigDecimal> V_OFFR_PERD = createParameter("V_OFFR_PERD", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_SLS_PERD_OFS.V_OFS</code>.
	 */
	public static final Parameter<BigDecimal> V_OFS = createParameter("V_OFS", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetSlsPerdOfs() {
		super("GET_SLS_PERD_OFS", Wetrn.WETRN, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(V_MRKT_ID);
		addInParameter(V_OFFR_PERD);
		addInParameter(V_OFS);
	}

	/**
	 * Set the <code>V_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setVMrktId(Number value) {
		setNumber(V_MRKT_ID, value);
	}

	/**
	 * Set the <code>V_MRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setVMrktId(Field<? extends Number> field) {
		setNumber(V_MRKT_ID, field);
	}

	/**
	 * Set the <code>V_OFFR_PERD</code> parameter IN value to the routine
	 */
	public void setVOffrPerd(Number value) {
		setNumber(V_OFFR_PERD, value);
	}

	/**
	 * Set the <code>V_OFFR_PERD</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setVOffrPerd(Field<? extends Number> field) {
		setNumber(V_OFFR_PERD, field);
	}

	/**
	 * Set the <code>V_OFS</code> parameter IN value to the routine
	 */
	public void setVOfs(Number value) {
		setNumber(V_OFS, value);
	}

	/**
	 * Set the <code>V_OFS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setVOfs(Field<? extends Number> field) {
		setNumber(V_OFS, field);
	}
}