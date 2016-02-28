/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TMastColRecord;
import org.jooq.udt.records.TblMastInfoRecord;


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
public class TMastCol extends UDTImpl<TMastColRecord> {

	private static final long serialVersionUID = -2066656904;

	/**
	 * The reference instance of <code>WETRN.T_MAST_COL</code>
	 */
	public static final TMastCol T_MAST_COL = new TMastCol();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TMastColRecord> getRecordType() {
		return TMastColRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_MAST_COL.COL_TYP</code>.
	 */
	public static final UDTField<TMastColRecord, String> COL_TYP = createField("COL_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_MAST_COL, "");

	/**
	 * The attribute <code>WETRN.T_MAST_COL.COL_INFO</code>.
	 */
	public static final UDTField<TMastColRecord, TblMastInfoRecord> COL_INFO = createField("COL_INFO", org.jooq.udt.TMastInfo.T_MAST_INFO.getDataType().asArrayDataType(org.jooq.udt.records.TblMastInfoRecord.class), T_MAST_COL, "");

	/**
	 * No further instances allowed
	 */
	private TMastCol() {
		super("T_MAST_COL", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}
