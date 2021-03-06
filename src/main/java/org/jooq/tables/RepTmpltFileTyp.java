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
import org.jooq.tables.records.RepTmpltFileTypRecord;


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
public class RepTmpltFileTyp extends TableImpl<RepTmpltFileTypRecord> {

	private static final long serialVersionUID = -713332775;

	/**
	 * The reference instance of <code>WETRN.REP_TMPLT_FILE_TYP</code>
	 */
	public static final RepTmpltFileTyp REP_TMPLT_FILE_TYP = new RepTmpltFileTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RepTmpltFileTypRecord> getRecordType() {
		return RepTmpltFileTypRecord.class;
	}

	/**
	 * The column <code>WETRN.REP_TMPLT_FILE_TYP.TMPLT_ID</code>.
	 */
	public final TableField<RepTmpltFileTypRecord, BigDecimal> TMPLT_ID = createField("TMPLT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_FILE_TYP.FILE_TYP_ID</code>.
	 */
	public final TableField<RepTmpltFileTypRecord, BigDecimal> FILE_TYP_ID = createField("FILE_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_FILE_TYP.CREAT_USER_ID</code>.
	 */
	public final TableField<RepTmpltFileTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_FILE_TYP.CREAT_TS</code>.
	 */
	public final TableField<RepTmpltFileTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_FILE_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<RepTmpltFileTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.REP_TMPLT_FILE_TYP.LAST_UPDT_TS</code>.
	 */
	public final TableField<RepTmpltFileTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.REP_TMPLT_FILE_TYP</code> table reference
	 */
	public RepTmpltFileTyp() {
		this("REP_TMPLT_FILE_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.REP_TMPLT_FILE_TYP</code> table reference
	 */
	public RepTmpltFileTyp(String alias) {
		this(alias, REP_TMPLT_FILE_TYP);
	}

	private RepTmpltFileTyp(String alias, Table<RepTmpltFileTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private RepTmpltFileTyp(String alias, Table<RepTmpltFileTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RepTmpltFileTypRecord> getPrimaryKey() {
		return Keys.PK_REP_TMPLT_FILE_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RepTmpltFileTypRecord>> getKeys() {
		return Arrays.<UniqueKey<RepTmpltFileTypRecord>>asList(Keys.PK_REP_TMPLT_FILE_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<RepTmpltFileTypRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<RepTmpltFileTypRecord, ?>>asList(Keys.FK_TMPLT_TMPLTFILETYP, Keys.FK_REPFILETYP_TMPLTFILETYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepTmpltFileTyp as(String alias) {
		return new RepTmpltFileTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public RepTmpltFileTyp rename(String name) {
		return new RepTmpltFileTyp(name, null);
	}
}
