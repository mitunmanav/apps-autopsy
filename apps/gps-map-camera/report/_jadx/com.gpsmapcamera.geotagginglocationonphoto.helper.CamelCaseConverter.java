package com.gpsmapcamera.geotagginglocationonphoto.helper;

/* JADX INFO: loaded from: classes.dex */
public class CamelCaseConverter {
    public static String removeUnwantedWords(String str) {
        if (str == null) {
            return "";
        }
        String[] strArr = {"unnamed road", "unnamed area", "unnamed", "null"};
        for (int i = 0; i < 4; i++) {
            str = str.toLowerCase().replace(strArr[i], "").trim();
        }
        return str.replaceAll("\\s{2,}", " ");
    }

    public static String toCamelCaseWithSpaces(String str) {
        String[] strArrSplit = removeUnwantedWords(str).split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArrSplit.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            String str2 = strArrSplit[i];
            if (!str2.isEmpty()) {
                sb.append(Character.toUpperCase(str2.charAt(0)));
                sb.append(str2.substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }
}