/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_ln_grp;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmLnGrp;


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
public class LoadBrchrLineNrGrpLkup extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 1845990585;

	/**
	 * The parameter <code>WETRN.APP_LNM_LN_GRP.LOAD_BRCHR_LINE_NR_GRP_LKUP.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_LN_GRP.LOAD_BRCHR_LINE_NR_GRP_LKUP.P_CLSTR_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_CLSTR_ID = createParameter("P_CLSTR_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_LN_GRP.LOAD_BRCHR_LINE_NR_GRP_LKUP.P_LEAD_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LEAD_MRKT_ID = createParameter("P_LEAD_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public LoadBrchrLineNrGrpLkup() {
		super("LOAD_BRCHR_LINE_NR_GRP_LKUP", Wetrn.WETRN, AppLnmLnGrp.APP_LNM_LN_GRP, org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_CLSTR_ID);
		addInParameter(P_LEAD_MRKT_ID);
	}

	/**
	 * Set the <code>P_CLSTR_ID</code> parameter IN value to the routine
	 */
	public void setPClstrId(Number value) {
		setNumber(P_CLSTR_ID, value);
	}

	/**
	 * Set the <code>P_CLSTR_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPClstrId(Field<? extends Number> field) {
		setNumber(P_CLSTR_ID, field);
	}

	/**
	 * Set the <code>P_LEAD_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPLeadMrktId(Number value) {
		setNumber(P_LEAD_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_LEAD_MRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLeadMrktId(Field<? extends Number> field) {
		setNumber(P_LEAD_MRKT_ID, field);
	}
}
