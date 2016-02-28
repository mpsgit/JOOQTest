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
import org.jooq.packages.pa_cube.DeleteOffersFromVehicle;
import org.jooq.packages.pa_cube.GetCommissionType;
import org.jooq.packages.pa_cube.GetPriceTag;
import org.jooq.packages.pa_cube.GetScreenSummaryRow;
import org.jooq.packages.pa_cube.ListMatch;
import org.jooq.packages.pa_cube.PlanActiveProducts;
import org.jooq.packages.pa_cube.RepProductPricing;
import org.jooq.packages.pa_cube.ValidateCampaign;
import org.jooq.udt.records.ObjProductPricingRecord;
import org.jooq.udt.records.TActiveNotPlannedRecord;
import org.jooq.udt.records.TProductPricingRecord;


/**
 * Convenience access to all stored procedures and functions in PA_CUBE
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaCube extends PackageImpl {

	private static final long serialVersionUID = -1204827648;

	/**
	 * The reference instance of <code>WETRN.PA_CUBE</code>
	 */
	public static final PaCube PA_CUBE = new PaCube();

	/**
	 * Call <code>WETRN.PA_CUBE.DELETE_OFFERS_FROM_VEHICLE</code>
	 */
	public static BigDecimal deleteOffersFromVehicle(Configuration configuration, Number pMrktId, Number pVehId, Number pOffrPerdId) {
		DeleteOffersFromVehicle p = new DeleteOffersFromVehicle();
		p.setPMrktId(pMrktId);
		p.setPVehId(pVehId);
		p.setPOffrPerdId(pOffrPerdId);

		p.execute(configuration);
		return p.getPReturnStatus();
	}

	/**
	 * Call <code>WETRN.PA_CUBE.GET_COMMISSION_TYPE</code>
	 */
	public static String getCommissionType(Configuration configuration, Number pMrktId, Number pOffrPerdId, Integer pPrflCd) {
		GetCommissionType f = new GetCommissionType();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPPrflCd(pPrflCd);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_CUBE.GET_COMMISSION_TYPE</code> as a field.
	 */
	public static Field<String> getCommissionType(Number pMrktId, Number pOffrPerdId, Integer pPrflCd) {
		GetCommissionType f = new GetCommissionType();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPPrflCd(pPrflCd);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_CUBE.GET_COMMISSION_TYPE</code> as a field.
	 */
	public static Field<String> getCommissionType(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<Integer> pPrflCd) {
		GetCommissionType f = new GetCommissionType();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPPrflCd(pPrflCd);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.PA_CUBE.GET_PRICE_TAG</code>
	 */
	public static String getPriceTag(Configuration configuration, Number pMrktId, String pTagList) {
		GetPriceTag f = new GetPriceTag();
		f.setPMrktId(pMrktId);
		f.setPTagList(pTagList);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_CUBE.GET_PRICE_TAG</code> as a field.
	 */
	public static Field<String> getPriceTag(Number pMrktId, String pTagList) {
		GetPriceTag f = new GetPriceTag();
		f.setPMrktId(pMrktId);
		f.setPTagList(pTagList);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_CUBE.GET_PRICE_TAG</code> as a field.
	 */
	public static Field<String> getPriceTag(Field<? extends Number> pMrktId, Field<String> pTagList) {
		GetPriceTag f = new GetPriceTag();
		f.setPMrktId(pMrktId);
		f.setPTagList(pTagList);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.PA_CUBE.GET_SCREEN_SUMMARY_ROW</code>
	 */
	public static ObjProductPricingRecord getScreenSummaryRow(Configuration configuration, Number pMrktId, Number pTrgtPerdId, Number pStrtPerdId, Number pSkuId) {
		GetScreenSummaryRow f = new GetScreenSummaryRow();
		f.setPMrktId(pMrktId);
		f.setPTrgtPerdId(pTrgtPerdId);
		f.setPStrtPerdId(pStrtPerdId);
		f.setPSkuId(pSkuId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_CUBE.GET_SCREEN_SUMMARY_ROW</code> as a field.
	 */
	public static Field<ObjProductPricingRecord> getScreenSummaryRow(Number pMrktId, Number pTrgtPerdId, Number pStrtPerdId, Number pSkuId) {
		GetScreenSummaryRow f = new GetScreenSummaryRow();
		f.setPMrktId(pMrktId);
		f.setPTrgtPerdId(pTrgtPerdId);
		f.setPStrtPerdId(pStrtPerdId);
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_CUBE.GET_SCREEN_SUMMARY_ROW</code> as a field.
	 */
	public static Field<ObjProductPricingRecord> getScreenSummaryRow(Field<? extends Number> pMrktId, Field<? extends Number> pTrgtPerdId, Field<? extends Number> pStrtPerdId, Field<? extends Number> pSkuId) {
		GetScreenSummaryRow f = new GetScreenSummaryRow();
		f.setPMrktId(pMrktId);
		f.setPTrgtPerdId(pTrgtPerdId);
		f.setPStrtPerdId(pStrtPerdId);
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.PA_CUBE.LIST_MATCH</code>
	 */
	public static String listMatch(Configuration configuration, String pId, String pIdList) {
		ListMatch f = new ListMatch();
		f.setPId(pId);
		f.setPIdList(pIdList);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_CUBE.LIST_MATCH</code> as a field.
	 */
	public static Field<String> listMatch(String pId, String pIdList) {
		ListMatch f = new ListMatch();
		f.setPId(pId);
		f.setPIdList(pIdList);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_CUBE.LIST_MATCH</code> as a field.
	 */
	public static Field<String> listMatch(Field<String> pId, Field<String> pIdList) {
		ListMatch f = new ListMatch();
		f.setPId(pId);
		f.setPIdList(pIdList);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.PA_CUBE.PLAN_ACTIVE_PRODUCTS</code>
	 */
	public static PlanActiveProducts planActiveProducts(Configuration configuration, Number pMrktId, Number pVehId, Number pOffrPerdId, TActiveNotPlannedRecord pActiveProducts) {
		PlanActiveProducts p = new PlanActiveProducts();
		p.setPMrktId(pMrktId);
		p.setPVehId(pVehId);
		p.setPOffrPerdId(pOffrPerdId);
		p.setPActiveProducts(pActiveProducts);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call <code>WETRN.PA_CUBE.REP_PRODUCT_PRICING</code>
	 */
	public static TProductPricingRecord repProductPricing(Configuration configuration, Number pMrktId, Number pTrgtPerdId, Number pStrtPerdId, Integer pPrflCd, Number pSkuId, String pSkuNm, String pCatgryList, String pBrndFmlyList, String pBrndList, String pFormList, String pFormGrpList, String pProdTypList, String pSgmtList, String pSlsClsList, String pGendrList, String pFullExport) {
		RepProductPricing f = new RepProductPricing();
		f.setPMrktId(pMrktId);
		f.setPTrgtPerdId(pTrgtPerdId);
		f.setPStrtPerdId(pStrtPerdId);
		f.setPPrflCd(pPrflCd);
		f.setPSkuId(pSkuId);
		f.setPSkuNm(pSkuNm);
		f.setPCatgryList(pCatgryList);
		f.setPBrndFmlyList(pBrndFmlyList);
		f.setPBrndList(pBrndList);
		f.setPFormList(pFormList);
		f.setPFormGrpList(pFormGrpList);
		f.setPProdTypList(pProdTypList);
		f.setPSgmtList(pSgmtList);
		f.setPSlsClsList(pSlsClsList);
		f.setPGendrList(pGendrList);
		f.setPFullExport(pFullExport);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_CUBE.REP_PRODUCT_PRICING</code> as a field.
	 */
	public static Field<TProductPricingRecord> repProductPricing(Number pMrktId, Number pTrgtPerdId, Number pStrtPerdId, Integer pPrflCd, Number pSkuId, String pSkuNm, String pCatgryList, String pBrndFmlyList, String pBrndList, String pFormList, String pFormGrpList, String pProdTypList, String pSgmtList, String pSlsClsList, String pGendrList, String pFullExport) {
		RepProductPricing f = new RepProductPricing();
		f.setPMrktId(pMrktId);
		f.setPTrgtPerdId(pTrgtPerdId);
		f.setPStrtPerdId(pStrtPerdId);
		f.setPPrflCd(pPrflCd);
		f.setPSkuId(pSkuId);
		f.setPSkuNm(pSkuNm);
		f.setPCatgryList(pCatgryList);
		f.setPBrndFmlyList(pBrndFmlyList);
		f.setPBrndList(pBrndList);
		f.setPFormList(pFormList);
		f.setPFormGrpList(pFormGrpList);
		f.setPProdTypList(pProdTypList);
		f.setPSgmtList(pSgmtList);
		f.setPSlsClsList(pSlsClsList);
		f.setPGendrList(pGendrList);
		f.setPFullExport(pFullExport);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_CUBE.REP_PRODUCT_PRICING</code> as a field.
	 */
	public static Field<TProductPricingRecord> repProductPricing(Field<? extends Number> pMrktId, Field<? extends Number> pTrgtPerdId, Field<? extends Number> pStrtPerdId, Field<Integer> pPrflCd, Field<? extends Number> pSkuId, Field<String> pSkuNm, Field<String> pCatgryList, Field<String> pBrndFmlyList, Field<String> pBrndList, Field<String> pFormList, Field<String> pFormGrpList, Field<String> pProdTypList, Field<String> pSgmtList, Field<String> pSlsClsList, Field<String> pGendrList, Field<String> pFullExport) {
		RepProductPricing f = new RepProductPricing();
		f.setPMrktId(pMrktId);
		f.setPTrgtPerdId(pTrgtPerdId);
		f.setPStrtPerdId(pStrtPerdId);
		f.setPPrflCd(pPrflCd);
		f.setPSkuId(pSkuId);
		f.setPSkuNm(pSkuNm);
		f.setPCatgryList(pCatgryList);
		f.setPBrndFmlyList(pBrndFmlyList);
		f.setPBrndList(pBrndList);
		f.setPFormList(pFormList);
		f.setPFormGrpList(pFormGrpList);
		f.setPProdTypList(pProdTypList);
		f.setPSgmtList(pSgmtList);
		f.setPSlsClsList(pSlsClsList);
		f.setPGendrList(pGendrList);
		f.setPFullExport(pFullExport);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.PA_CUBE.VALIDATE_CAMPAIGN</code>
	 */
	public static BigDecimal validateCampaign(Configuration configuration, Number pMrktId, Number pVehId, Number pOffrPerdId) {
		ValidateCampaign f = new ValidateCampaign();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPOffrPerdId(pOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_CUBE.VALIDATE_CAMPAIGN</code> as a field.
	 */
	public static Field<BigDecimal> validateCampaign(Number pMrktId, Number pVehId, Number pOffrPerdId) {
		ValidateCampaign f = new ValidateCampaign();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_CUBE.VALIDATE_CAMPAIGN</code> as a field.
	 */
	public static Field<BigDecimal> validateCampaign(Field<? extends Number> pMrktId, Field<? extends Number> pVehId, Field<? extends Number> pOffrPerdId) {
		ValidateCampaign f = new ValidateCampaign();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private PaCube() {
		super("PA_CUBE", Wetrn.WETRN);
	}
}
