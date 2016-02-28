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
import org.jooq.tables.records.ItemLineNrTypRecord;


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
public class ItemLineNrTyp extends TableImpl<ItemLineNrTypRecord> {

	private static final long serialVersionUID = 1059652469;

	/**
	 * The reference instance of <code>WETRN.ITEM_LINE_NR_TYP</code>
	 */
	public static final ItemLineNrTyp ITEM_LINE_NR_TYP = new ItemLineNrTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ItemLineNrTypRecord> getRecordType() {
		return ItemLineNrTypRecord.class;
	}

	/**
	 * The column <code>WETRN.ITEM_LINE_NR_TYP.ITEM_LINE_NR_TYP</code>.
	 */
	public final TableField<ItemLineNrTypRecord, String> ITEM_LINE_NR_TYP_ = createField("ITEM_LINE_NR_TYP", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "");

	/**
	 * The column <code>WETRN.ITEM_LINE_NR_TYP.ITEM_LINE_NR_TYP_DESC_TXT</code>.
	 */
	public final TableField<ItemLineNrTypRecord, String> ITEM_LINE_NR_TYP_DESC_TXT = createField("ITEM_LINE_NR_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.ITEM_LINE_NR_TYP.CREAT_USER_ID</code>.
	 */
	public final TableField<ItemLineNrTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.ITEM_LINE_NR_TYP.CREAT_TS</code>.
	 */
	public final TableField<ItemLineNrTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.ITEM_LINE_NR_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<ItemLineNrTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.ITEM_LINE_NR_TYP.LAST_UPDT_TS</code>.
	 */
	public final TableField<ItemLineNrTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.ITEM_LINE_NR_TYP</code> table reference
	 */
	public ItemLineNrTyp() {
		this("ITEM_LINE_NR_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.ITEM_LINE_NR_TYP</code> table reference
	 */
	public ItemLineNrTyp(String alias) {
		this(alias, ITEM_LINE_NR_TYP);
	}

	private ItemLineNrTyp(String alias, Table<ItemLineNrTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private ItemLineNrTyp(String alias, Table<ItemLineNrTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ItemLineNrTypRecord> getPrimaryKey() {
		return Keys.PK_ITEM_LINE_NR_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ItemLineNrTypRecord>> getKeys() {
		return Arrays.<UniqueKey<ItemLineNrTypRecord>>asList(Keys.PK_ITEM_LINE_NR_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ItemLineNrTyp as(String alias) {
		return new ItemLineNrTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ItemLineNrTyp rename(String name) {
		return new ItemLineNrTyp(name, null);
	}
}
