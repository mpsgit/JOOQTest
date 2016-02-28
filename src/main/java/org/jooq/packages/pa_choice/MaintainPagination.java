/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_choice;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaChoice;


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
public class MaintainPagination extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -533926307;

	/**
	 * The parameter <code>WETRN.PA_CHOICE.MAINTAIN_PAGINATION.P_ACTION</code>.
	 */
	public static final Parameter<String> P_ACTION = createParameter("P_ACTION", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public MaintainPagination() {
		super("MAINTAIN_PAGINATION", Wetrn.WETRN, PaChoice.PA_CHOICE);

		addInParameter(P_ACTION);
	}

	/**
	 * Set the <code>P_ACTION</code> parameter IN value to the routine
	 */
	public void setPAction(String value) {
		setValue(P_ACTION, value);
	}
}