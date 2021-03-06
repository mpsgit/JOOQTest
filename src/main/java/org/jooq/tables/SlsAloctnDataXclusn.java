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
import org.jooq.tables.records.SlsAloctnDataXclusnRecord;


/**
 * Sales allocation data exclusion.  Data exclusion rules for specific sales 
 * channel, billing offer type and data exclusion type.  Some screens and 
 * reports need to exclude data that would otherwise be shown if the default 
 * rules were used.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlsAloctnDataXclusn extends TableImpl<SlsAloctnDataXclusnRecord> {

	private static final long serialVersionUID = -2127410535;

	/**
	 * The reference instance of <code>WETRN.SLS_ALOCTN_DATA_XCLUSN</code>
	 */
	public static final SlsAloctnDataXclusn SLS_ALOCTN_DATA_XCLUSN = new SlsAloctnDataXclusn();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SlsAloctnDataXclusnRecord> getRecordType() {
		return SlsAloctnDataXclusnRecord.class;
	}

	/**
	 * The column <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.MRKT_ID</code>.
	 */
	public final TableField<SlsAloctnDataXclusnRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.SLS_CHNL_CD</code>.
	 */
	public final TableField<SlsAloctnDataXclusnRecord, String> SLS_CHNL_CD = createField("SLS_CHNL_CD", org.jooq.impl.SQLDataType.VARCHAR.length(4).nullable(false), this, "");

	/**
	 * The column <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.STRT_SLS_PERD_ID</code>.
	 */
	public final TableField<SlsAloctnDataXclusnRecord, BigDecimal> STRT_SLS_PERD_ID = createField("STRT_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.LCL_BILNG_OFFR_TYP</code>.
	 */
	public final TableField<SlsAloctnDataXclusnRecord, String> LCL_BILNG_OFFR_TYP = createField("LCL_BILNG_OFFR_TYP", org.jooq.impl.SQLDataType.CHAR.length(2).nullable(false), this, "");

	/**
	 * The column <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.DATA_XCLUSN_TYP_ID</code>.
	 */
	public final TableField<SlsAloctnDataXclusnRecord, BigDecimal> DATA_XCLUSN_TYP_ID = createField("DATA_XCLUSN_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.END_SLS_PERD_ID</code>.
	 */
	public final TableField<SlsAloctnDataXclusnRecord, BigDecimal> END_SLS_PERD_ID = createField("END_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<SlsAloctnDataXclusnRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<SlsAloctnDataXclusnRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<SlsAloctnDataXclusnRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.SLS_ALOCTN_DATA_XCLUSN.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<SlsAloctnDataXclusnRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.SLS_ALOCTN_DATA_XCLUSN</code> table reference
	 */
	public SlsAloctnDataXclusn() {
		this("SLS_ALOCTN_DATA_XCLUSN", null);
	}

	/**
	 * Create an aliased <code>WETRN.SLS_ALOCTN_DATA_XCLUSN</code> table reference
	 */
	public SlsAloctnDataXclusn(String alias) {
		this(alias, SLS_ALOCTN_DATA_XCLUSN);
	}

	private SlsAloctnDataXclusn(String alias, Table<SlsAloctnDataXclusnRecord> aliased) {
		this(alias, aliased, null);
	}

	private SlsAloctnDataXclusn(String alias, Table<SlsAloctnDataXclusnRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Sales allocation data exclusion.  Data exclusion rules for specific sales channel, billing offer type and data exclusion type.  Some screens and reports need to exclude data that would otherwise be shown if the default rules were used.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<SlsAloctnDataXclusnRecord> getPrimaryKey() {
		return Keys.PK_SLS_ALOCTN_DATA_XCLUSN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<SlsAloctnDataXclusnRecord>> getKeys() {
		return Arrays.<UniqueKey<SlsAloctnDataXclusnRecord>>asList(Keys.PK_SLS_ALOCTN_DATA_XCLUSN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<SlsAloctnDataXclusnRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<SlsAloctnDataXclusnRecord, ?>>asList(Keys.FK_MP_SLSALOCTNDATAXCLUSN_E, Keys.FK_MP_SLSALOCTNDATAXCLUSN_S, Keys.FK_DXT_SLSALOCTNDATAXCLUSN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SlsAloctnDataXclusn as(String alias) {
		return new SlsAloctnDataXclusn(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SlsAloctnDataXclusn rename(String name) {
		return new SlsAloctnDataXclusn(name, null);
	}
}
