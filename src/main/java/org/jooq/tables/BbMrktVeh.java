/**
 * This class is generated by jOOQ
 */
package org.jooq.tables;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.Wetrn;
import org.jooq.impl.TableImpl;
import org.jooq.tables.records.BbMrktVehRecord;


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
public class BbMrktVeh extends TableImpl<BbMrktVehRecord> {

	private static final long serialVersionUID = -1774283230;

	/**
	 * The reference instance of <code>WETRN.BB_MRKT_VEH</code>
	 */
	public static final BbMrktVeh BB_MRKT_VEH = new BbMrktVeh();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BbMrktVehRecord> getRecordType() {
		return BbMrktVehRecord.class;
	}

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.MRKT_ID</code>.
	 */
	public final TableField<BbMrktVehRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.VEH_ID</code>.
	 */
	public final TableField<BbMrktVehRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.LCL_VEH_DESC_TXT</code>.
	 */
	public final TableField<BbMrktVehRecord, String> LCL_VEH_DESC_TXT = createField("LCL_VEH_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.CUST_GRP_ID</code>.
	 */
	public final TableField<BbMrktVehRecord, BigDecimal> CUST_GRP_ID = createField("CUST_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.CREAT_USER_ID</code>.
	 */
	public final TableField<BbMrktVehRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false), this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.VEH_TYP_ID</code>.
	 */
	public final TableField<BbMrktVehRecord, BigDecimal> VEH_TYP_ID = createField("VEH_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.CREAT_TS</code>.
	 */
	public final TableField<BbMrktVehRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<BbMrktVehRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.LAST_UPDT_TS</code>.
	 */
	public final TableField<BbMrktVehRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.DFALT_COMSN_TYP</code>.
	 */
	public final TableField<BbMrktVehRecord, String> DFALT_COMSN_TYP = createField("DFALT_COMSN_TYP", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.SEQ_NR</code>.
	 */
	public final TableField<BbMrktVehRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.CNTNGNCY_IND</code>.
	 */
	public final TableField<BbMrktVehRecord, String> CNTNGNCY_IND = createField("CNTNGNCY_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.FRNCHS_IND</code>.
	 */
	public final TableField<BbMrktVehRecord, String> FRNCHS_IND = createField("FRNCHS_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.LCL_VEH_SDESC_TXT</code>.
	 */
	public final TableField<BbMrktVehRecord, String> LCL_VEH_SDESC_TXT = createField("LCL_VEH_SDESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.WSL_IND</code>.
	 */
	public final TableField<BbMrktVehRecord, String> WSL_IND = createField("WSL_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.CHOICE_VEH_TYP_ID</code>.
	 */
	public final TableField<BbMrktVehRecord, String> CHOICE_VEH_TYP_ID = createField("CHOICE_VEH_TYP_ID", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.BB_MRKT_VEH.CHOICE_PARNT_VEH_ID</code>.
	 */
	public final TableField<BbMrktVehRecord, BigDecimal> CHOICE_PARNT_VEH_ID = createField("CHOICE_PARNT_VEH_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * Create a <code>WETRN.BB_MRKT_VEH</code> table reference
	 */
	public BbMrktVeh() {
		this("BB_MRKT_VEH", null);
	}

	/**
	 * Create an aliased <code>WETRN.BB_MRKT_VEH</code> table reference
	 */
	public BbMrktVeh(String alias) {
		this(alias, BB_MRKT_VEH);
	}

	private BbMrktVeh(String alias, Table<BbMrktVehRecord> aliased) {
		this(alias, aliased, null);
	}

	private BbMrktVeh(String alias, Table<BbMrktVehRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BbMrktVeh as(String alias) {
		return new BbMrktVeh(alias, this);
	}

	/**
	 * Rename this table
	 */
	public BbMrktVeh rename(String name) {
		return new BbMrktVeh(name, null);
	}
}
