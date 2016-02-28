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
public class UpdateItemBln extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1916034534;

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.UPDATE_ITEM_BLN.PAR_OFFR_SKU_LINE_ID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_OFFR_SKU_LINE_ID = createParameter("PAR_OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.UPDATE_ITEM_BLN.PAR_LINE_NR</code>.
	 */
	public static final Parameter<String> PAR_LINE_NR = createParameter("PAR_LINE_NR", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.UPDATE_ITEM_BLN.PAR_LINE_NR_TYP_ID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_LINE_NR_TYP_ID = createParameter("PAR_LINE_NR_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.UPDATE_ITEM_BLN.PAR_SKU_ID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_SKU_ID = createParameter("PAR_SKU_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.UPDATE_ITEM_BLN.PAR_FSC_CD</code>.
	 */
	public static final Parameter<String> PAR_FSC_CD = createParameter("PAR_FSC_CD", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.UPDATE_ITEM_BLN.PAR_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_OFFR_PERD_ID = createParameter("PAR_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.UPDATE_ITEM_BLN.PAR_USER_ID</code>.
	 */
	public static final Parameter<String> PAR_USER_ID = createParameter("PAR_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_BL_BRAZIL.UPDATE_ITEM_BLN.PAR_LINE_NR_ASGNMT_TYP_ID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_LINE_NR_ASGNMT_TYP_ID = createParameter("PAR_LINE_NR_ASGNMT_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public UpdateItemBln() {
		super("UPDATE_ITEM_BLN", Wetrn.WETRN, PaBlBrazil.PA_BL_BRAZIL);

		addInParameter(PAR_OFFR_SKU_LINE_ID);
		addInParameter(PAR_LINE_NR);
		addInParameter(PAR_LINE_NR_TYP_ID);
		addInParameter(PAR_SKU_ID);
		addInParameter(PAR_FSC_CD);
		addInParameter(PAR_OFFR_PERD_ID);
		addInParameter(PAR_USER_ID);
		addInParameter(PAR_LINE_NR_ASGNMT_TYP_ID);
	}

	/**
	 * Set the <code>PAR_OFFR_SKU_LINE_ID</code> parameter IN value to the routine
	 */
	public void setParOffrSkuLineId(Number value) {
		setNumber(PAR_OFFR_SKU_LINE_ID, value);
	}

	/**
	 * Set the <code>PAR_LINE_NR</code> parameter IN value to the routine
	 */
	public void setParLineNr(String value) {
		setValue(PAR_LINE_NR, value);
	}

	/**
	 * Set the <code>PAR_LINE_NR_TYP_ID</code> parameter IN value to the routine
	 */
	public void setParLineNrTypId(Number value) {
		setNumber(PAR_LINE_NR_TYP_ID, value);
	}

	/**
	 * Set the <code>PAR_SKU_ID</code> parameter IN value to the routine
	 */
	public void setParSkuId(Number value) {
		setNumber(PAR_SKU_ID, value);
	}

	/**
	 * Set the <code>PAR_FSC_CD</code> parameter IN value to the routine
	 */
	public void setParFscCd(String value) {
		setValue(PAR_FSC_CD, value);
	}

	/**
	 * Set the <code>PAR_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setParOffrPerdId(Number value) {
		setNumber(PAR_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>PAR_USER_ID</code> parameter IN value to the routine
	 */
	public void setParUserId(String value) {
		setValue(PAR_USER_ID, value);
	}

	/**
	 * Set the <code>PAR_LINE_NR_ASGNMT_TYP_ID</code> parameter IN value to the routine
	 */
	public void setParLineNrAsgnmtTypId(Number value) {
		setNumber(PAR_LINE_NR_ASGNMT_TYP_ID, value);
	}
}