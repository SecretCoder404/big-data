/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.b.v$1
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.b;

import com.google.b.e;
import com.google.b.v;

final class v {
    static String a(e e2) {
        return v.a((a)new 1(e2));
    }

    static String a(a a2) {
        StringBuilder stringBuilder = new StringBuilder(a2.a());
        for (int i2 = 0; i2 < a2.a(); ++i2) {
            byte by2 = a2.a(i2);
            if (by2 != 34) {
                if (by2 != 39) {
                    if (by2 != 92) {
                        switch (by2) {
                            default: {
                                if (by2 >= 32 && by2 <= 126) {
                                    stringBuilder.append((char)by2);
                                    break;
                                }
                                stringBuilder.append('\\');
                                stringBuilder.append((char)(48 + (3 & by2 >>> 6)));
                                stringBuilder.append((char)(48 + (7 & by2 >>> 3)));
                                stringBuilder.append((char)(48 + (by2 & 7)));
                                break;
                            }
                            case 13: {
                                stringBuilder.append("\\r");
                                break;
                            }
                            case 12: {
                                stringBuilder.append("\\f");
                                break;
                            }
                            case 11: {
                                stringBuilder.append("\\v");
                                break;
                            }
                            case 10: {
                                stringBuilder.append("\\n");
                                break;
                            }
                            case 9: {
                                stringBuilder.append("\\t");
                                break;
                            }
                            case 8: {
                                stringBuilder.append("\\b");
                                break;
                            }
                            case 7: {
                                stringBuilder.append("\\a");
                                break;
                            }
                        }
                        continue;
                    }
                    stringBuilder.append("\\\\");
                    continue;
                }
                stringBuilder.append("\\'");
                continue;
            }
            stringBuilder.append("\\\"");
        }
        return stringBuilder.toString();
    }

    static String a(String string) {
        return v.a(e.a(string));
    }

    private static interface a {
        public byte a(int var1);

        public int a();
    }

}

