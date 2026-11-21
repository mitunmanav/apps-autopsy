package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.media.AudioManager;
import android.view.KeyEvent;
import com.gpsmapcamera.geotagginglocationonphoto.activity.CameraActivity;
import defpackage.vl0;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class HandleSystemKeys {
    CameraActivity mContext;

    public HandleSystemKeys(CameraActivity cameraActivity) {
        this.mContext = cameraActivity;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AudioManager audioManager;
        if (i != 24 && i != 25) {
            if (i != 27) {
                if (i != 69) {
                    if (i != 88 && i != 85 && i != 86) {
                        if (i != 156 && i != 157 && i != 168 && i != 169) {
                            switch (i) {
                                case 80:
                                    break;
                                case 81:
                                case 82:
                                    break;
                                default:
                                    return false;
                            }
                        }
                    }
                }
                return true;
            }
            if (keyEvent.getRepeatCount() == 0) {
                this.mContext.y();
            }
            return true;
        }
        String string = new SP(this.mContext).getString(this.mContext, SP.VB_Setting, Default.CAPTURE);
        if ((i == 88 || i == 85 || i == 86) && !string.equals("volume_take_photo") && ((audioManager = (AudioManager) this.mContext.getSystemService("audio")) == null || !audioManager.isWiredHeadsetOn())) {
            return false;
        }
        string.getClass();
        if (!string.equals(Default.ZOOM)) {
            if (!string.equals(Default.CAPTURE)) {
                return false;
            }
            this.mContext.y();
            return true;
        }
        CameraActivity cameraActivity = this.mContext;
        if (i == 24) {
            cameraActivity.getClass();
            try {
                float f = cameraActivity.H3 + 0.1f;
                float f2 = cameraActivity.J3;
                if (f > f2) {
                    f = f2;
                }
                cameraActivity.H3 = f;
                vl0 vl0Var = cameraActivity.D;
                if (vl0Var != null) {
                    vl0Var.B(f);
                }
                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
                String str = decimalFormat.format(Float.valueOf(cameraActivity.H3));
                str.getClass();
                cameraActivity.H3 = Float.parseFloat(str);
                cameraActivity.x0();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            cameraActivity.getClass();
            try {
                float f3 = cameraActivity.H3 - 0.1f;
                float f4 = cameraActivity.I3;
                if (f3 < f4) {
                    f3 = f4;
                }
                cameraActivity.H3 = f3;
                vl0 vl0Var2 = cameraActivity.D;
                if (vl0Var2 != null) {
                    vl0Var2.B(f3);
                }
                DecimalFormat decimalFormat2 = new DecimalFormat("#.#");
                decimalFormat2.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
                String str2 = decimalFormat2.format(Float.valueOf(cameraActivity.H3));
                str2.getClass();
                cameraActivity.H3 = Float.parseFloat(str2);
                cameraActivity.x0();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }

    public void onKeyUp(int i, KeyEvent keyEvent) {
    }
}