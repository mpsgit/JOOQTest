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
import org.jooq.tables.records.TpcRecord;


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
public class Tpc extends TableImpl<TpcRecord> {

	private static final long serialVersionUID = -1999961540;

	/**
	 * The reference instance of <code>WETRN.TPC</code>
	 */
	public static final Tpc TPC = new Tpc();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TpcRecord> getRecordType() {
		return TpcRecord.class;
	}

	/**
	 * The column <code>WETRN.TPC.TPC_ID</code>.
	 */
	public final TableField<TpcRecord, BigDecimal> TPC_ID = createField("TPC_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.TPC.TPC_SDESC_TXT</code>.
	 */
	public final TableField<TpcRecord, String> TPC_SDESC_TXT = createField("TPC_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>WETRN.TPC.CREAT_USER_ID</code>.
	 */
	public final TableField<TpcRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.TPC.CREAT_TS</code>.
	 */
	public final TableField<TpcRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.TPC.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<TpcRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.TPC.LAST_UPDT_TS</code>.
	 */
	public final TableField<TpcRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.TPC</code> table reference
	 */
	public Tpc() {
		this("TPC", null);
	}

	/**
	 * Create an aliased <code>WETRN.TPC</code> table reference
	 */
	public Tpc(String alias) {
		this(alias, TPC);
	}

	private Tpc(String alias, Table<TpcRecord> aliased) {
		this(alias, aliased, null);
	}

	private Tpc(String alias, Table<TpcRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TpcRecord> getPrimaryKey() {
		return Keys.PK_TPC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TpcRecord>> getKeys() {
		return Arrays.<UniqueKey<TpcRecord>>asList(Keys.PK_TPC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Tpc as(String alias) {
		return new Tpc(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Tpc rename(String name) {
		return new Tpc(name, null);
	}
}
