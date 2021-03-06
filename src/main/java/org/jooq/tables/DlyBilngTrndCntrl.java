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
import org.jooq.Wetrn;
import org.jooq.impl.TableImpl;
import org.jooq.tables.records.DlyBilngTrndCntrlRecord;


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
public class DlyBilngTrndCntrl extends TableImpl<DlyBilngTrndCntrlRecord> {

	private static final long serialVersionUID = -1263511916;

	/**
	 * The reference instance of <code>WETRN.DLY_BILNG_TRND_CNTRL</code>
	 */
	public static final DlyBilngTrndCntrl DLY_BILNG_TRND_CNTRL = new DlyBilngTrndCntrl();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DlyBilngTrndCntrlRecord> getRecordType() {
		return DlyBilngTrndCntrlRecord.class;
	}

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_CNTRL.DLY_BILNG_MTCH_ID</code>.
	 */
	public final TableField<DlyBilngTrndCntrlRecord, BigDecimal> DLY_BILNG_MTCH_ID = createField("DLY_BILNG_MTCH_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_CNTRL.LCL_BILNG_ACTN_CD</code>.
	 */
	public final TableField<DlyBilngTrndCntrlRecord, String> LCL_BILNG_ACTN_CD = createField("LCL_BILNG_ACTN_CD", org.jooq.impl.SQLDataType.VARCHAR.length(2).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_CNTRL.LCL_BILNG_TRAN_TYP</code>.
	 */
	public final TableField<DlyBilngTrndCntrlRecord, String> LCL_BILNG_TRAN_TYP = createField("LCL_BILNG_TRAN_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_CNTRL.LCL_BILNG_OFFR_TYP</code>.
	 */
	public final TableField<DlyBilngTrndCntrlRecord, String> LCL_BILNG_OFFR_TYP = createField("LCL_BILNG_OFFR_TYP", org.jooq.impl.SQLDataType.CHAR.length(2), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_CNTRL.LCL_BILNG_DEFRD_CD</code>.
	 */
	public final TableField<DlyBilngTrndCntrlRecord, String> LCL_BILNG_DEFRD_CD = createField("LCL_BILNG_DEFRD_CD", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_CNTRL.LCL_BILNG_SHPNG_CD</code>.
	 */
	public final TableField<DlyBilngTrndCntrlRecord, String> LCL_BILNG_SHPNG_CD = createField("LCL_BILNG_SHPNG_CD", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_CNTRL.SLS_TYP_ID</code>.
	 */
	public final TableField<DlyBilngTrndCntrlRecord, BigDecimal> SLS_TYP_ID = createField("SLS_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_CNTRL.CREAT_USER_ID</code>.
	 */
	public final TableField<DlyBilngTrndCntrlRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_CNTRL.CREAT_TS</code>.
	 */
	public final TableField<DlyBilngTrndCntrlRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_CNTRL.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<DlyBilngTrndCntrlRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DLY_BILNG_TRND_CNTRL.LAST_UPDT_TS</code>.
	 */
	public final TableField<DlyBilngTrndCntrlRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>WETRN.DLY_BILNG_TRND_CNTRL</code> table reference
	 */
	public DlyBilngTrndCntrl() {
		this("DLY_BILNG_TRND_CNTRL", null);
	}

	/**
	 * Create an aliased <code>WETRN.DLY_BILNG_TRND_CNTRL</code> table reference
	 */
	public DlyBilngTrndCntrl(String alias) {
		this(alias, DLY_BILNG_TRND_CNTRL);
	}

	private DlyBilngTrndCntrl(String alias, Table<DlyBilngTrndCntrlRecord> aliased) {
		this(alias, aliased, null);
	}

	private DlyBilngTrndCntrl(String alias, Table<DlyBilngTrndCntrlRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<DlyBilngTrndCntrlRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<DlyBilngTrndCntrlRecord, ?>>asList(Keys.FK_DLYBILNGMTCH_DBTRNDCNTRL, Keys.FK_SLSTYP_DBTRNDCNTRL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DlyBilngTrndCntrl as(String alias) {
		return new DlyBilngTrndCntrl(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DlyBilngTrndCntrl rename(String name) {
		return new DlyBilngTrndCntrl(name, null);
	}
}
