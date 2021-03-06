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
import org.jooq.tables.records.BtchJobRecord;


/**
 * Batch job.  There are none, one or many batch jobs in a batch job type. 
 *  A batch job groups together tasks that are related but not necessarily 
 * dependent on each other.  They may have been submitted as part of one user 
 * request.  E.g. Copy offers to market.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BtchJob extends TableImpl<BtchJobRecord> {

	private static final long serialVersionUID = 650585798;

	/**
	 * The reference instance of <code>WETRN.BTCH_JOB</code>
	 */
	public static final BtchJob BTCH_JOB = new BtchJob();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BtchJobRecord> getRecordType() {
		return BtchJobRecord.class;
	}

	/**
	 * The column <code>WETRN.BTCH_JOB.BTCH_JOB_ID</code>. Batch job id.  Unique identifier for a batch job.
	 */
	public final TableField<BtchJobRecord, BigDecimal> BTCH_JOB_ID = createField("BTCH_JOB_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "Batch job id.  Unique identifier for a batch job.");

	/**
	 * The column <code>WETRN.BTCH_JOB.BTCH_JOB_SDESC_TXT</code>.
	 */
	public final TableField<BtchJobRecord, String> BTCH_JOB_SDESC_TXT = createField("BTCH_JOB_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>WETRN.BTCH_JOB.BTCH_JOB_DESC_TXT</code>.
	 */
	public final TableField<BtchJobRecord, String> BTCH_JOB_DESC_TXT = createField("BTCH_JOB_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(250).nullable(false), this, "");

	/**
	 * The column <code>WETRN.BTCH_JOB.BTCH_JOB_TYP_ID</code>. Batch job type id.  The batch job type that this batch job belongs to.
	 */
	public final TableField<BtchJobRecord, BigDecimal> BTCH_JOB_TYP_ID = createField("BTCH_JOB_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "Batch job type id.  The batch job type that this batch job belongs to.");

	/**
	 * The column <code>WETRN.BTCH_JOB.BTCH_JOB_STUS_ID</code>. Batch job status id.  The status of the batch job.
	 */
	public final TableField<BtchJobRecord, BigDecimal> BTCH_JOB_STUS_ID = createField("BTCH_JOB_STUS_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "Batch job status id.  The status of the batch job.");

	/**
	 * The column <code>WETRN.BTCH_JOB.BTCH_JOB_STRT_TS</code>. Batch job start timestamp.  The date/time that the job was started.
	 */
	public final TableField<BtchJobRecord, Date> BTCH_JOB_STRT_TS = createField("BTCH_JOB_STRT_TS", org.jooq.impl.SQLDataType.DATE, this, "Batch job start timestamp.  The date/time that the job was started.");

	/**
	 * The column <code>WETRN.BTCH_JOB.BTCH_JOB_END_TS</code>. Batch job end timestamp.  The date/time that the job finished.
	 */
	public final TableField<BtchJobRecord, Date> BTCH_JOB_END_TS = createField("BTCH_JOB_END_TS", org.jooq.impl.SQLDataType.DATE, this, "Batch job end timestamp.  The date/time that the job finished.");

	/**
	 * The column <code>WETRN.BTCH_JOB.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<BtchJobRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.BTCH_JOB.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<BtchJobRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.BTCH_JOB.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<BtchJobRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.BTCH_JOB.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<BtchJobRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.BTCH_JOB</code> table reference
	 */
	public BtchJob() {
		this("BTCH_JOB", null);
	}

	/**
	 * Create an aliased <code>WETRN.BTCH_JOB</code> table reference
	 */
	public BtchJob(String alias) {
		this(alias, BTCH_JOB);
	}

	private BtchJob(String alias, Table<BtchJobRecord> aliased) {
		this(alias, aliased, null);
	}

	private BtchJob(String alias, Table<BtchJobRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Batch job.  There are none, one or many batch jobs in a batch job type.  A batch job groups together tasks that are related but not necessarily dependent on each other.  They may have been submitted as part of one user request.  E.g. Copy offers to market.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<BtchJobRecord> getPrimaryKey() {
		return Keys.PK_BTCH_JOB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<BtchJobRecord>> getKeys() {
		return Arrays.<UniqueKey<BtchJobRecord>>asList(Keys.PK_BTCH_JOB);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<BtchJobRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<BtchJobRecord, ?>>asList(Keys.FK_BTCHJOBTYP_BTCHJOB, Keys.FK_BTCHJOBSTUS_BTCHJOB);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJob as(String alias) {
		return new BtchJob(alias, this);
	}

	/**
	 * Rename this table
	 */
	public BtchJob rename(String name) {
		return new BtchJob(name, null);
	}
}
