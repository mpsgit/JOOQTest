/**
 * This class is generated by jOOQ
 */
package org.jooq.tables;


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
import org.jooq.tables.records.SlsClsRecord;


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
public class SlsCls extends TableImpl<SlsClsRecord> {

	private static final long serialVersionUID = -458267045;

	/**
	 * The reference instance of <code>WETRN.SLS_CLS</code>
	 */
	public static final SlsCls SLS_CLS = new SlsCls();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SlsClsRecord> getRecordType() {
		return SlsClsRecord.class;
	}

	/**
	 * The column <code>WETRN.SLS_CLS.SLS_CLS_CD</code>.
	 */
	public final TableField<SlsClsRecord, String> SLS_CLS_CD = createField("SLS_CLS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

	/**
	 * The column <code>WETRN.SLS_CLS.SLS_CLS_DESC_TXT</code>.
	 */
	public final TableField<SlsClsRecord, String> SLS_CLS_DESC_TXT = createField("SLS_CLS_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.SLS_CLS.CREAT_USER_ID</code>.
	 */
	public final TableField<SlsClsRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.SLS_CLS.CREAT_TS</code>.
	 */
	public final TableField<SlsClsRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.SLS_CLS.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<SlsClsRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.SLS_CLS.LAST_UPDT_TS</code>.
	 */
	public final TableField<SlsClsRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.SLS_CLS</code> table reference
	 */
	public SlsCls() {
		this("SLS_CLS", null);
	}

	/**
	 * Create an aliased <code>WETRN.SLS_CLS</code> table reference
	 */
	public SlsCls(String alias) {
		this(alias, SLS_CLS);
	}

	private SlsCls(String alias, Table<SlsClsRecord> aliased) {
		this(alias, aliased, null);
	}

	private SlsCls(String alias, Table<SlsClsRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<SlsClsRecord> getPrimaryKey() {
		return Keys.PK_SLS_CLS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<SlsClsRecord>> getKeys() {
		return Arrays.<UniqueKey<SlsClsRecord>>asList(Keys.PK_SLS_CLS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsCls as(String alias) {
		return new SlsCls(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SlsCls rename(String name) {
		return new SlsCls(name, null);
	}
}
