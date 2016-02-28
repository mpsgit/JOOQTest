/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_copy;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsCopy;


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
public class CopySalesInfo extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -417874253;

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.COPY_SALES_INFO.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.COPY_SALES_INFO.PAR_OLDOFFRID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_OLDOFFRID = createParameter("PAR_OLDOFFRID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.COPY_SALES_INFO.PAR_NEWOFFRID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_NEWOFFRID = createParameter("PAR_NEWOFFRID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.COPY_SALES_INFO.PAR_NEWMARKETID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_NEWMARKETID = createParameter("PAR_NEWMARKETID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.COPY_SALES_INFO.PAR_NEWOFFERPERIOD</code>.
	 */
	public static final Parameter<BigDecimal> PAR_NEWOFFERPERIOD = createParameter("PAR_NEWOFFERPERIOD", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.COPY_SALES_INFO.PAR_NEWVEHID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_NEWVEHID = createParameter("PAR_NEWVEHID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.COPY_SALES_INFO.PAR_ZEROUNITS</code>.
	 */
	public static final Parameter<Object> PAR_ZEROUNITS = createParameter("PAR_ZEROUNITS", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"), false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.COPY_SALES_INFO.PAR_WHATIF</code>.
	 */
	public static final Parameter<Object> PAR_WHATIF = createParameter("PAR_WHATIF", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"), false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.COPY_SALES_INFO.PAR_USER</code>.
	 */
	public static final Parameter<String> PAR_USER = createParameter("PAR_USER", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public CopySalesInfo() {
		super("COPY_SALES_INFO", Wetrn.WETRN, PaMapsCopy.PA_MAPS_COPY, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(PAR_OLDOFFRID);
		addInParameter(PAR_NEWOFFRID);
		addInParameter(PAR_NEWMARKETID);
		addInParameter(PAR_NEWOFFERPERIOD);
		addInParameter(PAR_NEWVEHID);
		addInParameter(PAR_ZEROUNITS);
		addInParameter(PAR_WHATIF);
		addInParameter(PAR_USER);
	}

	/**
	 * Set the <code>PAR_OLDOFFRID</code> parameter IN value to the routine
	 */
	public void setParOldoffrid(Number value) {
		setNumber(PAR_OLDOFFRID, value);
	}

	/**
	 * Set the <code>PAR_OLDOFFRID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParOldoffrid(Field<? extends Number> field) {
		setNumber(PAR_OLDOFFRID, field);
	}

	/**
	 * Set the <code>PAR_NEWOFFRID</code> parameter IN value to the routine
	 */
	public void setParNewoffrid(Number value) {
		setNumber(PAR_NEWOFFRID, value);
	}

	/**
	 * Set the <code>PAR_NEWOFFRID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParNewoffrid(Field<? extends Number> field) {
		setNumber(PAR_NEWOFFRID, field);
	}

	/**
	 * Set the <code>PAR_NEWMARKETID</code> parameter IN value to the routine
	 */
	public void setParNewmarketid(Number value) {
		setNumber(PAR_NEWMARKETID, value);
	}

	/**
	 * Set the <code>PAR_NEWMARKETID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParNewmarketid(Field<? extends Number> field) {
		setNumber(PAR_NEWMARKETID, field);
	}

	/**
	 * Set the <code>PAR_NEWOFFERPERIOD</code> parameter IN value to the routine
	 */
	public void setParNewofferperiod(Number value) {
		setNumber(PAR_NEWOFFERPERIOD, value);
	}

	/**
	 * Set the <code>PAR_NEWOFFERPERIOD</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParNewofferperiod(Field<? extends Number> field) {
		setNumber(PAR_NEWOFFERPERIOD, field);
	}

	/**
	 * Set the <code>PAR_NEWVEHID</code> parameter IN value to the routine
	 */
	public void setParNewvehid(Number value) {
		setNumber(PAR_NEWVEHID, value);
	}

	/**
	 * Set the <code>PAR_NEWVEHID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParNewvehid(Field<? extends Number> field) {
		setNumber(PAR_NEWVEHID, field);
	}

	/**
	 * Set the <code>PAR_ZEROUNITS</code> parameter IN value to the routine
	 */
	public void setParZerounits(Object value) {
		setValue(PAR_ZEROUNITS, value);
	}

	/**
	 * Set the <code>PAR_ZEROUNITS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParZerounits(Field<Object> field) {
		setField(PAR_ZEROUNITS, field);
	}

	/**
	 * Set the <code>PAR_WHATIF</code> parameter IN value to the routine
	 */
	public void setParWhatif(Object value) {
		setValue(PAR_WHATIF, value);
	}

	/**
	 * Set the <code>PAR_WHATIF</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParWhatif(Field<Object> field) {
		setField(PAR_WHATIF, field);
	}

	/**
	 * Set the <code>PAR_USER</code> parameter IN value to the routine
	 */
	public void setParUser(String value) {
		setValue(PAR_USER, value);
	}

	/**
	 * Set the <code>PAR_USER</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParUser(Field<String> field) {
		setField(PAR_USER, field);
	}
}
