/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TBfJobRsltsViewRecord;


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
public class TBfJobRsltsView extends UDTImpl<TBfJobRsltsViewRecord> {

	private static final long serialVersionUID = -1919158117;

	/**
	 * The reference instance of <code>WETRN.T_BF_JOB_RSLTS_VIEW</code>
	 */
	public static final TBfJobRsltsView T_BF_JOB_RSLTS_VIEW = new TBfJobRsltsView();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBfJobRsltsViewRecord> getRecordType() {
		return TBfJobRsltsViewRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TAB_ID</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> TAB_ID = createField("TAB_ID", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.JOB_ID_1</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> JOB_ID_1 = createField("JOB_ID_1", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.JOB_DESC_1</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> JOB_DESC_1 = createField("JOB_DESC_1", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.JOB_STUS_1</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> JOB_STUS_1 = createField("JOB_STUS_1", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.JOB_STUS_DESC_1</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> JOB_STUS_DESC_1 = createField("JOB_STUS_DESC_1", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.JOB_STRT_TS_1</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> JOB_STRT_TS_1 = createField("JOB_STRT_TS_1", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.JOB_END_TS_1</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> JOB_END_TS_1 = createField("JOB_END_TS_1", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.JOB_CREAT_USER_ID_1</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> JOB_CREAT_USER_ID_1 = createField("JOB_CREAT_USER_ID_1", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.JOB_TYP_1</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> JOB_TYP_1 = createField("JOB_TYP_1", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.JOB_TYP_DESC_1</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> JOB_TYP_DESC_1 = createField("JOB_TYP_DESC_1", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.JOB_ID_2</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> JOB_ID_2 = createField("JOB_ID_2", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TASK_ID_2</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> TASK_ID_2 = createField("TASK_ID_2", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.MPS_PARM_ID_2</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> MPS_PARM_ID_2 = createField("MPS_PARM_ID_2", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.MRKT_ID_2</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> MRKT_ID_2 = createField("MRKT_ID_2", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.MRKT_NM_2</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> MRKT_NM_2 = createField("MRKT_NM_2", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.OFFR_PERD_ID_2</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> OFFR_PERD_ID_2 = createField("OFFR_PERD_ID_2", org.jooq.impl.SQLDataType.VARCHAR.length(10), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.VER_ID_2</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> VER_ID_2 = createField("VER_ID_2", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.VER_DESC_2</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> VER_DESC_2 = createField("VER_DESC_2", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.VEH_ID_2</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> VEH_ID_2 = createField("VEH_ID_2", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.VEH_DESC_2</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> VEH_DESC_2 = createField("VEH_DESC_2", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TASK_STUS_ID_2</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> TASK_STUS_ID_2 = createField("TASK_STUS_ID_2", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TASK_STUS_2</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> TASK_STUS_2 = createField("TASK_STUS_2", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TASK_STRT_TS_2</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> TASK_STRT_TS_2 = createField("TASK_STRT_TS_2", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TASK_END_TS_2</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> TASK_END_TS_2 = createField("TASK_END_TS_2", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.JOB_ID_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> JOB_ID_3 = createField("JOB_ID_3", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TASK_ID_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> TASK_ID_3 = createField("TASK_ID_3", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.MPS_PARM_ID_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> MPS_PARM_ID_3 = createField("MPS_PARM_ID_3", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TASK_DESC_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> TASK_DESC_3 = createField("TASK_DESC_3", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TRGT_MRKT_ID_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> TRGT_MRKT_ID_3 = createField("TRGT_MRKT_ID_3", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TRGT_MRKT_NM_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> TRGT_MRKT_NM_3 = createField("TRGT_MRKT_NM_3", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TRGT_PERD_ID_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> TRGT_PERD_ID_3 = createField("TRGT_PERD_ID_3", org.jooq.impl.SQLDataType.VARCHAR.length(10), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.SRCE_MRKT_ID_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> SRCE_MRKT_ID_3 = createField("SRCE_MRKT_ID_3", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.SRCE_MRKT_NM_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> SRCE_MRKT_NM_3 = createField("SRCE_MRKT_NM_3", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.SRCE_PERD_ID_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> SRCE_PERD_ID_3 = createField("SRCE_PERD_ID_3", org.jooq.impl.SQLDataType.VARCHAR.length(10), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TASK_STUS_ID_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> TASK_STUS_ID_3 = createField("TASK_STUS_ID_3", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.BTCH_TASK_STUS_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> BTCH_TASK_STUS_3 = createField("BTCH_TASK_STUS_3", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TASK_STRT_TS_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> TASK_STRT_TS_3 = createField("TASK_STRT_TS_3", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TASK_END_TS_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> TASK_END_TS_3 = createField("TASK_END_TS_3", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.ERR_TYP_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> ERR_TYP_3 = createField("ERR_TYP_3", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.LOG_TYP_ID_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> LOG_TYP_ID_3 = createField("LOG_TYP_ID_3", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.LOG_TYP_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> LOG_TYP_3 = createField("LOG_TYP_3", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.ERR_CAUSE_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> ERR_CAUSE_3 = createField("ERR_CAUSE_3", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.ERR_DESC_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> ERR_DESC_3 = createField("ERR_DESC_3", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.MESSAGE_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, String> MESSAGE_3 = createField("MESSAGE_3", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TO_BE_BSTD_QTY_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> TO_BE_BSTD_QTY_3 = createField("TO_BE_BSTD_QTY_3", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.NOT_BSTD_QTY_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> NOT_BSTD_QTY_3 = createField("NOT_BSTD_QTY_3", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.TRGT_MRKT_SEQ_NR_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> TRGT_MRKT_SEQ_NR_3 = createField("TRGT_MRKT_SEQ_NR_3", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * The attribute <code>WETRN.T_BF_JOB_RSLTS_VIEW.SRCE_MRKT_SEQ_NR_3</code>.
	 */
	public static final UDTField<TBfJobRsltsViewRecord, BigDecimal> SRCE_MRKT_SEQ_NR_3 = createField("SRCE_MRKT_SEQ_NR_3", org.jooq.impl.SQLDataType.NUMERIC, T_BF_JOB_RSLTS_VIEW, "");

	/**
	 * No further instances allowed
	 */
	private TBfJobRsltsView() {
		super("T_BF_JOB_RSLTS_VIEW", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}