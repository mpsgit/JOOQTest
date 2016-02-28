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
import org.jooq.tables.records.MrktVehPerdRecord;


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
public class MrktVehPerd extends TableImpl<MrktVehPerdRecord> {

	private static final long serialVersionUID = -1179209531;

	/**
	 * The reference instance of <code>WETRN.MRKT_VEH_PERD</code>
	 */
	public static final MrktVehPerd MRKT_VEH_PERD = new MrktVehPerd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktVehPerdRecord> getRecordType() {
		return MrktVehPerdRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.MRKT_ID</code>.
	 */
	public final TableField<MrktVehPerdRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.VEH_ID</code>.
	 */
	public final TableField<MrktVehPerdRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.OFFR_PERD_ID</code>.
	 */
	public final TableField<MrktVehPerdRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.THEME_DESC_TXT</code>.
	 */
	public final TableField<MrktVehPerdRecord, String> THEME_DESC_TXT = createField("THEME_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.ENRGY_CHRT_CMNT_TXT</code>.
	 */
	public final TableField<MrktVehPerdRecord, String> ENRGY_CHRT_CMNT_TXT = createField("ENRGY_CHRT_CMNT_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.PG_CNT</code>.
	 */
	public final TableField<MrktVehPerdRecord, Integer> PG_CNT = createField("PG_CNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.CMPGN_STUS_CD</code>.
	 */
	public final TableField<MrktVehPerdRecord, String> CMPGN_STUS_CD = createField("CMPGN_STUS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.CMPGN_LOCK_IND</code>.
	 */
	public final TableField<MrktVehPerdRecord, String> CMPGN_LOCK_IND = createField("CMPGN_LOCK_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.CREAT_USER_ID</code>.
	 */
	public final TableField<MrktVehPerdRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.CREAT_TS</code>.
	 */
	public final TableField<MrktVehPerdRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MrktVehPerdRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.LAST_UPDT_TS</code>.
	 */
	public final TableField<MrktVehPerdRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.CMPGN_LOCK_DT</code>.
	 */
	public final TableField<MrktVehPerdRecord, Date> CMPGN_LOCK_DT = createField("CMPGN_LOCK_DT", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.CMPGN_LOCK_USER_ID</code>.
	 */
	public final TableField<MrktVehPerdRecord, String> CMPGN_LOCK_USER_ID = createField("CMPGN_LOCK_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.ENRGY_CHRT_LOCK_IND</code>.
	 */
	public final TableField<MrktVehPerdRecord, String> ENRGY_CHRT_LOCK_IND = createField("ENRGY_CHRT_LOCK_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.ENRGY_CHRT_LOCK_DT</code>.
	 */
	public final TableField<MrktVehPerdRecord, Date> ENRGY_CHRT_LOCK_DT = createField("ENRGY_CHRT_LOCK_DT", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.ENRGY_CHRT_LOCK_USER_ID</code>.
	 */
	public final TableField<MrktVehPerdRecord, String> ENRGY_CHRT_LOCK_USER_ID = createField("ENRGY_CHRT_LOCK_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.MPS_SLS_TYP_ID</code>.
	 */
	public final TableField<MrktVehPerdRecord, BigDecimal> MPS_SLS_TYP_ID = createField("MPS_SLS_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_PERD.PLND_VEH_IND</code>. Planned vehicle indicator {'N'|'Y'} for this mrkt/veh/offr_perd.
	 */
	public final TableField<MrktVehPerdRecord, String> PLND_VEH_IND = createField("PLND_VEH_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "Planned vehicle indicator {'N'|'Y'} for this mrkt/veh/offr_perd.");

	/**
	 * Create a <code>WETRN.MRKT_VEH_PERD</code> table reference
	 */
	public MrktVehPerd() {
		this("MRKT_VEH_PERD", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_VEH_PERD</code> table reference
	 */
	public MrktVehPerd(String alias) {
		this(alias, MRKT_VEH_PERD);
	}

	private MrktVehPerd(String alias, Table<MrktVehPerdRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktVehPerd(String alias, Table<MrktVehPerdRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktVehPerdRecord> getPrimaryKey() {
		return Keys.PK_MRKT_VEH_CMPGN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktVehPerdRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktVehPerdRecord>>asList(Keys.PK_MRKT_VEH_CMPGN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktVehPerdRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktVehPerdRecord, ?>>asList(Keys.FK_MRKTPERD_MRKTVEHPERD, Keys.FK_MRKTVEH_MRKTVEHPERD, Keys.FK_SLSTYP_MRKTVEHPERD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPerd as(String alias) {
		return new MrktVehPerd(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktVehPerd rename(String name) {
		return new MrktVehPerd(name, null);
	}
}
