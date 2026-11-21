package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.mo1;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.login.ITY.SAqBqKHnKkFD;
import com.google.firebase.analytics.Tb.VCKtvKCuFgEI;
import com.google.firebase.concurrent.cf.OTysxApt;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.dragView.DragLinearLayout;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.model.ViewModel;
import defpackage.a7;
import defpackage.b5;
import defpackage.bj;
import defpackage.c66;
import defpackage.cc6;
import defpackage.cc7;
import defpackage.dt7;
import defpackage.eo7;
import defpackage.fq1;
import defpackage.ld0;
import defpackage.lt1;
import defpackage.n8;
import defpackage.o30;
import defpackage.r41;
import defpackage.rm;
import defpackage.ub7;
import defpackage.vm8;
import defpackage.w71;
import defpackage.y82;
import defpackage.yc;
import defpackage.z82;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class FileName_Activity extends bj implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, View.OnFocusChangeListener {
    public static final /* synthetic */ int D0 = 0;
    public SP B;
    public RelativeLayout B0;
    public RelativeLayout C;
    public DragLinearLayout D;
    public CheckBox H;
    public CheckBox I;
    public CheckBox J;
    public CheckBox K;
    public CheckBox L;
    public CheckBox M;
    public CheckBox N;
    public CheckBox O;
    public CheckBox P;
    public CheckBox Q;
    public CheckBox R;
    public CheckBox S;
    public CheckBox T;
    public CheckBox U;
    public CheckBox V;
    public CheckBox W;
    public CheckBox X;
    public CheckBox Y;
    public CheckBox Z;
    public CheckBox a0;
    public TextView b0;
    public TextView c0;
    public TextView d0;
    public TextView e0;
    public TextView f0;
    public TextView g0;
    public TextView h0;
    public TextView i0;
    public EditText j0;
    public EditText k0;
    public EditText l0;
    public EditText m0;
    public int n0;
    public RelativeLayout o0;
    public RelativeLayout p0;
    public RelativeLayout q0;
    public RelativeLayout r0;
    public RelativeLayout s0;
    public RelativeLayout t0;
    public boolean u0;
    public RelativeLayout w0;
    public RelativeLayout x0;
    public HelperClass y0;
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public ArrayList G = new ArrayList();
    public mo1 v0 = null;
    public boolean z0 = false;
    public final Admob A0 = new Admob();
    public final Handler C0 = new Handler();

    public static String G(int i) {
        String displayName = Calendar.getInstance().getTimeZone().getDisplayName(false, 1);
        Date time = Calendar.getInstance(DesugarTimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime();
        String str = new SimpleDateFormat("Z").format(time);
        String str2 = new SimpleDateFormat("ZZZZZ", Locale.getDefault()).format(time);
        switch (i) {
            case 1:
                return str;
            case 2:
                return eo7.w("UTC ", str);
            case 3:
                return eo7.w("GMT ", str);
            case 4:
                return str2;
            case 5:
                return eo7.w("UTC ", str2);
            case 6:
                return eo7.w("GMT ", str2);
            case 7:
                return displayName;
            default:
                return "";
        }
    }

    public static boolean M(String str) {
        if (str == null) {
            return false;
        }
        return !str.trim().isEmpty();
    }

    public final String A() {
        return this.B.getString(this, SP.LOC_LINE_2_CITY, "");
    }

    public final String B() {
        return this.B.getString(this, SP.LOC_LINE_3_STATE, "");
    }

    public final String C() {
        return this.B.getString(this, SP.LOC_LINE_4_COUNTRY, "");
    }

    public final String D() {
        int integer = this.B.getInteger(this, SP.TEMPLATE_TYPE, 0);
        if (integer == 0) {
            String string = this.B.getString(this, SP.NOTES_HASHTAG, Default.notes);
            if (string.contains("Note : ")) {
                string = string.replace("Note : ", "");
            } else if (string.contains(Default.notes_title)) {
                string = string.replace(Default.notes_title, "");
            }
            return string.replace(".", "_");
        }
        if (integer == 1) {
            String string2 = this.B.getString(this, SP.NOTES_HASHTAG_CLASSIC, Default.notes);
            if (string2.contains("Note : ")) {
                string2 = string2.replace("Note : ", "");
            } else if (string2.contains(Default.notes_title)) {
                string2 = string2.replace(Default.notes_title, "");
            }
            return string2.replace(".", "_");
        }
        if (integer == 2) {
            String string3 = this.B.getString(this, SP.NOTES_HASHTAG_REPORTING, Default.notes);
            if (string3.contains("Note : ")) {
                string3 = string3.replace("Note : ", "");
            } else if (string3.contains(Default.notes_title)) {
                string3 = string3.replace(Default.notes_title, "");
            }
            return string3.replace(".", "_");
        }
        SP sp = this.B;
        if (integer == 3) {
            String string4 = sp.getString(this, SP.NOTES_HASHTAG_NC, Default.notes);
            if (string4.contains("Note : ")) {
                string4 = string4.replace("Note : ", "");
            } else if (string4.contains(Default.notes_title)) {
                string4 = string4.replace(Default.notes_title, "");
            }
            return string4.replace(".", "_");
        }
        String string5 = sp.getString(this, SP.NOTES_HASHTAG_DT, Default.notes);
        if (string5.contains("Note : ")) {
            string5 = string5.replace("Note : ", "");
        } else if (string5.contains(Default.notes_title)) {
            string5 = string5.replace(Default.notes_title, "");
        }
        return string5.replace(".", "_");
    }

    public final String E() {
        int integer = this.B.getInteger(this, SP.TEMPLATE_TYPE, 0);
        String strTrim = this.B.getString(this, SP.PLUS_CODE, "").trim();
        if (strTrim.isEmpty()) {
            return "";
        }
        if (integer == 0) {
            if (!this.B.getString(this, SP.PLUS_CODE_TYPE, Default.PLUSCODE_TYPE).equals(Default.PLUSCODE_TYPE)) {
                return strTrim.substring(4);
            }
        } else if (integer == 1) {
            if (!this.B.getString(this, SP.PLUS_CODE_TYPE_CLASSIC, Default.PLUSCODE_TYPE).equals(Default.PLUSCODE_TYPE)) {
                return strTrim.substring(4);
            }
        } else if (integer == 2) {
            if (!this.B.getString(this, SP.PLUS_CODE_TYPE_REPORTING, Default.PLUSCODE_TYPE).equals(Default.PLUSCODE_TYPE)) {
                return strTrim.substring(4);
            }
        } else if (integer == 3 && !this.B.getString(this, SP.PLUS_CODE_TYPE_NC, Default.PLUSCODE_TYPE).equals(Default.PLUSCODE_TYPE)) {
            return strTrim.substring(4);
        }
        return strTrim;
    }

    public final String F() {
        return r41.k(this.j0);
    }

    public final String H() {
        int integer = this.B.getInteger(this, SP.TEMPLATE_TYPE, 0);
        if (integer == 0) {
            return G(this.B.getInteger(this, SP.TIMEZONE, 6)).replace(" ", "_");
        }
        if (integer == 1) {
            return G(this.B.getInteger(this, SP.TIMEZONE_CLASSIC, 6)).replace(" ", "_");
        }
        if (integer == 2) {
            return G(this.B.getInteger(this, SP.TIMEZONE_REPORTING, 6)).replace(" ", "_");
        }
        return integer == 3 ? G(this.B.getInteger(this, SP.TIMEZONE_NC, 6)).replace(" ", "_") : G(6).replace(" ", "_");
    }

    public final View I(String str) {
        str.getClass();
        switch (str) {
            case "timezone":
                return findViewById(R.id.rel_timezone);
            case "pluscode":
                return findViewById(R.id.rel_pluscode);
            case "address":
                return findViewById(R.id.rel_add_address);
            case "latlong":
                return findViewById(R.id.rel_lat_lng);
            case "name1":
                return findViewById(R.id.rel_custom_1);
            case "name2":
                return findViewById(R.id.rel_custom_2);
            case "name3":
                return findViewById(R.id.rel_custom_3);
            case "sequence":
                return findViewById(R.id.rel_sequence_num);
            case "datetime":
                return findViewById(R.id.rel_main_datetime);
            default:
                return findViewById(R.id.rel_note);
        }
    }

    public final void J() {
        int integer = this.B.getInteger(this, HelperClass.COUNTADS, 0);
        int i = RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT;
        if (integer > i) {
            integer = i;
        }
        if (!AllAdsApproval.iSFileNameFS(this)) {
            finish();
            return;
        }
        if (integer < RemoteAdData.FILE_FOLDER_MAP_TEMPLATE_COUNT) {
            this.B.setInteger(this, HelperClass.COUNTADS, integer + 1);
            finish();
            return;
        }
        CPD.ShowDialog(this, getString(R.string.cluster_loading));
        this.B.setInteger(this, HelperClass.COUNTADS, 0);
        int i2 = RemoteAdData.ADS_NETWORK_TYPE;
        if (i2 == 9) {
            int i3 = RemoteAdData.FILENAME_SCREEN_FS_TYPE;
            if (i3 == 1) {
                K();
            } else if (i3 == 2) {
                L();
            }
        } else if (i2 == 1) {
            K();
        } else if (i2 == 2) {
            L();
        }
        this.C0.postDelayed(new b5(12, this), 7000L);
    }

    public final void K() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new rm(23, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void L() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new vm8(23, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void N() {
        ArrayList arrayList = this.G;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        String strReplaceFirst = "";
        for (int i = 0; i < this.G.size(); i++) {
            if (((ViewModel) this.G.get(i)).getSelected().booleanValue()) {
                StringBuilder sbM = dt7.m(strReplaceFirst, "_");
                sbM.append(((ViewModel) this.G.get(i)).getValue());
                strReplaceFirst = sbM.toString();
            }
        }
        if (M(strReplaceFirst)) {
            if (strReplaceFirst.substring(0, 1).equals("_")) {
                strReplaceFirst = strReplaceFirst.replaceFirst("_", "");
            }
            String strReplace = strReplaceFirst.replace("__", "_");
            this.b0.setText(strReplace + ".jpg");
        }
    }

    public final void O(Integer num, boolean z, String str) {
        ArrayList arrayList = this.G;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ((ViewModel) this.G.get(num.intValue())).setSelected(Boolean.valueOf(z));
        ((ViewModel) this.G.get(num.intValue())).setValue(str);
    }

    public final void P(int i, boolean z) {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View viewFindViewById = findViewById(((Integer) arrayList.get(i2)).intValue());
            TextView textView = (TextView) findViewById(((Integer) this.F.get(i2)).intValue());
            if (viewFindViewById != null && textView != null) {
                if (((Integer) arrayList.get(i2)).intValue() != i) {
                    viewFindViewById.setVisibility(8);
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_drop_down_black, 0);
                } else if (z) {
                    viewFindViewById.setVisibility(0);
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_drop_up, 0);
                } else if (viewFindViewById.getVisibility() == 0) {
                    viewFindViewById.setVisibility(8);
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_drop_down_black, 0);
                } else {
                    viewFindViewById.setVisibility(0);
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_drop_up, 0);
                }
            }
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getId() == R.id.chk_main_date_time) {
            if (z) {
                O(Integer.valueOf(x(Default.DATETIME)), true, w());
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        } else if (compoundButton.getId() == R.id.chk_s_n) {
            if (!z) {
                O(Integer.valueOf(x(Default.SEQUENCE)), false, "");
            } else if (this.j0.getText().toString().trim().isEmpty()) {
                O(r41.j(this.P, false, this, Default.SEQUENCE), false, "");
                cc6.i(this.C, "" + getString(R.string.s_n_empty_msg), -1).k();
            } else {
                O(Integer.valueOf(x(Default.SEQUENCE)), true, F());
            }
        } else if (compoundButton.getId() == R.id.chk_cus_1) {
            if (!z) {
                O(Integer.valueOf(x(Default.CUSTOM1)), false, "");
            } else if (this.k0.getText().toString().trim().isEmpty()) {
                O(r41.j(this.Q, false, this, Default.CUSTOM1), false, "");
            } else {
                O(Integer.valueOf(x(Default.CUSTOM1)), true, this.k0.getText().toString().trim());
            }
        } else if (compoundButton.getId() == R.id.chk_cus_2) {
            if (!z) {
                O(Integer.valueOf(x(Default.CUSTOM2)), false, "");
            } else if (this.l0.getText().toString().trim().isEmpty()) {
                O(r41.j(this.R, false, this, Default.CUSTOM2), false, "");
            } else {
                O(Integer.valueOf(x(Default.CUSTOM2)), true, u());
            }
        } else if (compoundButton.getId() == R.id.chk_cus_3) {
            if (!z) {
                O(Integer.valueOf(x(Default.CUSTOM3)), false, "");
            } else if (this.m0.getText().toString().trim().isEmpty()) {
                O(r41.j(this.S, false, this, Default.CUSTOM3), false, "");
            } else {
                O(Integer.valueOf(x(Default.CUSTOM3)), true, v());
            }
        } else if (compoundButton.getId() == R.id.chk_main_address) {
            if (!z) {
                this.T.setChecked(false);
                this.X.setChecked(false);
                this.Y.setChecked(false);
                this.Z.setChecked(false);
                O(r41.j(this.a0, false, this, Default.ADDRESS), false, "");
            } else if (this.X.isChecked() || this.Y.isChecked() || this.Z.isChecked() || this.a0.isChecked()) {
                boolean zM = M(t());
                CheckBox checkBox = this.T;
                if (zM) {
                    O(r41.j(checkBox, true, this, Default.ADDRESS), true, t());
                } else {
                    O(r41.j(checkBox, false, this, Default.ADDRESS), false, "");
                }
            } else if (M(z())) {
                this.T.setChecked(true);
                O(r41.j(this.X, true, this, Default.ADDRESS), true, t());
            } else if (M(A())) {
                this.T.setChecked(true);
                O(r41.j(this.Y, true, this, Default.ADDRESS), true, t());
            } else if (M(B())) {
                this.T.setChecked(true);
                O(r41.j(this.Z, true, this, Default.ADDRESS), true, t());
            } else {
                boolean zM2 = M(C());
                CheckBox checkBox2 = this.T;
                if (zM2) {
                    checkBox2.setChecked(true);
                    O(r41.j(this.a0, true, this, Default.ADDRESS), true, t());
                } else {
                    checkBox2.setChecked(false);
                    O(r41.j(this.X, false, this, Default.ADDRESS), false, "");
                }
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        } else if (compoundButton.getId() == R.id.chk_line_1) {
            if (z) {
                if (M(z())) {
                    O(r41.j(this.T, true, this, Default.ADDRESS), true, t());
                } else {
                    this.X.setChecked(false);
                }
            } else if (!this.X.isChecked() && !this.Y.isChecked() && !this.Z.isChecked() && !this.a0.isChecked()) {
                O(r41.j(this.T, false, this, Default.ADDRESS), false, "");
            } else if (M(t())) {
                O(r41.j(this.T, true, this, Default.ADDRESS), true, t());
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        } else if (compoundButton.getId() == R.id.chk_line_2) {
            if (z) {
                if (M(A())) {
                    O(r41.j(this.T, true, this, Default.ADDRESS), true, t());
                } else {
                    this.Y.setChecked(false);
                }
            } else if (!this.X.isChecked() && !this.Y.isChecked() && !this.Z.isChecked() && !this.a0.isChecked()) {
                O(r41.j(this.T, false, this, Default.ADDRESS), false, "");
            } else if (M(t())) {
                O(r41.j(this.T, true, this, Default.ADDRESS), true, t());
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        } else if (compoundButton.getId() == R.id.chk_line_3) {
            if (z) {
                if (M(B())) {
                    O(r41.j(this.T, true, this, Default.ADDRESS), true, t());
                } else {
                    this.Z.setChecked(false);
                }
            } else if (!this.X.isChecked() && !this.Y.isChecked() && !this.Z.isChecked() && !this.a0.isChecked()) {
                O(r41.j(this.T, false, this, Default.ADDRESS), false, "");
            } else if (M(t())) {
                O(r41.j(this.T, true, this, Default.ADDRESS), true, t());
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        } else if (compoundButton.getId() == R.id.chk_line_4) {
            if (z) {
                if (M(C())) {
                    O(r41.j(this.T, true, this, Default.ADDRESS), true, t());
                } else {
                    this.a0.setChecked(false);
                }
            } else if (!this.X.isChecked() && !this.Y.isChecked() && !this.Z.isChecked() && !this.a0.isChecked()) {
                O(r41.j(this.T, false, this, Default.ADDRESS), false, "");
            } else if (M(t())) {
                O(r41.j(this.T, true, this, Default.ADDRESS), true, t());
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        } else if (compoundButton.getId() == R.id.chk_main_latlng) {
            CheckBox checkBox3 = this.V;
            if (!z) {
                checkBox3.setChecked(false);
                O(r41.j(this.W, false, this, Default.LATLONG), false, "");
            } else if (checkBox3.isChecked() || this.W.isChecked()) {
                O(Integer.valueOf(x(Default.LATLONG)), true, y());
            } else {
                this.U.setChecked(true);
                O(r41.j(this.V, true, this, Default.LATLONG), true, y());
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        } else if (compoundButton.getId() == R.id.chk_main_pluscode) {
            if (z) {
                O(Integer.valueOf(x(Default.PLUSCODE)), true, E());
            } else {
                O(Integer.valueOf(x(Default.PLUSCODE)), false, "");
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        } else if (compoundButton.getId() == R.id.chk_main_timezone) {
            if (z) {
                O(Integer.valueOf(x(Default.TIMEZONE)), true, H());
            } else {
                O(Integer.valueOf(x(Default.TIMEZONE)), false, "");
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        } else if (compoundButton.getId() == R.id.chk_main_note) {
            if (z) {
                O(Integer.valueOf(x(Default.NOTES)), true, D());
            } else {
                O(Integer.valueOf(x(Default.NOTES)), false, "");
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        } else if (compoundButton.getId() == R.id.chk_decimal || compoundButton.getId() == R.id.chk_dms) {
            if (z) {
                this.U.setChecked(true);
                if (compoundButton.getId() == R.id.chk_dms && this.V.isChecked()) {
                    this.V.setChecked(false);
                }
                if (compoundButton.getId() == R.id.chk_decimal && this.W.isChecked()) {
                    this.W.setChecked(false);
                }
                O(Integer.valueOf(x(Default.LATLONG)), true, y());
            } else if (this.V.isChecked() || this.W.isChecked()) {
                O(r41.j(this.U, true, this, Default.LATLONG), true, y());
            } else {
                O(r41.j(this.U, false, this, Default.LATLONG), false, "");
            }
        } else if (compoundButton.getId() == R.id.chk_24_hr || compoundButton.getId() == R.id.chk_Week) {
            CheckBox checkBox4 = this.H;
            if (z) {
                O(r41.j(checkBox4, true, this, Default.DATETIME), true, w());
            } else {
                O(r41.j(checkBox4, true, this, Default.DATETIME), true, w());
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        }
        N();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.tv_click_dt) {
            P(R.id.li_child_dt, false);
            HelperClass.hideSoftKeyboard(this, this.C);
            return;
        }
        if (view.getId() == R.id.tv_click_sn) {
            P(R.id.li_child_sequence, false);
            return;
        }
        if (view.getId() == R.id.tv_click_cus_1) {
            P(R.id.li_child_cus_1, false);
            return;
        }
        if (view.getId() == R.id.tv_click_cus_2) {
            P(R.id.li_child_cus_2, false);
            return;
        }
        if (view.getId() == R.id.tv_click_cus_3) {
            P(R.id.li_child_cus_3, false);
            return;
        }
        if (view.getId() == R.id.tv_click_address) {
            P(R.id.li_child_address, false);
            HelperClass.hideSoftKeyboard(this, this.C);
            return;
        }
        if (view.getId() == R.id.tv_click_latlng) {
            P(R.id.li_child_lat_lng, false);
            HelperClass.hideSoftKeyboard(this, this.C);
            return;
        }
        if (view.getId() == R.id.chk_line_1) {
            if (M(z())) {
                return;
            }
            cc6.i(this.C, "" + getString(R.string.line1_address_empty_msg), -1).k();
            return;
        }
        if (view.getId() == R.id.chk_line_2) {
            if (M(A())) {
                return;
            }
            cc6.i(this.C, "" + getString(R.string.line2_address_empty_msg), -1).k();
            return;
        }
        if (view.getId() == R.id.chk_line_3) {
            if (M(B())) {
                return;
            }
            cc6.i(this.C, "" + getString(R.string.line3_address_empty_msg), -1).k();
            return;
        }
        if (view.getId() == R.id.chk_line_4) {
            if (M(C())) {
                return;
            }
            cc6.i(this.C, "" + getString(R.string.line4_address_empty_msg), -1).k();
            return;
        }
        int i = 1;
        if (view.getId() == R.id.chk_main_date_time) {
            if (this.H.isChecked()) {
                P(R.id.li_child_dt, true);
                return;
            }
            return;
        }
        if (view.getId() == R.id.chk_s_n) {
            if (this.P.isChecked()) {
                P(R.id.li_child_sequence, true);
                return;
            }
            return;
        }
        if (view.getId() == R.id.chk_cus_1) {
            if (!M(this.k0.getText().toString())) {
                cc6.i(this.C, "" + getString(R.string.cus_1_empty_msg), -1).k();
            }
            if (!this.u0) {
                this.Q.setChecked(true);
            }
            if (this.Q.isChecked()) {
                P(R.id.li_child_cus_1, true);
                return;
            }
            return;
        }
        if (view.getId() == R.id.chk_cus_2) {
            if (!M(this.l0.getText().toString())) {
                cc6.i(this.C, "" + getString(R.string.cus_2_empty_msg), -1).k();
            }
            if (this.R.isChecked()) {
                if (!this.u0) {
                    this.R.setChecked(false);
                }
                P(R.id.li_child_cus_2, true);
                return;
            }
            return;
        }
        if (view.getId() == R.id.chk_cus_3) {
            if (!M(this.m0.getText().toString())) {
                cc6.i(this.C, "" + getString(R.string.cus_3_empty_msg), -1).k();
            }
            if (this.S.isChecked()) {
                if (!this.u0) {
                    this.S.setChecked(false);
                }
                P(R.id.li_child_cus_3, true);
                return;
            }
            return;
        }
        if (view.getId() == R.id.chk_main_latlng) {
            if (this.U.isChecked()) {
                if (!this.u0) {
                    this.U.setChecked(false);
                }
                P(R.id.li_child_lat_lng, true);
                return;
            }
            return;
        }
        if (view.getId() == R.id.chk_main_note) {
            if (!this.O.isChecked() || this.u0) {
                return;
            }
            this.O.setChecked(false);
            return;
        }
        if (view.getId() == R.id.chk_main_address) {
            if (this.T.isChecked()) {
                if (!this.u0) {
                    this.T.setChecked(false);
                }
                P(R.id.li_child_address, true);
                return;
            } else {
                if (M(z()) || M(A()) || M(B()) || M(C())) {
                    return;
                }
                cc6.i(this.C, "" + getString(R.string.all_address_empty_msg), -1).k();
                return;
            }
        }
        if (view.getId() == R.id.rel_inapp_cus_1 || view.getId() == R.id.rel_inapp_cus_2 || view.getId() == R.id.rel_inapp_cus_3 || view.getId() == R.id.rel_inapp_address || view.getId() == R.id.rel_inapp_lat_lng || view.getId() == R.id.rel_inapp_note) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.MyDialogTheme);
            builder.setMessage(getResources().getString(R.string.file_inapp_msg));
            builder.setPositiveButton(getResources().getString(R.string.pro), new yc(5, this));
            builder.setNegativeButton(getResources().getString(R.string.cancel), new ld0(2));
            AlertDialog alertDialogCreate = builder.create();
            alertDialogCreate.setOnShowListener(new w71(i, this, alertDialogCreate));
            alertDialogCreate.show();
        }
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        DragLinearLayout dragLinearLayout;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        lt1.a(this);
        HelperClass helperClass = new HelperClass();
        this.y0 = helperClass;
        helperClass.SetLanguage(this);
        SP sp = new SP(this);
        this.B = sp;
        String string = sp.getString(this, SP.APP_THEME, Default.LIGHT);
        if (string.equals(Default.DARK)) {
            this.z0 = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!string.equals(Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.z0 = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.z0 = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_file_name);
        View viewFindViewById = findViewById(R.id.main_real);
        y82 y82Var = new y82(this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(viewFindViewById, y82Var);
        this.B0 = (RelativeLayout) findViewById(R.id.rel_adaptive_banner);
        this.n0 = this.B.getInteger(this, SP.APP_COUNT, 0);
        this.B.setInteger(this, HelperClass.FILE_NAME_OPEN_TIME, this.B.getInteger(this, HelperClass.FILE_NAME_OPEN_TIME, 0) + 1);
        int i3 = this.n0;
        if (i3 <= 3) {
            int i4 = i3 + 1;
            this.n0 = i4;
            this.B.setInteger(this, SP.APP_COUNT, i4);
        }
        new SP(this).getString(this, SP.ADS_STATUS, "1");
        this.w0 = (RelativeLayout) findViewById(R.id.toolbar_back);
        ((TextView) findViewById(R.id.tv_toolbar_title)).setText(getString(R.string.file_name));
        this.D = (DragLinearLayout) findViewById(R.id.container);
        this.x0 = (RelativeLayout) findViewById(R.id.main_real);
        this.C = (RelativeLayout) findViewById(R.id.rel_main_datetime);
        Integer numValueOf = Integer.valueOf(R.id.li_child_dt);
        ArrayList arrayList = this.E;
        arrayList.add(numValueOf);
        arrayList.add(Integer.valueOf(R.id.li_child_sequence));
        arrayList.add(Integer.valueOf(R.id.li_child_cus_1));
        arrayList.add(Integer.valueOf(R.id.li_child_cus_2));
        arrayList.add(Integer.valueOf(R.id.li_child_cus_3));
        arrayList.add(Integer.valueOf(R.id.li_child_address));
        arrayList.add(Integer.valueOf(R.id.li_child_lat_lng));
        Integer numValueOf2 = Integer.valueOf(R.id.tv_click_dt);
        ArrayList arrayList2 = this.F;
        arrayList2.add(numValueOf2);
        arrayList2.add(Integer.valueOf(R.id.tv_click_sn));
        arrayList2.add(Integer.valueOf(R.id.tv_click_cus_1));
        arrayList2.add(Integer.valueOf(R.id.tv_click_cus_2));
        arrayList2.add(Integer.valueOf(R.id.tv_click_cus_3));
        arrayList2.add(Integer.valueOf(R.id.tv_click_address));
        arrayList2.add(Integer.valueOf(R.id.tv_click_latlng));
        this.c0 = (TextView) findViewById(R.id.tv_click_dt);
        this.i0 = (TextView) findViewById(R.id.tv_click_sn);
        this.d0 = (TextView) findViewById(R.id.tv_click_cus_1);
        this.e0 = (TextView) findViewById(R.id.tv_click_cus_2);
        this.f0 = (TextView) findViewById(R.id.tv_click_cus_3);
        this.g0 = (TextView) findViewById(R.id.tv_click_address);
        this.h0 = (TextView) findViewById(R.id.tv_click_latlng);
        this.H = (CheckBox) findViewById(R.id.chk_main_date_time);
        this.I = (CheckBox) findViewById(R.id.chk_dt);
        this.J = (CheckBox) findViewById(R.id.chk_Week);
        this.K = (CheckBox) findViewById(R.id.chk_hr_min);
        this.L = (CheckBox) findViewById(R.id.chk_24_hr);
        this.P = (CheckBox) findViewById(R.id.chk_s_n);
        this.Q = (CheckBox) findViewById(R.id.chk_cus_1);
        this.R = (CheckBox) findViewById(R.id.chk_cus_2);
        this.S = (CheckBox) findViewById(R.id.chk_cus_3);
        this.T = (CheckBox) findViewById(R.id.chk_main_address);
        this.U = (CheckBox) findViewById(R.id.chk_main_latlng);
        this.U = (CheckBox) findViewById(R.id.chk_main_latlng);
        this.V = (CheckBox) findViewById(R.id.chk_decimal);
        this.W = (CheckBox) findViewById(R.id.chk_dms);
        this.M = (CheckBox) findViewById(R.id.chk_main_pluscode);
        this.N = (CheckBox) findViewById(R.id.chk_main_timezone);
        this.O = (CheckBox) findViewById(R.id.chk_main_note);
        this.X = (CheckBox) findViewById(R.id.chk_line_1);
        this.Y = (CheckBox) findViewById(R.id.chk_line_2);
        this.Z = (CheckBox) findViewById(R.id.chk_line_3);
        this.a0 = (CheckBox) findViewById(R.id.chk_line_4);
        TextView textView = (TextView) findViewById(R.id.tv_filename);
        this.b0 = textView;
        textView.setMovementMethod(new ScrollingMovementMethod());
        this.j0 = (EditText) findViewById(R.id.ed_sequence);
        this.k0 = (EditText) findViewById(R.id.ed_cus_1);
        this.l0 = (EditText) findViewById(R.id.ed_cus_2);
        this.m0 = (EditText) findViewById(R.id.ed_cus_3);
        this.o0 = (RelativeLayout) findViewById(R.id.rel_inapp_cus_1);
        this.p0 = (RelativeLayout) findViewById(R.id.rel_inapp_cus_2);
        this.q0 = (RelativeLayout) findViewById(R.id.rel_inapp_cus_3);
        this.r0 = (RelativeLayout) findViewById(R.id.rel_inapp_address);
        this.s0 = (RelativeLayout) findViewById(R.id.rel_inapp_lat_lng);
        this.t0 = (RelativeLayout) findViewById(R.id.rel_inapp_note);
        this.u0 = this.B.getBoolean(this, HelperClass.IS_PURCHESH_OR_NOT, false) || this.B.getBoolean(this, HelperClass.IS_SUBSCRIBE, false) || this.B.getBoolean(this, HelperClass.IS_USE_ALL_FUNCTION, false);
        ArrayList<ViewModel> arrayList3 = this.B.getArrayList(this);
        this.G = arrayList3;
        int i5 = 2;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            try {
                View viewI = I(((ViewModel) this.G.get(0)).getTag());
                ((ViewGroup) viewI.getParent()).removeView(viewI);
                View viewI2 = I(((ViewModel) this.G.get(1)).getTag());
                ((ViewGroup) viewI2.getParent()).removeView(viewI2);
                View viewI3 = I(((ViewModel) this.G.get(2)).getTag());
                ((ViewGroup) viewI3.getParent()).removeView(viewI3);
                View viewI4 = I(((ViewModel) this.G.get(3)).getTag());
                ((ViewGroup) viewI4.getParent()).removeView(viewI4);
                View viewI5 = I(((ViewModel) this.G.get(4)).getTag());
                ((ViewGroup) viewI5.getParent()).removeView(viewI5);
                View viewI6 = I(((ViewModel) this.G.get(5)).getTag());
                ((ViewGroup) viewI6.getParent()).removeView(viewI6);
                View viewI7 = I(((ViewModel) this.G.get(6)).getTag());
                ((ViewGroup) viewI7.getParent()).removeView(viewI7);
                View viewI8 = I(((ViewModel) this.G.get(7)).getTag());
                ((ViewGroup) viewI8.getParent()).removeView(viewI8);
                View viewI9 = I(((ViewModel) this.G.get(8)).getTag());
                ((ViewGroup) viewI9.getParent()).removeView(viewI9);
                View viewI10 = I(((ViewModel) this.G.get(9)).getTag());
                ((ViewGroup) viewI10.getParent()).removeView(viewI10);
                this.D.addView(viewI, 0);
                this.D.addView(viewI2, 1);
                this.D.addView(viewI3, 2);
                this.D.addView(viewI4, 3);
                this.D.addView(viewI5, 4);
                this.D.addView(viewI6, 5);
                this.D.addView(viewI7, 6);
                this.D.addView(viewI8, 7);
                this.D.addView(viewI9, 8);
                this.D.addView(viewI10, 9);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int i6 = 0;
        while (true) {
            int childCount = this.D.getChildCount();
            dragLinearLayout = this.D;
            if (i6 >= childCount) {
                break;
            }
            View childAt = dragLinearLayout.getChildAt(i6);
            this.D.setViewDraggable(childAt, childAt);
            childAt.setTag(Integer.valueOf(i6));
            i6++;
        }
        dragLinearLayout.setOnViewSwapListener(new y82(this));
        this.H.setChecked(this.B.getBoolean(this, SP.IS_FILE_DATE_TIME, true));
        this.I.setChecked(this.B.getBoolean(this, SP.IS_DT, true));
        this.K.setChecked(this.B.getBoolean(this, SP.IS_HR_MIN_SEC, true));
        this.L.setChecked(this.B.getBoolean(this, SP.IS_24HR, false));
        this.J.setChecked(this.B.getBoolean(this, SP.IS_WEEK, false));
        this.P.setChecked(this.B.getBoolean(this, SP.IS_SEQUENCE, false));
        this.Q.setChecked(this.B.getBoolean(this, VCKtvKCuFgEI.XxNPnWMN, true));
        this.R.setChecked(this.B.getBoolean(this, SP.IS_CUS_2, false));
        this.S.setChecked(this.B.getBoolean(this, SP.IS_CUS_3, false));
        this.T.setChecked(this.B.getBoolean(this, SP.IS_MAIN_ADDRESS, false));
        this.X.setChecked(this.B.getBoolean(this, SP.IS_LINE_1, false));
        this.Y.setChecked(this.B.getBoolean(this, SP.IS_LINE_2, false));
        this.Z.setChecked(this.B.getBoolean(this, SP.IS_LINE_3, false));
        this.a0.setChecked(this.B.getBoolean(this, SP.IS_LINE_4, false));
        this.U.setChecked(this.B.getBoolean(this, SP.IS_LAT_LNG, false));
        this.V.setChecked(this.B.getBoolean(this, SP.IS_DECIMAL_FILE, false));
        this.W.setChecked(this.B.getBoolean(this, SP.IS_DMS_FILE, false));
        this.M.setChecked(this.B.getBoolean(this, SP.IS_PLUSCODE_FILE, false));
        this.N.setChecked(this.B.getBoolean(this, SP.IS_TIMEZONE_FILE, false));
        this.O.setChecked(this.B.getBoolean(this, SP.IS_NOTES_FILE, false));
        this.j0.setText("" + this.B.getInteger(this, SP.SEQUENCE_VALUE, 1));
        this.k0.setText(this.B.getString(this, SP.CUS_VALUE_1, Default.CUSTUM_NAME_1_VALUE));
        this.l0.setText(this.B.getString(this, SP.CUS_VALUE_2, getString(R.string.cus_2)));
        this.m0.setText(this.B.getString(this, SP.CUS_VALUE_3, getString(R.string.cus_3)));
        if (this.G == null) {
            this.G = new ArrayList();
            this.G = s();
        }
        this.j0.addTextChangedListener(new z82(this, 0));
        if (this.u0) {
            this.k0.setEnabled(true);
            this.l0.setEnabled(true);
            this.m0.setEnabled(true);
            this.X.setEnabled(true);
            this.Y.setEnabled(true);
            this.Z.setEnabled(true);
            this.a0.setEnabled(true);
            this.W.setEnabled(true);
            this.V.setEnabled(true);
            this.o0.setVisibility(8);
            this.p0.setVisibility(8);
            this.q0.setVisibility(8);
            this.s0.setVisibility(8);
            this.t0.setVisibility(8);
            this.r0.setVisibility(8);
            this.k0.addTextChangedListener(new z82(this, 1));
            this.l0.addTextChangedListener(new z82(this, i5));
            this.m0.addTextChangedListener(new z82(this, 3));
            if (this.T.isChecked()) {
                if (!this.X.isChecked() || M(z())) {
                    z3 = false;
                } else {
                    z3 = false;
                    this.X.setChecked(false);
                }
                if (this.Y.isChecked() && !M(A())) {
                    this.Y.setChecked(z3);
                }
                if (this.Z.isChecked() && !M(B())) {
                    this.Z.setChecked(z3);
                }
                if (this.a0.isChecked() && !M(C())) {
                    this.a0.setChecked(z3);
                }
                if (this.X.isChecked() || this.Y.isChecked() || this.Z.isChecked() || this.a0.isChecked()) {
                    z2 = true;
                    O(Integer.valueOf(x(Default.ADDRESS)), true, t());
                } else {
                    O(r41.j(this.T, false, this, Default.ADDRESS), false, "");
                    z2 = true;
                }
            } else {
                z2 = true;
            }
            if (this.U.isChecked()) {
                O(Integer.valueOf(x(Default.LATLONG)), z2, y());
            }
            if (this.O.isChecked()) {
                O(Integer.valueOf(x(Default.NOTES)), true, "" + D());
            }
        } else {
            this.o0.setVisibility(0);
            this.p0.setVisibility(0);
            this.q0.setVisibility(0);
            this.s0.setVisibility(0);
            this.r0.setVisibility(0);
            this.t0.setVisibility(0);
            this.k0.setEnabled(false);
            this.l0.setEnabled(false);
            this.m0.setEnabled(false);
            this.X.setEnabled(false);
            this.Y.setEnabled(false);
            this.Z.setEnabled(false);
            this.a0.setEnabled(false);
            this.W.setEnabled(false);
            this.V.setEnabled(false);
        }
        if (this.H.isChecked()) {
            O(Integer.valueOf(x(Default.DATETIME)), true, w());
        }
        if (this.P.isChecked()) {
            Integer numValueOf3 = Integer.valueOf(x(Default.SEQUENCE));
            StringBuilder sb = new StringBuilder("");
            z = true;
            sb.append(this.B.getInteger(this, SP.SEQUENCE_VALUE, 1));
            O(numValueOf3, true, sb.toString());
        } else {
            z = true;
        }
        if (this.M.isChecked()) {
            O(Integer.valueOf(x(Default.PLUSCODE)), z, E());
        }
        if (this.N.isChecked()) {
            i2 = 1;
            O(Integer.valueOf(x(Default.TIMEZONE)), true, "" + H());
        } else {
            i2 = 1;
        }
        N();
        if (this.n0 == i2 && !isFinishing()) {
            new Handler().postDelayed(new fq1(7, this), 1000L);
        }
        this.w0.setOnClickListener(new o30(3, this));
        this.c0.setOnClickListener(this);
        this.i0.setOnClickListener(this);
        this.d0.setOnClickListener(this);
        this.e0.setOnClickListener(this);
        this.f0.setOnClickListener(this);
        this.g0.setOnClickListener(this);
        this.h0.setOnClickListener(this);
        this.H.setOnCheckedChangeListener(this);
        this.N.setOnCheckedChangeListener(this);
        this.M.setOnCheckedChangeListener(this);
        this.I.setOnCheckedChangeListener(this);
        this.J.setOnCheckedChangeListener(this);
        this.K.setOnCheckedChangeListener(this);
        this.L.setOnCheckedChangeListener(this);
        this.P.setOnCheckedChangeListener(this);
        if (this.u0) {
            this.Q.setOnCheckedChangeListener(this);
            this.R.setOnCheckedChangeListener(this);
            this.S.setOnCheckedChangeListener(this);
            this.T.setOnCheckedChangeListener(this);
            this.U.setOnCheckedChangeListener(this);
            this.V.setOnCheckedChangeListener(this);
            this.W.setOnCheckedChangeListener(this);
            this.X.setOnCheckedChangeListener(this);
            this.Y.setOnCheckedChangeListener(this);
            this.Z.setOnCheckedChangeListener(this);
            this.a0.setOnCheckedChangeListener(this);
            this.O.setOnCheckedChangeListener(this);
        } else {
            this.o0.setOnClickListener(this);
            this.p0.setOnClickListener(this);
            this.q0.setOnClickListener(this);
            this.r0.setOnClickListener(this);
            this.s0.setOnClickListener(this);
            this.t0.setOnClickListener(this);
        }
        this.j0.setOnFocusChangeListener(this);
        this.k0.setOnFocusChangeListener(this);
        this.l0.setOnFocusChangeListener(this);
        this.m0.setOnFocusChangeListener(this);
        this.X.setOnClickListener(this);
        this.Y.setOnClickListener(this);
        this.Z.setOnClickListener(this);
        this.a0.setOnClickListener(this);
        this.H.setOnClickListener(this);
        this.M.setOnClickListener(this);
        this.N.setOnClickListener(this);
        this.O.setOnClickListener(this);
        this.T.setOnClickListener(this);
        this.U.setOnClickListener(this);
        this.P.setOnClickListener(this);
        this.Q.setOnClickListener(this);
        this.R.setOnClickListener(this);
        this.S.setOnClickListener(this);
        k().a(this, new n8(this, 6));
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (view.getId() == R.id.ed_sequence) {
            if (z) {
                return;
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        } else if (view.getId() == R.id.ed_cus_1) {
            if (z) {
                return;
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        } else if (view.getId() == R.id.ed_cus_2) {
            if (z) {
                return;
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        } else {
            if (view.getId() != R.id.ed_cus_3 || z) {
                return;
            }
            HelperClass.hideSoftKeyboard(this, this.C);
        }
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!AllAdsApproval.iSFileNameBanner(this)) {
            this.B0.setVisibility(8);
            return;
        }
        int i = RemoteAdData.ADS_NETWORK_TYPE;
        Admob admob = this.A0;
        if (i != 9) {
            if (i == 1) {
                admob.loadAdaptive_banner(this, this.B0, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
                return;
            } else {
                if (i == 2) {
                    admob.loadAdaptive_bannerAdax(this, this.B0, RemoteAdData.ADAX_BANNER_ID);
                    return;
                }
                return;
            }
        }
        int i2 = RemoteAdData.FILENAME_SCREEN_BANNER_TYPE;
        if (i2 == 1) {
            admob.loadAdaptive_banner(this, this.B0, RemoteAdData.DETAIL_SCREEN_BANNER_ID);
        } else if (i2 == 2) {
            admob.loadAdaptive_bannerAdax(this, this.B0, RemoteAdData.ADAX_BANNER_ID);
        }
    }

    public final ArrayList s() {
        String strW;
        String strF;
        String strTrim;
        String strU;
        String strV;
        String strT;
        Boolean bool = Boolean.TRUE;
        ArrayList arrayList = new ArrayList();
        ViewModel viewModel = new ViewModel();
        String strY = "";
        if (this.H.isChecked()) {
            strW = w();
            viewModel.setSelected(bool);
            if (this.J.isChecked()) {
                strW = w();
                viewModel.setSelected(bool);
            }
            if (this.L.isChecked()) {
                strW = w();
                viewModel.setSelected(bool);
            }
        } else {
            viewModel.setSelected(bool);
            strW = "";
        }
        viewModel.setId(R.id.rel_main_datetime);
        viewModel.setValue(strW);
        viewModel.setTag(Default.DATETIME);
        arrayList.add(0, viewModel);
        ViewModel viewModel2 = new ViewModel();
        if (this.P.isChecked()) {
            strF = F();
            viewModel2.setSelected(bool);
        } else {
            viewModel2.setSelected(Boolean.FALSE);
            strF = "";
        }
        viewModel2.setId(R.id.rel_sequence_num);
        viewModel2.setValue(strF);
        viewModel2.setTag(Default.SEQUENCE);
        arrayList.add(1, viewModel2);
        ViewModel viewModel3 = new ViewModel();
        if (this.Q.isChecked()) {
            strTrim = this.k0.getText().toString().trim();
            viewModel3.setSelected(bool);
        } else {
            viewModel3.setSelected(Boolean.FALSE);
            strTrim = "";
        }
        viewModel3.setId(R.id.rel_custom_1);
        viewModel3.setValue(strTrim);
        viewModel3.setTag(Default.CUSTOM1);
        arrayList.add(2, viewModel3);
        ViewModel viewModel4 = new ViewModel();
        if (this.R.isChecked()) {
            strU = u();
            viewModel4.setSelected(bool);
        } else {
            viewModel4.setSelected(Boolean.FALSE);
            strU = "";
        }
        viewModel4.setId(R.id.rel_custom_2);
        viewModel4.setValue(strU);
        viewModel4.setTag(Default.CUSTOM2);
        arrayList.add(3, viewModel4);
        ViewModel viewModel5 = new ViewModel();
        if (this.S.isChecked()) {
            strV = v();
            viewModel5.setSelected(bool);
        } else {
            viewModel5.setSelected(Boolean.FALSE);
            strV = "";
        }
        viewModel5.setId(R.id.rel_custom_3);
        viewModel5.setValue(strV);
        viewModel5.setTag(SAqBqKHnKkFD.ibzGBuQQRDaPo);
        arrayList.add(4, viewModel5);
        ViewModel viewModel6 = new ViewModel();
        if (this.T.isChecked()) {
            if (this.X.isChecked()) {
                viewModel6.setSelected(bool);
            }
            if (this.Y.isChecked()) {
                viewModel6.setSelected(bool);
            }
            if (this.Z.isChecked()) {
                viewModel6.setSelected(bool);
            }
            if (this.a0.isChecked()) {
                viewModel6.setSelected(bool);
            }
            strT = t();
        } else {
            viewModel6.setSelected(Boolean.FALSE);
            strT = "";
        }
        viewModel6.setId(R.id.rel_add_address);
        viewModel6.setValue(strT);
        viewModel6.setTag(Default.ADDRESS);
        arrayList.add(5, viewModel6);
        ViewModel viewModel7 = new ViewModel();
        if (this.U.isChecked()) {
            if (this.V.isChecked()) {
                strY = y();
                viewModel7.setSelected(bool);
            }
            if (this.W.isChecked()) {
                strY = strY + "_" + y();
                viewModel7.setSelected(bool);
            }
        } else {
            viewModel7.setSelected(Boolean.FALSE);
        }
        viewModel7.setId(R.id.rel_lat_lng);
        viewModel7.setValue(strY);
        viewModel7.setTag(Default.LATLONG);
        arrayList.add(6, viewModel7);
        ViewModel viewModel8 = new ViewModel();
        viewModel8.setSelected(Boolean.valueOf(this.M.isChecked()));
        viewModel8.setId(R.id.rel_pluscode);
        viewModel8.setValue(E());
        viewModel8.setTag(Default.PLUSCODE);
        arrayList.add(7, viewModel8);
        ViewModel viewModel9 = new ViewModel();
        viewModel9.setSelected(Boolean.valueOf(this.N.isChecked()));
        viewModel9.setId(R.id.rel_timezone);
        viewModel9.setValue(H());
        viewModel9.setTag(Default.TIMEZONE);
        arrayList.add(8, viewModel9);
        ViewModel viewModel10 = new ViewModel();
        viewModel10.setSelected(Boolean.valueOf(this.O.isChecked()));
        viewModel10.setId(R.id.rel_note);
        viewModel10.setValue(D());
        viewModel10.setTag(Default.NOTES);
        arrayList.add(9, viewModel10);
        return arrayList;
    }

    public final String t() {
        String strZ = z();
        String strW = (this.X.isChecked() && M(strZ)) ? eo7.w("_", strZ) : "";
        String strA = A();
        if (this.Y.isChecked() && M(strA)) {
            strW = eo7.x(strW, "_", strA);
        }
        String strB = B();
        if (this.Z.isChecked() && M(strB)) {
            strW = eo7.x(strW, "_", strB);
        }
        String strC = C();
        if (this.a0.isChecked() && M(strC)) {
            strW = eo7.x(strW, "_", strC);
        }
        return M(strW) ? strW : "";
    }

    public final String u() {
        return this.l0.getText().toString();
    }

    public final String v() {
        return this.m0.getText().toString();
    }

    public final String w() {
        String strTrim = this.L.isChecked() ? new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()).trim() : new SimpleDateFormat("yyyyMMdd_hmmssa").format(new Date()).trim();
        if (!this.J.isChecked()) {
            return strTrim;
        }
        return strTrim + "_" + new SimpleDateFormat(OTysxApt.DtDCAcOrp).format(new Date());
    }

    public final int x(String str) {
        if (this.G == null) {
            this.G = new ArrayList();
            this.G = s();
        }
        for (int i = 0; i < this.G.size(); i++) {
            if (((ViewModel) this.G.get(i)).getTag().equals(str)) {
                return i;
            }
        }
        return 0;
    }

    public final String y() {
        String str = "";
        if (this.V.isChecked()) {
            str = "_" + this.B.getString(this, SP.LATITUDE, "") + "_" + this.B.getString(this, SP.LONGITUDE, "");
        }
        return this.W.isChecked() ? eo7.x(str, "_", this.y0.dms_latlng(this)) : str;
    }

    public final String z() {
        return this.B.getString(this, SP.LOC_LINE_1_ADDRESS, "");
    }
}