/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 */
package a.a.a.a;

import java.io.IOException;
import java.util.ArrayList;

public class b {
    final char a;
    final char b;
    final char c;
    final boolean d;
    final boolean e;
    final boolean f;
    private String g;
    private boolean h = false;

    public b() {
        this(',', '\"', '\\');
    }

    public b(char c2, char c3, char c4) {
        this(c2, c3, c4, false);
    }

    public b(char c2, char c3, char c4, boolean bl2) {
        this(c2, c3, c4, bl2, true);
    }

    public b(char c2, char c3, char c4, boolean bl2, boolean bl3) {
        this(c2, c3, c4, bl2, bl3, false);
    }

    public b(char c2, char c3, char c4, boolean bl2, boolean bl3, boolean bl4) {
        if (!this.a(c2, c3, c4)) {
            if (c2 != '\u0000') {
                this.a = c2;
                this.b = c3;
                this.c = c4;
                this.d = bl2;
                this.e = bl3;
                this.f = bl4;
                return;
            }
            throw new UnsupportedOperationException("The separator character must be defined!");
        }
        throw new UnsupportedOperationException("The separator, quote, and escape characters must be different!");
    }

    private boolean a(char c2, char c3) {
        return c2 != '\u0000' && c2 == c3;
    }

    private boolean a(char c2, char c3, char c4) {
        return this.a(c2, c3) || this.a(c2, c4) || this.a(c3, c4);
        {
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String[] a(String string, boolean bl2) {
        boolean bl3;
        StringBuilder stringBuilder;
        if (!bl2 && this.g != null) {
            this.g = null;
        }
        if (string == null) {
            String string2 = this.g;
            if (string2 == null) return null;
            this.g = null;
            return new String[]{string2};
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder stringBuilder2 = new StringBuilder(128);
        String string3 = this.g;
        if (string3 != null) {
            stringBuilder2.append(string3);
            this.g = null;
            bl3 = true ^ this.f;
        } else {
            bl3 = false;
        }
        StringBuilder stringBuilder3 = stringBuilder2;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == this.c) {
                boolean bl4 = bl3 && !this.f || this.h;
                if (!this.a(string, bl4, i2)) continue;
                stringBuilder3.append(string.charAt(++i2));
                continue;
            }
            if (c2 == this.b) {
                boolean bl5 = bl3 && !this.f || this.h;
                if (this.b(string, bl5, i2)) {
                    stringBuilder3.append(string.charAt(++i2));
                } else {
                    int n2;
                    int n3;
                    bl3 = !bl3;
                    if (!this.d && i2 > 2 && string.charAt(i2 - 1) != this.a && (n3 = string.length()) > (n2 = i2 + 1) && string.charAt(n2) != this.a) {
                        if (this.e && stringBuilder3.length() > 0 && this.a((CharSequence)stringBuilder3)) {
                            stringBuilder3 = new StringBuilder(128);
                        } else {
                            stringBuilder3.append(c2);
                        }
                    }
                }
                this.h = true ^ this.h;
                continue;
            }
            if (c2 == this.a && (!bl3 || this.f)) {
                arrayList.add((Object)stringBuilder3.toString());
                stringBuilder3 = new StringBuilder(128);
                this.h = false;
                continue;
            }
            if (this.d && (!bl3 || this.f)) continue;
            stringBuilder3.append(c2);
            this.h = true;
        }
        if (bl3 && !this.f) {
            if (!bl2) throw new IOException("Un-terminated quoted field at end of CSV line");
            stringBuilder3.append("\n");
            this.g = stringBuilder3.toString();
            stringBuilder = null;
        } else {
            stringBuilder = stringBuilder3;
        }
        if (stringBuilder == null) return (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
        arrayList.add((Object)stringBuilder.toString());
        return (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
    }

    private boolean b(String string, boolean bl2, int n2) {
        int n3;
        int n4;
        return bl2 && (n3 = string.length()) > (n4 = n2 + 1) && string.charAt(n4) == this.b;
    }

    public boolean a() {
        return this.g != null;
    }

    protected boolean a(CharSequence charSequence) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            if (Character.isWhitespace((char)charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(String string, boolean bl2, int n2) {
        int n3;
        boolean bl3 = true;
        if (!bl2) return false;
        int n4 = string.length();
        if (n4 <= (n3 = n2 + bl3)) return false;
        if (string.charAt(n3) == this.b) return bl3;
        if (string.charAt(n3) != this.c) return false;
        return bl3;
    }

    public String[] a(String string) {
        return this.a(string, true);
    }
}

