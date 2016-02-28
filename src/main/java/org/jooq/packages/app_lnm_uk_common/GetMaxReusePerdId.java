/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_uk_common;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmUkCommon;


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
public class GetMaxReusePerdId extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -166983463;

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_COMMON.GET_MAX_REUSE_PERD_ID.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_UK_COMMON.GET_MAX_REUSE_PERD_ID.TYPE_ID</code>.
	 */
	public static final Parameter<BigDecimal> TYPE_ID = createParameter("TYPE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetMaxReusePerdId() {
		super("GET_MAX_REUSE_PERD_ID", Wetrn.WETRN, AppLnmUkCommon.APP_LNM_UK_COMMON, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(TYPE_ID);
	}

	/**
	 * Set the <code>TYPE_ID</code> parameter IN value to the routine
	 */
	public void setTypeId(Number value) {
		setNumber(TYPE_ID, value);
	}

	/**
	 * Set the <code>TYPE_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setTypeId(Field<? extends Number> field) {
		setNumber(TYPE_ID, field);
	}
}