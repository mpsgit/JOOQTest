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
import org.jooq.Wetrn;
import org.jooq.impl.TableImpl;
import org.jooq.tables.records.MrktSlsAloctnGtaOvrrdRecord;


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
public class MrktSlsAloctnGtaOvrrd extends TableImpl<MrktSlsAloctnGtaOvrrdRecord> {

	private static final long serialVersionUID = 1287681828;

	/**
	 * The reference instance of <code>WETRN.MRKT_SLS_ALOCTN_GTA_OVRRD</code>
	 */
	public static final MrktSlsAloctnGtaOvrrd MRKT_SLS_ALOCTN_GTA_OVRRD = new MrktSlsAloctnGtaOvrrd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktSlsAloctnGtaOvrrdRecord> getRecordType() {
		return MrktSlsAloctnGtaOvrrdRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_SLS_ALOCTN_GTA_OVRRD.MRKT_ID</code>.
	 */
	public final TableField<MrktSlsAloctnGtaOvrrdRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS_ALOCTN_GTA_OVRRD.STRT_SLS_PERD_ID</code>.
	 */
	public final TableField<MrktSlsAloctnGtaOvrrdRecord, BigDecimal> STRT_SLS_PERD_ID = createField("STRT_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS_ALOCTN_GTA_OVRRD.END_SLS_PERD_ID</code>.
	 */
	public final TableField<MrktSlsAloctnGtaOvrrdRecord, BigDecimal> END_SLS_PERD_ID = createField("END_SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS_ALOCTN_GTA_OVRRD.SLS_TYP_ID</code>.
	 */
	public final TableField<MrktSlsAloctnGtaOvrrdRecord, BigDecimal> SLS_TYP_ID = createField("SLS_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS_ALOCTN_GTA_OVRRD.LCL_BILNG_ACTN_CD</code>.
	 */
	public final TableField<MrktSlsAloctnGtaOvrrdRecord, String> LCL_BILNG_ACTN_CD = createField("LCL_BILNG_ACTN_CD", org.jooq.impl.SQLDataType.VARCHAR.length(2), this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS_ALOCTN_GTA_OVRRD.CREAT_USER_ID</code>.
	 */
	public final TableField<MrktSlsAloctnGtaOvrrdRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS_ALOCTN_GTA_OVRRD.CREAT_TS</code>.
	 */
	public final TableField<MrktSlsAloctnGtaOvrrdRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS_ALOCTN_GTA_OVRRD.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MrktSlsAloctnGtaOvrrdRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS_ALOCTN_GTA_OVRRD.LAST_UPDT_TS</code>.
	 */
	public final TableField<MrktSlsAloctnGtaOvrrdRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_SLS_ALOCTN_GTA_OVRRD.SLS_CHNL_CD</code>.
	 */
	public final TableField<MrktSlsAloctnGtaOvrrdRecord, String> SLS_CHNL_CD = createField("SLS_CHNL_CD", org.jooq.impl.SQLDataType.VARCHAR.length(4), this, "");

	/**
	 * Create a <code>WETRN.MRKT_SLS_ALOCTN_GTA_OVRRD</code> table reference
	 */
	public MrktSlsAloctnGtaOvrrd() {
		this("MRKT_SLS_ALOCTN_GTA_OVRRD", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_SLS_ALOCTN_GTA_OVRRD</code> table reference
	 */
	public MrktSlsAloctnGtaOvrrd(String alias) {
		this(alias, MRKT_SLS_ALOCTN_GTA_OVRRD);
	}

	private MrktSlsAloctnGtaOvrrd(String alias, Table<MrktSlsAloctnGtaOvrrdRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktSlsAloctnGtaOvrrd(String alias, Table<MrktSlsAloctnGtaOvrrdRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktSlsAloctnGtaOvrrdRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktSlsAloctnGtaOvrrdRecord, ?>>asList(Keys.FK_MP_MRKTSLSALCOTNGTAOVRRD_E, Keys.FK_MP_MRKTSLSALCOTNGTAOVRRD_S);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktSlsAloctnGtaOvrrd as(String alias) {
		return new MrktSlsAloctnGtaOvrrd(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktSlsAloctnGtaOvrrd rename(String name) {
		return new MrktSlsAloctnGtaOvrrd(name, null);
	}
}
