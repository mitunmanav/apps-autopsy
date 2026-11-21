package com.gpsmapcamera.geotagginglocationonphoto.model;

/* JADX INFO: loaded from: classes.dex */
public class TransferApp {
    private String enable;
    private String link;
    private String transfer_text;
    private String transfer_title;

    public TransferApp(String str, String str2, String str3, String str4) {
        this.enable = str;
        this.transfer_title = str2;
        this.transfer_text = str3;
        this.link = str4;
    }

    public String getEnable() {
        return this.enable;
    }

    public String getLink() {
        return this.link;
    }

    public String getTransfer_text() {
        return this.transfer_text;
    }

    public String getTransfer_title() {
        return this.transfer_title;
    }

    public void setEnable(String str) {
        this.enable = str;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setTransfer_text(String str) {
        this.transfer_text = str;
    }

    public void setTransfer_title(String str) {
        this.transfer_title = str;
    }
}