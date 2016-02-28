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
import org.jooq.tables.records.DailyBillingRecord;


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
public class DailyBilling extends TableImpl<DailyBillingRecord> {

	private static final long serialVersionUID = 430328519;

	/**
	 * The reference instance of <code>WETRN.DAILY_BILLING</code>
	 */
	public static final DailyBilling DAILY_BILLING = new DailyBilling();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DailyBillingRecord> getRecordType() {
		return DailyBillingRecord.class;
	}

	/**
	 * The column <code>WETRN.DAILY_BILLING.PROCESSING_DAY</code>.
	 */
	public final TableField<DailyBillingRecord, Date> PROCESSING_DAY = createField("PROCESSING_DAY", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.SALES_CHANNEL</code>.
	 */
	public final TableField<DailyBillingRecord, String> SALES_CHANNEL = createField("SALES_CHANNEL", org.jooq.impl.SQLDataType.CHAR.length(3).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.OFFR_PERD_ID</code>.
	 */
	public final TableField<DailyBillingRecord, BigDecimal> OFFR_PERD_ID = createField("OFFR_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.ACTION_CODE</code>.
	 */
	public final TableField<DailyBillingRecord, String> ACTION_CODE = createField("ACTION_CODE", org.jooq.impl.SQLDataType.CHAR.length(2).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.TRANSACTION_TYPE</code>.
	 */
	public final TableField<DailyBillingRecord, String> TRANSACTION_TYPE = createField("TRANSACTION_TYPE", org.jooq.impl.SQLDataType.CHAR.length(10).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.BILLING_OFFER_ID</code>.
	 */
	public final TableField<DailyBillingRecord, BigDecimal> BILLING_OFFER_ID = createField("BILLING_OFFER_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.NUMBER_FOR</code>.
	 */
	public final TableField<DailyBillingRecord, Short> NUMBER_FOR = createField("NUMBER_FOR", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.SUPPLIER_ID</code>.
	 */
	public final TableField<DailyBillingRecord, String> SUPPLIER_ID = createField("SUPPLIER_ID", org.jooq.impl.SQLDataType.CHAR.length(15), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.OFFER_PRICE</code>.
	 */
	public final TableField<DailyBillingRecord, BigDecimal> OFFER_PRICE = createField("OFFER_PRICE", org.jooq.impl.SQLDataType.NUMERIC.precision(18, 6), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.REGULAR_PRICE</code>.
	 */
	public final TableField<DailyBillingRecord, BigDecimal> REGULAR_PRICE = createField("REGULAR_PRICE", org.jooq.impl.SQLDataType.NUMERIC.precision(18, 6), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.CURRENCY_CODE</code>.
	 */
	public final TableField<DailyBillingRecord, String> CURRENCY_CODE = createField("CURRENCY_CODE", org.jooq.impl.SQLDataType.CHAR.length(3), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.OFFER_TYPE</code>.
	 */
	public final TableField<DailyBillingRecord, String> OFFER_TYPE = createField("OFFER_TYPE", org.jooq.impl.SQLDataType.CHAR.length(2), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.DEMAND_TYPE</code>.
	 */
	public final TableField<DailyBillingRecord, String> DEMAND_TYPE = createField("DEMAND_TYPE", org.jooq.impl.SQLDataType.CHAR.length(3), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.QUANTITY</code>.
	 */
	public final TableField<DailyBillingRecord, BigDecimal> QUANTITY = createField("QUANTITY", org.jooq.impl.SQLDataType.NUMERIC.precision(18, 6), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.COMMISSION_VALUE</code>.
	 */
	public final TableField<DailyBillingRecord, BigDecimal> COMMISSION_VALUE = createField("COMMISSION_VALUE", org.jooq.impl.SQLDataType.NUMERIC.precision(18, 6), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.TAX_VALUE</code>.
	 */
	public final TableField<DailyBillingRecord, BigDecimal> TAX_VALUE = createField("TAX_VALUE", org.jooq.impl.SQLDataType.NUMERIC.precision(18, 6), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.MAIL_PLAN</code>.
	 */
	public final TableField<DailyBillingRecord, String> MAIL_PLAN = createField("MAIL_PLAN", org.jooq.impl.SQLDataType.VARCHAR.length(2).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.BROUGHT_FORWARD_COUNT</code>.
	 */
	public final TableField<DailyBillingRecord, Long> BROUGHT_FORWARD_COUNT = createField("BROUGHT_FORWARD_COUNT", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.OFFER_SKU_LINE_ID</code>.
	 */
	public final TableField<DailyBillingRecord, BigDecimal> OFFER_SKU_LINE_ID = createField("OFFER_SKU_LINE_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.OFFER_LINE_NO_TYPE</code>.
	 */
	public final TableField<DailyBillingRecord, String> OFFER_LINE_NO_TYPE = createField("OFFER_LINE_NO_TYPE", org.jooq.impl.SQLDataType.CHAR.length(10), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.FSC_CD</code>.
	 */
	public final TableField<DailyBillingRecord, String> FSC_CD = createField("FSC_CD", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.CUSTOMER_ID</code>.
	 */
	public final TableField<DailyBillingRecord, String> CUSTOMER_ID = createField("CUSTOMER_ID", org.jooq.impl.SQLDataType.CHAR.length(15).nullable(false), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.MRKT_ID</code>.
	 */
	public final TableField<DailyBillingRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.LINE_NO</code>.
	 */
	public final TableField<DailyBillingRecord, String> LINE_NO = createField("LINE_NO", org.jooq.impl.SQLDataType.CHAR.length(10), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.SLS_PERD_ID</code>.
	 */
	public final TableField<DailyBillingRecord, BigDecimal> SLS_PERD_ID = createField("SLS_PERD_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.ORGANISATION_ID</code>.
	 */
	public final TableField<DailyBillingRecord, String> ORGANISATION_ID = createField("ORGANISATION_ID", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.ORGANISATION_TYPE_ID</code>.
	 */
	public final TableField<DailyBillingRecord, String> ORGANISATION_TYPE_ID = createField("ORGANISATION_TYPE_ID", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.OFFR_ID</code>.
	 */
	public final TableField<DailyBillingRecord, BigDecimal> OFFR_ID = createField("OFFR_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.PLANNED_INDICATOR</code>.
	 */
	public final TableField<DailyBillingRecord, String> PLANNED_INDICATOR = createField("PLANNED_INDICATOR", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.PROCESSED_CODE</code>.
	 */
	public final TableField<DailyBillingRecord, String> PROCESSED_CODE = createField("PROCESSED_CODE", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.SUBSTITUTED_FOR</code>.
	 */
	public final TableField<DailyBillingRecord, String> SUBSTITUTED_FOR = createField("SUBSTITUTED_FOR", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.DLY_BILNG_ID</code>.
	 */
	public final TableField<DailyBillingRecord, BigDecimal> DLY_BILNG_ID = createField("DLY_BILNG_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.ALLOCATED_INDICATOR</code>.
	 */
	public final TableField<DailyBillingRecord, String> ALLOCATED_INDICATOR = createField("ALLOCATED_INDICATOR", org.jooq.impl.SQLDataType.CHAR.length(1).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.MULT_OFFR_SKU_LINE_IND</code>.
	 */
	public final TableField<DailyBillingRecord, String> MULT_OFFR_SKU_LINE_IND = createField("MULT_OFFR_SKU_LINE_IND", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.DAILY_BILLING.PRODUCT_DESCRIPTION</code>.
	 */
	public final TableField<DailyBillingRecord, String> PRODUCT_DESCRIPTION = createField("PRODUCT_DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * Create a <code>WETRN.DAILY_BILLING</code> table reference
	 */
	public DailyBilling() {
		this("DAILY_BILLING", null);
	}

	/**
	 * Create an aliased <code>WETRN.DAILY_BILLING</code> table reference
	 */
	public DailyBilling(String alias) {
		this(alias, DAILY_BILLING);
	}

	private DailyBilling(String alias, Table<DailyBillingRecord> aliased) {
		this(alias, aliased, null);
	}

	private DailyBilling(String alias, Table<DailyBillingRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DailyBillingRecord> getPrimaryKey() {
		return Keys.PK_DAILY_BILLING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DailyBillingRecord>> getKeys() {
		return Arrays.<UniqueKey<DailyBillingRecord>>asList(Keys.PK_DAILY_BILLING);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<DailyBillingRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<DailyBillingRecord, ?>>asList(Keys.FK_MRKTPERD_DAILYBILLING);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DailyBilling as(String alias) {
		return new DailyBilling(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DailyBilling rename(String name) {
		return new DailyBilling(name, null);
	}
}