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
import org.jooq.tables.records.BrchrPostnRecord;


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
public class BrchrPostn extends TableImpl<BrchrPostnRecord> {

	private static final long serialVersionUID = -975877387;

	/**
	 * The reference instance of <code>WETRN.BRCHR_POSTN</code>
	 */
	public static final BrchrPostn BRCHR_POSTN = new BrchrPostn();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BrchrPostnRecord> getRecordType() {
		return BrchrPostnRecord.class;
	}

	/**
	 * The column <code>WETRN.BRCHR_POSTN.BRCHR_POSTN_ID</code>.
	 */
	public final TableField<BrchrPostnRecord, BigDecimal> BRCHR_POSTN_ID = createField("BRCHR_POSTN_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.BRCHR_POSTN.BRCHR_POSTN_NM</code>.
	 */
	public final TableField<BrchrPostnRecord, String> BRCHR_POSTN_NM = createField("BRCHR_POSTN_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.BRCHR_POSTN.CREAT_USER_ID</code>.
	 */
	public final TableField<BrchrPostnRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.BRCHR_POSTN.CREAT_TS</code>.
	 */
	public final TableField<BrchrPostnRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.BRCHR_POSTN.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<BrchrPostnRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.BRCHR_POSTN.LAST_UPDT_TS</code>.
	 */
	public final TableField<BrchrPostnRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.BRCHR_POSTN</code> table reference
	 */
	public BrchrPostn() {
		this("BRCHR_POSTN", null);
	}

	/**
	 * Create an aliased <code>WETRN.BRCHR_POSTN</code> table reference
	 */
	public BrchrPostn(String alias) {
		this(alias, BRCHR_POSTN);
	}

	private BrchrPostn(String alias, Table<BrchrPostnRecord> aliased) {
		this(alias, aliased, null);
	}

	private BrchrPostn(String alias, Table<BrchrPostnRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<BrchrPostnRecord> getPrimaryKey() {
		return Keys.PK_BRCHR_POSTN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<BrchrPostnRecord>> getKeys() {
		return Arrays.<UniqueKey<BrchrPostnRecord>>asList(Keys.PK_BRCHR_POSTN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BrchrPostn as(String alias) {
		return new BrchrPostn(alias, this);
	}

	/**
	 * Rename this table
	 */
	public BrchrPostn rename(String name) {
		return new BrchrPostn(name, null);
	}
}
