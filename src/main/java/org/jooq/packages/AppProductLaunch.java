/**
 * This class is generated by jOOQ
 */
package org.jooq.packages;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Wetrn;
import org.jooq.impl.PackageImpl;
import org.jooq.packages.app_product_launch.GetData;
import org.jooq.packages.app_product_launch.GetMetricsDataForHeader;
import org.jooq.packages.app_product_launch.SetSku;
import org.jooq.packages.app_product_launch.SetSlsCls;
import org.jooq.packages.app_product_launch.SetVeh;


/**
 * Convenience access to all stored procedures and functions in APP_PRODUCT_LAUNCH
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppProductLaunch extends PackageImpl {

	private static final long serialVersionUID = 210087192;

	/**
	 * The reference instance of <code>WETRN.APP_PRODUCT_LAUNCH</code>
	 */
	public static final AppProductLaunch APP_PRODUCT_LAUNCH = new AppProductLaunch();

	/**
	 * Call <code>WETRN.APP_PRODUCT_LAUNCH.GET_DATA</code>
	 */
	public static Object getData(Configuration configuration, Number pmrktId, Number pprflCd, String pskuId, Number prefPerdId) {
		GetData f = new GetData();
		f.setPmrktId(pmrktId);
		f.setPprflCd(pprflCd);
		f.setPskuId(pskuId);
		f.setPrefPerdId(prefPerdId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_PRODUCT_LAUNCH.GET_DATA</code> as a field.
	 */
	public static Field<Object> getData(Number pmrktId, Number pprflCd, String pskuId, Number prefPerdId) {
		GetData f = new GetData();
		f.setPmrktId(pmrktId);
		f.setPprflCd(pprflCd);
		f.setPskuId(pskuId);
		f.setPrefPerdId(prefPerdId);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_PRODUCT_LAUNCH.GET_DATA</code> as a field.
	 */
	public static Field<Object> getData(Field<? extends Number> pmrktId, Field<? extends Number> pprflCd, Field<String> pskuId, Field<? extends Number> prefPerdId) {
		GetData f = new GetData();
		f.setPmrktId(pmrktId);
		f.setPprflCd(pprflCd);
		f.setPskuId(pskuId);
		f.setPrefPerdId(prefPerdId);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_PRODUCT_LAUNCH.GET_METRICS_DATA_FOR_HEADER</code>
	 */
	public static Object getMetricsDataForHeader(Configuration configuration, Number pmrktId, Number pprflCd) {
		GetMetricsDataForHeader f = new GetMetricsDataForHeader();
		f.setPmrktId(pmrktId);
		f.setPprflCd(pprflCd);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_PRODUCT_LAUNCH.GET_METRICS_DATA_FOR_HEADER</code> as a field.
	 */
	public static Field<Object> getMetricsDataForHeader(Number pmrktId, Number pprflCd) {
		GetMetricsDataForHeader f = new GetMetricsDataForHeader();
		f.setPmrktId(pmrktId);
		f.setPprflCd(pprflCd);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_PRODUCT_LAUNCH.GET_METRICS_DATA_FOR_HEADER</code> as a field.
	 */
	public static Field<Object> getMetricsDataForHeader(Field<? extends Number> pmrktId, Field<? extends Number> pprflCd) {
		GetMetricsDataForHeader f = new GetMetricsDataForHeader();
		f.setPmrktId(pmrktId);
		f.setPprflCd(pprflCd);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_PRODUCT_LAUNCH.SET_SKU</code>
	 */
	public static Object setSku(Configuration configuration, Object dataRecord, Object skuTable) {
		SetSku f = new SetSku();
		f.setDataRecord(dataRecord);
		f.setSkuTable(skuTable);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_PRODUCT_LAUNCH.SET_SKU</code> as a field.
	 */
	public static Field<Object> setSku(Object dataRecord, Object skuTable) {
		SetSku f = new SetSku();
		f.setDataRecord(dataRecord);
		f.setSkuTable(skuTable);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_PRODUCT_LAUNCH.SET_SKU</code> as a field.
	 */
	public static Field<Object> setSku(Field<Object> dataRecord, Field<Object> skuTable) {
		SetSku f = new SetSku();
		f.setDataRecord(dataRecord);
		f.setSkuTable(skuTable);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_PRODUCT_LAUNCH.SET_SLS_CLS</code>
	 */
	public static Object setSlsCls(Configuration configuration, Object dataRecord, Object slsClsTable) {
		SetSlsCls f = new SetSlsCls();
		f.setDataRecord(dataRecord);
		f.setSlsClsTable(slsClsTable);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_PRODUCT_LAUNCH.SET_SLS_CLS</code> as a field.
	 */
	public static Field<Object> setSlsCls(Object dataRecord, Object slsClsTable) {
		SetSlsCls f = new SetSlsCls();
		f.setDataRecord(dataRecord);
		f.setSlsClsTable(slsClsTable);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_PRODUCT_LAUNCH.SET_SLS_CLS</code> as a field.
	 */
	public static Field<Object> setSlsCls(Field<Object> dataRecord, Field<Object> slsClsTable) {
		SetSlsCls f = new SetSlsCls();
		f.setDataRecord(dataRecord);
		f.setSlsClsTable(slsClsTable);

		return f.asField();
	}

	/**
	 * Call <code>WETRN.APP_PRODUCT_LAUNCH.SET_VEH</code>
	 */
	public static Object setVeh(Configuration configuration, Object dataRecord, Object vehTable) {
		SetVeh f = new SetVeh();
		f.setDataRecord(dataRecord);
		f.setVehTable(vehTable);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>WETRN.APP_PRODUCT_LAUNCH.SET_VEH</code> as a field.
	 */
	public static Field<Object> setVeh(Object dataRecord, Object vehTable) {
		SetVeh f = new SetVeh();
		f.setDataRecord(dataRecord);
		f.setVehTable(vehTable);

		return f.asField();
	}

	/**
	 * Get <code>WETRN.APP_PRODUCT_LAUNCH.SET_VEH</code> as a field.
	 */
	public static Field<Object> setVeh(Field<Object> dataRecord, Field<Object> vehTable) {
		SetVeh f = new SetVeh();
		f.setDataRecord(dataRecord);
		f.setVehTable(vehTable);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private AppProductLaunch() {
		super("APP_PRODUCT_LAUNCH", Wetrn.WETRN);
	}
}