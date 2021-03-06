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
public class UpdateBillingShipping1 extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1220488330;

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.UPDATE_BILLING_SHIPPING.PMRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> PMRKT_ID = createParameter("PMRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.UPDATE_BILLING_SHIPPING.PVEH_ID</code>.
	 */
	public static final Parameter<BigDecimal> PVEH_ID = createParameter("PVEH_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.UPDATE_BILLING_SHIPPING.PPERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> PPERD_ID = createParameter("PPERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public UpdateBillingShipping1() {
		super("UPDATE_BILLING_SHIPPING", Wetrn.WETRN, PaMapsCopy.PA_MAPS_COPY);

		addInParameter(PMRKT_ID);
		addInParameter(PVEH_ID);
		addInParameter(PPERD_ID);
		setOverloaded(true);
	}

	/**
	 * Set the <code>PMRKT_ID</code> parameter IN value to the routine
	 */
	public void setPmrktId(Number value) {
		setNumber(PMRKT_ID, value);
	}

	/**
	 * Set the <code>PVEH_ID</code> parameter IN value to the routine
	 */
	public void setPvehId(Number value) {
		setNumber(PVEH_ID, value);
	}

	/**
	 * Set the <code>PPERD_ID</code> parameter IN value to the routine
	 */
	public void setPperdId(Number value) {
		setNumber(PPERD_ID, value);
	}
}
