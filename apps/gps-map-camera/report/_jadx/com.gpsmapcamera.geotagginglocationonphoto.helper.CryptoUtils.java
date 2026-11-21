package com.gpsmapcamera.geotagginglocationonphoto.helper;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfWriter;
import defpackage.bi3;
import defpackage.eo7;
import defpackage.f6;
import defpackage.jr3;
import defpackage.lr0;
import defpackage.ro6;
import defpackage.yd1;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class CryptoUtils {
    private static final byte FILE_VERSION = 1;
    private static final int GCM_IV_LENGTH = 12;
    private static final int GCM_TAG_LENGTH = 128;
    private static final String SECRET_PASSPHRASE = "GMC_Loc_Backup_Secure_Key_2026";
    public static final CryptoUtils INSTANCE = new CryptoUtils();
    private static final byte[] MAGIC_HEADER = {71, 77, 67, 66};
    private static final byte[] SALT = {27, 63, 126, 42, 92, 77, 104, 121, 50, 68, 88, 97, 119, 43, 28, 79};
    private static final jr3 secretKey$delegate = new ro6(new f6(6));

    public static abstract class DecryptResult {

        public static final class InvalidFormat extends DecryptResult {
            public static final InvalidFormat INSTANCE = new InvalidFormat();

            private InvalidFormat() {
                super(null);
            }
        }

        public static final class Success extends DecryptResult {
            private final String data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(String str) {
                super(null);
                str.getClass();
                this.data = str;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.data;
                }
                return success.copy(str);
            }

            public final String component1() {
                return this.data;
            }

            public final Success copy(String str) {
                str.getClass();
                return new Success(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && bi3.b(this.data, ((Success) obj).data);
            }

            public final String getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return eo7.x("Success(data=", this.data, ")");
            }
        }

        public static final class TamperedOrCorrupted extends DecryptResult {
            public static final TamperedOrCorrupted INSTANCE = new TamperedOrCorrupted();

            private TamperedOrCorrupted() {
                super(null);
            }
        }

        private DecryptResult() {
        }

        public /* synthetic */ DecryptResult(yd1 yd1Var) {
            this();
        }
    }

    private CryptoUtils() {
    }

    private final SecretKey getSecretKey() {
        return (SecretKey) secretKey$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SecretKeySpec secretKey_delegate$lambda$0() {
        return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(new PBEKeySpec(new char[]{'G', 'M', 'C', '_', 'L', 'o', Barcode128.CODE_AB_TO_C, '_', 'B', 'a', Barcode128.CODE_AB_TO_C, 'k', 'u', 'p', '_', 'S', Barcode128.CODE_BC_TO_A, Barcode128.CODE_AB_TO_C, 'u', 'r', Barcode128.CODE_BC_TO_A, '_', 'K', Barcode128.CODE_BC_TO_A, 'y', '_', PdfWriter.VERSION_1_2, '0', PdfWriter.VERSION_1_2, PdfWriter.VERSION_1_6}, SALT, ModuleDescriptor.MODULE_VERSION, 256)).getEncoded(), "AES");
    }

    public final DecryptResult decrypt(byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = MAGIC_HEADER;
        if (bArr.length < bArr2.length + 29) {
            return DecryptResult.InvalidFormat.INSTANCE;
        }
        int length = bArr2.length;
        for (int i = 0; i < length; i++) {
            if (bArr[i] != MAGIC_HEADER[i]) {
                return DecryptResult.InvalidFormat.INSTANCE;
            }
        }
        byte[] bArr3 = MAGIC_HEADER;
        if (bArr[bArr3.length] != 1) {
            return DecryptResult.InvalidFormat.INSTANCE;
        }
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, length2 + 1, bArr4, 0, 12);
        int i2 = length2 + 13;
        int length3 = bArr.length - i2;
        byte[] bArr5 = new byte[length3];
        System.arraycopy(bArr, i2, bArr5, 0, length3);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, getSecretKey(), new GCMParameterSpec(128, bArr4));
            byte[] bArrDoFinal = cipher.doFinal(bArr5);
            bArrDoFinal.getClass();
            return new DecryptResult.Success(new String(bArrDoFinal, lr0.a));
        } catch (Exception e) {
            e.printStackTrace();
            return DecryptResult.TamperedOrCorrupted.INSTANCE;
        }
    }

    public final byte[] encrypt(String str) {
        str.getClass();
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, getSecretKey(), new GCMParameterSpec(128, bArr));
        byte[] bytes = str.getBytes(lr0.a);
        bytes.getClass();
        byte[] bArrDoFinal = cipher.doFinal(bytes);
        byte[] bArr2 = MAGIC_HEADER;
        byte[] bArr3 = new byte[bArr2.length + 13 + bArrDoFinal.length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        int length = bArr2.length;
        bArr3[length] = 1;
        System.arraycopy(bArr, 0, bArr3, length + 1, 12);
        System.arraycopy(bArrDoFinal, 0, bArr3, length + 13, bArrDoFinal.length);
        return bArr3;
    }
}