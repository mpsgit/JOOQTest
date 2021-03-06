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
import org.jooq.tables.records.MrktComsnTypEffPerdRecord;


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
public class MrktComsnTypEffPerd extends TableImpl<MrktComsnTypEffPerdRecord> {

	private static final long serialVersionUID = 124115380;

	/**
	 * The reference instance of <code>WETRN.MRKT_COMSN_TYP_EFF_PERD</code>
	 */
	public static final MrktComsnTypEffPerd MRKT_COMSN_TYP_EFF_PERD = new MrktComsnTypEffPerd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktComsnTypEffPerdRecord> getRecordType() {
		return MrktComsnTypEffPerdRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_COMSN_TYP_EFF_PERD.MRKT_ID</code>.
	 */
	public final TableField<MrktComsnTypEffPerdRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_COMSN_TYP_EFF_PERD.COMSN_TYP</code>.
	 */
	public final TableField<MrktComsnTypEffPerdRecord, String> COMSN_TYP = createField("COMSN_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_COMSN_TYP_EFF_PERD.EFF_PERD_ID</code>.
	 */
	public final TableField<MrktComsnTypEffPerdRecord, BigDecimal> EFF_PERD_ID = createField("EFF_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_COMSN_TYP_EFF_PERD.COMSN_PCT</code>.
	 */
	public final TableField<MrktComsnTypEffPerdRecord, BigDecimal> COMSN_PCT = createField("COMSN_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(9, 6), this, "");

	/**
	 * The column <code>WETRN.MRKT_COMSN_TYP_EFF_PERD.LXRY_TAX_PCT</code>.
	 */
	public final TableField<MrktComsnTypEffPerdRecord, BigDecimal> LXRY_TAX_PCT = createField("LXRY_TAX_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(9, 6), this, "");

	/**
	 * The column <code>WETRN.MRKT_COMSN_TYP_EFF_PERD.CREAT_USER_ID</code>.
	 */
	public final TableField<MrktComsnTypEffPerdRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_COMSN_TYP_EFF_PERD.CREAT_TS</code>.
	 */
	public final TableField<MrktComsnTypEffPerdRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_COMSN_TYP_EFF_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MrktComsnTypEffPerdRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_COMSN_TYP_EFF_PERD.LAST_UPDT_TS</code>.
	 */
	public final TableField<MrktComsnTypEffPerdRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.MRKT_COMSN_TYP_EFF_PERD</code> table reference
	 */
	public MrktComsnTypEffPerd() {
		this("MRKT_COMSN_TYP_EFF_PERD", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_COMSN_TYP_EFF_PERD</code> table reference
	 */
	public MrktComsnTypEffPerd(String alias) {
		this(alias, MRKT_COMSN_TYP_EFF_PERD);
	}

	private MrktComsnTypEffPerd(String alias, Table<MrktComsnTypEffPerdRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktComsnTypEffPerd(String alias, Table<MrktComsnTypEffPerdRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktComsnTypEffPerdRecord> getPrimaryKey() {
		return Keys.PK_MRKT_COMSN_TYP_EFF_PERD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktComsnTypEffPerdRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktComsnTypEffPerdRecord>>asList(Keys.PK_MRKT_COMSN_TYP_EFF_PERD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktComsnTypEffPerdRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktComsnTypEffPerdRecord, ?>>asList(Keys.FK_MRKTPERD_MRKTCOMSNTYPEFFPER, Keys.FK_COMSNTYP_MRKTCOMSNTYPEFFPER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktComsnTypEffPerd as(String alias) {
		return new MrktComsnTypEffPerd(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktComsnTypEffPerd rename(String name) {
		return new MrktComsnTypEffPerd(name, null);
	}
}
