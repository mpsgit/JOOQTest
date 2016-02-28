/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_edit_offr;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppEditOffr;


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
public class FUpdateConcepts extends AbstractRoutine<String> {

	private static final long serialVersionUID = -1159699759;

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.F_UPDATE_CONCEPTS.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.F_UPDATE_CONCEPTS.P_OFFR_ID</code>.
	 */
	public static final Parameter<String> P_OFFR_ID = createParameter("P_OFFR_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.F_UPDATE_CONCEPTS.P_PRFL_CD</code>.
	 */
	public static final Parameter<String> P_PRFL_CD = createParameter("P_PRFL_CD", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.F_UPDATE_CONCEPTS.P_SLS_CLS_CD</code>.
	 */
	public static final Parameter<String> P_SLS_CLS_CD = createParameter("P_SLS_CLS_CD", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.F_UPDATE_CONCEPTS.P_PG_OFS_NR</code>.
	 */
	public static final Parameter<String> P_PG_OFS_NR = createParameter("P_PG_OFS_NR", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.F_UPDATE_CONCEPTS.P_FEAT_SIDE_CD</code>.
	 */
	public static final Parameter<String> P_FEAT_SIDE_CD = createParameter("P_FEAT_SIDE_CD", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.F_UPDATE_CONCEPTS.P_SKU_ID</code>.
	 */
	public static final Parameter<String> P_SKU_ID = createParameter("P_SKU_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.F_UPDATE_CONCEPTS.P_ACTION_TYP</code>.
	 */
	public static final Parameter<String> P_ACTION_TYP = createParameter("P_ACTION_TYP", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.F_UPDATE_CONCEPTS.P_FAIL_CNT</code>.
	 */
	public static final Parameter<BigDecimal> P_FAIL_CNT = createParameter("P_FAIL_CNT", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.F_UPDATE_CONCEPTS.P_UPDATE_CNT</code>.
	 */
	public static final Parameter<BigDecimal> P_UPDATE_CNT = createParameter("P_UPDATE_CNT", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public FUpdateConcepts() {
		super("F_UPDATE_CONCEPTS", Wetrn.WETRN, AppEditOffr.APP_EDIT_OFFR, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_OFFR_ID);
		addInParameter(P_PRFL_CD);
		addInParameter(P_SLS_CLS_CD);
		addInParameter(P_PG_OFS_NR);
		addInParameter(P_FEAT_SIDE_CD);
		addInParameter(P_SKU_ID);
		addInParameter(P_ACTION_TYP);
		addOutParameter(P_FAIL_CNT);
		addOutParameter(P_UPDATE_CNT);
	}

	/**
	 * Set the <code>P_OFFR_ID</code> parameter IN value to the routine
	 */
	public void setPOffrId(String value) {
		setValue(P_OFFR_ID, value);
	}

	/**
	 * Set the <code>P_PRFL_CD</code> parameter IN value to the routine
	 */
	public void setPPrflCd(String value) {
		setValue(P_PRFL_CD, value);
	}

	/**
	 * Set the <code>P_SLS_CLS_CD</code> parameter IN value to the routine
	 */
	public void setPSlsClsCd(String value) {
		setValue(P_SLS_CLS_CD, value);
	}

	/**
	 * Set the <code>P_PG_OFS_NR</code> parameter IN value to the routine
	 */
	public void setPPgOfsNr(String value) {
		setValue(P_PG_OFS_NR, value);
	}

	/**
	 * Set the <code>P_FEAT_SIDE_CD</code> parameter IN value to the routine
	 */
	public void setPFeatSideCd(String value) {
		setValue(P_FEAT_SIDE_CD, value);
	}

	/**
	 * Set the <code>P_SKU_ID</code> parameter IN value to the routine
	 */
	public void setPSkuId(String value) {
		setValue(P_SKU_ID, value);
	}

	/**
	 * Set the <code>P_ACTION_TYP</code> parameter IN value to the routine
	 */
	public void setPActionTyp(String value) {
		setValue(P_ACTION_TYP, value);
	}

	/**
	 * Get the <code>P_FAIL_CNT</code> parameter OUT value from the routine
	 */
	public BigDecimal getPFailCnt() {
		return getValue(P_FAIL_CNT);
	}

	/**
	 * Get the <code>P_UPDATE_CNT</code> parameter OUT value from the routine
	 */
	public BigDecimal getPUpdateCnt() {
		return getValue(P_UPDATE_CNT);
	}
}