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
import org.jooq.packages.trnd_aloctn_new.AutoProcs;
import org.jooq.packages.trnd_aloctn_new.ClcCatgrySls;
import org.jooq.packages.trnd_aloctn_new.ClcCatgryTrendSls;
import org.jooq.packages.trnd_aloctn_new.GetCtgrySls;
import org.jooq.packages.trnd_aloctn_new.ProcsMultmtch;
import org.jooq.packages.trnd_aloctn_new.SHistCtgryCamp;
import org.jooq.packages.trnd_aloctn_new.SavTrendSls;
import org.jooq.packages.trnd_aloctn_new.TrndAloctnJob;
import org.jooq.packages.trnd_aloctn_new.UIDms;


/**
 * Convenience access to all stored procedures and functions in TRND_ALOCTN_NEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TrndAloctnNew extends PackageImpl {

	private static final long serialVersionUID = -587125422;

	/**
	 * The reference instance of <code>WETRN.TRND_ALOCTN_NEW</code>
	 */
	public static final TrndAloctnNew TRND_ALOCTN_NEW = new TrndAloctnNew();

	/**
	 * Call <code>WETRN.TRND_ALOCTN_NEW.AUTO_PROCS</code>
	 */
	public static void autoProcs(Configuration configuration, Number pMrktId, Number pSlsPerdId, String pUserNm) {
		AutoProcs p = new AutoProcs();
		p.setPMrktId(pMrktId);
		p.setPSlsPerdId(pSlsPerdId);
		p.setPUserNm(pUserNm);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.TRND_ALOCTN_NEW.CLC_CATGRY_SLS</code>
	 */
	public static void clcCatgrySls(Configuration configuration, Number pMrktId, Number pSlsPerdId) {
		ClcCatgrySls p = new ClcCatgrySls();
		p.setPMrktId(pMrktId);
		p.setPSlsPerdId(pSlsPerdId);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.TRND_ALOCTN_NEW.CLC_CATGRY_TREND_SLS</code>
	 */
	public static void clcCatgryTrendSls(Configuration configuration, Number pMrktId, Number pSlsPerdId) {
		ClcCatgryTrendSls p = new ClcCatgryTrendSls();
		p.setPMrktId(pMrktId);
		p.setPSlsPerdId(pSlsPerdId);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.TRND_ALOCTN_NEW.GET_CTGRY_SLS</code>
	 */
	public static Object getCtgrySls(Configuration configuration, Number pMrktId, Number pSlsPerdId, Number pDayNum) {
		GetCtgrySls f = new GetCtgrySls();
		f.setPMrktId(pMrktId);
		f.setPSlsPerdId(pSlsPerdId);
		f.setPDayNum(pDayNum);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.TRND_ALOCTN_NEW.GET_CTGRY_SLS</code> as a field.
	 */
	public static Field<Object> getCtgrySls(Number pMrktId, Number pSlsPerdId, Number pDayNum) {
		GetCtgrySls f = new GetCtgrySls();
		f.setPMrktId(pMrktId);
		f.setPSlsPerdId(pSlsPerdId);
		f.setPDayNum(pDayNum);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.TRND_ALOCTN_NEW.GET_CTGRY_SLS</code> as a field.
	 */
	public static Field<Object> getCtgrySls(Field<? extends Number> pMrktId, Field<? extends Number> pSlsPerdId, Field<? extends Number> pDayNum) {
		GetCtgrySls f = new GetCtgrySls();
		f.setPMrktId(pMrktId);
		f.setPSlsPerdId(pSlsPerdId);
		f.setPDayNum(pDayNum);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.TRND_ALOCTN_NEW.PROCS_MULTMTCH</code>
	 */
	public static void procsMultmtch(Configuration configuration, Number pMrktId, Number pSlsPerdId, Number pSlsTypId) {
		ProcsMultmtch p = new ProcsMultmtch();
		p.setPMrktId(pMrktId);
		p.setPSlsPerdId(pSlsPerdId);
		p.setPSlsTypId(pSlsTypId);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.TRND_ALOCTN_NEW.SAV_TREND_SLS</code>
	 */
	public static void savTrendSls(Configuration configuration, Number pMrktId, Number pSlsPerdId, Number pSlsTypeId, Number pSrcSlsTypeId, Number pVerId, Number pDayNum, Number pTrendsetterPct, Number pOnschedulePct, Number pOffschedulePct) {
		SavTrendSls p = new SavTrendSls();
		p.setPMrktId(pMrktId);
		p.setPSlsPerdId(pSlsPerdId);
		p.setPSlsTypeId(pSlsTypeId);
		p.setPSrcSlsTypeId(pSrcSlsTypeId);
		p.setPVerId(pVerId);
		p.setPDayNum(pDayNum);
		p.setPTrendsetterPct(pTrendsetterPct);
		p.setPOnschedulePct(pOnschedulePct);
		p.setPOffschedulePct(pOffschedulePct);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.TRND_ALOCTN_NEW.S_HIST_CTGRY_CAMP</code>
	 */
	public static void sHistCtgryCamp(Configuration configuration, Number pMrktId, Number pSlsPerdId, Number pCtgryId, Number pRefSlsPerdId, Number pRefOffrPerdId, Number pDayNum, Number pPctOvr, Number pSelected) {
		SHistCtgryCamp p = new SHistCtgryCamp();
		p.setPMrktId(pMrktId);
		p.setPSlsPerdId(pSlsPerdId);
		p.setPCtgryId(pCtgryId);
		p.setPRefSlsPerdId(pRefSlsPerdId);
		p.setPRefOffrPerdId(pRefOffrPerdId);
		p.setPDayNum(pDayNum);
		p.setPPctOvr(pPctOvr);
		p.setPSelected(pSelected);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.TRND_ALOCTN_NEW.TRND_ALOCTN_JOB</code>
	 */
	public static void trndAloctnJob(Configuration configuration) {
		TrndAloctnJob p = new TrndAloctnJob();

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.TRND_ALOCTN_NEW.U_I_DMS</code>
	 */
	public static void uIDms(Configuration configuration, Number pMrktId, Number pSlsPerdId, Number pOffrPerdId, Number pOffrSkuLineId, Number pSlsTypId, Number pVehId, Integer pUnitQty, BigDecimal pComsnAmt, BigDecimal pTaxAmt, BigDecimal pCostAmt) {
		UIDms p = new UIDms();
		p.setPMrktId(pMrktId);
		p.setPSlsPerdId(pSlsPerdId);
		p.setPOffrPerdId(pOffrPerdId);
		p.setPOffrSkuLineId(pOffrSkuLineId);
		p.setPSlsTypId(pSlsTypId);
		p.setPVehId(pVehId);
		p.setPUnitQty(pUnitQty);
		p.setPComsnAmt(pComsnAmt);
		p.setPTaxAmt(pTaxAmt);
		p.setPCostAmt(pCostAmt);

		p.execute(configuration);
	}

	/**
	 * No further instances allowed
	 */
	private TrndAloctnNew() {
		super("TRND_ALOCTN_NEW", Wetrn.WETRN);
	}
}