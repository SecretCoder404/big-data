/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.a.d.a$1
 *  java.io.Closeable
 *  java.io.EOFException
 *  java.io.IOException
 *  java.io.Reader
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package com.google.a.d;

import com.google.a.b.f;
import com.google.a.d.a;
import com.google.a.d.b;
import com.google.a.d.d;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

public class a
implements Closeable {
    private static final char[] b = ")]}'\n".toCharArray();
    int a = 0;
    private final Reader c;
    private boolean d = false;
    private final char[] e = new char[1024];
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private long j;
    private int k;
    private String l;
    private int[] m = new int[32];
    private int n = 0;
    private String[] o;
    private int[] p;

    static {
        f.a = new 1();
    }

    public a(Reader reader) {
        int[] arrn = this.m;
        int n2 = this.n;
        this.n = n2 + 1;
        arrn[n2] = 6;
        this.o = new String[32];
        this.p = new int[32];
        if (reader != null) {
            this.c = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private void a(int n2) {
        int n3 = this.n;
        int[] arrn = this.m;
        if (n3 == arrn.length) {
            int[] arrn2 = new int[n3 * 2];
            int[] arrn3 = new int[n3 * 2];
            String[] arrstring = new String[n3 * 2];
            System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)0, (int)n3);
            System.arraycopy((Object)this.p, (int)0, (Object)arrn3, (int)0, (int)this.n);
            System.arraycopy((Object)this.o, (int)0, (Object)arrstring, (int)0, (int)this.n);
            this.m = arrn2;
            this.p = arrn3;
            this.o = arrstring;
        }
        int[] arrn4 = this.m;
        int n4 = this.n;
        this.n = n4 + 1;
        arrn4[n4] = n2;
    }

    private boolean a(char c2) {
        switch (c2) {
            default: {
                return true;
            }
            case '#': 
            case '/': 
            case ';': 
            case '=': 
            case '\\': {
                this.w();
            }
            case '\t': 
            case '\n': 
            case '\f': 
            case '\r': 
            case ' ': 
            case ',': 
            case ':': 
            case '[': 
            case ']': 
            case '{': 
            case '}': 
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(String var1_1) {
        var2_2 = var1_1.length();
        block0 : do {
            block6 : {
                if (var2_2 + this.f > this.g) {
                    if (this.b(var2_2) == false) return false;
                }
                var3_3 = this.e;
                var4_4 = this.f;
                var5_5 = var3_3[var4_4];
                var6_6 = 0;
                if (var5_5 != '\n') break block6;
                this.h = 1 + this.h;
                this.i = var4_4 + 1;
                ** GOTO lbl16
            }
            while (var6_6 < var2_2) {
                block7 : {
                    if (this.e[var6_6 + this.f] == var1_1.charAt(var6_6)) break block7;
lbl16: // 2 sources:
                    this.f = 1 + this.f;
                    continue block0;
                }
                ++var6_6;
            }
            return true;
            break;
        } while (true);
    }

    private int b(boolean bl2) {
        char[] arrc = this.e;
        int n2 = this.f;
        int n3 = this.g;
        do {
            if (n2 == n3) {
                this.f = n2;
                if (!this.b(1)) {
                    if (!bl2) {
                        return -1;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("End of input");
                    stringBuilder.append(this.s());
                    throw new EOFException(stringBuilder.toString());
                }
                n2 = this.f;
                n3 = this.g;
            }
            int n4 = n2 + 1;
            char c2 = arrc[n2];
            if (c2 == '\n') {
                this.h = 1 + this.h;
                this.i = n4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f = n4;
                    if (n4 == n3) {
                        --this.f;
                        boolean bl3 = this.b(2);
                        this.f = 1 + this.f;
                        if (!bl3) {
                            return c2;
                        }
                    }
                    this.w();
                    int n5 = this.f;
                    char c3 = arrc[n5];
                    if (c3 != '*') {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.f = n5 + 1;
                        this.x();
                        n2 = this.f;
                        n3 = this.g;
                        continue;
                    }
                    this.f = n5 + 1;
                    if (this.a("*/")) {
                        n2 = 2 + this.f;
                        n3 = this.g;
                        continue;
                    }
                    throw this.b("Unterminated comment");
                }
                if (c2 == '#') {
                    this.f = n4;
                    this.w();
                    this.x();
                    n2 = this.f;
                    n3 = this.g;
                    continue;
                }
                this.f = n4;
                return c2;
            }
            n2 = n4;
        } while (true);
    }

    private IOException b(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(this.s());
        throw new d(stringBuilder.toString());
    }

    private String b(char c2) {
        char[] arrc = this.e;
        StringBuilder stringBuilder = null;
        do {
            int n2 = this.f;
            int n3 = this.g;
            int n4 = n2;
            while (n2 < n3) {
                int n5 = n2 + 1;
                char c3 = arrc[n2];
                if (c3 == c2) {
                    this.f = n5;
                    int n6 = n5 - n4 - 1;
                    if (stringBuilder == null) {
                        return new String(arrc, n4, n6);
                    }
                    stringBuilder.append(arrc, n4, n6);
                    return stringBuilder.toString();
                }
                if (c3 == '\\') {
                    this.f = n5;
                    int n7 = n5 - n4 - 1;
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder(Math.max((int)(2 * (n7 + 1)), (int)16));
                    }
                    stringBuilder.append(arrc, n4, n7);
                    stringBuilder.append(this.y());
                    n2 = this.f;
                    n3 = this.g;
                    n4 = n2;
                    continue;
                }
                if (c3 == '\n') {
                    this.h = 1 + this.h;
                    this.i = n5;
                }
                n2 = n5;
            }
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder(Math.max((int)(2 * (n2 - n4)), (int)16));
            }
            stringBuilder.append(arrc, n4, n2 - n4);
            this.f = n2;
        } while (this.b(1));
        throw this.b("Unterminated string");
    }

    private boolean b(int n2) {
        Reader reader;
        int n3;
        int n4;
        char[] arrc = this.e;
        int n5 = this.i;
        int n6 = this.f;
        this.i = n5 - n6;
        int n7 = this.g;
        if (n7 != n6) {
            this.g = n7 - n6;
            System.arraycopy((Object)arrc, (int)n6, (Object)arrc, (int)0, (int)this.g);
        } else {
            this.g = 0;
        }
        this.f = 0;
        while ((n4 = (reader = this.c).read(arrc, n3 = this.g, arrc.length - n3)) != -1) {
            int n8;
            this.g = n4 + this.g;
            if (this.h == 0 && (n8 = this.i) == 0 && this.g > 0 && arrc[0] == '\ufeff') {
                this.f = 1 + this.f;
                this.i = n8 + 1;
                ++n2;
            }
            if (this.g < n2) continue;
            return true;
        }
        return false;
    }

    private void c(char c2) {
        char[] arrc = this.e;
        do {
            int n2 = this.f;
            int n3 = this.g;
            while (n2 < n3) {
                int n4 = n2 + 1;
                char c3 = arrc[n2];
                if (c3 == c2) {
                    this.f = n4;
                    return;
                }
                if (c3 == '\\') {
                    this.f = n4;
                    this.y();
                    n2 = this.f;
                    n3 = this.g;
                    continue;
                }
                if (c3 == '\n') {
                    this.h = 1 + this.h;
                    this.i = n4;
                }
                n2 = n4;
            }
            this.f = n2;
        } while (this.b(1));
        throw this.b("Unterminated string");
    }

    private int o() {
        int n2;
        String string;
        String string2;
        char c2 = this.e[this.f];
        if (c2 != 't' && c2 != 'T') {
            if (c2 != 'f' && c2 != 'F') {
                if (c2 != 'n' && c2 != 'N') {
                    return 0;
                }
                string2 = "null";
                string = "NULL";
                n2 = 7;
            } else {
                string2 = "false";
                string = "FALSE";
                n2 = 6;
            }
        } else {
            string2 = "true";
            string = "TRUE";
            n2 = 5;
        }
        int n3 = string2.length();
        for (int i2 = 1; i2 < n3; ++i2) {
            if (i2 + this.f >= this.g && !this.b(i2 + 1)) {
                return 0;
            }
            char c3 = this.e[i2 + this.f];
            if (c3 == string2.charAt(i2) || c3 == string.charAt(i2)) continue;
            return 0;
        }
        if ((n3 + this.f < this.g || this.b(n3 + 1)) && this.a(this.e[n3 + this.f])) {
            return 0;
        }
        this.f = n3 + this.f;
        this.a = n2;
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int t() {
        var1_1 = this.e;
        var2_2 = this.f;
        var3_3 = this.g;
        var4_4 = 0;
        var5_5 = 0;
        var6_6 = true;
        var7_7 = 0L;
        var9_8 = false;
        do {
            block20 : {
                if (var2_2 + var4_4 != var3_3) break block20;
                if (var4_4 == var1_1.length) {
                    return 0;
                }
                if (!this.b(var4_4 + 1)) ** GOTO lbl42
                var2_2 = this.f;
                var3_3 = this.g;
            }
            if ((var10_9 = var1_1[var2_2 + var4_4]) != '+') {
                if (var10_9 != 'E' && var10_9 != 'e') {
                    switch (var10_9) {
                        default: {
                            if (var10_9 >= '0' && var10_9 <= '9') {
                                if (var5_5 != 1 && var5_5 != 0) {
                                    if (var5_5 == 2) {
                                        if (var7_7 == 0L) {
                                            return 0;
                                        }
                                        var11_10 = 10L * var7_7 - (long)(var10_9 - 48);
                                        var13_11 = var7_7 > -922337203685477580L || var7_7 == -922337203685477580L && var11_10 < var7_7;
                                        var14_12 = var13_11 & var6_6;
                                        var7_7 = var11_10;
                                        var6_6 = var14_12;
                                        break;
                                    }
                                    if (var5_5 == 3) {
                                        var5_5 = 4;
                                        break;
                                    }
                                    if (var5_5 != 5 && var5_5 != 6) break;
                                    var5_5 = 7;
                                    break;
                                }
                                var7_7 = -(var10_9 - 48);
                                var5_5 = 2;
                                break;
                            }
                            if (this.a(var10_9) != false) return 0;
lbl42: // 2 sources:
                            if (!(var5_5 != 2 || !var6_6 || var7_7 == Long.MIN_VALUE && !var9_8 || var7_7 == 0L && var9_8)) {
                                if (!var9_8) {
                                    var7_7 = -var7_7;
                                }
                                this.j = var7_7;
                                this.f = var4_4 + this.f;
                                this.a = 15;
                                return 15;
                            }
                            if (var5_5 != 2 && var5_5 != 4) {
                                if (var5_5 != 7) return 0;
                            }
                            this.k = var4_4;
                            this.a = 16;
                            return 16;
                        }
                        case '.': {
                            if (var5_5 != 2) return 0;
                            var5_5 = 3;
                            break;
                        }
                        case '-': {
                            if (var5_5 == 0) {
                                var5_5 = 1;
                                var9_8 = true;
                                break;
                            }
                            if (var5_5 != 5) return 0;
                            var5_5 = 6;
                            break;
                        }
                    }
                } else {
                    if (var5_5 != 2) {
                        if (var5_5 != 4) return 0;
                    }
                    var5_5 = 5;
                }
            } else {
                if (var5_5 != 5) return 0;
                var5_5 = 6;
            }
            ++var4_4;
        } while (true);
    }

    /*
     * Exception decompiling
     */
    private String u() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
        // org.benf.cfr.reader.b.a.a.b.as.a(SwitchReplacer.java:478)
        // org.benf.cfr.reader.b.a.a.b.as.a(SwitchReplacer.java:61)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:372)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    private void v() {
        do {
            int n2;
            int n3 = 0;
            block5 : while ((n2 = this.f) + n3 < this.g) {
                switch (this.e[n2 + n3]) {
                    default: {
                        ++n3;
                        continue block5;
                    }
                    case '#': 
                    case '/': 
                    case ';': 
                    case '=': 
                    case '\\': {
                        this.w();
                    }
                    case '\t': 
                    case '\n': 
                    case '\f': 
                    case '\r': 
                    case ' ': 
                    case ',': 
                    case ':': 
                    case '[': 
                    case ']': 
                    case '{': 
                    case '}': 
                }
                this.f = n3 + this.f;
                return;
            }
            this.f = n2 + n3;
        } while (this.b(1));
    }

    private void w() {
        if (this.d) {
            return;
        }
        throw this.b("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private void x() {
        while (this.f < this.g || this.b(1)) {
            char[] arrc = this.e;
            int n2 = this.f;
            this.f = n2 + 1;
            char c2 = arrc[n2];
            if (c2 == '\n') {
                this.h = 1 + this.h;
                this.i = this.f;
                return;
            }
            if (c2 != '\r') continue;
        }
    }

    private char y() {
        if (this.f == this.g && !this.b(1)) {
            throw this.b("Unterminated escape sequence");
        }
        char[] arrc = this.e;
        int n2 = this.f;
        this.f = n2 + 1;
        char c2 = arrc[n2];
        if (c2 != '\n') {
            if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
                if (c2 != 'b') {
                    if (c2 != 'f') {
                        if (c2 != 'n') {
                            if (c2 != 'r') {
                                switch (c2) {
                                    default: {
                                        throw this.b("Invalid escape sequence");
                                    }
                                    case 'u': {
                                        int n3;
                                        if (4 + this.f > this.g && !this.b(4)) {
                                            throw this.b("Unterminated escape sequence");
                                        }
                                        char c3 = '\u0000';
                                        int n4 = n3 + 4;
                                        for (n3 = this.f; n3 < n4; ++n3) {
                                            char c4 = this.e[n3];
                                            char c5 = (char)(c3 << 4);
                                            if (c4 >= '0' && c4 <= '9') {
                                                c3 = (char)(c5 + (c4 - 48));
                                                continue;
                                            }
                                            if (c4 >= 'a' && c4 <= 'f') {
                                                c3 = (char)(c5 + (10 + (c4 - 97)));
                                                continue;
                                            }
                                            if (c4 >= 'A' && c4 <= 'F') {
                                                c3 = (char)(c5 + (10 + (c4 - 65)));
                                                continue;
                                            }
                                            StringBuilder stringBuilder = new StringBuilder();
                                            stringBuilder.append("\\u");
                                            stringBuilder.append(new String(this.e, this.f, 4));
                                            throw new NumberFormatException(stringBuilder.toString());
                                        }
                                        this.f = 4 + this.f;
                                        return c3;
                                    }
                                    case 't': 
                                }
                                return '\t';
                            }
                            return '\r';
                        }
                        return '\n';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.h = 1 + this.h;
            this.i = this.f;
        }
        return c2;
    }

    private void z() {
        char[] arrc;
        this.b(true);
        --this.f;
        int n2 = this.f;
        char[] arrc2 = b;
        if (n2 + arrc2.length > this.g && !this.b(arrc2.length)) {
            return;
        }
        for (int i2 = 0; i2 < (arrc = b).length; ++i2) {
            if (this.e[i2 + this.f] == arrc[i2]) continue;
            return;
        }
        this.f += arrc.length;
    }

    public void a() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 3) {
            this.a(1);
            this.p[this.n - 1] = 0;
            this.a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected BEGIN_ARRAY but was ");
        stringBuilder.append((Object)this.f());
        stringBuilder.append(this.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void a(boolean bl2) {
        this.d = bl2;
    }

    public void b() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 4) {
            this.n = -1 + this.n;
            int[] arrn = this.p;
            int n3 = -1 + this.n;
            arrn[n3] = 1 + arrn[n3];
            this.a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected END_ARRAY but was ");
        stringBuilder.append((Object)this.f());
        stringBuilder.append(this.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void c() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 1) {
            this.a(3);
            this.a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected BEGIN_OBJECT but was ");
        stringBuilder.append((Object)this.f());
        stringBuilder.append(this.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void close() {
        this.a = 0;
        this.m[0] = 8;
        this.n = 1;
        this.c.close();
    }

    public void d() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 2) {
            this.n = -1 + this.n;
            String[] arrstring = this.o;
            int n3 = this.n;
            arrstring[n3] = null;
            int[] arrn = this.p;
            int n4 = n3 - 1;
            arrn[n4] = 1 + arrn[n4];
            this.a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected END_OBJECT but was ");
        stringBuilder.append((Object)this.f());
        stringBuilder.append(this.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean e() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        return n2 != 2 && n2 != 4;
    }

    public b f() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        switch (n2) {
            default: {
                throw new AssertionError();
            }
            case 17: {
                return b.j;
            }
            case 15: 
            case 16: {
                return b.g;
            }
            case 12: 
            case 13: 
            case 14: {
                return b.e;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return b.f;
            }
            case 7: {
                return b.i;
            }
            case 5: 
            case 6: {
                return b.h;
            }
            case 4: {
                return b.b;
            }
            case 3: {
                return b.a;
            }
            case 2: {
                return b.d;
            }
            case 1: 
        }
        return b.c;
    }

    public String g() {
        block7 : {
            String string;
            block5 : {
                int n2;
                block6 : {
                    block4 : {
                        n2 = this.a;
                        if (n2 == 0) {
                            n2 = this.r();
                        }
                        if (n2 != 14) break block4;
                        string = this.u();
                        break block5;
                    }
                    if (n2 != 12) break block6;
                    string = this.b('\'');
                    break block5;
                }
                if (n2 != 13) break block7;
                string = this.b('\"');
            }
            this.a = 0;
            this.o[-1 + this.n] = string;
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected a name but was ");
        stringBuilder.append((Object)this.f());
        stringBuilder.append(this.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String h() {
        block10 : {
            String string;
            block5 : {
                int n2;
                block9 : {
                    block8 : {
                        block7 : {
                            block6 : {
                                block4 : {
                                    n2 = this.a;
                                    if (n2 == 0) {
                                        n2 = this.r();
                                    }
                                    if (n2 != 10) break block4;
                                    string = this.u();
                                    break block5;
                                }
                                if (n2 != 8) break block6;
                                string = this.b('\'');
                                break block5;
                            }
                            if (n2 != 9) break block7;
                            string = this.b('\"');
                            break block5;
                        }
                        if (n2 != 11) break block8;
                        string = this.l;
                        this.l = null;
                        break block5;
                    }
                    if (n2 != 15) break block9;
                    string = Long.toString((long)this.j);
                    break block5;
                }
                if (n2 != 16) break block10;
                string = new String(this.e, this.f, this.k);
                this.f += this.k;
            }
            this.a = 0;
            int[] arrn = this.p;
            int n3 = -1 + this.n;
            arrn[n3] = 1 + arrn[n3];
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected a string but was ");
        stringBuilder.append((Object)this.f());
        stringBuilder.append(this.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean i() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 5) {
            this.a = 0;
            int[] arrn = this.p;
            int n3 = this.n - 1;
            arrn[n3] = 1 + arrn[n3];
            return true;
        }
        if (n2 == 6) {
            this.a = 0;
            int[] arrn = this.p;
            int n4 = this.n - 1;
            arrn[n4] = 1 + arrn[n4];
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected a boolean but was ");
        stringBuilder.append((Object)this.f());
        stringBuilder.append(this.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void j() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 7) {
            this.a = 0;
            int[] arrn = this.p;
            int n3 = -1 + this.n;
            arrn[n3] = 1 + arrn[n3];
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected null but was ");
        stringBuilder.append((Object)this.f());
        stringBuilder.append(this.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public double k() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 15) {
            this.a = 0;
            int[] arrn = this.p;
            int n3 = -1 + this.n;
            arrn[n3] = 1 + arrn[n3];
            return this.j;
        }
        if (n2 == 16) {
            this.l = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else if (n2 != 8 && n2 != 9) {
            if (n2 == 10) {
                this.l = this.u();
            } else if (n2 != 11) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected a double but was ");
                stringBuilder.append((Object)this.f());
                stringBuilder.append(this.s());
                throw new IllegalStateException(stringBuilder.toString());
            }
        } else {
            char c2 = n2 == 8 ? (char)'\'' : '\"';
            this.l = this.b(c2);
        }
        this.a = 11;
        double d2 = Double.parseDouble((String)this.l);
        if (!this.d && (Double.isNaN((double)d2) || Double.isInfinite((double)d2))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(d2);
            stringBuilder.append(this.s());
            throw new d(stringBuilder.toString());
        }
        this.l = null;
        this.a = 0;
        int[] arrn = this.p;
        int n4 = -1 + this.n;
        arrn[n4] = 1 + arrn[n4];
        return d2;
    }

    /*
     * Exception decompiling
     */
    public long l() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl136.1 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public int m() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl170.1 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public void n() {
        int n2 = 0;
        do {
            int n3;
            if ((n3 = this.a) == 0) {
                n3 = this.r();
            }
            if (n3 == 3) {
                this.a(1);
                ++n2;
            } else if (n3 == 1) {
                this.a(3);
                ++n2;
            } else if (n3 == 4) {
                --this.n;
                --n2;
            } else if (n3 == 2) {
                --this.n;
                --n2;
            } else if (n3 != 14 && n3 != 10) {
                if (n3 != 8 && n3 != 12) {
                    if (n3 != 9 && n3 != 13) {
                        if (n3 == 16) {
                            this.f += this.k;
                        }
                    } else {
                        this.c('\"');
                    }
                } else {
                    this.c('\'');
                }
            } else {
                this.v();
            }
            this.a = 0;
        } while (n2 != 0);
        int[] arrn = this.p;
        int n4 = this.n;
        int n5 = n4 - 1;
        arrn[n5] = 1 + arrn[n5];
        this.o[n4 - 1] = "null";
    }

    public String p() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        int n2 = this.n;
        block4 : for (int i2 = 0; i2 < n2; ++i2) {
            switch (this.m[i2]) {
                default: {
                    continue block4;
                }
                case 3: 
                case 4: 
                case 5: {
                    stringBuilder.append('.');
                    String[] arrstring = this.o;
                    if (arrstring[i2] == null) continue block4;
                    stringBuilder.append(arrstring[i2]);
                    continue block4;
                }
                case 1: 
                case 2: {
                    stringBuilder.append('[');
                    stringBuilder.append(this.p[i2]);
                    stringBuilder.append(']');
                }
            }
        }
        return stringBuilder.toString();
    }

    public final boolean q() {
        return this.d;
    }

    int r() {
        int n2;
        int n3;
        int n4;
        block32 : {
            block37 : {
                block30 : {
                    block36 : {
                        block35 : {
                            block33 : {
                                block34 : {
                                    char[] arrc;
                                    int n5;
                                    block31 : {
                                        block29 : {
                                            int[] arrn = this.m;
                                            int n6 = this.n;
                                            n4 = arrn[n6 - 1];
                                            if (n4 != 1) break block29;
                                            arrn[n6 - 1] = 2;
                                            break block30;
                                        }
                                        if (n4 != 2) break block31;
                                        int n7 = this.b(true);
                                        if (n7 != 44) {
                                            if (n7 != 59) {
                                                if (n7 == 93) {
                                                    this.a = 4;
                                                    return 4;
                                                }
                                                throw this.b("Unterminated array");
                                            }
                                            this.w();
                                        }
                                        break block30;
                                    }
                                    if (n4 == 3 || n4 == 5) break block32;
                                    if (n4 != 4) break block33;
                                    arrn[n6 - 1] = 5;
                                    int n8 = this.b(true);
                                    if (n8 == 58) break block30;
                                    if (n8 != 61) break block34;
                                    this.w();
                                    if ((this.f < this.g || this.b(1)) && (arrc = this.e)[n5 = this.f] == '>') {
                                        this.f = n5 + 1;
                                    }
                                    break block30;
                                }
                                throw this.b("Expected ':'");
                            }
                            if (n4 != 6) break block35;
                            if (this.d) {
                                this.z();
                            }
                            this.m[this.n - 1] = 7;
                            break block30;
                        }
                        if (n4 != 7) break block36;
                        if (this.b(false) == -1) {
                            this.a = 17;
                            return 17;
                        }
                        this.w();
                        --this.f;
                        break block30;
                    }
                    if (n4 == 8) break block37;
                }
                int n9 = this.b(true);
                if (n9 != 34) {
                    if (n9 != 39) {
                        if (n9 != 44 && n9 != 59) {
                            if (n9 != 91) {
                                if (n9 != 93) {
                                    if (n9 != 123) {
                                        --this.f;
                                        int n10 = this.o();
                                        if (n10 != 0) {
                                            return n10;
                                        }
                                        int n11 = this.t();
                                        if (n11 != 0) {
                                            return n11;
                                        }
                                        if (this.a(this.e[this.f])) {
                                            this.w();
                                            this.a = 10;
                                            return 10;
                                        }
                                        throw this.b("Expected value");
                                    }
                                    this.a = 1;
                                    return 1;
                                }
                                if (n4 == 1) {
                                    this.a = 4;
                                    return 4;
                                }
                            } else {
                                this.a = 3;
                                return 3;
                            }
                        }
                        if (n4 != 1 && n4 != 2) {
                            throw this.b("Unexpected value");
                        }
                        this.w();
                        --this.f;
                        this.a = 7;
                        return 7;
                    }
                    this.w();
                    this.a = 8;
                    return 8;
                }
                this.a = 9;
                return 9;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        this.m[this.n - 1] = 4;
        if (n4 == 5 && (n3 = this.b(true)) != 44) {
            if (n3 != 59) {
                if (n3 == 125) {
                    this.a = 2;
                    return 2;
                }
                throw this.b("Unterminated object");
            }
            this.w();
        }
        if ((n2 = this.b(true)) != 34) {
            if (n2 != 39) {
                if (n2 != 125) {
                    this.w();
                    --this.f;
                    if (this.a((char)n2)) {
                        this.a = 14;
                        return 14;
                    }
                    throw this.b("Expected name");
                }
                if (n4 != 5) {
                    this.a = 2;
                    return 2;
                }
                throw this.b("Expected name");
            }
            this.w();
            this.a = 12;
            return 12;
        }
        this.a = 13;
        return 13;
    }

    String s() {
        int n2 = 1 + this.h;
        int n3 = 1 + (this.f - this.i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at line ");
        stringBuilder.append(n2);
        stringBuilder.append(" column ");
        stringBuilder.append(n3);
        stringBuilder.append(" path ");
        stringBuilder.append(this.p());
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(this.s());
        return stringBuilder.toString();
    }
}

