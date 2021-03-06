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
import org.jooq.tables.records.SrceOfSlsElmntRecord;


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
public class SrceOfSlsElmnt extends TableImpl<SrceOfSlsElmntRecord> {

	private static final long serialVersionUID = 948231755;

	/**
	 * The reference instance of <code>WETRN.SRCE_OF_SLS_ELMNT</code>
	 */
	public static final SrceOfSlsElmnt SRCE_OF_SLS_ELMNT = new SrceOfSlsElmnt();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SrceOfSlsElmntRecord> getRecordType() {
		return SrceOfSlsElmntRecord.class;
	}

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_ELMNT.SRCE_OF_SLS_ELMNT_ID</code>.
	 */
	public final TableField<SrceOfSlsElmntRecord, BigDecimal> SRCE_OF_SLS_ELMNT_ID = createField("SRCE_OF_SLS_ELMNT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_ELMNT.SRCE_OF_SLS_ELMNT_NM</code>.
	 */
	public final TableField<SrceOfSlsElmntRecord, String> SRCE_OF_SLS_ELMNT_NM = createField("SRCE_OF_SLS_ELMNT_NM", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_ELMNT.CREAT_USER_ID</code>.
	 */
	public final TableField<SrceOfSlsElmntRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_ELMNT.CREAT_TS</code>.
	 */
	public final TableField<SrceOfSlsElmntRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_ELMNT.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<SrceOfSlsElmntRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_ELMNT.LAST_UPDT_TS</code>.
	 */
	public final TableField<SrceOfSlsElmntRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_ELMNT.OFF_SCHDL_IND</code>.
	 */
	public final TableField<SrceOfSlsElmntRecord, String> OFF_SCHDL_IND = createField("OFF_SCHDL_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_ELMNT.OTHR_SRCE_OF_SLS_ELMNT_LINK_ID</code>.
	 */
	public final TableField<SrceOfSlsElmntRecord, BigDecimal> OTHR_SRCE_OF_SLS_ELMNT_LINK_ID = createField("OTHR_SRCE_OF_SLS_ELMNT_LINK_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_ELMNT.PLUG_IND</code>.
	 */
	public final TableField<SrceOfSlsElmntRecord, String> PLUG_IND = createField("PLUG_IND", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * Create a <code>WETRN.SRCE_OF_SLS_ELMNT</code> table reference
	 */
	public SrceOfSlsElmnt() {
		this("SRCE_OF_SLS_ELMNT", null);
	}

	/**
	 * Create an aliased <code>WETRN.SRCE_OF_SLS_ELMNT</code> table reference
	 */
	public SrceOfSlsElmnt(String alias) {
		this(alias, SRCE_OF_SLS_ELMNT);
	}

	private SrceOfSlsElmnt(String alias, Table<SrceOfSlsElmntRecord> aliased) {
		this(alias, aliased, null);
	}

	private SrceOfSlsElmnt(String alias, Table<SrceOfSlsElmntRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<SrceOfSlsElmntRecord> getPrimaryKey() {
		return Keys.PK_SRCE_OF_SLS_ELMNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<SrceOfSlsElmntRecord>> getKeys() {
		return Arrays.<UniqueKey<SrceOfSlsElmntRecord>>asList(Keys.PK_SRCE_OF_SLS_ELMNT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<SrceOfSlsElmntRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<SrceOfSlsElmntRecord, ?>>asList(Keys.FK_SRCEOFSLSELMNT_SRCEOFSLSELM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SrceOfSlsElmnt as(String alias) {
		return new SrceOfSlsElmnt(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SrceOfSlsElmnt rename(String name) {
		return new SrceOfSlsElmnt(name, null);
	}
}
