/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.rep_summary_leader_list;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.RepSummaryLeaderList;


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
public class GetPrflCds extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 726920519;

	/**
	 * The parameter <code>WETRN.REP_SUMMARY_LEADER_LIST.GET_PRFL_CDS.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.REP_SUMMARY_LEADER_LIST.GET_PRFL_CDS.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_SUMMARY_LEADER_LIST.GET_PRFL_CDS.P_BRND_ID_LIST</code>.
	 */
	public static final Parameter<String> P_BRND_ID_LIST = createParameter("P_BRND_ID_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetPrflCds() {
		super("GET_PRFL_CDS", Wetrn.WETRN, RepSummaryLeaderList.REP_SUMMARY_LEADER_LIST, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_BRND_ID_LIST);
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
	 * Set the <code>P_BRND_ID_LIST</code> parameter IN value to the routine
	 */
	public void setPBrndIdList(String value) {
		setValue(P_BRND_ID_LIST, value);
	}

	/**
	 * Set the <code>P_BRND_ID_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPBrndIdList(Field<String> field) {
		setField(P_BRND_ID_LIST, field);
	}
}