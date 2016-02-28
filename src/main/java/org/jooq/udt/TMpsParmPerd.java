/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TMpsParmPerdRecord;


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
public class TMpsParmPerd extends UDTImpl<TMpsParmPerdRecord> {

	private static final long serialVersionUID = -1350502303;

	/**
	 * The reference instance of <code>WETRN.T_MPS_PARM_PERD</code>
	 */
	public static final TMpsParmPerd T_MPS_PARM_PERD = new TMpsParmPerd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TMpsParmPerdRecord> getRecordType() {
		return TMpsParmPerdRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_MPS_PARM_PERD.PERD_ID</code>.
	 */
	public static final UDTField<TMpsParmPerdRecord, BigDecimal> PERD_ID = createField("PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, T_MPS_PARM_PERD, "");

	/**
	 * The attribute <code>WETRN.T_MPS_PARM_PERD.REF_MRKT_ID</code>.
	 */
	public static final UDTField<TMpsParmPerdRecord, BigDecimal> REF_MRKT_ID = createField("REF_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, T_MPS_PARM_PERD, "");

	/**
	 * The attribute <code>WETRN.T_MPS_PARM_PERD.RTAIN_SLS_PRC_IND</code>.
	 */
	public static final UDTField<TMpsParmPerdRecord, String> RTAIN_SLS_PRC_IND = createField("RTAIN_SLS_PRC_IND", org.jooq.impl.SQLDataType.CHAR.length(1), T_MPS_PARM_PERD, "");

	/**
	 * The attribute <code>WETRN.T_MPS_PARM_PERD.COPY_UNITS_RUL_ID</code>.
	 */
	public static final UDTField<TMpsParmPerdRecord, BigDecimal> COPY_UNITS_RUL_ID = createField("COPY_UNITS_RUL_ID", org.jooq.impl.SQLDataType.NUMERIC, T_MPS_PARM_PERD, "");

	/**
	 * The attribute <code>WETRN.T_MPS_PARM_PERD.SEQ_NR</code>.
	 */
	public static final UDTField<TMpsParmPerdRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC, T_MPS_PARM_PERD, "");

	/**
	 * No further instances allowed
	 */
	private TMpsParmPerd() {
		super("T_MPS_PARM_PERD", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}
