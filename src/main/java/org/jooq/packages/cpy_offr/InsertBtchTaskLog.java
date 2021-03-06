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
public class InsertBtchTaskLog extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -190356767;

	/**
	 * The parameter <code>WETRN.CPY_OFFR.INSERT_BTCH_TASK_LOG.P_BTCH_TASK_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_BTCH_TASK_ID = createParameter("P_BTCH_TASK_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.CPY_OFFR.INSERT_BTCH_TASK_LOG.P_BTCH_TASK_LOG_TYP_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_BTCH_TASK_LOG_TYP_ID = createParameter("P_BTCH_TASK_LOG_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.CPY_OFFR.INSERT_BTCH_TASK_LOG.P_BTCH_TASK_KEY</code>.
	 */
	public static final Parameter<BigDecimal> P_BTCH_TASK_KEY = createParameter("P_BTCH_TASK_KEY", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.CPY_OFFR.INSERT_BTCH_TASK_LOG.P_BTCH_ERR_LVL_TXT</code>.
	 */
	public static final Parameter<String> P_BTCH_ERR_LVL_TXT = createParameter("P_BTCH_ERR_LVL_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30), false);

	/**
	 * The parameter <code>WETRN.CPY_OFFR.INSERT_BTCH_TASK_LOG.P_BTCH_LOG_TXT</code>.
	 */
	public static final Parameter<String> P_BTCH_LOG_TXT = createParameter("P_BTCH_LOG_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(1000), false);

	/**
	 * The parameter <code>WETRN.CPY_OFFR.INSERT_BTCH_TASK_LOG.P_BOOSTED_QTY</code>.
	 */
	public static final Parameter<Integer> P_BOOSTED_QTY = createParameter("P_BOOSTED_QTY", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>WETRN.CPY_OFFR.INSERT_BTCH_TASK_LOG.P_NOT_BOOSTED_QTY</code>.
	 */
	public static final Parameter<Integer> P_NOT_BOOSTED_QTY = createParameter("P_NOT_BOOSTED_QTY", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>WETRN.CPY_OFFR.INSERT_BTCH_TASK_LOG.P_TRGT_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_TRGT_MRKT_ID = createParameter("P_TRGT_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public InsertBtchTaskLog() {
		super("INSERT_BTCH_TASK_LOG", Wetrn.WETRN, CpyOffr.CPY_OFFR);

		addInParameter(P_BTCH_TASK_ID);
		addInParameter(P_BTCH_TASK_LOG_TYP_ID);
		addInParameter(P_BTCH_TASK_KEY);
		addInParameter(P_BTCH_ERR_LVL_TXT);
		addInParameter(P_BTCH_LOG_TXT);
		addInParameter(P_BOOSTED_QTY);
		addInParameter(P_NOT_BOOSTED_QTY);
		addInParameter(P_TRGT_MRKT_ID);
	}

	/**
	 * Set the <code>P_BTCH_TASK_ID</code> parameter IN value to the routine
	 */
	public void setPBtchTaskId(Number value) {
		setNumber(P_BTCH_TASK_ID, value);
	}

	/**
	 * Set the <code>P_BTCH_TASK_LOG_TYP_ID</code> parameter IN value to the routine
	 */
	public void setPBtchTaskLogTypId(Number value) {
		setNumber(P_BTCH_TASK_LOG_TYP_ID, value);
	}

	/**
	 * Set the <code>P_BTCH_TASK_KEY</code> parameter IN value to the routine
	 */
	public void setPBtchTaskKey(Number value) {
		setNumber(P_BTCH_TASK_KEY, value);
	}

	/**
	 * Set the <code>P_BTCH_ERR_LVL_TXT</code> parameter IN value to the routine
	 */
	public void setPBtchErrLvlTxt(String value) {
		setValue(P_BTCH_ERR_LVL_TXT, value);
	}

	/**
	 * Set the <code>P_BTCH_LOG_TXT</code> parameter IN value to the routine
	 */
	public void setPBtchLogTxt(String value) {
		setValue(P_BTCH_LOG_TXT, value);
	}

	/**
	 * Set the <code>P_BOOSTED_QTY</code> parameter IN value to the routine
	 */
	public void setPBoostedQty(Integer value) {
		setValue(P_BOOSTED_QTY, value);
	}

	/**
	 * Set the <code>P_NOT_BOOSTED_QTY</code> parameter IN value to the routine
	 */
	public void setPNotBoostedQty(Integer value) {
		setValue(P_NOT_BOOSTED_QTY, value);
	}

	/**
	 * Set the <code>P_TRGT_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPTrgtMrktId(Number value) {
		setNumber(P_TRGT_MRKT_ID, value);
	}
}
