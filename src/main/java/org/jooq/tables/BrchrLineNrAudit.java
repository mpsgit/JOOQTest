/**
 * This class is generated by jOOQ
 */
package org.jooq.tables;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.Wetrn;
import org.jooq.impl.TableImpl;
import org.jooq.tables.records.BrchrLineNrAuditRecord;


/**
 * Audit trail of changes made via batch assignment or MAPS screens
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BrchrLineNrAudit extends TableImpl<BrchrLineNrAuditRecord> {

	private static final long serialVersionUID = 1748512184;

	/**
	 * The reference instance of <code>WETRN.BRCHR_LINE_NR_AUDIT</code>
	 */
	public static final BrchrLineNrAudit BRCHR_LINE_NR_AUDIT = new BrchrLineNrAudit();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BrchrLineNrAuditRecord> getRecordType() {
		return BrchrLineNrAuditRecord.class;
	}

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.CLSTR_ID</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, BigDecimal> CLSTR_ID = createField("CLSTR_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.LINE_NR</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, String> LINE_NR = createField("LINE_NR", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.LINE_NR_TYP_ID</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, BigDecimal> LINE_NR_TYP_ID = createField("LINE_NR_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.OLD_SKU_ID</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, BigDecimal> OLD_SKU_ID = createField("OLD_SKU_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.OLD_MSTR_FSC_CD</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, String> OLD_MSTR_FSC_CD = createField("OLD_MSTR_FSC_CD", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.OLD_LAST_USED_PERD</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, BigDecimal> OLD_LAST_USED_PERD = createField("OLD_LAST_USED_PERD", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.OLD_SKU_SET_SKU_ID</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, String> OLD_SKU_SET_SKU_ID = createField("OLD_SKU_SET_SKU_ID", org.jooq.impl.SQLDataType.VARCHAR.length(4000), this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.OLD_MS_FSC_CD</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, String> OLD_MS_FSC_CD = createField("OLD_MS_FSC_CD", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.NEW_SKU_ID</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, BigDecimal> NEW_SKU_ID = createField("NEW_SKU_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.NEW_MSTR_FSC_CD</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, String> NEW_MSTR_FSC_CD = createField("NEW_MSTR_FSC_CD", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.NEW_LAST_USED_PERD</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, BigDecimal> NEW_LAST_USED_PERD = createField("NEW_LAST_USED_PERD", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.NEW_SKU_SET_SKU_ID</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, String> NEW_SKU_SET_SKU_ID = createField("NEW_SKU_SET_SKU_ID", org.jooq.impl.SQLDataType.VARCHAR.length(4000), this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.NEW_MS_FSC_CD</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, String> NEW_MS_FSC_CD = createField("NEW_MS_FSC_CD", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.CHANGE_MSG</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, String> CHANGE_MSG = createField("CHANGE_MSG", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.AUDIT_TS</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, Date> AUDIT_TS = createField("AUDIT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_AUDIT.AUDIT_USER_ID</code>.
	 */
	public final TableField<BrchrLineNrAuditRecord, String> AUDIT_USER_ID = createField("AUDIT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>WETRN.BRCHR_LINE_NR_AUDIT</code> table reference
	 */
	public BrchrLineNrAudit() {
		this("BRCHR_LINE_NR_AUDIT", null);
	}

	/**
	 * Create an aliased <code>WETRN.BRCHR_LINE_NR_AUDIT</code> table reference
	 */
	public BrchrLineNrAudit(String alias) {
		this(alias, BRCHR_LINE_NR_AUDIT);
	}

	private BrchrLineNrAudit(String alias, Table<BrchrLineNrAuditRecord> aliased) {
		this(alias, aliased, null);
	}

	private BrchrLineNrAudit(String alias, Table<BrchrLineNrAuditRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Audit trail of changes made via batch assignment or MAPS screens");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BrchrLineNrAudit as(String alias) {
		return new BrchrLineNrAudit(alias, this);
	}

	/**
	 * Rename this table
	 */
	public BrchrLineNrAudit rename(String name) {
		return new BrchrLineNrAudit(name, null);
	}
}
