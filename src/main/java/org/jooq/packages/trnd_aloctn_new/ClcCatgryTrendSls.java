/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.trnd_aloctn_new;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.TrndAloctnNew;


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
public class ClcCatgryTrendSls extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 552910360;

	/**
	 * The parameter <code>WETRN.TRND_ALOCTN_NEW.CLC_CATGRY_TREND_SLS.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.TRND_ALOCTN_NEW.CLC_CATGRY_TREND_SLS.P_SLS_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SLS_PERD_ID = createParameter("P_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public ClcCatgryTrendSls() {
		super("CLC_CATGRY_TREND_SLS", Wetrn.WETRN, TrndAloctnNew.TRND_ALOCTN_NEW);

		addInParameter(P_MRKT_ID);
		addInParameter(P_SLS_PERD_ID);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPMrktId(Number value) {
		setNumber(P_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_SLS_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPSlsPerdId(Number value) {
		setNumber(P_SLS_PERD_ID, value);
	}
}
