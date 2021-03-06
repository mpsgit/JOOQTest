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
import org.jooq.packages.cpy_offr.CopyOffr;
import org.jooq.packages.cpy_offr.CpyOffrScrn;
import org.jooq.packages.cpy_offr.FGetKeyValsForUpdate;
import org.jooq.packages.cpy_offr.FGetParms;
import org.jooq.packages.cpy_offr.GetTgrtMrktDtl;
import org.jooq.packages.cpy_offr.InsertBtchTaskLog;
import org.jooq.packages.cpy_offr.IsMapgExists;
import org.jooq.packages.cpy_offr.PAddAddRegPrcItems;
import org.jooq.packages.cpy_offr.Parms;
import org.jooq.packages.cpy_offr.SetPricingFlags;
import org.jooq.packages.cpy_offr.UpdateTrgtUnits;
import org.jooq.udt.records.TblMpsParmRecord;


/**
 * Convenience access to all stored procedures and functions in CPY_OFFR
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CpyOffr extends PackageImpl {

	private static final long serialVersionUID = -535358794;

	/**
	 * The reference instance of <code>WETRN.CPY_OFFR</code>
	 */
	public static final CpyOffr CPY_OFFR = new CpyOffr();

	/**
	 * Call <code>WETRN.CPY_OFFR.COPY_OFFR</code>
	 */
	public static BigDecimal copyOffr(Configuration configuration, Number pParmId, String pUserNm, Number pTaskId) {
		CopyOffr p = new CopyOffr();
		p.setPParmId(pParmId);
		p.setPUserNm(pUserNm);
		p.setPTaskId(pTaskId);

		p.execute(configuration);
		return p.getPStatus();
	}

	/**
	 * Call <code>WETRN.CPY_OFFR.CPY_OFFR_SCRN</code>
	 */
	public static BigDecimal cpyOffrScrn(Configuration configuration, TblMpsParmRecord cpyOffrParms, String pUserNm) {
		CpyOffrScrn p = new CpyOffrScrn();
		p.setCpyOffrParms(cpyOffrParms);
		p.setPUserNm(pUserNm);

		p.execute(configuration);
		return p.getPParmId();
	}

	/**
	 * Call <code>WETRN.CPY_OFFR.F_GET_KEY_VALS_FOR_UPDATE</code>
	 */
	public static Object fGetKeyValsForUpdate(Configuration configuration) {
		FGetKeyValsForUpdate f = new FGetKeyValsForUpdate();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.CPY_OFFR.F_GET_KEY_VALS_FOR_UPDATE</code> as a field.
	 */
	public static Field<Object> fGetKeyValsForUpdate() {
		FGetKeyValsForUpdate f = new FGetKeyValsForUpdate();

		return f.asField();
	}

	/**
	 * Call <code>WETRN.CPY_OFFR.F_GET_PARMS</code>
	 */
	public static Object fGetParms(Configuration configuration, Number pParmId) {
		FGetParms f = new FGetParms();
		f.setPParmId(pParmId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.CPY_OFFR.F_GET_PARMS</code> as a field.
	 */
	public static Field<Object> fGetParms(Number pParmId) {
		FGetParms f = new FGetParms();
		f.setPParmId(pParmId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.CPY_OFFR.F_GET_PARMS</code> as a field.
	 */
	public static Field<Object> fGetParms(Field<? extends Number> pParmId) {
		FGetParms f = new FGetParms();
		f.setPParmId(pParmId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.CPY_OFFR.GET_TGRT_MRKT_DTL</code>
	 */
	public static Object getTgrtMrktDtl(Configuration configuration, Number pClsrtId, Number pSrceMrktId, String pSrceVehId, Number pSrceVerId, Number pSrcePerdId, String pUserNm) {
		GetTgrtMrktDtl f = new GetTgrtMrktDtl();
		f.setPClsrtId(pClsrtId);
		f.setPSrceMrktId(pSrceMrktId);
		f.setPSrceVehId(pSrceVehId);
		f.setPSrceVerId(pSrceVerId);
		f.setPSrcePerdId(pSrcePerdId);
		f.setPUserNm(pUserNm);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.CPY_OFFR.GET_TGRT_MRKT_DTL</code> as a field.
	 */
	public static Field<Object> getTgrtMrktDtl(Number pClsrtId, Number pSrceMrktId, String pSrceVehId, Number pSrceVerId, Number pSrcePerdId, String pUserNm) {
		GetTgrtMrktDtl f = new GetTgrtMrktDtl();
		f.setPClsrtId(pClsrtId);
		f.setPSrceMrktId(pSrceMrktId);
		f.setPSrceVehId(pSrceVehId);
		f.setPSrceVerId(pSrceVerId);
		f.setPSrcePerdId(pSrcePerdId);
		f.setPUserNm(pUserNm);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.CPY_OFFR.GET_TGRT_MRKT_DTL</code> as a field.
	 */
	public static Field<Object> getTgrtMrktDtl(Field<? extends Number> pClsrtId, Field<? extends Number> pSrceMrktId, Field<String> pSrceVehId, Field<? extends Number> pSrceVerId, Field<? extends Number> pSrcePerdId, Field<String> pUserNm) {
		GetTgrtMrktDtl f = new GetTgrtMrktDtl();
		f.setPClsrtId(pClsrtId);
		f.setPSrceMrktId(pSrceMrktId);
		f.setPSrceVehId(pSrceVehId);
		f.setPSrceVerId(pSrceVerId);
		f.setPSrcePerdId(pSrcePerdId);
		f.setPUserNm(pUserNm);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.CPY_OFFR.INSERT_BTCH_TASK_LOG</code>
	 */
	public static void insertBtchTaskLog(Configuration configuration, Number pBtchTaskId, Number pBtchTaskLogTypId, Number pBtchTaskKey, String pBtchErrLvlTxt, String pBtchLogTxt, Integer pBoostedQty, Integer pNotBoostedQty, Number pTrgtMrktId) {
		InsertBtchTaskLog p = new InsertBtchTaskLog();
		p.setPBtchTaskId(pBtchTaskId);
		p.setPBtchTaskLogTypId(pBtchTaskLogTypId);
		p.setPBtchTaskKey(pBtchTaskKey);
		p.setPBtchErrLvlTxt(pBtchErrLvlTxt);
		p.setPBtchLogTxt(pBtchLogTxt);
		p.setPBoostedQty(pBoostedQty);
		p.setPNotBoostedQty(pNotBoostedQty);
		p.setPTrgtMrktId(pTrgtMrktId);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.CPY_OFFR.IS_MAPG_EXISTS</code>
	 */
	public static String isMapgExists(Configuration configuration, Number pSrcMrktId, Number pSrcOffrPerdId, Number pTrgtMrktId, Number pTrgtOffrPerdId) {
		IsMapgExists f = new IsMapgExists();
		f.setPSrcMrktId(pSrcMrktId);
		f.setPSrcOffrPerdId(pSrcOffrPerdId);
		f.setPTrgtMrktId(pTrgtMrktId);
		f.setPTrgtOffrPerdId(pTrgtOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.CPY_OFFR.IS_MAPG_EXISTS</code> as a field.
	 */
	public static Field<String> isMapgExists(Number pSrcMrktId, Number pSrcOffrPerdId, Number pTrgtMrktId, Number pTrgtOffrPerdId) {
		IsMapgExists f = new IsMapgExists();
		f.setPSrcMrktId(pSrcMrktId);
		f.setPSrcOffrPerdId(pSrcOffrPerdId);
		f.setPTrgtMrktId(pTrgtMrktId);
		f.setPTrgtOffrPerdId(pTrgtOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.CPY_OFFR.IS_MAPG_EXISTS</code> as a field.
	 */
	public static Field<String> isMapgExists(Field<? extends Number> pSrcMrktId, Field<? extends Number> pSrcOffrPerdId, Field<? extends Number> pTrgtMrktId, Field<? extends Number> pTrgtOffrPerdId) {
		IsMapgExists f = new IsMapgExists();
		f.setPSrcMrktId(pSrcMrktId);
		f.setPSrcOffrPerdId(pSrcOffrPerdId);
		f.setPTrgtMrktId(pTrgtMrktId);
		f.setPTrgtOffrPerdId(pTrgtOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.CPY_OFFR.PARMS</code>
	 */
	public static BigDecimal parms(Configuration configuration, TblMpsParmRecord cpyOffrParms, String pUserNm) {
		Parms p = new Parms();
		p.setCpyOffrParms(cpyOffrParms);
		p.setPUserNm(pUserNm);

		p.execute(configuration);
		return p.getParmId();
	}

	/**
	 * Call <code>WETRN.CPY_OFFR.P_ADD_ADD_REG_PRC_ITEMS</code>
	 */
	public static void pAddAddRegPrcItems(Configuration configuration, Number pMrktId, Number pOffrPerdId) {
		PAddAddRegPrcItems p = new PAddAddRegPrcItems();
		p.setPMrktId(pMrktId);
		p.setPOffrPerdId(pOffrPerdId);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.CPY_OFFR.SET_PRICING_FLAGS</code>
	 */
	public static SetPricingFlags setPricingFlags(Configuration configuration, Number pMrktId, Number pOffrPerdId, String pPrcEnabled, String pTrgtStrtgyInd) {
		SetPricingFlags p = new SetPricingFlags();
		p.setPMrktId(pMrktId);
		p.setPOffrPerdId(pOffrPerdId);
		p.setPPrcEnabled(pPrcEnabled);
		p.setPTrgtStrtgyInd(pTrgtStrtgyInd);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call <code>WETRN.CPY_OFFR.UPDATE_TRGT_UNITS</code>
	 */
	public static BigDecimal updateTrgtUnits(Configuration configuration, Number pParmId, Number pSrceMrktId, Number pSrceVehId, Number pSrceOffrPerdId, Number pSrceVerId, Number pTrgtMrktId, Number pTrgtVehId, Number pTrgtOffrPerdId, Number pTrgtVerId, Number pUnitCalcTypId, String pFbInd, Number pStatus, String pVehId, String pFbXcludSlsClsCd) {
		UpdateTrgtUnits p = new UpdateTrgtUnits();
		p.setPParmId(pParmId);
		p.setPSrceMrktId(pSrceMrktId);
		p.setPSrceVehId(pSrceVehId);
		p.setPSrceOffrPerdId(pSrceOffrPerdId);
		p.setPSrceVerId(pSrceVerId);
		p.setPTrgtMrktId(pTrgtMrktId);
		p.setPTrgtVehId(pTrgtVehId);
		p.setPTrgtOffrPerdId(pTrgtOffrPerdId);
		p.setPTrgtVerId(pTrgtVerId);
		p.setPUnitCalcTypId(pUnitCalcTypId);
		p.setPFbInd(pFbInd);
		p.setPStatus(pStatus);
		p.setPVehId(pVehId);
		p.setPFbXcludSlsClsCd(pFbXcludSlsClsCd);

		p.execute(configuration);
		return p.getPStatus();
	}

	/**
	 * No further instances allowed
	 */
	private CpyOffr() {
		super("CPY_OFFR", Wetrn.WETRN);
	}
}
