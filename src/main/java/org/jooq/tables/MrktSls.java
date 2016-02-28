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
import org.jooq.tables.records.MrktSlsRecord;


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
public class MrktSls extends TableImpl<MrktSlsRecord> {

	private static final long serialVersionUID = 134638590;

	/**
	 * The reference instance of <code>WETRN.MRKT_SLS</code>
	 */
	public static final MrktSls MRKT_SLS = new MrktSls();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktSlsRecord> getRecordType() {
		return MrktSlsRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_SLS.OFFR_SKU_LINE_ID</code>.
	 */
	public final TableField<MrktSlsRecord, BigDecimal> OFFR_SKU_LINE_ID = createField("OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.SLS_TYP_ID</code>.
	 */
	public final TableField<MrktSlsRecord, BigDecimal> SLS_TYP_ID = createField("SLS_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.MRKT_ID</code>.
	 */
	public final TableField<MrktSlsRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.VEH_ID</code>.
	 */
	public final TableField<MrktSlsRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.OFFR_PERD_ID</code>.
	 */
	public final TableField<MrktSlsRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.STUS_CD</code>.
	 */
	public final TableField<MrktSlsRecord, String> STUS_CD = createField("STUS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.CURRNT_EST_IND</code>.
	 */
	public final TableField<MrktSlsRecord, String> CURRNT_EST_IND = createField("CURRNT_EST_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.CURRNT_SLS_SRCE_ID</code>.
	 */
	public final TableField<MrktSlsRecord, BigDecimal> CURRNT_SLS_SRCE_ID = createField("CURRNT_SLS_SRCE_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.CURRNT_UNIT_QTY</code>.
	 */
	public final TableField<MrktSlsRecord, BigDecimal> CURRNT_UNIT_QTY = createField("CURRNT_UNIT_QTY", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.PREV_SLS_SRCE_ID</code>.
	 */
	public final TableField<MrktSlsRecord, BigDecimal> PREV_SLS_SRCE_ID = createField("PREV_SLS_SRCE_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.PREV_UNIT_QTY</code>.
	 */
	public final TableField<MrktSlsRecord, BigDecimal> PREV_UNIT_QTY = createField("PREV_UNIT_QTY", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.CREAT_USER_ID</code>.
	 */
	public final TableField<MrktSlsRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.CREAT_TS</code>.
	 */
	public final TableField<MrktSlsRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MrktSlsRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.LAST_UPDT_TS</code>.
	 */
	public final TableField<MrktSlsRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.COMSN_AMT</code>.
	 */
	public final TableField<MrktSlsRecord, BigDecimal> COMSN_AMT = createField("COMSN_AMT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.TAX_AMT</code>.
	 */
	public final TableField<MrktSlsRecord, BigDecimal> TAX_AMT = createField("TAX_AMT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS.NET_TO_AVON_FCT</code>.
	 */
	public final TableField<MrktSlsRecord, BigDecimal> NET_TO_AVON_FCT = createField("NET_TO_AVON_FCT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * Create a <code>WETRN.MRKT_SLS</code> table reference
	 */
	public MrktSls() {
		this("MRKT_SLS", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_SLS</code> table reference
	 */
	public MrktSls(String alias) {
		this(alias, MRKT_SLS);
	}

	private MrktSls(String alias, Table<MrktSlsRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktSls(String alias, Table<MrktSlsRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSls as(String alias) {
		return new MrktSls(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktSls rename(String name) {
		return new MrktSls(name, null);
	}
}
