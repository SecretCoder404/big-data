/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.amazon.device.ads.cf
 *  com.amazon.device.ads.cy
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.util.HashMap
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.amazon.device.ads;

import com.amazon.device.ads.bn;
import com.amazon.device.ads.cf;
import com.amazon.device.ads.cv;
import com.amazon.device.ads.cw;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.dr;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.eh;
import com.amazon.device.ads.ej;
import com.amazon.device.ads.fc;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

abstract class ez {
    private static final String n = "ez";
    String a = null;
    String b = null;
    String c = null;
    String d = null;
    protected final HashMap<String, String> e = new HashMap();
    protected b f = new b();
    protected HashMap<String, String> g = new HashMap();
    boolean h = false;
    boolean i = false;
    protected boolean j = false;
    boolean k = false;
    protected boolean l = ee.a().a("tlsEnabled", false);
    protected cv.a m;
    private String o = null;
    private String p = null;
    private String q = null;
    private String r = null;
    private int s = -1;
    private a t = a.a;
    private int u = 20000;
    private cw v;
    private boolean w = true;
    private String x = n;
    private final cy y = new cz().a(this.x);

    ez() {
    }

    private String p() {
        return this.x;
    }

    protected abstract g a(URL var1);

    public String a(String string, String string2) {
        return this.f.b(string, string2);
    }

    protected abstract void a();

    public void a(int n2) {
        this.u = n2;
    }

    public void a(cv.a a2) {
        this.m = a2;
    }

    public void a(cw cw2) {
        this.v = cw2;
    }

    public void a(a a2) {
        if (a2 != null) {
            this.t = a2;
            return;
        }
        throw new IllegalArgumentException("The httpMethod must not be null.");
    }

    public void a(b b2) {
        this.f = b2;
    }

    protected void a(String string) {
        if (this.j) {
            cy cy2 = this.y;
            Object[] arrobject = new Object[]{this.d(), string};
            cy2.c("%s %s", arrobject);
        }
    }

    protected void a(StringBuilder stringBuilder) {
        this.f.a(stringBuilder);
    }

    public void a(boolean bl2) {
        this.j = bl2;
    }

    protected abstract String b();

    protected void b(cv.a a2) {
        cw cw2;
        if (a2 != null && (cw2 = this.v) != null) {
            cw2.b(a2);
        }
    }

    public void b(String string) {
        if (!eh.b(string)) {
            this.p = string;
            this.q = string;
            return;
        }
        throw new IllegalArgumentException("The host must not be null.");
    }

    public void b(String string, String string2) {
        if (!eh.b(string)) {
            if (string2 == null) {
                this.g.remove((Object)string);
                return;
            }
            this.g.put((Object)string, (Object)string2);
            return;
        }
        throw new IllegalArgumentException("The name must not be null or empty string.");
    }

    public void b(boolean bl2) {
        this.h = bl2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public g c() {
        Throwable throwable2222;
        URL uRL;
        if (ej.b()) {
            this.y.f("The network request should not be performed on the main thread.");
        }
        this.m();
        String string = this.o();
        try {
            uRL = this.i(string);
        }
        catch (MalformedURLException malformedURLException) {
            cy cy2 = this.y;
            Object[] arrobject = new Object[]{malformedURLException.getMessage()};
            cy2.e("Problem with URI syntax: %s", arrobject);
            f f2 = f.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not construct URL from String ");
            stringBuilder.append(string);
            throw new c(f2, stringBuilder.toString(), malformedURLException);
        }
        this.b(this.m);
        g g2 = this.a(uRL);
        this.c(this.m);
        if (!this.i) return g2;
        cy cy3 = this.y;
        Object[] arrobject = new Object[]{g2.b(), g2.d()};
        cy3.c("Response: %s %s", arrobject);
        return g2;
        {
            catch (Throwable throwable2222) {
            }
            catch (c c2) {}
            {
                throw c2;
            }
        }
        this.c(this.m);
        throw throwable2222;
    }

    protected void c(cv.a a2) {
        cw cw2;
        if (a2 != null && (cw2 = this.v) != null) {
            cw2.c(a2);
        }
    }

    public void c(String string) {
        if (string.charAt(0) != '/') {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('/');
            stringBuilder.append(string);
            this.r = stringBuilder.toString();
            return;
        }
        this.r = string;
    }

    public void c(String string, String string2) {
        if (!eh.b(string)) {
            this.e.put((Object)string, (Object)string2);
            return;
        }
        throw new IllegalArgumentException("The name must not be null or empty string.");
    }

    public void c(boolean bl2) {
        this.i = bl2;
    }

    public a d() {
        return this.t;
    }

    public void d(String string) {
        if (string != null && this.h() && string.startsWith("http:")) {
            string = string.replaceFirst("http", "https");
        }
        this.o = string;
    }

    public void d(boolean bl2) {
        this.a(bl2);
        this.b(bl2);
        this.c(bl2);
    }

    public String e() {
        if (this.h()) {
            return this.p;
        }
        return this.q;
    }

    public void e(String string) {
        this.a = string;
    }

    public void e(boolean bl2) {
        this.l = bl2;
    }

    public int f() {
        return this.s;
    }

    public void f(String string) {
        this.c = string;
    }

    public void f(boolean bl2) {
        this.w = bl2;
    }

    public String g() {
        return this.r;
    }

    public void g(String string) {
        this.f.a(string);
    }

    public void h(String string) {
        if (string == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n);
            stringBuilder.append(" ");
            stringBuilder.append(this.b());
            this.x = stringBuilder.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(n);
            stringBuilder.append(" ");
            stringBuilder.append(this.b());
            this.x = stringBuilder.toString();
        }
        this.y.a(this.x);
    }

