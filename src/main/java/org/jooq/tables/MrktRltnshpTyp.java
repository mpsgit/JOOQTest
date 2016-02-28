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
import org.jooq.tables.records.MrktRltnshpTypRecord;


/**
 * Market relationship type.  The type of relationship that is being modelled 
 * by the MRKT_RLTNSHP table.  The MRKT_ prefix indicates that the relationships 
 * are for MRKT_RLTNSHP (as opposed to any other kind of relationship).  The 
 * relationships are not at MRKT level (they apply to all markets).
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MrktRltnshpTyp extends TableImpl<MrktRltnshpTypRecord> {

	private static final long serialVersionUID = 742637108;

	/**
	 * The reference instance of <code>WETRN.MRKT_RLTNSHP_TYP</code>
	 */
	public static final MrktRltnshpTyp MRKT_RLTNSHP_TYP = new MrktRltnshpTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktRltnshpTypRecord> getRecordType() {
		return MrktRltnshpTypRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_RLTNSHP_TYP.MRKT_RLTNSHP_TYP_ID</code>. Market relationship type id.  Unique identifier for a market relationship type.  The ID must not be changed as it is used in the application and database code.
	 */
	public final TableField<MrktRltnshpTypRecord, BigDecimal> MRKT_RLTNSHP_TYP_ID = createField("MRKT_RLTNSHP_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "Market relationship type id.  Unique identifier for a market relationship type.  The ID must not be changed as it is used in the application and database code.");

	/**
	 * The column <code>WETRN.MRKT_RLTNSHP_TYP.MRKT_RLTNSHP_TYP_SDESC_TXT</code>.
	 */
	public final TableField<MrktRltnshpTypRecord, String> MRKT_RLTNSHP_TYP_SDESC_TXT = createField("MRKT_RLTNSHP_TYP_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_RLTNSHP_TYP.MRKT_RLTNSHP_TYP_DESC_TXT</code>.
	 */
	public final TableField<MrktRltnshpTypRecord, String> MRKT_RLTNSHP_TYP_DESC_TXT = createField("MRKT_RLTNSHP_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_RLTNSHP_TYP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<MrktRltnshpTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.MRKT_RLTNSHP_TYP.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<MrktRltnshpTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.MRKT_RLTNSHP_TYP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<MrktRltnshpTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.MRKT_RLTNSHP_TYP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<MrktRltnshpTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.MRKT_RLTNSHP_TYP</code> table reference
	 */
	public MrktRltnshpTyp() {
		this("MRKT_RLTNSHP_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_RLTNSHP_TYP</code> table reference
	 */
	public MrktRltnshpTyp(String alias) {
		this(alias, MRKT_RLTNSHP_TYP);
	}

	private MrktRltnshpTyp(String alias, Table<MrktRltnshpTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktRltnshpTyp(String alias, Table<MrktRltnshpTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Market relationship type.  The type of relationship that is being modelled by the MRKT_RLTNSHP table.  The MRKT_ prefix indicates that the relationships are for MRKT_RLTNSHP (as opposed to any other kind of relationship).  The relationships are not at MRKT level (they apply to all markets).");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktRltnshpTypRecord> getPrimaryKey() {
		return Keys.PK_MRKT_RLTNSHP_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktRltnshpTypRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktRltnshpTypRecord>>asList(Keys.PK_MRKT_RLTNSHP_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktRltnshpTyp as(String alias) {
		return new MrktRltnshpTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktRltnshpTyp rename(String name) {
		return new MrktRltnshpTyp(name, null);
	}
}
