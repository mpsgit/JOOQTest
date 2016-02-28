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
import org.jooq.tables.records.DlyBilngTrndOslAuditRecord;


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
public class DlyBilngTrndOslAudit extends TableImpl<DlyBilngTrndOslAuditRecord> {

	private static final long serialVersionUID = 657637948;

	/**
	 * The reference instance of <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT</code>
	 */
	public static final DlyBilngTrndOslAudit DLY_BILNG_TRND_OSL_AUDIT = new DlyBilngTrndOslAudit();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DlyBilngTrndOslAuditRecord> getRecordType() {
		return DlyBilngTrndOslAuditRecord.class;
	}

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.TRND_ALOCTN_AUTO_STRT_TS</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, Date> TRND_ALOCTN_AUTO_STRT_TS = createField("TRND_ALOCTN_AUTO_STRT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.DLY_BILNG_ID</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, BigDecimal> DLY_BILNG_ID = createField("DLY_BILNG_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.DEMAND_IND</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, String> DEMAND_IND = createField("DEMAND_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.BILLED_IND</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, String> BILLED_IND = createField("BILLED_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.SKU_ID</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, BigDecimal> SKU_ID = createField("SKU_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.OFFR_SKU_LINE_ID</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, BigDecimal> OFFR_SKU_LINE_ID = createField("OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.OSL_LINE_NR</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, BigDecimal> OSL_LINE_NR = createField("OSL_LINE_NR", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.LINE_NR_MTCH_IND</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, String> LINE_NR_MTCH_IND = createField("LINE_NR_MTCH_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.QTY_DIFF</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, BigDecimal> QTY_DIFF = createField("QTY_DIFF", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.PRC_DIFF</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, BigDecimal> PRC_DIFF = createField("PRC_DIFF", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.UNIT_PRC_DIFF</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, BigDecimal> UNIT_PRC_DIFF = createField("UNIT_PRC_DIFF", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.VEH_ID</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.PLND_VEH_IND</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, String> PLND_VEH_IND = createField("PLND_VEH_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.TRND_CHNL_MTCH_IND</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, String> TRND_CHNL_MTCH_IND = createField("TRND_CHNL_MTCH_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.TRND_CHNL_USED_IND</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, String> TRND_CHNL_USED_IND = createField("TRND_CHNL_USED_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.MTCH_TYP_ID</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, String> MTCH_TYP_ID = createField("MTCH_TYP_ID", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.DEL_RESN_CD</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, BigDecimal> DEL_RESN_CD = createField("DEL_RESN_CD", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT.AUTO_MTCH_IND</code>.
	 */
	public final TableField<DlyBilngTrndOslAuditRecord, String> AUTO_MTCH_IND = createField("AUTO_MTCH_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * Create a <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT</code> table reference
	 */
	public DlyBilngTrndOslAudit() {
		this("DLY_BILNG_TRND_OSL_AUDIT", null);
	}

	/**
	 * Create an aliased <code>WETRN.DLY_BILNG_TRND_OSL_AUDIT</code> table reference
	 */
	public DlyBilngTrndOslAudit(String alias) {
		this(alias, DLY_BILNG_TRND_OSL_AUDIT);
	}

	private DlyBilngTrndOslAudit(String alias, Table<DlyBilngTrndOslAuditRecord> aliased) {
		this(alias, aliased, null);
	}

	private DlyBilngTrndOslAudit(String alias, Table<DlyBilngTrndOslAuditRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngTrndOslAudit as(String alias) {
		return new DlyBilngTrndOslAudit(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DlyBilngTrndOslAudit rename(String name) {
		return new DlyBilngTrndOslAudit(name, null);
	}
}
