package com.gpsmapcamera.geotagginglocationonphoto.model;

import android.location.Address;
import defpackage.bi3;
import defpackage.eo7;
import defpackage.yd1;

/* JADX INFO: loaded from: classes.dex */
public final class LocationSearchResult {
    private final Address address;
    private final double latitude;
    private final double longitude;
    private final String subtitle;
    private final String title;

    public LocationSearchResult(String str, String str2, double d, double d2, Address address) {
        str.getClass();
        this.title = str;
        this.subtitle = str2;
        this.latitude = d;
        this.longitude = d2;
        this.address = address;
    }

    public /* synthetic */ LocationSearchResult(String str, String str2, double d, double d2, Address address, int i, yd1 yd1Var) {
        this(str, (i & 2) != 0 ? null : str2, d, d2, (i & 16) != 0 ? null : address);
    }

    public static /* synthetic */ LocationSearchResult copy$default(LocationSearchResult locationSearchResult, String str, String str2, double d, double d2, Address address, int i, Object obj) {
        if ((i & 1) != 0) {
            str = locationSearchResult.title;
        }
        if ((i & 2) != 0) {
            str2 = locationSearchResult.subtitle;
        }
        if ((i & 4) != 0) {
            d = locationSearchResult.latitude;
        }
        if ((i & 8) != 0) {
            d2 = locationSearchResult.longitude;
        }
        if ((i & 16) != 0) {
            address = locationSearchResult.address;
        }
        Address address2 = address;
        double d3 = d2;
        return locationSearchResult.copy(str, str2, d, d3, address2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final double component3() {
        return this.latitude;
    }

    public final double component4() {
        return this.longitude;
    }

    public final Address component5() {
        return this.address;
    }

    public final LocationSearchResult copy(String str, String str2, double d, double d2, Address address) {
        str.getClass();
        return new LocationSearchResult(str, str2, d, d2, address);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationSearchResult)) {
            return false;
        }
        LocationSearchResult locationSearchResult = (LocationSearchResult) obj;
        return bi3.b(this.title, locationSearchResult.title) && bi3.b(this.subtitle, locationSearchResult.subtitle) && Double.compare(this.latitude, locationSearchResult.latitude) == 0 && Double.compare(this.longitude, locationSearchResult.longitude) == 0 && bi3.b(this.address, locationSearchResult.address);
    }

    public final Address getAddress() {
        return this.address;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (Double.hashCode(this.longitude) + ((Double.hashCode(this.latitude) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        Address address = this.address;
        return iHashCode2 + (address != null ? address.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        double d = this.latitude;
        double d2 = this.longitude;
        Address address = this.address;
        StringBuilder sbT = eo7.t("LocationSearchResult(title=", str, ", subtitle=", str2, ", latitude=");
        sbT.append(d);
        sbT.append(", longitude=");
        sbT.append(d2);
        sbT.append(", address=");
        sbT.append(address);
        sbT.append(")");
        return sbT.toString();
    }
}