/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$a
 *  androidx.recyclerview.widget.RecyclerView$x
 *  com.mobond.mindicator.ui.cabs.RecentLocationActivity
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package com.mobond.mindicator.ui.cabs.a;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mobond.mindicator.d;
import com.mobond.mindicator.ui.cabs.RecentLocationActivity;
import com.mobond.mindicator.ui.cabs.a.a;
import com.mobond.mindicator.ui.cabs.b.b;
import java.util.ArrayList;

public class a
extends RecyclerView.a<a> {
    private d a;
    private d b;
    private d c;
    private RecentLocationActivity d;
    private int e;
    private ArrayList<b> f;
    private com.mobond.mindicator.ui.cabs.c.a g;

    public a(d d2, RecentLocationActivity recentLocationActivity, int n2, ArrayList<b> arrayList, com.mobond.mindicator.ui.cabs.c.a a2) {
        this.a = d2;
        this.d = recentLocationActivity;
        this.e = n2;
        this.f = arrayList;
        this.g = a2;
        this.b = new d((Context)recentLocationActivity, "cab_star_one_location", 1);
        this.c = new d((Context)recentLocationActivity, "cab_star_two_location", 1);
    }

    static /* synthetic */ RecentLocationActivity a(a a2) {
        return a2.d;
    }

    static /* synthetic */ int b(a a2) {
        return a2.e;
    }

    static /* synthetic */ com.mobond.mindicator.ui.cabs.c.a c(a a2) {
        return a2.g;
    }

    static /* synthetic */ ArrayList d(a a2) {
        return a2.f;
    }

    static /* synthetic */ d e(a a2) {
        return a2.a;
    }

    static /* synthetic */ d f(a a2) {
        return a2.c;
    }

    static /* synthetic */ d g(a a2) {
        return a2.b;
    }

    public a a(ViewGroup viewGroup, int n2) {
        return new a(LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493119, viewGroup, false));
    }

    public void a(a a2, int n2) {
        a2.getAdapterPosition();
        b b2 = (b)this.f.get(n2);
        a2.b.setText((CharSequence)b2.a);
        a2.a.setOnClickListener(new View.OnClickListener(this, b2){
            final /* synthetic */ b a;
            final /* synthetic */ a b;
            {
                this.b = a2;
                this.a = b2;
            }

            public void onClick(View view) {
                android.content.Intent intent = new android.content.Intent((Context)a.a(this.b), com.mobond.mindicator.ui.cabs.SelectLocationActivity.class);
                intent.setFlags(67108864);
                intent.putExtra("type", a.b(this.b));
                intent.putExtra("address", this.a.a);
                intent.putExtra("lat", java.lang.Double.parseDouble((String)this.a.b));
                intent.putExtra("lng", java.lang.Double.parseDouble((String)this.a.c));
                a.a(this.b).startActivity(intent);
                a.a(this.b).finish();
            }
        });
    }

    public void a(ArrayList<b> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(arrayList.size());
        stringBuilder.append("");
        Log.d((String)"notifyData ", (String)stringBuilder.toString());
        this.f = arrayList;
        if (arrayList.size() == 0) {
            this.d.findViewById(2131297039).setVisibility(0);
            this.d.findViewById(2131297179).setVisibility(8);
        }
        this.notifyDataSetChanged();
    }

    public int getItemCount() {
        ArrayList<b> arrayList = this.f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.x x2, int n2) {
        this.a((a)x2, n2);
    }

    public /* synthetic */ RecyclerView.x onCreateViewHolder(ViewGroup viewGroup, int n2) {
        return this.a(viewGroup, n2);
    }

    class a
    extends RecyclerView.x {
        LinearLayout a;
        TextView b;
        ImageView c;
        ImageView d;

        a(View view) {
            super(view);
            this.a = (LinearLayout)view.findViewById(2131297178);
            this.b = (TextView)view.findViewById(2131297177);
            this.c = (ImageView)view.findViewById(2131296621);
            this.d = (ImageView)view.findViewById(2131297425);
            this.c.setOnClickListener(new View.OnClickListener(this, a.this){
                final /* synthetic */ a a;
                final /* synthetic */ a b;
                {
                    this.b = a2;
                    this.a = a3;
                }

                public void onClick(View view) {
                    if (this.b.getAdapterPosition() >= 0) {
                        a.c(this.b.a.this).a(this.b.getAdapterPosition());
                        return;
                    }
                    a.a(this.b.a.this).findViewById(2131297039).setVisibility(0);
                }
            });
            this.d.setOnClickListener(new View.OnClickListener(this, a.this){
                final /* synthetic */ a a;
                final /* synthetic */ a b;
                {
                    this.b = a2;
                    this.a = a3;
                }

                public void onClick(View view) {
                    androidx.appcompat.app.d$a a2 = new androidx.appcompat.app.d$a((Context)a.a(this.b.a.this));
                    a2.a((CharSequence)"Add to Bookmark?");
                    a2.b((CharSequence)((b)a.d((a)this.b.a.this).get((int)this.b.getAdapterPosition())).a);
                    a2.a(true);
                    a2.c(2131231073);
                    a2.a((CharSequence)"Star 2", new android.content.DialogInterface$OnClickListener(this){
                        final /* synthetic */ 2 a;
                        {
                            this.a = var1_1;
                        }

                        public void onClick(android.content.DialogInterface dialogInterface, int n2) {
                            org.json.JSONArray jSONArray = a.e(this.a.b.a.this).a();
                            try {
                                org.json.JSONObject jSONObject = jSONArray.getJSONObject(this.a.b.getAdapterPosition());
                                a.f(this.a.b.a.this).a(jSONObject);
                                com.mobond.mindicator.ui.n.b((Context)a.a(this.a.b.a.this), "Added as Star 2");
                                a.a(this.a.b.a.this).a();
                                return;
                            }
                            catch (java.lang.Exception exception) {
                                exception.printStackTrace();
                                return;
                            }
                        }
                    });
                    a2.b((CharSequence)"Star 1", new android.content.DialogInterface$OnClickListener(this){
                        final /* synthetic */ 2 a;
                        {
                            this.a = var1_1;
                        }

                        public void onClick(android.content.DialogInterface dialogInterface, int n2) {
                            org.json.JSONArray jSONArray = a.e(this.a.b.a.this).a();
                            try {
                                org.json.JSONObject jSONObject = jSONArray.getJSONObject(this.a.b.getAdapterPosition());
                                a.g(this.a.b.a.this).a(jSONObject);
                                com.mobond.mindicator.ui.n.b((Context)a.a(this.a.b.a.this), "Added as Star 1");
                                a.a(this.a.b.a.this).a();
                                return;
                            }
                            catch (java.lang.Exception exception) {
                                exception.printStackTrace();
                                return;
                            }
                        }
                    });
                    a2.b().show();
                }
            });
        }
    }

}

