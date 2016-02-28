/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_gta;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsGta;


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
public class GetDefaultTaxTypeId extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 1111867288;

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_DEFAULT_TAX_TYPE_ID.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_DEFAULT_TAX_TYPE_ID.PMRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> PMRKT_ID = createParameter("PMRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_DEFAULT_TAX_TYPE_ID.PPRFL_CD</code>.
	 */
	public static final Parameter<BigDecimal> PPRFL_CD = createParameter("PPRFL_CD", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_DEFAULT_TAX_TYPE_ID.PSLS_CLS_ID</code>.
	 */
	public static final Parameter<BigDecimal> PSLS_CLS_ID = createParameter("PSLS_CLS_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_DEFAULT_TAX_TYPE_ID.POFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> POFFR_PERD_ID = createParameter("POFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_DEFAULT_TAX_TYPE_ID.PVEH_ID</code>.
	 */
	public static final Parameter<BigDecimal> PVEH_ID = createParameter("PVEH_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetDefaultTaxTypeId() {
		super("GET_DEFAULT_TAX_TYPE_ID", Wetrn.WETRN, PaMapsGta.PA_MAPS_GTA, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(PMRKT_ID);
		addInParameter(PPRFL_CD);
		addInParameter(PSLS_CLS_ID);
		addInParameter(POFFR_PERD_ID);
		addInParameter(PVEH_ID);
	}

	/**
	 * Set the <code>PMRKT_ID</code> parameter IN value to the routine
	 */
	public void setPmrktId(Number value) {
		setNumber(PMRKT_ID, value);
	}

	/**
	 * Set the <code>PMRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPmrktId(Field<? extends Number> field) {
		setNumber(PMRKT_ID, field);
	}

	/**
	 * Set the <code>PPRFL_CD</code> parameter IN value to the routine
	 */
	public void setPprflCd(Number value) {
		setNumber(PPRFL_CD, value);
	}

	/**
	 * Set the <code>PPRFL_CD</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPprflCd(Field<? extends Number> field) {
		setNumber(PPRFL_CD, field);
	}

	/**
	 * Set the <code>PSLS_CLS_ID</code> parameter IN value to the routine
	 */
	public void setPslsClsId(Number value) {
		setNumber(PSLS_CLS_ID, value);
	}

	/**
	 * Set the <code>PSLS_CLS_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPslsClsId(Field<? extends Number> field) {
		setNumber(PSLS_CLS_ID, field);
	}

	/**
	 * Set the <code>POFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPoffrPerdId(Number value) {
		setNumber(POFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>POFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPoffrPerdId(Field<? extends Number> field) {
		setNumber(POFFR_PERD_ID, field);
	}

	/**
	 * Set the <code>PVEH_ID</code> parameter IN value to the routine
	 */
	public void setPvehId(Number value) {
		setNumber(PVEH_ID, value);
	}

	/**
	 * Set the <code>PVEH_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPvehId(Field<? extends Number> field) {
		setNumber(PVEH_ID, field);
	}
}