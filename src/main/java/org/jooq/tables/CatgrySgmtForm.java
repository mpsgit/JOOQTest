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
import org.jooq.tables.records.CatgrySgmtFormRecord;


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
public class CatgrySgmtForm extends TableImpl<CatgrySgmtFormRecord> {

	private static final long serialVersionUID = -1847428544;

	/**
	 * The reference instance of <code>WETRN.CATGRY_SGMT_FORM</code>
	 */
	public static final CatgrySgmtForm CATGRY_SGMT_FORM = new CatgrySgmtForm();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CatgrySgmtFormRecord> getRecordType() {
		return CatgrySgmtFormRecord.class;
	}

	/**
	 * The column <code>WETRN.CATGRY_SGMT_FORM.CATGRY_ID</code>.
	 */
	public final TableField<CatgrySgmtFormRecord, BigDecimal> CATGRY_ID = createField("CATGRY_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CATGRY_SGMT_FORM.SGMT_ID</code>.
	 */
	public final TableField<CatgrySgmtFormRecord, BigDecimal> SGMT_ID = createField("SGMT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CATGRY_SGMT_FORM.FORM_ID</code>.
	 */
	public final TableField<CatgrySgmtFormRecord, BigDecimal> FORM_ID = createField("FORM_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CATGRY_SGMT_FORM.CREAT_USER_ID</code>.
	 */
	public final TableField<CatgrySgmtFormRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.CATGRY_SGMT_FORM.CREAT_TS</code>.
	 */
	public final TableField<CatgrySgmtFormRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.CATGRY_SGMT_FORM.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<CatgrySgmtFormRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.CATGRY_SGMT_FORM.LAST_UPDT_TS</code>.
	 */
	public final TableField<CatgrySgmtFormRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.CATGRY_SGMT_FORM</code> table reference
	 */
	public CatgrySgmtForm() {
		this("CATGRY_SGMT_FORM", null);
	}

	/**
	 * Create an aliased <code>WETRN.CATGRY_SGMT_FORM</code> table reference
	 */
	public CatgrySgmtForm(String alias) {
		this(alias, CATGRY_SGMT_FORM);
	}

	private CatgrySgmtForm(String alias, Table<CatgrySgmtFormRecord> aliased) {
		this(alias, aliased, null);
	}

	private CatgrySgmtForm(String alias, Table<CatgrySgmtFormRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CatgrySgmtFormRecord> getPrimaryKey() {
		return Keys.PK_CATGRY_SGMT_FORM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CatgrySgmtFormRecord>> getKeys() {
		return Arrays.<UniqueKey<CatgrySgmtFormRecord>>asList(Keys.PK_CATGRY_SGMT_FORM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<CatgrySgmtFormRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<CatgrySgmtFormRecord, ?>>asList(Keys.FK_CATGRYSGMT_CATGRYSGMTFORM, Keys.FK_FORM_CATGRYSGMTFORM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgrySgmtForm as(String alias) {
		return new CatgrySgmtForm(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CatgrySgmtForm rename(String name) {
		return new CatgrySgmtForm(name, null);
	}
}