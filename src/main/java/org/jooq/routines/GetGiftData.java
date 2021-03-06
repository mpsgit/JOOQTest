/**
 * This class is generated by jOOQ
 */
package org.jooq.routines;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;


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
public class GetGiftData extends AbstractRoutine<String> {

	private static final long serialVersionUID = -179595625;

	/**
	 * The parameter <code>WETRN.GET_GIFT_DATA.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.GET_GIFT_DATA.IN_OFFR_SKU_LINE_ID</code>.
	 */
	public static final Parameter<BigDecimal> IN_OFFR_SKU_LINE_ID = createParameter("IN_OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.GET_GIFT_DATA.TYPE</code>.
	 */
	public static final Parameter<BigDecimal> TYPE = createParameter("TYPE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetGiftData() {
		super("GET_GIFT_DATA", Wetrn.WETRN, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_OFFR_SKU_LINE_ID);
		addInParameter(TYPE);
	}

	/**
	 * Set the <code>IN_OFFR_SKU_LINE_ID</code> parameter IN value to the routine
	 */
	public void setInOffrSkuLineId(Number value) {
		setNumber(IN_OFFR_SKU_LINE_ID, value);
	}

	/**
	 * Set the <code>IN_OFFR_SKU_LINE_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInOffrSkuLineId(Field<? extends Number> field) {
		setNumber(IN_OFFR_SKU_LINE_ID, field);
	}

	/**
	 * Set the <code>TYPE</code> parameter IN value to the routine
	 */
	public void setType(Number value) {
		setNumber(TYPE, value);
	}

	/**
	 * Set the <code>TYPE</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setType(Field<? extends Number> field) {
		setNumber(TYPE, field);
	}
}
