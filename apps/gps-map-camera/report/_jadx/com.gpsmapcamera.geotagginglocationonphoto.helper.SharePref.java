package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.camera.core.internal.compat.quirk.Je.zXAusrmFrBIQHr;
import androidx.core.content.kG.ctcdTNpUjlfYHm;
import com.androidmodule.camerax.views.BA.GBTljJJcQz;
import com.facebook.share.Hueb.CvmpVJvatR;
import com.google.android.gms.ads.mediation.rvI.zUHsDp;
import com.gpsmapcamera.geotagginglocationonphoto.activity.fK.sKkO;
import com.gpsmapcamera.geotagginglocationonphoto.model.DateTime;
import com.itextpdf.text.pdf.fonts.otf.lujf.ZPpqUfsYTcWxP;
import defpackage.vz6;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SharePref {
    public static String KEY_DATE_SHORTCUT = "shortcut_date";
    public static final String KEY_SHORTCUT_FIRST = "shortcut_first";
    public static String KEY_USER_GPS_INTERNET_NOTIFY = "user_gps_internet_notify";
    public static final String arryDates = "arrayDate";
    public static final String arryDates_first = "arrayDate_first";
    public static final String arryDates_horizontal = "arrayDate_horizontal";
    public static final String arryDates_vertical = "arrayDate_vertical";
    public static final String fBanner = "fBanner";
    public static final String fontArray = "fontArray";
    public static final String imagename = "logo1";
    public static final String logoselect_first = "logoselect_first";
    public static final String sdcard = "sdcard";
    public static final String tooltip_logo = "tooltip_logo";
    SharedPreferences.Editor moEditor;
    public SharedPreferences moSharedPreferences;
    public final String setFormatPref = "setformate";
    private final String h1Tag = "Horizontal1";
    private final String h2Tag = "Horizontal2";
    private final String h3Tag = "Horizontal3";
    private final String h4Tag = "Horizontal4";
    private final String h5Tag = "Horizontal5";
    private final String h6Tag = "Horizontal6";
    private final String h7Tag = "Horizontal7";
    private final String h8Tag = "Horizontal8";
    private final String h9Tag = "Horizontal9";
    private final String h10Tag = "Horizonta110";
    private final String h11Tag = "Horizontal11";
    private final String h12Tag = "Horizontal12";
    private final String h13Tag = "Horizontal13";
    private final String h14Tag = "Horizontal14";
    private final String h15Tag = "Horizontal15";
    private final String h16Tag = "Horizontal16";
    private final String vline1Tag = "Verticalline1Spinner1";
    private final String v2ine1Tag = "Verticalline1Spinner2";
    private final String v3ine1Tag = "Verticalline1Spinner3";
    private final String v4ine1Tag = "Verticalline1Spinner4";
    private final String v5ine1Tag = "Verticalline1Spinner5";
    private final String v6ine1Tag = "Verticalline1Spinner6";
    private final String v7ine1Tag = "Verticalline1Spinner7";
    private final String v8ine1Tag = "Verticalline1Spinner8";
    private final String v9ine1Tag = "Verticalline1Spinner9";
    private final String vl0ine1Tag = "Verticalline1Spinner10";
    private final String vl1ine1Tag = "Verticalline1Spinner11";
    private final String vl2ine1Tag = "Verticalline1Spinner12";
    private final String vl3ine1Tag = "Verticalline1Spinner13";
    private final String vl4ine1Tag = "Verticalline1Spinner14";
    private final String vl5ine1Tag = "Verticalline1Spinner15";
    private final String vl6ine1Tag = "Verticalline1Spinner16";
    private final String vline2Tag = "Verticalline2Spinner1";
    private final String v2ine2Tag = "Verticalline2Spinner2";
    private final String v3ine2Tag = "Verticalline2Spinner3";
    private final String v4ine2Tag = zXAusrmFrBIQHr.KjQgTrTg;
    private final String v5ine2Tag = "Verticalline2Spinner5";
    private final String v6ine2Tag = "Verticalline2Spinner6";
    private final String v7ine2Tag = "Verticalline2Spinner7";
    private final String v8ine2Tag = "Verticalline2Spinner8";
    private final String v9ine2Tag = "Verticalline2Spinner9";
    private final String vl0ine2Tag = "Verticalline2Spinner10";
    private final String vl1ine2Tag = "Verticalline2Spinner11";
    private final String vl2ine2Tag = "Verticalline2Spinner12";
    private final String vl3ine2Tag = "Verticalline2Spinner13";
    private final String vl4ine2Tag = "Verticalline2Spinner14";
    private final String vl5ine2Tag = "Verticalline2Spinner15";
    private final String vl6ine2Tag = "Verticalline2Spinner16";
    private final String vline3Tag = "Verticalline3Spinner1";
    private final String v2ine3Tag = "Verticalline3Spinner2";
    private final String v3ine3Tag = "Verticalline3Spinner3";
    private final String v4ine3Tag = "Verticalline3Spinner4";
    private final String v5ine3Tag = "Verticalline3Spinner5";
    private final String v6ine3Tag = "Verticalline3Spinner6";
    private final String v7ine3Tag = "Verticalline3Spinner7";
    private final String v8ine3Tag = "Verticalline3Spinner8";
    private final String v9ine3Tag = "Verticalline3Spinner9";
    private final String vl0ine3Tag = "Verticalline3Spinner10";
    private final String vl1ine3Tag = "Verticalline3Spinner11";
    private final String vl2ine3Tag = "Verticalline3Spinner12";
    private final String vl3ine3Tag = "Verticalline3Spinner13";
    private final String vl4ine3Tag = "Verticalline3Spinner14";
    private final String vl5ine3Tag = "Verticalline3Spinner15";
    private final String vl6ine3Tag = "Verticalline3Spinner16";
    private final String Horizontal = sKkO.xjtGd;
    private final String Vertical = "Vertical";
    private final String rateCount = "RateCount";
    private final String ratePref = "RatePref";

    public SharePref(Context context) {
        if (context != null) {
            this.moSharedPreferences = context.getSharedPreferences("setformate", 0);
        }
    }

    public boolean getBooleanP(String str) {
        return this.moSharedPreferences.getBoolean(str, false);
    }

    public ArrayList<DateTime> getDates(Context context, String str) {
        com.google.gson.a aVar = new com.google.gson.a();
        SharedPreferences sharedPreferences = this.moSharedPreferences;
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences("setformate", 0);
            this.moSharedPreferences = sharedPreferences;
        }
        return (ArrayList) aVar.b(sharedPreferences.getString(str, null), vz6.get(new vz6<ArrayList<DateTime>>() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.SharePref.1
        }.getType()));
    }

    public String getH1() {
        return this.moSharedPreferences.getString("Horizontal1", null);
    }

    public String getH10() {
        return this.moSharedPreferences.getString("Horizonta110", null);
    }

    public String getH11() {
        return this.moSharedPreferences.getString("Horizontal11", null);
    }

    public String getH12() {
        return this.moSharedPreferences.getString("Horizontal12", null);
    }

    public String getH13() {
        return this.moSharedPreferences.getString("Horizontal13", null);
    }

    public String getH14() {
        return this.moSharedPreferences.getString("Horizontal14", null);
    }

    public String getH15() {
        return this.moSharedPreferences.getString("Horizontal15", null);
    }

    public String getH16() {
        return this.moSharedPreferences.getString("Horizontal16", null);
    }

    public String getH2() {
        return this.moSharedPreferences.getString("Horizontal2", null);
    }

    public String getH3() {
        return this.moSharedPreferences.getString("Horizontal3", null);
    }

    public String getH4() {
        return this.moSharedPreferences.getString("Horizontal4", null);
    }

    public String getH5() {
        return this.moSharedPreferences.getString("Horizontal5", null);
    }

    public String getH6() {
        return this.moSharedPreferences.getString("Horizontal6", null);
    }

    public String getH7() {
        return this.moSharedPreferences.getString("Horizontal7", null);
    }

    public String getH8() {
        return this.moSharedPreferences.getString("Horizontal8", null);
    }

    public String getH9() {
        return this.moSharedPreferences.getString("Horizontal9", null);
    }

    public boolean getHorizontal() {
        return this.moSharedPreferences.getBoolean("horizontal", true);
    }

    public int getIntPrefWD(String str, int i) {
        return this.moSharedPreferences.getInt(str, i);
    }

    public int getRateCount() {
        return this.moSharedPreferences.getInt("RateCount", 0);
    }

    public boolean getRatePref() {
        return this.moSharedPreferences.getBoolean("RatePref", false);
    }

    public String getStringOriginal(String str, String str2) {
        return this.moSharedPreferences.getString(str, str2);
    }

    public boolean getStringPref(String str) {
        return this.moSharedPreferences.getBoolean(str, false);
    }

    public boolean getVertical() {
        return this.moSharedPreferences.getBoolean("Vertical", true);
    }

    public String getVlin11S1() {
        return this.moSharedPreferences.getString(ZPpqUfsYTcWxP.QKtMBKlmqY, null);
    }

    public String getVlin11S10() {
        return this.moSharedPreferences.getString("Verticalline1Spinner10", null);
    }

    public String getVlin11S11() {
        return this.moSharedPreferences.getString("Verticalline1Spinner11", null);
    }

    public String getVlin11S12() {
        return this.moSharedPreferences.getString("Verticalline1Spinner12", null);
    }

    public String getVlin11S13() {
        return this.moSharedPreferences.getString("Verticalline1Spinner13", null);
    }

    public String getVlin11S14() {
        return this.moSharedPreferences.getString("Verticalline1Spinner14", null);
    }

    public String getVlin11S15() {
        return this.moSharedPreferences.getString("Verticalline1Spinner15", null);
    }

    public String getVlin11S16() {
        return this.moSharedPreferences.getString("Verticalline1Spinner16", null);
    }

    public String getVlin11S2() {
        return this.moSharedPreferences.getString("Verticalline1Spinner2", null);
    }

    public String getVlin11S3() {
        return this.moSharedPreferences.getString("Verticalline1Spinner3", null);
    }

    public String getVlin11S4() {
        return this.moSharedPreferences.getString("Verticalline1Spinner4", null);
    }

    public String getVlin11S5() {
        return this.moSharedPreferences.getString("Verticalline1Spinner5", null);
    }

    public String getVlin11S6() {
        return this.moSharedPreferences.getString("Verticalline1Spinner6", null);
    }

    public String getVlin11S7() {
        return this.moSharedPreferences.getString("Verticalline1Spinner7", null);
    }

    public String getVlin11S8() {
        return this.moSharedPreferences.getString("Verticalline1Spinner8", null);
    }

    public String getVlin11S9() {
        return this.moSharedPreferences.getString("Verticalline1Spinner9", null);
    }

    public String getVlin21S1() {
        return this.moSharedPreferences.getString("Verticalline2Spinner1", null);
    }

    public String getVlin21S10() {
        return this.moSharedPreferences.getString("Verticalline2Spinner10", null);
    }

    public String getVlin21S11() {
        return this.moSharedPreferences.getString(GBTljJJcQz.YTZesD, null);
    }

    public String getVlin21S12() {
        return this.moSharedPreferences.getString("Verticalline2Spinner12", null);
    }

    public String getVlin21S13() {
        return this.moSharedPreferences.getString("Verticalline2Spinner13", null);
    }

    public String getVlin21S14() {
        return this.moSharedPreferences.getString("Verticalline2Spinner14", null);
    }

    public String getVlin21S15() {
        return this.moSharedPreferences.getString("Verticalline2Spinner15", null);
    }

    public String getVlin21S16() {
        return this.moSharedPreferences.getString("Verticalline2Spinner16", null);
    }

    public String getVlin21S2() {
        return this.moSharedPreferences.getString("Verticalline2Spinner2", null);
    }

    public String getVlin21S3() {
        return this.moSharedPreferences.getString("Verticalline2Spinner3", null);
    }

    public String getVlin21S4() {
        return this.moSharedPreferences.getString("Verticalline2Spinner4", null);
    }

    public String getVlin21S5() {
        return this.moSharedPreferences.getString("Verticalline2Spinner5", null);
    }

    public String getVlin21S6() {
        return this.moSharedPreferences.getString("Verticalline2Spinner6", null);
    }

    public String getVlin21S7() {
        return this.moSharedPreferences.getString("Verticalline2Spinner7", null);
    }

    public String getVlin21S8() {
        return this.moSharedPreferences.getString(zUHsDp.nnqSXX, null);
    }

    public String getVlin21S9() {
        return this.moSharedPreferences.getString("Verticalline2Spinner9", null);
    }

    public String getVlin31S1() {
        return this.moSharedPreferences.getString("Verticalline3Spinner1", null);
    }

    public String getVlin31S10() {
        return this.moSharedPreferences.getString("Verticalline3Spinner10", null);
    }

    public String getVlin31S11() {
        return this.moSharedPreferences.getString("Verticalline3Spinner11", null);
    }

    public String getVlin31S12() {
        return this.moSharedPreferences.getString("Verticalline3Spinner12", null);
    }

    public String getVlin31S13() {
        return this.moSharedPreferences.getString("Verticalline3Spinner13", null);
    }

    public String getVlin31S14() {
        return this.moSharedPreferences.getString("Verticalline3Spinner14", null);
    }

    public String getVlin31S15() {
        return this.moSharedPreferences.getString("Verticalline3Spinner15", null);
    }

    public String getVlin31S16() {
        return this.moSharedPreferences.getString("Verticalline3Spinner16", null);
    }

    public String getVlin31S2() {
        return this.moSharedPreferences.getString("Verticalline3Spinner2", null);
    }

    public String getVlin31S3() {
        return this.moSharedPreferences.getString("Verticalline3Spinner3", null);
    }

    public String getVlin31S4() {
        return this.moSharedPreferences.getString("Verticalline3Spinner4", null);
    }

    public String getVlin31S5() {
        return this.moSharedPreferences.getString("Verticalline3Spinner5", null);
    }

    public String getVlin31S6() {
        return this.moSharedPreferences.getString("Verticalline3Spinner6", null);
    }

    public String getVlin31S7() {
        return this.moSharedPreferences.getString("Verticalline3Spinner7", null);
    }

    public String getVlin31S8() {
        return this.moSharedPreferences.getString("Verticalline3Spinner8", null);
    }

    public String getVlin31S9() {
        return this.moSharedPreferences.getString("Verticalline3Spinner9", null);
    }

    public void saveDates(String str, ArrayList<DateTime> arrayList) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        editorEdit.putString(str, new com.google.gson.a().h(arrayList));
        editorEdit.commit();
    }

    public void setBooleanP(String str, boolean z) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putBoolean(str, z);
        this.moEditor.commit();
    }

    public void setH1(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizontal1", str);
        this.moEditor.commit();
    }

    public void setH10(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizonta110", str);
        this.moEditor.commit();
    }

    public void setH11(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizontal11", str);
        this.moEditor.commit();
    }

    public void setH12(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizontal12", str);
        this.moEditor.commit();
    }

    public void setH13(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizontal13", str);
        this.moEditor.commit();
    }

    public void setH14(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizontal14", str);
        this.moEditor.commit();
    }

    public void setH15(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizontal15", str);
        this.moEditor.commit();
    }

    public void setH16(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizontal16", str);
        this.moEditor.commit();
    }

    public void setH2(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizontal2", str);
        this.moEditor.commit();
    }

    public void setH3(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizontal3", str);
        this.moEditor.commit();
    }

    public void setH4(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString(ctcdTNpUjlfYHm.ijJKTvh, str);
        this.moEditor.commit();
    }

    public void setH5(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizontal5", str);
        this.moEditor.commit();
    }

    public void setH6(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizontal6", str);
        this.moEditor.commit();
    }

    public void setH7(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizontal7", str);
        this.moEditor.commit();
    }

    public void setH8(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizontal8", str);
        this.moEditor.commit();
    }

    public void setH9(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Horizontal9", str);
        this.moEditor.commit();
    }

    public void setHorizontal(boolean z) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putBoolean("horizontal", z);
        this.moEditor.commit();
    }

    public void setIntPref(String str, int i) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putInt(str, i);
        this.moEditor.commit();
    }

    public void setRateCount(int i) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putInt("RateCount", i);
        this.moEditor.commit();
    }

    public void setRatePref(boolean z) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putBoolean("RatePref", z);
        this.moEditor.commit();
    }

    public void setStringPref(String str, boolean z) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putBoolean(str, z);
        this.moEditor.commit();
    }

    public void setStringoriginal(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString(str, str2);
        this.moEditor.commit();
    }

    public void setVertical(boolean z) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putBoolean("Vertical", z);
        this.moEditor.commit();
    }

    public void setVlin1S1(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner1", str);
        this.moEditor.commit();
    }

    public void setVlin1S10(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner10", str);
        this.moEditor.commit();
    }

    public void setVlin1S11(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner11", str);
        this.moEditor.commit();
    }

    public void setVlin1S12(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner12", str);
        this.moEditor.commit();
    }

    public void setVlin1S13(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner13", str);
        this.moEditor.commit();
    }

    public void setVlin1S14(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner14", str);
        this.moEditor.commit();
    }

    public void setVlin1S15(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner15", str);
        this.moEditor.commit();
    }

    public void setVlin1S16(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner16", str);
        this.moEditor.commit();
    }

    public void setVlin1S2(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner2", str);
        this.moEditor.commit();
    }

    public void setVlin1S3(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner3", str);
        this.moEditor.commit();
    }

    public void setVlin1S4(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner4", str);
        this.moEditor.commit();
    }

    public void setVlin1S5(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner5", str);
        this.moEditor.commit();
    }

    public void setVlin1S6(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner6", str);
        this.moEditor.commit();
    }

    public void setVlin1S7(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner7", str);
        this.moEditor.commit();
    }

    public void setVlin1S8(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner8", str);
        this.moEditor.commit();
    }

    public void setVlin1S9(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline1Spinner9", str);
        this.moEditor.commit();
    }

    public void setVlin2S1(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner1", str);
        this.moEditor.commit();
    }

    public void setVlin2S10(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner10", str);
        this.moEditor.commit();
    }

    public void setVlin2S11(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner11", str);
        this.moEditor.commit();
    }

    public void setVlin2S12(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner12", str);
        this.moEditor.commit();
    }

    public void setVlin2S13(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner13", str);
        this.moEditor.commit();
    }

    public void setVlin2S14(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner14", str);
        this.moEditor.commit();
    }

    public void setVlin2S15(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner15", str);
        this.moEditor.commit();
    }

    public void setVlin2S16(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner16", str);
        this.moEditor.commit();
    }

    public void setVlin2S2(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner2", str);
        this.moEditor.commit();
    }

    public void setVlin2S3(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner3", str);
        this.moEditor.commit();
    }

    public void setVlin2S4(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner4", str);
        this.moEditor.commit();
    }

    public void setVlin2S5(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner5", str);
        this.moEditor.commit();
    }

    public void setVlin2S6(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner6", str);
        this.moEditor.commit();
    }

    public void setVlin2S7(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner7", str);
        this.moEditor.commit();
    }

    public void setVlin2S8(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner8", str);
        this.moEditor.commit();
    }

    public void setVlin2S9(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline2Spinner9", str);
        this.moEditor.commit();
    }

    public void setVlin3S1(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner1", str);
        this.moEditor.commit();
    }

    public void setVlin3S10(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner10", str);
        this.moEditor.commit();
    }

    public void setVlin3S11(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner11", str);
        this.moEditor.commit();
    }

    public void setVlin3S12(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner12", str);
        this.moEditor.commit();
    }

    public void setVlin3S13(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner13", str);
        this.moEditor.commit();
    }

    public void setVlin3S14(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner14", str);
        this.moEditor.commit();
    }

    public void setVlin3S15(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner15", str);
        this.moEditor.commit();
    }

    public void setVlin3S16(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner16", str);
        this.moEditor.commit();
    }

    public void setVlin3S2(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner2", str);
        this.moEditor.commit();
    }

    public void setVlin3S3(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner3", str);
        this.moEditor.commit();
    }

    public void setVlin3S4(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner4", str);
        this.moEditor.commit();
    }

    public void setVlin3S5(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString(CvmpVJvatR.FbUmd, str);
        this.moEditor.commit();
    }

    public void setVlin3S6(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner6", str);
        this.moEditor.commit();
    }

    public void setVlin3S7(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner7", str);
        this.moEditor.commit();
    }

    public void setVlin3S8(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner8", str);
        this.moEditor.commit();
    }

    public void setVlin3S9(String str) {
        SharedPreferences.Editor editorEdit = this.moSharedPreferences.edit();
        this.moEditor = editorEdit;
        editorEdit.putString("Verticalline3Spinner9", str);
        this.moEditor.commit();
    }
}