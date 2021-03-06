/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.ObjActiveNotPlannedRecord;


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
public class ObjActiveNotPlanned extends UDTImpl<ObjActiveNotPlannedRecord> {

	private static final long serialVersionUID = -315396733;

	/**
	 * The reference instance of <code>WETRN.OBJ_ACTIVE_NOT_PLANNED</code>
	 */
	public static final ObjActiveNotPlanned OBJ_ACTIVE_NOT_PLANNED = new ObjActiveNotPlanned();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ObjActiveNotPlannedRecord> getRecordType() {
		return ObjActiveNotPlannedRecord.class;
	}

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.REC_STUS</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> REC_STUS = createField("REC_STUS", org.jooq.impl.SQLDataType.VARCHAR.length(35), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.CATGRY_NM</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> CATGRY_NM = createField("CATGRY_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.BRND_FMLY_NM</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> BRND_FMLY_NM = createField("BRND_FMLY_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.SGMT_NM</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> SGMT_NM = createField("SGMT_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.PROD_TYP_DESC_TXT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> PROD_TYP_DESC_TXT = createField("PROD_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.PRFL_CD</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, Integer> PRFL_CD = createField("PRFL_CD", org.jooq.impl.SQLDataType.INTEGER, OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.PRFL_NM</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> PRFL_NM = createField("PRFL_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.SKU_ID</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> SKU_ID = createField("SKU_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.LCL_SKU_NM</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> LCL_SKU_NM = createField("LCL_SKU_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.OFFR_DESC_TXT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> OFFR_DESC_TXT = createField("OFFR_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.SCTN_NM</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> SCTN_NM = createField("SCTN_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.SLS_CLS_DESC_TXT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> SLS_CLS_DESC_TXT = createField("SLS_CLS_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.AVLBL_PERD_ID</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> AVLBL_PERD_ID = createField("AVLBL_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.INTRDCTN_PERD_ID</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> INTRDCTN_PERD_ID = createField("INTRDCTN_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.DSPOSTN_PERD_ID</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> DSPOSTN_PERD_ID = createField("DSPOSTN_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.NON_SALE_PERD_ID</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> NON_SALE_PERD_ID = createField("NON_SALE_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.REG_PRC_AMT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> REG_PRC_AMT = createField("REG_PRC_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.WGHTD_AVG_COST_AMT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> WGHTD_AVG_COST_AMT = createField("WGHTD_AVG_COST_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 3), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.UNIT_QTY</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, Integer> UNIT_QTY = createField("UNIT_QTY", org.jooq.impl.SQLDataType.INTEGER, OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.SLS_PRC_AMT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> SLS_PRC_AMT = createField("SLS_PRC_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.PG_WGHT_PCT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> PG_WGHT_PCT = createField("PG_WGHT_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.PG_TYP_DESC_TXT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> PG_TYP_DESC_TXT = createField("PG_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.PROD_ENDRSMT_DESC_TXT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> PROD_ENDRSMT_DESC_TXT = createField("PROD_ENDRSMT_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.IMPCT_CATGRY_NM</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> IMPCT_CATGRY_NM = createField("IMPCT_CATGRY_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.BDGT_AMT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> BDGT_AMT = createField("BDGT_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.PROMTN_DESC_TXT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> PROMTN_DESC_TXT = createField("PROMTN_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.PROMTN_CLM_DESC_TXT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> PROMTN_CLM_DESC_TXT = createField("PROMTN_CLM_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.PYMT_TYP_DESC_TXT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> PYMT_TYP_DESC_TXT = createField("PYMT_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.TAX_TYP_DESC_TXT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> TAX_TYP_DESC_TXT = createField("TAX_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.COMSN_TYP_DESC_TXT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> COMSN_TYP_DESC_TXT = createField("COMSN_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.CHRTY_AMT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> CHRTY_AMT = createField("CHRTY_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.AWRD_SLS_PRC_AMT</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> AWRD_SLS_PRC_AMT = createField("AWRD_SLS_PRC_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.SLS_CLS_CD</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> SLS_CLS_CD = createField("SLS_CLS_CD", org.jooq.impl.SQLDataType.NUMERIC, OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.PG_TYP_ID</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> PG_TYP_ID = createField("PG_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.PROD_ENDRSMT_ID</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> PROD_ENDRSMT_ID = createField("PROD_ENDRSMT_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.IMPCT_CATGRY_ID</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> IMPCT_CATGRY_ID = createField("IMPCT_CATGRY_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.PROMTN_ID</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> PROMTN_ID = createField("PROMTN_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.PROMTN_CLM_ID</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> PROMTN_CLM_ID = createField("PROMTN_CLM_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.PYMT_TYP</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> PYMT_TYP = createField("PYMT_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(5), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.TAX_TYPE_ID</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, BigDecimal> TAX_TYPE_ID = createField("TAX_TYPE_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * The attribute <code>WETRN.OBJ_ACTIVE_NOT_PLANNED.COMSN_TYP</code>.
	 */
	public static final UDTField<ObjActiveNotPlannedRecord, String> COMSN_TYP = createField("COMSN_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(5), OBJ_ACTIVE_NOT_PLANNED, "");

	/**
	 * No further instances allowed
	 */
	private ObjActiveNotPlanned() {
		super("OBJ_ACTIVE_NOT_PLANNED", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}
