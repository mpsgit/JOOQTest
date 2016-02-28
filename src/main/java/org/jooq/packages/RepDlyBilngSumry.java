/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.rep_dly_bilng_sumry.Getdata;


/**
 * Convenience access to all stored procedures and functions in REP_DLY_BILNG_SUMRY
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RepDlyBilngSumry extends PackageImpl {

	private static final long serialVersionUID = -1345490126;

	/**
	 * The reference instance of <code>WETRN.REP_DLY_BILNG_SUMRY</code>
	 */
	public static final RepDlyBilngSumry REP_DLY_BILNG_SUMRY = new RepDlyBilngSumry();

	/**
	 * Call <code>WETRN.REP_DLY_BILNG_SUMRY.GETDATA</code>
	 */
	public static Object getdata(Configuration configuration, Number pClusterId, Number pMrktId, Number pCosPerdId, String pCooPerdIds, String pAutoStatus, String pManualStatus) {
		Getdata f = new Getdata();
		f.setPClusterId(pClusterId);
		f.setPMrktId(pMrktId);
		f.setPCosPerdId(pCosPerdId);
		f.setPCooPerdIds(pCooPerdIds);
		f.setPAutoStatus(pAutoStatus);
		f.setPManualStatus(pManualStatus);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_DLY_BILNG_SUMRY.GETDATA</code> as a field.
	 */
	public static Field<Object> getdata(Number pClusterId, Number pMrktId, Number pCosPerdId, String pCooPerdIds, String pAutoStatus, String pManualStatus) {
		Getdata f = new Getdata();
		f.setPClusterId(pClusterId);
		f.setPMrktId(pMrktId);
		f.setPCosPerdId(pCosPerdId);
		f.setPCooPerdIds(pCooPerdIds);
		f.setPAutoStatus(pAutoStatus);
		f.setPManualStatus(pManualStatus);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_DLY_BILNG_SUMRY.GETDATA</code> as a field.
	 */
	public static Field<Object> getdata(Field<? extends Number> pClusterId, Field<? extends Number> pMrktId, Field<? extends Number> pCosPerdId, Field<String> pCooPerdIds, Field<String> pAutoStatus, Field<String> pManualStatus) {
		Getdata f = new Getdata();
		f.setPClusterId(pClusterId);
		f.setPMrktId(pMrktId);
		f.setPCosPerdId(pCosPerdId);
		f.setPCooPerdIds(pCooPerdIds);
		f.setPAutoStatus(pAutoStatus);
		f.setPManualStatus(pManualStatus);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private RepDlyBilngSumry() {
		super("REP_DLY_BILNG_SUMRY", Wetrn.WETRN);
	}
}
