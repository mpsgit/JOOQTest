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
import org.jooq.tables.records.MpsPlsqlOutputRecord;


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
public class MpsPlsqlOutput extends TableImpl<MpsPlsqlOutputRecord> {

	private static final long serialVersionUID = 1216462146;

	/**
	 * The reference instance of <code>WETRN.MPS_PLSQL_OUTPUT</code>
	 */
	public static final MpsPlsqlOutput MPS_PLSQL_OUTPUT = new MpsPlsqlOutput();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MpsPlsqlOutputRecord> getRecordType() {
		return MpsPlsqlOutputRecord.class;
	}

	/**
	 * The column <code>WETRN.MPS_PLSQL_OUTPUT.MSG_TYPE</code>.
	 */
	public final TableField<MpsPlsqlOutputRecord, String> MSG_TYPE = createField("MSG_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PLSQL_OUTPUT.MSG_DATE</code>.
	 */
	public final TableField<MpsPlsqlOutputRecord, Date> MSG_DATE = createField("MSG_DATE", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PLSQL_OUTPUT.RUN_ID</code>.
	 */
	public final TableField<MpsPlsqlOutputRecord, BigDecimal> RUN_ID = createField("RUN_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PLSQL_OUTPUT.SEQ_NR</code>.
	 */
	public final TableField<MpsPlsqlOutputRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PLSQL_OUTPUT.KEY_VALUE</code>.
	 */
	public final TableField<MpsPlsqlOutputRecord, BigDecimal> KEY_VALUE = createField("KEY_VALUE", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MPS_PLSQL_OUTPUT.TXT_VALUE</code>.
	 */
	public final TableField<MpsPlsqlOutputRecord, String> TXT_VALUE = createField("TXT_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(4000), this, "");

	/**
	 * Create a <code>WETRN.MPS_PLSQL_OUTPUT</code> table reference
	 */
	public MpsPlsqlOutput() {
		this("MPS_PLSQL_OUTPUT", null);
	}

	/**
	 * Create an aliased <code>WETRN.MPS_PLSQL_OUTPUT</code> table reference
	 */
	public MpsPlsqlOutput(String alias) {
		this(alias, MPS_PLSQL_OUTPUT);
	}

	private MpsPlsqlOutput(String alias, Table<MpsPlsqlOutputRecord> aliased) {
		this(alias, aliased, null);
	}

	private MpsPlsqlOutput(String alias, Table<MpsPlsqlOutputRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MpsPlsqlOutputRecord> getPrimaryKey() {
		return Keys.PK_MPS_PLSQL_OUTPUT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MpsPlsqlOutputRecord>> getKeys() {
		return Arrays.<UniqueKey<MpsPlsqlOutputRecord>>asList(Keys.PK_MPS_PLSQL_OUTPUT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsPlsqlOutput as(String alias) {
		return new MpsPlsqlOutput(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MpsPlsqlOutput rename(String name) {
		return new MpsPlsqlOutput(name, null);
	}
}
