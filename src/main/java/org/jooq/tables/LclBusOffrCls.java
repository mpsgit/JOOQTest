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
import org.jooq.tables.records.LclBusOffrClsRecord;


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
public class LclBusOffrCls extends TableImpl<LclBusOffrClsRecord> {

	private static final long serialVersionUID = 1572318089;

	/**
	 * The reference instance of <code>WETRN.LCL_BUS_OFFR_CLS</code>
	 */
	public static final LclBusOffrCls LCL_BUS_OFFR_CLS = new LclBusOffrCls();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<LclBusOffrClsRecord> getRecordType() {
		return LclBusOffrClsRecord.class;
	}

	/**
	 * The column <code>WETRN.LCL_BUS_OFFR_CLS.LCL_BUS_ID</code>.
	 */
	public final TableField<LclBusOffrClsRecord, BigDecimal> LCL_BUS_ID = createField("LCL_BUS_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.LCL_BUS_OFFR_CLS.MRKT_ID</code>.
	 */
	public final TableField<LclBusOffrClsRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.LCL_BUS_OFFR_CLS.VEH_ID</code>.
	 */
	public final TableField<LclBusOffrClsRecord, BigDecimal> VEH_ID = createField("VEH_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.LCL_BUS_OFFR_CLS.OFFR_CLS_ID</code>.
	 */
	public final TableField<LclBusOffrClsRecord, BigDecimal> OFFR_CLS_ID = createField("OFFR_CLS_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.LCL_BUS_OFFR_CLS.SEQ_NR</code>.
	 */
	public final TableField<LclBusOffrClsRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.LCL_BUS_OFFR_CLS.CREAT_USER_ID</code>.
	 */
	public final TableField<LclBusOffrClsRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.LCL_BUS_OFFR_CLS.CREAT_TS</code>.
	 */
	public final TableField<LclBusOffrClsRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.LCL_BUS_OFFR_CLS.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<LclBusOffrClsRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.LCL_BUS_OFFR_CLS.LAST_UPDT_TS</code>.
	 */
	public final TableField<LclBusOffrClsRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.LCL_BUS_OFFR_CLS.DFALT_OFFR_CLS_IND</code>.
	 */
	public final TableField<LclBusOffrClsRecord, String> DFALT_OFFR_CLS_IND = createField("DFALT_OFFR_CLS_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * Create a <code>WETRN.LCL_BUS_OFFR_CLS</code> table reference
	 */
	public LclBusOffrCls() {
		this("LCL_BUS_OFFR_CLS", null);
	}

	/**
	 * Create an aliased <code>WETRN.LCL_BUS_OFFR_CLS</code> table reference
	 */
	public LclBusOffrCls(String alias) {
		this(alias, LCL_BUS_OFFR_CLS);
	}

	private LclBusOffrCls(String alias, Table<LclBusOffrClsRecord> aliased) {
		this(alias, aliased, null);
	}

	private LclBusOffrCls(String alias, Table<LclBusOffrClsRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<LclBusOffrClsRecord> getPrimaryKey() {
		return Keys.PK_LCL_BUS_OFFR_CLS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<LclBusOffrClsRecord>> getKeys() {
		return Arrays.<UniqueKey<LclBusOffrClsRecord>>asList(Keys.PK_LCL_BUS_OFFR_CLS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<LclBusOffrClsRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<LclBusOffrClsRecord, ?>>asList(Keys.FK_MRKTLCLBUS_LCLBUSOFFRCLS, Keys.FK_MRKTVEHOFFRCLS_LCLBUSOFFRCL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LclBusOffrCls as(String alias) {
		return new LclBusOffrCls(alias, this);
	}

	/**
	 * Rename this table
	 */
	public LclBusOffrCls rename(String name) {
		return new LclBusOffrCls(name, null);
	}
}
