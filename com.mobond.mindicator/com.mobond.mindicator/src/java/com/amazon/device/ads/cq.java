/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

class cq {
    cq() {
    }

    public ViewGroup a(Context context, a a2, String string) {
        LinearLayout linearLayout;
        switch (1.a[a2.ordinal()]) {
            default: {
                linearLayout = new LinearLayout(context);
                break;
            }
            case 2: {
                linearLayout = new FrameLayout(context);
                break;
            }
            case 1: {
                linearLayout = new RelativeLayout(context);
            }
        }
        linearLayout.setContentDescription((CharSequence)string);
        return linearLayout;
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        static {
            a[] arra = new a[]{a, b, c};
            d = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])d.clone();
        }
    }

}

