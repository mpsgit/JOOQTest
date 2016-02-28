/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
import org.jooq.tables.ImpdpMaster;


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
public class ImpdpMasterRecord extends TableRecordImpl<ImpdpMasterRecord> {

	private static final long serialVersionUID = 1245477321;

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.PROCESS_ORDER</code>.
	 */
	public void setProcessOrder(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.PROCESS_ORDER</code>.
	 */
	public BigDecimal getProcessOrder() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.DUPLICATE</code>.
	 */
	public void setDuplicate(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.DUPLICATE</code>.
	 */
	public BigDecimal getDuplicate() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.DUMP_FILEID</code>.
	 */
	public void setDumpFileid(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.DUMP_FILEID</code>.
	 */
	public BigDecimal getDumpFileid() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.DUMP_POSITION</code>.
	 */
	public void setDumpPosition(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.DUMP_POSITION</code>.
	 */
	public BigDecimal getDumpPosition() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.DUMP_LENGTH</code>.
	 */
	public void setDumpLength(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.DUMP_LENGTH</code>.
	 */
	public BigDecimal getDumpLength() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.DUMP_ORIG_LENGTH</code>.
	 */
	public void setDumpOrigLength(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.DUMP_ORIG_LENGTH</code>.
	 */
	public BigDecimal getDumpOrigLength() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.DUMP_ALLOCATION</code>.
	 */
	public void setDumpAllocation(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.DUMP_ALLOCATION</code>.
	 */
	public BigDecimal getDumpAllocation() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.COMPLETED_ROWS</code>.
	 */
	public void setCompletedRows(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.COMPLETED_ROWS</code>.
	 */
	public BigDecimal getCompletedRows() {
		return (BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.ERROR_COUNT</code>.
	 */
	public void setErrorCount(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.ERROR_COUNT</code>.
	 */
	public BigDecimal getErrorCount() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.ELAPSED_TIME</code>.
	 */
	public void setElapsedTime(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.ELAPSED_TIME</code>.
	 */
	public BigDecimal getElapsedTime() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.OBJECT_TYPE_PATH</code>.
	 */
	public void setObjectTypePath(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.OBJECT_TYPE_PATH</code>.
	 */
	public String getObjectTypePath() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.OBJECT_PATH_SEQNO</code>.
	 */
	public void setObjectPathSeqno(BigDecimal value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.OBJECT_PATH_SEQNO</code>.
	 */
	public BigDecimal getObjectPathSeqno() {
		return (BigDecimal) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.OBJECT_TYPE</code>.
	 */
	public void setObjectType(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.OBJECT_TYPE</code>.
	 */
	public String getObjectType() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.IN_PROGRESS</code>.
	 */
	public void setInProgress(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.IN_PROGRESS</code>.
	 */
	public String getInProgress() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.OBJECT_NAME</code>.
	 */
	public void setObjectName(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.OBJECT_NAME</code>.
	 */
	public String getObjectName() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.OBJECT_LONG_NAME</code>.
	 */
	public void setObjectLongName(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.OBJECT_LONG_NAME</code>.
	 */
	public String getObjectLongName() {
		return (String) getValue(15);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.OBJECT_SCHEMA</code>.
	 */
	public void setObjectSchema(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.OBJECT_SCHEMA</code>.
	 */
	public String getObjectSchema() {
		return (String) getValue(16);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.ORIGINAL_OBJECT_SCHEMA</code>.
	 */
	public void setOriginalObjectSchema(String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.ORIGINAL_OBJECT_SCHEMA</code>.
	 */
	public String getOriginalObjectSchema() {
		return (String) getValue(17);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.ORIGINAL_OBJECT_NAME</code>.
	 */
	public void setOriginalObjectName(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.ORIGINAL_OBJECT_NAME</code>.
	 */
	public String getOriginalObjectName() {
		return (String) getValue(18);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.PARTITION_NAME</code>.
	 */
	public void setPartitionName(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.PARTITION_NAME</code>.
	 */
	public String getPartitionName() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.SUBPARTITION_NAME</code>.
	 */
	public void setSubpartitionName(String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.SUBPARTITION_NAME</code>.
	 */
	public String getSubpartitionName() {
		return (String) getValue(20);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.DATAOBJ_NUM</code>.
	 */
	public void setDataobjNum(BigDecimal value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.DATAOBJ_NUM</code>.
	 */
	public BigDecimal getDataobjNum() {
		return (BigDecimal) getValue(21);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.FLAGS</code>.
	 */
	public void setFlags(BigDecimal value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.FLAGS</code>.
	 */
	public BigDecimal getFlags() {
		return (BigDecimal) getValue(22);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.PROPERTY</code>.
	 */
	public void setProperty(BigDecimal value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.PROPERTY</code>.
	 */
	public BigDecimal getProperty() {
		return (BigDecimal) getValue(23);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.TRIGFLAG</code>.
	 */
	public void setTrigflag(BigDecimal value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.TRIGFLAG</code>.
	 */
	public BigDecimal getTrigflag() {
		return (BigDecimal) getValue(24);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.CREATION_LEVEL</code>.
	 */
	public void setCreationLevel(BigDecimal value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.CREATION_LEVEL</code>.
	 */
	public BigDecimal getCreationLevel() {
		return (BigDecimal) getValue(25);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.COMPLETION_TIME</code>.
	 */
	public void setCompletionTime(Date value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.COMPLETION_TIME</code>.
	 */
	public Date getCompletionTime() {
		return (Date) getValue(26);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.OBJECT_TABLESPACE</code>.
	 */
	public void setObjectTablespace(String value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.OBJECT_TABLESPACE</code>.
	 */
	public String getObjectTablespace() {
		return (String) getValue(27);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.SIZE_ESTIMATE</code>.
	 */
	public void setSizeEstimate(BigDecimal value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.SIZE_ESTIMATE</code>.
	 */
	public BigDecimal getSizeEstimate() {
		return (BigDecimal) getValue(28);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.OBJECT_ROW</code>.
	 */
	public void setObjectRow(BigDecimal value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.OBJECT_ROW</code>.
	 */
	public BigDecimal getObjectRow() {
		return (BigDecimal) getValue(29);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.PROCESSING_STATE</code>.
	 */
	public void setProcessingState(String value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.PROCESSING_STATE</code>.
	 */
	public String getProcessingState() {
		return (String) getValue(30);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.PROCESSING_STATUS</code>.
	 */
	public void setProcessingStatus(String value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.PROCESSING_STATUS</code>.
	 */
	public String getProcessingStatus() {
		return (String) getValue(31);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.BASE_PROCESS_ORDER</code>.
	 */
	public void setBaseProcessOrder(BigDecimal value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.BASE_PROCESS_ORDER</code>.
	 */
	public BigDecimal getBaseProcessOrder() {
		return (BigDecimal) getValue(32);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.BASE_OBJECT_TYPE</code>.
	 */
	public void setBaseObjectType(String value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.BASE_OBJECT_TYPE</code>.
	 */
	public String getBaseObjectType() {
		return (String) getValue(33);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.BASE_OBJECT_NAME</code>.
	 */
	public void setBaseObjectName(String value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.BASE_OBJECT_NAME</code>.
	 */
	public String getBaseObjectName() {
		return (String) getValue(34);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.BASE_OBJECT_SCHEMA</code>.
	 */
	public void setBaseObjectSchema(String value) {
		setValue(35, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.BASE_OBJECT_SCHEMA</code>.
	 */
	public String getBaseObjectSchema() {
		return (String) getValue(35);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.ANCESTOR_PROCESS_ORDER</code>.
	 */
	public void setAncestorProcessOrder(BigDecimal value) {
		setValue(36, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.ANCESTOR_PROCESS_ORDER</code>.
	 */
	public BigDecimal getAncestorProcessOrder() {
		return (BigDecimal) getValue(36);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.DOMAIN_PROCESS_ORDER</code>.
	 */
	public void setDomainProcessOrder(BigDecimal value) {
		setValue(37, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.DOMAIN_PROCESS_ORDER</code>.
	 */
	public BigDecimal getDomainProcessOrder() {
		return (BigDecimal) getValue(37);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.PARALLELIZATION</code>.
	 */
	public void setParallelization(BigDecimal value) {
		setValue(38, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.PARALLELIZATION</code>.
	 */
	public BigDecimal getParallelization() {
		return (BigDecimal) getValue(38);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.UNLOAD_METHOD</code>.
	 */
	public void setUnloadMethod(BigDecimal value) {
		setValue(39, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.UNLOAD_METHOD</code>.
	 */
	public BigDecimal getUnloadMethod() {
		return (BigDecimal) getValue(39);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.LOAD_METHOD</code>.
	 */
	public void setLoadMethod(BigDecimal value) {
		setValue(40, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.LOAD_METHOD</code>.
	 */
	public BigDecimal getLoadMethod() {
		return (BigDecimal) getValue(40);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.GRANULES</code>.
	 */
	public void setGranules(BigDecimal value) {
		setValue(41, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.GRANULES</code>.
	 */
	public BigDecimal getGranules() {
		return (BigDecimal) getValue(41);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.SCN</code>.
	 */
	public void setScn(BigDecimal value) {
		setValue(42, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.SCN</code>.
	 */
	public BigDecimal getScn() {
		return (BigDecimal) getValue(42);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.GRANTOR</code>.
	 */
	public void setGrantor(String value) {
		setValue(43, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.GRANTOR</code>.
	 */
	public String getGrantor() {
		return (String) getValue(43);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.XML_CLOB</code>.
	 */
	public void setXmlClob(String value) {
		setValue(44, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.XML_CLOB</code>.
	 */
	public String getXmlClob() {
		return (String) getValue(44);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.PARENT_PROCESS_ORDER</code>.
	 */
	public void setParentProcessOrder(BigDecimal value) {
		setValue(45, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.PARENT_PROCESS_ORDER</code>.
	 */
	public BigDecimal getParentProcessOrder() {
		return (BigDecimal) getValue(45);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.NAME</code>.
	 */
	public void setName(String value) {
		setValue(46, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.NAME</code>.
	 */
	public String getName() {
		return (String) getValue(46);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.VALUE_T</code>.
	 */
	public void setValueT(String value) {
		setValue(47, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.VALUE_T</code>.
	 */
	public String getValueT() {
		return (String) getValue(47);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.VALUE_N</code>.
	 */
	public void setValueN(BigDecimal value) {
		setValue(48, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.VALUE_N</code>.
	 */
	public BigDecimal getValueN() {
		return (BigDecimal) getValue(48);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.IS_DEFAULT</code>.
	 */
	public void setIsDefault(BigDecimal value) {
		setValue(49, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.IS_DEFAULT</code>.
	 */
	public BigDecimal getIsDefault() {
		return (BigDecimal) getValue(49);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.FILE_TYPE</code>.
	 */
	public void setFileType(BigDecimal value) {
		setValue(50, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.FILE_TYPE</code>.
	 */
	public BigDecimal getFileType() {
		return (BigDecimal) getValue(50);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.USER_DIRECTORY</code>.
	 */
	public void setUserDirectory(String value) {
		setValue(51, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.USER_DIRECTORY</code>.
	 */
	public String getUserDirectory() {
		return (String) getValue(51);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.USER_FILE_NAME</code>.
	 */
	public void setUserFileName(String value) {
		setValue(52, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.USER_FILE_NAME</code>.
	 */
	public String getUserFileName() {
		return (String) getValue(52);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.FILE_NAME</code>.
	 */
	public void setFileName(String value) {
		setValue(53, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.FILE_NAME</code>.
	 */
	public String getFileName() {
		return (String) getValue(53);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.EXTEND_SIZE</code>.
	 */
	public void setExtendSize(BigDecimal value) {
		setValue(54, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.EXTEND_SIZE</code>.
	 */
	public BigDecimal getExtendSize() {
		return (BigDecimal) getValue(54);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.FILE_MAX_SIZE</code>.
	 */
	public void setFileMaxSize(BigDecimal value) {
		setValue(55, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.FILE_MAX_SIZE</code>.
	 */
	public BigDecimal getFileMaxSize() {
		return (BigDecimal) getValue(55);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.PROCESS_NAME</code>.
	 */
	public void setProcessName(String value) {
		setValue(56, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.PROCESS_NAME</code>.
	 */
	public String getProcessName() {
		return (String) getValue(56);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.LAST_UPDATE</code>.
	 */
	public void setLastUpdate(Date value) {
		setValue(57, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.LAST_UPDATE</code>.
	 */
	public Date getLastUpdate() {
		return (Date) getValue(57);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.WORK_ITEM</code>.
	 */
	public void setWorkItem(String value) {
		setValue(58, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.WORK_ITEM</code>.
	 */
	public String getWorkItem() {
		return (String) getValue(58);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.OBJECT_NUMBER</code>.
	 */
	public void setObjectNumber(BigDecimal value) {
		setValue(59, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.OBJECT_NUMBER</code>.
	 */
	public BigDecimal getObjectNumber() {
		return (BigDecimal) getValue(59);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.COMPLETED_BYTES</code>.
	 */
	public void setCompletedBytes(BigDecimal value) {
		setValue(60, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.COMPLETED_BYTES</code>.
	 */
	public BigDecimal getCompletedBytes() {
		return (BigDecimal) getValue(60);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.TOTAL_BYTES</code>.
	 */
	public void setTotalBytes(BigDecimal value) {
		setValue(61, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.TOTAL_BYTES</code>.
	 */
	public BigDecimal getTotalBytes() {
		return (BigDecimal) getValue(61);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.METADATA_IO</code>.
	 */
	public void setMetadataIo(BigDecimal value) {
		setValue(62, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.METADATA_IO</code>.
	 */
	public BigDecimal getMetadataIo() {
		return (BigDecimal) getValue(62);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.DATA_IO</code>.
	 */
	public void setDataIo(BigDecimal value) {
		setValue(63, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.DATA_IO</code>.
	 */
	public BigDecimal getDataIo() {
		return (BigDecimal) getValue(63);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.CUMULATIVE_TIME</code>.
	 */
	public void setCumulativeTime(BigDecimal value) {
		setValue(64, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.CUMULATIVE_TIME</code>.
	 */
	public BigDecimal getCumulativeTime() {
		return (BigDecimal) getValue(64);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.PACKET_NUMBER</code>.
	 */
	public void setPacketNumber(BigDecimal value) {
		setValue(65, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.PACKET_NUMBER</code>.
	 */
	public BigDecimal getPacketNumber() {
		return (BigDecimal) getValue(65);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.INSTANCE_ID</code>.
	 */
	public void setInstanceId(BigDecimal value) {
		setValue(66, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.INSTANCE_ID</code>.
	 */
	public BigDecimal getInstanceId() {
		return (BigDecimal) getValue(66);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.OLD_VALUE</code>.
	 */
	public void setOldValue(String value) {
		setValue(67, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.OLD_VALUE</code>.
	 */
	public String getOldValue() {
		return (String) getValue(67);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.SEED</code>.
	 */
	public void setSeed(BigDecimal value) {
		setValue(68, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.SEED</code>.
	 */
	public BigDecimal getSeed() {
		return (BigDecimal) getValue(68);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.LAST_FILE</code>.
	 */
	public void setLastFile(BigDecimal value) {
		setValue(69, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.LAST_FILE</code>.
	 */
	public BigDecimal getLastFile() {
		return (BigDecimal) getValue(69);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.USER_NAME</code>.
	 */
	public void setUserName(String value) {
		setValue(70, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.USER_NAME</code>.
	 */
	public String getUserName() {
		return (String) getValue(70);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.OPERATION</code>.
	 */
	public void setOperation(String value) {
		setValue(71, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.OPERATION</code>.
	 */
	public String getOperation() {
		return (String) getValue(71);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.JOB_MODE</code>.
	 */
	public void setJobMode(String value) {
		setValue(72, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.JOB_MODE</code>.
	 */
	public String getJobMode() {
		return (String) getValue(72);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.QUEUE_TABNUM</code>.
	 */
	public void setQueueTabnum(BigDecimal value) {
		setValue(73, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.QUEUE_TABNUM</code>.
	 */
	public BigDecimal getQueueTabnum() {
		return (BigDecimal) getValue(73);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.CONTROL_QUEUE</code>.
	 */
	public void setControlQueue(String value) {
		setValue(74, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.CONTROL_QUEUE</code>.
	 */
	public String getControlQueue() {
		return (String) getValue(74);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.STATUS_QUEUE</code>.
	 */
	public void setStatusQueue(String value) {
		setValue(75, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.STATUS_QUEUE</code>.
	 */
	public String getStatusQueue() {
		return (String) getValue(75);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.REMOTE_LINK</code>.
	 */
	public void setRemoteLink(String value) {
		setValue(76, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.REMOTE_LINK</code>.
	 */
	public String getRemoteLink() {
		return (String) getValue(76);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.VERSION</code>.
	 */
	public void setVersion(BigDecimal value) {
		setValue(77, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.VERSION</code>.
	 */
	public BigDecimal getVersion() {
		return (BigDecimal) getValue(77);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.JOB_VERSION</code>.
	 */
	public void setJobVersion(String value) {
		setValue(78, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.JOB_VERSION</code>.
	 */
	public String getJobVersion() {
		return (String) getValue(78);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.DB_VERSION</code>.
	 */
	public void setDbVersion(String value) {
		setValue(79, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.DB_VERSION</code>.
	 */
	public String getDbVersion() {
		return (String) getValue(79);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.TIMEZONE</code>.
	 */
	public void setTimezone(String value) {
		setValue(80, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.TIMEZONE</code>.
	 */
	public String getTimezone() {
		return (String) getValue(80);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.STATE</code>.
	 */
	public void setState(String value) {
		setValue(81, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.STATE</code>.
	 */
	public String getState() {
		return (String) getValue(81);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.PHASE</code>.
	 */
	public void setPhase(BigDecimal value) {
		setValue(82, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.PHASE</code>.
	 */
	public BigDecimal getPhase() {
		return (BigDecimal) getValue(82);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.GUID</code>.
	 */
	public void setGuid(byte[] value) {
		setValue(83, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.GUID</code>.
	 */
	public byte[] getGuid() {
		return (byte[]) getValue(83);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.START_TIME</code>.
	 */
	public void setStartTime(Date value) {
		setValue(84, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.START_TIME</code>.
	 */
	public Date getStartTime() {
		return (Date) getValue(84);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.BLOCK_SIZE</code>.
	 */
	public void setBlockSize(BigDecimal value) {
		setValue(85, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.BLOCK_SIZE</code>.
	 */
	public BigDecimal getBlockSize() {
		return (BigDecimal) getValue(85);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.METADATA_BUFFER_SIZE</code>.
	 */
	public void setMetadataBufferSize(BigDecimal value) {
		setValue(86, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.METADATA_BUFFER_SIZE</code>.
	 */
	public BigDecimal getMetadataBufferSize() {
		return (BigDecimal) getValue(86);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.DATA_BUFFER_SIZE</code>.
	 */
	public void setDataBufferSize(BigDecimal value) {
		setValue(87, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.DATA_BUFFER_SIZE</code>.
	 */
	public BigDecimal getDataBufferSize() {
		return (BigDecimal) getValue(87);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.DEGREE</code>.
	 */
	public void setDegree(BigDecimal value) {
		setValue(88, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.DEGREE</code>.
	 */
	public BigDecimal getDegree() {
		return (BigDecimal) getValue(88);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.PLATFORM</code>.
	 */
	public void setPlatform(String value) {
		setValue(89, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.PLATFORM</code>.
	 */
	public String getPlatform() {
		return (String) getValue(89);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.ABORT_STEP</code>.
	 */
	public void setAbortStep(BigDecimal value) {
		setValue(90, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.ABORT_STEP</code>.
	 */
	public BigDecimal getAbortStep() {
		return (BigDecimal) getValue(90);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.INSTANCE</code>.
	 */
	public void setInstance(String value) {
		setValue(91, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.INSTANCE</code>.
	 */
	public String getInstance() {
		return (String) getValue(91);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.CLUSTER_OK</code>.
	 */
	public void setClusterOk(BigDecimal value) {
		setValue(92, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.CLUSTER_OK</code>.
	 */
	public BigDecimal getClusterOk() {
		return (BigDecimal) getValue(92);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.SERVICE_NAME</code>.
	 */
	public void setServiceName(String value) {
		setValue(93, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.SERVICE_NAME</code>.
	 */
	public String getServiceName() {
		return (String) getValue(93);
	}

	/**
	 * Setter for <code>WETRN.IMPDP_MASTER.OBJECT_INT_OID</code>.
	 */
	public void setObjectIntOid(String value) {
		setValue(94, value);
	}

	/**
	 * Getter for <code>WETRN.IMPDP_MASTER.OBJECT_INT_OID</code>.
	 */
	public String getObjectIntOid() {
		return (String) getValue(94);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ImpdpMasterRecord
	 */
	public ImpdpMasterRecord() {
		super(ImpdpMaster.IMPDP_MASTER);
	}

	/**
	 * Create a detached, initialised ImpdpMasterRecord
	 */
	public ImpdpMasterRecord(BigDecimal processOrder, BigDecimal duplicate, BigDecimal dumpFileid, BigDecimal dumpPosition, BigDecimal dumpLength, BigDecimal dumpOrigLength, BigDecimal dumpAllocation, BigDecimal completedRows, BigDecimal errorCount, BigDecimal elapsedTime, String objectTypePath, BigDecimal objectPathSeqno, String objectType, String inProgress, String objectName, String objectLongName, String objectSchema, String originalObjectSchema, String originalObjectName, String partitionName, String subpartitionName, BigDecimal dataobjNum, BigDecimal flags, BigDecimal property, BigDecimal trigflag, BigDecimal creationLevel, Date completionTime, String objectTablespace, BigDecimal sizeEstimate, BigDecimal objectRow, String processingState, String processingStatus, BigDecimal baseProcessOrder, String baseObjectType, String baseObjectName, String baseObjectSchema, BigDecimal ancestorProcessOrder, BigDecimal domainProcessOrder, BigDecimal parallelization, BigDecimal unloadMethod, BigDecimal loadMethod, BigDecimal granules, BigDecimal scn, String grantor, String xmlClob, BigDecimal parentProcessOrder, String name, String valueT, BigDecimal valueN, BigDecimal isDefault, BigDecimal fileType, String userDirectory, String userFileName, String fileName, BigDecimal extendSize, BigDecimal fileMaxSize, String processName, Date lastUpdate, String workItem, BigDecimal objectNumber, BigDecimal completedBytes, BigDecimal totalBytes, BigDecimal metadataIo, BigDecimal dataIo, BigDecimal cumulativeTime, BigDecimal packetNumber, BigDecimal instanceId, String oldValue, BigDecimal seed, BigDecimal lastFile, String userName, String operation, String jobMode, BigDecimal queueTabnum, String controlQueue, String statusQueue, String remoteLink, BigDecimal version, String jobVersion, String dbVersion, String timezone, String state, BigDecimal phase, byte[] guid, Date startTime, BigDecimal blockSize, BigDecimal metadataBufferSize, BigDecimal dataBufferSize, BigDecimal degree, String platform, BigDecimal abortStep, String instance, BigDecimal clusterOk, String serviceName, String objectIntOid) {
		super(ImpdpMaster.IMPDP_MASTER);

		setValue(0, processOrder);
		setValue(1, duplicate);
		setValue(2, dumpFileid);
		setValue(3, dumpPosition);
		setValue(4, dumpLength);
		setValue(5, dumpOrigLength);
		setValue(6, dumpAllocation);
		setValue(7, completedRows);
		setValue(8, errorCount);
		setValue(9, elapsedTime);
		setValue(10, objectTypePath);
		setValue(11, objectPathSeqno);
		setValue(12, objectType);
		setValue(13, inProgress);
		setValue(14, objectName);
		setValue(15, objectLongName);
		setValue(16, objectSchema);
		setValue(17, originalObjectSchema);
		setValue(18, originalObjectName);
		setValue(19, partitionName);
		setValue(20, subpartitionName);
		setValue(21, dataobjNum);
		setValue(22, flags);
		setValue(23, property);
		setValue(24, trigflag);
		setValue(25, creationLevel);
		setValue(26, completionTime);
		setValue(27, objectTablespace);
		setValue(28, sizeEstimate);
		setValue(29, objectRow);
		setValue(30, processingState);
		setValue(31, processingStatus);
		setValue(32, baseProcessOrder);
		setValue(33, baseObjectType);
		setValue(34, baseObjectName);
		setValue(35, baseObjectSchema);
		setValue(36, ancestorProcessOrder);
		setValue(37, domainProcessOrder);
		setValue(38, parallelization);
		setValue(39, unloadMethod);
		setValue(40, loadMethod);
		setValue(41, granules);
		setValue(42, scn);
		setValue(43, grantor);
		setValue(44, xmlClob);
		setValue(45, parentProcessOrder);
		setValue(46, name);
		setValue(47, valueT);
		setValue(48, valueN);
		setValue(49, isDefault);
		setValue(50, fileType);
		setValue(51, userDirectory);
		setValue(52, userFileName);
		setValue(53, fileName);
		setValue(54, extendSize);
		setValue(55, fileMaxSize);
		setValue(56, processName);
		setValue(57, lastUpdate);
		setValue(58, workItem);
		setValue(59, objectNumber);
		setValue(60, completedBytes);
		setValue(61, totalBytes);
		setValue(62, metadataIo);
		setValue(63, dataIo);
		setValue(64, cumulativeTime);
		setValue(65, packetNumber);
		setValue(66, instanceId);
		setValue(67, oldValue);
		setValue(68, seed);
		setValue(69, lastFile);
		setValue(70, userName);
		setValue(71, operation);
		setValue(72, jobMode);
		setValue(73, queueTabnum);
		setValue(74, controlQueue);
		setValue(75, statusQueue);
		setValue(76, remoteLink);
		setValue(77, version);
		setValue(78, jobVersion);
		setValue(79, dbVersion);
		setValue(80, timezone);
		setValue(81, state);
		setValue(82, phase);
		setValue(83, guid);
		setValue(84, startTime);
		setValue(85, blockSize);
		setValue(86, metadataBufferSize);
		setValue(87, dataBufferSize);
		setValue(88, degree);
		setValue(89, platform);
		setValue(90, abortStep);
		setValue(91, instance);
		setValue(92, clusterOk);
		setValue(93, serviceName);
		setValue(94, objectIntOid);
	}
}