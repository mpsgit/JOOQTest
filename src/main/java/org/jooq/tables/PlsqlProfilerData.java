/**
 * This class is generated by jOOQ
 */
package org.jooq.tables;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.Wetrn;
import org.jooq.impl.TableImpl;
import org.jooq.tables.records.PlsqlProfilerDataRecord;


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
public class PlsqlProfilerData extends TableImpl<PlsqlProfilerDataRecord> {

	private static final long serialVersionUID = -1691125648;

	/**
	 * The reference instance of <code>WETRN.PLSQL_PROFILER_DATA</code>
	 */
	public static final PlsqlProfilerData PLSQL_PROFILER_DATA = new PlsqlProfilerData();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PlsqlProfilerDataRecord> getRecordType() {
		return PlsqlProfilerDataRecord.class;
	}

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_DATA.RUNID</code>.
	 */
	public final TableField<PlsqlProfilerDataRecord, BigDecimal> RUNID = createField("RUNID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_DATA.UNIT_NUMBER</code>.
	 */
	public final TableField<PlsqlProfilerDataRecord, BigDecimal> UNIT_NUMBER = createField("UNIT_NUMBER", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_DATA.LINE#</code>.
	 */
	public final TableField<PlsqlProfilerDataRecord, BigDecimal> LINE_23 = createField("LINE#", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_DATA.TOTAL_OCCUR</code>.
	 */
	public final TableField<PlsqlProfilerDataRecord, BigDecimal> TOTAL_OCCUR = createField("TOTAL_OCCUR", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_DATA.TOTAL_TIME</code>.
	 */
	public final TableField<PlsqlProfilerDataRecord, BigDecimal> TOTAL_TIME = createField("TOTAL_TIME", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_DATA.MIN_TIME</code>.
	 */
	public final TableField<PlsqlProfilerDataRecord, BigDecimal> MIN_TIME = createField("MIN_TIME", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_DATA.MAX_TIME</code>.
	 */
	public final TableField<PlsqlProfilerDataRecord, BigDecimal> MAX_TIME = createField("MAX_TIME", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_DATA.SPARE1</code>.
	 */
	public final TableField<PlsqlProfilerDataRecord, BigDecimal> SPARE1 = createField("SPARE1", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_DATA.SPARE2</code>.
	 */
	public final TableField<PlsqlProfilerDataRecord, BigDecimal> SPARE2 = createField("SPARE2", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_DATA.SPARE3</code>.
	 */
	public final TableField<PlsqlProfilerDataRecord, BigDecimal> SPARE3 = createField("SPARE3", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PLSQL_PROFILER_DATA.SPARE4</code>.
	 */
	public final TableField<PlsqlProfilerDataRecord, BigDecimal> SPARE4 = createField("SPARE4", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * Create a <code>WETRN.PLSQL_PROFILER_DATA</code> table reference
	 */
	public PlsqlProfilerData() {
		this("PLSQL_PROFILER_DATA", null);
	}

	/**
	 * Create an aliased <code>WETRN.PLSQL_PROFILER_DATA</code> table reference
	 */
	public PlsqlProfilerData(String alias) {
		this(alias, PLSQL_PROFILER_DATA);
	}

	private PlsqlProfilerData(String alias, Table<PlsqlProfilerDataRecord> aliased) {
		this(alias, aliased, null);
	}

	private PlsqlProfilerData(String alias, Table<PlsqlProfilerDataRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlsqlProfilerData as(String alias) {
		return new PlsqlProfilerData(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PlsqlProfilerData rename(String name) {
		return new PlsqlProfilerData(name, null);
	}
}
