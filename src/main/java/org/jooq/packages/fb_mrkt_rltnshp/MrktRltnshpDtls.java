/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.fb_mrkt_rltnshp;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.FbMrktRltnshp;


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
public class MrktRltnshpDtls extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 2063573773;

	/**
	 * The parameter <code>WETRN.FB_MRKT_RLTNSHP.MRKT_RLTNSHP_DTLS.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.FB_MRKT_RLTNSHP.MRKT_RLTNSHP_DTLS.P_TRGT_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_TRGT_MRKT_ID = createParameter("P_TRGT_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public MrktRltnshpDtls() {
		super("MRKT_RLTNSHP_DTLS", Wetrn.WETRN, FbMrktRltnshp.FB_MRKT_RLTNSHP, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_TRGT_MRKT_ID);
	}

	/**
	 * Set the <code>P_TRGT_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPTrgtMrktId(Number value) {
		setNumber(P_TRGT_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_TRGT_MRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPTrgtMrktId(Field<? extends Number> field) {
		setNumber(P_TRGT_MRKT_ID, field);
	}
}