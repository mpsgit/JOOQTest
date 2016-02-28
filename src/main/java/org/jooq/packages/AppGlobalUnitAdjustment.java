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
import org.jooq.packages.app_global_unit_adjustment.FCalculateTobeData;
import org.jooq.packages.app_global_unit_adjustment.FGetCategoryAsisData;
import org.jooq.packages.app_global_unit_adjustment.FGetCategoryPlugAsisData;
import org.jooq.packages.app_global_unit_adjustment.FGetGwpInd;
import org.jooq.packages.app_global_unit_adjustment.FGetMrktsetInd;
import org.jooq.packages.app_global_unit_adjustment.FGetTobeResult;
import org.jooq.packages.app_global_unit_adjustment.FGetTobeResultTmp;
import org.jooq.packages.app_global_unit_adjustment.FGetUpdtCategoryTobeData;
import org.jooq.packages.app_global_unit_adjustment.FGetUpdtVehicleTobeData;
import org.jooq.packages.app_global_unit_adjustment.FGetVehicleAsisData;
import org.jooq.packages.app_global_unit_adjustment.FGetVehiclePlugAsisData;
import org.jooq.packages.app_global_unit_adjustment.FUpdateTobeCategoryUnits;
import org.jooq.packages.app_global_unit_adjustment.FUpdateTobeVehicleUnits;
import org.jooq.packages.app_global_unit_adjustment.FUpdateUnits;
import org.jooq.packages.app_global_unit_adjustment.GetVarianceArray;
import org.jooq.packages.app_global_unit_adjustment.StrToVarray;


