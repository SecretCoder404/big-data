/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.b.p
 *  com.google.b.z
 *  java.io.InputStream
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 */
package com.google.b;

import com.google.b.aa;
import com.google.b.e;
import com.google.b.i;
import com.google.b.l;
import com.google.b.m;
import com.google.b.p;
import com.google.b.s;
import com.google.b.z;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

public final class f {
    private final byte[] a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private final InputStream f;
    private int g;
    private boolean h = false;
    private int i;
    private int j = Integer.MAX_VALUE;
    private int k;
    private int l = 100;
    private int m = 67108864;
    private a n = null;

    private f(InputStream inputStream, int n2) {
        this.a = new byte[n2];
        this.e = 0;
        this.i = 0;
        this.f = inputStream;
        this.b = false;
    }

    private f(byte[] arrby, int n2, int n3, boolean bl2) {
        this.a = arrby;
        this.c = n3 + n2;
        this.e = n2;
        this.i = -n2;
        this.f = null;
        this.b = bl2;
    }

    public static f a(InputStream inputStream) {
        return new f(inputStream, 4096);
    }

    public static f a(byte[] arrby) {
        return f.a(arrby, 0, arrby.length);
    }

    public static f a(byte[] arrby, int n2, int n3) {
        return f.a(arrby, n2, n3, false);
    }

    static f a(byte[] arrby, int n2, int n3, boolean bl2) {
        f f2 = new f(arrby, n2, n3, bl2);
        try {
            f2.c(n3);
            return f2;
        }
        catch (m m2) {
            throw new IllegalArgumentException((Throwable)((Object)m2));
        }
    }

    private void f(int n2) {
        if (this.g(n2)) {
            return;
        }
        throw m.a();
    }

