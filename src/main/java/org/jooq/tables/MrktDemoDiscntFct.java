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
import org.jooq.tables.records.MrktDemoDiscntFctRecord;


/**
 * Market Demo Discount Factor is a Demo Discount % for a single Market, e.g. 
 * 0.7 for Germany for 'CFT - Silver', or 0.6 for Germany for 'CFT - Gold'. 
 *  A Market Demo Discount Factor belongs to a Demo Discount.  A Market Demo 
 * Discount Factor is a % rate that represents the % of the Selling Price 
 * of the New Offer.  So, a Free Demo Offer would have a Market Demo Discount 
 * Factor of 0, and a Demo Offer for the same Price as the New Offer would 
 * have a factor of 100%. A Market Demo Discount Factor has an Effective Start 
 * Campaign and an Effective End Campaign, this allows the % to vary over 
 * time.  For example from C5 2010 onwards (with blank End Campaign) Spain 
 * will change its 'CFT - Silver' from 0.7000 to 0.6900.  The Effective Start 
 * Campaign refers to the New Campaign not the Demo Campaign. Not all Markets 
 * use all Demo Discounts.  In CENA, most Demo Discounts apply to a single 
 * Market.  In CENA, some Markets have many Demo Discounts in a single Campaign.
 * Commission Removal Indicator, identifies whether the Selling Price of the 
 * Demo Offer should be calculated by removing the Commission from the New 
 * Offer (uses the Commission Type stored in the Offer Profile Price Point 
 * to calculate this).   Instead of entering a Market Demo Discount Factor, 
 * alternatively the Commission Removal Indicator is set.  If the Commission 
 * Removal Indicator is set this means that whatever the Commission % rate 
 * is for the New Offer then this will be deducted from the New Selling Price 
 * in order to calculate the Demo Selling Price.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MrktDemoDiscntFct extends TableImpl<MrktDemoDiscntFctRecord> {

	private static final long serialVersionUID = -1565376962;

	/**
	 * The reference instance of <code>WETRN.MRKT_DEMO_DISCNT_FCT</code>
	 */
	public static final MrktDemoDiscntFct MRKT_DEMO_DISCNT_FCT = new MrktDemoDiscntFct();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktDemoDiscntFctRecord> getRecordType() {
		return MrktDemoDiscntFctRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_DEMO_DISCNT_FCT.MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public final TableField<MrktDemoDiscntFctRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.");

	/**
	 * The column <code>WETRN.MRKT_DEMO_DISCNT_FCT.EFF_PERD_ID</code>. A unique surrogate identifier for a Campaign, Quater or Annual Period.
	 */
	public final TableField<MrktDemoDiscntFctRecord, BigDecimal> EFF_PERD_ID = createField("EFF_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "A unique surrogate identifier for a Campaign, Quater or Annual Period.");

	/**
	 * The column <code>WETRN.MRKT_DEMO_DISCNT_FCT.DEMO_DISCNT_ID</code>.
	 */
	public final TableField<MrktDemoDiscntFctRecord, BigDecimal> DEMO_DISCNT_ID = createField("DEMO_DISCNT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_DEMO_DISCNT_FCT.DEMO_DISCNT_FCT</code>.
	 */
	public final TableField<MrktDemoDiscntFctRecord, BigDecimal> DEMO_DISCNT_FCT = createField("DEMO_DISCNT_FCT", org.jooq.impl.SQLDataType.NUMERIC.precision(9, 6).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_DEMO_DISCNT_FCT.COMSN_RMOVL_IND</code>.
	 */
	public final TableField<MrktDemoDiscntFctRecord, String> COMSN_RMOVL_IND = createField("COMSN_RMOVL_IND", org.jooq.impl.SQLDataType.CHAR.length(1).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_DEMO_DISCNT_FCT.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<MrktDemoDiscntFctRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.MRKT_DEMO_DISCNT_FCT.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<MrktDemoDiscntFctRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.MRKT_DEMO_DISCNT_FCT.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<MrktDemoDiscntFctRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.MRKT_DEMO_DISCNT_FCT.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<MrktDemoDiscntFctRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.MRKT_DEMO_DISCNT_FCT</code> table reference
	 */
	public MrktDemoDiscntFct() {
		this("MRKT_DEMO_DISCNT_FCT", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_DEMO_DISCNT_FCT</code> table reference
	 */
	public MrktDemoDiscntFct(String alias) {
		this(alias, MRKT_DEMO_DISCNT_FCT);
	}

	private MrktDemoDiscntFct(String alias, Table<MrktDemoDiscntFctRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktDemoDiscntFct(String alias, Table<MrktDemoDiscntFctRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Market Demo Discount Factor is a Demo Discount % for a single Market, e.g. 0.7 for Germany for 'CFT - Silver', or 0.6 for Germany for 'CFT - Gold'.  A Market Demo Discount Factor belongs to a Demo Discount.  A Market Demo Discount Factor is a % rate that represents the % of the Selling Price of the New Offer.  So, a Free Demo Offer would have a Market Demo Discount Factor of 0, and a Demo Offer for the same Price as the New Offer would have a factor of 100%. A Market Demo Discount Factor has an Effective Start Campaign and an Effective End Campaign, this allows the % to vary over time.  For example from C5 2010 onwards (with blank End Campaign) Spain will change its 'CFT - Silver' from 0.7000 to 0.6900.  The Effective Start Campaign refers to the New Campaign not the Demo Campaign. Not all Markets use all Demo Discounts.  In CENA, most Demo Discounts apply to a single Market.  In CENA, some Markets have many Demo Discounts in a single Campaign.\nCommission Removal Indicator, identifies whether the Selling Price of the Demo Offer should be calculated by removing the Commission from the New Offer (uses the Commission Type stored in the Offer Profile Price Point to calculate this).   Instead of entering a Market Demo Discount Factor, alternatively the Commission Removal Indicator is set.  If the Commission Removal Indicator is set this means that whatever the Commission % rate is for the New Offer then this will be deducted from the New Selling Price in order to calculate the Demo Selling Price.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktDemoDiscntFctRecord> getPrimaryKey() {
		return Keys.PK_MRKT_DEMO_DISCNT_FCT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktDemoDiscntFctRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktDemoDiscntFctRecord>>asList(Keys.PK_MRKT_DEMO_DISCNT_FCT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktDemoDiscntFctRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktDemoDiscntFctRecord, ?>>asList(Keys.FK_MRKTPERD_MRKTDEMODISCNTFCT, Keys.FK_DEMODISCNT_MRKTDEMODISCNTFC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktDemoDiscntFct as(String alias) {
		return new MrktDemoDiscntFct(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktDemoDiscntFct rename(String name) {
		return new MrktDemoDiscntFct(name, null);
	}
}