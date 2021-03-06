/**
 * This class is generated by jOOQ
 */
package org.jooq;


import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in WETRN
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>WETRN.MESSAGE_TRANSACTION_ROW_SQNC</code>
	 */
	public static final Sequence<BigInteger> MESSAGE_TRANSACTION_ROW_SQNC = new SequenceImpl<BigInteger>("MESSAGE_TRANSACTION_ROW_SQNC", Wetrn.WETRN, org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false));

	/**
	 * The sequence <code>WETRN.MESSAGE_TRANSACTION_SQNC</code>
	 */
	public static final Sequence<BigInteger> MESSAGE_TRANSACTION_SQNC = new SequenceImpl<BigInteger>("MESSAGE_TRANSACTION_SQNC", Wetrn.WETRN, org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false));

	/**
	 * The sequence <code>WETRN.PLSQL_PROFILER_RUNNUMBER</code>
	 */
	public static final Sequence<BigInteger> PLSQL_PROFILER_RUNNUMBER = new SequenceImpl<BigInteger>("PLSQL_PROFILER_RUNNUMBER", Wetrn.WETRN, org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false));

	/**
	 * The sequence <code>WETRN.REP_MRKT_TMPLT_SEQ</code>
	 */
	public static final Sequence<BigInteger> REP_MRKT_TMPLT_SEQ = new SequenceImpl<BigInteger>("REP_MRKT_TMPLT_SEQ", Wetrn.WETRN, org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false));

	/**
	 * The sequence <code>WETRN.REP_RUN_ID_SEQ</code>
	 */
	public static final Sequence<BigInteger> REP_RUN_ID_SEQ = new SequenceImpl<BigInteger>("REP_RUN_ID_SEQ", Wetrn.WETRN, org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false));

	/**
	 * The sequence <code>WETRN.SEQ</code>
	 */
	public static final Sequence<BigInteger> SEQ = new SequenceImpl<BigInteger>("SEQ", Wetrn.WETRN, org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false));

	/**
	 * The sequence <code>WETRN.SEQ_BTCH_FRAMWORK</code>
	 */
	public static final Sequence<BigInteger> SEQ_BTCH_FRAMWORK = new SequenceImpl<BigInteger>("SEQ_BTCH_FRAMWORK", Wetrn.WETRN, org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false));

	/**
	 * The sequence <code>WETRN.SEQ_CNCPTL_OFFR</code>
	 */
	public static final Sequence<BigInteger> SEQ_CNCPTL_OFFR = new SequenceImpl<BigInteger>("SEQ_CNCPTL_OFFR", Wetrn.WETRN, org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false));

	/**
	 * The sequence <code>WETRN.SEQ_DLY_BILNG_ID</code>
	 */
	public static final Sequence<BigInteger> SEQ_DLY_BILNG_ID = new SequenceImpl<BigInteger>("SEQ_DLY_BILNG_ID", Wetrn.WETRN, org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false));

	/**
	 * The sequence <code>WETRN.SEQ_MPS_PARM</code>
	 */
	public static final Sequence<BigInteger> SEQ_MPS_PARM = new SequenceImpl<BigInteger>("SEQ_MPS_PARM", Wetrn.WETRN, org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false));

	/**
	 * The sequence <code>WETRN.SEQ_MPS_PLSQL_OUTPUT</code>
	 */
	public static final Sequence<BigInteger> SEQ_MPS_PLSQL_OUTPUT = new SequenceImpl<BigInteger>("SEQ_MPS_PLSQL_OUTPUT", Wetrn.WETRN, org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false));

	/**
	 * The sequence <code>WETRN.SEQ_RPT_LOG</code>
	 */
	public static final Sequence<BigInteger> SEQ_RPT_LOG = new SequenceImpl<BigInteger>("SEQ_RPT_LOG", Wetrn.WETRN, org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false));

	/**
	 * The sequence <code>WETRN.SEQ_SLS_ALOCTN</code>
	 */
	public static final Sequence<BigInteger> SEQ_SLS_ALOCTN = new SequenceImpl<BigInteger>("SEQ_SLS_ALOCTN", Wetrn.WETRN, org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false));

	/**
	 * The sequence <code>WETRN.TOAD_SEQ</code>
	 */
	public static final Sequence<BigInteger> TOAD_SEQ = new SequenceImpl<BigInteger>("TOAD_SEQ", Wetrn.WETRN, org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false));
}
