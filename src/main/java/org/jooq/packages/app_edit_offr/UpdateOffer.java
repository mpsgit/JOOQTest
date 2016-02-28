/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.app_edit_offr;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.AppEditOffr;
import org.jooq.udt.records.TblEditOffrDataRecord;


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
public class UpdateOffer extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 137609257;

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.UPDATE_OFFER.P_TBL_OFFR_DTLS</code>.
	 */
	public static final Parameter<TblEditOffrDataRecord> P_TBL_OFFR_DTLS = createParameter("P_TBL_OFFR_DTLS", org.jooq.udt.TEditOffrData.T_EDIT_OFFR_DATA.getDataType().asArrayDataType(org.jooq.udt.records.TblEditOffrDataRecord.class), false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.UPDATE_OFFER.P_UNLOCK_FLAG</code>.
	 */
	public static final Parameter<String> P_UNLOCK_FLAG = createParameter("P_UNLOCK_FLAG", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.UPDATE_OFFER.P_USER_ID</code>.
	 */
	public static final Parameter<String> P_USER_ID = createParameter("P_USER_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.UPDATE_OFFER.P_RECALC_FLAG</code>.
	 */
	public static final Parameter<String> P_RECALC_FLAG = createParameter("P_RECALC_FLAG", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.UPDATE_OFFER.P_ONDEMAND_FLAG</code>.
	 */
	public static final Parameter<String> P_ONDEMAND_FLAG = createParameter("P_ONDEMAND_FLAG", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.APP_EDIT_OFFR.UPDATE_OFFER.P_STATUS</code>.
	 */
	public static final Parameter<String> P_STATUS = createParameter("P_STATUS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public UpdateOffer() {
		super("UPDATE_OFFER", Wetrn.WETRN, AppEditOffr.APP_EDIT_OFFR);

		addInParameter(P_TBL_OFFR_DTLS);
		addInParameter(P_UNLOCK_FLAG);
		addInParameter(P_USER_ID);
		addInParameter(P_RECALC_FLAG);
		addInParameter(P_ONDEMAND_FLAG);
		addOutParameter(P_STATUS);
	}

	/**
	 * Set the <code>P_TBL_OFFR_DTLS</code> parameter IN value to the routine
	 */
	public void setPTblOffrDtls(TblEditOffrDataRecord value) {
		setValue(P_TBL_OFFR_DTLS, value);
	}

	/**
	 * Set the <code>P_UNLOCK_FLAG</code> parameter IN value to the routine
	 */
	public void setPUnlockFlag(String value) {
		setValue(P_UNLOCK_FLAG, value);
	}

	/**
	 * Set the <code>P_USER_ID</code> parameter IN value to the routine
	 */
	public void setPUserId(String value) {
		setValue(P_USER_ID, value);
	}

	/**
	 * Set the <code>P_RECALC_FLAG</code> parameter IN value to the routine
	 */
	public void setPRecalcFlag(String value) {
		setValue(P_RECALC_FLAG, value);
	}

	/**
	 * Set the <code>P_ONDEMAND_FLAG</code> parameter IN value to the routine
	 */
	public void setPOndemandFlag(String value) {
		setValue(P_ONDEMAND_FLAG, value);
	}

	/**
	 * Get the <code>P_STATUS</code> parameter OUT value from the routine
	 */
	public String getPStatus() {
		return getValue(P_STATUS);
	}
}