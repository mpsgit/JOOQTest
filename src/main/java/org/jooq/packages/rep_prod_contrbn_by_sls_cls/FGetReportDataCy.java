/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.rep_prod_contrbn_by_sls_cls;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.RepProdContrbnBySlsCls;


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
public class FGetReportDataCy extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 1748238326;

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_VER_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_VER_ID = createParameter("P_VER_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_CATGRY_IDS</code>.
	 */
	public static final Parameter<String> P_CATGRY_IDS = createParameter("P_CATGRY_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_SLS_CLS_CDS</code>.
	 */
	public static final Parameter<String> P_SLS_CLS_CDS = createParameter("P_SLS_CLS_CDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_BRND_IDS</code>.
	 */
	public static final Parameter<String> P_BRND_IDS = createParameter("P_BRND_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_ACC_BY_IMP_CAT</code>.
	 */
	public static final Parameter<String> P_ACC_BY_IMP_CAT = createParameter("P_ACC_BY_IMP_CAT", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_INC_SUP_BUD</code>.
	 */
	public static final Parameter<String> P_INC_SUP_BUD = createParameter("P_INC_SUP_BUD", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_INC_SLS_AID</code>.
	 */
	public static final Parameter<String> P_INC_SLS_AID = createParameter("P_INC_SLS_AID", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_INC_CNCPT_DTL</code>.
	 */
	public static final Parameter<String> P_INC_CNCPT_DTL = createParameter("P_INC_CNCPT_DTL", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_CAMPAIGN_SLS</code>.
	 */
	public static final Parameter<String> P_CAMPAIGN_SLS = createParameter("P_CAMPAIGN_SLS", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_MIN_OFFSET</code>.
	 */
	public static final Parameter<BigDecimal> P_MIN_OFFSET = createParameter("P_MIN_OFFSET", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_MAX_OFFSET</code>.
	 */
	public static final Parameter<BigDecimal> P_MAX_OFFSET = createParameter("P_MAX_OFFSET", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_CURRENCY</code>.
	 */
	public static final Parameter<String> P_CURRENCY = createParameter("P_CURRENCY", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY.P_GRP_BY_BUSINESS</code>.
	 */
	public static final Parameter<String> P_GRP_BY_BUSINESS = createParameter("P_GRP_BY_BUSINESS", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public FGetReportDataCy() {
		super("F_GET_REPORT_DATA_CY", Wetrn.WETRN, RepProdContrbnBySlsCls.REP_PROD_CONTRBN_BY_SLS_CLS, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
		addInParameter(P_VER_ID);
		addInParameter(P_CATGRY_IDS);
		addInParameter(P_SLS_CLS_CDS);
		addInParameter(P_BRND_IDS);
		addInParameter(P_ACC_BY_IMP_CAT);
		addInParameter(P_INC_SUP_BUD);
		addInParameter(P_INC_SLS_AID);
		addInParameter(P_INC_CNCPT_DTL);
		addInParameter(P_CAMPAIGN_SLS);
		addInParameter(P_MIN_OFFSET);
		addInParameter(P_MAX_OFFSET);
		addInParameter(P_CURRENCY);
		addInParameter(P_GRP_BY_BUSINESS);
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
	 * Set the <code>P_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPOffrPerdId(Number value) {
		setNumber(P_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffrPerdId(Field<? extends Number> field) {
		setNumber(P_OFFR_PERD_ID, field);
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
	 * Set the <code>P_CATGRY_IDS</code> parameter IN value to the routine
	 */
	public void setPCatgryIds(String value) {
		setValue(P_CATGRY_IDS, value);
	}

	/**
	 * Set the <code>P_CATGRY_IDS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPCatgryIds(Field<String> field) {
		setField(P_CATGRY_IDS, field);
	}

	/**
	 * Set the <code>P_SLS_CLS_CDS</code> parameter IN value to the routine
	 */
	public void setPSlsClsCds(String value) {
		setValue(P_SLS_CLS_CDS, value);
	}

	/**
	 * Set the <code>P_SLS_CLS_CDS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSlsClsCds(Field<String> field) {
		setField(P_SLS_CLS_CDS, field);
	}

	/**
	 * Set the <code>P_BRND_IDS</code> parameter IN value to the routine
	 */
	public void setPBrndIds(String value) {
		setValue(P_BRND_IDS, value);
	}

	/**
	 * Set the <code>P_BRND_IDS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPBrndIds(Field<String> field) {
		setField(P_BRND_IDS, field);
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
	 * Set the <code>P_INC_SLS_AID</code> parameter IN value to the routine
	 */
	public void setPIncSlsAid(String value) {
		setValue(P_INC_SLS_AID, value);
	}

	/**
	 * Set the <code>P_INC_SLS_AID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPIncSlsAid(Field<String> field) {
		setField(P_INC_SLS_AID, field);
	}

	/**
	 * Set the <code>P_INC_CNCPT_DTL</code> parameter IN value to the routine
	 */
	public void setPIncCncptDtl(String value) {
		setValue(P_INC_CNCPT_DTL, value);
	}

	/**
	 * Set the <code>P_INC_CNCPT_DTL</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPIncCncptDtl(Field<String> field) {
		setField(P_INC_CNCPT_DTL, field);
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
	 * Set the <code>P_GRP_BY_BUSINESS</code> parameter IN value to the routine
	 */
	public void setPGrpByBusiness(String value) {
		setValue(P_GRP_BY_BUSINESS, value);
	}

	/**
	 * Set the <code>P_GRP_BY_BUSINESS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPGrpByBusiness(Field<String> field) {
		setField(P_GRP_BY_BUSINESS, field);
	}
}
