/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.app_lnm_cena_bi.AssignBi;


/**
 * Convenience access to all stored procedures and functions in APP_LNM_CENA_BI
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppLnmCenaBi extends PackageImpl {

	private static final long serialVersionUID = 840314938;

	/**
	 * The reference instance of <code>WETRN.APP_LNM_CENA_BI</code>
	 */
	public static final AppLnmCenaBi APP_LNM_CENA_BI = new AppLnmCenaBi();

	/**
	 * Call <code>WETRN.APP_LNM_CENA_BI.ASSIGN_BI</code>
	 */
	public static void assignBi(Configuration configuration, Number pRunId, Number pMrktId, Number pOffrPerdId, String pContingency, String pUserId) {
		AssignBi p = new AssignBi();
		p.setPRunId(pRunId);
		p.setPMrktId(pMrktId);
		p.setPOffrPerdId(pOffrPerdId);
		p.setPContingency(pContingency);
		p.setPUserId(pUserId);

		p.execute(configuration);
	}

	/**
	 * No further instances allowed
	 */
	private AppLnmCenaBi() {
		super("APP_LNM_CENA_BI", Wetrn.WETRN);
	}
}