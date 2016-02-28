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
public class SetGwp extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -1751691180;

	/**
	 * The parameter <code>WETRN.APP_PRODUCT_SALES.SET_GWP.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL RECORD"), false);

	/**
	 * The parameter <code>WETRN.APP_PRODUCT_SALES.SET_GWP.DATA_RECORD</code>.
	 */
	public static final Parameter<Object> DATA_RECORD = createParameter("DATA_RECORD", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL RECORD"), false);

	/**
	 * The parameter <code>WETRN.APP_PRODUCT_SALES.SET_GWP.GWP_TABLE</code>.
	 */
	public static final Parameter<Object> GWP_TABLE = createParameter("GWP_TABLE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * Create a new routine call instance
	 */
	public SetGwp() {
		super("SET_GWP", Wetrn.WETRN, AppProductSales.APP_PRODUCT_SALES, org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL RECORD"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(DATA_RECORD);
		addInParameter(GWP_TABLE);
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
	 * Set the <code>GWP_TABLE</code> parameter IN value to the routine
	 */
	public void setGwpTable(Object value) {
		setValue(GWP_TABLE, value);
	}

	/**
	 * Set the <code>GWP_TABLE</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setGwpTable(Field<Object> field) {
		setField(GWP_TABLE, field);
	}
}