/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.app_cpy_offr_trgt_prfls_info.GetSkuData;
import org.jooq.packages.app_cpy_offr_trgt_prfls_info.GetSkuInfo;
import org.jooq.packages.app_cpy_offr_trgt_prfls_info.GetSrcePrfls;
import org.jooq.packages.app_cpy_offr_trgt_prfls_info.InitTrgtSkuInfo;
import org.jooq.udt.records.TrecCpyOffrSkuDataRecord;
import org.jooq.udt.records.TtblCpyOffrSkuDataRecord;


/**
 * Convenience access to all stored procedures and functions in APP_CPY_OFFR_TRGT_PRFLS_INFO
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppCpyOffrTrgtPrflsInfo extends PackageImpl {

	private static final long serialVersionUID = 459473782;

	/**
	 * The reference instance of <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO</code>
	 */
	public static final AppCpyOffrTrgtPrflsInfo APP_CPY_OFFR_TRGT_PRFLS_INFO = new AppCpyOffrTrgtPrflsInfo();

	/**
	 * Call <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO.GET_SKU_DATA</code>
	 */
	public static TtblCpyOffrSkuDataRecord getSkuData(Configuration configuration, Number pPrflCd) {
		GetSkuData f = new GetSkuData();
		f.setPPrflCd(pPrflCd);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO.GET_SKU_DATA</code> as a field.
	 */
	public static Field<TtblCpyOffrSkuDataRecord> getSkuData(Number pPrflCd) {
		GetSkuData f = new GetSkuData();
		f.setPPrflCd(pPrflCd);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO.GET_SKU_DATA</code> as a field.
	 */
	public static Field<TtblCpyOffrSkuDataRecord> getSkuData(Field<? extends Number> pPrflCd) {
		GetSkuData f = new GetSkuData();
		f.setPPrflCd(pPrflCd);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO.GET_SKU_INFO</code>
	 */
	public static TrecCpyOffrSkuDataRecord getSkuInfo(Configuration configuration, Number pPrflCd, Number pSkuId) {
		GetSkuInfo f = new GetSkuInfo();
		f.setPPrflCd(pPrflCd);
		f.setPSkuId(pSkuId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO.GET_SKU_INFO</code> as a field.
	 */
	public static Field<TrecCpyOffrSkuDataRecord> getSkuInfo(Number pPrflCd, Number pSkuId) {
		GetSkuInfo f = new GetSkuInfo();
		f.setPPrflCd(pPrflCd);
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO.GET_SKU_INFO</code> as a field.
	 */
	public static Field<TrecCpyOffrSkuDataRecord> getSkuInfo(Field<? extends Number> pPrflCd, Field<? extends Number> pSkuId) {
		GetSkuInfo f = new GetSkuInfo();
		f.setPPrflCd(pPrflCd);
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO.GET_SRCE_PRFLS</code>
	 */
	public static Object getSrcePrfls(Configuration configuration, Number pMrktId, Number pOffrPerdId) {
		GetSrcePrfls f = new GetSrcePrfls();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO.GET_SRCE_PRFLS</code> as a field.
	 */
	public static Field<Object> getSrcePrfls(Number pMrktId, Number pOffrPerdId) {
		GetSrcePrfls f = new GetSrcePrfls();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO.GET_SRCE_PRFLS</code> as a field.
	 */
	public static Field<Object> getSrcePrfls(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId) {
		GetSrcePrfls f = new GetSrcePrfls();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_CPY_OFFR_TRGT_PRFLS_INFO.INIT_TRGT_SKU_INFO</code>
	 */
	public static void initTrgtSkuInfo(Configuration configuration, Number pSrceMrktId, Number pSrcePerdId, Number pTrgtMrktId, Number pTrgtPerdId) {
		InitTrgtSkuInfo p = new InitTrgtSkuInfo();
		p.setPSrceMrktId(pSrceMrktId);
		p.setPSrcePerdId(pSrcePerdId);
		p.setPTrgtMrktId(pTrgtMrktId);
		p.setPTrgtPerdId(pTrgtPerdId);

		p.execute(configuration);
	}

	/**
	 * No further instances allowed
	 */
	private AppCpyOffrTrgtPrflsInfo() {
		super("APP_CPY_OFFR_TRGT_PRFLS_INFO", Wetrn.WETRN);
	}
}