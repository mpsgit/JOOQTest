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
import org.jooq.tables.records.CnsmrInvstmtRecord;


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
public class CnsmrInvstmt extends TableImpl<CnsmrInvstmtRecord> {

	private static final long serialVersionUID = -1033481653;

	/**
	 * The reference instance of <code>WETRN.CNSMR_INVSTMT</code>
	 */
	public static final CnsmrInvstmt CNSMR_INVSTMT = new CnsmrInvstmt();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CnsmrInvstmtRecord> getRecordType() {
		return CnsmrInvstmtRecord.class;
	}

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT.OFFR_PERD_ID</code>.
	 */
	public final TableField<CnsmrInvstmtRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT.MRKT_ID</code>.
	 */
	public final TableField<CnsmrInvstmtRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT.CATGRY_ID</code>.
	 */
	public final TableField<CnsmrInvstmtRecord, BigDecimal> CATGRY_ID = createField("CATGRY_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT.CNSMR_INVSTMT_BDGT_ID</code>.
	 */
	public final TableField<CnsmrInvstmtRecord, BigDecimal> CNSMR_INVSTMT_BDGT_ID = createField("CNSMR_INVSTMT_BDGT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT.BDGT_AMT</code>.
	 */
	public final TableField<CnsmrInvstmtRecord, BigDecimal> BDGT_AMT = createField("BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT.CREAT_TS</code>.
	 */
	public final TableField<CnsmrInvstmtRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT.CREAT_USER_ID</code>.
	 */
	public final TableField<CnsmrInvstmtRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT.LAST_UPDT_TS</code>.
	 */
	public final TableField<CnsmrInvstmtRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<CnsmrInvstmtRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * Create a <code>WETRN.CNSMR_INVSTMT</code> table reference
	 */
	public CnsmrInvstmt() {
		this("CNSMR_INVSTMT", null);
	}

	/**
	 * Create an aliased <code>WETRN.CNSMR_INVSTMT</code> table reference
	 */
	public CnsmrInvstmt(String alias) {
		this(alias, CNSMR_INVSTMT);
	}

	private CnsmrInvstmt(String alias, Table<CnsmrInvstmtRecord> aliased) {
		this(alias, aliased, null);
	}

	private CnsmrInvstmt(String alias, Table<CnsmrInvstmtRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CnsmrInvstmtRecord> getPrimaryKey() {
		return Keys.PK_CNSMR_INVSTMT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CnsmrInvstmtRecord>> getKeys() {
		return Arrays.<UniqueKey<CnsmrInvstmtRecord>>asList(Keys.PK_CNSMR_INVSTMT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<CnsmrInvstmtRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<CnsmrInvstmtRecord, ?>>asList(Keys.FK_MRKTPERD_CNSMRINVSTMT, Keys.FK_CATGRY_CNSMRINVSTMT, Keys.FK_CNSMRINVSTMTBDGT_CNSMRINVST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CnsmrInvstmt as(String alias) {
		return new CnsmrInvstmt(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CnsmrInvstmt rename(String name) {
		return new CnsmrInvstmt(name, null);
	}
}
