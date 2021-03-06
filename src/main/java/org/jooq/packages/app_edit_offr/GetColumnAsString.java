/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_edit_offr;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppEditOffr;


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
public class GetColumnAsString extends AbstractRoutine<String> {

	private static final long serialVersionUID = 1309341595;

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.GET_COLUMN_AS_STRING.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.GET_COLUMN_AS_STRING.L_INPUTVAL</code>.
	 */
	public static final Parameter<String> L_INPUTVAL = createParameter("L_INPUTVAL", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.GET_COLUMN_AS_STRING.L_INPUT_VAL2</code>.
	 */
	public static final Parameter<String> L_INPUT_VAL2 = createParameter("L_INPUT_VAL2", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.GET_COLUMN_AS_STRING.L_TYP_ID</code>.
	 */
	public static final Parameter<BigDecimal> L_TYP_ID = createParameter("L_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetColumnAsString() {
		super("GET_COLUMN_AS_STRING", Wetrn.WETRN, AppEditOffr.APP_EDIT_OFFR, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(L_INPUTVAL);
		addInParameter(L_INPUT_VAL2);
		addInParameter(L_TYP_ID);
	}

	/**
	 * Set the <code>L_INPUTVAL</code> parameter IN value to the routine
	 */
	public void setLInputval(String value) {
		setValue(L_INPUTVAL, value);
	}

	/**
	 * Set the <code>L_INPUTVAL</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setLInputval(Field<String> field) {
		setField(L_INPUTVAL, field);
	}

	/**
	 * Set the <code>L_INPUT_VAL2</code> parameter IN value to the routine
	 */
	public void setLInputVal2(String value) {
		setValue(L_INPUT_VAL2, value);
	}

	/**
	 * Set the <code>L_INPUT_VAL2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setLInputVal2(Field<String> field) {
		setField(L_INPUT_VAL2, field);
	}

	/**
	 * Set the <code>L_TYP_ID</code> parameter IN value to the routine
	 */
	public void setLTypId(Number value) {
		setNumber(L_TYP_ID, value);
	}

	/**
	 * Set the <code>L_TYP_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setLTypId(Field<? extends Number> field) {
		setNumber(L_TYP_ID, field);
	}
}
