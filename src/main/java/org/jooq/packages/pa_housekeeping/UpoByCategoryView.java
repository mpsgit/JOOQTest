/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_housekeeping;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaHousekeeping;


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
public class UpoByCategoryView extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 795382646;

	/**
	 * The parameter <code>WETRN.PA_HOUSEKEEPING.UPO_BY_CATEGORY_VIEW.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.PA_HOUSEKEEPING.UPO_BY_CATEGORY_VIEW.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_HOUSEKEEPING.UPO_BY_CATEGORY_VIEW.P_STRT_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_STRT_OFFR_PERD_ID = createParameter("P_STRT_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_HOUSEKEEPING.UPO_BY_CATEGORY_VIEW.P_END_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_END_OFFR_PERD_ID = createParameter("P_END_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_HOUSEKEEPING.UPO_BY_CATEGORY_VIEW.P_VEH_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_VEH_ID = createParameter("P_VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public UpoByCategoryView() {
		super("UPO_BY_CATEGORY_VIEW", Wetrn.WETRN, PaHousekeeping.PA_HOUSEKEEPING, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_STRT_OFFR_PERD_ID);
		addInParameter(P_END_OFFR_PERD_ID);
		addInParameter(P_VEH_ID);
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
	 * Set the <code>P_STRT_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPStrtOffrPerdId(Number value) {
		setNumber(P_STRT_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_STRT_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPStrtOffrPerdId(Field<? extends Number> field) {
		setNumber(P_STRT_OFFR_PERD_ID, field);
	}

	/**
	 * Set the <code>P_END_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPEndOffrPerdId(Number value) {
		setNumber(P_END_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_END_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPEndOffrPerdId(Field<? extends Number> field) {
		setNumber(P_END_OFFR_PERD_ID, field);
	}

	/**
	 * Set the <code>P_VEH_ID</code> parameter IN value to the routine
	 */
	public void setPVehId(Number value) {
		setNumber(P_VEH_ID, value);
	}

	/**
	 * Set the <code>P_VEH_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPVehId(Field<? extends Number> field) {
		setNumber(P_VEH_ID, field);
	}
}
