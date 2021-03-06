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
import org.jooq.tables.records.TrnsfrmPrevYrMrktPerdRecord;


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
public class TrnsfrmPrevYrMrktPerd extends TableImpl<TrnsfrmPrevYrMrktPerdRecord> {

	private static final long serialVersionUID = 717021500;

	/**
	 * The reference instance of <code>WETRN.TRNSFRM_PREV_YR_MRKT_PERD</code>
	 */
	public static final TrnsfrmPrevYrMrktPerd TRNSFRM_PREV_YR_MRKT_PERD = new TrnsfrmPrevYrMrktPerd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TrnsfrmPrevYrMrktPerdRecord> getRecordType() {
		return TrnsfrmPrevYrMrktPerdRecord.class;
	}

	/**
	 * The column <code>WETRN.TRNSFRM_PREV_YR_MRKT_PERD.MRKT_ID</code>.
	 */
	public final TableField<TrnsfrmPrevYrMrktPerdRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.TRNSFRM_PREV_YR_MRKT_PERD.PERD_ID</code>.
	 */
	public final TableField<TrnsfrmPrevYrMrktPerdRecord, BigDecimal> PERD_ID = createField("PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.TRNSFRM_PREV_YR_MRKT_PERD.PREV_YR_PERD_ID</code>.
	 */
	public final TableField<TrnsfrmPrevYrMrktPerdRecord, BigDecimal> PREV_YR_PERD_ID = createField("PREV_YR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.TRNSFRM_PREV_YR_MRKT_PERD.PREV_YR_PERD_ALOCTN_PCT</code>.
	 */
	public final TableField<TrnsfrmPrevYrMrktPerdRecord, BigDecimal> PREV_YR_PERD_ALOCTN_PCT = createField("PREV_YR_PERD_ALOCTN_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(9, 6), this, "");

	/**
	 * The column <code>WETRN.TRNSFRM_PREV_YR_MRKT_PERD.CREAT_USER_ID</code>.
	 */
	public final TableField<TrnsfrmPrevYrMrktPerdRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.TRNSFRM_PREV_YR_MRKT_PERD.CREAT_TS</code>.
	 */
	public final TableField<TrnsfrmPrevYrMrktPerdRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.TRNSFRM_PREV_YR_MRKT_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<TrnsfrmPrevYrMrktPerdRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.TRNSFRM_PREV_YR_MRKT_PERD.LAST_UPDT_TS</code>.
	 */
	public final TableField<TrnsfrmPrevYrMrktPerdRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.TRNSFRM_PREV_YR_MRKT_PERD</code> table reference
	 */
	public TrnsfrmPrevYrMrktPerd() {
		this("TRNSFRM_PREV_YR_MRKT_PERD", null);
	}

	/**
	 * Create an aliased <code>WETRN.TRNSFRM_PREV_YR_MRKT_PERD</code> table reference
	 */
	public TrnsfrmPrevYrMrktPerd(String alias) {
		this(alias, TRNSFRM_PREV_YR_MRKT_PERD);
	}

	private TrnsfrmPrevYrMrktPerd(String alias, Table<TrnsfrmPrevYrMrktPerdRecord> aliased) {
		this(alias, aliased, null);
	}

	private TrnsfrmPrevYrMrktPerd(String alias, Table<TrnsfrmPrevYrMrktPerdRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TrnsfrmPrevYrMrktPerdRecord> getPrimaryKey() {
		return Keys.PK_TRNSFRM_PREV_YR_MRKT_PERD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TrnsfrmPrevYrMrktPerdRecord>> getKeys() {
		return Arrays.<UniqueKey<TrnsfrmPrevYrMrktPerdRecord>>asList(Keys.PK_TRNSFRM_PREV_YR_MRKT_PERD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<TrnsfrmPrevYrMrktPerdRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<TrnsfrmPrevYrMrktPerdRecord, ?>>asList(Keys.FK1_MRKTPERD_TRNSFRMPREVYRMRKT, Keys.FK2_MRKTPERD_TRNSFRMPREVYRMRKT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrnsfrmPrevYrMrktPerd as(String alias) {
		return new TrnsfrmPrevYrMrktPerd(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TrnsfrmPrevYrMrktPerd rename(String name) {
		return new TrnsfrmPrevYrMrktPerd(name, null);
	}
}
