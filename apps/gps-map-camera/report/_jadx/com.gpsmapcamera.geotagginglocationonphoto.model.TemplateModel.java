package com.gpsmapcamera.geotagginglocationonphoto.model;

/* JADX INFO: loaded from: classes.dex */
public class TemplateModel {
    boolean isSelected;
    String spKey;
    String title;

    public String getSpKey() {
        return this.spKey;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setSpKey(String str) {
        this.spKey = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}