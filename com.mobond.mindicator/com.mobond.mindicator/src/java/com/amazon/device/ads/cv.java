/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cy
 *  java.lang.Enum
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.cw;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.ez;
import com.amazon.device.ads.w;

class cv {
    private static final String a = "cv";
    private static cv b = new cv();
    private final cy c = new cz().a(a);
    private cw d = new cw();

    cv() {
    }

    public static cv a() {
        return b;
    }

    private void a(final ez ez2) {
        ej.a(new Runnable(){

            public void run() {
                ez2.d(true);
                try {
                    ez2.c();
                    return;
                }
                catch (ez.c c2) {
                    switch (2.a[c2.a().ordinal()]) {
                        default: {
                            return;
                        }
                        case 3: {
                            cy cy2 = cv.this.c();
                            Object[] arrobject = new Object[]{c2.getMessage()};
                            cy2.e("Unable to submit metrics for ad due to a Malformed Pixel URL, msg: %s", arrobject);
                        }
                        case 4: {
                            cy cy3 = cv.this.c();
                            Object[] arrobject = new Object[]{c2.getMessage()};
                            cy3.e("Unable to submit metrics for ad because of unsupported character encoding, msg: %s", arrobject);
                            return;
                        }
                        case 2: {
                            cy cy4 = cv.this.c();
                            Object[] arrobject = new Object[]{c2.getMessage()};
                            cy4.e("Unable to submit metrics for ad due to Network Failure, msg: %s", arrobject);
                            return;
                        }
                        case 1: 
                    }
                    cy cy5 = cv.this.c();
                    Object[] arrobject = new Object[]{c2.getMessage()};
                    cy5.e("Unable to submit metrics for ad due to an Invalid Client Protocol, msg: %s", arrobject);
                    return;
                }
            }
        });
    }

    private cy c() {
        return this.c;
    }

    public void a(b b2) {
        this.c().d("METRIC Submit and Reset");
        w w2 = new w(b2);
        if (w2.b()) {
            cw cw2 = this.d;
            this.d = new cw();
            w2.a(cw2);
            this.a(w2.a());
            return;
        }
        b2.f();
    }

    public cw b() {
        return this.d;
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a A;
        public static final /* enum */ a B;
        public static final /* enum */ a C;
        public static final /* enum */ a D;
        public static final /* enum */ a E;
        public static final /* enum */ a F;
        public static final /* enum */ a G;
        public static final /* enum */ a H;
        public static final /* enum */ a I;
        public static final /* enum */ a J;
        public static final /* enum */ a K;
        public static final /* enum */ a L;
        public static final /* enum */ a M;
        public static final /* enum */ a N;
        public static final /* enum */ a O;
        public static final /* enum */ a P;
        public static final /* enum */ a Q;
        public static final /* enum */ a R;
        public static final /* enum */ a S;
        public static final /* enum */ a T;
        public static final /* enum */ a U;
        public static final /* enum */ a V;
        public static final /* enum */ a W;
        public static final /* enum */ a X;
        public static final /* enum */ a Y;
        public static final /* enum */ a Z;
        public static final /* enum */ a a;
        public static final /* enum */ a aa;
        public static final /* enum */ a ab;
        public static final /* enum */ a ac;
        public static final /* enum */ a ad;
        public static final /* enum */ a ae;
        public static final /* enum */ a af;
        public static final /* enum */ a ag;
        public static final /* enum */ a ah;
        public static final /* enum */ a ai;
        public static final /* enum */ a aj;
        public static final /* enum */ a ak;
        public static final /* enum */ a al;
        private static final /* synthetic */ a[] ao;
        public static final /* enum */ a b;
        public static final /* enum */ a c;
        public static final /* enum */ a d;
        public static final /* enum */ a e;
        public static final /* enum */ a f;
        public static final /* enum */ a g;
        public static final /* enum */ a h;
        public static final /* enum */ a i;
        public static final /* enum */ a j;
        public static final /* enum */ a k;
        public static final /* enum */ a l;
        public static final /* enum */ a m;
        public static final /* enum */ a n;
        public static final /* enum */ a o;
        public static final /* enum */ a p;
        public static final /* enum */ a q;
        public static final /* enum */ a r;
        public static final /* enum */ a s;
        public static final /* enum */ a t;
        public static final /* enum */ a u;
        public static final /* enum */ a v;
        public static final /* enum */ a w;
        public static final /* enum */ a x;
        public static final /* enum */ a y;
        public static final /* enum */ a z;
        private final String am;
        private final boolean an;

        static {
            a = new a("tl", true);
            b = new a("tsl", true);
            c = new a("tfl", true);
            d = new a("llfsl", true);
            e = new a("lfsul");
            f = new a("lfsasl");
            g = new a("laefel");
            h = new a("lffsul");
            i = new a("lffsrsl", true);
            j = new a("lffsfl", true);
            k = new a("lcaul");
            l = new a("lacl");
            m = new a("lael");
            n = new a("af");
            o = new a("alast");
            p = new a("lsa");
            q = new a("sd", true);
            r = new a("ali");
            s = new a("al");
            t = new a("lf");
            u = new a("lfat");
            v = new a("lfpt", true);
            w = new a("lfnf");
            x = new a("lfnt");
            y = new a("lfie");
            z = new a("id");
            A = new a("rf", true);
            B = new a("rl", true);
            C = new a("rlf", true);
            D = new a("nrtf");
            E = new a("nrtr");
            F = new a("aas");
            G = new a("pvm");
            H = new a("ahz");
            I = new a("vs");
            J = new a("rs", true);
            K = new a("fuwi");
            L = new a("fnlp");
            M = new a("flnr");
            N = new a("faas");
            O = new a("sid");
            P = new a("srl");
            Q = new a("sul");
            R = new a("srel");
            S = new a("cde");
            T = new a("cdt");
            U = new a("cpe");
            V = new a("acl");
            W = new a("acf");
            X = new a("crh");
            Y = new a("tls");
            Z = new a("wifi");
            aa = new a("car");
            ab = new a("ct");
            ac = new a("i");
            ad = new a("iaaf");
            ae = new a("rrcfc", true);
            af = new a("eac", true);
            ag = new a("rarfc", true);
            ah = new a("rsofc", true);
            ai = new a("aebs", true);
            aj = new a("cjdl");
            ak = new a("cjdf");
            al = new a("ailioob");
            a[] arra = new a[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, aa, ab, ac, ad, ae, af, ag, ah, ai, aj, ak, al};
            ao = arra;
        }

        private a(String string2) {
            this(string2, false);
        }

        private a(String string2, boolean bl2) {
            this.am = string2;
            this.an = bl2;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])ao.clone();
        }

        public String a() {
            return this.am;
        }

        public boolean b() {
            return this.an;
        }
    }

    static interface b {
        public cw e();

        public void f();

        public String g();
    }

}

