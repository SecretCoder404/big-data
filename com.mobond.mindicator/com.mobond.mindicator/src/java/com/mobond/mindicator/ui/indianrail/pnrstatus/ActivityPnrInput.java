/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.text.Editable
 *  android.text.InputFilter
 *  android.text.InputFilter$LengthFilter
 *  android.text.TextWatcher
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 *  android.widget.ImageButton
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 *  android.widget.Toast
 *  androidx.appcompat.app.a
 *  androidx.appcompat.widget.Toolbar
 *  androidx.core.app.a
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.indianrail.pnrstatus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.indianrail.pnrstatus.ActivityPnrInput;
import com.mobond.mindicator.ui.indianrail.pnrstatus.a;
import com.mobond.mindicator.ui.indianrail.pnrstatus.c;
import com.mobond.mindicator.ui.indianrail.pnrstatus.d;
import com.mobond.mindicator.ui.indianrail.pnrstatus.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public class ActivityPnrInput
extends com.mobond.mindicator.ui.indianrail.util.a {
    ImageButton a;
    private EditText b;
    private ImageButton c;
    private ListView d;
    private a e;
    private Activity f;
    private RelativeLayout g;
    private TextView h;

    static /* synthetic */ EditText a(ActivityPnrInput activityPnrInput) {
        return activityPnrInput.b;
    }

    public static ArrayList<String> a(Context context) {
        String string = com.mobond.mindicator.a.b(context).a("pnr_all", null);
        if (string != null) {
            ArrayList arrayList = new ArrayList();
            for (String string2 : string.split(",")) {
                if (string2.isEmpty()) continue;
                arrayList.add((Object)string2);
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            return arrayList;
        }
        return null;
    }

    public static void a(Context context, String string, boolean bl) {
        String string2;
        b b2 = com.mobond.mindicator.a.b(context);
        String string3 = b2.a("pnr_all", null);
        if (string3 == null) {
            b2.b("pnr_all", string);
            return;
        }
        if (string3.contains((CharSequence)string)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(",");
            stringBuilder.append(string3.replaceFirst(string, ""));
            string2 = stringBuilder.toString();
        } else if (bl) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(",");
            stringBuilder.append(string3);
            string2 = stringBuilder.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string3);
            stringBuilder.append(",");
            stringBuilder.append(string);
            string2 = stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        String[] arrstring = string2.split(",");
        int n2 = arrstring.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string4 = arrstring[i2];
            if (string4.isEmpty()) continue;
            if (n3 > 0) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(",");
                stringBuilder2.append(string4);
                string4 = stringBuilder2.toString();
            }
            stringBuilder.append(string4);
            if (++n3 == 10) break;
        }
        b2.b("pnr_all", stringBuilder.toString());
    }

    static /* synthetic */ void a(ActivityPnrInput activityPnrInput, String string) {
        activityPnrInput.a(string);
    }

    private void a(String string) {
        if (ActivityPnrInput.a((Context)this.f, string)) {
            ArrayList<String> arrayList = ActivityPnrInput.a((Context)this);
            ArrayList arrayList2 = new ArrayList(this.a((List<String>)arrayList));
            a a2 = this.e;
            if (a2 == null) {
                this.e = new a(arrayList, (ArrayList<String>)arrayList2, this);
                this.d.setAdapter((ListAdapter)this.e);
            } else {
                a2.a(arrayList, (ArrayList<String>)arrayList2);
            }
            e e2 = new e((Activity)this, string, this, this.getApplicationContext(), false);
            e2.a();
            InputMethodManager inputMethodManager = (InputMethodManager)this.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(this.b.getWindowToken(), 0);
            }
        }
    }

    public static boolean a(Context context, String string) {
        if (string.length() != 10) {
            Toast.makeText((Context)context, (int)2131755271, (int)0).show();
            return false;
        }
        ActivityPnrInput.a(context, string, true);
        return true;
    }

    static /* synthetic */ ImageButton b(ActivityPnrInput activityPnrInput) {
        return activityPnrInput.c;
    }

    public static boolean b(Context context, String string) {
        String string2 = com.mobond.mindicator.a.b(context).a("pnr_all", null);
        return string2 != null && string2.contains((CharSequence)string);
    }

    static /* synthetic */ Activity c(ActivityPnrInput activityPnrInput) {
        return activityPnrInput.f;
    }

    public List<String> a(List<String> list) {
        c c2 = new c((Context)this);
        ArrayList arrayList = new ArrayList();
        for (String string : list) {
            String string2;
            block5 : {
                String[] arrstring;
                block6 : {
                    string2 = "";
                    if (string.isEmpty() || (arrstring = c2.b(string)) == null) break block5;
                    if (!arrstring[0].equals((Object)"flushed")) break block6;
                    string2 = "FLUSHED";
                }
                try {
                    String string3;
                    JSONObject jSONObject = new JSONObject(arrstring[0]);
                    String string4 = jSONObject.getString("date");
                    String string5 = jSONObject.getString("from");
                    String string6 = jSONObject.getString("to");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string4);
                    stringBuilder.append("   ");
                    stringBuilder.append(string5);
                    stringBuilder.append(" - ");
                    stringBuilder.append(string6);
                    string2 = string3 = stringBuilder.toString();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            arrayList.add((Object)string2);
        }
        return arrayList;
    }

    public void a() {
        ArrayList<String> arrayList = ActivityPnrInput.a((Context)this);
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(this.a((List<String>)arrayList));
            a a2 = this.e;
            if (a2 == null) {
                this.e = new a(arrayList, (ArrayList<String>)arrayList2, this);
                this.d.setAdapter((ListAdapter)this.e);
                return;
            }
            a2.a(arrayList, (ArrayList<String>)arrayList2);
        }
    }

    public void onBackPressed() {
        if (this.b.getText().length() != 0) {
            this.b.setText((CharSequence)"");
        } else {
            super.onBackPressed();
        }
        InputMethodManager inputMethodManager = (InputMethodManager)this.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.b.getWindowToken(), 0);
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = this;
        this.setContentView(2131493049);
        Toolbar toolbar = (Toolbar)this.findViewById(2131297523);
        this.setSupportActionBar(toolbar);
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().a(true);
        }
        this.d = (ListView)this.findViewById(2131296936);
        this.a = (ImageButton)this.findViewById(2131297273);
        this.a.setVisibility(0);
        this.b = (EditText)this.findViewById(2131296700);
        this.b.setHint(2131755236);
        this.b.setInputType(2);
        InputFilter[] arrinputFilter = new InputFilter[]{new InputFilter.LengthFilter(10)};
        this.b.setFilters(arrinputFilter);
        this.c = (ImageButton)this.findViewById(2131296556);
        this.c.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivityPnrInput a;
            {
                this.a = activityPnrInput;
            }

            public void onClick(View view) {
                ActivityPnrInput.a(this.a).setText((CharSequence)"");
                ActivityPnrInput.a(this.a).requestFocus();
                InputMethodManager inputMethodManager = (InputMethodManager)this.a.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput((View)ActivityPnrInput.a(this.a), 1);
                }
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivityPnrInput a;
            {
                this.a = activityPnrInput;
            }

            public void onClick(View view) {
                InputMethodManager inputMethodManager = (InputMethodManager)this.a.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(ActivityPnrInput.a(this.a).getWindowToken(), 0);
                }
                this.a.finish();
            }
        });
        this.b.addTextChangedListener(new TextWatcher(this){
            final /* synthetic */ ActivityPnrInput a;
            {
                this.a = activityPnrInput;
            }

            public void afterTextChanged(Editable editable) {
                if (editable.length() == 0) {
                    ActivityPnrInput.a(this.a).setTypeface(android.graphics.Typeface.DEFAULT);
                    ActivityPnrInput.b(this.a).setVisibility(8);
                    return;
                }
                ActivityPnrInput.a(this.a).setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
                ActivityPnrInput.b(this.a).setVisibility(0);
            }

            public void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            }

            public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            }
        });
        this.a.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivityPnrInput a;
            {
                this.a = activityPnrInput;
            }

            public void onClick(View view) {
                String string = ActivityPnrInput.a(this.a).getText().toString();
                ActivityPnrInput.a(this.a, string);
            }
        });
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this){
            final /* synthetic */ ActivityPnrInput a;
            {
                this.a = activityPnrInput;
            }

            public boolean onEditorAction(TextView textView, int n2, android.view.KeyEvent keyEvent) {
                if (n2 == 3) {
                    String string = ActivityPnrInput.a(this.a).getText().toString();
                    ActivityPnrInput.a(this.a, string);
                }
                return false;
            }
        });
        this.g = (RelativeLayout)this.findViewById(2131296376);
        this.g.setVisibility(8);
        this.h = (TextView)this.findViewById(2131296375);
        this.h.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivityPnrInput a;
            {
                this.a = activityPnrInput;
            }

            public void onClick(View view) {
                String[] arrstring = new String[]{"android.permission.RECEIVE_SMS", "android.permission.SEND_SMS", "android.permission.READ_SMS"};
                if (com.mobond.mindicator.h.a(ActivityPnrInput.c(this.a), arrstring)) {
                    com.mobond.mindicator.h.a(ActivityPnrInput.c(this.a), 109);
                    return;
                }
                com.mobond.mindicator.h.a(ActivityPnrInput.c(this.a), arrstring, 109);
            }
        });
        if (this.getIntent().hasExtra("pnr")) {
            this.a(this.getIntent().getStringExtra("pnr"));
        }
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        if (n2 == 109) {
            if (arrn.length > 0 && arrn[0] == 0) {
                try {
                    this.g.setVisibility(8);
                    d.a(this.f);
                    this.a();
                    return;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
            }
            this.g.setVisibility(0);
            if (!androidx.core.app.a.a((Activity)this, (String)arrstring[0])) {
                com.mobond.mindicator.a.a(this.f).b(Arrays.toString((Object[])arrstring), true);
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.a();
    }
}

