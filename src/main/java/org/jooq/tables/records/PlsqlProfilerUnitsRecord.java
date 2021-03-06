/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.PlsqlProfilerUnits;


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
public class PlsqlProfilerUnitsRecord extends TableRecordImpl<PlsqlProfilerUnitsRecord> implements Record9<BigDecimal, BigDecimal, String, String, String, Date, BigDecimal, BigDecimal, BigDecimal> {

	private static final long serialVersionUID = 976271715;

	/**
	 * Setter for <code>WETRN.PLSQL_PROFILER_UNITS.RUNID</code>.
	 */
	public void setRunid(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.PLSQL_PROFILER_UNITS.RUNID</code>.
	 */
	public BigDecimal getRunid() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_NUMBER</code>.
	 */
	public void setUnitNumber(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_NUMBER</code>.
	 */
	public BigDecimal getUnitNumber() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_TYPE</code>.
	 */
	public void setUnitType(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_TYPE</code>.
	 */
	public String getUnitType() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_OWNER</code>.
	 */
	public void setUnitOwner(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_OWNER</code>.
	 */
	public String getUnitOwner() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_NAME</code>.
	 */
	public void setUnitName(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_NAME</code>.
	 */
	public String getUnitName() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_TIMESTAMP</code>.
	 */
	public void setUnitTimestamp(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.PLSQL_PROFILER_UNITS.UNIT_TIMESTAMP</code>.
	 */
	public Date getUnitTimestamp() {
		return (Date) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.PLSQL_PROFILER_UNITS.TOTAL_TIME</code>.
	 */
	public void setTotalTime(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.PLSQL_PROFILER_UNITS.TOTAL_TIME</code>.
	 */
	public BigDecimal getTotalTime() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.PLSQL_PROFILER_UNITS.SPARE1</code>.
	 */
	public void setSpare1(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.PLSQL_PROFILER_UNITS.SPARE1</code>.
	 */
	public BigDecimal getSpare1() {
		return (BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.PLSQL_PROFILER_UNITS.SPARE2</code>.
	 */
	public void setSpare2(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.PLSQL_PROFILER_UNITS.SPARE2</code>.
	 */
	public BigDecimal getSpare2() {
		return (BigDecimal) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, BigDecimal, String, String, String, Date, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<BigDecimal, BigDecimal, String, String, String, Date, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return PlsqlProfilerUnits.PLSQL_PROFILER_UNITS.RUNID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return PlsqlProfilerUnits.PLSQL_PROFILER_UNITS.UNIT_NUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return PlsqlProfilerUnits.PLSQL_PROFILER_UNITS.UNIT_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return PlsqlProfilerUnits.PLSQL_PROFILER_UNITS.UNIT_OWNER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return PlsqlProfilerUnits.PLSQL_PROFILER_UNITS.UNIT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return PlsqlProfilerUnits.PLSQL_PROFILER_UNITS.UNIT_TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field7() {
		return PlsqlProfilerUnits.PLSQL_PROFILER_UNITS.TOTAL_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field8() {
		return PlsqlProfilerUnits.PLSQL_PROFILER_UNITS.SPARE1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return PlsqlProfilerUnits.PLSQL_PROFILER_UNITS.SPARE2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getRunid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getUnitNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getUnitType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getUnitOwner();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getUnitName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value6() {
		return getUnitTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value7() {
		return getTotalTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value8() {
		return getSpare1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value9() {
		return getSpare2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlsqlProfilerUnitsRecord value1(BigDecimal value) {
		setRunid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlsqlProfilerUnitsRecord value2(BigDecimal value) {
		setUnitNumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlsqlProfilerUnitsRecord value3(String value) {
		setUnitType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlsqlProfilerUnitsRecord value4(String value) {
		setUnitOwner(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlsqlProfilerUnitsRecord value5(String value) {
		setUnitName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlsqlProfilerUnitsRecord value6(Date value) {
		setUnitTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlsqlProfilerUnitsRecord value7(BigDecimal value) {
		setTotalTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlsqlProfilerUnitsRecord value8(BigDecimal value) {
		setSpare1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlsqlProfilerUnitsRecord value9(BigDecimal value) {
		setSpare2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlsqlProfilerUnitsRecord values(BigDecimal value1, BigDecimal value2, String value3, String value4, String value5, Date value6, BigDecimal value7, BigDecimal value8, BigDecimal value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PlsqlProfilerUnitsRecord
	 */
	public PlsqlProfilerUnitsRecord() {
		super(PlsqlProfilerUnits.PLSQL_PROFILER_UNITS);
	}

	/**
	 * Create a detached, initialised PlsqlProfilerUnitsRecord
	 */
	public PlsqlProfilerUnitsRecord(BigDecimal runid, BigDecimal unitNumber, String unitType, String unitOwner, String unitName, Date unitTimestamp, BigDecimal totalTime, BigDecimal spare1, BigDecimal spare2) {
		super(PlsqlProfilerUnits.PLSQL_PROFILER_UNITS);

		setValue(0, runid);
		setValue(1, unitNumber);
		setValue(2, unitType);
		setValue(3, unitOwner);
		setValue(4, unitName);
		setValue(5, unitTimestamp);
		setValue(6, totalTime);
		setValue(7, spare1);
		setValue(8, spare2);
	}
}
