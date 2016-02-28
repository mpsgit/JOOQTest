/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMaps;


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
public class CostImport extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 527812480;

	/**
	 * The parameter <code>WETRN.PA_MAPS.COST_IMPORT.PA_MAPS_RC</code>.
	 */
	public static final Parameter<BigDecimal> PA_MAPS_RC = createParameter("PA_MAPS_RC", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public CostImport() {
		super("COST_IMPORT", Wetrn.WETRN, PaMaps.PA_MAPS);

		addOutParameter(PA_MAPS_RC);
	}

	/**
	 * Get the <code>PA_MAPS_RC</code> parameter OUT value from the routine
	 */
	public BigDecimal getPaMapsRc() {
		return getValue(PA_MAPS_RC);
	}
}
