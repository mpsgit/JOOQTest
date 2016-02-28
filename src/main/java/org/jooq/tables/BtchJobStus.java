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
import org.jooq.tables.records.BtchJobStusRecord;


/**
 * Batch job status.  The status of the job.  E.g. 'Scheduled'.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BtchJobStus extends TableImpl<BtchJobStusRecord> {

	private static final long serialVersionUID = 151975626;

	/**
	 * The reference instance of <code>WETRN.BTCH_JOB_STUS</code>
	 */
	public static final BtchJobStus BTCH_JOB_STUS = new BtchJobStus();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BtchJobStusRecord> getRecordType() {
		return BtchJobStusRecord.class;
	}

	/**
	 * The column <code>WETRN.BTCH_JOB_STUS.BTCH_JOB_STUS_ID</code>. Batch job status id.  Unique identifier for a batch job status.  ID is manually entered (not from the SEQ).
	 */
	public final TableField<BtchJobStusRecord, BigDecimal> BTCH_JOB_STUS_ID = createField("BTCH_JOB_STUS_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "Batch job status id.  Unique identifier for a batch job status.  ID is manually entered (not from the SEQ).");

	/**
	 * The column <code>WETRN.BTCH_JOB_STUS.BTCH_JOB_STUS_SDESC_TXT</code>.
	 */
	public final TableField<BtchJobStusRecord, String> BTCH_JOB_STUS_SDESC_TXT = createField("BTCH_JOB_STUS_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>WETRN.BTCH_JOB_STUS.BTCH_JOB_STUS_DESC_TXT</code>.
	 */
	public final TableField<BtchJobStusRecord, String> BTCH_JOB_STUS_DESC_TXT = createField("BTCH_JOB_STUS_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(250).nullable(false), this, "");

	/**
	 * The column <code>WETRN.BTCH_JOB_STUS.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<BtchJobStusRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.BTCH_JOB_STUS.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<BtchJobStusRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.BTCH_JOB_STUS.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<BtchJobStusRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.BTCH_JOB_STUS.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<BtchJobStusRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.BTCH_JOB_STUS</code> table reference
	 */
	public BtchJobStus() {
		this("BTCH_JOB_STUS", null);
	}

	/**
	 * Create an aliased <code>WETRN.BTCH_JOB_STUS</code> table reference
	 */
	public BtchJobStus(String alias) {
		this(alias, BTCH_JOB_STUS);
	}

	private BtchJobStus(String alias, Table<BtchJobStusRecord> aliased) {
		this(alias, aliased, null);
	}

	private BtchJobStus(String alias, Table<BtchJobStusRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Batch job status.  The status of the job.  E.g. 'Scheduled'.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<BtchJobStusRecord> getPrimaryKey() {
		return Keys.PK_BTCH_JOB_STUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<BtchJobStusRecord>> getKeys() {
		return Arrays.<UniqueKey<BtchJobStusRecord>>asList(Keys.PK_BTCH_JOB_STUS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobStus as(String alias) {
		return new BtchJobStus(alias, this);
	}

	/**
	 * Rename this table
	 */
	public BtchJobStus rename(String name) {
		return new BtchJobStus(name, null);
	}
}
