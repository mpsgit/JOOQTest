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
import org.jooq.tables.records.DltdOffrPrflSlsClsPlcmtRecord;


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
public class DltdOffrPrflSlsClsPlcmt extends TableImpl<DltdOffrPrflSlsClsPlcmtRecord> {

	private static final long serialVersionUID = 694646708;

	/**
	 * The reference instance of <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT</code>
	 */
	public static final DltdOffrPrflSlsClsPlcmt DLTD_OFFR_PRFL_SLS_CLS_PLCMT = new DltdOffrPrflSlsClsPlcmt();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DltdOffrPrflSlsClsPlcmtRecord> getRecordType() {
		return DltdOffrPrflSlsClsPlcmtRecord.class;
	}

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.OFFR_ID</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, BigDecimal> OFFR_ID = createField("OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.SLS_CLS_CD</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, String> SLS_CLS_CD = createField("SLS_CLS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.PRFL_CD</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, Integer> PRFL_CD = createField("PRFL_CD", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.PG_OFS_NR</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, BigDecimal> PG_OFS_NR = createField("PG_OFS_NR", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.FEATRD_SIDE_CD</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, String> FEATRD_SIDE_CD = createField("FEATRD_SIDE_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.MRKT_ID</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.VEH_ID</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.OFFR_PERD_ID</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.SKU_CNT</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, BigDecimal> SKU_CNT = createField("SKU_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.PG_WGHT_PCT</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, BigDecimal> PG_WGHT_PCT = createField("PG_WGHT_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.SKU_OFFR_STRGTH_PCT</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, BigDecimal> SKU_OFFR_STRGTH_PCT = createField("SKU_OFFR_STRGTH_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.CREAT_USER_ID</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.CREAT_TS</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.LAST_UPDT_TS</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.FEATRD_PRFL_IND</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, String> FEATRD_PRFL_IND = createField("FEATRD_PRFL_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.USE_INSTRCTNS_IND</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, String> USE_INSTRCTNS_IND = createField("USE_INSTRCTNS_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.PROD_ENDRSMT_ID</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, BigDecimal> PROD_ENDRSMT_ID = createField("PROD_ENDRSMT_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.FXD_PG_WGHT_IND</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, String> FXD_PG_WGHT_IND = createField("FXD_PG_WGHT_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT.ROW_DLTD_IND</code>.
	 */
	public final TableField<DltdOffrPrflSlsClsPlcmtRecord, String> ROW_DLTD_IND = createField("ROW_DLTD_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * Create a <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT</code> table reference
	 */
	public DltdOffrPrflSlsClsPlcmt() {
		this("DLTD_OFFR_PRFL_SLS_CLS_PLCMT", null);
	}

	/**
	 * Create an aliased <code>WETRN.DLTD_OFFR_PRFL_SLS_CLS_PLCMT</code> table reference
	 */
	public DltdOffrPrflSlsClsPlcmt(String alias) {
		this(alias, DLTD_OFFR_PRFL_SLS_CLS_PLCMT);
	}

	private DltdOffrPrflSlsClsPlcmt(String alias, Table<DltdOffrPrflSlsClsPlcmtRecord> aliased) {
		this(alias, aliased, null);
	}

	private DltdOffrPrflSlsClsPlcmt(String alias, Table<DltdOffrPrflSlsClsPlcmtRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DltdOffrPrflSlsClsPlcmtRecord> getPrimaryKey() {
		return Keys.PK_DLTD_OFFR_PRFL_SLS_CLS_PLCM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DltdOffrPrflSlsClsPlcmtRecord>> getKeys() {
		return Arrays.<UniqueKey<DltdOffrPrflSlsClsPlcmtRecord>>asList(Keys.PK_DLTD_OFFR_PRFL_SLS_CLS_PLCM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DltdOffrPrflSlsClsPlcmt as(String alias) {
		return new DltdOffrPrflSlsClsPlcmt(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DltdOffrPrflSlsClsPlcmt rename(String name) {
		return new DltdOffrPrflSlsClsPlcmt(name, null);
	}
}