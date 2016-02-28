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
import org.jooq.tables.records.MrktTaxTypRecord;


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
public class MrktTaxTyp extends TableImpl<MrktTaxTypRecord> {

	private static final long serialVersionUID = 1182348669;

	/**
	 * The reference instance of <code>WETRN.MRKT_TAX_TYP</code>
	 */
	public static final MrktTaxTyp MRKT_TAX_TYP = new MrktTaxTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktTaxTypRecord> getRecordType() {
		return MrktTaxTypRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_TAX_TYP.MRKT_ID</code>.
	 */
	public final TableField<MrktTaxTypRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_TAX_TYP.TAX_TYPE_ID</code>.
	 */
	public final TableField<MrktTaxTypRecord, BigDecimal> TAX_TYPE_ID = createField("TAX_TYPE_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_TAX_TYP.TAX_TYP_DESC_TXT</code>.
	 */
	public final TableField<MrktTaxTypRecord, String> TAX_TYP_DESC_TXT = createField("TAX_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.MRKT_TAX_TYP.CREAT_USER_ID</code>.
	 */
	public final TableField<MrktTaxTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_TAX_TYP.CREAT_TS</code>.
	 */
	public final TableField<MrktTaxTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_TAX_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MrktTaxTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_TAX_TYP.LAST_UPDT_TS</code>.
	 */
	public final TableField<MrktTaxTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.MRKT_TAX_TYP.DFALT_MRKT_TAX_TYPE_IND</code>.
	 */
	public final TableField<MrktTaxTypRecord, String> DFALT_MRKT_TAX_TYPE_IND = createField("DFALT_MRKT_TAX_TYPE_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.MRKT_TAX_TYP.MRKT_TAX_TYP_GRP_ID</code>.
	 */
	public final TableField<MrktTaxTypRecord, BigDecimal> MRKT_TAX_TYP_GRP_ID = createField("MRKT_TAX_TYP_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_TAX_TYP.MRKT_TAX_CATGRY_ID</code>.
	 */
	public final TableField<MrktTaxTypRecord, BigDecimal> MRKT_TAX_CATGRY_ID = createField("MRKT_TAX_CATGRY_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * Create a <code>WETRN.MRKT_TAX_TYP</code> table reference
	 */
	public MrktTaxTyp() {
		this("MRKT_TAX_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_TAX_TYP</code> table reference
	 */
	public MrktTaxTyp(String alias) {
		this(alias, MRKT_TAX_TYP);
	}

	private MrktTaxTyp(String alias, Table<MrktTaxTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktTaxTyp(String alias, Table<MrktTaxTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktTaxTypRecord> getPrimaryKey() {
		return Keys.PK_MRKT_TAX_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktTaxTypRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktTaxTypRecord>>asList(Keys.PK_MRKT_TAX_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktTaxTypRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktTaxTypRecord, ?>>asList(Keys.FK_MRKTTAXCATGRY_MRKTTAXTYP, Keys.FK_MRKTTAXTYPGRP_MRKTTAXTYP, Keys.FK_MRKT_MRKTTAXTYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktTaxTyp as(String alias) {
		return new MrktTaxTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktTaxTyp rename(String name) {
		return new MrktTaxTyp(name, null);
	}
}