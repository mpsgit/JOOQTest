/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_product_sales;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppProductSales;


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
public class SetPromtnClm extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -657726560;

	/**
	 * The parameter <code>WETRN.APP_PRODUCT_SALES.SET_PROMTN_CLM.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL RECORD"), false);

	/**
	 * The parameter <code>WETRN.APP_PRODUCT_SALES.SET_PROMTN_CLM.DATA_RECORD</code>.
	 */
	public static final Parameter<Object> DATA_RECORD = createParameter("DATA_RECORD", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL RECORD"), false);

	/**
	 * The parameter <code>WETRN.APP_PRODUCT_SALES.SET_PROMTN_CLM.PROMTN_CLM_TABLE</code>.
	 */
	public static final Parameter<Object> PROMTN_CLM_TABLE = createParameter("PROMTN_CLM_TABLE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * Create a new routine call instance
	 */
	public SetPromtnClm() {
		super("SET_PROMTN_CLM", Wetrn.WETRN, AppProductSales.APP_PRODUCT_SALES, org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL RECORD"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(DATA_RECORD);
		addInParameter(PROMTN_CLM_TABLE);
	}

	/**
	 * Set the <code>DATA_RECORD</code> parameter IN value to the routine
	 */
	public void setDataRecord(Object value) {
		setValue(DATA_RECORD, value);
	}

	/**
	 * Set the <code>DATA_RECORD</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setDataRecord(Field<Object> field) {
		setField(DATA_RECORD, field);
	}

	/**
	 * Set the <code>PROMTN_CLM_TABLE</code> parameter IN value to the routine
	 */
	public void setPromtnClmTable(Object value) {
		setValue(PROMTN_CLM_TABLE, value);
	}

	/**
	 * Set the <code>PROMTN_CLM_TABLE</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPromtnClmTable(Field<Object> field) {
		setField(PROMTN_CLM_TABLE, field);
	}
}
