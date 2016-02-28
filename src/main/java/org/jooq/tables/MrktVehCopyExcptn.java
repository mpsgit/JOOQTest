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
import org.jooq.tables.records.MrktVehCopyExcptnRecord;


/**
 * This table provides an exception in the case of copying offers from a market 
 * vehicle to a specific market vehicle (Sales Centre) within a market and 
 * campaign, as follows: When copying an offer within a market and campaign 
 * from one market vehicle to another, follow the normal rule of copying the 
 * commission type except when copying into the Sales Centre market vehicle 
 * when the default commission type should be used. This table holds the copy 
 * exception default commission type.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MrktVehCopyExcptn extends TableImpl<MrktVehCopyExcptnRecord> {

	private static final long serialVersionUID = 267640453;

	/**
	 * The reference instance of <code>WETRN.MRKT_VEH_COPY_EXCPTN</code>
	 */
	public static final MrktVehCopyExcptn MRKT_VEH_COPY_EXCPTN = new MrktVehCopyExcptn();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktVehCopyExcptnRecord> getRecordType() {
		return MrktVehCopyExcptnRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_VEH_COPY_EXCPTN.MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public final TableField<MrktVehCopyExcptnRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.");

	/**
	 * The column <code>WETRN.MRKT_VEH_COPY_EXCPTN.VEH_ID</code>. A unique surrogate identifier for a VEHICLE, such as a piece of Literature.
	 */
	public final TableField<MrktVehCopyExcptnRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "A unique surrogate identifier for a VEHICLE, such as a piece of Literature.");

	/**
	 * The column <code>WETRN.MRKT_VEH_COPY_EXCPTN.EFF_PERD_ID</code>. A unique surrogate identifier for a Campaign, Quater or Annual Period.
	 */
	public final TableField<MrktVehCopyExcptnRecord, BigDecimal> EFF_PERD_ID = createField("EFF_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "A unique surrogate identifier for a Campaign, Quater or Annual Period.");

	/**
	 * The column <code>WETRN.MRKT_VEH_COPY_EXCPTN.DFALT_COMSN_TYP_IND</code>. The copy exception default Commission Type for this Market Vehicle in the Period.
	 */
	public final TableField<MrktVehCopyExcptnRecord, String> DFALT_COMSN_TYP_IND = createField("DFALT_COMSN_TYP_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "The copy exception default Commission Type for this Market Vehicle in the Period.");

	/**
	 * The column <code>WETRN.MRKT_VEH_COPY_EXCPTN.IN_CMPGN_IND</code>.
	 */
	public final TableField<MrktVehCopyExcptnRecord, String> IN_CMPGN_IND = createField("IN_CMPGN_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_COPY_EXCPTN.IN_MRKT_IND</code>.
	 */
	public final TableField<MrktVehCopyExcptnRecord, String> IN_MRKT_IND = createField("IN_MRKT_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_COPY_EXCPTN.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<MrktVehCopyExcptnRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.MRKT_VEH_COPY_EXCPTN.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<MrktVehCopyExcptnRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.MRKT_VEH_COPY_EXCPTN.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<MrktVehCopyExcptnRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.MRKT_VEH_COPY_EXCPTN.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<MrktVehCopyExcptnRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "The date and time the row was last updated.");

	/**
	 * The column <code>WETRN.MRKT_VEH_COPY_EXCPTN.SEQ_NR</code>.
	 */
	public final TableField<MrktVehCopyExcptnRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH_COPY_EXCPTN.IN_VEH_IND</code>.
	 */
	public final TableField<MrktVehCopyExcptnRecord, String> IN_VEH_IND = createField("IN_VEH_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>WETRN.MRKT_VEH_COPY_EXCPTN</code> table reference
	 */
	public MrktVehCopyExcptn() {
		this("MRKT_VEH_COPY_EXCPTN", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_VEH_COPY_EXCPTN</code> table reference
	 */
	public MrktVehCopyExcptn(String alias) {
		this(alias, MRKT_VEH_COPY_EXCPTN);
	}

	private MrktVehCopyExcptn(String alias, Table<MrktVehCopyExcptnRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktVehCopyExcptn(String alias, Table<MrktVehCopyExcptnRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "This table provides an exception in the case of copying offers from a market vehicle to a specific market vehicle (Sales Centre) within a market and campaign, as follows: When copying an offer within a market and campaign from one market vehicle to another, follow the normal rule of copying the commission type except when copying into the Sales Centre market vehicle when the default commission type should be used. This table holds the copy exception default commission type.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktVehCopyExcptnRecord> getPrimaryKey() {
		return Keys.PK_MRKT_VEH_COPY_EXCPTN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktVehCopyExcptnRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktVehCopyExcptnRecord>>asList(Keys.PK_MRKT_VEH_COPY_EXCPTN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktVehCopyExcptnRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktVehCopyExcptnRecord, ?>>asList(Keys.FK_MRKTPERD_MRKTVEHCOPYEXCPTN, Keys.FK_MRKTVEH_MRKTVEHCOPYEXCPTN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVehCopyExcptn as(String alias) {
		return new MrktVehCopyExcptn(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktVehCopyExcptn rename(String name) {
		return new MrktVehCopyExcptn(name, null);
	}
}
