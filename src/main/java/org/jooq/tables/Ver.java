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
import org.jooq.tables.records.VerRecord;


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
public class Ver extends TableImpl<VerRecord> {

	private static final long serialVersionUID = -733932846;

	/**
	 * The reference instance of <code>WETRN.VER</code>
	 */
	public static final Ver VER = new Ver();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<VerRecord> getRecordType() {
		return VerRecord.class;
	}

	/**
	 * The column <code>WETRN.VER.VER_ID</code>.
	 */
	public final TableField<VerRecord, BigDecimal> VER_ID = createField("VER_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.VER.VER_DESC_TXT</code>.
	 */
	public final TableField<VerRecord, String> VER_DESC_TXT = createField("VER_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.VER.VER_TYP_ID</code>.
	 */
	public final TableField<VerRecord, BigDecimal> VER_TYP_ID = createField("VER_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.VER.CREAT_USER_ID</code>.
	 */
	public final TableField<VerRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.VER.CREAT_TS</code>.
	 */
	public final TableField<VerRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.VER.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<VerRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.VER.LAST_UPDT_TS</code>.
	 */
	public final TableField<VerRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.VER.DFALT_XPORT_STUS_ID</code>.
	 */
	public final TableField<VerRecord, BigDecimal> DFALT_XPORT_STUS_ID = createField("DFALT_XPORT_STUS_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.VER.MAX_SLS_TYP_ID</code>.
	 */
	public final TableField<VerRecord, BigDecimal> MAX_SLS_TYP_ID = createField("MAX_SLS_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.VER.ON_DMND_AVLBL_IND</code>.
	 */
	public final TableField<VerRecord, String> ON_DMND_AVLBL_IND = createField("ON_DMND_AVLBL_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.VER.VER_GRP_ID</code>.
	 */
	public final TableField<VerRecord, BigDecimal> VER_GRP_ID = createField("VER_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.VER.SEQ_NR</code>.
	 */
	public final TableField<VerRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.VER.VER_SDESC_TXT</code>.
	 */
	public final TableField<VerRecord, String> VER_SDESC_TXT = createField("VER_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * Create a <code>WETRN.VER</code> table reference
	 */
	public Ver() {
		this("VER", null);
	}

	/**
	 * Create an aliased <code>WETRN.VER</code> table reference
	 */
	public Ver(String alias) {
		this(alias, VER);
	}

	private Ver(String alias, Table<VerRecord> aliased) {
		this(alias, aliased, null);
	}

	private Ver(String alias, Table<VerRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<VerRecord> getPrimaryKey() {
		return Keys.PK_VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<VerRecord>> getKeys() {
		return Arrays.<UniqueKey<VerRecord>>asList(Keys.PK_VERSION);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<VerRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<VerRecord, ?>>asList(Keys.FK_VERTYP_VER, Keys.FK_XPORTSTUS_VER, Keys.FK_SLSTYP_VER, Keys.FK_VERGRP_VER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Ver as(String alias) {
		return new Ver(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Ver rename(String name) {
		return new Ver(name, null);
	}
}