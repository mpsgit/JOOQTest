/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.rep_security;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.RepSecurity;


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
public class Uncomma extends AbstractRoutine<String> {

	private static final long serialVersionUID = 1368225179;

	/**
	 * The parameter <code>WETRN.REP_SECURITY.UNCOMMA.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_SECURITY.UNCOMMA.P_STRING</code>.
	 */
	public static final Parameter<String> P_STRING = createParameter("P_STRING", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public Uncomma() {
		super("UNCOMMA", Wetrn.WETRN, RepSecurity.REP_SECURITY, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_STRING);
	}

	/**
	 * Set the <code>P_STRING</code> parameter IN value to the routine
	 */
	public void setPString(String value) {
		setValue(P_STRING, value);
	}

	/**
	 * Set the <code>P_STRING</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPString(Field<String> field) {
		setField(P_STRING, field);
	}
}