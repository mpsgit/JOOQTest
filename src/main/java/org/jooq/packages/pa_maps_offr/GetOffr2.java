/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_offr;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsOffr;
import org.jooq.udt.records.ObjOffrRecord;


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
public class GetOffr2 extends AbstractRoutine<ObjOffrRecord> {

	private static final long serialVersionUID = -703089557;

	/**
	 * The parameter <code>WETRN.PA_MAPS_OFFR.GET_OFFR.RETURN_VALUE</code>.
	 */
	public static final Parameter<ObjOffrRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.udt.ObjOffr.OBJ_OFFR.getDataType(), false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_OFFR.GET_OFFR.P_OFFR_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_ID = createParameter("P_OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_OFFR.GET_OFFR.P_VER_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_VER_ID = createParameter("P_VER_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_OFFR.GET_OFFR.P_DATA_LEVEL</code>.
	 */
	public static final Parameter<BigDecimal> P_DATA_LEVEL = createParameter("P_DATA_LEVEL", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetOffr2() {
		super("GET_OFFR", Wetrn.WETRN, PaMapsOffr.PA_MAPS_OFFR, org.jooq.udt.ObjOffr.OBJ_OFFR.getDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_OFFR_ID);
		addInParameter(P_VER_ID);
		addInParameter(P_DATA_LEVEL);
		setOverloaded(true);
	}

	/**
	 * Set the <code>P_OFFR_ID</code> parameter IN value to the routine
	 */
	public void setPOffrId(Number value) {
		setNumber(P_OFFR_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffrId(Field<? extends Number> field) {
		setNumber(P_OFFR_ID, field);
	}

	/**
	 * Set the <code>P_VER_ID</code> parameter IN value to the routine
	 */
	public void setPVerId(Number value) {
		setNumber(P_VER_ID, value);
	}

	/**
	 * Set the <code>P_VER_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPVerId(Field<? extends Number> field) {
		setNumber(P_VER_ID, field);
	}

	/**
	 * Set the <code>P_DATA_LEVEL</code> parameter IN value to the routine
	 */
	public void setPDataLevel(Number value) {
		setNumber(P_DATA_LEVEL, value);
	}

	/**
	 * Set the <code>P_DATA_LEVEL</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPDataLevel(Field<? extends Number> field) {
		setNumber(P_DATA_LEVEL, field);
	}
}
