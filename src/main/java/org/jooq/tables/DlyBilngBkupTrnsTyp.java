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
import org.jooq.tables.records.DlyBilngBkupTrnsTypRecord;


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
public class DlyBilngBkupTrnsTyp extends TableImpl<DlyBilngBkupTrnsTypRecord> {

	private static final long serialVersionUID = -714090157;

	/**
	 * The reference instance of <code>WETRN.DLY_BILNG_BKUP_TRNS_TYP</code>
	 */
	public static final DlyBilngBkupTrnsTyp DLY_BILNG_BKUP_TRNS_TYP = new DlyBilngBkupTrnsTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DlyBilngBkupTrnsTypRecord> getRecordType() {
		return DlyBilngBkupTrnsTypRecord.class;
	}

	/**
	 * The column <code>WETRN.DLY_BILNG_BKUP_TRNS_TYP.TRNS_TYP_ID</code>.
	 */
	public final TableField<DlyBilngBkupTrnsTypRecord, String> TRNS_TYP_ID = createField("TRNS_TYP_ID", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_BKUP_TRNS_TYP.TRNS_TYP_NM</code>.
	 */
	public final TableField<DlyBilngBkupTrnsTypRecord, String> TRNS_TYP_NM = createField("TRNS_TYP_NM", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_BKUP_TRNS_TYP.CREAT_USER_ID</code>.
	 */
	public final TableField<DlyBilngBkupTrnsTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_BKUP_TRNS_TYP.CREAT_TS</code>.
	 */
	public final TableField<DlyBilngBkupTrnsTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_BKUP_TRNS_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<DlyBilngBkupTrnsTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_BKUP_TRNS_TYP.LAST_UPDT_TS</code>.
	 */
	public final TableField<DlyBilngBkupTrnsTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * Create a <code>WETRN.DLY_BILNG_BKUP_TRNS_TYP</code> table reference
	 */
	public DlyBilngBkupTrnsTyp() {
		this("DLY_BILNG_BKUP_TRNS_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.DLY_BILNG_BKUP_TRNS_TYP</code> table reference
	 */
	public DlyBilngBkupTrnsTyp(String alias) {
		this(alias, DLY_BILNG_BKUP_TRNS_TYP);
	}

	private DlyBilngBkupTrnsTyp(String alias, Table<DlyBilngBkupTrnsTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private DlyBilngBkupTrnsTyp(String alias, Table<DlyBilngBkupTrnsTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DlyBilngBkupTrnsTypRecord> getPrimaryKey() {
		return Keys.PK_DLY_BILNG_BKUP_TRNS_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DlyBilngBkupTrnsTypRecord>> getKeys() {
		return Arrays.<UniqueKey<DlyBilngBkupTrnsTypRecord>>asList(Keys.PK_DLY_BILNG_BKUP_TRNS_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngBkupTrnsTyp as(String alias) {
		return new DlyBilngBkupTrnsTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DlyBilngBkupTrnsTyp rename(String name) {
		return new DlyBilngBkupTrnsTyp(name, null);
	}
}