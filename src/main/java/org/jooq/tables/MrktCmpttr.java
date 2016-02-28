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
import org.jooq.tables.records.MrktCmpttrRecord;


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
public class MrktCmpttr extends TableImpl<MrktCmpttrRecord> {

	private static final long serialVersionUID = -719511538;

	/**
	 * The reference instance of <code>WETRN.MRKT_CMPTTR</code>
	 */
	public static final MrktCmpttr MRKT_CMPTTR = new MrktCmpttr();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktCmpttrRecord> getRecordType() {
		return MrktCmpttrRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.MRKT_ID</code>.
	 */
	public final TableField<MrktCmpttrRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.CMPTTR_ID</code>.
	 */
	public final TableField<MrktCmpttrRecord, BigDecimal> CMPTTR_ID = createField("CMPTTR_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.CRNCY_CD</code>.
	 */
	public final TableField<MrktCmpttrRecord, String> CRNCY_CD = createField("CRNCY_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.CMPTTR_BUS_TXT</code>.
	 */
	public final TableField<MrktCmpttrRecord, String> CMPTTR_BUS_TXT = createField("CMPTTR_BUS_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.RETL_TYP</code>.
	 */
	public final TableField<MrktCmpttrRecord, String> RETL_TYP = createField("RETL_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.MRKT_SHR_PCT_TXT</code>.
	 */
	public final TableField<MrktCmpttrRecord, String> MRKT_SHR_PCT_TXT = createField("MRKT_SHR_PCT_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.CMPTTN_TYP</code>.
	 */
	public final TableField<MrktCmpttrRecord, String> CMPTTN_TYP = createField("CMPTTN_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.BNCHMRK_CLMS_TXT</code>.
	 */
	public final TableField<MrktCmpttrRecord, String> BNCHMRK_CLMS_TXT = createField("BNCHMRK_CLMS_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.TRNVR_AMT_TXT</code>.
	 */
	public final TableField<MrktCmpttrRecord, String> TRNVR_AMT_TXT = createField("TRNVR_AMT_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.STRTGY_TXT</code>.
	 */
	public final TableField<MrktCmpttrRecord, String> STRTGY_TXT = createField("STRTGY_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.FUTR_DIRCTN_TXT</code>.
	 */
	public final TableField<MrktCmpttrRecord, String> FUTR_DIRCTN_TXT = createField("FUTR_DIRCTN_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.PLND_MRKTG_INVSTMTS_TXT</code>.
	 */
	public final TableField<MrktCmpttrRecord, String> PLND_MRKTG_INVSTMTS_TXT = createField("PLND_MRKTG_INVSTMTS_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.CREAT_USER_ID</code>.
	 */
	public final TableField<MrktCmpttrRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.CREAT_TS</code>.
	 */
	public final TableField<MrktCmpttrRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MrktCmpttrRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_CMPTTR.LAST_UPDT_TS</code>.
	 */
	public final TableField<MrktCmpttrRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.MRKT_CMPTTR</code> table reference
	 */
	public MrktCmpttr() {
		this("MRKT_CMPTTR", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_CMPTTR</code> table reference
	 */
	public MrktCmpttr(String alias) {
		this(alias, MRKT_CMPTTR);
	}

	private MrktCmpttr(String alias, Table<MrktCmpttrRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktCmpttr(String alias, Table<MrktCmpttrRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktCmpttrRecord> getPrimaryKey() {
		return Keys.PK_MRKT_CMPTTR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktCmpttrRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktCmpttrRecord>>asList(Keys.PK_MRKT_CMPTTR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktCmpttrRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktCmpttrRecord, ?>>asList(Keys.FK_MRKT_MRKTCMPTTR, Keys.FK_CMPTTR_MRKTCMPTTR, Keys.FK_CRNCY_MRKTCMPTTR, Keys.FK_RETLTYP_MRKTCMPTTR, Keys.FK_CMPTTNTYP_MRKTCMPTTR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktCmpttr as(String alias) {
		return new MrktCmpttr(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktCmpttr rename(String name) {
		return new MrktCmpttr(name, null);
	}
}