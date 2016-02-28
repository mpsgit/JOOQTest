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
import org.jooq.tables.records.RepMstrQryColRecord;


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
public class RepMstrQryCol extends TableImpl<RepMstrQryColRecord> {

	private static final long serialVersionUID = 871573951;

	/**
	 * The reference instance of <code>WETRN.REP_MSTR_QRY_COL</code>
	 */
	public static final RepMstrQryCol REP_MSTR_QRY_COL = new RepMstrQryCol();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RepMstrQryColRecord> getRecordType() {
		return RepMstrQryColRecord.class;
	}

	/**
	 * The column <code>WETRN.REP_MSTR_QRY_COL.MSTR_QRY_ID</code>.
	 */
	public final TableField<RepMstrQryColRecord, BigDecimal> MSTR_QRY_ID = createField("MSTR_QRY_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.REP_MSTR_QRY_COL.COL_ID</code>.
	 */
	public final TableField<RepMstrQryColRecord, BigDecimal> COL_ID = createField("COL_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.REP_MSTR_QRY_COL.CREAT_USER_ID</code>.
	 */
	public final TableField<RepMstrQryColRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.REP_MSTR_QRY_COL.CREAT_TS</code>.
	 */
	public final TableField<RepMstrQryColRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.REP_MSTR_QRY_COL.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<RepMstrQryColRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.REP_MSTR_QRY_COL.LAST_UPDT_TS</code>.
	 */
	public final TableField<RepMstrQryColRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.REP_MSTR_QRY_COL</code> table reference
	 */
	public RepMstrQryCol() {
		this("REP_MSTR_QRY_COL", null);
	}

	/**
	 * Create an aliased <code>WETRN.REP_MSTR_QRY_COL</code> table reference
	 */
	public RepMstrQryCol(String alias) {
		this(alias, REP_MSTR_QRY_COL);
	}

	private RepMstrQryCol(String alias, Table<RepMstrQryColRecord> aliased) {
		this(alias, aliased, null);
	}

	private RepMstrQryCol(String alias, Table<RepMstrQryColRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RepMstrQryColRecord> getPrimaryKey() {
		return Keys.PK_REP_MSTR_QRY_COL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RepMstrQryColRecord>> getKeys() {
		return Arrays.<UniqueKey<RepMstrQryColRecord>>asList(Keys.PK_REP_MSTR_QRY_COL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<RepMstrQryColRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<RepMstrQryColRecord, ?>>asList(Keys.FK_MSTRQRY_MSTRQRYCOL, Keys.FK_REPCOL_MSTRQRYCOL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepMstrQryCol as(String alias) {
		return new RepMstrQryCol(alias, this);
	}

	/**
	 * Rename this table
	 */
	public RepMstrQryCol rename(String name) {
		return new RepMstrQryCol(name, null);
	}
}
