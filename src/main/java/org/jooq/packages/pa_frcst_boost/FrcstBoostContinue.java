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
import org.jooq.udt.records.TTblVarchar2_250Record;


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
public class FrcstBoostContinue extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -189402919;

	/**
	 * The parameter <code>WETRN.PA_FRCST_BOOST.FRCST_BOOST_CONTINUE.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_FRCST_BOOST.FRCST_BOOST_CONTINUE.P_USER_ID</code>.
	 */
	public static final Parameter<String> P_USER_ID = createParameter("P_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_FRCST_BOOST.FRCST_BOOST_CONTINUE.P_TBL_FB_FRCST_BOOST_CRE_VER</code>.
	 */
	public static final Parameter<TTblFbFrcstBoostCreVerRecord> P_TBL_FB_FRCST_BOOST_CRE_VER = createParameter("P_TBL_FB_FRCST_BOOST_CRE_VER", org.jooq.udt.TFbFrcstBoostCreVer.T_FB_FRCST_BOOST_CRE_VER.getDataType().asArrayDataType(org.jooq.udt.records.TTblFbFrcstBoostCreVerRecord.class), false);

	/**
	 * The parameter <code>WETRN.PA_FRCST_BOOST.FRCST_BOOST_CONTINUE.P_TBL_FB_FRCST_BOOST_WIP_BOOST</code>.
	 */
	public static final Parameter<TTblFbFrcstBoostWipBoostRecord> P_TBL_FB_FRCST_BOOST_WIP_BOOST = createParameter("P_TBL_FB_FRCST_BOOST_WIP_BOOST", org.jooq.udt.TFbFrcstBoostWipBoost.T_FB_FRCST_BOOST_WIP_BOOST.getDataType().asArrayDataType(org.jooq.udt.records.TTblFbFrcstBoostWipBoostRecord.class), false);

	/**
	 * The parameter <code>WETRN.PA_FRCST_BOOST.FRCST_BOOST_CONTINUE.P_TBL_FB_FRCST_BOOST_FB_VER</code>.
	 */
	public static final Parameter<TTblFbFrcstBoostFbVerRecord> P_TBL_FB_FRCST_BOOST_FB_VER = createParameter("P_TBL_FB_FRCST_BOOST_FB_VER", org.jooq.udt.TFbFrcstBoostFbVer.T_FB_FRCST_BOOST_FB_VER.getDataType().asArrayDataType(org.jooq.udt.records.TTblFbFrcstBoostFbVerRecord.class), false);

	/**
	 * The parameter <code>WETRN.PA_FRCST_BOOST.FRCST_BOOST_CONTINUE.P_STUS_MSG_TXT</code>.
	 */
	public static final Parameter<String> P_STUS_MSG_TXT = createParameter("P_STUS_MSG_TXT", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_FRCST_BOOST.FRCST_BOOST_CONTINUE.P_TBL_STUS_ERR_MSG_TXT</code>.
	 */
	public static final Parameter<TTblVarchar2_250Record> P_TBL_STUS_ERR_MSG_TXT = createParameter("P_TBL_STUS_ERR_MSG_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(250).asArrayDataType(org.jooq.udt.records.TTblVarchar2_250Record.class), false);

	/**
	 * Create a new routine call instance
	 */
	public FrcstBoostContinue() {
		super("FRCST_BOOST_CONTINUE", Wetrn.WETRN, PaFrcstBoost.PA_FRCST_BOOST, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_USER_ID);
		addInParameter(P_TBL_FB_FRCST_BOOST_CRE_VER);
		addInParameter(P_TBL_FB_FRCST_BOOST_WIP_BOOST);
		addInParameter(P_TBL_FB_FRCST_BOOST_FB_VER);
		addOutParameter(P_STUS_MSG_TXT);
		addOutParameter(P_TBL_STUS_ERR_MSG_TXT);
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
	 * Set the <code>P_TBL_FB_FRCST_BOOST_WIP_BOOST</code> parameter IN value to the routine
	 */
	public void setPTblFbFrcstBoostWipBoost(TTblFbFrcstBoostWipBoostRecord value) {
		setValue(P_TBL_FB_FRCST_BOOST_WIP_BOOST, value);
	}

	/**
	 * Set the <code>P_TBL_FB_FRCST_BOOST_FB_VER</code> parameter IN value to the routine
	 */
	public void setPTblFbFrcstBoostFbVer(TTblFbFrcstBoostFbVerRecord value) {
		setValue(P_TBL_FB_FRCST_BOOST_FB_VER, value);
	}

	/**
	 * Get the <code>P_STUS_MSG_TXT</code> parameter OUT value from the routine
	 */
	public String getPStusMsgTxt() {
		return getValue(P_STUS_MSG_TXT);
	}

	/**
	 * Get the <code>P_TBL_STUS_ERR_MSG_TXT</code> parameter OUT value from the routine
	 */
	public TTblVarchar2_250Record getPTblStusErrMsgTxt() {
		return getValue(P_TBL_STUS_ERR_MSG_TXT);
	}
}
