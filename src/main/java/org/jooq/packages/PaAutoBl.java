/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.pa_auto_bl.AutoBlAssignment;


/**
 * Convenience access to all stored procedures and functions in PA_AUTO_BL
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaAutoBl extends PackageImpl {

	private static final long serialVersionUID = -2092291991;

	/**
	 * The reference instance of <code>WETRN.PA_AUTO_BL</code>
	 */
	public static final PaAutoBl PA_AUTO_BL = new PaAutoBl();

	/**
	 * Call <code>WETRN.PA_AUTO_BL.AUTO_BL_ASSIGNMENT</code>
	 */
	public static void autoBlAssignment(Configuration configuration) {
		AutoBlAssignment p = new AutoBlAssignment();

		p.execute(configuration);
	}

	/**
	 * No further instances allowed
	 */
	private PaAutoBl() {
		super("PA_AUTO_BL", Wetrn.WETRN);
	}
}