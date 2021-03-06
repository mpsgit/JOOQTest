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
import org.jooq.tables.records.BtchTaskLogTypRecord;


/**
 * Batch task log type.  The type of log entry for the batch task.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BtchTaskLogTyp extends TableImpl<BtchTaskLogTypRecord> {

	private static final long serialVersionUID = -223550556;

	/**
	 * The reference instance of <code>WETRN.BTCH_TASK_LOG_TYP</code>
	 */
	public static final BtchTaskLogTyp BTCH_TASK_LOG_TYP = new BtchTaskLogTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BtchTaskLogTypRecord> getRecordType() {
		return BtchTaskLogTypRecord.class;
	}

	/**
	 * The column <code>WETRN.BTCH_TASK_LOG_TYP.BTCH_TASK_LOG_TYP_ID</code>. Batch task log type id.  Unique identifier for the log type.
	 */
	public final TableField<BtchTaskLogTypRecord, BigDecimal> BTCH_TASK_LOG_TYP_ID = createField("BTCH_TASK_LOG_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "Batch task log type id.  Unique identifier for the log type.");

	/**
	 * The column <code>WETRN.BTCH_TASK_LOG_TYP.BTCH_TASK_LOG_TYP_SDESC_TXT</code>.
	 */
	public final TableField<BtchTaskLogTypRecord, String> BTCH_TASK_LOG_TYP_SDESC_TXT = createField("BTCH_TASK_LOG_TYP_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>WETRN.BTCH_TASK_LOG_TYP.BTCH_TASK_LOG_TYP_DESC_TXT</code>.
	 */
	public final TableField<BtchTaskLogTypRecord, String> BTCH_TASK_LOG_TYP_DESC_TXT = createField("BTCH_TASK_LOG_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(250).nullable(false), this, "");

	/**
	 * The column <code>WETRN.BTCH_TASK_LOG_TYP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<BtchTaskLogTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.BTCH_TASK_LOG_TYP.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<BtchTaskLogTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.BTCH_TASK_LOG_TYP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<BtchTaskLogTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.BTCH_TASK_LOG_TYP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<BtchTaskLogTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.BTCH_TASK_LOG_TYP</code> table reference
	 */
	public BtchTaskLogTyp() {
		this("BTCH_TASK_LOG_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.BTCH_TASK_LOG_TYP</code> table reference
	 */
	public BtchTaskLogTyp(String alias) {
		this(alias, BTCH_TASK_LOG_TYP);
	}

	private BtchTaskLogTyp(String alias, Table<BtchTaskLogTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private BtchTaskLogTyp(String alias, Table<BtchTaskLogTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Batch task log type.  The type of log entry for the batch task.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<BtchTaskLogTypRecord> getPrimaryKey() {
		return Keys.PK_BTCH_TASK_LOG_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<BtchTaskLogTypRecord>> getKeys() {
		return Arrays.<UniqueKey<BtchTaskLogTypRecord>>asList(Keys.PK_BTCH_TASK_LOG_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchTaskLogTyp as(String alias) {
		return new BtchTaskLogTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public BtchTaskLogTyp rename(String name) {
		return new BtchTaskLogTyp(name, null);
	}
}
