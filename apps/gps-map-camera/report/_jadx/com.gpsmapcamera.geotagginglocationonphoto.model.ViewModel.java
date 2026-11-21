package com.gpsmapcamera.geotagginglocationonphoto.model;

/* JADX INFO: loaded from: classes.dex */
public class ViewModel {
    private int id;
    private Boolean isSelected;
    private String tag;
    private String value;

    public int getId() {
        return this.id;
    }

    public Boolean getSelected() {
        return this.isSelected;
    }

    public String getTag() {
        return this.tag;
    }

    public String getValue() {
        return this.value;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setSelected(Boolean bool) {
        this.isSelected = bool;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}