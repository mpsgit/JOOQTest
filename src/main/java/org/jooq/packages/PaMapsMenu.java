/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.pa_maps_menu.GetDynamicMenu1;
import org.jooq.packages.pa_maps_menu.GetDynamicMenu2;
import org.jooq.packages.pa_maps_menu.HasAccess;
import org.jooq.packages.pa_maps_menu.IsDeleted;
import org.jooq.udt.records.TMapsMenuRecord;


/**
 * Convenience access to all stored procedures and functions in PA_MAPS_MENU
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaMapsMenu extends PackageImpl {

	private static final long serialVersionUID = 1784664528;

	/**
	 * The reference instance of <code>WETRN.PA_MAPS_MENU</code>
	 */
	public static final PaMapsMenu PA_MAPS_MENU = new PaMapsMenu();

	/**
	 * Call <code>WETRN.PA_MAPS_MENU.GET_DYNAMIC_MENU</code>
	 */
	public static GetDynamicMenu1 getDynamicMenu1(Configuration configuration, String pUserNm) {
		GetDynamicMenu1 p = new GetDynamicMenu1();
		p.setPUserNm(pUserNm);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call <code>WETRN.PA_MAPS_MENU.GET_DYNAMIC_MENU</code>
	 */
	public static TMapsMenuRecord getDynamicMenu2(Configuration configuration, String pUserNm) {
		GetDynamicMenu2 f = new GetDynamicMenu2();
		f.setPUserNm(pUserNm);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_MENU.GET_DYNAMIC_MENU</code> as a field.
	 */
	public static Field<TMapsMenuRecord> getDynamicMenu2(String pUserNm) {
		GetDynamicMenu2 f = new GetDynamicMenu2();
		f.setPUserNm(pUserNm);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_MENU.GET_DYNAMIC_MENU</code> as a field.
	 */
	public static Field<TMapsMenuRecord> getDynamicMenu2(Field<String> pUserNm) {
		GetDynamicMenu2 f = new GetDynamicMenu2();
		f.setPUserNm(pUserNm);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.PA_MAPS_MENU.HAS_ACCESS</code>
	 */
	public static String hasAccess(Configuration configuration, String pUserNm, Number pObjId) {
		HasAccess f = new HasAccess();
		f.setPUserNm(pUserNm);
		f.setPObjId(pObjId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_MENU.HAS_ACCESS</code> as a field.
	 */
	public static Field<String> hasAccess(String pUserNm, Number pObjId) {
		HasAccess f = new HasAccess();
		f.setPUserNm(pUserNm);
		f.setPObjId(pObjId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_MENU.HAS_ACCESS</code> as a field.
	 */
	public static Field<String> hasAccess(Field<String> pUserNm, Field<? extends Number> pObjId) {
		HasAccess f = new HasAccess();
		f.setPUserNm(pUserNm);
		f.setPObjId(pObjId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.PA_MAPS_MENU.IS_DELETED</code>
	 */
	public static String isDeleted(Configuration configuration, Number pMenuItemId) {
		IsDeleted f = new IsDeleted();
		f.setPMenuItemId(pMenuItemId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_MENU.IS_DELETED</code> as a field.
	 */
	public static Field<String> isDeleted(Number pMenuItemId) {
		IsDeleted f = new IsDeleted();
		f.setPMenuItemId(pMenuItemId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.PA_MAPS_MENU.IS_DELETED</code> as a field.
	 */
	public static Field<String> isDeleted(Field<? extends Number> pMenuItemId) {
		IsDeleted f = new IsDeleted();
		f.setPMenuItemId(pMenuItemId);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private PaMapsMenu() {
		super("PA_MAPS_MENU", Wetrn.WETRN);
	}
}
