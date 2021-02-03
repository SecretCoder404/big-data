/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package com.mobond.mindicator.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class c {
    static String[] a = new String[]{"CHURCHGATE", "MARINE LINES", "CHARNI ROAD", "GRANT ROAD", "MUMBAI CENTRAL", "MAHALAKSHMI", "LOWER PAREL", "PRABHADEVI", "DADAR", "MATUNGA ROAD", "MAHIM JN", "BANDRA", "KHAR ROAD", "SANTA CRUZ", "VILE PARLE", "ANDHERI", "JOGESHWARI", "RAM MANDIR", "GOREGAON", "MALAD", "KANDIVALI", "BORIVALI", "DAHISAR", "MIRA ROAD", "BHAYANDER", "NAIGAON", "VASAI ROAD", "NALLA SOPARA", "VIRAR", "VAITARANA", "SAPHALE", "KELVA ROAD", "PALGHAR", "UMROLI ROAD", "BOISAR", "VANGAON", "DAHANU ROAD"};
    static String[] b = new String[]{"CSMT", "MASJID", "SANDHURST ROAD", "BYCULLA", "CHINCHPOKLI", "CURREY ROAD", "PAREL", "DADAR", "MATUNGA", "SION", "KURLA", "VIDYAVIHAR", "GHATKOPAR", "VIKHROLI", "KANJUR MARG", "BHANDUP", "NAHUR", "MULUND", "THANE", "KALVA", "MUMBRA", "DIVA JN", "KOPAR", "DOMBIVLI", "THAKURLI", "KALYAN"};
    static String[] c = new String[]{"KALYAN", "VITHALWADI", "ULHAS NAGAR", "AMBERNATH", "BADLAPUR", "VANGANI", "SHELU", "NERAL", "BHIVPURI ROAD", "KARJAT", "PALASDHARI", "KELAVLI", "DOLAVLI", "LOWJEE", "KHOPOLI"};
    static String[] d = new String[]{"KALYAN", "SHAHAD", "AMBIVLI", "TITWALA", "KHADAVLI", "VASIND", "ASANGAON", "ATGAON", "THANSIT", "KHARDI", "UMBERMALI", "KASARA"};
    static String[] e = new String[]{"CSMT", "MASJID", "SANDHURST ROAD", "DOCKYARD ROAD", "REAY ROAD", "COTTON GREEN", "SEWRI", "VADALA ROAD", "GTB NAGAR", "CHUNABHATTI", "KURLA", "TILAKNAGAR", "CHEMBUR", "GOVANDI", "MANKHURD", "VASHI", "SANPADA", "JUINAGAR", "NERUL", "SEAWOOD DARAVE", "BELAPUR CBD", "KHARGHAR", "MANASAROVAR", "KHANDESHWAR", "PANVEL"};
    static String[] f = new String[]{"VADALA ROAD", "KINGS CIRCLE", "MAHIM JN", "BANDRA", "KHAR ROAD", "SANTA CRUZ", "VILE PARLE", "ANDHERI", "JOGESHWARI", "RAM MANDIR", "GOREGAON"};
    static String[] g = new String[]{"THANE", "AIROLI", "RABALE", "GHANSOLI", "KOPARKHAIRNE", "TURBHE", "JUINAGAR", "NERUL"};
    static String[] h = new String[]{"THANE", "AIROLI", "RABALE", "GHANSOLI", "KOPARKHAIRNE", "TURBHE", "SANPADA", "VASHI"};
    static String[] i = new String[]{"ROHA", "NIDI", "NAGOTHANE", "KASU", "PEN", "HAMARAPUR", "JITE", "APTA", "RASAYANI", "SOMTANE", "PANVEL", "KALAMBOLI", "NAVADE ROAD", "TALOJA PANCHANAND", "NILJE", "DATIVALI", "DIVA JN"};
    static String[] j = new String[]{"VASAI ROAD", "JUCHANDRA ROAD", "KAMAN ROAD", "KHARBAO", "BHIWANDI ROAD", "KOPAR", "DIVA JN", "DOMBIVLI", "DATIVALI", "NILJE", "TALOJA PANCHANAND", "NAVADE ROAD", "KALAMBOLI", "PANVEL"};
    static String[] k = new String[]{"NERUL", "BAMANDONGRI", "KHARKOPAR"};
    static String[] l = new String[]{"BELAPUR CBD", "BAMANDONGRI", "KHARKOPAR"};
    static String[] m = new String[]{"PUNE", "SHIVAJI NAGAR", "KHADKI", "DAPODI", "KASARWADI", "PIMPRI", "CHINCHWAD", "AKURDI", "DEHU ROAD", "BEGDEWADI", "GHORAWADI", "TALEGAON", "VADGAON", "KANHE", "KAMSHET", "MALAVLI", "LONAVLA"};

    private static ArrayList<String> a(int n2, int n3, boolean bl, String[] arrstring) {
        if (bl) {
            int n4 = n3;
            n3 = n2;
            n2 = n4;
        }
        ArrayList arrayList = new ArrayList();
        while (++n2 < n3) {
            arrayList.add((Object)arrstring[n2]);
        }
        if (bl) {
            Collections.reverse((List)arrayList);
        }
        return arrayList;
    }

    public static ArrayList<String> a(String string, String string2) {
        String[][] arrstring = c.a();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            String[] arrstring2 = arrstring[i2];
            int n2 = -1;
            int n3 = -1;
            for (int i3 = 0; i3 < arrstring2.length; ++i3) {
                String string3 = arrstring2[i3];
                if (string3.equals((Object)string)) {
                    if (n2 != -1) {
                        return c.a(i3, n2, true, arrstring2);
                    }
                    n3 = i3;
                    continue;
                }
                if (!string3.equals((Object)string2)) continue;
                if (n3 != -1) {
                    return c.a(n3, i3, false, arrstring2);
                }
                n2 = i3;
            }
        }
        return new ArrayList();
    }

    public static String[][] a() {
        String[][] arrstring = new String[][]{a, b, c, d, e, f, g, h, i, j, k, l, m};
        return arrstring;
    }

    public static ArrayList<String> b(String string, String string2) {
        String[][] arrstring = c.a();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            Object[] arrobject = arrstring[i2];
            int n2 = -1;
            int n3 = -1;
            for (int i3 = 0; i3 < arrobject.length; ++i3) {
                String string3 = arrobject[i3];
                if (string3.equals((Object)string)) {
                    if (n2 != -1) {
                        ArrayList arrayList = new ArrayList((Collection)Arrays.asList((Object[])arrobject));
                        Collections.reverse((List)arrayList);
                        return arrayList;
                    }
                    n3 = i3;
                    continue;
                }
                if (!string3.equals((Object)string2)) continue;
                if (n3 != -1) {
                    return new ArrayList((Collection)Arrays.asList((Object[])arrobject));
                }
                n2 = i3;
            }
        }
        return new ArrayList();
    }
}

