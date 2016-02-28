/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_lnm_nola;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppLnmNola;


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
public class ReassignScrnItemHistory extends AbstractRoutine<Object> {

	private static final long serialVersionUID = 1231651868;

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_ITEM_HISTORY.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_ITEM_HISTORY.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_ITEM_HISTORY.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_ITEM_HISTORY.P_SKU_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_SKU_ID = createParameter("P_SKU_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_LNM_NOLA.REASSIGN_SCRN_ITEM_HISTORY.P_LINE_NR_LIST</code>.
	 */
	public static final Parameter<String> P_LINE_NR_LIST = createParameter("P_LINE_NR_LIST", org.jooq.impl.SQLDataType.VARCHAR.length(1000), false);

	/**
	 * Create a new routine call instance
	 */
	public ReassignScrnItemHistory() {
		super("REASSIGN_SCRN_ITEM_HISTORY", Wetrn.WETRN, AppLnmNola.APP_LNM_NOLA, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
		addInParameter(P_SKU_ID);
		addInParameter(P_LINE_NR_LIST);
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
	 * Set the <code>P_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPOffrPerdId(Number value) {
		setNumber(P_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffrPerdId(Field<? extends Number> field) {
		setNumber(P_OFFR_PERD_ID, field);
	}

	/**
	 * Set the <code>P_SKU_ID</code> parameter IN value to the routine
	 */
	public void setPSkuId(Number value) {
		setNumber(P_SKU_ID, value);
	}

	/**
	 * Set the <code>P_SKU_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPSkuId(Field<? extends Number> field) {
		setNumber(P_SKU_ID, field);
	}

	/**
	 * Set the <code>P_LINE_NR_LIST</code> parameter IN value to the routine
	 */
	public void setPLineNrList(String value) {
		setValue(P_LINE_NR_LIST, value);
	}

	/**
	 * Set the <code>P_LINE_NR_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLineNrList(Field<String> field) {
		setField(P_LINE_NR_LIST, field);
	}
}
