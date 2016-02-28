/**
 * This class is generated by jOOQ
 */
package org.jooq.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.Wetrn;
import org.jooq.impl.TableImpl;
import org.jooq.tables.records.ImpdpLogRecord;


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
public class ImpdpLog extends TableImpl<ImpdpLogRecord> {

	private static final long serialVersionUID = -1632029185;

	/**
	 * The reference instance of <code>WETRN.IMPDP_LOG</code>
	 */
	public static final ImpdpLog IMPDP_LOG = new ImpdpLog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ImpdpLogRecord> getRecordType() {
		return ImpdpLogRecord.class;
	}

	/**
	 * The column <code>WETRN.IMPDP_LOG.TEXT</code>.
	 */
	public final TableField<ImpdpLogRecord, String> TEXT = createField("TEXT", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * Create a <code>WETRN.IMPDP_LOG</code> table reference
	 */
	public ImpdpLog() {
		this("IMPDP_LOG", null);
	}

	/**
	 * Create an aliased <code>WETRN.IMPDP_LOG</code> table reference
	 */
	public ImpdpLog(String alias) {
		this(alias, IMPDP_LOG);
	}

	private ImpdpLog(String alias, Table<ImpdpLogRecord> aliased) {
		this(alias, aliased, null);
	}

	private ImpdpLog(String alias, Table<ImpdpLogRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImpdpLog as(String alias) {
		return new ImpdpLog(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ImpdpLog rename(String name) {
		return new ImpdpLog(name, null);
	}
}
