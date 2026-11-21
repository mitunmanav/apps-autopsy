package com.gpsmapcamera.geotagginglocationonphoto.model;

/* JADX INFO: loaded from: classes.dex */
public class ContactModel {
    int ID;
    int Selected;
    String contact;

    public String getContact() {
        return this.contact;
    }

    public int getID() {
        return this.ID;
    }

    public int getSelected() {
        return this.Selected;
    }

    public void setContact(String str) {
        this.contact = str;
    }

    public void setID(int i) {
        this.ID = i;
    }

    public void setSelected(int i) {
        this.Selected = i;
    }
}