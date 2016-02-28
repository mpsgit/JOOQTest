/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.app_lnm_anz_reassign_bl_ms.GetAllMsReassign;
import org.jooq.packages.app_lnm_anz_reassign_bl_ms.GetAssignableLineNrs;
import org.jooq.packages.app_lnm_anz_reassign_bl_ms.GetAssignableMsFscs;
import org.jooq.packages.app_lnm_anz_reassign_bl_ms.GetReassignMsFsc;
import org.jooq.packages.app_lnm_anz_reassign_bl_ms.GetReassignMsLineNr;
import org.jooq.packages.app_lnm_anz_reassign_bl_ms.GetReassignMsName;
import org.jooq.packages.app_lnm_anz_reassign_bl_ms.UpdateMsFsc;
import org.jooq.packages.app_lnm_anz_reassign_bl_ms.UpdateMsLineNr;
import org.jooq.packages.app_lnm_anz_reassign_bl_ms.ValidateMsFscExists;
import org.jooq.packages.app_lnm_anz_reassign_bl_ms.ValidateMsFscUsage;
import org.jooq.packages.app_lnm_anz_reassign_bl_ms.ValidateMsLineNrExists;
import org.jooq.packages.app_lnm_anz_reassign_bl_ms.ValidateMsLineNrUsage;


