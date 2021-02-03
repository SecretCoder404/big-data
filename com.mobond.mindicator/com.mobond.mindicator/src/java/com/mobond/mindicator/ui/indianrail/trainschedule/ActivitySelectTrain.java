/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 *  android.widget.ImageButton
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 *  androidx.appcompat.app.a
 *  androidx.appcompat.app.e
 *  androidx.appcompat.widget.Toolbar
 *  androidx.core.content.a
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.indianrail.trainschedule;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import com.mobond.mindicator.ui.indianrail.IRActivity;
import com.mobond.mindicator.ui.indianrail.a.f;
import com.mobond.mindicator.ui.indianrail.trainschedule.ActivitySelectTrain;
import com.mobond.mindicator.ui.indianrail.trainschedule.a;
import java.util.Vector;

public class ActivitySelectTrain
extends e {
    EditText a;
    ListView b;
    private ImageButton c;
    private a d;

    static /* synthetic */ void a(ActivitySelectTrain activitySelectTrain) {
        super.onBackPressed();
    }

    static /* synthetic */ ImageButton b(ActivitySelectTrain activitySelectTrain) {
        return activitySelectTrain.c;
    }

    public void onBackPressed() {
        if (this.a.getText().length() != 0) {
            this.a.setText((CharSequence)"");
        } else {
            ActivitySelectTrain.super.onBackPressed();
        }
        InputMethodManager inputMethodManager = (InputMethodManager)this.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.a.getWindowToken(), 0);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493049);
        Toolbar toolbar = (Toolbar)this.findViewById(2131297523);
        this.setSupportActionBar(toolbar);
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().a(true);
        }
        this.b = (ListView)this.findViewById(2131296936);
        this.d = new a(IRActivity.a((Activity)this), this);
        this.b.setAdapter((ListAdapter)this.d);
        this.a = (EditText)this.findViewById(2131296700);
        this.a.setHint((CharSequence)this.getResources().getString(2131755169));
        this.a.setInputType(524289);
        this.c = (ImageButton)this.findViewById(2131296556);
        Drawable drawable = androidx.core.content.a.a((Context)this.getApplicationContext(), (int)2131231347);
        drawable.setColorFilter(-5921371, PorterDuff.Mode.MULTIPLY);
        this.c.setImageDrawable(drawable);
        this.c.setVisibility(0);
        this.a.addTextChangedListener(new TextWatcher(this){
            final /* synthetic */ ActivitySelectTrain a;
            {
                this.a = activitySelectTrain;
            }

            public void afterTextChanged(Editable editable) {
                String string = editable.toString().toLowerCase(java.util.Locale.ENGLISH);
                ((android.widget.ArrayAdapter)this.a.b.getAdapter()).getFilter().filter((CharSequence)string);
            }

            public void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            }

            public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            }
        });
        this.c.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivitySelectTrain a;
            {
                this.a = activitySelectTrain;
            }

            public void onClick(View view) {
                String string = this.a.a.getText().toString();
                if (string.length() == 5 && string.matches("[0-9]+")) {
                    ActivitySelectTrain activitySelectTrain = this.a;
                    a.a((Context)activitySelectTrain, "", activitySelectTrain.a.getText().toString(), "TRAIN", 0);
                    return;
                }
                ActivitySelectTrain activitySelectTrain = this.a;
                com.mobond.mindicator.ui.n.d((Context)activitySelectTrain, activitySelectTrain.getString(2131755237));
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ActivitySelectTrain a;
            {
                this.a = activitySelectTrain;
            }

            public void onClick(View view) {
                ActivitySelectTrain.a(this.a);
                InputMethodManager inputMethodManager = (InputMethodManager)this.a.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(this.a.a.getWindowToken(), 0);
                }
            }
        });
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this){
            final /* synthetic */ ActivitySelectTrain a;
            {
                this.a = activitySelectTrain;
            }

            public boolean onEditorAction(TextView textView, int n2, android.view.KeyEvent keyEvent) {
                if (n2 == 3) {
                    InputMethodManager inputMethodManager = (InputMethodManager)this.a.getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(textView.getWindowToken(), 0);
                    }
                    if (ActivitySelectTrain.b(this.a).getVisibility() == 0) {
                        ActivitySelectTrain.b(this.a).performClick();
                    }
                }
                return false;
            }
        });
    }
}

