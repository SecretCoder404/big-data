/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  d.a.a.a.b
 *  d.a.a.a.c$1
 *  d.a.a.a.c$2
 *  d.a.a.a.h
 *  d.a.a.a.m
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Future
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package d.a.a.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import d.a.a.a.a;
import d.a.a.a.a.b.q;
import d.a.a.a.a.b.r;
import d.a.a.a.a.c.d;
import d.a.a.a.a.c.k;
import d.a.a.a.b;
import d.a.a.a.c;
import d.a.a.a.e;
import d.a.a.a.f;
import d.a.a.a.h;
import d.a.a.a.i;
import d.a.a.a.j;
import d.a.a.a.l;
import d.a.a.a.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

public class c {
    static volatile c a;
    static final l b;
    final l c;
    final boolean d;
    private final Context e;
    private final Map<Class<? extends i>, i> f;
    private final ExecutorService g;
    private final Handler h;
    private final f<c> i;
    private final f<?> j;
    private final r k;
    private d.a.a.a.a l;
    private WeakReference<Activity> m;
    private AtomicBoolean n;

    static {
        b = new b();
    }

    c(Context context, Map<Class<? extends i>, i> map, k k2, Handler handler, l l2, boolean bl, f f2, r r2, Activity activity) {
        this.e = context;
        this.f = map;
        this.g = k2;
        this.h = handler;
        this.c = l2;
        this.d = bl;
        this.i = f2;
        this.n = new AtomicBoolean(false);
        this.j = this.a(map.size());
        this.k = r2;
        this.a(activity);
    }

    static c a() {
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* varargs */ c a(Context context, i ... arri) {
        if (a != null) return a;
        Class<c> class_ = c.class;
        synchronized (c.class) {
            if (a != null) return a;
            c.c(new a(context).a(arri).a());
            // ** MonitorExit[var3_2] (shouldn't be in output)
            return a;
        }
    }

    public static <T extends i> T a(Class<T> class_) {
        return (T)((i)c.a().f.get(class_));
    }

    static /* synthetic */ AtomicBoolean a(c c2) {
        return c2.n;
    }

    private static void a(Map<Class<? extends i>, i> map, Collection<? extends i> collection) {
        for (i i2 : collection) {
            map.put((Object)i2.getClass(), (Object)i2);
            if (!(i2 instanceof j)) continue;
            c.a(map, ((j)((Object)i2)).getKits());
        }
    }

    static /* synthetic */ f b(c c2) {
        return c2.i;
    }

    private static Map<Class<? extends i>, i> b(Collection<? extends i> collection) {
        HashMap hashMap = new HashMap(collection.size());
        c.a((Map<Class<? extends i>, i>)hashMap, collection);
        return hashMap;
    }

    private static void c(c c2) {
        a = c2;
        c2.i();
    }

    private static Activity d(Context context) {
        if (context instanceof Activity) {
            return (Activity)context;
        }
        return null;
    }

    public static l g() {
        if (a == null) {
            return b;
        }
        return c.a.c;
    }

    public static boolean h() {
        if (a == null) {
            return false;
        }
        return c.a.d;
    }

    private void i() {
        this.l = new d.a.a.a.a(this.e);
        this.l.a((a.b)new 1(this));
        this.a(this.e);
    }

    public c a(Activity activity) {
        this.m = new WeakReference((Object)activity);
        return this;
    }

    f<?> a(int n2) {
        return new 2(this, n2);
    }

    void a(Context context) {
        StringBuilder stringBuilder;
        Future<Map<String, d.a.a.a.k>> future = this.b(context);
        Collection<i> collection = this.f();
        m m2 = new m(future, collection);
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort((List)arrayList);
        m2.injectParameters(context, this, f.d, this.k);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            ((i)iterator.next()).injectParameters(context, this, this.j, this.k);
        }
        m2.initialize();
        if (c.g().a("Fabric", 3)) {
            stringBuilder = new StringBuilder("Initializing ");
            stringBuilder.append(this.d());
            stringBuilder.append(" [Version: ");
            stringBuilder.append(this.c());
            stringBuilder.append("], with the following kits:\n");
        } else {
            stringBuilder = null;
        }
        for (i i2 : arrayList) {
            i2.initializationTask.a((d.a.a.a.a.c.l)m2.initializationTask);
            this.a(this.f, i2);
            i2.initialize();
            if (stringBuilder == null) continue;
            stringBuilder.append(i2.getIdentifier());
            stringBuilder.append(" [Version: ");
            stringBuilder.append(i2.getVersion());
            stringBuilder.append("]\n");
        }
        if (stringBuilder != null) {
            c.g().a("Fabric", stringBuilder.toString());
        }
    }

