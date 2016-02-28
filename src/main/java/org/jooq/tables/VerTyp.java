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
import org.jooq.tables.records.VerTypRecord;


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
public class VerTyp extends TableImpl<VerTypRecord> {

	private static final long serialVersionUID = 1197751242;

	/**
	 * The reference instance of <code>WETRN.VER_TYP</code>
	 */
	public static final VerTyp VER_TYP = new VerTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<VerTypRecord> getRecordType() {
		return VerTypRecord.class;
	}

	/**
	 * The column <code>WETRN.VER_TYP.VER_TYP_ID</code>.
	 */
	public final TableField<VerTypRecord, BigDecimal> VER_TYP_ID = createField("VER_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.VER_TYP.VER_TYP_DESC_TXT</code>.
	 */
	public final TableField<VerTypRecord, String> VER_TYP_DESC_TXT = createField("VER_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.VER_TYP.CREAT_USER_ID</code>.
	 */
	public final TableField<VerTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.VER_TYP.CREAT_TS</code>.
	 */
	public final TableField<VerTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.VER_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<VerTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.VER_TYP.LAST_UPDT_TS</code>.
	 */
	public final TableField<VerTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.VER_TYP</code> table reference
	 */
	public VerTyp() {
		this("VER_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.VER_TYP</code> table reference
	 */
	public VerTyp(String alias) {
		this(alias, VER_TYP);
	}

	private VerTyp(String alias, Table<VerTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private VerTyp(String alias, Table<VerTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<VerTypRecord> getPrimaryKey() {
		return Keys.PK_VER_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<VerTypRecord>> getKeys() {
		return Arrays.<UniqueKey<VerTypRecord>>asList(Keys.PK_VER_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VerTyp as(String alias) {
		return new VerTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public VerTyp rename(String name) {
		return new VerTyp(name, null);
	}
}
