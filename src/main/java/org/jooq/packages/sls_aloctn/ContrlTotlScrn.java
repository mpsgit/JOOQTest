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
import org.jooq.udt.records.TSaCntrlTotVwRecord;


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
public class ContrlTotlScrn extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1819737027;

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.CONTRL_TOTL_SCRN.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.CONTRL_TOTL_SCRN.P_SLS_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SLS_PERD_ID = createParameter("P_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.CONTRL_TOTL_SCRN.P_RUN_AUTO_PROCESS</code>.
	 */
	public static final Parameter<String> P_RUN_AUTO_PROCESS = createParameter("P_RUN_AUTO_PROCESS", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.CONTRL_TOTL_SCRN.P_RESET_MANUAL_NOT_SUGGESTED</code>.
	 */
	public static final Parameter<String> P_RESET_MANUAL_NOT_SUGGESTED = createParameter("P_RESET_MANUAL_NOT_SUGGESTED", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.CONTRL_TOTL_SCRN.P_RESET_MANUAL_EXCLUDED</code>.
	 */
	public static final Parameter<String> P_RESET_MANUAL_EXCLUDED = createParameter("P_RESET_MANUAL_EXCLUDED", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.CONTRL_TOTL_SCRN.P_USER_NM</code>.
	 */
	public static final Parameter<String> P_USER_NM = createParameter("P_USER_NM", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.SLS_ALOCTN.CONTRL_TOTL_SCRN.P_RESULT</code>.
	 */
	public static final Parameter<TSaCntrlTotVwRecord> P_RESULT = createParameter("P_RESULT", org.jooq.udt.TSaCntrlTotVw.T_SA_CNTRL_TOT_VW.getDataType(), false);

	/**
	 * Create a new routine call instance
	 */
	public ContrlTotlScrn() {
		super("CONTRL_TOTL_SCRN", Wetrn.WETRN, SlsAloctn.SLS_ALOCTN);

		addInParameter(P_MRKT_ID);
		addInParameter(P_SLS_PERD_ID);
		addInParameter(P_RUN_AUTO_PROCESS);
		addInParameter(P_RESET_MANUAL_NOT_SUGGESTED);
		addInParameter(P_RESET_MANUAL_EXCLUDED);
		addInParameter(P_USER_NM);
		addOutParameter(P_RESULT);
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
	 * Set the <code>P_RUN_AUTO_PROCESS</code> parameter IN value to the routine
	 */
	public void setPRunAutoProcess(String value) {
		setValue(P_RUN_AUTO_PROCESS, value);
	}

	/**
	 * Set the <code>P_RESET_MANUAL_NOT_SUGGESTED</code> parameter IN value to the routine
	 */
	public void setPResetManualNotSuggested(String value) {
		setValue(P_RESET_MANUAL_NOT_SUGGESTED, value);
	}

	/**
	 * Set the <code>P_RESET_MANUAL_EXCLUDED</code> parameter IN value to the routine
	 */
	public void setPResetManualExcluded(String value) {
		setValue(P_RESET_MANUAL_EXCLUDED, value);
	}

	/**
	 * Set the <code>P_USER_NM</code> parameter IN value to the routine
	 */
	public void setPUserNm(String value) {
		setValue(P_USER_NM, value);
	}

	/**
	 * Get the <code>P_RESULT</code> parameter OUT value from the routine
	 */
	public TSaCntrlTotVwRecord getPResult() {
		return getValue(P_RESULT);
	}
}
