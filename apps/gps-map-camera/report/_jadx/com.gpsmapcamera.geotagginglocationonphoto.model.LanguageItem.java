package com.gpsmapcamera.geotagginglocationonphoto.model;

/* JADX INFO: loaded from: classes.dex */
public class LanguageItem {
    public static final int TYPE_INDIA_HEADER = 1;
    public static final int TYPE_INDIA_SUB = 2;
    public static final int TYPE_NORMAL = 0;
    private String badgeChar;
    private String englishName;
    private int flagRes;
    private boolean isExpanded;
    private boolean isSelected;
    private String keyName;
    private String nativeName;
    private String selectedSubLanguage;
    private int type;

    public LanguageItem(int i, String str, String str2, int i2) {
        this(i, str, str, str2, i2);
    }

    public LanguageItem(int i, String str, String str2, String str3) {
        this(i, str, str, str2, str3);
    }

    public LanguageItem(int i, String str, String str2, String str3, int i2) {
        this.type = i;
        this.keyName = str;
        this.nativeName = str2;
        this.englishName = str3;
        this.flagRes = i2;
        this.badgeChar = "";
        this.isExpanded = false;
        this.isSelected = false;
        this.selectedSubLanguage = "";
    }

    public LanguageItem(int i, String str, String str2, String str3, String str4) {
        this.type = i;
        this.keyName = str;
        this.nativeName = str2;
        this.englishName = str3;
        this.flagRes = 0;
        this.badgeChar = str4;
        this.isExpanded = false;
        this.isSelected = false;
        this.selectedSubLanguage = "";
    }

    public static LanguageItem createIndiaHeader(int i) {
        LanguageItem languageItem = new LanguageItem(1, "Indian Languages", "Indian Languages", "Indian Languages", i);
        languageItem.setExpanded(true);
        return languageItem;
    }

    public String getBadgeChar() {
        return this.badgeChar;
    }

    public String getEnglishName() {
        return this.englishName;
    }

    public int getFlagRes() {
        return this.flagRes;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public String getNativeName() {
        String str = this.nativeName;
        return (str == null || str.isEmpty()) ? this.keyName : this.nativeName;
    }

    public String getSelectedSubLanguage() {
        return this.selectedSubLanguage;
    }

    public int getType() {
        return this.type;
    }

    public boolean isExpanded() {
        return this.isExpanded;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setBadgeChar(String str) {
        this.badgeChar = str;
    }

    public void setEnglishName(String str) {
        this.englishName = str;
    }

    public void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public void setFlagRes(int i) {
        this.flagRes = i;
    }

    public void setKeyName(String str) {
        this.keyName = str;
    }

    public void setNativeName(String str) {
        this.nativeName = str;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setSelectedSubLanguage(String str) {
        this.selectedSubLanguage = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}