    private boolean g(int n2) {
        int n3 = this.e;
        if (n3 + n2 > this.c) {
            if (n2 + (n3 + this.i) > this.j) {
                return false;
            }
            a a2 = this.n;
            if (a2 != null) {
                a2.a();
            }
            if (this.f != null) {
                int n4;
                byte[] arrby;
                int n5;
                InputStream inputStream;
                int n6 = this.e;
                if (n6 > 0) {
                    int n7 = this.c;
                    if (n7 > n6) {
                        byte[] arrby2 = this.a;
                        System.arraycopy((Object)arrby2, (int)n6, (Object)arrby2, (int)0, (int)(n7 - n6));
                    }
                    this.i = n6 + this.i;
                    this.c -= n6;
                    this.e = 0;
                }
                if ((n4 = (inputStream = this.f).read(arrby = this.a, n5 = this.c, arrby.length - n5)) != 0 && n4 >= -1 && n4 <= this.a.length) {
                    if (n4 > 0) {
                        this.c = n4 + this.c;
                        if (n2 + this.i - this.m <= 0) {
                            this.u();
                            if (this.c >= n2) {
                                return true;
                            }
                            return this.g(n2);
                        }
                        throw m.h();
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("InputStream#read(byte[]) returned invalid result: ");
                    stringBuilder.append(n4);
                    stringBuilder.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("refillBuffer() called when ");
        stringBuilder.append(n2);
        stringBuilder.append(" bytes were already available in buffer");
        throw new IllegalStateException(stringBuilder.toString());
    }

    private byte[] h(int n2) {
        if (n2 <= 0) {
            if (n2 == 0) {
                return l.c;
            }
            throw m.b();
        }
        int n3 = this.i;
        int n4 = this.e;
        int n5 = n2 + (n3 + n4);
        if (n5 <= this.m) {
            int n6 = this.j;
            if (n5 <= n6) {
                InputStream inputStream = this.f;
                if (inputStream != null) {
                    int n7;
                    int n8;
                    int n9 = this.c;
                    this.i = n3 + n9;
                    this.e = 0;
                    this.c = 0;
                    int n10 = n2 - n8;
                    if (n10 >= 4096 && n10 > inputStream.available()) {
                        ArrayList arrayList = new ArrayList();
                        while (n10 > 0) {
                            int n11;
                            byte[] arrby = new byte[Math.min((int)n10, (int)4096)];
                            for (int i2 = 0; i2 < arrby.length; i2 += n11) {
                                n11 = this.f.read(arrby, i2, arrby.length - i2);
                                if (n11 != -1) {
                                    this.i = n11 + this.i;
                                    continue;
                                }
                                throw m.a();
                            }
                            n10 -= arrby.length;
                            arrayList.add((Object)arrby);
                        }
                        byte[] arrby = new byte[n2];
                        System.arraycopy((Object)this.a, (int)n4, (Object)arrby, (int)0, (int)n8);
                        for (byte[] arrby2 : arrayList) {
                            System.arraycopy((Object)arrby2, (int)0, (Object)arrby, (int)n8, (int)arrby2.length);
                            n8 += arrby2.length;
                        }
                        return arrby;
                    }
                    byte[] arrby = new byte[n2];
                    System.arraycopy((Object)this.a, (int)n4, (Object)arrby, (int)0, (int)n8);
                    for (n8 = n9 - n4; n8 < arrby.length; n8 += n7) {
                        n7 = this.f.read(arrby, n8, n2 - n8);
                        if (n7 != -1) {
                            this.i = n7 + this.i;
                            continue;
                        }
                        throw m.a();
                    }
                    return arrby;
                }
                throw m.a();
            }
            this.e(n6 - n3 - n4);
            throw m.a();
        }
        throw m.h();
    }

    private void i(int n2) {
        if (n2 >= 0) {
            int n3 = this.i;
            int n4 = this.e;
            int n5 = n2 + (n3 + n4);
            int n6 = this.j;
            if (n5 <= n6) {
                int n7;
                int n8;
                int n9 = this.c;
                int n10 = n9 - n4;
                this.e = n9;
                this.f(1);
                while ((n8 = n2 - n10) > (n7 = this.c)) {
                    n10 += n7;
                    this.e = n7;
                    this.f(1);
                }
                this.e = n8;
                return;
            }
            this.e(n6 - n3 - n4);
            throw m.a();
        }
        throw m.b();
    }

    private void s() {
        int n2 = this.c;
        int n3 = this.e;
        if (n2 - n3 >= 10) {
            byte[] arrby = this.a;
            for (int i2 = 0; i2 < 10; ++i2) {
                int n4 = n3 + 1;
                if (arrby[n3] >= 0) {
                    this.e = n4;
                    return;
                }
                n3 = n4;
            }
        }
        this.t();
    }

    private void t() {
        for (int i2 = 0; i2 < 10; ++i2) {
            if (this.r() < 0) continue;
            return;
        }
        throw m.c();
    }

    private void u() {
        this.c += this.d;
        int n2 = this.i;
        int n3 = this.c;
        int n4 = n2 + n3;
        int n5 = this.j;
        if (n4 > n5) {
            this.d = n4 - n5;
            this.c = n3 - this.d;
            return;
        }
        this.d = 0;
    }

    public int a() {
        if (this.q()) {
            this.g = 0;
            return 0;
        }
        this.g = this.l();
        if (aa.b(this.g) != 0) {
            return this.g;
        }
        throw m.d();
    }

    public <T extends p> T a(s<T> s2, i i2) {
        int n2 = this.l();
        if (this.k < this.l) {
            int n3 = this.c(n2);
            this.k = 1 + this.k;
            p p2 = (p)s2.b(this, i2);
            this.a(0);
            this.k = -1 + this.k;
            this.d(n3);
            return (T)p2;
        }
        throw m.g();
    }

    public void a(int n2) {
        if (this.g == n2) {
            return;
        }
        throw m.e();
    }

    public void b() {
        int n2;
        while ((n2 = this.a()) != 0 && this.b(n2)) {
        }
    }

    public boolean b(int n2) {
        switch (aa.a(n2)) {
            default: {
                throw m.f();
            }
            case 5: {
                this.e(4);
                return true;
            }
            case 4: {
                return false;
            }
            case 3: {
                this.b();
                this.a(aa.a(aa.b(n2), 4));
                return true;
            }
            case 2: {
                this.e(this.l());
                return true;
            }
            case 1: {
                this.e(8);
                return true;
            }
            case 0: 
        }
        this.s();
        return true;
    }

    public int c(int n2) {
        if (n2 >= 0) {
            int n3 = n2 + (this.i + this.e);
            int n4 = this.j;
            if (n3 <= n4) {
                this.j = n3;
                this.u();
                return n4;
            }
            throw m.a();
        }
        throw m.b();
    }

    public long c() {
        return this.m();
    }

    public int d() {
        return this.l();
    }

    public void d(int n2) {
        this.j = n2;
        this.u();
    }

    public long e() {
        return this.p();
    }

    public void e(int n2) {
        int n3 = this.c;
        int n4 = this.e;
        if (n2 <= n3 - n4 && n2 >= 0) {
            this.e = n4 + n2;
            return;
        }
        this.i(n2);
    }

    public int f() {
        return this.o();
    }

    public boolean g() {
        return this.m() != 0L;
    }

    public String h() {
        int n2;
        int n3;
        int n4 = this.l();
        if (n4 <= (n2 = this.c) - (n3 = this.e) && n4 > 0) {
            String string = new String(this.a, n3, n4, l.a);
            this.e = n4 + this.e;
            return string;
        }
        if (n4 == 0) {
            return "";
        }
        if (n4 <= this.c) {
            this.f(n4);
            String string = new String(this.a, this.e, n4, l.a);
            this.e = n4 + this.e;
            return string;
        }
        return new String(this.h(n4), l.a);
    }

    public String i() {
        byte[] arrby;
        int n2 = this.l();
        int n3 = this.e;
        int n4 = this.c - n3;
        int n5 = 0;
        if (n2 <= n4 && n2 > 0) {
            arrby = this.a;
            this.e = n3 + n2;
            n5 = n3;
        } else {
            if (n2 == 0) {
                return "";
            }
            if (n2 <= this.c) {
                this.f(n2);
                arrby = this.a;
                this.e = n2 + 0;
                n5 = 0;
            } else {
                arrby = this.h(n2);
            }
        }
        if (z.a((byte[])arrby, (int)n5, (int)(n5 + n2))) {
            return new String(arrby, n5, n2, l.a);
        }
        throw m.i();
    }

    public e j() {
        int n2;
        int n3;
        int n4 = this.l();
        if (n4 <= (n2 = this.c) - (n3 = this.e) && n4 > 0) {
            e e2 = this.b && this.h ? e.b(this.a, n3, n4) : e.a(this.a, this.e, n4);
            this.e = n4 + this.e;
            return e2;
        }
        if (n4 == 0) {
            return e.a;
        }
        return e.a(this.h(n4));
    }

    public int k() {
        return this.l();
    }

    public int l() {
        int n2;
        int n3;
        block5 : {
            int n4;
            block8 : {
                block3 : {
                    byte[] arrby;
                    int n5;
                    block7 : {
                        int n6;
                        int n7;
                        block6 : {
                            int n8;
                            block4 : {
                                int n9 = this.c;
                                int n10 = this.e;
                                if (n9 == n10) break block3;
                                arrby = this.a;
                                int n11 = n10 + 1;
                                byte by2 = arrby[n10];
                                if (by2 >= 0) {
                                    this.e = n11;
                                    return by2;
                                }
                                if (n9 - n11 < 9) break block3;
                                n3 = n11 + 1;
                                n8 = by2 ^ arrby[n11] << 7;
                                if (n8 >= 0) break block4;
                                n2 = n8 ^ -128;
                                break block5;
                            }
                            n6 = n3 + 1;
                            n7 = n8 ^ arrby[n3] << 14;
                            if (n7 < 0) break block6;
                            n2 = n7 ^ 16256;
                            n3 = n6;
                            break block5;
                        }
                        n3 = n6 + 1;
                        n5 = n7 ^ arrby[n6] << 21;
                        if (n5 >= 0) break block7;
                        n2 = n5 ^ -2080896;
                        break block5;
                    }
                    n4 = n3 + 1;
                    byte by3 = arrby[n3];
                    n2 = 266354560 ^ (n5 ^ by3 << 28);
                    if (by3 >= 0) break block8;
                    n3 = n4 + 1;
                    if (arrby[n4] >= 0) break block5;
                    n4 = n3 + 1;
                    if (arrby[n3] >= 0) break block8;
                    n3 = n4 + 1;
                    if (arrby[n4] >= 0) break block5;
                    n4 = n3 + 1;
                    if (arrby[n3] >= 0) break block8;
                    n3 = n4 + 1;
                    if (arrby[n4] >= 0) break block5;
                }
                return (int)this.n();
                break block5;
            }
            n3 = n4;
        }
        this.e = n3;
        return n2;
    }

    public long m() {
        long l2;
        int n2;
        block5 : {
            int n3;
            block12 : {
                block3 : {
                    long l3;
                    byte[] arrby;
                    block11 : {
                        long l4;
                        int n4;
                        block10 : {
                            long l5;
                            block9 : {
                                int n5;
                                long l6;
                                block8 : {
                                    int n6;
                                    block7 : {
                                        int n7;
                                        int n8;
                                        block6 : {
                                            int n9;
                                            block4 : {
                                                int n10 = this.c;
                                                int n11 = this.e;
                                                if (n10 == n11) break block3;
                                                arrby = this.a;
                                                int n12 = n11 + 1;
                                                byte by2 = arrby[n11];
                                                if (by2 >= 0) {
                                                    this.e = n12;
                                                    return by2;
                                                }
                                                if (n10 - n12 < 9) break block3;
                                                n2 = n12 + 1;
                                                n9 = by2 ^ arrby[n12] << 7;
                                                if (n9 >= 0) break block4;
                                                l2 = n9 ^ -128;
                                                break block5;
                                            }
                                            n7 = n2 + 1;
                                            n8 = n9 ^ arrby[n2] << 14;
                                            if (n8 < 0) break block6;
                                            long l7 = n8 ^ 16256;
                                            n2 = n7;
                                            l2 = l7;
                                            break block5;
                                        }
                                        n2 = n7 + 1;
                                        n6 = n8 ^ arrby[n7] << 21;
                                        if (n6 >= 0) break block7;
                                        l2 = n6 ^ -2080896;
                                        break block5;
                                    }
                                    long l8 = n6;
                                    n5 = n2 + 1;
                                    l6 = l8 ^ (long)arrby[n2] << 28;
                                    if (l6 < 0L) break block8;
                                    l2 = 266354560L ^ l6;
                                    n2 = n5;
                                    break block5;
                                }
                                n2 = n5 + 1;
                                l5 = l6 ^ (long)arrby[n5] << 35;
                                if (l5 >= 0L) break block9;
                                l2 = l5 ^ -34093383808L;
                                break block5;
                            }
                            n4 = n2 + 1;
                            l4 = l5 ^ (long)arrby[n2] << 42;
                            if (l4 < 0L) break block10;
                            l2 = 4363953127296L ^ l4;
                            n2 = n4;
                            break block5;
                        }
                        n2 = n4 + 1;
                        l3 = l4 ^ (long)arrby[n4] << 49;
                        if (l3 >= 0L) break block11;
                        l2 = l3 ^ -558586000294016L;
                        break block5;
                    }
                    n3 = n2 + 1;
                    l2 = 71499008037633920L ^ (l3 ^ (long)arrby[n2] << 56);
                    if (l2 >= 0L) break block12;
                    n2 = n3 + 1;
                    if ((long)arrby[n3] >= 0L) break block5;
                }
                return this.n();
            }
            n2 = n3;
        }
        this.e = n2;
        return l2;
    }

    long n() {
        long l2 = 0L;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte by2 = this.r();
            l2 |= (long)(by2 & 127) << i2;
            if ((by2 & 128) != 0) continue;
            return l2;
        }
        throw m.c();
    }

    public int o() {
        int n2 = this.e;
        if (this.c - n2 < 4) {
            this.f(4);
            n2 = this.e;
        }
        byte[] arrby = this.a;
        this.e = n2 + 4;
        return 255 & arrby[n2] | (255 & arrby[n2 + 1]) << 8 | (255 & arrby[n2 + 2]) << 16 | (255 & arrby[n2 + 3]) << 24;
    }

    public long p() {
        int n2 = this.e;
        if (this.c - n2 < 8) {
            this.f(8);
            n2 = this.e;
        }
        byte[] arrby = this.a;
        this.e = n2 + 8;
        return 255L & (long)arrby[n2] | (255L & (long)arrby[n2 + 1]) << 8 | (255L & (long)arrby[n2 + 2]) << 16 | (255L & (long)arrby[n2 + 3]) << 24 | (255L & (long)arrby[n2 + 4]) << 32 | (255L & (long)arrby[n2 + 5]) << 40 | (255L & (long)arrby[n2 + 6]) << 48 | (255L & (long)arrby[n2 + 7]) << 56;
    }

    public boolean q() {
        return this.e == this.c && !this.g(1);
    }

    public byte r() {
        if (this.e == this.c) {
            this.f(1);
        }
        byte[] arrby = this.a;
        int n2 = this.e;
        this.e = n2 + 1;
        return arrby[n2];
    }

    private static interface a {
        public void a();
    }

}

