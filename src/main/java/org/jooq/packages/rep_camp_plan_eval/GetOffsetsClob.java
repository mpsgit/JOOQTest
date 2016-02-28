/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.rep_camp_plan_eval;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.RepCampPlanEval;


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
public class GetOffsetsClob extends AbstractRoutine<String> {

	private static final long serialVersionUID = -1004227696;

	/**
	 * The parameter <code>WETRN.REP_CAMP_PLAN_EVAL.GET_OFFSETS_CLOB.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false);

	/**
	 * The parameter <code>WETRN.REP_CAMP_PLAN_EVAL.GET_OFFSETS_CLOB.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_CAMP_PLAN_EVAL.GET_OFFSETS_CLOB.P_FROM_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_FROM_PERD_ID = createParameter("P_FROM_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_CAMP_PLAN_EVAL.GET_OFFSETS_CLOB.P_TO_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_TO_PERD_ID = createParameter("P_TO_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_CAMP_PLAN_EVAL.GET_OFFSETS_CLOB.P_MIN_OFFSET</code>.
	 */
	public static final Parameter<BigDecimal> P_MIN_OFFSET = createParameter("P_MIN_OFFSET", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_CAMP_PLAN_EVAL.GET_OFFSETS_CLOB.P_MAX_OFFSET</code>.
	 */
	public static final Parameter<BigDecimal> P_MAX_OFFSET = createParameter("P_MAX_OFFSET", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_CAMP_PLAN_EVAL.GET_OFFSETS_CLOB.P_COO</code>.
	 */
	public static final Parameter<BigDecimal> P_COO = createParameter("P_COO", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_CAMP_PLAN_EVAL.GET_OFFSETS_CLOB.P_PERD_TYP</code>.
	 */
	public static final Parameter<String> P_PERD_TYP = createParameter("P_PERD_TYP", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetOffsetsClob() {
		super("GET_OFFSETS_CLOB", Wetrn.WETRN, RepCampPlanEval.REP_CAMP_PLAN_EVAL, org.jooq.impl.SQLDataType.CLOB);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_FROM_PERD_ID);
		addInParameter(P_TO_PERD_ID);
		addInParameter(P_MIN_OFFSET);
		addInParameter(P_MAX_OFFSET);
		addInParameter(P_COO);
		addInParameter(P_PERD_TYP);
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
	 * Set the <code>P_FROM_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPFromPerdId(Number value) {
		setNumber(P_FROM_PERD_ID, value);
	}

	/**
	 * Set the <code>P_FROM_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPFromPerdId(Field<? extends Number> field) {
		setNumber(P_FROM_PERD_ID, field);
	}

	/**
	 * Set the <code>P_TO_PERD_ID</code> parameter IN value to the routine
	 */
	public void setPToPerdId(Number value) {
		setNumber(P_TO_PERD_ID, value);
	}

	/**
	 * Set the <code>P_TO_PERD_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPToPerdId(Field<? extends Number> field) {
		setNumber(P_TO_PERD_ID, field);
	}

	/**
	 * Set the <code>P_MIN_OFFSET</code> parameter IN value to the routine
	 */
	public void setPMinOffset(Number value) {
		setNumber(P_MIN_OFFSET, value);
	}

	/**
	 * Set the <code>P_MIN_OFFSET</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMinOffset(Field<? extends Number> field) {
		setNumber(P_MIN_OFFSET, field);
	}

	/**
	 * Set the <code>P_MAX_OFFSET</code> parameter IN value to the routine
	 */
	public void setPMaxOffset(Number value) {
		setNumber(P_MAX_OFFSET, value);
	}

	/**
	 * Set the <code>P_MAX_OFFSET</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPMaxOffset(Field<? extends Number> field) {
		setNumber(P_MAX_OFFSET, field);
	}

	/**
	 * Set the <code>P_COO</code> parameter IN value to the routine
	 */
	public void setPCoo(Number value) {
		setNumber(P_COO, value);
	}

	/**
	 * Set the <code>P_COO</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPCoo(Field<? extends Number> field) {
		setNumber(P_COO, field);
	}

	/**
	 * Set the <code>P_PERD_TYP</code> parameter IN value to the routine
	 */
	public void setPPerdTyp(String value) {
		setValue(P_PERD_TYP, value);
	}

	/**
	 * Set the <code>P_PERD_TYP</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPPerdTyp(Field<String> field) {
		setField(P_PERD_TYP, field);
	}
}
