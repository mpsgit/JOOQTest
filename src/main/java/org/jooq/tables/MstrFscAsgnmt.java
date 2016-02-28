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
import org.jooq.tables.records.MstrFscAsgnmtRecord;


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
public class MstrFscAsgnmt extends TableImpl<MstrFscAsgnmtRecord> {

	private static final long serialVersionUID = 414939545;

	/**
	 * The reference instance of <code>WETRN.MSTR_FSC_ASGNMT</code>
	 */
	public static final MstrFscAsgnmt MSTR_FSC_ASGNMT = new MstrFscAsgnmt();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MstrFscAsgnmtRecord> getRecordType() {
		return MstrFscAsgnmtRecord.class;
	}

	/**
	 * The column <code>WETRN.MSTR_FSC_ASGNMT.MRKT_ID</code>.
	 */
	public final TableField<MstrFscAsgnmtRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MSTR_FSC_ASGNMT.SKU_ID</code>.
	 */
	public final TableField<MstrFscAsgnmtRecord, BigDecimal> SKU_ID = createField("SKU_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MSTR_FSC_ASGNMT.STRT_PERD_ID</code>.
	 */
	public final TableField<MstrFscAsgnmtRecord, BigDecimal> STRT_PERD_ID = createField("STRT_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MSTR_FSC_ASGNMT.MSTR_FSC_CD</code>.
	 */
	public final TableField<MstrFscAsgnmtRecord, String> MSTR_FSC_CD = createField("MSTR_FSC_CD", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false), this, "");

	/**
	 * The column <code>WETRN.MSTR_FSC_ASGNMT.CREAT_USER_ID</code>.
	 */
	public final TableField<MstrFscAsgnmtRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MSTR_FSC_ASGNMT.CREAT_TS</code>.
	 */
	public final TableField<MstrFscAsgnmtRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MSTR_FSC_ASGNMT.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MstrFscAsgnmtRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MSTR_FSC_ASGNMT.LAST_UPDT_TS</code>.
	 */
	public final TableField<MstrFscAsgnmtRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.MSTR_FSC_ASGNMT</code> table reference
	 */
	public MstrFscAsgnmt() {
		this("MSTR_FSC_ASGNMT", null);
	}

	/**
	 * Create an aliased <code>WETRN.MSTR_FSC_ASGNMT</code> table reference
	 */
	public MstrFscAsgnmt(String alias) {
		this(alias, MSTR_FSC_ASGNMT);
	}

	private MstrFscAsgnmt(String alias, Table<MstrFscAsgnmtRecord> aliased) {
		this(alias, aliased, null);
	}

	private MstrFscAsgnmt(String alias, Table<MstrFscAsgnmtRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MstrFscAsgnmtRecord> getPrimaryKey() {
		return Keys.PK_MRKT_SKU_PERD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MstrFscAsgnmtRecord>> getKeys() {
		return Arrays.<UniqueKey<MstrFscAsgnmtRecord>>asList(Keys.PK_MRKT_SKU_PERD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MstrFscAsgnmtRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MstrFscAsgnmtRecord, ?>>asList(Keys.FK_MRKTPERD_MSTRFSCASGNMT, Keys.FK_MRKTSKU_MSTRFSCASGNMT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MstrFscAsgnmt as(String alias) {
		return new MstrFscAsgnmt(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MstrFscAsgnmt rename(String name) {
		return new MstrFscAsgnmt(name, null);
	}
}