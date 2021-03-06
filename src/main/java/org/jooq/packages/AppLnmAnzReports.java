/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.app_lnm_anz_reports.GetBilngLineNrData;
import org.jooq.packages.app_lnm_anz_reports.GetBilngLineNrUsage;
import org.jooq.packages.app_lnm_anz_reports.GetBimultimarketReport;
import org.jooq.packages.app_lnm_anz_reports.GetBlmultimarketReport;
import org.jooq.packages.app_lnm_anz_reports.GetBrchrLineNrData;
import org.jooq.packages.app_lnm_anz_reports.GetBrchrLineNrUsage;


/**
 * Convenience access to all stored procedures and functions in APP_LNM_ANZ_REPORTS
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppLnmAnzReports extends PackageImpl {

	private static final long serialVersionUID = 1254153951;

	/**
	 * The reference instance of <code>WETRN.APP_LNM_ANZ_REPORTS</code>
	 */
	public static final AppLnmAnzReports APP_LNM_ANZ_REPORTS = new AppLnmAnzReports();

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BILNG_LINE_NR_DATA</code>
	 */
	public static Object getBilngLineNrData(Configuration configuration, Number pClstrId, Number pLeadMrktId, String pLineNr, Number pRefOffrPerdId) {
		GetBilngLineNrData f = new GetBilngLineNrData();
		f.setPClstrId(pClstrId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPRefOffrPerdId(pRefOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BILNG_LINE_NR_DATA</code> as a field.
	 */
	public static Field<Object> getBilngLineNrData(Number pClstrId, Number pLeadMrktId, String pLineNr, Number pRefOffrPerdId) {
		GetBilngLineNrData f = new GetBilngLineNrData();
		f.setPClstrId(pClstrId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPRefOffrPerdId(pRefOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BILNG_LINE_NR_DATA</code> as a field.
	 */
	public static Field<Object> getBilngLineNrData(Field<? extends Number> pClstrId, Field<? extends Number> pLeadMrktId, Field<String> pLineNr, Field<? extends Number> pRefOffrPerdId) {
		GetBilngLineNrData f = new GetBilngLineNrData();
		f.setPClstrId(pClstrId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPRefOffrPerdId(pRefOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BILNG_LINE_NR_USAGE</code>
	 */
	public static Object getBilngLineNrUsage(Configuration configuration, Number pClstrId, Number pLeadMrktId, String pLineNr, Number pMinOffrPerdId, Number pMaxOffrPerdId) {
		GetBilngLineNrUsage f = new GetBilngLineNrUsage();
		f.setPClstrId(pClstrId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPMinOffrPerdId(pMinOffrPerdId);
		f.setPMaxOffrPerdId(pMaxOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BILNG_LINE_NR_USAGE</code> as a field.
	 */
	public static Field<Object> getBilngLineNrUsage(Number pClstrId, Number pLeadMrktId, String pLineNr, Number pMinOffrPerdId, Number pMaxOffrPerdId) {
		GetBilngLineNrUsage f = new GetBilngLineNrUsage();
		f.setPClstrId(pClstrId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPMinOffrPerdId(pMinOffrPerdId);
		f.setPMaxOffrPerdId(pMaxOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BILNG_LINE_NR_USAGE</code> as a field.
	 */
	public static Field<Object> getBilngLineNrUsage(Field<? extends Number> pClstrId, Field<? extends Number> pLeadMrktId, Field<String> pLineNr, Field<? extends Number> pMinOffrPerdId, Field<? extends Number> pMaxOffrPerdId) {
		GetBilngLineNrUsage f = new GetBilngLineNrUsage();
		f.setPClstrId(pClstrId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPMinOffrPerdId(pMinOffrPerdId);
		f.setPMaxOffrPerdId(pMaxOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BIMULTIMARKET_REPORT</code>
	 */
	public static Object getBimultimarketReport(Configuration configuration, String pMrktIdList, Number pStartPeriodId, Number pEndPeriodId, String pVehIdList) {
		GetBimultimarketReport f = new GetBimultimarketReport();
		f.setPMrktIdList(pMrktIdList);
		f.setPStartPeriodId(pStartPeriodId);
		f.setPEndPeriodId(pEndPeriodId);
		f.setPVehIdList(pVehIdList);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BIMULTIMARKET_REPORT</code> as a field.
	 */
	public static Field<Object> getBimultimarketReport(String pMrktIdList, Number pStartPeriodId, Number pEndPeriodId, String pVehIdList) {
		GetBimultimarketReport f = new GetBimultimarketReport();
		f.setPMrktIdList(pMrktIdList);
		f.setPStartPeriodId(pStartPeriodId);
		f.setPEndPeriodId(pEndPeriodId);
		f.setPVehIdList(pVehIdList);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BIMULTIMARKET_REPORT</code> as a field.
	 */
	public static Field<Object> getBimultimarketReport(Field<String> pMrktIdList, Field<? extends Number> pStartPeriodId, Field<? extends Number> pEndPeriodId, Field<String> pVehIdList) {
		GetBimultimarketReport f = new GetBimultimarketReport();
		f.setPMrktIdList(pMrktIdList);
		f.setPStartPeriodId(pStartPeriodId);
		f.setPEndPeriodId(pEndPeriodId);
		f.setPVehIdList(pVehIdList);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BLMULTIMARKET_REPORT</code>
	 */
	public static Object getBlmultimarketReport(Configuration configuration, String pMrktIdList, Number pStartPeriodId, Number pEndPeriodId, String pVehIdList) {
		GetBlmultimarketReport f = new GetBlmultimarketReport();
		f.setPMrktIdList(pMrktIdList);
		f.setPStartPeriodId(pStartPeriodId);
		f.setPEndPeriodId(pEndPeriodId);
		f.setPVehIdList(pVehIdList);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BLMULTIMARKET_REPORT</code> as a field.
	 */
	public static Field<Object> getBlmultimarketReport(String pMrktIdList, Number pStartPeriodId, Number pEndPeriodId, String pVehIdList) {
		GetBlmultimarketReport f = new GetBlmultimarketReport();
		f.setPMrktIdList(pMrktIdList);
		f.setPStartPeriodId(pStartPeriodId);
		f.setPEndPeriodId(pEndPeriodId);
		f.setPVehIdList(pVehIdList);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BLMULTIMARKET_REPORT</code> as a field.
	 */
	public static Field<Object> getBlmultimarketReport(Field<String> pMrktIdList, Field<? extends Number> pStartPeriodId, Field<? extends Number> pEndPeriodId, Field<String> pVehIdList) {
		GetBlmultimarketReport f = new GetBlmultimarketReport();
		f.setPMrktIdList(pMrktIdList);
		f.setPStartPeriodId(pStartPeriodId);
		f.setPEndPeriodId(pEndPeriodId);
		f.setPVehIdList(pVehIdList);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BRCHR_LINE_NR_DATA</code>
	 */
	public static Object getBrchrLineNrData(Configuration configuration, Number pClstrId, Number pLeadMrktId, String pLineNr, Number pRefOffrPerdId) {
		GetBrchrLineNrData f = new GetBrchrLineNrData();
		f.setPClstrId(pClstrId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPRefOffrPerdId(pRefOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BRCHR_LINE_NR_DATA</code> as a field.
	 */
	public static Field<Object> getBrchrLineNrData(Number pClstrId, Number pLeadMrktId, String pLineNr, Number pRefOffrPerdId) {
		GetBrchrLineNrData f = new GetBrchrLineNrData();
		f.setPClstrId(pClstrId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPRefOffrPerdId(pRefOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BRCHR_LINE_NR_DATA</code> as a field.
	 */
	public static Field<Object> getBrchrLineNrData(Field<? extends Number> pClstrId, Field<? extends Number> pLeadMrktId, Field<String> pLineNr, Field<? extends Number> pRefOffrPerdId) {
		GetBrchrLineNrData f = new GetBrchrLineNrData();
		f.setPClstrId(pClstrId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPRefOffrPerdId(pRefOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BRCHR_LINE_NR_USAGE</code>
	 */
	public static Object getBrchrLineNrUsage(Configuration configuration, Number pClstrId, Number pLeadMrktId, String pLineNr, Number pMinOffrPerdId, Number pMaxOffrPerdId) {
		GetBrchrLineNrUsage f = new GetBrchrLineNrUsage();
		f.setPClstrId(pClstrId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPMinOffrPerdId(pMinOffrPerdId);
		f.setPMaxOffrPerdId(pMaxOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BRCHR_LINE_NR_USAGE</code> as a field.
	 */
	public static Field<Object> getBrchrLineNrUsage(Number pClstrId, Number pLeadMrktId, String pLineNr, Number pMinOffrPerdId, Number pMaxOffrPerdId) {
		GetBrchrLineNrUsage f = new GetBrchrLineNrUsage();
		f.setPClstrId(pClstrId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPMinOffrPerdId(pMinOffrPerdId);
		f.setPMaxOffrPerdId(pMaxOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_ANZ_REPORTS.GET_BRCHR_LINE_NR_USAGE</code> as a field.
	 */
	public static Field<Object> getBrchrLineNrUsage(Field<? extends Number> pClstrId, Field<? extends Number> pLeadMrktId, Field<String> pLineNr, Field<? extends Number> pMinOffrPerdId, Field<? extends Number> pMaxOffrPerdId) {
		GetBrchrLineNrUsage f = new GetBrchrLineNrUsage();
		f.setPClstrId(pClstrId);
		f.setPLeadMrktId(pLeadMrktId);
		f.setPLineNr(pLineNr);
		f.setPMinOffrPerdId(pMinOffrPerdId);
		f.setPMaxOffrPerdId(pMaxOffrPerdId);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private AppLnmAnzReports() {
		super("APP_LNM_ANZ_REPORTS", Wetrn.WETRN);
	}
}
