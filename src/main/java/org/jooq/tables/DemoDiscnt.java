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
import org.jooq.tables.records.DemoDiscntRecord;


/**
 * DEMO DISCOUNT - Used to give a description to a Demo Discount e.g. 'Apparel 
 * and Accessories' or 'Germany, CFT, Silver' or 'Germany, CFT, Gold'.  A 
 * Demo Discount belongs to a Demo Discount Group.  A Demo Discount is associated 
 * to an Offer Profile Price Point. Rule: in a Market Campaign, for a Product 
 * Default Demo Discount, a Demo Offer must exist for each Demo Discount.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DemoDiscnt extends TableImpl<DemoDiscntRecord> {

	private static final long serialVersionUID = -296673182;

	/**
	 * The reference instance of <code>WETRN.DEMO_DISCNT</code>
	 */
	public static final DemoDiscnt DEMO_DISCNT = new DemoDiscnt();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DemoDiscntRecord> getRecordType() {
		return DemoDiscntRecord.class;
	}

	/**
	 * The column <code>WETRN.DEMO_DISCNT.DEMO_DISCNT_ID</code>.
	 */
	public final TableField<DemoDiscntRecord, BigDecimal> DEMO_DISCNT_ID = createField("DEMO_DISCNT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DEMO_DISCNT.DEMO_DISCNT_DESC_TXT</code>.
	 */
	public final TableField<DemoDiscntRecord, String> DEMO_DISCNT_DESC_TXT = createField("DEMO_DISCNT_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.DEMO_DISCNT.DEMO_DISCNT_SDESC_TXT</code>.
	 */
	public final TableField<DemoDiscntRecord, String> DEMO_DISCNT_SDESC_TXT = createField("DEMO_DISCNT_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>WETRN.DEMO_DISCNT.SEQ_NR</code>.
	 */
	public final TableField<DemoDiscntRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DEMO_DISCNT.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<DemoDiscntRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.DEMO_DISCNT.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<DemoDiscntRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.DEMO_DISCNT.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<DemoDiscntRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.DEMO_DISCNT.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<DemoDiscntRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "The date and time the row was last updated.");

	/**
	 * The column <code>WETRN.DEMO_DISCNT.DEMO_DISCNT_GRP_ID</code>.
	 */
	public final TableField<DemoDiscntRecord, BigDecimal> DEMO_DISCNT_GRP_ID = createField("DEMO_DISCNT_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DEMO_DISCNT.PARNT_DEMO_DISCNT_ID</code>. PARENT DEMO DISCOUNT IDENTIFIER - Supports new functionality within MAPS to have a Demo Discount based on another Demo Discount.  Note: this is not achievable by a direct calculation (as a single percentage of the 'grandparent') because of rounding issues;  it must therefore be a parent-child relationship.
	 */
	public final TableField<DemoDiscntRecord, BigDecimal> PARNT_DEMO_DISCNT_ID = createField("PARNT_DEMO_DISCNT_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "PARENT DEMO DISCOUNT IDENTIFIER - Supports new functionality within MAPS to have a Demo Discount based on another Demo Discount.  Note: this is not achievable by a direct calculation (as a single percentage of the 'grandparent') because of rounding issues;  it must therefore be a parent-child relationship.");

	/**
	 * Create a <code>WETRN.DEMO_DISCNT</code> table reference
	 */
	public DemoDiscnt() {
		this("DEMO_DISCNT", null);
	}

	/**
	 * Create an aliased <code>WETRN.DEMO_DISCNT</code> table reference
	 */
	public DemoDiscnt(String alias) {
		this(alias, DEMO_DISCNT);
	}

	private DemoDiscnt(String alias, Table<DemoDiscntRecord> aliased) {
		this(alias, aliased, null);
	}

	private DemoDiscnt(String alias, Table<DemoDiscntRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "DEMO DISCOUNT - Used to give a description to a Demo Discount e.g. 'Apparel and Accessories' or 'Germany, CFT, Silver' or 'Germany, CFT, Gold'.  A Demo Discount belongs to a Demo Discount Group.  A Demo Discount is associated to an Offer Profile Price Point. Rule: in a Market Campaign, for a Product Default Demo Discount, a Demo Offer must exist for each Demo Discount.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DemoDiscntRecord> getPrimaryKey() {
		return Keys.PK_DEMO_DISCNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DemoDiscntRecord>> getKeys() {
		return Arrays.<UniqueKey<DemoDiscntRecord>>asList(Keys.PK_DEMO_DISCNT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<DemoDiscntRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<DemoDiscntRecord, ?>>asList(Keys.FK_DEMODISCNTGRP_DEMODISCNT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DemoDiscnt as(String alias) {
		return new DemoDiscnt(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DemoDiscnt rename(String name) {
		return new DemoDiscnt(name, null);
	}
}
