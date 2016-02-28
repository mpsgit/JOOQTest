/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.ObjChoiceMrktVehPerdRecord;


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
public class ObjChoiceMrktVehPerd extends UDTImpl<ObjChoiceMrktVehPerdRecord> {

	private static final long serialVersionUID = -1124752997;

	/**
	 * The reference instance of <code>WETRN.OBJ_CHOICE_MRKT_VEH_PERD</code>
	 */
	public static final ObjChoiceMrktVehPerd OBJ_CHOICE_MRKT_VEH_PERD = new ObjChoiceMrktVehPerd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ObjChoiceMrktVehPerdRecord> getRecordType() {
		return ObjChoiceMrktVehPerdRecord.class;
	}

	/**
	 * The attribute <code>WETRN.OBJ_CHOICE_MRKT_VEH_PERD.MRKT_ID</code>.
	 */
	public static final UDTField<ObjChoiceMrktVehPerdRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_CHOICE_MRKT_VEH_PERD, "");

	/**
	 * The attribute <code>WETRN.OBJ_CHOICE_MRKT_VEH_PERD.OFFR_PERD_ID</code>.
	 */
	public static final UDTField<ObjChoiceMrktVehPerdRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_CHOICE_MRKT_VEH_PERD, "");

	/**
	 * The attribute <code>WETRN.OBJ_CHOICE_MRKT_VEH_PERD.SRCE_VEH_ID</code>.
	 */
	public static final UDTField<ObjChoiceMrktVehPerdRecord, BigDecimal> SRCE_VEH_ID = createField("SRCE_VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_CHOICE_MRKT_VEH_PERD, "");

	/**
	 * The attribute <code>WETRN.OBJ_CHOICE_MRKT_VEH_PERD.CHOICE_VEH_ID</code>.
	 */
	public static final UDTField<ObjChoiceMrktVehPerdRecord, BigDecimal> CHOICE_VEH_ID = createField("CHOICE_VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_CHOICE_MRKT_VEH_PERD, "");

	/**
	 * The attribute <code>WETRN.OBJ_CHOICE_MRKT_VEH_PERD.CHOICE_LEVEL</code>.
	 */
	public static final UDTField<ObjChoiceMrktVehPerdRecord, BigDecimal> CHOICE_LEVEL = createField("CHOICE_LEVEL", org.jooq.impl.SQLDataType.NUMERIC, OBJ_CHOICE_MRKT_VEH_PERD, "");

	/**
	 * No further instances allowed
	 */
	private ObjChoiceMrktVehPerd() {
		super("OBJ_CHOICE_MRKT_VEH_PERD", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}
