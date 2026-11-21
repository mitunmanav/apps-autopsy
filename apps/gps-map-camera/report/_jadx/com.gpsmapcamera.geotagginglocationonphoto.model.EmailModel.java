package com.gpsmapcamera.geotagginglocationonphoto.model;

/* JADX INFO: loaded from: classes.dex */
public class EmailModel {
    String emailtype;
    String emailvalue;
    int id;
    boolean isselect;

    public EmailModel() {
    }

    public EmailModel(String str, String str2, boolean z) {
        this.emailvalue = str;
        this.emailtype = str2;
        this.isselect = z;
    }

    public String getEmailtype() {
        return this.emailtype;
    }

    public String getEmailvalue() {
        return this.emailvalue;
    }

    public int getId() {
        return this.id;
    }

    public boolean isIsselect() {
        return this.isselect;
    }

    public void setEmailtype(String str) {
        this.emailtype = str;
    }

    public void setEmailvalue(String str) {
        this.emailvalue = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setIsselect(boolean z) {
        this.isselect = z;
    }
}