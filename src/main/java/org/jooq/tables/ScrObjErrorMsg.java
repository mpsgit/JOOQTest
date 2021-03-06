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
import org.jooq.tables.records.ScrObjErrorMsgRecord;


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
public class ScrObjErrorMsg extends TableImpl<ScrObjErrorMsgRecord> {

	private static final long serialVersionUID = -1867907237;

	/**
	 * The reference instance of <code>WETRN.SCR_OBJ_ERROR_MSG</code>
	 */
	public static final ScrObjErrorMsg SCR_OBJ_ERROR_MSG = new ScrObjErrorMsg();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ScrObjErrorMsgRecord> getRecordType() {
		return ScrObjErrorMsgRecord.class;
	}

	/**
	 * The column <code>WETRN.SCR_OBJ_ERROR_MSG.ERROR_MSG_ID</code>.
	 */
	public final TableField<ScrObjErrorMsgRecord, BigDecimal> ERROR_MSG_ID = createField("ERROR_MSG_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

	/**
	 * The column <code>WETRN.SCR_OBJ_ERROR_MSG.ERROR_MSG_DESC_TXT</code>.
	 */
	public final TableField<ScrObjErrorMsgRecord, String> ERROR_MSG_DESC_TXT = createField("ERROR_MSG_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>WETRN.SCR_OBJ_ERROR_MSG.CREAT_USER_ID</code>.
	 */
	public final TableField<ScrObjErrorMsgRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.SCR_OBJ_ERROR_MSG.CREAT_TS</code>.
	 */
	public final TableField<ScrObjErrorMsgRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>WETRN.SCR_OBJ_ERROR_MSG.LAST_UPDT_USER_ID</code>.
	 */
	public final TableField<ScrObjErrorMsgRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>WETRN.SCR_OBJ_ERROR_MSG.LAST_UPDT_TS</code>.
	 */
	public final TableField<ScrObjErrorMsgRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>WETRN.SCR_OBJ_ERROR_MSG</code> table reference
	 */
	public ScrObjErrorMsg() {
		this("SCR_OBJ_ERROR_MSG", null);
	}

	/**
	 * Create an aliased <code>WETRN.SCR_OBJ_ERROR_MSG</code> table reference
	 */
	public ScrObjErrorMsg(String alias) {
		this(alias, SCR_OBJ_ERROR_MSG);
	}

	private ScrObjErrorMsg(String alias, Table<ScrObjErrorMsgRecord> aliased) {
		this(alias, aliased, null);
	}

	private ScrObjErrorMsg(String alias, Table<ScrObjErrorMsgRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ScrObjErrorMsgRecord> getPrimaryKey() {
		return Keys.PK_SCR_OBJ_ERROR_MSG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ScrObjErrorMsgRecord>> getKeys() {
		return Arrays.<UniqueKey<ScrObjErrorMsgRecord>>asList(Keys.PK_SCR_OBJ_ERROR_MSG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScrObjErrorMsg as(String alias) {
		return new ScrObjErrorMsg(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ScrObjErrorMsg rename(String name) {
		return new ScrObjErrorMsg(name, null);
	}
}
