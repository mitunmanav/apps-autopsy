package com.gpsmapcamera.geotagginglocationonphoto.model;

import defpackage.bi3;
import defpackage.eo7;
import defpackage.fs7;
import defpackage.fz7;
import defpackage.jb5;
import defpackage.yd1;

/* JADX INFO: loaded from: classes.dex */
public final class ComparisonGroup {
    private String afterComment;
    private String afterImagePath;
    private String beforeComment;
    private String beforeImagePath;
    private String groupName;
    private boolean isDeleted;
    private String localId;
    private int position;
    private String serverId;
    private long updatedAt;

    public ComparisonGroup(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, long j) {
        str.getClass();
        str3.getClass();
        str5.getClass();
        str7.getClass();
        this.localId = str;
        this.serverId = str2;
        this.groupName = str3;
        this.beforeImagePath = str4;
        this.beforeComment = str5;
        this.afterImagePath = str6;
        this.afterComment = str7;
        this.position = i;
        this.isDeleted = z;
        this.updatedAt = j;
    }

    public /* synthetic */ ComparisonGroup(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, long j, int i2, yd1 yd1Var) {
        this(str, (i2 & 2) != 0 ? null : str2, str3, (i2 & 8) != 0 ? null : str4, str5, (i2 & 32) != 0 ? null : str6, str7, i, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? System.currentTimeMillis() : j);
    }

    public static /* synthetic */ ComparisonGroup copy$default(ComparisonGroup comparisonGroup, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = comparisonGroup.localId;
        }
        if ((i2 & 2) != 0) {
            str2 = comparisonGroup.serverId;
        }
        if ((i2 & 4) != 0) {
            str3 = comparisonGroup.groupName;
        }
        if ((i2 & 8) != 0) {
            str4 = comparisonGroup.beforeImagePath;
        }
        if ((i2 & 16) != 0) {
            str5 = comparisonGroup.beforeComment;
        }
        if ((i2 & 32) != 0) {
            str6 = comparisonGroup.afterImagePath;
        }
        if ((i2 & 64) != 0) {
            str7 = comparisonGroup.afterComment;
        }
        if ((i2 & 128) != 0) {
            i = comparisonGroup.position;
        }
        if ((i2 & 256) != 0) {
            z = comparisonGroup.isDeleted;
        }
        if ((i2 & 512) != 0) {
            j = comparisonGroup.updatedAt;
        }
        long j2 = j;
        int i3 = i;
        boolean z2 = z;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return comparisonGroup.copy(str, str2, str11, str4, str10, str8, str9, i3, z2, j2);
    }

    public final String component1() {
        return this.localId;
    }

    public final long component10() {
        return this.updatedAt;
    }

    public final String component2() {
        return this.serverId;
    }

    public final String component3() {
        return this.groupName;
    }

    public final String component4() {
        return this.beforeImagePath;
    }

    public final String component5() {
        return this.beforeComment;
    }

    public final String component6() {
        return this.afterImagePath;
    }

    public final String component7() {
        return this.afterComment;
    }

    public final int component8() {
        return this.position;
    }

    public final boolean component9() {
        return this.isDeleted;
    }

    public final ComparisonGroup copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, long j) {
        str.getClass();
        str3.getClass();
        str5.getClass();
        str7.getClass();
        return new ComparisonGroup(str, str2, str3, str4, str5, str6, str7, i, z, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparisonGroup)) {
            return false;
        }
        ComparisonGroup comparisonGroup = (ComparisonGroup) obj;
        return bi3.b(this.localId, comparisonGroup.localId) && bi3.b(this.serverId, comparisonGroup.serverId) && bi3.b(this.groupName, comparisonGroup.groupName) && bi3.b(this.beforeImagePath, comparisonGroup.beforeImagePath) && bi3.b(this.beforeComment, comparisonGroup.beforeComment) && bi3.b(this.afterImagePath, comparisonGroup.afterImagePath) && bi3.b(this.afterComment, comparisonGroup.afterComment) && this.position == comparisonGroup.position && this.isDeleted == comparisonGroup.isDeleted && this.updatedAt == comparisonGroup.updatedAt;
    }

    public final String getAfterComment() {
        return this.afterComment;
    }

    public final String getAfterImagePath() {
        return this.afterImagePath;
    }

    public final String getBeforeComment() {
        return this.beforeComment;
    }

    public final String getBeforeImagePath() {
        return this.beforeImagePath;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getLocalId() {
        return this.localId;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getServerId() {
        return this.serverId;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = this.localId.hashCode() * 31;
        String str = this.serverId;
        int iB = eo7.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.groupName);
        String str2 = this.beforeImagePath;
        int iB2 = eo7.b((iB + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.beforeComment);
        String str3 = this.afterImagePath;
        return Long.hashCode(this.updatedAt) + jb5.i(fz7.e(this.position, eo7.b((iB2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.afterComment), 31), 31, this.isDeleted);
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final void setAfterComment(String str) {
        str.getClass();
        this.afterComment = str;
    }

    public final void setAfterImagePath(String str) {
        this.afterImagePath = str;
    }

    public final void setBeforeComment(String str) {
        str.getClass();
        this.beforeComment = str;
    }

    public final void setBeforeImagePath(String str) {
        this.beforeImagePath = str;
    }

    public final void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public final void setGroupName(String str) {
        str.getClass();
        this.groupName = str;
    }

    public final void setLocalId(String str) {
        str.getClass();
        this.localId = str;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setServerId(String str) {
        this.serverId = str;
    }

    public final void setUpdatedAt(long j) {
        this.updatedAt = j;
    }

    public String toString() {
        String str = this.localId;
        String str2 = this.serverId;
        String str3 = this.groupName;
        String str4 = this.beforeImagePath;
        String str5 = this.beforeComment;
        String str6 = this.afterImagePath;
        String str7 = this.afterComment;
        int i = this.position;
        boolean z = this.isDeleted;
        long j = this.updatedAt;
        StringBuilder sbT = eo7.t("ComparisonGroup(localId=", str, ", serverId=", str2, ", groupName=");
        fs7.m(sbT, str3, ", beforeImagePath=", str4, ", beforeComment=");
        fs7.m(sbT, str5, ", afterImagePath=", str6, ", afterComment=");
        sbT.append(str7);
        sbT.append(", position=");
        sbT.append(i);
        sbT.append(", isDeleted=");
        sbT.append(z);
        sbT.append(", updatedAt=");
        sbT.append(j);
        sbT.append(")");
        return sbT.toString();
    }
}