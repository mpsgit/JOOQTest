/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.sls_aloctn;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.SlsAloctn;


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
public class GetAutoSuggestedSingle extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -393284140;

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.GET_AUTO_SUGGESTED_SINGLE.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetAutoSuggestedSingle() {
		super("GET_AUTO_SUGGESTED_SINGLE", Wetrn.WETRN, SlsAloctn.SLS_ALOCTN, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
	}
}