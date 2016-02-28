/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.pa_maps_sales_class.FixItemSalesClass;


/**
 * Convenience access to all stored procedures and functions in PA_MAPS_SALES_CLASS
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaMapsSalesClass extends PackageImpl {

	private static final long serialVersionUID = 1870428916;

	/**
	 * The reference instance of <code>WETRN.PA_MAPS_SALES_CLASS</code>
	 */
	public static final PaMapsSalesClass PA_MAPS_SALES_CLASS = new PaMapsSalesClass();

	/**
	 * Call <code>WETRN.PA_MAPS_SALES_CLASS.FIX_ITEM_SALES_CLASS</code>
	 */
	public static void fixItemSalesClass(Configuration configuration, Number poffrId, Number poffrPerdId, Number pmrktId, Integer pprflCd, String pslsClsCd, String pnewSlsClsCd, Number ppgOfsNr, String pfeatrdSideCd, Number pskuId) {
		FixItemSalesClass p = new FixItemSalesClass();
		p.setPoffrId(poffrId);
		p.setPoffrPerdId(poffrPerdId);
		p.setPmrktId(pmrktId);
		p.setPprflCd(pprflCd);
		p.setPslsClsCd(pslsClsCd);
		p.setPnewSlsClsCd(pnewSlsClsCd);
		p.setPpgOfsNr(ppgOfsNr);
		p.setPfeatrdSideCd(pfeatrdSideCd);
		p.setPskuId(pskuId);

		p.execute(configuration);
	}

	/**
	 * No further instances allowed
	 */
	private PaMapsSalesClass() {
		super("PA_MAPS_SALES_CLASS", Wetrn.WETRN);
	}
}