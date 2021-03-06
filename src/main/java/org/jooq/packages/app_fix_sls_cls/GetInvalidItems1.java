/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_fix_sls_cls;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppFixSlsCls;


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
public class GetInvalidItems1 extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -1310315771;

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.GET_INVALID_ITEMS.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.GET_INVALID_ITEMS.P_MRKT_ID_LIST</code>.
	 */
	public static final Parameter<String> P_MRKT_ID_LIST = createParameter("P_MRKT_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.GET_INVALID_ITEMS.P_CAL_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_CAL_MRKT_ID = createParameter("P_CAL_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.GET_INVALID_ITEMS.P_FROM_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_FROM_PERD_ID = createParameter("P_FROM_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.GET_INVALID_ITEMS.P_TO_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_TO_PERD_ID = createParameter("P_TO_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.GET_INVALID_ITEMS.P_VEH_ID_LIST</code>.
	 */
	public static final Parameter<String> P_VEH_ID_LIST = createParameter("P_VEH_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.GET_INVALID_ITEMS.P_CATGRY_ID_LIST</code>.
	 */
	public static final Parameter<String> P_CATGRY_ID_LIST = createParameter("P_CATGRY_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.GET_INVALID_ITEMS.P_PRFL_CD_LIST</code>.
	 */
	public static final Parameter<String> P_PRFL_CD_LIST = createParameter("P_PRFL_CD_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetInvalidItems1() {
		super("GET_INVALID_ITEMS", Wetrn.WETRN, AppFixSlsCls.APP_FIX_SLS_CLS, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID_LIST);
		addInParameter(P_CAL_MRKT_ID);
		addInParameter(P_FROM_PERD_ID);
		addInParameter(P_TO_PERD_ID);
		addInParameter(P_VEH_ID_LIST);
		addInParameter(P_CATGRY_ID_LIST);
		addInParameter(P_PRFL_CD_LIST);
		setOverloaded(true);
	}

	/**
	 * Set the <code>P_MRKT_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPMrktIdList(String value) {
		setValue(P_MRKT_ID_LIST, value);
	}

	/**
	 * Set the <code>P_MRKT_ID_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMrktIdList(Field<String> field) {
		setField(P_MRKT_ID_LIST, field);
	}

	/**
	 * Set the <code>P_CAL_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPCalMrktId(Number value) {
		setNumber(P_CAL_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_CAL_MRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPCalMrktId(Field<? extends Number> field) {
		setNumber(P_CAL_MRKT_ID, field);
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
	 * Set the <code>P_CATGRY_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPCatgryIdList(String value) {
		setValue(P_CATGRY_ID_LIST, value);
	}

	/**
	 * Set the <code>P_CATGRY_ID_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPCatgryIdList(Field<String> field) {
		setField(P_CATGRY_ID_LIST, field);
	}

	/**
	 * Set the <code>P_PRFL_CD_LIST</code> parameter IN value to the routine
	 */
	public void setPPrflCdList(String value) {
		setValue(P_PRFL_CD_LIST, value);
	}

	/**
	 * Set the <code>P_PRFL_CD_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPPrflCdList(Field<String> field) {
		setField(P_PRFL_CD_LIST, field);
	}
}
