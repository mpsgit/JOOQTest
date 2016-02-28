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
public class GetRowsCosDynamic extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -211963737;

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_COS_DYNAMIC.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_COS_DYNAMIC.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_COS_DYNAMIC.P_VEH_ID_LIST</code>.
	 */
	public static final Parameter<String> P_VEH_ID_LIST = createParameter("P_VEH_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_COS_DYNAMIC.P_FROM_SLS_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_FROM_SLS_PERD_ID = createParameter("P_FROM_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_COS_DYNAMIC.P_TO_SLS_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_TO_SLS_PERD_ID = createParameter("P_TO_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_COS_DYNAMIC.P_VER_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_VER_ID = createParameter("P_VER_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_COS_DYNAMIC.P_SLS_TYP_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SLS_TYP_ID = createParameter("P_SLS_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetRowsCosDynamic() {
		super("GET_ROWS_COS_DYNAMIC", Wetrn.WETRN, RepMain.REP_MAIN, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_VEH_ID_LIST);
		addInParameter(P_FROM_SLS_PERD_ID);
		addInParameter(P_TO_SLS_PERD_ID);
		addInParameter(P_VER_ID);
		addInParameter(P_SLS_TYP_ID);
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
	 * Set the <code>P_VEH_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPVehIdList(String value) {
		setValue(P_VEH_ID_LIST, value);
	}

	/**
	 * Set the <code>P_VEH_ID_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPVehIdList(Field<String> field) {
		setField(P_VEH_ID_LIST, field);
	}

	/**
	 * Set the <code>P_FROM_SLS_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPFromSlsPerdId(Number value) {
		setNumber(P_FROM_SLS_PERD_ID, value);
	}

	/**
	 * Set the <code>P_FROM_SLS_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPFromSlsPerdId(Field<? extends Number> field) {
		setNumber(P_FROM_SLS_PERD_ID, field);
	}

	/**
	 * Set the <code>P_TO_SLS_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPToSlsPerdId(Number value) {
		setNumber(P_TO_SLS_PERD_ID, value);
	}

	/**
	 * Set the <code>P_TO_SLS_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPToSlsPerdId(Field<? extends Number> field) {
		setNumber(P_TO_SLS_PERD_ID, field);
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
	 * Set the <code>P_SLS_TYP_ID</code> parameter IN value to the routine
	 */
	public void setPSlsTypId(Number value) {
		setNumber(P_SLS_TYP_ID, value);
	}

	/**
	 * Set the <code>P_SLS_TYP_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSlsTypId(Field<? extends Number> field) {
		setNumber(P_SLS_TYP_ID, field);
	}
}
