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
import org.jooq.tables.records.FormRecord;


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
public class Form extends TableImpl<FormRecord> {

	private static final long serialVersionUID = -1186367190;

	/**
	 * The reference instance of <code>WETRN.FORM</code>
	 */
	public static final Form FORM = new Form();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<FormRecord> getRecordType() {
		return FormRecord.class;
	}

	/**
	 * The column <code>WETRN.FORM.FORM_ID</code>.
	 */
	public final TableField<FormRecord, BigDecimal> FORM_ID = createField("FORM_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.FORM.FORM_DESC_TXT</code>.
	 */
	public final TableField<FormRecord, String> FORM_DESC_TXT = createField("FORM_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.FORM.CNTNT_FORM_ID</code>.
	 */
	public final TableField<FormRecord, BigDecimal> CNTNT_FORM_ID = createField("CNTNT_FORM_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.FORM.FORM_GRP_ID</code>.
	 */
	public final TableField<FormRecord, BigDecimal> FORM_GRP_ID = createField("FORM_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.FORM.CREAT_USER_ID</code>.
	 */
	public final TableField<FormRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.FORM.CREAT_TS</code>.
	 */
	public final TableField<FormRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.FORM.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<FormRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.FORM.LAST_UPDT_TS</code>.
	 */
	public final TableField<FormRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.FORM</code> table reference
	 */
	public Form() {
		this("FORM", null);
	}

	/**
	 * Create an aliased <code>WETRN.FORM</code> table reference
	 */
	public Form(String alias) {
		this(alias, FORM);
	}

	private Form(String alias, Table<FormRecord> aliased) {
		this(alias, aliased, null);
	}

	private Form(String alias, Table<FormRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<FormRecord> getPrimaryKey() {
		return Keys.PK_FORM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<FormRecord>> getKeys() {
		return Arrays.<UniqueKey<FormRecord>>asList(Keys.PK_FORM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<FormRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<FormRecord, ?>>asList(Keys.FK_CNTNTFORM_FORM, Keys.FK_FORMGRP_FNCTN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Form as(String alias) {
		return new Form(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Form rename(String name) {
		return new Form(name, null);
	}
}
