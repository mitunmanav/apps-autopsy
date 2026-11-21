package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.Context;
import android.location.Location;
import defpackage.eo7;

/* JADX INFO: loaded from: classes.dex */
public class LocationSupplier {
    private static final String TAG = "LocationSupplier";
    private final Context context;
    private Location mLocation;

    public LocationSupplier(Context context) {
        this.context = context;
    }

    public static String locationToDMS(double d) {
        String str = d < 0.0d ? "-" : "";
        double dAbs = Math.abs(d);
        int i = (int) dAbs;
        boolean z = false;
        boolean z2 = i == 0;
        String strValueOf = String.valueOf(i);
        double d2 = (dAbs - ((double) i)) * 60.0d;
        int i2 = (int) d2;
        boolean z3 = z2 && i2 == 0;
        double d3 = d2 - ((double) i2);
        String strValueOf2 = String.valueOf(i2);
        int i3 = (int) (d3 * 60.0d);
        if (z3 && i3 == 0) {
            z = true;
        }
        return eo7.o(eo7.t(z ? "" : str, strValueOf, "°", strValueOf2, "'"), String.valueOf(i3), "\"");
    }

    public Location getLocation() {
        return this.mLocation;
    }

    public void setLocation(Location location) {
        this.mLocation = location;
    }
}