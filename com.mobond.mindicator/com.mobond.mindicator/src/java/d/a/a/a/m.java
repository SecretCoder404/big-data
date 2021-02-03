/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.Future
 */
package d.a.a.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import d.a.a.a.a.b.g;
import d.a.a.a.a.b.l;
import d.a.a.a.a.b.r;
import d.a.a.a.a.e.b;
import d.a.a.a.a.e.e;
import d.a.a.a.a.g.d;
import d.a.a.a.a.g.h;
import d.a.a.a.a.g.n;
import d.a.a.a.a.g.q;
import d.a.a.a.a.g.t;
import d.a.a.a.a.g.y;
import d.a.a.a.c;
import d.a.a.a.i;
import d.a.a.a.k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

class m
extends i<Boolean> {
    private final e a = new b();
    private PackageManager b;
    private String c;
    private PackageInfo d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private final Future<Map<String, k>> j;
    private final Collection<i> k;

    public m(Future<Map<String, k>> future, Collection<i> collection) {
        this.j = future;
        this.k = collection;
    }

    private d a(n n2, Collection<k> collection) {
        Context context = this.getContext();
        String string = new g().a(context);
        String string2 = d.a.a.a.a.b.i.a(new String[]{d.a.a.a.a.b.i.m(context)});
        int n3 = l.a(this.g).a();
        String string3 = this.getIdManager().c();
        d d2 = new d(string, string3, this.f, this.e, string2, this.h, n3, this.i, "0", n2, collection);
        return d2;
    }

    private boolean a(d.a.a.a.a.g.e e2, n n2, Collection<k> collection) {
        d d2 = this.a(n2, collection);
        return new y(this, this.b(), e2.c, this.a).a(d2);
    }

    private boolean a(String string, d.a.a.a.a.g.e e2, Collection<k> collection) {
        if ("new".equals((Object)e2.b)) {
            if (this.b(string, e2, collection)) {
                return q.a().d();
            }
            c.g().e("Fabric", "Failed to create app with Crashlytics service.", null);
            return false;
        }
        if ("configured".equals((Object)e2.b)) {
            return q.a().d();
        }
        if (e2.f) {
            c.g().a("Fabric", "Server says an update is required - forcing a full App update.");
            this.c(string, e2, collection);
        }
        return true;
    }

    private boolean b(String string, d.a.a.a.a.g.e e2, Collection<k> collection) {
        d d2 = this.a(n.a(this.getContext(), string), collection);
        return new h(this, this.b(), e2.c, this.a).a(d2);
    }

    private t c() {
        try {
            q.a().a(this, this.idManager, this.a, this.e, this.f, this.b()).c();
            t t2 = q.a().b();
            return t2;
        }
        catch (Exception exception) {
            c.g().e("Fabric", "Error dealing with settings", exception);
            return null;
        }
    }

    private boolean c(String string, d.a.a.a.a.g.e e2, Collection<k> collection) {
        return this.a(e2, n.a(this.getContext(), string), collection);
    }

    protected Boolean a() {
        boolean bl;
        block3 : {
            String string = d.a.a.a.a.b.i.k(this.getContext());
            t t2 = this.c();
            if (t2 != null) {
                try {
                    Object object = this.j != null ? (Map)this.j.get() : new HashMap();
                    Map<String, k> map = this.a((Map<String, k>)object, this.k);
                    bl = this.a(string, t2.a, (Collection<k>)map.values());
                    break block3;
                }
                catch (Exception exception) {
                    c.g().e("Fabric", "Error performing auto configuration.", exception);
                }
            }
            bl = false;
        }
        return bl;
    }

    Map<String, k> a(Map<String, k> map, Collection<i> collection) {
        for (i i2 : collection) {
            if (map.containsKey((Object)i2.getIdentifier())) continue;
            map.put((Object)i2.getIdentifier(), (Object)new k(i2.getIdentifier(), i2.getVersion(), "binary"));
        }
        return map;
    }

    String b() {
        return d.a.a.a.a.b.i.b(this.getContext(), "com.crashlytics.ApiEndpoint");
    }

    @Override
    protected /* synthetic */ Object doInBackground() {
        return this.a();
    }

    @Override
    public String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    @Override
    public String getVersion() {
        return "1.4.4.27";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected boolean onPreExecute() {
        try {
            this.g = this.getIdManager().i();
            this.b = this.getContext().getPackageManager();
            this.c = this.getContext().getPackageName();
            this.d = this.b.getPackageInfo(this.c, 0);
            this.e = Integer.toString((int)this.d.versionCode);
            String string = this.d.versionName == null ? "0.0" : this.d.versionName;
            this.f = string;
            this.h = this.b.getApplicationLabel(this.getContext().getApplicationInfo()).toString();
            this.i = Integer.toString((int)this.getContext().getApplicationInfo().targetSdkVersion);
            return true;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            c.g().e("Fabric", "Failed init", nameNotFoundException);
            return false;
        }
    }
}

