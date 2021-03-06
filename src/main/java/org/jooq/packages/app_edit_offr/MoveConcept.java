/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_edit_offr;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppEditOffr;


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
public class MoveConcept extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -2045591916;

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.MOVE_CONCEPT.P_OFFR_ID</code>.
	 */
	public static final Parameter<String> P_OFFR_ID = createParameter("P_OFFR_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.MOVE_CONCEPT.P_PRFL_CD</code>.
	 */
	public static final Parameter<String> P_PRFL_CD = createParameter("P_PRFL_CD", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.MOVE_CONCEPT.P_SIDE</code>.
	 */
	public static final Parameter<String> P_SIDE = createParameter("P_SIDE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.MOVE_CONCEPT.P_NEW_SIDE</code>.
	 */
	public static final Parameter<String> P_NEW_SIDE = createParameter("P_NEW_SIDE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.MOVE_CONCEPT.P_OFFSET</code>.
	 */
	public static final Parameter<String> P_OFFSET = createParameter("P_OFFSET", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.MOVE_CONCEPT.P_NEW_OFFSET</code>.
	 */
	public static final Parameter<String> P_NEW_OFFSET = createParameter("P_NEW_OFFSET", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.MOVE_CONCEPT.P_USER_ID</code>.
	 */
	public static final Parameter<String> P_USER_ID = createParameter("P_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.MOVE_CONCEPT.P_STATUS</code>.
	 */
	public static final Parameter<String> P_STATUS = createParameter("P_STATUS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public MoveConcept() {
		super("MOVE_CONCEPT", Wetrn.WETRN, AppEditOffr.APP_EDIT_OFFR);

		addInParameter(P_OFFR_ID);
		addInParameter(P_PRFL_CD);
		addInParameter(P_SIDE);
		addInParameter(P_NEW_SIDE);
		addInParameter(P_OFFSET);
		addInParameter(P_NEW_OFFSET);
		addInParameter(P_USER_ID);
		addOutParameter(P_STATUS);
	}

	/**
	 * Set the <code>P_OFFR_ID</code> parameter IN value to the routine
	 */
	public void setPOffrId(String value) {
		setValue(P_OFFR_ID, value);
	}

	/**
	 * Set the <code>P_PRFL_CD</code> parameter IN value to the routine
	 */
	public void setPPrflCd(String value) {
		setValue(P_PRFL_CD, value);
	}

	/**
	 * Set the <code>P_SIDE</code> parameter IN value to the routine
	 */
	public void setPSide(String value) {
		setValue(P_SIDE, value);
	}

	/**
	 * Set the <code>P_NEW_SIDE</code> parameter IN value to the routine
	 */
	public void setPNewSide(String value) {
		setValue(P_NEW_SIDE, value);
	}

	/**
	 * Set the <code>P_OFFSET</code> parameter IN value to the routine
	 */
	public void setPOffset(String value) {
		setValue(P_OFFSET, value);
	}

	/**
	 * Set the <code>P_NEW_OFFSET</code> parameter IN value to the routine
	 */
	public void setPNewOffset(String value) {
		setValue(P_NEW_OFFSET, value);
	}

	/**
	 * Set the <code>P_USER_ID</code> parameter IN value to the routine
	 */
	public void setPUserId(String value) {
		setValue(P_USER_ID, value);
	}

	/**
	 * Get the <code>P_STATUS</code> parameter OUT value from the routine
	 */
	public String getPStatus() {
		return getValue(P_STATUS);
	}
}
