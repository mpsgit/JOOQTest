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
public class MatchComplete extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1190872296;

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.MATCH_COMPLETE.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.MATCH_COMPLETE.P_SLS_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SLS_PERD_ID = createParameter("P_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.MATCH_COMPLETE.P_STUS</code>.
	 */
	public static final Parameter<BigDecimal> P_STUS = createParameter("P_STUS", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public MatchComplete() {
		super("MATCH_COMPLETE", Wetrn.WETRN, SlsAloctn.SLS_ALOCTN);

		addInParameter(P_MRKT_ID);
		addInParameter(P_SLS_PERD_ID);
		addOutParameter(P_STUS);
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

	/**
	 * Get the <code>P_STUS</code> parameter OUT value from the routine
	 */
	public BigDecimal getPStus() {
		return getValue(P_STUS);
	}
}
