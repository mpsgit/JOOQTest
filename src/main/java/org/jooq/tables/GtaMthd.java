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
import org.jooq.tables.records.GtaMthdRecord;


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
public class GtaMthd extends TableImpl<GtaMthdRecord> {

	private static final long serialVersionUID = 1335259620;

	/**
	 * The reference instance of <code>WETRN.GTA_MTHD</code>
	 */
	public static final GtaMthd GTA_MTHD = new GtaMthd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<GtaMthdRecord> getRecordType() {
		return GtaMthdRecord.class;
	}

	/**
	 * The column <code>WETRN.GTA_MTHD.GTA_MTHD_ID</code>.
	 */
	public final TableField<GtaMthdRecord, BigDecimal> GTA_MTHD_ID = createField("GTA_MTHD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.GTA_MTHD.GTA_MTHD_DESC_TXT</code>.
	 */
	public final TableField<GtaMthdRecord, String> GTA_MTHD_DESC_TXT = createField("GTA_MTHD_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.GTA_MTHD.CREAT_USER_ID</code>.
	 */
	public final TableField<GtaMthdRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.GTA_MTHD.CREAT_TS</code>.
	 */
	public final TableField<GtaMthdRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.GTA_MTHD.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<GtaMthdRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.GTA_MTHD.LAST_UPDT_TS</code>.
	 */
	public final TableField<GtaMthdRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.GTA_MTHD</code> table reference
	 */
	public GtaMthd() {
		this("GTA_MTHD", null);
	}

	/**
	 * Create an aliased <code>WETRN.GTA_MTHD</code> table reference
	 */
	public GtaMthd(String alias) {
		this(alias, GTA_MTHD);
	}

	private GtaMthd(String alias, Table<GtaMthdRecord> aliased) {
		this(alias, aliased, null);
	}

	private GtaMthd(String alias, Table<GtaMthdRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<GtaMthdRecord> getPrimaryKey() {
		return Keys.PK_GTA_MTHD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<GtaMthdRecord>> getKeys() {
		return Arrays.<UniqueKey<GtaMthdRecord>>asList(Keys.PK_GTA_MTHD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GtaMthd as(String alias) {
		return new GtaMthd(alias, this);
	}

	/**
	 * Rename this table
	 */
	public GtaMthd rename(String name) {
		return new GtaMthd(name, null);
	}
}
