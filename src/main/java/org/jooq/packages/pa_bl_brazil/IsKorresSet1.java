/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_bl_brazil;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaBlBrazil;


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
public class IsKorresSet1 extends AbstractRoutine<String> {

	private static final long serialVersionUID = -1722752750;

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.IS_KORRES_SET.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CHAR.length(1), false);

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.IS_KORRES_SET.PAR_OFFR_SKU_SET_ID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_OFFR_SKU_SET_ID = createParameter("PAR_OFFR_SKU_SET_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public IsKorresSet1() {
		super("IS_KORRES_SET", Wetrn.WETRN, PaBlBrazil.PA_BL_BRAZIL, org.jooq.impl.SQLDataType.CHAR.length(1));

		setReturnParameter(RETURN_VALUE);
		addInParameter(PAR_OFFR_SKU_SET_ID);
		setOverloaded(true);
	}

	/**
	 * Set the <code>PAR_OFFR_SKU_SET_ID</code> parameter IN value to the routine
	 */
	public void setParOffrSkuSetId(Number value) {
		setNumber(PAR_OFFR_SKU_SET_ID, value);
	}

	/**
	 * Set the <code>PAR_OFFR_SKU_SET_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParOffrSkuSetId(Field<? extends Number> field) {
		setNumber(PAR_OFFR_SKU_SET_ID, field);
	}
}
