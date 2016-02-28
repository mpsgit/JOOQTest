/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TMpsParmMrktRecord;


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
public class TMpsParmMrkt extends UDTImpl<TMpsParmMrktRecord> {

	private static final long serialVersionUID = -1018435617;

	/**
	 * The reference instance of <code>WETRN.T_MPS_PARM_MRKT</code>
	 */
	public static final TMpsParmMrkt T_MPS_PARM_MRKT = new TMpsParmMrkt();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TMpsParmMrktRecord> getRecordType() {
		return TMpsParmMrktRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_MPS_PARM_MRKT.MRKT_ID</code>.
	 */
	public static final UDTField<TMpsParmMrktRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, T_MPS_PARM_MRKT, "");

	/**
	 * The attribute <code>WETRN.T_MPS_PARM_MRKT.RTAIN_SLS_PRC_IND</code>.
	 */
	public static final UDTField<TMpsParmMrktRecord, String> RTAIN_SLS_PRC_IND = createField("RTAIN_SLS_PRC_IND", org.jooq.impl.SQLDataType.CHAR.length(1), T_MPS_PARM_MRKT, "");

	/**
	 * The attribute <code>WETRN.T_MPS_PARM_MRKT.COPY_UNITS_RUL_ID</code>.
	 */
	public static final UDTField<TMpsParmMrktRecord, BigDecimal> COPY_UNITS_RUL_ID = createField("COPY_UNITS_RUL_ID", org.jooq.impl.SQLDataType.NUMERIC, T_MPS_PARM_MRKT, "");

	/**
	 * The attribute <code>WETRN.T_MPS_PARM_MRKT.SEQ_NR</code>.
	 */
	public static final UDTField<TMpsParmMrktRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC, T_MPS_PARM_MRKT, "");

	/**
	 * No further instances allowed
	 */
	private TMpsParmMrkt() {
		super("T_MPS_PARM_MRKT", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}
