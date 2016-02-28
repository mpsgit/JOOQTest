/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_menu;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsMenu;
import org.jooq.udt.records.TMapsMenuRecord;


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
public class GetDynamicMenu1 extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -2007900811;

	/**
	 * The parameter <code>WETRN.PA_MAPS_MENU.GET_DYNAMIC_MENU.P_USER_NM</code>.
	 */
	public static final Parameter<String> P_USER_NM = createParameter("P_USER_NM", org.jooq.impl.SQLDataType.VARCHAR.length(35), false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_MENU.GET_DYNAMIC_MENU.P_MAPS_MENU</code>.
	 */
	public static final Parameter<TMapsMenuRecord> P_MAPS_MENU = createParameter("P_MAPS_MENU", org.jooq.udt.ObjMapsMenu.OBJ_MAPS_MENU.getDataType().asArrayDataType(org.jooq.udt.records.TMapsMenuRecord.class), false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_MENU.GET_DYNAMIC_MENU.P_RETURN_STATUS</code>.
	 */
	public static final Parameter<BigDecimal> P_RETURN_STATUS = createParameter("P_RETURN_STATUS", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetDynamicMenu1() {
		super("GET_DYNAMIC_MENU", Wetrn.WETRN, PaMapsMenu.PA_MAPS_MENU);

		addInParameter(P_USER_NM);
		addOutParameter(P_MAPS_MENU);
		addOutParameter(P_RETURN_STATUS);
		setOverloaded(true);
	}

	/**
	 * Set the <code>P_USER_NM</code> parameter IN value to the routine
	 */
	public void setPUserNm(String value) {
		setValue(P_USER_NM, value);
	}

	/**
	 * Get the <code>P_MAPS_MENU</code> parameter OUT value from the routine
	 */
	public TMapsMenuRecord getPMapsMenu() {
		return getValue(P_MAPS_MENU);
	}

	/**
	 * Get the <code>P_RETURN_STATUS</code> parameter OUT value from the routine
	 */
	public BigDecimal getPReturnStatus() {
		return getValue(P_RETURN_STATUS);
	}
}
