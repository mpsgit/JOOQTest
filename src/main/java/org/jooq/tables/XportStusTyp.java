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
import org.jooq.tables.records.XportStusTypRecord;


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
public class XportStusTyp extends TableImpl<XportStusTypRecord> {

	private static final long serialVersionUID = 1844765787;

	/**
	 * The reference instance of <code>WETRN.XPORT_STUS_TYP</code>
	 */
	public static final XportStusTyp XPORT_STUS_TYP = new XportStusTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XportStusTypRecord> getRecordType() {
		return XportStusTypRecord.class;
	}

	/**
	 * The column <code>WETRN.XPORT_STUS_TYP.XPORT_STUS_TYP_ID</code>.
	 */
	public final TableField<XportStusTypRecord, BigDecimal> XPORT_STUS_TYP_ID = createField("XPORT_STUS_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.XPORT_STUS_TYP.XPORT_STUS_TYP_DESC_TXT</code>.
	 */
	public final TableField<XportStusTypRecord, String> XPORT_STUS_TYP_DESC_TXT = createField("XPORT_STUS_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>WETRN.XPORT_STUS_TYP.CREAT_USER_ID</code>.
	 */
	public final TableField<XportStusTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.XPORT_STUS_TYP.CREAT_TS</code>.
	 */
	public final TableField<XportStusTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.XPORT_STUS_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<XportStusTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.XPORT_STUS_TYP.LAST_UPDT_TS</code>.
	 */
	public final TableField<XportStusTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.XPORT_STUS_TYP</code> table reference
	 */
	public XportStusTyp() {
		this("XPORT_STUS_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.XPORT_STUS_TYP</code> table reference
	 */
	public XportStusTyp(String alias) {
		this(alias, XPORT_STUS_TYP);
	}

	private XportStusTyp(String alias, Table<XportStusTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private XportStusTyp(String alias, Table<XportStusTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<XportStusTypRecord> getPrimaryKey() {
		return Keys.PK_XPORT_STUS_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<XportStusTypRecord>> getKeys() {
		return Arrays.<UniqueKey<XportStusTypRecord>>asList(Keys.PK_XPORT_STUS_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XportStusTyp as(String alias) {
		return new XportStusTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public XportStusTyp rename(String name) {
		return new XportStusTyp(name, null);
	}
}