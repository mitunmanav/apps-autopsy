package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.view.View;
import com.gpsmapcamera.geotagginglocationonphoto.model.EmailModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface OnEmailItemClickListener {
    void OnClick(int i, View view, ArrayList<EmailModel> arrayList);

    void OnLongClick(int i, View view);
}