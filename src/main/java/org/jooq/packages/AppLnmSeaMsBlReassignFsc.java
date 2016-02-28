/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.CheckEquMsFscUsageOcmp;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.CheckEquMsFscUsageScmp;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.CheckLineNrExists;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.CheckMsFscExists;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.CheckMsLineNrUsage;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.CheckOthMsFscUsageOcmp;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.CheckOthMsFscUsageScmp;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.GetAssignableLineNrs;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.GetAssignableMsFscs;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.GetReassignMsAll;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.GetReassignMsByFsc;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.GetReassignMsByLineNr;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.GetReassignMsByName;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.ModifyMsFsc;
import org.jooq.packages.app_lnm_sea_ms_bl_reassign_fsc.ModifyMsLineNr;


/**
 * Convenience access to all stored procedures and functions in APP_LNM_SEA_MS_BL_REASSIGN_FSC
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppLnmSeaMsBlReassignFsc extends PackageImpl {

	private static final long serialVersionUID = -1913158807;

	/**
	 * The reference instance of <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC</code>
	 */
	public static final AppLnmSeaMsBlReassignFsc APP_LNM_SEA_MS_BL_REASSIGN_FSC = new AppLnmSeaMsBlReassignFsc();

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_EQU_MS_FSC_USAGE_OCMP</code>
	 */
	public static Object checkEquMsFscUsageOcmp(Configuration configuration, Number pOffrSkuSetId, Number pLeadMrktId, String pFsc, Number pOffrPerdId) {
		CheckEquMsFscUsageOcmp f = new CheckEquMsFscUsageOcmp();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);
		f.setPOffrPerdId(pOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_EQU_MS_FSC_USAGE_OCMP</code> as a field.
	 */
	public static Field<Object> checkEquMsFscUsageOcmp(Number pOffrSkuSetId, Number pLeadMrktId, String pFsc, Number pOffrPerdId) {
		CheckEquMsFscUsageOcmp f = new CheckEquMsFscUsageOcmp();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_EQU_MS_FSC_USAGE_OCMP</code> as a field.
	 */
	public static Field<Object> checkEquMsFscUsageOcmp(Field<? extends Number> pOffrSkuSetId, Field<? extends Number> pLeadMrktId, Field<String> pFsc, Field<? extends Number> pOffrPerdId) {
		CheckEquMsFscUsageOcmp f = new CheckEquMsFscUsageOcmp();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_EQU_MS_FSC_USAGE_SCMP</code>
	 */
	public static Object checkEquMsFscUsageScmp(Configuration configuration, Number pOffrSkuSetId, Number pLeadMrktId, String pFsc, Number pOffrPerdId) {
		CheckEquMsFscUsageScmp f = new CheckEquMsFscUsageScmp();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);
		f.setPOffrPerdId(pOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_EQU_MS_FSC_USAGE_SCMP</code> as a field.
	 */
	public static Field<Object> checkEquMsFscUsageScmp(Number pOffrSkuSetId, Number pLeadMrktId, String pFsc, Number pOffrPerdId) {
		CheckEquMsFscUsageScmp f = new CheckEquMsFscUsageScmp();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_EQU_MS_FSC_USAGE_SCMP</code> as a field.
	 */
	public static Field<Object> checkEquMsFscUsageScmp(Field<? extends Number> pOffrSkuSetId, Field<? extends Number> pLeadMrktId, Field<String> pFsc, Field<? extends Number> pOffrPerdId) {
		CheckEquMsFscUsageScmp f = new CheckEquMsFscUsageScmp();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_LINE_NR_EXISTS</code>
	 */
	public static String checkLineNrExists(Configuration configuration, Number pLeadMrktId, String pLineNr, Number pLineNrTypId, Number pLineNrGrpId) {
		CheckLineNrExists f = new CheckLineNrExists();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_LINE_NR_EXISTS</code> as a field.
	 */
	public static Field<String> checkLineNrExists(Number pLeadMrktId, String pLineNr, Number pLineNrTypId, Number pLineNrGrpId) {
		CheckLineNrExists f = new CheckLineNrExists();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_LINE_NR_EXISTS</code> as a field.
	 */
	public static Field<String> checkLineNrExists(Field<? extends Number> pLeadMrktId, Field<String> pLineNr, Field<? extends Number> pLineNrTypId, Field<? extends Number> pLineNrGrpId) {
		CheckLineNrExists f = new CheckLineNrExists();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_MS_FSC_EXISTS</code>
	 */
	public static String checkMsFscExists(Configuration configuration, Number pLeadMrktId, String pFsc) {
		CheckMsFscExists f = new CheckMsFscExists();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_MS_FSC_EXISTS</code> as a field.
	 */
	public static Field<String> checkMsFscExists(Number pLeadMrktId, String pFsc) {
		CheckMsFscExists f = new CheckMsFscExists();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_MS_FSC_EXISTS</code> as a field.
	 */
	public static Field<String> checkMsFscExists(Field<? extends Number> pLeadMrktId, Field<String> pFsc) {
		CheckMsFscExists f = new CheckMsFscExists();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_MS_LINE_NR_USAGE</code>
	 */
	public static Object checkMsLineNrUsage(Configuration configuration, Number pOffrSkuSetId, Number pLeadMrktId, String pLineNr, Number pOffrPerdId) {
		CheckMsLineNrUsage f = new CheckMsLineNrUsage();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPOffrPerdId(pOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_MS_LINE_NR_USAGE</code> as a field.
	 */
	public static Field<Object> checkMsLineNrUsage(Number pOffrSkuSetId, Number pLeadMrktId, String pLineNr, Number pOffrPerdId) {
		CheckMsLineNrUsage f = new CheckMsLineNrUsage();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_MS_LINE_NR_USAGE</code> as a field.
	 */
	public static Field<Object> checkMsLineNrUsage(Field<? extends Number> pOffrSkuSetId, Field<? extends Number> pLeadMrktId, Field<String> pLineNr, Field<? extends Number> pOffrPerdId) {
		CheckMsLineNrUsage f = new CheckMsLineNrUsage();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_OTH_MS_FSC_USAGE_OCMP</code>
	 */
	public static Object checkOthMsFscUsageOcmp(Configuration configuration, Number pOffrSkuSetId, Number pLeadMrktId, String pFsc, Number pOffrPerdId) {
		CheckOthMsFscUsageOcmp f = new CheckOthMsFscUsageOcmp();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);
		f.setPOffrPerdId(pOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_OTH_MS_FSC_USAGE_OCMP</code> as a field.
	 */
	public static Field<Object> checkOthMsFscUsageOcmp(Number pOffrSkuSetId, Number pLeadMrktId, String pFsc, Number pOffrPerdId) {
		CheckOthMsFscUsageOcmp f = new CheckOthMsFscUsageOcmp();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_OTH_MS_FSC_USAGE_OCMP</code> as a field.
	 */
	public static Field<Object> checkOthMsFscUsageOcmp(Field<? extends Number> pOffrSkuSetId, Field<? extends Number> pLeadMrktId, Field<String> pFsc, Field<? extends Number> pOffrPerdId) {
		CheckOthMsFscUsageOcmp f = new CheckOthMsFscUsageOcmp();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_OTH_MS_FSC_USAGE_SCMP</code>
	 */
	public static Object checkOthMsFscUsageScmp(Configuration configuration, Number pOffrSkuSetId, Number pLeadMrktId, String pFsc, Number pOffrPerdId) {
		CheckOthMsFscUsageScmp f = new CheckOthMsFscUsageScmp();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);
		f.setPOffrPerdId(pOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_OTH_MS_FSC_USAGE_SCMP</code> as a field.
	 */
	public static Field<Object> checkOthMsFscUsageScmp(Number pOffrSkuSetId, Number pLeadMrktId, String pFsc, Number pOffrPerdId) {
		CheckOthMsFscUsageScmp f = new CheckOthMsFscUsageScmp();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.CHECK_OTH_MS_FSC_USAGE_SCMP</code> as a field.
	 */
	public static Field<Object> checkOthMsFscUsageScmp(Field<? extends Number> pOffrSkuSetId, Field<? extends Number> pLeadMrktId, Field<String> pFsc, Field<? extends Number> pOffrPerdId) {
		CheckOthMsFscUsageScmp f = new CheckOthMsFscUsageScmp();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPFsc(pFsc);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_ASSIGNABLE_LINE_NRS</code>
	 */
	public static Object getAssignableLineNrs(Configuration configuration, Number pOffrSkuSetId, Number pLineNrTypId, Number pLineNrGrpId, String pSelectedNumbers) {
		GetAssignableLineNrs f = new GetAssignableLineNrs();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);
		f.setPSelectedNumbers(pSelectedNumbers);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_ASSIGNABLE_LINE_NRS</code> as a field.
	 */
	public static Field<Object> getAssignableLineNrs(Number pOffrSkuSetId, Number pLineNrTypId, Number pLineNrGrpId, String pSelectedNumbers) {
		GetAssignableLineNrs f = new GetAssignableLineNrs();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);
		f.setPSelectedNumbers(pSelectedNumbers);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_ASSIGNABLE_LINE_NRS</code> as a field.
	 */
	public static Field<Object> getAssignableLineNrs(Field<? extends Number> pOffrSkuSetId, Field<? extends Number> pLineNrTypId, Field<? extends Number> pLineNrGrpId, Field<String> pSelectedNumbers) {
		GetAssignableLineNrs f = new GetAssignableLineNrs();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);
		f.setPSelectedNumbers(pSelectedNumbers);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_ASSIGNABLE_MS_FSCS</code>
	 */
	public static Object getAssignableMsFscs(Configuration configuration, Number pOffrSkuSetId, String pSelectedFscs) {
		GetAssignableMsFscs f = new GetAssignableMsFscs();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPSelectedFscs(pSelectedFscs);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_ASSIGNABLE_MS_FSCS</code> as a field.
	 */
	public static Field<Object> getAssignableMsFscs(Number pOffrSkuSetId, String pSelectedFscs) {
		GetAssignableMsFscs f = new GetAssignableMsFscs();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPSelectedFscs(pSelectedFscs);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_ASSIGNABLE_MS_FSCS</code> as a field.
	 */
	public static Field<Object> getAssignableMsFscs(Field<? extends Number> pOffrSkuSetId, Field<String> pSelectedFscs) {
		GetAssignableMsFscs f = new GetAssignableMsFscs();
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPSelectedFscs(pSelectedFscs);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_REASSIGN_MS_ALL</code>
	 */
	public static Object getReassignMsAll(Configuration configuration, Number pLeadMrktId, Number pStrtOffrPerdId, Number pEndOffrPerdId) {
		GetReassignMsAll f = new GetReassignMsAll();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_REASSIGN_MS_ALL</code> as a field.
	 */
	public static Field<Object> getReassignMsAll(Number pLeadMrktId, Number pStrtOffrPerdId, Number pEndOffrPerdId) {
		GetReassignMsAll f = new GetReassignMsAll();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_REASSIGN_MS_ALL</code> as a field.
	 */
	public static Field<Object> getReassignMsAll(Field<? extends Number> pLeadMrktId, Field<? extends Number> pStrtOffrPerdId, Field<? extends Number> pEndOffrPerdId) {
		GetReassignMsAll f = new GetReassignMsAll();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_REASSIGN_MS_BY_FSC</code>
	 */
	public static Object getReassignMsByFsc(Configuration configuration, Number pLeadMrktId, Number pStrtOffrPerdId, Number pEndOffrPerdId, String pSetFsc) {
		GetReassignMsByFsc f = new GetReassignMsByFsc();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);
		f.setPSetFsc(pSetFsc);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_REASSIGN_MS_BY_FSC</code> as a field.
	 */
	public static Field<Object> getReassignMsByFsc(Number pLeadMrktId, Number pStrtOffrPerdId, Number pEndOffrPerdId, String pSetFsc) {
		GetReassignMsByFsc f = new GetReassignMsByFsc();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);
		f.setPSetFsc(pSetFsc);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_REASSIGN_MS_BY_FSC</code> as a field.
	 */
	public static Field<Object> getReassignMsByFsc(Field<? extends Number> pLeadMrktId, Field<? extends Number> pStrtOffrPerdId, Field<? extends Number> pEndOffrPerdId, Field<String> pSetFsc) {
		GetReassignMsByFsc f = new GetReassignMsByFsc();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);
		f.setPSetFsc(pSetFsc);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_REASSIGN_MS_BY_LINE_NR</code>
	 */
	public static Object getReassignMsByLineNr(Configuration configuration, Number pLeadMrktId, Number pStrtOffrPerdId, Number pEndOffrPerdId, String pSetLineNr) {
		GetReassignMsByLineNr f = new GetReassignMsByLineNr();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);
		f.setPSetLineNr(pSetLineNr);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_REASSIGN_MS_BY_LINE_NR</code> as a field.
	 */
	public static Field<Object> getReassignMsByLineNr(Number pLeadMrktId, Number pStrtOffrPerdId, Number pEndOffrPerdId, String pSetLineNr) {
		GetReassignMsByLineNr f = new GetReassignMsByLineNr();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);
		f.setPSetLineNr(pSetLineNr);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_REASSIGN_MS_BY_LINE_NR</code> as a field.
	 */
	public static Field<Object> getReassignMsByLineNr(Field<? extends Number> pLeadMrktId, Field<? extends Number> pStrtOffrPerdId, Field<? extends Number> pEndOffrPerdId, Field<String> pSetLineNr) {
		GetReassignMsByLineNr f = new GetReassignMsByLineNr();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);
		f.setPSetLineNr(pSetLineNr);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_REASSIGN_MS_BY_NAME</code>
	 */
	public static Object getReassignMsByName(Configuration configuration, Number pLeadMrktId, Number pStrtOffrPerdId, Number pEndOffrPerdId, String pSetName) {
		GetReassignMsByName f = new GetReassignMsByName();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);
		f.setPSetName(pSetName);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_REASSIGN_MS_BY_NAME</code> as a field.
	 */
	public static Field<Object> getReassignMsByName(Number pLeadMrktId, Number pStrtOffrPerdId, Number pEndOffrPerdId, String pSetName) {
		GetReassignMsByName f = new GetReassignMsByName();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);
		f.setPSetName(pSetName);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.GET_REASSIGN_MS_BY_NAME</code> as a field.
	 */
	public static Field<Object> getReassignMsByName(Field<? extends Number> pLeadMrktId, Field<? extends Number> pStrtOffrPerdId, Field<? extends Number> pEndOffrPerdId, Field<String> pSetName) {
		GetReassignMsByName f = new GetReassignMsByName();
		f.setPLeadMrktId(pLeadMrktId);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);
		f.setPSetName(pSetName);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.MODIFY_MS_FSC</code>
	 */
	public static void modifyMsFsc(Configuration configuration, Number pOffrSkuSetId, Number pLeadMrktId, String pFsc, String pUserId) {
		ModifyMsFsc p = new ModifyMsFsc();
		p.setPOffrSkuSetId(pOffrSkuSetId);
		p.setPLeadMrktId(pLeadMrktId);
		p.setPFsc(pFsc);
		p.setPUserId(pUserId);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.APP_LNM_SEA_MS_BL_REASSIGN_FSC.MODIFY_MS_LINE_NR</code>
	 */
	public static void modifyMsLineNr(Configuration configuration, Number pOffrSkuSetId, Number pLeadMrktId, String pLineNr, String pUserId) {
		ModifyMsLineNr p = new ModifyMsLineNr();
		p.setPOffrSkuSetId(pOffrSkuSetId);
		p.setPLeadMrktId(pLeadMrktId);
		p.setPLineNr(pLineNr);
		p.setPUserId(pUserId);

		p.execute(configuration);
	}

	/**
	 * No further instances allowed
	 */
	private AppLnmSeaMsBlReassignFsc() {
		super("APP_LNM_SEA_MS_BL_REASSIGN_FSC", Wetrn.WETRN);
	}
}
