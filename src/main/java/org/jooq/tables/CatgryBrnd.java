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
import org.jooq.tables.records.CatgryBrndRecord;


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
public class CatgryBrnd extends TableImpl<CatgryBrndRecord> {

	private static final long serialVersionUID = -1621868453;

	/**
	 * The reference instance of <code>WETRN.CATGRY_BRND</code>
	 */
	public static final CatgryBrnd CATGRY_BRND = new CatgryBrnd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CatgryBrndRecord> getRecordType() {
		return CatgryBrndRecord.class;
	}

	/**
	 * The column <code>WETRN.CATGRY_BRND.BRND_ID</code>.
	 */
	public final TableField<CatgryBrndRecord, BigDecimal> BRND_ID = createField("BRND_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CATGRY_BRND.CATGRY_ID</code>.
	 */
	public final TableField<CatgryBrndRecord, BigDecimal> CATGRY_ID = createField("CATGRY_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CATGRY_BRND.CREAT_USER_ID</code>.
	 */
	public final TableField<CatgryBrndRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.CATGRY_BRND.CREAT_TS</code>.
	 */
	public final TableField<CatgryBrndRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.CATGRY_BRND.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<CatgryBrndRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.CATGRY_BRND.LAST_UPDT_TS</code>.
	 */
	public final TableField<CatgryBrndRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.CATGRY_BRND</code> table reference
	 */
	public CatgryBrnd() {
		this("CATGRY_BRND", null);
	}

	/**
	 * Create an aliased <code>WETRN.CATGRY_BRND</code> table reference
	 */
	public CatgryBrnd(String alias) {
		this(alias, CATGRY_BRND);
	}

	private CatgryBrnd(String alias, Table<CatgryBrndRecord> aliased) {
		this(alias, aliased, null);
	}

	private CatgryBrnd(String alias, Table<CatgryBrndRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CatgryBrndRecord> getPrimaryKey() {
		return Keys.PK_CATGRY_BRND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CatgryBrndRecord>> getKeys() {
		return Arrays.<UniqueKey<CatgryBrndRecord>>asList(Keys.PK_CATGRY_BRND);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<CatgryBrndRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<CatgryBrndRecord, ?>>asList(Keys.FK_BRND_CATGRYBRND, Keys.FK_CATGRY_CATGRYBRND);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CatgryBrnd as(String alias) {
		return new CatgryBrnd(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CatgryBrnd rename(String name) {
		return new CatgryBrnd(name, null);
	}
}