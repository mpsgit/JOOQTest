/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.UNested_1Record;
import org.jooq.udt.records.UNumberTableRecord;


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
public class UNested_1 extends UDTImpl<UNested_1Record> {

	private static final long serialVersionUID = -634076580;

	/**
	 * The reference instance of <code>WETRN.U_NESTED_1</code>
	 */
	public static final UNested_1 U_NESTED_1 = new UNested_1();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UNested_1Record> getRecordType() {
		return UNested_1Record.class;
	}

	/**
	 * The attribute <code>WETRN.U_NESTED_1.ID</code>.
	 */
	public static final UDTField<UNested_1Record, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, U_NESTED_1, "");

	/**
	 * The attribute <code>WETRN.U_NESTED_1.NESTED</code>.
	 */
	public static final UDTField<UNested_1Record, UNumberTableRecord> NESTED = createField("NESTED", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.udt.records.UNumberTableRecord.class), U_NESTED_1, "");

	/**
	 * No further instances allowed
	 */
	private UNested_1() {
		super("U_NESTED_1", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}