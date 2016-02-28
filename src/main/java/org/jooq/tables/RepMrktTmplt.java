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
import org.jooq.tables.records.RepMrktTmpltRecord;


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
public class RepMrktTmplt extends TableImpl<RepMrktTmpltRecord> {

	private static final long serialVersionUID = 800745009;

	/**
	 * The reference instance of <code>WETRN.REP_MRKT_TMPLT</code>
	 */
	public static final RepMrktTmplt REP_MRKT_TMPLT = new RepMrktTmplt();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RepMrktTmpltRecord> getRecordType() {
		return RepMrktTmpltRecord.class;
	}

	/**
	 * The column <code>WETRN.REP_MRKT_TMPLT.MRKT_ID</code>.
	 */
	public final TableField<RepMrktTmpltRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.REP_MRKT_TMPLT.TMPLT_ID</code>.
	 */
	public final TableField<RepMrktTmpltRecord, BigDecimal> TMPLT_ID = createField("TMPLT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.REP_MRKT_TMPLT.TMPLT_NM</code>.
	 */
	public final TableField<RepMrktTmpltRecord, String> TMPLT_NM = createField("TMPLT_NM", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>WETRN.REP_MRKT_TMPLT.TMPLT_TYP_ID</code>.
	 */
	public final TableField<RepMrktTmpltRecord, BigDecimal> TMPLT_TYP_ID = createField("TMPLT_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.REP_MRKT_TMPLT.PY_REP_IND</code>.
	 */
	public final TableField<RepMrktTmpltRecord, String> PY_REP_IND = createField("PY_REP_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.REP_MRKT_TMPLT.SPLT_BY_SHEET</code>.
	 */
	public final TableField<RepMrktTmpltRecord, String> SPLT_BY_SHEET = createField("SPLT_BY_SHEET", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.REP_MRKT_TMPLT.REP_BY_SLS_TYP</code>.
	 */
	public final TableField<RepMrktTmpltRecord, String> REP_BY_SLS_TYP = createField("REP_BY_SLS_TYP", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.REP_MRKT_TMPLT.REP_BY_VER</code>.
	 */
	public final TableField<RepMrktTmpltRecord, String> REP_BY_VER = createField("REP_BY_VER", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.REP_MRKT_TMPLT.CREAT_USER_ID</code>.
	 */
	public final TableField<RepMrktTmpltRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.REP_MRKT_TMPLT.CREAT_TS</code>.
	 */
	public final TableField<RepMrktTmpltRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.REP_MRKT_TMPLT.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<RepMrktTmpltRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.REP_MRKT_TMPLT.LAST_UPDT_TS</code>.
	 */
	public final TableField<RepMrktTmpltRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.REP_MRKT_TMPLT</code> table reference
	 */
	public RepMrktTmplt() {
		this("REP_MRKT_TMPLT", null);
	}

	/**
	 * Create an aliased <code>WETRN.REP_MRKT_TMPLT</code> table reference
	 */
	public RepMrktTmplt(String alias) {
		this(alias, REP_MRKT_TMPLT);
	}

	private RepMrktTmplt(String alias, Table<RepMrktTmpltRecord> aliased) {
		this(alias, aliased, null);
	}

	private RepMrktTmplt(String alias, Table<RepMrktTmpltRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RepMrktTmpltRecord> getPrimaryKey() {
		return Keys.PK_REP_MRKT_TMPLT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RepMrktTmpltRecord>> getKeys() {
		return Arrays.<UniqueKey<RepMrktTmpltRecord>>asList(Keys.PK_REP_MRKT_TMPLT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<RepMrktTmpltRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<RepMrktTmpltRecord, ?>>asList(Keys.FK_MRKT_REPMRKTTMPLT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepMrktTmplt as(String alias) {
		return new RepMrktTmplt(alias, this);
	}

	/**
	 * Rename this table
	 */
	public RepMrktTmplt rename(String name) {
		return new RepMrktTmplt(name, null);
	}
}
