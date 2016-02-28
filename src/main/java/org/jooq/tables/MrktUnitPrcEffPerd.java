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
import org.jooq.tables.records.MrktUnitPrcEffPerdRecord;


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
public class MrktUnitPrcEffPerd extends TableImpl<MrktUnitPrcEffPerdRecord> {

	private static final long serialVersionUID = -1903683850;

	/**
	 * The reference instance of <code>WETRN.MRKT_UNIT_PRC_EFF_PERD</code>
	 */
	public static final MrktUnitPrcEffPerd MRKT_UNIT_PRC_EFF_PERD = new MrktUnitPrcEffPerd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktUnitPrcEffPerdRecord> getRecordType() {
		return MrktUnitPrcEffPerdRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_UNIT_PRC_EFF_PERD.MRKT_ID</code>.
	 */
	public final TableField<MrktUnitPrcEffPerdRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_UNIT_PRC_EFF_PERD.EFF_PERD_ID</code>.
	 */
	public final TableField<MrktUnitPrcEffPerdRecord, BigDecimal> EFF_PERD_ID = createField("EFF_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_UNIT_PRC_EFF_PERD.PRC_TYP</code>.
	 */
	public final TableField<MrktUnitPrcEffPerdRecord, String> PRC_TYP = createField("PRC_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(5).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_UNIT_PRC_EFF_PERD.CREAT_TS</code>.
	 */
	public final TableField<MrktUnitPrcEffPerdRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_UNIT_PRC_EFF_PERD.CREAT_USER_ID</code>.
	 */
	public final TableField<MrktUnitPrcEffPerdRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_UNIT_PRC_EFF_PERD.LAST_UPDT_TS</code>.
	 */
	public final TableField<MrktUnitPrcEffPerdRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.MRKT_UNIT_PRC_EFF_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MrktUnitPrcEffPerdRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_UNIT_PRC_EFF_PERD.UNIT_PRC_RND_FCT</code>. Unit price rounding factor.  Unit price rounded up to next multiple of this factor.
	 */
	public final TableField<MrktUnitPrcEffPerdRecord, BigDecimal> UNIT_PRC_RND_FCT = createField("UNIT_PRC_RND_FCT", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaulted(true), this, "Unit price rounding factor.  Unit price rounded up to next multiple of this factor.");

	/**
	 * Create a <code>WETRN.MRKT_UNIT_PRC_EFF_PERD</code> table reference
	 */
	public MrktUnitPrcEffPerd() {
		this("MRKT_UNIT_PRC_EFF_PERD", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_UNIT_PRC_EFF_PERD</code> table reference
	 */
	public MrktUnitPrcEffPerd(String alias) {
		this(alias, MRKT_UNIT_PRC_EFF_PERD);
	}

	private MrktUnitPrcEffPerd(String alias, Table<MrktUnitPrcEffPerdRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktUnitPrcEffPerd(String alias, Table<MrktUnitPrcEffPerdRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktUnitPrcEffPerdRecord> getPrimaryKey() {
		return Keys.PK_MRKT_UNIT_PRC_EFF_PERD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktUnitPrcEffPerdRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktUnitPrcEffPerdRecord>>asList(Keys.PK_MRKT_UNIT_PRC_EFF_PERD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktUnitPrcEffPerdRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktUnitPrcEffPerdRecord, ?>>asList(Keys.FK_MRKTPERD_MRKTUNITPRCEFFPERD, Keys.FK_PRCTYP_MRKTUNITPRCEFFPERD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktUnitPrcEffPerd as(String alias) {
		return new MrktUnitPrcEffPerd(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktUnitPrcEffPerd rename(String name) {
		return new MrktUnitPrcEffPerd(name, null);
	}
}
