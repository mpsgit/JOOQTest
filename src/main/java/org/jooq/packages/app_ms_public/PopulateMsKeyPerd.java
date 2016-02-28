/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_ms_public;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppMsPublic;


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
public class PopulateMsKeyPerd extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -262599076;

	/**
	 * The parameter <code>WETRN.APP_MS_PUBLIC.POPULATE_MS_KEY_PERD.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_MS_PUBLIC.POPULATE_MS_KEY_PERD.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public PopulateMsKeyPerd() {
		super("POPULATE_MS_KEY_PERD", Wetrn.WETRN, AppMsPublic.APP_MS_PUBLIC);

		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPMrktId(Number value) {
		setNumber(P_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPOffrPerdId(Number value) {
		setNumber(P_OFFR_PERD_ID, value);
	}
}