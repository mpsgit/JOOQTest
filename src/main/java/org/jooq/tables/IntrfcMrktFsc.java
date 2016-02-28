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
import org.jooq.tables.records.IntrfcMrktFscRecord;


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
public class IntrfcMrktFsc extends TableImpl<IntrfcMrktFscRecord> {

	private static final long serialVersionUID = 686085770;

	/**
	 * The reference instance of <code>WETRN.INTRFC_MRKT_FSC</code>
	 */
	public static final IntrfcMrktFsc INTRFC_MRKT_FSC = new IntrfcMrktFsc();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IntrfcMrktFscRecord> getRecordType() {
		return IntrfcMrktFscRecord.class;
	}

	/**
	 * The column <code>WETRN.INTRFC_MRKT_FSC.MRKT_FSC_ID</code>.
	 */
	public final TableField<IntrfcMrktFscRecord, BigDecimal> MRKT_FSC_ID = createField("MRKT_FSC_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.INTRFC_MRKT_FSC.MRKT_ID</code>.
	 */
	public final TableField<IntrfcMrktFscRecord, BigDecimal> MRKT_ID = createField("MRKT_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.INTRFC_MRKT_FSC.MRKTG_ITEM_ID</code>.
	 */
	public final TableField<IntrfcMrktFscRecord, BigDecimal> MRKTG_ITEM_ID = createField("MRKTG_ITEM_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.INTRFC_MRKT_FSC.FSC_CD</code>.
	 */
	public final TableField<IntrfcMrktFscRecord, String> FSC_CD = createField("FSC_CD", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "");

	/**
	 * The column <code>WETRN.INTRFC_MRKT_FSC.FSC_DESC_TXT</code>.
	 */
	public final TableField<IntrfcMrktFscRecord, String> FSC_DESC_TXT = createField("FSC_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>WETRN.INTRFC_MRKT_FSC.PRMRY_PRFL_CD</code>.
	 */
	public final TableField<IntrfcMrktFscRecord, BigDecimal> PRMRY_PRFL_CD = createField("PRMRY_PRFL_CD", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>WETRN.INTRFC_MRKT_FSC.CATGRY_ID</code>.
	 */
	public final TableField<IntrfcMrktFscRecord, BigDecimal> CATGRY_ID = createField("CATGRY_ID", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * Create a <code>WETRN.INTRFC_MRKT_FSC</code> table reference
	 */
	public IntrfcMrktFsc() {
		this("INTRFC_MRKT_FSC", null);
	}

	/**
	 * Create an aliased <code>WETRN.INTRFC_MRKT_FSC</code> table reference
	 */
	public IntrfcMrktFsc(String alias) {
		this(alias, INTRFC_MRKT_FSC);
	}

	private IntrfcMrktFsc(String alias, Table<IntrfcMrktFscRecord> aliased) {
		this(alias, aliased, null);
	}

	private IntrfcMrktFsc(String alias, Table<IntrfcMrktFscRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IntrfcMrktFsc as(String alias) {
		return new IntrfcMrktFsc(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IntrfcMrktFsc rename(String name) {
		return new IntrfcMrktFsc(name, null);
	}
}
