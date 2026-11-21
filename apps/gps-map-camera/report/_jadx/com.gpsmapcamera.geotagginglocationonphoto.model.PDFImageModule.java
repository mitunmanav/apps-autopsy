package com.gpsmapcamera.geotagginglocationonphoto.model;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class PDFImageModule {
    Bitmap bitmap;
    String dateTime;
    String filename;
    String link;
    Uri uri;

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public String getDateTime() {
        return this.dateTime;
    }

    public String getFilename() {
        return this.filename;
    }

    public String getLink() {
        return this.link;
    }

    public Uri getUri() {
        return this.uri;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void setDateTime(String str) {
        this.dateTime = str;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }
}