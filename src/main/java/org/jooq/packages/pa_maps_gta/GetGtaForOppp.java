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
public class GetGtaForOppp extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 1720192313;

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_GTA_FOR_OPPP.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_GTA_FOR_OPPP.PMRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> PMRKT_ID = createParameter("PMRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_GTA_FOR_OPPP.POFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> POFFR_PERD_ID = createParameter("POFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_GTA_FOR_OPPP.PSLS_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> PSLS_PERD_ID = createParameter("PSLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_GTA_FOR_OPPP.POFFR_SKU_LINE_ID</code>.
	 */
	public static final Parameter<BigDecimal> POFFR_SKU_LINE_ID = createParameter("POFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_GTA_FOR_OPPP.PSLS_TYP_ID</code>.
	 */
	public static final Parameter<BigDecimal> PSLS_TYP_ID = createParameter("PSLS_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_GTA_FOR_OPPP.PSELLING_PRICE</code>.
	 */
	public static final Parameter<BigDecimal> PSELLING_PRICE = createParameter("PSELLING_PRICE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_GTA_FOR_OPPP.PCHARITY</code>.
	 */
	public static final Parameter<BigDecimal> PCHARITY = createParameter("PCHARITY", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_GTA_FOR_OPPP.PROYALTY</code>.
	 */
	public static final Parameter<BigDecimal> PROYALTY = createParameter("PROYALTY", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_GTA_FOR_OPPP.PAWARD_SALES</code>.
	 */
	public static final Parameter<BigDecimal> PAWARD_SALES = createParameter("PAWARD_SALES", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_GTA_FOR_OPPP.PCOMMISSION_TYPE_ID</code>.
	 */
	public static final Parameter<String> PCOMMISSION_TYPE_ID = createParameter("PCOMMISSION_TYPE_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.GET_GTA_FOR_OPPP.PTAX_TYPE_ID</code>.
	 */
	public static final Parameter<BigDecimal> PTAX_TYPE_ID = createParameter("PTAX_TYPE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetGtaForOppp() {
		super("GET_GTA_FOR_OPPP", Wetrn.WETRN, PaMapsGta.PA_MAPS_GTA, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(PMRKT_ID);
		addInParameter(POFFR_PERD_ID);
		addInParameter(PSLS_PERD_ID);
		addInParameter(POFFR_SKU_LINE_ID);
		addInParameter(PSLS_TYP_ID);
		addInParameter(PSELLING_PRICE);
		addInParameter(PCHARITY);
		addInParameter(PROYALTY);
		addInParameter(PAWARD_SALES);
		addInParameter(PCOMMISSION_TYPE_ID);
		addInParameter(PTAX_TYPE_ID);
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
	 * Set the <code>PSLS_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPslsPerdId(Number value) {
		setNumber(PSLS_PERD_ID, value);
	}

	/**
	 * Set the <code>PSLS_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPslsPerdId(Field<? extends Number> field) {
		setNumber(PSLS_PERD_ID, field);
	}

	/**
	 * Set the <code>POFFR_SKU_LINE_ID</code> parameter IN value to the routine
	 */
	public void setPoffrSkuLineId(Number value) {
		setNumber(POFFR_SKU_LINE_ID, value);
	}

	/**
	 * Set the <code>POFFR_SKU_LINE_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPoffrSkuLineId(Field<? extends Number> field) {
		setNumber(POFFR_SKU_LINE_ID, field);
	}

	/**
	 * Set the <code>PSLS_TYP_ID</code> parameter IN value to the routine
	 */
	public void setPslsTypId(Number value) {
		setNumber(PSLS_TYP_ID, value);
	}

	/**
	 * Set the <code>PSLS_TYP_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPslsTypId(Field<? extends Number> field) {
		setNumber(PSLS_TYP_ID, field);
	}

	/**
	 * Set the <code>PSELLING_PRICE</code> parameter IN value to the routine
	 */
	public void setPsellingPrice(Number value) {
		setNumber(PSELLING_PRICE, value);
	}

	/**
	 * Set the <code>PSELLING_PRICE</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPsellingPrice(Field<? extends Number> field) {
		setNumber(PSELLING_PRICE, field);
	}

	/**
	 * Set the <code>PCHARITY</code> parameter IN value to the routine
	 */
	public void setPcharity(Number value) {
		setNumber(PCHARITY, value);
	}

	/**
	 * Set the <code>PCHARITY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPcharity(Field<? extends Number> field) {
		setNumber(PCHARITY, field);
	}

	/**
	 * Set the <code>PROYALTY</code> parameter IN value to the routine
	 */
	public void setProyalty(Number value) {
		setNumber(PROYALTY, value);
	}

	/**
	 * Set the <code>PROYALTY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setProyalty(Field<? extends Number> field) {
		setNumber(PROYALTY, field);
	}

	/**
	 * Set the <code>PAWARD_SALES</code> parameter IN value to the routine
	 */
	public void setPawardSales(Number value) {
		setNumber(PAWARD_SALES, value);
	}

	/**
	 * Set the <code>PAWARD_SALES</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPawardSales(Field<? extends Number> field) {
		setNumber(PAWARD_SALES, field);
	}

	/**
	 * Set the <code>PCOMMISSION_TYPE_ID</code> parameter IN value to the routine
	 */
	public void setPcommissionTypeId(String value) {
		setValue(PCOMMISSION_TYPE_ID, value);
	}

	/**
	 * Set the <code>PCOMMISSION_TYPE_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPcommissionTypeId(Field<String> field) {
		setField(PCOMMISSION_TYPE_ID, field);
	}

	/**
	 * Set the <code>PTAX_TYPE_ID</code> parameter IN value to the routine
	 */
	public void setPtaxTypeId(Number value) {
		setNumber(PTAX_TYPE_ID, value);
	}

	/**
	 * Set the <code>PTAX_TYPE_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPtaxTypeId(Field<? extends Number> field) {
		setNumber(PTAX_TYPE_ID, field);
	}
}
