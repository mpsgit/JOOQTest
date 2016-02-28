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
import org.jooq.tables.records.MpsParmRecord;


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
public class MpsParm extends TableImpl<MpsParmRecord> {

	private static final long serialVersionUID = -1492539711;

	/**
	 * The reference instance of <code>WETRN.MPS_PARM</code>
	 */
	public static final MpsParm MPS_PARM = new MpsParm();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MpsParmRecord> getRecordType() {
		return MpsParmRecord.class;
	}

	/**
	 * The column <code>WETRN.MPS_PARM.MPS_PARM_ID</code>.
	 */
	public final TableField<MpsParmRecord, BigDecimal> MPS_PARM_ID = createField("MPS_PARM_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM.SRCE_MRKT_ID</code>.
	 */
	public final TableField<MpsParmRecord, BigDecimal> SRCE_MRKT_ID = createField("SRCE_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MPS_PARM.SRCE_VER_ID</code>.
	 */
	public final TableField<MpsParmRecord, BigDecimal> SRCE_VER_ID = createField("SRCE_VER_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MPS_PARM.SET_TO_REQRNG_PLNRS_REV_IND</code>.
	 */
	public final TableField<MpsParmRecord, String> SET_TO_REQRNG_PLNRS_REV_IND = createField("SET_TO_REQRNG_PLNRS_REV_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM.OFFR_HDR_ONLY_IND</code>.
	 */
	public final TableField<MpsParmRecord, String> OFFR_HDR_ONLY_IND = createField("OFFR_HDR_ONLY_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM.RTAIN_PRC_PNTS_WHEN_RPLCNG_IND</code>.
	 */
	public final TableField<MpsParmRecord, String> RTAIN_PRC_PNTS_WHEN_RPLCNG_IND = createField("RTAIN_PRC_PNTS_WHEN_RPLCNG_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM.UPDT_WHAT_IF_IND</code>.
	 */
	public final TableField<MpsParmRecord, String> UPDT_WHAT_IF_IND = createField("UPDT_WHAT_IF_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM.DLT_SRCE_OFFR_IND</code>.
	 */
	public final TableField<MpsParmRecord, String> DLT_SRCE_OFFR_IND = createField("DLT_SRCE_OFFR_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM.TRGT_MRKT_VEH_PERD_SCTN_ID</code>.
	 */
	public final TableField<MpsParmRecord, BigDecimal> TRGT_MRKT_VEH_PERD_SCTN_ID = createField("TRGT_MRKT_VEH_PERD_SCTN_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MPS_PARM.CREAT_USER_ID</code>.
	 */
	public final TableField<MpsParmRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM.CREAT_TS</code>.
	 */
	public final TableField<MpsParmRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MpsParmRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM.LAST_UPDT_TS</code>.
	 */
	public final TableField<MpsParmRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>WETRN.MPS_PARM</code> table reference
	 */
	public MpsParm() {
		this("MPS_PARM", null);
	}

	/**
	 * Create an aliased <code>WETRN.MPS_PARM</code> table reference
	 */
	public MpsParm(String alias) {
		this(alias, MPS_PARM);
	}

	private MpsParm(String alias, Table<MpsParmRecord> aliased) {
		this(alias, aliased, null);
	}

	private MpsParm(String alias, Table<MpsParmRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MpsParmRecord> getPrimaryKey() {
		return Keys.PK_MPS_PARM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MpsParmRecord>> getKeys() {
		return Arrays.<UniqueKey<MpsParmRecord>>asList(Keys.PK_MPS_PARM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MpsParmRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MpsParmRecord, ?>>asList(Keys.FK_MRKT_MPSPARM, Keys.FK_VER_MPSPARM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParm as(String alias) {
		return new MpsParm(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MpsParm rename(String name) {
		return new MpsParm(name, null);
	}
}
