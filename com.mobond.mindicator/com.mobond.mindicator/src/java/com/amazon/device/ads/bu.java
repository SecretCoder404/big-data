/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.view.Display
 *  android.view.WindowManager
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.Display;
import android.view.WindowManager;
import com.amazon.device.ads.bc;

class bu {
    private static int[][] a = new int[][]{{1, 0, 9, 8}, {0, 9, 8, 1}};

    public static int a(Context context, bc bc2) {
        int n2;
        boolean bl2;
        block6 : {
            block7 : {
                block8 : {
                    int n3;
                    block4 : {
                        block5 : {
                            n2 = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
                            n3 = context.getResources().getConfiguration().orientation;
                            if (n3 != 1) break block4;
                            if (n2 == 0) break block5;
                            bl2 = false;
                            if (n2 != 2) break block6;
                        }
                        bl2 = true;
                        break block6;
                    }
                    if (n3 != 2) break block7;
                    if (n2 == 1) break block8;
                    bl2 = false;
                    if (n2 != 3) break block6;
                }
                bl2 = true;
                break block6;
            }
            bl2 = true;
        }
        int n4 = bl2 ^ true;
        return a[n4][n2];
    }
}

