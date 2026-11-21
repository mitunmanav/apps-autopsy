package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.graphics.RectF;
import defpackage.bi3;
import defpackage.eo7;

/* JADX INFO: loaded from: classes.dex */
public final class PdfLinkInfo {
    private final int pageNumber;
    private final RectF rect;
    private final String url;

    public PdfLinkInfo(int i, String str, RectF rectF) {
        str.getClass();
        rectF.getClass();
        this.pageNumber = i;
        this.url = str;
        this.rect = rectF;
    }

    public static /* synthetic */ PdfLinkInfo copy$default(PdfLinkInfo pdfLinkInfo, int i, String str, RectF rectF, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pdfLinkInfo.pageNumber;
        }
        if ((i2 & 2) != 0) {
            str = pdfLinkInfo.url;
        }
        if ((i2 & 4) != 0) {
            rectF = pdfLinkInfo.rect;
        }
        return pdfLinkInfo.copy(i, str, rectF);
    }

    public final int component1() {
        return this.pageNumber;
    }

    public final String component2() {
        return this.url;
    }

    public final RectF component3() {
        return this.rect;
    }

    public final PdfLinkInfo copy(int i, String str, RectF rectF) {
        str.getClass();
        rectF.getClass();
        return new PdfLinkInfo(i, str, rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdfLinkInfo)) {
            return false;
        }
        PdfLinkInfo pdfLinkInfo = (PdfLinkInfo) obj;
        return this.pageNumber == pdfLinkInfo.pageNumber && bi3.b(this.url, pdfLinkInfo.url) && bi3.b(this.rect, pdfLinkInfo.rect);
    }

    public final int getPageNumber() {
        return this.pageNumber;
    }

    public final RectF getRect() {
        return this.rect;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.rect.hashCode() + eo7.b(Integer.hashCode(this.pageNumber) * 31, 31, this.url);
    }

    public String toString() {
        return "PdfLinkInfo(pageNumber=" + this.pageNumber + ", url=" + this.url + ", rect=" + this.rect + ")";
    }
}