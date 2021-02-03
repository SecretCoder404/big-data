/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package d.a.a.a.a.f;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import d.a.a.a.a.f.c;
import d.a.a.a.i;

public class d
implements c {
    private final SharedPreferences a;
    private final String b;
    private final Context c;

    public d(Context context, String string) {
        if (context != null) {
            this.c = context;
            this.b = string;
            this.a = this.c.getSharedPreferences(this.b, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @Deprecated
    public d(i i2) {
        this(i2.getContext(), i2.getClass().getName());
    }

    @Override
    public SharedPreferences a() {
        return this.a;
    }

    @TargetApi(value=9)
    @Override
    public boolean a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
            return true;
        }
        return editor.commit();
    }

    @Override
    public SharedPreferences.Editor b() {
        return this.a.edit();
    }
}

