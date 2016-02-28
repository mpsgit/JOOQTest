/**
 * This class is generated by jOOQ
 */
package org.jooq.tables;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.Wetrn;
import org.jooq.impl.TableImpl;
import org.jooq.tables.records.TempOffrPrflPrcPointRecord;


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
public class TempOffrPrflPrcPoint extends TableImpl<TempOffrPrflPrcPointRecord> {

	private static final long serialVersionUID = 1744938964;

	/**
	 * The reference instance of <code>WETRN.TEMP_OFFR_PRFL_PRC_POINT</code>
	 */
	public static final TempOffrPrflPrcPoint TEMP_OFFR_PRFL_PRC_POINT = new TempOffrPrflPrcPoint();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TempOffrPrflPrcPointRecord> getRecordType() {
		return TempOffrPrflPrcPointRecord.class;
	}

	/**
	 * The column <code>WETRN.TEMP_OFFR_PRFL_PRC_POINT.OFFR_PRFL_PRCPT_ID</code>.
	 */
	public final TableField<TempOffrPrflPrcPointRecord, BigDecimal> OFFR_PRFL_PRCPT_ID = createField("OFFR_PRFL_PRCPT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.TEMP_OFFR_PRFL_PRC_POINT.REG_PRC_AMT</code>.
	 */
	public final TableField<TempOffrPrflPrcPointRecord, BigDecimal> REG_PRC_AMT = createField("REG_PRC_AMT", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2), this, "");

	/**
	 * Create a <code>WETRN.TEMP_OFFR_PRFL_PRC_POINT</code> table reference
	 */
	public TempOffrPrflPrcPoint() {
		this("TEMP_OFFR_PRFL_PRC_POINT", null);
	}

	/**
	 * Create an aliased <code>WETRN.TEMP_OFFR_PRFL_PRC_POINT</code> table reference
	 */
	public TempOffrPrflPrcPoint(String alias) {
		this(alias, TEMP_OFFR_PRFL_PRC_POINT);
	}

	private TempOffrPrflPrcPoint(String alias, Table<TempOffrPrflPrcPointRecord> aliased) {
		this(alias, aliased, null);
	}

	private TempOffrPrflPrcPoint(String alias, Table<TempOffrPrflPrcPointRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TempOffrPrflPrcPoint as(String alias) {
		return new TempOffrPrflPrcPoint(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TempOffrPrflPrcPoint rename(String name) {
		return new TempOffrPrflPrcPoint(name, null);
	}
}
