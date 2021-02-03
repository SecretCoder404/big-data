/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  android.widget.Toast
 *  com.mobond.mindicator.ui.indianrail.IRActivity
 *  com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Calendar
 */
package com.mobond.mindicator.ui.indianrail.alarm;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.mobond.mindicator.SampleAlarmReceiver;
import com.mobond.mindicator.ui.indianrail.IRActivity;
import com.mobond.mindicator.ui.indianrail.pnrstatus.c;
import com.mobond.mindicator.ui.indianrail.seatavailability.ActivitySeatStatus;
import com.mobond.mindicator.ui.n;
import java.util.Calendar;

public class b {
    private Calendar a;
    private Calendar b;
    private Activity c;
    private a d;
    private c e;

    public b(Activity activity, c c2) {
        this.c = activity;
        this.e = c2;
    }

    private int a(long l2, long l3) {
        return (int)((l2 - l3) / 1000L);
    }

    private String a(Calendar calendar) {
        Object object;
        int n2 = 12;
        int n3 = calendar.get(n2);
        int n4 = calendar.get(10);
        StringBuilder stringBuilder = new StringBuilder();
        if (n4 != 0) {
            n2 = n4;
        }
        stringBuilder.append(n2);
        stringBuilder.append(":");
        if (n3 < 10) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("0");
            stringBuilder2.append(n3);
            object = stringBuilder2.toString();
        } else {
            object = n3;
        }
        stringBuilder.append(object);
        String string = calendar.get(9) == 1 ? " PM" : " AM";
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    private String a(Calendar calendar, int n2) {
        int n3 = n2 - (60 * calendar.get(11) + calendar.get(12));
        if (n3 < 0) {
            n3 += 1440;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append("");
        return stringBuilder.toString();
    }

    private String b(long l2, long l3) {
        StringBuilder stringBuilder;
        String string;
        int n2;
        long l4 = this.a(l2, l3);
        if (l4 <= 0L) {
            return "";
        }
        int n3 = 0;
        int n4 = (int)(l4 / 3600L);
        if (n4 > 0) {
            n3 = n4 / 24;
            n2 = (int)(l4 / 60L - (long)(n4 * 60));
        } else {
            n2 = (int)(l4 / 60L);
        }
        String string2 = "";
        if (n3 > 0) {
            String string3;
            n4 -= n3 * 24;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(n3);
            if (n3 == 1) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(" ");
                stringBuilder3.append(this.c.getString(2131755204));
                stringBuilder3.append(" ");
                string3 = stringBuilder3.toString();
            } else {
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append(" ");
                stringBuilder4.append(this.c.getString(2131755205));
                stringBuilder4.append(" ");
                string3 = stringBuilder4.toString();
            }
            stringBuilder2.append(string3);
            string2 = stringBuilder2.toString();
        }
        if (n4 > 0) {
            StringBuilder stringBuilder5;
            String string4;
            String string5;
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append(string2);
            stringBuilder6.append(n4);
            if (n4 > 1) {
                StringBuilder stringBuilder7 = new StringBuilder();
                stringBuilder7.append(" ");
                stringBuilder7.append(this.c.getString(2131755207));
                string4 = stringBuilder7.toString();
            } else {
                StringBuilder stringBuilder8 = new StringBuilder();
                stringBuilder8.append(" ");
                stringBuilder8.append(this.c.getString(2131755206));
                string4 = stringBuilder8.toString();
            }
            stringBuilder6.append(string4);
            stringBuilder6.append(" ");
            stringBuilder6.append(this.c.getString(2131755202));
            stringBuilder6.append(" ");
            stringBuilder6.append(n2);
            if (n2 > 1) {
                stringBuilder5 = new StringBuilder();
                stringBuilder5.append(" ");
                string5 = this.c.getString(2131755210);
            } else {
                stringBuilder5 = new StringBuilder();
                stringBuilder5.append(" ");
                string5 = this.c.getString(2131755209);
            }
            stringBuilder5.append(string5);
            stringBuilder6.append(stringBuilder5.toString());
            stringBuilder6.append(" ");
            stringBuilder6.append(this.c.getString(2131755208));
            return stringBuilder6.toString();
        }
        StringBuilder stringBuilder9 = new StringBuilder();
        stringBuilder9.append(string2);
        stringBuilder9.append(n2);
        if (n2 > 1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(" ");
            string = this.c.getString(2131755210);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(" ");
            string = this.c.getString(2131755209);
        }
        stringBuilder.append(string);
        stringBuilder9.append(stringBuilder.toString());
        stringBuilder9.append(" ");
        stringBuilder9.append(this.c.getString(2131755208));
        return stringBuilder9.toString();
    }

