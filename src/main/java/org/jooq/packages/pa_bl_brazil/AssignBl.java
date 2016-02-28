/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_bl_brazil;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaBlBrazil;


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
public class AssignBl extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -551341401;

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.ASSIGN_BL.PAR_RUN_ID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_RUN_ID = createParameter("PAR_RUN_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.ASSIGN_BL.PAR_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_MRKT_ID = createParameter("PAR_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.ASSIGN_BL.PAR_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_OFFR_PERD_ID = createParameter("PAR_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.ASSIGN_BL.PAR_VEH_ID_LIST</code>.
	 */
	public static final Parameter<String> PAR_VEH_ID_LIST = createParameter("PAR_VEH_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.ASSIGN_BL.PAR_VER_ID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_VER_ID = createParameter("PAR_VER_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.ASSIGN_BL.PAR_USER_ID</code>.
	 */
	public static final Parameter<String> PAR_USER_ID = createParameter("PAR_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public AssignBl() {
		super("ASSIGN_BL", Wetrn.WETRN, PaBlBrazil.PA_BL_BRAZIL);

		addInParameter(PAR_RUN_ID);
		addInParameter(PAR_MRKT_ID);
		addInParameter(PAR_OFFR_PERD_ID);
		addInParameter(PAR_VEH_ID_LIST);
		addInParameter(PAR_VER_ID);
		addInParameter(PAR_USER_ID);
	}

	/**
	 * Set the <code>PAR_RUN_ID</code> parameter IN value to the routine
	 */
	public void setParRunId(Number value) {
		setNumber(PAR_RUN_ID, value);
	}

	/**
	 * Set the <code>PAR_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setParMrktId(Number value) {
		setNumber(PAR_MRKT_ID, value);
	}

	/**
	 * Set the <code>PAR_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setParOffrPerdId(Number value) {
		setNumber(PAR_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>PAR_VEH_ID_LIST</code> parameter IN value to the routine
	 */
	public void setParVehIdList(String value) {
		setValue(PAR_VEH_ID_LIST, value);
	}

	/**
	 * Set the <code>PAR_VER_ID</code> parameter IN value to the routine
	 */
	public void setParVerId(Number value) {
		setNumber(PAR_VER_ID, value);
	}

	/**
	 * Set the <code>PAR_USER_ID</code> parameter IN value to the routine
	 */
	public void setParUserId(String value) {
		setValue(PAR_USER_ID, value);
	}
}
