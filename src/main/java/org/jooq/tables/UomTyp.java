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
import org.jooq.tables.records.UomTypRecord;


/**
 * Valid measure types for units of measure (e.g. Length, Mass, Volume).
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UomTyp extends TableImpl<UomTypRecord> {

	private static final long serialVersionUID = -17069679;

	/**
	 * The reference instance of <code>WETRN.UOM_TYP</code>
	 */
	public static final UomTyp UOM_TYP = new UomTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UomTypRecord> getRecordType() {
		return UomTypRecord.class;
	}

	/**
	 * The column <code>WETRN.UOM_TYP.UOM_TYP_ID</code>.
	 */
	public final TableField<UomTypRecord, BigDecimal> UOM_TYP_ID = createField("UOM_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.UOM_TYP.UOM_TYP_SDESC_TXT</code>.
	 */
	public final TableField<UomTypRecord, String> UOM_TYP_SDESC_TXT = createField("UOM_TYP_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>WETRN.UOM_TYP.UOM_TYP_DESC_TXT</code>.
	 */
	public final TableField<UomTypRecord, String> UOM_TYP_DESC_TXT = createField("UOM_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>WETRN.UOM_TYP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<UomTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.UOM_TYP.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<UomTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.UOM_TYP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<UomTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.UOM_TYP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<UomTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.UOM_TYP</code> table reference
	 */
	public UomTyp() {
		this("UOM_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.UOM_TYP</code> table reference
	 */
	public UomTyp(String alias) {
		this(alias, UOM_TYP);
	}

	private UomTyp(String alias, Table<UomTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private UomTyp(String alias, Table<UomTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Valid measure types for units of measure (e.g. Length, Mass, Volume).");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<UomTypRecord> getPrimaryKey() {
		return Keys.PK_UOM_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<UomTypRecord>> getKeys() {
		return Arrays.<UniqueKey<UomTypRecord>>asList(Keys.PK_UOM_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UomTyp as(String alias) {
		return new UomTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public UomTyp rename(String name) {
		return new UomTyp(name, null);
	}
}
