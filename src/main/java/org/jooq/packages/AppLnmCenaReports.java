/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.app_lnm_cena_reports.GetBilngLineNrData;
import org.jooq.packages.app_lnm_cena_reports.GetBilngLineNrUsage;
import org.jooq.packages.app_lnm_cena_reports.GetBimultimarketReport;
import org.jooq.packages.app_lnm_cena_reports.GetBlmultimarketReport;
import org.jooq.packages.app_lnm_cena_reports.GetBrchrLineNrData;
import org.jooq.packages.app_lnm_cena_reports.GetBrchrLineNrUsage;
import org.jooq.packages.app_lnm_cena_reports.GetMrktInfo;
import org.jooq.packages.app_lnm_cena_reports.InitMrktInfo;


/**
 * Convenience access to all stored procedures and functions in APP_LNM_CENA_REPORTS
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppLnmCenaReports extends PackageImpl {

	private static final long serialVersionUID = 131936548;

	/**
	 * The reference instance of <code>WETRN.APP_LNM_CENA_REPORTS</code>
	 */
	public static final AppLnmCenaReports APP_LNM_CENA_REPORTS = new AppLnmCenaReports();

	/**
	 * Call <code>WETRN.APP_LNM_CENA_REPORTS.GET_BILNG_LINE_NR_DATA</code>
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
	 * Get <code>WETRN.APP_LNM_CENA_REPORTS.GET_BILNG_LINE_NR_DATA</code> as a field.
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
	 * Get <code>WETRN.APP_LNM_CENA_REPORTS.GET_BILNG_LINE_NR_DATA</code> as a field.
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
	 * Call <code>WETRN.APP_LNM_CENA_REPORTS.GET_BILNG_LINE_NR_USAGE</code>
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
	 * Get <code>WETRN.APP_LNM_CENA_REPORTS.GET_BILNG_LINE_NR_USAGE</code> as a field.
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
	 * Get <code>WETRN.APP_LNM_CENA_REPORTS.GET_BILNG_LINE_NR_USAGE</code> as a field.
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
	 * Call <code>WETRN.APP_LNM_CENA_REPORTS.GET_BIMULTIMARKET_REPORT</code>
	 */
	public static Object getBimultimarketReport(Configuration configuration, String pMrktIdList, Number pCalMrkt, Number pStartPeriodId, Number pEndPeriodId, String pVehIdList) {
		GetBimultimarketReport f = new GetBimultimarketReport();
		f.setPMrktIdList(pMrktIdList);
		f.setPCalMrkt(pCalMrkt);
		f.setPStartPeriodId(pStartPeriodId);
		f.setPEndPeriodId(pEndPeriodId);
		f.setPVehIdList(pVehIdList);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_CENA_REPORTS.GET_BIMULTIMARKET_REPORT</code> as a field.
	 */
	public static Field<Object> getBimultimarketReport(String pMrktIdList, Number pCalMrkt, Number pStartPeriodId, Number pEndPeriodId, String pVehIdList) {
		GetBimultimarketReport f = new GetBimultimarketReport();
		f.setPMrktIdList(pMrktIdList);
		f.setPCalMrkt(pCalMrkt);
		f.setPStartPeriodId(pStartPeriodId);
		f.setPEndPeriodId(pEndPeriodId);
		f.setPVehIdList(pVehIdList);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_CENA_REPORTS.GET_BIMULTIMARKET_REPORT</code> as a field.
	 */
	public static Field<Object> getBimultimarketReport(Field<String> pMrktIdList, Field<? extends Number> pCalMrkt, Field<? extends Number> pStartPeriodId, Field<? extends Number> pEndPeriodId, Field<String> pVehIdList) {
		GetBimultimarketReport f = new GetBimultimarketReport();
		f.setPMrktIdList(pMrktIdList);
		f.setPCalMrkt(pCalMrkt);
		f.setPStartPeriodId(pStartPeriodId);
		f.setPEndPeriodId(pEndPeriodId);
		f.setPVehIdList(pVehIdList);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_CENA_REPORTS.GET_BLMULTIMARKET_REPORT</code>
	 */
	public static Object getBlmultimarketReport(Configuration configuration, String pMrktIdList, Number pCalMrkt, Number pStartPeriodId, Number pEndPeriodId, String pVehIdList) {
		GetBlmultimarketReport f = new GetBlmultimarketReport();
		f.setPMrktIdList(pMrktIdList);
		f.setPCalMrkt(pCalMrkt);
		f.setPStartPeriodId(pStartPeriodId);
		f.setPEndPeriodId(pEndPeriodId);
		f.setPVehIdList(pVehIdList);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_CENA_REPORTS.GET_BLMULTIMARKET_REPORT</code> as a field.
	 */
	public static Field<Object> getBlmultimarketReport(String pMrktIdList, Number pCalMrkt, Number pStartPeriodId, Number pEndPeriodId, String pVehIdList) {
		GetBlmultimarketReport f = new GetBlmultimarketReport();
		f.setPMrktIdList(pMrktIdList);
		f.setPCalMrkt(pCalMrkt);
		f.setPStartPeriodId(pStartPeriodId);
		f.setPEndPeriodId(pEndPeriodId);
		f.setPVehIdList(pVehIdList);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_CENA_REPORTS.GET_BLMULTIMARKET_REPORT</code> as a field.
	 */
	public static Field<Object> getBlmultimarketReport(Field<String> pMrktIdList, Field<? extends Number> pCalMrkt, Field<? extends Number> pStartPeriodId, Field<? extends Number> pEndPeriodId, Field<String> pVehIdList) {
		GetBlmultimarketReport f = new GetBlmultimarketReport();
		f.setPMrktIdList(pMrktIdList);
		f.setPCalMrkt(pCalMrkt);
		f.setPStartPeriodId(pStartPeriodId);
		f.setPEndPeriodId(pEndPeriodId);
		f.setPVehIdList(pVehIdList);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_CENA_REPORTS.GET_BRCHR_LINE_NR_DATA</code>
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
	 * Get <code>WETRN.APP_LNM_CENA_REPORTS.GET_BRCHR_LINE_NR_DATA</code> as a field.
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
	 * Get <code>WETRN.APP_LNM_CENA_REPORTS.GET_BRCHR_LINE_NR_DATA</code> as a field.
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
	 * Call <code>WETRN.APP_LNM_CENA_REPORTS.GET_BRCHR_LINE_NR_USAGE</code>
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
	 * Get <code>WETRN.APP_LNM_CENA_REPORTS.GET_BRCHR_LINE_NR_USAGE</code> as a field.
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
	 * Get <code>WETRN.APP_LNM_CENA_REPORTS.GET_BRCHR_LINE_NR_USAGE</code> as a field.
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
	 * Call <code>WETRN.APP_LNM_CENA_REPORTS.GET_MRKT_INFO</code>
	 */
	public static Object getMrktInfo(Configuration configuration) {
		GetMrktInfo f = new GetMrktInfo();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_CENA_REPORTS.GET_MRKT_INFO</code> as a field.
	 */
	public static Field<Object> getMrktInfo() {
		GetMrktInfo f = new GetMrktInfo();

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_CENA_REPORTS.INIT_MRKT_INFO</code>
	 */
	public static void initMrktInfo(Configuration configuration, Number pMrktId, Number pStartPerdId, Number pEndPerdId, String pMrktIdList) {
		InitMrktInfo p = new InitMrktInfo();
		p.setPMrktId(pMrktId);
		p.setPStartPerdId(pStartPerdId);
		p.setPEndPerdId(pEndPerdId);
		p.setPMrktIdList(pMrktIdList);

		p.execute(configuration);
	}

	/**
	 * No further instances allowed
	 */
	private AppLnmCenaReports() {
		super("APP_LNM_CENA_REPORTS", Wetrn.WETRN);
	}
}
