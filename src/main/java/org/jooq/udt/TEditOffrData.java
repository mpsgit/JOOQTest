/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TEditOffrDataRecord;
import org.jooq.udt.records.TblEditOffrCncptDataRecord;
import org.jooq.udt.records.TblEditOffrMsDataRecord;
import org.jooq.udt.records.TblEditOffrPlndTrgtMtrcsRecord;
import org.jooq.udt.records.TblEditOffrTransDataRecord;
import org.jooq.udt.records.TblEditOffrTrgtMrtcsRecord;


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
public class TEditOffrData extends UDTImpl<TEditOffrDataRecord> {

	private static final long serialVersionUID = 257720793;

	/**
	 * The reference instance of <code>WETRN.T_EDIT_OFFR_DATA</code>
	 */
	public static final TEditOffrData T_EDIT_OFFR_DATA = new TEditOffrData();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TEditOffrDataRecord> getRecordType() {
		return TEditOffrDataRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.MRKT_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.MRKT_NM</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> MRKT_NM = createField("MRKT_NM", org.jooq.impl.SQLDataType.VARCHAR.length(25), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.VEH_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.VEH_NAME</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> VEH_NAME = createField("VEH_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(150), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_PERD_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.VER_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> VER_ID = createField("VER_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.VER_DESC_TXT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> VER_DESC_TXT = createField("VER_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.REP_CNT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> REP_CNT = createField("REP_CNT", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.ORD_CNT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> ORD_CNT = createField("ORD_CNT", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.LOCKED_USER_NM</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> LOCKED_USER_NM = createField("LOCKED_USER_NM", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.LOCKED_TIME_STAMP</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> LOCKED_TIME_STAMP = createField("LOCKED_TIME_STAMP", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.CMPGN_LOCK_IND</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> CMPGN_LOCK_IND = createField("CMPGN_LOCK_IND", org.jooq.impl.SQLDataType.VARCHAR.length(10), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> OFFR_ID = createField("OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_DESC_TXT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> OFFR_DESC_TXT = createField("OFFR_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(300), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.PG_WGHT_PCT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> PG_WGHT_PCT = createField("PG_WGHT_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.SSNL_EVNT_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> SSNL_EVNT_ID = createField("SSNL_EVNT_ID", org.jooq.impl.SQLDataType.VARCHAR.length(10), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.EST_SRCE_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> EST_SRCE_ID = createField("EST_SRCE_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.EST_STUS_CD</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> EST_STUS_CD = createField("EST_STUS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(20), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.MRKT_VEH_PERD_SCTN_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> MRKT_VEH_PERD_SCTN_ID = createField("MRKT_VEH_PERD_SCTN_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_TYP</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> OFFR_TYP = createField("OFFR_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(10), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.ENRGY_CHRT_POSTN_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> ENRGY_CHRT_POSTN_ID = createField("ENRGY_CHRT_POSTN_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.ENRGY_CHRT_OFFR_DESC_TXT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> ENRGY_CHRT_OFFR_DESC_TXT = createField("ENRGY_CHRT_OFFR_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(300), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.BRCHR_PLCMT_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> BRCHR_PLCMT_ID = createField("BRCHR_PLCMT_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.STD_OFFR_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> STD_OFFR_ID = createField("STD_OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_LINK_IND</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> OFFR_LINK_IND = createField("OFFR_LINK_IND", org.jooq.impl.SQLDataType.VARCHAR.length(10), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_LINK_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> OFFR_LINK_ID = createField("OFFR_LINK_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_NTES_TXT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> OFFR_NTES_TXT = createField("OFFR_NTES_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(1000), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_LYOT_CMNTS_TXT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> OFFR_LYOT_CMNTS_TXT = createField("OFFR_LYOT_CMNTS_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(3000), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.SCTN_PAGE_OFS_NR</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> SCTN_PAGE_OFS_NR = createField("SCTN_PAGE_OFS_NR", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_PRSNTN_STRNTH_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> OFFR_PRSNTN_STRNTH_ID = createField("OFFR_PRSNTN_STRNTH_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.PRFL_OFFR_STRGTH_PCT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> PRFL_OFFR_STRGTH_PCT = createField("PRFL_OFFR_STRGTH_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.PRFL_CNT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> PRFL_CNT = createField("PRFL_CNT", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.SKU_CNT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> SKU_CNT = createField("SKU_CNT", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.FEATRD_SIDE_CD</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> FEATRD_SIDE_CD = createField("FEATRD_SIDE_CD", org.jooq.impl.SQLDataType.VARCHAR.length(10), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.FLAP_IND</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> FLAP_IND = createField("FLAP_IND", org.jooq.impl.SQLDataType.VARCHAR.length(10), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.FRNT_CVR_IND</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> FRNT_CVR_IND = createField("FRNT_CVR_IND", org.jooq.impl.SQLDataType.VARCHAR.length(10), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_STUS_CD</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> OFFR_STUS_CD = createField("OFFR_STUS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(10), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_STUS_RSN_DESC_TXT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> OFFR_STUS_RSN_DESC_TXT = createField("OFFR_STUS_RSN_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(300), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.BILNG_PERD_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> BILNG_PERD_ID = createField("BILNG_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.SHPNG_PERD_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> SHPNG_PERD_ID = createField("SHPNG_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.BRCHR_POSTN_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> BRCHR_POSTN_ID = createField("BRCHR_POSTN_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.FLAP_PG_WGHT_PCT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> FLAP_PG_WGHT_PCT = createField("FLAP_PG_WGHT_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.UNIT_RPTG_LVL_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> UNIT_RPTG_LVL_ID = createField("UNIT_RPTG_LVL_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.RPT_SBTL_TYP_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> RPT_SBTL_TYP_ID = createField("RPT_SBTL_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.MICR_NCPSLTN_IND</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> MICR_NCPSLTN_IND = createField("MICR_NCPSLTN_IND", org.jooq.impl.SQLDataType.VARCHAR.length(10), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.MICR_NCPSLTN_DESC_TXT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> MICR_NCPSLTN_DESC_TXT = createField("MICR_NCPSLTN_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(200), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.PG_TYP_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> PG_TYP_ID = createField("PG_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_CLS_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> OFFR_CLS_ID = createField("OFFR_CLS_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.CUST_PULL_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> CUST_PULL_ID = createField("CUST_PULL_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.MPS_SLS_TYP_ID</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> MPS_SLS_TYP_ID = createField("MPS_SLS_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.LATE_OFFR_ROLE_IND</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> LATE_OFFR_ROLE_IND = createField("LATE_OFFR_ROLE_IND", org.jooq.impl.SQLDataType.VARCHAR.length(1), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.MVPV_LOCKED_STUS_IND</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> MVPV_LOCKED_STUS_IND = createField("MVPV_LOCKED_STUS_IND", org.jooq.impl.SQLDataType.VARCHAR.length(1), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.BILL_LINENR_DATA_EXISTS_IND</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> BILL_LINENR_DATA_EXISTS_IND = createField("BILL_LINENR_DATA_EXISTS_IND", org.jooq.impl.SQLDataType.VARCHAR.length(1), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.LATE_OFFR_IND</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> LATE_OFFR_IND = createField("LATE_OFFR_IND", org.jooq.impl.SQLDataType.VARCHAR.length(1), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_PLANNED_TRGT_METRICS</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, TblEditOffrPlndTrgtMtrcsRecord> OFFR_PLANNED_TRGT_METRICS = createField("OFFR_PLANNED_TRGT_METRICS", org.jooq.udt.TEditOffrPlannedTrgtMtrcs.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.getDataType().asArrayDataType(org.jooq.udt.records.TblEditOffrPlndTrgtMtrcsRecord.class), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_TRGT_METRICS</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, TblEditOffrTrgtMrtcsRecord> OFFR_TRGT_METRICS = createField("OFFR_TRGT_METRICS", org.jooq.udt.TEditOffrTrgtMrtcs.T_EDIT_OFFR_TRGT_MRTCS.getDataType().asArrayDataType(org.jooq.udt.records.TblEditOffrTrgtMrtcsRecord.class), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_CONCEPT_DATA</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, TblEditOffrCncptDataRecord> OFFR_CONCEPT_DATA = createField("OFFR_CONCEPT_DATA", org.jooq.udt.TEditOffrCncptData.T_EDIT_OFFR_CNCPT_DATA.getDataType().asArrayDataType(org.jooq.udt.records.TblEditOffrCncptDataRecord.class), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_TRANS_DATA</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, TblEditOffrTransDataRecord> OFFR_TRANS_DATA = createField("OFFR_TRANS_DATA", org.jooq.udt.TEditOffrTransData.T_EDIT_OFFR_TRANS_DATA.getDataType().asArrayDataType(org.jooq.udt.records.TblEditOffrTransDataRecord.class), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.OFFR_MS_DATA</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, TblEditOffrMsDataRecord> OFFR_MS_DATA = createField("OFFR_MS_DATA", org.jooq.udt.TEditOffrMsData.T_EDIT_OFFR_MS_DATA.getDataType().asArrayDataType(org.jooq.udt.records.TblEditOffrMsDataRecord.class), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.ACT_SLSTYP_IND</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> ACT_SLSTYP_IND = createField("ACT_SLSTYP_IND", org.jooq.impl.SQLDataType.VARCHAR.length(1), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.NO_MICR_NCPSLTN_IND</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> NO_MICR_NCPSLTN_IND = createField("NO_MICR_NCPSLTN_IND", org.jooq.impl.SQLDataType.VARCHAR.length(1), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.MPS_SLS_TYP_NAME</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> MPS_SLS_TYP_NAME = createField("MPS_SLS_TYP_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.DISABLED_SKU_CNT</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, BigDecimal> DISABLED_SKU_CNT = createField("DISABLED_SKU_CNT", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_DATA, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_DATA.FRCST_BOOST_ACTV_IND</code>.
	 */
	public static final UDTField<TEditOffrDataRecord, String> FRCST_BOOST_ACTV_IND = createField("FRCST_BOOST_ACTV_IND", org.jooq.impl.SQLDataType.VARCHAR.length(1), T_EDIT_OFFR_DATA, "");

	/**
	 * No further instances allowed
	 */
	private TEditOffrData() {
		super("T_EDIT_OFFR_DATA", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}