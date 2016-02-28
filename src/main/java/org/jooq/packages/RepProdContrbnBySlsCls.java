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
import org.jooq.packages.rep_prod_contrbn_by_sls_cls.FGetCydata;
import org.jooq.packages.rep_prod_contrbn_by_sls_cls.FGetData;
import org.jooq.packages.rep_prod_contrbn_by_sls_cls.FGetReportDataCy;
import org.jooq.packages.rep_prod_contrbn_by_sls_cls.FGetReportDataPy;
import org.jooq.packages.rep_prod_contrbn_by_sls_cls.FGetXchangeRate;
import org.jooq.packages.rep_prod_contrbn_by_sls_cls.GetOffsetsString;
import org.jooq.packages.rep_prod_contrbn_by_sls_cls.GetSlsClsDesc;


/**
 * Convenience access to all stored procedures and functions in REP_PROD_CONTRBN_BY_SLS_CLS
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RepProdContrbnBySlsCls extends PackageImpl {

	private static final long serialVersionUID = -1560522324;

	/**
	 * The reference instance of <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS</code>
	 */
	public static final RepProdContrbnBySlsCls REP_PROD_CONTRBN_BY_SLS_CLS = new RepProdContrbnBySlsCls();

	/**
	 * Call <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_CYDATA</code>
	 */
	public static Object fGetCydata(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pCyVerId, Number pPyVerId, String pCatgryIds, String pSlsClsCds, String pBrndIds, String pAccByImpCat, String pIncSupBud, String pIncSlsAid, String pIncCncptDtl, String pCampaignSls, Number pMinOffset, Number pMaxOffset, String pCurrency) {
		FGetCydata f = new FGetCydata();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPCyVerId(pCyVerId);
		f.setPPyVerId(pPyVerId);
		f.setPCatgryIds(pCatgryIds);
		f.setPSlsClsCds(pSlsClsCds);
		f.setPBrndIds(pBrndIds);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPIncSupBud(pIncSupBud);
		f.setPIncSlsAid(pIncSlsAid);
		f.setPIncCncptDtl(pIncCncptDtl);
		f.setPCampaignSls(pCampaignSls);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCurrency(pCurrency);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_CYDATA</code> as a field.
	 */
	public static Field<Object> fGetCydata(Number pMrktId, Number pOffrPerdId, Number pCyVerId, Number pPyVerId, String pCatgryIds, String pSlsClsCds, String pBrndIds, String pAccByImpCat, String pIncSupBud, String pIncSlsAid, String pIncCncptDtl, String pCampaignSls, Number pMinOffset, Number pMaxOffset, String pCurrency) {
		FGetCydata f = new FGetCydata();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPCyVerId(pCyVerId);
		f.setPPyVerId(pPyVerId);
		f.setPCatgryIds(pCatgryIds);
		f.setPSlsClsCds(pSlsClsCds);
		f.setPBrndIds(pBrndIds);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPIncSupBud(pIncSupBud);
		f.setPIncSlsAid(pIncSlsAid);
		f.setPIncCncptDtl(pIncCncptDtl);
		f.setPCampaignSls(pCampaignSls);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCurrency(pCurrency);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_CYDATA</code> as a field.
	 */
	public static Field<Object> fGetCydata(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<? extends Number> pCyVerId, Field<? extends Number> pPyVerId, Field<String> pCatgryIds, Field<String> pSlsClsCds, Field<String> pBrndIds, Field<String> pAccByImpCat, Field<String> pIncSupBud, Field<String> pIncSlsAid, Field<String> pIncCncptDtl, Field<String> pCampaignSls, Field<? extends Number> pMinOffset, Field<? extends Number> pMaxOffset, Field<String> pCurrency) {
		FGetCydata f = new FGetCydata();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPCyVerId(pCyVerId);
		f.setPPyVerId(pPyVerId);
		f.setPCatgryIds(pCatgryIds);
		f.setPSlsClsCds(pSlsClsCds);
		f.setPBrndIds(pBrndIds);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPIncSupBud(pIncSupBud);
		f.setPIncSlsAid(pIncSlsAid);
		f.setPIncCncptDtl(pIncCncptDtl);
		f.setPCampaignSls(pCampaignSls);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCurrency(pCurrency);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_DATA</code>
	 */
	public static Object fGetData(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pCyVerId, Number pPyVerId, String pCatgryIds, String pSlsClsCds, String pBrndIds, String pAccByImpCat, String pIncSupBud, String pIncSlsAid, String pIncCncptDtl, String pCampaignSls, Number pMinOffset, Number pMaxOffset, String pCurrency) {
		FGetData f = new FGetData();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPCyVerId(pCyVerId);
		f.setPPyVerId(pPyVerId);
		f.setPCatgryIds(pCatgryIds);
		f.setPSlsClsCds(pSlsClsCds);
		f.setPBrndIds(pBrndIds);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPIncSupBud(pIncSupBud);
		f.setPIncSlsAid(pIncSlsAid);
		f.setPIncCncptDtl(pIncCncptDtl);
		f.setPCampaignSls(pCampaignSls);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCurrency(pCurrency);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_DATA</code> as a field.
	 */
	public static Field<Object> fGetData(Number pMrktId, Number pOffrPerdId, Number pCyVerId, Number pPyVerId, String pCatgryIds, String pSlsClsCds, String pBrndIds, String pAccByImpCat, String pIncSupBud, String pIncSlsAid, String pIncCncptDtl, String pCampaignSls, Number pMinOffset, Number pMaxOffset, String pCurrency) {
		FGetData f = new FGetData();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPCyVerId(pCyVerId);
		f.setPPyVerId(pPyVerId);
		f.setPCatgryIds(pCatgryIds);
		f.setPSlsClsCds(pSlsClsCds);
		f.setPBrndIds(pBrndIds);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPIncSupBud(pIncSupBud);
		f.setPIncSlsAid(pIncSlsAid);
		f.setPIncCncptDtl(pIncCncptDtl);
		f.setPCampaignSls(pCampaignSls);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCurrency(pCurrency);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_DATA</code> as a field.
	 */
	public static Field<Object> fGetData(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<? extends Number> pCyVerId, Field<? extends Number> pPyVerId, Field<String> pCatgryIds, Field<String> pSlsClsCds, Field<String> pBrndIds, Field<String> pAccByImpCat, Field<String> pIncSupBud, Field<String> pIncSlsAid, Field<String> pIncCncptDtl, Field<String> pCampaignSls, Field<? extends Number> pMinOffset, Field<? extends Number> pMaxOffset, Field<String> pCurrency) {
		FGetData f = new FGetData();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPCyVerId(pCyVerId);
		f.setPPyVerId(pPyVerId);
		f.setPCatgryIds(pCatgryIds);
		f.setPSlsClsCds(pSlsClsCds);
		f.setPBrndIds(pBrndIds);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPIncSupBud(pIncSupBud);
		f.setPIncSlsAid(pIncSlsAid);
		f.setPIncCncptDtl(pIncCncptDtl);
		f.setPCampaignSls(pCampaignSls);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCurrency(pCurrency);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY</code>
	 */
	public static Object fGetReportDataCy(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pVerId, String pCatgryIds, String pSlsClsCds, String pBrndIds, String pAccByImpCat, String pIncSupBud, String pIncSlsAid, String pIncCncptDtl, String pCampaignSls, Number pMinOffset, Number pMaxOffset, String pCurrency, String pGrpByBusiness) {
		FGetReportDataCy f = new FGetReportDataCy();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPVerId(pVerId);
		f.setPCatgryIds(pCatgryIds);
		f.setPSlsClsCds(pSlsClsCds);
		f.setPBrndIds(pBrndIds);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPIncSupBud(pIncSupBud);
		f.setPIncSlsAid(pIncSlsAid);
		f.setPIncCncptDtl(pIncCncptDtl);
		f.setPCampaignSls(pCampaignSls);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCurrency(pCurrency);
		f.setPGrpByBusiness(pGrpByBusiness);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY</code> as a field.
	 */
	public static Field<Object> fGetReportDataCy(Number pMrktId, Number pOffrPerdId, Number pVerId, String pCatgryIds, String pSlsClsCds, String pBrndIds, String pAccByImpCat, String pIncSupBud, String pIncSlsAid, String pIncCncptDtl, String pCampaignSls, Number pMinOffset, Number pMaxOffset, String pCurrency, String pGrpByBusiness) {
		FGetReportDataCy f = new FGetReportDataCy();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPVerId(pVerId);
		f.setPCatgryIds(pCatgryIds);
		f.setPSlsClsCds(pSlsClsCds);
		f.setPBrndIds(pBrndIds);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPIncSupBud(pIncSupBud);
		f.setPIncSlsAid(pIncSlsAid);
		f.setPIncCncptDtl(pIncCncptDtl);
		f.setPCampaignSls(pCampaignSls);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCurrency(pCurrency);
		f.setPGrpByBusiness(pGrpByBusiness);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_CY</code> as a field.
	 */
	public static Field<Object> fGetReportDataCy(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<? extends Number> pVerId, Field<String> pCatgryIds, Field<String> pSlsClsCds, Field<String> pBrndIds, Field<String> pAccByImpCat, Field<String> pIncSupBud, Field<String> pIncSlsAid, Field<String> pIncCncptDtl, Field<String> pCampaignSls, Field<? extends Number> pMinOffset, Field<? extends Number> pMaxOffset, Field<String> pCurrency, Field<String> pGrpByBusiness) {
		FGetReportDataCy f = new FGetReportDataCy();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPVerId(pVerId);
		f.setPCatgryIds(pCatgryIds);
		f.setPSlsClsCds(pSlsClsCds);
		f.setPBrndIds(pBrndIds);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPIncSupBud(pIncSupBud);
		f.setPIncSlsAid(pIncSlsAid);
		f.setPIncCncptDtl(pIncCncptDtl);
		f.setPCampaignSls(pCampaignSls);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCurrency(pCurrency);
		f.setPGrpByBusiness(pGrpByBusiness);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_PY</code>
	 */
	public static Object fGetReportDataPy(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pVerId, String pCatgryIds, String pSlsClsCds, String pBrndIds, String pAccByImpCat, String pIncSupBud, String pIncSlsAid, String pIncCncptDtl, String pCampaignSls, Number pMinOffset, Number pMaxOffset, String pCurrency, String pGrpByBusiness) {
		FGetReportDataPy f = new FGetReportDataPy();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPVerId(pVerId);
		f.setPCatgryIds(pCatgryIds);
		f.setPSlsClsCds(pSlsClsCds);
		f.setPBrndIds(pBrndIds);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPIncSupBud(pIncSupBud);
		f.setPIncSlsAid(pIncSlsAid);
		f.setPIncCncptDtl(pIncCncptDtl);
		f.setPCampaignSls(pCampaignSls);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCurrency(pCurrency);
		f.setPGrpByBusiness(pGrpByBusiness);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_PY</code> as a field.
	 */
	public static Field<Object> fGetReportDataPy(Number pMrktId, Number pOffrPerdId, Number pVerId, String pCatgryIds, String pSlsClsCds, String pBrndIds, String pAccByImpCat, String pIncSupBud, String pIncSlsAid, String pIncCncptDtl, String pCampaignSls, Number pMinOffset, Number pMaxOffset, String pCurrency, String pGrpByBusiness) {
		FGetReportDataPy f = new FGetReportDataPy();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPVerId(pVerId);
		f.setPCatgryIds(pCatgryIds);
		f.setPSlsClsCds(pSlsClsCds);
		f.setPBrndIds(pBrndIds);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPIncSupBud(pIncSupBud);
		f.setPIncSlsAid(pIncSlsAid);
		f.setPIncCncptDtl(pIncCncptDtl);
		f.setPCampaignSls(pCampaignSls);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCurrency(pCurrency);
		f.setPGrpByBusiness(pGrpByBusiness);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_REPORT_DATA_PY</code> as a field.
	 */
	public static Field<Object> fGetReportDataPy(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<? extends Number> pVerId, Field<String> pCatgryIds, Field<String> pSlsClsCds, Field<String> pBrndIds, Field<String> pAccByImpCat, Field<String> pIncSupBud, Field<String> pIncSlsAid, Field<String> pIncCncptDtl, Field<String> pCampaignSls, Field<? extends Number> pMinOffset, Field<? extends Number> pMaxOffset, Field<String> pCurrency, Field<String> pGrpByBusiness) {
		FGetReportDataPy f = new FGetReportDataPy();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPVerId(pVerId);
		f.setPCatgryIds(pCatgryIds);
		f.setPSlsClsCds(pSlsClsCds);
		f.setPBrndIds(pBrndIds);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPIncSupBud(pIncSupBud);
		f.setPIncSlsAid(pIncSlsAid);
		f.setPIncCncptDtl(pIncCncptDtl);
		f.setPCampaignSls(pCampaignSls);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCurrency(pCurrency);
		f.setPGrpByBusiness(pGrpByBusiness);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_XCHANGE_RATE</code>
	 */
	public static BigDecimal fGetXchangeRate(Configuration configuration, Number pMrktId, Number pPerdId) {
		FGetXchangeRate f = new FGetXchangeRate();
		f.setPMrktId(pMrktId);
		f.setPPerdId(pPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_XCHANGE_RATE</code> as a field.
	 */
	public static Field<BigDecimal> fGetXchangeRate(Number pMrktId, Number pPerdId) {
		FGetXchangeRate f = new FGetXchangeRate();
		f.setPMrktId(pMrktId);
		f.setPPerdId(pPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.F_GET_XCHANGE_RATE</code> as a field.
	 */
	public static Field<BigDecimal> fGetXchangeRate(Field<? extends Number> pMrktId, Field<? extends Number> pPerdId) {
		FGetXchangeRate f = new FGetXchangeRate();
		f.setPMrktId(pMrktId);
		f.setPPerdId(pPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_OFFSETS_STRING</code>
	 */
	public static String getOffsetsString(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pMinOffset, Number pMaxOffset, Number pCoo, String pPerdTyp) {
		GetOffsetsString f = new GetOffsetsString();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCoo(pCoo);
		f.setPPerdTyp(pPerdTyp);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_OFFSETS_STRING</code> as a field.
	 */
	public static Field<String> getOffsetsString(Number pMrktId, Number pOffrPerdId, Number pMinOffset, Number pMaxOffset, Number pCoo, String pPerdTyp) {
		GetOffsetsString f = new GetOffsetsString();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCoo(pCoo);
		f.setPPerdTyp(pPerdTyp);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_OFFSETS_STRING</code> as a field.
	 */
	public static Field<String> getOffsetsString(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<? extends Number> pMinOffset, Field<? extends Number> pMaxOffset, Field<? extends Number> pCoo, Field<String> pPerdTyp) {
		GetOffsetsString f = new GetOffsetsString();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCoo(pCoo);
		f.setPPerdTyp(pPerdTyp);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_SLS_CLS_DESC</code>
	 */
	public static String getSlsClsDesc(Configuration configuration, String slsClsCode) {
		GetSlsClsDesc f = new GetSlsClsDesc();
		f.setSlsClsCode(slsClsCode);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_SLS_CLS_DESC</code> as a field.
	 */
	public static Field<String> getSlsClsDesc(String slsClsCode) {
		GetSlsClsDesc f = new GetSlsClsDesc();
		f.setSlsClsCode(slsClsCode);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_SLS_CLS_DESC</code> as a field.
	 */
	public static Field<String> getSlsClsDesc(Field<String> slsClsCode) {
		GetSlsClsDesc f = new GetSlsClsDesc();
		f.setSlsClsCode(slsClsCode);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private RepProdContrbnBySlsCls() {
		super("REP_PROD_CONTRBN_BY_SLS_CLS", Wetrn.WETRN);
	}
}