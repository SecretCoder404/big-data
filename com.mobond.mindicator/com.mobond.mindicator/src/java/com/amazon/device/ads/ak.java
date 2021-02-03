/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashSet
 */
package com.amazon.device.ads;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.amazon.device.ads.bd;
import com.amazon.device.ads.bl;
import com.amazon.device.ads.br;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cw;
import com.amazon.device.ads.cx;
import java.util.Collection;
import java.util.HashSet;

class ak {
    private static a a = new a();

    public static double a(double d2) {
        return a.a(d2);
    }

    public static double a(int n2, int n3, int n4, int n5) {
        return a.a(n2, n3, n4, n5);
    }

    public static float a() {
        return a.a();
    }

    public static int a(int n2) {
        return a.a(n2);
    }

    static void a(bl bl2, cw cw2) {
        a.a(bl2, cw2);
    }

    static boolean a(Context context) {
        return a.a(context);
    }

    public static int b(int n2) {
        return a.b(n2);
    }

    static class a {
        private final HashSet<String> a = new HashSet();
        private boolean b = false;

        a() {
            this.a.add((Object)"com.amazon.device.ads.AdActivity");
        }

        double a(double d2) {
            if (bd.a(19)) {
                d2 = 1.0;
            }
            return d2;
        }

        double a(int n2, int n3, int n4, int n5) {
            double d2 = n4;
            double d3 = n2;
            Double.isNaN((double)d2);
            Double.isNaN((double)d3);
            double d4 = d2 / d3;
            double d5 = n5;
            double d6 = n3;
            Double.isNaN((double)d5);
            Double.isNaN((double)d6);
            double d7 = d5 / d6;
            if (!(d7 < d4) && d4 != 0.0 || d7 == 0.0) {
                d7 = d4;
            }
            if (d7 == 0.0) {
                d7 = 1.0;
            }
            return d7;
        }

        float a() {
            return cx.a().c().q();
        }

        int a(int n2) {
            return (int)((float)n2 / this.a());
        }

        void a(bl bl2, cw cw2) {
            br br2;
            if (bl2 != null) {
                if (bl2.c()) {
                    cw2.a(cv.a.Z);
                } else {
                    cw2.a(cv.a.ab, bl2.b());
                }
            }
            if ((br2 = cx.a().c()).m() != null) {
                cw2.a(cv.a.aa, br2.m());
            }
        }

        boolean a(Context context) {
            if (this.b) {
                return true;
            }
            HashSet hashSet = new HashSet();
            String string = context.getPackageCodePath();
            ActivityInfo[] arractivityInfo = context.getPackageManager().getPackageArchiveInfo((String)string, (int)1).activities;
            int n2 = arractivityInfo.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                hashSet.add((Object)arractivityInfo[i2].name);
            }
            try {
                boolean bl2 = this.b = hashSet.containsAll(this.a);
                return bl2;
            }
            catch (Exception exception) {
                this.b = true;
                return true;
            }
        }

        int b(int n2) {
            float f2 = n2 == -1 ? (float)n2 : (float)n2 * this.a();
            return (int)f2;
        }
    }

}

