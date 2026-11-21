package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.Context;
import android.location.Location;
import com.gpsmapcamera.geotagginglocationonphoto.R;
import defpackage.eo7;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class EGM96 {
    public static final double EGM96_VALUE_INVALID = -10000.0d;
    private static final EGM96 instance = new EGM96();
    Context mConntext;

    public class LoadEGM96Grid implements Runnable {
        Location mLocation;
        SP mSP;

        public LoadEGM96Grid(Location location) {
            this.mSP = new SP(EGM96.this.mConntext);
            this.mLocation = location;
        }

        @Override // java.lang.Runnable
        public void run() {
            InputStream inputStreamOpenRawResource = EGM96.this.mConntext.getResources().openRawResource(R.raw.ww15mgh);
            StringBuilder sb = new StringBuilder();
            sb.append(EGM96.this.mConntext.getFilesDir());
            File file = new File(eo7.o(sb, File.separator, "DefaultProperties.xml"));
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStreamOpenRawResource.read(bArr);
                    if (i <= 0) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, i);
                    }
                }
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(EGM96.this.mConntext.getResources().openRawResource(R.raw.ww15mgh)));
            if (Default.EGMGrid == null) {
                Default.EGMGrid = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 1446, 727);
                if (Default.COUNT == 0) {
                    Default.COUNT = (int) (file.length() / 2);
                }
                int i2 = 3;
                int i3 = 3;
                for (int i4 = 0; i4 < Default.COUNT; i4++) {
                    try {
                        Default.EGMGrid[i2][i3] = dataInputStream.readShort();
                        i2++;
                        if (i2 >= 1443) {
                            i3++;
                            i2 = 3;
                        }
                    } catch (IOException e2) {
                        Default.isEGMGridLoaded = false;
                        e2.printStackTrace();
                        return;
                    }
                }
                for (int i5 = 0; i5 < 3; i5++) {
                    for (int i6 = 3; i6 < 724; i6++) {
                        short[][] sArr = Default.EGMGrid;
                        sArr[i5][i6] = sArr[i5 + 1440][i6];
                        sArr[i5 + 1443][i6] = sArr[i5 + 3][i6];
                    }
                }
                for (int i7 = 0; i7 < 3; i7++) {
                    for (int i8 = 0; i8 < 1446; i8++) {
                        if (i8 > 720) {
                            short[][] sArr2 = Default.EGMGrid;
                            short[] sArr3 = sArr2[i8];
                            short[] sArr4 = sArr2[i8 - 720];
                            sArr3[i7] = sArr4[6 - i7];
                            sArr3[i7 + 724] = sArr4[722 - i7];
                        } else {
                            short[][] sArr5 = Default.EGMGrid;
                            short[] sArr6 = sArr5[i8];
                            short[] sArr7 = sArr5[i8 + 720];
                            sArr6[i7] = sArr7[6 - i7];
                            sArr6[i7 + 724] = sArr7[722 - i7];
                        }
                    }
                }
            }
            Default.isEGMGridLoaded = true;
            Location location = this.mLocation;
            if (location != null) {
                this.mSP.setFloat(EGM96.this.mConntext, SP.ALTITUDE_VALUE, Float.parseFloat(String.valueOf(EGM96.this.getEGMCorrection(location.getLatitude(), this.mLocation.getLongitude()))));
            }
        }
    }

    public static EGM96 getInstance() {
        return instance;
    }

    public double getEGMCorrection(double d, double d2) {
        if (Default.isEGMGridLoaded) {
            double d3 = 90.0d - d;
            if (d2 < 0.0d) {
                d2 += 360.0d;
            }
            int i = (int) (d2 / 0.5d);
            int i2 = i + 3;
            int i3 = (int) (d3 / 0.5d);
            int i4 = i3 + 3;
            try {
                short[][] sArr = Default.EGMGrid;
                short[] sArr2 = sArr[i2];
                short s = sArr2[i4];
                int i5 = i3 + 4;
                short s2 = sArr2[i5];
                short[] sArr3 = sArr[i + 4];
                short s3 = sArr3[i4];
                double d4 = d3 % 0.25d;
                double d5 = ((((double) (s2 - s)) * d4) / 0.25d) + ((double) s);
                return ((((d2 % 0.25d) * ((((((double) (sArr3[i5] - s3)) * d4) / 0.25d) + ((double) s3)) - d5)) / 0.25d) + d5) / 100.0d;
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -10000.0d;
    }

    public void loadGrid(Location location, Context context) {
        this.mConntext = context;
        new Thread(new LoadEGM96Grid(location)).start();
    }
}