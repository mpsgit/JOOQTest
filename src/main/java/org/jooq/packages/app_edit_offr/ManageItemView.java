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
import org.jooq.udt.records.TTblEdtOfrMngItmInptRecord;
import org.jooq.udt.records.TTblEoMngitmHeaderDtlsRecord;
import org.jooq.udt.records.TTblEoMngitmVwRecord;


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
public class ManageItemView extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -1771162013;

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.MANAGE_ITEM_VIEW.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.MANAGE_ITEM_VIEW.P_TBL_EDT_OFR_MNG_ITM_INPT</code>.
	 */
	public static final Parameter<TTblEdtOfrMngItmInptRecord> P_TBL_EDT_OFR_MNG_ITM_INPT = createParameter("P_TBL_EDT_OFR_MNG_ITM_INPT", org.jooq.udt.TEdtOfrMngItmInpt.T_EDT_OFR_MNG_ITM_INPT.getDataType().asArrayDataType(org.jooq.udt.records.TTblEdtOfrMngItmInptRecord.class), false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.MANAGE_ITEM_VIEW.P_TBL_EO_MNGITM_HEADER_DTLS</code>.
	 */
	public static final Parameter<TTblEoMngitmHeaderDtlsRecord> P_TBL_EO_MNGITM_HEADER_DTLS = createParameter("P_TBL_EO_MNGITM_HEADER_DTLS", org.jooq.udt.TEoMngitmHeaderDtls.T_EO_MNGITM_HEADER_DTLS.getDataType().asArrayDataType(org.jooq.udt.records.TTblEoMngitmHeaderDtlsRecord.class), false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.MANAGE_ITEM_VIEW.P_TBL_EO_MNGITM_VW</code>.
	 */
	public static final Parameter<TTblEoMngitmVwRecord> P_TBL_EO_MNGITM_VW = createParameter("P_TBL_EO_MNGITM_VW", org.jooq.udt.TEoMngitmVw.T_EO_MNGITM_VW.getDataType().asArrayDataType(org.jooq.udt.records.TTblEoMngitmVwRecord.class), false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.MANAGE_ITEM_VIEW.P_LATE_OFFR_IND</code>.
	 */
	public static final Parameter<String> P_LATE_OFFR_IND = createParameter("P_LATE_OFFR_IND", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public ManageItemView() {
		super("MANAGE_ITEM_VIEW", Wetrn.WETRN, AppEditOffr.APP_EDIT_OFFR, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_TBL_EDT_OFR_MNG_ITM_INPT);
		addOutParameter(P_TBL_EO_MNGITM_HEADER_DTLS);
		addOutParameter(P_TBL_EO_MNGITM_VW);
		addOutParameter(P_LATE_OFFR_IND);
	}

	/**
	 * Set the <code>P_TBL_EDT_OFR_MNG_ITM_INPT</code> parameter IN value to the routine
	 */
	public void setPTblEdtOfrMngItmInpt(TTblEdtOfrMngItmInptRecord value) {
		setValue(P_TBL_EDT_OFR_MNG_ITM_INPT, value);
	}

	/**
	 * Get the <code>P_TBL_EO_MNGITM_HEADER_DTLS</code> parameter OUT value from the routine
	 */
	public TTblEoMngitmHeaderDtlsRecord getPTblEoMngitmHeaderDtls() {
		return getValue(P_TBL_EO_MNGITM_HEADER_DTLS);
	}

	/**
	 * Get the <code>P_TBL_EO_MNGITM_VW</code> parameter OUT value from the routine
	 */
	public TTblEoMngitmVwRecord getPTblEoMngitmVw() {
		return getValue(P_TBL_EO_MNGITM_VW);
	}

	/**
	 * Get the <code>P_LATE_OFFR_IND</code> parameter OUT value from the routine
	 */
	public String getPLateOffrInd() {
		return getValue(P_LATE_OFFR_IND);
	}
}
