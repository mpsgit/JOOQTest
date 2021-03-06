/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TSaExcldVwRecord;
import org.jooq.udt.records.TblDlyBlngIdRecord;


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
public class TSaExcldVw extends UDTImpl<TSaExcldVwRecord> {

	private static final long serialVersionUID = 925703734;

	/**
	 * The reference instance of <code>WETRN.T_SA_EXCLD_VW</code>
	 */
	public static final TSaExcldVw T_SA_EXCLD_VW = new TSaExcldVw();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TSaExcldVwRecord> getRecordType() {
		return TSaExcldVwRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.FSC_CD</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> FSC_CD = createField("FSC_CD", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.FSC_DESC</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, String> FSC_DESC = createField("FSC_DESC", org.jooq.impl.SQLDataType.VARCHAR.length(255), T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.SKU_ID</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> SKU_ID = createField("SKU_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.LINE_NR</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> LINE_NR = createField("LINE_NR", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.SLS_PRC_AMT</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> SLS_PRC_AMT = createField("SLS_PRC_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.NR_FOR_QTY</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> NR_FOR_QTY = createField("NR_FOR_QTY", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.OFFR_TYP_DESC</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, String> OFFR_TYP_DESC = createField("OFFR_TYP_DESC", org.jooq.impl.SQLDataType.VARCHAR.length(255), T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.DMND_UNIT_QTY</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> DMND_UNIT_QTY = createField("DMND_UNIT_QTY", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.DMND_GTA</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> DMND_GTA = createField("DMND_GTA", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.BLD_UNIT_QTY</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> BLD_UNIT_QTY = createField("BLD_UNIT_QTY", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.BLD_GTA</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> BLD_GTA = createField("BLD_GTA", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.SLS_CHNL</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, String> SLS_CHNL = createField("SLS_CHNL", org.jooq.impl.SQLDataType.VARCHAR.length(255), T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.EXCLUDE</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, String> EXCLUDE = createField("EXCLUDE", org.jooq.impl.SQLDataType.CHAR.length(1), T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.MATCH</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, String> MATCH = createField("MATCH", org.jooq.impl.SQLDataType.CHAR.length(1), T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.ERROR_CODE</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> ERROR_CODE = createField("ERROR_CODE", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.ERROR_MESSAGE</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, String> ERROR_MESSAGE = createField("ERROR_MESSAGE", org.jooq.impl.SQLDataType.VARCHAR.length(4000), T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.PRFL_CD</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> PRFL_CD = createField("PRFL_CD", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.OFFR_PERD_ID</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.DLY_BILNG_ID</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> DLY_BILNG_ID = createField("DLY_BILNG_ID", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.SLS_CLS_CD</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> SLS_CLS_CD = createField("SLS_CLS_CD", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.SLS_CLS_CD_DESC</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, String> SLS_CLS_CD_DESC = createField("SLS_CLS_CD_DESC", org.jooq.impl.SQLDataType.VARCHAR.length(255), T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.DLY_BLNG_IDS</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, TblDlyBlngIdRecord> DLY_BLNG_IDS = createField("DLY_BLNG_IDS", org.jooq.impl.SQLDataType.NUMERIC.asArrayDataType(org.jooq.udt.records.TblDlyBlngIdRecord.class), T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.DMND_COMSN_AMT</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> DMND_COMSN_AMT = createField("DMND_COMSN_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.DMND_TAX_AMT</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> DMND_TAX_AMT = createField("DMND_TAX_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.BLD_COMSN_AMT</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> BLD_COMSN_AMT = createField("BLD_COMSN_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * The attribute <code>WETRN.T_SA_EXCLD_VW.BLD_TAX_AMT</code>.
	 */
	public static final UDTField<TSaExcldVwRecord, BigDecimal> BLD_TAX_AMT = createField("BLD_TAX_AMT", org.jooq.impl.SQLDataType.NUMERIC, T_SA_EXCLD_VW, "");

	/**
	 * No further instances allowed
	 */
	private TSaExcldVw() {
		super("T_SA_EXCLD_VW", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}
