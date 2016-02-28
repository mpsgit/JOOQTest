/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_nola;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class LnmAvailable extends AbstractRoutine<String> {

	private static final long serialVersionUID = -1650673386;

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.LNM_AVAILABLE.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CHAR.length(1), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.LNM_AVAILABLE.P_LINE_NR</code>.
	 */
	public static final Parameter<String> P_LINE_NR = createParameter("P_LINE_NR", org.jooq.impl.SQLDataType.VARCHAR.length(8), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.LNM_AVAILABLE.P_LINE_NR_TYP_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LINE_NR_TYP_ID = createParameter("P_LINE_NR_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.LNM_AVAILABLE.P_LINE_NR_GRP_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LINE_NR_GRP_ID = createParameter("P_LINE_NR_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public LnmAvailable() {
		super("LNM_AVAILABLE", Wetrn.WETRN, AppLnmNola.APP_LNM_NOLA, org.jooq.impl.SQLDataType.CHAR.length(1));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_LINE_NR);
		addInParameter(P_LINE_NR_TYP_ID);
		addInParameter(P_LINE_NR_GRP_ID);
	}

	/**
	 * Set the <code>P_LINE_NR</code> parameter IN value to the routine
	 */
	public void setPLineNr(String value) {
		setValue(P_LINE_NR, value);
	}

	/**
	 * Set the <code>P_LINE_NR</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLineNr(Field<String> field) {
		setField(P_LINE_NR, field);
	}

	/**
	 * Set the <code>P_LINE_NR_TYP_ID</code> parameter IN value to the routine
	 */
	public void setPLineNrTypId(Number value) {
		setNumber(P_LINE_NR_TYP_ID, value);
	}

	/**
	 * Set the <code>P_LINE_NR_TYP_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLineNrTypId(Field<? extends Number> field) {
		setNumber(P_LINE_NR_TYP_ID, field);
	}

	/**
	 * Set the <code>P_LINE_NR_GRP_ID</code> parameter IN value to the routine
	 */
	public void setPLineNrGrpId(Number value) {
		setNumber(P_LINE_NR_GRP_ID, value);
	}

	/**
	 * Set the <code>P_LINE_NR_GRP_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLineNrGrpId(Field<? extends Number> field) {
		setNumber(P_LINE_NR_GRP_ID, field);
	}
}