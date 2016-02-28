/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TSaForcMatchRawRecord;


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
public class TSaForcMatchRaw extends UDTImpl<TSaForcMatchRawRecord> {

	private static final long serialVersionUID = -976312162;

	/**
	 * The reference instance of <code>WETRN.T_SA_FORC_MATCH_RAW</code>
	 */
	public static final TSaForcMatchRaw T_SA_FORC_MATCH_RAW = new TSaForcMatchRaw();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TSaForcMatchRawRecord> getRecordType() {
		return TSaForcMatchRawRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_VEHICLE_ID</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_VEHICLE_ID = createField("PLANNED_VEHICLE_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_OFFER_ID</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_OFFER_ID = createField("PLANNED_OFFER_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_PRFL_CD</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_PRFL_CD = createField("PLANNED_PRFL_CD", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_OFFR_PRFL_PRCPT_ID</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_OFFR_PRFL_PRCPT_ID = createField("PLANNED_OFFR_PRFL_PRCPT_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_OFFER_DESCRIPTION</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, String> PLANNED_OFFER_DESCRIPTION = createField("PLANNED_OFFER_DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(4000), T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_CAMPAIGN_OF_OFFER</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_CAMPAIGN_OF_OFFER = createField("PLANNED_CAMPAIGN_OF_OFFER", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_MARKETING_CONCEPT</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, String> PLANNED_MARKETING_CONCEPT = createField("PLANNED_MARKETING_CONCEPT", org.jooq.impl.SQLDataType.VARCHAR.length(4000), T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_SELLING_PRICE</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_SELLING_PRICE = createField("PLANNED_SELLING_PRICE", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_NUMBER_FOR_QUANTITY</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_NUMBER_FOR_QUANTITY = createField("PLANNED_NUMBER_FOR_QUANTITY", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_PROMOTION_CLAIM_ID</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_PROMOTION_CLAIM_ID = createField("PLANNED_PROMOTION_CLAIM_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_PROMOTION_CLAIM</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, String> PLANNED_PROMOTION_CLAIM = createField("PLANNED_PROMOTION_CLAIM", org.jooq.impl.SQLDataType.VARCHAR.length(4000), T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_GTA</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_GTA = createField("PLANNED_GTA", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_OFFR_SKU_LINE_ID</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_OFFR_SKU_LINE_ID = createField("PLANNED_OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_FSC_CD</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_FSC_CD = createField("PLANNED_FSC_CD", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_FSC_DESC</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, String> PLANNED_FSC_DESC = createField("PLANNED_FSC_DESC", org.jooq.impl.SQLDataType.VARCHAR.length(4000), T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_ITEM_NUMBER</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_ITEM_NUMBER = createField("PLANNED_ITEM_NUMBER", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_ITEM_DESC</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, String> PLANNED_ITEM_DESC = createField("PLANNED_ITEM_DESC", org.jooq.impl.SQLDataType.VARCHAR.length(4000), T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_LINE_NUMBER</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_LINE_NUMBER = createField("PLANNED_LINE_NUMBER", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_ESTIMATE_UNITS</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_ESTIMATE_UNITS = createField("PLANNED_ESTIMATE_UNITS", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_DEMAND_UNITS</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_DEMAND_UNITS = createField("PLANNED_DEMAND_UNITS", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_BILLED_UNITS</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_BILLED_UNITS = createField("PLANNED_BILLED_UNITS", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_FRC_MTCH_MTHD_ID</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_FRC_MTCH_MTHD_ID = createField("PLANNED_FRC_MTCH_MTHD_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_DEMAND_GTA</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_DEMAND_GTA = createField("PLANNED_DEMAND_GTA", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_BILLED_GTA</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_BILLED_GTA = createField("PLANNED_BILLED_GTA", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_DEMAND_COMSN_AMT</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_DEMAND_COMSN_AMT = createField("PLANNED_DEMAND_COMSN_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_BILLED_COMSN_AMT</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_BILLED_COMSN_AMT = createField("PLANNED_BILLED_COMSN_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_DEMAND_TAX_AMT</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_DEMAND_TAX_AMT = createField("PLANNED_DEMAND_TAX_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_BILLED_TAX_AMT</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_BILLED_TAX_AMT = createField("PLANNED_BILLED_TAX_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_BILNG_ID</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> DLY_BILNG_ID = createField("DLY_BILNG_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_MRKT_ID</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> DLY_MRKT_ID = createField("DLY_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_OFFR_PERD_ID</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> DLY_OFFR_PERD_ID = createField("DLY_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_SLS_PRC_AMT</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> DLY_SLS_PRC_AMT = createField("DLY_SLS_PRC_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_NR_FOR_QTY</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> DLY_NR_FOR_QTY = createField("DLY_NR_FOR_QTY", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_COMSN_AMT</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> DLY_COMSN_AMT = createField("DLY_COMSN_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_TAX_AMT</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> DLY_TAX_AMT = createField("DLY_TAX_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_BILNG_LINE_NR</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> DLY_BILNG_LINE_NR = createField("DLY_BILNG_LINE_NR", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_SLS_TYP_ID</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> DLY_SLS_TYP_ID = createField("DLY_SLS_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_SKU_ID</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> DLY_SKU_ID = createField("DLY_SKU_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_UNIT_QTY</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> DLY_UNIT_QTY = createField("DLY_UNIT_QTY", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_FSC_CD</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, String> DLY_FSC_CD = createField("DLY_FSC_CD", org.jooq.impl.SQLDataType.VARCHAR.length(255), T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_FSC_DESC</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, String> DLY_FSC_DESC = createField("DLY_FSC_DESC", org.jooq.impl.SQLDataType.VARCHAR.length(4000), T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_OFFER_TYP</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, String> DLY_OFFER_TYP = createField("DLY_OFFER_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(4000), T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_VEHICLE_NAME</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, String> PLANNED_VEHICLE_NAME = createField("PLANNED_VEHICLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(4000), T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_PAYMENT_TYPE_ID</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, BigDecimal> PLANNED_PAYMENT_TYPE_ID = createField("PLANNED_PAYMENT_TYPE_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.PLANNED_PAYMENT_TYPE_NAME</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, String> PLANNED_PAYMENT_TYPE_NAME = createField("PLANNED_PAYMENT_TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(4000), T_SA_FORC_MATCH_RAW, "");

	/**
	 * The attribute <code>WETRN.T_SA_FORC_MATCH_RAW.DLY_SLS_CHNL</code>.
	 */
	public static final UDTField<TSaForcMatchRawRecord, String> DLY_SLS_CHNL = createField("DLY_SLS_CHNL", org.jooq.impl.SQLDataType.VARCHAR.length(255), T_SA_FORC_MATCH_RAW, "");

	/**
	 * No further instances allowed
	 */
	private TSaForcMatchRaw() {
		super("T_SA_FORC_MATCH_RAW", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}
