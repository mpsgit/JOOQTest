/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.THkMrktRltnshpAddRecord;


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
public class THkMrktRltnshpAdd extends UDTImpl<THkMrktRltnshpAddRecord> {

	private static final long serialVersionUID = 355567138;

	/**
	 * The reference instance of <code>WETRN.T_HK_MRKT_RLTNSHP_ADD</code>
	 */
	public static final THkMrktRltnshpAdd T_HK_MRKT_RLTNSHP_ADD = new THkMrktRltnshpAdd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<THkMrktRltnshpAddRecord> getRecordType() {
		return THkMrktRltnshpAddRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.SRCE_MRKT_ID</code>.
	 */
	public static final UDTField<THkMrktRltnshpAddRecord, BigDecimal> SRCE_MRKT_ID = createField("SRCE_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, T_HK_MRKT_RLTNSHP_ADD, "");

	/**
	 * The attribute <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.SRCE_MRKT_NM</code>.
	 */
	public static final UDTField<THkMrktRltnshpAddRecord, String> SRCE_MRKT_NM = createField("SRCE_MRKT_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_HK_MRKT_RLTNSHP_ADD, "");

	/**
	 * The attribute <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.TRGT_MRKT_ID</code>.
	 */
	public static final UDTField<THkMrktRltnshpAddRecord, BigDecimal> TRGT_MRKT_ID = createField("TRGT_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, T_HK_MRKT_RLTNSHP_ADD, "");

	/**
	 * The attribute <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.TRGT_STRT_OFFR_PERD_ID</code>.
	 */
	public static final UDTField<THkMrktRltnshpAddRecord, BigDecimal> TRGT_STRT_OFFR_PERD_ID = createField("TRGT_STRT_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, T_HK_MRKT_RLTNSHP_ADD, "");

	/**
	 * The attribute <code>WETRN.T_HK_MRKT_RLTNSHP_ADD.TRGT_END_OFFR_PERD_ID</code>.
	 */
	public static final UDTField<THkMrktRltnshpAddRecord, BigDecimal> TRGT_END_OFFR_PERD_ID = createField("TRGT_END_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, T_HK_MRKT_RLTNSHP_ADD, "");

	/**
	 * No further instances allowed
	 */
	private THkMrktRltnshpAdd() {
		super("T_HK_MRKT_RLTNSHP_ADD", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}
