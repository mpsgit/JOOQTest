/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_cee;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmCee;


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
public class GetMsLastSaleablePerd1 extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -351202678;

	/**
	 * The parameter <code>WETRN.APP_LNM_CEE.GET_MS_LAST_SALEABLE_PERD.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_CEE.GET_MS_LAST_SALEABLE_PERD.P_SKU_SET_SKU_ID</code>.
	 */
	public static final Parameter<String> P_SKU_SET_SKU_ID = createParameter("P_SKU_SET_SKU_ID", org.jooq.impl.SQLDataType.VARCHAR.length(4000), false);

	/**
	 * Create a new routine call instance
	 */
	public GetMsLastSaleablePerd1() {
		super("GET_MS_LAST_SALEABLE_PERD", Wetrn.WETRN, AppLnmCee.APP_LNM_CEE, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_SKU_SET_SKU_ID);
		setOverloaded(true);
	}

	/**
	 * Set the <code>P_SKU_SET_SKU_ID</code> parameter IN value to the routine
	 */
	public void setPSkuSetSkuId(String value) {
		setValue(P_SKU_SET_SKU_ID, value);
	}

	/**
	 * Set the <code>P_SKU_SET_SKU_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSkuSetSkuId(Field<String> field) {
		setField(P_SKU_SET_SKU_ID, field);
	}
}