/**
 * This class is generated by jOOQ
 */
package org.jooq.udt;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.UDTField;
import org.jooq.Wetrn;
import org.jooq.impl.UDTImpl;
import org.jooq.udt.records.TEditOffrPlannedTrgtMtrcsRecord;


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
public class TEditOffrPlannedTrgtMtrcs extends UDTImpl<TEditOffrPlannedTrgtMtrcsRecord> {

	private static final long serialVersionUID = 2005764454;

	/**
	 * The reference instance of <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS</code>
	 */
	public static final TEditOffrPlannedTrgtMtrcs T_EDIT_OFFR_PLANNED_TRGT_MTRCS = new TEditOffrPlannedTrgtMtrcs();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TEditOffrPlannedTrgtMtrcsRecord> getRecordType() {
		return TEditOffrPlannedTrgtMtrcsRecord.class;
	}

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.OFFR_CLS_ID</code>.
	 */
	public static final UDTField<TEditOffrPlannedTrgtMtrcsRecord, BigDecimal> OFFR_CLS_ID = createField("OFFR_CLS_ID", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_PLANNED_TRGT_MTRCS, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.SLSDESC</code>.
	 */
	public static final UDTField<TEditOffrPlannedTrgtMtrcsRecord, String> SLSDESC = createField("SLSDESC", org.jooq.impl.SQLDataType.VARCHAR.length(100), T_EDIT_OFFR_PLANNED_TRGT_MTRCS, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.UNITS</code>.
	 */
	public static final UDTField<TEditOffrPlannedTrgtMtrcsRecord, BigDecimal> UNITS = createField("UNITS", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_PLANNED_TRGT_MTRCS, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.SALES</code>.
	 */
	public static final UDTField<TEditOffrPlannedTrgtMtrcsRecord, BigDecimal> SALES = createField("SALES", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_PLANNED_TRGT_MTRCS, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.SALES_DOLLARS</code>.
	 */
	public static final UDTField<TEditOffrPlannedTrgtMtrcsRecord, BigDecimal> SALES_DOLLARS = createField("SALES_DOLLARS", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_PLANNED_TRGT_MTRCS, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.COST</code>.
	 */
	public static final UDTField<TEditOffrPlannedTrgtMtrcsRecord, BigDecimal> COST = createField("COST", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_PLANNED_TRGT_MTRCS, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.COST_DOLLARS</code>.
	 */
	public static final UDTField<TEditOffrPlannedTrgtMtrcsRecord, BigDecimal> COST_DOLLARS = createField("COST_DOLLARS", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_PLANNED_TRGT_MTRCS, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.NUM_REPS</code>.
	 */
	public static final UDTField<TEditOffrPlannedTrgtMtrcsRecord, BigDecimal> NUM_REPS = createField("NUM_REPS", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_PLANNED_TRGT_MTRCS, "");

	/**
	 * The attribute <code>WETRN.T_EDIT_OFFR_PLANNED_TRGT_MTRCS.ORDER_COUNT</code>.
	 */
	public static final UDTField<TEditOffrPlannedTrgtMtrcsRecord, BigDecimal> ORDER_COUNT = createField("ORDER_COUNT", org.jooq.impl.SQLDataType.NUMERIC, T_EDIT_OFFR_PLANNED_TRGT_MTRCS, "");

	/**
	 * No further instances allowed
	 */
	private TEditOffrPlannedTrgtMtrcs() {
		super("T_EDIT_OFFR_PLANNED_TRGT_MTRCS", Wetrn.WETRN);

		// Initialise data type
		getDataType();
	}
}
