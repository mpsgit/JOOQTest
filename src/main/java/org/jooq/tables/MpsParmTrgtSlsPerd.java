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
import org.jooq.tables.records.MpsParmTrgtSlsPerdRecord;


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
public class MpsParmTrgtSlsPerd extends TableImpl<MpsParmTrgtSlsPerdRecord> {

	private static final long serialVersionUID = -859731434;

	/**
	 * The reference instance of <code>WETRN.MPS_PARM_TRGT_SLS_PERD</code>
	 */
	public static final MpsParmTrgtSlsPerd MPS_PARM_TRGT_SLS_PERD = new MpsParmTrgtSlsPerd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MpsParmTrgtSlsPerdRecord> getRecordType() {
		return MpsParmTrgtSlsPerdRecord.class;
	}

	/**
	 * The column <code>WETRN.MPS_PARM_TRGT_SLS_PERD.MPS_PARM_ID</code>.
	 */
	public final TableField<MpsParmTrgtSlsPerdRecord, BigDecimal> MPS_PARM_ID = createField("MPS_PARM_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_TRGT_SLS_PERD.MRKT_ID</code>.
	 */
	public final TableField<MpsParmTrgtSlsPerdRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_TRGT_SLS_PERD.SLS_PERD_ID</code>.
	 */
	public final TableField<MpsParmTrgtSlsPerdRecord, BigDecimal> SLS_PERD_ID = createField("SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_TRGT_SLS_PERD.SEQ_NR</code>.
	 */
	public final TableField<MpsParmTrgtSlsPerdRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_TRGT_SLS_PERD.CREAT_USER_ID</code>.
	 */
	public final TableField<MpsParmTrgtSlsPerdRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_TRGT_SLS_PERD.CREAT_TS</code>.
	 */
	public final TableField<MpsParmTrgtSlsPerdRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_TRGT_SLS_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MpsParmTrgtSlsPerdRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_TRGT_SLS_PERD.LAST_UPDT_TS</code>.
	 */
	public final TableField<MpsParmTrgtSlsPerdRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>WETRN.MPS_PARM_TRGT_SLS_PERD</code> table reference
	 */
	public MpsParmTrgtSlsPerd() {
		this("MPS_PARM_TRGT_SLS_PERD", null);
	}

	/**
	 * Create an aliased <code>WETRN.MPS_PARM_TRGT_SLS_PERD</code> table reference
	 */
	public MpsParmTrgtSlsPerd(String alias) {
		this(alias, MPS_PARM_TRGT_SLS_PERD);
	}

	private MpsParmTrgtSlsPerd(String alias, Table<MpsParmTrgtSlsPerdRecord> aliased) {
		this(alias, aliased, null);
	}

	private MpsParmTrgtSlsPerd(String alias, Table<MpsParmTrgtSlsPerdRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MpsParmTrgtSlsPerdRecord> getPrimaryKey() {
		return Keys.PK_MPS_PARM_TRGT_SLS_PERD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MpsParmTrgtSlsPerdRecord>> getKeys() {
		return Arrays.<UniqueKey<MpsParmTrgtSlsPerdRecord>>asList(Keys.PK_MPS_PARM_TRGT_SLS_PERD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MpsParmTrgtSlsPerdRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MpsParmTrgtSlsPerdRecord, ?>>asList(Keys.FK_MPSPARM_MPSPARMTRGTSLSPERD, Keys.FK_MRKTPERD_MPSPARMTRGTSLSPERD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmTrgtSlsPerd as(String alias) {
		return new MpsParmTrgtSlsPerd(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MpsParmTrgtSlsPerd rename(String name) {
		return new MpsParmTrgtSlsPerd(name, null);
	}
}
