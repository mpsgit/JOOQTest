/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.MapsDbUpgrade;


/**
 * Audit trail of upgrade/backout scripts applied to a MAPS Database
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MapsDbUpgradeRecord extends TableRecordImpl<MapsDbUpgradeRecord> implements Record5<Date, String, String, String, String> {

	private static final long serialVersionUID = -1707183276;

	/**
	 * Setter for <code>WETRN.MAPS_DB_UPGRADE.UPGRADE_TS</code>.
	 */
	public void setUpgradeTs(Date value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.MAPS_DB_UPGRADE.UPGRADE_TS</code>.
	 */
	public Date getUpgradeTs() {
		return (Date) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.MAPS_DB_UPGRADE.UPGRADE_NR</code>.
	 */
	public void setUpgradeNr(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.MAPS_DB_UPGRADE.UPGRADE_NR</code>.
	 */
	public String getUpgradeNr() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.MAPS_DB_UPGRADE.UPGRADE_USER_ID</code>.
	 */
	public void setUpgradeUserId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.MAPS_DB_UPGRADE.UPGRADE_USER_ID</code>.
	 */
	public String getUpgradeUserId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.MAPS_DB_UPGRADE.UPGRADE_TYP</code>.
	 */
	public void setUpgradeTyp(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.MAPS_DB_UPGRADE.UPGRADE_TYP</code>.
	 */
	public String getUpgradeTyp() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.MAPS_DB_UPGRADE.UPGRADE_DESC_TXT</code>.
	 */
	public void setUpgradeDescTxt(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.MAPS_DB_UPGRADE.UPGRADE_DESC_TXT</code>.
	 */
	public String getUpgradeDescTxt() {
		return (String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Date, String, String, String, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Date, String, String, String, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field1() {
		return MapsDbUpgrade.MAPS_DB_UPGRADE.UPGRADE_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return MapsDbUpgrade.MAPS_DB_UPGRADE.UPGRADE_NR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return MapsDbUpgrade.MAPS_DB_UPGRADE.UPGRADE_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return MapsDbUpgrade.MAPS_DB_UPGRADE.UPGRADE_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return MapsDbUpgrade.MAPS_DB_UPGRADE.UPGRADE_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value1() {
		return getUpgradeTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getUpgradeNr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getUpgradeUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getUpgradeTyp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getUpgradeDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MapsDbUpgradeRecord value1(Date value) {
		setUpgradeTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MapsDbUpgradeRecord value2(String value) {
		setUpgradeNr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MapsDbUpgradeRecord value3(String value) {
		setUpgradeUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MapsDbUpgradeRecord value4(String value) {
		setUpgradeTyp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MapsDbUpgradeRecord value5(String value) {
		setUpgradeDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MapsDbUpgradeRecord values(Date value1, String value2, String value3, String value4, String value5) {
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
	 * Create a detached MapsDbUpgradeRecord
	 */
	public MapsDbUpgradeRecord() {
		super(MapsDbUpgrade.MAPS_DB_UPGRADE);
	}

	/**
	 * Create a detached, initialised MapsDbUpgradeRecord
	 */
	public MapsDbUpgradeRecord(Date upgradeTs, String upgradeNr, String upgradeUserId, String upgradeTyp, String upgradeDescTxt) {
		super(MapsDbUpgrade.MAPS_DB_UPGRADE);

		setValue(0, upgradeTs);
		setValue(1, upgradeNr);
		setValue(2, upgradeUserId);
		setValue(3, upgradeTyp);
		setValue(4, upgradeDescTxt);
	}
}
