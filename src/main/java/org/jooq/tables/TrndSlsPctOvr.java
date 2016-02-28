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
import org.jooq.Keys;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.Wetrn;
import org.jooq.impl.TableImpl;
import org.jooq.tables.records.TrndSlsPctOvrRecord;


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
public class TrndSlsPctOvr extends TableImpl<TrndSlsPctOvrRecord> {

	private static final long serialVersionUID = -183871050;

	/**
	 * The reference instance of <code>WETRN.TRND_SLS_PCT_OVR</code>
	 */
	public static final TrndSlsPctOvr TRND_SLS_PCT_OVR = new TrndSlsPctOvr();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TrndSlsPctOvrRecord> getRecordType() {
		return TrndSlsPctOvrRecord.class;
	}

	/**
	 * The column <code>WETRN.TRND_SLS_PCT_OVR.MRKT_ID</code>.
	 */
	public final TableField<TrndSlsPctOvrRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.TRND_SLS_PCT_OVR.SLS_PERD_ID</code>.
	 */
	public final TableField<TrndSlsPctOvrRecord, BigDecimal> SLS_PERD_ID = createField("SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.TRND_SLS_PCT_OVR.OFFR_PERD_ID</code>.
	 */
	public final TableField<TrndSlsPctOvrRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.TRND_SLS_PCT_OVR.DAY_NUM</code>.
	 */
	public final TableField<TrndSlsPctOvrRecord, BigDecimal> DAY_NUM = createField("DAY_NUM", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.TRND_SLS_PCT_OVR.PCT_OVR</code>.
	 */
	public final TableField<TrndSlsPctOvrRecord, BigDecimal> PCT_OVR = createField("PCT_OVR", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.TRND_SLS_PCT_OVR.CREAT_USER_ID</code>.
	 */
	public final TableField<TrndSlsPctOvrRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.TRND_SLS_PCT_OVR.CREAT_TS</code>.
	 */
	public final TableField<TrndSlsPctOvrRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.TRND_SLS_PCT_OVR.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<TrndSlsPctOvrRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.TRND_SLS_PCT_OVR.LAST_UPDT_TS</code>.
	 */
	public final TableField<TrndSlsPctOvrRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.TRND_SLS_PCT_OVR.SELECTED</code>.
	 */
	public final TableField<TrndSlsPctOvrRecord, BigDecimal> SELECTED = createField("SELECTED", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>WETRN.TRND_SLS_PCT_OVR</code> table reference
	 */
	public TrndSlsPctOvr() {
		this("TRND_SLS_PCT_OVR", null);
	}

	/**
	 * Create an aliased <code>WETRN.TRND_SLS_PCT_OVR</code> table reference
	 */
	public TrndSlsPctOvr(String alias) {
		this(alias, TRND_SLS_PCT_OVR);
	}

	private TrndSlsPctOvr(String alias, Table<TrndSlsPctOvrRecord> aliased) {
		this(alias, aliased, null);
	}

	private TrndSlsPctOvr(String alias, Table<TrndSlsPctOvrRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TrndSlsPctOvrRecord> getPrimaryKey() {
		return Keys.TRND_SLS_PCT_OVR_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TrndSlsPctOvrRecord>> getKeys() {
		return Arrays.<UniqueKey<TrndSlsPctOvrRecord>>asList(Keys.TRND_SLS_PCT_OVR_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrndSlsPctOvr as(String alias) {
		return new TrndSlsPctOvr(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TrndSlsPctOvr rename(String name) {
		return new TrndSlsPctOvr(name, null);
	}
}
