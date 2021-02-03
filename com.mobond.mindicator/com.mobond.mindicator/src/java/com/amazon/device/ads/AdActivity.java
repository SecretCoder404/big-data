/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  com.amazon.device.ads.cy
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.InstantiationException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 */
package com.amazon.device.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.amazon.device.ads.cy;
import com.amazon.device.ads.cz;
import com.amazon.device.ads.y;
import com.amazon.device.ads.z;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AdActivity
extends Activity {
    private static final String a = "AdActivity";
    private b b;
    private cy c;
    private z d;
    private a e;

    public AdActivity() {
        this(new cz(), y.a(), new a(new cz()));
    }

    AdActivity(cz cz2, z z2, a a2) {
        this.c = cz2.a(a);
        this.d = z2;
        this.e = a2;
    }

    private void b() {
        if (this.c == null) {
            this.a(new cz());
        }
        if (this.d == null) {
            this.a(y.a());
        }
        if (this.e == null) {
            this.a(new a(new cz()));
        }
        this.d.a(this.getApplicationContext());
    }

    void a(a a2) {
        this.e = a2;
    }

    void a(cz cz2) {
        this.c = cz2.a(a);
    }

    void a(z z2) {
        this.d = z2;
    }

    public void onBackPressed() {
        if (!this.b.h()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.a(configuration);
    }

    public void onCreate(Bundle bundle) {
        this.b();
        b b2 = this.b = this.e.a(this.getIntent());
        if (b2 == null) {
            super.onCreate(bundle);
            this.finish();
            return;
        }
        b2.a(this);
        this.b.a();
        super.onCreate(bundle);
        this.b.b();
    }

    public void onDestroy() {
        this.b.g();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.b.c();
    }

    public void onResume() {
        super.onResume();
        this.b.d();
    }

    public void onStop() {
        this.b.f();
        super.onStop();
    }

    public void onWindowFocusChanged(boolean bl2) {
        super.onWindowFocusChanged(bl2);
        if (bl2) {
            this.b.e();
        }
    }

    static class a {
        private final cy a;

        public a(cz cz2) {
            this.a = cz2.a(a);
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        b a(Intent intent) {
            Class class_;
            String string = intent.getStringExtra("adapter");
            if (string == null) {
                this.a.f("Unable to launch the AdActivity due to an internal error.");
                return null;
            }
            try {
                class_ = Class.forName((String)string);
            }
            catch (ClassNotFoundException classNotFoundException) {
                this.a.f("Unable to get the adapter class.");
                return null;
            }
            Constructor constructor = class_.getDeclaredConstructor(new Class[0]);
            try {
                return (b)constructor.newInstance(new Object[0]);
            }
            catch (InvocationTargetException invocationTargetException) {
                this.a.f("Invocation target exception when instantiating the adapter.");
                return null;
            }
            catch (IllegalAccessException illegalAccessException) {
                this.a.f("Illegal access exception when instantiating the adapter.");
                return null;
            }
            catch (InstantiationException instantiationException) {
                this.a.f("Instantiation exception when instantiating the adapter.");
                return null;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.a.f("Illegal arguments given to the default constructor.");
                return null;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                this.a.f("No default constructor exists for the adapter.");
                return null;
            }
            catch (SecurityException securityException) {
                this.a.f("Security exception when trying to get the default constructor.");
                return null;
            }
        }
    }

    public static interface b {
        public void a();

        public void a(Activity var1);

        public void a(Configuration var1);

        public void b();

        public void c();

        public void d();

        public void e();

        public void f();

        public void g();

        public boolean h();
    }

}

