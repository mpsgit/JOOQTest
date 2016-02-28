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
import org.jooq.tables.records.BrndPostnngRecord;


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
public class BrndPostnng extends TableImpl<BrndPostnngRecord> {

	private static final long serialVersionUID = -1263756108;

	/**
	 * The reference instance of <code>WETRN.BRND_POSTNNG</code>
	 */
	public static final BrndPostnng BRND_POSTNNG = new BrndPostnng();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BrndPostnngRecord> getRecordType() {
		return BrndPostnngRecord.class;
	}

	/**
	 * The column <code>WETRN.BRND_POSTNNG.BRND_POSTNNG_ID</code>.
	 */
	public final TableField<BrndPostnngRecord, BigDecimal> BRND_POSTNNG_ID = createField("BRND_POSTNNG_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.BRND_POSTNNG.BRND_POSTNNG_DESC_TXT</code>.
	 */
	public final TableField<BrndPostnngRecord, String> BRND_POSTNNG_DESC_TXT = createField("BRND_POSTNNG_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.BRND_POSTNNG.CREAT_USER_ID</code>.
	 */
	public final TableField<BrndPostnngRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.BRND_POSTNNG.CREAT_TS</code>.
	 */
	public final TableField<BrndPostnngRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.BRND_POSTNNG.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<BrndPostnngRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.BRND_POSTNNG.LAST_UPDT_TS</code>.
	 */
	public final TableField<BrndPostnngRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.BRND_POSTNNG</code> table reference
	 */
	public BrndPostnng() {
		this("BRND_POSTNNG", null);
	}

	/**
	 * Create an aliased <code>WETRN.BRND_POSTNNG</code> table reference
	 */
	public BrndPostnng(String alias) {
		this(alias, BRND_POSTNNG);
	}

	private BrndPostnng(String alias, Table<BrndPostnngRecord> aliased) {
		this(alias, aliased, null);
	}

	private BrndPostnng(String alias, Table<BrndPostnngRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<BrndPostnngRecord> getPrimaryKey() {
		return Keys.PK_BRND_POSTNNG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<BrndPostnngRecord>> getKeys() {
		return Arrays.<UniqueKey<BrndPostnngRecord>>asList(Keys.PK_BRND_POSTNNG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BrndPostnng as(String alias) {
		return new BrndPostnng(alias, this);
	}

	/**
	 * Rename this table
	 */
	public BrndPostnng rename(String name) {
		return new BrndPostnng(name, null);
	}
}