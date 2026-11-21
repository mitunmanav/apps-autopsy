package com.gpsmapcamera.geotagginglocationonphoto.model;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class ImageModel {
    public String name;
    public String path;
    public Uri uri;

    public ImageModel(Uri uri, String str, String str2) {
        this.uri = uri;
        this.name = str;
        this.path = str2;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public Uri getUri() {
        return this.uri;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }
}