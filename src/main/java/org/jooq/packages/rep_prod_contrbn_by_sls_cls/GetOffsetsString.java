/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.rep_prod_contrbn_by_sls_cls;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.RepProdContrbnBySlsCls;


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
public class GetOffsetsString extends AbstractRoutine<String> {

	private static final long serialVersionUID = -169824697;

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_OFFSETS_STRING.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_OFFSETS_STRING.P_MRKT_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_MRKT_ID = createParameter("P_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_OFFSETS_STRING.P_OFFR_PERD_ID</code>.
	 */
	public static final Parameter<BigDecimal> P_OFFR_PERD_ID = createParameter("P_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_OFFSETS_STRING.P_MIN_OFFSET</code>.
	 */
	public static final Parameter<BigDecimal> P_MIN_OFFSET = createParameter("P_MIN_OFFSET", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_OFFSETS_STRING.P_MAX_OFFSET</code>.
	 */
	public static final Parameter<BigDecimal> P_MAX_OFFSET = createParameter("P_MAX_OFFSET", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_OFFSETS_STRING.P_COO</code>.
	 */
	public static final Parameter<BigDecimal> P_COO = createParameter("P_COO", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_OFFSETS_STRING.P_PERD_TYP</code>.
	 */
	public static final Parameter<String> P_PERD_TYP = createParameter("P_PERD_TYP", org.jooq.impl.SQLDataType.CHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetOffsetsString() {
		super("GET_OFFSETS_STRING", Wetrn.WETRN, RepProdContrbnBySlsCls.REP_PROD_CONTRBN_BY_SLS_CLS, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_MRKT_ID);
		addInParameter(P_OFFR_PERD_ID);
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
