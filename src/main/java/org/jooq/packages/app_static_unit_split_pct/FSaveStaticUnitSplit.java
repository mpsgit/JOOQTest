/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_static_unit_split_pct;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppStaticUnitSplitPct;


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
public class FSaveStaticUnitSplit extends AbstractRoutine<String> {

	private static final long serialVersionUID = -1669994344;

	/**
	 * The parameter <code>WETRN.APP_STATIC_UNIT_SPLIT_PCT.F_SAVE_STATIC_UNIT_SPLIT.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_STATIC_UNIT_SPLIT_PCT.F_SAVE_STATIC_UNIT_SPLIT.P_MRKT_ID</code>.
	 */
	public static final Parameter<String> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_STATIC_UNIT_SPLIT_PCT.F_SAVE_STATIC_UNIT_SPLIT.P_PRFL_EFF</code>.
	 */
	public static final Parameter<String> P_PRFL_EFF = createParameter("P_PRFL_EFF", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_STATIC_UNIT_SPLIT_PCT.F_SAVE_STATIC_UNIT_SPLIT.P_USER_ID</code>.
	 */
	public static final Parameter<String> P_USER_ID = createParameter("P_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public FSaveStaticUnitSplit() {
		super("F_SAVE_STATIC_UNIT_SPLIT", Wetrn.WETRN, AppStaticUnitSplitPct.APP_STATIC_UNIT_SPLIT_PCT, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_PRFL_EFF);
		addInParameter(P_USER_ID);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPMrktId(String value) {
		setValue(P_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMrktId(Field<String> field) {
		setField(P_MRKT_ID, field);
	}

	/**
	 * Set the <code>P_PRFL_EFF</code> parameter IN value to the routine
	 */
	public void setPPrflEff(String value) {
		setValue(P_PRFL_EFF, value);
	}

	/**
	 * Set the <code>P_PRFL_EFF</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPPrflEff(Field<String> field) {
		setField(P_PRFL_EFF, field);
	}

	/**
	 * Set the <code>P_USER_ID</code> parameter IN value to the routine
	 */
	public void setPUserId(String value) {
		setValue(P_USER_ID, value);
	}

	/**
	 * Set the <code>P_USER_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPUserId(Field<String> field) {
		setField(P_USER_ID, field);
	}
}
