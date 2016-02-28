/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.app_lnm_nola.AlreadyAssigned;
import org.jooq.packages.app_lnm_nola.AssignBi;
import org.jooq.packages.app_lnm_nola.AssignBl;
import org.jooq.packages.app_lnm_nola.FscInUse;
import org.jooq.packages.app_lnm_nola.GetAssignableLineNrs;
import org.jooq.packages.app_lnm_nola.GetAvailableBln;
import org.jooq.packages.app_lnm_nola.GetSkuEndDate;
import org.jooq.packages.app_lnm_nola.InSubcluster;
import org.jooq.packages.app_lnm_nola.InVehList;
import org.jooq.packages.app_lnm_nola.LnmAvailable;
import org.jooq.packages.app_lnm_nola.LnmTypGrpLookup;
import org.jooq.packages.app_lnm_nola.LnmValidation;
import org.jooq.packages.app_lnm_nola.MinFreeUpPeriod;
import org.jooq.packages.app_lnm_nola.ReassignLineNr;
import org.jooq.packages.app_lnm_nola.ReassignScrnItemDetails;
import org.jooq.packages.app_lnm_nola.ReassignScrnItemHistory;
import org.jooq.packages.app_lnm_nola.ReassignScrnItemSearch;
import org.jooq.packages.app_lnm_nola.ReassignScrnSetDetails;
import org.jooq.packages.app_lnm_nola.ReassignScrnSetHistory;
import org.jooq.packages.app_lnm_nola.ReassignScrnSetSearch;


