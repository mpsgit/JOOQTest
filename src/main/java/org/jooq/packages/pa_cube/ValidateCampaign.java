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
public class ValidateCampaign extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 1023859914;

	/**
	 * The parameter <code>WETRN.PA_CUBE.VALIDATE_CAMPAIGN.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_CUBE.VALIDATE_CAMPAIGN.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_CUBE.VALIDATE_CAMPAIGN.P_VEH_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_VEH_ID = createParameter("P_VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.PA_CUBE.VALIDATE_CAMPAIGN.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public ValidateCampaign() {
		super("VALIDATE_CAMPAIGN", Wetrn.WETRN, PaCube.PA_CUBE, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_VEH_ID);
		addInParameter(P_OFFR_PERD_ID);
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
	 * Set the <code>P_VEH_ID</code> parameter IN value to the routine
	 */
	public void setPVehId(Number value) {
		setNumber(P_VEH_ID, value);
	}

	/**
	 * Set the <code>P_VEH_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPVehId(Field<? extends Number> field) {
		setNumber(P_VEH_ID, field);
	}

	/**
	 * Set the <code>P_OFFR_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPOffrPerdId(Number value) {
		setNumber(P_OFFR_PERD_ID, value);
	}

	/**
	 * Set the <code>P_OFFR_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPOffrPerdId(Field<? extends Number> field) {
		setNumber(P_OFFR_PERD_ID, field);
	}
}