/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  d.a.a.a.a.a.b
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package d.a.a.a.a.b;

import android.content.Context;
import android.content.pm.PackageManager;
import d.a.a.a.a.a.b;
import d.a.a.a.a.a.d;
import d.a.a.a.c;

public class s {
    private final d<String> a = new d<String>(){

        public String a(Context context) {
            String string = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            if (string == null) {
                string = "";
            }
            return string;
        }

        @Override
        public /* synthetic */ Object load(Context context) {
            return this.a(context);
        }
    };
    private final b<String> b = new b();

    public String a(Context context) {
        try {
            String string = (String)this.b.a(context, this.a);
            boolean bl = "".equals((Object)string);
            if (bl) {
                string = null;
            }
            return string;
        }
        catch (Exception exception) {
            c.g().e("Fabric", "Failed to determine installer package name", exception);
            return null;
        }
    }

}