    void a(Map<Class<? extends i>, i> map, i i2) {
        d d2 = i2.dependsOnAnnotation;
        if (d2 != null) {
            for (Class<?> class_ : d2.a()) {
                if (class_.isInterface()) {
                    for (i i3 : map.values()) {
                        if (!class_.isAssignableFrom(i3.getClass())) continue;
                        i2.initializationTask.a(i3.initializationTask);
                    }
                    continue;
                }
                if ((i)map.get(class_) != null) {
                    i2.initializationTask.a(((i)map.get(class_)).initializationTask);
                    continue;
                }
                throw new d.a.a.a.a.c.m("Referenced Kit was null, does the kit exist?");
            }
        }
    }

    public Activity b() {
        WeakReference<Activity> weakReference = this.m;
        if (weakReference != null) {
            return (Activity)weakReference.get();
        }
        return null;
    }

    Future<Map<String, d.a.a.a.k>> b(Context context) {
        e e2 = new e(context.getPackageCodePath());
        return this.e().submit((Callable)e2);
    }

    public String c() {
        return "1.4.4.27";
    }

    public String d() {
        return "io.fabric.sdk.android:fabric";
    }

    public ExecutorService e() {
        return this.g;
    }

    public Collection<i> f() {
        return this.f.values();
    }

    public static class a {
        private final Context a;
        private i[] b;
        private k c;
        private Handler d;
        private l e;
        private boolean f;
        private String g;
        private String h;
        private f<c> i;

        public a(Context context) {
            if (context != null) {
                this.a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public /* varargs */ a a(i ... arri) {
            if (this.b == null) {
                if (!new q().c(this.a)) {
                    ArrayList arrayList = new ArrayList();
                    int n2 = arri.length;
                    boolean bl = false;
                    block3 : for (int i2 = 0; i2 < n2; ++i2) {
                        i i3 = arri[i2];
                        String string = i3.getIdentifier();
                        int n3 = -1;
                        int n4 = string.hashCode();
                        if (n4 != 607220212) {
                            if (n4 == 1830452504 && string.equals((Object)"com.crashlytics.sdk.android:crashlytics")) {
                                n3 = 0;
                            }
                        } else if (string.equals((Object)"com.crashlytics.sdk.android:answers")) {
                            n3 = 1;
                        }
                        switch (n3) {
                            default: {
                                if (bl) continue block3;
                                c.g().d("Fabric", "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.");
                                bl = true;
                                continue block3;
                            }
                            case 0: 
                            case 1: {
                                arrayList.add((Object)i3);
                            }
                        }
                    }
                    arri = (i[])arrayList.toArray((Object[])new i[0]);
                }
                this.b = arri;
                return this;
            }
            throw new IllegalStateException("Kits already set.");
        }

        public c a() {
            Object[] arrobject;
            if (this.c == null) {
                this.c = k.a();
            }
            if (this.d == null) {
                this.d = new Handler(Looper.getMainLooper());
            }
            if (this.e == null) {
                this.e = this.f ? new b(3) : new b();
            }
            if (this.h == null) {
                this.h = this.a.getPackageName();
            }
            if (this.i == null) {
                this.i = f.d;
            }
            Object object = (arrobject = this.b) == null ? new HashMap() : c.b((Collection<? extends i>)((Collection)Arrays.asList((Object[])arrobject)));
            Context context = this.a.getApplicationContext();
            r r2 = new r(context, this.h, this.g, (Collection<i>)object.values());
            c c2 = new c(context, (Map<Class<? extends i>, i>)object, this.c, this.d, this.e, this.f, this.i, r2, c.d(this.a));
            return c2;
        }
    }

}

