/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.rep_main.GetLatestLineNr;
import org.jooq.packages.rep_main.GetPerdList;
import org.jooq.packages.rep_main.GetRowsBiDynamic;
import org.jooq.packages.rep_main.GetRowsBlDynamic;
import org.jooq.packages.rep_main.GetRowsCooDynamic;
import org.jooq.packages.rep_main.GetRowsCosDynamic;
import org.jooq.packages.rep_main.GetRowsProdDynamic1;
import org.jooq.packages.rep_main.GetRowsProdDynamic2;
import org.jooq.packages.rep_main.InList;


/**
 * Convenience access to all stored procedures and functions in REP_MAIN
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RepMain extends PackageImpl {

	private static final long serialVersionUID = -1994594980;

	/**
	 * The reference instance of <code>WETRN.REP_MAIN</code>
	 */
	public static final RepMain REP_MAIN = new RepMain();

	/**
	 * Call <code>WETRN.REP_MAIN.GET_LATEST_LINE_NR</code>
	 */
	public static String getLatestLineNr(Configuration configuration, Number pSkuId) {
		GetLatestLineNr f = new GetLatestLineNr();
		f.setPSkuId(pSkuId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_LATEST_LINE_NR</code> as a field.
	 */
	public static Field<String> getLatestLineNr(Number pSkuId) {
		GetLatestLineNr f = new GetLatestLineNr();
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_LATEST_LINE_NR</code> as a field.
	 */
	public static Field<String> getLatestLineNr(Field<? extends Number> pSkuId) {
		GetLatestLineNr f = new GetLatestLineNr();
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_MAIN.GET_PERD_LIST</code>
	 */
	public static Object getPerdList(Configuration configuration, Number pMrktId, Number pFromPerdId, Number pToPerdId) {
		GetPerdList f = new GetPerdList();
		f.setPMrktId(pMrktId);
		f.setPFromPerdId(pFromPerdId);
		f.setPToPerdId(pToPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_PERD_LIST</code> as a field.
	 */
	public static Field<Object> getPerdList(Number pMrktId, Number pFromPerdId, Number pToPerdId) {
		GetPerdList f = new GetPerdList();
		f.setPMrktId(pMrktId);
		f.setPFromPerdId(pFromPerdId);
		f.setPToPerdId(pToPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_PERD_LIST</code> as a field.
	 */
	public static Field<Object> getPerdList(Field<? extends Number> pMrktId, Field<? extends Number> pFromPerdId, Field<? extends Number> pToPerdId) {
		GetPerdList f = new GetPerdList();
		f.setPMrktId(pMrktId);
		f.setPFromPerdId(pFromPerdId);
		f.setPToPerdId(pToPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_MAIN.GET_ROWS_BI_DYNAMIC</code>
	 */
	public static Object getRowsBiDynamic(Configuration configuration, String pMrktIdList, Number pFromPerdId, Number pToPerdId, String pVehIdList, String pFsc, String pSkuId) {
		GetRowsBiDynamic f = new GetRowsBiDynamic();
		f.setPMrktIdList(pMrktIdList);
		f.setPFromPerdId(pFromPerdId);
		f.setPToPerdId(pToPerdId);
		f.setPVehIdList(pVehIdList);
		f.setPFsc(pFsc);
		f.setPSkuId(pSkuId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_ROWS_BI_DYNAMIC</code> as a field.
	 */
	public static Field<Object> getRowsBiDynamic(String pMrktIdList, Number pFromPerdId, Number pToPerdId, String pVehIdList, String pFsc, String pSkuId) {
		GetRowsBiDynamic f = new GetRowsBiDynamic();
		f.setPMrktIdList(pMrktIdList);
		f.setPFromPerdId(pFromPerdId);
		f.setPToPerdId(pToPerdId);
		f.setPVehIdList(pVehIdList);
		f.setPFsc(pFsc);
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_ROWS_BI_DYNAMIC</code> as a field.
	 */
	public static Field<Object> getRowsBiDynamic(Field<String> pMrktIdList, Field<? extends Number> pFromPerdId, Field<? extends Number> pToPerdId, Field<String> pVehIdList, Field<String> pFsc, Field<String> pSkuId) {
		GetRowsBiDynamic f = new GetRowsBiDynamic();
		f.setPMrktIdList(pMrktIdList);
		f.setPFromPerdId(pFromPerdId);
		f.setPToPerdId(pToPerdId);
		f.setPVehIdList(pVehIdList);
		f.setPFsc(pFsc);
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_MAIN.GET_ROWS_BL_DYNAMIC</code>
	 */
	public static Object getRowsBlDynamic(Configuration configuration, String pMrktIdList, Number pFromPerdId, Number pToPerdId, String pVehIdList, String pFsc, String pSkuId) {
		GetRowsBlDynamic f = new GetRowsBlDynamic();
		f.setPMrktIdList(pMrktIdList);
		f.setPFromPerdId(pFromPerdId);
		f.setPToPerdId(pToPerdId);
		f.setPVehIdList(pVehIdList);
		f.setPFsc(pFsc);
		f.setPSkuId(pSkuId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_ROWS_BL_DYNAMIC</code> as a field.
	 */
	public static Field<Object> getRowsBlDynamic(String pMrktIdList, Number pFromPerdId, Number pToPerdId, String pVehIdList, String pFsc, String pSkuId) {
		GetRowsBlDynamic f = new GetRowsBlDynamic();
		f.setPMrktIdList(pMrktIdList);
		f.setPFromPerdId(pFromPerdId);
		f.setPToPerdId(pToPerdId);
		f.setPVehIdList(pVehIdList);
		f.setPFsc(pFsc);
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_ROWS_BL_DYNAMIC</code> as a field.
	 */
	public static Field<Object> getRowsBlDynamic(Field<String> pMrktIdList, Field<? extends Number> pFromPerdId, Field<? extends Number> pToPerdId, Field<String> pVehIdList, Field<String> pFsc, Field<String> pSkuId) {
		GetRowsBlDynamic f = new GetRowsBlDynamic();
		f.setPMrktIdList(pMrktIdList);
		f.setPFromPerdId(pFromPerdId);
		f.setPToPerdId(pToPerdId);
		f.setPVehIdList(pVehIdList);
		f.setPFsc(pFsc);
		f.setPSkuId(pSkuId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_MAIN.GET_ROWS_COO_DYNAMIC</code>
	 */
	public static Object getRowsCooDynamic(Configuration configuration, Number pMrktId, String pVehIdList, Number pFromOffrPerdId, Number pToOffrPerdId, Number pVerId, Number pSlsTypId) {
		GetRowsCooDynamic f = new GetRowsCooDynamic();
		f.setPMrktId(pMrktId);
		f.setPVehIdList(pVehIdList);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPVerId(pVerId);
		f.setPSlsTypId(pSlsTypId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_ROWS_COO_DYNAMIC</code> as a field.
	 */
	public static Field<Object> getRowsCooDynamic(Number pMrktId, String pVehIdList, Number pFromOffrPerdId, Number pToOffrPerdId, Number pVerId, Number pSlsTypId) {
		GetRowsCooDynamic f = new GetRowsCooDynamic();
		f.setPMrktId(pMrktId);
		f.setPVehIdList(pVehIdList);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPVerId(pVerId);
		f.setPSlsTypId(pSlsTypId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_ROWS_COO_DYNAMIC</code> as a field.
	 */
	public static Field<Object> getRowsCooDynamic(Field<? extends Number> pMrktId, Field<String> pVehIdList, Field<? extends Number> pFromOffrPerdId, Field<? extends Number> pToOffrPerdId, Field<? extends Number> pVerId, Field<? extends Number> pSlsTypId) {
		GetRowsCooDynamic f = new GetRowsCooDynamic();
		f.setPMrktId(pMrktId);
		f.setPVehIdList(pVehIdList);
		f.setPFromOffrPerdId(pFromOffrPerdId);
		f.setPToOffrPerdId(pToOffrPerdId);
		f.setPVerId(pVerId);
		f.setPSlsTypId(pSlsTypId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_MAIN.GET_ROWS_COS_DYNAMIC</code>
	 */
	public static Object getRowsCosDynamic(Configuration configuration, Number pMrktId, String pVehIdList, Number pFromSlsPerdId, Number pToSlsPerdId, Number pVerId, Number pSlsTypId) {
		GetRowsCosDynamic f = new GetRowsCosDynamic();
		f.setPMrktId(pMrktId);
		f.setPVehIdList(pVehIdList);
		f.setPFromSlsPerdId(pFromSlsPerdId);
		f.setPToSlsPerdId(pToSlsPerdId);
		f.setPVerId(pVerId);
		f.setPSlsTypId(pSlsTypId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_ROWS_COS_DYNAMIC</code> as a field.
	 */
	public static Field<Object> getRowsCosDynamic(Number pMrktId, String pVehIdList, Number pFromSlsPerdId, Number pToSlsPerdId, Number pVerId, Number pSlsTypId) {
		GetRowsCosDynamic f = new GetRowsCosDynamic();
		f.setPMrktId(pMrktId);
		f.setPVehIdList(pVehIdList);
		f.setPFromSlsPerdId(pFromSlsPerdId);
		f.setPToSlsPerdId(pToSlsPerdId);
		f.setPVerId(pVerId);
		f.setPSlsTypId(pSlsTypId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_ROWS_COS_DYNAMIC</code> as a field.
	 */
	public static Field<Object> getRowsCosDynamic(Field<? extends Number> pMrktId, Field<String> pVehIdList, Field<? extends Number> pFromSlsPerdId, Field<? extends Number> pToSlsPerdId, Field<? extends Number> pVerId, Field<? extends Number> pSlsTypId) {
		GetRowsCosDynamic f = new GetRowsCosDynamic();
		f.setPMrktId(pMrktId);
		f.setPVehIdList(pVehIdList);
		f.setPFromSlsPerdId(pFromSlsPerdId);
		f.setPToSlsPerdId(pToSlsPerdId);
		f.setPVerId(pVerId);
		f.setPSlsTypId(pSlsTypId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC</code>
	 */
	public static Object getRowsProdDynamic1(Configuration configuration, Number pMrktId, Number pRefPerdId, String pSubBrndIdList, String pBrndIdList, String pSgmtIdList, String pCatgryIdList, String pProdTypIdList, String pFormIdList, String pFormGrpIdList, String pGendrIdList, String pSlsClsCdList) {
		GetRowsProdDynamic1 f = new GetRowsProdDynamic1();
		f.setPMrktId(pMrktId);
		f.setPRefPerdId(pRefPerdId);
		f.setPSubBrndIdList(pSubBrndIdList);
		f.setPBrndIdList(pBrndIdList);
		f.setPSgmtIdList(pSgmtIdList);
		f.setPCatgryIdList(pCatgryIdList);
		f.setPProdTypIdList(pProdTypIdList);
		f.setPFormIdList(pFormIdList);
		f.setPFormGrpIdList(pFormGrpIdList);
		f.setPGendrIdList(pGendrIdList);
		f.setPSlsClsCdList(pSlsClsCdList);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC</code> as a field.
	 */
	public static Field<Object> getRowsProdDynamic1(Number pMrktId, Number pRefPerdId, String pSubBrndIdList, String pBrndIdList, String pSgmtIdList, String pCatgryIdList, String pProdTypIdList, String pFormIdList, String pFormGrpIdList, String pGendrIdList, String pSlsClsCdList) {
		GetRowsProdDynamic1 f = new GetRowsProdDynamic1();
		f.setPMrktId(pMrktId);
		f.setPRefPerdId(pRefPerdId);
		f.setPSubBrndIdList(pSubBrndIdList);
		f.setPBrndIdList(pBrndIdList);
		f.setPSgmtIdList(pSgmtIdList);
		f.setPCatgryIdList(pCatgryIdList);
		f.setPProdTypIdList(pProdTypIdList);
		f.setPFormIdList(pFormIdList);
		f.setPFormGrpIdList(pFormGrpIdList);
		f.setPGendrIdList(pGendrIdList);
		f.setPSlsClsCdList(pSlsClsCdList);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC</code> as a field.
	 */
	public static Field<Object> getRowsProdDynamic1(Field<? extends Number> pMrktId, Field<? extends Number> pRefPerdId, Field<String> pSubBrndIdList, Field<String> pBrndIdList, Field<String> pSgmtIdList, Field<String> pCatgryIdList, Field<String> pProdTypIdList, Field<String> pFormIdList, Field<String> pFormGrpIdList, Field<String> pGendrIdList, Field<String> pSlsClsCdList) {
		GetRowsProdDynamic1 f = new GetRowsProdDynamic1();
		f.setPMrktId(pMrktId);
		f.setPRefPerdId(pRefPerdId);
		f.setPSubBrndIdList(pSubBrndIdList);
		f.setPBrndIdList(pBrndIdList);
		f.setPSgmtIdList(pSgmtIdList);
		f.setPCatgryIdList(pCatgryIdList);
		f.setPProdTypIdList(pProdTypIdList);
		f.setPFormIdList(pFormIdList);
		f.setPFormGrpIdList(pFormGrpIdList);
		f.setPGendrIdList(pGendrIdList);
		f.setPSlsClsCdList(pSlsClsCdList);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC</code>
	 */
	public static Object getRowsProdDynamic2(Configuration configuration, Number pMrktId, Number pRefPerdId, String pSubBrndIdList, String pBrndIdList, String pSgmtIdList, String pCatgryIdList, String pProdTypIdList, String pFormIdList, String pFormGrpIdList, String pGendrIdList, String pSlsClsCdList, String pUnplndItmsInd) {
		GetRowsProdDynamic2 f = new GetRowsProdDynamic2();
		f.setPMrktId(pMrktId);
		f.setPRefPerdId(pRefPerdId);
		f.setPSubBrndIdList(pSubBrndIdList);
		f.setPBrndIdList(pBrndIdList);
		f.setPSgmtIdList(pSgmtIdList);
		f.setPCatgryIdList(pCatgryIdList);
		f.setPProdTypIdList(pProdTypIdList);
		f.setPFormIdList(pFormIdList);
		f.setPFormGrpIdList(pFormGrpIdList);
		f.setPGendrIdList(pGendrIdList);
		f.setPSlsClsCdList(pSlsClsCdList);
		f.setPUnplndItmsInd(pUnplndItmsInd);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC</code> as a field.
	 */
	public static Field<Object> getRowsProdDynamic2(Number pMrktId, Number pRefPerdId, String pSubBrndIdList, String pBrndIdList, String pSgmtIdList, String pCatgryIdList, String pProdTypIdList, String pFormIdList, String pFormGrpIdList, String pGendrIdList, String pSlsClsCdList, String pUnplndItmsInd) {
		GetRowsProdDynamic2 f = new GetRowsProdDynamic2();
		f.setPMrktId(pMrktId);
		f.setPRefPerdId(pRefPerdId);
		f.setPSubBrndIdList(pSubBrndIdList);
		f.setPBrndIdList(pBrndIdList);
		f.setPSgmtIdList(pSgmtIdList);
		f.setPCatgryIdList(pCatgryIdList);
		f.setPProdTypIdList(pProdTypIdList);
		f.setPFormIdList(pFormIdList);
		f.setPFormGrpIdList(pFormGrpIdList);
		f.setPGendrIdList(pGendrIdList);
		f.setPSlsClsCdList(pSlsClsCdList);
		f.setPUnplndItmsInd(pUnplndItmsInd);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.GET_ROWS_PROD_DYNAMIC</code> as a field.
	 */
	public static Field<Object> getRowsProdDynamic2(Field<? extends Number> pMrktId, Field<? extends Number> pRefPerdId, Field<String> pSubBrndIdList, Field<String> pBrndIdList, Field<String> pSgmtIdList, Field<String> pCatgryIdList, Field<String> pProdTypIdList, Field<String> pFormIdList, Field<String> pFormGrpIdList, Field<String> pGendrIdList, Field<String> pSlsClsCdList, Field<String> pUnplndItmsInd) {
		GetRowsProdDynamic2 f = new GetRowsProdDynamic2();
		f.setPMrktId(pMrktId);
		f.setPRefPerdId(pRefPerdId);
		f.setPSubBrndIdList(pSubBrndIdList);
		f.setPBrndIdList(pBrndIdList);
		f.setPSgmtIdList(pSgmtIdList);
		f.setPCatgryIdList(pCatgryIdList);
		f.setPProdTypIdList(pProdTypIdList);
		f.setPFormIdList(pFormIdList);
		f.setPFormGrpIdList(pFormGrpIdList);
		f.setPGendrIdList(pGendrIdList);
		f.setPSlsClsCdList(pSlsClsCdList);
		f.setPUnplndItmsInd(pUnplndItmsInd);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.REP_MAIN.IN_LIST</code>
	 */
	public static Object inList(Configuration configuration, String pString) {
		InList f = new InList();
		f.setPString(pString);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.IN_LIST</code> as a field.
	 */
	public static Field<Object> inList(String pString) {
		InList f = new InList();
		f.setPString(pString);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.REP_MAIN.IN_LIST</code> as a field.
	 */
	public static Field<Object> inList(Field<String> pString) {
		InList f = new InList();
		f.setPString(pString);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private RepMain() {
		super("REP_MAIN", Wetrn.WETRN);
	}
}