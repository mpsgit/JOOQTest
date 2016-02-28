/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_gta;


import java.math.BigDecimal;

import javax.annotation.Generated;

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
public class SetDstrbtdMrktSlsUnits extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1879279275;

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.SET_DSTRBTD_MRKT_SLS_UNITS.POFFER_SKU_LINE_ID</code>.
	 */
	public static final Parameter<BigDecimal> POFFER_SKU_LINE_ID = createParameter("POFFER_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.SET_DSTRBTD_MRKT_SLS_UNITS.PSALES_TYPE_ID</code>.
	 */
	public static final Parameter<BigDecimal> PSALES_TYPE_ID = createParameter("PSALES_TYPE_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.SET_DSTRBTD_MRKT_SLS_UNITS.PSOURCE_OF_SALES_ID</code>.
	 */
	public static final Parameter<BigDecimal> PSOURCE_OF_SALES_ID = createParameter("PSOURCE_OF_SALES_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_GTA.SET_DSTRBTD_MRKT_SLS_UNITS.PNEW_UNIT</code>.
	 */
	public static final Parameter<BigDecimal> PNEW_UNIT = createParameter("PNEW_UNIT", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public SetDstrbtdMrktSlsUnits() {
		super("SET_DSTRBTD_MRKT_SLS_UNITS", Wetrn.WETRN, PaMapsGta.PA_MAPS_GTA);

		addInParameter(POFFER_SKU_LINE_ID);
		addInParameter(PSALES_TYPE_ID);
		addInParameter(PSOURCE_OF_SALES_ID);
		addInParameter(PNEW_UNIT);
	}

	/**
	 * Set the <code>POFFER_SKU_LINE_ID</code> parameter IN value to the routine
	 */
	public void setPofferSkuLineId(Number value) {
		setNumber(POFFER_SKU_LINE_ID, value);
	}

	/**
	 * Set the <code>PSALES_TYPE_ID</code> parameter IN value to the routine
	 */
	public void setPsalesTypeId(Number value) {
		setNumber(PSALES_TYPE_ID, value);
	}

	/**
	 * Set the <code>PSOURCE_OF_SALES_ID</code> parameter IN value to the routine
	 */
	public void setPsourceOfSalesId(Number value) {
		setNumber(PSOURCE_OF_SALES_ID, value);
	}

	/**
	 * Set the <code>PNEW_UNIT</code> parameter IN value to the routine
	 */
	public void setPnewUnit(Number value) {
		setNumber(PNEW_UNIT, value);
	}
}