package com.gpsmapcamera.geotagginglocationonphoto.model;

/* JADX INFO: loaded from: classes.dex */
public class UpdateApp {
    String update_text;
    String update_title;
    int update_type;
    int version_code;

    public UpdateApp(int i, int i2, String str, String str2) {
        this.version_code = i;
        this.update_type = i2;
        this.update_title = str;
        this.update_text = str2;
    }

    public String getUpdate_text() {
        return this.update_text;
    }

    public String getUpdate_title() {
        return this.update_title;
    }

    public int getUpdate_type() {
        return this.update_type;
    }

    public int getVersion_code() {
        return this.version_code;
    }

    public void setUpdate_text(String str) {
        this.update_text = str;
    }

    public void setUpdate_title(String str) {
        this.update_title = str;
    }

    public void setUpdate_type(int i) {
        this.update_type = i;
    }

    public void setVersion_code(int i) {
        this.version_code = i;
    }
}