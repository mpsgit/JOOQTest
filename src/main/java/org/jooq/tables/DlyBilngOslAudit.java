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
import org.jooq.tables.records.DlyBilngOslAuditRecord;


/**
 * Audit Trail table populated during the Sales Allocation process to record 
 * possible OSL matches for a daily billing record
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DlyBilngOslAudit extends TableImpl<DlyBilngOslAuditRecord> {

	private static final long serialVersionUID = 544684645;

	/**
	 * The reference instance of <code>WETRN.DLY_BILNG_OSL_AUDIT</code>
	 */
	public static final DlyBilngOslAudit DLY_BILNG_OSL_AUDIT = new DlyBilngOslAudit();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DlyBilngOslAuditRecord> getRecordType() {
		return DlyBilngOslAuditRecord.class;
	}

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.SLS_ALOCTN_AUTO_STRT_TS</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, Date> SLS_ALOCTN_AUTO_STRT_TS = createField("SLS_ALOCTN_AUTO_STRT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.DLY_BILNG_ID</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, BigDecimal> DLY_BILNG_ID = createField("DLY_BILNG_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.DEMAND_IND</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, String> DEMAND_IND = createField("DEMAND_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.BILLED_IND</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, String> BILLED_IND = createField("BILLED_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.SKU_ID</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, BigDecimal> SKU_ID = createField("SKU_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.OFFR_SKU_LINE_ID</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, BigDecimal> OFFR_SKU_LINE_ID = createField("OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.OSL_LINE_NR</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, BigDecimal> OSL_LINE_NR = createField("OSL_LINE_NR", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.LINE_NR_MTCH_IND</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, String> LINE_NR_MTCH_IND = createField("LINE_NR_MTCH_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.QTY_DIFF</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, BigDecimal> QTY_DIFF = createField("QTY_DIFF", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.PRC_DIFF</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, BigDecimal> PRC_DIFF = createField("PRC_DIFF", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.UNIT_PRC_DIFF</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, BigDecimal> UNIT_PRC_DIFF = createField("UNIT_PRC_DIFF", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.VEH_ID</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.PLND_VEH_IND</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, String> PLND_VEH_IND = createField("PLND_VEH_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.SLS_CHNL_MTCH_IND</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, String> SLS_CHNL_MTCH_IND = createField("SLS_CHNL_MTCH_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.SLS_CHNL_USED_IND</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, String> SLS_CHNL_USED_IND = createField("SLS_CHNL_USED_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.MTCH_TYP_ID</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, String> MTCH_TYP_ID = createField("MTCH_TYP_ID", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.DEL_RESN_CD</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, BigDecimal> DEL_RESN_CD = createField("DEL_RESN_CD", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_OSL_AUDIT.AUTO_MTCH_IND</code>.
	 */
	public final TableField<DlyBilngOslAuditRecord, String> AUTO_MTCH_IND = createField("AUTO_MTCH_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * Create a <code>WETRN.DLY_BILNG_OSL_AUDIT</code> table reference
	 */
	public DlyBilngOslAudit() {
		this("DLY_BILNG_OSL_AUDIT", null);
	}

	/**
	 * Create an aliased <code>WETRN.DLY_BILNG_OSL_AUDIT</code> table reference
	 */
	public DlyBilngOslAudit(String alias) {
		this(alias, DLY_BILNG_OSL_AUDIT);
	}

	private DlyBilngOslAudit(String alias, Table<DlyBilngOslAuditRecord> aliased) {
		this(alias, aliased, null);
	}

	private DlyBilngOslAudit(String alias, Table<DlyBilngOslAuditRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Audit Trail table populated during the Sales Allocation process to record possible OSL matches for a daily billing record");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngOslAudit as(String alias) {
		return new DlyBilngOslAudit(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DlyBilngOslAudit rename(String name) {
		return new DlyBilngOslAudit(name, null);
	}
}