    private String b(Calendar calendar) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(calendar.get(5));
        stringBuilder.append(" ");
        stringBuilder.append(ActivitySeatStatus.e[calendar.get(2)]);
        return stringBuilder.toString();
    }

    public void a(a a2) {
        this.d = a2;
    }

    public void a(final String string, final String string2, final String string3, final int n2, boolean bl, long l2, final String string4) {
        int n3;
        TextView textView;
        int n4;
        TextView textView2;
        int n5;
        TextView textView3;
        final long l3 = System.currentTimeMillis();
        final Dialog dialog = new Dialog((Context)this.c);
        dialog.requestWindowFeature(1);
        dialog.setContentView(2131493051);
        dialog.setCancelable(true);
        if (this.a == null) {
            this.a = Calendar.getInstance();
            this.a.set(13, 0);
            this.a.set(14, 0);
        }
        if (this.b == null) {
            this.b = Calendar.getInstance();
        }
        this.b.setTimeInMillis(l3);
        this.b.set(11, 0);
        this.b.set(12, 0);
        TextView textView4 = (TextView)dialog.findViewById(2131297432);
        final TextView textView5 = (TextView)dialog.findViewById(2131296608);
        final TextView textView6 = (TextView)dialog.findViewById(2131297506);
        final TextView textView7 = (TextView)dialog.findViewById(2131297235);
        TextView textView8 = (TextView)dialog.findViewById(2131296988);
        TextView textView9 = (TextView)dialog.findViewById(2131296619);
        final View view = dialog.findViewById(2131296395);
        View view2 = dialog.findViewById(2131297030);
        final View view3 = dialog.findViewById(2131297507);
        final View view4 = dialog.findViewById(2131297508);
        TextView textView10 = (TextView)dialog.findViewById(2131297362);
        if (com.mobond.mindicator.a.b(this.c).D()) {
            textView4.setTextSize(18.0f);
            textView5.setTextSize(20.0f);
            textView6.setTextSize(16.0f);
            textView7.setTextSize(16.0f);
            textView8.setTextSize(16.0f);
            textView9.setTextSize(15.0f);
            textView10.setTextSize(17.0f);
        }
        if ((n3 = n2 % 10) > 5) {
            n5 = 5 + (n2 - n3);
            n4 = 1;
        } else {
            n5 = n2 - n3;
            n4 = 1;
        }
        final boolean[] arrbl = new boolean[n4];
        arrbl[0] = n4;
        if (bl) {
            int n6;
            textView9.setVisibility(0);
            textView9.setOnClickListener(new View.OnClickListener(){

                public void onClick(View view) {
                    b.this.e.b(n2);
                    dialog.dismiss();
                    IRActivity.a((Context)b.this.c, (String)"DELETE_ALARM");
                    if (b.this.d != null) {
                        b.this.d.b();
                    }
                }
            });
            Calendar calendar = this.a;
            textView = textView4;
            calendar.setTimeInMillis(l2);
            this.b.set(12, n5 - 20);
            if (this.b.getTimeInMillis() < l3) {
                Calendar calendar2 = this.b;
                n6 = 5;
                calendar2.add(n6, 1);
                textView2 = textView8;
            } else {
                n6 = 5;
                Calendar calendar3 = this.a;
                textView2 = textView8;
                if (this.b(calendar3.getTimeInMillis(), l3).isEmpty()) {
                    this.b.add(n6, 1);
                }
            }
            if (this.b.get(n6) == this.a.get(n6)) {
                view.setAlpha(0.5f);
            }
        } else {
            float f2;
            textView = textView4;
            textView2 = textView8;
            this.a.set(this.b.get(1), this.b.get(2), this.b.get(5), 0, n5 - 20);
            if (this.a.getTimeInMillis() < l3) {
                this.b.add(5, 1);
                this.a.add(5, 1);
            } else if (this.b(this.a.getTimeInMillis(), l3).isEmpty()) {
                this.b.add(5, 1);
                this.a.add(5, 1);
            }
            this.a.add(12, -5);
            if (this.b(this.a.getTimeInMillis(), l3).isEmpty()) {
                f2 = 0.5f;
                view3.setAlpha(f2);
                arrbl[0] = false;
            } else {
                f2 = 0.5f;
                view3.setAlpha(1.0f);
            }
            this.a.add(12, 5);
            view.setAlpha(f2);
        }
        if (string3 != null) {
            Object[] arrobject = new Object[2];
            String string5 = string2.contains((CharSequence)"[") ? string2.substring(0, string2.indexOf(91)) : string2;
            arrobject[0] = string5;
            arrobject[1] = string3;
            String string6 = String.format((String)"%s \u2192 %s", (Object[])arrobject);
            textView.setText((CharSequence)string6);
            Activity activity = this.c;
            Object[] arrobject2 = new Object[]{this.a(this.a, n2)};
            String string7 = activity.getString(2131755278, arrobject2);
            textView3 = textView2;
            textView3.setText((CharSequence)string7);
        } else {
            textView3 = textView2;
            dialog.findViewById(2131297432).setVisibility(8);
            textView3.setVisibility(8);
        }
        textView5.setText((CharSequence)this.b(this.a));
        textView6.setText((CharSequence)this.a(this.a));
        textView7.setText((CharSequence)this.b(this.a.getTimeInMillis(), l3));
        final TextView textView11 = textView3;
        View.OnClickListener onClickListener = new View.OnClickListener(){

            public void onClick(View view2) {
                if (b.this.b.get(5) != b.this.a.get(5)) {
                    view.setAlpha(1.0f);
                    b.this.a.add(5, -1);
                    TextView textView = textView5;
                    b b2 = b.this;
                    textView.setText((CharSequence)b2.b(b2.a));
                    TextView textView2 = textView7;
                    b b3 = b.this;
                    textView2.setText((CharSequence)b3.b(b3.a.getTimeInMillis(), l3));
                    if (b.this.b.get(5) == b.this.a.get(5)) {
                        view.setAlpha(0.5f);
                    }
                }
            }
        };
        view.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = new View.OnClickListener(){

            public void onClick(View view2) {
                view.setAlpha(1.0f);
                b.this.a.add(5, 1);
                TextView textView = textView5;
                b b2 = b.this;
                textView.setText((CharSequence)b2.b(b2.a));
                TextView textView2 = textView7;
                b b3 = b.this;
                textView2.setText((CharSequence)b3.b(b3.a.getTimeInMillis(), l3));
            }
        };
        view2.setOnClickListener(onClickListener2);
        View.OnClickListener onClickListener3 = new View.OnClickListener(){

            public void onClick(View view) {
                view4.setAlpha(1.0f);
                if (arrbl[0]) {
                    b.this.a.add(12, -5);
                    TextView textView = textView6;
                    b b2 = b.this;
                    textView.setText((CharSequence)b2.a(b2.a));
                    TextView textView2 = textView5;
                    b b3 = b.this;
                    textView2.setText((CharSequence)b3.b(b3.a));
                    TextView textView3 = textView11;
                    Activity activity = b.this.c;
                    Object[] arrobject = new Object[1];
                    b b4 = b.this;
                    arrobject[0] = b4.a(b4.a, n2);
                    textView3.setText((CharSequence)activity.getString(2131755278, arrobject));
                    TextView textView4 = textView7;
                    Object[] arrobject2 = new Object[1];
                    b b5 = b.this;
                    arrobject2[0] = b5.b(b5.a.getTimeInMillis(), l3);
                    textView4.setText((CharSequence)String.format((String)"%s", (Object[])arrobject2));
                    b.this.a.add(12, -5);
                    b b6 = b.this;
                    if (b6.b(b6.a.getTimeInMillis(), l3).isEmpty()) {
                        view3.setAlpha(0.5f);
                        arrbl[0] = false;
                    } else {
                        view3.setAlpha(1.0f);
                    }
                    b.this.a.add(12, 5);
                }
            }
        };
        view3.setOnClickListener(onClickListener3);
        View.OnClickListener onClickListener4 = new View.OnClickListener(){

            public void onClick(View view) {
                if (n5 != 60 * b.this.a.get(11) + b.this.a.get(12)) {
                    view4.setAlpha(1.0f);
                    view3.setAlpha(1.0f);
                    b.this.a.add(12, 5);
                    TextView textView = textView6;
                    b b2 = b.this;
                    textView.setText((CharSequence)b2.a(b2.a));
                    TextView textView2 = textView5;
                    b b3 = b.this;
                    textView2.setText((CharSequence)b3.b(b3.a));
                    TextView textView3 = textView11;
                    Activity activity = b.this.c;
                    Object[] arrobject = new Object[1];
                    b b4 = b.this;
                    arrobject[0] = b4.a(b4.a, n2);
                    textView3.setText((CharSequence)activity.getString(2131755278, arrobject));
                    TextView textView4 = textView7;
                    b b5 = b.this;
                    textView4.setText((CharSequence)b5.b(b5.a.getTimeInMillis(), l3));
                    arrbl[0] = true;
                    if (n5 == 60 * b.this.a.get(11) + b.this.a.get(12)) {
                        view4.setAlpha(0.5f);
                    }
                }
            }
        };
        view4.setOnClickListener(onClickListener4);
        View.OnClickListener onClickListener5 = new View.OnClickListener(){

            public void onClick(View view) {
                if (!textView7.getText().toString().isEmpty()) {
                    if (string3 != null) {
                        SampleAlarmReceiver.a((Context)b.this.c, string2, string3, n2, string, b.this.a.getTimeInMillis(), string4);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(textView7.getText().toString());
                    stringBuilder.append("\n");
                    stringBuilder.append(b.this.c.getString(2131755211));
                    stringBuilder.append(" ");
                    b b2 = b.this;
                    stringBuilder.append(b2.a(b2.a));
                    stringBuilder.append("\n");
                    b b3 = b.this;
                    stringBuilder.append(b3.b(b3.a));
                    String string5 = stringBuilder.toString();
                    n.e((Context)b.this.c, string5);
                    IRActivity.a((Context)b.this.c, (String)"SET_ALARM");
                    dialog.dismiss();
                    if (b.this.d != null) {
                        b.this.d.a();
                        return;
                    }
                } else {
                    Toast.makeText((Context)b.this.c, (int)2131755354, (int)0).show();
                }
            }
        };
        textView10.setOnClickListener(onClickListener5);
        dialog.show();
    }

    public static interface a {
        public void a();

        public void b();
    }

}

