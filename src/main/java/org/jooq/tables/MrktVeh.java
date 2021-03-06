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
import org.jooq.tables.records.MrktVehRecord;


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
public class MrktVeh extends TableImpl<MrktVehRecord> {

	private static final long serialVersionUID = 1688283334;

	/**
	 * The reference instance of <code>WETRN.MRKT_VEH</code>
	 */
	public static final MrktVeh MRKT_VEH = new MrktVeh();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktVehRecord> getRecordType() {
		return MrktVehRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_VEH.MRKT_ID</code>.
	 */
	public final TableField<MrktVehRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.VEH_ID</code>.
	 */
	public final TableField<MrktVehRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.LCL_VEH_DESC_TXT</code>.
	 */
	public final TableField<MrktVehRecord, String> LCL_VEH_DESC_TXT = createField("LCL_VEH_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.CUST_GRP_ID</code>.
	 */
	public final TableField<MrktVehRecord, BigDecimal> CUST_GRP_ID = createField("CUST_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.CREAT_USER_ID</code>.
	 */
	public final TableField<MrktVehRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.VEH_TYP_ID</code>.
	 */
	public final TableField<MrktVehRecord, BigDecimal> VEH_TYP_ID = createField("VEH_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.CREAT_TS</code>.
	 */
	public final TableField<MrktVehRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MrktVehRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.LAST_UPDT_TS</code>.
	 */
	public final TableField<MrktVehRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.DFALT_COMSN_TYP</code>.
	 */
	public final TableField<MrktVehRecord, String> DFALT_COMSN_TYP = createField("DFALT_COMSN_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.SEQ_NR</code>.
	 */
	public final TableField<MrktVehRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.CNTNGNCY_IND</code>.
	 */
	public final TableField<MrktVehRecord, String> CNTNGNCY_IND = createField("CNTNGNCY_IND", org.jooq.impl.SQLDataType.CHAR.length(1).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.FRNCHS_IND</code>.
	 */
	public final TableField<MrktVehRecord, String> FRNCHS_IND = createField("FRNCHS_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.LCL_VEH_SDESC_TXT</code>.
	 */
	public final TableField<MrktVehRecord, String> LCL_VEH_SDESC_TXT = createField("LCL_VEH_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.WSL_IND</code>.
	 */
	public final TableField<MrktVehRecord, String> WSL_IND = createField("WSL_IND", org.jooq.impl.SQLDataType.CHAR.length(1).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.CHOICE_VEH_TYP_ID</code>.
	 */
	public final TableField<MrktVehRecord, String> CHOICE_VEH_TYP_ID = createField("CHOICE_VEH_TYP_ID", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.MRKT_VEH.CHOICE_PARNT_VEH_ID</code>.
	 */
	public final TableField<MrktVehRecord, BigDecimal> CHOICE_PARNT_VEH_ID = createField("CHOICE_PARNT_VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * Create a <code>WETRN.MRKT_VEH</code> table reference
	 */
	public MrktVeh() {
		this("MRKT_VEH", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_VEH</code> table reference
	 */
	public MrktVeh(String alias) {
		this(alias, MRKT_VEH);
	}

	private MrktVeh(String alias, Table<MrktVehRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktVeh(String alias, Table<MrktVehRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktVehRecord> getPrimaryKey() {
		return Keys.PK_MRKT_VEH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktVehRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktVehRecord>>asList(Keys.PK_MRKT_VEH);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktVehRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktVehRecord, ?>>asList(Keys.FK_CHOICEMRKTVEH_MRKTVEH, Keys.FK_MRKT_MRKTVEH, Keys.FK_CUSTGRP_MRKTVEH, Keys.FK_VEHTYP_MRKTVEH, Keys.FK_CHOICEVEHTYP_MRKTVEH);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktVeh as(String alias) {
		return new MrktVeh(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktVeh rename(String name) {
		return new MrktVeh(name, null);
	}
}
