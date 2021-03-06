/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_product_launch;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppProductLaunch;


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
public class SetVeh extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 559916791;

	/**
	 * The parameter <code>WETRN.APP_PRODUCT_LAUNCH.SET_VEH.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL RECORD"), false);

	/**
	 * The parameter <code>WETRN.APP_PRODUCT_LAUNCH.SET_VEH.DATA_RECORD</code>.
	 */
	public static final Parameter<Object> DATA_RECORD = createParameter("DATA_RECORD", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL RECORD"), false);

	/**
	 * The parameter <code>WETRN.APP_PRODUCT_LAUNCH.SET_VEH.VEH_TABLE</code>.
	 */
	public static final Parameter<Object> VEH_TABLE = createParameter("VEH_TABLE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * Create a new routine call instance
	 */
	public SetVeh() {
		super("SET_VEH", Wetrn.WETRN, AppProductLaunch.APP_PRODUCT_LAUNCH, org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL RECORD"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(DATA_RECORD);
		addInParameter(VEH_TABLE);
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
	 * Set the <code>VEH_TABLE</code> parameter IN value to the routine
	 */
	public void setVehTable(Object value) {
		setValue(VEH_TABLE, value);
	}

	/**
	 * Set the <code>VEH_TABLE</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setVehTable(Field<Object> field) {
		setField(VEH_TABLE, field);
	}
}
