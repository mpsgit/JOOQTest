/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_offr;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsOffr;
import org.jooq.udt.records.ObjOffrRecord;


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
public class AddProfile extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1561065492;

	/**
	 * The parameter <code>WETRN.PA_MAPS_OFFR.ADD_PROFILE.P_OFFR</code>.
	 */
	public static final Parameter<ObjOffrRecord> P_OFFR = createParameter("P_OFFR", org.jooq.udt.ObjOffr.OBJ_OFFR.getDataType(), false);

	/**
	 * Create a new routine call instance
	 */
	public AddProfile() {
		super("ADD_PROFILE", Wetrn.WETRN, PaMapsOffr.PA_MAPS_OFFR);

		addInOutParameter(P_OFFR);
	}

	/**
	 * Set the <code>P_OFFR</code> parameter IN value to the routine
	 */
	public void setPOffr(ObjOffrRecord value) {
		setValue(P_OFFR, value);
	}

	/**
	 * Get the <code>P_OFFR</code> parameter OUT value from the routine
	 */
	public ObjOffrRecord getPOffr() {
		return getValue(P_OFFR);
	}
}
