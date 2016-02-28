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
import org.jooq.Keys;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.Wetrn;
import org.jooq.impl.TableImpl;
import org.jooq.tables.records.DltdDstrbtdMrktSlsRecord;


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
public class DltdDstrbtdMrktSls extends TableImpl<DltdDstrbtdMrktSlsRecord> {

	private static final long serialVersionUID = 343100371;

	/**
	 * The reference instance of <code>WETRN.DLTD_DSTRBTD_MRKT_SLS</code>
	 */
	public static final DltdDstrbtdMrktSls DLTD_DSTRBTD_MRKT_SLS = new DltdDstrbtdMrktSls();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DltdDstrbtdMrktSlsRecord> getRecordType() {
		return DltdDstrbtdMrktSlsRecord.class;
	}

	/**
	 * The column <code>WETRN.DLTD_DSTRBTD_MRKT_SLS.MRKT_ID</code>.
	 */
	public final TableField<DltdDstrbtdMrktSlsRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_DSTRBTD_MRKT_SLS.SLS_PERD_ID</code>.
	 */
	public final TableField<DltdDstrbtdMrktSlsRecord, BigDecimal> SLS_PERD_ID = createField("SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_DSTRBTD_MRKT_SLS.OFFR_SKU_LINE_ID</code>.
	 */
	public final TableField<DltdDstrbtdMrktSlsRecord, BigDecimal> OFFR_SKU_LINE_ID = createField("OFFR_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_DSTRBTD_MRKT_SLS.SLS_TYP_ID</code>.
	 */
	public final TableField<DltdDstrbtdMrktSlsRecord, BigDecimal> SLS_TYP_ID = createField("SLS_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLTD_DSTRBTD_MRKT_SLS.SLS_SRCE_ID</code>.
	 */
	public final TableField<DltdDstrbtdMrktSlsRecord, BigDecimal> SLS_SRCE_ID = createField("SLS_SRCE_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_DSTRBTD_MRKT_SLS.OFFR_PERD_ID</code>.
	 */
	public final TableField<DltdDstrbtdMrktSlsRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_DSTRBTD_MRKT_SLS.SLS_STUS_CD</code>.
	 */
	public final TableField<DltdDstrbtdMrktSlsRecord, String> SLS_STUS_CD = createField("SLS_STUS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.DLTD_DSTRBTD_MRKT_SLS.VEH_ID</code>.
	 */
	public final TableField<DltdDstrbtdMrktSlsRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DLTD_DSTRBTD_MRKT_SLS.UNIT_QTY</code>.
	 */
	public final TableField<DltdDstrbtdMrktSlsRecord, Integer> UNIT_QTY = createField("UNIT_QTY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.DLTD_DSTRBTD_MRKT_SLS.CREAT_USER_ID</code>.
	 */
	public final TableField<DltdDstrbtdMrktSlsRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLTD_DSTRBTD_MRKT_SLS.CREAT_TS</code>.
	 */
	public final TableField<DltdDstrbtdMrktSlsRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLTD_DSTRBTD_MRKT_SLS.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<DltdDstrbtdMrktSlsRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.DLTD_DSTRBTD_MRKT_SLS.LAST_UPDT_TS</code>.
	 */
	public final TableField<DltdDstrbtdMrktSlsRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.DLTD_DSTRBTD_MRKT_SLS.ROW_DLTD_IND</code>.
	 */
	public final TableField<DltdDstrbtdMrktSlsRecord, String> ROW_DLTD_IND = createField("ROW_DLTD_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * Create a <code>WETRN.DLTD_DSTRBTD_MRKT_SLS</code> table reference
	 */
	public DltdDstrbtdMrktSls() {
		this("DLTD_DSTRBTD_MRKT_SLS", null);
	}

	/**
	 * Create an aliased <code>WETRN.DLTD_DSTRBTD_MRKT_SLS</code> table reference
	 */
	public DltdDstrbtdMrktSls(String alias) {
		this(alias, DLTD_DSTRBTD_MRKT_SLS);
	}

	private DltdDstrbtdMrktSls(String alias, Table<DltdDstrbtdMrktSlsRecord> aliased) {
		this(alias, aliased, null);
	}

	private DltdDstrbtdMrktSls(String alias, Table<DltdDstrbtdMrktSlsRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DltdDstrbtdMrktSlsRecord> getPrimaryKey() {
		return Keys.PK_DLTD_DSTRBTD_MRKTG_ORG_EST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DltdDstrbtdMrktSlsRecord>> getKeys() {
		return Arrays.<UniqueKey<DltdDstrbtdMrktSlsRecord>>asList(Keys.PK_DLTD_DSTRBTD_MRKTG_ORG_EST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DltdDstrbtdMrktSls as(String alias) {
		return new DltdDstrbtdMrktSls(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DltdDstrbtdMrktSls rename(String name) {
		return new DltdDstrbtdMrktSls(name, null);
	}
}
