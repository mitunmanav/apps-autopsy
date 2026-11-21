package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.Context;
import android.util.Log;
import com.gpsmapcamera.geotagginglocationonphoto.model.ViewModel;
import defpackage.eo7;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class FileNameUtils {
    Context context;
    HelperClass mHelperClass = new HelperClass();

    public FileNameUtils(Context context) {
        this.context = context;
    }

    private String getNoteValue(SP sp, Context context) {
        int integer = sp.getInteger(context, SP.TEMPLATE_TYPE, 0);
        if (integer == 0) {
            String string = sp.getString(context, SP.NOTES_HASHTAG, Default.notes);
            if (string.contains("Note : ")) {
                string = string.replace("Note : ", "");
            } else if (string.contains(Default.notes_title)) {
                string = string.replace(Default.notes_title, "");
            }
            return string.replace(".", "_");
        }
        if (integer == 1) {
            String string2 = sp.getString(context, SP.NOTES_HASHTAG_CLASSIC, Default.notes);
            if (string2.contains("Note : ")) {
                string2 = string2.replace("Note : ", "");
            } else if (string2.contains(Default.notes_title)) {
                string2 = string2.replace(Default.notes_title, "");
            }
            return string2.replace(".", "_");
        }
        if (integer == 2) {
            String string3 = sp.getString(context, SP.NOTES_HASHTAG_REPORTING, Default.notes);
            if (string3.contains("Note : ")) {
                string3 = string3.replace("Note : ", "");
            } else if (string3.contains(Default.notes_title)) {
                string3 = string3.replace(Default.notes_title, "");
            }
            return string3.replace(".", "_");
        }
        if (integer == 3) {
            String string4 = sp.getString(context, SP.NOTES_HASHTAG_NC, Default.notes);
            if (string4.contains("Note : ")) {
                string4 = string4.replace("Note : ", "");
            } else if (string4.contains(Default.notes_title)) {
                string4 = string4.replace(Default.notes_title, "");
            }
            return string4.replace(".", "_");
        }
        String string5 = sp.getString(context, SP.NOTES_HASHTAG_DT, Default.notes);
        if (string5.contains("Note : ")) {
            string5 = string5.replace("Note : ", "");
        } else if (string5.contains(Default.notes_title)) {
            string5 = string5.replace(Default.notes_title, "");
        }
        return string5.replace(".", "_");
    }

    private String getPlusCode(SP sp, Context context) {
        int integer = sp.getInteger(context, SP.TEMPLATE_TYPE, 0);
        String strTrim = sp.getString(context, SP.PLUS_CODE, "").trim();
        if (strTrim.isEmpty()) {
            return "";
        }
        if (integer == 0) {
            if (!sp.getString(context, SP.PLUS_CODE_TYPE, Default.PLUSCODE_TYPE).equals(Default.PLUSCODE_TYPE)) {
                return strTrim.substring(4);
            }
        } else if (integer == 1) {
            if (!sp.getString(context, SP.PLUS_CODE_TYPE_CLASSIC, Default.PLUSCODE_TYPE).equals(Default.PLUSCODE_TYPE)) {
                return strTrim.substring(4);
            }
        } else if (integer == 2) {
            if (!sp.getString(context, SP.PLUS_CODE_TYPE_REPORTING, Default.PLUSCODE_TYPE).equals(Default.PLUSCODE_TYPE)) {
                return strTrim.substring(4);
            }
        } else if (integer == 3 && !sp.getString(context, SP.PLUS_CODE_TYPE_NC, Default.PLUSCODE_TYPE).equals(Default.PLUSCODE_TYPE)) {
            return strTrim.substring(4);
        }
        return strTrim;
    }

    private String getTimeStamp() {
        SP sp = new SP(this.context);
        boolean z = sp.getBoolean(this.context, SP.IS_WEEK, false);
        String strTrim = sp.getBoolean(this.context, SP.IS_24HR, false) ? new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()).trim() : new SimpleDateFormat("yyyyMMdd_hmmssa").format(new Date()).trim();
        if (!z) {
            return strTrim;
        }
        return strTrim + "_" + getWeek();
    }

    private String getTimezone(int i) {
        String displayName = Calendar.getInstance().getTimeZone().getDisplayName(false, 1);
        Date time = Calendar.getInstance(DesugarTimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime();
        String str = new SimpleDateFormat("Z").format(time);
        String str2 = new SimpleDateFormat("ZZZZZ", Locale.getDefault()).format(time);
        switch (i) {
            case 1:
                return str;
            case 2:
                return eo7.w("UTC ", str);
            case 3:
                return eo7.w("GMT ", str);
            case 4:
                return str2;
            case 5:
                return eo7.w("UTC ", str2);
            case 6:
                return eo7.w("GMT ", str2);
            case 7:
                return displayName;
            default:
                return "";
        }
    }

    private String getTimezoneValue(SP sp, Context context) {
        int integer = sp.getInteger(context, SP.TEMPLATE_TYPE, 0);
        if (integer == 0) {
            return getTimezone(sp.getInteger(context, SP.TIMEZONE, 6)).replace(" ", "_");
        }
        if (integer == 1) {
            return getTimezone(sp.getInteger(context, SP.TIMEZONE_CLASSIC, 6)).replace(" ", "_");
        }
        if (integer == 2) {
            return getTimezone(sp.getInteger(context, SP.TIMEZONE_REPORTING, 6)).replace(" ", "_");
        }
        return integer == 3 ? getTimezone(sp.getInteger(context, SP.TIMEZONE_NC, 6)).replace(" ", "_") : getTimezone(6).replace(" ", "_");
    }

    private String getWeek() {
        return new SimpleDateFormat("EEEE").format(new Date());
    }

    public String createMediaFilename(int i, String str) {
        String strReplace;
        SP sp = new SP(this.context);
        sp.getBoolean(this.context, SP.IS_FILE_DATE_TIME, true);
        boolean z = sp.getBoolean(this.context, SP.IS_SEQUENCE, false);
        sp.getBoolean(this.context, SP.IS_CUS_1, true);
        sp.getBoolean(this.context, SP.IS_CUS_2, false);
        sp.getBoolean(this.context, SP.IS_CUS_3, false);
        boolean z2 = sp.getBoolean(this.context, SP.IS_LAT_LNG, false);
        boolean z3 = sp.getBoolean(this.context, SP.IS_MAIN_ADDRESS, false);
        boolean z4 = sp.getBoolean(this.context, SP.IS_PLUSCODE_FILE, false);
        boolean z5 = sp.getBoolean(this.context, SP.IS_TIMEZONE_FILE, false);
        boolean z6 = sp.getBoolean(this.context, SP.IS_NOTES_FILE, false);
        new ArrayList();
        if (sp.getArrayList(this.context) == null) {
            strReplace = getTimeStamp() + Default.CUSTUM_NAME_1_VALUE;
            Log.e("file_name7600", strReplace);
        } else {
            ArrayList<ViewModel> arrayList = sp.getArrayList(this.context);
            int integer = sp.getInteger(this.context, SP.DATE_TIME_INDEX, 0);
            int integer2 = sp.getInteger(this.context, SP.SEQUENCE_INDEX, 1);
            int integer3 = sp.getInteger(this.context, SP.ADDRESS_INDEX, 5);
            int integer4 = sp.getInteger(this.context, SP.LAT_LNG_INDEX, 6);
            int integer5 = sp.getInteger(this.context, SP.PLUSCODE_INDEX, 7);
            int integer6 = sp.getInteger(this.context, SP.TIMEZONE_INDEX, 8);
            int integer7 = sp.getInteger(this.context, SP.NOTES_INDEX, 9);
            arrayList.get(integer).setValue(getTimeStamp());
            if (z) {
                int integer8 = sp.getInteger(this.context, SP.SEQUENCE_VALUE, 1);
                arrayList.get(integer2).setValue("" + integer8);
                int i2 = integer8 + 1;
                sp.setInteger(this.context, SP.SEQUENCE_VALUE, i2 == 100000 ? 1 : i2);
            }
            if (z3) {
                boolean z7 = sp.getBoolean(this.context, SP.IS_LINE_1, false);
                boolean z8 = sp.getBoolean(this.context, SP.IS_LINE_2, false);
                boolean z9 = sp.getBoolean(this.context, SP.IS_LINE_3, false);
                boolean z10 = sp.getBoolean(this.context, SP.IS_LINE_4, false);
                String string = sp.getString(this.context, SP.LOC_LINE_1_ADDRESS, "");
                String string2 = sp.getString(this.context, SP.LOC_LINE_2_CITY, "");
                String string3 = sp.getString(this.context, SP.LOC_LINE_3_STATE, "");
                String string4 = sp.getString(this.context, SP.LOC_LINE_4_COUNTRY, "");
                String strW = (z7 && isNotEmpty(string)) ? eo7.w("_", string) : "";
                if (z8 && isNotEmpty(string2)) {
                    strW = eo7.x(strW, "_", string2);
                }
                if (z9 && isNotEmpty(string3)) {
                    strW = eo7.x(strW, "_", string3);
                }
                if (z10 && isNotEmpty(string4)) {
                    strW = eo7.x(strW, "_", string4);
                }
                arrayList.get(integer3).setValue(strW);
            }
            if (z2) {
                boolean z11 = sp.getBoolean(this.context, SP.IS_DECIMAL_FILE, false);
                boolean z12 = sp.getBoolean(this.context, SP.IS_DMS_FILE, false);
                String string5 = sp.getString(this.context, SP.LATITUDE, "");
                String string6 = sp.getString(this.context, SP.LONGITUDE, "");
                if (isNotEmpty(string5) && isNotEmpty(string6)) {
                    String strK = z11 ? eo7.k("_", string5, "_", string6) : "";
                    if (z12) {
                        strK = eo7.x(strK, "_", this.mHelperClass.dms_latlng(this.context));
                    }
                    arrayList.get(integer4).setValue(strK);
                }
            }
            if (z4) {
                arrayList.get(integer5).setValue(getPlusCode(sp, this.context));
            }
            if (z5) {
                arrayList.get(integer6).setValue(getTimezoneValue(sp, this.context));
            }
            if (z6) {
                arrayList.get(integer7).setValue(getNoteValue(sp, this.context));
            }
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (arrayList.get(i3).getSelected().booleanValue() && isNotEmpty(arrayList.get(i3).getValue())) {
                    sb.append(arrayList.get(i3).getValue());
                }
            }
            String string7 = sb.toString();
            if (isNotEmpty(string7)) {
                if (string7.substring(0, 1).equals("_")) {
                    string7 = string7.replaceFirst("_", "");
                }
                strReplace = string7.replace("__", "_");
            } else {
                strReplace = string7;
            }
        }
        if (strReplace.contains(":")) {
            strReplace = strReplace.replace(":", "_");
        }
        if (strReplace.contains(".")) {
            strReplace = strReplace.replace(".", "_");
        }
        if (strReplace.contains("\"")) {
            strReplace = strReplace.replace("\"", "");
        }
        if (strReplace.length() > 175) {
            strReplace = strReplace.replace(" ", "");
            if (strReplace.length() > 175) {
                strReplace = strReplace.substring(0, 174);
            }
        }
        return eo7.w(strReplace, str);
    }

    public boolean isNotEmpty(String str) {
        if (str == null) {
            return false;
        }
        return !str.trim().isEmpty();
    }
}