/**
 * This class is generated by jOOQ
 */
package org.jooq.tables;


import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Keys;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.Wetrn;
import org.jooq.impl.TableImpl;
import org.jooq.tables.records.ImgImprtDataMapgRecord;


/**
 * Used by the MAPS application to transform a part of the Image Filename 
 * to a MAPS Standard Data value.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ImgImprtDataMapg extends TableImpl<ImgImprtDataMapgRecord> {

	private static final long serialVersionUID = -547199974;

	/**
	 * The reference instance of <code>WETRN.IMG_IMPRT_DATA_MAPG</code>
	 */
	public static final ImgImprtDataMapg IMG_IMPRT_DATA_MAPG = new ImgImprtDataMapg();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ImgImprtDataMapgRecord> getRecordType() {
		return ImgImprtDataMapgRecord.class;
	}

	/**
	 * The column <code>WETRN.IMG_IMPRT_DATA_MAPG.MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public final TableField<ImgImprtDataMapgRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.");

	/**
	 * The column <code>WETRN.IMG_IMPRT_DATA_MAPG.IMG_DATA_TYP_ID</code>. ID that identifies the type of Data to be used
	 */
	public final TableField<ImgImprtDataMapgRecord, BigDecimal> IMG_DATA_TYP_ID = createField("IMG_DATA_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "ID that identifies the type of Data to be used");

	/**
	 * The column <code>WETRN.IMG_IMPRT_DATA_MAPG.FROM_VAL_TXT</code>. The value that the Data will be changed from.
	 */
	public final TableField<ImgImprtDataMapgRecord, String> FROM_VAL_TXT = createField("FROM_VAL_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "The value that the Data will be changed from.");

	/**
	 * The column <code>WETRN.IMG_IMPRT_DATA_MAPG.TO_VAL_TXT</code>. The value that the Data will be changed to.
	 */
	public final TableField<ImgImprtDataMapgRecord, String> TO_VAL_TXT = createField("TO_VAL_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "The value that the Data will be changed to.");

	/**
	 * The column <code>WETRN.IMG_IMPRT_DATA_MAPG.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<ImgImprtDataMapgRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.IMG_IMPRT_DATA_MAPG.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<ImgImprtDataMapgRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.IMG_IMPRT_DATA_MAPG.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<ImgImprtDataMapgRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.IMG_IMPRT_DATA_MAPG.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<ImgImprtDataMapgRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.IMG_IMPRT_DATA_MAPG</code> table reference
	 */
	public ImgImprtDataMapg() {
		this("IMG_IMPRT_DATA_MAPG", null);
	}

	/**
	 * Create an aliased <code>WETRN.IMG_IMPRT_DATA_MAPG</code> table reference
	 */
	public ImgImprtDataMapg(String alias) {
		this(alias, IMG_IMPRT_DATA_MAPG);
	}

	private ImgImprtDataMapg(String alias, Table<ImgImprtDataMapgRecord> aliased) {
		this(alias, aliased, null);
	}

	private ImgImprtDataMapg(String alias, Table<ImgImprtDataMapgRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Used by the MAPS application to transform a part of the Image Filename to a MAPS Standard Data value.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ImgImprtDataMapgRecord> getPrimaryKey() {
		return Keys.PK_IMG_IMPRT_DATA_MAPG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ImgImprtDataMapgRecord>> getKeys() {
		return Arrays.<UniqueKey<ImgImprtDataMapgRecord>>asList(Keys.PK_IMG_IMPRT_DATA_MAPG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<ImgImprtDataMapgRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<ImgImprtDataMapgRecord, ?>>asList(Keys.FK_IMGDATATYP_IMGIMPRTDATAMAPG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImgImprtDataMapg as(String alias) {
		return new ImgImprtDataMapg(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ImgImprtDataMapg rename(String name) {
		return new ImgImprtDataMapg(name, null);
	}
}
