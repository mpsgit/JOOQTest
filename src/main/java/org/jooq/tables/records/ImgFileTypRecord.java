/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.ImgFileTyp;


/**
 * The format of the Image File itself.  As seen in the Filename suffix. Normally 
 * .jpeg or .gif.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ImgFileTypRecord extends UpdatableRecordImpl<ImgFileTypRecord> implements Record6<BigDecimal, String, String, Date, String, Date> {

	private static final long serialVersionUID = 2058708445;

	/**
	 * Setter for <code>WETRN.IMG_FILE_TYP.IMG_FILE_TYP_ID</code>. A unique identifier for the format of the Image File itself.  As seen in the Filename suffix. Normally .jpeg or .gif.
	 */
	public void setImgFileTypId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.IMG_FILE_TYP.IMG_FILE_TYP_ID</code>. A unique identifier for the format of the Image File itself.  As seen in the Filename suffix. Normally .jpeg or .gif.
	 */
	public BigDecimal getImgFileTypId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.IMG_FILE_TYP.IMG_FILE_TYP_DESC_TXT</code>. A description of the format of the Image File itself.  As seen in the Filename suffix. Normally .jpeg or .gif.
	 */
	public void setImgFileTypDescTxt(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.IMG_FILE_TYP.IMG_FILE_TYP_DESC_TXT</code>. A description of the format of the Image File itself.  As seen in the Filename suffix. Normally .jpeg or .gif.
	 */
	public String getImgFileTypDescTxt() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.IMG_FILE_TYP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public void setCreatUserId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.IMG_FILE_TYP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public String getCreatUserId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.IMG_FILE_TYP.CREAT_TS</code>. The date and time the row was created.
	 */
	public void setCreatTs(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.IMG_FILE_TYP.CREAT_TS</code>. The date and time the row was created.
	 */
	public Date getCreatTs() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.IMG_FILE_TYP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.IMG_FILE_TYP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.IMG_FILE_TYP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.IMG_FILE_TYP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<BigDecimal> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<BigDecimal, String, String, Date, String, Date> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<BigDecimal, String, String, Date, String, Date> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return ImgFileTyp.IMG_FILE_TYP.IMG_FILE_TYP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return ImgFileTyp.IMG_FILE_TYP.IMG_FILE_TYP_DESC_TXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return ImgFileTyp.IMG_FILE_TYP.CREAT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return ImgFileTyp.IMG_FILE_TYP.CREAT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return ImgFileTyp.IMG_FILE_TYP.LAST_UPDT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field6() {
		return ImgFileTyp.IMG_FILE_TYP.LAST_UPDT_TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getImgFileTypId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getImgFileTypDescTxt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getCreatUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value4() {
		return getCreatTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getLastUpdtUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value6() {
		return getLastUpdtTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgFileTypRecord value1(BigDecimal value) {
		setImgFileTypId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgFileTypRecord value2(String value) {
		setImgFileTypDescTxt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgFileTypRecord value3(String value) {
		setCreatUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgFileTypRecord value4(Date value) {
		setCreatTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgFileTypRecord value5(String value) {
		setLastUpdtUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgFileTypRecord value6(Date value) {
		setLastUpdtTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgFileTypRecord values(BigDecimal value1, String value2, String value3, Date value4, String value5, Date value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ImgFileTypRecord
	 */
	public ImgFileTypRecord() {
		super(ImgFileTyp.IMG_FILE_TYP);
	}

	/**
	 * Create a detached, initialised ImgFileTypRecord
	 */
	public ImgFileTypRecord(BigDecimal imgFileTypId, String imgFileTypDescTxt, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs) {
		super(ImgFileTyp.IMG_FILE_TYP);

		setValue(0, imgFileTypId);
		setValue(1, imgFileTypDescTxt);
		setValue(2, creatUserId);
		setValue(3, creatTs);
		setValue(4, lastUpdtUserId);
		setValue(5, lastUpdtTs);
	}
}