/**
 * Convenience access to all stored procedures and functions in APP_LNM_ANZ_REASSIGN_BL_MS
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppLnmAnzReassignBlMs extends PackageImpl {

	private static final long serialVersionUID = -1399689784;

	/**
	 * The reference instance of <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS</code>
	 */
	public static final AppLnmAnzReassignBlMs APP_LNM_ANZ_REASSIGN_BL_MS = new AppLnmAnzReassignBlMs();

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_ALL_MS_REASSIGN</code>
	 */
	public static Object getAllMsReassign(Configuration configuration, Number pLeadMrktId, Number pFromOffrPerdId, Number pToOffrPerdId) {
		GetAllMsReassign f = new GetAllMsReassign();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_ALL_MS_REASSIGN</code> as a field.
	 */
	public static Field<Object> getAllMsReassign(Number pLeadMrktId, Number pFromOffrPerdId, Number pToOffrPerdId) {
		GetAllMsReassign f = new GetAllMsReassign();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_ALL_MS_REASSIGN</code> as a field.
	 */
	public static Field<Object> getAllMsReassign(Field<? extends Number> pLeadMrktId, Field<? extends Number> pFromOffrPerdId, Field<? extends Number> pToOffrPerdId) {
		GetAllMsReassign f = new GetAllMsReassign();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_ASSIGNABLE_LINE_NRS</code>
	 */
	public static Object getAssignableLineNrs(Configuration configuration, Number pClusterId, Number pLeadMrktId, Number pOffrSkuSetId, Number pLineNrTypeId, String pSelectedNumber) {
		GetAssignableLineNrs f = new GetAssignableLineNrs();
		f.setPClusterId(pClusterId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLineNrTypeId(pLineNrTypeId);
		f.setPSelectedNumber(pSelectedNumber);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_ASSIGNABLE_LINE_NRS</code> as a field.
	 */
	public static Field<Object> getAssignableLineNrs(Number pClusterId, Number pLeadMrktId, Number pOffrSkuSetId, Number pLineNrTypeId, String pSelectedNumber) {
		GetAssignableLineNrs f = new GetAssignableLineNrs();
		f.setPClusterId(pClusterId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLineNrTypeId(pLineNrTypeId);
		f.setPSelectedNumber(pSelectedNumber);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_ASSIGNABLE_LINE_NRS</code> as a field.
	 */
	public static Field<Object> getAssignableLineNrs(Field<? extends Number> pClusterId, Field<? extends Number> pLeadMrktId, Field<? extends Number> pOffrSkuSetId, Field<? extends Number> pLineNrTypeId, Field<String> pSelectedNumber) {
		GetAssignableLineNrs f = new GetAssignableLineNrs();
		f.setPClusterId(pClusterId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLineNrTypeId(pLineNrTypeId);
		f.setPSelectedNumber(pSelectedNumber);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_ASSIGNABLE_MS_FSCS</code>
	 */
	public static Object getAssignableMsFscs(Configuration configuration, Number pLeadMrktId, Number pOffrSkuSetId, String pSelectedFsc) {
		GetAssignableMsFscs f = new GetAssignableMsFscs();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPSelectedFsc(pSelectedFsc);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_ASSIGNABLE_MS_FSCS</code> as a field.
	 */
	public static Field<Object> getAssignableMsFscs(Number pLeadMrktId, Number pOffrSkuSetId, String pSelectedFsc) {
		GetAssignableMsFscs f = new GetAssignableMsFscs();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPSelectedFsc(pSelectedFsc);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_ASSIGNABLE_MS_FSCS</code> as a field.
	 */
	public static Field<Object> getAssignableMsFscs(Field<? extends Number> pLeadMrktId, Field<? extends Number> pOffrSkuSetId, Field<String> pSelectedFsc) {
		GetAssignableMsFscs f = new GetAssignableMsFscs();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPSelectedFsc(pSelectedFsc);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_REASSIGN_MS_FSC</code>
	 */
	public static Object getReassignMsFsc(Configuration configuration, Number pLeadMrktId, Number pFromOffrPerdId, Number pToOffrPerdId, String pSetFsc) {
		GetReassignMsFsc f = new GetReassignMsFsc();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPSetFsc(pSetFsc);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_REASSIGN_MS_FSC</code> as a field.
	 */
	public static Field<Object> getReassignMsFsc(Number pLeadMrktId, Number pFromOffrPerdId, Number pToOffrPerdId, String pSetFsc) {
		GetReassignMsFsc f = new GetReassignMsFsc();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPSetFsc(pSetFsc);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_REASSIGN_MS_FSC</code> as a field.
	 */
	public static Field<Object> getReassignMsFsc(Field<? extends Number> pLeadMrktId, Field<? extends Number> pFromOffrPerdId, Field<? extends Number> pToOffrPerdId, Field<String> pSetFsc) {
		GetReassignMsFsc f = new GetReassignMsFsc();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPSetFsc(pSetFsc);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_REASSIGN_MS_LINE_NR</code>
	 */
	public static Object getReassignMsLineNr(Configuration configuration, Number pLeadMrktId, Number pFromOffrPerdId, Number pToOffrPerdId, String pSetLineNr) {
		GetReassignMsLineNr f = new GetReassignMsLineNr();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPSetLineNr(pSetLineNr);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_REASSIGN_MS_LINE_NR</code> as a field.
	 */
	public static Field<Object> getReassignMsLineNr(Number pLeadMrktId, Number pFromOffrPerdId, Number pToOffrPerdId, String pSetLineNr) {
		GetReassignMsLineNr f = new GetReassignMsLineNr();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPSetLineNr(pSetLineNr);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_REASSIGN_MS_LINE_NR</code> as a field.
	 */
	public static Field<Object> getReassignMsLineNr(Field<? extends Number> pLeadMrktId, Field<? extends Number> pFromOffrPerdId, Field<? extends Number> pToOffrPerdId, Field<String> pSetLineNr) {
		GetReassignMsLineNr f = new GetReassignMsLineNr();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPSetLineNr(pSetLineNr);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_REASSIGN_MS_NAME</code>
	 */
	public static Object getReassignMsName(Configuration configuration, Number pLeadMrktId, Number pFromOffrPerdId, Number pToOffrPerdId, String pSetName) {
		GetReassignMsName f = new GetReassignMsName();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPSetName(pSetName);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_REASSIGN_MS_NAME</code> as a field.
	 */
	public static Field<Object> getReassignMsName(Number pLeadMrktId, Number pFromOffrPerdId, Number pToOffrPerdId, String pSetName) {
		GetReassignMsName f = new GetReassignMsName();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPSetName(pSetName);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.GET_REASSIGN_MS_NAME</code> as a field.
	 */
	public static Field<Object> getReassignMsName(Field<? extends Number> pLeadMrktId, Field<? extends Number> pFromOffrPerdId, Field<? extends Number> pToOffrPerdId, Field<String> pSetName) {
		GetReassignMsName f = new GetReassignMsName();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPSetName(pSetName);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.UPDATE_MS_FSC</code>
	 */
	public static void updateMsFsc(Configuration configuration, Number pLeadMrktId, Number pOffrSkuSetId, String pFsc, String pUserId) {
		UpdateMsFsc p = new UpdateMsFsc();
		p.setPLeadMrktId(pLeadMrktId);
		p.setPOffrSkuSetId(pOffrSkuSetId);
		p.setPFsc(pFsc);
		p.setPUserId(pUserId);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.UPDATE_MS_LINE_NR</code>
	 */
	public static void updateMsLineNr(Configuration configuration, Number pLeadMrktId, Number pOffrSkuSetId, String pLineNr, String pUserId) {
		UpdateMsLineNr p = new UpdateMsLineNr();
		p.setPLeadMrktId(pLeadMrktId);
		p.setPOffrSkuSetId(pOffrSkuSetId);
		p.setPLineNr(pLineNr);
		p.setPUserId(pUserId);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.VALIDATE_MS_FSC_EXISTS</code>
	 */
	public static String validateMsFscExists(Configuration configuration, Number pLeadMrktId, String pFsc) {
		ValidateMsFscExists f = new ValidateMsFscExists();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.VALIDATE_MS_FSC_EXISTS</code> as a field.
	 */
	public static Field<String> validateMsFscExists(Number pLeadMrktId, String pFsc) {
		ValidateMsFscExists f = new ValidateMsFscExists();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.VALIDATE_MS_FSC_EXISTS</code> as a field.
	 */
	public static Field<String> validateMsFscExists(Field<? extends Number> pLeadMrktId, Field<String> pFsc) {
		ValidateMsFscExists f = new ValidateMsFscExists();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.VALIDATE_MS_FSC_USAGE</code>
	 */
	public static Object validateMsFscUsage(Configuration configuration, Number pLeadMrktId, Number pOffrSkuSetId, String pFsc) {
		ValidateMsFscUsage f = new ValidateMsFscUsage();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPFsc(pFsc);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.VALIDATE_MS_FSC_USAGE</code> as a field.
	 */
	public static Field<Object> validateMsFscUsage(Number pLeadMrktId, Number pOffrSkuSetId, String pFsc) {
		ValidateMsFscUsage f = new ValidateMsFscUsage();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPFsc(pFsc);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.VALIDATE_MS_FSC_USAGE</code> as a field.
	 */
	public static Field<Object> validateMsFscUsage(Field<? extends Number> pLeadMrktId, Field<? extends Number> pOffrSkuSetId, Field<String> pFsc) {
		ValidateMsFscUsage f = new ValidateMsFscUsage();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPFsc(pFsc);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.VALIDATE_MS_LINE_NR_EXISTS</code>
	 */
	public static String validateMsLineNrExists(Configuration configuration, Number pLeadMrktId, String pLineNr, Number pLineNrTypId) {
		ValidateMsLineNrExists f = new ValidateMsLineNrExists();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPLineNrTypId(pLineNrTypId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.VALIDATE_MS_LINE_NR_EXISTS</code> as a field.
	 */
	public static Field<String> validateMsLineNrExists(Number pLeadMrktId, String pLineNr, Number pLineNrTypId) {
		ValidateMsLineNrExists f = new ValidateMsLineNrExists();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPLineNrTypId(pLineNrTypId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.VALIDATE_MS_LINE_NR_EXISTS</code> as a field.
	 */
	public static Field<String> validateMsLineNrExists(Field<? extends Number> pLeadMrktId, Field<String> pLineNr, Field<? extends Number> pLineNrTypId) {
		ValidateMsLineNrExists f = new ValidateMsLineNrExists();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPLineNrTypId(pLineNrTypId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.VALIDATE_MS_LINE_NR_USAGE</code>
	 */
	public static Object validateMsLineNrUsage(Configuration configuration, Number pLeadMrktId, Number pOffrSkuSetId, String pLineNr) {
		ValidateMsLineNrUsage f = new ValidateMsLineNrUsage();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLineNr(pLineNr);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.VALIDATE_MS_LINE_NR_USAGE</code> as a field.
	 */
	public static Field<Object> validateMsLineNrUsage(Number pLeadMrktId, Number pOffrSkuSetId, String pLineNr) {
		ValidateMsLineNrUsage f = new ValidateMsLineNrUsage();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLineNr(pLineNr);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REASSIGN_BL_MS.VALIDATE_MS_LINE_NR_USAGE</code> as a field.
	 */
	public static Field<Object> validateMsLineNrUsage(Field<? extends Number> pLeadMrktId, Field<? extends Number> pOffrSkuSetId, Field<String> pLineNr) {
		ValidateMsLineNrUsage f = new ValidateMsLineNrUsage();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLineNr(pLineNr);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private AppLnmAnzReassignBlMs() {
		super("APP_LNM_ANZ_REASSIGN_BL_MS", Wetrn.WETRN);
	}
}