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
import org.jooq.tables.records.EnrgyChrtPostnRecord;


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
public class EnrgyChrtPostn extends TableImpl<EnrgyChrtPostnRecord> {

	private static final long serialVersionUID = 803885354;

	/**
	 * The reference instance of <code>WETRN.ENRGY_CHRT_POSTN</code>
	 */
	public static final EnrgyChrtPostn ENRGY_CHRT_POSTN = new EnrgyChrtPostn();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EnrgyChrtPostnRecord> getRecordType() {
		return EnrgyChrtPostnRecord.class;
	}

	/**
	 * The column <code>WETRN.ENRGY_CHRT_POSTN.ENRGY_CHRT_POSTN_ID</code>.
	 */
	public final TableField<EnrgyChrtPostnRecord, BigDecimal> ENRGY_CHRT_POSTN_ID = createField("ENRGY_CHRT_POSTN_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.ENRGY_CHRT_POSTN.ENRGY_CHRT_POSTN_NM</code>.
	 */
	public final TableField<EnrgyChrtPostnRecord, String> ENRGY_CHRT_POSTN_NM = createField("ENRGY_CHRT_POSTN_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>WETRN.ENRGY_CHRT_POSTN.CREAT_USER_ID</code>.
	 */
	public final TableField<EnrgyChrtPostnRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.ENRGY_CHRT_POSTN.CREAT_TS</code>.
	 */
	public final TableField<EnrgyChrtPostnRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.ENRGY_CHRT_POSTN.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<EnrgyChrtPostnRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.ENRGY_CHRT_POSTN.LAST_UPDT_TS</code>.
	 */
	public final TableField<EnrgyChrtPostnRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.ENRGY_CHRT_POSTN</code> table reference
	 */
	public EnrgyChrtPostn() {
		this("ENRGY_CHRT_POSTN", null);
	}

	/**
	 * Create an aliased <code>WETRN.ENRGY_CHRT_POSTN</code> table reference
	 */
	public EnrgyChrtPostn(String alias) {
		this(alias, ENRGY_CHRT_POSTN);
	}

	private EnrgyChrtPostn(String alias, Table<EnrgyChrtPostnRecord> aliased) {
		this(alias, aliased, null);
	}

	private EnrgyChrtPostn(String alias, Table<EnrgyChrtPostnRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<EnrgyChrtPostnRecord> getPrimaryKey() {
		return Keys.PK_ENRGY_CHRT_POSTN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<EnrgyChrtPostnRecord>> getKeys() {
		return Arrays.<UniqueKey<EnrgyChrtPostnRecord>>asList(Keys.PK_ENRGY_CHRT_POSTN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EnrgyChrtPostn as(String alias) {
		return new EnrgyChrtPostn(alias, this);
	}

	/**
	 * Rename this table
	 */
	public EnrgyChrtPostn rename(String name) {
		return new EnrgyChrtPostn(name, null);
	}
}