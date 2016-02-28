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
import org.jooq.packages.pa_maps_pricing.GetBop;
import org.jooq.packages.pa_maps_pricing.GetGuardrailPriceLimits;
import org.jooq.packages.pa_maps_pricing.GetMinMaxPrice;
import org.jooq.packages.pa_maps_pricing.GetPricing;
import org.jooq.packages.pa_maps_pricing.SyncPrcPointStrategy;
import org.jooq.packages.pa_maps_pricing.UsePricing;


/**
 * Convenience access to all stored procedures and functions in PA_MAPS_PRICING
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaMapsPricing extends PackageImpl {

	private static final long serialVersionUID = -1229663126;

	/**
	 * The reference instance of <code>WETRN.PA_MAPS_PRICING</code>
	 */
	public static final PaMapsPricing PA_MAPS_PRICING = new PaMapsPricing();

	/**
	 * Call <code>WETRN.PA_MAPS_PRICING.GET_BOP</code>
	 */
	public static Object getBop(Configuration configuration, Number pMrktId, Integer pPrflCd, Number pStrtOffrPerdId, Number pEndOffrPerdId) {
		GetBop f = new GetBop();
		f.setPMrktId(pMrktId);
		f.setPPrflCd(pPrflCd);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_PRICING.GET_BOP</code> as a field.
	 */
	public static Field<Object> getBop(Number pMrktId, Integer pPrflCd, Number pStrtOffrPerdId, Number pEndOffrPerdId) {
		GetBop f = new GetBop();
		f.setPMrktId(pMrktId);
		f.setPPrflCd(pPrflCd);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_PRICING.GET_BOP</code> as a field.
	 */
	public static Field<Object> getBop(Field<? extends Number> pMrktId, Field<Integer> pPrflCd, Field<? extends Number> pStrtOffrPerdId, Field<? extends Number> pEndOffrPerdId) {
		GetBop f = new GetBop();
		f.setPMrktId(pMrktId);
		f.setPPrflCd(pPrflCd);
		f.setPStrtOffrPerdId(pStrtOffrPerdId);
		f.setPEndOffrPerdId(pEndOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.PA_MAPS_PRICING.GET_GUARDRAIL_PRICE_LIMITS</code>
	 */
	public static Object getGuardrailPriceLimits(Configuration configuration, Number pMrktId, Integer pPrflCd) {
		GetGuardrailPriceLimits f = new GetGuardrailPriceLimits();
		f.setPMrktId(pMrktId);
		f.setPPrflCd(pPrflCd);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_PRICING.GET_GUARDRAIL_PRICE_LIMITS</code> as a field.
	 */
	public static Field<Object> getGuardrailPriceLimits(Number pMrktId, Integer pPrflCd) {
		GetGuardrailPriceLimits f = new GetGuardrailPriceLimits();
		f.setPMrktId(pMrktId);
		f.setPPrflCd(pPrflCd);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_PRICING.GET_GUARDRAIL_PRICE_LIMITS</code> as a field.
	 */
	public static Field<Object> getGuardrailPriceLimits(Field<? extends Number> pMrktId, Field<Integer> pPrflCd) {
		GetGuardrailPriceLimits f = new GetGuardrailPriceLimits();
		f.setPMrktId(pMrktId);
		f.setPPrflCd(pPrflCd);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.PA_MAPS_PRICING.GET_MIN_MAX_PRICE</code>
	 */
	public static Object getMinMaxPrice(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pVehId, Integer pPrflCd, BigDecimal pRegPrcAmt, Number pPromtnId, String pMinOrMax) {
		GetMinMaxPrice f = new GetMinMaxPrice();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPVehId(pVehId);
		f.setPPrflCd(pPrflCd);
		f.setPRegPrcAmt(pRegPrcAmt);
		f.setPPromtnId(pPromtnId);
		f.setPMinOrMax(pMinOrMax);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_PRICING.GET_MIN_MAX_PRICE</code> as a field.
	 */
	public static Field<Object> getMinMaxPrice(Number pMrktId, Number pOffrPerdId, Number pVehId, Integer pPrflCd, BigDecimal pRegPrcAmt, Number pPromtnId, String pMinOrMax) {
		GetMinMaxPrice f = new GetMinMaxPrice();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPVehId(pVehId);
		f.setPPrflCd(pPrflCd);
		f.setPRegPrcAmt(pRegPrcAmt);
		f.setPPromtnId(pPromtnId);
		f.setPMinOrMax(pMinOrMax);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_PRICING.GET_MIN_MAX_PRICE</code> as a field.
	 */
	public static Field<Object> getMinMaxPrice(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<? extends Number> pVehId, Field<Integer> pPrflCd, Field<BigDecimal> pRegPrcAmt, Field<? extends Number> pPromtnId, Field<String> pMinOrMax) {
		GetMinMaxPrice f = new GetMinMaxPrice();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPVehId(pVehId);
		f.setPPrflCd(pPrflCd);
		f.setPRegPrcAmt(pRegPrcAmt);
		f.setPPromtnId(pPromtnId);
		f.setPMinOrMax(pMinOrMax);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.PA_MAPS_PRICING.GET_PRICING</code>
	 */
	public static Object getPricing(Configuration configuration, Number pMrktId, Number pOffrPerdId, Number pVehId, Integer pPrflCd, BigDecimal pRegPrcAmt, Number pPromtnId) {
		GetPricing f = new GetPricing();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPVehId(pVehId);
		f.setPPrflCd(pPrflCd);
		f.setPRegPrcAmt(pRegPrcAmt);
		f.setPPromtnId(pPromtnId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_PRICING.GET_PRICING</code> as a field.
	 */
	public static Field<Object> getPricing(Number pMrktId, Number pOffrPerdId, Number pVehId, Integer pPrflCd, BigDecimal pRegPrcAmt, Number pPromtnId) {
		GetPricing f = new GetPricing();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPVehId(pVehId);
		f.setPPrflCd(pPrflCd);
		f.setPRegPrcAmt(pRegPrcAmt);
		f.setPPromtnId(pPromtnId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_PRICING.GET_PRICING</code> as a field.
	 */
	public static Field<Object> getPricing(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId, Field<? extends Number> pVehId, Field<Integer> pPrflCd, Field<BigDecimal> pRegPrcAmt, Field<? extends Number> pPromtnId) {
		GetPricing f = new GetPricing();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);
		f.setPVehId(pVehId);
		f.setPPrflCd(pPrflCd);
		f.setPRegPrcAmt(pRegPrcAmt);
		f.setPPromtnId(pPromtnId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.PA_MAPS_PRICING.SYNC_PRC_POINT_STRATEGY</code>
	 */
	public static void syncPrcPointStrategy(Configuration configuration, Number pMrktId, Number pOffrPerdId, Integer pPrflCd, String pOldPrcLvlTypCd, Number pOldPromtnId, String pNewPrcLvlTypCd, Number pNewPromtnId) {
		SyncPrcPointStrategy p = new SyncPrcPointStrategy();
		p.setPMrktId(pMrktId);
		p.setPOffrPerdId(pOffrPerdId);
		p.setPPrflCd(pPrflCd);
		p.setPOldPrcLvlTypCd(pOldPrcLvlTypCd);
		p.setPOldPromtnId(pOldPromtnId);
		p.setPNewPrcLvlTypCd(pNewPrcLvlTypCd);
		p.setPNewPromtnId(pNewPromtnId);

		p.execute(configuration);
	}

	/**
	 * Call <code>WETRN.PA_MAPS_PRICING.USE_PRICING</code>
	 */
	public static String usePricing(Configuration configuration, Number pMrktId, Number pOffrPerdId) {
		UsePricing f = new UsePricing();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_PRICING.USE_PRICING</code> as a field.
	 */
	public static Field<String> usePricing(Number pMrktId, Number pOffrPerdId) {
		UsePricing f = new UsePricing();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_PRICING.USE_PRICING</code> as a field.
	 */
	public static Field<String> usePricing(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId) {
		UsePricing f = new UsePricing();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private PaMapsPricing() {
		super("PA_MAPS_PRICING", Wetrn.WETRN);
	}
}
