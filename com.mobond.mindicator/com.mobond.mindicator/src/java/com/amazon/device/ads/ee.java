/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  com.amazon.device.ads.cy
 *  com.amazon.device.ads.ee$b
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.locks.ReentrantLock
 *  org.json.JSONObject
 */
package com.amazon.device.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.device.ads.bn;
import com.amazon.device.ads.co;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.ee;
import com.amazon.device.ads.ej;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/*
 * Exception performing whole class analysis.
 */
class ee {
    private static final String a = "ee";
    private static ee b;
    private LinkedBlockingQueue<a> c;
    private final ReentrantLock d;
    private final ConcurrentHashMap<String, c> e;
    private SharedPreferences f;
    private final CountDownLatch g;
    private final cy h;
    private bn i;
    private co.a j;

    static {
        b = new ee();
    }

    public ee() {
        this(new co.a(), bn.a());
    }

    ee(co.a a2, bn bn2) {
        this.h = new cz().a(a);
        this.c = new LinkedBlockingQueue();
        this.d = new ReentrantLock();
        this.g = new CountDownLatch(1);
        this.e = new ConcurrentHashMap();
        this.j = a2;
        this.i = bn2;
    }

    public static ee a() {
        return b;
    }

    private void a(SharedPreferences.Editor editor) {
        editor.apply();
    }

    private void a(String string, c c2) {
        if (c2.c == null) {
            this.h.d("Could not set null value for setting: %s", new Object[]{string});
            return;
        }
        this.b(string, c2);
        if (!c2.d && this.b()) {
            this.c();
        }
    }

    private void b(String string, c c2) {
        if (c2.c == null) {
            this.h.d("Could not set null value for setting: %s", new Object[]{string});
            return;
        }
        this.e.put((Object)string, (Object)c2);
    }

    private void e() {
        this.b(this.f);
    }

    public int a(String string, int n2) {
        c c2 = (c)this.e.get((Object)string);
        if (c2 == null) {
            return n2;
        }
        return (Integer)c2.c;
    }

    public long a(String string, long l2) {
        c c2 = (c)this.e.get((Object)string);
        if (c2 == null) {
            return l2;
        }
        return (Long)c2.c;
    }

    public Boolean a(String string, Boolean bl2) {
        c c2 = (c)this.e.get((Object)string);
        if (c2 == null) {
            return bl2;
        }
        return (Boolean)c2.c;
    }

    public <T> T a(String string, T t2, Class<T> class_) {
        c c2 = (c)this.e.get((Object)string);
        if (c2 != null && class_.isInstance(c2.c)) {
            return (T)c2.c;
        }
        return t2;
    }

    public String a(String string, String string2) {
        c c2 = (c)this.e.get((Object)string);
        if (c2 == null) {
            return string2;
        }
        return (String)c2.c;
    }

    void a(Context context) {
        if (context == null) {
            return;
        }
        this.b(context);
    }

    void a(SharedPreferences sharedPreferences) {
        this.a(sharedPreferences.getAll());
    }

    public void a(a a2) {
        if (this.b()) {
            a2.e();
            return;
        }
        try {
            this.c.put((Object)a2);
            return;
        }
        catch (InterruptedException interruptedException) {
            cy cy2 = this.h;
            Object[] arrobject = new Object[]{interruptedException.getMessage()};
            cy2.e("Interrupted exception while adding listener: %s", arrobject);
            return;
        }
    }

    public void a(String string, JSONObject jSONObject) {
        this.b(string, new c(String.class, jSONObject.toString()));
    }

    void a(Map<String, ?> map) {
        for (Map.Entry entry : map.entrySet()) {
            String string = (String)entry.getKey();
            if (string == null || this.e.containsKey((Object)string)) continue;
            Object object = entry.getValue();
            if (object != null) {
                this.e.put((Object)string, (Object)new c(object.getClass(), object));
                continue;
            }
            this.h.d("Could not cache null value for SharedPreferences setting: %s", new Object[]{string});
        }
    }

    public boolean a(String string) {
        return this.e.containsKey((Object)string);
    }

    public boolean a(String string, boolean bl2) {
        Boolean bl3 = this.a(string, (Boolean)null);
        if (bl3 == null) {
            return bl2;
        }
        return bl3;
    }

    void b(final Context context) {
        ej.a(new Runnable(){

            public void run() {
                ee.this.d(context);
            }
        });
    }

    void b(final SharedPreferences sharedPreferences) {
        ej.a(new Runnable(){

            public void run() {
                ee.this.d.lock();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                for (Map.Entry entry : ee.this.e.entrySet()) {
                    c c2 = (c)entry.getValue();
                    if (c2.d) continue;
                    if (c2.b == String.class) {
                        editor.putString((String)entry.getKey(), (String)c2.c);
                        continue;
                    }
                    if (c2.b == Long.class) {
                        editor.putLong((String)entry.getKey(), ((Long)c2.c).longValue());
                        continue;
                    }
                    if (c2.b == Integer.class) {
                        editor.putInt((String)entry.getKey(), ((Integer)c2.c).intValue());
                        continue;
                    }
                    if (c2.b != Boolean.class) continue;
                    editor.putBoolean((String)entry.getKey(), ((Boolean)c2.c).booleanValue());
                }
                ee.this.a(editor);
                ee.this.d.unlock();
            }
        });
    }

    void b(String string) {
        c c2 = (c)this.e.remove((Object)string);
        if (c2 != null && !c2.d && this.b()) {
            this.c();
        }
    }

    void b(String string, int n2) {
        this.a(string, new c(Integer.class, n2));
    }

    void b(String string, long l2) {
        this.a(string, new c(Long.class, l2));
    }

    void b(String string, String string2) {
        this.a(string, new c(String.class, string2));
    }

    void b(String string, boolean bl2) {
        this.a(string, new c(Boolean.class, bl2));
    }

    public boolean b() {
        return this.f != null;
    }

    SharedPreferences c(Context context) {
        return context.getSharedPreferences("AmazonMobileAds", 0);
    }

    void c() {
        this.e();
    }

    void c(String string) {
        this.e.remove((Object)string);
    }

    void c(String string, int n2) {
        this.b(string, new c(Integer.class, n2));
    }

    void c(String string, long l2) {
        this.b(string, new c(Long.class, l2));
    }

    void c(String string, String string2) {
        this.b(string, new c(String.class, string2));
    }

    void c(String string, boolean bl2) {
        this.b(string, new c(Boolean.class, bl2));
    }

    public long d(String string, long l2) {
        if (this.b()) {
            return this.f.getLong(string, l2);
        }
        return l2;
    }

    void d() {
        a a2;
        while ((a2 = (a)this.c.poll()) != null) {
            a2.e();
        }
    }

    void d(Context context) {
        if (!this.b()) {
            SharedPreferences sharedPreferences = this.c(context);
            this.a(sharedPreferences);
            this.f = sharedPreferences;
            this.b(sharedPreferences);
        }
        this.g.countDown();
        this.d();
    }

    void d(String string, boolean bl2) {
        this.b(string, (c)new /* Unavailable Anonymous Inner Class!! */);
    }

    public static interface a {
        public void e();
    }

    class c {
        public Class<?> b;
        public Object c;
        public boolean d;

        public c(Class<?> class_, Object object) {
            this.b = class_;
            this.c = object;
        }
    }

}

