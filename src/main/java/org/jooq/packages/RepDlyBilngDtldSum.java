/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.rep_dly_bilng_dtld_sum.GetdataNew;


/**
 * Convenience access to all stored procedures and functions in REP_DLY_BILNG_DTLD_SUM
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RepDlyBilngDtldSum extends PackageImpl {

	private static final long serialVersionUID = 283233936;

	/**
	 * The reference instance of <code>WETRN.REP_DLY_BILNG_DTLD_SUM</code>
	 */
	public static final RepDlyBilngDtldSum REP_DLY_BILNG_DTLD_SUM = new RepDlyBilngDtldSum();

	/**
	 * Call <code>WETRN.REP_DLY_BILNG_DTLD_SUM.GETDATA_NEW</code>
	 */
	public static Result<Record> getdataNew(Configuration configuration, Number pClusterId, Number pMrktId, Number pCosPerdId, String pCooPerdIds, String pAutoStatus, String pManualStatus, Number pFscCd, Result<Record> resultNew) {
		GetdataNew p = new GetdataNew();
		p.setPClusterId(pClusterId);
		p.setPMrktId(pMrktId);
		p.setPCosPerdId(pCosPerdId);
		p.setPCooPerdIds(pCooPerdIds);
		p.setPAutoStatus(pAutoStatus);
		p.setPManualStatus(pManualStatus);
		p.setPFscCd(pFscCd);
		p.setResultNew(resultNew);

		p.execute(configuration);
		return p.getResultNew();
	}

	/**
	 * No further instances allowed
	 */
	private RepDlyBilngDtldSum() {
		super("REP_DLY_BILNG_DTLD_SUM", Wetrn.WETRN);
	}
}