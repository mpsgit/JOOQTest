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
import org.jooq.tables.records.MpsUserCatgryAcsRecord;


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
public class MpsUserCatgryAcs extends TableImpl<MpsUserCatgryAcsRecord> {

	private static final long serialVersionUID = -1620885149;

	/**
	 * The reference instance of <code>WETRN.MPS_USER_CATGRY_ACS</code>
	 */
	public static final MpsUserCatgryAcs MPS_USER_CATGRY_ACS = new MpsUserCatgryAcs();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MpsUserCatgryAcsRecord> getRecordType() {
		return MpsUserCatgryAcsRecord.class;
	}

	/**
	 * The column <code>WETRN.MPS_USER_CATGRY_ACS.USER_NM</code>.
	 */
	public final TableField<MpsUserCatgryAcsRecord, String> USER_NM = createField("USER_NM", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_USER_CATGRY_ACS.CLSTR_ID</code>.
	 */
	public final TableField<MpsUserCatgryAcsRecord, BigDecimal> CLSTR_ID = createField("CLSTR_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_USER_CATGRY_ACS.CATGRY_ID</code>.
	 */
	public final TableField<MpsUserCatgryAcsRecord, BigDecimal> CATGRY_ID = createField("CATGRY_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.MPS_USER_CATGRY_ACS.CREAT_USER_ID</code>.
	 */
	public final TableField<MpsUserCatgryAcsRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_USER_CATGRY_ACS.CREAT_TS</code>.
	 */
	public final TableField<MpsUserCatgryAcsRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.MPS_USER_CATGRY_ACS.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<MpsUserCatgryAcsRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.MPS_USER_CATGRY_ACS.LAST_UPDT_TS</code>.
	 */
	public final TableField<MpsUserCatgryAcsRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.MPS_USER_CATGRY_ACS.SYS_ID</code>.
	 */
	public final TableField<MpsUserCatgryAcsRecord, BigDecimal> SYS_ID = createField("SYS_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>WETRN.MPS_USER_CATGRY_ACS</code> table reference
	 */
	public MpsUserCatgryAcs() {
		this("MPS_USER_CATGRY_ACS", null);
	}

	/**
	 * Create an aliased <code>WETRN.MPS_USER_CATGRY_ACS</code> table reference
	 */
	public MpsUserCatgryAcs(String alias) {
		this(alias, MPS_USER_CATGRY_ACS);
	}

	private MpsUserCatgryAcs(String alias, Table<MpsUserCatgryAcsRecord> aliased) {
		this(alias, aliased, null);
	}

	private MpsUserCatgryAcs(String alias, Table<MpsUserCatgryAcsRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MpsUserCatgryAcsRecord> getPrimaryKey() {
		return Keys.PK_MPS_USER_CATGRY_ACS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MpsUserCatgryAcsRecord>> getKeys() {
		return Arrays.<UniqueKey<MpsUserCatgryAcsRecord>>asList(Keys.PK_MPS_USER_CATGRY_ACS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MpsUserCatgryAcsRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MpsUserCatgryAcsRecord, ?>>asList(Keys.FK_MPSUSER_MPSUSERCATGRYAC, Keys.FK_CATGRY_MPSUSERCATGRYACS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpsUserCatgryAcs as(String alias) {
		return new MpsUserCatgryAcs(alias, this);
	}

	/**
	 * Rename this table
	 */
	public MpsUserCatgryAcs rename(String name) {
		return new MpsUserCatgryAcs(name, null);
	}
}
