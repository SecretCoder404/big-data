/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.mulo.util.b
 *  java.io.Serializable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Locale
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.indianrail.a;

import android.content.Context;
import com.mobond.mindicator.a;
import com.mobond.mindicator.ui.indianrail.a.d;
import com.mobond.mindicator.ui.indianrail.a.e;
import com.mobond.mindicator.ui.indianrail.a.g;
import com.mulo.util.b;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;

public class f
implements Serializable {
    public String a;
    public String b;
    public String c;
    public byte d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public boolean w = false;
    byte[] x;

    public static String a(Context context, String string) {
        block112 : {
            int n2;
            block115 : {
                String string2;
                block113 : {
                    int n3;
                    block114 : {
                        boolean bl = a.a(context).D();
                        int n4 = 1 + string.indexOf(91);
                        if (n4 == 0) break block112;
                        string2 = string.substring(n4, string.indexOf(93));
                        if (!bl) break block113;
                        switch (string2.hashCode()) {
                            default: {
                                break;
                            }
                            case 2644194: {
                                if (!string2.equals((Object)"VSKP")) break;
                                n3 = 25;
                                break block114;
                            }
                            case 2460980: {
                                if (!string2.equals((Object)"PNVL")) break;
                                n3 = 11;
                                break block114;
                            }
                            case 2370065: {
                                if (!string2.equals((Object)"MMCT")) break;
                                n3 = 2;
                                break block114;
                            }
                            case 2098672: {
                                if (!string2.equals((Object)"DIVA")) break;
                                n3 = 9;
                                break block114;
                            }
                            case 2078441: {
                                if (!string2.equals((Object)"CSTM")) break;
                                n3 = 1;
                                break block114;
                            }
                            case 2078231: {
                                if (!string2.equals((Object)"CSMT")) break;
                                n3 = 0;
                                break block114;
                            }
                            case 2034241: {
                                if (!string2.equals((Object)"BDTS")) break;
                                n3 = 5;
                                break block114;
                            }
                            case 2014123: {
                                if (!string2.equals((Object)"ANVT")) break;
                                n3 = 13;
                                break block114;
                            }
                            case 82630: {
                                if (!string2.equals((Object)"SZM")) break;
                                n3 = 17;
                                break block114;
                            }
                            case 82372: {
                                if (!string2.equals((Object)"SRC")) break;
                                n3 = 24;
                                break block114;
                            }
                            case 81882: {
                                if (!string2.equals((Object)"SBI")) break;
                                n3 = 21;
                                break block114;
                            }
                            case 77825: {
                                if (!string2.equals((Object)"NZM")) break;
                                n3 = 16;
                                break block114;
                            }
                            case 75724: {
                                if (!string2.equals((Object)"LTT")) break;
                                n3 = 8;
                                break block114;
                            }
                            case 74912: {
                                if (!string2.equals((Object)"KYN")) break;
                                n3 = 12;
                                break block114;
                            }
                            case 73240: {
                                if (!string2.equals((Object)"JBP")) break;
                                n3 = 18;
                                break block114;
                            }
                            case 71961: {
                                if (!string2.equals((Object)"HWH")) break;
                                n3 = 23;
                                break block114;
                            }
                            case 67986: {
                                if (!string2.equals((Object)"DSA")) break;
                                n3 = 15;
                                break block114;
                            }
                            case 67777: {
                                if (!string2.equals((Object)"DLI")) break;
                                n3 = 14;
                                break block114;
                            }
                            case 67538: {
                                if (!string2.equals((Object)"DDR")) break;
                                n3 = 6;
                                break block114;
                            }
                            case 66548: {
                                if (!string2.equals((Object)"CCT")) break;
                                n3 = 22;
                                break block114;
                            }
                            case 66081: {
                                if (!string2.equals((Object)"BSR")) break;
                                n3 = 10;
                                break block114;
                            }
                            case 66035: {
                                if (!string2.equals((Object)"BRC")) break;
                                n3 = 19;
                                break block114;
                            }
                            case 65587: {
                                if (!string2.equals((Object)"BCT")) break;
                                n3 = 3;
                                break block114;
                            }
                            case 64646: {
                                if (!string2.equals((Object)"ADI")) break;
                                n3 = 20;
                                break block114;
                            }
                            case 2748: {
                                if (!string2.equals((Object)"VR")) break;
                                n3 = 4;
                                break block114;
                            }
                            case 2640: {
                                if (!string2.equals((Object)"SC")) break;
                                n3 = 26;
                                break block114;
                            }
                            case 2190: {
                                if (!string2.equals((Object)"DR")) break;
                                n3 = 7;
                                break block114;
                            }
                        }
                        n3 = -1;
                    }
                    switch (n3) {
                        default: {
                            return string.substring(0, string.lastIndexOf(32));
                        }
                        case 26: {
                            return "\u0938\u093f\u0915\u0902\u0926\u0930\u093e\u092c\u093e\u0926";
                        }
                        case 25: {
                            return "\u0935\u093f\u0936\u093e\u0916\u092a\u091f\u094d\u091f\u0923\u092e";
                        }
                        case 24: {
                            return "\u0915\u094b\u0932\u0915\u093e\u0924\u093e \u0938\u093e\u0902\u0924\u0930\u093e\u0917\u093e\u091b\u093f";
                        }
                        case 23: {
                            return "\u0915\u094b\u0932\u0915\u093e\u0924\u093e \u0939\u093e\u0935\u095c\u093e";
                        }
                        case 22: {
                            return "\u0915\u093e\u0915\u0940\u0928\u093e\u095c\u093e \u091f\u093e\u0909\u0928";
                        }
                        case 21: {
                            return "\u0938\u093e\u092c\u0930\u092e\u0924\u0940";
                        }
                        case 20: {
                            return "\u0905\u0939\u092e\u0926\u093e\u092c\u093e\u0926";
                        }
                        case 19: {
                            return "\u0935\u095c\u094b\u0926\u0930\u093e";
                        }
                        case 18: {
                            return "\u091c\u092c\u0932\u092a\u0941\u0930";
                        }
                        case 17: {
                            return "\u0938\u092c\u094d\u095b\u0940 \u092e\u0902\u0921\u0940";
                        }
                        case 16: {
                            return "\u0939\u095b\u0930\u0924 \u0928\u093f\u091c\u093e\u092e\u0941\u0926\u094d\u0926\u0940\u0928";
                        }
                        case 15: {
                            return "\u0936\u093e\u0939\u0926\u0930\u093e";
                        }
                        case 14: {
                            return "\u0926\u093f\u0932\u094d\u0932\u0940 \u091c\u0902.";
                        }
                        case 13: {
                            return "\u0906\u0928\u0902\u0926 \u0935\u093f\u0939\u093e\u0930 \u091f.";
                        }
                        case 12: {
                            return "\u0915\u0932\u094d\u092f\u093e\u0923";
                        }
                        case 11: {
                            return "\u092a\u0928\u0935\u0947\u0932";
                        }
                        case 10: {
                            return "\u0935\u0938\u0908";
                        }
                        case 9: {
                            return "\u0926\u093f\u0935\u093e";
                        }
                        case 8: {
                            return "\u0924\u093f\u0932\u0915 \u091f.";
                        }
                        case 7: {
                            return "\u0926\u093e\u0926\u0930 (C)";
                        }
                        case 6: {
                            return "\u0926\u093e\u0926\u0930 (W)";
                        }
                        case 5: {
                            return "\u092c\u093e\u0902\u0926\u094d\u0930\u093e \u091f.";
                        }
                        case 4: {
                            return "\u0935\u093f\u0930\u093e\u0930";
                        }
                        case 2: 
                        case 3: {
                            return "\u092e\u0941\u0902\u092c\u0908 \u0938\u0947\u0902\u091f\u094d\u0930\u0932";
                        }
                        case 0: 
                        case 1: 
                    }
                    return "\u092e\u0941\u0902\u092c\u0908 \u091b.\u0936\u093f.\u092e.\u091f.";
                }
                switch (string2.hashCode()) {
                    default: {
                        break;
                    }
                    case 2644194: {
                        if (!string2.equals((Object)"VSKP")) break;
                        n2 = 25;
                        break block115;
                    }
                    case 2460980: {
                        if (!string2.equals((Object)"PNVL")) break;
                        n2 = 11;
                        break block115;
                    }
                    case 2370065: {
                        if (!string2.equals((Object)"MMCT")) break;
                        n2 = 2;
                        break block115;
                    }
                    case 2098672: {
                        if (!string2.equals((Object)"DIVA")) break;
                        n2 = 9;
                        break block115;
                    }
                    case 2078441: {
                        if (!string2.equals((Object)"CSTM")) break;
                        n2 = 1;
                        break block115;
                    }
                    case 2078231: {
                        if (!string2.equals((Object)"CSMT")) break;
                        n2 = 0;
                        break block115;
                    }
                    case 2034241: {
                        if (!string2.equals((Object)"BDTS")) break;
                        n2 = 5;
                        break block115;
                    }
                    case 2014123: {
                        if (!string2.equals((Object)"ANVT")) break;
                        n2 = 13;
                        break block115;
                    }
                    case 82630: {
                        if (!string2.equals((Object)"SZM")) break;
                        n2 = 17;
                        break block115;
                    }
                    case 82372: {
                        if (!string2.equals((Object)"SRC")) break;
                        n2 = 24;
                        break block115;
                    }
                    case 81882: {
                        if (!string2.equals((Object)"SBI")) break;
                        n2 = 21;
                        break block115;
                    }
                    case 77825: {
                        if (!string2.equals((Object)"NZM")) break;
                        n2 = 16;
                        break block115;
                    }
                    case 75724: {
                        if (!string2.equals((Object)"LTT")) break;
                        n2 = 8;
                        break block115;
                    }
                    case 74912: {
                        if (!string2.equals((Object)"KYN")) break;
                        n2 = 12;
                        break block115;
                    }
                    case 73240: {
                        if (!string2.equals((Object)"JBP")) break;
                        n2 = 18;
                        break block115;
                    }
                    case 71961: {
                        if (!string2.equals((Object)"HWH")) break;
                        n2 = 23;
                        break block115;
                    }
                    case 67986: {
                        if (!string2.equals((Object)"DSA")) break;
                        n2 = 15;
                        break block115;
                    }
                    case 67777: {
                        if (!string2.equals((Object)"DLI")) break;
                        n2 = 14;
                        break block115;
                    }
                    case 67538: {
                        if (!string2.equals((Object)"DDR")) break;
                        n2 = 6;
                        break block115;
                    }
                    case 66548: {
                        if (!string2.equals((Object)"CCT")) break;
                        n2 = 22;
                        break block115;
                    }
                    case 66081: {
                        if (!string2.equals((Object)"BSR")) break;
                        n2 = 10;
                        break block115;
                    }
                    case 66035: {
                        if (!string2.equals((Object)"BRC")) break;
                        n2 = 19;
                        break block115;
                    }
                    case 65587: {
                        if (!string2.equals((Object)"BCT")) break;
                        n2 = 3;
                        break block115;
                    }
                    case 64646: {
                        if (!string2.equals((Object)"ADI")) break;
                        n2 = 20;
                        break block115;
                    }
                    case 2748: {
                        if (!string2.equals((Object)"VR")) break;
                        n2 = 4;
                        break block115;
                    }
                    case 2640: {
                        if (!string2.equals((Object)"SC")) break;
                        n2 = 26;
                        break block115;
                    }
                    case 2190: {
                        if (!string2.equals((Object)"DR")) break;
                        n2 = 7;
                        break block115;
                    }
                }
                n2 = -1;
            }
            switch (n2) {
                default: {
                    return string.substring(0, string.lastIndexOf(32));
                }
                case 26: {
                    return "Secunderabad Junction";
                }
                case 25: {
                    return "Visakhapatnam";
                }
                case 24: {
                    return "Kolkata Santragachi";
                }
                case 23: {
                    return "Kolkata Howrah";
                }
                case 22: {
                    return "Kakinada Town";
                }
                case 21: {
                    return "Sabarmati";
                }
                case 20: {
                    return "Ahmedabad";
                }
                case 19: {
                    return "Vadodara";
                }
                case 18: {
                    return "Jabalpur";
                }
                case 17: {
                    return "Sabzi Mandi";
                }
                case 16: {
                    return "Hazrat Nizamuddin";
                }
                case 15: {
                    return "Shahdara";
                }
                case 14: {
                    return "Old Delhi";
                }
                case 13: {
                    return "Anand Vihar T.";
                }
                case 12: {
                    return "Kalyan";
                }
                case 11: {
                    return "Panvel";
                }
                case 10: {
                    return "Vasai";
                }
                case 9: {
                    return "Diva";
                }
                case 8: {
                    return "Tilak T.";
                }
                case 7: {
                    return "Dadar(CR)";
                }
                case 6: {
                    return "Dadar(WR)";
                }
                case 5: {
                    return "Bandra T.";
                }
                case 4: {
                    return "Virar";
                }
                case 2: 
                case 3: {
                    return "Mumbai Central";
                }
                case 0: 
                case 1: 
            }
            return "Mumbai CSMT";
        }
        return string;
    }

    private String a(String string) {
        Date date = new SimpleDateFormat("HH:mm", Locale.ENGLISH).parse(string);
        return new SimpleDateFormat("hh:mm a", Locale.ENGLISH).format(date);
    }

    e a(int n2, int n3) {
        int n4;
        f f2 = this;
        b b2 = new b(f2.x);
        int n5 = d.a(n2);
        int n6 = d.a(n3);
        int n7 = 0;
        int n8 = 0;
        boolean bl = false;
        boolean bl2 = false;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        boolean bl3 = false;
        boolean bl4 = false;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        while (n8 < f2.x.length) {
            boolean bl5;
            boolean bl6;
            int n15;
            short s2 = b2.b(n8);
            if (s2 < 0) {
                s2 = (short)Math.abs((int)s2);
                bl6 = true;
            } else {
                bl6 = false;
            }
            if (!bl && s2 == n2) {
                n9 = n12;
                bl = true;
            }
            if (!bl3 && s2 == n3) {
                n15 = n12;
                bl5 = true;
            } else {
                int n16 = n14;
                bl5 = bl3;
                n15 = n16;
            }
            int n17 = d.a(s2);
            short s3 = s2;
            if (n17 != -1) {
                if (!bl4 && n17 == n5) {
                    n11 = n12;
                    n13 = s3;
                    bl4 = true;
                }
                if (!bl2 && n17 == n6) {
                    n10 = n12;
                    n7 = s3;
                    bl2 = true;
                }
            }
            n8 += 8;
            if (bl6) {
                n8 = b2.b(n8) + (n8 + 2);
            }
            ++n12;
            if (bl && bl5 && n9 < n15) {
                e e2 = new e();
                e2.a = n9;
                e2.b = n15;
                e2.c = n2;
                e2.d = n3;
                return e2;
            }
            f2 = this;
            boolean bl7 = bl5;
            n14 = n15;
            bl3 = bl7;
        }
        if (bl && bl2 && n9 < n10) {
            e e3 = new e();
            e3.a = n9;
            e3.b = n10;
            e3.c = n2;
            e3.d = n7;
            return e3;
        }
        if (bl4 && bl3 && n11 < (n4 = n14)) {
            e e4 = new e();
            e4.a = n11;
            e4.b = n4;
            e4.c = n13;
            e4.d = n3;
            return e4;
        }
        int n18 = n13;
        if (bl4 && bl2 && n11 < n10) {
            e e5 = new e();
            e5.a = n11;
            e5.b = n10;
            e5.c = n18;
            e5.d = n7;
            return e5;
        }
        return null;
    }

    public Vector<g> a() {
        Vector<String> vector = com.mobond.mindicator.ui.indianrail.a.a.a;
        b b2 = new b(this.x);
        Vector vector2 = new Vector();
        int n2 = 0;
        while (n2 < this.x.length) {
            boolean bl;
            g g2 = new g();
            short s2 = b2.b(n2);
            if (s2 < 0) {
                s2 = (short)Math.abs((int)s2);
                bl = true;
            } else {
                bl = false;
            }
            int n3 = n2 + 2;
            g2.a = (String)vector.elementAt((int)s2);
            g2.k = s2;
            byte[] arrby = b2.a(n3, 3);
            int n4 = ((255 & arrby[0]) << 3) + ((224 & arrby[1]) >>> 5);
            int n5 = (255 & arrby[2]) + ((31 & arrby[1]) << 8);
            int n6 = n3 + 3;
            short s3 = b2.b(n6);
            int n7 = n6 + 2;
            byte by = b2.a(n7);
            byte by2 = (byte)(7 & by >> 5);
            byte by3 = (byte)(by & 31);
            n2 = n7 + 1;
            if (bl) {
                short s4 = b2.b(n2);
                int n8 = n2 + 2;
                int n9 = s4 / 2;
                g2.j = new String[n9];
                int n10 = n8;
                for (int i2 = 0; i2 < n9; ++i2) {
                    short s5 = b2.b(n10);
                    n10 += 2;
                    g2.j[i2] = com.mobond.mindicator.ui.indianrail.a.a.a(s5);
                }
                n2 = n10;
            }
            g2.d = n4;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append((int)s3);
            g2.e = stringBuilder.toString();
            int n11 = n4 / 60;
            int n12 = n4 % 60;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("");
            stringBuilder2.append(n11);
            stringBuilder2.append(":");
            stringBuilder2.append(n12);
            String string = stringBuilder2.toString();
            g2.b = this.a(string);
            g2.c = string;
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("");
            stringBuilder3.append((int)by2);
            g2.g = stringBuilder3.toString();
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("");
            stringBuilder4.append(n5);
            g2.f = stringBuilder4.toString();
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append("");
            stringBuilder5.append((int)by3);
            g2.h = stringBuilder5.toString();
            vector2.add((Object)g2);
        }
        return vector2;
    }
}

