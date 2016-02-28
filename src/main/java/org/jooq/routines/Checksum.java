/**
 * This class is generated by jOOQ
 */
package org.jooq.routines;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;


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
public class Checksum extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 637857957;

	/**
	 * The parameter <code>WETRN.CHECKSUM.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.CHECKSUM.P_BUFF</code>.
	 */
	public static final Parameter<String> P_BUFF = createParameter("P_BUFF", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public Checksum() {
		super("CHECKSUM", Wetrn.WETRN, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_BUFF);
	}

	/**
	 * Set the <code>P_BUFF</code> parameter IN value to the routine
	 */
	public void setPBuff(String value) {
		setValue(P_BUFF, value);
	}

	/**
	 * Set the <code>P_BUFF</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPBuff(Field<String> field) {
		setField(P_BUFF, field);
	}
}
