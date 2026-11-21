package com.gpsmapcamera.geotagginglocationonphoto.model;

import android.net.Uri;
import defpackage.eo7;

/* JADX INFO: loaded from: classes.dex */
public class Media {
    String albumName;
    Uri appendedIdUri;
    long dateAdded;
    long id;
    int key;
    String path;
    boolean selected;
    Uri uri;

    public Media() {
    }

    public Media(String str, boolean z, int i, String str2, long j, long j2, Uri uri, Uri uri2) {
        this.albumName = str;
        this.selected = z;
        this.key = i;
        this.path = str2;
        this.dateAdded = j;
        this.id = j2;
        this.appendedIdUri = uri;
        this.uri = uri2;
    }

    public String getAlbumName() {
        return this.albumName;
    }

    public Uri getAppendedIdUri() {
        return this.appendedIdUri;
    }

    public long getDateAdded() {
        return this.dateAdded;
    }

    public long getId() {
        return this.id;
    }

    public int getKey() {
        return this.key;
    }

    public String getPath() {
        return this.path;
    }

    public Uri getUri() {
        return this.uri;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setAlbumName(String str) {
        this.albumName = str;
    }

    public void setAppendedIdUri(Uri uri) {
        this.appendedIdUri = uri;
    }

    public void setDateAdded(long j) {
        this.dateAdded = j;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setKey(int i) {
        this.key = i;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public String toString() {
        return eo7.o(new StringBuilder("Media{path='"), this.path, "\n");
    }
}