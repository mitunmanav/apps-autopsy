package com.gpsmapcamera.geotagginglocationonphoto.model;

/* JADX INFO: loaded from: classes.dex */
public class MultiHeaderModel {
    private String banner_color;
    private String banner_text;
    int enable;
    private String id;
    private String image_url;
    private String is_banner;
    private String last_modified_date;
    private String link;
    private String redirection;
    private String text_color;
    private String type;
    private String user;

    public MultiHeaderModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        this.id = str;
        this.type = str2;
        this.user = str3;
        this.is_banner = str4;
        this.banner_text = str5;
        this.image_url = str6;
        this.link = str7;
        this.redirection = str8;
        this.banner_color = str9;
        this.text_color = str10;
        this.last_modified_date = str11;
        this.enable = i;
    }

    public String getBanner_color() {
        return this.banner_color;
    }

    public String getBanner_text() {
        return this.banner_text;
    }

    public int getEnable() {
        return this.enable;
    }

    public String getId() {
        return this.id;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public String getIs_banner() {
        return this.is_banner;
    }

    public String getLast_modified_date() {
        return this.last_modified_date;
    }

    public String getLink() {
        return this.link;
    }

    public String getRedirection() {
        return this.redirection;
    }

    public String getText_color() {
        return this.text_color;
    }

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public void setBanner_color(String str) {
        this.banner_color = str;
    }

    public void setBanner_text(String str) {
        this.banner_text = str;
    }

    public void setEnable(int i) {
        this.enable = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setImage_url(String str) {
        this.image_url = str;
    }

    public void setIs_banner(String str) {
        this.is_banner = str;
    }

    public void setLast_modified_date(String str) {
        this.last_modified_date = str;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setRedirection(String str) {
        this.redirection = str;
    }

    public void setText_color(String str) {
        this.text_color = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUser(String str) {
        this.user = str;
    }
}