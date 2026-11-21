package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.mo1;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.SecondaryRecipientActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.CPD;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.gpsmapcamera.geotagginglocationonphoto.model.EmailModel;
import defpackage.a7;
import defpackage.ad3;
import defpackage.bi3;
import defpackage.bj;
import defpackage.c66;
import defpackage.cc7;
import defpackage.e65;
import defpackage.ej6;
import defpackage.gc1;
import defpackage.hv0;
import defpackage.iv0;
import defpackage.j6;
import defpackage.lf3;
import defpackage.lj6;
import defpackage.lt1;
import defpackage.mv1;
import defpackage.n8;
import defpackage.nj2;
import defpackage.ro6;
import defpackage.ub7;
import defpackage.vc4;
import defpackage.w7;
import defpackage.z55;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class SecondaryRecipientActivity extends bj {
    public static final /* synthetic */ int K = 0;
    public final ro6 B;
    public final ro6 C;
    public final ro6 D;
    public w7 E;
    public ArrayList F;
    public String G;
    public boolean H;
    public mo1 I;
    public Handler J = new Handler(Looper.getMainLooper());

    public SecondaryRecipientActivity() {
        final int i = 0;
        this.B = new ro6(new nj2(this) { // from class: a36
            public final /* synthetic */ SecondaryRecipientActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i2 = i;
                SecondaryRecipientActivity secondaryRecipientActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = SecondaryRecipientActivity.K;
                        int i4 = 0;
                        View viewInflate = secondaryRecipientActivity.getLayoutInflater().inflate(R.layout.activity_secondaryrecipient, (ViewGroup) null, false);
                        int i5 = R.id.adLayout;
                        View viewA = pn9.a(R.id.adLayout, viewInflate);
                        if (viewA != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) viewA;
                            er3 er3Var = new er3(i4, relativeLayout, relativeLayout);
                            i5 = R.id.addsecondary_recycler;
                            RecyclerView recyclerView = (RecyclerView) pn9.a(R.id.addsecondary_recycler, viewInflate);
                            if (recyclerView != null) {
                                i5 = R.id.ed_secondary_recipient;
                                EditText editText = (EditText) pn9.a(R.id.ed_secondary_recipient, viewInflate);
                                if (editText != null) {
                                    RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                                    i5 = R.id.img_add;
                                    if (((ImageView) pn9.a(R.id.img_add, viewInflate)) != null) {
                                        i5 = R.id.linear_add;
                                        LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.linear_add, viewInflate);
                                        if (linearLayout != null) {
                                            i5 = R.id.rel_add;
                                            if (((RelativeLayout) pn9.a(R.id.rel_add, viewInflate)) != null) {
                                                i5 = R.id.toolbar;
                                                View viewA2 = pn9.a(R.id.toolbar, viewInflate);
                                                if (viewA2 != null) {
                                                    return new j6(relativeLayout2, er3Var, recyclerView, editText, relativeLayout2, linearLayout, l76.a(viewA2));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i5)));
                        return null;
                    case 1:
                        int i6 = SecondaryRecipientActivity.K;
                        return new gc1(secondaryRecipientActivity);
                    default:
                        int i7 = SecondaryRecipientActivity.K;
                        return new SP(secondaryRecipientActivity);
                }
            }
        });
        final int i2 = 1;
        this.C = new ro6(new nj2(this) { // from class: a36
            public final /* synthetic */ SecondaryRecipientActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i3 = i2;
                SecondaryRecipientActivity secondaryRecipientActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = SecondaryRecipientActivity.K;
                        int i5 = 0;
                        View viewInflate = secondaryRecipientActivity.getLayoutInflater().inflate(R.layout.activity_secondaryrecipient, (ViewGroup) null, false);
                        int i6 = R.id.adLayout;
                        View viewA = pn9.a(R.id.adLayout, viewInflate);
                        if (viewA != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) viewA;
                            er3 er3Var = new er3(i5, relativeLayout, relativeLayout);
                            i6 = R.id.addsecondary_recycler;
                            RecyclerView recyclerView = (RecyclerView) pn9.a(R.id.addsecondary_recycler, viewInflate);
                            if (recyclerView != null) {
                                i6 = R.id.ed_secondary_recipient;
                                EditText editText = (EditText) pn9.a(R.id.ed_secondary_recipient, viewInflate);
                                if (editText != null) {
                                    RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                                    i6 = R.id.img_add;
                                    if (((ImageView) pn9.a(R.id.img_add, viewInflate)) != null) {
                                        i6 = R.id.linear_add;
                                        LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.linear_add, viewInflate);
                                        if (linearLayout != null) {
                                            i6 = R.id.rel_add;
                                            if (((RelativeLayout) pn9.a(R.id.rel_add, viewInflate)) != null) {
                                                i6 = R.id.toolbar;
                                                View viewA2 = pn9.a(R.id.toolbar, viewInflate);
                                                if (viewA2 != null) {
                                                    return new j6(relativeLayout2, er3Var, recyclerView, editText, relativeLayout2, linearLayout, l76.a(viewA2));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        int i7 = SecondaryRecipientActivity.K;
                        return new gc1(secondaryRecipientActivity);
                    default:
                        int i8 = SecondaryRecipientActivity.K;
                        return new SP(secondaryRecipientActivity);
                }
            }
        });
        final int i3 = 2;
        this.D = new ro6(new nj2(this) { // from class: a36
            public final /* synthetic */ SecondaryRecipientActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i4 = i3;
                SecondaryRecipientActivity secondaryRecipientActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = SecondaryRecipientActivity.K;
                        int i6 = 0;
                        View viewInflate = secondaryRecipientActivity.getLayoutInflater().inflate(R.layout.activity_secondaryrecipient, (ViewGroup) null, false);
                        int i7 = R.id.adLayout;
                        View viewA = pn9.a(R.id.adLayout, viewInflate);
                        if (viewA != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) viewA;
                            er3 er3Var = new er3(i6, relativeLayout, relativeLayout);
                            i7 = R.id.addsecondary_recycler;
                            RecyclerView recyclerView = (RecyclerView) pn9.a(R.id.addsecondary_recycler, viewInflate);
                            if (recyclerView != null) {
                                i7 = R.id.ed_secondary_recipient;
                                EditText editText = (EditText) pn9.a(R.id.ed_secondary_recipient, viewInflate);
                                if (editText != null) {
                                    RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                                    i7 = R.id.img_add;
                                    if (((ImageView) pn9.a(R.id.img_add, viewInflate)) != null) {
                                        i7 = R.id.linear_add;
                                        LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.linear_add, viewInflate);
                                        if (linearLayout != null) {
                                            i7 = R.id.rel_add;
                                            if (((RelativeLayout) pn9.a(R.id.rel_add, viewInflate)) != null) {
                                                i7 = R.id.toolbar;
                                                View viewA2 = pn9.a(R.id.toolbar, viewInflate);
                                                if (viewA2 != null) {
                                                    return new j6(relativeLayout2, er3Var, recyclerView, editText, relativeLayout2, linearLayout, l76.a(viewA2));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
                        return null;
                    case 1:
                        int i8 = SecondaryRecipientActivity.K;
                        return new gc1(secondaryRecipientActivity);
                    default:
                        int i9 = SecondaryRecipientActivity.K;
                        return new SP(secondaryRecipientActivity);
                }
            }
        });
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        Iterable iterable;
        String string;
        lt1.a(this);
        new HelperClass().SetLanguage(this);
        String string2 = v().getString(this, SP.APP_THEME, Default.LIGHT);
        final int i2 = 0;
        final int i3 = 1;
        if (bi3.b(string2, Default.DARK)) {
            this.H = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!bi3.b(string2, Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.H = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.H = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        setContentView(s().a);
        k().a(this, new n8(this, 23));
        RelativeLayout relativeLayout = s().e;
        z55 z55Var = new z55(8, this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(relativeLayout, z55Var);
        ((TextView) s().g.l).setText(getString(R.string.addi_rec));
        ((RelativeLayout) s().g.c).setOnClickListener(new View.OnClickListener(this) { // from class: z26
            public final /* synthetic */ SecondaryRecipientActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Set linkedHashSet;
                String string3;
                String string4;
                int i4 = i2;
                SecondaryRecipientActivity secondaryRecipientActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = SecondaryRecipientActivity.K;
                        secondaryRecipientActivity.u();
                        return;
                    case 1:
                        int i6 = SecondaryRecipientActivity.K;
                        ArrayList arrayList = secondaryRecipientActivity.F;
                        arrayList.getClass();
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            gc1 gc1VarT = secondaryRecipientActivity.t();
                            ArrayList arrayList2 = secondaryRecipientActivity.F;
                            arrayList2.getClass();
                            String string5 = ((EmailModel) arrayList2.get(i7)).getEmailvalue().toString();
                            ArrayList arrayList3 = secondaryRecipientActivity.F;
                            arrayList3.getClass();
                            String string6 = ((EmailModel) arrayList3.get(i7)).getEmailtype().toString();
                            ArrayList arrayList4 = secondaryRecipientActivity.F;
                            arrayList4.getClass();
                            boolean zIsIsselect = ((EmailModel) arrayList4.get(i7)).isIsselect();
                            SQLiteDatabase writableDatabase = gc1VarT.getWritableDatabase();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("email_isselect", Boolean.valueOf(zIsIsselect));
                            writableDatabase.update("email", contentValues, "email_recipient = ? AND email_type = ?", new String[]{string5, string6});
                        }
                        secondaryRecipientActivity.v().setString(secondaryRecipientActivity, SP.EMAIL_SECONDARY_RECIPIENT, secondaryRecipientActivity.G);
                        secondaryRecipientActivity.u();
                        return;
                    default:
                        int i8 = SecondaryRecipientActivity.K;
                        HelperClass.hideSoftKeyboard(secondaryRecipientActivity, view);
                        String string7 = ej6.Y(secondaryRecipientActivity.s().d.getText().toString()).toString();
                        if (!(string7 == null ? false : Patterns.EMAIL_ADDRESS.matcher(string7).matches()) || string7.length() <= 0) {
                            String string8 = secondaryRecipientActivity.getString(R.string.enter_correct_email);
                            string8.getClass();
                            cc6 cc6VarI = cc6.i(secondaryRecipientActivity.s().e, string8, -1);
                            cc6VarI.f((RelativeLayout) secondaryRecipientActivity.s().b.b);
                            cc6VarI.k();
                            return;
                        }
                        Cursor cursorRawQuery = secondaryRecipientActivity.t().getWritableDatabase().rawQuery("SELECT * FROM email WHERE email_recipient=? AND email_type=?", new String[]{string7, "CC"});
                        boolean z = cursorRawQuery.getCount() > 0;
                        cursorRawQuery.close();
                        if (z) {
                            String string9 = secondaryRecipientActivity.getString(R.string.email_is_added_already);
                            string9.getClass();
                            cc6 cc6VarI2 = cc6.i(secondaryRecipientActivity.s().e, string9, -1);
                            cc6VarI2.f((RelativeLayout) secondaryRecipientActivity.s().b.b);
                            cc6VarI2.k();
                            return;
                        }
                        secondaryRecipientActivity.t().K(string7, "CC");
                        ArrayList arrayList5 = secondaryRecipientActivity.F;
                        if (arrayList5 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int size2 = arrayList5.size();
                            int i9 = 0;
                            while (i9 < size2) {
                                Object obj = arrayList5.get(i9);
                                i9++;
                                if (((EmailModel) obj).isIsselect()) {
                                    arrayList6.add(obj);
                                }
                            }
                            ArrayList arrayList7 = new ArrayList();
                            int size3 = arrayList6.size();
                            int i10 = 0;
                            while (i10 < size3) {
                                Object obj2 = arrayList6.get(i10);
                                i10++;
                                String emailvalue = ((EmailModel) obj2).getEmailvalue();
                                if (emailvalue != null) {
                                    String lowerCase = emailvalue.toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    string4 = ej6.Y(lowerCase).toString();
                                } else {
                                    string4 = null;
                                }
                                if (string4 != null) {
                                    arrayList7.add(string4);
                                }
                            }
                            linkedHashSet = hv0.X(arrayList7);
                        } else {
                            linkedHashSet = new LinkedHashSet();
                        }
                        String lowerCase2 = string7.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        linkedHashSet.add(lowerCase2);
                        ArrayList arrayListI = secondaryRecipientActivity.t().i("CC");
                        secondaryRecipientActivity.F = arrayListI;
                        int size4 = arrayListI.size();
                        int i11 = 0;
                        while (i11 < size4) {
                            Object obj3 = arrayListI.get(i11);
                            i11++;
                            EmailModel emailModel = (EmailModel) obj3;
                            String emailvalue2 = emailModel.getEmailvalue();
                            if (emailvalue2 != null) {
                                String lowerCase3 = emailvalue2.toLowerCase(Locale.ROOT);
                                lowerCase3.getClass();
                                string3 = ej6.Y(lowerCase3).toString();
                            } else {
                                string3 = null;
                            }
                            emailModel.setIsselect(hv0.q(linkedHashSet, string3));
                        }
                        w7 w7Var = secondaryRecipientActivity.E;
                        if (w7Var == null) {
                            bi3.g("emailAdapter");
                            throw null;
                        }
                        ArrayList arrayList8 = secondaryRecipientActivity.F;
                        arrayList8.getClass();
                        w7Var.e = arrayList8;
                        w7Var.e();
                        secondaryRecipientActivity.s().d.setText("");
                        ((RelativeLayout) secondaryRecipientActivity.s().g.h).setVisibility(0);
                        secondaryRecipientActivity.G = secondaryRecipientActivity.y();
                        HelperClass.hideSoftKeyboard(secondaryRecipientActivity, secondaryRecipientActivity.s().d);
                        return;
                }
            }
        });
        ((RelativeLayout) s().g.h).setOnClickListener(new View.OnClickListener(this) { // from class: z26
            public final /* synthetic */ SecondaryRecipientActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Set linkedHashSet;
                String string3;
                String string4;
                int i4 = i3;
                SecondaryRecipientActivity secondaryRecipientActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = SecondaryRecipientActivity.K;
                        secondaryRecipientActivity.u();
                        return;
                    case 1:
                        int i6 = SecondaryRecipientActivity.K;
                        ArrayList arrayList = secondaryRecipientActivity.F;
                        arrayList.getClass();
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            gc1 gc1VarT = secondaryRecipientActivity.t();
                            ArrayList arrayList2 = secondaryRecipientActivity.F;
                            arrayList2.getClass();
                            String string5 = ((EmailModel) arrayList2.get(i7)).getEmailvalue().toString();
                            ArrayList arrayList3 = secondaryRecipientActivity.F;
                            arrayList3.getClass();
                            String string6 = ((EmailModel) arrayList3.get(i7)).getEmailtype().toString();
                            ArrayList arrayList4 = secondaryRecipientActivity.F;
                            arrayList4.getClass();
                            boolean zIsIsselect = ((EmailModel) arrayList4.get(i7)).isIsselect();
                            SQLiteDatabase writableDatabase = gc1VarT.getWritableDatabase();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("email_isselect", Boolean.valueOf(zIsIsselect));
                            writableDatabase.update("email", contentValues, "email_recipient = ? AND email_type = ?", new String[]{string5, string6});
                        }
                        secondaryRecipientActivity.v().setString(secondaryRecipientActivity, SP.EMAIL_SECONDARY_RECIPIENT, secondaryRecipientActivity.G);
                        secondaryRecipientActivity.u();
                        return;
                    default:
                        int i8 = SecondaryRecipientActivity.K;
                        HelperClass.hideSoftKeyboard(secondaryRecipientActivity, view);
                        String string7 = ej6.Y(secondaryRecipientActivity.s().d.getText().toString()).toString();
                        if (!(string7 == null ? false : Patterns.EMAIL_ADDRESS.matcher(string7).matches()) || string7.length() <= 0) {
                            String string8 = secondaryRecipientActivity.getString(R.string.enter_correct_email);
                            string8.getClass();
                            cc6 cc6VarI = cc6.i(secondaryRecipientActivity.s().e, string8, -1);
                            cc6VarI.f((RelativeLayout) secondaryRecipientActivity.s().b.b);
                            cc6VarI.k();
                            return;
                        }
                        Cursor cursorRawQuery = secondaryRecipientActivity.t().getWritableDatabase().rawQuery("SELECT * FROM email WHERE email_recipient=? AND email_type=?", new String[]{string7, "CC"});
                        boolean z = cursorRawQuery.getCount() > 0;
                        cursorRawQuery.close();
                        if (z) {
                            String string9 = secondaryRecipientActivity.getString(R.string.email_is_added_already);
                            string9.getClass();
                            cc6 cc6VarI2 = cc6.i(secondaryRecipientActivity.s().e, string9, -1);
                            cc6VarI2.f((RelativeLayout) secondaryRecipientActivity.s().b.b);
                            cc6VarI2.k();
                            return;
                        }
                        secondaryRecipientActivity.t().K(string7, "CC");
                        ArrayList arrayList5 = secondaryRecipientActivity.F;
                        if (arrayList5 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int size2 = arrayList5.size();
                            int i9 = 0;
                            while (i9 < size2) {
                                Object obj = arrayList5.get(i9);
                                i9++;
                                if (((EmailModel) obj).isIsselect()) {
                                    arrayList6.add(obj);
                                }
                            }
                            ArrayList arrayList7 = new ArrayList();
                            int size3 = arrayList6.size();
                            int i10 = 0;
                            while (i10 < size3) {
                                Object obj2 = arrayList6.get(i10);
                                i10++;
                                String emailvalue = ((EmailModel) obj2).getEmailvalue();
                                if (emailvalue != null) {
                                    String lowerCase = emailvalue.toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    string4 = ej6.Y(lowerCase).toString();
                                } else {
                                    string4 = null;
                                }
                                if (string4 != null) {
                                    arrayList7.add(string4);
                                }
                            }
                            linkedHashSet = hv0.X(arrayList7);
                        } else {
                            linkedHashSet = new LinkedHashSet();
                        }
                        String lowerCase2 = string7.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        linkedHashSet.add(lowerCase2);
                        ArrayList arrayListI = secondaryRecipientActivity.t().i("CC");
                        secondaryRecipientActivity.F = arrayListI;
                        int size4 = arrayListI.size();
                        int i11 = 0;
                        while (i11 < size4) {
                            Object obj3 = arrayListI.get(i11);
                            i11++;
                            EmailModel emailModel = (EmailModel) obj3;
                            String emailvalue2 = emailModel.getEmailvalue();
                            if (emailvalue2 != null) {
                                String lowerCase3 = emailvalue2.toLowerCase(Locale.ROOT);
                                lowerCase3.getClass();
                                string3 = ej6.Y(lowerCase3).toString();
                            } else {
                                string3 = null;
                            }
                            emailModel.setIsselect(hv0.q(linkedHashSet, string3));
                        }
                        w7 w7Var = secondaryRecipientActivity.E;
                        if (w7Var == null) {
                            bi3.g("emailAdapter");
                            throw null;
                        }
                        ArrayList arrayList8 = secondaryRecipientActivity.F;
                        arrayList8.getClass();
                        w7Var.e = arrayList8;
                        w7Var.e();
                        secondaryRecipientActivity.s().d.setText("");
                        ((RelativeLayout) secondaryRecipientActivity.s().g.h).setVisibility(0);
                        secondaryRecipientActivity.G = secondaryRecipientActivity.y();
                        HelperClass.hideSoftKeyboard(secondaryRecipientActivity, secondaryRecipientActivity.s().d);
                        return;
                }
            }
        });
        final int i4 = 2;
        s().f.setOnClickListener(new View.OnClickListener(this) { // from class: z26
            public final /* synthetic */ SecondaryRecipientActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Set linkedHashSet;
                String string3;
                String string4;
                int i5 = i4;
                SecondaryRecipientActivity secondaryRecipientActivity = this.b;
                switch (i5) {
                    case 0:
                        int i6 = SecondaryRecipientActivity.K;
                        secondaryRecipientActivity.u();
                        return;
                    case 1:
                        int i7 = SecondaryRecipientActivity.K;
                        ArrayList arrayList = secondaryRecipientActivity.F;
                        arrayList.getClass();
                        int size = arrayList.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            gc1 gc1VarT = secondaryRecipientActivity.t();
                            ArrayList arrayList2 = secondaryRecipientActivity.F;
                            arrayList2.getClass();
                            String string5 = ((EmailModel) arrayList2.get(i8)).getEmailvalue().toString();
                            ArrayList arrayList3 = secondaryRecipientActivity.F;
                            arrayList3.getClass();
                            String string6 = ((EmailModel) arrayList3.get(i8)).getEmailtype().toString();
                            ArrayList arrayList4 = secondaryRecipientActivity.F;
                            arrayList4.getClass();
                            boolean zIsIsselect = ((EmailModel) arrayList4.get(i8)).isIsselect();
                            SQLiteDatabase writableDatabase = gc1VarT.getWritableDatabase();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("email_isselect", Boolean.valueOf(zIsIsselect));
                            writableDatabase.update("email", contentValues, "email_recipient = ? AND email_type = ?", new String[]{string5, string6});
                        }
                        secondaryRecipientActivity.v().setString(secondaryRecipientActivity, SP.EMAIL_SECONDARY_RECIPIENT, secondaryRecipientActivity.G);
                        secondaryRecipientActivity.u();
                        return;
                    default:
                        int i9 = SecondaryRecipientActivity.K;
                        HelperClass.hideSoftKeyboard(secondaryRecipientActivity, view);
                        String string7 = ej6.Y(secondaryRecipientActivity.s().d.getText().toString()).toString();
                        if (!(string7 == null ? false : Patterns.EMAIL_ADDRESS.matcher(string7).matches()) || string7.length() <= 0) {
                            String string8 = secondaryRecipientActivity.getString(R.string.enter_correct_email);
                            string8.getClass();
                            cc6 cc6VarI = cc6.i(secondaryRecipientActivity.s().e, string8, -1);
                            cc6VarI.f((RelativeLayout) secondaryRecipientActivity.s().b.b);
                            cc6VarI.k();
                            return;
                        }
                        Cursor cursorRawQuery = secondaryRecipientActivity.t().getWritableDatabase().rawQuery("SELECT * FROM email WHERE email_recipient=? AND email_type=?", new String[]{string7, "CC"});
                        boolean z = cursorRawQuery.getCount() > 0;
                        cursorRawQuery.close();
                        if (z) {
                            String string9 = secondaryRecipientActivity.getString(R.string.email_is_added_already);
                            string9.getClass();
                            cc6 cc6VarI2 = cc6.i(secondaryRecipientActivity.s().e, string9, -1);
                            cc6VarI2.f((RelativeLayout) secondaryRecipientActivity.s().b.b);
                            cc6VarI2.k();
                            return;
                        }
                        secondaryRecipientActivity.t().K(string7, "CC");
                        ArrayList arrayList5 = secondaryRecipientActivity.F;
                        if (arrayList5 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int size2 = arrayList5.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj = arrayList5.get(i10);
                                i10++;
                                if (((EmailModel) obj).isIsselect()) {
                                    arrayList6.add(obj);
                                }
                            }
                            ArrayList arrayList7 = new ArrayList();
                            int size3 = arrayList6.size();
                            int i11 = 0;
                            while (i11 < size3) {
                                Object obj2 = arrayList6.get(i11);
                                i11++;
                                String emailvalue = ((EmailModel) obj2).getEmailvalue();
                                if (emailvalue != null) {
                                    String lowerCase = emailvalue.toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    string4 = ej6.Y(lowerCase).toString();
                                } else {
                                    string4 = null;
                                }
                                if (string4 != null) {
                                    arrayList7.add(string4);
                                }
                            }
                            linkedHashSet = hv0.X(arrayList7);
                        } else {
                            linkedHashSet = new LinkedHashSet();
                        }
                        String lowerCase2 = string7.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        linkedHashSet.add(lowerCase2);
                        ArrayList arrayListI = secondaryRecipientActivity.t().i("CC");
                        secondaryRecipientActivity.F = arrayListI;
                        int size4 = arrayListI.size();
                        int i12 = 0;
                        while (i12 < size4) {
                            Object obj3 = arrayListI.get(i12);
                            i12++;
                            EmailModel emailModel = (EmailModel) obj3;
                            String emailvalue2 = emailModel.getEmailvalue();
                            if (emailvalue2 != null) {
                                String lowerCase3 = emailvalue2.toLowerCase(Locale.ROOT);
                                lowerCase3.getClass();
                                string3 = ej6.Y(lowerCase3).toString();
                            } else {
                                string3 = null;
                            }
                            emailModel.setIsselect(hv0.q(linkedHashSet, string3));
                        }
                        w7 w7Var = secondaryRecipientActivity.E;
                        if (w7Var == null) {
                            bi3.g("emailAdapter");
                            throw null;
                        }
                        ArrayList arrayList8 = secondaryRecipientActivity.F;
                        arrayList8.getClass();
                        w7Var.e = arrayList8;
                        w7Var.e();
                        secondaryRecipientActivity.s().d.setText("");
                        ((RelativeLayout) secondaryRecipientActivity.s().g.h).setVisibility(0);
                        secondaryRecipientActivity.G = secondaryRecipientActivity.y();
                        HelperClass.hideSoftKeyboard(secondaryRecipientActivity, secondaryRecipientActivity.s().d);
                        return;
                }
            }
        });
        lf3 lf3Var = new lf3(17, this);
        this.F = t().i("CC");
        String string3 = v().getString(this, SP.EMAIL_SECONDARY_RECIPIENT, "");
        String str = string3 != null ? string3 : "";
        if (str.equals("-")) {
            iterable = mv1.a;
        } else {
            List listN = ej6.N(str, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(iv0.d(listN, 10));
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                String lowerCase = ej6.Y((String) it.next()).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                arrayList.add(lowerCase);
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                String str2 = (String) obj;
                if (str2.length() > 0 && !str2.equals("-")) {
                    arrayList2.add(obj);
                }
            }
            iterable = arrayList2;
        }
        ArrayList arrayList3 = this.F;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList3.get(i6);
                i6++;
                EmailModel emailModel = (EmailModel) obj2;
                Iterable iterable2 = iterable;
                String emailvalue = emailModel.getEmailvalue();
                if (emailvalue != null) {
                    String lowerCase2 = emailvalue.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    string = ej6.Y(lowerCase2).toString();
                } else {
                    string = null;
                }
                emailModel.setIsselect(hv0.q(iterable2, string));
            }
        }
        this.G = y();
        ArrayList arrayList4 = this.F;
        arrayList4.getClass();
        this.E = new w7(this, arrayList4, lf3Var);
        RecyclerView recyclerView = s().c;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.e1(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = s().c;
        w7 w7Var = this.E;
        if (w7Var == null) {
            bi3.g("emailAdapter");
            throw null;
        }
        recyclerView2.setAdapter(w7Var);
        ArrayList arrayList5 = this.F;
        arrayList5.getClass();
        if (arrayList5.isEmpty()) {
            ((RelativeLayout) s().g.h).setVisibility(8);
        } else {
            ((RelativeLayout) s().g.h).setVisibility(0);
        }
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!AllAdsApproval.iSAddRecScreenBanner(this)) {
            ((RelativeLayout) s().b.c).setVisibility(8);
            return;
        }
        Admob admob = new Admob();
        int i = RemoteAdData.ADS_NETWORK_TYPE;
        if (i != 9) {
            if (i == 1) {
                admob.loadAdaptive_banner(this, (RelativeLayout) s().b.c, RemoteAdData.SETTING_SCREEN_BANNER_ID);
                return;
            } else {
                if (i == 2) {
                    admob.loadAdaptive_bannerAdax(this, (RelativeLayout) s().b.c, RemoteAdData.ADAX_BANNER_ID);
                    return;
                }
                return;
            }
        }
        int i2 = RemoteAdData.ADD_REC_SCREEN_BANNER_TYPE;
        if (i2 == 1) {
            admob.loadAdaptive_banner(this, (RelativeLayout) s().b.c, RemoteAdData.SETTING_SCREEN_BANNER_ID);
        } else if (i2 == 2) {
            admob.loadAdaptive_bannerAdax(this, (RelativeLayout) s().b.c, RemoteAdData.ADAX_BANNER_ID);
        }
    }

    public final j6 s() {
        return (j6) this.B.getValue();
    }

    public final gc1 t() {
        return (gc1) this.C.getValue();
    }

    public final void u() {
        int integer = v().getInteger(this, HelperClass.SETTING_COUNTADS, 0);
        int i = RemoteAdData.SETTING_OPTION_CLICK_COUNT;
        if (integer > i) {
            integer = i;
        }
        if (!AllAdsApproval.iSSettingOptionScreenFS(this)) {
            finish();
            return;
        }
        if (integer < RemoteAdData.SETTING_OPTION_CLICK_COUNT) {
            v().setInteger(this, HelperClass.SETTING_COUNTADS, integer + 1);
            finish();
            return;
        }
        CPD.ShowDialog(this, getString(R.string.cluster_loading));
        v().setInteger(this, HelperClass.SETTING_COUNTADS, 0);
        int i2 = RemoteAdData.ADS_NETWORK_TYPE;
        if (i2 == 9) {
            int i3 = RemoteAdData.EMAIL_SETTING_SCREEN_FS_TYPE;
            if (i3 == 1) {
                w();
            } else if (i3 == 2) {
                x();
            }
        } else if (i2 == 1) {
            w();
        } else if (i2 == 2) {
            x();
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.J = handler;
        handler.postDelayed(new vc4(16, this), 7000L);
    }

    public final SP v() {
        return (SP) this.D.getValue();
    }

    public final void w() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new e65(6, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void x() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new ad3(18, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final String y() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.F;
        arrayList.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = this.F;
            arrayList2.getClass();
            if (((EmailModel) arrayList2.get(i)).isIsselect()) {
                ArrayList arrayList3 = this.F;
                arrayList3.getClass();
                sb.append(((EmailModel) arrayList3.get(i)).getEmailvalue());
                sb.append(",");
            }
        }
        String strSubstring = lj6.h(sb.toString(), ",", false) ? sb.toString().substring(0, sb.toString().length() - 1) : null;
        if (strSubstring == null) {
            strSubstring = "-";
        }
        return strSubstring.toString();
    }
}