/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.eh;

class bh {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static byte[] a(String var0) {
        if (eh.b(var0) != false) throw new IllegalArgumentException("Encoded String must not be null or white space");
        var1_1 = bh.b(var0);
        if (var1_1 <= 0) throw new IllegalArgumentException("Encoded String decodes to zero bytes");
        var2_2 = new byte[var1_1];
        var3_3 = 0;
        var4_4 = 0;
        while (var3_3 < var0.length()) {
            block12 : {
                if (var4_4 >= var1_1) {
                    return var2_2;
                }
                var5_5 = var3_3 % 4;
                if (var5_5 == 0 && var0.length() < var3_3 + 4) {
                    return var2_2;
                }
                var6_6 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".indexOf((int)var0.charAt(var3_3));
                if (var6_6 == -1) {
                    return var2_2;
                }
                switch (var5_5) {
                    default: {
                        break block12;
                    }
                    case 3: {
                        var8_8 = var4_4 + 1;
                        var2_2[var4_4] = (byte)(var2_2[var4_4] | (byte)(var6_6 & 63));
                        var4_4 = var8_8;
                        break block12;
                    }
                    case 2: {
                        var7_7 = var4_4 + 1;
                        var2_2[var4_4] = (byte)(var2_2[var4_4] | (byte)(15 & var6_6 >> 2));
                        if (var7_7 < var1_1) {
                            var2_2[var7_7] = (byte)(var6_6 << 6);
                        }
                        ** GOTO lbl35
                    }
                    case 1: {
                        var7_7 = var4_4 + 1;
                        var2_2[var4_4] = (byte)(var2_2[var4_4] | (byte)(3 & var6_6 >> 4));
                        if (var7_7 < var1_1) {
                            var2_2[var7_7] = (byte)(var6_6 << 4);
                        }
lbl35: // 4 sources:
                        var4_4 = var7_7;
                        break block12;
                    }
                    case 0: 
                }
                var2_2[var4_4] = (byte)(var6_6 << 2);
            }
            ++var3_3;
        }
        return var2_2;
    }

    private static int b(String string) {
        int n2 = string.indexOf("=");
        int n3 = n2 > -1 ? string.length() - n2 : 0;
        return 3 * ((3 + string.length()) / 4) - n3;
    }
}

