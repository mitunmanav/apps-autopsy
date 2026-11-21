package com.gpsmapcamera.geotagginglocationonphoto.model;

import defpackage.cf5;

/* JADX INFO: loaded from: classes.dex */
public class PurchaseModel {
    private int id;
    private String pakageid;
    private cf5 productDetail;
    private int selected;
    private String price = "Loading...";
    private String discountedPrice = "Loading...";
    private int purchased = 0;

    public PurchaseModel() {
    }

    public PurchaseModel(int i, int i2) {
        this.id = i;
        this.selected = i2;
    }

    public String getDiscountedPrice() {
        return this.discountedPrice;
    }

    public int getId() {
        return this.id;
    }

    public String getPakageid() {
        return this.pakageid;
    }

    public String getPrice() {
        return this.price;
    }

    public cf5 getProductDetails() {
        return this.productDetail;
    }

    public int getPurchased() {
        return this.purchased;
    }

    public int getSelected() {
        return this.selected;
    }

    public void setDiscountedPrice(String str) {
        this.discountedPrice = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setPakageid(String str) {
        this.pakageid = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setProductDetails(cf5 cf5Var) {
        this.productDetail = cf5Var;
    }

    public void setPurchased(int i) {
        this.purchased = i;
    }

    public void setSelected(int i) {
        this.selected = i;
    }
}