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
public class GetRowsProdDynamic2 extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -2130050913;

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC.P_REF_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_REF_PERD_ID = createParameter("P_REF_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC.P_SUB_BRND_ID_LIST</code>.
	 */
	public static final Parameter<String> P_SUB_BRND_ID_LIST = createParameter("P_SUB_BRND_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC.P_BRND_ID_LIST</code>.
	 */
	public static final Parameter<String> P_BRND_ID_LIST = createParameter("P_BRND_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC.P_SGMT_ID_LIST</code>.
	 */
	public static final Parameter<String> P_SGMT_ID_LIST = createParameter("P_SGMT_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC.P_CATGRY_ID_LIST</code>.
	 */
	public static final Parameter<String> P_CATGRY_ID_LIST = createParameter("P_CATGRY_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC.P_PROD_TYP_ID_LIST</code>.
	 */
	public static final Parameter<String> P_PROD_TYP_ID_LIST = createParameter("P_PROD_TYP_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC.P_FORM_ID_LIST</code>.
	 */
	public static final Parameter<String> P_FORM_ID_LIST = createParameter("P_FORM_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC.P_FORM_GRP_ID_LIST</code>.
	 */
	public static final Parameter<String> P_FORM_GRP_ID_LIST = createParameter("P_FORM_GRP_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC.P_GENDR_ID_LIST</code>.
	 */
	public static final Parameter<String> P_GENDR_ID_LIST = createParameter("P_GENDR_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC.P_SLS_CLS_CD_LIST</code>.
	 */
	public static final Parameter<String> P_SLS_CLS_CD_LIST = createParameter("P_SLS_CLS_CD_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC.P_UNPLND_ITMS_IND</code>.
	 */
	public static final Parameter<String> P_UNPLND_ITMS_IND = createParameter("P_UNPLND_ITMS_IND", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetRowsProdDynamic2() {
		super("GET_ROWS_PROD_DYNAMIC", Wetrn.WETRN, RepMain.REP_MAIN, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_REF_PERD_ID);
		addInParameter(P_SUB_BRND_ID_LIST);
		addInParameter(P_BRND_ID_LIST);
		addInParameter(P_SGMT_ID_LIST);
		addInParameter(P_CATGRY_ID_LIST);
		addInParameter(P_PROD_TYP_ID_LIST);
		addInParameter(P_FORM_ID_LIST);
		addInParameter(P_FORM_GRP_ID_LIST);
		addInParameter(P_GENDR_ID_LIST);
		addInParameter(P_SLS_CLS_CD_LIST);
		addInParameter(P_UNPLND_ITMS_IND);
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
	 * Set the <code>P_REF_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPRefPerdId(Number value) {
		setNumber(P_REF_PERD_ID, value);
	}

	/**
	 * Set the <code>P_REF_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPRefPerdId(Field<? extends Number> field) {
		setNumber(P_REF_PERD_ID, field);
	}

	/**
	 * Set the <code>P_SUB_BRND_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPSubBrndIdList(String value) {
		setValue(P_SUB_BRND_ID_LIST, value);
	}

	/**
	 * Set the <code>P_SUB_BRND_ID_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSubBrndIdList(Field<String> field) {
		setField(P_SUB_BRND_ID_LIST, field);
	}

	/**
	 * Set the <code>P_BRND_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPBrndIdList(String value) {
		setValue(P_BRND_ID_LIST, value);
	}

	/**
	 * Set the <code>P_BRND_ID_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPBrndIdList(Field<String> field) {
		setField(P_BRND_ID_LIST, field);
	}

	/**
	 * Set the <code>P_SGMT_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPSgmtIdList(String value) {
		setValue(P_SGMT_ID_LIST, value);
	}

	/**
	 * Set the <code>P_SGMT_ID_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSgmtIdList(Field<String> field) {
		setField(P_SGMT_ID_LIST, field);
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
	 * Set the <code>P_PROD_TYP_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPProdTypIdList(String value) {
		setValue(P_PROD_TYP_ID_LIST, value);
	}

	/**
	 * Set the <code>P_PROD_TYP_ID_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPProdTypIdList(Field<String> field) {
		setField(P_PROD_TYP_ID_LIST, field);
	}

	/**
	 * Set the <code>P_FORM_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPFormIdList(String value) {
		setValue(P_FORM_ID_LIST, value);
	}

	/**
	 * Set the <code>P_FORM_ID_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPFormIdList(Field<String> field) {
		setField(P_FORM_ID_LIST, field);
	}

	/**
	 * Set the <code>P_FORM_GRP_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPFormGrpIdList(String value) {
		setValue(P_FORM_GRP_ID_LIST, value);
	}

	/**
	 * Set the <code>P_FORM_GRP_ID_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPFormGrpIdList(Field<String> field) {
		setField(P_FORM_GRP_ID_LIST, field);
	}

	/**
	 * Set the <code>P_GENDR_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPGendrIdList(String value) {
		setValue(P_GENDR_ID_LIST, value);
	}

	/**
	 * Set the <code>P_GENDR_ID_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPGendrIdList(Field<String> field) {
		setField(P_GENDR_ID_LIST, field);
	}

	/**
	 * Set the <code>P_SLS_CLS_CD_LIST</code> parameter IN value to the routine
	 */
	public void setPSlsClsCdList(String value) {
		setValue(P_SLS_CLS_CD_LIST, value);
	}

	/**
	 * Set the <code>P_SLS_CLS_CD_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSlsClsCdList(Field<String> field) {
		setField(P_SLS_CLS_CD_LIST, field);
	}

	/**
	 * Set the <code>P_UNPLND_ITMS_IND</code> parameter IN value to the routine
	 */
	public void setPUnplndItmsInd(String value) {
		setValue(P_UNPLND_ITMS_IND, value);
	}

	/**
	 * Set the <code>P_UNPLND_ITMS_IND</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPUnplndItmsInd(Field<String> field) {
		setField(P_UNPLND_ITMS_IND, field);
	}
}
