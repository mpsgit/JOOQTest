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
import org.jooq.tables.records.DlyBilngFscSpltRecord;


/**
 * Daily Billing FSC Split.  Data provided by the users to indicate how one 
 * (dummy) FSC is to be split into many valid FSCs.  The sum of original units 
 * in dly_bilng are split across the target FSCs according to the ratio of 
 * units in dly_bilng_fsc_splt for the same SRCE_FSC,SLS_PRC,NR_FOR.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DlyBilngFscSplt extends TableImpl<DlyBilngFscSpltRecord> {

	private static final long serialVersionUID = 680241505;

	/**
	 * The reference instance of <code>WETRN.DLY_BILNG_FSC_SPLT</code>
	 */
	public static final DlyBilngFscSplt DLY_BILNG_FSC_SPLT = new DlyBilngFscSplt();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DlyBilngFscSpltRecord> getRecordType() {
		return DlyBilngFscSpltRecord.class;
	}

	/**
	 * The column <code>WETRN.DLY_BILNG_FSC_SPLT.MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public final TableField<DlyBilngFscSpltRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.");

	/**
	 * The column <code>WETRN.DLY_BILNG_FSC_SPLT.SLS_PERD_ID</code>. A unique surrogate identifier for a Campaign, Quarter or Annual Period.
	 */
	public final TableField<DlyBilngFscSpltRecord, BigDecimal> SLS_PERD_ID = createField("SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "A unique surrogate identifier for a Campaign, Quarter or Annual Period.");

	/**
	 * The column <code>WETRN.DLY_BILNG_FSC_SPLT.SRCE_FSC_CD</code>. Source FSC.  The dummy FSC supplied by the billing system (in dly_bilng).
	 */
	public final TableField<DlyBilngFscSpltRecord, String> SRCE_FSC_CD = createField("SRCE_FSC_CD", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false), this, "Source FSC.  The dummy FSC supplied by the billing system (in dly_bilng).");

	/**
	 * The column <code>WETRN.DLY_BILNG_FSC_SPLT.SLS_PRC_AMT</code>. Sales price amount.  The sales price for matching to the dly_bilng data.
	 */
	public final TableField<DlyBilngFscSpltRecord, BigDecimal> SLS_PRC_AMT = createField("SLS_PRC_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(18, 6).nullable(false), this, "Sales price amount.  The sales price for matching to the dly_bilng data.");

	/**
	 * The column <code>WETRN.DLY_BILNG_FSC_SPLT.NR_FOR_QTY</code>. Number for quantity.  The number for quantity for matching to the dly_bilng data.
	 */
	public final TableField<DlyBilngFscSpltRecord, Short> NR_FOR_QTY = createField("NR_FOR_QTY", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "Number for quantity.  The number for quantity for matching to the dly_bilng data.");

	/**
	 * The column <code>WETRN.DLY_BILNG_FSC_SPLT.TRGT_FSC_CD</code>. Target FSC.  The real FSC that should match to a marketing item planned in an offer.  There are one or many 'target' FSCs for each 'source' FSC (at the same sales price and number for).
	 */
	public final TableField<DlyBilngFscSpltRecord, String> TRGT_FSC_CD = createField("TRGT_FSC_CD", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false), this, "Target FSC.  The real FSC that should match to a marketing item planned in an offer.  There are one or many 'target' FSCs for each 'source' FSC (at the same sales price and number for).");

	/**
	 * The column <code>WETRN.DLY_BILNG_FSC_SPLT.UNIT_QTY</code>. Unit quantity.  The quantity for the target FSC.  The sum(unit_qty) for each source FSC (and sls_prc_amt and nr_for_qty) must match the sum(unit_qty) for the related dly_bilng rows.  Each UNIT_QTY is used to calculate the split percentage for the target FSCs.
	 */
	public final TableField<DlyBilngFscSpltRecord, Integer> UNIT_QTY = createField("UNIT_QTY", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Unit quantity.  The quantity for the target FSC.  The sum(unit_qty) for each source FSC (and sls_prc_amt and nr_for_qty) must match the sum(unit_qty) for the related dly_bilng rows.  Each UNIT_QTY is used to calculate the split percentage for the target FSCs.");

	/**
	 * The column <code>WETRN.DLY_BILNG_FSC_SPLT.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<DlyBilngFscSpltRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.DLY_BILNG_FSC_SPLT.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<DlyBilngFscSpltRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.DLY_BILNG_FSC_SPLT.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<DlyBilngFscSpltRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.DLY_BILNG_FSC_SPLT.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<DlyBilngFscSpltRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.DLY_BILNG_FSC_SPLT</code> table reference
	 */
	public DlyBilngFscSplt() {
		this("DLY_BILNG_FSC_SPLT", null);
	}

	/**
	 * Create an aliased <code>WETRN.DLY_BILNG_FSC_SPLT</code> table reference
	 */
	public DlyBilngFscSplt(String alias) {
		this(alias, DLY_BILNG_FSC_SPLT);
	}

	private DlyBilngFscSplt(String alias, Table<DlyBilngFscSpltRecord> aliased) {
		this(alias, aliased, null);
	}

	private DlyBilngFscSplt(String alias, Table<DlyBilngFscSpltRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Daily Billing FSC Split.  Data provided by the users to indicate how one (dummy) FSC is to be split into many valid FSCs.  The sum of original units in dly_bilng are split across the target FSCs according to the ratio of units in dly_bilng_fsc_splt for the same SRCE_FSC,SLS_PRC,NR_FOR.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DlyBilngFscSpltRecord> getPrimaryKey() {
		return Keys.PK_DLY_BILNG_FSC_SPLT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DlyBilngFscSpltRecord>> getKeys() {
		return Arrays.<UniqueKey<DlyBilngFscSpltRecord>>asList(Keys.PK_DLY_BILNG_FSC_SPLT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<DlyBilngFscSpltRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<DlyBilngFscSpltRecord, ?>>asList(Keys.FK_MRKTPERD_DLYBILNGFSCSPLT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngFscSplt as(String alias) {
		return new DlyBilngFscSplt(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DlyBilngFscSplt rename(String name) {
		return new DlyBilngFscSplt(name, null);
	}
}
