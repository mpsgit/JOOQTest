/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.TMastCol;


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
public class TMastColRecord extends UDTRecordImpl<TMastColRecord> implements Record2<String, TblMastInfoRecord> {

	private static final long serialVersionUID = 2045931879;

	/**
	 * Setter for <code>WETRN.T_MAST_COL.COL_TYP</code>.
	 */
	public void setColTyp(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.T_MAST_COL.COL_TYP</code>.
	 */
	public String getColTyp() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.T_MAST_COL.COL_INFO</code>.
	 */
	public void setColInfo(TblMastInfoRecord value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.T_MAST_COL.COL_INFO</code>.
	 */
	public TblMastInfoRecord getColInfo() {
		return (TblMastInfoRecord) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, TblMastInfoRecord> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, TblMastInfoRecord> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return TMastCol.COL_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<TblMastInfoRecord> field2() {
		return TMastCol.COL_INFO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getColTyp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblMastInfoRecord value2() {
		return getColInfo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMastColRecord value1(String value) {
		setColTyp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMastColRecord value2(TblMastInfoRecord value) {
		setColInfo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMastColRecord values(String value1, TblMastInfoRecord value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TMastColRecord
	 */
	public TMastColRecord() {
		super(TMastCol.T_MAST_COL);
	}

	/**
	 * Create a detached, initialised TMastColRecord
	 */
	public TMastColRecord(String colTyp, TblMastInfoRecord colInfo) {
		super(TMastCol.T_MAST_COL);

		setValue(0, colTyp);
		setValue(1, colInfo);
	}
}