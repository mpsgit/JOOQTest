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
import org.jooq.tables.records.PlsqlProfilerRunsRecord;


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
public class PlsqlProfilerRuns extends TableImpl<PlsqlProfilerRunsRecord> {

	private static final long serialVersionUID = -209270159;

	/**
	 * The reference instance of <code>WETRN.PLSQL_PROFILER_RUNS</code>
	 */
	public static final PlsqlProfilerRuns PLSQL_PROFILER_RUNS = new PlsqlProfilerRuns();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PlsqlProfilerRunsRecord> getRecordType() {
		return PlsqlProfilerRunsRecord.class;
	}

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_RUNS.RUNID</code>.
	 */
	public final TableField<PlsqlProfilerRunsRecord, BigDecimal> RUNID = createField("RUNID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_RUNS.RELATED_RUN</code>.
	 */
	public final TableField<PlsqlProfilerRunsRecord, BigDecimal> RELATED_RUN = createField("RELATED_RUN", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_RUNS.RUN_OWNER</code>.
	 */
	public final TableField<PlsqlProfilerRunsRecord, String> RUN_OWNER = createField("RUN_OWNER", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_RUNS.RUN_DATE</code>.
	 */
	public final TableField<PlsqlProfilerRunsRecord, Date> RUN_DATE = createField("RUN_DATE", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_RUNS.RUN_COMMENT</code>.
	 */
	public final TableField<PlsqlProfilerRunsRecord, String> RUN_COMMENT = createField("RUN_COMMENT", org.jooq.impl.SQLDataType.VARCHAR.length(2047), this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_RUNS.RUN_TOTAL_TIME</code>.
	 */
	public final TableField<PlsqlProfilerRunsRecord, BigDecimal> RUN_TOTAL_TIME = createField("RUN_TOTAL_TIME", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_RUNS.RUN_SYSTEM_INFO</code>.
	 */
	public final TableField<PlsqlProfilerRunsRecord, String> RUN_SYSTEM_INFO = createField("RUN_SYSTEM_INFO", org.jooq.impl.SQLDataType.VARCHAR.length(2047), this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_RUNS.RUN_COMMENT1</code>.
	 */
	public final TableField<PlsqlProfilerRunsRecord, String> RUN_COMMENT1 = createField("RUN_COMMENT1", org.jooq.impl.SQLDataType.VARCHAR.length(2047), this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_RUNS.SPARE1</code>.
	 */
	public final TableField<PlsqlProfilerRunsRecord, String> SPARE1 = createField("SPARE1", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

	/**
	 * Create a <code>WETRN.PLSQL_PROFILER_RUNS</code> table reference
	 */
	public PlsqlProfilerRuns() {
		this("PLSQL_PROFILER_RUNS", null);
	}

	/**
	 * Create an aliased <code>WETRN.PLSQL_PROFILER_RUNS</code> table reference
	 */
	public PlsqlProfilerRuns(String alias) {
		this(alias, PLSQL_PROFILER_RUNS);
	}

	private PlsqlProfilerRuns(String alias, Table<PlsqlProfilerRunsRecord> aliased) {
		this(alias, aliased, null);
	}

	private PlsqlProfilerRuns(String alias, Table<PlsqlProfilerRunsRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlsqlProfilerRuns as(String alias) {
		return new PlsqlProfilerRuns(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PlsqlProfilerRuns rename(String name) {
		return new PlsqlProfilerRuns(name, null);
	}
}
