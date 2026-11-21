package com.gpsmapcamera.geotagginglocationonphoto.model;

import defpackage.bi3;
import defpackage.eo7;

/* JADX INFO: loaded from: classes.dex */
public final class DriveFolder {
    private final String id;
    private final String name;

    public DriveFolder(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.name = str2;
    }

    public static /* synthetic */ DriveFolder copy$default(DriveFolder driveFolder, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = driveFolder.id;
        }
        if ((i & 2) != 0) {
            str2 = driveFolder.name;
        }
        return driveFolder.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final DriveFolder copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new DriveFolder(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriveFolder)) {
            return false;
        }
        DriveFolder driveFolder = (DriveFolder) obj;
        return bi3.b(this.id, driveFolder.id) && bi3.b(this.name, driveFolder.name);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return eo7.l("DriveFolder(id=", this.id, ", name=", this.name, ")");
    }
}