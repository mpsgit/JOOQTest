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
import org.jooq.tables.records.ComsnTypRecord;


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
public class ComsnTyp extends TableImpl<ComsnTypRecord> {

	private static final long serialVersionUID = -1243940908;

	/**
	 * The reference instance of <code>WETRN.COMSN_TYP</code>
	 */
	public static final ComsnTyp COMSN_TYP = new ComsnTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ComsnTypRecord> getRecordType() {
		return ComsnTypRecord.class;
	}

	/**
	 * The column <code>WETRN.COMSN_TYP.COMSN_TYP</code>.
	 */
	public final TableField<ComsnTypRecord, String> COMSN_TYP_ = createField("COMSN_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

	/**
	 * The column <code>WETRN.COMSN_TYP.COMSN_TYP_DESC_TXT</code>.
	 */
	public final TableField<ComsnTypRecord, String> COMSN_TYP_DESC_TXT = createField("COMSN_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.COMSN_TYP.CREAT_USER_ID</code>.
	 */
	public final TableField<ComsnTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.COMSN_TYP.CREAT_TS</code>.
	 */
	public final TableField<ComsnTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.COMSN_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<ComsnTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.COMSN_TYP.LAST_UPDT_TS</code>.
	 */
	public final TableField<ComsnTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.COMSN_TYP</code> table reference
	 */
	public ComsnTyp() {
		this("COMSN_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.COMSN_TYP</code> table reference
	 */
	public ComsnTyp(String alias) {
		this(alias, COMSN_TYP);
	}

	private ComsnTyp(String alias, Table<ComsnTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private ComsnTyp(String alias, Table<ComsnTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ComsnTypRecord> getPrimaryKey() {
		return Keys.PK_COMSN_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ComsnTypRecord>> getKeys() {
		return Arrays.<UniqueKey<ComsnTypRecord>>asList(Keys.PK_COMSN_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ComsnTyp as(String alias) {
		return new ComsnTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ComsnTyp rename(String name) {
		return new ComsnTyp(name, null);
	}
}
