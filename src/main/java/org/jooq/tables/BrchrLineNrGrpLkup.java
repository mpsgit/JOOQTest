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
import org.jooq.tables.records.BrchrLineNrGrpLkupRecord;


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
public class BrchrLineNrGrpLkup extends TableImpl<BrchrLineNrGrpLkupRecord> {

	private static final long serialVersionUID = -2005537273;

	/**
	 * The reference instance of <code>WETRN.BRCHR_LINE_NR_GRP_LKUP</code>
	 */
	public static final BrchrLineNrGrpLkup BRCHR_LINE_NR_GRP_LKUP = new BrchrLineNrGrpLkup();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BrchrLineNrGrpLkupRecord> getRecordType() {
		return BrchrLineNrGrpLkupRecord.class;
	}

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP_LKUP.CLSTR_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public final TableField<BrchrLineNrGrpLkupRecord, BigDecimal> CLSTR_ID = createField("CLSTR_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP_LKUP.BILNG_SYS_GRP_LEAD_MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public final TableField<BrchrLineNrGrpLkupRecord, BigDecimal> BILNG_SYS_GRP_LEAD_MRKT_ID = createField("BILNG_SYS_GRP_LEAD_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP_LKUP.BRCHR_LINE_NR_GRP_ID</code>.
	 */
	public final TableField<BrchrLineNrGrpLkupRecord, BigDecimal> BRCHR_LINE_NR_GRP_ID = createField("BRCHR_LINE_NR_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP_LKUP.BRCHR_LINE_NR_GRP_DESC_TXT</code>.
	 */
	public final TableField<BrchrLineNrGrpLkupRecord, String> BRCHR_LINE_NR_GRP_DESC_TXT = createField("BRCHR_LINE_NR_GRP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP_LKUP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<BrchrLineNrGrpLkupRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP_LKUP.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<BrchrLineNrGrpLkupRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP_LKUP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<BrchrLineNrGrpLkupRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP_LKUP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<BrchrLineNrGrpLkupRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "The date and time the row was last updated.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP_LKUP.BRCHR_LINE_NR_GRP_SEQ_NR</code>. Brochure line number group sequence number.  Unique within the lead market but not within the table.  The group sequence used when processing the rules in BRCHR_LINE_NR_GRP.
	 */
	public final TableField<BrchrLineNrGrpLkupRecord, Short> BRCHR_LINE_NR_GRP_SEQ_NR = createField("BRCHR_LINE_NR_GRP_SEQ_NR", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "Brochure line number group sequence number.  Unique within the lead market but not within the table.  The group sequence used when processing the rules in BRCHR_LINE_NR_GRP.");

	/**
	 * Create a <code>WETRN.BRCHR_LINE_NR_GRP_LKUP</code> table reference
	 */
	public BrchrLineNrGrpLkup() {
		this("BRCHR_LINE_NR_GRP_LKUP", null);
	}

	/**
	 * Create an aliased <code>WETRN.BRCHR_LINE_NR_GRP_LKUP</code> table reference
	 */
	public BrchrLineNrGrpLkup(String alias) {
		this(alias, BRCHR_LINE_NR_GRP_LKUP);
	}

	private BrchrLineNrGrpLkup(String alias, Table<BrchrLineNrGrpLkupRecord> aliased) {
		this(alias, aliased, null);
	}

	private BrchrLineNrGrpLkup(String alias, Table<BrchrLineNrGrpLkupRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<BrchrLineNrGrpLkupRecord> getPrimaryKey() {
		return Keys.PK_BRCHR_LINE_NR_GRP_LKUP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<BrchrLineNrGrpLkupRecord>> getKeys() {
		return Arrays.<UniqueKey<BrchrLineNrGrpLkupRecord>>asList(Keys.PK_BRCHR_LINE_NR_GRP_LKUP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<BrchrLineNrGrpLkupRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<BrchrLineNrGrpLkupRecord, ?>>asList(Keys.FK_MRKT_BRCHRLINENRGRPLKUP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BrchrLineNrGrpLkup as(String alias) {
		return new BrchrLineNrGrpLkup(alias, this);
	}

	/**
	 * Rename this table
	 */
	public BrchrLineNrGrpLkup rename(String name) {
		return new BrchrLineNrGrpLkup(name, null);
	}
}
