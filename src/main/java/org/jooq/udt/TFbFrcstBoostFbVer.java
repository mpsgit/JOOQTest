/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TFbFrcstBoostFbVerRecord;


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
public class TFbFrcstBoostFbVer extends UDTImpl<TFbFrcstBoostFbVerRecord> {

	private static final long serialVersionUID = 2024022597;

	/**
	 * The reference instance of <code>WETRN.T_FB_FRCST_BOOST_FB_VER</code>
	 */
	public static final TFbFrcstBoostFbVer T_FB_FRCST_BOOST_FB_VER = new TFbFrcstBoostFbVer();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TFbFrcstBoostFbVerRecord> getRecordType() {
		return TFbFrcstBoostFbVerRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_FB_FRCST_BOOST_FB_VER.MRKT_ID</code>.
	 */
	public static final UDTField<TFbFrcstBoostFbVerRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, T_FB_FRCST_BOOST_FB_VER, "");

	/**
	 * The attribute <code>WETRN.T_FB_FRCST_BOOST_FB_VER.MRKT_NM</code>.
	 */
	public static final UDTField<TFbFrcstBoostFbVerRecord, String> MRKT_NM = createField("MRKT_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_FB_FRCST_BOOST_FB_VER, "");

	/**
	 * The attribute <code>WETRN.T_FB_FRCST_BOOST_FB_VER.OFFR_PERD_ID</code>.
	 */
	public static final UDTField<TFbFrcstBoostFbVerRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, T_FB_FRCST_BOOST_FB_VER, "");

	/**
	 * The attribute <code>WETRN.T_FB_FRCST_BOOST_FB_VER.VEH_ID</code>.
	 */
	public static final UDTField<TFbFrcstBoostFbVerRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, T_FB_FRCST_BOOST_FB_VER, "");

	/**
	 * The attribute <code>WETRN.T_FB_FRCST_BOOST_FB_VER.LCL_VEH_DESC_TXT</code>.
	 */
	public static final UDTField<TFbFrcstBoostFbVerRecord, String> LCL_VEH_DESC_TXT = createField("LCL_VEH_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_FB_FRCST_BOOST_FB_VER, "");

	/**
	 * The attribute <code>WETRN.T_FB_FRCST_BOOST_FB_VER.VER_ID</code>.
	 */
	public static final UDTField<TFbFrcstBoostFbVerRecord, BigDecimal> VER_ID = createField("VER_ID", org.jooq.impl.SQLDataType.NUMERIC, T_FB_FRCST_BOOST_FB_VER, "");

	/**
	 * The attribute <code>WETRN.T_FB_FRCST_BOOST_FB_VER.VER_DESC_TXT</code>.
	 */
	public static final UDTField<TFbFrcstBoostFbVerRecord, String> VER_DESC_TXT = createField("VER_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(35), T_FB_FRCST_BOOST_FB_VER, "");

	/**
	 * No further instances allowed
	 */
	private TFbFrcstBoostFbVer() {
		super("T_FB_FRCST_BOOST_FB_VER", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}