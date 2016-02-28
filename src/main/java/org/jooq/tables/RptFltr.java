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
import org.jooq.tables.records.RptFltrRecord;


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
public class RptFltr extends TableImpl<RptFltrRecord> {

	private static final long serialVersionUID = 1438314299;

	/**
	 * The reference instance of <code>WETRN.RPT_FLTR</code>
	 */
	public static final RptFltr RPT_FLTR = new RptFltr();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RptFltrRecord> getRecordType() {
		return RptFltrRecord.class;
	}

	/**
	 * The column <code>WETRN.RPT_FLTR.FLTR_ID</code>.
	 */
	public final TableField<RptFltrRecord, BigDecimal> FLTR_ID = createField("FLTR_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.RPT_FLTR.FLTR_NM</code>.
	 */
	public final TableField<RptFltrRecord, String> FLTR_NM = createField("FLTR_NM", org.jooq.impl.SQLDataType.VARCHAR.length(254).nullable(false), this, "");

	/**
	 * The column <code>WETRN.RPT_FLTR.FLTR_JSP_TXT</code>.
	 */
	public final TableField<RptFltrRecord, String> FLTR_JSP_TXT = createField("FLTR_JSP_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254).nullable(false), this, "");

	/**
	 * The column <code>WETRN.RPT_FLTR.CREAT_USER_ID</code>.
	 */
	public final TableField<RptFltrRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.RPT_FLTR.CREAT_TS</code>.
	 */
	public final TableField<RptFltrRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.RPT_FLTR.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<RptFltrRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.RPT_FLTR.LAST_UPDT_TS</code>.
	 */
	public final TableField<RptFltrRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.RPT_FLTR</code> table reference
	 */
	public RptFltr() {
		this("RPT_FLTR", null);
	}

	/**
	 * Create an aliased <code>WETRN.RPT_FLTR</code> table reference
	 */
	public RptFltr(String alias) {
		this(alias, RPT_FLTR);
	}

	private RptFltr(String alias, Table<RptFltrRecord> aliased) {
		this(alias, aliased, null);
	}

	private RptFltr(String alias, Table<RptFltrRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RptFltrRecord> getPrimaryKey() {
		return Keys.PK_RPT_FLTR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RptFltrRecord>> getKeys() {
		return Arrays.<UniqueKey<RptFltrRecord>>asList(Keys.PK_RPT_FLTR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RptFltr as(String alias) {
		return new RptFltr(alias, this);
	}

	/**
	 * Rename this table
	 */
	public RptFltr rename(String name) {
		return new RptFltr(name, null);
	}
}