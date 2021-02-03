/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.AsyncTask
 *  android.util.Log
 *  com.mulo.b.e
 *  com.mulo.b.i
 *  com.mulo.b.j
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.mobond.mindicator.ui.safety;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.mobond.mindicator.ui.n;
import com.mulo.b.e;
import com.mulo.b.i;
import com.mulo.b.j;

class a
extends AsyncTask<String, String, String> {
    Context a;

    a(Context context) {
        this.a = context;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    protected /* varargs */ String a(String ... var1_1) {
        var4_2 = var1_1[0];
        var5_3 = var1_1[1];
        var6_4 = var1_1[2];
        var7_5 = new StringBuilder();
        var7_5.append("safety asynk contactno:");
        var7_5.append(var4_2);
        Log.d((String)"safety", (String)var7_5.toString());
        var11_6 = new StringBuilder();
        var11_6.append("safety asynk smstext:");
        var11_6.append(var5_3);
        Log.d((String)"safety", (String)var11_6.toString());
        var15_7 = new StringBuilder();
        var15_7.append("safety asynk eloid:");
        var15_7.append(var6_4);
        Log.d((String)"safety", (String)var15_7.toString());
        var19_8 = new StringBuilder();
        var19_8.append("http://mobondhrd.appspot.com/getstation?loid=");
        var19_8.append(j.a((String)var6_4));
        var22_9 = var19_8.toString();
        {
            catch (Exception var2_13) {
                Log.d((String)"safety", (String)"safety Exception in sending SMS 222", (Throwable)var2_13);
                return null;
            }
        }
        try {
            var25_10 = e.a((String)var22_9);
            ** GOTO lbl31
        }
        catch (Exception var23_11) {
            Log.d((String)"safety", (String)"safety Exception in LocationSMSSendingAsyncTask.", (Throwable)var23_11);
            var25_10 = null;
lbl31: // 2 sources:
            if (var25_10 != null) {
                var26_12 = new StringBuilder();
                var26_12.append(var5_3);
                var26_12.append("\n");
                var26_12.append(var25_10);
                var5_3 = var26_12.toString();
            }
            i.b((Context)this.a, (String)var4_2, (String)var5_3);
            return "";
        }
    }

    protected void a(String string) {
        super.onPostExecute((Object)string);
        if (string == null) {
            n.a(this.a, "SMS could not be sent.\nPlease check network.");
            return;
        }
        n.a(this.a, "SMS Sent. RPF will contact you soon.");
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a((String[])arrobject);
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((String)object);
    }
}

