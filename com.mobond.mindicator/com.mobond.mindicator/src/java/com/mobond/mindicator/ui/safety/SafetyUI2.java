/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.ContentProviderOperation
 *  android.content.ContentProviderOperation$Builder
 *  android.content.ContentProviderResult
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.Intent$ShortcutIconResource
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.provider.ContactsContract
 *  android.provider.ContactsContract$Data
 *  android.provider.ContactsContract$RawContacts
 *  android.util.Log
 *  android.view.View
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.core.app.a
 *  com.mobond.mindicator.ui.WebUI
 *  com.mobond.mindicator.ui.safety.SafetyUI
 *  com.mulo.util.g
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 */
package com.mobond.mindicator.ui.safety;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.a;
import com.mobond.mindicator.h;
import com.mobond.mindicator.ui.WebUI;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.safety.SafetyUI;
import com.mobond.mindicator.ui.safety.SecurityRegistrationUI;
import com.mobond.mindicator.ui.safety.SendSafetyMessageActivity;
import com.mobond.mindicator.ui.safety.SetTrainDetails;
import com.mulo.util.e;
import com.mulo.util.g;
import java.util.ArrayList;
import java.util.Arrays;

public class SafetyUI2
extends Activity {
    public static final String[] a = new String[]{"android.permission.READ_PHONE_STATE", "android.permission.WRITE_CONTACTS", "android.permission.READ_CONTACTS"};
    String b;
    TextView c;
    Activity d;

    private void a() {
        String string;
        n.d((Context)this, "Sending location SMS to Railway Protection Force");
        String string2 = SetTrainDetails.a((Context)this);
        String string3 = SecurityRegistrationUI.a((Context)this);
        if (string2 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("#3#");
            stringBuilder.append(string2);
            stringBuilder.append("\n");
            stringBuilder.append(string3);
            string = stringBuilder.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("#3#");
            stringBuilder.append(string3);
            string = stringBuilder.toString();
        }
        String string4 = a.a(this).b("sr_relatives_mobile_number_key");
        if (string4 != null) {
            SafetyUI.a((Activity)this, (Context)this.getApplicationContext(), (String)string4, (boolean)false, (String)string);
        }
        this.finish();
    }

    public static void a(Activity activity) {
        SafetyUI2.b(activity);
        Intent intent = new Intent((Context)activity, SendSafetyMessageActivity.class);
        intent.setAction("android.intent.action.MAIN");
        Intent intent2 = new Intent();
        intent2.putExtra("android.intent.extra.shortcut.INTENT", (Parcelable)intent);
        intent2.putExtra("android.intent.extra.shortcut.NAME", "Security");
        intent2.putExtra("duplicate", false);
        intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", (Parcelable)Intent.ShortcutIconResource.fromContext((Context)activity, (int)2131231277));
        intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        activity.sendBroadcast(intent2);
        n.d((Context)activity, "Safety Shortcut Created on desktop");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(Activity activity, boolean bl) {
        if (a.a(activity).n() != null && !bl) return;
        try {
            a.a(activity).o();
            SafetyUI2.a(activity);
            return;
        }
        catch (Exception exception) {
            Log.d((String)"m-Indicator safety", (String)"safety Exception 111", (Throwable)exception);
        }
    }

    private static void b(Activity activity) {
        Intent intent = new Intent((Context)activity, SendSafetyMessageActivity.class);
        intent.setAction("android.intent.action.MAIN");
        Intent intent2 = new Intent();
        intent2.putExtra("android.intent.extra.shortcut.INTENT", (Parcelable)intent);
        intent2.putExtra("android.intent.extra.shortcut.NAME", "Security");
        intent2.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
        activity.sendBroadcast(intent2);
    }

    public void a(Context context, String string, String string2, String string3) {
        Bundle bundle = new Bundle();
        bundle.putString("NUMBER", string3);
        ConfigurationManager.a(context, "WOMEN SECURITY", string, string2, bundle);
    }

    void a(Context context, String string, String string2, String string3, String string4, String string5, String string6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)ContentProviderOperation.newInsert((Uri)ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build());
        if (string != null) {
            arrayList.add((Object)ContentProviderOperation.newInsert((Uri)ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", (Object)"vnd.android.cursor.item/name").withValue("data1", (Object)string).build());
        }
        if (string2 != null) {
            arrayList.add((Object)ContentProviderOperation.newInsert((Uri)ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", (Object)"vnd.android.cursor.item/phone_v2").withValue("data1", (Object)string2).withValue("data2", (Object)2).build());
        }
        if (string3 != null) {
            arrayList.add((Object)ContentProviderOperation.newInsert((Uri)ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", (Object)"vnd.android.cursor.item/phone_v2").withValue("data1", (Object)string3).withValue("data2", (Object)1).build());
        }
        if (string4 != null) {
            arrayList.add((Object)ContentProviderOperation.newInsert((Uri)ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", (Object)"vnd.android.cursor.item/phone_v2").withValue("data1", (Object)string4).withValue("data2", (Object)3).build());
        }
        if (string6 != null) {
            arrayList.add((Object)ContentProviderOperation.newInsert((Uri)ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", (Object)"vnd.android.cursor.item/email_v2").withValue("data1", (Object)string6).withValue("data2", (Object)2).build());
        }
        if (string5 != null) {
            arrayList.add((Object)ContentProviderOperation.newInsert((Uri)ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", (Object)"vnd.android.cursor.item/email_v2").withValue("data1", (Object)string5).withValue("data2", (Object)1).build());
        }
        try {
            context.getContentResolver().applyBatch("com.android.contacts", arrayList);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exception: ");
            stringBuilder.append(exception.getMessage());
            Toast.makeText((Context)context, (CharSequence)stringBuilder.toString(), (int)0).show();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public boolean a(Context var1, String var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl41 : ICONST_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493123);
        this.d = this;
        this.c = (TextView)this.findViewById(2131296533);
        this.c.setText((CharSequence)ConfigurationManager.c(this.getApplicationContext()));
        if (!this.a((Context)this, "+919004449631")) {
            this.a((Context)this, "RPF Western Railway - WhatsApp ", "+919004449631", null, null, null, null);
        }
        if (!this.a((Context)this, "+919004734564")) {
            this.a((Context)this, "RPF Central Railway - WhatsApp ", "+919004734564", null, null, null, null);
        }
        String string = a.a(this).b("sr_your_mobile_number_key");
        this.b = string.substring(-10 + string.length(), string.length());
    }

    public void onHowitworksClicked(View view) {
        Intent intent = new Intent((Context)this, WebUI.class);
        g g2 = new g();
        e.a(g2.a(), g2);
        g2.a = "file:///android_asset/safety/safetyhowitworks.html";
        intent.putExtra("webuidatakey", g2.a());
        this.startActivity(intent);
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        if (n2 == 108) {
            int n3 = arrn.length;
            boolean bl = true;
            for (int i2 = 0; i2 < n3; ++i2) {
                int n4 = arrn[i2];
                bl = bl && n4 == 0;
            }
            if (bl) {
                this.a();
                return;
            }
            int n5 = arrstring.length;
            boolean bl2 = true;
            for (int i3 = 0; i3 < n5; ++i3) {
                String string = arrstring[i3];
                bl2 = bl2 && androidx.core.app.a.a((Activity)this, (String)string);
            }
            if (!bl2) {
                a.a(this).b(Arrays.toString((Object[])arrstring), true);
            }
        }
    }

    public void oncentralbuttoncallclick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setTitle(2131755547).setMessage(2131755477).setCancelable(true).setNegativeButton(2131755222, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
            }
        }).setPositiveButton(2131755139, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                Intent intent = new Intent("android.intent.action.CALL");
                intent.setData(Uri.parse((String)"tel:182"));
                SafetyUI2.this.startActivityForResult(intent, 1275);
                SafetyUI2 safetyUI2 = SafetyUI2.this;
                Activity activity = safetyUI2.d;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("CALL ");
                stringBuilder.append("tel:182");
                safetyUI2.a((Context)activity, "CENTRAL", stringBuilder.toString(), SafetyUI2.this.b);
            }
        });
        builder.create().show();
    }

    public void oncentralpanicbuttonclick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setTitle(2131755547).setMessage(2131755478).setCancelable(true).setNegativeButton(2131755222, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
            }
        }).setPositiveButton(2131755139, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                SafetyUI2 safetyUI2 = SafetyUI2.this;
                safetyUI2.a((Context)safetyUI2.d, "CENTRAL", "SMS 182", SafetyUI2.this.b);
                if (h.a((Context)SafetyUI2.this, "android.permission.SEND_SMS")) {
                    SafetyUI2.this.a();
                    return;
                }
                h.a(SafetyUI2.this, "PHONE, CONTACT & SMS", SafetyUI2.a, 108);
            }
        });
        builder.create().show();
    }

    public void oncentralwhatsappclick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setTitle(2131755547).setMessage(2131755477).setCancelable(true).setNegativeButton(2131755222, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
            }
        }).setPositiveButton(2131755139, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse((String)"smsto:+919004734564"));
                intent.setPackage("com.whatsapp");
                intent.putExtra("chat", true);
                SafetyUI2.this.startActivity(intent);
                SafetyUI2 safetyUI2 = SafetyUI2.this;
                Activity activity = safetyUI2.d;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("WHATSAPP ");
                stringBuilder.append("smsto:+919004734564");
                safetyUI2.a((Context)activity, "CENTRAL", stringBuilder.toString(), SafetyUI2.this.b);
            }
        });
        builder.create().show();
    }

    public void oneditprofilebuttonclick(View view) {
        Intent intent = new Intent((Context)this, SecurityRegistrationUI.class);
        intent.putExtra("sr_iseditfromprofile_key", true);
        this.startActivityForResult(intent, 0);
    }

    public void onsettrainclick(View view) {
        this.startActivityForResult(new Intent((Context)this, SetTrainDetails.class), 0);
        this.a((Context)this.d, "SETTRAIN", "button_pressed", this.b);
    }

    public void onwesternbuttoncallclick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setTitle(2131755547).setMessage(2131755477).setCancelable(true).setNegativeButton(2131755222, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
            }
        }).setPositiveButton(2131755139, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                SafetyUI2 safetyUI2 = SafetyUI2.this;
                safetyUI2.a((Context)safetyUI2.d, "WESTERN", "CALL 182", SafetyUI2.this.b);
                Intent intent = new Intent("android.intent.action.CALL");
                intent.setData(Uri.parse((String)"tel:182"));
                intent.putExtra("call_timestamp", System.currentTimeMillis());
                SafetyUI2.this.startActivityForResult(intent, 1311);
            }
        });
        builder.create().show();
    }

    public void onwesternpanicbuttonclick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setTitle(2131755547).setMessage(2131755478).setCancelable(true).setNegativeButton(2131755222, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
            }
        }).setPositiveButton(2131755139, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                SafetyUI2 safetyUI2 = SafetyUI2.this;
                safetyUI2.a((Context)safetyUI2.d, "WESTERN", "SMS 182", SafetyUI2.this.b);
                if (h.a((Context)SafetyUI2.this, "android.permission.SEND_SMS")) {
                    SafetyUI2.this.a();
                    return;
                }
                h.a(SafetyUI2.this, "PHONE, CONTACT & SMS", SafetyUI2.a, 108);
            }
        });
        builder.create().show();
    }

    public void onwesternwhatsappclick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setTitle(2131755547).setMessage(2131755477).setCancelable(true).setNegativeButton(2131755222, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
            }
        }).setPositiveButton(2131755139, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n2) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse((String)"smsto:+919004449631"));
                intent.setPackage("com.whatsapp");
                intent.putExtra("chat", true);
                SafetyUI2.this.startActivity(intent);
                SafetyUI2 safetyUI2 = SafetyUI2.this;
                Activity activity = safetyUI2.d;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("WHATSAPP ");
                stringBuilder.append("smsto:+919004449631");
                safetyUI2.a((Context)activity, "WESTERN", stringBuilder.toString(), SafetyUI2.this.b);
            }
        });
        builder.create().show();
    }

}

