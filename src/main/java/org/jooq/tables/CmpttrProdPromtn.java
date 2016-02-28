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
import org.jooq.tables.records.CmpttrProdPromtnRecord;


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
public class CmpttrProdPromtn extends TableImpl<CmpttrProdPromtnRecord> {

	private static final long serialVersionUID = -453302312;

	/**
	 * The reference instance of <code>WETRN.CMPTTR_PROD_PROMTN</code>
	 */
	public static final CmpttrProdPromtn CMPTTR_PROD_PROMTN = new CmpttrProdPromtn();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CmpttrProdPromtnRecord> getRecordType() {
		return CmpttrProdPromtnRecord.class;
	}

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.MRKT_ID</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.CMPTTR_ID</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, BigDecimal> CMPTTR_ID = createField("CMPTTR_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.CMPTTR_PROD_ID</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, BigDecimal> CMPTTR_PROD_ID = createField("CMPTTR_PROD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.CMPTTR_PROD_PROMTN_ID</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, BigDecimal> CMPTTR_PROD_PROMTN_ID = createField("CMPTTR_PROD_PROMTN_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.STRT_PERD_ID</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, BigDecimal> STRT_PERD_ID = createField("STRT_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.PROMTN_CLM_ID</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, BigDecimal> PROMTN_CLM_ID = createField("PROMTN_CLM_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.SPCL_PRC_AMT</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, BigDecimal> SPCL_PRC_AMT = createField("SPCL_PRC_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false), this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.PROMTN_ID</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, BigDecimal> PROMTN_ID = createField("PROMTN_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.NR_FOR_QTY</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, Integer> NR_FOR_QTY = createField("NR_FOR_QTY", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.END_PERD_ID</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, BigDecimal> END_PERD_ID = createField("END_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.CRNCY_CD</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, String> CRNCY_CD = createField("CRNCY_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.SPRD_IMG_FILE_TXT</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, String> SPRD_IMG_FILE_TXT = createField("SPRD_IMG_FILE_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.CMPTTR_PROD_PROMTN_NTES_TXT</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, String> CMPTTR_PROD_PROMTN_NTES_TXT = createField("CMPTTR_PROD_PROMTN_NTES_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(4000), this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.PROD_SUPPR_INFO_TXT</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, String> PROD_SUPPR_INFO_TXT = createField("PROD_SUPPR_INFO_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(4000), this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.CREAT_USER_ID</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.CREAT_TS</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.CMPTTR_PROD_PROMTN.LAST_UPDT_TS</code>.
	 */
	public final TableField<CmpttrProdPromtnRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.CMPTTR_PROD_PROMTN</code> table reference
	 */
	public CmpttrProdPromtn() {
		this("CMPTTR_PROD_PROMTN", null);
	}

	/**
	 * Create an aliased <code>WETRN.CMPTTR_PROD_PROMTN</code> table reference
	 */
	public CmpttrProdPromtn(String alias) {
		this(alias, CMPTTR_PROD_PROMTN);
	}

	private CmpttrProdPromtn(String alias, Table<CmpttrProdPromtnRecord> aliased) {
		this(alias, aliased, null);
	}

	private CmpttrProdPromtn(String alias, Table<CmpttrProdPromtnRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CmpttrProdPromtnRecord> getPrimaryKey() {
		return Keys.PK_CMPTTR_PROD_PROMTN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CmpttrProdPromtnRecord>> getKeys() {
		return Arrays.<UniqueKey<CmpttrProdPromtnRecord>>asList(Keys.PK_CMPTTR_PROD_PROMTN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<CmpttrProdPromtnRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<CmpttrProdPromtnRecord, ?>>asList(Keys.FK_MRKTCMPTTRPROD_CMPTTRPRODPR, Keys.FK_MRKTPERD_CMPTTRPRODPROMTN, Keys.FK_MRKTPERD_CMPTTRPRODPROMTN2, Keys.FK_MRKTPROMTNCLM_CMPTTRPRODPRO, Keys.FK_MRKTPROMTN_CMPTTRPRODPROMTN, Keys.FK_MRKT_CMPTTRPRODPROMTN, Keys.FK_CRNCY_CMPTTRPRODPROMTN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CmpttrProdPromtn as(String alias) {
		return new CmpttrProdPromtn(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CmpttrProdPromtn rename(String name) {
		return new CmpttrProdPromtn(name, null);
	}
}