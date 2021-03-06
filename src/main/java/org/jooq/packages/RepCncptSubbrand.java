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
import org.jooq.packages.rep_cncpt_subbrand.FCncptSbrndBySlsClsRpt;
import org.jooq.packages.rep_cncpt_subbrand.FCncptSbrndSlsClsRptTmp;
import org.jooq.packages.rep_cncpt_subbrand.FGetDataCy;
import org.jooq.packages.rep_cncpt_subbrand.FGetDataPy;
import org.jooq.packages.rep_cncpt_subbrand.FGetXchangeRate;
import org.jooq.packages.rep_cncpt_subbrand.GetOffsetsString;


/**
 * Convenience access to all stored procedures and functions in REP_CNCPT_SUBBRAND
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RepCncptSubbrand extends PackageImpl {

	private static final long serialVersionUID = -810685246;

	/**
	 * The reference instance of <code>WETRN.REP_CNCPT_SUBBRAND</code>
	 */
	public static final RepCncptSubbrand REP_CNCPT_SUBBRAND = new RepCncptSubbrand();

	/**
	 * Call <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_BY_SLS_CLS_RPT</code>
	 */
	public static Object fCncptSbrndBySlsClsRpt(Configuration configuration, Number pMrktId, String pVehId, Number pVerId, String pCatgryId, String pBrndId, Number pPerdId, String pSlsClsCd, String pCurrency, String pIncSupBud, String pAccByImpCat, String pRegPrcOffr, Number pOffsetMin, Number pOffsetMax, String pSlsAid, String pCampaignSls) {
		FCncptSbrndBySlsClsRpt f = new FCncptSbrndBySlsClsRpt();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPCatgryId(pCatgryId);
		f.setPBrndId(pBrndId);
		f.setPPerdId(pPerdId);
		f.setPSlsClsCd(pSlsClsCd);
		f.setPCurrency(pCurrency);
		f.setPIncSupBud(pIncSupBud);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPRegPrcOffr(pRegPrcOffr);
		f.setPOffsetMin(pOffsetMin);
		f.setPOffsetMax(pOffsetMax);
		f.setPSlsAid(pSlsAid);
		f.setPCampaignSls(pCampaignSls);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_BY_SLS_CLS_RPT</code> as a field.
	 */
	public static Field<Object> fCncptSbrndBySlsClsRpt(Number pMrktId, String pVehId, Number pVerId, String pCatgryId, String pBrndId, Number pPerdId, String pSlsClsCd, String pCurrency, String pIncSupBud, String pAccByImpCat, String pRegPrcOffr, Number pOffsetMin, Number pOffsetMax, String pSlsAid, String pCampaignSls) {
		FCncptSbrndBySlsClsRpt f = new FCncptSbrndBySlsClsRpt();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPCatgryId(pCatgryId);
		f.setPBrndId(pBrndId);
		f.setPPerdId(pPerdId);
		f.setPSlsClsCd(pSlsClsCd);
		f.setPCurrency(pCurrency);
		f.setPIncSupBud(pIncSupBud);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPRegPrcOffr(pRegPrcOffr);
		f.setPOffsetMin(pOffsetMin);
		f.setPOffsetMax(pOffsetMax);
		f.setPSlsAid(pSlsAid);
		f.setPCampaignSls(pCampaignSls);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_BY_SLS_CLS_RPT</code> as a field.
	 */
	public static Field<Object> fCncptSbrndBySlsClsRpt(Field<? extends Number> pMrktId, Field<String> pVehId, Field<? extends Number> pVerId, Field<String> pCatgryId, Field<String> pBrndId, Field<? extends Number> pPerdId, Field<String> pSlsClsCd, Field<String> pCurrency, Field<String> pIncSupBud, Field<String> pAccByImpCat, Field<String> pRegPrcOffr, Field<? extends Number> pOffsetMin, Field<? extends Number> pOffsetMax, Field<String> pSlsAid, Field<String> pCampaignSls) {
		FCncptSbrndBySlsClsRpt f = new FCncptSbrndBySlsClsRpt();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPCatgryId(pCatgryId);
		f.setPBrndId(pBrndId);
		f.setPPerdId(pPerdId);
		f.setPSlsClsCd(pSlsClsCd);
		f.setPCurrency(pCurrency);
		f.setPIncSupBud(pIncSupBud);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPRegPrcOffr(pRegPrcOffr);
		f.setPOffsetMin(pOffsetMin);
		f.setPOffsetMax(pOffsetMax);
		f.setPSlsAid(pSlsAid);
		f.setPCampaignSls(pCampaignSls);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP</code>
	 */
	public static Object fCncptSbrndSlsClsRptTmp(Configuration configuration, Number pMrktId, String pVehId, Number pVerId, String pCatgryId, String pBrndId, Number pPerdId, String pSlsClsCd, String pCurrency, String pIncSupBud, String pAccByImpCat, String pRegPrcOffr, Number pOffsetMin, Number pOffsetMax, String pSlsAid, String pCampaignSls) {
		FCncptSbrndSlsClsRptTmp f = new FCncptSbrndSlsClsRptTmp();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPCatgryId(pCatgryId);
		f.setPBrndId(pBrndId);
		f.setPPerdId(pPerdId);
		f.setPSlsClsCd(pSlsClsCd);
		f.setPCurrency(pCurrency);
		f.setPIncSupBud(pIncSupBud);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPRegPrcOffr(pRegPrcOffr);
		f.setPOffsetMin(pOffsetMin);
		f.setPOffsetMax(pOffsetMax);
		f.setPSlsAid(pSlsAid);
		f.setPCampaignSls(pCampaignSls);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP</code> as a field.
	 */
	public static Field<Object> fCncptSbrndSlsClsRptTmp(Number pMrktId, String pVehId, Number pVerId, String pCatgryId, String pBrndId, Number pPerdId, String pSlsClsCd, String pCurrency, String pIncSupBud, String pAccByImpCat, String pRegPrcOffr, Number pOffsetMin, Number pOffsetMax, String pSlsAid, String pCampaignSls) {
		FCncptSbrndSlsClsRptTmp f = new FCncptSbrndSlsClsRptTmp();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPCatgryId(pCatgryId);
		f.setPBrndId(pBrndId);
		f.setPPerdId(pPerdId);
		f.setPSlsClsCd(pSlsClsCd);
		f.setPCurrency(pCurrency);
		f.setPIncSupBud(pIncSupBud);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPRegPrcOffr(pRegPrcOffr);
		f.setPOffsetMin(pOffsetMin);
		f.setPOffsetMax(pOffsetMax);
		f.setPSlsAid(pSlsAid);
		f.setPCampaignSls(pCampaignSls);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_CNCPT_SUBBRAND.F_CNCPT_SBRND_SLS_CLS_RPT_TMP</code> as a field.
	 */
	public static Field<Object> fCncptSbrndSlsClsRptTmp(Field<? extends Number> pMrktId, Field<String> pVehId, Field<? extends Number> pVerId, Field<String> pCatgryId, Field<String> pBrndId, Field<? extends Number> pPerdId, Field<String> pSlsClsCd, Field<String> pCurrency, Field<String> pIncSupBud, Field<String> pAccByImpCat, Field<String> pRegPrcOffr, Field<? extends Number> pOffsetMin, Field<? extends Number> pOffsetMax, Field<String> pSlsAid, Field<String> pCampaignSls) {
		FCncptSbrndSlsClsRptTmp f = new FCncptSbrndSlsClsRptTmp();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPCatgryId(pCatgryId);
		f.setPBrndId(pBrndId);
		f.setPPerdId(pPerdId);
		f.setPSlsClsCd(pSlsClsCd);
		f.setPCurrency(pCurrency);
		f.setPIncSupBud(pIncSupBud);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPRegPrcOffr(pRegPrcOffr);
		f.setPOffsetMin(pOffsetMin);
		f.setPOffsetMax(pOffsetMax);
		f.setPSlsAid(pSlsAid);
		f.setPCampaignSls(pCampaignSls);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_CNCPT_SUBBRAND.F_GET_DATA_CY</code>
	 */
	public static Object fGetDataCy(Configuration configuration, Number pMrktId, String pVehId, Number pVerId, String pCatgryId, String pBrndId, Number pPerdId, String pSlsClsCd, String pCurrency, String pIncSupBud, String pAccByImpCat, String pRegPrcOffr, Number pMinOffset, Number pMaxOffset, String pSlsAid, String pCampaignSls) {
		FGetDataCy f = new FGetDataCy();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPCatgryId(pCatgryId);
		f.setPBrndId(pBrndId);
		f.setPPerdId(pPerdId);
		f.setPSlsClsCd(pSlsClsCd);
		f.setPCurrency(pCurrency);
		f.setPIncSupBud(pIncSupBud);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPRegPrcOffr(pRegPrcOffr);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPSlsAid(pSlsAid);
		f.setPCampaignSls(pCampaignSls);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_CNCPT_SUBBRAND.F_GET_DATA_CY</code> as a field.
	 */
	public static Field<Object> fGetDataCy(Number pMrktId, String pVehId, Number pVerId, String pCatgryId, String pBrndId, Number pPerdId, String pSlsClsCd, String pCurrency, String pIncSupBud, String pAccByImpCat, String pRegPrcOffr, Number pMinOffset, Number pMaxOffset, String pSlsAid, String pCampaignSls) {
		FGetDataCy f = new FGetDataCy();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPCatgryId(pCatgryId);
		f.setPBrndId(pBrndId);
		f.setPPerdId(pPerdId);
		f.setPSlsClsCd(pSlsClsCd);
		f.setPCurrency(pCurrency);
		f.setPIncSupBud(pIncSupBud);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPRegPrcOffr(pRegPrcOffr);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPSlsAid(pSlsAid);
		f.setPCampaignSls(pCampaignSls);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_CNCPT_SUBBRAND.F_GET_DATA_CY</code> as a field.
	 */
	public static Field<Object> fGetDataCy(Field<? extends Number> pMrktId, Field<String> pVehId, Field<? extends Number> pVerId, Field<String> pCatgryId, Field<String> pBrndId, Field<? extends Number> pPerdId, Field<String> pSlsClsCd, Field<String> pCurrency, Field<String> pIncSupBud, Field<String> pAccByImpCat, Field<String> pRegPrcOffr, Field<? extends Number> pMinOffset, Field<? extends Number> pMaxOffset, Field<String> pSlsAid, Field<String> pCampaignSls) {
		FGetDataCy f = new FGetDataCy();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPCatgryId(pCatgryId);
		f.setPBrndId(pBrndId);
		f.setPPerdId(pPerdId);
		f.setPSlsClsCd(pSlsClsCd);
		f.setPCurrency(pCurrency);
		f.setPIncSupBud(pIncSupBud);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPRegPrcOffr(pRegPrcOffr);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPSlsAid(pSlsAid);
		f.setPCampaignSls(pCampaignSls);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_CNCPT_SUBBRAND.F_GET_DATA_PY</code>
	 */
	public static Object fGetDataPy(Configuration configuration, Number pMrktId, String pVehId, Number pVerId, String pCatgryId, String pBrndId, Number pPerdId, String pSlsClsCd, String pCurrency, String pIncSupBud, String pAccByImpCat, String pRegPrcOffr, Number pMinOffset, Number pMaxOffset, String pSlsAid, String pCampaignSls) {
		FGetDataPy f = new FGetDataPy();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPCatgryId(pCatgryId);
		f.setPBrndId(pBrndId);
		f.setPPerdId(pPerdId);
		f.setPSlsClsCd(pSlsClsCd);
		f.setPCurrency(pCurrency);
		f.setPIncSupBud(pIncSupBud);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPRegPrcOffr(pRegPrcOffr);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPSlsAid(pSlsAid);
		f.setPCampaignSls(pCampaignSls);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_CNCPT_SUBBRAND.F_GET_DATA_PY</code> as a field.
	 */
	public static Field<Object> fGetDataPy(Number pMrktId, String pVehId, Number pVerId, String pCatgryId, String pBrndId, Number pPerdId, String pSlsClsCd, String pCurrency, String pIncSupBud, String pAccByImpCat, String pRegPrcOffr, Number pMinOffset, Number pMaxOffset, String pSlsAid, String pCampaignSls) {
		FGetDataPy f = new FGetDataPy();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPCatgryId(pCatgryId);
		f.setPBrndId(pBrndId);
		f.setPPerdId(pPerdId);
		f.setPSlsClsCd(pSlsClsCd);
		f.setPCurrency(pCurrency);
		f.setPIncSupBud(pIncSupBud);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPRegPrcOffr(pRegPrcOffr);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPSlsAid(pSlsAid);
		f.setPCampaignSls(pCampaignSls);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_CNCPT_SUBBRAND.F_GET_DATA_PY</code> as a field.
	 */
	public static Field<Object> fGetDataPy(Field<? extends Number> pMrktId, Field<String> pVehId, Field<? extends Number> pVerId, Field<String> pCatgryId, Field<String> pBrndId, Field<? extends Number> pPerdId, Field<String> pSlsClsCd, Field<String> pCurrency, Field<String> pIncSupBud, Field<String> pAccByImpCat, Field<String> pRegPrcOffr, Field<? extends Number> pMinOffset, Field<? extends Number> pMaxOffset, Field<String> pSlsAid, Field<String> pCampaignSls) {
		FGetDataPy f = new FGetDataPy();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPCatgryId(pCatgryId);
		f.setPBrndId(pBrndId);
		f.setPPerdId(pPerdId);
		f.setPSlsClsCd(pSlsClsCd);
		f.setPCurrency(pCurrency);
		f.setPIncSupBud(pIncSupBud);
		f.setPAccByImpCat(pAccByImpCat);
		f.setPRegPrcOffr(pRegPrcOffr);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPSlsAid(pSlsAid);
		f.setPCampaignSls(pCampaignSls);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_CNCPT_SUBBRAND.F_GET_XCHANGE_RATE</code>
	 */
	public static BigDecimal fGetXchangeRate(Configuration configuration, Number pMrktId, Number pPerdId) {
		FGetXchangeRate f = new FGetXchangeRate();
		f.setPMrktId(pMrktId);
		f.setPPerdId(pPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_CNCPT_SUBBRAND.F_GET_XCHANGE_RATE</code> as a field.
	 */
	public static Field<BigDecimal> fGetXchangeRate(Number pMrktId, Number pPerdId) {
		FGetXchangeRate f = new FGetXchangeRate();
		f.setPMrktId(pMrktId);
		f.setPPerdId(pPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_CNCPT_SUBBRAND.F_GET_XCHANGE_RATE</code> as a field.
	 */
	public static Field<BigDecimal> fGetXchangeRate(Field<? extends Number> pMrktId, Field<? extends Number> pPerdId) {
		FGetXchangeRate f = new FGetXchangeRate();
		f.setPMrktId(pMrktId);
		f.setPPerdId(pPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_CNCPT_SUBBRAND.GET_OFFSETS_STRING</code>
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
	 * Get <code>WETRN.REP_CNCPT_SUBBRAND.GET_OFFSETS_STRING</code> as a field.
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
	 * Get <code>WETRN.REP_CNCPT_SUBBRAND.GET_OFFSETS_STRING</code> as a field.
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
	 * No further instances allowed
	 */
	private RepCncptSubbrand() {
		super("REP_CNCPT_SUBBRAND", Wetrn.WETRN);
	}
}
