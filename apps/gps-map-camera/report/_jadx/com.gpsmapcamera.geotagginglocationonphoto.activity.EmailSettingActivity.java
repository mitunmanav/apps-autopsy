package com.gpsmapcamera.geotagginglocationonphoto.activity;

import ads_mobile_sdk.mo1;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import com.gpsmapcamera.geotagginglocationonphoto.activity.EmailSettingActivity;
import com.gpsmapcamera.geotagginglocationonphoto.activity.PrimaryRecipientActivity;
import com.gpsmapcamera.geotagginglocationonphoto.activity.SecondaryRecipientActivity;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Admob;
import com.gpsmapcamera.geotagginglocationonphoto.helper.AllAdsApproval;
import com.gpsmapcamera.geotagginglocationonphoto.helper.Default;
import com.gpsmapcamera.geotagginglocationonphoto.helper.HelperClass;
import com.gpsmapcamera.geotagginglocationonphoto.helper.RemoteAdData;
import com.gpsmapcamera.geotagginglocationonphoto.helper.SP;
import com.onesignal.notifications.activities.MF.UdXpKYRTUg;
import defpackage.a7;
import defpackage.bi3;
import defpackage.bj;
import defpackage.c66;
import defpackage.cc6;
import defpackage.cc7;
import defpackage.cq1;
import defpackage.e51;
import defpackage.f6;
import defpackage.j5;
import defpackage.ju1;
import defpackage.k30;
import defpackage.lt1;
import defpackage.n8;
import defpackage.nj2;
import defpackage.o30;
import defpackage.r41;
import defpackage.rm;
import defpackage.ro6;
import defpackage.tv5;
import defpackage.ub7;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class EmailSettingActivity extends bj {
    public static final /* synthetic */ int I = 0;
    public final ro6 B;
    public boolean C;
    public final ro6 E;
    public boolean F;
    public mo1 G;
    public final ro6 D = new ro6(new f6(7));
    public final Handler H = new Handler(Looper.getMainLooper());

    public EmailSettingActivity() {
        final int i = 0;
        this.B = new ro6(new nj2(this) { // from class: hu1
            public final /* synthetic */ EmailSettingActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i2 = i;
                EmailSettingActivity emailSettingActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = EmailSettingActivity.I;
                        int i4 = 0;
                        View viewInflate = emailSettingActivity.getLayoutInflater().inflate(R.layout.activity_email_setting, (ViewGroup) null, false);
                        int i5 = R.id.adLayout;
                        View viewA = pn9.a(R.id.adLayout, viewInflate);
                        if (viewA != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) viewA;
                            er3 er3Var = new er3(i4, relativeLayout, relativeLayout);
                            i5 = R.id.edtContentText;
                            EditText editText = (EditText) pn9.a(R.id.edtContentText, viewInflate);
                            if (editText != null) {
                                RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                                i5 = R.id.imgArrow1;
                                if (((ImageView) pn9.a(R.id.imgArrow1, viewInflate)) != null) {
                                    i5 = R.id.imgArrow2;
                                    if (((ImageView) pn9.a(R.id.imgArrow2, viewInflate)) != null) {
                                        i5 = R.id.imgArrow3;
                                        if (((ImageView) pn9.a(R.id.imgArrow3, viewInflate)) != null) {
                                            i5 = R.id.imgArrow4;
                                            ImageView imageView = (ImageView) pn9.a(R.id.imgArrow4, viewInflate);
                                            if (imageView != null) {
                                                i5 = R.id.llSubItem;
                                                LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.llSubItem, viewInflate);
                                                if (linearLayout != null) {
                                                    i5 = R.id.noteVisibleOnCapture;
                                                    if (((MaterialCardView) pn9.a(R.id.noteVisibleOnCapture, viewInflate)) != null) {
                                                        i5 = R.id.rel_content;
                                                        RelativeLayout relativeLayout3 = (RelativeLayout) pn9.a(R.id.rel_content, viewInflate);
                                                        if (relativeLayout3 != null) {
                                                            i5 = R.id.rel_content_value;
                                                            if (((RelativeLayout) pn9.a(R.id.rel_content_value, viewInflate)) != null) {
                                                                i5 = R.id.rel_primary_recipient;
                                                                RelativeLayout relativeLayout4 = (RelativeLayout) pn9.a(R.id.rel_primary_recipient, viewInflate);
                                                                if (relativeLayout4 != null) {
                                                                    i5 = R.id.rel_primary_recipient_value;
                                                                    if (((RelativeLayout) pn9.a(R.id.rel_primary_recipient_value, viewInflate)) != null) {
                                                                        i5 = R.id.rel_secondary_recipient;
                                                                        RelativeLayout relativeLayout5 = (RelativeLayout) pn9.a(R.id.rel_secondary_recipient, viewInflate);
                                                                        if (relativeLayout5 != null) {
                                                                            i5 = R.id.rel_secondary_recipient_value;
                                                                            if (((RelativeLayout) pn9.a(R.id.rel_secondary_recipient_value, viewInflate)) != null) {
                                                                                i5 = R.id.rel_subject;
                                                                                RelativeLayout relativeLayout6 = (RelativeLayout) pn9.a(R.id.rel_subject, viewInflate);
                                                                                if (relativeLayout6 != null) {
                                                                                    i5 = R.id.rel_subject_value;
                                                                                    if (((RelativeLayout) pn9.a(R.id.rel_subject_value, viewInflate)) != null) {
                                                                                        i5 = R.id.scrollView_main;
                                                                                        ScrollView scrollView = (ScrollView) pn9.a(R.id.scrollView_main, viewInflate);
                                                                                        if (scrollView != null) {
                                                                                            i5 = R.id.switch_on_off;
                                                                                            SwitchMaterial switchMaterial = (SwitchMaterial) pn9.a(R.id.switch_on_off, viewInflate);
                                                                                            if (switchMaterial != null) {
                                                                                                i5 = R.id.toolbar;
                                                                                                View viewA2 = pn9.a(R.id.toolbar, viewInflate);
                                                                                                if (viewA2 != null) {
                                                                                                    l76 l76VarA = l76.a(viewA2);
                                                                                                    i5 = R.id.tv_content_title;
                                                                                                    TextView textView = (TextView) pn9.a(R.id.tv_content_title, viewInflate);
                                                                                                    if (textView != null) {
                                                                                                        i5 = R.id.tv_content_value;
                                                                                                        TextView textView2 = (TextView) pn9.a(R.id.tv_content_value, viewInflate);
                                                                                                        if (textView2 != null) {
                                                                                                            i5 = R.id.tv_primary_recipient;
                                                                                                            TextView textView3 = (TextView) pn9.a(R.id.tv_primary_recipient, viewInflate);
                                                                                                            if (textView3 != null) {
                                                                                                                i5 = R.id.tv_primary_recipient_value;
                                                                                                                TextView textView4 = (TextView) pn9.a(R.id.tv_primary_recipient_value, viewInflate);
                                                                                                                if (textView4 != null) {
                                                                                                                    i5 = R.id.tv_secondary_recipient_title;
                                                                                                                    TextView textView5 = (TextView) pn9.a(R.id.tv_secondary_recipient_title, viewInflate);
                                                                                                                    if (textView5 != null) {
                                                                                                                        i5 = R.id.tv_secondary_recipient_value;
                                                                                                                        TextView textView6 = (TextView) pn9.a(R.id.tv_secondary_recipient_value, viewInflate);
                                                                                                                        if (textView6 != null) {
                                                                                                                            i5 = R.id.tv_subject;
                                                                                                                            TextView textView7 = (TextView) pn9.a(R.id.tv_subject, viewInflate);
                                                                                                                            if (textView7 != null) {
                                                                                                                                i5 = R.id.tv_subject_value;
                                                                                                                                TextView textView8 = (TextView) pn9.a(R.id.tv_subject_value, viewInflate);
                                                                                                                                if (textView8 != null) {
                                                                                                                                    return new j5(relativeLayout2, er3Var, editText, relativeLayout2, imageView, linearLayout, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, scrollView, switchMaterial, l76VarA, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i5)));
                        return null;
                    default:
                        int i6 = EmailSettingActivity.I;
                        return new SP(emailSettingActivity);
                }
            }
        });
        final int i2 = 1;
        this.E = new ro6(new nj2(this) { // from class: hu1
            public final /* synthetic */ EmailSettingActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.nj2
            public final Object invoke() {
                int i3 = i2;
                EmailSettingActivity emailSettingActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = EmailSettingActivity.I;
                        int i5 = 0;
                        View viewInflate = emailSettingActivity.getLayoutInflater().inflate(R.layout.activity_email_setting, (ViewGroup) null, false);
                        int i6 = R.id.adLayout;
                        View viewA = pn9.a(R.id.adLayout, viewInflate);
                        if (viewA != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) viewA;
                            er3 er3Var = new er3(i5, relativeLayout, relativeLayout);
                            i6 = R.id.edtContentText;
                            EditText editText = (EditText) pn9.a(R.id.edtContentText, viewInflate);
                            if (editText != null) {
                                RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                                i6 = R.id.imgArrow1;
                                if (((ImageView) pn9.a(R.id.imgArrow1, viewInflate)) != null) {
                                    i6 = R.id.imgArrow2;
                                    if (((ImageView) pn9.a(R.id.imgArrow2, viewInflate)) != null) {
                                        i6 = R.id.imgArrow3;
                                        if (((ImageView) pn9.a(R.id.imgArrow3, viewInflate)) != null) {
                                            i6 = R.id.imgArrow4;
                                            ImageView imageView = (ImageView) pn9.a(R.id.imgArrow4, viewInflate);
                                            if (imageView != null) {
                                                i6 = R.id.llSubItem;
                                                LinearLayout linearLayout = (LinearLayout) pn9.a(R.id.llSubItem, viewInflate);
                                                if (linearLayout != null) {
                                                    i6 = R.id.noteVisibleOnCapture;
                                                    if (((MaterialCardView) pn9.a(R.id.noteVisibleOnCapture, viewInflate)) != null) {
                                                        i6 = R.id.rel_content;
                                                        RelativeLayout relativeLayout3 = (RelativeLayout) pn9.a(R.id.rel_content, viewInflate);
                                                        if (relativeLayout3 != null) {
                                                            i6 = R.id.rel_content_value;
                                                            if (((RelativeLayout) pn9.a(R.id.rel_content_value, viewInflate)) != null) {
                                                                i6 = R.id.rel_primary_recipient;
                                                                RelativeLayout relativeLayout4 = (RelativeLayout) pn9.a(R.id.rel_primary_recipient, viewInflate);
                                                                if (relativeLayout4 != null) {
                                                                    i6 = R.id.rel_primary_recipient_value;
                                                                    if (((RelativeLayout) pn9.a(R.id.rel_primary_recipient_value, viewInflate)) != null) {
                                                                        i6 = R.id.rel_secondary_recipient;
                                                                        RelativeLayout relativeLayout5 = (RelativeLayout) pn9.a(R.id.rel_secondary_recipient, viewInflate);
                                                                        if (relativeLayout5 != null) {
                                                                            i6 = R.id.rel_secondary_recipient_value;
                                                                            if (((RelativeLayout) pn9.a(R.id.rel_secondary_recipient_value, viewInflate)) != null) {
                                                                                i6 = R.id.rel_subject;
                                                                                RelativeLayout relativeLayout6 = (RelativeLayout) pn9.a(R.id.rel_subject, viewInflate);
                                                                                if (relativeLayout6 != null) {
                                                                                    i6 = R.id.rel_subject_value;
                                                                                    if (((RelativeLayout) pn9.a(R.id.rel_subject_value, viewInflate)) != null) {
                                                                                        i6 = R.id.scrollView_main;
                                                                                        ScrollView scrollView = (ScrollView) pn9.a(R.id.scrollView_main, viewInflate);
                                                                                        if (scrollView != null) {
                                                                                            i6 = R.id.switch_on_off;
                                                                                            SwitchMaterial switchMaterial = (SwitchMaterial) pn9.a(R.id.switch_on_off, viewInflate);
                                                                                            if (switchMaterial != null) {
                                                                                                i6 = R.id.toolbar;
                                                                                                View viewA2 = pn9.a(R.id.toolbar, viewInflate);
                                                                                                if (viewA2 != null) {
                                                                                                    l76 l76VarA = l76.a(viewA2);
                                                                                                    i6 = R.id.tv_content_title;
                                                                                                    TextView textView = (TextView) pn9.a(R.id.tv_content_title, viewInflate);
                                                                                                    if (textView != null) {
                                                                                                        i6 = R.id.tv_content_value;
                                                                                                        TextView textView2 = (TextView) pn9.a(R.id.tv_content_value, viewInflate);
                                                                                                        if (textView2 != null) {
                                                                                                            i6 = R.id.tv_primary_recipient;
                                                                                                            TextView textView3 = (TextView) pn9.a(R.id.tv_primary_recipient, viewInflate);
                                                                                                            if (textView3 != null) {
                                                                                                                i6 = R.id.tv_primary_recipient_value;
                                                                                                                TextView textView4 = (TextView) pn9.a(R.id.tv_primary_recipient_value, viewInflate);
                                                                                                                if (textView4 != null) {
                                                                                                                    i6 = R.id.tv_secondary_recipient_title;
                                                                                                                    TextView textView5 = (TextView) pn9.a(R.id.tv_secondary_recipient_title, viewInflate);
                                                                                                                    if (textView5 != null) {
                                                                                                                        i6 = R.id.tv_secondary_recipient_value;
                                                                                                                        TextView textView6 = (TextView) pn9.a(R.id.tv_secondary_recipient_value, viewInflate);
                                                                                                                        if (textView6 != null) {
                                                                                                                            i6 = R.id.tv_subject;
                                                                                                                            TextView textView7 = (TextView) pn9.a(R.id.tv_subject, viewInflate);
                                                                                                                            if (textView7 != null) {
                                                                                                                                i6 = R.id.tv_subject_value;
                                                                                                                                TextView textView8 = (TextView) pn9.a(R.id.tv_subject_value, viewInflate);
                                                                                                                                if (textView8 != null) {
                                                                                                                                    return new j5(relativeLayout2, er3Var, editText, relativeLayout2, imageView, linearLayout, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, scrollView, switchMaterial, l76VarA, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        mq7.o("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
                        return null;
                    default:
                        int i7 = EmailSettingActivity.I;
                        return new SP(emailSettingActivity);
                }
            }
        });
    }

    @Override // defpackage.bh2, defpackage.gy0, defpackage.fy0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        new HelperClass().SetLanguage(this);
        lt1.a(this);
        String string = t().getString(this, SP.APP_THEME, Default.LIGHT);
        final int i2 = 1;
        final int i3 = 0;
        if (bi3.b(string, Default.DARK)) {
            this.C = true;
            setTheme(R.style.DarkAppTheme);
        } else if (!bi3.b(string, Default.DEFAULT) || (i = getResources().getConfiguration().uiMode & 48) == 0 || i == 16) {
            this.C = false;
            setTheme(R.style.AppTheme);
        } else if (i == 32) {
            this.C = true;
            setTheme(R.style.DarkAppTheme);
        }
        super.onCreate(bundle);
        ((HelperClass) this.D.getValue()).SetLanguage(this);
        setContentView(s().a);
        int i4 = 4;
        k().a(this, new n8(this, i4));
        RelativeLayout relativeLayout = s().d;
        e51 e51Var = new e51(20, this);
        WeakHashMap weakHashMap = cc7.a;
        ub7.c(relativeLayout, e51Var);
        t().getBoolean(this, SP.IS_SEND_ADDRESS_TIME, false);
        ((TextView) s().m.l).setText(getString(R.string.email_setting));
        ((RelativeLayout) s().m.c).setOnClickListener(new View.OnClickListener(this) { // from class: iu1
            public final /* synthetic */ EmailSettingActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
            /* JADX WARN: Code duplicated, block: B:28:0x00e6  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i3;
                EmailSettingActivity emailSettingActivity = this.b;
                switch (i5) {
                    case 0:
                        int i6 = EmailSettingActivity.I;
                        emailSettingActivity.k().c();
                        break;
                    case 1:
                        int i7 = EmailSettingActivity.I;
                        if (!emailSettingActivity.s().l.isChecked()) {
                            emailSettingActivity.w();
                        } else {
                            emailSettingActivity.startActivity(new Intent(emailSettingActivity, (Class<?>) PrimaryRecipientActivity.class));
                        }
                        break;
                    case 2:
                        int i8 = EmailSettingActivity.I;
                        if (!emailSettingActivity.s().l.isChecked()) {
                            emailSettingActivity.w();
                        } else {
                            emailSettingActivity.startActivity(new Intent(emailSettingActivity, (Class<?>) SecondaryRecipientActivity.class));
                        }
                        break;
                    default:
                        int i9 = EmailSettingActivity.I;
                        if (!emailSettingActivity.s().l.isChecked()) {
                            emailSettingActivity.w();
                        } else {
                            int i10 = 1;
                            if (!emailSettingActivity.F) {
                                emailSettingActivity.s().f.setVisibility(0);
                                emailSettingActivity.s().e.setRotation(90.0f);
                                emailSettingActivity.s().c.setText(emailSettingActivity.t().getString(emailSettingActivity, SP.EMAIL_CONTENT, ""));
                                emailSettingActivity.F = true;
                                emailSettingActivity.s().k.postDelayed(new gu1(emailSettingActivity, i10), 150L);
                            } else {
                                emailSettingActivity.s().e.setRotation(360.0f);
                                emailSettingActivity.F = false;
                                emailSettingActivity.s().f.setVisibility(8);
                                String string2 = emailSettingActivity.s().c.getText().toString();
                                int length = string2.length() - 1;
                                int i11 = 0;
                                boolean z = false;
                                try {
                                    while (i11 <= length) {
                                        boolean z2 = bi3.c(string2.charAt(!z ? i11 : length), 32) <= 0;
                                        if (z) {
                                            if (!z2) {
                                                if (string2.subSequence(i11, length + 1).toString().length() > 0) {
                                                    emailSettingActivity.s().o.setText(emailSettingActivity.s().c.getText().toString());
                                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, emailSettingActivity.s().c.getText().toString());
                                                } else {
                                                    emailSettingActivity.s().o.setText("-");
                                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, "");
                                                }
                                                Object systemService = emailSettingActivity.getSystemService(UdXpKYRTUg.MezJTUMaUcYICCh);
                                                systemService.getClass();
                                                ((InputMethodManager) systemService).hideSoftInputFromWindow(emailSettingActivity.s().o.getWindowToken(), 0);
                                            } else {
                                                length--;
                                            }
                                            break;
                                        } else if (z2) {
                                            i11++;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    Object systemService2 = emailSettingActivity.getSystemService(UdXpKYRTUg.MezJTUMaUcYICCh);
                                    systemService2.getClass();
                                    ((InputMethodManager) systemService2).hideSoftInputFromWindow(emailSettingActivity.s().o.getWindowToken(), 0);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return;
                                }
                                if (string2.subSequence(i11, length + 1).toString().length() > 0) {
                                    emailSettingActivity.s().o.setText(emailSettingActivity.s().c.getText().toString());
                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, emailSettingActivity.s().c.getText().toString());
                                } else {
                                    emailSettingActivity.s().o.setText("-");
                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, "");
                                }
                            }
                        }
                        break;
                }
            }
        });
        s().h.setOnClickListener(new View.OnClickListener(this) { // from class: iu1
            public final /* synthetic */ EmailSettingActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
            /* JADX WARN: Code duplicated, block: B:28:0x00e6  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i2;
                EmailSettingActivity emailSettingActivity = this.b;
                switch (i5) {
                    case 0:
                        int i6 = EmailSettingActivity.I;
                        emailSettingActivity.k().c();
                        break;
                    case 1:
                        int i7 = EmailSettingActivity.I;
                        if (!emailSettingActivity.s().l.isChecked()) {
                            emailSettingActivity.w();
                        } else {
                            emailSettingActivity.startActivity(new Intent(emailSettingActivity, (Class<?>) PrimaryRecipientActivity.class));
                        }
                        break;
                    case 2:
                        int i8 = EmailSettingActivity.I;
                        if (!emailSettingActivity.s().l.isChecked()) {
                            emailSettingActivity.w();
                        } else {
                            emailSettingActivity.startActivity(new Intent(emailSettingActivity, (Class<?>) SecondaryRecipientActivity.class));
                        }
                        break;
                    default:
                        int i9 = EmailSettingActivity.I;
                        if (!emailSettingActivity.s().l.isChecked()) {
                            emailSettingActivity.w();
                        } else {
                            int i10 = 1;
                            if (!emailSettingActivity.F) {
                                emailSettingActivity.s().f.setVisibility(0);
                                emailSettingActivity.s().e.setRotation(90.0f);
                                emailSettingActivity.s().c.setText(emailSettingActivity.t().getString(emailSettingActivity, SP.EMAIL_CONTENT, ""));
                                emailSettingActivity.F = true;
                                emailSettingActivity.s().k.postDelayed(new gu1(emailSettingActivity, i10), 150L);
                            } else {
                                emailSettingActivity.s().e.setRotation(360.0f);
                                emailSettingActivity.F = false;
                                emailSettingActivity.s().f.setVisibility(8);
                                String string2 = emailSettingActivity.s().c.getText().toString();
                                int length = string2.length() - 1;
                                int i11 = 0;
                                boolean z = false;
                                try {
                                    while (i11 <= length) {
                                        boolean z2 = bi3.c(string2.charAt(!z ? i11 : length), 32) <= 0;
                                        if (z) {
                                            if (!z2) {
                                                if (string2.subSequence(i11, length + 1).toString().length() > 0) {
                                                    emailSettingActivity.s().o.setText(emailSettingActivity.s().c.getText().toString());
                                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, emailSettingActivity.s().c.getText().toString());
                                                } else {
                                                    emailSettingActivity.s().o.setText("-");
                                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, "");
                                                }
                                                Object systemService2 = emailSettingActivity.getSystemService(UdXpKYRTUg.MezJTUMaUcYICCh);
                                                systemService2.getClass();
                                                ((InputMethodManager) systemService2).hideSoftInputFromWindow(emailSettingActivity.s().o.getWindowToken(), 0);
                                            } else {
                                                length--;
                                            }
                                            break;
                                        } else if (z2) {
                                            i11++;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    Object systemService3 = emailSettingActivity.getSystemService(UdXpKYRTUg.MezJTUMaUcYICCh);
                                    systemService3.getClass();
                                    ((InputMethodManager) systemService3).hideSoftInputFromWindow(emailSettingActivity.s().o.getWindowToken(), 0);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return;
                                }
                                if (string2.subSequence(i11, length + 1).toString().length() > 0) {
                                    emailSettingActivity.s().o.setText(emailSettingActivity.s().c.getText().toString());
                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, emailSettingActivity.s().c.getText().toString());
                                } else {
                                    emailSettingActivity.s().o.setText("-");
                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, "");
                                }
                            }
                        }
                        break;
                }
            }
        });
        final int i5 = 2;
        s().i.setOnClickListener(new View.OnClickListener(this) { // from class: iu1
            public final /* synthetic */ EmailSettingActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
            /* JADX WARN: Code duplicated, block: B:28:0x00e6  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i5;
                EmailSettingActivity emailSettingActivity = this.b;
                switch (i6) {
                    case 0:
                        int i7 = EmailSettingActivity.I;
                        emailSettingActivity.k().c();
                        break;
                    case 1:
                        int i8 = EmailSettingActivity.I;
                        if (!emailSettingActivity.s().l.isChecked()) {
                            emailSettingActivity.w();
                        } else {
                            emailSettingActivity.startActivity(new Intent(emailSettingActivity, (Class<?>) PrimaryRecipientActivity.class));
                        }
                        break;
                    case 2:
                        int i9 = EmailSettingActivity.I;
                        if (!emailSettingActivity.s().l.isChecked()) {
                            emailSettingActivity.w();
                        } else {
                            emailSettingActivity.startActivity(new Intent(emailSettingActivity, (Class<?>) SecondaryRecipientActivity.class));
                        }
                        break;
                    default:
                        int i10 = EmailSettingActivity.I;
                        if (!emailSettingActivity.s().l.isChecked()) {
                            emailSettingActivity.w();
                        } else {
                            int i11 = 1;
                            if (!emailSettingActivity.F) {
                                emailSettingActivity.s().f.setVisibility(0);
                                emailSettingActivity.s().e.setRotation(90.0f);
                                emailSettingActivity.s().c.setText(emailSettingActivity.t().getString(emailSettingActivity, SP.EMAIL_CONTENT, ""));
                                emailSettingActivity.F = true;
                                emailSettingActivity.s().k.postDelayed(new gu1(emailSettingActivity, i11), 150L);
                            } else {
                                emailSettingActivity.s().e.setRotation(360.0f);
                                emailSettingActivity.F = false;
                                emailSettingActivity.s().f.setVisibility(8);
                                String string2 = emailSettingActivity.s().c.getText().toString();
                                int length = string2.length() - 1;
                                int i12 = 0;
                                boolean z = false;
                                try {
                                    while (i12 <= length) {
                                        boolean z2 = bi3.c(string2.charAt(!z ? i12 : length), 32) <= 0;
                                        if (z) {
                                            if (!z2) {
                                                if (string2.subSequence(i12, length + 1).toString().length() > 0) {
                                                    emailSettingActivity.s().o.setText(emailSettingActivity.s().c.getText().toString());
                                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, emailSettingActivity.s().c.getText().toString());
                                                } else {
                                                    emailSettingActivity.s().o.setText("-");
                                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, "");
                                                }
                                                Object systemService3 = emailSettingActivity.getSystemService(UdXpKYRTUg.MezJTUMaUcYICCh);
                                                systemService3.getClass();
                                                ((InputMethodManager) systemService3).hideSoftInputFromWindow(emailSettingActivity.s().o.getWindowToken(), 0);
                                            } else {
                                                length--;
                                            }
                                            break;
                                        } else if (z2) {
                                            i12++;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    Object systemService4 = emailSettingActivity.getSystemService(UdXpKYRTUg.MezJTUMaUcYICCh);
                                    systemService4.getClass();
                                    ((InputMethodManager) systemService4).hideSoftInputFromWindow(emailSettingActivity.s().o.getWindowToken(), 0);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return;
                                }
                                if (string2.subSequence(i12, length + 1).toString().length() > 0) {
                                    emailSettingActivity.s().o.setText(emailSettingActivity.s().c.getText().toString());
                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, emailSettingActivity.s().c.getText().toString());
                                } else {
                                    emailSettingActivity.s().o.setText("-");
                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, "");
                                }
                            }
                        }
                        break;
                }
            }
        });
        s().j.setOnClickListener(new o30(i5, this));
        final int i6 = 3;
        s().g.setOnClickListener(new View.OnClickListener(this) { // from class: iu1
            public final /* synthetic */ EmailSettingActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
            /* JADX WARN: Code duplicated, block: B:28:0x00e6  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7 = i6;
                EmailSettingActivity emailSettingActivity = this.b;
                switch (i7) {
                    case 0:
                        int i8 = EmailSettingActivity.I;
                        emailSettingActivity.k().c();
                        break;
                    case 1:
                        int i9 = EmailSettingActivity.I;
                        if (!emailSettingActivity.s().l.isChecked()) {
                            emailSettingActivity.w();
                        } else {
                            emailSettingActivity.startActivity(new Intent(emailSettingActivity, (Class<?>) PrimaryRecipientActivity.class));
                        }
                        break;
                    case 2:
                        int i10 = EmailSettingActivity.I;
                        if (!emailSettingActivity.s().l.isChecked()) {
                            emailSettingActivity.w();
                        } else {
                            emailSettingActivity.startActivity(new Intent(emailSettingActivity, (Class<?>) SecondaryRecipientActivity.class));
                        }
                        break;
                    default:
                        int i11 = EmailSettingActivity.I;
                        if (!emailSettingActivity.s().l.isChecked()) {
                            emailSettingActivity.w();
                        } else {
                            int i12 = 1;
                            if (!emailSettingActivity.F) {
                                emailSettingActivity.s().f.setVisibility(0);
                                emailSettingActivity.s().e.setRotation(90.0f);
                                emailSettingActivity.s().c.setText(emailSettingActivity.t().getString(emailSettingActivity, SP.EMAIL_CONTENT, ""));
                                emailSettingActivity.F = true;
                                emailSettingActivity.s().k.postDelayed(new gu1(emailSettingActivity, i12), 150L);
                            } else {
                                emailSettingActivity.s().e.setRotation(360.0f);
                                emailSettingActivity.F = false;
                                emailSettingActivity.s().f.setVisibility(8);
                                String string2 = emailSettingActivity.s().c.getText().toString();
                                int length = string2.length() - 1;
                                int i13 = 0;
                                boolean z = false;
                                try {
                                    while (i13 <= length) {
                                        boolean z2 = bi3.c(string2.charAt(!z ? i13 : length), 32) <= 0;
                                        if (z) {
                                            if (!z2) {
                                                if (string2.subSequence(i13, length + 1).toString().length() > 0) {
                                                    emailSettingActivity.s().o.setText(emailSettingActivity.s().c.getText().toString());
                                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, emailSettingActivity.s().c.getText().toString());
                                                } else {
                                                    emailSettingActivity.s().o.setText("-");
                                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, "");
                                                }
                                                Object systemService4 = emailSettingActivity.getSystemService(UdXpKYRTUg.MezJTUMaUcYICCh);
                                                systemService4.getClass();
                                                ((InputMethodManager) systemService4).hideSoftInputFromWindow(emailSettingActivity.s().o.getWindowToken(), 0);
                                            } else {
                                                length--;
                                            }
                                            break;
                                        } else if (z2) {
                                            i13++;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    Object systemService5 = emailSettingActivity.getSystemService(UdXpKYRTUg.MezJTUMaUcYICCh);
                                    systemService5.getClass();
                                    ((InputMethodManager) systemService5).hideSoftInputFromWindow(emailSettingActivity.s().o.getWindowToken(), 0);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return;
                                }
                                if (string2.subSequence(i13, length + 1).toString().length() > 0) {
                                    emailSettingActivity.s().o.setText(emailSettingActivity.s().c.getText().toString());
                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, emailSettingActivity.s().c.getText().toString());
                                } else {
                                    emailSettingActivity.s().o.setText("-");
                                    emailSettingActivity.t().setString(emailSettingActivity, SP.EMAIL_CONTENT, "");
                                }
                            }
                        }
                        break;
                }
            }
        });
        if (this.C) {
            if (t().getBoolean(this, SP.IS_SEND_EMAIL_PHOTOS, false)) {
                s().l.setChecked(true);
                r41.f(this, R.color.app_text_main_dark, r41.f(this, R.color.app_text_main_dark, r41.f(this, R.color.app_text_main_dark, r41.f(this, R.color.app_text_main_dark, r41.f(this, R.color.app_text_main_dark, r41.f(this, R.color.app_text_main_dark, r41.f(this, R.color.app_text_main_dark, s().p).q).r).s).t).u).n).o.setTextColor(getColor(R.color.app_text_main_dark));
            } else {
                s().l.setChecked(false);
                r41.f(this, R.color.hint_color_dark, r41.f(this, R.color.hint_color_dark, r41.f(this, R.color.hint_color_dark, r41.f(this, R.color.hint_color_dark, r41.f(this, R.color.hint_color_dark, r41.f(this, R.color.hint_color_dark, r41.f(this, R.color.hint_color_dark, s().p).q).r).s).t).u).n).o.setTextColor(getColor(R.color.hint_color_dark));
            }
        } else if (t().getBoolean(this, SP.IS_SEND_EMAIL_PHOTOS, false)) {
            s().l.setChecked(true);
            r41.f(this, R.color.app_text_main_light, r41.f(this, R.color.app_text_main_light, r41.f(this, R.color.app_text_main_light, r41.f(this, R.color.app_text_main_light, r41.f(this, R.color.app_text_main_light, r41.f(this, R.color.app_text_main_light, r41.f(this, R.color.app_text_main_light, s().p).q).r).s).t).u).n).o.setTextColor(getColor(R.color.app_text_main_light));
        } else {
            s().l.setChecked(false);
            r41.f(this, R.color.hint_color_light, r41.f(this, R.color.hint_color_light, r41.f(this, R.color.hint_color_light, r41.f(this, R.color.hint_color_light, r41.f(this, R.color.hint_color_light, r41.f(this, R.color.hint_color_light, r41.f(this, R.color.hint_color_light, s().p).q).r).s).t).u).n).o.setTextColor(getColor(R.color.hint_color_light));
        }
        s().l.setOnCheckedChangeListener(new ju1(this, i3));
        s().c.setOnFocusChangeListener(new k30(i4, this));
        s().c.setOnTouchListener(new cq1(i2, this));
    }

    @Override // defpackage.bh2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (AllAdsApproval.iSEmailSettingScreenBanner(this)) {
            Admob admob = new Admob();
            int i = RemoteAdData.ADS_NETWORK_TYPE;
            if (i == 9) {
                int i2 = RemoteAdData.EMAIL_SETTING_SCREEN_BANNER_TYPE;
                if (i2 == 1) {
                    admob.loadAdaptive_banner(this, (RelativeLayout) s().b.c, RemoteAdData.SETTING_SCREEN_BANNER_ID);
                } else if (i2 == 2) {
                    admob.loadAdaptive_bannerAdax(this, (RelativeLayout) s().b.c, RemoteAdData.ADAX_BANNER_ID);
                }
            } else if (i == 1) {
                admob.loadAdaptive_banner(this, (RelativeLayout) s().b.c, RemoteAdData.SETTING_SCREEN_BANNER_ID);
            } else if (i == 2) {
                admob.loadAdaptive_bannerAdax(this, (RelativeLayout) s().b.c, RemoteAdData.ADAX_BANNER_ID);
            }
        } else {
            ((RelativeLayout) s().b.c).setVisibility(8);
        }
        String string = t().getString(this, SP.EMAIL_RECIPIENT, "-");
        String string2 = t().getString(this, SP.EMAIL_SECONDARY_RECIPIENT, "-");
        String string3 = t().getString(this, SP.EMAIL_CONTENT, "-");
        String string4 = t().getString(this, SP.EMAIL_SUBJECT, "-");
        s().q.setText(string);
        s().s.setText(string2);
        string4.getClass();
        if (string4.length() == 0) {
            s().u.setText("-");
        } else {
            s().u.setText(string4);
        }
        string3.getClass();
        if (string3.length() == 0) {
            s().o.setText("-");
        } else {
            s().o.setText(string3);
        }
    }

    public final j5 s() {
        return (j5) this.B.getValue();
    }

    public final SP t() {
        return (SP) this.E.getValue();
    }

    public final void u() {
        try {
            String str = RemoteAdData.THIRD_CLICK_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new rm(19, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void v() {
        try {
            String str = RemoteAdData.ADAX_FS_ID;
            str.getClass();
            c66.h(new a7(str, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null), new tv5(17, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void w() {
        cc6 cc6VarI = cc6.i(s().d, getString(R.string.enable_instant_sharing_first), -1);
        cc6VarI.f((RelativeLayout) s().b.b);
        cc6VarI.k();
    }
}