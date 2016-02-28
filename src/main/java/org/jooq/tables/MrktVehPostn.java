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
import org.jooq.tables.records.MrktVehPostnRecord;


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
public class MrktVehPostn extends TableImpl<MrktVehPostnRecord> {

	private static final long serialVersionUID = -2123385499;

	/**
	 * The reference instance of <code>WETRN.MRKT_VEH_POSTN</code>
	 */
	public static final MrktVehPostn MRKT_VEH_POSTN = new MrktVehPostn();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktVehPostnRecord> getRecordType() {
		return MrktVehPostnRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_VEH_POSTN.MRKT_ID</code>.
	 */
	public final TableField<MrktVehPostnRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_POSTN.ENRGY_CHRT_POSTN_ID</code>.
	 */
	public final TableField<MrktVehPostnRecord, BigDecimal> ENRGY_CHRT_POSTN_ID = createField("ENRGY_CHRT_POSTN_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_POSTN.POSTN_SEQ_NR</code>.
	 */
	public final TableField<MrktVehPostnRecord, BigDecimal> POSTN_SEQ_NR = createField("POSTN_SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_POSTN.VEH_ID</code>.
	 */
	public final TableField<MrktVehPostnRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_POSTN.CREAT_USER_ID</code>.
	 */
	public final TableField<MrktVehPostnRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_POSTN.CREAT_TS</code>.
	 */
	public final TableField<MrktVehPostnRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_POSTN.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MrktVehPostnRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_POSTN.LAST_UPDT_TS</code>.
	 */
	public final TableField<MrktVehPostnRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_POSTN.EFF_IND</code>.
	 */
	public final TableField<MrktVehPostnRecord, String> EFF_IND = createField("EFF_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * Create a <code>WETRN.MRKT_VEH_POSTN</code> table reference
	 */
	public MrktVehPostn() {
		this("MRKT_VEH_POSTN", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_VEH_POSTN</code> table reference
	 */
	public MrktVehPostn(String alias) {
		this(alias, MRKT_VEH_POSTN);
	}

	private MrktVehPostn(String alias, Table<MrktVehPostnRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktVehPostn(String alias, Table<MrktVehPostnRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktVehPostnRecord> getPrimaryKey() {
		return Keys.PK_MRKT_VEH_POSTN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktVehPostnRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktVehPostnRecord>>asList(Keys.PK_MRKT_VEH_POSTN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktVehPostnRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktVehPostnRecord, ?>>asList(Keys.FK_MRKTVEH_MRKTVEHPOSTN, Keys.FK_ENRGYCHRTPOSTN_MRKTVEHPOS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehPostn as(String alias) {
		return new MrktVehPostn(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktVehPostn rename(String name) {
		return new MrktVehPostn(name, null);
	}
}