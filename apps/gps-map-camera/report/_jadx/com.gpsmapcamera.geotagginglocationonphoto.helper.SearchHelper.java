package com.gpsmapcamera.geotagginglocationonphoto.helper;

import defpackage.gi5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SearchHelper {
    public static List<String> getPurchasedProductIdListing(List<gi5> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add((String) list.get(i).c().get(0));
        }
        return arrayList;
    }
}