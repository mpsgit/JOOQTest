/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_lnm;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsLnm;


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
public class IsBlnResetable extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 1095669197;

	/**
	 * The parameter <code>WETRN.PA_MAPS_LNM.IS_BLN_RESETABLE.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_LNM.IS_BLN_RESETABLE.MARKETID</code>.
	 */
	public static final Parameter<BigDecimal> MARKETID = createParameter("MARKETID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_LNM.IS_BLN_RESETABLE.SKUID</code>.
	 */
	public static final Parameter<BigDecimal> SKUID = createParameter("SKUID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_LNM.IS_BLN_RESETABLE.FSC</code>.
	 */
	public static final Parameter<String> FSC = createParameter("FSC", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_LNM.IS_BLN_RESETABLE.CAMPAIGN</code>.
	 */
	public static final Parameter<BigDecimal> CAMPAIGN = createParameter("CAMPAIGN", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_LNM.IS_BLN_RESETABLE.REUSE_FACTOR</code>.
	 */
	public static final Parameter<BigDecimal> REUSE_FACTOR = createParameter("REUSE_FACTOR", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public IsBlnResetable() {
		super("IS_BLN_RESETABLE", Wetrn.WETRN, PaMapsLnm.PA_MAPS_LNM, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(MARKETID);
		addInParameter(SKUID);
		addInParameter(FSC);
		addInParameter(CAMPAIGN);
		addInParameter(REUSE_FACTOR);
	}

	/**
	 * Set the <code>MARKETID</code> parameter IN value to the routine
	 */
	public void setMarketid(Number value) {
		setNumber(MARKETID, value);
	}

	/**
	 * Set the <code>MARKETID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setMarketid(Field<? extends Number> field) {
		setNumber(MARKETID, field);
	}

	/**
	 * Set the <code>SKUID</code> parameter IN value to the routine
	 */
	public void setSkuid(Number value) {
		setNumber(SKUID, value);
	}

	/**
	 * Set the <code>SKUID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setSkuid(Field<? extends Number> field) {
		setNumber(SKUID, field);
	}

	/**
	 * Set the <code>FSC</code> parameter IN value to the routine
	 */
	public void setFsc(String value) {
		setValue(FSC, value);
	}

	/**
	 * Set the <code>FSC</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setFsc(Field<String> field) {
		setField(FSC, field);
	}

	/**
	 * Set the <code>CAMPAIGN</code> parameter IN value to the routine
	 */
	public void setCampaign(Number value) {
		setNumber(CAMPAIGN, value);
	}

	/**
	 * Set the <code>CAMPAIGN</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setCampaign(Field<? extends Number> field) {
		setNumber(CAMPAIGN, field);
	}

	/**
	 * Set the <code>REUSE_FACTOR</code> parameter IN value to the routine
	 */
	public void setReuseFactor(Number value) {
		setNumber(REUSE_FACTOR, value);
	}

	/**
	 * Set the <code>REUSE_FACTOR</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setReuseFactor(Field<? extends Number> field) {
		setNumber(REUSE_FACTOR, field);
	}
}
