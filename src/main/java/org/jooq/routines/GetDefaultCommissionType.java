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
public class GetDefaultCommissionType extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -243990548;

	/**
	 * The parameter <code>WETRN.GET_DEFAULT_COMMISSION_TYPE.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_DEFAULT_COMMISSION_TYPE.PMRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> PMRKT_ID = createParameter("PMRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_DEFAULT_COMMISSION_TYPE.PVEHICLE_ID</code>.
	 */
	public static final Parameter<BigDecimal> PVEHICLE_ID = createParameter("PVEHICLE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_DEFAULT_COMMISSION_TYPE.POFFER_PERIOD_ID</code>.
	 */
	public static final Parameter<BigDecimal> POFFER_PERIOD_ID = createParameter("POFFER_PERIOD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetDefaultCommissionType() {
		super("GET_DEFAULT_COMMISSION_TYPE", Wetrn.WETRN, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(PMRKT_ID);
		addInParameter(PVEHICLE_ID);
		addInParameter(POFFER_PERIOD_ID);
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
	 * Set the <code>PVEHICLE_ID</code> parameter IN value to the routine
	 */
	public void setPvehicleId(Number value) {
		setNumber(PVEHICLE_ID, value);
	}

	/**
	 * Set the <code>PVEHICLE_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPvehicleId(Field<? extends Number> field) {
		setNumber(PVEHICLE_ID, field);
	}

	/**
	 * Set the <code>POFFER_PERIOD_ID</code> parameter IN value to the routine
	 */
	public void setPofferPeriodId(Number value) {
		setNumber(POFFER_PERIOD_ID, value);
	}

	/**
	 * Set the <code>POFFER_PERIOD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPofferPeriodId(Field<? extends Number> field) {
		setNumber(POFFER_PERIOD_ID, field);
	}
}
