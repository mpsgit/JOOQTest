/**
 * This class is generated by jOOQ
 */
package org.jooq.tables;


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
import org.jooq.tables.records.MessageTransactionRecord;


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
public class MessageTransaction extends TableImpl<MessageTransactionRecord> {

	private static final long serialVersionUID = 2133852812;

	/**
	 * The reference instance of <code>WETRN.MESSAGE_TRANSACTION</code>
	 */
	public static final MessageTransaction MESSAGE_TRANSACTION = new MessageTransaction();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MessageTransactionRecord> getRecordType() {
		return MessageTransactionRecord.class;
	}

	/**
	 * The column <code>WETRN.MESSAGE_TRANSACTION.MESSAGE_TRANSACTION_ID</code>.
	 */
	public final TableField<MessageTransactionRecord, Long> MESSAGE_TRANSACTION_ID = createField("MESSAGE_TRANSACTION_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MESSAGE_TRANSACTION.NAMESPACE</code>.
	 */
	public final TableField<MessageTransactionRecord, String> NAMESPACE = createField("NAMESPACE", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>WETRN.MESSAGE_TRANSACTION.MESSAGE_LEVEL</code>.
	 */
	public final TableField<MessageTransactionRecord, Short> MESSAGE_LEVEL = createField("MESSAGE_LEVEL", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MESSAGE_TRANSACTION.XML</code>.
	 */
	public final TableField<MessageTransactionRecord, String> XML = createField("XML", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MESSAGE_TRANSACTION.DATE_CREATED</code>.
	 */
	public final TableField<MessageTransactionRecord, Date> DATE_CREATED = createField("DATE_CREATED", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MESSAGE_TRANSACTION.LAST_PROCESS_DATE</code>.
	 */
	public final TableField<MessageTransactionRecord, Date> LAST_PROCESS_DATE = createField("LAST_PROCESS_DATE", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MESSAGE_TRANSACTION.REPROCESS_COUNT</code>.
	 */
	public final TableField<MessageTransactionRecord, Short> REPROCESS_COUNT = createField("REPROCESS_COUNT", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MESSAGE_TRANSACTION.ERROR_MESSAGE</code>.
	 */
	public final TableField<MessageTransactionRecord, String> ERROR_MESSAGE = createField("ERROR_MESSAGE", org.jooq.impl.SQLDataType.VARCHAR.length(2048), this, "");

	/**
	 * Create a <code>WETRN.MESSAGE_TRANSACTION</code> table reference
	 */
	public MessageTransaction() {
		this("MESSAGE_TRANSACTION", null);
	}

	/**
	 * Create an aliased <code>WETRN.MESSAGE_TRANSACTION</code> table reference
	 */
	public MessageTransaction(String alias) {
		this(alias, MESSAGE_TRANSACTION);
	}

	private MessageTransaction(String alias, Table<MessageTransactionRecord> aliased) {
		this(alias, aliased, null);
	}

	private MessageTransaction(String alias, Table<MessageTransactionRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MessageTransactionRecord> getPrimaryKey() {
		return Keys.SYS_C00278854;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MessageTransactionRecord>> getKeys() {
		return Arrays.<UniqueKey<MessageTransactionRecord>>asList(Keys.SYS_C00278854);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MessageTransaction as(String alias) {
		return new MessageTransaction(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MessageTransaction rename(String name) {
		return new MessageTransaction(name, null);
	}
}
