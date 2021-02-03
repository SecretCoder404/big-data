/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.BaseExpandableListAdapter
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.core.content.a
 *  com.mobond.mindicator.ui.train.TrainsAtStationUI
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.mobond.mindicator.ui.train.fastestroute;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mobond.mindicator.ui.train.TrainsAtStationUI;
import com.mobond.mindicator.ui.train.fastestroute.RailRouteFinderDividerView;
import com.mobond.mindicator.ui.train.fastestroute.a;
import com.mobond.mindicator.ui.train.fastestroute.c;
import java.util.ArrayList;

public class b
extends BaseExpandableListAdapter {
    View a;
    private Context b;
    private LayoutInflater c;
    private ArrayList<a> d;
    private boolean e = false;
    private float f = 1.0f;

    public b(Context context, ArrayList<a> arrayList, View view) {
        this.b = context;
        this.c = LayoutInflater.from((Context)context);
        this.d = arrayList;
        this.f = context.getResources().getDisplayMetrics().density;
        this.a = view;
    }

    private View a(final a a2, View view, ViewGroup viewGroup, boolean bl) {
        View view2 = view == null ? this.c.inflate(2131493117, viewGroup, false) : view;
        LinearLayout linearLayout = (LinearLayout)view2.findViewById(2131297249);
        int n2 = this.a(a2.c());
        RailRouteFinderDividerView railRouteFinderDividerView = (RailRouteFinderDividerView)view2.findViewById(2131297165);
        railRouteFinderDividerView.setViewColor(n2);
        railRouteFinderDividerView.invalidate();
        RailRouteFinderDividerView railRouteFinderDividerView2 = (RailRouteFinderDividerView)view2.findViewById(2131297154);
        railRouteFinderDividerView2.setViewColor(n2);
        railRouteFinderDividerView2.invalidate();
        RailRouteFinderDividerView railRouteFinderDividerView3 = (RailRouteFinderDividerView)view2.findViewById(2131297164);
        railRouteFinderDividerView3.setViewColor(n2);
        railRouteFinderDividerView3.invalidate();
        RailRouteFinderDividerView railRouteFinderDividerView4 = (RailRouteFinderDividerView)view2.findViewById(2131297153);
        railRouteFinderDividerView4.setViewColor(n2);
        railRouteFinderDividerView4.invalidate();
        switch (3.a[a2.a().ordinal()]) {
            default: {
                break;
            }
            case 8: {
                linearLayout.getLayoutParams().height = (int)this.b.getResources().getDimension(2131165445);
                linearLayout.setBackgroundColor(this.b.getResources().getColor(2131100238));
                if (a2.b() != null) {
                    TextView textView = (TextView)view2.findViewById(2131297161);
                    textView.setText((CharSequence)com.mulo.a.d.c.a(a2.b(), com.mulo.a.d.c.a));
                    textView.setTextSize(this.b.getResources().getDimension(2131165446) / this.f);
                    textView.setTypeface(null, 1);
                    textView.setClickable(true);
                    textView.setTextColor(textView.getResources().getColorStateList(2131100263));
                    textView.setMaxLines(1);
                    textView.setPaintFlags(8 | textView.getPaintFlags());
                    textView.setOnClickListener(new View.OnClickListener(){

                        public void onClick(View view) {
                            Intent intent = new Intent(view.getContext(), TrainsAtStationUI.class);
                            intent.putExtra("selected_route", a2.e());
                            intent.putExtra("you_are_at", a2.b());
                            intent.putExtra("iscallfromfav", false);
                            intent.putExtra("selected_direction", a2.d());
                            intent.putExtra("selected_train_time", a2.f());
                            view.getContext().startActivity(intent);
                        }
                    });
                    TextView textView2 = (TextView)view2.findViewById(2131297160);
                    textView2.setText((CharSequence)com.mulo.a.d.c.a(a2.c(), com.mulo.a.d.c.a));
                    textView2.setTextSize(this.b.getResources().getDimension(2131165444) / this.f);
                    textView2.setTypeface(null, 0);
                    textView2.setTextColor(this.b.getResources().getColor(2131100235));
                    textView2.setVisibility(0);
                }
                if (a2.f() != null) {
                    TextView textView = (TextView)view2.findViewById(2131297162);
                    textView.setText((CharSequence)a2.f());
                    textView.setTextSize(this.b.getResources().getDimension(2131165446) / this.f);
                    textView.setTypeface(null, 1);
                    textView.setTextColor(-16777216);
                    textView.setPaintFlags(-9 & textView.getPaintFlags());
                }
                view2.findViewById(2131297155).setVisibility(4);
                view2.findViewById(2131297159).setVisibility(0);
                view2.findViewById(2131297159).setBackgroundResource(2131231085);
                view2.findViewById(2131297164).setVisibility(4);
                view2.findViewById(2131297165).setVisibility(4);
                view2.findViewById(2131297153).setVisibility(4);
                view2.findViewById(2131297154).setVisibility(0);
                view2.findViewById(2131297156).setVisibility(8);
                view2.findViewById(2131297163).setVisibility(0);
                view2.findViewById(2131297152).setVisibility(0);
                break;
            }
            case 7: {
                int n3;
                int n4;
                int n5;
                linearLayout.getLayoutParams().height = (int)this.b.getResources().getDimension(2131165445);
                linearLayout.setBackgroundColor(this.b.getResources().getColor(2131100238));
                if (a2.b() != null) {
                    TextView textView = (TextView)view2.findViewById(2131297161);
                    textView.setText((CharSequence)com.mulo.a.d.c.a(a2.b(), com.mulo.a.d.c.a));
                    textView.setTextSize(this.b.getResources().getDimension(2131165446) / this.f);
                    textView.setTypeface(null, 1);
                    textView.setTextColor(-16777216);
                    textView.setMaxLines(1);
                    textView.setPaintFlags(-9 & textView.getPaintFlags());
                    TextView textView3 = (TextView)view2.findViewById(2131297160);
                    textView3.setText((CharSequence)com.mulo.a.d.c.a(a2.c(), com.mulo.a.d.c.a));
                    textView3.setTextSize(this.b.getResources().getDimension(2131165444) / this.f);
                    textView3.setTypeface(null, 0);
                    textView3.setTextColor(this.b.getResources().getColor(2131100235));
                    textView3.setVisibility(0);
                }
                if (a2.f() != null) {
                    TextView textView = (TextView)view2.findViewById(2131297162);
                    textView.setText((CharSequence)a2.f());
                    textView.setTextSize(this.b.getResources().getDimension(2131165446) / this.f);
                    textView.setTypeface(null, 1);
                    textView.setTextColor(-16777216);
                    textView.setPaintFlags(-9 & textView.getPaintFlags());
                    n4 = 2131297159;
                } else {
                    n4 = 2131297159;
                }
                view2.findViewById(n4).setVisibility(0);
                view2.findViewById(n4).setBackgroundResource(2131231085);
                ((RailRouteFinderDividerView)view2.findViewById(2131297153)).setDashGap(this.b.getResources().getDimension(2131165436) / this.b.getResources().getDisplayMetrics().density);
                if (this.e) {
                    this.e = false;
                    view2.findViewById(2131297155).setVisibility(0);
                    n5 = 2131297164;
                    n3 = 4;
                } else {
                    View view3 = view2.findViewById(2131297155);
                    n3 = 4;
                    view3.setVisibility(n3);
                    n5 = 2131297164;
                }
                view2.findViewById(n5).setVisibility(n3);
                view2.findViewById(2131297165).setVisibility(0);
                view2.findViewById(2131297153).setVisibility(n3);
                view2.findViewById(2131297154).setVisibility(n3);
                view2.findViewById(2131297156).setVisibility(8);
                view2.findViewById(2131297163).setVisibility(0);
                view2.findViewById(2131297152).setVisibility(0);
                break;
            }
            case 6: {
                int n6;
                linearLayout.getLayoutParams().height = (int)this.b.getResources().getDimension(2131165445);
                linearLayout.setBackgroundColor(-1);
                if (a2.b() != null) {
                    TextView textView = (TextView)view2.findViewById(2131297161);
                    textView.setText((CharSequence)com.mulo.a.d.c.a(a2.b(), com.mulo.a.d.c.a));
                    textView.setTextSize(this.b.getResources().getDimension(2131165435) / this.f);
                    textView.setTypeface(null, 0);
                    textView.setTextColor(-16777216);
                    textView.setMaxLines(2);
                    textView.setPaintFlags(-9 & textView.getPaintFlags());
                    ((TextView)view2.findViewById(2131297160)).setVisibility(8);
                    n6 = 2131297159;
                } else {
                    n6 = 2131297159;
                }
                view2.findViewById(n6).setVisibility(4);
                view2.findViewById(2131297157).setVisibility(4);
                view2.findViewById(2131297158).setVisibility(4);
                view2.findViewById(2131297155).setVisibility(4);
                view2.findViewById(2131297164).setVisibility(4);
                view2.findViewById(2131297165).setVisibility(4);
                view2.findViewById(2131297153).setVisibility(4);
                view2.findViewById(2131297154).setVisibility(4);
                view2.findViewById(2131297156).setVisibility(8);
                view2.findViewById(2131297163).setVisibility(0);
                view2.findViewById(2131297152).setVisibility(0);
                break;
            }
            case 5: {
                int n7;
                linearLayout.getLayoutParams().height = (int)this.b.getResources().getDimension(2131165440);
                linearLayout.setBackgroundColor(this.b.getResources().getColor(2131100238));
                if (a2.b() != null) {
                    TextView textView = (TextView)view2.findViewById(2131297161);
                    textView.setText((CharSequence)com.mulo.a.d.c.a(a2.b(), com.mulo.a.d.c.a));
                    textView.setTextSize(this.b.getResources().getDimension(2131165441) / this.f);
                    textView.setTypeface(null, 1);
                    textView.setTextColor(-16777216);
                    textView.setMaxLines(1);
                    textView.setPaintFlags(-9 & textView.getPaintFlags());
                    ((TextView)view2.findViewById(2131297160)).setVisibility(8);
                }
                if (a2.g() != null && a2.g().size() > 0) {
                    ImageView imageView = (ImageView)view2.findViewById(2131297156);
                    if (bl) {
                        imageView.setBackgroundResource(2131231081);
                    } else {
                        imageView.setBackgroundResource(2131231079);
                    }
                    imageView.setVisibility(0);
                    this.e = true;
                    n7 = 2131297159;
                } else {
                    n7 = 2131297159;
                }
                view2.findViewById(n7).setVisibility(4);
                view2.findViewById(2131297157).setVisibility(4);
                view2.findViewById(2131297158).setVisibility(4);
                view2.findViewById(2131297155).setVisibility(4);
                view2.findViewById(2131297164).setVisibility(4);
                view2.findViewById(2131297165).setVisibility(0);
                view2.findViewById(2131297153).setVisibility(4);
                view2.findViewById(2131297154).setVisibility(0);
                view2.findViewById(2131297163).setVisibility(0);
                view2.findViewById(2131297152).setVisibility(0);
                break;
            }
            case 4: {
                int n8;
                int n9;
                linearLayout.getLayoutParams().height = (int)this.b.getResources().getDimension(2131165442);
                linearLayout.setBackgroundColor(this.b.getResources().getColor(2131100238));
                if (a2.b() != null) {
                    TextView textView = (TextView)view2.findViewById(2131297161);
                    textView.setText((CharSequence)a2.b());
                    textView.setTypeface(null, 0);
                    textView.setTextSize(this.b.getResources().getDimension(2131165443) / this.f);
                    textView.setTextColor(this.b.getResources().getColor(2131099746));
                    textView.setMaxLines(1);
                    textView.setPaintFlags(-9 & textView.getPaintFlags());
                    TextView textView4 = (TextView)view2.findViewById(2131297160);
                    n8 = 4;
                    textView4.setVisibility(n8);
                    n9 = 2131297159;
                } else {
                    n8 = 4;
                    n9 = 2131297159;
                }
                view2.findViewById(n9).setVisibility(n8);
                view2.findViewById(2131297157).setVisibility(n8);
                view2.findViewById(2131297158).setVisibility(n8);
                view2.findViewById(2131297155).setVisibility(n8);
                view2.findViewById(2131297164).setVisibility(n8);
                view2.findViewById(2131297165).setVisibility(0);
                view2.findViewById(2131297153).setVisibility(n8);
                view2.findViewById(2131297154).setVisibility(0);
                view2.findViewById(2131297163).setVisibility(0);
                view2.findViewById(2131297152).setVisibility(0);
                view2.findViewById(2131297156).setVisibility(8);
                break;
            }
            case 3: {
                int n10;
                linearLayout.getLayoutParams().height = (int)this.b.getResources().getDimension(2131165447);
                linearLayout.setBackgroundColor(this.b.getResources().getColor(2131100238));
                if (a2.b() != null) {
                    TextView textView = (TextView)view2.findViewById(2131297161);
                    textView.setText((CharSequence)com.mulo.a.d.c.a(a2.b(), com.mulo.a.d.c.a));
                    textView.setTextSize(this.b.getResources().getDimension(2131165448) / this.f);
                    textView.setTypeface(null, 0);
                    textView.setTextColor(-16777216);
                    textView.setMaxLines(1);
                    textView.setPaintFlags(-9 & textView.getPaintFlags());
                    ((TextView)view2.findViewById(2131297160)).setVisibility(4);
                }
                if (a2.f() != null) {
                    TextView textView = (TextView)view2.findViewById(2131297162);
                    textView.setText((CharSequence)a2.f());
                    textView.setTextSize(this.b.getResources().getDimension(2131165448) / this.f);
                    textView.setTypeface(null, 0);
                    textView.setTextColor(-16777216);
                    n10 = 2131297159;
                } else {
                    n10 = 2131297159;
                }
                view2.findViewById(n10).setVisibility(0);
                view2.findViewById(n10).setBackgroundResource(2131231084);
                view2.findViewById(2131297157).setVisibility(4);
                view2.findViewById(2131297158).setVisibility(4);
                view2.findViewById(2131297155).setVisibility(4);
                view2.findViewById(2131297164).setVisibility(4);
                view2.findViewById(2131297165).setVisibility(0);
                view2.findViewById(2131297153).setVisibility(4);
                view2.findViewById(2131297154).setVisibility(0);
                view2.findViewById(2131297163).setVisibility(0);
                view2.findViewById(2131297152).setVisibility(0);
                view2.findViewById(2131297156).setVisibility(8);
                break;
            }
            case 2: {
                int n11;
                linearLayout.getLayoutParams().height = (int)this.b.getResources().getDimension(2131165445);
                linearLayout.setBackgroundColor(this.b.getResources().getColor(2131100238));
                if (a2.b() != null) {
                    TextView textView = (TextView)view2.findViewById(2131297161);
                    textView.setText((CharSequence)com.mulo.a.d.c.a(a2.b(), com.mulo.a.d.c.a));
                    textView.setTextSize(this.b.getResources().getDimension(2131165446) / this.f);
                    textView.setTypeface(null, 1);
                    textView.setTextColor(-16777216);
                    textView.setMaxLines(1);
                    textView.setPaintFlags(-9 & textView.getPaintFlags());
                    TextView textView5 = (TextView)view2.findViewById(2131297160);
                    textView5.setText((CharSequence)com.mulo.a.d.c.a(a2.c(), com.mulo.a.d.c.a));
                    textView5.setTextSize(this.b.getResources().getDimension(2131165444) / this.f);
                    textView5.setTypeface(null, 0);
                    textView5.setTextColor(this.b.getResources().getColor(2131100235));
                    textView5.setVisibility(0);
                }
                if (a2.f() != null) {
                    TextView textView = (TextView)view2.findViewById(2131297162);
                    textView.setText((CharSequence)a2.f());
                    textView.setTextSize(this.b.getResources().getDimension(2131165446) / this.f);
                    textView.setTypeface(null, 1);
                    textView.setTextColor(-16777216);
                    n11 = 2131297159;
                } else {
                    n11 = 2131297159;
                }
                view2.findViewById(n11).setVisibility(0);
                view2.findViewById(n11).setBackgroundResource(2131231082);
                view2.findViewById(2131297163).setVisibility(0);
                view2.findViewById(2131297152).setVisibility(4);
                view2.findViewById(2131297164).setVisibility(4);
                view2.findViewById(2131297165).setVisibility(0);
                view2.findViewById(2131297153).setVisibility(4);
                view2.findViewById(2131297154).setVisibility(4);
                if (this.e) {
                    this.e = false;
                    view2.findViewById(2131297155).setVisibility(0);
                } else {
                    view2.findViewById(2131297155).setVisibility(4);
                }
                view2.findViewById(2131297156).setVisibility(8);
                break;
            }
            case 1: {
                int n12;
                linearLayout.getLayoutParams().height = (int)this.b.getResources().getDimension(2131165445);
                linearLayout.setBackgroundColor(this.b.getResources().getColor(2131100238));
                if (a2.b() != null) {
                    TextView textView = (TextView)view2.findViewById(2131297161);
                    textView.setText((CharSequence)com.mulo.a.d.c.a(a2.b(), com.mulo.a.d.c.a));
                    textView.setTextSize(this.b.getResources().getDimension(2131165446) / this.f);
                    textView.setTypeface(null, 1);
                    textView.setClickable(true);
                    textView.setTextColor(textView.getResources().getColorStateList(2131100263));
                    textView.setMaxLines(1);
                    textView.setPaintFlags(8 | textView.getPaintFlags());
                    textView.setOnClickListener(new View.OnClickListener(){

                        public void onClick(View view) {
                            Intent intent = new Intent(view.getContext(), TrainsAtStationUI.class);
                            intent.putExtra("selected_route", a2.e());
                            intent.putExtra("you_are_at", a2.b());
                            intent.putExtra("iscallfromfav", false);
                            intent.putExtra("selected_direction", a2.d());
                            intent.putExtra("selected_train_time", a2.f());
                            view.getContext().startActivity(intent);
                        }
                    });
                    TextView textView6 = (TextView)view2.findViewById(2131297160);
                    textView6.setText((CharSequence)com.mulo.a.d.c.a(a2.c(), com.mulo.a.d.c.a));
                    textView6.setTextSize(this.b.getResources().getDimension(2131165444) / this.f);
                    textView6.setTypeface(null, 0);
                    textView6.setTextColor(this.b.getResources().getColor(2131100235));
                    textView6.setVisibility(0);
                }
                if (a2.f() != null) {
                    TextView textView = (TextView)view2.findViewById(2131297162);
                    textView.setText((CharSequence)a2.f());
                    textView.setTextSize(this.b.getResources().getDimension(2131165446) / this.f);
                    textView.setTypeface(null, 1);
                    textView.setTextColor(-16777216);
                    n12 = 2131297159;
                } else {
                    n12 = 2131297159;
                }
                ImageView imageView = (ImageView)view2.findViewById(n12);
                imageView.setVisibility(0);
                imageView.setBackgroundResource(2131231085);
                view2.findViewById(2131297155).setVisibility(4);
                view2.findViewById(2131297164).setVisibility(4);
                view2.findViewById(2131297165).setVisibility(4);
                view2.findViewById(2131297153).setVisibility(4);
                view2.findViewById(2131297154).setVisibility(0);
                view2.findViewById(2131297163).setVisibility(4);
                view2.findViewById(2131297152).setVisibility(4);
                view2.findViewById(2131297156).setVisibility(8);
            }
        }
        if (a2.f() != null) {
            view2.findViewById(2131297162).setVisibility(0);
        } else {
            view2.findViewById(2131297162).setVisibility(4);
        }
        if (a2.h() != null) {
            view2.findViewById(2131297157).setVisibility(0);
            ((TextView)view2.findViewById(2131297157)).setText((CharSequence)a2.h());
        } else {
            view2.findViewById(2131297157).setVisibility(4);
        }
        if (a2.i() != null) {
            view2.findViewById(2131297158).setVisibility(0);
            ((TextView)view2.findViewById(2131297158)).setText((CharSequence)a2.i());
            return view2;
        }
        view2.findViewById(2131297158).setVisibility(4);
        return view2;
    }

    public int a(String string) {
        int n2;
        block18 : {
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1595935537: {
                    if (!string.equals((Object)"Green Line")) break;
                    n2 = 1;
                    break block18;
                }
                case 1092943904: {
                    if (!string.equals((Object)"Yellow Line")) break;
                    n2 = 6;
                    break block18;
                }
                case 1056042200: {
                    if (!string.equals((Object)"Rapid Line")) break;
                    n2 = 3;
                    break block18;
                }
                case -95609099: {
                    if (!string.equals((Object)"Violet Line")) break;
                    n2 = 5;
                    break block18;
                }
                case -400741382: {
                    if (!string.equals((Object)"Blue Line")) break;
                    n2 = 0;
                    break block18;
                }
                case -780045725: {
                    if (!string.equals((Object)"Red Line")) break;
                    n2 = 4;
                    break block18;
                }
                case -2099690842: {
                    if (!string.equals((Object)"Orange Line")) break;
                    n2 = 2;
                    break block18;
                }
            }
            n2 = -1;
        }
        switch (n2) {
            default: {
                return androidx.core.content.a.c((Context)this.b, (int)2131100239);
            }
            case 6: {
                return androidx.core.content.a.c((Context)this.b, (int)2131099822);
            }
            case 5: {
                return androidx.core.content.a.c((Context)this.b, (int)2131099821);
            }
            case 4: {
                return androidx.core.content.a.c((Context)this.b, (int)2131099820);
            }
            case 3: {
                return androidx.core.content.a.c((Context)this.b, (int)2131099819);
            }
            case 2: {
                return androidx.core.content.a.c((Context)this.b, (int)2131099818);
            }
            case 1: {
                return androidx.core.content.a.c((Context)this.b, (int)2131099817);
            }
            case 0: 
        }
        return androidx.core.content.a.c((Context)this.b, (int)2131099816);
    }

    public boolean areAllItemsEnabled() {
        return true;
    }

    public Object getChild(int n2, int n3) {
        return ((a)this.d.get(n2)).g().get(n3);
    }

    public long getChildId(int n2, int n3) {
        return n3;
    }

    public View getChildView(int n2, int n3, boolean bl, View view, ViewGroup viewGroup) {
        return this.a((a)((a)this.d.get(n2)).g().get(n3), view, viewGroup, false);
    }

    public int getChildrenCount(int n2) {
        if (((a)this.d.get(n2)).g() != null) {
            return ((a)this.d.get(n2)).g().size();
        }
        return 0;
    }

    public Object getGroup(int n2) {
        return this.d.get(n2);
    }

    public int getGroupCount() {
        return this.d.size();
    }

    public long getGroupId(int n2) {
        return n2;
    }

    public View getGroupView(int n2, boolean bl, View view, ViewGroup viewGroup) {
        return this.a((a)this.d.get(n2), view, viewGroup, bl);
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int n2, int n3) {
        return true;
    }

    public boolean isEmpty() {
        ArrayList<a> arrayList = this.d;
        return arrayList == null || arrayList.isEmpty();
        {
        }
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

}

