/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$a
 *  androidx.recyclerview.widget.RecyclerView$x
 *  com.mobond.mindicator.ui.cabs.CabsActivity
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.mobond.mindicator.ui.cabs.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mobond.mindicator.ui.cabs.CabsActivity;
import com.mobond.mindicator.ui.cabs.a.b;
import java.util.List;

public class b
extends RecyclerView.a<a> {
    private CabsActivity a;
    private List<com.mobond.mindicator.ui.cabs.b.a> b;

    public b(List<com.mobond.mindicator.ui.cabs.b.a> list, CabsActivity cabsActivity) {
        this.b = list;
        this.a = cabsActivity;
    }

    static /* synthetic */ List a(b b2) {
        return b2.b;
    }

    static /* synthetic */ CabsActivity b(b b2) {
        return b2.a;
    }

    public a a(ViewGroup viewGroup, int n2) {
        return new a(LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131492987, viewGroup, false));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(a var1_1, int var2_2) {
        block13 : {
            block10 : {
                block11 : {
                    block12 : {
                        var3_3 = var1_1.getAdapterPosition();
                        var4_4 = (com.mobond.mindicator.ui.cabs.b.a)this.b.get(var2_2);
                        var1_1.a.setText((CharSequence)var4_4.b);
                        var5_5 = var4_4.g;
                        var6_6 = var4_4.a;
                        var7_7 = var6_6.hashCode();
                        if (var7_7 == 102848) break block10;
                        if (var7_7 == 110116) break block11;
                        if (var7_7 == 3347931) break block12;
                        if (var7_7 != 3582970 || !var6_6.equals((Object)"uber")) ** GOTO lbl-1000
                        var8_8 = 0;
                        break block13;
                    }
                    if (!var6_6.equals((Object)"meru")) ** GOTO lbl-1000
                    var8_8 = 3;
                    break block13;
                }
                if (!var6_6.equals((Object)"ola")) ** GOTO lbl-1000
                var8_8 = 1;
                break block13;
            }
            if (var6_6.equals((Object)"gyr")) {
                var8_8 = 2;
            } else lbl-1000: // 4 sources:
            {
                var8_8 = -1;
            }
        }
        switch (var8_8) {
            default: {
                var1_1.d.setImageResource(2131231308);
                var9_9 = 2131231308;
                ** break;
            }
            case 3: {
                var1_1.d.setImageResource(2131231140);
                var9_9 = 2131231140;
                ** break;
            }
            case 2: {
                var1_1.d.setImageResource(2131231007);
                var9_9 = 2131231007;
                ** break;
            }
            case 1: {
                var1_1.d.setImageResource(2131231228);
                var9_9 = 2131231228;
                ** break;
            }
            case 0: 
        }
        var1_1.d.setImageResource(2131231331);
        var9_9 = 2131231331;
lbl47: // 5 sources:
        var10_10 = var4_4.c;
        if (var10_10 != null) {
            var1_1.b.setText((CharSequence)var10_10);
        } else {
            var1_1.b.setVisibility(8);
        }
        var1_1.c.setText((CharSequence)var4_4.d);
        var11_11 = var1_1.e;
        var12_12 = new View.OnClickListener(this, var3_3, var5_5, var9_9, var4_4, var6_6){
            final /* synthetic */ int a;
            final /* synthetic */ String b;
            final /* synthetic */ int c;
            final /* synthetic */ com.mobond.mindicator.ui.cabs.b.a d;
            final /* synthetic */ String e;
            final /* synthetic */ b f;
            {
                this.f = b2;
                this.a = n2;
                this.b = string;
                this.c = n3;
                this.d = a2;
                this.e = string2;
            }

            public void onClick(View view) {
                String string = ((com.mobond.mindicator.ui.cabs.b.a)b.a((b)this.f).get((int)this.a)).e;
                if (!string.equals((Object)"")) {
                    if (string.isEmpty()) {
                        return;
                    }
                    try {
                        if (string.startsWith("http")) {
                            android.content.Intent intent = new android.content.Intent((Context)b.b(this.f), com.mobond.mindicator.ui.WebUI.class);
                            com.mulo.util.g g2 = new com.mulo.util.g();
                            g2.g = false;
                            g2.a = string;
                            com.mulo.util.e.a(g2.a(), g2);
                            intent.putExtra("webuidatakey", g2.a());
                            b.b(this.f).startActivity(intent);
                            return;
                        }
                        String string2 = this.b.split("=")[1];
                        b.b(this.f).getPackageManager().getPackageInfo(string2, 1);
                        androidx.appcompat.app.d$a a2 = new androidx.appcompat.app.d$a((Context)b.b(this.f));
                        if (this.c != -1) {
                            a2.c(this.c);
                        }
                        a2.a((CharSequence)"BOOK CAB");
                        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                        stringBuilder.append(this.d.b);
                        stringBuilder.append("  ");
                        stringBuilder.append(this.d.c);
                        a2.b((CharSequence)stringBuilder.toString());
                        a2.a(true);
                        java.lang.StringBuilder stringBuilder2 = new java.lang.StringBuilder();
                        stringBuilder2.append("Open ");
                        stringBuilder2.append(this.e.toUpperCase());
                        a2.a((CharSequence)stringBuilder2.toString(), new android.content.DialogInterface$OnClickListener(this){
                            final /* synthetic */ 1 a;
                            {
                                this.a = var1_1;
                            }

                            public void onClick(android.content.DialogInterface dialogInterface, int n2) {
                                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                                intent.setData(android.net.Uri.parse((String)((com.mobond.mindicator.ui.cabs.b.a)b.a((b)this.a.f).get((int)this.a.a)).e));
                                b.b(this.a.f).startActivity(intent);
                            }
                        });
                        a2.b((CharSequence)"Cancel", new android.content.DialogInterface$OnClickListener(this){
                            final /* synthetic */ 1 a;
                            {
                                this.a = var1_1;
                            }

                            public void onClick(android.content.DialogInterface dialogInterface, int n2) {
                                dialogInterface.cancel();
                            }
                        });
                        androidx.appcompat.app.d d2 = a2.b();
                        d2.show();
                        d2.a(-2).setTextColor(-7829368);
                        return;
                    }
                    catch (java.lang.Exception exception) {
                        String string3 = ((com.mobond.mindicator.ui.cabs.b.a)b.a((b)this.f).get((int)this.a)).f;
                        if (string3 != null) {
                            String string4 = com.mulo.b.e.a(string3, (Context)b.b(this.f));
                            android.content.Intent intent = new android.content.Intent((Context)b.b(this.f), com.mobond.mindicator.ui.WebUI.class);
                            com.mulo.util.g g3 = new com.mulo.util.g();
                            g3.g = false;
                            g3.a = string4;
                            com.mulo.util.e.a(g3.a(), g3);
                            intent.putExtra("webuidatakey", g3.a());
                            b.b(this.f).startActivity(intent);
                            return;
                        }
                        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                        stringBuilder.append("1234 get Deeplink Exception: ");
                        stringBuilder.append((Object)((Object)exception));
                        android.util.Log.d((String)"1234", (String)stringBuilder.toString());
                        androidx.appcompat.app.d$a a3 = new androidx.appcompat.app.d$a((Context)b.b(this.f));
                        a3.a((CharSequence)"App Required!");
                        int n2 = this.c;
                        if (n2 != -1) {
                            a3.c(n2);
                        }
                        java.lang.StringBuilder stringBuilder3 = new java.lang.StringBuilder();
                        stringBuilder3.append("Please Install ");
                        stringBuilder3.append(this.e.toUpperCase());
                        stringBuilder3.append(" app from Google Play Store to book cab.");
                        a3.b((CharSequence)stringBuilder3.toString());
                        a3.a(true);
                        a3.a((CharSequence)"Install", new android.content.DialogInterface$OnClickListener(this){
                            final /* synthetic */ 1 a;
                            {
                                this.a = var1_1;
                            }

                            public void onClick(android.content.DialogInterface dialogInterface, int n2) {
                                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse((String)this.a.b));
                                b.b(this.a.f).startActivity(intent);
                            }
                        });
                        a3.b((CharSequence)"Cancel", new android.content.DialogInterface$OnClickListener(this){
                            final /* synthetic */ 1 a;
                            {
                                this.a = var1_1;
                            }

                            public void onClick(android.content.DialogInterface dialogInterface, int n2) {
                                dialogInterface.cancel();
                            }
                        });
                        androidx.appcompat.app.d d3 = a3.b();
                        d3.show();
                        d3.a(-2).setTextColor(-7829368);
                    }
                }
            }
        };
        var11_11.setOnClickListener(var12_12);
    }

    public int getItemCount() {
        return this.b.size();
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.x x2, int n2) {
        this.a((a)x2, n2);
    }

    public /* synthetic */ RecyclerView.x onCreateViewHolder(ViewGroup viewGroup, int n2) {
        return this.a(viewGroup, n2);
    }

    class a
    extends RecyclerView.x {
        TextView a;
        TextView b;
        TextView c;
        ImageView d;
        RelativeLayout e;

        a(View view) {
            super(view);
            this.a = (TextView)view.findViewById(2131296649);
            this.b = (TextView)view.findViewById(2131296722);
            this.c = (TextView)view.findViewById(2131296721);
            this.d = (ImageView)view.findViewById(2131296648);
            this.e = (RelativeLayout)view.findViewById(2131296723);
        }
    }

}

