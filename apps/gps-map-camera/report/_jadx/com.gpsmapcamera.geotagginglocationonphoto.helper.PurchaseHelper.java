package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.BillingClient$Builder;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import defpackage.b4;
import defpackage.cf5;
import defpackage.ea;
import defpackage.fq8;
import defpackage.g40;
import defpackage.gi5;
import defpackage.h40;
import defpackage.h94;
import defpackage.i40;
import defpackage.il5;
import defpackage.in8;
import defpackage.j40;
import defpackage.ki5;
import defpackage.ko8;
import defpackage.l40;
import defpackage.mq7;
import defpackage.pd8;
import defpackage.pj5;
import defpackage.q72;
import defpackage.qj;
import defpackage.rp8;
import defpackage.s78;
import defpackage.tt1;
import defpackage.xk2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PurchaseHelper {
    private int billingSetupResponseCode;
    private g40 mBillingClient;
    private WeakReference<Context> mContext;
    private boolean mIsServiceConnected;
    private PurchaseHelperListener purchaseHelperListener;

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.PurchaseHelper$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ String val$productType;

        public AnonymousClass3(String str) {
            this.val$productType = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$run$0(l40 l40Var, List list) {
            if (l40Var.a != 0 || PurchaseHelper.this.purchaseHelperListener == null) {
                return;
            }
            PurchaseHelper.this.purchaseHelperListener.onPurchasehistoryResponse(list);
        }

        @Override // java.lang.Runnable
        public void run() {
            g40 g40Var = PurchaseHelper.this.mBillingClient;
            String str = this.val$productType;
            if (str == null) {
                qj.h("Product type must be set");
                return;
            }
            c cVar = new c(this);
            h40 h40Var = (h40) g40Var;
            h40Var.getClass();
            if (h40.g(new pd8(h40Var, cVar, str), 30000L, new xk2(16, h40Var, cVar), h40Var.h(), h40Var.f()) == null) {
                l40 l40VarK = h40Var.k();
                h40Var.t(25, 9, l40VarK);
                in8 in8Var = ko8.b;
                cVar.a(l40VarK, rp8.e);
            }
        }
    }

    /* JADX INFO: renamed from: com.gpsmapcamera.geotagginglocationonphoto.helper.PurchaseHelper$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        final /* synthetic */ String val$productType;

        public AnonymousClass4(String str) {
            this.val$productType = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$run$0(l40 l40Var, pj5 pj5Var) {
            if (l40Var.a != 0 || pj5Var.a == null || PurchaseHelper.this.purchaseHelperListener == null) {
                return;
            }
            PurchaseHelper.this.purchaseHelperListener.onProductQueryResponse(pj5Var.a);
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList();
            q72 q72Var = new q72();
            q72Var.a = ((Context) PurchaseHelper.this.mContext.get()).getResources().getString(R.string.PRODUCT_ID_ALL);
            q72Var.b = this.val$productType;
            arrayList.add(q72Var.a());
            q72 q72Var2 = new q72();
            q72Var2.a = ((Context) PurchaseHelper.this.mContext.get()).getResources().getString(R.string.PRODUCT_ID_WITH_AD);
            q72Var2.b = this.val$productType;
            arrayList.add(q72Var2.a());
            q72 q72Var3 = new q72();
            q72Var3.a = ((Context) PurchaseHelper.this.mContext.get()).getResources().getString(R.string.PRODUCT_ID_AD);
            q72Var3.b = this.val$productType;
            arrayList.add(q72Var3.a());
            h94 h94Var = new h94();
            h94Var.I(arrayList);
            PurchaseHelper.this.mBillingClient.d(h94Var.o(), new c(this));
        }
    }

    public interface PurchaseHelperListener {
        void onProductQueryResponse(List<cf5> list);

        void onPurchasehistoryResponse(List<gi5> list);

        void onPurchasesUpdated(l40 l40Var, List<gi5> list);

        void onServiceConnected(int i);
    }

    public PurchaseHelper(Context context, PurchaseHelperListener purchaseHelperListener) {
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.mContext = weakReference;
        BillingClient$Builder billingClient$Builder = new BillingClient$Builder(weakReference.get());
        billingClient$Builder.c = getPurchaseUpdatedListener();
        billingClient$Builder.a = new tt1(14);
        billingClient$Builder.d = true;
        this.mBillingClient = billingClient$Builder.a();
        this.purchaseHelperListener = purchaseHelperListener;
        startConnection(getServiceConnectionRequest());
    }

    private void executeServiceRequest(Runnable runnable) {
        if (this.mIsServiceConnected) {
            runnable.run();
        } else {
            startConnection(runnable);
        }
    }

    private ki5 getPurchaseUpdatedListener() {
        return new ki5() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.PurchaseHelper.6
            @Override // defpackage.ki5
            public void onPurchasesUpdated(l40 l40Var, List<gi5> list) {
                if (l40Var.a != 0 || list == null || list.isEmpty() || PurchaseHelper.this.purchaseHelperListener == null) {
                    return;
                }
                PurchaseHelper.this.purchaseHelperListener.onPurchasesUpdated(l40Var, list);
            }
        };
    }

    private Runnable getServiceConnectionRequest() {
        return new Runnable() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.PurchaseHelper.2
            @Override // java.lang.Runnable
            public void run() {
                if (PurchaseHelper.this.purchaseHelperListener != null) {
                    PurchaseHelper.this.purchaseHelperListener.onServiceConnected(PurchaseHelper.this.billingSetupResponseCode);
                }
            }
        };
    }

    private void startConnection(final Runnable runnable) {
        this.mBillingClient.e(new i40() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.PurchaseHelper.1
            @Override // defpackage.i40
            public void onBillingServiceDisconnected() {
                PurchaseHelper.this.mIsServiceConnected = false;
            }

            @Override // defpackage.i40
            public void onBillingSetupFinished(l40 l40Var) {
                if (l40Var.a == 0) {
                    PurchaseHelper.this.mIsServiceConnected = true;
                    PurchaseHelper.this.billingSetupResponseCode = l40Var.a;
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }
        });
    }

    public void endConnection() {
        g40 g40Var = this.mBillingClient;
        if (g40Var != null) {
            h40 h40Var = (h40) g40Var;
            if (h40Var.z ? true : h40Var.F()) {
                this.mBillingClient.b();
                this.mBillingClient = null;
                this.mContext.clear();
            }
        }
    }

    public void getPurchasedItems(String str) {
        executeServiceRequest(new AnonymousClass3(str));
    }

    public void getSkuDetails(List<String> list, String str) {
        executeServiceRequest(new AnonymousClass4(str));
    }

    public void handlePurchase(gi5 gi5Var) {
        if (gi5Var.a() != 1) {
            gi5Var.a();
            return;
        }
        if (gi5Var.c.optBoolean("acknowledged", true)) {
            return;
        }
        String strB = gi5Var.b();
        if (strB == null) {
            qj.h("Purchase token must be set");
            return;
        }
        ea eaVar = new ea(4);
        eaVar.b = strB;
        this.mBillingClient.a(eaVar, new b4() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.PurchaseHelper.7
            @Override // defpackage.b4
            public void onAcknowledgePurchaseResponse(l40 l40Var) {
            }
        });
    }

    public boolean isServiceConnected() {
        return this.mIsServiceConnected;
    }

    public void launchBillingFLow(final cf5 cf5Var) {
        executeServiceRequest(new Runnable() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.PurchaseHelper.5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                Object[] objArr = 0;
                fq8 fq8Var = new fq8(8, false);
                cf5 cf5Var2 = cf5Var;
                fq8Var.b = cf5Var2;
                if (cf5Var2.a() != null) {
                    cf5Var2.a().getClass();
                    String str = cf5Var2.a().c;
                    if (str != null) {
                        fq8Var.c = str;
                    }
                }
                if (((cf5) fq8Var.b) == null) {
                    mq7.o("ProductDetails is required for constructing ProductDetailsParams.");
                    return;
                }
                arrayList.add(new j40(fq8Var));
                int i = 7;
                s78 s78Var = new s78((char) (objArr == true ? 1 : 0), i);
                s78Var.c = new il5(i);
                s78Var.b = new ArrayList(arrayList);
                PurchaseHelper.this.mBillingClient.c((Activity) PurchaseHelper.this.mContext.get(), s78Var.g());
            }
        });
    }
}