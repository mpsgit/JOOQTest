/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_frcst_boost;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaFrcstBoost;
import org.jooq.udt.records.TTblFbFrcstBoostCreVerRecord;
import org.jooq.udt.records.TTblFbFrcstBoostFbVerRecord;
import org.jooq.udt.records.TTblFbFrcstBoostWipBoostRecord;


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
public class FrcstBoostView extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -1179139022;

	/**
	 * The parameter <code>WETRN.PA_FRCST_BOOST.FRCST_BOOST_VIEW.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_FRCST_BOOST.FRCST_BOOST_VIEW.P_USER_ID</code>.
	 */
	public static final Parameter<String> P_USER_ID = createParameter("P_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_FRCST_BOOST.FRCST_BOOST_VIEW.P_TBL_FB_FRCST_BOOST_CRE_VER</code>.
	 */
	public static final Parameter<TTblFbFrcstBoostCreVerRecord> P_TBL_FB_FRCST_BOOST_CRE_VER = createParameter("P_TBL_FB_FRCST_BOOST_CRE_VER", org.jooq.udt.TFbFrcstBoostCreVer.T_FB_FRCST_BOOST_CRE_VER.getDataType().asArrayDataType(org.jooq.udt.records.TTblFbFrcstBoostCreVerRecord.class), false);

	/**
	 * The parameter <code>WETRN.PA_FRCST_BOOST.FRCST_BOOST_VIEW.P_TBL_FB_FRCST_BOOST_WIP_BOOST</code>.
	 */
	public static final Parameter<TTblFbFrcstBoostWipBoostRecord> P_TBL_FB_FRCST_BOOST_WIP_BOOST = createParameter("P_TBL_FB_FRCST_BOOST_WIP_BOOST", org.jooq.udt.TFbFrcstBoostWipBoost.T_FB_FRCST_BOOST_WIP_BOOST.getDataType().asArrayDataType(org.jooq.udt.records.TTblFbFrcstBoostWipBoostRecord.class), false);

	/**
	 * The parameter <code>WETRN.PA_FRCST_BOOST.FRCST_BOOST_VIEW.P_TBL_FB_FRCST_BOOST_FB_VER</code>.
	 */
	public static final Parameter<TTblFbFrcstBoostFbVerRecord> P_TBL_FB_FRCST_BOOST_FB_VER = createParameter("P_TBL_FB_FRCST_BOOST_FB_VER", org.jooq.udt.TFbFrcstBoostFbVer.T_FB_FRCST_BOOST_FB_VER.getDataType().asArrayDataType(org.jooq.udt.records.TTblFbFrcstBoostFbVerRecord.class), false);

	/**
	 * Create a new routine call instance
	 */
	public FrcstBoostView() {
		super("FRCST_BOOST_VIEW", Wetrn.WETRN, PaFrcstBoost.PA_FRCST_BOOST, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_USER_ID);
		addInOutParameter(P_TBL_FB_FRCST_BOOST_CRE_VER);
		addOutParameter(P_TBL_FB_FRCST_BOOST_WIP_BOOST);
		addOutParameter(P_TBL_FB_FRCST_BOOST_FB_VER);
	}

	/**
	 * Set the <code>P_USER_ID</code> parameter IN value to the routine
	 */
	public void setPUserId(String value) {
		setValue(P_USER_ID, value);
	}

	/**
	 * Set the <code>P_TBL_FB_FRCST_BOOST_CRE_VER</code> parameter IN value to the routine
	 */
	public void setPTblFbFrcstBoostCreVer(TTblFbFrcstBoostCreVerRecord value) {
		setValue(P_TBL_FB_FRCST_BOOST_CRE_VER, value);
	}

	/**
	 * Get the <code>P_TBL_FB_FRCST_BOOST_CRE_VER</code> parameter OUT value from the routine
	 */
	public TTblFbFrcstBoostCreVerRecord getPTblFbFrcstBoostCreVer() {
		return getValue(P_TBL_FB_FRCST_BOOST_CRE_VER);
	}

	/**
	 * Get the <code>P_TBL_FB_FRCST_BOOST_WIP_BOOST</code> parameter OUT value from the routine
	 */
	public TTblFbFrcstBoostWipBoostRecord getPTblFbFrcstBoostWipBoost() {
		return getValue(P_TBL_FB_FRCST_BOOST_WIP_BOOST);
	}

	/**
	 * Get the <code>P_TBL_FB_FRCST_BOOST_FB_VER</code> parameter OUT value from the routine
	 */
	public TTblFbFrcstBoostFbVerRecord getPTblFbFrcstBoostFbVer() {
		return getValue(P_TBL_FB_FRCST_BOOST_FB_VER);
	}
}