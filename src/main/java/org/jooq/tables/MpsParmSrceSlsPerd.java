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
import org.jooq.tables.records.MpsParmSrceSlsPerdRecord;


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
public class MpsParmSrceSlsPerd extends TableImpl<MpsParmSrceSlsPerdRecord> {

	private static final long serialVersionUID = 1147627326;

	/**
	 * The reference instance of <code>WETRN.MPS_PARM_SRCE_SLS_PERD</code>
	 */
	public static final MpsParmSrceSlsPerd MPS_PARM_SRCE_SLS_PERD = new MpsParmSrceSlsPerd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MpsParmSrceSlsPerdRecord> getRecordType() {
		return MpsParmSrceSlsPerdRecord.class;
	}

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_SLS_PERD.MPS_PARM_ID</code>.
	 */
	public final TableField<MpsParmSrceSlsPerdRecord, BigDecimal> MPS_PARM_ID = createField("MPS_PARM_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_SLS_PERD.MRKT_ID</code>.
	 */
	public final TableField<MpsParmSrceSlsPerdRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_SLS_PERD.SLS_PERD_ID</code>.
	 */
	public final TableField<MpsParmSrceSlsPerdRecord, BigDecimal> SLS_PERD_ID = createField("SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_SLS_PERD.SEQ_NR</code>.
	 */
	public final TableField<MpsParmSrceSlsPerdRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_SLS_PERD.CREAT_USER_ID</code>.
	 */
	public final TableField<MpsParmSrceSlsPerdRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_SLS_PERD.CREAT_TS</code>.
	 */
	public final TableField<MpsParmSrceSlsPerdRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_SLS_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MpsParmSrceSlsPerdRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_SLS_PERD.LAST_UPDT_TS</code>.
	 */
	public final TableField<MpsParmSrceSlsPerdRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>WETRN.MPS_PARM_SRCE_SLS_PERD</code> table reference
	 */
	public MpsParmSrceSlsPerd() {
		this("MPS_PARM_SRCE_SLS_PERD", null);
	}

	/**
	 * Create an aliased <code>WETRN.MPS_PARM_SRCE_SLS_PERD</code> table reference
	 */
	public MpsParmSrceSlsPerd(String alias) {
		this(alias, MPS_PARM_SRCE_SLS_PERD);
	}

	private MpsParmSrceSlsPerd(String alias, Table<MpsParmSrceSlsPerdRecord> aliased) {
		this(alias, aliased, null);
	}

	private MpsParmSrceSlsPerd(String alias, Table<MpsParmSrceSlsPerdRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MpsParmSrceSlsPerdRecord> getPrimaryKey() {
		return Keys.PK_MPS_PARM_SRCE_SLS_PERD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MpsParmSrceSlsPerdRecord>> getKeys() {
		return Arrays.<UniqueKey<MpsParmSrceSlsPerdRecord>>asList(Keys.PK_MPS_PARM_SRCE_SLS_PERD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MpsParmSrceSlsPerdRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MpsParmSrceSlsPerdRecord, ?>>asList(Keys.FK_MPSPARM_MPSPARMSRCESLSPERD, Keys.FK_MRKTPERD_MPSPARMSRCESLSPERD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmSrceSlsPerd as(String alias) {
		return new MpsParmSrceSlsPerd(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MpsParmSrceSlsPerd rename(String name) {
		return new MpsParmSrceSlsPerd(name, null);
	}
}