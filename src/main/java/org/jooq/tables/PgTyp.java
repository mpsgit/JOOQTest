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
import org.jooq.tables.records.PgTypRecord;


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
public class PgTyp extends TableImpl<PgTypRecord> {

	private static final long serialVersionUID = -131698993;

	/**
	 * The reference instance of <code>WETRN.PG_TYP</code>
	 */
	public static final PgTyp PG_TYP = new PgTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PgTypRecord> getRecordType() {
		return PgTypRecord.class;
	}

	/**
	 * The column <code>WETRN.PG_TYP.PG_TYP_ID</code>.
	 */
	public final TableField<PgTypRecord, BigDecimal> PG_TYP_ID = createField("PG_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.PG_TYP.PG_TYP_SDESC_TXT</code>.
	 */
	public final TableField<PgTypRecord, String> PG_TYP_SDESC_TXT = createField("PG_TYP_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>WETRN.PG_TYP.PG_TYP_DESC_TXT</code>.
	 */
	public final TableField<PgTypRecord, String> PG_TYP_DESC_TXT = createField("PG_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.PG_TYP.CREAT_USER_ID</code>.
	 */
	public final TableField<PgTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.PG_TYP.CREAT_TS</code>.
	 */
	public final TableField<PgTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.PG_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<PgTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.PG_TYP.LAST_UPDT_TS</code>.
	 */
	public final TableField<PgTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.PG_TYP</code> table reference
	 */
	public PgTyp() {
		this("PG_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.PG_TYP</code> table reference
	 */
	public PgTyp(String alias) {
		this(alias, PG_TYP);
	}

	private PgTyp(String alias, Table<PgTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private PgTyp(String alias, Table<PgTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PgTypRecord> getPrimaryKey() {
		return Keys.PK_PG_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PgTypRecord>> getKeys() {
		return Arrays.<UniqueKey<PgTypRecord>>asList(Keys.PK_PG_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PgTyp as(String alias) {
		return new PgTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PgTyp rename(String name) {
		return new PgTyp(name, null);
	}
}
