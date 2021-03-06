/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.ObjMapsMenuRecord;


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
public class ObjMapsMenu extends UDTImpl<ObjMapsMenuRecord> {

	private static final long serialVersionUID = -1000962981;

	/**
	 * The reference instance of <code>WETRN.OBJ_MAPS_MENU</code>
	 */
	public static final ObjMapsMenu OBJ_MAPS_MENU = new ObjMapsMenu();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ObjMapsMenuRecord> getRecordType() {
		return ObjMapsMenuRecord.class;
	}

	/**
	 * The attribute <code>WETRN.OBJ_MAPS_MENU.LEVEL_ID</code>.
	 */
	public static final UDTField<ObjMapsMenuRecord, BigDecimal> LEVEL_ID = createField("LEVEL_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_MAPS_MENU, "");

	/**
	 * The attribute <code>WETRN.OBJ_MAPS_MENU.ENBLD_IND</code>.
	 */
	public static final UDTField<ObjMapsMenuRecord, String> ENBLD_IND = createField("ENBLD_IND", org.jooq.impl.SQLDataType.CHAR.length(1), OBJ_MAPS_MENU, "");

	/**
	 * The attribute <code>WETRN.OBJ_MAPS_MENU.MENU_ITEM_DESC_TXT</code>.
	 */
	public static final UDTField<ObjMapsMenuRecord, String> MENU_ITEM_DESC_TXT = createField("MENU_ITEM_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(60), OBJ_MAPS_MENU, "");

	/**
	 * The attribute <code>WETRN.OBJ_MAPS_MENU.MAPS_SCRN_URL</code>.
	 */
	public static final UDTField<ObjMapsMenuRecord, String> MAPS_SCRN_URL = createField("MAPS_SCRN_URL", org.jooq.impl.SQLDataType.VARCHAR.length(4000), OBJ_MAPS_MENU, "");

	/**
	 * The attribute <code>WETRN.OBJ_MAPS_MENU.MAPS_APP_VER</code>.
	 */
	public static final UDTField<ObjMapsMenuRecord, BigDecimal> MAPS_APP_VER = createField("MAPS_APP_VER", org.jooq.impl.SQLDataType.NUMERIC, OBJ_MAPS_MENU, "");

	/**
	 * No further instances allowed
	 */
	private ObjMapsMenu() {
		super("OBJ_MAPS_MENU", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}
