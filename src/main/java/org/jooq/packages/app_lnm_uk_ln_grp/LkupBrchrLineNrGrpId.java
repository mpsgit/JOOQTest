/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_uk_ln_grp;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmUkLnGrp;


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
public class LkupBrchrLineNrGrpId extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -1626151683;

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_LN_GRP.LKUP_BRCHR_LINE_NR_GRP_ID.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_LN_GRP.LKUP_BRCHR_LINE_NR_GRP_ID.P_LINE_NR_TYP_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LINE_NR_TYP_ID = createParameter("P_LINE_NR_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_LN_GRP.LKUP_BRCHR_LINE_NR_GRP_ID.P_LEAD_BUS_DIV_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_LEAD_BUS_DIV_ID = createParameter("P_LEAD_BUS_DIV_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_LN_GRP.LKUP_BRCHR_LINE_NR_GRP_ID.P_BUS_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_BUS_ID = createParameter("P_BUS_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_LN_GRP.LKUP_BRCHR_LINE_NR_GRP_ID.P_CATGRY_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_CATGRY_ID = createParameter("P_CATGRY_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_LN_GRP.LKUP_BRCHR_LINE_NR_GRP_ID.P_SGMT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SGMT_ID = createParameter("P_SGMT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public LkupBrchrLineNrGrpId() {
		super("LKUP_BRCHR_LINE_NR_GRP_ID", Wetrn.WETRN, AppLnmUkLnGrp.APP_LNM_UK_LN_GRP, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_LINE_NR_TYP_ID);
		addInParameter(P_LEAD_BUS_DIV_ID);
		addInParameter(P_BUS_ID);
		addInParameter(P_CATGRY_ID);
		addInParameter(P_SGMT_ID);
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
	 * Set the <code>P_LEAD_BUS_DIV_ID</code> parameter IN value to the routine
	 */
	public void setPLeadBusDivId(Number value) {
		setNumber(P_LEAD_BUS_DIV_ID, value);
	}

	/**
	 * Set the <code>P_LEAD_BUS_DIV_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLeadBusDivId(Field<? extends Number> field) {
		setNumber(P_LEAD_BUS_DIV_ID, field);
	}

	/**
	 * Set the <code>P_BUS_ID</code> parameter IN value to the routine
	 */
	public void setPBusId(Number value) {
		setNumber(P_BUS_ID, value);
	}

	/**
	 * Set the <code>P_BUS_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPBusId(Field<? extends Number> field) {
		setNumber(P_BUS_ID, field);
	}

	/**
	 * Set the <code>P_CATGRY_ID</code> parameter IN value to the routine
	 */
	public void setPCatgryId(Number value) {
		setNumber(P_CATGRY_ID, value);
	}

	/**
	 * Set the <code>P_CATGRY_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPCatgryId(Field<? extends Number> field) {
		setNumber(P_CATGRY_ID, field);
	}

	/**
	 * Set the <code>P_SGMT_ID</code> parameter IN value to the routine
	 */
	public void setPSgmtId(Number value) {
		setNumber(P_SGMT_ID, value);
	}

	/**
	 * Set the <code>P_SGMT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSgmtId(Field<? extends Number> field) {
		setNumber(P_SGMT_ID, field);
	}
}
