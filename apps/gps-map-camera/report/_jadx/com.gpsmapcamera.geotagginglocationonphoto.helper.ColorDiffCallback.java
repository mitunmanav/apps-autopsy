package com.gpsmapcamera.geotagginglocationonphoto.helper;

import com.gpsmapcamera.geotagginglocationonphoto.model.ColorModel;
import defpackage.pk1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ColorDiffCallback extends pk1 {
    private final List<ColorModel> newList;
    private final List<ColorModel> oldList;

    public ColorDiffCallback(List<ColorModel> list, List<ColorModel> list2) {
        this.oldList = list;
        this.newList = list2;
    }

    @Override // defpackage.pk1
    public boolean areContentsTheSame(int i, int i2) {
        return this.oldList.get(i).getColor() == this.newList.get(i2).getColor();
    }

    @Override // defpackage.pk1
    public boolean areItemsTheSame(int i, int i2) {
        return this.oldList.get(i).getTitle().equals(this.newList.get(i2).getTitle());
    }

    @Override // defpackage.pk1
    public int getNewListSize() {
        return this.newList.size();
    }

    @Override // defpackage.pk1
    public int getOldListSize() {
        return this.oldList.size();
    }
}