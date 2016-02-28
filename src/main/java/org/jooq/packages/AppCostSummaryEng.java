/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.app_cost_summary_eng.FGetCostSummary;
import org.jooq.packages.app_cost_summary_eng.FGetCostSummaryHistory;


/**
 * Convenience access to all stored procedures and functions in APP_COST_SUMMARY_ENG
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppCostSummaryEng extends PackageImpl {

	private static final long serialVersionUID = -1191056364;

	/**
	 * The reference instance of <code>WETRN.APP_COST_SUMMARY_ENG</code>
	 */
	public static final AppCostSummaryEng APP_COST_SUMMARY_ENG = new AppCostSummaryEng();

	/**
	 * Call <code>WETRN.APP_COST_SUMMARY_ENG.F_GET_COST_SUMMARY</code>
	 */
	public static Object fGetCostSummary(Configuration configuration, Number pMrktId, String pVehId, Number pVerId, Number pMinRange, Number pMaxRange, Number pSlsPerdRngId, String pEnrgyChartPostnId, String pEnrgyChk) {
		FGetCostSummary f = new FGetCostSummary();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPMinRange(pMinRange);
		f.setPMaxRange(pMaxRange);
		f.setPSlsPerdRngId(pSlsPerdRngId);
		f.setPEnrgyChartPostnId(pEnrgyChartPostnId);
		f.setPEnrgyChk(pEnrgyChk);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_COST_SUMMARY_ENG.F_GET_COST_SUMMARY</code> as a field.
	 */
	public static Field<Object> fGetCostSummary(Number pMrktId, String pVehId, Number pVerId, Number pMinRange, Number pMaxRange, Number pSlsPerdRngId, String pEnrgyChartPostnId, String pEnrgyChk) {
		FGetCostSummary f = new FGetCostSummary();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPMinRange(pMinRange);
		f.setPMaxRange(pMaxRange);
		f.setPSlsPerdRngId(pSlsPerdRngId);
		f.setPEnrgyChartPostnId(pEnrgyChartPostnId);
		f.setPEnrgyChk(pEnrgyChk);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_COST_SUMMARY_ENG.F_GET_COST_SUMMARY</code> as a field.
	 */
	public static Field<Object> fGetCostSummary(Field<? extends Number> pMrktId, Field<String> pVehId, Field<? extends Number> pVerId, Field<? extends Number> pMinRange, Field<? extends Number> pMaxRange, Field<? extends Number> pSlsPerdRngId, Field<String> pEnrgyChartPostnId, Field<String> pEnrgyChk) {
		FGetCostSummary f = new FGetCostSummary();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPMinRange(pMinRange);
		f.setPMaxRange(pMaxRange);
		f.setPSlsPerdRngId(pSlsPerdRngId);
		f.setPEnrgyChartPostnId(pEnrgyChartPostnId);
		f.setPEnrgyChk(pEnrgyChk);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_COST_SUMMARY_ENG.F_GET_COST_SUMMARY_HISTORY</code>
	 */
	public static Object fGetCostSummaryHistory(Configuration configuration, Number pMrktId, String pVehId, Number pVerId, String pOfferPerId, Number pSlsPerdRngId, String pEnrgyChartPostnId, String pEnrgyChk) {
		FGetCostSummaryHistory f = new FGetCostSummaryHistory();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPOfferPerId(pOfferPerId);
		f.setPSlsPerdRngId(pSlsPerdRngId);
		f.setPEnrgyChartPostnId(pEnrgyChartPostnId);
		f.setPEnrgyChk(pEnrgyChk);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_COST_SUMMARY_ENG.F_GET_COST_SUMMARY_HISTORY</code> as a field.
	 */
	public static Field<Object> fGetCostSummaryHistory(Number pMrktId, String pVehId, Number pVerId, String pOfferPerId, Number pSlsPerdRngId, String pEnrgyChartPostnId, String pEnrgyChk) {
		FGetCostSummaryHistory f = new FGetCostSummaryHistory();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPOfferPerId(pOfferPerId);
		f.setPSlsPerdRngId(pSlsPerdRngId);
		f.setPEnrgyChartPostnId(pEnrgyChartPostnId);
		f.setPEnrgyChk(pEnrgyChk);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_COST_SUMMARY_ENG.F_GET_COST_SUMMARY_HISTORY</code> as a field.
	 */
	public static Field<Object> fGetCostSummaryHistory(Field<? extends Number> pMrktId, Field<String> pVehId, Field<? extends Number> pVerId, Field<String> pOfferPerId, Field<? extends Number> pSlsPerdRngId, Field<String> pEnrgyChartPostnId, Field<String> pEnrgyChk) {
		FGetCostSummaryHistory f = new FGetCostSummaryHistory();
		f.setPMrktId(pMrktId);
		f.setPVehId(pVehId);
		f.setPVerId(pVerId);
		f.setPOfferPerId(pOfferPerId);
		f.setPSlsPerdRngId(pSlsPerdRngId);
		f.setPEnrgyChartPostnId(pEnrgyChartPostnId);
		f.setPEnrgyChk(pEnrgyChk);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private AppCostSummaryEng() {
		super("APP_COST_SUMMARY_ENG", Wetrn.WETRN);
	}
}