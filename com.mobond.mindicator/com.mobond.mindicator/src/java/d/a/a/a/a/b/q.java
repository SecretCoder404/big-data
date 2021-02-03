/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package d.a.a.a.a.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import d.a.a.a.a.b.g;
import d.a.a.a.a.b.i;
import d.a.a.a.a.b.o;
import d.a.a.a.a.b.p;
import d.a.a.a.c;

public class q {
    protected String a(Context context) {
        int n2 = i.a(context, "google_app_id", "string");
        if (n2 != 0) {
            c.g().a("Fabric", "Generating Crashlytics ApiKey from google_app_id in Strings");
            return this.a(context.getResources().getString(n2));
        }
        return null;
    }

    protected String a(String string) {
        return i.b(string).substring(0, 40);
    }

    public boolean b(Context context) {
        if (i.a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        boolean bl = i.a(context, "google_app_id", "string") != 0;
        boolean bl2 = !TextUtils.isEmpty((CharSequence)new g().c(context)) || !TextUtils.isEmpty((CharSequence)new g().d(context));
        boolean bl3 = false;
        if (bl) {
            bl3 = false;
            if (!bl2) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public boolean c(Context context) {
        o o2 = p.a(context);
        if (o2 == null) {
            return true;
        }
        return o2.a();
    }
}

