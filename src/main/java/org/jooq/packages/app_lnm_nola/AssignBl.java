/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_nola;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmNola;


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
public class AssignBl extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 2063227085;

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.ASSIGN_BL.P_RUN_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_RUN_ID = createParameter("P_RUN_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.ASSIGN_BL.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.ASSIGN_BL.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.ASSIGN_BL.P_VEH_ID_LIST</code>.
	 */
	public static final Parameter<String> P_VEH_ID_LIST = createParameter("P_VEH_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR.length(1000), false);

	/**
	 * Create a new routine call instance
	 */
	public AssignBl() {
		super("ASSIGN_BL", Wetrn.WETRN, AppLnmNola.APP_LNM_NOLA);

		addInParameter(P_RUN_ID);
		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
		addInParameter(P_VEH_ID_LIST);
	}

	/**
	 * Set the <code>P_RUN_ID</code> parameter IN value to the routine
	 */
	public void setPRunId(Number value) {
		setNumber(P_RUN_ID, value);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPMrktId(Number value) {
		setNumber(P_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPOffrPerdId(Number value) {
		setNumber(P_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_VEH_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPVehIdList(String value) {
		setValue(P_VEH_ID_LIST, value);
	}
}
