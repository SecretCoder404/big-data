/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  java.lang.Object
 *  java.util.HashSet
 *  java.util.Set
 */
package d.a.a.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public class a {
    private final Application a;
    private a b;

    public a(Context context) {
        this.a = (Application)context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 14) {
            this.b = new a(this.a);
        }
    }

    public void a() {
        a a2 = this.b;
        if (a2 != null) {
            a2.a();
        }
    }

    public boolean a(b b2) {
        a a2 = this.b;
        return a2 != null && a2.a(b2);
    }

    private static class a {
        private final Set<Application.ActivityLifecycleCallbacks> a = new HashSet();
        private final Application b;

        a(Application application) {
            this.b = application;
        }

        @TargetApi(value=14)
        private void a() {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.a) {
                this.b.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            }
        }

        @TargetApi(value=14)
        private boolean a(final b b2) {
            if (this.b != null) {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks(){

                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        b2.onActivityCreated(activity, bundle);
                    }

                    public void onActivityDestroyed(Activity activity) {
                        b2.onActivityDestroyed(activity);
                    }

                    public void onActivityPaused(Activity activity) {
                        b2.onActivityPaused(activity);
                    }

                    public void onActivityResumed(Activity activity) {
                        b2.onActivityResumed(activity);
                    }

                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        b2.onActivitySaveInstanceState(activity, bundle);
                    }

                    public void onActivityStarted(Activity activity) {
                        b2.onActivityStarted(activity);
                    }

                    public void onActivityStopped(Activity activity) {
                        b2.onActivityStopped(activity);
                    }
                };
                this.b.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                this.a.add((Object)activityLifecycleCallbacks);
                return true;
            }
            return false;
        }

    }

    public static abstract class b {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

}

