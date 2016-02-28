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
import org.jooq.tables.records.MrktTaxCatgryRecord;


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
public class MrktTaxCatgry extends TableImpl<MrktTaxCatgryRecord> {

	private static final long serialVersionUID = 150407618;

	/**
	 * The reference instance of <code>WETRN.MRKT_TAX_CATGRY</code>
	 */
	public static final MrktTaxCatgry MRKT_TAX_CATGRY = new MrktTaxCatgry();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktTaxCatgryRecord> getRecordType() {
		return MrktTaxCatgryRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_TAX_CATGRY.MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public final TableField<MrktTaxCatgryRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.");

	/**
	 * The column <code>WETRN.MRKT_TAX_CATGRY.MRKT_TAX_CATGRY_ID</code>.
	 */
	public final TableField<MrktTaxCatgryRecord, BigDecimal> MRKT_TAX_CATGRY_ID = createField("MRKT_TAX_CATGRY_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_TAX_CATGRY.MRKT_TAX_CATGRY_DESC_TXT</code>.
	 */
	public final TableField<MrktTaxCatgryRecord, String> MRKT_TAX_CATGRY_DESC_TXT = createField("MRKT_TAX_CATGRY_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.MRKT_TAX_CATGRY.DFALT_MRKT_TAX_CATGRY_IND</code>.
	 */
	public final TableField<MrktTaxCatgryRecord, String> DFALT_MRKT_TAX_CATGRY_IND = createField("DFALT_MRKT_TAX_CATGRY_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.MRKT_TAX_CATGRY.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<MrktTaxCatgryRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.MRKT_TAX_CATGRY.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<MrktTaxCatgryRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.MRKT_TAX_CATGRY.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<MrktTaxCatgryRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.MRKT_TAX_CATGRY.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<MrktTaxCatgryRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.MRKT_TAX_CATGRY</code> table reference
	 */
	public MrktTaxCatgry() {
		this("MRKT_TAX_CATGRY", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_TAX_CATGRY</code> table reference
	 */
	public MrktTaxCatgry(String alias) {
		this(alias, MRKT_TAX_CATGRY);
	}

	private MrktTaxCatgry(String alias, Table<MrktTaxCatgryRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktTaxCatgry(String alias, Table<MrktTaxCatgryRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktTaxCatgryRecord> getPrimaryKey() {
		return Keys.PK_MRKT_TAX_CATGRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktTaxCatgryRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktTaxCatgryRecord>>asList(Keys.PK_MRKT_TAX_CATGRY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktTaxCatgryRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktTaxCatgryRecord, ?>>asList(Keys.FK_MRKT_MRKTTAXCATGRY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxCatgry as(String alias) {
		return new MrktTaxCatgry(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktTaxCatgry rename(String name) {
		return new MrktTaxCatgry(name, null);
	}
}
