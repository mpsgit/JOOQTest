/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.cpy_offr;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.CpyOffr;


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
public class FGetKeyValsForUpdate extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -15710049;

	/**
	 * The parameter <code>WETRN.CPY_OFFR.F_GET_KEY_VALS_FOR_UPDATE.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * Create a new routine call instance
	 */
	public FGetKeyValsForUpdate() {
		super("F_GET_KEY_VALS_FOR_UPDATE", Wetrn.WETRN, CpyOffr.CPY_OFFR, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
	}
}