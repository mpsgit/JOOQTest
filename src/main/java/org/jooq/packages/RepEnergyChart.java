/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.rep_energy_chart.GetOffsetsTable;
import org.jooq.packages.rep_energy_chart.GetRows;
import org.jooq.packages.rep_energy_chart.GetValidOffsetsTxt;


/**
 * Convenience access to all stored procedures and functions in REP_ENERGY_CHART
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RepEnergyChart extends PackageImpl {

	private static final long serialVersionUID = 1122996820;

	/**
	 * The reference instance of <code>WETRN.REP_ENERGY_CHART</code>
	 */
	public static final RepEnergyChart REP_ENERGY_CHART = new RepEnergyChart();

	/**
	 * Call <code>WETRN.REP_ENERGY_CHART.GET_OFFSETS_TABLE</code>
	 */
	public static Object getOffsetsTable(Configuration configuration, Number pMrktId, Number pFromPerdId, Number pToPerdId, Number pMinOffset, Number pMaxOffset, Number pCoo, String pPerdTyp) {
		GetOffsetsTable f = new GetOffsetsTable();
		f.setPMrktId(pMrktId);
		f.setPFromPerdId(pFromPerdId);
		f.setPToPerdId(pToPerdId);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCoo(pCoo);
		f.setPPerdTyp(pPerdTyp);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_ENERGY_CHART.GET_OFFSETS_TABLE</code> as a field.
	 */
	public static Field<Object> getOffsetsTable(Number pMrktId, Number pFromPerdId, Number pToPerdId, Number pMinOffset, Number pMaxOffset, Number pCoo, String pPerdTyp) {
		GetOffsetsTable f = new GetOffsetsTable();
		f.setPMrktId(pMrktId);
		f.setPFromPerdId(pFromPerdId);
		f.setPToPerdId(pToPerdId);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCoo(pCoo);
		f.setPPerdTyp(pPerdTyp);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_ENERGY_CHART.GET_OFFSETS_TABLE</code> as a field.
	 */
	public static Field<Object> getOffsetsTable(Field<? extends Number> pMrktId, Field<? extends Number> pFromPerdId, Field<? extends Number> pToPerdId, Field<? extends Number> pMinOffset, Field<? extends Number> pMaxOffset, Field<? extends Number> pCoo, Field<String> pPerdTyp) {
		GetOffsetsTable f = new GetOffsetsTable();
		f.setPMrktId(pMrktId);
		f.setPFromPerdId(pFromPerdId);
		f.setPToPerdId(pToPerdId);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCoo(pCoo);
		f.setPPerdTyp(pPerdTyp);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_ENERGY_CHART.GET_ROWS</code>
	 */
	public static Object getRows(Configuration configuration, Number pMrktId, String pVehIdList, String pBrchrPlcmtIdList, Number pOffrPerdIdFrom1, Number pOffrPerdIdTo1, Number pVerId1, Number pOffrPerdIdFrom2, Number pOffrPerdIdTo2, Number pVerId2, Number pOffsetMin, Number pOffsetMax, String pUsCurrency) {
		GetRows f = new GetRows();
		f.setPMrktId(pMrktId);
		f.setPVehIdList(pVehIdList);
		f.setPBrchrPlcmtIdList(pBrchrPlcmtIdList);
		f.setPOffrPerdIdFrom1(pOffrPerdIdFrom1);
		f.setPOffrPerdIdTo1(pOffrPerdIdTo1);
		f.setPVerId1(pVerId1);
		f.setPOffrPerdIdFrom2(pOffrPerdIdFrom2);
		f.setPOffrPerdIdTo2(pOffrPerdIdTo2);
		f.setPVerId2(pVerId2);
		f.setPOffsetMin(pOffsetMin);
		f.setPOffsetMax(pOffsetMax);
		f.setPUsCurrency(pUsCurrency);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_ENERGY_CHART.GET_ROWS</code> as a field.
	 */
	public static Field<Object> getRows(Number pMrktId, String pVehIdList, String pBrchrPlcmtIdList, Number pOffrPerdIdFrom1, Number pOffrPerdIdTo1, Number pVerId1, Number pOffrPerdIdFrom2, Number pOffrPerdIdTo2, Number pVerId2, Number pOffsetMin, Number pOffsetMax, String pUsCurrency) {
		GetRows f = new GetRows();
		f.setPMrktId(pMrktId);
		f.setPVehIdList(pVehIdList);
		f.setPBrchrPlcmtIdList(pBrchrPlcmtIdList);
		f.setPOffrPerdIdFrom1(pOffrPerdIdFrom1);
		f.setPOffrPerdIdTo1(pOffrPerdIdTo1);
		f.setPVerId1(pVerId1);
		f.setPOffrPerdIdFrom2(pOffrPerdIdFrom2);
		f.setPOffrPerdIdTo2(pOffrPerdIdTo2);
		f.setPVerId2(pVerId2);
		f.setPOffsetMin(pOffsetMin);
		f.setPOffsetMax(pOffsetMax);
		f.setPUsCurrency(pUsCurrency);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_ENERGY_CHART.GET_ROWS</code> as a field.
	 */
	public static Field<Object> getRows(Field<? extends Number> pMrktId, Field<String> pVehIdList, Field<String> pBrchrPlcmtIdList, Field<? extends Number> pOffrPerdIdFrom1, Field<? extends Number> pOffrPerdIdTo1, Field<? extends Number> pVerId1, Field<? extends Number> pOffrPerdIdFrom2, Field<? extends Number> pOffrPerdIdTo2, Field<? extends Number> pVerId2, Field<? extends Number> pOffsetMin, Field<? extends Number> pOffsetMax, Field<String> pUsCurrency) {
		GetRows f = new GetRows();
		f.setPMrktId(pMrktId);
		f.setPVehIdList(pVehIdList);
		f.setPBrchrPlcmtIdList(pBrchrPlcmtIdList);
		f.setPOffrPerdIdFrom1(pOffrPerdIdFrom1);
		f.setPOffrPerdIdTo1(pOffrPerdIdTo1);
		f.setPVerId1(pVerId1);
		f.setPOffrPerdIdFrom2(pOffrPerdIdFrom2);
		f.setPOffrPerdIdTo2(pOffrPerdIdTo2);
		f.setPVerId2(pVerId2);
		f.setPOffsetMin(pOffsetMin);
		f.setPOffsetMax(pOffsetMax);
		f.setPUsCurrency(pUsCurrency);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_ENERGY_CHART.GET_VALID_OFFSETS_TXT</code>
	 */
	public static String getValidOffsetsTxt(Configuration configuration, Number pMrktId, Number pFromOffrPerdId, Number pToOffrPerdId, Number pMinOffset, Number pMaxOffset, Number pCoo, String pPerdTyp) {
		GetValidOffsetsTxt f = new GetValidOffsetsTxt();
		f.setPMrktId(pMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCoo(pCoo);
		f.setPPerdTyp(pPerdTyp);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_ENERGY_CHART.GET_VALID_OFFSETS_TXT</code> as a field.
	 */
	public static Field<String> getValidOffsetsTxt(Number pMrktId, Number pFromOffrPerdId, Number pToOffrPerdId, Number pMinOffset, Number pMaxOffset, Number pCoo, String pPerdTyp) {
		GetValidOffsetsTxt f = new GetValidOffsetsTxt();
		f.setPMrktId(pMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCoo(pCoo);
		f.setPPerdTyp(pPerdTyp);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_ENERGY_CHART.GET_VALID_OFFSETS_TXT</code> as a field.
	 */
	public static Field<String> getValidOffsetsTxt(Field<? extends Number> pMrktId, Field<? extends Number> pFromOffrPerdId, Field<? extends Number> pToOffrPerdId, Field<? extends Number> pMinOffset, Field<? extends Number> pMaxOffset, Field<? extends Number> pCoo, Field<String> pPerdTyp) {
		GetValidOffsetsTxt f = new GetValidOffsetsTxt();
		f.setPMrktId(pMrktId);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPMinOffset(pMinOffset);
		f.setPMaxOffset(pMaxOffset);
		f.setPCoo(pCoo);
		f.setPPerdTyp(pPerdTyp);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private RepEnergyChart() {
		super("REP_ENERGY_CHART", Wetrn.WETRN);
	}
}