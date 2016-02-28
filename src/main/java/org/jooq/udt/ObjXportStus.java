/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.ObjXportStusRecord;


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
public class ObjXportStus extends UDTImpl<ObjXportStusRecord> {

	private static final long serialVersionUID = -1985736954;

	/**
	 * The reference instance of <code>WETRN.OBJ_XPORT_STUS</code>
	 */
	public static final ObjXportStus OBJ_XPORT_STUS = new ObjXportStus();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ObjXportStusRecord> getRecordType() {
		return ObjXportStusRecord.class;
	}

	/**
	 * The attribute <code>WETRN.OBJ_XPORT_STUS.XPORT_STUS_ID</code>.
	 */
	public static final UDTField<ObjXportStusRecord, BigDecimal> XPORT_STUS_ID = createField("XPORT_STUS_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_XPORT_STUS, "");

	/**
	 * The attribute <code>WETRN.OBJ_XPORT_STUS.XPORT_STUS_SDESC_TXT</code>.
	 */
	public static final UDTField<ObjXportStusRecord, String> XPORT_STUS_SDESC_TXT = createField("XPORT_STUS_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30), OBJ_XPORT_STUS, "");

	/**
	 * The attribute <code>WETRN.OBJ_XPORT_STUS.SEQ_NR</code>.
	 */
	public static final UDTField<ObjXportStusRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC, OBJ_XPORT_STUS, "");

	/**
	 * No further instances allowed
	 */
	private ObjXportStus() {
		super("OBJ_XPORT_STUS", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}
