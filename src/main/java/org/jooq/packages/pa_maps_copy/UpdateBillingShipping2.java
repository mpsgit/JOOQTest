/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_copy;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsCopy;


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
public class UpdateBillingShipping2 extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -479477824;

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.UPDATE_BILLING_SHIPPING.POFFER_ID</code>.
	 */
	public static final Parameter<BigDecimal> POFFER_ID = createParameter("POFFER_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public UpdateBillingShipping2() {
		super("UPDATE_BILLING_SHIPPING", Wetrn.WETRN, PaMapsCopy.PA_MAPS_COPY);

		addInParameter(POFFER_ID);
		setOverloaded(true);
	}

	/**
	 * Set the <code>POFFER_ID</code> parameter IN value to the routine
	 */
	public void setPofferId(Number value) {
		setNumber(POFFER_ID, value);
	}
}
