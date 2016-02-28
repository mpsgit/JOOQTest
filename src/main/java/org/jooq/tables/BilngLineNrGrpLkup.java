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
import org.jooq.tables.records.BilngLineNrGrpLkupRecord;


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
public class BilngLineNrGrpLkup extends TableImpl<BilngLineNrGrpLkupRecord> {

	private static final long serialVersionUID = 139660217;

	/**
	 * The reference instance of <code>WETRN.BILNG_LINE_NR_GRP_LKUP</code>
	 */
	public static final BilngLineNrGrpLkup BILNG_LINE_NR_GRP_LKUP = new BilngLineNrGrpLkup();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BilngLineNrGrpLkupRecord> getRecordType() {
		return BilngLineNrGrpLkupRecord.class;
	}

	/**
	 * The column <code>WETRN.BILNG_LINE_NR_GRP_LKUP.CLSTR_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public final TableField<BilngLineNrGrpLkupRecord, BigDecimal> CLSTR_ID = createField("CLSTR_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.");

	/**
	 * The column <code>WETRN.BILNG_LINE_NR_GRP_LKUP.MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public final TableField<BilngLineNrGrpLkupRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.");

	/**
	 * The column <code>WETRN.BILNG_LINE_NR_GRP_LKUP.BILNG_LINE_NR_GRP_ID</code>.
	 */
	public final TableField<BilngLineNrGrpLkupRecord, BigDecimal> BILNG_LINE_NR_GRP_ID = createField("BILNG_LINE_NR_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.BILNG_LINE_NR_GRP_LKUP.BILNG_LINE_NR_GRP_DESC_TXT</code>.
	 */
	public final TableField<BilngLineNrGrpLkupRecord, String> BILNG_LINE_NR_GRP_DESC_TXT = createField("BILNG_LINE_NR_GRP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.BILNG_LINE_NR_GRP_LKUP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<BilngLineNrGrpLkupRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.BILNG_LINE_NR_GRP_LKUP.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<BilngLineNrGrpLkupRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.BILNG_LINE_NR_GRP_LKUP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<BilngLineNrGrpLkupRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.BILNG_LINE_NR_GRP_LKUP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<BilngLineNrGrpLkupRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.BILNG_LINE_NR_GRP_LKUP</code> table reference
	 */
	public BilngLineNrGrpLkup() {
		this("BILNG_LINE_NR_GRP_LKUP", null);
	}

	/**
	 * Create an aliased <code>WETRN.BILNG_LINE_NR_GRP_LKUP</code> table reference
	 */
	public BilngLineNrGrpLkup(String alias) {
		this(alias, BILNG_LINE_NR_GRP_LKUP);
	}

	private BilngLineNrGrpLkup(String alias, Table<BilngLineNrGrpLkupRecord> aliased) {
		this(alias, aliased, null);
	}

	private BilngLineNrGrpLkup(String alias, Table<BilngLineNrGrpLkupRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<BilngLineNrGrpLkupRecord> getPrimaryKey() {
		return Keys.PK_BILNG_LINE_NR_GRP_LKUP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<BilngLineNrGrpLkupRecord>> getKeys() {
		return Arrays.<UniqueKey<BilngLineNrGrpLkupRecord>>asList(Keys.PK_BILNG_LINE_NR_GRP_LKUP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<BilngLineNrGrpLkupRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<BilngLineNrGrpLkupRecord, ?>>asList(Keys.FK_MRKT_BILNGLINENRGRPLKUP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BilngLineNrGrpLkup as(String alias) {
		return new BilngLineNrGrpLkup(alias, this);
	}

	/**
	 * Rename this table
	 */
	public BilngLineNrGrpLkup rename(String name) {
		return new BilngLineNrGrpLkup(name, null);
	}
}
