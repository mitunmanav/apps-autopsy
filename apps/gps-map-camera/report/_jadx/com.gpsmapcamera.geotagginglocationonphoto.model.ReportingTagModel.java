package com.gpsmapcamera.geotagginglocationonphoto.model;

/* JADX INFO: loaded from: classes.dex */
public class ReportingTagModel {
    int id;
    int isdeleted;
    String tagname;

    public ReportingTagModel() {
    }

    public ReportingTagModel(int i, int i2, String str) {
        this.id = i;
        this.isdeleted = i2;
        this.tagname = str;
    }

    public int getId() {
        return this.id;
    }

    public int getIsdeleted() {
        return this.isdeleted;
    }

    public String getTagname() {
        return this.tagname;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setIsdeleted(int i) {
        this.isdeleted = i;
    }

    public void setTagname(String str) {
        this.tagname = str;
    }
}