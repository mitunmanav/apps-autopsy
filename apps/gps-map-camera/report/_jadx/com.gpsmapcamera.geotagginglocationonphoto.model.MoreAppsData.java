package com.gpsmapcamera.geotagginglocationonphoto.model;

/* JADX INFO: loaded from: classes.dex */
public class MoreAppsData {
    String app_desc;
    String app_feature_garphic;
    String app_icon_url;
    String app_name;
    String app_package_name;
    String app_short_url;
    int enable;
    int id;

    public MoreAppsData(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        this.id = i;
        this.enable = i2;
        this.app_name = str;
        this.app_desc = str2;
        this.app_package_name = str3;
        this.app_short_url = str4;
        this.app_icon_url = str5;
    }

    public MoreAppsData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.app_name = str;
        this.app_desc = str2;
        this.app_package_name = str3;
        this.app_short_url = str4;
        this.app_icon_url = str5;
        this.app_feature_garphic = str6;
    }

    public String getApp_desc() {
        return this.app_desc;
    }

    public String getApp_feature_garphic() {
        return this.app_feature_garphic;
    }

    public String getApp_icon_url() {
        return this.app_icon_url;
    }

    public String getApp_name() {
        return this.app_name;
    }

    public String getApp_package_name() {
        return this.app_package_name;
    }

    public String getApp_short_url() {
        return this.app_short_url;
    }

    public int getEnable() {
        return this.enable;
    }

    public int getId() {
        return this.id;
    }

    public void setApp_desc(String str) {
        this.app_desc = str;
    }

    public void setApp_feature_garphic(String str) {
        this.app_feature_garphic = str;
    }

    public void setApp_icon_url(String str) {
        this.app_icon_url = str;
    }

    public void setApp_name(String str) {
        this.app_name = str;
    }

    public void setApp_package_name(String str) {
        this.app_package_name = str;
    }

    public void setApp_short_url(String str) {
        this.app_short_url = str;
    }

    public void setEnable(int i) {
        this.enable = i;
    }

    public void setId(int i) {
        this.id = i;
    }
}