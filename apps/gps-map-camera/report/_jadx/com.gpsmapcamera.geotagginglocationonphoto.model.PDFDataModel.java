package com.gpsmapcamera.geotagginglocationonphoto.model;

/* JADX INFO: loaded from: classes.dex */
public class PDFDataModel {
    int ID;
    int Selected;
    String value;

    public PDFDataModel() {
    }

    public PDFDataModel(int i, String str, int i2) {
        this.ID = i;
        this.value = str;
        this.Selected = i2;
    }

    public int getID() {
        return this.ID;
    }

    public int getSelected() {
        return this.Selected;
    }

    public String getValue() {
        return this.value;
    }

    public void setID(int i) {
        this.ID = i;
    }

    public void setSelected(int i) {
        this.Selected = i;
    }

    public void setValue(String str) {
        this.value = str;
    }
}