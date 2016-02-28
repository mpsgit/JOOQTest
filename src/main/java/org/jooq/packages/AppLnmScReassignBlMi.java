/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.app_lnm_sc_reassign_bl_mi.CheckMiLineNrUsage;
import org.jooq.packages.app_lnm_sc_reassign_bl_mi.GetAssignableLineNrs;
import org.jooq.packages.app_lnm_sc_reassign_bl_mi.GetReassignMi;
import org.jooq.packages.app_lnm_sc_reassign_bl_mi.ModifyMiLineNr;


/**
 * Convenience access to all stored procedures and functions in APP_LNM_SC_REASSIGN_BL_MI
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppLnmScReassignBlMi extends PackageImpl {

	private static final long serialVersionUID = -2019488419;

	/**
	 * The reference instance of <code>WETRN.APP_LNM_SC_REASSIGN_BL_MI</code>
	 */
	public static final AppLnmScReassignBlMi APP_LNM_SC_REASSIGN_BL_MI = new AppLnmScReassignBlMi();

	/**
	 * Call <code>WETRN.APP_LNM_SC_REASSIGN_BL_MI.CHECK_MI_LINE_NR_USAGE</code>
	 */
	public static Object checkMiLineNrUsage(Configuration configuration, Number pOffrSkuLineId, String pLineNr, Number pOffrPerdId) {
		CheckMiLineNrUsage f = new CheckMiLineNrUsage();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPLineNr(pLineNr);
		f.setPOffrPerdId(pOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BL_MI.CHECK_MI_LINE_NR_USAGE</code> as a field.
	 */
	public static Field<Object> checkMiLineNrUsage(Number pOffrSkuLineId, String pLineNr, Number pOffrPerdId) {
		CheckMiLineNrUsage f = new CheckMiLineNrUsage();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPLineNr(pLineNr);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BL_MI.CHECK_MI_LINE_NR_USAGE</code> as a field.
	 */
	public static Field<Object> checkMiLineNrUsage(Field<? extends Number> pOffrSkuLineId, Field<String> pLineNr, Field<? extends Number> pOffrPerdId) {
		CheckMiLineNrUsage f = new CheckMiLineNrUsage();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPLineNr(pLineNr);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SC_REASSIGN_BL_MI.GET_ASSIGNABLE_LINE_NRS</code>
	 */
	public static Object getAssignableLineNrs(Configuration configuration, Number pOffrSkuLineId, Number pLineNrTypId, Number pLeadBusDivId, Number pBusId, Number pCatgryId) {
		GetAssignableLineNrs f = new GetAssignableLineNrs();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLeadBusDivId(pLeadBusDivId);
		f.setPBusId(pBusId);
		f.setPCatgryId(pCatgryId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BL_MI.GET_ASSIGNABLE_LINE_NRS</code> as a field.
	 */
	public static Field<Object> getAssignableLineNrs(Number pOffrSkuLineId, Number pLineNrTypId, Number pLeadBusDivId, Number pBusId, Number pCatgryId) {
		GetAssignableLineNrs f = new GetAssignableLineNrs();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLeadBusDivId(pLeadBusDivId);
		f.setPBusId(pBusId);
		f.setPCatgryId(pCatgryId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BL_MI.GET_ASSIGNABLE_LINE_NRS</code> as a field.
	 */
	public static Field<Object> getAssignableLineNrs(Field<? extends Number> pOffrSkuLineId, Field<? extends Number> pLineNrTypId, Field<? extends Number> pLeadBusDivId, Field<? extends Number> pBusId, Field<? extends Number> pCatgryId) {
		GetAssignableLineNrs f = new GetAssignableLineNrs();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLeadBusDivId(pLeadBusDivId);
		f.setPBusId(pBusId);
		f.setPCatgryId(pCatgryId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SC_REASSIGN_BL_MI.GET_REASSIGN_MI</code>
	 */
	public static Object getReassignMi(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pSkuId) {
		GetReassignMi f = new GetReassignMi();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSkuId(pSkuId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BL_MI.GET_REASSIGN_MI</code> as a field.
	 */
	public static Field<Object> getReassignMi(Number pMrktId, Number pOffrPerdId, Number pSkuId) {
		GetReassignMi f = new GetReassignMi();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BL_MI.GET_REASSIGN_MI</code> as a field.
	 */
	public static Field<Object> getReassignMi(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<? extends Number> pSkuId) {
		GetReassignMi f = new GetReassignMi();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SC_REASSIGN_BL_MI.MODIFY_MI_LINE_NR</code>
	 */
	public static void modifyMiLineNr(Configuration configuration, Number pOffrSkuLineId, Number pLineNrTypId, Number pLineNrGrpId, String pLineNr, String pUserId) {
		ModifyMiLineNr p = new ModifyMiLineNr();
		p.setPOffrSkuLineId(pOffrSkuLineId);
		p.setPLineNrTypId(pLineNrTypId);
		p.setPLineNrGrpId(pLineNrGrpId);
		p.setPLineNr(pLineNr);
		p.setPUserId(pUserId);

		p.execute(configuration);
	}

	/**
	 * No further instances allowed
	 */
	private AppLnmScReassignBlMi() {
		super("APP_LNM_SC_REASSIGN_BL_MI", Wetrn.WETRN);
	}
}
