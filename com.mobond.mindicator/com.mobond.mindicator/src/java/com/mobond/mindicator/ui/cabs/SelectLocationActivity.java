/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.ProgressDialog
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.os.ResultReceiver
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationUtils
 *  android.view.animation.ScaleAnimation
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.appcompat.app.e
 *  androidx.core.content.a
 *  androidx.fragment.app.d
 *  androidx.fragment.app.j
 *  com.google.android.gms.common.api.Status
 *  com.google.android.gms.common.e
 *  com.google.android.gms.maps.a
 *  com.google.android.gms.maps.b
 *  com.google.android.gms.maps.c
 *  com.google.android.gms.maps.c$b
 *  com.google.android.gms.maps.c$c
 *  com.google.android.gms.maps.e
 *  com.google.android.gms.maps.g
 *  com.google.android.gms.maps.model.CameraPosition
 *  com.google.android.gms.maps.model.LatLng
 *  com.google.android.gms.maps.model.LatLngBounds
 *  com.google.android.gms.maps.model.LatLngBounds$a
 *  com.google.android.gms.maps.model.a
 *  com.google.android.gms.maps.model.b
 *  com.google.android.gms.maps.model.e
 *  com.google.android.gms.maps.model.f
 *  com.google.android.libraries.places.api.Places
 *  com.google.android.libraries.places.api.model.LocationBias
 *  com.google.android.libraries.places.api.model.Place
 *  com.google.android.libraries.places.api.model.Place$Field
 *  com.google.android.libraries.places.api.model.RectangularBounds
 *  com.google.android.libraries.places.widget.Autocomplete
 *  com.google.android.libraries.places.widget.Autocomplete$IntentBuilder
 *  com.google.android.libraries.places.widget.model.AutocompleteActivityMode
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.cabs;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.e;
import com.google.android.gms.maps.g;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.f;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.mobond.mindicator.d;
import com.mobond.mindicator.ui.cabs.RecentLocationActivity;
import com.mobond.mindicator.ui.cabs.SelectLocationActivity;
import com.mobond.mindicator.ui.cabs.util.CustomMapFragment;
import com.mobond.mindicator.ui.n;
import com.mobond.policestationlocator.FetchAddressIntentService;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class SelectLocationActivity
extends androidx.appcompat.app.e
implements e {
    private ImageView A;
    private ViewGroup B;
    private String C;
    private double D;
    private double E;
    d a;
    d b;
    d c;
    d d;
    JSONArray e;
    JSONArray f;
    a g;
    LinearLayout h;
    List<Place.Field> i;
    private CustomMapFragment j;
    private int k;
    private JSONObject l;
    private JSONObject m;
    private boolean n = false;
    private com.mobond.mindicator.a.a o;
    private TextView p;
    private TextView q;
    private TextView r;
    private Button s;
    private ImageView t;
    private ProgressDialog u;
    private LatLngBounds v;
    private c w;
    private LatLng x;
    private TextView y;
    private TextView z;

    public SelectLocationActivity() {
        Object[] arrobject = new Place.Field[]{Place.Field.ID, Place.Field.NAME, Place.Field.LAT_LNG, Place.Field.ADDRESS};
        this.i = Arrays.asList((Object[])arrobject);
    }

    public static double a(double d2, int n2) {
        if (n2 >= 0) {
            double d3 = (long)Math.pow((double)10.0, (double)n2);
            Double.isNaN((double)d3);
            double d4 = Math.round((double)(d2 * d3));
            Double.isNaN((double)d4);
            Double.isNaN((double)d3);
            return d4 / d3;
        }
        throw new IllegalArgumentException();
    }

    static /* synthetic */ LatLng a(SelectLocationActivity selectLocationActivity, LatLng latLng) {
        selectLocationActivity.x = latLng;
        return latLng;
    }

    private static LatLngBounds a(LatLng latLng) {
        LatLng latLng2 = new LatLng(0.3 + latLng.a, 0.3 + latLng.b);
        LatLng latLng3 = new LatLng(latLng.a - 0.3, latLng.b - 0.3);
        LatLngBounds latLngBounds = LatLngBounds.a().a(latLng2).a(latLng3).a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("northeast: ");
        stringBuilder.append(latLng2.a);
        stringBuilder.append(", ");
        stringBuilder.append(latLng2.b);
        Log.d((String)"1111", (String)stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("southWest: ");
        stringBuilder2.append(latLng3.a);
        stringBuilder2.append(", ");
        stringBuilder2.append(latLng3.b);
        Log.d((String)"1111", (String)stringBuilder2.toString());
        return latLngBounds;
    }

    static /* synthetic */ JSONObject a(SelectLocationActivity selectLocationActivity) {
        return selectLocationActivity.l;
    }

    private void a(double d2, double d3) {
        CameraPosition cameraPosition = new CameraPosition(new LatLng(d2, d3), 16.0f, this.w.a().c, this.w.a().d);
        this.w.b(b.a((CameraPosition)cameraPosition));
    }

    static /* synthetic */ void a(SelectLocationActivity selectLocationActivity, double d2, double d3) {
        selectLocationActivity.a(d2, d3);
    }

    static /* synthetic */ boolean a(SelectLocationActivity selectLocationActivity, boolean bl) {
        selectLocationActivity.n = bl;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c() {
        int n2 = this.k;
        if (n2 == 1) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("address", (Object)this.C);
                jSONObject.put("lat", this.D);
                jSONObject.put("lng", this.E);
                this.c.a(jSONObject);
                if (this.d.a().length() > 0) {
                    this.u.dismiss();
                    this.setResult(-1);
                    this.finish();
                    return;
                }
                this.u.cancel();
                this.w.a(new f().a(new LatLng(this.D, this.E)).a(com.google.android.gms.maps.model.b.a((int)2131231235)).a("Pickup")).b();
                this.w.b(b.a((LatLng)new LatLng(0.001 + this.D, 0.001 + this.E)));
                this.k = 2;
                this.t.setImageResource(2131231286);
                this.collapseInfoBox((View)this.B);
                this.z.setText(2131755137);
                this.expandInfoBox((View)this.B);
                this.y.setText(2131755552);
                this.p.setText((CharSequence)"");
                Animation animation = AnimationUtils.loadAnimation((Context)this.getApplicationContext(), (int)2130771982);
                this.y.startAnimation(animation);
                Animation animation2 = this.s.getAnimation();
                if (animation2 != null && animation2.hasStarted() && !animation2.hasEnded()) {
                    this.s.clearAnimation();
                }
                this.s.setText(2131755157);
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }
        if (n2 != 2) return;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("address", (Object)this.C);
            jSONObject.put("lat", this.D);
            jSONObject.put("lng", this.E);
            this.d.a(jSONObject);
            if (this.c.a().length() <= 0) return;
            this.u.dismiss();
            this.setResult(-1);
            this.finish();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static /* synthetic */ double d(SelectLocationActivity selectLocationActivity) {
        return selectLocationActivity.D;
    }

    private boolean d() {
        com.google.android.gms.common.e e2 = com.google.android.gms.common.e.a();
        int n2 = e2.a((Context)this);
        if (n2 != 0) {
            if (e2.a(n2)) {
                e2.a((Activity)this, n2, 1011).show();
            } else {
                Toast.makeText((Context)this.getApplicationContext(), (CharSequence)"This device doesn't support Play services, App will not work normally", (int)1).show();
                this.finish();
            }
            return false;
        }
        return true;
    }

    static /* synthetic */ double e(SelectLocationActivity selectLocationActivity) {
        return selectLocationActivity.E;
    }

    static /* synthetic */ JSONObject f(SelectLocationActivity selectLocationActivity) {
        return selectLocationActivity.m;
    }

    static /* synthetic */ c h(SelectLocationActivity selectLocationActivity) {
        return selectLocationActivity.w;
    }

    static /* synthetic */ LatLng i(SelectLocationActivity selectLocationActivity) {
        return selectLocationActivity.x;
    }

    public void a() {
        this.a = new d((Context)this, "cab_star_one_location", 1);
        this.b = new d((Context)this, "cab_star_two_location", 1);
        this.e = this.a.a();
        this.f = this.b.a();
        if (this.e.length() > 0) {
            try {
                this.q.setVisibility(0);
                this.l = this.e.getJSONObject(0);
                this.q.setText((CharSequence)this.l.getString("address"));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        } else {
            this.q.setVisibility(8);
        }
        if (this.f.length() > 0) {
            try {
                this.r.setVisibility(0);
                this.m = this.f.getJSONObject(0);
                this.r.setText((CharSequence)this.m.getString("address"));
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }
        this.r.setVisibility(8);
    }

    public void a(c c2) {
        this.w = c2;
        if (androidx.core.content.a.b((Context)this, (String)"android.permission.ACCESS_FINE_LOCATION") == 0) {
            Log.d((String)"1111", (String)"1111 in onMapReady()");
            this.w.a(true);
            this.w.c().d(false);
            this.w.c().a(true);
            this.w.c().c(false);
            this.w.c().b(false);
            float f2 = this.getResources().getDisplayMetrics().density;
            this.w.a(0, 0, 0, (int)(50.0f * f2));
            this.w.a(new c.b(this){
                final /* synthetic */ SelectLocationActivity a;
                {
                    this.a = selectLocationActivity;
                }

                public void a() {
                    SelectLocationActivity.a(this.a, false);
                    SelectLocationActivity selectLocationActivity = this.a;
                    SelectLocationActivity.a(selectLocationActivity, SelectLocationActivity.h((SelectLocationActivity)selectLocationActivity).a().a);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("FETCHED LAT LNG");
                    stringBuilder.append((Object)SelectLocationActivity.i(this.a));
                    Log.d((String)"MPH", (String)stringBuilder.toString());
                }
            });
            this.w.a(new c.c(this){
                final /* synthetic */ SelectLocationActivity a;
                {
                    this.a = selectLocationActivity;
                }

                public void a() {
                    SelectLocationActivity.a(this.a, true);
                    Log.d((String)"MPH", (String)"MPH camera still moving");
                }
            });
            CameraPosition cameraPosition = new CameraPosition(new LatLng(this.D, this.E), 16.0f, this.w.a().c, this.w.a().d);
            this.w.a(b.a((CameraPosition)cameraPosition));
            try {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)((View)this.j.getView().findViewById(Integer.parseInt((String)"1")).getParent()).findViewById(Integer.parseInt((String)"2")).getLayoutParams();
                layoutParams.addRule(10, 0);
                layoutParams.addRule(12, -1);
                layoutParams.setMargins(0, 0, (int)(16.0f * f2), (int)(f2 * 100.0f));
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    protected void b() {
        Log.d((String)"1111", (String)"1111 startFetchIntentService called");
        Intent intent = new Intent((Context)this, FetchAddressIntentService.class);
        this.g = new ResultReceiver(new Handler()){
            boolean a;
            {
                this.a = true;
            }

            void a() {
                this.a = false;
            }

            protected void onReceiveResult(int n2, Bundle bundle) {
                if (this.a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("1212 onReceiveResult resultcode is: ");
                    stringBuilder.append(n2);
                    Log.d((String)"1212", (String)stringBuilder.toString());
                    if (n2 == 1) {
                        SelectLocationActivity.this.u.cancel();
                        SelectLocationActivity.this.p.setText((CharSequence)"");
                        n.d((Context)SelectLocationActivity.this, "Check Internet");
                        return;
                    }
                    SelectLocationActivity.this.C = bundle.getString("com.mobond.mindicator.RESULT_DATA_KEY");
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("1111 value of Address is:");
                    stringBuilder2.append(SelectLocationActivity.this.C);
                    Log.d((String)"1111", (String)stringBuilder2.toString());
                    SelectLocationActivity.this.D = bundle.getDouble("lat");
                    SelectLocationActivity.this.E = bundle.getDouble("lng");
                    SelectLocationActivity.this.c();
                }
            }
        };
        intent.putExtra("com.mobond.mindicator.RECEIVER", (Parcelable)this.g);
        intent.putExtra("com.mobond.mindicator.LOCATION_DATA_EXTRA", (Parcelable)this.x);
        this.startService(intent);
    }

    public void collapseInfoBox(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener(this, view){
            final /* synthetic */ View a;
            final /* synthetic */ SelectLocationActivity b;
            {
                this.b = selectLocationActivity;
                this.a = view;
            }

            public void onAnimationEnd(Animation animation) {
                this.a.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation((Animation)scaleAnimation);
    }

    public void confirmLocation(View view) {
        if (!this.n && this.x != null) {
            String string;
            this.u = new ProgressDialog((Context)this);
            this.u.setCanceledOnTouchOutside(false);
            this.u.setMessage((CharSequence)"Fetching address..");
            this.u.show();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("7897 mCenterLatLong.latitude: ");
            stringBuilder.append(SelectLocationActivity.a(this.x.a, 5));
            stringBuilder.append("\nmCenterLatLong.longitude: ");
            stringBuilder.append(SelectLocationActivity.a(this.x.b, 5));
            stringBuilder.append("\nlat: ");
            stringBuilder.append(SelectLocationActivity.a(this.D, 5));
            stringBuilder.append("\nlng: ");
            stringBuilder.append(SelectLocationActivity.a(this.E, 5));
            Log.d((String)"7897", (String)stringBuilder.toString());
            if (SelectLocationActivity.a(this.x.a, 5) == SelectLocationActivity.a(this.D, 5) && SelectLocationActivity.a(this.x.b, 5) == SelectLocationActivity.a(this.E, 5) && (string = this.C) != null && !string.isEmpty() && !this.p.getText().equals((Object)"Please Check Internet")) {
                this.c();
                return;
            }
            Log.d((String)"7777", (String)"7777 in startFetchIntentService()");
            this.b();
        }
    }

    public void expandInfoBox(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener(this, view){
            final /* synthetic */ View a;
            final /* synthetic */ SelectLocationActivity b;
            {
                this.b = selectLocationActivity;
                this.a = view;
            }

            public void onAnimationEnd(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                this.a.setVisibility(0);
            }
        });
        view.startAnimation((Animation)scaleAnimation);
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        if (n2 == 126) {
            if (n3 == -1) {
                Place place = Autocomplete.getPlaceFromIntent((Intent)intent);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(place.getName().toString());
                stringBuilder.append(", ");
                stringBuilder.append(place.getAddress().toString());
                this.C = stringBuilder.toString();
                String[] arrstring = String.valueOf((Object)place.getLatLng()).replace((CharSequence)"lat/lng: (", (CharSequence)"").replace((CharSequence)")", (CharSequence)"").split(",");
                String string = arrstring[0];
                String string2 = arrstring[1];
                this.p.setText((CharSequence)this.C);
                Animation animation = this.y.getAnimation();
                if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
                    this.y.clearAnimation();
                }
                this.D = Double.parseDouble((String)string);
                this.E = Double.parseDouble((String)string2);
                this.a(this.D, this.E);
                Animation animation2 = AnimationUtils.loadAnimation((Context)this.getApplicationContext(), (int)2130771982);
                this.s.setText(2131755157);
                this.s.startAnimation(animation2);
                return;
            }
            if (n3 == 2) {
                Status status = Autocomplete.getStatusFromIntent((Intent)intent);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ERROR:");
                stringBuilder.append(status.a());
                Log.d((String)"11MPH", (String)stringBuilder.toString());
                return;
            }
        } else {
            if (n2 == 1011) {
                Toast.makeText((Context)this.getApplicationContext(), (CharSequence)"Rec", (int)0).show();
                return;
            }
            if (n2 == 127 && n3 == -1) {
                String string = intent.getStringExtra("address");
                this.a(intent.getDoubleExtra("lat", 0.0), intent.getDoubleExtra("lng", 0.0));
                this.p.setText((CharSequence)string);
                if (this.k == 1) {
                    Animation animation = AnimationUtils.loadAnimation((Context)this.getApplicationContext(), (int)2130771982);
                    this.y.startAnimation(animation);
                    return;
                }
                Animation animation = AnimationUtils.loadAnimation((Context)this.getApplicationContext(), (int)2130771982);
                this.p.startAnimation(animation);
            }
        }
    }

    public void onBackPressed() {
        ProgressDialog progressDialog;
        a a2 = this.g;
        if (a2 != null) {
            a2.a();
            this.g = null;
        }
        if ((progressDialog = this.u) != null && progressDialog.isShowing()) {
            this.u.dismiss();
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493129);
        if (!Places.isInitialized()) {
            Places.initialize((Context)this.getApplicationContext(), (String)"AIzaSyCz6QgtQ7mSG9NtfjOTyfrTY8pM9lSfTZA");
        }
        this.d();
        this.j = (CustomMapFragment)this.getSupportFragmentManager().a(2131296576);
        this.j.a((e)this);
        this.c = new d((Context)this, "pickup_history", 1);
        this.d = new d((Context)this, "drop_history", 1);
        this.k = this.getIntent().getIntExtra("type", -1);
        this.C = this.getIntent().getStringExtra("address");
        this.D = this.getIntent().getDoubleExtra("lat", 19.02529);
        this.E = this.getIntent().getDoubleExtra("lng", 72.857253);
        this.v = SelectLocationActivity.a(new LatLng(this.D, this.E));
        this.y = (TextView)this.findViewById(2131296837);
        this.p = (TextView)this.findViewById(2131296353);
        this.B = (ViewGroup)this.findViewById(2131297364);
        this.z = (TextView)this.B.findViewById(2131297365);
        this.A = (ImageView)this.B.findViewById(2131297363);
        this.h = (LinearLayout)this.findViewById(2131297423);
        this.q = (TextView)this.findViewById(2131297419);
        this.r = (TextView)this.findViewById(2131297422);
        this.s = (Button)this.findViewById(2131296575);
        this.t = (ImageView)this.findViewById(2131296863);
        this.q.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ SelectLocationActivity a;
            {
                this.a = selectLocationActivity;
            }

            public void onClick(View view) {
                try {
                    SelectLocationActivity.a(this.a, SelectLocationActivity.a(this.a).getString("address"));
                    SelectLocationActivity.c(this.a).setText((CharSequence)SelectLocationActivity.b(this.a));
                    SelectLocationActivity.a(this.a, SelectLocationActivity.a(this.a).getDouble("lat"));
                    SelectLocationActivity.b(this.a, SelectLocationActivity.a(this.a).getDouble("lng"));
                    SelectLocationActivity.a(this.a, SelectLocationActivity.d(this.a), SelectLocationActivity.e(this.a));
                    return;
                }
                catch (org.json.JSONException jSONException) {
                    jSONException.printStackTrace();
                    return;
                }
            }
        });
        this.r.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ SelectLocationActivity a;
            {
                this.a = selectLocationActivity;
            }

            public void onClick(View view) {
                try {
                    SelectLocationActivity.a(this.a, SelectLocationActivity.f(this.a).getString("address"));
                    SelectLocationActivity.c(this.a).setText((CharSequence)SelectLocationActivity.b(this.a));
                    SelectLocationActivity.a(this.a, SelectLocationActivity.f(this.a).getDouble("lat"));
                    SelectLocationActivity.b(this.a, SelectLocationActivity.f(this.a).getDouble("lng"));
                    SelectLocationActivity.a(this.a, SelectLocationActivity.d(this.a), SelectLocationActivity.e(this.a));
                    return;
                }
                catch (org.json.JSONException jSONException) {
                    jSONException.printStackTrace();
                    return;
                }
            }
        });
        int n2 = this.k;
        if (n2 == 2) {
            this.s.setText(2131755157);
            this.y.setText(2131755552);
            this.t.setImageResource(2131231286);
            this.z.setText(2131755137);
        } else if (n2 == 1) {
            this.s.setText(2131755157);
            this.y.setText(2131755558);
            this.t.setImageResource(2131231288);
            this.z.setText(2131755138);
        }
        String string = this.C;
        if (string != null) {
            this.p.setText((CharSequence)string);
        }
        this.o = new com.mobond.mindicator.a.a(){

            @Override
            public void a(Location location) {
                super.a(location);
                SelectLocationActivity.this.o.a();
            }
        };
        this.o.a(100);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this){
            final /* synthetic */ SelectLocationActivity a;
            {
                this.a = selectLocationActivity;
            }

            public void run() {
                SelectLocationActivity.g(this.a).a((Activity)this.a);
            }
        }, 1800L);
    }

    protected void onResume() {
        super.onResume();
        this.a();
    }

    public void onWhereToClicked(View view) {
        view.setEnabled(false);
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this, view){
                final /* synthetic */ View a;
                final /* synthetic */ SelectLocationActivity b;
                {
                    this.b = selectLocationActivity;
                    this.a = view;
                }

                public void run() {
                    this.a.setEnabled(true);
                }
            }, 300L);
            this.startActivityForResult(new Autocomplete.IntentBuilder(AutocompleteActivityMode.FULLSCREEN, this.i).setLocationBias((LocationBias)RectangularBounds.newInstance((LatLngBounds)this.v)).build((Context)this), 126);
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error");
            stringBuilder.append((Object)exception);
            Toast.makeText((Context)this, (CharSequence)stringBuilder.toString(), (int)0).show();
            return;
        }
    }

    public void recentClicked(View view) {
        Intent intent = new Intent((Context)this, RecentLocationActivity.class);
        intent.putExtra("type", this.k);
        this.startActivityForResult(intent, 127);
    }

}

