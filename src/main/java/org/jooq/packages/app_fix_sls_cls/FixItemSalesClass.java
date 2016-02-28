/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_fix_sls_cls;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppFixSlsCls;


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
public class FixItemSalesClass extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1877598291;

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.FIX_ITEM_SALES_CLASS.POFFR_ID</code>.
	 */
	public static final Parameter<BigDecimal> POFFR_ID = createParameter("POFFR_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.FIX_ITEM_SALES_CLASS.POFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> POFFR_PERD_ID = createParameter("POFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.FIX_ITEM_SALES_CLASS.PMRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> PMRKT_ID = createParameter("PMRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.FIX_ITEM_SALES_CLASS.PPRFL_CD</code>.
	 */
	public static final Parameter<Integer> PPRFL_CD = createParameter("PPRFL_CD", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.FIX_ITEM_SALES_CLASS.PSLS_CLS_CD</code>.
	 */
	public static final Parameter<String> PSLS_CLS_CD = createParameter("PSLS_CLS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.FIX_ITEM_SALES_CLASS.PNEW_SLS_CLS_CD</code>.
	 */
	public static final Parameter<String> PNEW_SLS_CLS_CD = createParameter("PNEW_SLS_CLS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.FIX_ITEM_SALES_CLASS.PPG_OFS_NR</code>.
	 */
	public static final Parameter<BigDecimal> PPG_OFS_NR = createParameter("PPG_OFS_NR", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.FIX_ITEM_SALES_CLASS.PFEATRD_SIDE_CD</code>.
	 */
	public static final Parameter<String> PFEATRD_SIDE_CD = createParameter("PFEATRD_SIDE_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), false);

	/**
	 * The parameter <code>WETRN.APP_FIX_SLS_CLS.FIX_ITEM_SALES_CLASS.PSKU_ID</code>.
	 */
	public static final Parameter<BigDecimal> PSKU_ID = createParameter("PSKU_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public FixItemSalesClass() {
		super("FIX_ITEM_SALES_CLASS", Wetrn.WETRN, AppFixSlsCls.APP_FIX_SLS_CLS);

		addInParameter(POFFR_ID);
		addInParameter(POFFR_PERD_ID);
		addInParameter(PMRKT_ID);
		addInParameter(PPRFL_CD);
		addInParameter(PSLS_CLS_CD);
		addInParameter(PNEW_SLS_CLS_CD);
		addInParameter(PPG_OFS_NR);
		addInParameter(PFEATRD_SIDE_CD);
		addInParameter(PSKU_ID);
	}

	/**
	 * Set the <code>POFFR_ID</code> parameter IN value to the routine
	 */
	public void setPoffrId(Number value) {
		setNumber(POFFR_ID, value);
	}

	/**
	 * Set the <code>POFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPoffrPerdId(Number value) {
		setNumber(POFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>PMRKT_ID</code> parameter IN value to the routine
	 */
	public void setPmrktId(Number value) {
		setNumber(PMRKT_ID, value);
	}

	/**
	 * Set the <code>PPRFL_CD</code> parameter IN value to the routine
	 */
	public void setPprflCd(Integer value) {
		setValue(PPRFL_CD, value);
	}

	/**
	 * Set the <code>PSLS_CLS_CD</code> parameter IN value to the routine
	 */
	public void setPslsClsCd(String value) {
		setValue(PSLS_CLS_CD, value);
	}

	/**
	 * Set the <code>PNEW_SLS_CLS_CD</code> parameter IN value to the routine
	 */
	public void setPnewSlsClsCd(String value) {
		setValue(PNEW_SLS_CLS_CD, value);
	}

	/**
	 * Set the <code>PPG_OFS_NR</code> parameter IN value to the routine
	 */
	public void setPpgOfsNr(Number value) {
		setNumber(PPG_OFS_NR, value);
	}

	/**
	 * Set the <code>PFEATRD_SIDE_CD</code> parameter IN value to the routine
	 */
	public void setPfeatrdSideCd(String value) {
		setValue(PFEATRD_SIDE_CD, value);
	}

	/**
	 * Set the <code>PSKU_ID</code> parameter IN value to the routine
	 */
	public void setPskuId(Number value) {
		setNumber(PSKU_ID, value);
	}
}
