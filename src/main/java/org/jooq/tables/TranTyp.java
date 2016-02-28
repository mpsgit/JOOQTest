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
import org.jooq.Keys;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.Wetrn;
import org.jooq.impl.TableImpl;
import org.jooq.tables.records.TranTypRecord;


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
public class TranTyp extends TableImpl<TranTypRecord> {

	private static final long serialVersionUID = -1332411637;

	/**
	 * The reference instance of <code>WETRN.TRAN_TYP</code>
	 */
	public static final TranTyp TRAN_TYP = new TranTyp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TranTypRecord> getRecordType() {
		return TranTypRecord.class;
	}

	/**
	 * The column <code>WETRN.TRAN_TYP.TRAN_TYP_ID</code>.
	 */
	public final TableField<TranTypRecord, BigDecimal> TRAN_TYP_ID = createField("TRAN_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.TRAN_TYP.TRAN_TYP_DESC_TXT</code>.
	 */
	public final TableField<TranTypRecord, String> TRAN_TYP_DESC_TXT = createField("TRAN_TYP_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.TRAN_TYP.CREAT_USER_ID</code>.
	 */
	public final TableField<TranTypRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.TRAN_TYP.CREAT_TS</code>.
	 */
	public final TableField<TranTypRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.TRAN_TYP.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<TranTypRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.TRAN_TYP.LAST_UPDT_TS</code>.
	 */
	public final TableField<TranTypRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.TRAN_TYP.SEQ_NR</code>.
	 */
	public final TableField<TranTypRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * Create a <code>WETRN.TRAN_TYP</code> table reference
	 */
	public TranTyp() {
		this("TRAN_TYP", null);
	}

	/**
	 * Create an aliased <code>WETRN.TRAN_TYP</code> table reference
	 */
	public TranTyp(String alias) {
		this(alias, TRAN_TYP);
	}

	private TranTyp(String alias, Table<TranTypRecord> aliased) {
		this(alias, aliased, null);
	}

	private TranTyp(String alias, Table<TranTypRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TranTypRecord> getPrimaryKey() {
		return Keys.PK_TRAN_TYP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TranTypRecord>> getKeys() {
		return Arrays.<UniqueKey<TranTypRecord>>asList(Keys.PK_TRAN_TYP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TranTyp as(String alias) {
		return new TranTyp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TranTyp rename(String name) {
		return new TranTyp(name, null);
	}
}