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
import org.jooq.tables.records.FrcMtchMthdRecord;


/**
 * Force match options for offers.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FrcMtchMthd extends TableImpl<FrcMtchMthdRecord> {

	private static final long serialVersionUID = -599115225;

	/**
	 * The reference instance of <code>WETRN.FRC_MTCH_MTHD</code>
	 */
	public static final FrcMtchMthd FRC_MTCH_MTHD = new FrcMtchMthd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<FrcMtchMthdRecord> getRecordType() {
		return FrcMtchMthdRecord.class;
	}

	/**
	 * The column <code>WETRN.FRC_MTCH_MTHD.FRC_MTCH_MTHD_ID</code>.
	 */
	public final TableField<FrcMtchMthdRecord, BigDecimal> FRC_MTCH_MTHD_ID = createField("FRC_MTCH_MTHD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.FRC_MTCH_MTHD.FRC_MTCH_MTHD_SDESC_TXT</code>.
	 */
	public final TableField<FrcMtchMthdRecord, String> FRC_MTCH_MTHD_SDESC_TXT = createField("FRC_MTCH_MTHD_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>WETRN.FRC_MTCH_MTHD.FRC_MTCH_MTHD_DESC_TXT</code>.
	 */
	public final TableField<FrcMtchMthdRecord, String> FRC_MTCH_MTHD_DESC_TXT = createField("FRC_MTCH_MTHD_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(250).nullable(false), this, "");

	/**
	 * The column <code>WETRN.FRC_MTCH_MTHD.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<FrcMtchMthdRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.FRC_MTCH_MTHD.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<FrcMtchMthdRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.FRC_MTCH_MTHD.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<FrcMtchMthdRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.FRC_MTCH_MTHD.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<FrcMtchMthdRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.FRC_MTCH_MTHD</code> table reference
	 */
	public FrcMtchMthd() {
		this("FRC_MTCH_MTHD", null);
	}

	/**
	 * Create an aliased <code>WETRN.FRC_MTCH_MTHD</code> table reference
	 */
	public FrcMtchMthd(String alias) {
		this(alias, FRC_MTCH_MTHD);
	}

	private FrcMtchMthd(String alias, Table<FrcMtchMthdRecord> aliased) {
		this(alias, aliased, null);
	}

	private FrcMtchMthd(String alias, Table<FrcMtchMthdRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Force match options for offers.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<FrcMtchMthdRecord> getPrimaryKey() {
		return Keys.PK_FRC_MTCH_MTHD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<FrcMtchMthdRecord>> getKeys() {
		return Arrays.<UniqueKey<FrcMtchMthdRecord>>asList(Keys.PK_FRC_MTCH_MTHD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FrcMtchMthd as(String alias) {
		return new FrcMtchMthd(alias, this);
	}

	/**
	 * Rename this table
	 */
	public FrcMtchMthd rename(String name) {
		return new FrcMtchMthd(name, null);
	}
}
