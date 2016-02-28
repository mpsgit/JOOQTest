/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_copy_replace;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsCopyReplace;


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
public class CopyOrReplace extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -2100895357;

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY_REPLACE.COPY_OR_REPLACE.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY_REPLACE.COPY_OR_REPLACE.PAR_OFFERID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_OFFERID = createParameter("PAR_OFFERID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY_REPLACE.COPY_OR_REPLACE.PAR_NEWOFFERID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_NEWOFFERID = createParameter("PAR_NEWOFFERID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY_REPLACE.COPY_OR_REPLACE.PAR_NEWMARKETID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_NEWMARKETID = createParameter("PAR_NEWMARKETID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY_REPLACE.COPY_OR_REPLACE.PAR_NEWOFFERPERIOD</code>.
	 */
	public static final Parameter<BigDecimal> PAR_NEWOFFERPERIOD = createParameter("PAR_NEWOFFERPERIOD", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY_REPLACE.COPY_OR_REPLACE.PAR_NEWVEHID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_NEWVEHID = createParameter("PAR_NEWVEHID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY_REPLACE.COPY_OR_REPLACE.PAR_NEWOFFRDESC</code>.
	 */
	public static final Parameter<String> PAR_NEWOFFRDESC = createParameter("PAR_NEWOFFRDESC", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY_REPLACE.COPY_OR_REPLACE.PAR_ZEROUNITS</code>.
	 */
	public static final Parameter<Object> PAR_ZEROUNITS = createParameter("PAR_ZEROUNITS", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"), false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY_REPLACE.COPY_OR_REPLACE.PAR_WHATIF</code>.
	 */
	public static final Parameter<Object> PAR_WHATIF = createParameter("PAR_WHATIF", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"), false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY_REPLACE.COPY_OR_REPLACE.PAR_RETAINDEST</code>.
	 */
	public static final Parameter<Object> PAR_RETAINDEST = createParameter("PAR_RETAINDEST", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"), false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY_REPLACE.COPY_OR_REPLACE.PAR_PAGINATIONCOPY</code>.
	 */
	public static final Parameter<Object> PAR_PAGINATIONCOPY = createParameter("PAR_PAGINATIONCOPY", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"), false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY_REPLACE.COPY_OR_REPLACE.PAR_USER</code>.
	 */
	public static final Parameter<String> PAR_USER = createParameter("PAR_USER", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public CopyOrReplace() {
		super("COPY_OR_REPLACE", Wetrn.WETRN, PaMapsCopyReplace.PA_MAPS_COPY_REPLACE, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(PAR_OFFERID);
		addInParameter(PAR_NEWOFFERID);
		addInParameter(PAR_NEWMARKETID);
		addInParameter(PAR_NEWOFFERPERIOD);
		addInParameter(PAR_NEWVEHID);
		addInParameter(PAR_NEWOFFRDESC);
		addInParameter(PAR_ZEROUNITS);
		addInParameter(PAR_WHATIF);
		addInParameter(PAR_RETAINDEST);
		addInParameter(PAR_PAGINATIONCOPY);
		addInParameter(PAR_USER);
	}

	/**
	 * Set the <code>PAR_OFFERID</code> parameter IN value to the routine
	 */
	public void setParOfferid(Number value) {
		setNumber(PAR_OFFERID, value);
	}

	/**
	 * Set the <code>PAR_OFFERID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParOfferid(Field<? extends Number> field) {
		setNumber(PAR_OFFERID, field);
	}

	/**
	 * Set the <code>PAR_NEWOFFERID</code> parameter IN value to the routine
	 */
	public void setParNewofferid(Number value) {
		setNumber(PAR_NEWOFFERID, value);
	}

	/**
	 * Set the <code>PAR_NEWOFFERID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParNewofferid(Field<? extends Number> field) {
		setNumber(PAR_NEWOFFERID, field);
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
	 * Set the <code>PAR_NEWOFFRDESC</code> parameter IN value to the routine
	 */
	public void setParNewoffrdesc(String value) {
		setValue(PAR_NEWOFFRDESC, value);
	}

	/**
	 * Set the <code>PAR_NEWOFFRDESC</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParNewoffrdesc(Field<String> field) {
		setField(PAR_NEWOFFRDESC, field);
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
	 * Set the <code>PAR_RETAINDEST</code> parameter IN value to the routine
	 */
	public void setParRetaindest(Object value) {
		setValue(PAR_RETAINDEST, value);
	}

	/**
	 * Set the <code>PAR_RETAINDEST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParRetaindest(Field<Object> field) {
		setField(PAR_RETAINDEST, field);
	}

	/**
	 * Set the <code>PAR_PAGINATIONCOPY</code> parameter IN value to the routine
	 */
	public void setParPaginationcopy(Object value) {
		setValue(PAR_PAGINATIONCOPY, value);
	}

	/**
	 * Set the <code>PAR_PAGINATIONCOPY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParPaginationcopy(Field<Object> field) {
		setField(PAR_PAGINATIONCOPY, field);
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
