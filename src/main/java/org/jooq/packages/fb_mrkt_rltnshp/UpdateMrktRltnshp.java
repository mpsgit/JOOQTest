/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.fb_mrkt_rltnshp;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.FbMrktRltnshp;
import org.jooq.udt.records.TtblRltnshpDtlRecord;


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
public class UpdateMrktRltnshp extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1623722889;

	/**
	 * The parameter <code>WETRN.FB_MRKT_RLTNSHP.UPDATE_MRKT_RLTNSHP.P_RLTNSHP_DTLS</code>.
	 */
	public static final Parameter<TtblRltnshpDtlRecord> P_RLTNSHP_DTLS = createParameter("P_RLTNSHP_DTLS", org.jooq.udt.TypRltnshpDtl.TYP_RLTNSHP_DTL.getDataType().asArrayDataType(org.jooq.udt.records.TtblRltnshpDtlRecord.class), false);

	/**
	 * The parameter <code>WETRN.FB_MRKT_RLTNSHP.UPDATE_MRKT_RLTNSHP.P_RLTNSHP_TYP_ID</code>.
	 */
	public static final Parameter<String> P_RLTNSHP_TYP_ID = createParameter("P_RLTNSHP_TYP_ID", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.FB_MRKT_RLTNSHP.UPDATE_MRKT_RLTNSHP.P_DML</code>.
	 */
	public static final Parameter<String> P_DML = createParameter("P_DML", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.FB_MRKT_RLTNSHP.UPDATE_MRKT_RLTNSHP.DML_STATUS</code>.
	 */
	public static final Parameter<String> DML_STATUS = createParameter("DML_STATUS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>WETRN.FB_MRKT_RLTNSHP.UPDATE_MRKT_RLTNSHP.MARKET_IDS</code>.
	 */
	public static final Parameter<String> MARKET_IDS = createParameter("MARKET_IDS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public UpdateMrktRltnshp() {
		super("UPDATE_MRKT_RLTNSHP", Wetrn.WETRN, FbMrktRltnshp.FB_MRKT_RLTNSHP);

		addInParameter(P_RLTNSHP_DTLS);
		addInParameter(P_RLTNSHP_TYP_ID);
		addInParameter(P_DML);
		addOutParameter(DML_STATUS);
		addOutParameter(MARKET_IDS);
	}

	/**
	 * Set the <code>P_RLTNSHP_DTLS</code> parameter IN value to the routine
	 */
	public void setPRltnshpDtls(TtblRltnshpDtlRecord value) {
		setValue(P_RLTNSHP_DTLS, value);
	}

	/**
	 * Set the <code>P_RLTNSHP_TYP_ID</code> parameter IN value to the routine
	 */
	public void setPRltnshpTypId(String value) {
		setValue(P_RLTNSHP_TYP_ID, value);
	}

	/**
	 * Set the <code>P_DML</code> parameter IN value to the routine
	 */
	public void setPDml(String value) {
		setValue(P_DML, value);
	}

	/**
	 * Get the <code>DML_STATUS</code> parameter OUT value from the routine
	 */
	public String getDmlStatus() {
		return getValue(DML_STATUS);
	}

	/**
	 * Get the <code>MARKET_IDS</code> parameter OUT value from the routine
	 */
	public String getMarketIds() {
		return getValue(MARKET_IDS);
	}
}