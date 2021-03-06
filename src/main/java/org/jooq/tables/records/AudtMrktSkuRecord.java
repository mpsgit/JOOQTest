/**
 * This class is generated by jOOQ
 */
package org.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Record2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tables.AudtMrktSku;


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
public class AudtMrktSkuRecord extends UpdatableRecordImpl<AudtMrktSkuRecord> {

	private static final long serialVersionUID = -1061008426;

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.MRKT_ID</code>.
	 */
	public void setMrktId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.MRKT_ID</code>.
	 */
	public BigDecimal getMrktId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.SKU_ID</code>.
	 */
	public void setSkuId(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.SKU_ID</code>.
	 */
	public BigDecimal getSkuId() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.STUS_PERD_ID</code>.
	 */
	public void setStusPerdId(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.STUS_PERD_ID</code>.
	 */
	public BigDecimal getStusPerdId() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.ON_STUS_PERD_ID</code>.
	 */
	public void setOnStusPerdId(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.ON_STUS_PERD_ID</code>.
	 */
	public BigDecimal getOnStusPerdId() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.AVLBL_PERD_ID</code>.
	 */
	public void setAvlblPerdId(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.AVLBL_PERD_ID</code>.
	 */
	public BigDecimal getAvlblPerdId() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.LCL_ITEM_DESCR_TXT</code>.
	 */
	public void setLclItemDescrTxt(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.LCL_ITEM_DESCR_TXT</code>.
	 */
	public String getLclItemDescrTxt() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.DSPOSTN_PERD_ID</code>.
	 */
	public void setDspostnPerdId(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.DSPOSTN_PERD_ID</code>.
	 */
	public BigDecimal getDspostnPerdId() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.INTRDCTN_PERD_ID</code>.
	 */
	public void setIntrdctnPerdId(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.INTRDCTN_PERD_ID</code>.
	 */
	public BigDecimal getIntrdctnPerdId() {
		return (BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.MRKT_SKU_USG_IND</code>.
	 */
	public void setMrktSkuUsgInd(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.MRKT_SKU_USG_IND</code>.
	 */
	public String getMrktSkuUsgInd() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.LCL_SKU_NM</code>.
	 */
	public void setLclSkuNm(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.LCL_SKU_NM</code>.
	 */
	public String getLclSkuNm() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.PROD_LIFE_TYP_ID</code>.
	 */
	public void setProdLifeTypId(BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.PROD_LIFE_TYP_ID</code>.
	 */
	public BigDecimal getProdLifeTypId() {
		return (BigDecimal) getValue(10);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.COST_APRVD_IND</code>.
	 */
	public void setCostAprvdInd(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.COST_APRVD_IND</code>.
	 */
	public String getCostAprvdInd() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.CREAT_USER_ID</code>.
	 */
	public void setCreatUserId(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.CREAT_USER_ID</code>.
	 */
	public String getCreatUserId() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.CREAT_TS</code>.
	 */
	public void setCreatTs(Date value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.CREAT_TS</code>.
	 */
	public Date getCreatTs() {
		return (Date) getValue(13);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.LAST_UPDT_USER_ID</code>.
	 */
	public void setLastUpdtUserId(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.LAST_UPDT_USER_ID</code>.
	 */
	public String getLastUpdtUserId() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.LAST_UPDT_TS</code>.
	 */
	public void setLastUpdtTs(Date value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.LAST_UPDT_TS</code>.
	 */
	public Date getLastUpdtTs() {
		return (Date) getValue(15);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.DLTD_IND</code>.
	 */
	public void setDltdInd(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.DLTD_IND</code>.
	 */
	public String getDltdInd() {
		return (String) getValue(16);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.COST_OBJCTV_AMT</code>.
	 */
	public void setCostObjctvAmt(BigDecimal value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.COST_OBJCTV_AMT</code>.
	 */
	public BigDecimal getCostObjctvAmt() {
		return (BigDecimal) getValue(17);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.REG_PRC_AMT</code>.
	 */
	public void setRegPrcAmt(BigDecimal value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.REG_PRC_AMT</code>.
	 */
	public BigDecimal getRegPrcAmt() {
		return (BigDecimal) getValue(18);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.CHRTY_IND</code>.
	 */
	public void setChrtyInd(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.CHRTY_IND</code>.
	 */
	public String getChrtyInd() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.PRE_APRVD_STUS_PERD_ID</code>.
	 */
	public void setPreAprvdStusPerdId(BigDecimal value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.PRE_APRVD_STUS_PERD_ID</code>.
	 */
	public BigDecimal getPreAprvdStusPerdId() {
		return (BigDecimal) getValue(20);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.DEMO_OFS_NR</code>.
	 */
	public void setDemoOfsNr(BigDecimal value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.DEMO_OFS_NR</code>.
	 */
	public BigDecimal getDemoOfsNr() {
		return (BigDecimal) getValue(21);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.DEMO_DURTN_NR</code>.
	 */
	public void setDemoDurtnNr(BigDecimal value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.DEMO_DURTN_NR</code>.
	 */
	public BigDecimal getDemoDurtnNr() {
		return (BigDecimal) getValue(22);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.NEW_DURTN_NR</code>.
	 */
	public void setNewDurtnNr(BigDecimal value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.NEW_DURTN_NR</code>.
	 */
	public BigDecimal getNewDurtnNr() {
		return (BigDecimal) getValue(23);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.CNTNT_FILL_PIECS_UOM_ID</code>.
	 */
	public void setCntntFillPiecsUomId(BigDecimal value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.CNTNT_FILL_PIECS_UOM_ID</code>.
	 */
	public BigDecimal getCntntFillPiecsUomId() {
		return (BigDecimal) getValue(24);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.CNTNT_FILL_PIECS_UOM_DESC_TXT</code>.
	 */
	public void setCntntFillPiecsUomDescTxt(String value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.CNTNT_FILL_PIECS_UOM_DESC_TXT</code>.
	 */
	public String getCntntFillPiecsUomDescTxt() {
		return (String) getValue(25);
	}

	/**
	 * Setter for <code>WETRN.AUDT_MRKT_SKU.CNTNT_FILL_PIECS_NR</code>.
	 */
	public void setCntntFillPiecsNr(BigDecimal value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>WETRN.AUDT_MRKT_SKU.CNTNT_FILL_PIECS_NR</code>.
	 */
	public BigDecimal getCntntFillPiecsNr() {
		return (BigDecimal) getValue(26);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<BigDecimal, BigDecimal> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AudtMrktSkuRecord
	 */
	public AudtMrktSkuRecord() {
		super(AudtMrktSku.AUDT_MRKT_SKU);
	}

	/**
	 * Create a detached, initialised AudtMrktSkuRecord
	 */
	public AudtMrktSkuRecord(BigDecimal mrktId, BigDecimal skuId, BigDecimal stusPerdId, BigDecimal onStusPerdId, BigDecimal avlblPerdId, String lclItemDescrTxt, BigDecimal dspostnPerdId, BigDecimal intrdctnPerdId, String mrktSkuUsgInd, String lclSkuNm, BigDecimal prodLifeTypId, String costAprvdInd, String creatUserId, Date creatTs, String lastUpdtUserId, Date lastUpdtTs, String dltdInd, BigDecimal costObjctvAmt, BigDecimal regPrcAmt, String chrtyInd, BigDecimal preAprvdStusPerdId, BigDecimal demoOfsNr, BigDecimal demoDurtnNr, BigDecimal newDurtnNr, BigDecimal cntntFillPiecsUomId, String cntntFillPiecsUomDescTxt, BigDecimal cntntFillPiecsNr) {
		super(AudtMrktSku.AUDT_MRKT_SKU);

		setValue(0, mrktId);
		setValue(1, skuId);
		setValue(2, stusPerdId);
		setValue(3, onStusPerdId);
		setValue(4, avlblPerdId);
		setValue(5, lclItemDescrTxt);
		setValue(6, dspostnPerdId);
		setValue(7, intrdctnPerdId);
		setValue(8, mrktSkuUsgInd);
		setValue(9, lclSkuNm);
		setValue(10, prodLifeTypId);
		setValue(11, costAprvdInd);
		setValue(12, creatUserId);
		setValue(13, creatTs);
		setValue(14, lastUpdtUserId);
		setValue(15, lastUpdtTs);
		setValue(16, dltdInd);
		setValue(17, costObjctvAmt);
		setValue(18, regPrcAmt);
		setValue(19, chrtyInd);
		setValue(20, preAprvdStusPerdId);
		setValue(21, demoOfsNr);
		setValue(22, demoDurtnNr);
		setValue(23, newDurtnNr);
		setValue(24, cntntFillPiecsUomId);
		setValue(25, cntntFillPiecsUomDescTxt);
		setValue(26, cntntFillPiecsNr);
	}
}
