/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_public;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsPublic;


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
public class SaveDeletes1 extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -431934084;

	/**
	 * The parameter <code>WETRN.PA_MAPS_PUBLIC.SAVE_DELETES.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_PUBLIC.SAVE_DELETES.P_SAVE_DELETES</code>.
	 */
	public static final Parameter<BigDecimal> P_SAVE_DELETES = createParameter("P_SAVE_DELETES", org.jooq.impl.SQLDataType.NUMERIC.defaulted(true), true);

	/**
	 * Create a new routine call instance
	 */
	public SaveDeletes1() {
		super("SAVE_DELETES", Wetrn.WETRN, PaMapsPublic.PA_MAPS_PUBLIC, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_SAVE_DELETES);
		setOverloaded(true);
	}

	/**
	 * Set the <code>P_SAVE_DELETES</code> parameter IN value to the routine
	 */
	public void setPSaveDeletes(Number value) {
		setNumber(P_SAVE_DELETES, value);
	}

	/**
	 * Set the <code>P_SAVE_DELETES</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSaveDeletes(Field<? extends Number> field) {
		setNumber(P_SAVE_DELETES, field);
	}
}
