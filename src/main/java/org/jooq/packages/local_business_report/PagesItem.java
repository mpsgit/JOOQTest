/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.local_business_report;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.LocalBusinessReport;


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
public class PagesItem extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -2127691911;

	/**
	 * The parameter <code>WETRN.LOCAL_BUSINESS_REPORT.PAGES_ITEM.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.LOCAL_BUSINESS_REPORT.PAGES_ITEM.MARKET_ID</code>.
	 */
	public static final Parameter<BigDecimal> MARKET_ID = createParameter("MARKET_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.LOCAL_BUSINESS_REPORT.PAGES_ITEM.PERIOD_ID</code>.
	 */
	public static final Parameter<BigDecimal> PERIOD_ID = createParameter("PERIOD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.LOCAL_BUSINESS_REPORT.PAGES_ITEM.CONCEPT_NO</code>.
	 */
	public static final Parameter<BigDecimal> CONCEPT_NO = createParameter("CONCEPT_NO", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public PagesItem() {
		super("PAGES_ITEM", Wetrn.WETRN, LocalBusinessReport.LOCAL_BUSINESS_REPORT, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(MARKET_ID);
		addInParameter(PERIOD_ID);
		addInParameter(CONCEPT_NO);
	}

	/**
	 * Set the <code>MARKET_ID</code> parameter IN value to the routine
	 */
	public void setMarketId(Number value) {
		setNumber(MARKET_ID, value);
	}

	/**
	 * Set the <code>MARKET_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setMarketId(Field<? extends Number> field) {
		setNumber(MARKET_ID, field);
	}

	/**
	 * Set the <code>PERIOD_ID</code> parameter IN value to the routine
	 */
	public void setPeriodId(Number value) {
		setNumber(PERIOD_ID, value);
	}

	/**
	 * Set the <code>PERIOD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPeriodId(Field<? extends Number> field) {
		setNumber(PERIOD_ID, field);
	}

	/**
	 * Set the <code>CONCEPT_NO</code> parameter IN value to the routine
	 */
	public void setConceptNo(Number value) {
		setNumber(CONCEPT_NO, value);
	}

	/**
	 * Set the <code>CONCEPT_NO</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setConceptNo(Field<? extends Number> field) {
		setNumber(CONCEPT_NO, field);
	}
}
