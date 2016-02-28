/**
 * This class is generated by jOOQ
 */
package org.jooq.tables;


import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Keys;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.Wetrn;
import org.jooq.impl.TableImpl;
import org.jooq.tables.records.DltdOffrRecord;


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
public class DltdOffr extends TableImpl<DltdOffrRecord> {

	private static final long serialVersionUID = 2017892817;

	/**
	 * The reference instance of <code>WETRN.DLTD_OFFR</code>
	 */
	public static final DltdOffr DLTD_OFFR = new DltdOffr();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DltdOffrRecord> getRecordType() {
		return DltdOffrRecord.class;
	}

	/**
	 * The column <code>WETRN.DLTD_OFFR.OFFR_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> OFFR_ID = createField("OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.MRKT_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.OFFR_PERD_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.VEH_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.VER_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> VER_ID = createField("VER_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.PG_WGHT_PCT</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> PG_WGHT_PCT = createField("PG_WGHT_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.SSNL_EVNT_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> SSNL_EVNT_ID = createField("SSNL_EVNT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.EST_SRCE_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> EST_SRCE_ID = createField("EST_SRCE_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.EST_STUS_CD</code>.
	 */
	public final TableField<DltdOffrRecord, String> EST_STUS_CD = createField("EST_STUS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.OFFR_DESC_TXT</code>.
	 */
	public final TableField<DltdOffrRecord, String> OFFR_DESC_TXT = createField("OFFR_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.MRKT_VEH_PERD_SCTN_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> MRKT_VEH_PERD_SCTN_ID = createField("MRKT_VEH_PERD_SCTN_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.OFFR_TYP</code>.
	 */
	public final TableField<DltdOffrRecord, String> OFFR_TYP = createField("OFFR_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.ENRGY_CHRT_POSTN_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> ENRGY_CHRT_POSTN_ID = createField("ENRGY_CHRT_POSTN_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.ENRGY_CHRT_OFFR_DESC_TXT</code>.
	 */
	public final TableField<DltdOffrRecord, String> ENRGY_CHRT_OFFR_DESC_TXT = createField("ENRGY_CHRT_OFFR_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.BRCHR_PLCMT_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> BRCHR_PLCMT_ID = createField("BRCHR_PLCMT_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.STD_OFFR_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> STD_OFFR_ID = createField("STD_OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.OFFR_LINK_IND</code>.
	 */
	public final TableField<DltdOffrRecord, String> OFFR_LINK_IND = createField("OFFR_LINK_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.OFFR_LINK_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> OFFR_LINK_ID = createField("OFFR_LINK_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.OFFR_NTES_TXT</code>.
	 */
	public final TableField<DltdOffrRecord, String> OFFR_NTES_TXT = createField("OFFR_NTES_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(1000), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.OFFR_LYOT_CMNTS_TXT</code>.
	 */
	public final TableField<DltdOffrRecord, String> OFFR_LYOT_CMNTS_TXT = createField("OFFR_LYOT_CMNTS_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(3000), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.SCTN_PAGE_OFS_NR</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> SCTN_PAGE_OFS_NR = createField("SCTN_PAGE_OFS_NR", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.OFFR_PRSNTN_STRNTH_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> OFFR_PRSNTN_STRNTH_ID = createField("OFFR_PRSNTN_STRNTH_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.PRFL_OFFR_STRGTH_PCT</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> PRFL_OFFR_STRGTH_PCT = createField("PRFL_OFFR_STRGTH_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.PRFL_CNT</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> PRFL_CNT = createField("PRFL_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.SKU_CNT</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> SKU_CNT = createField("SKU_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.FEATRD_SIDE_CD</code>.
	 */
	public final TableField<DltdOffrRecord, String> FEATRD_SIDE_CD = createField("FEATRD_SIDE_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.FLAP_IND</code>.
	 */
	public final TableField<DltdOffrRecord, String> FLAP_IND = createField("FLAP_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.FRNT_CVR_IND</code>.
	 */
	public final TableField<DltdOffrRecord, String> FRNT_CVR_IND = createField("FRNT_CVR_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.OFFR_STUS_CD</code>.
	 */
	public final TableField<DltdOffrRecord, String> OFFR_STUS_CD = createField("OFFR_STUS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.OFFR_STUS_RSN_DESC_TXT</code>.
	 */
	public final TableField<DltdOffrRecord, String> OFFR_STUS_RSN_DESC_TXT = createField("OFFR_STUS_RSN_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.BILNG_PERD_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> BILNG_PERD_ID = createField("BILNG_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.SHPNG_PERD_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> SHPNG_PERD_ID = createField("SHPNG_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.CREAT_USER_ID</code>.
	 */
	public final TableField<DltdOffrRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.CREAT_TS</code>.
	 */
	public final TableField<DltdOffrRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<DltdOffrRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.LAST_UPDT_TS</code>.
	 */
	public final TableField<DltdOffrRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.BRCHR_POSTN_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> BRCHR_POSTN_ID = createField("BRCHR_POSTN_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.FLAP_PG_WGHT_PCT</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> FLAP_PG_WGHT_PCT = createField("FLAP_PG_WGHT_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.UNIT_RPTG_LVL_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> UNIT_RPTG_LVL_ID = createField("UNIT_RPTG_LVL_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.RPT_SBTL_TYP_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> RPT_SBTL_TYP_ID = createField("RPT_SBTL_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.MICR_NCPSLTN_IND</code>.
	 */
	public final TableField<DltdOffrRecord, String> MICR_NCPSLTN_IND = createField("MICR_NCPSLTN_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.MICR_NCPSLTN_DESC_TXT</code>.
	 */
	public final TableField<DltdOffrRecord, String> MICR_NCPSLTN_DESC_TXT = createField("MICR_NCPSLTN_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(150), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.PG_TYP_ID</code>.
	 */
	public final TableField<DltdOffrRecord, BigDecimal> PG_TYP_ID = createField("PG_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR.ROW_DLTD_IND</code>.
	 */
	public final TableField<DltdOffrRecord, String> ROW_DLTD_IND = createField("ROW_DLTD_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * Create a <code>WETRN.DLTD_OFFR</code> table reference
	 */
	public DltdOffr() {
		this("DLTD_OFFR", null);
	}

	/**
	 * Create an aliased <code>WETRN.DLTD_OFFR</code> table reference
	 */
	public DltdOffr(String alias) {
		this(alias, DLTD_OFFR);
	}

	private DltdOffr(String alias, Table<DltdOffrRecord> aliased) {
		this(alias, aliased, null);
	}

	private DltdOffr(String alias, Table<DltdOffrRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DltdOffrRecord> getPrimaryKey() {
		return Keys.PK_DLTD_OFFR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DltdOffrRecord>> getKeys() {
		return Arrays.<UniqueKey<DltdOffrRecord>>asList(Keys.PK_DLTD_OFFR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DltdOffr as(String alias) {
		return new DltdOffr(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DltdOffr rename(String name) {
		return new DltdOffr(name, null);
	}
}