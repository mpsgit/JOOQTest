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
import org.jooq.tables.records.MrktConfigItemAuditRecord;


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
public class MrktConfigItemAudit extends TableImpl<MrktConfigItemAuditRecord> {

	private static final long serialVersionUID = 203164710;

	/**
	 * The reference instance of <code>WETRN.MRKT_CONFIG_ITEM_AUDIT</code>
	 */
	public static final MrktConfigItemAudit MRKT_CONFIG_ITEM_AUDIT = new MrktConfigItemAudit();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktConfigItemAuditRecord> getRecordType() {
		return MrktConfigItemAuditRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.MRKT_ID</code>.
	 */
	public final TableField<MrktConfigItemAuditRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.CONFIG_ITEM_ID</code>.
	 */
	public final TableField<MrktConfigItemAuditRecord, BigDecimal> CONFIG_ITEM_ID = createField("CONFIG_ITEM_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.MRKT_CONFIG_ITEM_DESC_TXT</code>.
	 */
	public final TableField<MrktConfigItemAuditRecord, String> MRKT_CONFIG_ITEM_DESC_TXT = createField("MRKT_CONFIG_ITEM_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.MRKT_CONFIG_ITEM_LABL_TXT</code>.
	 */
	public final TableField<MrktConfigItemAuditRecord, String> MRKT_CONFIG_ITEM_LABL_TXT = createField("MRKT_CONFIG_ITEM_LABL_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.MRKT_CONFIG_ITEM_VAL_TXT</code>.
	 */
	public final TableField<MrktConfigItemAuditRecord, String> MRKT_CONFIG_ITEM_VAL_TXT = createField("MRKT_CONFIG_ITEM_VAL_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.CREAT_USER_ID</code>.
	 */
	public final TableField<MrktConfigItemAuditRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.CREAT_TS</code>.
	 */
	public final TableField<MrktConfigItemAuditRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MrktConfigItemAuditRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_CONFIG_ITEM_AUDIT.LAST_UPDT_TS</code>.
	 */
	public final TableField<MrktConfigItemAuditRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.MRKT_CONFIG_ITEM_AUDIT</code> table reference
	 */
	public MrktConfigItemAudit() {
		this("MRKT_CONFIG_ITEM_AUDIT", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_CONFIG_ITEM_AUDIT</code> table reference
	 */
	public MrktConfigItemAudit(String alias) {
		this(alias, MRKT_CONFIG_ITEM_AUDIT);
	}

	private MrktConfigItemAudit(String alias, Table<MrktConfigItemAuditRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktConfigItemAudit(String alias, Table<MrktConfigItemAuditRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktConfigItemAudit as(String alias) {
		return new MrktConfigItemAudit(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktConfigItemAudit rename(String name) {
		return new MrktConfigItemAudit(name, null);
	}
}
