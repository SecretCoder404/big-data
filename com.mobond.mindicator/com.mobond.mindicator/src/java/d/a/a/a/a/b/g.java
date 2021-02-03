/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.a.a.a.a.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import d.a.a.a.a.b.i;
import d.a.a.a.a.b.q;
import d.a.a.a.c;
import d.a.a.a.l;

public class g {
    protected String a() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    public String a(Context context) {
        String string = this.c(context);
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = this.d(context);
        }
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = this.b(context);
        }
        if (TextUtils.isEmpty((CharSequence)string)) {
            this.e(context);
        }
        return string;
    }

    protected String b(Context context) {
        return new q().a(context);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    protected String c(Context context) {
        void var3_9;
        String string;
        block7 : {
            string = null;
            String string2 = context.getPackageName();
            Bundle bundle = context.getPackageManager().getApplicationInfo((String)string2, (int)128).metaData;
            string = null;
            if (bundle == null) return string;
            String string3 = bundle.getString("io.fabric.ApiKey");
            if ("@string/twitter_consumer_secret".equals((Object)string3)) {
                c.g().a("Fabric", "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                string = null;
            } else {
                string = string3;
            }
            if (string != null) return string;
            c.g().a("Fabric", "Falling back to Crashlytics key lookup from Manifest");
            return bundle.getString("com.crashlytics.ApiKey");
            catch (Exception exception) {
                string = string3;
            }
            break block7;
            catch (Exception exception) {
                // empty catch block
            }
        }
        l l2 = c.g();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Caught non-fatal exception while retrieving apiKey: ");
        stringBuilder.append((Object)var3_9);
        l2.a("Fabric", stringBuilder.toString());
        return string;
    }

    protected String d(Context context) {
        int n2 = i.a(context, "io.fabric.ApiKey", "string");
        if (n2 == 0) {
            c.g().a("Fabric", "Falling back to Crashlytics key lookup from Strings");
            n2 = i.a(context, "com.crashlytics.ApiKey", "string");
        }
        if (n2 != 0) {
            return context.getResources().getString(n2);
        }
        return null;
    }

    protected void e(Context context) {
        if (!c.h() && !i.i(context)) {
            c.g().e("Fabric", this.a());
            return;
        }
        throw new IllegalArgumentException(this.a());
    }
}

