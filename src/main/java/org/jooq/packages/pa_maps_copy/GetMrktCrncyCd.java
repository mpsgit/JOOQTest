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
public class GetMrktCrncyCd extends AbstractRoutine<String> {

	private static final long serialVersionUID = -1428286412;

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.GET_MRKT_CRNCY_CD.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_COPY.GET_MRKT_CRNCY_CD.PAR_MRKTID</code>.
	 */
	public static final Parameter<BigDecimal> PAR_MRKTID = createParameter("PAR_MRKTID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetMrktCrncyCd() {
		super("GET_MRKT_CRNCY_CD", Wetrn.WETRN, PaMapsCopy.PA_MAPS_COPY, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(PAR_MRKTID);
	}

	/**
	 * Set the <code>PAR_MRKTID</code> parameter IN value to the routine
	 */
	public void setParMrktid(Number value) {
		setNumber(PAR_MRKTID, value);
	}

	/**
	 * Set the <code>PAR_MRKTID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParMrktid(Field<? extends Number> field) {
		setNumber(PAR_MRKTID, field);
	}
}
