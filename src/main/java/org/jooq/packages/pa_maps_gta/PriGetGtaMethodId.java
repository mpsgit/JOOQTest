/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_gta;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsGta;


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
public class PriGetGtaMethodId extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -1163361995;

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.PRI_GET_GTA_METHOD_ID.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.PRI_GET_GTA_METHOD_ID.PMRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> PMRKT_ID = createParameter("PMRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.PRI_GET_GTA_METHOD_ID.PPERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> PPERD_ID = createParameter("PPERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public PriGetGtaMethodId() {
		super("PRI_GET_GTA_METHOD_ID", Wetrn.WETRN, PaMapsGta.PA_MAPS_GTA, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(PMRKT_ID);
		addInParameter(PPERD_ID);
	}

	/**
	 * Set the <code>PMRKT_ID</code> parameter IN value to the routine
	 */
	public void setPmrktId(Number value) {
		setNumber(PMRKT_ID, value);
	}

	/**
	 * Set the <code>PMRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPmrktId(Field<? extends Number> field) {
		setNumber(PMRKT_ID, field);
	}

	/**
	 * Set the <code>PPERD_ID</code> parameter IN value to the routine
	 */
	public void setPperdId(Number value) {
		setNumber(PPERD_ID, value);
	}

	/**
	 * Set the <code>PPERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPperdId(Field<? extends Number> field) {
		setNumber(PPERD_ID, field);
	}
}