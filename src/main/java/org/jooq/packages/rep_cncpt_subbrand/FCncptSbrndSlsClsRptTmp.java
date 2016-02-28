/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.rep_cncpt_subbrand;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.RepCncptSubbrand;


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
public class FCncptSbrndSlsClsRptTmp extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 1295856681;

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_VEH_ID</code>.
	 */
	public static final Parameter<String> P_VEH_ID = createParameter("P_VEH_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_VER_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_VER_ID = createParameter("P_VER_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_CATGRY_ID</code>.
	 */
	public static final Parameter<String> P_CATGRY_ID = createParameter("P_CATGRY_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_BRND_ID</code>.
	 */
	public static final Parameter<String> P_BRND_ID = createParameter("P_BRND_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_PERD_ID = createParameter("P_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_SLS_CLS_CD</code>.
	 */
	public static final Parameter<String> P_SLS_CLS_CD = createParameter("P_SLS_CLS_CD", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_CURRENCY</code>.
	 */
	public static final Parameter<String> P_CURRENCY = createParameter("P_CURRENCY", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_INC_SUP_BUD</code>.
	 */
	public static final Parameter<String> P_INC_SUP_BUD = createParameter("P_INC_SUP_BUD", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_ACC_BY_IMP_CAT</code>.
	 */
	public static final Parameter<String> P_ACC_BY_IMP_CAT = createParameter("P_ACC_BY_IMP_CAT", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_REG_PRC_OFFR</code>.
	 */
	public static final Parameter<String> P_REG_PRC_OFFR = createParameter("P_REG_PRC_OFFR", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_OFFSET_MIN</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFSET_MIN = createParameter("P_OFFSET_MIN", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_OFFSET_MAX</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFSET_MAX = createParameter("P_OFFSET_MAX", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_SLS_AID</code>.
	 */
	public static final Parameter<String> P_SLS_AID = createParameter("P_SLS_AID", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP.P_CAMPAIGN_SLS</code>.
	 */
	public static final Parameter<String> P_CAMPAIGN_SLS = createParameter("P_CAMPAIGN_SLS", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public FCncptSbrndSlsClsRptTmp() {
		super("F_CNCPT_SBRND_SLS_CLS_RPT_TMP", Wetrn.WETRN, RepCncptSubbrand.REP_CNCPT_SUBBRAND, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_VEH_ID);
		addInParameter(P_VER_ID);
		addInParameter(P_CATGRY_ID);
		addInParameter(P_BRND_ID);
		addInParameter(P_PERD_ID);
		addInParameter(P_SLS_CLS_CD);
		addInParameter(P_CURRENCY);
		addInParameter(P_INC_SUP_BUD);
		addInParameter(P_ACC_BY_IMP_CAT);
		addInParameter(P_REG_PRC_OFFR);
		addInParameter(P_OFFSET_MIN);
		addInParameter(P_OFFSET_MAX);
		addInParameter(P_SLS_AID);
		addInParameter(P_CAMPAIGN_SLS);
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

	/**
	 * Set the <code>P_BRND_ID</code> parameter IN value to the routine
	 */
	public void setPBrndId(String value) {
		setValue(P_BRND_ID, value);
	}

	/**
	 * Set the <code>P_BRND_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPBrndId(Field<String> field) {
		setField(P_BRND_ID, field);
	}

	/**
	 * Set the <code>P_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPPerdId(Number value) {
		setNumber(P_PERD_ID, value);
	}

	/**
	 * Set the <code>P_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPPerdId(Field<? extends Number> field) {
		setNumber(P_PERD_ID, field);
	}

	/**
	 * Set the <code>P_SLS_CLS_CD</code> parameter IN value to the routine
	 */
	public void setPSlsClsCd(String value) {
		setValue(P_SLS_CLS_CD, value);
	}

	/**
	 * Set the <code>P_SLS_CLS_CD</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSlsClsCd(Field<String> field) {
		setField(P_SLS_CLS_CD, field);
	}

	/**
	 * Set the <code>P_CURRENCY</code> parameter IN value to the routine
	 */
	public void setPCurrency(String value) {
		setValue(P_CURRENCY, value);
	}

	/**
	 * Set the <code>P_CURRENCY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPCurrency(Field<String> field) {
		setField(P_CURRENCY, field);
	}

	/**
	 * Set the <code>P_INC_SUP_BUD</code> parameter IN value to the routine
	 */
	public void setPIncSupBud(String value) {
		setValue(P_INC_SUP_BUD, value);
	}

	/**
	 * Set the <code>P_INC_SUP_BUD</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPIncSupBud(Field<String> field) {
		setField(P_INC_SUP_BUD, field);
	}

	/**
	 * Set the <code>P_ACC_BY_IMP_CAT</code> parameter IN value to the routine
	 */
	public void setPAccByImpCat(String value) {
		setValue(P_ACC_BY_IMP_CAT, value);
	}

	/**
	 * Set the <code>P_ACC_BY_IMP_CAT</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPAccByImpCat(Field<String> field) {
		setField(P_ACC_BY_IMP_CAT, field);
	}

	/**
	 * Set the <code>P_REG_PRC_OFFR</code> parameter IN value to the routine
	 */
	public void setPRegPrcOffr(String value) {
		setValue(P_REG_PRC_OFFR, value);
	}

	/**
	 * Set the <code>P_REG_PRC_OFFR</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPRegPrcOffr(Field<String> field) {
		setField(P_REG_PRC_OFFR, field);
	}

	/**
	 * Set the <code>P_OFFSET_MIN</code> parameter IN value to the routine
	 */
	public void setPOffsetMin(Number value) {
		setNumber(P_OFFSET_MIN, value);
	}

	/**
	 * Set the <code>P_OFFSET_MIN</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffsetMin(Field<? extends Number> field) {
		setNumber(P_OFFSET_MIN, field);
	}

	/**
	 * Set the <code>P_OFFSET_MAX</code> parameter IN value to the routine
	 */
	public void setPOffsetMax(Number value) {
		setNumber(P_OFFSET_MAX, value);
	}

	/**
	 * Set the <code>P_OFFSET_MAX</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffsetMax(Field<? extends Number> field) {
		setNumber(P_OFFSET_MAX, field);
	}

	/**
	 * Set the <code>P_SLS_AID</code> parameter IN value to the routine
	 */
	public void setPSlsAid(String value) {
		setValue(P_SLS_AID, value);
	}

	/**
	 * Set the <code>P_SLS_AID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSlsAid(Field<String> field) {
		setField(P_SLS_AID, field);
	}

	/**
	 * Set the <code>P_CAMPAIGN_SLS</code> parameter IN value to the routine
	 */
	public void setPCampaignSls(String value) {
		setValue(P_CAMPAIGN_SLS, value);
	}

	/**
	 * Set the <code>P_CAMPAIGN_SLS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPCampaignSls(Field<String> field) {
		setField(P_CAMPAIGN_SLS, field);
	}
}
