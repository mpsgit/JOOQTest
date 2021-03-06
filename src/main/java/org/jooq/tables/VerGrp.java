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
import org.jooq.tables.records.VerGrpRecord;


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
public class VerGrp extends TableImpl<VerGrpRecord> {

	private static final long serialVersionUID = -874444869;

	/**
	 * The reference instance of <code>WETRN.VER_GRP</code>
	 */
	public static final VerGrp VER_GRP = new VerGrp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<VerGrpRecord> getRecordType() {
		return VerGrpRecord.class;
	}

	/**
	 * The column <code>WETRN.VER_GRP.VER_GRP_ID</code>.
	 */
	public final TableField<VerGrpRecord, BigDecimal> VER_GRP_ID = createField("VER_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.VER_GRP.VER_GRP_DESC_TXT</code>.
	 */
	public final TableField<VerGrpRecord, String> VER_GRP_DESC_TXT = createField("VER_GRP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.VER_GRP.DLTD_IND</code>.
	 */
	public final TableField<VerGrpRecord, String> DLTD_IND = createField("DLTD_IND", org.jooq.impl.SQLDataType.CHAR.length(1).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.VER_GRP.CREAT_USER_ID</code>.
	 */
	public final TableField<VerGrpRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.VER_GRP.CREAT_TS</code>.
	 */
	public final TableField<VerGrpRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.VER_GRP.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<VerGrpRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.VER_GRP.LAST_UPDT_TS</code>.
	 */
	public final TableField<VerGrpRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.VER_GRP.VER_GRP_SDESC_TXT</code>.
	 */
	public final TableField<VerGrpRecord, String> VER_GRP_SDESC_TXT = createField("VER_GRP_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * Create a <code>WETRN.VER_GRP</code> table reference
	 */
	public VerGrp() {
		this("VER_GRP", null);
	}

	/**
	 * Create an aliased <code>WETRN.VER_GRP</code> table reference
	 */
	public VerGrp(String alias) {
		this(alias, VER_GRP);
	}

	private VerGrp(String alias, Table<VerGrpRecord> aliased) {
		this(alias, aliased, null);
	}

	private VerGrp(String alias, Table<VerGrpRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<VerGrpRecord> getPrimaryKey() {
		return Keys.PK_VER_GRP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<VerGrpRecord>> getKeys() {
		return Arrays.<UniqueKey<VerGrpRecord>>asList(Keys.PK_VER_GRP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VerGrp as(String alias) {
		return new VerGrp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public VerGrp rename(String name) {
		return new VerGrp(name, null);
	}
}
