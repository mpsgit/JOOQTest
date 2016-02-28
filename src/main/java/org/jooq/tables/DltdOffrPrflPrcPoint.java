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
import org.jooq.tables.records.DltdOffrPrflPrcPointRecord;


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
public class DltdOffrPrflPrcPoint extends TableImpl<DltdOffrPrflPrcPointRecord> {

	private static final long serialVersionUID = -1964298270;

	/**
	 * The reference instance of <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT</code>
	 */
	public static final DltdOffrPrflPrcPoint DLTD_OFFR_PRFL_PRC_POINT = new DltdOffrPrflPrcPoint();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DltdOffrPrflPrcPointRecord> getRecordType() {
		return DltdOffrPrflPrcPointRecord.class;
	}

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.OFFR_PRFL_PRCPT_ID</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> OFFR_PRFL_PRCPT_ID = createField("OFFR_PRFL_PRCPT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.OFFR_ID</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> OFFR_ID = createField("OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.PROMTN_CLM_ID</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> PROMTN_CLM_ID = createField("PROMTN_CLM_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.VEH_ID</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.PROMTN_ID</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> PROMTN_ID = createField("PROMTN_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.MRKT_ID</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.SLS_CLS_CD</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> SLS_CLS_CD = createField("SLS_CLS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.PRFL_CD</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, Integer> PRFL_CD = createField("PRFL_CD", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.SSNL_EVNT_ID</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> SSNL_EVNT_ID = createField("SSNL_EVNT_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.OFFR_PERD_ID</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.SLS_STUS_CD</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> SLS_STUS_CD = createField("SLS_STUS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.CRNCY_CD</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> CRNCY_CD = createField("CRNCY_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.SKU_CNT</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> SKU_CNT = createField("SKU_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.NR_FOR_QTY</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, Integer> NR_FOR_QTY = createField("NR_FOR_QTY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.SKU_OFFR_STRGTH_PCT</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> SKU_OFFR_STRGTH_PCT = createField("SKU_OFFR_STRGTH_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.EST_UNIT_QTY</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, Integer> EST_UNIT_QTY = createField("EST_UNIT_QTY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.EST_SLS_AMT</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> EST_SLS_AMT = createField("EST_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.EST_COST_AMT</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> EST_COST_AMT = createField("EST_COST_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.SLS_SRCE_ID</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> SLS_SRCE_ID = createField("SLS_SRCE_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.PRFL_STUS_RSN_DESC_TXT</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> PRFL_STUS_RSN_DESC_TXT = createField("PRFL_STUS_RSN_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.PRFL_STUS_CD</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> PRFL_STUS_CD = createField("PRFL_STUS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.SLS_PRC_AMT</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> SLS_PRC_AMT = createField("SLS_PRC_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.TAX_AMT</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> TAX_AMT = createField("TAX_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.PYMT_TYP</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> PYMT_TYP = createField("PYMT_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.COMSN_AMT</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> COMSN_AMT = createField("COMSN_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.COMSN_TYP</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> COMSN_TYP = createField("COMSN_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.NET_TO_AVON_FCT</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> NET_TO_AVON_FCT = createField("NET_TO_AVON_FCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 4), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.PRC_POINT_DESC_TXT</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> PRC_POINT_DESC_TXT = createField("PRC_POINT_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.CREAT_USER_ID</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.CREAT_TS</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.LAST_UPDT_TS</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.PRMRY_OFFR_IND</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> PRMRY_OFFR_IND = createField("PRMRY_OFFR_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.IMPCT_CATGRY_ID</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> IMPCT_CATGRY_ID = createField("IMPCT_CATGRY_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.PG_OFS_NR</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> PG_OFS_NR = createField("PG_OFS_NR", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.FEATRD_SIDE_CD</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> FEATRD_SIDE_CD = createField("FEATRD_SIDE_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.CNSMR_INVSTMT_BDGT_ID</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> CNSMR_INVSTMT_BDGT_ID = createField("CNSMR_INVSTMT_BDGT_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.OFFR_PRFL_PRCPT_LINK_ID</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> OFFR_PRFL_PRCPT_LINK_ID = createField("OFFR_PRFL_PRCPT_LINK_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.SLS_PROMTN_IND</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> SLS_PROMTN_IND = createField("SLS_PROMTN_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.IMPCT_PRFL_CD</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, Integer> IMPCT_PRFL_CD = createField("IMPCT_PRFL_CD", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.ROW_DLTD_IND</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> ROW_DLTD_IND = createField("ROW_DLTD_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.ROYLT_PCT</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, BigDecimal> ROYLT_PCT = createField("ROYLT_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT.ROYLT_OVRRD_IND</code>.
	 */
	public final TableField<DltdOffrPrflPrcPointRecord, String> ROYLT_OVRRD_IND = createField("ROYLT_OVRRD_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * Create a <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT</code> table reference
	 */
	public DltdOffrPrflPrcPoint() {
		this("DLTD_OFFR_PRFL_PRC_POINT", null);
	}

	/**
	 * Create an aliased <code>WETRN.DLTD_OFFR_PRFL_PRC_POINT</code> table reference
	 */
	public DltdOffrPrflPrcPoint(String alias) {
		this(alias, DLTD_OFFR_PRFL_PRC_POINT);
	}

	private DltdOffrPrflPrcPoint(String alias, Table<DltdOffrPrflPrcPointRecord> aliased) {
		this(alias, aliased, null);
	}

	private DltdOffrPrflPrcPoint(String alias, Table<DltdOffrPrflPrcPointRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DltdOffrPrflPrcPointRecord> getPrimaryKey() {
		return Keys.PK_DLTD_OFFR_PRFL_PRC_POINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DltdOffrPrflPrcPointRecord>> getKeys() {
		return Arrays.<UniqueKey<DltdOffrPrflPrcPointRecord>>asList(Keys.PK_DLTD_OFFR_PRFL_PRC_POINT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DltdOffrPrflPrcPoint as(String alias) {
		return new DltdOffrPrflPrcPoint(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DltdOffrPrflPrcPoint rename(String name) {
		return new DltdOffrPrflPrcPoint(name, null);
	}
}
