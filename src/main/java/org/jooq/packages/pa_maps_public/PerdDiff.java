/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_public;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsPublic;


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
public class PerdDiff extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -1612550122;

	/**
	 * The parameter <code>WETRN.PA_MAPS_PUBLIC.PERD_DIFF.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_PUBLIC.PERD_DIFF.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_PUBLIC.PERD_DIFF.P_PERD1</code>.
	 */
	public static final Parameter<BigDecimal> P_PERD1 = createParameter("P_PERD1", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_PUBLIC.PERD_DIFF.P_PERD2</code>.
	 */
	public static final Parameter<BigDecimal> P_PERD2 = createParameter("P_PERD2", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public PerdDiff() {
		super("PERD_DIFF", Wetrn.WETRN, PaMapsPublic.PA_MAPS_PUBLIC, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_PERD1);
		addInParameter(P_PERD2);
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
	 * Set the <code>P_PERD1</code> parameter IN value to the routine
	 */
	public void setPPerd1(Number value) {
		setNumber(P_PERD1, value);
	}

	/**
	 * Set the <code>P_PERD1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPPerd1(Field<? extends Number> field) {
		setNumber(P_PERD1, field);
	}

	/**
	 * Set the <code>P_PERD2</code> parameter IN value to the routine
	 */
	public void setPPerd2(Number value) {
		setNumber(P_PERD2, value);
	}

	/**
	 * Set the <code>P_PERD2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPPerd2(Field<? extends Number> field) {
		setNumber(P_PERD2, field);
	}
}
