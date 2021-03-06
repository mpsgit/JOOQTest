/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.cpy_offr;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.CpyOffr;


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
public class CopyOffr extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -26678316;

	/**
	 * The parameter <code>WETRN.CPY_OFFR.COPY_OFFR.P_PARM_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_PARM_ID = createParameter("P_PARM_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.CPY_OFFR.COPY_OFFR.P_USER_NM</code>.
	 */
	public static final Parameter<String> P_USER_NM = createParameter("P_USER_NM", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.CPY_OFFR.COPY_OFFR.P_TASK_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_TASK_ID = createParameter("P_TASK_ID", org.jooq.impl.SQLDataType.NUMERIC.defaulted(true), true);

	/**
	 * The parameter <code>WETRN.CPY_OFFR.COPY_OFFR.P_STATUS</code>.
	 */
	public static final Parameter<BigDecimal> P_STATUS = createParameter("P_STATUS", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public CopyOffr() {
		super("COPY_OFFR", Wetrn.WETRN, CpyOffr.CPY_OFFR);

		addInParameter(P_PARM_ID);
		addInParameter(P_USER_NM);
		addInParameter(P_TASK_ID);
		addOutParameter(P_STATUS);
	}

	/**
	 * Set the <code>P_PARM_ID</code> parameter IN value to the routine
	 */
	public void setPParmId(Number value) {
		setNumber(P_PARM_ID, value);
	}

	/**
	 * Set the <code>P_USER_NM</code> parameter IN value to the routine
	 */
	public void setPUserNm(String value) {
		setValue(P_USER_NM, value);
	}

	/**
	 * Set the <code>P_TASK_ID</code> parameter IN value to the routine
	 */
	public void setPTaskId(Number value) {
		setNumber(P_TASK_ID, value);
	}

	/**
	 * Get the <code>P_STATUS</code> parameter OUT value from the routine
	 */
	public BigDecimal getPStatus() {
		return getValue(P_STATUS);
	}
}
