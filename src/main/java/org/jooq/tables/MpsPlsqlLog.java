/**
 * This class is generated by jOOQ
 */
package org.jooq.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.Wetrn;
import org.jooq.impl.TableImpl;
import org.jooq.tables.records.MpsPlsqlLogRecord;


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
public class MpsPlsqlLog extends TableImpl<MpsPlsqlLogRecord> {

	private static final long serialVersionUID = 1640848185;

	/**
	 * The reference instance of <code>WETRN.MPS_PLSQL_LOG</code>
	 */
	public static final MpsPlsqlLog MPS_PLSQL_LOG = new MpsPlsqlLog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MpsPlsqlLogRecord> getRecordType() {
		return MpsPlsqlLogRecord.class;
	}

	/**
	 * The column <code>WETRN.MPS_PLSQL_LOG.LOG_DATE</code>.
	 */
	public final TableField<MpsPlsqlLogRecord, Timestamp> LOG_DATE = createField("LOG_DATE", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PLSQL_LOG.LOG_LEVEL</code>.
	 */
	public final TableField<MpsPlsqlLogRecord, String> LOG_LEVEL = createField("LOG_LEVEL", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PLSQL_LOG.USER_ID</code>.
	 */
	public final TableField<MpsPlsqlLogRecord, String> USER_ID = createField("USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MPS_PLSQL_LOG.MODULE</code>.
	 */
	public final TableField<MpsPlsqlLogRecord, String> MODULE = createField("MODULE", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MPS_PLSQL_LOG.RUN_ID</code>.
	 */
	public final TableField<MpsPlsqlLogRecord, BigDecimal> RUN_ID = createField("RUN_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MPS_PLSQL_LOG.SEQ_NR</code>.
	 */
	public final TableField<MpsPlsqlLogRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PLSQL_LOG.LOG_MSG</code>.
	 */
	public final TableField<MpsPlsqlLogRecord, String> LOG_MSG = createField("LOG_MSG", org.jooq.impl.SQLDataType.VARCHAR.length(4000).nullable(false), this, "");

	/**
	 * Create a <code>WETRN.MPS_PLSQL_LOG</code> table reference
	 */
	public MpsPlsqlLog() {
		this("MPS_PLSQL_LOG", null);
	}

	/**
	 * Create an aliased <code>WETRN.MPS_PLSQL_LOG</code> table reference
	 */
	public MpsPlsqlLog(String alias) {
		this(alias, MPS_PLSQL_LOG);
	}

	private MpsPlsqlLog(String alias, Table<MpsPlsqlLogRecord> aliased) {
		this(alias, aliased, null);
	}

	private MpsPlsqlLog(String alias, Table<MpsPlsqlLogRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsPlsqlLog as(String alias) {
		return new MpsPlsqlLog(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MpsPlsqlLog rename(String name) {
		return new MpsPlsqlLog(name, null);
	}
}
