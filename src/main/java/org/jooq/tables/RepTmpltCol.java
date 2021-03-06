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
import org.jooq.tables.records.RepTmpltColRecord;


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
public class RepTmpltCol extends TableImpl<RepTmpltColRecord> {

	private static final long serialVersionUID = 1647199038;

	/**
	 * The reference instance of <code>WETRN.REP_TMPLT_COL</code>
	 */
	public static final RepTmpltCol REP_TMPLT_COL = new RepTmpltCol();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RepTmpltColRecord> getRecordType() {
		return RepTmpltColRecord.class;
	}

	/**
	 * The column <code>WETRN.REP_TMPLT_COL.TMPLT_ID</code>.
	 */
	public final TableField<RepTmpltColRecord, BigDecimal> TMPLT_ID = createField("TMPLT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_COL.COL_ID</code>.
	 */
	public final TableField<RepTmpltColRecord, BigDecimal> COL_ID = createField("COL_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_COL.SEQ_NR</code>.
	 */
	public final TableField<RepTmpltColRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_COL.PRTCTD_IND</code>.
	 */
	public final TableField<RepTmpltColRecord, String> PRTCTD_IND = createField("PRTCTD_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_COL.HDDN_IND</code>.
	 */
	public final TableField<RepTmpltColRecord, String> HDDN_IND = createField("HDDN_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_COL.CREAT_USER_ID</code>.
	 */
	public final TableField<RepTmpltColRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_COL.CREAT_TS</code>.
	 */
	public final TableField<RepTmpltColRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_COL.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<RepTmpltColRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_COL.LAST_UPDT_TS</code>.
	 */
	public final TableField<RepTmpltColRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.REP_TMPLT_COL</code> table reference
	 */
	public RepTmpltCol() {
		this("REP_TMPLT_COL", null);
	}

	/**
	 * Create an aliased <code>WETRN.REP_TMPLT_COL</code> table reference
	 */
	public RepTmpltCol(String alias) {
		this(alias, REP_TMPLT_COL);
	}

	private RepTmpltCol(String alias, Table<RepTmpltColRecord> aliased) {
		this(alias, aliased, null);
	}

	private RepTmpltCol(String alias, Table<RepTmpltColRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RepTmpltColRecord> getPrimaryKey() {
		return Keys.PK_REP_TEMPLT_COL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RepTmpltColRecord>> getKeys() {
		return Arrays.<UniqueKey<RepTmpltColRecord>>asList(Keys.PK_REP_TEMPLT_COL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<RepTmpltColRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<RepTmpltColRecord, ?>>asList(Keys.FK_TMPLT_TMPLTCOL, Keys.FK_REPCOL_TMPLTCOL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepTmpltCol as(String alias) {
		return new RepTmpltCol(alias, this);
	}

	/**
	 * Rename this table
	 */
	public RepTmpltCol rename(String name) {
		return new RepTmpltCol(name, null);
	}
}
