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
import org.jooq.tables.records.FinclObjctvRecord;


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
public class FinclObjctv extends TableImpl<FinclObjctvRecord> {

	private static final long serialVersionUID = -542868183;

	/**
	 * The reference instance of <code>WETRN.FINCL_OBJCTV</code>
	 */
	public static final FinclObjctv FINCL_OBJCTV = new FinclObjctv();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<FinclObjctvRecord> getRecordType() {
		return FinclObjctvRecord.class;
	}

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.MRKT_ID</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.OFFR_PERD_ID</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.OBJCTV_ID</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> OBJCTV_ID = createField("OBJCTV_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.OBJCTV_TYP</code>.
	 */
	public final TableField<FinclObjctvRecord, String> OBJCTV_TYP = createField("OBJCTV_TYP", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.FINCL_VER_ID</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> FINCL_VER_ID = createField("FINCL_VER_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.ACTV_REP_CNT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> ACTV_REP_CNT = createField("ACTV_REP_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.ACTV_SKU_CNT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> ACTV_SKU_CNT = createField("ACTV_SKU_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.REP_ACTVTY_PCT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> REP_ACTVTY_PCT = createField("REP_ACTVTY_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.ADVRTSG_BDGT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> ADVRTSG_BDGT_AMT = createField("ADVRTSG_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.VEH_PG_CNT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> VEH_PG_CNT = createField("VEH_PG_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.VEH_BDGT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> VEH_BDGT_AMT = createField("VEH_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.CMPETTN_PRZE_BDGT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> CMPETTN_PRZE_BDGT_AMT = createField("CMPETTN_PRZE_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.CNSMR_INCNTV_BDGT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> CNSMR_INCNTV_BDGT_AMT = createField("CNSMR_INCNTV_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.CPI_INFLTN_PCT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> CPI_INFLTN_PCT = createField("CPI_INFLTN_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.CUST_SERVC_CNT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> CUST_SERVC_CNT = createField("CUST_SERVC_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.DSCNTND_SKU_CNT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> DSCNTND_SKU_CNT = createField("DSCNTND_SKU_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.GIFT_WITH_PRCHS_BDGT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> GIFT_WITH_PRCHS_BDGT_AMT = createField("GIFT_WITH_PRCHS_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.INCNTV_VEH_BDGT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> INCNTV_VEH_BDGT_AMT = createField("INCNTV_VEH_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.MRKT_SHR_PCT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> MRKT_SHR_PCT = createField("MRKT_SHR_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.MICR_NCPSLTN_PG_CNT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> MICR_NCPSLTN_PG_CNT = createField("MICR_NCPSLTN_PG_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.MICR_NCPSLTN_BDGT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> MICR_NCPSLTN_BDGT_AMT = createField("MICR_NCPSLTN_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.NEW_CNCPT_CNT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> NEW_CNCPT_CNT = createField("NEW_CNCPT_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.NEW_SKU_CNT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> NEW_SKU_CNT = createField("NEW_SKU_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.CUST_CNT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> CUST_CNT = createField("CUST_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.ORD_CNT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> ORD_CNT = createField("ORD_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.OTHR_BDGT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> OTHR_BDGT_AMT = createField("OTHR_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.PBLC_RLTNS_BDGT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> PBLC_RLTNS_BDGT_AMT = createField("PBLC_RLTNS_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.PROD_INCNTV_BDGT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> PROD_INCNTV_BDGT_AMT = createField("PROD_INCNTV_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.FLD_INCNTV_BDGT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> FLD_INCNTV_BDGT_AMT = createField("FLD_INCNTV_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.SMPLG_BDGT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> SMPLG_BDGT_AMT = createField("SMPLG_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.RTURN_SLS_PCT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> RTURN_SLS_PCT = createField("RTURN_SLS_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.CREAT_USER_ID</code>.
	 */
	public final TableField<FinclObjctvRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.CREAT_TS</code>.
	 */
	public final TableField<FinclObjctvRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<FinclObjctvRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.LAST_UPDT_TS</code>.
	 */
	public final TableField<FinclObjctvRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.BRCHR_PG_CNT</code>.
	 */
	public final TableField<FinclObjctvRecord, Integer> BRCHR_PG_CNT = createField("BRCHR_PG_CNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.CUST_UNITS_PER_REP_QTY</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> CUST_UNITS_PER_REP_QTY = createField("CUST_UNITS_PER_REP_QTY", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.CUST_UNITS_PER_ORD_QTY</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> CUST_UNITS_PER_ORD_QTY = createField("CUST_UNITS_PER_ORD_QTY", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.REP_CNT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> REP_CNT = createField("REP_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.TOT_BRCHR_SLS_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> TOT_BRCHR_SLS_AMT = createField("TOT_BRCHR_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.TOT_CUST_SLS_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> TOT_CUST_SLS_AMT = createField("TOT_CUST_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.TOT_REP_SLS_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> TOT_REP_SLS_AMT = createField("TOT_REP_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.TOT_ADJSTMT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> TOT_ADJSTMT_AMT = createField("TOT_ADJSTMT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.GRS_SLS_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> GRS_SLS_AMT = createField("GRS_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.SLS_AIDS_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> SLS_AIDS_AMT = createField("SLS_AIDS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.BLLD_SLS_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> BLLD_SLS_AMT = createField("BLLD_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.RTURN_SLS_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> RTURN_SLS_AMT = createField("RTURN_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.NET_SLS_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> NET_SLS_AMT = createField("NET_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.TOT_SOL_QTY</code>.
	 */
	public final TableField<FinclObjctvRecord, Integer> TOT_SOL_QTY = createField("TOT_SOL_QTY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.TOT_BDGT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> TOT_BDGT_AMT = createField("TOT_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.ACTVTY_PCT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> ACTVTY_PCT = createField("ACTVTY_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.AVG_ORD_GRS_SLS_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> AVG_ORD_GRS_SLS_AMT = createField("AVG_ORD_GRS_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.REP_SPND_GRS_SLS_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> REP_SPND_GRS_SLS_AMT = createField("REP_SPND_GRS_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.AVG_ORD_BILLD_SLS_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> AVG_ORD_BILLD_SLS_AMT = createField("AVG_ORD_BILLD_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.REP_SPND_BILLD_SLS_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> REP_SPND_BILLD_SLS_AMT = createField("REP_SPND_BILLD_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.CUST_SERVC_QTY</code>.
	 */
	public final TableField<FinclObjctvRecord, Integer> CUST_SERVC_QTY = createField("CUST_SERVC_QTY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.CUST_SPND_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> CUST_SPND_AMT = createField("CUST_SPND_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.CUST_SLS_PER_UNIT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> CUST_SLS_PER_UNIT_AMT = createField("CUST_SLS_PER_UNIT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.GRS_SLS_PER_UNIT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> GRS_SLS_PER_UNIT_AMT = createField("GRS_SLS_PER_UNIT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.PER_CUST_UNIT_QTY</code>.
	 */
	public final TableField<FinclObjctvRecord, Integer> PER_CUST_UNIT_QTY = createField("PER_CUST_UNIT_QTY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.AVG_CMPGN_CUST_SLS_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> AVG_CMPGN_CUST_SLS_AMT = createField("AVG_CMPGN_CUST_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.RSRCH_BDGT_AMT</code>.
	 */
	public final TableField<FinclObjctvRecord, BigDecimal> RSRCH_BDGT_AMT = createField("RSRCH_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.FINCL_OBJCTV.APPT_CNT</code>. APPOINTMENT COUNT - Number of prospects officially named as Avon Representative though a signed contract (and any locally required registration) but hasn't necessarily submitted an order.
	 */
	public final TableField<FinclObjctvRecord, Long> APPT_CNT = createField("APPT_CNT", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "APPOINTMENT COUNT - Number of prospects officially named as Avon Representative though a signed contract (and any locally required registration) but hasn't necessarily submitted an order.");

	/**
	 * Create a <code>WETRN.FINCL_OBJCTV</code> table reference
	 */
	public FinclObjctv() {
		this("FINCL_OBJCTV", null);
	}

	/**
	 * Create an aliased <code>WETRN.FINCL_OBJCTV</code> table reference
	 */
	public FinclObjctv(String alias) {
		this(alias, FINCL_OBJCTV);
	}

	private FinclObjctv(String alias, Table<FinclObjctvRecord> aliased) {
		this(alias, aliased, null);
	}

	private FinclObjctv(String alias, Table<FinclObjctvRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<FinclObjctvRecord> getPrimaryKey() {
		return Keys.PK_FINCL_OBJCTV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<FinclObjctvRecord>> getKeys() {
		return Arrays.<UniqueKey<FinclObjctvRecord>>asList(Keys.PK_FINCL_OBJCTV);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<FinclObjctvRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<FinclObjctvRecord, ?>>asList(Keys.FK_MRKTPERD_TACTCLOBJCTV, Keys.FK_OBJCTV_FINCLOBJCTV, Keys.FK_FINCLVER_FINCLOBJCTV, Keys.FK_OBJCTVTYP_FINCLOBJCTV);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FinclObjctv as(String alias) {
		return new FinclObjctv(alias, this);
	}

	/**
	 * Rename this table
	 */
	public FinclObjctv rename(String name) {
		return new FinclObjctv(name, null);
	}
}
