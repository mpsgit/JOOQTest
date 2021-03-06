/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.app_lnm_sc_reassign_bi_mi.CheckBilngLineNrExists;
import org.jooq.packages.app_lnm_sc_reassign_bi_mi.CheckMiBilngLineNrUsage;
import org.jooq.packages.app_lnm_sc_reassign_bi_mi.GetAssignableMiBiLineNrs;
import org.jooq.packages.app_lnm_sc_reassign_bi_mi.GetAssignedMiBl;
import org.jooq.packages.app_lnm_sc_reassign_bi_mi.GetBireassignItems;
import org.jooq.packages.app_lnm_sc_reassign_bi_mi.ModifyMiBiNr;


/**
 * Convenience access to all stored procedures and functions in APP_LNM_SC_REASSIGN_BI_MI
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppLnmScReassignBiMi extends PackageImpl {

	private static final long serialVersionUID = -1744686949;

	/**
	 * The reference instance of <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI</code>
	 */
	public static final AppLnmScReassignBiMi APP_LNM_SC_REASSIGN_BI_MI = new AppLnmScReassignBiMi();

	/**
	 * Call <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.CHECK_BILNG_LINE_NR_EXISTS</code>
	 */
	public static String checkBilngLineNrExists(Configuration configuration, Number pBilngSysId, String pLineNr, Number pLineNrGrpId) {
		CheckBilngLineNrExists f = new CheckBilngLineNrExists();
		f.setPBilngSysId(pBilngSysId);
		f.setPLineNr(pLineNr);
		f.setPLineNrGrpId(pLineNrGrpId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.CHECK_BILNG_LINE_NR_EXISTS</code> as a field.
	 */
	public static Field<String> checkBilngLineNrExists(Number pBilngSysId, String pLineNr, Number pLineNrGrpId) {
		CheckBilngLineNrExists f = new CheckBilngLineNrExists();
		f.setPBilngSysId(pBilngSysId);
		f.setPLineNr(pLineNr);
		f.setPLineNrGrpId(pLineNrGrpId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.CHECK_BILNG_LINE_NR_EXISTS</code> as a field.
	 */
	public static Field<String> checkBilngLineNrExists(Field<? extends Number> pBilngSysId, Field<String> pLineNr, Field<? extends Number> pLineNrGrpId) {
		CheckBilngLineNrExists f = new CheckBilngLineNrExists();
		f.setPBilngSysId(pBilngSysId);
		f.setPLineNr(pLineNr);
		f.setPLineNrGrpId(pLineNrGrpId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.CHECK_MI_BILNG_LINE_NR_USAGE</code>
	 */
	public static Object checkMiBilngLineNrUsage(Configuration configuration, Number pOffrSkuLineId, String pLineNr, Number pOffrPerdId) {
		CheckMiBilngLineNrUsage f = new CheckMiBilngLineNrUsage();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPLineNr(pLineNr);
		f.setPOffrPerdId(pOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.CHECK_MI_BILNG_LINE_NR_USAGE</code> as a field.
	 */
	public static Field<Object> checkMiBilngLineNrUsage(Number pOffrSkuLineId, String pLineNr, Number pOffrPerdId) {
		CheckMiBilngLineNrUsage f = new CheckMiBilngLineNrUsage();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPLineNr(pLineNr);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.CHECK_MI_BILNG_LINE_NR_USAGE</code> as a field.
	 */
	public static Field<Object> checkMiBilngLineNrUsage(Field<? extends Number> pOffrSkuLineId, Field<String> pLineNr, Field<? extends Number> pOffrPerdId) {
		CheckMiBilngLineNrUsage f = new CheckMiBilngLineNrUsage();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPLineNr(pLineNr);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.GET_ASSIGNABLE_MI_BI_LINE_NRS</code>
	 */
	public static Object getAssignableMiBiLineNrs(Configuration configuration, Number pOffrSkuLineId, Number pLineNrGrpId) {
		GetAssignableMiBiLineNrs f = new GetAssignableMiBiLineNrs();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPLineNrGrpId(pLineNrGrpId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.GET_ASSIGNABLE_MI_BI_LINE_NRS</code> as a field.
	 */
	public static Field<Object> getAssignableMiBiLineNrs(Number pOffrSkuLineId, Number pLineNrGrpId) {
		GetAssignableMiBiLineNrs f = new GetAssignableMiBiLineNrs();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPLineNrGrpId(pLineNrGrpId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.GET_ASSIGNABLE_MI_BI_LINE_NRS</code> as a field.
	 */
	public static Field<Object> getAssignableMiBiLineNrs(Field<? extends Number> pOffrSkuLineId, Field<? extends Number> pLineNrGrpId) {
		GetAssignableMiBiLineNrs f = new GetAssignableMiBiLineNrs();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPLineNrGrpId(pLineNrGrpId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.GET_ASSIGNED_MI_BL</code>
	 */
	public static Object getAssignedMiBl(Configuration configuration, Number pOffrSkuLineId) {
		GetAssignedMiBl f = new GetAssignedMiBl();
		f.setPOffrSkuLineId(pOffrSkuLineId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.GET_ASSIGNED_MI_BL</code> as a field.
	 */
	public static Field<Object> getAssignedMiBl(Number pOffrSkuLineId) {
		GetAssignedMiBl f = new GetAssignedMiBl();
		f.setPOffrSkuLineId(pOffrSkuLineId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.GET_ASSIGNED_MI_BL</code> as a field.
	 */
	public static Field<Object> getAssignedMiBl(Field<? extends Number> pOffrSkuLineId) {
		GetAssignedMiBl f = new GetAssignedMiBl();
		f.setPOffrSkuLineId(pOffrSkuLineId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.GET_BIREASSIGN_ITEMS</code>
	 */
	public static Object getBireassignItems(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pSkuId) {
		GetBireassignItems f = new GetBireassignItems();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSkuId(pSkuId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.GET_BIREASSIGN_ITEMS</code> as a field.
	 */
	public static Field<Object> getBireassignItems(Number pMrktId, Number pOffrPerdId, Number pSkuId) {
		GetBireassignItems f = new GetBireassignItems();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.GET_BIREASSIGN_ITEMS</code> as a field.
	 */
	public static Field<Object> getBireassignItems(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<? extends Number> pSkuId) {
		GetBireassignItems f = new GetBireassignItems();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SC_REASSIGN_BI_MI.MODIFY_MI_BI_NR</code>
	 */
	public static void modifyMiBiNr(Configuration configuration, Number pOffrSkuLineId, String pLineNrTypCd, String pLineNr, String pUserId) {
		ModifyMiBiNr p = new ModifyMiBiNr();
		p.setPOffrSkuLineId(pOffrSkuLineId);
		p.setPLineNrTypCd(pLineNrTypCd);
		p.setPLineNr(pLineNr);
		p.setPUserId(pUserId);

		p.execute(configuration);
	}

	/**
	 * No further instances allowed
	 */
	private AppLnmScReassignBiMi() {
		super("APP_LNM_SC_REASSIGN_BI_MI", Wetrn.WETRN);
	}
}
