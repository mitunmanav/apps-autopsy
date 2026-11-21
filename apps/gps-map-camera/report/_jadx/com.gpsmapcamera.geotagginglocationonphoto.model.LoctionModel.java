package com.gpsmapcamera.geotagginglocationonphoto.model;

/* JADX INFO: loaded from: classes.dex */
public class LoctionModel {
    int Id;
    String city;
    String country;
    String latitude;
    String loc_line_1;
    String longitude;
    String pincode;
    int radius;
    String state;
    String timestamp;
    String title;

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public int getId() {
        return this.Id;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLoc_line_1() {
        return this.loc_line_1;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getPincode() {
        return this.pincode;
    }

    public int getRadius() {
        return this.radius;
    }

    public String getState() {
        return this.state;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setId(int i) {
        this.Id = i;
    }

    public void setLatitude(String str) {
        this.latitude = str;
    }

    public void setLoc_line_1(String str) {
        this.loc_line_1 = str;
    }

    public void setLongitude(String str) {
        this.longitude = str;
    }

    public void setPincode(String str) {
        this.pincode = str;
    }

    public void setRadius(int i) {
        this.radius = i;
    }

    public void setState(String str) {
        this.state = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}