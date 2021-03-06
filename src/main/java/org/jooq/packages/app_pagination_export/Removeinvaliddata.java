/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_pagination_export;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppPaginationExport;


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
public class Removeinvaliddata extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 574233570;

	/**
	 * The parameter <code>WETRN.APP_PAGINATION_EXPORT.REMOVEINVALIDDATA.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_PAGINATION_EXPORT.REMOVEINVALIDDATA.RESULT</code>.
	 */
	public static final Parameter<Object> RESULT = createParameter("RESULT", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * Create a new routine call instance
	 */
	public Removeinvaliddata() {
		super("REMOVEINVALIDDATA", Wetrn.WETRN, AppPaginationExport.APP_PAGINATION_EXPORT, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(RESULT);
	}

	/**
	 * Set the <code>RESULT</code> parameter IN value to the routine
	 */
	public void setResult(Object value) {
		setValue(RESULT, value);
	}

	/**
	 * Set the <code>RESULT</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setResult(Field<Object> field) {
		setField(RESULT, field);
	}
}
