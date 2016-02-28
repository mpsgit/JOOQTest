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
import org.jooq.tables.records.IntrfcSysTpcRecord;


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
public class IntrfcSysTpc extends TableImpl<IntrfcSysTpcRecord> {

	private static final long serialVersionUID = 950896726;

	/**
	 * The reference instance of <code>WETRN.INTRFC_SYS_TPC</code>
	 */
	public static final IntrfcSysTpc INTRFC_SYS_TPC = new IntrfcSysTpc();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IntrfcSysTpcRecord> getRecordType() {
		return IntrfcSysTpcRecord.class;
	}

	/**
	 * The column <code>WETRN.INTRFC_SYS_TPC.INTRFC_SYS_ID</code>.
	 */
	public final TableField<IntrfcSysTpcRecord, BigDecimal> INTRFC_SYS_ID = createField("INTRFC_SYS_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.INTRFC_SYS_TPC.TPC_ID</code>.
	 */
	public final TableField<IntrfcSysTpcRecord, BigDecimal> TPC_ID = createField("TPC_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.INTRFC_SYS_TPC.XPORT_STUS_ID</code>.
	 */
	public final TableField<IntrfcSysTpcRecord, BigDecimal> XPORT_STUS_ID = createField("XPORT_STUS_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.INTRFC_SYS_TPC.CREAT_USER_ID</code>.
	 */
	public final TableField<IntrfcSysTpcRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.INTRFC_SYS_TPC.CREAT_TS</code>.
	 */
	public final TableField<IntrfcSysTpcRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.INTRFC_SYS_TPC.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<IntrfcSysTpcRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.INTRFC_SYS_TPC.LAST_UPDT_TS</code>.
	 */
	public final TableField<IntrfcSysTpcRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.INTRFC_SYS_TPC</code> table reference
	 */
	public IntrfcSysTpc() {
		this("INTRFC_SYS_TPC", null);
	}

	/**
	 * Create an aliased <code>WETRN.INTRFC_SYS_TPC</code> table reference
	 */
	public IntrfcSysTpc(String alias) {
		this(alias, INTRFC_SYS_TPC);
	}

	private IntrfcSysTpc(String alias, Table<IntrfcSysTpcRecord> aliased) {
		this(alias, aliased, null);
	}

	private IntrfcSysTpc(String alias, Table<IntrfcSysTpcRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<IntrfcSysTpcRecord> getPrimaryKey() {
		return Keys.PK_INTRFC_SYS_TPC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IntrfcSysTpcRecord>> getKeys() {
		return Arrays.<UniqueKey<IntrfcSysTpcRecord>>asList(Keys.PK_INTRFC_SYS_TPC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<IntrfcSysTpcRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<IntrfcSysTpcRecord, ?>>asList(Keys.FK_INTRFCSYS_INTRFCSYSTPC, Keys.FK_TPCXPORTSTUS_INTRFCSYSTPC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IntrfcSysTpc as(String alias) {
		return new IntrfcSysTpc(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IntrfcSysTpc rename(String name) {
		return new IntrfcSysTpc(name, null);
	}
}
