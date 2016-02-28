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
public class SHistCtgryCamp extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 973651342;

	/**
	 * The parameter <code>WETRN.TRND_ALOCTN_NEW.S_HIST_CTGRY_CAMP.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.TRND_ALOCTN_NEW.S_HIST_CTGRY_CAMP.P_SLS_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SLS_PERD_ID = createParameter("P_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.TRND_ALOCTN_NEW.S_HIST_CTGRY_CAMP.P_CTGRY_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_CTGRY_ID = createParameter("P_CTGRY_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.TRND_ALOCTN_NEW.S_HIST_CTGRY_CAMP.P_REF_SLS_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_REF_SLS_PERD_ID = createParameter("P_REF_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.TRND_ALOCTN_NEW.S_HIST_CTGRY_CAMP.P_REF_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_REF_OFFR_PERD_ID = createParameter("P_REF_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.TRND_ALOCTN_NEW.S_HIST_CTGRY_CAMP.P_DAY_NUM</code>.
	 */
	public static final Parameter<BigDecimal> P_DAY_NUM = createParameter("P_DAY_NUM", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.TRND_ALOCTN_NEW.S_HIST_CTGRY_CAMP.P_PCT_OVR</code>.
	 */
	public static final Parameter<BigDecimal> P_PCT_OVR = createParameter("P_PCT_OVR", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.TRND_ALOCTN_NEW.S_HIST_CTGRY_CAMP.P_SELECTED</code>.
	 */
	public static final Parameter<BigDecimal> P_SELECTED = createParameter("P_SELECTED", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public SHistCtgryCamp() {
		super("S_HIST_CTGRY_CAMP", Wetrn.WETRN, TrndAloctnNew.TRND_ALOCTN_NEW);

		addInParameter(P_MRKT_ID);
		addInParameter(P_SLS_PERD_ID);
		addInParameter(P_CTGRY_ID);
		addInParameter(P_REF_SLS_PERD_ID);
		addInParameter(P_REF_OFFR_PERD_ID);
		addInParameter(P_DAY_NUM);
		addInParameter(P_PCT_OVR);
		addInParameter(P_SELECTED);
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
	 * Set the <code>P_CTGRY_ID</code> parameter IN value to the routine
	 */
	public void setPCtgryId(Number value) {
		setNumber(P_CTGRY_ID, value);
	}

	/**
	 * Set the <code>P_REF_SLS_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPRefSlsPerdId(Number value) {
		setNumber(P_REF_SLS_PERD_ID, value);
	}

	/**
	 * Set the <code>P_REF_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPRefOffrPerdId(Number value) {
		setNumber(P_REF_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_DAY_NUM</code> parameter IN value to the routine
	 */
	public void setPDayNum(Number value) {
		setNumber(P_DAY_NUM, value);
	}

	/**
	 * Set the <code>P_PCT_OVR</code> parameter IN value to the routine
	 */
	public void setPPctOvr(Number value) {
		setNumber(P_PCT_OVR, value);
	}

	/**
	 * Set the <code>P_SELECTED</code> parameter IN value to the routine
	 */
	public void setPSelected(Number value) {
		setNumber(P_SELECTED, value);
	}
}