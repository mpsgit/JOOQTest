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
import org.jooq.tables.records.BrchrLineNrGrpRecord;


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
public class BrchrLineNrGrp extends TableImpl<BrchrLineNrGrpRecord> {

	private static final long serialVersionUID = 1652901889;

	/**
	 * The reference instance of <code>WETRN.BRCHR_LINE_NR_GRP</code>
	 */
	public static final BrchrLineNrGrp BRCHR_LINE_NR_GRP = new BrchrLineNrGrp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BrchrLineNrGrpRecord> getRecordType() {
		return BrchrLineNrGrpRecord.class;
	}

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP.CLSTR_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public final TableField<BrchrLineNrGrpRecord, BigDecimal> CLSTR_ID = createField("CLSTR_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP.BILNG_SYS_GRP_LEAD_MRKT_ID</code>. An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.
	 */
	public final TableField<BrchrLineNrGrpRecord, BigDecimal> BILNG_SYS_GRP_LEAD_MRKT_ID = createField("BILNG_SYS_GRP_LEAD_MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "An identifier for a geographical area that is being planned. It is usually equal to a COUNTRY, but may be divided to a lower level of detail, such as a subdivision of a COUNTRY either by geography or selling mechanism.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP.BRCHR_LINE_NR_GRP_ID</code>.
	 */
	public final TableField<BrchrLineNrGrpRecord, BigDecimal> BRCHR_LINE_NR_GRP_ID = createField("BRCHR_LINE_NR_GRP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP.SEQ_NR</code>.
	 */
	public final TableField<BrchrLineNrGrpRecord, BigDecimal> SEQ_NR = createField("SEQ_NR", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP.LEAD_BUS_DIV_ID</code>. The unique identifier for the Lead Business Division.  This is the division charged with the ownership of the management and/or development of new Products. The Business Lead Division goes across all Business. Valid  Values include: Avon Future, Wellness, Core.
	 */
	public final TableField<BrchrLineNrGrpRecord, BigDecimal> LEAD_BUS_DIV_ID = createField("LEAD_BUS_DIV_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "The unique identifier for the Lead Business Division.  This is the division charged with the ownership of the management and/or development of new Products. The Business Lead Division goes across all Business. Valid  Values include: Avon Future, Wellness, Core.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP.BUS_ID</code>. A unique identifier for a primary grouping of Avons products and services.  BUSINESSes include - Beauty, Beauty Plus, Beyond Beauty, Inner Beauty, Sales Aids and Services.
	 */
	public final TableField<BrchrLineNrGrpRecord, BigDecimal> BUS_ID = createField("BUS_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "A unique identifier for a primary grouping of Avons products and services.  BUSINESSes include - Beauty, Beauty Plus, Beyond Beauty, Inner Beauty, Sales Aids and Services.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP.CATGRY_ID</code>. A unique identifier for a manageable group of products that consumers perceive to be interrelated and/or substitutable in meeting their needs. Category is a sub division of Business.
	 */
	public final TableField<BrchrLineNrGrpRecord, BigDecimal> CATGRY_ID = createField("CATGRY_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "A unique identifier for a manageable group of products that consumers perceive to be interrelated and/or substitutable in meeting their needs. Category is a sub division of Business.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<BrchrLineNrGrpRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<BrchrLineNrGrpRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<BrchrLineNrGrpRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<BrchrLineNrGrpRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "The date and time the row was last updated.");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP.SGMT_ID</code>. Segment Identifier
	 */
	public final TableField<BrchrLineNrGrpRecord, BigDecimal> SGMT_ID = createField("SGMT_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "Segment Identifier");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP.PROD_TYP_ID</code>.
	 */
	public final TableField<BrchrLineNrGrpRecord, BigDecimal> PROD_TYP_ID = createField("PROD_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.BRCHR_LINE_NR_GRP.FORM_ID</code>.
	 */
	public final TableField<BrchrLineNrGrpRecord, BigDecimal> FORM_ID = createField("FORM_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * Create a <code>WETRN.BRCHR_LINE_NR_GRP</code> table reference
	 */
	public BrchrLineNrGrp() {
		this("BRCHR_LINE_NR_GRP", null);
	}

	/**
	 * Create an aliased <code>WETRN.BRCHR_LINE_NR_GRP</code> table reference
	 */
	public BrchrLineNrGrp(String alias) {
		this(alias, BRCHR_LINE_NR_GRP);
	}

	private BrchrLineNrGrp(String alias, Table<BrchrLineNrGrpRecord> aliased) {
		this(alias, aliased, null);
	}

	private BrchrLineNrGrp(String alias, Table<BrchrLineNrGrpRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<BrchrLineNrGrpRecord> getPrimaryKey() {
		return Keys.PK_BRCHR_LINE_NR_GRP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<BrchrLineNrGrpRecord>> getKeys() {
		return Arrays.<UniqueKey<BrchrLineNrGrpRecord>>asList(Keys.PK_BRCHR_LINE_NR_GRP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<BrchrLineNrGrpRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<BrchrLineNrGrpRecord, ?>>asList(Keys.FK_BRCHRLINENRGRPLKUP_BLNGRP, Keys.FK_LEADBUSDIV_BRCHRLINENRGRP, Keys.FK_BUS_BRCHRLINENRGRP, Keys.FK_CATGRY_BRCHRLINENRGRP, Keys.FK_SGMT_BRCHRLINENRGRP, Keys.FK_PRODTYP_BRCHRLINENRGRP, Keys.FK_FORM_BRCHRLINENRGRP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BrchrLineNrGrp as(String alias) {
		return new BrchrLineNrGrp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public BrchrLineNrGrp rename(String name) {
		return new BrchrLineNrGrp(name, null);
	}
}