/**
 * Convenience access to all stored procedures and functions in APP_GLOBAL_UNIT_ADJUSTMENT
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppGlobalUnitAdjustment extends PackageImpl {

	private static final long serialVersionUID = 1152840759;

	/**
	 * The reference instance of <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT</code>
	 */
	public static final AppGlobalUnitAdjustment APP_GLOBAL_UNIT_ADJUSTMENT = new AppGlobalUnitAdjustment();

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_CALCULATE_TOBE_DATA</code>
	 */
	public static Object fCalculateTobeData(Configuration configuration, Number pMrktId, String pVehicleIds, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pImpactCategory, String pGrpbyFlag, String pCategoryIds) {
		FCalculateTobeData f = new FCalculateTobeData();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPGrpbyFlag(pGrpbyFlag);
		f.setPCategoryIds(pCategoryIds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_CALCULATE_TOBE_DATA</code> as a field.
	 */
	public static Field<Object> fCalculateTobeData(Number pMrktId, String pVehicleIds, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pImpactCategory, String pGrpbyFlag, String pCategoryIds) {
		FCalculateTobeData f = new FCalculateTobeData();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPGrpbyFlag(pGrpbyFlag);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_CALCULATE_TOBE_DATA</code> as a field.
	 */
	public static Field<Object> fCalculateTobeData(Field<? extends Number> pMrktId, Field<String> pVehicleIds, Field<String> pOffrPerdId, Field<String> pSalesTypeId, Field<String> pSupportBudget, Field<String> pSalesAids, Field<String> pImpactCategory, Field<String> pGrpbyFlag, Field<String> pCategoryIds) {
		FCalculateTobeData f = new FCalculateTobeData();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPGrpbyFlag(pGrpbyFlag);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_CATEGORY_ASIS_DATA</code>
	 */
	public static Object fGetCategoryAsisData(Configuration configuration, Number pMrktId, String pCategoryIds, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pImpactCategory, String pVehicleIds) {
		FGetCategoryAsisData f = new FGetCategoryAsisData();
		f.setPMrktId(pMrktId);
		f.setPCategoryIds(pCategoryIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPVehicleIds(pVehicleIds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_CATEGORY_ASIS_DATA</code> as a field.
	 */
	public static Field<Object> fGetCategoryAsisData(Number pMrktId, String pCategoryIds, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pImpactCategory, String pVehicleIds) {
		FGetCategoryAsisData f = new FGetCategoryAsisData();
		f.setPMrktId(pMrktId);
		f.setPCategoryIds(pCategoryIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPVehicleIds(pVehicleIds);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_CATEGORY_ASIS_DATA</code> as a field.
	 */
	public static Field<Object> fGetCategoryAsisData(Field<? extends Number> pMrktId, Field<String> pCategoryIds, Field<String> pOffrPerdId, Field<String> pSalesTypeId, Field<String> pSupportBudget, Field<String> pSalesAids, Field<String> pImpactCategory, Field<String> pVehicleIds) {
		FGetCategoryAsisData f = new FGetCategoryAsisData();
		f.setPMrktId(pMrktId);
		f.setPCategoryIds(pCategoryIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPVehicleIds(pVehicleIds);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_CATEGORY_PLUG_ASIS_DATA</code>
	 */
	public static Object fGetCategoryPlugAsisData(Configuration configuration, Number pMrktId, String pSelectedIds, String pOffrPerdId) {
		FGetCategoryPlugAsisData f = new FGetCategoryPlugAsisData();
		f.setPMrktId(pMrktId);
		f.setPSelectedIds(pSelectedIds);
		f.setPOffrPerdId(pOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_CATEGORY_PLUG_ASIS_DATA</code> as a field.
	 */
	public static Field<Object> fGetCategoryPlugAsisData(Number pMrktId, String pSelectedIds, String pOffrPerdId) {
		FGetCategoryPlugAsisData f = new FGetCategoryPlugAsisData();
		f.setPMrktId(pMrktId);
		f.setPSelectedIds(pSelectedIds);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_CATEGORY_PLUG_ASIS_DATA</code> as a field.
	 */
	public static Field<Object> fGetCategoryPlugAsisData(Field<? extends Number> pMrktId, Field<String> pSelectedIds, Field<String> pOffrPerdId) {
		FGetCategoryPlugAsisData f = new FGetCategoryPlugAsisData();
		f.setPMrktId(pMrktId);
		f.setPSelectedIds(pSelectedIds);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_GWP_IND</code>
	 */
	public static String fGetGwpInd(Configuration configuration, Number pOffrSkuLineId, Number pOffrId) {
		FGetGwpInd f = new FGetGwpInd();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPOffrId(pOffrId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_GWP_IND</code> as a field.
	 */
	public static Field<String> fGetGwpInd(Number pOffrSkuLineId, Number pOffrId) {
		FGetGwpInd f = new FGetGwpInd();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPOffrId(pOffrId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_GWP_IND</code> as a field.
	 */
	public static Field<String> fGetGwpInd(Field<? extends Number> pOffrSkuLineId, Field<? extends Number> pOffrId) {
		FGetGwpInd f = new FGetGwpInd();
		f.setPOffrSkuLineId(pOffrSkuLineId);
		f.setPOffrId(pOffrId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_MRKTSET_IND</code>
	 */
	public static BigDecimal fGetMrktsetInd(Configuration configuration, Number pMrktId, Number pOffrId) {
		FGetMrktsetInd f = new FGetMrktsetInd();
		f.setPMrktId(pMrktId);
		f.setPOffrId(pOffrId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_MRKTSET_IND</code> as a field.
	 */
	public static Field<BigDecimal> fGetMrktsetInd(Number pMrktId, Number pOffrId) {
		FGetMrktsetInd f = new FGetMrktsetInd();
		f.setPMrktId(pMrktId);
		f.setPOffrId(pOffrId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_MRKTSET_IND</code> as a field.
	 */
	public static Field<BigDecimal> fGetMrktsetInd(Field<? extends Number> pMrktId, Field<? extends Number> pOffrId) {
		FGetMrktsetInd f = new FGetMrktsetInd();
		f.setPMrktId(pMrktId);
		f.setPOffrId(pOffrId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT</code>
	 */
	public static Object fGetTobeResult(Configuration configuration, Number pMrktId, String pVehicleIds, String pVariance, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pImpactCategory, String pGrpbyFlag, String pCategoryIds) {
		FGetTobeResult f = new FGetTobeResult();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPGrpbyFlag(pGrpbyFlag);
		f.setPCategoryIds(pCategoryIds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT</code> as a field.
	 */
	public static Field<Object> fGetTobeResult(Number pMrktId, String pVehicleIds, String pVariance, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pImpactCategory, String pGrpbyFlag, String pCategoryIds) {
		FGetTobeResult f = new FGetTobeResult();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPGrpbyFlag(pGrpbyFlag);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT</code> as a field.
	 */
	public static Field<Object> fGetTobeResult(Field<? extends Number> pMrktId, Field<String> pVehicleIds, Field<String> pVariance, Field<String> pOffrPerdId, Field<String> pSalesTypeId, Field<String> pSupportBudget, Field<String> pSalesAids, Field<String> pImpactCategory, Field<String> pGrpbyFlag, Field<String> pCategoryIds) {
		FGetTobeResult f = new FGetTobeResult();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPGrpbyFlag(pGrpbyFlag);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT_TMP</code>
	 */
	public static Object fGetTobeResultTmp(Configuration configuration, Number pMrktId, String pVehicleIds, String pVariance, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pImpactCategory, String pGrpbyFlag, String pCategoryIds) {
		FGetTobeResultTmp f = new FGetTobeResultTmp();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPGrpbyFlag(pGrpbyFlag);
		f.setPCategoryIds(pCategoryIds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT_TMP</code> as a field.
	 */
	public static Field<Object> fGetTobeResultTmp(Number pMrktId, String pVehicleIds, String pVariance, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pImpactCategory, String pGrpbyFlag, String pCategoryIds) {
		FGetTobeResultTmp f = new FGetTobeResultTmp();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPGrpbyFlag(pGrpbyFlag);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_TOBE_RESULT_TMP</code> as a field.
	 */
	public static Field<Object> fGetTobeResultTmp(Field<? extends Number> pMrktId, Field<String> pVehicleIds, Field<String> pVariance, Field<String> pOffrPerdId, Field<String> pSalesTypeId, Field<String> pSupportBudget, Field<String> pSalesAids, Field<String> pImpactCategory, Field<String> pGrpbyFlag, Field<String> pCategoryIds) {
		FGetTobeResultTmp f = new FGetTobeResultTmp();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPGrpbyFlag(pGrpbyFlag);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_UPDT_CATEGORY_TOBE_DATA</code>
	 */
	public static Object fGetUpdtCategoryTobeData(Configuration configuration, Number pMrktId, String pCategoryIds, String pOffrPerdId, String pSalesTypeId, String pOffScheduleFlag, String pSupportBudget, String pSalesAids, String pImpactCategory, String pVehicleIds) {
		FGetUpdtCategoryTobeData f = new FGetUpdtCategoryTobeData();
		f.setPMrktId(pMrktId);
		f.setPCategoryIds(pCategoryIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPOffScheduleFlag(pOffScheduleFlag);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPVehicleIds(pVehicleIds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_UPDT_CATEGORY_TOBE_DATA</code> as a field.
	 */
	public static Field<Object> fGetUpdtCategoryTobeData(Number pMrktId, String pCategoryIds, String pOffrPerdId, String pSalesTypeId, String pOffScheduleFlag, String pSupportBudget, String pSalesAids, String pImpactCategory, String pVehicleIds) {
		FGetUpdtCategoryTobeData f = new FGetUpdtCategoryTobeData();
		f.setPMrktId(pMrktId);
		f.setPCategoryIds(pCategoryIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPOffScheduleFlag(pOffScheduleFlag);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPVehicleIds(pVehicleIds);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_UPDT_CATEGORY_TOBE_DATA</code> as a field.
	 */
	public static Field<Object> fGetUpdtCategoryTobeData(Field<? extends Number> pMrktId, Field<String> pCategoryIds, Field<String> pOffrPerdId, Field<String> pSalesTypeId, Field<String> pOffScheduleFlag, Field<String> pSupportBudget, Field<String> pSalesAids, Field<String> pImpactCategory, Field<String> pVehicleIds) {
		FGetUpdtCategoryTobeData f = new FGetUpdtCategoryTobeData();
		f.setPMrktId(pMrktId);
		f.setPCategoryIds(pCategoryIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPOffScheduleFlag(pOffScheduleFlag);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPVehicleIds(pVehicleIds);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_UPDT_VEHICLE_TOBE_DATA</code>
	 */
	public static Object fGetUpdtVehicleTobeData(Configuration configuration, Number pMrktId, String pVehicleIds, String pOffrPerdId, String pSalesTypeId, String pOffScheduleFlag, String pSupportBudget, String pSalesAids, String pCategoryIds) {
		FGetUpdtVehicleTobeData f = new FGetUpdtVehicleTobeData();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPOffScheduleFlag(pOffScheduleFlag);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPCategoryIds(pCategoryIds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_UPDT_VEHICLE_TOBE_DATA</code> as a field.
	 */
	public static Field<Object> fGetUpdtVehicleTobeData(Number pMrktId, String pVehicleIds, String pOffrPerdId, String pSalesTypeId, String pOffScheduleFlag, String pSupportBudget, String pSalesAids, String pCategoryIds) {
		FGetUpdtVehicleTobeData f = new FGetUpdtVehicleTobeData();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPOffScheduleFlag(pOffScheduleFlag);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_UPDT_VEHICLE_TOBE_DATA</code> as a field.
	 */
	public static Field<Object> fGetUpdtVehicleTobeData(Field<? extends Number> pMrktId, Field<String> pVehicleIds, Field<String> pOffrPerdId, Field<String> pSalesTypeId, Field<String> pOffScheduleFlag, Field<String> pSupportBudget, Field<String> pSalesAids, Field<String> pCategoryIds) {
		FGetUpdtVehicleTobeData f = new FGetUpdtVehicleTobeData();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPOffScheduleFlag(pOffScheduleFlag);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_VEHICLE_ASIS_DATA</code>
	 */
	public static Object fGetVehicleAsisData(Configuration configuration, Number pMrktId, String pVehicleIds, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pCategoryIds) {
		FGetVehicleAsisData f = new FGetVehicleAsisData();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPCategoryIds(pCategoryIds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_VEHICLE_ASIS_DATA</code> as a field.
	 */
	public static Field<Object> fGetVehicleAsisData(Number pMrktId, String pVehicleIds, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pCategoryIds) {
		FGetVehicleAsisData f = new FGetVehicleAsisData();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_VEHICLE_ASIS_DATA</code> as a field.
	 */
	public static Field<Object> fGetVehicleAsisData(Field<? extends Number> pMrktId, Field<String> pVehicleIds, Field<String> pOffrPerdId, Field<String> pSalesTypeId, Field<String> pSupportBudget, Field<String> pSalesAids, Field<String> pCategoryIds) {
		FGetVehicleAsisData f = new FGetVehicleAsisData();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_VEHICLE_PLUG_ASIS_DATA</code>
	 */
	public static Object fGetVehiclePlugAsisData(Configuration configuration, Number pMrktId, String pSelectedIds, String pOffrPerdId) {
		FGetVehiclePlugAsisData f = new FGetVehiclePlugAsisData();
		f.setPMrktId(pMrktId);
		f.setPSelectedIds(pSelectedIds);
		f.setPOffrPerdId(pOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_VEHICLE_PLUG_ASIS_DATA</code> as a field.
	 */
	public static Field<Object> fGetVehiclePlugAsisData(Number pMrktId, String pSelectedIds, String pOffrPerdId) {
		FGetVehiclePlugAsisData f = new FGetVehiclePlugAsisData();
		f.setPMrktId(pMrktId);
		f.setPSelectedIds(pSelectedIds);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_GET_VEHICLE_PLUG_ASIS_DATA</code> as a field.
	 */
	public static Field<Object> fGetVehiclePlugAsisData(Field<? extends Number> pMrktId, Field<String> pSelectedIds, Field<String> pOffrPerdId) {
		FGetVehiclePlugAsisData f = new FGetVehiclePlugAsisData();
		f.setPMrktId(pMrktId);
		f.setPSelectedIds(pSelectedIds);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_UPDATE_TOBE_CATEGORY_UNITS</code>
	 */
	public static String fUpdateTobeCategoryUnits(Configuration configuration, Number pMrktId, String pVehicleIds, String pVariance, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pImpactCategory, String pCategoryIds) {
		FUpdateTobeCategoryUnits f = new FUpdateTobeCategoryUnits();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPCategoryIds(pCategoryIds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_UPDATE_TOBE_CATEGORY_UNITS</code> as a field.
	 */
	public static Field<String> fUpdateTobeCategoryUnits(Number pMrktId, String pVehicleIds, String pVariance, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pImpactCategory, String pCategoryIds) {
		FUpdateTobeCategoryUnits f = new FUpdateTobeCategoryUnits();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_UPDATE_TOBE_CATEGORY_UNITS</code> as a field.
	 */
	public static Field<String> fUpdateTobeCategoryUnits(Field<? extends Number> pMrktId, Field<String> pVehicleIds, Field<String> pVariance, Field<String> pOffrPerdId, Field<String> pSalesTypeId, Field<String> pSupportBudget, Field<String> pSalesAids, Field<String> pImpactCategory, Field<String> pCategoryIds) {
		FUpdateTobeCategoryUnits f = new FUpdateTobeCategoryUnits();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_UPDATE_TOBE_VEHICLE_UNITS</code>
	 */
	public static String fUpdateTobeVehicleUnits(Configuration configuration, Number pMrktId, String pVehicleIds, String pVariance, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pCategoryIds) {
		FUpdateTobeVehicleUnits f = new FUpdateTobeVehicleUnits();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPCategoryIds(pCategoryIds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_UPDATE_TOBE_VEHICLE_UNITS</code> as a field.
	 */
	public static Field<String> fUpdateTobeVehicleUnits(Number pMrktId, String pVehicleIds, String pVariance, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pCategoryIds) {
		FUpdateTobeVehicleUnits f = new FUpdateTobeVehicleUnits();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_UPDATE_TOBE_VEHICLE_UNITS</code> as a field.
	 */
	public static Field<String> fUpdateTobeVehicleUnits(Field<? extends Number> pMrktId, Field<String> pVehicleIds, Field<String> pVariance, Field<String> pOffrPerdId, Field<String> pSalesTypeId, Field<String> pSupportBudget, Field<String> pSalesAids, Field<String> pCategoryIds) {
		FUpdateTobeVehicleUnits f = new FUpdateTobeVehicleUnits();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_UPDATE_UNITS</code>
	 */
	public static String fUpdateUnits(Configuration configuration, Number pMrktId, String pVehicleIds, String pVariance, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pImpactCategory, String pGrpbyFlag, String pCategoryIds) {
		FUpdateUnits f = new FUpdateUnits();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPGrpbyFlag(pGrpbyFlag);
		f.setPCategoryIds(pCategoryIds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_UPDATE_UNITS</code> as a field.
	 */
	public static Field<String> fUpdateUnits(Number pMrktId, String pVehicleIds, String pVariance, String pOffrPerdId, String pSalesTypeId, String pSupportBudget, String pSalesAids, String pImpactCategory, String pGrpbyFlag, String pCategoryIds) {
		FUpdateUnits f = new FUpdateUnits();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPGrpbyFlag(pGrpbyFlag);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.F_UPDATE_UNITS</code> as a field.
	 */
	public static Field<String> fUpdateUnits(Field<? extends Number> pMrktId, Field<String> pVehicleIds, Field<String> pVariance, Field<String> pOffrPerdId, Field<String> pSalesTypeId, Field<String> pSupportBudget, Field<String> pSalesAids, Field<String> pImpactCategory, Field<String> pGrpbyFlag, Field<String> pCategoryIds) {
		FUpdateUnits f = new FUpdateUnits();
		f.setPMrktId(pMrktId);
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPSalesTypeId(pSalesTypeId);
		f.setPSupportBudget(pSupportBudget);
		f.setPSalesAids(pSalesAids);
		f.setPImpactCategory(pImpactCategory);
		f.setPGrpbyFlag(pGrpbyFlag);
		f.setPCategoryIds(pCategoryIds);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.GET_VARIANCE_ARRAY</code>
	 */
	public static Object getVarianceArray(Configuration configuration, String pVehicleIds, String pVariance) {
		GetVarianceArray f = new GetVarianceArray();
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.GET_VARIANCE_ARRAY</code> as a field.
	 */
	public static Field<Object> getVarianceArray(String pVehicleIds, String pVariance) {
		GetVarianceArray f = new GetVarianceArray();
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.GET_VARIANCE_ARRAY</code> as a field.
	 */
	public static Field<Object> getVarianceArray(Field<String> pVehicleIds, Field<String> pVariance) {
		GetVarianceArray f = new GetVarianceArray();
		f.setPVehicleIds(pVehicleIds);
		f.setPVariance(pVariance);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.STR_TO_VARRAY</code>
	 */
	public static Object strToVarray(Configuration configuration, String pStr, String pDel) {
		StrToVarray f = new StrToVarray();
		f.setPStr(pStr);
		f.setPDel(pDel);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.STR_TO_VARRAY</code> as a field.
	 */
	public static Field<Object> strToVarray(String pStr, String pDel) {
		StrToVarray f = new StrToVarray();
		f.setPStr(pStr);
		f.setPDel(pDel);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_GLOBAL_UNIT_ADJUSTMENT.STR_TO_VARRAY</code> as a field.
	 */
	public static Field<Object> strToVarray(Field<String> pStr, Field<String> pDel) {
		StrToVarray f = new StrToVarray();
		f.setPStr(pStr);
		f.setPDel(pDel);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private AppGlobalUnitAdjustment() {
		super("APP_GLOBAL_UNIT_ADJUSTMENT", Wetrn.WETRN);
	}
}
