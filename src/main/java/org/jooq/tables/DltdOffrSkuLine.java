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
import org.jooq.tables.records.DltdOffrSkuLineRecord;


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
public class DltdOffrSkuLine extends TableImpl<DltdOffrSkuLineRecord> {

	private static final long serialVersionUID = 2100222767;

	/**
	 * The reference instance of <code>WETRN.DLTD_OFFR_SKU_LINE</code>
	 */
	public static final DltdOffrSkuLine DLTD_OFFR_SKU_LINE = new DltdOffrSkuLine();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DltdOffrSkuLineRecord> getRecordType() {
		return DltdOffrSkuLineRecord.class;
	}

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.OFFR_SKU_LINE_ID</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, BigDecimal> OFFR_SKU_LINE_ID = createField("OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.OFFR_ID</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, BigDecimal> OFFR_ID = createField("OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.VEH_ID</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.FEATRD_SIDE_CD</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, String> FEATRD_SIDE_CD = createField("FEATRD_SIDE_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.OFFR_PERD_ID</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.MRKT_ID</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.PG_OFS_NR</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, BigDecimal> PG_OFS_NR = createField("PG_OFS_NR", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.SKU_ID</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, BigDecimal> SKU_ID = createField("SKU_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.PRFL_CD</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, Integer> PRFL_CD = createField("PRFL_CD", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.CRNCY_CD</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, String> CRNCY_CD = createField("CRNCY_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.PRMRY_SKU_OFFR_IND</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, String> PRMRY_SKU_OFFR_IND = createField("PRMRY_SKU_OFFR_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.SLS_CLS_CD</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, String> SLS_CLS_CD = createField("SLS_CLS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.OFFR_PRFL_PRCPT_ID</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, BigDecimal> OFFR_PRFL_PRCPT_ID = createField("OFFR_PRFL_PRCPT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.PROMTN_DESC_TXT</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, String> PROMTN_DESC_TXT = createField("PROMTN_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.DEMO_AVLBL_IND</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, String> DEMO_AVLBL_IND = createField("DEMO_AVLBL_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.DLTD_IND</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, String> DLTD_IND = createField("DLTD_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.UNIT_SPLT_PCT</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, BigDecimal> UNIT_SPLT_PCT = createField("UNIT_SPLT_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.CREAT_USER_ID</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.SLS_PRC_AMT</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, BigDecimal> SLS_PRC_AMT = createField("SLS_PRC_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.CREAT_TS</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.LAST_UPDT_TS</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.COST_TYP</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, String> COST_TYP = createField("COST_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.OFFR_SKU_LINE_LINK_ID</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, BigDecimal> OFFR_SKU_LINE_LINK_ID = createField("OFFR_SKU_LINE_LINK_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.ROW_DLTD_IND</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, String> ROW_DLTD_IND = createField("ROW_DLTD_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.SET_CMPNT_IND</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, String> SET_CMPNT_IND = createField("SET_CMPNT_IND", org.jooq.impl.SQLDataType.CHAR.length(1).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.SET_CMPNT_QTY</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, Integer> SET_CMPNT_QTY = createField("SET_CMPNT_QTY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.OFFR_SKU_SET_ID</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, BigDecimal> OFFR_SKU_SET_ID = createField("OFFR_SKU_SET_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_SKU_LINE.LINE_NR</code>.
	 */
	public final TableField<DltdOffrSkuLineRecord, String> LINE_NR = createField("LINE_NR", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "");

	/**
	 * Create a <code>WETRN.DLTD_OFFR_SKU_LINE</code> table reference
	 */
	public DltdOffrSkuLine() {
		this("DLTD_OFFR_SKU_LINE", null);
	}

	/**
	 * Create an aliased <code>WETRN.DLTD_OFFR_SKU_LINE</code> table reference
	 */
	public DltdOffrSkuLine(String alias) {
		this(alias, DLTD_OFFR_SKU_LINE);
	}

	private DltdOffrSkuLine(String alias, Table<DltdOffrSkuLineRecord> aliased) {
		this(alias, aliased, null);
	}

	private DltdOffrSkuLine(String alias, Table<DltdOffrSkuLineRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DltdOffrSkuLineRecord> getPrimaryKey() {
		return Keys.PK_DLTD_OFFR_SKU_LINE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DltdOffrSkuLineRecord>> getKeys() {
		return Arrays.<UniqueKey<DltdOffrSkuLineRecord>>asList(Keys.PK_DLTD_OFFR_SKU_LINE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DltdOffrSkuLine as(String alias) {
		return new DltdOffrSkuLine(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DltdOffrSkuLine rename(String name) {
		return new DltdOffrSkuLine(name, null);
	}
}
