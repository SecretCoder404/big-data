/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.ArgbEvaluator
 *  android.animation.TypeEvaluator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.BaseAdapter
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  androidx.appcompat.widget.ak
 *  androidx.appcompat.widget.ak$b
 *  com.mobond.mindicator.ui.chat.ChatScreenHSV
 *  com.mobond.mindicator.ui.chat.a$3$1
 *  com.mulo.b.c
 *  com.mulo.b.h
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.chat;

import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ak;
import com.mobond.mindicator.ui.chat.ChatModel;
import com.mobond.mindicator.ui.chat.ChatScreenHSV;
import com.mobond.mindicator.ui.chat.a;
import com.mobond.mindicator.ui.chat.b;
import com.mobond.mindicator.ui.login.GoogleLoginActivity;
import com.mobond.mindicator.ui.n;
import com.mulo.b.c;
import com.mulo.b.h;
import java.util.ArrayList;
import java.util.Vector;

public class a
extends BaseAdapter {
    private String a;
    private String b;
    private String c;
    private ArrayList<ChatModel> d;
    private Activity e;
    private String f = null;
    private Vector<Long> g = new Vector();
    private boolean h;

    a(ArrayList<ChatModel> arrayList, Activity activity, String string, String string2, String string3, boolean bl, String string4) {
        this.d = arrayList;
        this.e = activity;
        this.f = string;
        this.a = string2;
        this.c = string3;
        this.h = bl;
        this.b = string4;
    }

    private void a() {
        this.e.findViewById(2131296508).requestFocus();
        ((InputMethodManager)this.e.getSystemService("input_method")).showSoftInput(this.e.findViewById(2131296508), 1);
    }

    private void a(Context context, ChatModel chatModel) {
        com.mobond.mindicator.a.a(context).b(this.b(chatModel), true);
        this.a(chatModel, "like", context);
    }

    private void a(final View view) {
        int n2 = this.e.getResources().getColor(2131099713);
        int n3 = this.e.getResources().getColor(2131100278);
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Object[] arrobject = new Object[]{n2, n3};
        ValueAnimator valueAnimator = ValueAnimator.ofObject((TypeEvaluator)argbEvaluator, (Object[])arrobject);
        valueAnimator.setDuration(450L);
        valueAnimator.setStartDelay(450L);
        valueAnimator.setRepeatCount(1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(){

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setBackgroundColor(((Integer)valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimator.start();
    }

    private void a(ChatModel chatModel) {
        ((TextView)this.e.findViewById(2131297598)).setText((CharSequence)chatModel.getN());
        ((TextView)this.e.findViewById(2131297596)).setText((CharSequence)chatModel.getM());
        ((TextView)this.e.findViewById(2131297592)).setText((CharSequence)chatModel.getI());
        this.e.findViewById(2131297237).setVisibility(0);
        ((EditText)this.e.findViewById(2131296508)).setHint((CharSequence)"Type a reply");
        this.a();
    }

    private void a(final ChatModel chatModel, String string, Context context) {
        if (!TextUtils.isEmpty((CharSequence)chatModel.getM())) {
            String string2;
            final h h2 = new h();
            h2.a("gi", this.a);
            String string3 = this.c;
            if (string3 != null) {
                h2.a("giparent", string3);
            }
            h2.a("i", chatModel.getI());
            h2.a("m", chatModel.getM());
            h2.a("ri", chatModel.getRi());
            h2.a("t", chatModel.getT());
            h2.a("st", string);
            h2.a("db", this.b);
            h2.a("time", String.valueOf((long)chatModel.getTime()));
            if (this.f == null) {
                this.f = GoogleLoginActivity.f(context);
            }
            if ((string2 = this.f) != null) {
                h2.a("reporterid", string2);
            }
            new Thread(){

                public void run() {
                    try {
                        a.this.g.add((Object)chatModel.getTime());
                        c.b((String)"http://mobondhrd.appspot.com/chat?", (h)h2, null);
                        a.this.g.remove((Object)chatModel.getTime());
                        return;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        a.this.g.remove((Object)chatModel.getTime());
                        return;
                    }
                }
            }.start();
        }
    }

    private boolean a(View view, ChatModel chatModel) {
        return com.mobond.mindicator.a.a(this.e).c(this.b(chatModel));
    }

    private String b(ChatModel chatModel) {
        return String.valueOf((long)chatModel.getTime());
    }

    private void b(Context context, ChatModel chatModel) {
        com.mobond.mindicator.a.a(context).d(this.b(chatModel));
        this.a(chatModel, "unlike", context);
    }

    private void c(Context context, ChatModel chatModel) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("spam");
        stringBuilder.append(this.b(chatModel));
        String string = stringBuilder.toString();
        if (!com.mobond.mindicator.a.a(context).c(string)) {
            com.mobond.mindicator.a.a(context).b(string, true);
            this.a(chatModel, "spam", context);
        }
    }

    static /* synthetic */ void c(a a2, Context context, ChatModel chatModel) {
        a2.c(context, chatModel);
    }

    static /* synthetic */ ArrayList d(a a2) {
        return a2.d;
    }

    private void d(Context context, ChatModel chatModel) {
        this.a(chatModel, "delete", context);
        ((ChatScreenHSV)this.e).d();
    }

    static /* synthetic */ void d(a a2, Context context, ChatModel chatModel) {
        a2.d(context, chatModel);
    }

    private void e(Context context, ChatModel chatModel) {
        this.a(chatModel, "notifyreply", context);
        ((ChatScreenHSV)this.e).d();
    }

    static /* synthetic */ void e(a a2, Context context, ChatModel chatModel) {
        a2.e(context, chatModel);
    }

    private void f(Context context, ChatModel chatModel) {
        this.a(chatModel, "notifymostlike", context);
        ((ChatScreenHSV)this.e).d();
    }

    static /* synthetic */ void f(a a2, Context context, ChatModel chatModel) {
        a2.f(context, chatModel);
    }

    public void a(String string) {
        this.f = string;
        this.notifyDataSetChanged();
    }

    public void a(boolean bl) {
        this.h = bl;
        this.notifyDataSetChanged();
    }

    public int getCount() {
        ArrayList<ChatModel> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public Object getItem(int n2) {
        return n2;
    }

    public long getItemId(int n2) {
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public View getView(final int var1_1, View var2_2, ViewGroup var3_3) {
        block13 : {
            block14 : {
                if (var2_2 != null) break block14;
                var4_4 = this.e.getLayoutInflater().inflate(2131492950, null);
                try {
                    var14_5 = new a();
                    var14_5.a = new b();
                    var14_5.a.a = (TextView)var4_4.findViewById(2131297004);
                    var14_5.a.b = (TextView)var4_4.findViewById(2131296983);
                    var14_5.a.c = (TextView)var4_4.findViewById(2131296607);
                    var14_5.a.d = (RelativeLayout)var4_4.findViewById(2131296513);
                    var14_5.a.e = (ViewGroup)var4_4.findViewById(2131296950);
                    var14_5.a.f = (LinearLayout)var4_4.findViewById(2131296919);
                    var14_5.a.g = (TextView)var4_4.findViewById(2131296917);
                    var14_5.a.h = (TextView)var4_4.findViewById(2131297594);
                    var14_5.a.i = (ImageView)var4_4.findViewById(2131297397);
                    var14_5.a.j = (ImageView)var4_4.findViewById(2131296918);
                    var14_5.a.l = (TextView)var4_4.findViewById(2131297595);
                    var14_5.a.m = (TextView)var4_4.findViewById(2131297597);
                    var14_5.a.n = (LinearLayout)var4_4.findViewById(2131296954);
                    var14_5.a.n = (LinearLayout)var4_4.findViewById(2131296954);
                    var14_5.a.k = new RelativeLayout.LayoutParams(-2, -2);
                    var4_4.setTag((Object)var14_5);
                    break block13;
                }
                catch (Exception var5_12) {}
                ** GOTO lbl-1000
                catch (Exception var5_14) {
                    var4_4 = var2_2;
                }
lbl-1000: // 2 sources:
                {
                    var5_13.printStackTrace();
                    if (var4_4 == null) return var4_4;
                    var4_4.setVisibility(8);
                    return var4_4;
                }
            }
            var4_4 = var2_2;
        }
        var6_6 = (a)var4_4.getTag();
        var7_7 = (ChatModel)this.d.get(var1_1);
        var8_8 = var6_6.a;
        var8_8.a.setText((CharSequence)var7_7.getN());
        var8_8.b.setText((CharSequence)var7_7.getM());
        var8_8.c.setText((CharSequence)var7_7.getT());
        if (!TextUtils.isEmpty((CharSequence)var7_7.getRi())) {
            var8_8.l.setText((CharSequence)var7_7.getRm());
            var8_8.m.setText((CharSequence)var7_7.getRn());
            var8_8.n.setVisibility(0);
        } else {
            var8_8.n.setVisibility(8);
        }
        if (var7_7.getLc() > 0) {
            var10_9 = var8_8.g;
            var11_10 = new StringBuilder();
            var11_10.append("");
            var11_10.append(var7_7.getLc());
            var10_9.setText((CharSequence)var11_10.toString());
        } else {
            var8_8.g.setText((CharSequence)"");
        }
        if (this.a(var2_2, var7_7)) {
            var8_8.j.setImageResource(2131231315);
        } else {
            var8_8.j.setImageResource(2131231316);
        }
        var8_8.f.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                if (a.this.h) {
                    if (!a.this.g.contains((Object)var7_7.getTime())) {
                        int n2;
                        String string = var8_8.g.getText().toString();
                        n2 = 0;
                        try {
                            n2 = Integer.parseInt((String)string);
                        }
                        catch (Exception exception) {}
                        if (a.this.a(view, var7_7)) {
                            if (n2 > 1) {
                                TextView textView = var8_8.g;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("");
                                stringBuilder.append(n2 - 1);
                                textView.setText((CharSequence)stringBuilder.toString());
                            } else {
                                var8_8.g.setText((CharSequence)"");
                            }
                            a a2 = a.this;
                            a2.b((Context)a2.e, var7_7);
                            var8_8.j.setImageResource(2131231316);
                            return;
                        }
                        TextView textView = var8_8.g;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("");
                        stringBuilder.append(n2 + 1);
                        textView.setText((CharSequence)stringBuilder.toString());
                        a a3 = a.this;
                        a3.a((Context)a3.e, var7_7);
                        var8_8.j.setImageResource(2131231315);
                        return;
                    }
                    n.b((Context)a.this.e, "Please wait..");
                    return;
                }
                ChatScreenHSV.a((Activity)a.this.e);
            }
        });
        var8_8.h.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                if (a.this.h) {
                    a.this.a(var7_7);
                    return;
                }
                ChatScreenHSV.a((Activity)a.this.e);
            }
        });
        var9_11 = this.f != null && this.f.equalsIgnoreCase(var7_7.getI()) != false;
        if (var9_11) {
            var8_8.k.addRule(11);
            var8_8.e.setBackgroundResource(2131230870);
            var8_8.d.setLayoutParams((ViewGroup.LayoutParams)var8_8.k);
            var8_8.a.setTextColor(-10453621);
        } else {
            var8_8.k.addRule(9);
            var8_8.e.setBackgroundResource(2131230876);
            var8_8.d.setLayoutParams((ViewGroup.LayoutParams)var8_8.k);
            var8_8.a.setTextColor(this.e.getResources().getColor(2131099729));
        }
        if (var7_7.isHeighLight()) {
            var7_7.setHeighLight(false);
            this.a((View)var8_8.e);
        }
        var8_8.i.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                if (a.this.h) {
                    ak ak2 = new ak((Context)a.this.e, (View)var8_8.i, 5);
                    ak2.b().inflate(2131558400, ak2.a());
                    String string = GoogleLoginActivity.e((Context)a.this.e);
                    if (string != null && !string.contains((CharSequence)"@mobond.com")) {
                        ak2.a().removeItem(2131297053);
                        ak2.a().removeItem(2131297052);
                        ak2.a().removeItem(2131296589);
                        if (!GoogleLoginActivity.f((Context)a.this.e).equalsIgnoreCase(var7_7.getI())) {
                            ak2.a().removeItem(2131296618);
                        }
                    }
                    ak2.a((ak.b)new 1(this));
                    ak2.c();
                    return;
                }
                ChatScreenHSV.a((Activity)a.this.e);
            }
        });
        return var4_4;
    }

    static class a {
        b a;

        a() {
        }
    }

}

