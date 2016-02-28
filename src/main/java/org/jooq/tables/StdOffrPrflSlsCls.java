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
import org.jooq.tables.records.StdOffrPrflSlsClsRecord;


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
public class StdOffrPrflSlsCls extends TableImpl<StdOffrPrflSlsClsRecord> {

	private static final long serialVersionUID = -482965290;

	/**
	 * The reference instance of <code>WETRN.STD_OFFR_PRFL_SLS_CLS</code>
	 */
	public static final StdOffrPrflSlsCls STD_OFFR_PRFL_SLS_CLS = new StdOffrPrflSlsCls();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<StdOffrPrflSlsClsRecord> getRecordType() {
		return StdOffrPrflSlsClsRecord.class;
	}

	/**
	 * The column <code>WETRN.STD_OFFR_PRFL_SLS_CLS.STD_OFFR_ID</code>.
	 */
	public final TableField<StdOffrPrflSlsClsRecord, BigDecimal> STD_OFFR_ID = createField("STD_OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.STD_OFFR_PRFL_SLS_CLS.SLS_CLS_CD</code>.
	 */
	public final TableField<StdOffrPrflSlsClsRecord, String> SLS_CLS_CD = createField("SLS_CLS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

	/**
	 * The column <code>WETRN.STD_OFFR_PRFL_SLS_CLS.PRFL_CD</code>.
	 */
	public final TableField<StdOffrPrflSlsClsRecord, Integer> PRFL_CD = createField("PRFL_CD", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>WETRN.STD_OFFR_PRFL_SLS_CLS.PG_OFS_NR</code>.
	 */
	public final TableField<StdOffrPrflSlsClsRecord, BigDecimal> PG_OFS_NR = createField("PG_OFS_NR", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.STD_OFFR_PRFL_SLS_CLS.FEATRD_SIDE_CD</code>.
	 */
	public final TableField<StdOffrPrflSlsClsRecord, String> FEATRD_SIDE_CD = createField("FEATRD_SIDE_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

	/**
	 * The column <code>WETRN.STD_OFFR_PRFL_SLS_CLS.PG_WGHT_PCT</code>.
	 */
	public final TableField<StdOffrPrflSlsClsRecord, BigDecimal> PG_WGHT_PCT = createField("PG_WGHT_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.STD_OFFR_PRFL_SLS_CLS.CREAT_USER_ID</code>.
	 */
	public final TableField<StdOffrPrflSlsClsRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.STD_OFFR_PRFL_SLS_CLS.CREAT_TS</code>.
	 */
	public final TableField<StdOffrPrflSlsClsRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.STD_OFFR_PRFL_SLS_CLS.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<StdOffrPrflSlsClsRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.STD_OFFR_PRFL_SLS_CLS.LAST_UPDT_TS</code>.
	 */
	public final TableField<StdOffrPrflSlsClsRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.STD_OFFR_PRFL_SLS_CLS</code> table reference
	 */
	public StdOffrPrflSlsCls() {
		this("STD_OFFR_PRFL_SLS_CLS", null);
	}

	/**
	 * Create an aliased <code>WETRN.STD_OFFR_PRFL_SLS_CLS</code> table reference
	 */
	public StdOffrPrflSlsCls(String alias) {
		this(alias, STD_OFFR_PRFL_SLS_CLS);
	}

	private StdOffrPrflSlsCls(String alias, Table<StdOffrPrflSlsClsRecord> aliased) {
		this(alias, aliased, null);
	}

	private StdOffrPrflSlsCls(String alias, Table<StdOffrPrflSlsClsRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<StdOffrPrflSlsClsRecord> getPrimaryKey() {
		return Keys.PK_STD_OFFR_PRFL_SLS_CLS_PLCMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<StdOffrPrflSlsClsRecord>> getKeys() {
		return Arrays.<UniqueKey<StdOffrPrflSlsClsRecord>>asList(Keys.PK_STD_OFFR_PRFL_SLS_CLS_PLCMT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<StdOffrPrflSlsClsRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<StdOffrPrflSlsClsRecord, ?>>asList(Keys.FK_STDOFFR_STDOFFRPRFLSLSCLSPL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StdOffrPrflSlsCls as(String alias) {
		return new StdOffrPrflSlsCls(alias, this);
	}

	/**
	 * Rename this table
	 */
	public StdOffrPrflSlsCls rename(String name) {
		return new StdOffrPrflSlsCls(name, null);
	}
}