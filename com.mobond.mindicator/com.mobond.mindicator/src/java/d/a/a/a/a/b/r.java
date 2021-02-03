/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.UUID
 *  java.util.concurrent.locks.ReentrantLock
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package d.a.a.a.a.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import d.a.a.a.a.b.b;
import d.a.a.a.a.b.m;
import d.a.a.a.a.b.q;
import d.a.a.a.a.b.s;
import d.a.a.a.c;
import d.a.a.a.i;
import d.a.a.a.l;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r {
    private static final Pattern e = Pattern.compile((String)"[^\\p{Alnum}]");
    private static final String f = Pattern.quote((String)"/");
    d.a.a.a.a.b.c a;
    b b;
    boolean c;
    q d;
    private final ReentrantLock g = new ReentrantLock();
    private final s h;
    private final boolean i;
    private final boolean j;
    private final Context k;
    private final String l;
    private final String m;
    private final Collection<i> n;

    public r(Context context, String string, String string2, Collection<i> collection) {
        if (context != null) {
            if (string != null) {
                if (collection != null) {
                    this.k = context;
                    this.l = string;
                    this.m = string2;
                    this.n = collection;
                    this.h = new s();
                    this.a = new d.a.a.a.a.b.c(context);
                    this.d = new q();
                    this.i = d.a.a.a.a.b.i.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
                    if (!this.i) {
                        l l2 = c.g();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Device ID collection disabled for ");
                        stringBuilder.append(context.getPackageName());
                        l2.a("Fabric", stringBuilder.toString());
                    }
                    this.j = d.a.a.a.a.b.i.a(context, "com.crashlytics.CollectUserIdentifiers", true);
                    if (!this.j) {
                        l l3 = c.g();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("User information collection disabled for ");
                        stringBuilder.append(context.getPackageName());
                        l3.a("Fabric", stringBuilder.toString());
                    }
                    return;
                }
                throw new IllegalArgumentException("kits must not be null");
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    @SuppressLint(value={"CommitPrefEdits"})
    private String a(SharedPreferences sharedPreferences) {
        String string;
        block4 : {
            this.g.lock();
            string = sharedPreferences.getString("crashlytics.installation.id", null);
            if (string != null) break block4;
            string = this.a(UUID.randomUUID().toString());
            sharedPreferences.edit().putString("crashlytics.installation.id", string).commit();
        }
        return string;
        finally {
            this.g.unlock();
        }
    }

    private String a(String string) {
        if (string == null) {
            return null;
        }
        return e.matcher((CharSequence)string).replaceAll("").toLowerCase(Locale.US);
    }

    @SuppressLint(value={"CommitPrefEdits"})
    private void a(SharedPreferences sharedPreferences, String string) {
        block7 : {
            this.g.lock();
            boolean bl = TextUtils.isEmpty((CharSequence)string);
            if (!bl) break block7;
            this.g.unlock();
            return;
        }
        try {
            String string2 = sharedPreferences.getString("crashlytics.advertising.id", null);
            if (TextUtils.isEmpty((CharSequence)string2)) {
                sharedPreferences.edit().putString("crashlytics.advertising.id", string).commit();
            } else if (!string2.equals((Object)string)) {
                sharedPreferences.edit().remove("crashlytics.installation.id").putString("crashlytics.advertising.id", string).commit();
            }
            return;
        }
        finally {
            this.g.unlock();
        }
    }

    private void a(Map<a, String> map, a a2, String string) {
        if (string != null) {
            map.put((Object)a2, (Object)string);
        }
    }

    private String b(String string) {
        return string.replaceAll(f, "");
    }

    private void b(SharedPreferences sharedPreferences) {
        b b2 = this.l();
        if (b2 != null) {
            this.a(sharedPreferences, b2.a);
        }
    }

    private Boolean m() {
        b b2 = this.l();
        if (b2 != null) {
            return b2.b;
        }
        return null;
    }

    public boolean a() {
        return this.j;
    }

    public String b() {
        String string = this.m;
        if (string == null) {
            SharedPreferences sharedPreferences = d.a.a.a.a.b.i.a(this.k);
            this.b(sharedPreferences);
            String string2 = sharedPreferences.getString("crashlytics.installation.id", null);
            if (string2 == null) {
                return this.a(sharedPreferences);
            }
            string = string2;
        }
        return string;
    }

    public String c() {
        return this.l;
    }

    public String d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.e());
        stringBuilder.append("/");
        stringBuilder.append(this.f());
        return stringBuilder.toString();
    }

    public String e() {
        return this.b(Build.VERSION.RELEASE);
    }

    public String f() {
        return this.b(Build.VERSION.INCREMENTAL);
    }

    public String g() {
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{this.b(Build.MANUFACTURER), this.b(Build.MODEL)};
        return String.format((Locale)locale, (String)"%s/%s", (Object[])arrobject);
    }

    public Map<a, String> h() {
        HashMap hashMap = new HashMap();
        for (i i2 : this.n) {
            if (!(i2 instanceof m)) continue;
            for (Map.Entry entry : ((m)((Object)i2)).getDeviceIdentifiers().entrySet()) {
                this.a((Map<a, String>)hashMap, (a)((Object)entry.getKey()), (String)entry.getValue());
            }
        }
        return Collections.unmodifiableMap((Map)hashMap);
    }

    public String i() {
        return this.h.a(this.k);
    }

    public Boolean j() {
        if (this.k()) {
            return this.m();
        }
        return null;
    }

    protected boolean k() {
        return this.i && !this.d.b(this.k);
    }

    b l() {
        r r2 = this;
        synchronized (r2) {
            if (!this.c) {
                this.b = this.a.a();
                this.c = true;
            }
            b b2 = this.b;
            return b2;
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(1);
        public static final /* enum */ a b = new a(2);
        public static final /* enum */ a c = new a(53);
        public static final /* enum */ a d = new a(100);
        public static final /* enum */ a e = new a(101);
        public static final /* enum */ a f = new a(102);
        public static final /* enum */ a g = new a(103);
        private static final /* synthetic */ a[] i;
        public final int h;

        static {
            a[] arra = new a[]{a, b, c, d, e, f, g};
            i = arra;
        }

        private a(int n3) {
            this.h = n3;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])i.clone();
        }
    }

}