    public boolean h() {
        return bn.a().a("debug.useSecure", this.l);
    }

    public String i() {
        return this.a;
    }

    protected URL i(String string) {
        return new URL(string);
    }

    public String j() {
        if (this.i() != null) {
            return this.i();
        }
        if (this.g.isEmpty()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : this.g.entrySet()) {
            stringBuilder.append((String)entry.getKey());
            stringBuilder.append('=');
            stringBuilder.append((String)entry.getValue());
            stringBuilder.append(";\n");
        }
        return stringBuilder.toString();
    }

    public int k() {
        return this.u;
    }

    protected cy l() {
        return this.y;
    }

    protected void m() {
        String string;
        if (this.b != null) {
            this.c("Accept", this.c);
        }
        if ((string = this.c) != null) {
            if (this.d != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("; charset=");
                stringBuilder.append(this.d);
                string = stringBuilder.toString();
            }
            this.c("Content-Type", string);
        }
    }

    protected String n() {
        if (this.h()) {
            return "https";
        }
        return "http";
    }

    protected String o() {
        String string = this.o;
        if (string != null) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(this.n());
        stringBuilder.append("://");
        stringBuilder.append(this.e());
        if (this.f() != -1) {
            stringBuilder.append(":");
            stringBuilder.append(this.f());
        }
        stringBuilder.append(this.g());
        this.a(stringBuilder);
        return stringBuilder.toString();
    }

    public String toString() {
        return this.o();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("GET");
        public static final /* enum */ a b = new a("POST");
        private static final /* synthetic */ a[] d;
        private final String c;

        static {
            a[] arra = new a[]{a, b};
            d = arra;
        }

        private a(String string2) {
            this.c = string2;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])d.clone();
        }

        public String toString() {
            return this.c;
        }
    }

    static class b {
        private final HashMap<String, String> a = new HashMap();
        private String b;

        b() {
        }

        int a() {
            return this.a.size();
        }

        void a(String string) {
            this.b = string;
        }

        void a(String string, String string2) {
            if (!eh.b(string)) {
                if (string2 == null) {
                    this.a.remove((Object)string);
                    return;
                }
                this.a.put((Object)string, (Object)string2);
                return;
            }
            throw new IllegalArgumentException("The name must not be null or empty string.");
        }

        void a(String string, String string2, boolean bl2) {
            if (bl2) {
                this.a(string, string2);
            }
        }

        void a(StringBuilder stringBuilder) {
            if (this.a() == 0 && eh.a(this.b)) {
                return;
            }
            stringBuilder.append("?");
            boolean bl2 = true;
            for (Map.Entry entry : this.a.entrySet()) {
                if (bl2) {
                    bl2 = false;
                } else {
                    stringBuilder.append("&");
                }
                stringBuilder.append((String)entry.getKey());
                stringBuilder.append("=");
                stringBuilder.append((String)entry.getValue());
            }
            String string = this.b;
            if (string != null && !string.equals((Object)"")) {
                if (this.a() != 0) {
                    stringBuilder.append("&");
                }
                stringBuilder.append(this.b);
            }
        }

        String b(String string, String string2) {
            fc fc2 = new fc();
            String string3 = fc2.b(string);
            this.a(string3, fc2.b(string2));
            return string3;
        }
    }

    public class c
    extends Exception {
        private final f b;

        protected c(f f2, String string, Throwable throwable) {
            super(string, throwable);
            this.b = f2;
        }

        public f a() {
            return this.b;
        }
    }

    public static class d {
        public ez a() {
            return new cf();
        }

        public ez b() {
            ez ez2 = this.a();
            ez2.a(a.a);
            ez2.c("Accept", "application/json");
            return ez2;
        }
    }

    class e
    extends InputStream {
        private final InputStream b;

        public e(InputStream inputStream) {
            this.b = inputStream;
        }

        public void close() {
            this.b.close();
            if (ez.this.w) {
                ez.this.a();
            }
        }

        public int read() {
            return this.b.read();
        }
    }

    public static final class f
    extends Enum<f> {
        public static final /* enum */ f a = new f();
        public static final /* enum */ f b = new f();
        public static final /* enum */ f c = new f();
        public static final /* enum */ f d = new f();
        public static final /* enum */ f e = new f();
        private static final /* synthetic */ f[] f;

        static {
            f[] arrf = new f[]{a, b, c, d, e};
            f = arrf;
        }

        public static f valueOf(String string) {
            return (f)Enum.valueOf(f.class, (String)string);
        }

        public static f[] values() {
            return (f[])f.clone();
        }
    }

    public class g {
        private int b;
        private String c;
        private e d;

        protected g() {
        }

        public dr a() {
            dr dr2 = new dr(this.d);
            dr2.a(ez.this.i);
            dr2.a(ez.this.p());
            return dr2;
        }

        protected void a(int n2) {
            this.b = n2;
        }

        protected void a(InputStream inputStream) {
            this.d = new e(inputStream);
        }

        protected void a(String string) {
            this.c = string;
        }

        public int b() {
            return this.b;
        }

        public boolean c() {
            return this.b() == 200;
        }

        public String d() {
            return this.c;
        }
    }

}

