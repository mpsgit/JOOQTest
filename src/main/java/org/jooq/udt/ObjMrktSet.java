/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.ObjMrktSetRecord;


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
public class ObjMrktSet extends UDTImpl<ObjMrktSetRecord> {

	private static final long serialVersionUID = 1938293533;

	/**
	 * The reference instance of <code>WETRN.OBJ_MRKT_SET</code>
	 */
	public static final ObjMrktSet OBJ_MRKT_SET = new ObjMrktSet();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ObjMrktSetRecord> getRecordType() {
		return ObjMrktSetRecord.class;
	}

	/**
	 * The attribute <code>WETRN.OBJ_MRKT_SET.OFFR_SKU_SET_ID</code>.
	 */
	public static final UDTField<ObjMrktSetRecord, BigDecimal> OFFR_SKU_SET_ID = createField("OFFR_SKU_SET_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_MRKT_SET, "");

	/**
	 * The attribute <code>WETRN.OBJ_MRKT_SET.SET_PRC_TYP_ID</code>.
	 */
	public static final UDTField<ObjMrktSetRecord, BigDecimal> SET_PRC_TYP_ID = createField("SET_PRC_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_MRKT_SET, "");

	/**
	 * The attribute <code>WETRN.OBJ_MRKT_SET.SET_PRC_TYP_DESC_TXT</code>.
	 */
	public static final UDTField<ObjMrktSetRecord, String> SET_PRC_TYP_DESC_TXT = createField("SET_PRC_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_MRKT_SET, "");

	/**
	 * The attribute <code>WETRN.OBJ_MRKT_SET.OFFR_SKU_SET_NM</code>.
	 */
	public static final UDTField<ObjMrktSetRecord, String> OFFR_SKU_SET_NM = createField("OFFR_SKU_SET_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100), OBJ_MRKT_SET, "");

	/**
	 * The attribute <code>WETRN.OBJ_MRKT_SET.SET_PRC_AMT</code>.
	 */
	public static final UDTField<ObjMrktSetRecord, BigDecimal> SET_PRC_AMT = createField("SET_PRC_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), OBJ_MRKT_SET, "");

	/**
	 * The attribute <code>WETRN.OBJ_MRKT_SET.SET_CMPNT_CNT</code>.
	 */
	public static final UDTField<ObjMrktSetRecord, BigDecimal> SET_CMPNT_CNT = createField("SET_CMPNT_CNT", org.jooq.impl.SQLDataType.NUMERIC, OBJ_MRKT_SET, "");

	/**
	 * The attribute <code>WETRN.OBJ_MRKT_SET.OFFR_SKU_SET_SKU_ID</code>.
	 */
	public static final UDTField<ObjMrktSetRecord, String> OFFR_SKU_SET_SKU_ID = createField("OFFR_SKU_SET_SKU_ID", org.jooq.impl.SQLDataType.VARCHAR.length(4000), OBJ_MRKT_SET, "");

	/**
	 * No further instances allowed
	 */
	private ObjMrktSet() {
		super("OBJ_MRKT_SET", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}