/**
 * Convenience access to all stored procedures and functions in APP_LNM_NOLA
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppLnmNola extends PackageImpl {

	private static final long serialVersionUID = -1190173028;

	/**
	 * The reference instance of <code>WETRN.APP_LNM_NOLA</code>
	 */
	public static final AppLnmNola APP_LNM_NOLA = new AppLnmNola();

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.ALREADY_ASSIGNED</code>
	 */
	public static String alreadyAssigned(Configuration configuration, String pLineNr) {
		AlreadyAssigned f = new AlreadyAssigned();
		f.setPLineNr(pLineNr);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.ALREADY_ASSIGNED</code> as a field.
	 */
	public static Field<String> alreadyAssigned(String pLineNr) {
		AlreadyAssigned f = new AlreadyAssigned();
		f.setPLineNr(pLineNr);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.ALREADY_ASSIGNED</code> as a field.
	 */
	public static Field<String> alreadyAssigned(Field<String> pLineNr) {
		AlreadyAssigned f = new AlreadyAssigned();
		f.setPLineNr(pLineNr);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.ASSIGN_BI</code>
	 */
	public static void assignBi(Configuration configuration, Number pRunId, Number pMrktId, Number pOffrPerdId, String pContingencyInd) {
		AssignBi p = new AssignBi();
		p.setPRunId(pRunId);
		p.setPMrktId(pMrktId);
		p.setPOffrPerdId(pOffrPerdId);
		p.setPContingencyInd(pContingencyInd);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.ASSIGN_BL</code>
	 */
	public static void assignBl(Configuration configuration, Number pRunId, Number pMrktId, Number pOffrPerdId, String pVehIdList) {
		AssignBl p = new AssignBl();
		p.setPRunId(pRunId);
		p.setPMrktId(pMrktId);
		p.setPOffrPerdId(pOffrPerdId);
		p.setPVehIdList(pVehIdList);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.FSC_IN_USE</code>
	 */
	public static String fscInUse(Configuration configuration, String pFscCd) {
		FscInUse f = new FscInUse();
		f.setPFscCd(pFscCd);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.FSC_IN_USE</code> as a field.
	 */
	public static Field<String> fscInUse(String pFscCd) {
		FscInUse f = new FscInUse();
		f.setPFscCd(pFscCd);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.FSC_IN_USE</code> as a field.
	 */
	public static Field<String> fscInUse(Field<String> pFscCd) {
		FscInUse f = new FscInUse();
		f.setPFscCd(pFscCd);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.GET_ASSIGNABLE_LINE_NRS</code>
	 */
	public static Object getAssignableLineNrs(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pLineNrTypId, Number pLineNrGrpId, Number pSkuId, Number pOffrSkuSetId) {
		GetAssignableLineNrs f = new GetAssignableLineNrs();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);
		f.setPSkuId(pSkuId);
		f.setPOffrSkuSetId(pOffrSkuSetId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.GET_ASSIGNABLE_LINE_NRS</code> as a field.
	 */
	public static Field<Object> getAssignableLineNrs(Number pMrktId, Number pOffrPerdId, Number pLineNrTypId, Number pLineNrGrpId, Number pSkuId, Number pOffrSkuSetId) {
		GetAssignableLineNrs f = new GetAssignableLineNrs();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);
		f.setPSkuId(pSkuId);
		f.setPOffrSkuSetId(pOffrSkuSetId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.GET_ASSIGNABLE_LINE_NRS</code> as a field.
	 */
	public static Field<Object> getAssignableLineNrs(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<? extends Number> pLineNrTypId, Field<? extends Number> pLineNrGrpId, Field<? extends Number> pSkuId, Field<? extends Number> pOffrSkuSetId) {
		GetAssignableLineNrs f = new GetAssignableLineNrs();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);
		f.setPSkuId(pSkuId);
		f.setPOffrSkuSetId(pOffrSkuSetId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.GET_AVAILABLE_BLN</code>
	 */
	public static Object getAvailableBln(Configuration configuration, Number pLineNrTypId, Number pLineNrGrpId) {
		GetAvailableBln f = new GetAvailableBln();
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.GET_AVAILABLE_BLN</code> as a field.
	 */
	public static Field<Object> getAvailableBln(Number pLineNrTypId, Number pLineNrGrpId) {
		GetAvailableBln f = new GetAvailableBln();
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.GET_AVAILABLE_BLN</code> as a field.
	 */
	public static Field<Object> getAvailableBln(Field<? extends Number> pLineNrTypId, Field<? extends Number> pLineNrGrpId) {
		GetAvailableBln f = new GetAvailableBln();
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.GET_SKU_END_DATE</code>
	 */
	public static BigDecimal getSkuEndDate(Configuration configuration, Number pSkuId) {
		GetSkuEndDate f = new GetSkuEndDate();
		f.setPSkuId(pSkuId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.GET_SKU_END_DATE</code> as a field.
	 */
	public static Field<BigDecimal> getSkuEndDate(Number pSkuId) {
		GetSkuEndDate f = new GetSkuEndDate();
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.GET_SKU_END_DATE</code> as a field.
	 */
	public static Field<BigDecimal> getSkuEndDate(Field<? extends Number> pSkuId) {
		GetSkuEndDate f = new GetSkuEndDate();
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.IN_SUBCLUSTER</code>
	 */
	public static String inSubcluster(Configuration configuration, Number pMrktId) {
		InSubcluster f = new InSubcluster();
		f.setPMrktId(pMrktId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.IN_SUBCLUSTER</code> as a field.
	 */
	public static Field<String> inSubcluster(Number pMrktId) {
		InSubcluster f = new InSubcluster();
		f.setPMrktId(pMrktId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.IN_SUBCLUSTER</code> as a field.
	 */
	public static Field<String> inSubcluster(Field<? extends Number> pMrktId) {
		InSubcluster f = new InSubcluster();
		f.setPMrktId(pMrktId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.IN_VEH_LIST</code>
	 */
	public static String inVehList(Configuration configuration, String pVehId) {
		InVehList f = new InVehList();
		f.setPVehId(pVehId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.IN_VEH_LIST</code> as a field.
	 */
	public static Field<String> inVehList(String pVehId) {
		InVehList f = new InVehList();
		f.setPVehId(pVehId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.IN_VEH_LIST</code> as a field.
	 */
	public static Field<String> inVehList(Field<String> pVehId) {
		InVehList f = new InVehList();
		f.setPVehId(pVehId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.LNM_AVAILABLE</code>
	 */
	public static String lnmAvailable(Configuration configuration, String pLineNr, Number pLineNrTypId, Number pLineNrGrpId) {
		LnmAvailable f = new LnmAvailable();
		f.setPLineNr(pLineNr);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.LNM_AVAILABLE</code> as a field.
	 */
	public static Field<String> lnmAvailable(String pLineNr, Number pLineNrTypId, Number pLineNrGrpId) {
		LnmAvailable f = new LnmAvailable();
		f.setPLineNr(pLineNr);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.LNM_AVAILABLE</code> as a field.
	 */
	public static Field<String> lnmAvailable(Field<String> pLineNr, Field<? extends Number> pLineNrTypId, Field<? extends Number> pLineNrGrpId) {
		LnmAvailable f = new LnmAvailable();
		f.setPLineNr(pLineNr);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.LNM_TYP_GRP_LOOKUP</code>
	 */
	public static Object lnmTypGrpLookup(Configuration configuration, Number pMrktId) {
		LnmTypGrpLookup f = new LnmTypGrpLookup();
		f.setPMrktId(pMrktId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.LNM_TYP_GRP_LOOKUP</code> as a field.
	 */
	public static Field<Object> lnmTypGrpLookup(Number pMrktId) {
		LnmTypGrpLookup f = new LnmTypGrpLookup();
		f.setPMrktId(pMrktId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.LNM_TYP_GRP_LOOKUP</code> as a field.
	 */
	public static Field<Object> lnmTypGrpLookup(Field<? extends Number> pMrktId) {
		LnmTypGrpLookup f = new LnmTypGrpLookup();
		f.setPMrktId(pMrktId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.LNM_VALIDATION</code>
	 */
	public static LnmValidation lnmValidation(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pSkuId, Number pOffrSkuSetId, Number pLineNrTypId, Number pLineNrGrpId, String pLineNr) {
		LnmValidation p = new LnmValidation();
		p.setPMrktId(pMrktId);
		p.setPOffrPerdId(pOffrPerdId);
		p.setPSkuId(pSkuId);
		p.setPOffrSkuSetId(pOffrSkuSetId);
		p.setPLineNrTypId(pLineNrTypId);
		p.setPLineNrGrpId(pLineNrGrpId);
		p.setPLineNr(pLineNr);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.MIN_FREE_UP_PERIOD</code>
	 */
	public static BigDecimal minFreeUpPeriod(Configuration configuration, Number pLineNrTypId, Number pLineNrGrpId) {
		MinFreeUpPeriod f = new MinFreeUpPeriod();
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.MIN_FREE_UP_PERIOD</code> as a field.
	 */
	public static Field<BigDecimal> minFreeUpPeriod(Number pLineNrTypId, Number pLineNrGrpId) {
		MinFreeUpPeriod f = new MinFreeUpPeriod();
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.MIN_FREE_UP_PERIOD</code> as a field.
	 */
	public static Field<BigDecimal> minFreeUpPeriod(Field<? extends Number> pLineNrTypId, Field<? extends Number> pLineNrGrpId) {
		MinFreeUpPeriod f = new MinFreeUpPeriod();
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.REASSIGN_LINE_NR</code>
	 */
	public static ReassignLineNr reassignLineNr(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pOffrSkuLineId, Number pOffrSkuSetId, String pLineNr) {
		ReassignLineNr p = new ReassignLineNr();
		p.setPMrktId(pMrktId);
		p.setPOffrPerdId(pOffrPerdId);
		p.setPOffrSkuLineId(pOffrSkuLineId);
		p.setPOffrSkuSetId(pOffrSkuSetId);
		p.setPLineNr(pLineNr);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_ITEM_DETAILS</code>
	 */
	public static Object reassignScrnItemDetails(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pSkuId) {
		ReassignScrnItemDetails f = new ReassignScrnItemDetails();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSkuId(pSkuId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_ITEM_DETAILS</code> as a field.
	 */
	public static Field<Object> reassignScrnItemDetails(Number pMrktId, Number pOffrPerdId, Number pSkuId) {
		ReassignScrnItemDetails f = new ReassignScrnItemDetails();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_ITEM_DETAILS</code> as a field.
	 */
	public static Field<Object> reassignScrnItemDetails(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<? extends Number> pSkuId) {
		ReassignScrnItemDetails f = new ReassignScrnItemDetails();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_ITEM_HISTORY</code>
	 */
	public static Object reassignScrnItemHistory(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pSkuId, String pLineNrList) {
		ReassignScrnItemHistory f = new ReassignScrnItemHistory();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSkuId(pSkuId);
		f.setPLineNrList(pLineNrList);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_ITEM_HISTORY</code> as a field.
	 */
	public static Field<Object> reassignScrnItemHistory(Number pMrktId, Number pOffrPerdId, Number pSkuId, String pLineNrList) {
		ReassignScrnItemHistory f = new ReassignScrnItemHistory();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSkuId(pSkuId);
		f.setPLineNrList(pLineNrList);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_ITEM_HISTORY</code> as a field.
	 */
	public static Field<Object> reassignScrnItemHistory(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<? extends Number> pSkuId, Field<String> pLineNrList) {
		ReassignScrnItemHistory f = new ReassignScrnItemHistory();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSkuId(pSkuId);
		f.setPLineNrList(pLineNrList);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_ITEM_SEARCH</code>
	 */
	public static Object reassignScrnItemSearch(Configuration configuration, Number pMrktId, Number pOffrPerdId, String pSearchStr, Number pLineNrTypId, Number pLineNrGrpId, String pBlankLineNrInd) {
		ReassignScrnItemSearch f = new ReassignScrnItemSearch();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSearchStr(pSearchStr);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);
		f.setPBlankLineNrInd(pBlankLineNrInd);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_ITEM_SEARCH</code> as a field.
	 */
	public static Field<Object> reassignScrnItemSearch(Number pMrktId, Number pOffrPerdId, String pSearchStr, Number pLineNrTypId, Number pLineNrGrpId, String pBlankLineNrInd) {
		ReassignScrnItemSearch f = new ReassignScrnItemSearch();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSearchStr(pSearchStr);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);
		f.setPBlankLineNrInd(pBlankLineNrInd);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_ITEM_SEARCH</code> as a field.
	 */
	public static Field<Object> reassignScrnItemSearch(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<String> pSearchStr, Field<? extends Number> pLineNrTypId, Field<? extends Number> pLineNrGrpId, Field<String> pBlankLineNrInd) {
		ReassignScrnItemSearch f = new ReassignScrnItemSearch();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSearchStr(pSearchStr);
		f.setPLineNrTypId(pLineNrTypId);
		f.setPLineNrGrpId(pLineNrGrpId);
		f.setPBlankLineNrInd(pBlankLineNrInd);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_SET_DETAILS</code>
	 */
	public static Object reassignScrnSetDetails(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pOffrSkuSetId) {
		ReassignScrnSetDetails f = new ReassignScrnSetDetails();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPOffrSkuSetId(pOffrSkuSetId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_SET_DETAILS</code> as a field.
	 */
	public static Field<Object> reassignScrnSetDetails(Number pMrktId, Number pOffrPerdId, Number pOffrSkuSetId) {
		ReassignScrnSetDetails f = new ReassignScrnSetDetails();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPOffrSkuSetId(pOffrSkuSetId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_SET_DETAILS</code> as a field.
	 */
	public static Field<Object> reassignScrnSetDetails(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<? extends Number> pOffrSkuSetId) {
		ReassignScrnSetDetails f = new ReassignScrnSetDetails();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPOffrSkuSetId(pOffrSkuSetId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_SET_HISTORY</code>
	 */
	public static Object reassignScrnSetHistory(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pOffrSkuSetId, String pLineNrList) {
		ReassignScrnSetHistory f = new ReassignScrnSetHistory();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLineNrList(pLineNrList);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_SET_HISTORY</code> as a field.
	 */
	public static Field<Object> reassignScrnSetHistory(Number pMrktId, Number pOffrPerdId, Number pOffrSkuSetId, String pLineNrList) {
		ReassignScrnSetHistory f = new ReassignScrnSetHistory();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLineNrList(pLineNrList);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_SET_HISTORY</code> as a field.
	 */
	public static Field<Object> reassignScrnSetHistory(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<? extends Number> pOffrSkuSetId, Field<String> pLineNrList) {
		ReassignScrnSetHistory f = new ReassignScrnSetHistory();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPOffrSkuSetId(pOffrSkuSetId);
		f.setPLineNrList(pLineNrList);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_SET_SEARCH</code>
	 */
	public static Object reassignScrnSetSearch(Configuration configuration, Number pMrktId, Number pOffrPerdId, String pSearchStr, String pBlankLineNrInd) {
		ReassignScrnSetSearch f = new ReassignScrnSetSearch();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSearchStr(pSearchStr);
		f.setPBlankLineNrInd(pBlankLineNrInd);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_SET_SEARCH</code> as a field.
	 */
	public static Field<Object> reassignScrnSetSearch(Number pMrktId, Number pOffrPerdId, String pSearchStr, String pBlankLineNrInd) {
		ReassignScrnSetSearch f = new ReassignScrnSetSearch();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSearchStr(pSearchStr);
		f.setPBlankLineNrInd(pBlankLineNrInd);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_SET_SEARCH</code> as a field.
	 */
	public static Field<Object> reassignScrnSetSearch(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<String> pSearchStr, Field<String> pBlankLineNrInd) {
		ReassignScrnSetSearch f = new ReassignScrnSetSearch();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSearchStr(pSearchStr);
		f.setPBlankLineNrInd(pBlankLineNrInd);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private AppLnmNola() {
		super("APP_LNM_NOLA", Wetrn.WETRN);
	}
}
