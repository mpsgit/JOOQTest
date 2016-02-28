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
import org.jooq.tables.records.BtchJobTypRecord;


/**
 * Batch job type.  There are none, one or many batch job types in a batch 
 * job type group.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BtchJobTyp extends TableImpl<BtchJobTypRecord> {

	private static final long serialVersionUID = -1228721349;

	/**
	 * The reference instance of <code>WETRN.BTCH_JOB_TYP</code>
	 */
	public static final BtchJobTyp BTCH_JOB_TYP = new BtchJobTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BtchJobTypRecord> getRecordType() {
		return BtchJobTypRecord.class;
	}

	/**
	 * The column <code>WETRN.BTCH_JOB_TYP.BTCH_JOB_TYP_ID</code>. Batch job type id.  Unique identifier for a batch job type.
	 */
	public final TableField<BtchJobTypRecord, BigDecimal> BTCH_JOB_TYP_ID = createField("BTCH_JOB_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "Batch job type id.  Unique identifier for a batch job type.");

	/**
	 * The column <code>WETRN.BTCH_JOB_TYP.BTCH_JOB_TYP_GRP_ID</code>. Batch job type group id.  The batch job type group that this batch job type belongs to.
	 */
	public final TableField<BtchJobTypRecord, BigDecimal> BTCH_JOB_TYP_GRP_ID = createField("BTCH_JOB_TYP_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "Batch job type group id.  The batch job type group that this batch job type belongs to.");

	/**
	 * The column <code>WETRN.BTCH_JOB_TYP.BTCH_JOB_TYP_SDESC_TXT</code>.
	 */
	public final TableField<BtchJobTypRecord, String> BTCH_JOB_TYP_SDESC_TXT = createField("BTCH_JOB_TYP_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>WETRN.BTCH_JOB_TYP.BTCH_JOB_TYP_DESC_TXT</code>.
	 */
	public final TableField<BtchJobTypRecord, String> BTCH_JOB_TYP_DESC_TXT = createField("BTCH_JOB_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(250).nullable(false), this, "");

	/**
	 * The column <code>WETRN.BTCH_JOB_TYP.BTCH_JOB_TYP_ACTV_IND</code>. Batch job type active indicator.  Indicates if the job type is to be processed.  Valid values are {'N', 'Y'}.  This could be changed to 'N' manually to stop this job type from being processed or automatically if the system detects a fatal error that would make further processing of this job type inappropriate.
	 */
	public final TableField<BtchJobTypRecord, String> BTCH_JOB_TYP_ACTV_IND = createField("BTCH_JOB_TYP_ACTV_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "Batch job type active indicator.  Indicates if the job type is to be processed.  Valid values are {'N', 'Y'}.  This could be changed to 'N' manually to stop this job type from being processed or automatically if the system detects a fatal error that would make further processing of this job type inappropriate.");

	/**
	 * The column <code>WETRN.BTCH_JOB_TYP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<BtchJobTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.BTCH_JOB_TYP.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<BtchJobTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.BTCH_JOB_TYP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<BtchJobTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.BTCH_JOB_TYP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<BtchJobTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.BTCH_JOB_TYP</code> table reference
	 */
	public BtchJobTyp() {
		this("BTCH_JOB_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.BTCH_JOB_TYP</code> table reference
	 */
	public BtchJobTyp(String alias) {
		this(alias, BTCH_JOB_TYP);
	}

	private BtchJobTyp(String alias, Table<BtchJobTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private BtchJobTyp(String alias, Table<BtchJobTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Batch job type.  There are none, one or many batch job types in a batch job type group.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<BtchJobTypRecord> getPrimaryKey() {
		return Keys.PK_BTCH_JOB_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<BtchJobTypRecord>> getKeys() {
		return Arrays.<UniqueKey<BtchJobTypRecord>>asList(Keys.PK_BTCH_JOB_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<BtchJobTypRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<BtchJobTypRecord, ?>>asList(Keys.FK_BTCHJOBTYPGRP_BTCHJOBTYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BtchJobTyp as(String alias) {
		return new BtchJobTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public BtchJobTyp rename(String name) {
		return new BtchJobTyp(name, null);
	}
}
