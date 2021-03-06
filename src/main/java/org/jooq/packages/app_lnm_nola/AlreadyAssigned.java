/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_nola;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmNola;


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
public class AlreadyAssigned extends AbstractRoutine<String> {

	private static final long serialVersionUID = -1767426267;

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.ALREADY_ASSIGNED.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CHAR.length(1), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.ALREADY_ASSIGNED.P_LINE_NR</code>.
	 */
	public static final Parameter<String> P_LINE_NR = createParameter("P_LINE_NR", org.jooq.impl.SQLDataType.VARCHAR.length(8), false);

	/**
	 * Create a new routine call instance
	 */
	public AlreadyAssigned() {
		super("ALREADY_ASSIGNED", Wetrn.WETRN, AppLnmNola.APP_LNM_NOLA, org.jooq.impl.SQLDataType.CHAR.length(1));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_LINE_NR);
	}

	/**
	 * Set the <code>P_LINE_NR</code> parameter IN value to the routine
	 */
	public void setPLineNr(String value) {
		setValue(P_LINE_NR, value);
	}

	/**
	 * Set the <code>P_LINE_NR</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLineNr(Field<String> field) {
		setField(P_LINE_NR, field);
	}
}
