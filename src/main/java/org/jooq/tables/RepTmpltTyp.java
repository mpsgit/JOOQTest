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
import org.jooq.tables.records.RepTmpltTypRecord;


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
public class RepTmpltTyp extends TableImpl<RepTmpltTypRecord> {

	private static final long serialVersionUID = 178549793;

	/**
	 * The reference instance of <code>WETRN.REP_TMPLT_TYP</code>
	 */
	public static final RepTmpltTyp REP_TMPLT_TYP = new RepTmpltTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RepTmpltTypRecord> getRecordType() {
		return RepTmpltTypRecord.class;
	}

	/**
	 * The column <code>WETRN.REP_TMPLT_TYP.TMPLT_TYP_ID</code>.
	 */
	public final TableField<RepTmpltTypRecord, BigDecimal> TMPLT_TYP_ID = createField("TMPLT_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_TYP.TMPLT_TYP_DESC_TXT</code>.
	 */
	public final TableField<RepTmpltTypRecord, String> TMPLT_TYP_DESC_TXT = createField("TMPLT_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_TYP.CREAT_USER_ID</code>.
	 */
	public final TableField<RepTmpltTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_TYP.CREAT_TS</code>.
	 */
	public final TableField<RepTmpltTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<RepTmpltTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_TYP.LAST_UPDT_TS</code>.
	 */
	public final TableField<RepTmpltTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.REP_TMPLT_TYP</code> table reference
	 */
	public RepTmpltTyp() {
		this("REP_TMPLT_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.REP_TMPLT_TYP</code> table reference
	 */
	public RepTmpltTyp(String alias) {
		this(alias, REP_TMPLT_TYP);
	}

	private RepTmpltTyp(String alias, Table<RepTmpltTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private RepTmpltTyp(String alias, Table<RepTmpltTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RepTmpltTypRecord> getPrimaryKey() {
		return Keys.PK_REP_TMPLT_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RepTmpltTypRecord>> getKeys() {
		return Arrays.<UniqueKey<RepTmpltTypRecord>>asList(Keys.PK_REP_TMPLT_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepTmpltTyp as(String alias) {
		return new RepTmpltTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public RepTmpltTyp rename(String name) {
		return new RepTmpltTyp(name, null);
	}
}
