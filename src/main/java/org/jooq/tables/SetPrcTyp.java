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
import org.jooq.tables.records.SetPrcTypRecord;


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
public class SetPrcTyp extends TableImpl<SetPrcTypRecord> {

	private static final long serialVersionUID = 1462222962;

	/**
	 * The reference instance of <code>WETRN.SET_PRC_TYP</code>
	 */
	public static final SetPrcTyp SET_PRC_TYP = new SetPrcTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SetPrcTypRecord> getRecordType() {
		return SetPrcTypRecord.class;
	}

	/**
	 * The column <code>WETRN.SET_PRC_TYP.SET_PRC_TYP_ID</code>.
	 */
	public final TableField<SetPrcTypRecord, BigDecimal> SET_PRC_TYP_ID = createField("SET_PRC_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.SET_PRC_TYP.SET_PRC_TYP_DESC_TXT</code>.
	 */
	public final TableField<SetPrcTypRecord, String> SET_PRC_TYP_DESC_TXT = createField("SET_PRC_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.SET_PRC_TYP.CREAT_USER_ID</code>.
	 */
	public final TableField<SetPrcTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.SET_PRC_TYP.CREAT_TS</code>.
	 */
	public final TableField<SetPrcTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.SET_PRC_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<SetPrcTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.SET_PRC_TYP.LAST_UPDT_TS</code>.
	 */
	public final TableField<SetPrcTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.SET_PRC_TYP</code> table reference
	 */
	public SetPrcTyp() {
		this("SET_PRC_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.SET_PRC_TYP</code> table reference
	 */
	public SetPrcTyp(String alias) {
		this(alias, SET_PRC_TYP);
	}

	private SetPrcTyp(String alias, Table<SetPrcTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private SetPrcTyp(String alias, Table<SetPrcTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<SetPrcTypRecord> getPrimaryKey() {
		return Keys.PK_SET_PRC_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<SetPrcTypRecord>> getKeys() {
		return Arrays.<UniqueKey<SetPrcTypRecord>>asList(Keys.PK_SET_PRC_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SetPrcTyp as(String alias) {
		return new SetPrcTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SetPrcTyp rename(String name) {
		return new SetPrcTyp(name, null);
	}
}
