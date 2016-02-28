/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TSaAutoMatchRecord;
import org.jooq.udt.records.TblDlyBlngIdsRecord;


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
public class TSaAutoMatch extends UDTImpl<TSaAutoMatchRecord> {

	private static final long serialVersionUID = -683490061;

	/**
	 * The reference instance of <code>WETRN.T_SA_AUTO_MATCH</code>
	 */
	public static final TSaAutoMatch T_SA_AUTO_MATCH = new TSaAutoMatch();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TSaAutoMatchRecord> getRecordType() {
		return TSaAutoMatchRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.NEW_RECORD</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, String> NEW_RECORD = createField("NEW_RECORD", org.jooq.impl.SQLDataType.CHAR.length(1), T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DMS_MRKT_ID</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DMS_MRKT_ID = createField("DMS_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DMS_SLS_PERD_ID</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DMS_SLS_PERD_ID = createField("DMS_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DMS_OFFR_PERD_ID</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DMS_OFFR_PERD_ID = createField("DMS_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DMS_OFFR_SKU_LINE_ID</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DMS_OFFR_SKU_LINE_ID = createField("DMS_OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DMS_SLS_TYP_ID</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DMS_SLS_TYP_ID = createField("DMS_SLS_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DMS_VEH_ID</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DMS_VEH_ID = createField("DMS_VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DMS_UNIT_QTY</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DMS_UNIT_QTY = createField("DMS_UNIT_QTY", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DMS_COMSN_AMT</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DMS_COMSN_AMT = createField("DMS_COMSN_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DMS_TAX_AMT</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DMS_TAX_AMT = createField("DMS_TAX_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DMS_NEW_NET_TO_AVON_FCT</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DMS_NEW_NET_TO_AVON_FCT = createField("DMS_NEW_NET_TO_AVON_FCT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DMS_COST_AMT</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DMS_COST_AMT = createField("DMS_COST_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DLY_UNIT_QTY</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DLY_UNIT_QTY = createField("DLY_UNIT_QTY", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DLY_COMSN_AMT</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DLY_COMSN_AMT = createField("DLY_COMSN_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DLY_TAX_AMT</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DLY_TAX_AMT = createField("DLY_TAX_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DMS_SLS_PRC_AMT</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DMS_SLS_PRC_AMT = createField("DMS_SLS_PRC_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DMS_NR_FOR_QTY</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DMS_NR_FOR_QTY = createField("DMS_NR_FOR_QTY", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DLY_BILNG_IDS</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, TblDlyBlngIdsRecord> DLY_BILNG_IDS = createField("DLY_BILNG_IDS", org.jooq.udt.TDlyBlngId.T_DLY_BLNG_ID.getDataType().asArrayDataType(org.jooq.udt.records.TblDlyBlngIdsRecord.class), T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.MATCH_TYPE</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, String> MATCH_TYPE = createField("MATCH_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(255), T_SA_AUTO_MATCH, "");

	/**
	 * The attribute <code>WETRN.T_SA_AUTO_MATCH.DMS_LINE_NR</code>.
	 */
	public static final UDTField<TSaAutoMatchRecord, BigDecimal> DMS_LINE_NR = createField("DMS_LINE_NR", org.jooq.impl.SQLDataType.NUMERIC, T_SA_AUTO_MATCH, "");

	/**
	 * No further instances allowed
	 */
	private TSaAutoMatch() {
		super("T_SA_AUTO_MATCH", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}