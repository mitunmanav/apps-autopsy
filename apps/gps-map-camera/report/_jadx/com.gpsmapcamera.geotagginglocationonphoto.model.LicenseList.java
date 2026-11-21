package com.gpsmapcamera.geotagginglocationonphoto.model;

/* JADX INFO: loaded from: classes.dex */
public class LicenseList {
    String companyID;
    String companyName;
    Long expiryDate;
    String id;
    String licenseID;

    public LicenseList(String str, String str2, String str3, String str4, Long l) {
        this.companyName = str;
        this.companyID = str2;
        this.licenseID = str3;
        this.id = str4;
        this.expiryDate = l;
    }

    public String getCompanyID() {
        return this.companyID;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public Long getExpiryDate() {
        return this.expiryDate;
    }

    public String getId() {
        return this.id;
    }

    public String getLicenseID() {
        return this.licenseID;
    }

    public void setCompanyID(String str) {
        this.companyID = str;
    }

    public void setCompanyName(String str) {
        this.companyName = str;
    }

    public void setExpiryDate(Long l) {
        this.expiryDate = l;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLicenseID(String str) {
        this.licenseID = str;
    }
}