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
import org.jooq.tables.records.RepRunPrgrssRecord;


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
public class RepRunPrgrss extends TableImpl<RepRunPrgrssRecord> {

	private static final long serialVersionUID = -1248053583;

	/**
	 * The reference instance of <code>WETRN.REP_RUN_PRGRSS</code>
	 */
	public static final RepRunPrgrss REP_RUN_PRGRSS = new RepRunPrgrss();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RepRunPrgrssRecord> getRecordType() {
		return RepRunPrgrssRecord.class;
	}

	/**
	 * The column <code>WETRN.REP_RUN_PRGRSS.RUN_ID</code>.
	 */
	public final TableField<RepRunPrgrssRecord, BigDecimal> RUN_ID = createField("RUN_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.REP_RUN_PRGRSS.TMPLT_ID</code>.
	 */
	public final TableField<RepRunPrgrssRecord, BigDecimal> TMPLT_ID = createField("TMPLT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.REP_RUN_PRGRSS.USER_NM</code>.
	 */
	public final TableField<RepRunPrgrssRecord, String> USER_NM = createField("USER_NM", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false), this, "");

	/**
	 * The column <code>WETRN.REP_RUN_PRGRSS.CLSTR_ID</code>.
	 */
	public final TableField<RepRunPrgrssRecord, BigDecimal> CLSTR_ID = createField("CLSTR_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.REP_RUN_PRGRSS.SYS_ID</code>.
	 */
	public final TableField<RepRunPrgrssRecord, BigDecimal> SYS_ID = createField("SYS_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.REP_RUN_PRGRSS.FILE_PTH</code>.
	 */
	public final TableField<RepRunPrgrssRecord, String> FILE_PTH = createField("FILE_PTH", org.jooq.impl.SQLDataType.VARCHAR.length(1000), this, "");

	/**
	 * The column <code>WETRN.REP_RUN_PRGRSS.REP_DESC_TXT</code>.
	 */
	public final TableField<RepRunPrgrssRecord, String> REP_DESC_TXT = createField("REP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(500), this, "");

	/**
	 * The column <code>WETRN.REP_RUN_PRGRSS.STRT_TS</code>.
	 */
	public final TableField<RepRunPrgrssRecord, Date> STRT_TS = createField("STRT_TS", org.jooq.impl.SQLDataType.DATE.defaulted(true), this, "");

	/**
	 * The column <code>WETRN.REP_RUN_PRGRSS.END_TS</code>.
	 */
	public final TableField<RepRunPrgrssRecord, Date> END_TS = createField("END_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.REP_RUN_PRGRSS.REP_STUS</code>.
	 */
	public final TableField<RepRunPrgrssRecord, String> REP_STUS = createField("REP_STUS", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>WETRN.REP_RUN_PRGRSS.CREAT_USER_ID</code>.
	 */
	public final TableField<RepRunPrgrssRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.REP_RUN_PRGRSS.CREAT_TS</code>.
	 */
	public final TableField<RepRunPrgrssRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.REP_RUN_PRGRSS.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<RepRunPrgrssRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.REP_RUN_PRGRSS.LAST_UPDT_TS</code>.
	 */
	public final TableField<RepRunPrgrssRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.REP_RUN_PRGRSS</code> table reference
	 */
	public RepRunPrgrss() {
		this("REP_RUN_PRGRSS", null);
	}

	/**
	 * Create an aliased <code>WETRN.REP_RUN_PRGRSS</code> table reference
	 */
	public RepRunPrgrss(String alias) {
		this(alias, REP_RUN_PRGRSS);
	}

	private RepRunPrgrss(String alias, Table<RepRunPrgrssRecord> aliased) {
		this(alias, aliased, null);
	}

	private RepRunPrgrss(String alias, Table<RepRunPrgrssRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RepRunPrgrssRecord> getPrimaryKey() {
		return Keys.PK_REP_RUN_PRGRSS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RepRunPrgrssRecord>> getKeys() {
		return Arrays.<UniqueKey<RepRunPrgrssRecord>>asList(Keys.PK_REP_RUN_PRGRSS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<RepRunPrgrssRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<RepRunPrgrssRecord, ?>>asList(Keys.FK_TMPLT_REPRUNPRGRSS, Keys.FK_MPSUSER_REPRUNPRGRSS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepRunPrgrss as(String alias) {
		return new RepRunPrgrss(alias, this);
	}

	/**
	 * Rename this table
	 */
	public RepRunPrgrss rename(String name) {
		return new RepRunPrgrss(name, null);
	}
}
