/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_cube;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaCube;


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
public class GetPriceTag extends AbstractRoutine<String> {

	private static final long serialVersionUID = -1190957599;

	/**
	 * The parameter <code>WETRN.PA_CUBE.GET_PRICE_TAG.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CHAR.length(1), false);

	/**
	 * The parameter <code>WETRN.PA_CUBE.GET_PRICE_TAG.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_CUBE.GET_PRICE_TAG.P_TAG_LIST</code>.
	 */
	public static final Parameter<String> P_TAG_LIST = createParameter("P_TAG_LIST", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetPriceTag() {
		super("GET_PRICE_TAG", Wetrn.WETRN, PaCube.PA_CUBE, org.jooq.impl.SQLDataType.CHAR.length(1));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_TAG_LIST);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter IN value to the routine
	 */
	public void setPMrktId(Number value) {
		setNumber(P_MRKT_ID, value);
	}

	/**
	 * Set the <code>P_MRKT_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMrktId(Field<? extends Number> field) {
		setNumber(P_MRKT_ID, field);
	}

	/**
	 * Set the <code>P_TAG_LIST</code> parameter IN value to the routine
	 */
	public void setPTagList(String value) {
		setValue(P_TAG_LIST, value);
	}

	/**
	 * Set the <code>P_TAG_LIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPTagList(Field<String> field) {
		setField(P_TAG_LIST, field);
	}
}
