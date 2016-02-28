/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.sls_aloctn;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class SlsAloctnReset extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 946039473;

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.SLS_ALOCTN_RESET.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.SLS_ALOCTN_RESET.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.SLS_ALOCTN_RESET.P_SLS_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SLS_PERD_ID = createParameter("P_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.SLS_ALOCTN_RESET.P_DEL_UNPLND_IND</code>.
	 */
	public static final Parameter<String> P_DEL_UNPLND_IND = createParameter("P_DEL_UNPLND_IND", org.jooq.impl.SQLDataType.CHAR.length(1), false);

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.SLS_ALOCTN_RESET.P_USER_NM</code>.
	 */
	public static final Parameter<String> P_USER_NM = createParameter("P_USER_NM", org.jooq.impl.SQLDataType.VARCHAR.length(35), false);

	/**
	 * Create a new routine call instance
	 */
	public SlsAloctnReset() {
		super("SLS_ALOCTN_RESET", Wetrn.WETRN, SlsAloctn.SLS_ALOCTN, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_SLS_PERD_ID);
		addInParameter(P_DEL_UNPLND_IND);
		addInParameter(P_USER_NM);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPMrktId(Number value) {
		setNumber(P_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMrktId(Field<? extends Number> field) {
		setNumber(P_MRKT_ID, field);
	}

	/**
	 * Set the <code>P_SLS_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPSlsPerdId(Number value) {
		setNumber(P_SLS_PERD_ID, value);
	}

	/**
	 * Set the <code>P_SLS_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSlsPerdId(Field<? extends Number> field) {
		setNumber(P_SLS_PERD_ID, field);
	}

	/**
	 * Set the <code>P_DEL_UNPLND_IND</code> parameter IN value to the routine
	 */
	public void setPDelUnplndInd(String value) {
		setValue(P_DEL_UNPLND_IND, value);
	}

	/**
	 * Set the <code>P_DEL_UNPLND_IND</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPDelUnplndInd(Field<String> field) {
		setField(P_DEL_UNPLND_IND, field);
	}

	/**
	 * Set the <code>P_USER_NM</code> parameter IN value to the routine
	 */
	public void setPUserNm(String value) {
		setValue(P_USER_NM, value);
	}

	/**
	 * Set the <code>P_USER_NM</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPUserNm(Field<String> field) {
		setField(P_USER_NM, field);
	}
}