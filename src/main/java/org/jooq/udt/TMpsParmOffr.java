/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TMpsParmOffrRecord;


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
public class TMpsParmOffr extends UDTImpl<TMpsParmOffrRecord> {

	private static final long serialVersionUID = 1817366428;

	/**
	 * The reference instance of <code>WETRN.T_MPS_PARM_OFFR</code>
	 */
	public static final TMpsParmOffr T_MPS_PARM_OFFR = new TMpsParmOffr();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TMpsParmOffrRecord> getRecordType() {
		return TMpsParmOffrRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_MPS_PARM_OFFR.OFFR_ID</code>.
	 */
	public static final UDTField<TMpsParmOffrRecord, BigDecimal> OFFR_ID = createField("OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC, T_MPS_PARM_OFFR, "");

	/**
	 * The attribute <code>WETRN.T_MPS_PARM_OFFR.SEQ_NR</code>.
	 */
	public static final UDTField<TMpsParmOffrRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC, T_MPS_PARM_OFFR, "");

	/**
	 * No further instances allowed
	 */
	private TMpsParmOffr() {
		super("T_MPS_PARM_OFFR", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}