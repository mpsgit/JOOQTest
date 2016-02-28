/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.app_pagination.Getdata;


/**
 * Convenience access to all stored procedures and functions in APP_PAGINATION
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppPagination extends PackageImpl {

	private static final long serialVersionUID = -1689627202;

	/**
	 * The reference instance of <code>WETRN.APP_PAGINATION</code>
	 */
	public static final AppPagination APP_PAGINATION = new AppPagination();

	/**
	 * Call <code>WETRN.APP_PAGINATION.GETDATA</code>
	 */
	public static Object getdata(Configuration configuration, Number pmarketid, Number pvehicleid, Number pofferperiodid, Number pversionid, Number pbversionid, Number pcversionid, Number pslsPerdRngId) {
		Getdata f = new Getdata();
		f.setPmarketid(pmarketid);
		f.setPvehicleid(pvehicleid);
		f.setPofferperiodid(pofferperiodid);
		f.setPversionid(pversionid);
		f.setPbversionid(pbversionid);
		f.setPcversionid(pcversionid);
		f.setPslsPerdRngId(pslsPerdRngId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_PAGINATION.GETDATA</code> as a field.
	 */
	public static Field<Object> getdata(Number pmarketid, Number pvehicleid, Number pofferperiodid, Number pversionid, Number pbversionid, Number pcversionid, Number pslsPerdRngId) {
		Getdata f = new Getdata();
		f.setPmarketid(pmarketid);
		f.setPvehicleid(pvehicleid);
		f.setPofferperiodid(pofferperiodid);
		f.setPversionid(pversionid);
		f.setPbversionid(pbversionid);
		f.setPcversionid(pcversionid);
		f.setPslsPerdRngId(pslsPerdRngId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_PAGINATION.GETDATA</code> as a field.
	 */
	public static Field<Object> getdata(Field<? extends Number> pmarketid, Field<? extends Number> pvehicleid, Field<? extends Number> pofferperiodid, Field<? extends Number> pversionid, Field<? extends Number> pbversionid, Field<? extends Number> pcversionid, Field<? extends Number> pslsPerdRngId) {
		Getdata f = new Getdata();
		f.setPmarketid(pmarketid);
		f.setPvehicleid(pvehicleid);
		f.setPofferperiodid(pofferperiodid);
		f.setPversionid(pversionid);
		f.setPbversionid(pbversionid);
		f.setPcversionid(pcversionid);
		f.setPslsPerdRngId(pslsPerdRngId);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private AppPagination() {
		super("APP_PAGINATION", Wetrn.WETRN);
	}
}
