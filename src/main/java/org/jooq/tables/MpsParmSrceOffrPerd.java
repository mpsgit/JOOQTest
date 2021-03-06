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
import org.jooq.tables.records.MpsParmSrceOffrPerdRecord;


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
public class MpsParmSrceOffrPerd extends TableImpl<MpsParmSrceOffrPerdRecord> {

	private static final long serialVersionUID = 1932050213;

	/**
	 * The reference instance of <code>WETRN.MPS_PARM_SRCE_OFFR_PERD</code>
	 */
	public static final MpsParmSrceOffrPerd MPS_PARM_SRCE_OFFR_PERD = new MpsParmSrceOffrPerd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MpsParmSrceOffrPerdRecord> getRecordType() {
		return MpsParmSrceOffrPerdRecord.class;
	}

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_OFFR_PERD.MPS_PARM_ID</code>.
	 */
	public final TableField<MpsParmSrceOffrPerdRecord, BigDecimal> MPS_PARM_ID = createField("MPS_PARM_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_OFFR_PERD.MRKT_ID</code>.
	 */
	public final TableField<MpsParmSrceOffrPerdRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_OFFR_PERD.OFFR_PERD_ID</code>.
	 */
	public final TableField<MpsParmSrceOffrPerdRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_OFFR_PERD.SEQ_NR</code>.
	 */
	public final TableField<MpsParmSrceOffrPerdRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_OFFR_PERD.CREAT_USER_ID</code>.
	 */
	public final TableField<MpsParmSrceOffrPerdRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_OFFR_PERD.CREAT_TS</code>.
	 */
	public final TableField<MpsParmSrceOffrPerdRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_OFFR_PERD.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MpsParmSrceOffrPerdRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_PARM_SRCE_OFFR_PERD.LAST_UPDT_TS</code>.
	 */
	public final TableField<MpsParmSrceOffrPerdRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>WETRN.MPS_PARM_SRCE_OFFR_PERD</code> table reference
	 */
	public MpsParmSrceOffrPerd() {
		this("MPS_PARM_SRCE_OFFR_PERD", null);
	}

	/**
	 * Create an aliased <code>WETRN.MPS_PARM_SRCE_OFFR_PERD</code> table reference
	 */
	public MpsParmSrceOffrPerd(String alias) {
		this(alias, MPS_PARM_SRCE_OFFR_PERD);
	}

	private MpsParmSrceOffrPerd(String alias, Table<MpsParmSrceOffrPerdRecord> aliased) {
		this(alias, aliased, null);
	}

	private MpsParmSrceOffrPerd(String alias, Table<MpsParmSrceOffrPerdRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MpsParmSrceOffrPerdRecord> getPrimaryKey() {
		return Keys.PK_MPS_PARM_SRCE_OFFR_PERD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MpsParmSrceOffrPerdRecord>> getKeys() {
		return Arrays.<UniqueKey<MpsParmSrceOffrPerdRecord>>asList(Keys.PK_MPS_PARM_SRCE_OFFR_PERD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MpsParmSrceOffrPerdRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MpsParmSrceOffrPerdRecord, ?>>asList(Keys.FK_MPSPARM_MPSPARMSRCEOFFRPERD, Keys.FK_MRKTPERD_MPSPARMSRCEOFFRPER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsParmSrceOffrPerd as(String alias) {
		return new MpsParmSrceOffrPerd(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MpsParmSrceOffrPerd rename(String name) {
		return new MpsParmSrceOffrPerd(name, null);
	}
}
