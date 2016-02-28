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
import org.jooq.tables.records.VehTypRecord;


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
public class VehTyp extends TableImpl<VehTypRecord> {

	private static final long serialVersionUID = 1404740618;

	/**
	 * The reference instance of <code>WETRN.VEH_TYP</code>
	 */
	public static final VehTyp VEH_TYP = new VehTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<VehTypRecord> getRecordType() {
		return VehTypRecord.class;
	}

	/**
	 * The column <code>WETRN.VEH_TYP.VEH_TYP_ID</code>.
	 */
	public final TableField<VehTypRecord, BigDecimal> VEH_TYP_ID = createField("VEH_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.VEH_TYP.VEH_TYP_DESC_TXT</code>.
	 */
	public final TableField<VehTypRecord, String> VEH_TYP_DESC_TXT = createField("VEH_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.VEH_TYP.CREAT_USER_ID</code>.
	 */
	public final TableField<VehTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.VEH_TYP.CREAT_TS</code>.
	 */
	public final TableField<VehTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.VEH_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<VehTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.VEH_TYP.LAST_UPDT_TS</code>.
	 */
	public final TableField<VehTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.VEH_TYP</code> table reference
	 */
	public VehTyp() {
		this("VEH_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.VEH_TYP</code> table reference
	 */
	public VehTyp(String alias) {
		this(alias, VEH_TYP);
	}

	private VehTyp(String alias, Table<VehTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private VehTyp(String alias, Table<VehTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<VehTypRecord> getPrimaryKey() {
		return Keys.PK_VEH_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<VehTypRecord>> getKeys() {
		return Arrays.<UniqueKey<VehTypRecord>>asList(Keys.PK_VEH_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VehTyp as(String alias) {
		return new VehTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public VehTyp rename(String name) {
		return new VehTyp(name, null);
	}
}
