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
import org.jooq.tables.records.SrceOfSlsSlsClsRecord;


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
public class SrceOfSlsSlsCls extends TableImpl<SrceOfSlsSlsClsRecord> {

	private static final long serialVersionUID = 664593637;

	/**
	 * The reference instance of <code>WETRN.SRCE_OF_SLS_SLS_CLS</code>
	 */
	public static final SrceOfSlsSlsCls SRCE_OF_SLS_SLS_CLS = new SrceOfSlsSlsCls();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SrceOfSlsSlsClsRecord> getRecordType() {
		return SrceOfSlsSlsClsRecord.class;
	}

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_SLS_CLS.SRCE_OF_SLS_ELMNT_ID</code>.
	 */
	public final TableField<SrceOfSlsSlsClsRecord, BigDecimal> SRCE_OF_SLS_ELMNT_ID = createField("SRCE_OF_SLS_ELMNT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_SLS_CLS.SLS_CLS_CD</code>.
	 */
	public final TableField<SrceOfSlsSlsClsRecord, String> SLS_CLS_CD = createField("SLS_CLS_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_SLS_CLS.CREAT_USER_ID</code>.
	 */
	public final TableField<SrceOfSlsSlsClsRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_SLS_CLS.CREAT_TS</code>.
	 */
	public final TableField<SrceOfSlsSlsClsRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_SLS_CLS.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<SrceOfSlsSlsClsRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.SRCE_OF_SLS_SLS_CLS.LAST_UPDT_TS</code>.
	 */
	public final TableField<SrceOfSlsSlsClsRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.SRCE_OF_SLS_SLS_CLS</code> table reference
	 */
	public SrceOfSlsSlsCls() {
		this("SRCE_OF_SLS_SLS_CLS", null);
	}

	/**
	 * Create an aliased <code>WETRN.SRCE_OF_SLS_SLS_CLS</code> table reference
	 */
	public SrceOfSlsSlsCls(String alias) {
		this(alias, SRCE_OF_SLS_SLS_CLS);
	}

	private SrceOfSlsSlsCls(String alias, Table<SrceOfSlsSlsClsRecord> aliased) {
		this(alias, aliased, null);
	}

	private SrceOfSlsSlsCls(String alias, Table<SrceOfSlsSlsClsRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<SrceOfSlsSlsClsRecord> getPrimaryKey() {
		return Keys.PK_SRCE_OF_SLS_SLS_CLS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<SrceOfSlsSlsClsRecord>> getKeys() {
		return Arrays.<UniqueKey<SrceOfSlsSlsClsRecord>>asList(Keys.PK_SRCE_OF_SLS_SLS_CLS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<SrceOfSlsSlsClsRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<SrceOfSlsSlsClsRecord, ?>>asList(Keys.FK_SRCEOFSLS_SRCEOFSLSSLSCLS, Keys.FK_SLSCLS_SRCEOFSLSSLSCLS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SrceOfSlsSlsCls as(String alias) {
		return new SrceOfSlsSlsCls(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SrceOfSlsSlsCls rename(String name) {
		return new SrceOfSlsSlsCls(name, null);
	}
}