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
import org.jooq.tables.records.PlsqlProfilerUnitsRecord;


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
public class PlsqlProfilerUnits extends TableImpl<PlsqlProfilerUnitsRecord> {

	private static final long serialVersionUID = 523268808;

	/**
	 * The reference instance of <code>WETRN.PLSQL_PROFILER_UNITS</code>
	 */
	public static final PlsqlProfilerUnits PLSQL_PROFILER_UNITS = new PlsqlProfilerUnits();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PlsqlProfilerUnitsRecord> getRecordType() {
		return PlsqlProfilerUnitsRecord.class;
	}

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_UNITS.RUNID</code>.
	 */
	public final TableField<PlsqlProfilerUnitsRecord, BigDecimal> RUNID = createField("RUNID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_NUMBER</code>.
	 */
	public final TableField<PlsqlProfilerUnitsRecord, BigDecimal> UNIT_NUMBER = createField("UNIT_NUMBER", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_TYPE</code>.
	 */
	public final TableField<PlsqlProfilerUnitsRecord, String> UNIT_TYPE = createField("UNIT_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_OWNER</code>.
	 */
	public final TableField<PlsqlProfilerUnitsRecord, String> UNIT_OWNER = createField("UNIT_OWNER", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_NAME</code>.
	 */
	public final TableField<PlsqlProfilerUnitsRecord, String> UNIT_NAME = createField("UNIT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_TIMESTAMP</code>.
	 */
	public final TableField<PlsqlProfilerUnitsRecord, Date> UNIT_TIMESTAMP = createField("UNIT_TIMESTAMP", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_UNITS.TOTAL_TIME</code>.
	 */
	public final TableField<PlsqlProfilerUnitsRecord, BigDecimal> TOTAL_TIME = createField("TOTAL_TIME", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_UNITS.SPARE1</code>.
	 */
	public final TableField<PlsqlProfilerUnitsRecord, BigDecimal> SPARE1 = createField("SPARE1", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_UNITS.SPARE2</code>.
	 */
	public final TableField<PlsqlProfilerUnitsRecord, BigDecimal> SPARE2 = createField("SPARE2", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * Create a <code>WETRN.PLSQL_PROFILER_UNITS</code> table reference
	 */
	public PlsqlProfilerUnits() {
		this("PLSQL_PROFILER_UNITS", null);
	}

	/**
	 * Create an aliased <code>WETRN.PLSQL_PROFILER_UNITS</code> table reference
	 */
	public PlsqlProfilerUnits(String alias) {
		this(alias, PLSQL_PROFILER_UNITS);
	}

	private PlsqlProfilerUnits(String alias, Table<PlsqlProfilerUnitsRecord> aliased) {
		this(alias, aliased, null);
	}

	private PlsqlProfilerUnits(String alias, Table<PlsqlProfilerUnitsRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlsqlProfilerUnits as(String alias) {
		return new PlsqlProfilerUnits(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PlsqlProfilerUnits rename(String name) {
		return new PlsqlProfilerUnits(name, null);
	}
}