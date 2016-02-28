/**
 * This class is generated by jOOQ
 */
package org.jooq.udt.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.udt.ObjOffr;


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
public class ObjOffrRecord extends UDTRecordImpl<ObjOffrRecord> implements Record3<ObjOffrDataRecord, TblPrcPointRecord, TblMrktSetRecord> {

	private static final long serialVersionUID = -539776818;

	/**
	 * Setter for <code>WETRN.OBJ_OFFR.OFFR</code>.
	 */
	public void setOffr(ObjOffrDataRecord value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.OBJ_OFFR.OFFR</code>.
	 */
	public ObjOffrDataRecord getOffr() {
		return (ObjOffrDataRecord) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.OBJ_OFFR.PRC_POINT_LIST</code>.
	 */
	public void setPrcPointList(TblPrcPointRecord value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.OBJ_OFFR.PRC_POINT_LIST</code>.
	 */
	public TblPrcPointRecord getPrcPointList() {
		return (TblPrcPointRecord) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.OBJ_OFFR.MRKT_SET_LIST</code>.
	 */
	public void setMrktSetList(TblMrktSetRecord value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.OBJ_OFFR.MRKT_SET_LIST</code>.
	 */
	public TblMrktSetRecord getMrktSetList() {
		return (TblMrktSetRecord) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<ObjOffrDataRecord, TblPrcPointRecord, TblMrktSetRecord> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<ObjOffrDataRecord, TblPrcPointRecord, TblMrktSetRecord> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ObjOffrDataRecord> field1() {
		return ObjOffr.OFFR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<TblPrcPointRecord> field2() {
		return ObjOffr.PRC_POINT_LIST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<TblMrktSetRecord> field3() {
		return ObjOffr.MRKT_SET_LIST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjOffrDataRecord value1() {
		return getOffr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblPrcPointRecord value2() {
		return getPrcPointList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblMrktSetRecord value3() {
		return getMrktSetList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjOffrRecord value1(ObjOffrDataRecord value) {
		setOffr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjOffrRecord value2(TblPrcPointRecord value) {
		setPrcPointList(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjOffrRecord value3(TblMrktSetRecord value) {
		setMrktSetList(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjOffrRecord values(ObjOffrDataRecord value1, TblPrcPointRecord value2, TblMrktSetRecord value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ObjOffrRecord
	 */
	public ObjOffrRecord() {
		super(ObjOffr.OBJ_OFFR);
	}

	/**
	 * Create a detached, initialised ObjOffrRecord
	 */
	public ObjOffrRecord(ObjOffrDataRecord offr, TblPrcPointRecord prcPointList, TblMrktSetRecord mrktSetList) {
		super(ObjOffr.OBJ_OFFR);

		setValue(0, offr);
		setValue(1, prcPointList);
		setValue(2, mrktSetList);
	}
}
