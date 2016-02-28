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
import org.jooq.tables.records.FormGrpRecord;


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
public class FormGrp extends TableImpl<FormGrpRecord> {

	private static final long serialVersionUID = 101931132;

	/**
	 * The reference instance of <code>WETRN.FORM_GRP</code>
	 */
	public static final FormGrp FORM_GRP = new FormGrp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<FormGrpRecord> getRecordType() {
		return FormGrpRecord.class;
	}

	/**
	 * The column <code>WETRN.FORM_GRP.FORM_GRP_ID</code>.
	 */
	public final TableField<FormGrpRecord, BigDecimal> FORM_GRP_ID = createField("FORM_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.FORM_GRP.FORM_GRP_DESC_TXT</code>.
	 */
	public final TableField<FormGrpRecord, String> FORM_GRP_DESC_TXT = createField("FORM_GRP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.FORM_GRP.CREAT_USER_ID</code>.
	 */
	public final TableField<FormGrpRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.FORM_GRP.CREAT_TS</code>.
	 */
	public final TableField<FormGrpRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.FORM_GRP.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<FormGrpRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.FORM_GRP.LAST_UPDT_TS</code>.
	 */
	public final TableField<FormGrpRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.FORM_GRP</code> table reference
	 */
	public FormGrp() {
		this("FORM_GRP", null);
	}

	/**
	 * Create an aliased <code>WETRN.FORM_GRP</code> table reference
	 */
	public FormGrp(String alias) {
		this(alias, FORM_GRP);
	}

	private FormGrp(String alias, Table<FormGrpRecord> aliased) {
		this(alias, aliased, null);
	}

	private FormGrp(String alias, Table<FormGrpRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<FormGrpRecord> getPrimaryKey() {
		return Keys.PK_FORM_GRP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<FormGrpRecord>> getKeys() {
		return Arrays.<UniqueKey<FormGrpRecord>>asList(Keys.PK_FORM_GRP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FormGrp as(String alias) {
		return new FormGrp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public FormGrp rename(String name) {
		return new FormGrp(name, null);
	}
}
