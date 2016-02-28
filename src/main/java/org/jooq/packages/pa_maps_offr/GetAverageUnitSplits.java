/**
 * This class is generated by jOOQ
 */
package org.jooq.packages.pa_maps_offr;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Wetrn;
import org.jooq.impl.AbstractRoutine;
import org.jooq.packages.PaMapsOffr;
import org.jooq.udt.records.TblIdRecord;
import org.jooq.udt.records.TblUnitSplitRecord;


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
public class GetAverageUnitSplits extends AbstractRoutine<TblUnitSplitRecord> {

	private static final long serialVersionUID = -1738743154;

	/**
	 * The parameter <code>WETRN.PA_MAPS_OFFR.GET_AVERAGE_UNIT_SPLITS.RETURN_VALUE</code>.
	 */
	public static final Parameter<TblUnitSplitRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.udt.ObjUnitSplit.OBJ_UNIT_SPLIT.getDataType().asArrayDataType(org.jooq.udt.records.TblUnitSplitRecord.class), false);

	/**
	 * The parameter <code>WETRN.PA_MAPS_OFFR.GET_AVERAGE_UNIT_SPLITS.P_ITEMS</code>.
	 */
	public static final Parameter<TblIdRecord> P_ITEMS = createParameter("P_ITEMS", org.jooq.impl.SQLDataType.NUMERIC.asArrayDataType(org.jooq.udt.records.TblIdRecord.class), false);

	/**
	 * Create a new routine call instance
	 */
	public GetAverageUnitSplits() {
		super("GET_AVERAGE_UNIT_SPLITS", Wetrn.WETRN, PaMapsOffr.PA_MAPS_OFFR, org.jooq.udt.ObjUnitSplit.OBJ_UNIT_SPLIT.getDataType().asArrayDataType(org.jooq.udt.records.TblUnitSplitRecord.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_ITEMS);
	}

	/**
	 * Set the <code>P_ITEMS</code> parameter IN value to the routine
	 */
	public void setPItems(TblIdRecord value) {
		setValue(P_ITEMS, value);
	}

	/**
	 * Set the <code>P_ITEMS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPItems(Field<TblIdRecord> field) {
		setField(P_ITEMS, field);
	}
}
