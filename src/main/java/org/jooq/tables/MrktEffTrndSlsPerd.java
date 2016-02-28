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
import org.jooq.tables.records.MrktEffTrndSlsPerdRecord;


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
public class MrktEffTrndSlsPerd extends TableImpl<MrktEffTrndSlsPerdRecord> {

	private static final long serialVersionUID = -166736463;

	/**
	 * The reference instance of <code>WETRN.MRKT_EFF_TRND_SLS_PERD</code>
	 */
	public static final MrktEffTrndSlsPerd MRKT_EFF_TRND_SLS_PERD = new MrktEffTrndSlsPerd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktEffTrndSlsPerdRecord> getRecordType() {
		return MrktEffTrndSlsPerdRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_EFF_TRND_SLS_PERD.MRKT_ID</code>.
	 */
	public final TableField<MrktEffTrndSlsPerdRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_EFF_TRND_SLS_PERD.EFF_TRND_SLS_PERD_ID</code>.
	 */
	public final TableField<MrktEffTrndSlsPerdRecord, BigDecimal> EFF_TRND_SLS_PERD_ID = createField("EFF_TRND_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_EFF_TRND_SLS_PERD.DLY_BILNG_MTCH_ID</code>.
	 */
	public final TableField<MrktEffTrndSlsPerdRecord, BigDecimal> DLY_BILNG_MTCH_ID = createField("DLY_BILNG_MTCH_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_EFF_TRND_SLS_PERD.BILNG_SYS_GRP_LEAD_MRKT_ID</code>.
	 */
	public final TableField<MrktEffTrndSlsPerdRecord, BigDecimal> BILNG_SYS_GRP_LEAD_MRKT_ID = createField("BILNG_SYS_GRP_LEAD_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_EFF_TRND_SLS_PERD.UNIT_PRC_MTCH_IND</code>.
	 */
	public final TableField<MrktEffTrndSlsPerdRecord, String> UNIT_PRC_MTCH_IND = createField("UNIT_PRC_MTCH_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_EFF_TRND_SLS_PERD.UNIT_PRC_AUTO_MTCH_TOLR_AMT</code>.
	 */
	public final TableField<MrktEffTrndSlsPerdRecord, BigDecimal> UNIT_PRC_AUTO_MTCH_TOLR_AMT = createField("UNIT_PRC_AUTO_MTCH_TOLR_AMT", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_EFF_TRND_SLS_PERD.UNIT_PRC_MANUL_MTCH_TOLR_AMT</code>.
	 */
	public final TableField<MrktEffTrndSlsPerdRecord, BigDecimal> UNIT_PRC_MANUL_MTCH_TOLR_AMT = createField("UNIT_PRC_MANUL_MTCH_TOLR_AMT", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_EFF_TRND_SLS_PERD.LINE_NR_USED_IND</code>.
	 */
	public final TableField<MrktEffTrndSlsPerdRecord, String> LINE_NR_USED_IND = createField("LINE_NR_USED_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_EFF_TRND_SLS_PERD.UNPLND_OFFR_AVG_SLS_PRC_IND</code>.
	 */
	public final TableField<MrktEffTrndSlsPerdRecord, String> UNPLND_OFFR_AVG_SLS_PRC_IND = createField("UNPLND_OFFR_AVG_SLS_PRC_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_EFF_TRND_SLS_PERD.USE_CLSTR_LVL_FSC_SKU_IND</code>.
	 */
	public final TableField<MrktEffTrndSlsPerdRecord, String> USE_CLSTR_LVL_FSC_SKU_IND = createField("USE_CLSTR_LVL_FSC_SKU_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_EFF_TRND_SLS_PERD.CREAT_USER_ID</code>.
	 */
	public final TableField<MrktEffTrndSlsPerdRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_EFF_TRND_SLS_PERD.CREAT_TS</code>.
	 */
	public final TableField<MrktEffTrndSlsPerdRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_EFF_TRND_SLS_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MrktEffTrndSlsPerdRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_EFF_TRND_SLS_PERD.LAST_UPDT_TS</code>.
	 */
	public final TableField<MrktEffTrndSlsPerdRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>WETRN.MRKT_EFF_TRND_SLS_PERD</code> table reference
	 */
	public MrktEffTrndSlsPerd() {
		this("MRKT_EFF_TRND_SLS_PERD", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_EFF_TRND_SLS_PERD</code> table reference
	 */
	public MrktEffTrndSlsPerd(String alias) {
		this(alias, MRKT_EFF_TRND_SLS_PERD);
	}

	private MrktEffTrndSlsPerd(String alias, Table<MrktEffTrndSlsPerdRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktEffTrndSlsPerd(String alias, Table<MrktEffTrndSlsPerdRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktEffTrndSlsPerdRecord> getPrimaryKey() {
		return Keys.PK_TMRKT_EFF_TRND_PERD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktEffTrndSlsPerdRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktEffTrndSlsPerdRecord>>asList(Keys.PK_TMRKT_EFF_TRND_PERD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktEffTrndSlsPerdRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktEffTrndSlsPerdRecord, ?>>asList(Keys.FK_MRKTPERD_MRKTEFFTRSLSPERD, Keys.FK_DBTRMTCH_MRKTEFFTRSLSPERD, Keys.FK_MRKT_MRKTEFFTRSLSPERD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktEffTrndSlsPerd as(String alias) {
		return new MrktEffTrndSlsPerd(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktEffTrndSlsPerd rename(String name) {
		return new MrktEffTrndSlsPerd(name, null);
	}
}
