/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_gta;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsGta;


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
public class GetEmptyParameter extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -1248407992;

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_EMPTY_PARAMETER.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetEmptyParameter() {
		super("GET_EMPTY_PARAMETER", Wetrn.WETRN, PaMapsGta.PA_MAPS_GTA, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
	}
}
