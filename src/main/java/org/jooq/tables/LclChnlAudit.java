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
import org.jooq.tables.records.LclChnlAuditRecord;


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
public class LclChnlAudit extends TableImpl<LclChnlAuditRecord> {

	private static final long serialVersionUID = -684809098;

	/**
	 * The reference instance of <code>WETRN.LCL_CHNL_AUDIT</code>
	 */
	public static final LclChnlAudit LCL_CHNL_AUDIT = new LclChnlAudit();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<LclChnlAuditRecord> getRecordType() {
		return LclChnlAuditRecord.class;
	}

	/**
	 * The column <code>WETRN.LCL_CHNL_AUDIT.MRKT_ID</code>.
	 */
	public final TableField<LclChnlAuditRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.LCL_CHNL_AUDIT.LCL_CHNL_ID</code>.
	 */
	public final TableField<LclChnlAuditRecord, String> LCL_CHNL_ID = createField("LCL_CHNL_ID", org.jooq.impl.SQLDataType.VARCHAR.length(4).nullable(false), this, "");

	/**
	 * The column <code>WETRN.LCL_CHNL_AUDIT.LCL_CHNL_DESC_TXT</code>.
	 */
	public final TableField<LclChnlAuditRecord, String> LCL_CHNL_DESC_TXT = createField("LCL_CHNL_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.LCL_CHNL_AUDIT.CREAT_USER_ID</code>.
	 */
	public final TableField<LclChnlAuditRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.LCL_CHNL_AUDIT.CREAT_TS</code>.
	 */
	public final TableField<LclChnlAuditRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.LCL_CHNL_AUDIT.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<LclChnlAuditRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.LCL_CHNL_AUDIT.LAST_UPDT_TS</code>.
	 */
	public final TableField<LclChnlAuditRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.LCL_CHNL_AUDIT</code> table reference
	 */
	public LclChnlAudit() {
		this("LCL_CHNL_AUDIT", null);
	}

	/**
	 * Create an aliased <code>WETRN.LCL_CHNL_AUDIT</code> table reference
	 */
	public LclChnlAudit(String alias) {
		this(alias, LCL_CHNL_AUDIT);
	}

	private LclChnlAudit(String alias, Table<LclChnlAuditRecord> aliased) {
		this(alias, aliased, null);
	}

	private LclChnlAudit(String alias, Table<LclChnlAuditRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LclChnlAudit as(String alias) {
		return new LclChnlAudit(alias, this);
	}

	/**
	 * Rename this table
	 */
	public LclChnlAudit rename(String name) {
		return new LclChnlAudit(name, null);
	}
}
