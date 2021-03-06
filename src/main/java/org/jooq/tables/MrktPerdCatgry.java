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
import org.jooq.tables.records.MrktPerdCatgryRecord;


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
public class MrktPerdCatgry extends TableImpl<MrktPerdCatgryRecord> {

	private static final long serialVersionUID = -1260724196;

	/**
	 * The reference instance of <code>WETRN.MRKT_PERD_CATGRY</code>
	 */
	public static final MrktPerdCatgry MRKT_PERD_CATGRY = new MrktPerdCatgry();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktPerdCatgryRecord> getRecordType() {
		return MrktPerdCatgryRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.MRKT_ID</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.PERD_ID</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, BigDecimal> PERD_ID = createField("PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.CATGRY_ID</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, BigDecimal> CATGRY_ID = createField("CATGRY_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.VEH_XCES_AMT</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, BigDecimal> VEH_XCES_AMT = createField("VEH_XCES_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.NET_OFFR_AMT</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, BigDecimal> NET_OFFR_AMT = createField("NET_OFFR_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.DEMO_AMT</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, BigDecimal> DEMO_AMT = createField("DEMO_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.OFF_SCHDL_AMT</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, BigDecimal> OFF_SCHDL_AMT = createField("OFF_SCHDL_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.NET_ITMS_AMT</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, BigDecimal> NET_ITMS_AMT = createField("NET_ITMS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.INET_AMT</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, BigDecimal> INET_AMT = createField("INET_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.NON_FEATRD_AMT</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, BigDecimal> NON_FEATRD_AMT = createField("NON_FEATRD_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.CRNCY_CD</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, String> CRNCY_CD = createField("CRNCY_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.CREAT_USER_ID</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.CREAT_TS</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_PERD_CATGRY.LAST_UPDT_TS</code>.
	 */
	public final TableField<MrktPerdCatgryRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.MRKT_PERD_CATGRY</code> table reference
	 */
	public MrktPerdCatgry() {
		this("MRKT_PERD_CATGRY", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_PERD_CATGRY</code> table reference
	 */
	public MrktPerdCatgry(String alias) {
		this(alias, MRKT_PERD_CATGRY);
	}

	private MrktPerdCatgry(String alias, Table<MrktPerdCatgryRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktPerdCatgry(String alias, Table<MrktPerdCatgryRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktPerdCatgryRecord> getPrimaryKey() {
		return Keys.PK_MRKT_PERD_CATGRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktPerdCatgryRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktPerdCatgryRecord>>asList(Keys.PK_MRKT_PERD_CATGRY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktPerdCatgryRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktPerdCatgryRecord, ?>>asList(Keys.FK_MRKTPERD_MRKTPERDCATGRY, Keys.FK_CATGRY_MRKTPERDCATGRY, Keys.FK_CRNCY_MRKTPERDCATGRY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPerdCatgry as(String alias) {
		return new MrktPerdCatgry(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktPerdCatgry rename(String name) {
		return new MrktPerdCatgry(name, null);
	}
}
