/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_unit_import;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsUnitImport;


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

	private static final long serialVersionUID = -643585349;

	/**
	 * The parameter <code>WETRN.PA_MAPS_UNIT_IMPORT.SET_DSTRBTD_MRKT_SLS_UNITS.POFFER_SKU_LINE_ID</code>.
	 */
	public static final Parameter<String> POFFER_SKU_LINE_ID = createParameter("POFFER_SKU_LINE_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_UNIT_IMPORT.SET_DSTRBTD_MRKT_SLS_UNITS.PSALES_TYPE_ID</code>.
	 */
	public static final Parameter<String> PSALES_TYPE_ID = createParameter("PSALES_TYPE_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_UNIT_IMPORT.SET_DSTRBTD_MRKT_SLS_UNITS.PSOURCE_OF_SALES_ID</code>.
	 */
	public static final Parameter<String> PSOURCE_OF_SALES_ID = createParameter("PSOURCE_OF_SALES_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_UNIT_IMPORT.SET_DSTRBTD_MRKT_SLS_UNITS.PNEW_UNIT</code>.
	 */
	public static final Parameter<String> PNEW_UNIT = createParameter("PNEW_UNIT", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_UNIT_IMPORT.SET_DSTRBTD_MRKT_SLS_UNITS.PPRICEPOINT_ID</code>.
	 */
	public static final Parameter<BigDecimal> PPRICEPOINT_ID = createParameter("PPRICEPOINT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_UNIT_IMPORT.SET_DSTRBTD_MRKT_SLS_UNITS.PUSER_ID</code>.
	 */
	public static final Parameter<String> PUSER_ID = createParameter("PUSER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public SetDstrbtdMrktSlsUnits() {
		super("SET_DSTRBTD_MRKT_SLS_UNITS", Wetrn.WETRN, PaMapsUnitImport.PA_MAPS_UNIT_IMPORT);

		addInParameter(POFFER_SKU_LINE_ID);
		addInParameter(PSALES_TYPE_ID);
		addInParameter(PSOURCE_OF_SALES_ID);
		addInParameter(PNEW_UNIT);
		addInParameter(PPRICEPOINT_ID);
		addInParameter(PUSER_ID);
	}

	/**
	 * Set the <code>POFFER_SKU_LINE_ID</code> parameter IN value to the routine
	 */
	public void setPofferSkuLineId(String value) {
		setValue(POFFER_SKU_LINE_ID, value);
	}

	/**
	 * Set the <code>PSALES_TYPE_ID</code> parameter IN value to the routine
	 */
	public void setPsalesTypeId(String value) {
		setValue(PSALES_TYPE_ID, value);
	}

	/**
	 * Set the <code>PSOURCE_OF_SALES_ID</code> parameter IN value to the routine
	 */
	public void setPsourceOfSalesId(String value) {
		setValue(PSOURCE_OF_SALES_ID, value);
	}

	/**
	 * Set the <code>PNEW_UNIT</code> parameter IN value to the routine
	 */
	public void setPnewUnit(String value) {
		setValue(PNEW_UNIT, value);
	}

	/**
	 * Set the <code>PPRICEPOINT_ID</code> parameter IN value to the routine
	 */
	public void setPpricepointId(Number value) {
		setNumber(PPRICEPOINT_ID, value);
	}

	/**
	 * Set the <code>PUSER_ID</code> parameter IN value to the routine
	 */
	public void setPuserId(String value) {
		setValue(PUSER_ID, value);
	}
}
