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
import org.jooq.tables.records.CnsmrInvstmtBdgtRecord;


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
public class CnsmrInvstmtBdgt extends TableImpl<CnsmrInvstmtBdgtRecord> {

	private static final long serialVersionUID = 180348582;

	/**
	 * The reference instance of <code>WETRN.CNSMR_INVSTMT_BDGT</code>
	 */
	public static final CnsmrInvstmtBdgt CNSMR_INVSTMT_BDGT = new CnsmrInvstmtBdgt();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CnsmrInvstmtBdgtRecord> getRecordType() {
		return CnsmrInvstmtBdgtRecord.class;
	}

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT_BDGT.CNSMR_INVSTMT_BDGT_ID</code>.
	 */
	public final TableField<CnsmrInvstmtBdgtRecord, BigDecimal> CNSMR_INVSTMT_BDGT_ID = createField("CNSMR_INVSTMT_BDGT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT_BDGT.CNSMR_INVSTMT_BDGT_DESC_TXT</code>.
	 */
	public final TableField<CnsmrInvstmtBdgtRecord, String> CNSMR_INVSTMT_BDGT_DESC_TXT = createField("CNSMR_INVSTMT_BDGT_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT_BDGT.CREAT_USER_ID</code>.
	 */
	public final TableField<CnsmrInvstmtBdgtRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT_BDGT.CREAT_TS</code>.
	 */
	public final TableField<CnsmrInvstmtBdgtRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT_BDGT.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<CnsmrInvstmtBdgtRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT_BDGT.LAST_UPDT_TS</code>.
	 */
	public final TableField<CnsmrInvstmtBdgtRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.CNSMR_INVSTMT_BDGT.OFFR_AVLBL_IND</code>.
	 */
	public final TableField<CnsmrInvstmtBdgtRecord, String> OFFR_AVLBL_IND = createField("OFFR_AVLBL_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * Create a <code>WETRN.CNSMR_INVSTMT_BDGT</code> table reference
	 */
	public CnsmrInvstmtBdgt() {
		this("CNSMR_INVSTMT_BDGT", null);
	}

	/**
	 * Create an aliased <code>WETRN.CNSMR_INVSTMT_BDGT</code> table reference
	 */
	public CnsmrInvstmtBdgt(String alias) {
		this(alias, CNSMR_INVSTMT_BDGT);
	}

	private CnsmrInvstmtBdgt(String alias, Table<CnsmrInvstmtBdgtRecord> aliased) {
		this(alias, aliased, null);
	}

	private CnsmrInvstmtBdgt(String alias, Table<CnsmrInvstmtBdgtRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CnsmrInvstmtBdgtRecord> getPrimaryKey() {
		return Keys.PK_CNSMR_INVSTMT_BDGT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CnsmrInvstmtBdgtRecord>> getKeys() {
		return Arrays.<UniqueKey<CnsmrInvstmtBdgtRecord>>asList(Keys.PK_CNSMR_INVSTMT_BDGT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CnsmrInvstmtBdgt as(String alias) {
		return new CnsmrInvstmtBdgt(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CnsmrInvstmtBdgt rename(String name) {
		return new CnsmrInvstmtBdgt(name, null);
	}
}
