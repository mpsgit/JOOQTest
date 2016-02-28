/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.MapsSmphr;


/**
 * MAPS semaphore.  Locking table for any procedure or function to use.  Procedures 
 * can use this to prevent instances of themselves running at the same time 
 * in another session by selecting where maps_smphr_cd = <procedure name> 
 * for update.  The code between the select and commit/rollback will then 
 * be the only instance of this code running in any session.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MapsSmphrRecord extends UpdatableRecordImpl<MapsSmphrRecord> implements Record5<String, String, Date, String, Date> {

	private static final long serialVersionUID = -1383957045;

	/**
	 * Setter for <code>WETRN.MAPS_SMPHR.MAPS_SMPHR_CD</code>. MAPS SEMAPHORE CODE.  The code or name of the procedure or function that requires the self lock.  E.g. <package>.<function>.
	 */
	public void setMapsSmphrCd(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MAPS_SMPHR.MAPS_SMPHR_CD</code>. MAPS SEMAPHORE CODE.  The code or name of the procedure or function that requires the self lock.  E.g. <package>.<function>.
	 */
	public String getMapsSmphrCd() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MAPS_SMPHR.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MAPS_SMPHR.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MAPS_SMPHR.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MAPS_SMPHR.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MAPS_SMPHR.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MAPS_SMPHR.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MAPS_SMPHR.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MAPS_SMPHR.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, String, Date, String, Date> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, String, Date, String, Date> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return MapsSmphr.MAPS_SMPHR.MAPS_SMPHR_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return MapsSmphr.MAPS_SMPHR.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field3() {
		return MapsSmphr.MAPS_SMPHR.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return MapsSmphr.MAPS_SMPHR.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return MapsSmphr.MAPS_SMPHR.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getMapsSmphrCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value3() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value5() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MapsSmphrRecord value1(String value) {
		setMapsSmphrCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MapsSmphrRecord value2(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MapsSmphrRecord value3(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MapsSmphrRecord value4(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MapsSmphrRecord value5(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MapsSmphrRecord values(String value1, String value2, Date value3, String value4, Date value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MapsSmphrRecord
	 */
	public MapsSmphrRecord() {
		super(MapsSmphr.MAPS_SMPHR);
	}

	/**
	 * Create a detached, initialised MapsSmphrRecord
	 */
	public MapsSmphrRecord(String mapsSmphrCd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(MapsSmphr.MAPS_SMPHR);

		setValue(0, mapsSmphrCd);
		setValue(1, creatUserId);
		setValue(2, creatTs);
		setValue(3, lastUpdtUserId);
		setValue(4, lastUpdtTs);
	}
}