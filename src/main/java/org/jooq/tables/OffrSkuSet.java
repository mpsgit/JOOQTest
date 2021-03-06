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
import org.jooq.ForeignKey;
import org.jooq.Keys;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.Wetrn;
import org.jooq.impl.TableImpl;
import org.jooq.tables.records.OffrSkuSetRecord;


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
public class OffrSkuSet extends TableImpl<OffrSkuSetRecord> {

	private static final long serialVersionUID = 1818422120;

	/**
	 * The reference instance of <code>WETRN.OFFR_SKU_SET</code>
	 */
	public static final OffrSkuSet OFFR_SKU_SET = new OffrSkuSet();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<OffrSkuSetRecord> getRecordType() {
		return OffrSkuSetRecord.class;
	}

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.OFFR_SKU_SET_ID</code>.
	 */
	public final TableField<OffrSkuSetRecord, BigDecimal> OFFR_SKU_SET_ID = createField("OFFR_SKU_SET_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.SET_PRC_TYP_ID</code>.
	 */
	public final TableField<OffrSkuSetRecord, BigDecimal> SET_PRC_TYP_ID = createField("SET_PRC_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.OFFR_ID</code>.
	 */
	public final TableField<OffrSkuSetRecord, BigDecimal> OFFR_ID = createField("OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.OFFR_SKU_SET_NM</code>.
	 */
	public final TableField<OffrSkuSetRecord, String> OFFR_SKU_SET_NM = createField("OFFR_SKU_SET_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.MRKT_ID</code>.
	 */
	public final TableField<OffrSkuSetRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.SET_PRC_AMT</code>.
	 */
	public final TableField<OffrSkuSetRecord, BigDecimal> SET_PRC_AMT = createField("SET_PRC_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.VEH_ID</code>.
	 */
	public final TableField<OffrSkuSetRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.SET_CMPNT_CNT</code>.
	 */
	public final TableField<OffrSkuSetRecord, BigDecimal> SET_CMPNT_CNT = createField("SET_CMPNT_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.OFFR_PERD_ID</code>.
	 */
	public final TableField<OffrSkuSetRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.PG_OFS_NR</code>.
	 */
	public final TableField<OffrSkuSetRecord, BigDecimal> PG_OFS_NR = createField("PG_OFS_NR", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.CREAT_USER_ID</code>.
	 */
	public final TableField<OffrSkuSetRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.FEATRD_SIDE_CD</code>.
	 */
	public final TableField<OffrSkuSetRecord, String> FEATRD_SIDE_CD = createField("FEATRD_SIDE_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.CREAT_TS</code>.
	 */
	public final TableField<OffrSkuSetRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.CRNCY_CD</code>.
	 */
	public final TableField<OffrSkuSetRecord, String> CRNCY_CD = createField("CRNCY_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<OffrSkuSetRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.LAST_UPDT_TS</code>.
	 */
	public final TableField<OffrSkuSetRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.PROMTN_DESC_TXT</code>.
	 */
	public final TableField<OffrSkuSetRecord, String> PROMTN_DESC_TXT = createField("PROMTN_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.LINE_NR</code>.
	 */
	public final TableField<OffrSkuSetRecord, String> LINE_NR = createField("LINE_NR", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.LINE_NR_TYP_ID</code>.
	 */
	public final TableField<OffrSkuSetRecord, BigDecimal> LINE_NR_TYP_ID = createField("LINE_NR_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.FSC_CD</code>.
	 */
	public final TableField<OffrSkuSetRecord, String> FSC_CD = createField("FSC_CD", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.OFFR_SKU_SET_SKU_ID</code>.
	 */
	public final TableField<OffrSkuSetRecord, String> OFFR_SKU_SET_SKU_ID = createField("OFFR_SKU_SET_SKU_ID", org.jooq.impl.SQLDataType.VARCHAR.length(4000), this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.FINSHD_GDS_CD</code>.
	 */
	public final TableField<OffrSkuSetRecord, BigDecimal> FINSHD_GDS_CD = createField("FINSHD_GDS_CD", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.OFFR_SKU_SET.LINE_NR_ASGNMT_TYP_ID</code>.
	 */
	public final TableField<OffrSkuSetRecord, BigDecimal> LINE_NR_ASGNMT_TYP_ID = createField("LINE_NR_ASGNMT_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * Create a <code>WETRN.OFFR_SKU_SET</code> table reference
	 */
	public OffrSkuSet() {
		this("OFFR_SKU_SET", null);
	}

	/**
	 * Create an aliased <code>WETRN.OFFR_SKU_SET</code> table reference
	 */
	public OffrSkuSet(String alias) {
		this(alias, OFFR_SKU_SET);
	}

	private OffrSkuSet(String alias, Table<OffrSkuSetRecord> aliased) {
		this(alias, aliased, null);
	}

	private OffrSkuSet(String alias, Table<OffrSkuSetRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<OffrSkuSetRecord> getPrimaryKey() {
		return Keys.PK_OFFR_SKU_SET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<OffrSkuSetRecord>> getKeys() {
		return Arrays.<UniqueKey<OffrSkuSetRecord>>asList(Keys.PK_OFFR_SKU_SET);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<OffrSkuSetRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<OffrSkuSetRecord, ?>>asList(Keys.FK_SETPRCTYP_OFFRSKUSET, Keys.FK_MRKTNGSETFGC_OFFRSKUSET, Keys.FK_LINENRTYP_OFFRSKUSET, Keys.FK_LINENRASGMNTTYP_OFFRSKUSET);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OffrSkuSet as(String alias) {
		return new OffrSkuSet(alias, this);
	}

	/**
	 * Rename this table
	 */
	public OffrSkuSet rename(String name) {
		return new OffrSkuSet(name, null);
	}
}
