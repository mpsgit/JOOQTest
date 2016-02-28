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
import org.jooq.tables.records.PrsnlFinclObjctvRecord;


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
public class PrsnlFinclObjctv extends TableImpl<PrsnlFinclObjctvRecord> {

	private static final long serialVersionUID = 625730927;

	/**
	 * The reference instance of <code>WETRN.PRSNL_FINCL_OBJCTV</code>
	 */
	public static final PrsnlFinclObjctv PRSNL_FINCL_OBJCTV = new PrsnlFinclObjctv();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PrsnlFinclObjctvRecord> getRecordType() {
		return PrsnlFinclObjctvRecord.class;
	}

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.MRKT_ID</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.OFFR_PERD_ID</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.OBJCTV_ID</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> OBJCTV_ID = createField("OBJCTV_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.CLSTR_ID</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> CLSTR_ID = createField("CLSTR_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.USER_NM</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, String> USER_NM = createField("USER_NM", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.PRSNL_VER_ID</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> PRSNL_VER_ID = createField("PRSNL_VER_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.OBJCTV_TYP</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, String> OBJCTV_TYP = createField("OBJCTV_TYP", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.ACTV_REP_CNT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> ACTV_REP_CNT = createField("ACTV_REP_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.SYS_ID</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> SYS_ID = createField("SYS_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.ACTV_SKU_CNT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> ACTV_SKU_CNT = createField("ACTV_SKU_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.REP_ACTVTY_PCT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> REP_ACTVTY_PCT = createField("REP_ACTVTY_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.ADVRTSG_BDGT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> ADVRTSG_BDGT_AMT = createField("ADVRTSG_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.VEH_PG_CNT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> VEH_PG_CNT = createField("VEH_PG_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.VEH_BDGT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> VEH_BDGT_AMT = createField("VEH_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.CMPETTN_PRZE_BDGT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> CMPETTN_PRZE_BDGT_AMT = createField("CMPETTN_PRZE_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.CNSMR_INCNTV_BDGT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> CNSMR_INCNTV_BDGT_AMT = createField("CNSMR_INCNTV_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.CPI_INFLTN_PCT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> CPI_INFLTN_PCT = createField("CPI_INFLTN_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.CUST_SERVC_CNT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> CUST_SERVC_CNT = createField("CUST_SERVC_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.DSCNTND_SKU_CNT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> DSCNTND_SKU_CNT = createField("DSCNTND_SKU_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.GIFT_WITH_PRCHS_BDGT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> GIFT_WITH_PRCHS_BDGT_AMT = createField("GIFT_WITH_PRCHS_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.INCNTV_VEH_BDGT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> INCNTV_VEH_BDGT_AMT = createField("INCNTV_VEH_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.MRKT_SHR_PCT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> MRKT_SHR_PCT = createField("MRKT_SHR_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.MICR_NCPSLTN_PG_CNT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> MICR_NCPSLTN_PG_CNT = createField("MICR_NCPSLTN_PG_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.MICR_NCPSLTN_BDGT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> MICR_NCPSLTN_BDGT_AMT = createField("MICR_NCPSLTN_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.NEW_CNCPT_CNT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> NEW_CNCPT_CNT = createField("NEW_CNCPT_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.NEW_SKU_CNT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> NEW_SKU_CNT = createField("NEW_SKU_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.CUST_CNT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> CUST_CNT = createField("CUST_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.ORD_CNT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> ORD_CNT = createField("ORD_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.OTHR_BDGT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> OTHR_BDGT_AMT = createField("OTHR_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.PBLC_RLTNS_BDGT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> PBLC_RLTNS_BDGT_AMT = createField("PBLC_RLTNS_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.PROD_INCNTV_BDGT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> PROD_INCNTV_BDGT_AMT = createField("PROD_INCNTV_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.FLD_INCNTV_BDGT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> FLD_INCNTV_BDGT_AMT = createField("FLD_INCNTV_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.SMPLG_BDGT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> SMPLG_BDGT_AMT = createField("SMPLG_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.RTURN_SLS_PCT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> RTURN_SLS_PCT = createField("RTURN_SLS_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.CREAT_USER_ID</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.CREAT_TS</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.LAST_UPDT_TS</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.BRCHR_PG_CNT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, Integer> BRCHR_PG_CNT = createField("BRCHR_PG_CNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.CUST_UNITS_PER_REP_QTY</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> CUST_UNITS_PER_REP_QTY = createField("CUST_UNITS_PER_REP_QTY", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.CUST_UNITS_PER_ORD_QTY</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> CUST_UNITS_PER_ORD_QTY = createField("CUST_UNITS_PER_ORD_QTY", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.REP_CNT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> REP_CNT = createField("REP_CNT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.TOT_BRCHR_SLS_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> TOT_BRCHR_SLS_AMT = createField("TOT_BRCHR_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.TOT_CUST_SLS_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> TOT_CUST_SLS_AMT = createField("TOT_CUST_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.TOT_REP_SLS_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> TOT_REP_SLS_AMT = createField("TOT_REP_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.TOT_ADJSTMT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> TOT_ADJSTMT_AMT = createField("TOT_ADJSTMT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.GRS_SLS_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> GRS_SLS_AMT = createField("GRS_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.SLS_AIDS_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> SLS_AIDS_AMT = createField("SLS_AIDS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.BLLD_SLS_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> BLLD_SLS_AMT = createField("BLLD_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.RTURN_SLS_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> RTURN_SLS_AMT = createField("RTURN_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.NET_SLS_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> NET_SLS_AMT = createField("NET_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.TOT_SOL_QTY</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, Integer> TOT_SOL_QTY = createField("TOT_SOL_QTY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.TOT_BDGT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> TOT_BDGT_AMT = createField("TOT_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.ACTVTY_PCT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> ACTVTY_PCT = createField("ACTVTY_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.AVG_ORD_GRS_SLS_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> AVG_ORD_GRS_SLS_AMT = createField("AVG_ORD_GRS_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.REP_SPND_GRS_SLS_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> REP_SPND_GRS_SLS_AMT = createField("REP_SPND_GRS_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.AVG_ORD_BILLD_SLS_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> AVG_ORD_BILLD_SLS_AMT = createField("AVG_ORD_BILLD_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.REP_SPND_BILLD_SLS_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> REP_SPND_BILLD_SLS_AMT = createField("REP_SPND_BILLD_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.CUST_SERVC_QTY</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, Integer> CUST_SERVC_QTY = createField("CUST_SERVC_QTY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.CUST_SPND_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> CUST_SPND_AMT = createField("CUST_SPND_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.CUST_SLS_PER_UNIT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> CUST_SLS_PER_UNIT_AMT = createField("CUST_SLS_PER_UNIT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.GRS_SLS_PER_UNIT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> GRS_SLS_PER_UNIT_AMT = createField("GRS_SLS_PER_UNIT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.PER_CUST_UNIT_QTY</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, Integer> PER_CUST_UNIT_QTY = createField("PER_CUST_UNIT_QTY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.AVG_CMPGN_CUST_SLS_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> AVG_CMPGN_CUST_SLS_AMT = createField("AVG_CMPGN_CUST_SLS_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.RSRCH_BDGT_AMT</code>.
	 */
	public final TableField<PrsnlFinclObjctvRecord, BigDecimal> RSRCH_BDGT_AMT = createField("RSRCH_BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * The column <code>WETRN.PRSNL_FINCL_OBJCTV.APPT_CNT</code>. APPOINTMENT COUNT - Number of prospects officially named as Avon Representative though a signed contract (and any locally required registration) but hasn't necessarily submitted an order.
	 */
	public final TableField<PrsnlFinclObjctvRecord, Long> APPT_CNT = createField("APPT_CNT", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "APPOINTMENT COUNT - Number of prospects officially named as Avon Representative though a signed contract (and any locally required registration) but hasn't necessarily submitted an order.");

	/**
	 * Create a <code>WETRN.PRSNL_FINCL_OBJCTV</code> table reference
	 */
	public PrsnlFinclObjctv() {
		this("PRSNL_FINCL_OBJCTV", null);
	}

	/**
	 * Create an aliased <code>WETRN.PRSNL_FINCL_OBJCTV</code> table reference
	 */
	public PrsnlFinclObjctv(String alias) {
		this(alias, PRSNL_FINCL_OBJCTV);
	}

	private PrsnlFinclObjctv(String alias, Table<PrsnlFinclObjctvRecord> aliased) {
		this(alias, aliased, null);
	}

	private PrsnlFinclObjctv(String alias, Table<PrsnlFinclObjctvRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PrsnlFinclObjctvRecord> getPrimaryKey() {
		return Keys.PK_PRSNL_FINCL_OBJCTV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PrsnlFinclObjctvRecord>> getKeys() {
		return Arrays.<UniqueKey<PrsnlFinclObjctvRecord>>asList(Keys.PK_PRSNL_FINCL_OBJCTV);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<PrsnlFinclObjctvRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<PrsnlFinclObjctvRecord, ?>>asList(Keys.FK_MRKTPERD_PRSNLFINCLOBJCTV, Keys.FK_PRSNLVER_PRSNLSTRTGCOBJCTV, Keys.FK_OBJCTV_PRSNLFINCLOBJCTV, Keys.FK_OBJCTVTYP_PRSNLFINCLOBJCTV);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PrsnlFinclObjctv as(String alias) {
		return new PrsnlFinclObjctv(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PrsnlFinclObjctv rename(String name) {
		return new PrsnlFinclObjctv(name, null);
	}
}
