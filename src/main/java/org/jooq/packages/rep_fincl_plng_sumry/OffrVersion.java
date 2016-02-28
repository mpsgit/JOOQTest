/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.rep_fincl_plng_sumry;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.RepFinclPlngSumry;


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
public class OffrVersion extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 1802373909;

	/**
	 * The parameter <code>WETRN.REP_FINCL_PLNG_SUMRY.OFFR_VERSION.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.REP_FINCL_PLNG_SUMRY.OFFR_VERSION.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_FINCL_PLNG_SUMRY.OFFR_VERSION.P_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_PERD_ID = createParameter("P_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_FINCL_PLNG_SUMRY.OFFR_VERSION.P_OBJCTV_ID</code>.
	 */
	public static final Parameter<String> P_OBJCTV_ID = createParameter("P_OBJCTV_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_FINCL_PLNG_SUMRY.OFFR_VERSION.P_OFFR_VER_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_VER_ID = createParameter("P_OFFR_VER_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_FINCL_PLNG_SUMRY.OFFR_VERSION.P_CURRENCY</code>.
	 */
	public static final Parameter<String> P_CURRENCY = createParameter("P_CURRENCY", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_FINCL_PLNG_SUMRY.OFFR_VERSION.P_ACC_BY_IMP_CAT</code>.
	 */
	public static final Parameter<String> P_ACC_BY_IMP_CAT = createParameter("P_ACC_BY_IMP_CAT", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_FINCL_PLNG_SUMRY.OFFR_VERSION.P_INC_SUP_BUD</code>.
	 */
	public static final Parameter<String> P_INC_SUP_BUD = createParameter("P_INC_SUP_BUD", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_FINCL_PLNG_SUMRY.OFFR_VERSION.P_SLS_AID</code>.
	 */
	public static final Parameter<String> P_SLS_AID = createParameter("P_SLS_AID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_FINCL_PLNG_SUMRY.OFFR_VERSION.P_CAMPAIGN_SLS</code>.
	 */
	public static final Parameter<String> P_CAMPAIGN_SLS = createParameter("P_CAMPAIGN_SLS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public OffrVersion() {
		super("OFFR_VERSION", Wetrn.WETRN, RepFinclPlngSumry.REP_FINCL_PLNG_SUMRY, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_PERD_ID);
		addInParameter(P_OBJCTV_ID);
		addInParameter(P_OFFR_VER_ID);
		addInParameter(P_CURRENCY);
		addInParameter(P_ACC_BY_IMP_CAT);
		addInParameter(P_INC_SUP_BUD);
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
	 * Set the <code>P_OBJCTV_ID</code> parameter IN value to the routine
	 */
	public void setPObjctvId(String value) {
		setValue(P_OBJCTV_ID, value);
	}

	/**
	 * Set the <code>P_OBJCTV_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPObjctvId(Field<String> field) {
		setField(P_OBJCTV_ID, field);
	}

	/**
	 * Set the <code>P_OFFR_VER_ID</code> parameter IN value to the routine
	 */
	public void setPOffrVerId(Number value) {
		setNumber(P_OFFR_VER_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_VER_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffrVerId(Field<? extends Number> field) {
		setNumber(P_OFFR_VER_ID, field);
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