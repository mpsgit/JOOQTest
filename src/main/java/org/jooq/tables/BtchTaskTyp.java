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
import org.jooq.tables.records.BtchTaskTypRecord;


/**
 * Batch task type.  The type of a task.  E.g. 'Copy offer'.  The task type 
 * is used to determine the procedure that is responsible for executing the 
 * task.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BtchTaskTyp extends TableImpl<BtchTaskTypRecord> {

	private static final long serialVersionUID = -1827614156;

	/**
	 * The reference instance of <code>WETRN.BTCH_TASK_TYP</code>
	 */
	public static final BtchTaskTyp BTCH_TASK_TYP = new BtchTaskTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BtchTaskTypRecord> getRecordType() {
		return BtchTaskTypRecord.class;
	}

	/**
	 * The column <code>WETRN.BTCH_TASK_TYP.BTCH_TASK_TYP_ID</code>. Batch task type id.  Unique identifier for a batch task type.
	 */
	public final TableField<BtchTaskTypRecord, BigDecimal> BTCH_TASK_TYP_ID = createField("BTCH_TASK_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "Batch task type id.  Unique identifier for a batch task type.");

	/**
	 * The column <code>WETRN.BTCH_TASK_TYP.BTCH_TASK_TYP_SDESC_TXT</code>.
	 */
	public final TableField<BtchTaskTypRecord, String> BTCH_TASK_TYP_SDESC_TXT = createField("BTCH_TASK_TYP_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>WETRN.BTCH_TASK_TYP.BTCH_TASK_TYP_DESC_TXT</code>.
	 */
	public final TableField<BtchTaskTypRecord, String> BTCH_TASK_TYP_DESC_TXT = createField("BTCH_TASK_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(250).nullable(false), this, "");

	/**
	 * The column <code>WETRN.BTCH_TASK_TYP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<BtchTaskTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.BTCH_TASK_TYP.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<BtchTaskTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.BTCH_TASK_TYP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<BtchTaskTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.BTCH_TASK_TYP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<BtchTaskTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.BTCH_TASK_TYP</code> table reference
	 */
	public BtchTaskTyp() {
		this("BTCH_TASK_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.BTCH_TASK_TYP</code> table reference
	 */
	public BtchTaskTyp(String alias) {
		this(alias, BTCH_TASK_TYP);
	}

	private BtchTaskTyp(String alias, Table<BtchTaskTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private BtchTaskTyp(String alias, Table<BtchTaskTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Batch task type.  The type of a task.  E.g. 'Copy offer'.  The task type is used to determine the procedure that is responsible for executing the task.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<BtchTaskTypRecord> getPrimaryKey() {
		return Keys.PK_BTCH_TASK_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<BtchTaskTypRecord>> getKeys() {
		return Arrays.<UniqueKey<BtchTaskTypRecord>>asList(Keys.PK_BTCH_TASK_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchTaskTyp as(String alias) {
		return new BtchTaskTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public BtchTaskTyp rename(String name) {
		return new BtchTaskTyp(name, null);
	}
}