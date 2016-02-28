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
import org.jooq.tables.records.SkuRecord;


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
public class Sku extends TableImpl<SkuRecord> {

	private static final long serialVersionUID = -1675816403;

	/**
	 * The reference instance of <code>WETRN.SKU</code>
	 */
	public static final Sku SKU = new Sku();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SkuRecord> getRecordType() {
		return SkuRecord.class;
	}

	/**
	 * The column <code>WETRN.SKU.SKU_ID</code>.
	 */
	public final TableField<SkuRecord, BigDecimal> SKU_ID = createField("SKU_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.SKU.PRFL_CD</code>.
	 */
	public final TableField<SkuRecord, Integer> PRFL_CD = createField("PRFL_CD", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>WETRN.SKU.VARIANT_PMOL_CD</code>.
	 */
	public final TableField<SkuRecord, String> VARIANT_PMOL_CD = createField("VARIANT_PMOL_CD", org.jooq.impl.SQLDataType.VARCHAR.length(2), this, "");

	/**
	 * The column <code>WETRN.SKU.VARIANT_PMOL_SEQ_ID</code>.
	 */
	public final TableField<SkuRecord, Short> VARIANT_PMOL_SEQ_ID = createField("VARIANT_PMOL_SEQ_ID", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>WETRN.SKU.SKU_NM</code>.
	 */
	public final TableField<SkuRecord, String> SKU_NM = createField("SKU_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.SKU.BRND_ID</code>.
	 */
	public final TableField<SkuRecord, BigDecimal> BRND_ID = createField("BRND_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.SKU.CREAT_USER_ID</code>.
	 */
	public final TableField<SkuRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.SKU.CREAT_TS</code>.
	 */
	public final TableField<SkuRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.SKU.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<SkuRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.SKU.LAST_UPDT_TS</code>.
	 */
	public final TableField<SkuRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.SKU.PROD_LIFE_TYP_ID</code>.
	 */
	public final TableField<SkuRecord, BigDecimal> PROD_LIFE_TYP_ID = createField("PROD_LIFE_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.SKU.DLTD_IND</code>.
	 */
	public final TableField<SkuRecord, String> DLTD_IND = createField("DLTD_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.SKU.DVLPD_SSNL_EVNT_ID</code>.
	 */
	public final TableField<SkuRecord, BigDecimal> DVLPD_SSNL_EVNT_ID = createField("DVLPD_SSNL_EVNT_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * Create a <code>WETRN.SKU</code> table reference
	 */
	public Sku() {
		this("SKU", null);
	}

	/**
	 * Create an aliased <code>WETRN.SKU</code> table reference
	 */
	public Sku(String alias) {
		this(alias, SKU);
	}

	private Sku(String alias, Table<SkuRecord> aliased) {
		this(alias, aliased, null);
	}

	private Sku(String alias, Table<SkuRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<SkuRecord> getPrimaryKey() {
		return Keys.PK_SKU;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<SkuRecord>> getKeys() {
		return Arrays.<UniqueKey<SkuRecord>>asList(Keys.PK_SKU);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<SkuRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<SkuRecord, ?>>asList(Keys.FK_PRFL_SKU, Keys.FK_BRND_SKU, Keys.FK_PRODLIFE_SKU);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Sku as(String alias) {
		return new Sku(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Sku rename(String name) {
		return new Sku(name, null);
	}
}