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
import org.jooq.tables.records.MrktSetBilngFscAuditRecord;


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
public class MrktSetBilngFscAudit extends TableImpl<MrktSetBilngFscAuditRecord> {

	private static final long serialVersionUID = 602703494;

	/**
	 * The reference instance of <code>WETRN.MRKT_SET_BILNG_FSC_AUDIT</code>
	 */
	public static final MrktSetBilngFscAudit MRKT_SET_BILNG_FSC_AUDIT = new MrktSetBilngFscAudit();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktSetBilngFscAuditRecord> getRecordType() {
		return MrktSetBilngFscAuditRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_SET_BILNG_FSC_AUDIT.MRKT_ID</code>.
	 */
	public final TableField<MrktSetBilngFscAuditRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_SET_BILNG_FSC_AUDIT.FSC_CD</code>.
	 */
	public final TableField<MrktSetBilngFscAuditRecord, String> FSC_CD = createField("FSC_CD", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "");

	/**
	 * The column <code>WETRN.MRKT_SET_BILNG_FSC_AUDIT.OLD_LAST_USED_PERD</code>.
	 */
	public final TableField<MrktSetBilngFscAuditRecord, BigDecimal> OLD_LAST_USED_PERD = createField("OLD_LAST_USED_PERD", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_SET_BILNG_FSC_AUDIT.OLD_SKU_SET_SKU_ID</code>.
	 */
	public final TableField<MrktSetBilngFscAuditRecord, String> OLD_SKU_SET_SKU_ID = createField("OLD_SKU_SET_SKU_ID", org.jooq.impl.SQLDataType.VARCHAR.length(4000), this, "");

	/**
	 * The column <code>WETRN.MRKT_SET_BILNG_FSC_AUDIT.NEW_LAST_USED_PERD</code>.
	 */
	public final TableField<MrktSetBilngFscAuditRecord, BigDecimal> NEW_LAST_USED_PERD = createField("NEW_LAST_USED_PERD", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_SET_BILNG_FSC_AUDIT.NEW_SKU_SET_SKU_ID</code>.
	 */
	public final TableField<MrktSetBilngFscAuditRecord, String> NEW_SKU_SET_SKU_ID = createField("NEW_SKU_SET_SKU_ID", org.jooq.impl.SQLDataType.VARCHAR.length(4000), this, "");

	/**
	 * The column <code>WETRN.MRKT_SET_BILNG_FSC_AUDIT.CHANGE_MSG</code>.
	 */
	public final TableField<MrktSetBilngFscAuditRecord, String> CHANGE_MSG = createField("CHANGE_MSG", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_SET_BILNG_FSC_AUDIT.AUDIT_TS</code>.
	 */
	public final TableField<MrktSetBilngFscAuditRecord, Date> AUDIT_TS = createField("AUDIT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_SET_BILNG_FSC_AUDIT.AUDIT_USER_ID</code>.
	 */
	public final TableField<MrktSetBilngFscAuditRecord, String> AUDIT_USER_ID = createField("AUDIT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>WETRN.MRKT_SET_BILNG_FSC_AUDIT</code> table reference
	 */
	public MrktSetBilngFscAudit() {
		this("MRKT_SET_BILNG_FSC_AUDIT", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_SET_BILNG_FSC_AUDIT</code> table reference
	 */
	public MrktSetBilngFscAudit(String alias) {
		this(alias, MRKT_SET_BILNG_FSC_AUDIT);
	}

	private MrktSetBilngFscAudit(String alias, Table<MrktSetBilngFscAuditRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktSetBilngFscAudit(String alias, Table<MrktSetBilngFscAuditRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Audit trail of changes made via batch assignment or MAPS screens");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSetBilngFscAudit as(String alias) {
		return new MrktSetBilngFscAudit(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktSetBilngFscAudit rename(String name) {
		return new MrktSetBilngFscAudit(name, null);
	}
}
