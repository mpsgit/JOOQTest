/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_anz_ln_grp;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmAnzLnGrp;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LoadBrchrLineNrGrps extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -800546096;

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_LN_GRP.LOAD_BRCHR_LINE_NR_GRPS.P_CLUSTER_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_CLUSTER_ID = createParameter("P_CLUSTER_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_ANZ_LN_GRP.LOAD_BRCHR_LINE_NR_GRPS.P_LEAD_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LEAD_MRKT_ID = createParameter("P_LEAD_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public LoadBrchrLineNrGrps() {
		super("LOAD_BRCHR_LINE_NR_GRPS", Wetrn.WETRN, AppLnmAnzLnGrp.APP_LNM_ANZ_LN_GRP);

		addInParameter(P_CLUSTER_ID);
		addInParameter(P_LEAD_MRKT_ID);
	}

	/**
	 * Set the <code>P_CLUSTER_ID</code> parameter IN value to the routine
	 */
	public void setPClusterId(Number value) {
		setNumber(P_CLUSTER_ID, value);
	}

	/**
	 * Set the <code>P_LEAD_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPLeadMrktId(Number value) {
		setNumber(P_LEAD_MRKT_ID, value);
	}
}
