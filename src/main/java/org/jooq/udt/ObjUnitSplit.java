/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.ObjUnitSplitRecord;


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
public class ObjUnitSplit extends UDTImpl<ObjUnitSplitRecord> {

	private static final long serialVersionUID = 651160731;

	/**
	 * The reference instance of <code>WETRN.OBJ_UNIT_SPLIT</code>
	 */
	public static final ObjUnitSplit OBJ_UNIT_SPLIT = new ObjUnitSplit();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ObjUnitSplitRecord> getRecordType() {
		return ObjUnitSplitRecord.class;
	}

	/**
	 * The attribute <code>WETRN.OBJ_UNIT_SPLIT.SKU_ID</code>.
	 */
	public static final UDTField<ObjUnitSplitRecord, BigDecimal> SKU_ID = createField("SKU_ID", org.jooq.impl.SQLDataType.NUMERIC, OBJ_UNIT_SPLIT, "");

	/**
	 * The attribute <code>WETRN.OBJ_UNIT_SPLIT.UNIT_SPLT_PCT</code>.
	 */
	public static final UDTField<ObjUnitSplitRecord, BigDecimal> UNIT_SPLT_PCT = createField("UNIT_SPLT_PCT", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 3), OBJ_UNIT_SPLIT, "");

	/**
	 * No further instances allowed
	 */
	private ObjUnitSplit() {
		super("OBJ_UNIT_SPLIT", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}