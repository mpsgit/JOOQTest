/**
 * This class is generated by jOOQ
 */
package org.jooq.routines;


import java.math.BigDecimal;

import javax.annotation.Generated;

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
public class MrktPerdMappingInsertsPy extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -682546062;

	/**
	 * The parameter <code>WETRN.MRKT_PERD_MAPPING_INSERTS_PY.V_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> V_MRKT_ID = createParameter("V_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public MrktPerdMappingInsertsPy() {
		super("MRKT_PERD_MAPPING_INSERTS_PY", Wetrn.WETRN);

		addInParameter(V_MRKT_ID);
	}

	/**
	 * Set the <code>V_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setVMrktId(Number value) {
		setNumber(V_MRKT_ID, value);
	}
}