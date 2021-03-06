/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_uk_reassign_normal;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmUkReassignNormal;


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
public class AssignLineNr extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -479434463;

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_NORMAL.ASSIGN_LINE_NR.P_CLSTR_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_CLSTR_ID = createParameter("P_CLSTR_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_NORMAL.ASSIGN_LINE_NR.P_LEAD_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LEAD_MRKT_ID = createParameter("P_LEAD_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_NORMAL.ASSIGN_LINE_NR.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<String> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_NORMAL.ASSIGN_LINE_NR.P_SKU_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SKU_ID = createParameter("P_SKU_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_NORMAL.ASSIGN_LINE_NR.P_OLD_LINE_NR</code>.
	 */
	public static final Parameter<String> P_OLD_LINE_NR = createParameter("P_OLD_LINE_NR", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_NORMAL.ASSIGN_LINE_NR.P_LINE_NR</code>.
	 */
	public static final Parameter<String> P_LINE_NR = createParameter("P_LINE_NR", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_NORMAL.ASSIGN_LINE_NR.P_START_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_START_PERD_ID = createParameter("P_START_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_NORMAL.ASSIGN_LINE_NR.P_END_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_END_PERD_ID = createParameter("P_END_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_REASSIGN_NORMAL.ASSIGN_LINE_NR.P_USER_ID</code>.
	 */
	public static final Parameter<String> P_USER_ID = createParameter("P_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public AssignLineNr() {
		super("ASSIGN_LINE_NR", Wetrn.WETRN, AppLnmUkReassignNormal.APP_LNM_UK_REASSIGN_NORMAL);

		addInParameter(P_CLSTR_ID);
		addInParameter(P_LEAD_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
		addInParameter(P_SKU_ID);
		addInParameter(P_OLD_LINE_NR);
		addInParameter(P_LINE_NR);
		addInParameter(P_START_PERD_ID);
		addInParameter(P_END_PERD_ID);
		addInParameter(P_USER_ID);
	}

	/**
	 * Set the <code>P_CLSTR_ID</code> parameter IN value to the routine
	 */
	public void setPClstrId(Number value) {
		setNumber(P_CLSTR_ID, value);
	}

	/**
	 * Set the <code>P_LEAD_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPLeadMrktId(Number value) {
		setNumber(P_LEAD_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPOffrPerdId(String value) {
		setValue(P_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_SKU_ID</code> parameter IN value to the routine
	 */
	public void setPSkuId(Number value) {
		setNumber(P_SKU_ID, value);
	}

	/**
	 * Set the <code>P_OLD_LINE_NR</code> parameter IN value to the routine
	 */
	public void setPOldLineNr(String value) {
		setValue(P_OLD_LINE_NR, value);
	}

	/**
	 * Set the <code>P_LINE_NR</code> parameter IN value to the routine
	 */
	public void setPLineNr(String value) {
		setValue(P_LINE_NR, value);
	}

	/**
	 * Set the <code>P_START_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPStartPerdId(Number value) {
		setNumber(P_START_PERD_ID, value);
	}

	/**
	 * Set the <code>P_END_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPEndPerdId(Number value) {
		setNumber(P_END_PERD_ID, value);
	}

	/**
	 * Set the <code>P_USER_ID</code> parameter IN value to the routine
	 */
	public void setPUserId(String value) {
		setValue(P_USER_ID, value);
	}
}
