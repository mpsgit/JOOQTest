/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.rep_prod_contrbn_by_sls_cls;


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
public class GetSlsClsDesc extends AbstractRoutine<String> {

	private static final long serialVersionUID = -892021757;

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_SLS_CLS_DESC.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.REP_PROD_CONTRBN_BY_SLS_CLS.GET_SLS_CLS_DESC.SLS_CLS_CODE</code>.
	 */
	public static final Parameter<String> SLS_CLS_CODE = createParameter("SLS_CLS_CODE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public GetSlsClsDesc() {
		super("GET_SLS_CLS_DESC", Wetrn.WETRN, RepProdContrbnBySlsCls.REP_PROD_CONTRBN_BY_SLS_CLS, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(SLS_CLS_CODE);
	}

	/**
	 * Set the <code>SLS_CLS_CODE</code> parameter IN value to the routine
	 */
	public void setSlsClsCode(String value) {
		setValue(SLS_CLS_CODE, value);
	}

	/**
	 * Set the <code>SLS_CLS_CODE</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setSlsClsCode(Field<String> field) {
		setField(SLS_CLS_CODE, field);
	}
}
