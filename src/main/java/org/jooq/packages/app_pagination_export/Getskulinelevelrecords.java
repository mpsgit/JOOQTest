/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_pagination_export;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppPaginationExport;


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
public class Getskulinelevelrecords extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -362645100;

	/**
	 * The parameter <code>WETRN.APP_PAGINATION_EXPORT.GETSKULINELEVELRECORDS.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"), false);

	/**
	 * The parameter <code>WETRN.APP_PAGINATION_EXPORT.GETSKULINELEVELRECORDS.PPRC_POINT_ID</code>.
	 */
	public static final Parameter<BigDecimal> PPRC_POINT_ID = createParameter("PPRC_POINT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public Getskulinelevelrecords() {
		super("GETSKULINELEVELRECORDS", Wetrn.WETRN, AppPaginationExport.APP_PAGINATION_EXPORT, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(PPRC_POINT_ID);
	}

	/**
	 * Set the <code>PPRC_POINT_ID</code> parameter IN value to the routine
	 */
	public void setPprcPointId(Number value) {
		setNumber(PPRC_POINT_ID, value);
	}

	/**
	 * Set the <code>PPRC_POINT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPprcPointId(Field<? extends Number> field) {
		setNumber(PPRC_POINT_ID, field);
	}
}
