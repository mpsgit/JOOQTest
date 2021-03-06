/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.app_lnm_filters.GetFscsOnOffer;
import org.jooq.packages.app_lnm_filters.GetMarkets;


/**
 * Convenience access to all stored procedures and functions in APP_LNM_FILTERS
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppLnmFilters extends PackageImpl {

	private static final long serialVersionUID = 120418977;

	/**
	 * The reference instance of <code>WETRN.APP_LNM_FILTERS</code>
	 */
	public static final AppLnmFilters APP_LNM_FILTERS = new AppLnmFilters();

	/**
	 * Call <code>WETRN.APP_LNM_FILTERS.GET_FSCS_ON_OFFER</code>
	 */
	public static Object getFscsOnOffer(Configuration configuration, Number pMrktId, Number pOffrPerdId) {
		GetFscsOnOffer f = new GetFscsOnOffer();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_FILTERS.GET_FSCS_ON_OFFER</code> as a field.
	 */
	public static Field<Object> getFscsOnOffer(Number pMrktId, Number pOffrPerdId) {
		GetFscsOnOffer f = new GetFscsOnOffer();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_FILTERS.GET_FSCS_ON_OFFER</code> as a field.
	 */
	public static Field<Object> getFscsOnOffer(Field<? extends Number> pMrktId, Field<? extends Number> pOffrPerdId) {
		GetFscsOnOffer f = new GetFscsOnOffer();
		f.setPMrktId(pMrktId);
		f.setPOffrPerdId(pOffrPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_LNM_FILTERS.GET_MARKETS</code>
	 */
	public static Object getMarkets(Configuration configuration, Number pClstrId) {
		GetMarkets f = new GetMarkets();
		f.setPClstrId(pClstrId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_LNM_FILTERS.GET_MARKETS</code> as a field.
	 */
	public static Field<Object> getMarkets(Number pClstrId) {
		GetMarkets f = new GetMarkets();
		f.setPClstrId(pClstrId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_LNM_FILTERS.GET_MARKETS</code> as a field.
	 */
	public static Field<Object> getMarkets(Field<? extends Number> pClstrId) {
		GetMarkets f = new GetMarkets();
		f.setPClstrId(pClstrId);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private AppLnmFilters() {
		super("APP_LNM_FILTERS", Wetrn.WETRN);
	}
}
