package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.startup.fO.uBHp;
import androidx.viewpager2.widget.oTG.RZmOSvivbLdu;
import com.androidmodule.camerax.views.BA.GBTljJJcQz;
import com.onesignal.core.services.xoOP.QRjU;
import com.onesignal.notifications.Yn.xZxmrde;
import defpackage.st2;

/* JADX INFO: loaded from: classes.dex */
public class AllAdsApproval {
    public static boolean iSAddRecScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.ADD_REC_SCREEN_BANNER == 1;
    }

    public static boolean iSAppFeatureAPPOpen(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.APP_FEATURE_SCREEN_APP_OPEN == 1;
    }

    public static boolean iSAppFeatureBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.APP_FEATURE_SCREEN_BANNER == 1;
    }

    public static boolean iSAppThemeSettingScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.APP_THEME_SCREEN_BANNER == 1;
    }

    public static boolean iSBefAftReportingFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.BEF_AFT_REPORTING_SCREEN_FS == 1;
    }

    public static boolean iSBefAftSettingScreenFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.BEF_AFT_SETTING_SCREEN_FS == 1;
    }

    public static boolean iSCommonAppOpen(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.COMMON_APP_OPEN == 1;
    }

    public static boolean iSCustomDateBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.CUSTOM_DATETIME_SCREEN_BANNER == 1;
    }

    public static boolean iSEmailSettingScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.EMAIL_SETTING_SCREEN_BANNER == 1;
    }

    public static boolean iSEmailSettingScreenFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, QRjU.wPlKgpksZRCGr);
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.EMAIL_SETTING_SCREEN_FS == 1;
    }

    public static boolean iSExitNative(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.EXIT_NATIVE == 1;
    }

    public static boolean iSFAQScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.LOCATION_FAQ_SCREEN_BANNER == 1;
    }

    public static boolean iSFAQScreenNative(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.FAQ_SCREEN_NATIVE == 1;
    }

    public static boolean iSFileNameBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, GBTljJJcQz.FTcWOJc, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.FILENAME_SCREEN_BANNER == 1;
    }

    public static boolean iSFileNameFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String str = RZmOSvivbLdu.XHjhkqfHAu;
        String strK = st2.k(context, context, SP.ADS_STATUS, str);
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals(str) && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.FILENAME_SCREEN_FS == 1;
    }

    public static boolean iSFolderBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.FOLDER_SCREEN_BANNER == 1;
    }

    public static boolean iSFolderFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.FOLDER_SCREEN_FS == 1;
    }

    public static boolean iSGDFolderBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.GD_FOLDER_SCREEN_BANNER == 1;
    }

    public static boolean iSGDFolderFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.GD_FOLDER_SCREEN_FS == 1;
    }

    public static boolean iSGalleryBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.GALLERY_SCREEN_BANNER == 1;
    }

    public static boolean iSGalleryFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.GALLERY_SCREEN_FS == 1;
    }

    public static boolean iSHomeBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.HOME_SCREEN_BANNER == 1;
    }

    public static boolean iSImageClusterBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.IMAGE_CLUSTER_SCREEN_BANNER == 1;
    }

    public static boolean iSImageClusterFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.IMAGE_CLUSTER_SCREEN_FS == 1;
    }

    public static boolean iSImgQualityScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.IMG_QUALITY_SCREEN_BANNER == 1;
    }

    public static boolean iSLanguageBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.LANGUAGE_SCREEN_BANNER == 1;
    }

    public static boolean iSLanguageScreenFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.LANGUAGE_BACK_SCREEN_FS == 1;
    }

    public static boolean iSMainRecScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.MAIN_REC_SCREEN_BANNER == 1;
    }

    public static boolean iSMapdataFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.MAP_DATA_SCREEN_FS == 1;
    }

    public static boolean iSMyFilesBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.MY_FILES_SCREEN_BANNER == 1;
    }

    public static boolean iSMyFilesFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.MY_FILES_SCREEN_FS == 1;
    }

    public static boolean iSOnboardNative(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.ONBOARD_NATIVE == 1;
    }

    public static boolean iSPDFReportingFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.PDF_REPORTING_SCREEN_FS == 1;
    }

    public static boolean iSPDFSettingScreenFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.PDF_SETTING_SCREEN_FS == 1;
    }

    public static boolean iSPermissionBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.PERMISSION_SCREEN_BANNER == 1;
    }

    public static boolean iSPreviewBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.PREVIEW_SCREEN_BANNER == 1;
    }

    public static boolean iSReportingFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.REPORTING_SCREEN_FS == 1;
    }

    public static boolean iSSettingOptionScreenFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.SETTING_OPTION_BACK_SCREEN_FS == 1;
    }

    public static boolean iSSettingScreenFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.SETTING_SCREEN_FS == 1;
    }

    public static boolean iSSettingSelectionBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.SETTING_SCREEN_BANNER == 1;
    }

    public static boolean iSSplashBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.SPLASH_SCREEN_BANNER == 1;
    }

    public static boolean iSSplashFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        RemoteAdData.SPLASH_SCREEN_FS = new SP(context).getInteger(context, HelperClass.SPLASH_SCREEN_AD, 1);
        RemoteAdData.SPLASH_SCREEN_FS_TYPE = new SP(context).getInteger(context, HelperClass.SPLASH_SCREEN_AD_TYPE, 1);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.SPLASH_SCREEN_FS == 1;
    }

    public static boolean iSStampColorBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.STAMP_COLOR_SCREEN_BANNER == 1;
    }

    public static boolean iSTemplateOrientationScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.TEMPLATE_ORIENTATION_SCREEN_BANNER == 1;
    }

    public static boolean iSTemplateSelectionBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.TEMPLATE_SELECTION_SCREEN_BANNER == 1;
    }

    public static boolean iSTemplateSelectionFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.TEMPLATE_SELECTION_SCREEN_FS == 1;
    }

    public static boolean iSTemplateSettingBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.TEMPLATE_SETTING_SCREEN_BANNER == 1;
    }

    public static boolean iSTemplateSettingScreenFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.TEMPLATE_EDIT_SCREEN_FS == 1;
    }

    public static boolean iSTouchSettingScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.TOUCH_SETTING_SCREEN_BANNER == 1;
    }

    public static boolean iSUserManualAnswerScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String str = uBHp.lzLbUHOt;
        String strK = st2.k(context, context, SP.ADS_STATUS, str);
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, xZxmrde.KNPUVIJhKgYby);
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals(str) && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.USER_MANUAL_ANSWER_SCREEN_BANNER == 1;
    }

    public static boolean iSUserManualAnswerScreenFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.USER_MANUAL_ANSWER_SCREEN_BACK_FS == 1;
    }

    public static boolean iSUserManualScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.USER_MANUAL_SCREEN_BANNER == 1;
    }

    public static boolean iSUserManualScreenFS(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.USER_MANUAL_SCREEN_BACK_FS == 1;
    }

    public static boolean iSVidQualityScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.VID_QUALITY_SCREEN_BANNER == 1;
    }

    public static boolean iSVideoScreenNative(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.VIDEO_TUTORIAL_SCREEN_NATIVE == 1;
    }

    public static boolean iSVolSettingScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.VOLUME_SETTING_SCREEN_BANNER == 1;
    }

    public static boolean iSmapdataBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.MAP_DATA_SCREEN_BANNER == 1;
    }

    public static boolean isAccountDetailScreenBaner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.ACCOUNT_DETAIL_SCREEN_BANNER == 1;
    }

    public static boolean isBefAftPDFSettingSmallNative(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.BEF_AFT_SETTING_SCREEN_NATIVE == 1;
    }

    public static boolean isBefAftReportingScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.BEF_AFT_REPORTING_SCREEN_BANNER == 1;
    }

    public static boolean isCollectionGalleryBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.COLLECTION_GALLERY_SCREEN_BANNER == 1;
    }

    public static boolean isCollectionMediaViewerBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.COLLECTION_MEDIA_VIEWER_SCREEN_BANNER == 1;
    }

    public static boolean isCollectionSingleFolderBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.COLLECTION_SINGLE_FOLDER_SCREEN_BANNER == 1;
    }

    public static boolean isCollectionVideoPlayerBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.COLLECTION_VIDEO_PLAYER_SCREEN_BANNER == 1;
    }

    public static boolean isNoteScreenNative(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.NOTE_SCREEN_NATIVE == 1;
    }

    public static boolean isPDFReportingScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.PDF_REPORTING_SCREEN_BANNER == 1;
    }

    public static boolean isPDFSettingSmallNative(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.PDF_SETTING_SCREEN_NATIVE == 1;
    }

    public static boolean isPro(Context context) {
        return new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
    }

    public static boolean isReportingScreenBanner(Context context) {
        NetworkCapabilities networkCapabilities;
        String strK = st2.k(context, context, SP.ADS_STATUS, "1");
        boolean z = new SP(context).getBoolean(context, HelperClass.IS_PURCHESH_OR_NOT, false) || new SP(context).getBoolean(context, HelperClass.IS_SUBSCRIBE, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) st2.i(context, "connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return ((activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) ? networkCapabilities.hasCapability(12) : false) && strK.equals("1") && !z && RemoteAdData.ADS_NETWORK_TYPE != 0 && RemoteAdData.REPORTING_SCREEN_BANNER == 1;
    }
}