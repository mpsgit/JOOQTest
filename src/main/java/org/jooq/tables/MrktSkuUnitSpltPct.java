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
import org.jooq.tables.records.MrktSkuUnitSpltPctRecord;


/**
 * Market sku unit split percent.  Unit split percentage for market sku.  
 * Rows are inserted when there is a new split percentage for items effective 
 * from a specific offer period.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MrktSkuUnitSpltPct extends TableImpl<MrktSkuUnitSpltPctRecord> {

	private static final long serialVersionUID = -1684067995;

	/**
	 * The reference instance of <code>WETRN.MRKT_SKU_UNIT_SPLT_PCT</code>
	 */
	public static final MrktSkuUnitSpltPct MRKT_SKU_UNIT_SPLT_PCT = new MrktSkuUnitSpltPct();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktSkuUnitSpltPctRecord> getRecordType() {
		return MrktSkuUnitSpltPctRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_SKU_UNIT_SPLT_PCT.MRKT_ID</code>.
	 */
	public final TableField<MrktSkuUnitSpltPctRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_SKU_UNIT_SPLT_PCT.SKU_ID</code>.
	 */
	public final TableField<MrktSkuUnitSpltPctRecord, BigDecimal> SKU_ID = createField("SKU_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_SKU_UNIT_SPLT_PCT.EFF_OFFR_PERD_ID</code>.
	 */
	public final TableField<MrktSkuUnitSpltPctRecord, BigDecimal> EFF_OFFR_PERD_ID = createField("EFF_OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_SKU_UNIT_SPLT_PCT.STATC_UNIT_SPLT_PCT</code>. Static unit split percent.  The unit split percentage for this item.  The total of split percentages for all items within a profile should add up to 100 but may not do if items have been deleted or have changed profile.
	 */
	public final TableField<MrktSkuUnitSpltPctRecord, BigDecimal> STATC_UNIT_SPLT_PCT = createField("STATC_UNIT_SPLT_PCT", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaulted(true), this, "Static unit split percent.  The unit split percentage for this item.  The total of split percentages for all items within a profile should add up to 100 but may not do if items have been deleted or have changed profile.");

	/**
	 * The column <code>WETRN.MRKT_SKU_UNIT_SPLT_PCT.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<MrktSkuUnitSpltPctRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.MRKT_SKU_UNIT_SPLT_PCT.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<MrktSkuUnitSpltPctRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.MRKT_SKU_UNIT_SPLT_PCT.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<MrktSkuUnitSpltPctRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.MRKT_SKU_UNIT_SPLT_PCT.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<MrktSkuUnitSpltPctRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.MRKT_SKU_UNIT_SPLT_PCT</code> table reference
	 */
	public MrktSkuUnitSpltPct() {
		this("MRKT_SKU_UNIT_SPLT_PCT", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_SKU_UNIT_SPLT_PCT</code> table reference
	 */
	public MrktSkuUnitSpltPct(String alias) {
		this(alias, MRKT_SKU_UNIT_SPLT_PCT);
	}

	private MrktSkuUnitSpltPct(String alias, Table<MrktSkuUnitSpltPctRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktSkuUnitSpltPct(String alias, Table<MrktSkuUnitSpltPctRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Market sku unit split percent.  Unit split percentage for market sku.  Rows are inserted when there is a new split percentage for items effective from a specific offer period.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktSkuUnitSpltPctRecord> getPrimaryKey() {
		return Keys.PK_MRKT_SKU_UNIT_SPLT_PCT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktSkuUnitSpltPctRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktSkuUnitSpltPctRecord>>asList(Keys.PK_MRKT_SKU_UNIT_SPLT_PCT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktSkuUnitSpltPctRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktSkuUnitSpltPctRecord, ?>>asList(Keys.FK_MRKTPERD_MRKTSKUUNITSPLTPCT, Keys.FK_MRKTSKU_MRKTSKUUNITSPLTPCT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSkuUnitSpltPct as(String alias) {
		return new MrktSkuUnitSpltPct(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktSkuUnitSpltPct rename(String name) {
		return new MrktSkuUnitSpltPct(name, null);
	}
}