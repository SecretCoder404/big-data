/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Locale
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.atomic.AtomicReference
 */
package d.a.a.a.a.g;

import android.content.Context;
import d.a.a.a.a.e.e;
import d.a.a.a.a.g.g;
import d.a.a.a.a.g.i;
import d.a.a.a.a.g.j;
import d.a.a.a.a.g.k;
import d.a.a.a.a.g.l;
import d.a.a.a.a.g.r;
import d.a.a.a.a.g.s;
import d.a.a.a.a.g.t;
import d.a.a.a.a.g.v;
import d.a.a.a.a.g.w;
import d.a.a.a.a.g.x;
import d.a.a.a.c;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class q {
    private final AtomicReference<t> a = new AtomicReference();
    private final CountDownLatch b = new CountDownLatch(1);
    private s c;
    private boolean d = false;

    private q() {
    }

    public static q a() {
        return a.a;
    }

    private void a(t t2) {
        this.a.set((Object)t2);
        this.b.countDown();
    }

    public q a(d.a.a.a.i i2, d.a.a.a.a.b.r r2, e e2, String string, String string2, String string3) {
        q q2 = this;
        synchronized (q2) {
            block5 : {
                boolean bl = this.d;
                if (!bl) break block5;
                return this;
            }
            if (this.c == null) {
                Context context = i2.getContext();
                String string4 = r2.c();
                String string5 = new d.a.a.a.a.b.g().a(context);
                String string6 = r2.i();
                d.a.a.a.a.b.v v2 = new d.a.a.a.a.b.v();
                k k2 = new k();
                i i3 = new i(i2);
                String string7 = d.a.a.a.a.b.i.k(context);
                l l2 = new l(i2, string3, String.format((Locale)Locale.US, (String)"https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", (Object[])new Object[]{string4}), e2);
                String string8 = r2.g();
                String string9 = r2.f();
                String string10 = r2.e();
                String string11 = r2.b();
                String[] arrstring = new String[]{d.a.a.a.a.b.i.m(context)};
                String string12 = d.a.a.a.a.b.i.a(arrstring);
                int n2 = d.a.a.a.a.b.l.a(string6).a();
                w w2 = new w(string5, string8, string9, string10, string11, string12, string2, string, n2, string7);
                j j2 = new j(i2, w2, v2, k2, i3, l2);
                this.c = j2;
            }
            this.d = true;
            return this;
        }
    }

    public t b() {
        try {
            this.b.await();
            t t2 = (t)this.a.get();
            return t2;
        }
        catch (InterruptedException interruptedException) {
            c.g().e("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
    }

    public boolean c() {
        q q2 = this;
        synchronized (q2) {
            t t2 = this.c.a();
            this.a(t2);
            boolean bl = t2 != null;
            return bl;
        }
    }

    public boolean d() {
        q q2 = this;
        synchronized (q2) {
            t t2;
            block4 : {
                t2 = this.c.a(r.b);
                this.a(t2);
                if (t2 != null) break block4;
                c.g().e("Fabric", "Failed to force reload of settings from Crashlytics.", null);
            }
            boolean bl = t2 != null;
            return bl;
        }
    }

    static class a {
        private static final q a = new q();
    }

}

