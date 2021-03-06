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
import org.jooq.tables.records.ObjDsplyMsgRecord;


/**
 * Object display message.  Object display messages for application objects. 
 *  E.g. Screens and reports.  There are none one or many messages for a MAPS 
 * object.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ObjDsplyMsg extends TableImpl<ObjDsplyMsgRecord> {

	private static final long serialVersionUID = 1291927166;

	/**
	 * The reference instance of <code>WETRN.OBJ_DSPLY_MSG</code>
	 */
	public static final ObjDsplyMsg OBJ_DSPLY_MSG = new ObjDsplyMsg();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ObjDsplyMsgRecord> getRecordType() {
		return ObjDsplyMsgRecord.class;
	}

	/**
	 * The column <code>WETRN.OBJ_DSPLY_MSG.MPS_OBJ_ID</code>. MAPS object id.  The MAPS object (screen, report, etc.) that this message is used by.
	 */
	public final TableField<ObjDsplyMsgRecord, BigDecimal> MPS_OBJ_ID = createField("MPS_OBJ_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "MAPS object id.  The MAPS object (screen, report, etc.) that this message is used by.");

	/**
	 * The column <code>WETRN.OBJ_DSPLY_MSG.OBJ_DSPLY_MSG_ID</code>. Object display message id.  Identifier for a display message within the object.
	 */
	public final TableField<ObjDsplyMsgRecord, BigDecimal> OBJ_DSPLY_MSG_ID = createField("OBJ_DSPLY_MSG_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "Object display message id.  Identifier for a display message within the object.");

	/**
	 * The column <code>WETRN.OBJ_DSPLY_MSG.OBJ_DSPLY_MSG_DESC_TXT</code>.
	 */
	public final TableField<ObjDsplyMsgRecord, String> OBJ_DSPLY_MSG_DESC_TXT = createField("OBJ_DSPLY_MSG_DESC_TXT", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "");

	/**
	 * The column <code>WETRN.OBJ_DSPLY_MSG.OBJ_DSPLY_MSG_TYP_ID</code>. Object display message type id.  The object display message type of this message.  E.g. 'Warning.'.
	 */
	public final TableField<ObjDsplyMsgRecord, BigDecimal> OBJ_DSPLY_MSG_TYP_ID = createField("OBJ_DSPLY_MSG_TYP_ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "Object display message type id.  The object display message type of this message.  E.g. 'Warning.'.");

	/**
	 * The column <code>WETRN.OBJ_DSPLY_MSG.CREAT_USER_ID</code>. The MAPS Application USER ID of the user (person or process) that created the row.
	 */
	public final TableField<ObjDsplyMsgRecord, String> CREAT_USER_ID = createField("CREAT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "The MAPS Application USER ID of the user (person or process) that created the row.");

	/**
	 * The column <code>WETRN.OBJ_DSPLY_MSG.CREAT_TS</code>. The date and time the row was created.
	 */
	public final TableField<ObjDsplyMsgRecord, Date> CREAT_TS = createField("CREAT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was created.");

	/**
	 * The column <code>WETRN.OBJ_DSPLY_MSG.LAST_UPDT_USER_ID</code>. Contains the MAPS USER ID of the user (person or process) that last updated the row.
	 */
	public final TableField<ObjDsplyMsgRecord, String> LAST_UPDT_USER_ID = createField("LAST_UPDT_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(35).nullable(false).defaulted(true), this, "Contains the MAPS USER ID of the user (person or process) that last updated the row.");

	/**
	 * The column <code>WETRN.OBJ_DSPLY_MSG.LAST_UPDT_TS</code>. The date and time the row was last updated.
	 */
	public final TableField<ObjDsplyMsgRecord, Date> LAST_UPDT_TS = createField("LAST_UPDT_TS", org.jooq.impl.SQLDataType.DATE.nullable(false).defaulted(true), this, "The date and time the row was last updated.");

	/**
	 * Create a <code>WETRN.OBJ_DSPLY_MSG</code> table reference
	 */
	public ObjDsplyMsg() {
		this("OBJ_DSPLY_MSG", null);
	}

	/**
	 * Create an aliased <code>WETRN.OBJ_DSPLY_MSG</code> table reference
	 */
	public ObjDsplyMsg(String alias) {
		this(alias, OBJ_DSPLY_MSG);
	}

	private ObjDsplyMsg(String alias, Table<ObjDsplyMsgRecord> aliased) {
		this(alias, aliased, null);
	}

	private ObjDsplyMsg(String alias, Table<ObjDsplyMsgRecord> aliased, Field<?>[] parameters) {
		super(alias, Wetrn.WETRN, aliased, parameters, "Object display message.  Object display messages for application objects.  E.g. Screens and reports.  There are none one or many messages for a MAPS object.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ObjDsplyMsgRecord> getPrimaryKey() {
		return Keys.PK_OBJ_DSPLY_MSG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ObjDsplyMsgRecord>> getKeys() {
		return Arrays.<UniqueKey<ObjDsplyMsgRecord>>asList(Keys.PK_OBJ_DSPLY_MSG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<ObjDsplyMsgRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<ObjDsplyMsgRecord, ?>>asList(Keys.FK_MPSOBJ_OBJDSPLYMSG, Keys.FK_OBJDSPLYMSGTYP_OBJDSPLYMSG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjDsplyMsg as(String alias) {
		return new ObjDsplyMsg(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ObjDsplyMsg rename(String name) {
		return new ObjDsplyMsg(name, null);
	}
}
