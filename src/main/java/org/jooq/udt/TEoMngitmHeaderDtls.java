/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TEoMngitmHeaderDtlsRecord;


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
public class TEoMngitmHeaderDtls extends UDTImpl<TEoMngitmHeaderDtlsRecord> {

	private static final long serialVersionUID = -1087894911;

	/**
	 * The reference instance of <code>WETRN.T_EO_MNGITM_HEADER_DTLS</code>
	 */
	public static final TEoMngitmHeaderDtls T_EO_MNGITM_HEADER_DTLS = new TEoMngitmHeaderDtls();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TEoMngitmHeaderDtlsRecord> getRecordType() {
		return TEoMngitmHeaderDtlsRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_EO_MNGITM_HEADER_DTLS.OFFR_ID</code>.
	 */
	public static final UDTField<TEoMngitmHeaderDtlsRecord, BigDecimal> OFFR_ID = createField("OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EO_MNGITM_HEADER_DTLS, "");

	/**
	 * The attribute <code>WETRN.T_EO_MNGITM_HEADER_DTLS.OFFR_DESC_TXT</code>.
	 */
	public static final UDTField<TEoMngitmHeaderDtlsRecord, String> OFFR_DESC_TXT = createField("OFFR_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(1000), T_EO_MNGITM_HEADER_DTLS, "");

	/**
	 * The attribute <code>WETRN.T_EO_MNGITM_HEADER_DTLS.MRKT_ID</code>.
	 */
	public static final UDTField<TEoMngitmHeaderDtlsRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EO_MNGITM_HEADER_DTLS, "");

	/**
	 * The attribute <code>WETRN.T_EO_MNGITM_HEADER_DTLS.MRKT_NM</code>.
	 */
	public static final UDTField<TEoMngitmHeaderDtlsRecord, String> MRKT_NM = createField("MRKT_NM", org.jooq.impl.SQLDataType.VARCHAR.length(200), T_EO_MNGITM_HEADER_DTLS, "");

	/**
	 * The attribute <code>WETRN.T_EO_MNGITM_HEADER_DTLS.OFFR_PERD_ID</code>.
	 */
	public static final UDTField<TEoMngitmHeaderDtlsRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EO_MNGITM_HEADER_DTLS, "");

	/**
	 * The attribute <code>WETRN.T_EO_MNGITM_HEADER_DTLS.VEH_ID</code>.
	 */
	public static final UDTField<TEoMngitmHeaderDtlsRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EO_MNGITM_HEADER_DTLS, "");

	/**
	 * The attribute <code>WETRN.T_EO_MNGITM_HEADER_DTLS.VEH_DESC</code>.
	 */
	public static final UDTField<TEoMngitmHeaderDtlsRecord, String> VEH_DESC = createField("VEH_DESC", org.jooq.impl.SQLDataType.VARCHAR.length(500), T_EO_MNGITM_HEADER_DTLS, "");

	/**
	 * The attribute <code>WETRN.T_EO_MNGITM_HEADER_DTLS.VER_ID</code>.
	 */
	public static final UDTField<TEoMngitmHeaderDtlsRecord, BigDecimal> VER_ID = createField("VER_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EO_MNGITM_HEADER_DTLS, "");

	/**
	 * The attribute <code>WETRN.T_EO_MNGITM_HEADER_DTLS.VER_DESC</code>.
	 */
	public static final UDTField<TEoMngitmHeaderDtlsRecord, String> VER_DESC = createField("VER_DESC", org.jooq.impl.SQLDataType.VARCHAR.length(300), T_EO_MNGITM_HEADER_DTLS, "");

	/**
	 * The attribute <code>WETRN.T_EO_MNGITM_HEADER_DTLS.SLS_TYP_ID</code>.
	 */
	public static final UDTField<TEoMngitmHeaderDtlsRecord, BigDecimal> SLS_TYP_ID = createField("SLS_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EO_MNGITM_HEADER_DTLS, "");

	/**
	 * The attribute <code>WETRN.T_EO_MNGITM_HEADER_DTLS.SLS_TYP_NM</code>.
	 */
	public static final UDTField<TEoMngitmHeaderDtlsRecord, String> SLS_TYP_NM = createField("SLS_TYP_NM", org.jooq.impl.SQLDataType.VARCHAR.length(300), T_EO_MNGITM_HEADER_DTLS, "");

	/**
	 * The attribute <code>WETRN.T_EO_MNGITM_HEADER_DTLS.USER_NM</code>.
	 */
	public static final UDTField<TEoMngitmHeaderDtlsRecord, String> USER_NM = createField("USER_NM", org.jooq.impl.SQLDataType.VARCHAR.length(200), T_EO_MNGITM_HEADER_DTLS, "");

	/**
	 * The attribute <code>WETRN.T_EO_MNGITM_HEADER_DTLS.LOCK_TS</code>.
	 */
	public static final UDTField<TEoMngitmHeaderDtlsRecord, String> LOCK_TS = createField("LOCK_TS", org.jooq.impl.SQLDataType.VARCHAR.length(200), T_EO_MNGITM_HEADER_DTLS, "");

	/**
	 * No further instances allowed
	 */
	private TEoMngitmHeaderDtls() {
		super("T_EO_MNGITM_HEADER_DTLS", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}