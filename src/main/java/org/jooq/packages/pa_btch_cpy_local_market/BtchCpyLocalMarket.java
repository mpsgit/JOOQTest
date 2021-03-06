/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_btch_cpy_local_market;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaBtchCpyLocalMarket;
import org.jooq.udt.records.TTblVarchar2_250Record;
import org.jooq.udt.records.TblMpsParmRecord;


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
public class BtchCpyLocalMarket extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 1052073645;

	/**
	 * The parameter <code>WETRN.PA_BTCH_CPY_LOCAL_MARKET.BTCH_CPY_LOCAL_MARKET.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_BTCH_CPY_LOCAL_MARKET.BTCH_CPY_LOCAL_MARKET.P_USER_ID</code>.
	 */
	public static final Parameter<String> P_USER_ID = createParameter("P_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_BTCH_CPY_LOCAL_MARKET.BTCH_CPY_LOCAL_MARKET.P_TBL_BTCH_CPY_LOCAL_MARKET</code>.
	 */
	public static final Parameter<TblMpsParmRecord> P_TBL_BTCH_CPY_LOCAL_MARKET = createParameter("P_TBL_BTCH_CPY_LOCAL_MARKET", org.jooq.udt.TMpsParm.T_MPS_PARM.getDataType().asArrayDataType(org.jooq.udt.records.TblMpsParmRecord.class), false);

	/**
	 * The parameter <code>WETRN.PA_BTCH_CPY_LOCAL_MARKET.BTCH_CPY_LOCAL_MARKET.P_STUS_MSG_TXT</code>.
	 */
	public static final Parameter<String> P_STUS_MSG_TXT = createParameter("P_STUS_MSG_TXT", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_BTCH_CPY_LOCAL_MARKET.BTCH_CPY_LOCAL_MARKET.P_TBL_STUS_ERR_MSG_TXT</code>.
	 */
	public static final Parameter<TTblVarchar2_250Record> P_TBL_STUS_ERR_MSG_TXT = createParameter("P_TBL_STUS_ERR_MSG_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(250).asArrayDataType(org.jooq.udt.records.TTblVarchar2_250Record.class), false);

	/**
	 * Create a new routine call instance
	 */
	public BtchCpyLocalMarket() {
		super("BTCH_CPY_LOCAL_MARKET", Wetrn.WETRN, PaBtchCpyLocalMarket.PA_BTCH_CPY_LOCAL_MARKET, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_USER_ID);
		addInParameter(P_TBL_BTCH_CPY_LOCAL_MARKET);
		addOutParameter(P_STUS_MSG_TXT);
		addOutParameter(P_TBL_STUS_ERR_MSG_TXT);
	}

	/**
	 * Set the <code>P_USER_ID</code> parameter IN value to the routine
	 */
	public void setPUserId(String value) {
		setValue(P_USER_ID, value);
	}

	/**
	 * Set the <code>P_TBL_BTCH_CPY_LOCAL_MARKET</code> parameter IN value to the routine
	 */
	public void setPTblBtchCpyLocalMarket(TblMpsParmRecord value) {
		setValue(P_TBL_BTCH_CPY_LOCAL_MARKET, value);
	}

	/**
	 * Get the <code>P_STUS_MSG_TXT</code> parameter OUT value from the routine
	 */
	public String getPStusMsgTxt() {
		return getValue(P_STUS_MSG_TXT);
	}

	/**
	 * Get the <code>P_TBL_STUS_ERR_MSG_TXT</code> parameter OUT value from the routine
	 */
	public TTblVarchar2_250Record getPTblStusErrMsgTxt() {
		return getValue(P_TBL_STUS_ERR_MSG_TXT);
	}
}
