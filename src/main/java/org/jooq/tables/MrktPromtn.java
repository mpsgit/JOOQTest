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
import org.jooq.tables.records.MrktPromtnRecord;


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
public class MrktPromtn extends TableImpl<MrktPromtnRecord> {

	private static final long serialVersionUID = 1169777807;

	/**
	 * The reference instance of <code>WETRN.MRKT_PROMTN</code>
	 */
	public static final MrktPromtn MRKT_PROMTN = new MrktPromtn();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MrktPromtnRecord> getRecordType() {
		return MrktPromtnRecord.class;
	}

	/**
	 * The column <code>WETRN.MRKT_PROMTN.MRKT_ID</code>.
	 */
	public final TableField<MrktPromtnRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_PROMTN.PROMTN_ID</code>.
	 */
	public final TableField<MrktPromtnRecord, BigDecimal> PROMTN_ID = createField("PROMTN_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MRKT_PROMTN.PROMTN_DESC_TXT</code>.
	 */
	public final TableField<MrktPromtnRecord, String> PROMTN_DESC_TXT = createField("PROMTN_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

	/**
	 * The column <code>WETRN.MRKT_PROMTN.ENBLD_IND</code>.
	 */
	public final TableField<MrktPromtnRecord, String> ENBLD_IND = createField("ENBLD_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>WETRN.MRKT_PROMTN.CREAT_USER_ID</code>.
	 */
	public final TableField<MrktPromtnRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_PROMTN.CREAT_TS</code>.
	 */
	public final TableField<MrktPromtnRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_PROMTN.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MrktPromtnRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MRKT_PROMTN.LAST_UPDT_TS</code>.
	 */
	public final TableField<MrktPromtnRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.MRKT_PROMTN.SEQ_NR</code>.
	 */
	public final TableField<MrktPromtnRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC.defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MRKT_PROMTN.PRC_PROMTN_IND</code>.
	 */
	public final TableField<MrktPromtnRecord, String> PRC_PROMTN_IND = createField("PRC_PROMTN_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>WETRN.MRKT_PROMTN</code> table reference
	 */
	public MrktPromtn() {
		this("MRKT_PROMTN", null);
	}

	/**
	 * Create an aliased <code>WETRN.MRKT_PROMTN</code> table reference
	 */
	public MrktPromtn(String alias) {
		this(alias, MRKT_PROMTN);
	}

	private MrktPromtn(String alias, Table<MrktPromtnRecord> aliased) {
		this(alias, aliased, null);
	}

	private MrktPromtn(String alias, Table<MrktPromtnRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MrktPromtnRecord> getPrimaryKey() {
		return Keys.PK_MRKT_PROMTN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MrktPromtnRecord>> getKeys() {
		return Arrays.<UniqueKey<MrktPromtnRecord>>asList(Keys.PK_MRKT_PROMTN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MrktPromtnRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MrktPromtnRecord, ?>>asList(Keys.FK_MRKT_MRKTPROMTN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MrktPromtn as(String alias) {
		return new MrktPromtn(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MrktPromtn rename(String name) {
		return new MrktPromtn(name, null);
	}
}
