/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.rep_bus_contr_catgry;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.RepBusContrCatgry;


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
public class GetPlugGrossSales extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 1185684834;

	/**
	 * The parameter <code>WETRN.REP_BUS_CONTR_CATGRY.GET_PLUG_GROSS_SALES.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_BUS_CONTR_CATGRY.GET_PLUG_GROSS_SALES.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_BUS_CONTR_CATGRY.GET_PLUG_GROSS_SALES.P_VEH_ID</code>.
	 */
	public static final Parameter<String> P_VEH_ID = createParameter("P_VEH_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_BUS_CONTR_CATGRY.GET_PLUG_GROSS_SALES.P_FROM_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_FROM_OFFR_PERD_ID = createParameter("P_FROM_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_BUS_CONTR_CATGRY.GET_PLUG_GROSS_SALES.P_TO_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_TO_OFFR_PERD_ID = createParameter("P_TO_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_BUS_CONTR_CATGRY.GET_PLUG_GROSS_SALES.P_MIN_OFFSET</code>.
	 */
	public static final Parameter<BigDecimal> P_MIN_OFFSET = createParameter("P_MIN_OFFSET", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_BUS_CONTR_CATGRY.GET_PLUG_GROSS_SALES.P_MAX_OFFSET</code>.
	 */
	public static final Parameter<BigDecimal> P_MAX_OFFSET = createParameter("P_MAX_OFFSET", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_BUS_CONTR_CATGRY.GET_PLUG_GROSS_SALES.P_CATGRY_ID</code>.
	 */
	public static final Parameter<String> P_CATGRY_ID = createParameter("P_CATGRY_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetPlugGrossSales() {
		super("GET_PLUG_GROSS_SALES", Wetrn.WETRN, RepBusContrCatgry.REP_BUS_CONTR_CATGRY, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_VEH_ID);
		addInParameter(P_FROM_OFFR_PERD_ID);
		addInParameter(P_TO_OFFR_PERD_ID);
		addInParameter(P_MIN_OFFSET);
		addInParameter(P_MAX_OFFSET);
		addInParameter(P_CATGRY_ID);
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
	 * Set the <code>P_VEH_ID</code> parameter IN value to the routine
	 */
	public void setPVehId(String value) {
		setValue(P_VEH_ID, value);
	}

	/**
	 * Set the <code>P_VEH_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPVehId(Field<String> field) {
		setField(P_VEH_ID, field);
	}

	/**
	 * Set the <code>P_FROM_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPFromOffrPerdId(Number value) {
		setNumber(P_FROM_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_FROM_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPFromOffrPerdId(Field<? extends Number> field) {
		setNumber(P_FROM_OFFR_PERD_ID, field);
	}

	/**
	 * Set the <code>P_TO_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPToOffrPerdId(Number value) {
		setNumber(P_TO_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_TO_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPToOffrPerdId(Field<? extends Number> field) {
		setNumber(P_TO_OFFR_PERD_ID, field);
	}

	/**
	 * Set the <code>P_MIN_OFFSET</code> parameter IN value to the routine
	 */
	public void setPMinOffset(Number value) {
		setNumber(P_MIN_OFFSET, value);
	}

	/**
	 * Set the <code>P_MIN_OFFSET</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMinOffset(Field<? extends Number> field) {
		setNumber(P_MIN_OFFSET, field);
	}

	/**
	 * Set the <code>P_MAX_OFFSET</code> parameter IN value to the routine
	 */
	public void setPMaxOffset(Number value) {
		setNumber(P_MAX_OFFSET, value);
	}

	/**
	 * Set the <code>P_MAX_OFFSET</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMaxOffset(Field<? extends Number> field) {
		setNumber(P_MAX_OFFSET, field);
	}

	/**
	 * Set the <code>P_CATGRY_ID</code> parameter IN value to the routine
	 */
	public void setPCatgryId(String value) {
		setValue(P_CATGRY_ID, value);
	}

	/**
	 * Set the <code>P_CATGRY_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPCatgryId(Field<String> field) {
		setField(P_CATGRY_ID, field);
	}
}
