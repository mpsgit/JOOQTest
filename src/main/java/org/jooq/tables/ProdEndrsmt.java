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
import org.jooq.tables.records.ProdEndrsmtRecord;


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
public class ProdEndrsmt extends TableImpl<ProdEndrsmtRecord> {

	private static final long serialVersionUID = 1968220312;

	/**
	 * The reference instance of <code>WETRN.PROD_ENDRSMT</code>
	 */
	public static final ProdEndrsmt PROD_ENDRSMT = new ProdEndrsmt();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProdEndrsmtRecord> getRecordType() {
		return ProdEndrsmtRecord.class;
	}

	/**
	 * The column <code>WETRN.PROD_ENDRSMT.PROD_ENDRSMT_ID</code>.
	 */
	public final TableField<ProdEndrsmtRecord, BigDecimal> PROD_ENDRSMT_ID = createField("PROD_ENDRSMT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.PROD_ENDRSMT.PROD_ENDRSMT_DESC_TXT</code>.
	 */
	public final TableField<ProdEndrsmtRecord, String> PROD_ENDRSMT_DESC_TXT = createField("PROD_ENDRSMT_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.PROD_ENDRSMT.PROD_ENDRSMT_SDESC_TXT</code>.
	 */
	public final TableField<ProdEndrsmtRecord, String> PROD_ENDRSMT_SDESC_TXT = createField("PROD_ENDRSMT_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * The column <code>WETRN.PROD_ENDRSMT.CREAT_USER_ID</code>.
	 */
	public final TableField<ProdEndrsmtRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.PROD_ENDRSMT.CREAT_TS</code>.
	 */
	public final TableField<ProdEndrsmtRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.PROD_ENDRSMT.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<ProdEndrsmtRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.PROD_ENDRSMT.LAST_UPDT_TS</code>.
	 */
	public final TableField<ProdEndrsmtRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.PROD_ENDRSMT</code> table reference
	 */
	public ProdEndrsmt() {
		this("PROD_ENDRSMT", null);
	}

	/**
	 * Create an aliased <code>WETRN.PROD_ENDRSMT</code> table reference
	 */
	public ProdEndrsmt(String alias) {
		this(alias, PROD_ENDRSMT);
	}

	private ProdEndrsmt(String alias, Table<ProdEndrsmtRecord> aliased) {
		this(alias, aliased, null);
	}

	private ProdEndrsmt(String alias, Table<ProdEndrsmtRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProdEndrsmtRecord> getPrimaryKey() {
		return Keys.PK_PROD_ENDRSMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProdEndrsmtRecord>> getKeys() {
		return Arrays.<UniqueKey<ProdEndrsmtRecord>>asList(Keys.PK_PROD_ENDRSMT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProdEndrsmt as(String alias) {
		return new ProdEndrsmt(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ProdEndrsmt rename(String name) {
		return new ProdEndrsmt(name, null);
	}
}
