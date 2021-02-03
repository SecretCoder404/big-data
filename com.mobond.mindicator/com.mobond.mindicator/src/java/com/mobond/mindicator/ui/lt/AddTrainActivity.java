/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.ProgressDialog
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.speech.tts.TextToSpeech
 *  android.speech.tts.TextToSpeech$OnInitListener
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationUtils
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ArrayAdapter
 *  android.widget.AutoCompleteTextView
 *  android.widget.CheckBox
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.RadioButton
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.appcompat.app.d
 *  androidx.appcompat.app.d$a
 *  androidx.appcompat.app.e
 *  androidx.core.content.a
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$a
 *  androidx.recyclerview.widget.RecyclerView$i
 *  androidx.recyclerview.widget.RecyclerView$x
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Calendar
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Vector
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mobond.mindicator.ui.lt;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.login.GoogleLoginActivity;
import com.mobond.mindicator.ui.lt.AddTrainActivity;
import com.mobond.mindicator.ui.lt.trainutils.f;
import com.mobond.mindicator.ui.n;
import com.mobond.mindicator.ui.train.c;
import com.mulo.a.d.i;
import com.mulo.a.d.k;
import com.mulo.a.d.l;
import com.mulo.b.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;

public class AddTrainActivity
extends e {
    static String k;
    static final String[] r;
    ImageView a;
    TextView b;
    RecyclerView c;
    AutoCompleteTextView d;
    AutoCompleteTextView e;
    TextView f;
    public String g = "Airoli,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nAman Lodge,Matheran:UP:NM,Neral:DOWN:NM,,,,\nAmbernath,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nAmbivli,CSMT:UP:C,Kasara:DOWN:C,,,,\nAndheri,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nApta,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nAsangaon,CSMT:UP:C,Kasara:DOWN:C,,,,\nAtgaon,CSMT:UP:C,Kasara:DOWN:C,,,,\nBadlapur,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nBamandongri,Kharkopar:DOWN:U,Nerul/Belapur CBD:UP:U,,,,\nBandra,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nBelapur CBD,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nBhandup,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nBhayander,Churchgate:UP:W,Virar:DOWN:W,,,,\nBhivpuri Road,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nBhiwandi Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nBoisar,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nBorivali,Churchgate:UP:W,Virar/Dahanu:DOWN:W,,,,\nByculla,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nCSMT,Kalyan/Khopoli/Kasara:DOWN:C,Panvel/Andheri/Goregaon:DOWN:H,,,,\nCharni Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nChembur,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nChinchpokli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nChunabhatti,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nChurchgate,Borivali/Virar/Dahanu:DOWN:W,,,,,\nCotton Green,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nCurrey Road,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nDadar,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,\nDahanu Road,Churchgate/Virar:UP:W,Panvel:DOWN:DVP,,,,\nDahisar,Churchgate:UP:W,Virar:DOWN:W,,,,\nDativali,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nDiva Jn,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Panvel/Roha:UP:DPR,Vasai Road:UP:DVP,,\nDockyard Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nDolavli,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nDombivli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Virar/Boisar:UP:DVP,,,\nGTB Nagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nGhansoli,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nGhatkopar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nGoregaon,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,,,\nGovandi,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nGrant Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nHamarapur,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nJite,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nJogeshwari,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,,\nJuchandra Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nJuinagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nJumapatti,Matheran:UP:NM,Neral:DOWN:NM,,,,\nKalamboli,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nKalva,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nKalyan,CSMT:UP:C,Khopoli/Kasara:DOWN:C,,,,\nKaman Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nKandivali,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nKanjur Marg,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nKarjat,CSMT:UP:C,Khopoli:DOWN:C,,,,\nKasara,CSMT:UP:C,,,,,\nKasu,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nKelavli,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nKelva Road,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nKhadavli,CSMT:UP:C,Kasara:DOWN:C,,,,\nKhandeshwar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nKhar Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nKharbao,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nKhardi,CSMT:UP:C,Kasara:DOWN:C,,,,\nKharghar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nKharkopar,Nerul/Belapur CBD:UP:U,,,,,\nKhopoli,CSMT/Karjat:UP:C,,,,,\nKings Circle,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,,,\nKopar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Vasai/Dahanu:UP:DVP,Panvel:DOWN:DVP,,\nKoparkhairne,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nKurla,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel:DOWN:H,Andheri:UP:H,\nLower Parel,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nLowjee,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nMahalakshmi,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMahim Jn,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nMalad,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nManasarovar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nMankhurd,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nMarine Lines,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMasjid,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,\nMatheran,Aman Lodge:DOWN:NM,Neral:DOWN:NM,,,,\nMatunga,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nMatunga Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMira Road,Churchgate:UP:W,Virar:DOWN:W,,,,\nMulund,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nMumbai Central,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,,,,\nMumbra,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nNagothane,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nNahur,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nNaigaon,Churchgate:UP:W,Virar:DOWN:W,,,,\nNalla Sopara,Churchgate:UP:W,Virar:DOWN:W,Panvel:DOWN:DVP,Dahanu-Shuttle:UP:DVP,,\nNavade Road,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nNeral,CSMT:UP:C,Karjat/Khopoli:DOWN:C,Matheran:UP:NM,,,\nNerul,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nNidi,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nNilje,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nUmbermali,CSMT:UP:C,Kasara:DOWN:C,,,,\nPalasdhari,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nPalghar,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nPanvel,CSMT:UP:H,Andheri:UP:H,Thane:UP:T,Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP\nParel,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nPen,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nPrabhadevi,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nRabale,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nRam Mandir,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,,\nRasayani,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nReay Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nRoha,Panvel/Diva:DOWN:DPR,,,,,\nSandhurst Road,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,\nSanpada,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nSanta Cruz,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nSaphale,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nSeawood Darave,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nSewri,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nShahad,CSMT:UP:C,Kasara:DOWN:C,,,,\nShelu,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nSion,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nSomtane,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nTaloja Panchanand,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nThakurli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nThane,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Vashi/Nerul/Panvel:DOWN:T,,,\nThansit,CSMT:UP:C,Kasara:DOWN:C,,,,\nTilaknagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nTitwala,CSMT:UP:C,Kasara:DOWN:C,,,,\nTurbhe,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nUlhas Nagar,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nUmroli Road,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVadala Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nVaitarana,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVangani,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nVangaon,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVasai Road,Churchgate:UP:W,Virar/Dahanu:DOWN:W,Panvel:DOWN:DVP,Dahanu-Shuttle:UP:DVP,,\nVashi,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nVasind,CSMT:UP:C,Kasara:DOWN:C,,,,\nVidyavihar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nVikhroli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nVile Parle,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nVirar,Churchgate:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVithalwadi,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nWaterpipe,Matheran:UP:NM,Neral:DOWN:NM,,,,\nPune,Lonavla:DOWN:P,,,,,\nShivaji Nagar,Pune:UP:P,Lonavla:DOWN:P,,,,\nKhadki,Pune:UP:P,Lonavla:DOWN:P,,,,\nDapodi,Pune:UP:P,Lonavla:DOWN:P,,,,\nKasarwadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nPimpri,Pune:UP:P,Lonavla:DOWN:P,,,,\nChinchwad,Pune:UP:P,Lonavla:DOWN:P,,,,\nAkurdi,Pune:UP:P,Lonavla:DOWN:P,,,,\nDehu Road,Pune:UP:P,Lonavla:DOWN:P,,,,\nBegdewadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nGhorawadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nTalegaon,Pune:UP:P,Lonavla:DOWN:P,,,,\nVadgaon,Pune:UP:P,Lonavla:DOWN:P,,,,\nKanhe,Pune:UP:P,Lonavla:DOWN:P,,,,\nKamshet,Pune:UP:P,Lonavla:DOWN:P,,,,\nMalavli,Pune:UP:P,Lonavla:DOWN:P,,,,\nLonavla,Pune:UP:P,,,,,";
    public ArrayList<String> h = new ArrayList();
    public SparseArray<c> i = new SparseArray();
    Vector<String> j;
    HashMap<String, c> l = new HashMap();
    ArrayList<d> m = new ArrayList();
    ArrayList<d> n = new ArrayList();
    com.mobond.mindicator.b o;
    String p;
    String q;
    int s = -1;
    TextView t;
    TextView u;
    LinearLayout v;
    RelativeLayout w;
    TextToSpeech x;
    ArrayList<d> y = new ArrayList();
    String z = null;

    static {
        r = f.a;
    }

    private ArrayList<String> a(String string, String string2) {
        String string3 = k.a(string2);
        ArrayList arrayList = new ArrayList();
        int n2 = f.a(string, string3);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll((Collection)Arrays.asList((Object[])r));
        if (n2 != 2) {
            Collections.reverse((List)arrayList2);
        }
        boolean bl = false;
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            String string4 = (String)arrayList2.get(i2);
            if (string3.equals((Object)string4)) {
                bl = true;
            }
            if (!bl) continue;
            arrayList.add((Object)string4);
        }
        return arrayList;
    }

    private ArrayList<String> a(String string, String string2, com.mulo.a.d.a a2) {
        String string3 = k.a(string2);
        ArrayList arrayList = new ArrayList();
        if (a2 != null) {
            for (int i2 = 0; i2 < a2.g.size(); ++i2) {
                String string4 = (String)a2.g.get(i2);
                if (string4.equals((Object)string3)) {
                    arrayList.add((Object)string4);
                    continue;
                }
                l l2 = com.mulo.a.d.b.b(string, k.b(string4).toUpperCase(), "Direct Train", 120, false, (Object)this);
                if (l2 == null) continue;
                ArrayList<String> arrayList2 = ((i)l2.d.get((int)0)).r;
                for (int i3 = 0; i3 < arrayList2.size(); ++i3) {
                    if (!((String)arrayList2.get(i3)).equalsIgnoreCase(string3)) continue;
                    arrayList.add((Object)string4);
                }
            }
        }
        return arrayList;
    }

    private void a(int n2) {
        this.a((d)this.n.get(n2), this.p, this.q, n2);
    }

    private void a(Context context) {
        AddTrainActivity.a(context, "vNxAv73uzTk");
    }

    public static void a(Context context, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("vnd.youtube:");
        stringBuilder.append(string);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)stringBuilder.toString()));
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("http://www.youtube.com/watch?v=");
        stringBuilder2.append(string);
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse((String)stringBuilder2.toString()));
        try {
            context.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            context.startActivity(intent2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(AutoCompleteTextView autoCompleteTextView) {
        this.b(autoCompleteTextView);
        String string = k.b(this.d.getText().toString().toUpperCase());
        String string2 = k.b(this.e.getText().toString().toUpperCase());
        if (f.a(string)) {
            this.a(string, string2, f.a(string, string2), "P");
            return;
        }
        try {
            l l2 = com.mulo.a.d.b.b(string, string2, "Direct Train", 120, false, (Object)this);
            if (l2 != null) {
                String string3 = ((i)l2.d.get((int)0)).f;
                this.a(string, string2, ((i)l2.d.get((int)0)).n, string3);
                return;
            }
            this.e();
            return;
        }
        catch (Exception exception) {
            this.e();
            return;
        }
    }

    private void a(AutoCompleteTextView autoCompleteTextView, String string) {
        c c2 = (c)this.l.get((Object)string);
        ArrayList arrayList = new ArrayList();
        if (c2 != null) {
            for (int i2 = 0; i2 < c2.a.size(); ++i2) {
                String string2 = (String)c2.a.get(i2);
                if (string2.equalsIgnoreCase("Destination") || string2.equalsIgnoreCase("Station Map")) continue;
                String[] arrstring = string2.split(":")[0].split("/");
                for (int i3 = 0; i3 < arrstring.length; ++i3) {
                    String string3 = arrstring[i3].split("-")[0];
                    if (string3 == null) continue;
                    l l2 = com.mulo.a.d.b.b(string.toUpperCase(), k.b(string3).toUpperCase(), "Direct Train", 120, false, (Object)this);
                    if (l2 == null) continue;
                    try {
                        arrayList.addAll(((i)l2.d.get((int)0)).r);
                        arrayList.add((Object)string3);
                        continue;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
        }
        HashSet hashSet = new HashSet((Collection)arrayList);
        arrayList.clear();
        arrayList.addAll((Collection)hashSet);
        if (arrayList.size() > 0) {
            autoCompleteTextView.setAdapter((ListAdapter)new ArrayAdapter((Context)this, 17367043, (List)arrayList));
        }
    }

    private void a(d d2, String string, String string2, int n2) {
        String string3 = com.mulo.a.d.h.a(d2.w, d2.p, string2.toUpperCase(), (Object)this);
        if (string3 != null) {
            if (GoogleLoginActivity.b((Context)this)) {
                h h2 = new h();
                h2.a("tn", d2.s);
                h2.a("u", this.o.E());
                h2.a("l", d2.w);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(d2.p.split(" ")[0]);
                stringBuilder.append(" ");
                stringBuilder.append(d2.p.split(" ")[1]);
                h2.a("bt", stringBuilder.toString());
                h2.a("bs", string);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string3.split("#")[0]);
                stringBuilder2.append(" ");
                stringBuilder2.append(string3.split("#")[1]);
                h2.a("at", stringBuilder2.toString());
                h2.a("as", string2);
                h2.a("a", "add");
                h2.a("isvol", "false");
                com.mobond.mindicator.ui.lt.trainutils.a.a(h2, new com.mulo.b.a(this){
                    final /* synthetic */ AddTrainActivity a;
                    {
                        this.a = addTrainActivity;
                    }

                    public void a() {
                    }

                    public void a(byte[] arrby, byte[] arrby2, Object object) {
                    }
                }, (Activity)this);
            }
            this.b(n2);
            return;
        }
        n.d((Context)this, this.getString(2131755156));
    }

    static /* synthetic */ void a(AddTrainActivity addTrainActivity, int n2) {
        addTrainActivity.a(n2);
    }

    static /* synthetic */ void a(AddTrainActivity addTrainActivity, Context context) {
        addTrainActivity.a(context);
    }

    static /* synthetic */ void a(AddTrainActivity addTrainActivity, AutoCompleteTextView autoCompleteTextView) {
        addTrainActivity.a(autoCompleteTextView);
    }

    static /* synthetic */ void a(AddTrainActivity addTrainActivity, AutoCompleteTextView autoCompleteTextView, String string) {
        addTrainActivity.b(autoCompleteTextView, string);
    }

    private void a(String string, String string2, int n2, String string3) {
        this.s = n2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 3);
        calendar.set(12, 0);
        com.mulo.a.d.a a2 = com.mulo.a.d.h.a(string3, n2, string, calendar, false, string2, (Object)this);
        this.m.clear();
        if (a2 != null) {
            this.p = string;
            this.q = string2;
            ArrayList arrayList = new ArrayList();
            if (f.a(string)) {
                arrayList.addAll(this.a(string, this.e.getText().toString().toUpperCase()));
            } else {
                arrayList.addAll(this.a(string, this.e.getText().toString().toUpperCase(), a2));
            }
            for (int i2 = 0; i2 < a2.a.length; ++i2) {
                d d2 = new d();
                d2.b = a2.a[i2].substring(0, a2.a[i2].indexOf(35));
                String string4 = (String)a2.e.get(i2);
                (String)a2.f.get(i2);
                d2.q = string4;
                d2.c = com.mulo.a.d.h.b(string3, a2.a[i2], string, (Object)this);
                if (d2.c.contains((CharSequence)"#E#")) {
                    d2.r = true;
                    d2.c = d2.c.replace((CharSequence)"#E#", (CharSequence)"").trim();
                } else if (d2.c.contains((CharSequence)"#E-BO#")) {
                    if (string.equals((Object)"BORIVALI")) {
                        d2.r = true;
                    }
                    d2.c = d2.c.replace((CharSequence)"#E-BO#", (CharSequence)"").trim();
                }
                d2.a();
                d2.p = a2.a[i2];
                d2.w = string3;
                d2.s = (String)a2.h.get(i2);
                StringBuffer stringBuffer = new StringBuffer(d2.c);
                if (!this.b(k.a(stringBuffer.substring(1 + stringBuffer.lastIndexOf("-")).trim()), (ArrayList<String>)arrayList)) continue;
                this.m.add((Object)d2);
            }
        }
        this.d();
    }

    private void a(String string, ArrayList<d> arrayList) {
        int n2;
        int n3 = 0;
        do {
            int n4 = arrayList.size();
            n2 = 0;
            if (n3 >= n4) break;
            if (string.equals((Object)((d)arrayList.get((int)n3)).s)) {
                n2 = n3;
                break;
            }
            ++n3;
        } while (true);
        this.c.d(n2);
    }

    private void b() {
        this.o = com.mobond.mindicator.a.a((Activity)this);
        this.a = (ImageView)this.findViewById(2131296875);
        this.v = (LinearLayout)this.findViewById(2131296961);
        this.w = (RelativeLayout)this.findViewById(2131296437);
        this.a.setImageResource(2131231325);
        String string = this.o.K();
        if (string != null && string.isEmpty()) {
            TextView textView = this.u;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.o.K());
            stringBuilder.append("");
            textView.setText((CharSequence)stringBuilder.toString());
            this.u.setVisibility(0);
            this.findViewById(2131296876).setVisibility(0);
        } else {
            this.u.setVisibility(8);
            this.findViewById(2131296876).setVisibility(8);
        }
        this.b = (TextView)this.findViewById(2131297627);
        this.f = (TextView)this.findViewById(2131297040);
        this.c = (RecyclerView)this.findViewById(2131297573);
        this.d = (AutoCompleteTextView)this.findViewById(2131296319);
        this.e = (AutoCompleteTextView)this.findViewById(2131296318);
        this.b.setText((CharSequence)"My Trains");
        this.c.setLayoutManager((RecyclerView.i)new LinearLayoutManager((Context)this));
        this.w.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ AddTrainActivity a;
            {
                this.a = addTrainActivity;
            }

            public void onClick(View view) {
                this.a.w.setVisibility(8);
                this.a.v.setVisibility(0);
                this.a.d.requestFocus();
                AddTrainActivity addTrainActivity = this.a;
                addTrainActivity.a((Activity)addTrainActivity, (View)addTrainActivity.d);
                ArrayList arrayList = new ArrayList();
                this.a.c.setAdapter((RecyclerView.a)new RecyclerView.a<a>((ArrayList<d>)arrayList, null){
                    ArrayList<d> a;
                    com.mobond.mindicator.ui.lt.trainutils.b b;
                    boolean c;
                    boolean d;
                    boolean e;
                    String f;
                    boolean g;
                    {
                        this.b = new com.mobond.mindicator.ui.lt.trainutils.b((Context)AddTrainActivity.this.a());
                        this.c = false;
                        this.d = false;
                        this.e = false;
                        this.g = false;
                        this.a = arrayList;
                        this.f = string;
                        this.a();
                    }

                    private int a(String string) {
                        if (string.equalsIgnoreCase("sun")) {
                            return 1;
                        }
                        if (string.equalsIgnoreCase("mon")) {
                            return 2;
                        }
                        if (string.equalsIgnoreCase("tue")) {
                            return 3;
                        }
                        if (string.equalsIgnoreCase("wed")) {
                            return 4;
                        }
                        if (string.equalsIgnoreCase("thu")) {
                            return 5;
                        }
                        if (string.equalsIgnoreCase("fri")) {
                            return 6;
                        }
                        if (string.equalsIgnoreCase("sat")) {
                            return 7;
                        }
                        return 0;
                    }

                    private void a() {
                        AddTrainActivity addTrainActivity = AddTrainActivity.this;
                        addTrainActivity.x = new TextToSpeech((Context)addTrainActivity.a(), new TextToSpeech.OnInitListener(this){
                            final /* synthetic */ b a;
                            {
                                this.a = b2;
                            }

                            public void onInit(int n2) {
                                if (n2 != -1) {
                                    b b2 = this.a;
                                    b2.e = true;
                                    if (b2.AddTrainActivity.this.x.setLanguage(java.util.Locale.ENGLISH) == 0) {
                                        this.a.d = true;
                                    }
                                    if (android.os.Build$VERSION.SDK_INT >= 21 && this.a.AddTrainActivity.this.x.setLanguage(java.util.Locale.forLanguageTag((String)"hin")) == 0) {
                                        this.a.c = true;
                                    }
                                }
                            }
                        });
                    }

                    private void a(int n2) {
                        d.a a2 = new d.a((Context)AddTrainActivity.this.a());
                        a2.b((CharSequence)"Are you sure want to remove this train ?").a((CharSequence)"YES", new DialogInterface.OnClickListener(this, n2){
                            final /* synthetic */ int a;
                            final /* synthetic */ b b;
                            {
                                this.b = b2;
                                this.a = n2;
                            }

                            public void onClick(DialogInterface dialogInterface, int n2) {
                                dialogInterface.dismiss();
                                d d2 = (d)this.b.a.get(this.a);
                                b.a(this.b, d2.s, this.b.AddTrainActivity.this.o.E(), this.a, d2.z);
                            }
                        }).b((CharSequence)"NO", new DialogInterface.OnClickListener(this){
                            final /* synthetic */ b a;
                            {
                                this.a = b2;
                            }

                            public void onClick(DialogInterface dialogInterface, int n2) {
                                dialogInterface.dismiss();
                            }
                        });
                        a2.b().show();
                    }

                    private void a(int n2, String string) {
                        f.b((Context)AddTrainActivity.this.a(), (d)this.a.get(n2));
                        this.a.remove(n2);
                        if (AddTrainActivity.this.c.getAdapter() != null) {
                            AddTrainActivity.this.c.getAdapter().notifyDataSetChanged();
                        }
                        new com.mobond.mindicator.ui.lt.trainutils.b((Context)AddTrainActivity.this.a()).f(string);
                        f.a((Context)AddTrainActivity.this.a(), this.a);
                        if (this.a.size() > 0) {
                            AddTrainActivity.this.f.setVisibility(8);
                        } else {
                            AddTrainActivity.this.f.setVisibility(0);
                        }
                        n.c((Context)AddTrainActivity.this.a(), "Train Removed");
                    }

                    private void a(a a2, String string) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("alertSettings.getLanguage(tn) : ");
                        stringBuilder.append(this.b.e(string));
                        Log.d((String)"11111", (String)stringBuilder.toString());
                        if (this.b.e(string).equals((Object)"hindi")) {
                            a2.s.setChecked(true);
                            return;
                        }
                        if (this.b.e(string).equals((Object)"marathi")) {
                            a2.t.setChecked(true);
                            return;
                        }
                        if (this.b.e(string).equals((Object)"english")) {
                            Log.d((String)"11111", (String)"condition proper");
                            a2.u.setChecked(true);
                        }
                    }

                    static /* synthetic */ void a(b b2, int n2) {
                        b2.a(n2);
                    }

                    static /* synthetic */ void a(b b2, a a2, String string) {
                        b2.a(a2, string);
                    }

                    static /* synthetic */ void a(b b2, String string, String string2, int n2, boolean bl) {
                        b2.a(string, string2, n2, bl);
                    }

                    private void a(final String string, String string2, final int n2, boolean bl) {
                        boolean bl2 = GoogleLoginActivity.b((Context)AddTrainActivity.this.a());
                        if (bl2 && bl) {
                            final ProgressDialog progressDialog = new ProgressDialog((Context)AddTrainActivity.this);
                            progressDialog.setCancelable(false);
                            progressDialog.setMessage((CharSequence)"Removing train..");
                            progressDialog.show();
                            com.mobond.mindicator.ui.lt.trainutils.a.c(string, string2, new com.mulo.b.a(){

                                @Override
                                public void a() {
                                    n.a((Dialog)progressDialog);
                                    n.d((Context)AddTrainActivity.this, "Check Internet");
                                }

                                @Override
                                public void a(byte[] arrby, byte[] arrby2, Object object) {
                                    n.a((Dialog)progressDialog);
                                    try {
                                        JSONObject jSONObject = new JSONObject(new String(arrby));
                                        if (!jSONObject.optString("code").equals((Object)"400")) {
                                            b.this.a(n2, string);
                                            return;
                                        }
                                        n.d((Context)AddTrainActivity.this, jSONObject.getString("message"));
                                        return;
                                    }
                                    catch (JSONException jSONException) {
                                        jSONException.printStackTrace();
                                        n.d((Context)AddTrainActivity.this, "Something went wrong");
                                        return;
                                    }
                                }
                            }, AddTrainActivity.this.a());
                            return;
                        }
                        if (bl2) {
                            com.mobond.mindicator.ui.lt.trainutils.a.c(string, string2, new com.mulo.b.a(){

                                @Override
                                public void a() {
                                }

                                @Override
                                public void a(byte[] arrby, byte[] arrby2, Object object) {
                                }
                            }, AddTrainActivity.this.a());
                        }
                        this.a(n2, string);
                    }

                    public a a(ViewGroup viewGroup, int n2) {
                        return new a(LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131492927, null));
                    }

                    public void a(TextView textView, String string, String string2, boolean bl) {
                        int n2 = this.a(textView.getText().toString().toLowerCase().trim());
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(n2);
                        stringBuilder.append("");
                        if (string.contains((CharSequence)stringBuilder.toString())) {
                            textView.setBackground(AddTrainActivity.this.getResources().getDrawable(2131231339));
                        } else {
                            textView.setBackground(AddTrainActivity.this.getResources().getDrawable(2131231340));
                        }
                        View.OnClickListener onClickListener = new View.OnClickListener(this, string2, n2, bl, textView){
                            final /* synthetic */ String a;
                            final /* synthetic */ int b;
                            final /* synthetic */ boolean c;
                            final /* synthetic */ TextView d;
                            final /* synthetic */ b e;
                            {
                                this.e = b2;
                                this.a = string;
                                this.b = n2;
                                this.c = bl;
                                this.d = textView;
                            }

                            public void onClick(View view) {
                                String string = this.e.b.d(this.a);
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(this.b);
                                stringBuilder.append("");
                                if (string.contains((CharSequence)stringBuilder.toString())) {
                                    StringBuilder stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append(this.b);
                                    stringBuilder2.append("");
                                    if (string.equals((Object)stringBuilder2.toString())) {
                                        n.d((Context)this.e.AddTrainActivity.this.a(), "Atleast one week day need to be selected");
                                    } else {
                                        com.mobond.mindicator.ui.lt.trainutils.b b2 = this.e.b;
                                        String string2 = this.a;
                                        StringBuilder stringBuilder3 = new StringBuilder();
                                        stringBuilder3.append(this.b);
                                        stringBuilder3.append("");
                                        b2.a(string2, string.replace((CharSequence)stringBuilder3.toString(), (CharSequence)""), this.c);
                                    }
                                } else {
                                    com.mobond.mindicator.ui.lt.trainutils.b b3 = this.e.b;
                                    String string3 = this.a;
                                    StringBuilder stringBuilder4 = new StringBuilder();
                                    stringBuilder4.append(string);
                                    stringBuilder4.append(this.b);
                                    stringBuilder4.append("");
                                    b3.a(string3, stringBuilder4.toString(), this.c);
                                }
                                b b4 = this.e;
                                b4.a(this.d, b4.b.d(this.a), this.a, this.c);
                            }
                        };
                        textView.setOnClickListener(onClickListener);
                    }

                    public void a(a a2, int n2) {
                        if (n2 % 2 == 0) {
                            a2.w.setBackgroundResource(2131230838);
                        } else {
                            a2.w.setBackgroundResource(2131231105);
                        }
                        d d2 = (d)this.a.get(n2);
                        if (d2.z) {
                            a2.f.setText((CharSequence)"Volunteer");
                            a2.f.getBackground().setColorFilter(androidx.core.content.a.c((Context)AddTrainActivity.this, (int)2131099822), PorterDuff.Mode.SRC_IN);
                            a2.f.setTextColor(androidx.core.content.a.c((Context)AddTrainActivity.this, (int)2131100264));
                        } else {
                            a2.f.setText((CharSequence)"Alert");
                            a2.f.getBackground().setColorFilter(androidx.core.content.a.c((Context)AddTrainActivity.this, (int)2131099694), PorterDuff.Mode.SRC_IN);
                            a2.f.setTextColor(androidx.core.content.a.c((Context)AddTrainActivity.this, (int)2131100277));
                        }
                        a2.a.setText((CharSequence)d2.b);
                        a2.b.setOnClickListener(new View.OnClickListener(this, n2){
                            final /* synthetic */ int a;
                            final /* synthetic */ b b;
                            {
                                this.b = b2;
                                this.a = n2;
                            }

                            public void onClick(View view) {
                                b.a(this.b, this.a);
                            }
                        });
                        a2.x.setOnClickListener(new View.OnClickListener(this, d2){
                            final /* synthetic */ d a;
                            final /* synthetic */ b b;
                            {
                                this.b = b2;
                                this.a = d2;
                            }

                            public void onClick(View view) {
                                Intent intent = new Intent((Context)this.b.AddTrainActivity.this.a(), com.mobond.mindicator.ui.train.TraceTrainUI2.class);
                                intent.putExtra("selected_route", this.a.w);
                                intent.putExtra("you_are_at", this.a.v.split("-")[0].trim());
                                intent.putExtra("user_selected_dest", this.a.v.split("-")[1].trim());
                                intent.putExtra("selected_train_string", this.a.p);
                                intent.putExtra("tn", this.a.s);
                                intent.putExtra("selected_direction", this.a.x);
                                intent.putExtra("extra_dr", (android.os.Parcelable)this.a);
                                this.b.AddTrainActivity.this.startActivity(intent);
                            }
                        });
                        String string = d2.s;
                        String string2 = this.f;
                        if (string2 != null && !this.g) {
                            if (string.equals((Object)string2)) {
                                Animation animation = AnimationUtils.loadAnimation((Context)AddTrainActivity.this, (int)2130771980);
                                a2.y.setVisibility(0);
                                animation.setAnimationListener(new Animation.AnimationListener(this, a2){
                                    final /* synthetic */ a a;
                                    final /* synthetic */ b b;
                                    {
                                        this.b = b2;
                                        this.a = a2;
                                    }

                                    public void onAnimationEnd(Animation animation) {
                                        this.a.y.setVisibility(8);
                                    }

                                    public void onAnimationRepeat(Animation animation) {
                                    }

                                    public void onAnimationStart(Animation animation) {
                                    }
                                });
                                a2.y.setAnimation(animation);
                                this.g = true;
                            } else {
                                a2.y.setVisibility(8);
                            }
                        } else {
                            a2.y.setVisibility(8);
                        }
                        String[] arrstring = d2.v.split("-");
                        a2.c.setText((CharSequence)arrstring[0].trim());
                        a2.d.setText((CharSequence)arrstring[1].trim());
                        TextView textView = a2.e;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Give alert ");
                        stringBuilder.append(this.b.a(string, d2.z));
                        stringBuilder.append(" min before");
                        textView.setText((CharSequence)stringBuilder.toString());
                        a2.o.setOnClickListener(new View.OnClickListener(this, string, d2, a2){
                            final /* synthetic */ String a;
                            final /* synthetic */ d b;
                            final /* synthetic */ a c;
                            final /* synthetic */ b d;
                            {
                                this.d = b2;
                                this.a = string;
                                this.b = d2;
                                this.c = a2;
                            }

                            public void onClick(View view) {
                                int n2 = this.d.b.a(this.a, this.b.z);
                                TextView textView = this.c.e;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Give alert ");
                                int n3 = n2 + 5;
                                stringBuilder.append(n3);
                                stringBuilder.append(" min before");
                                textView.setText((CharSequence)stringBuilder.toString());
                                this.d.b.a(this.a, n3, (Context)this.d.AddTrainActivity.this.a(), this.b.z);
                            }
                        });
                        a2.n.setOnClickListener(new View.OnClickListener(this, string, d2, a2){
                            final /* synthetic */ String a;
                            final /* synthetic */ d b;
                            final /* synthetic */ a c;
                            final /* synthetic */ b d;
                            {
                                this.d = b2;
                                this.a = string;
                                this.b = d2;
                                this.c = a2;
                            }

                            public void onClick(View view) {
                                int n2 = this.d.b.a(this.a, this.b.z);
                                if (n2 == 0) {
                                    n.d((Context)this.d.AddTrainActivity.this.a(), "Can't make below 0 mins");
                                    return;
                                }
                                TextView textView = this.c.e;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Give alert ");
                                stringBuilder.append(n2 - 5);
                                stringBuilder.append(" min before");
                                textView.setText((CharSequence)stringBuilder.toString());
                                this.d.b.a(this.a, -5 + this.d.b.a(this.a, this.b.z), (Context)this.d.AddTrainActivity.this.a(), this.b.z);
                            }
                        });
                        String string3 = this.b.d(string);
                        this.a(a2.g, string3, string, d2.z);
                        this.a(a2.h, string3, string, d2.z);
                        this.a(a2.i, string3, string, d2.z);
                        this.a(a2.j, string3, string, d2.z);
                        this.a(a2.k, string3, string, d2.z);
                        this.a(a2.l, string3, string, d2.z);
                        this.a(a2.m, string3, string, d2.z);
                        a2.p.setChecked(this.b.a(string));
                        a2.q.setChecked(this.b.b(string));
                        if (this.b.c(string)) {
                            a2.r.setChecked(true);
                            a2.v.setVisibility(0);
                        } else {
                            a2.r.setChecked(false);
                            a2.v.setVisibility(8);
                        }
                        this.a(a2, string);
                        a2.p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this, string, d2){
                            final /* synthetic */ String a;
                            final /* synthetic */ d b;
                            final /* synthetic */ b c;
                            {
                                this.c = b2;
                                this.a = string;
                                this.b = d2;
                            }

                            public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                                this.c.b.a(this.a, bl, this.b.z);
                            }
                        });
                        a2.q.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this, string, d2){
                            final /* synthetic */ String a;
                            final /* synthetic */ d b;
                            final /* synthetic */ b c;
                            {
                                this.c = b2;
                                this.a = string;
                                this.b = d2;
                            }

                            public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                                this.c.b.b(this.a, bl, this.b.z);
                            }
                        });
                        a2.r.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this, string, d2, a2){
                            final /* synthetic */ String a;
                            final /* synthetic */ d b;
                            final /* synthetic */ a c;
                            final /* synthetic */ b d;
                            {
                                this.d = b2;
                                this.a = string;
                                this.b = d2;
                                this.c = a2;
                            }

                            public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                                this.d.b.c(this.a, bl, this.b.z);
                                if (bl) {
                                    if (this.d.e) {
                                        this.c.v.setVisibility(0);
                                        return;
                                    }
                                    n.d((Context)this.d.AddTrainActivity.this.a(), "Your device does not support voice");
                                    return;
                                }
                                this.c.v.setVisibility(8);
                            }
                        });
                        a2.s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this, a2, string, d2){
                            final /* synthetic */ a a;
                            final /* synthetic */ String b;
                            final /* synthetic */ d c;
                            final /* synthetic */ b d;
                            {
                                this.d = b2;
                                this.a = a2;
                                this.b = string;
                                this.c = d2;
                            }

                            public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                                if (bl) {
                                    this.a.u.setChecked(false);
                                    this.a.t.setChecked(false);
                                    if (this.d.c) {
                                        this.d.b.b(this.b, "hindi", this.c.z);
                                        return;
                                    }
                                    this.a.s.setChecked(false);
                                    b.a(this.d, this.a, this.b);
                                    n.d((Context)this.d.AddTrainActivity.this.a(), "Your device does not support hindi language");
                                }
                            }
                        });
                        a2.t.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this, a2, string, d2){
                            final /* synthetic */ a a;
                            final /* synthetic */ String b;
                            final /* synthetic */ d c;
                            final /* synthetic */ b d;
                            {
                                this.d = b2;
                                this.a = a2;
                                this.b = string;
                                this.c = d2;
                            }

                            public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                                if (bl) {
                                    this.a.s.setChecked(false);
                                    this.a.u.setChecked(false);
                                    if (this.d.c) {
                                        this.d.b.b(this.b, "marathi", this.c.z);
                                        return;
                                    }
                                    this.a.t.setChecked(false);
                                    b.a(this.d, this.a, this.b);
                                    n.d((Context)this.d.AddTrainActivity.this.a(), "Your device does not support marathi language");
                                }
                            }
                        });
                        a2.u.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this, a2, string, d2){
                            final /* synthetic */ a a;
                            final /* synthetic */ String b;
                            final /* synthetic */ d c;
                            final /* synthetic */ b d;
                            {
                                this.d = b2;
                                this.a = a2;
                                this.b = string;
                                this.c = d2;
                            }

                            public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                                if (bl) {
                                    this.a.s.setChecked(false);
                                    this.a.t.setChecked(false);
                                    if (this.d.d) {
                                        this.d.b.b(this.b, "english", this.c.z);
                                        return;
                                    }
                                    this.a.u.setChecked(false);
                                    b.a(this.d, this.a, this.b);
                                    n.d((Context)this.d.AddTrainActivity.this.a(), "Your device does not support english language");
                                }
                            }
                        });
                        if (!this.b.e(string).equals((Object)"hindi") && !this.b.e(string).equals((Object)"marathi")) {
                            if (!this.d && this.c) {
                                a2.s.setChecked(true);
                                return;
                            }
                        } else if (!this.c && this.d) {
                            a2.u.setChecked(true);
                        }
                    }

                    public int getItemCount() {
                        return this.a.size();
                    }

                    public /* synthetic */ void onBindViewHolder(RecyclerView.x x2, int n2) {
                        this.a((a)x2, n2);
                    }

                    public /* synthetic */ RecyclerView.x onCreateViewHolder(ViewGroup viewGroup, int n2) {
                        return this.a(viewGroup, n2);
                    }

                    public class a
                    extends RecyclerView.x {
                        TextView a;
                        ImageView b;
                        TextView c;
                        TextView d;
                        TextView e;
                        TextView f;
                        TextView g;
                        TextView h;
                        TextView i;
                        TextView j;
                        TextView k;
                        TextView l;
                        TextView m;
                        ImageView n;
                        ImageView o;
                        CheckBox p;
                        CheckBox q;
                        CheckBox r;
                        RadioButton s;
                        RadioButton t;
                        RadioButton u;
                        LinearLayout v;
                        View w;
                        View x;
                        View y;

                        public a(View view) {
                            super(view);
                            this.w = view.findViewById(2131296974);
                            this.x = view.findViewById(2131296951);
                            this.y = view.findViewById(2131297194);
                            this.a = (TextView)view.findViewById(2131297550);
                            this.f = (TextView)view.findViewById(2131297635);
                            this.b = (ImageView)view.findViewById(2131296871);
                            this.c = (TextView)view.findViewById(2131297443);
                            this.d = (TextView)view.findViewById(2131297441);
                            this.e = (TextView)view.findViewById(2131296367);
                            this.g = (TextView)view.findViewById(2131297593);
                            this.h = (TextView)view.findViewById(2131297602);
                            this.i = (TextView)view.findViewById(2131297603);
                            this.j = (TextView)view.findViewById(2131297601);
                            this.k = (TextView)view.findViewById(2131297591);
                            this.l = (TextView)view.findViewById(2131297599);
                            this.m = (TextView)view.findViewById(2131297600);
                            this.n = (ImageView)view.findViewById(2131296872);
                            this.o = (ImageView)view.findViewById(2131296873);
                            this.p = (CheckBox)view.findViewById(2131296496);
                            this.q = (CheckBox)view.findViewById(2131296497);
                            this.r = (CheckBox)view.findViewById(2131296498);
                            this.s = (RadioButton)view.findViewById(2131297172);
                            this.t = (RadioButton)view.findViewById(2131297173);
                            this.u = (RadioButton)view.findViewById(2131297171);
                            this.v = (LinearLayout)view.findViewById(2131297149);
                        }
                    }

                });
            }
        });
        this.c();
    }

    private void b(int n2) {
        d d2 = (d)this.n.get(n2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.p);
        stringBuilder.append(" - ");
        stringBuilder.append(this.q);
        d2.v = stringBuilder.toString();
        d d3 = (d)this.n.get(n2);
        d3.x = this.s;
        this.y.add((Object)d3);
        f.a((Context)this, this.y);
        this.n.remove(n2);
        if (this.c.getAdapter() != null) {
            this.c.getAdapter().notifyDataSetChanged();
        }
        n.c((Context)this, "Train Added");
        this.d.setText((CharSequence)"");
        this.e.setText((CharSequence)"");
        this.a(k);
        this.b(d3.s);
        for (int i2 = 0; i2 < this.y.size(); ++i2) {
            if (!((d)this.y.get((int)i2)).s.equals((Object)d3.s)) continue;
            this.c.b(i2);
        }
    }

    private void b(AutoCompleteTextView autoCompleteTextView) {
        InputMethodManager inputMethodManager = (InputMethodManager)this.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(autoCompleteTextView.getWindowToken(), 0);
        }
    }

    private void b(AutoCompleteTextView autoCompleteTextView, String string) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((Collection)Arrays.asList((Object[])r));
        arrayList.remove((Object)string);
        if (arrayList.size() > 0) {
            autoCompleteTextView.setAdapter((ListAdapter)new ArrayAdapter((Context)this, 17367043, (List)arrayList));
        }
    }

    static /* synthetic */ void b(AddTrainActivity addTrainActivity, AutoCompleteTextView autoCompleteTextView, String string) {
        addTrainActivity.a(autoCompleteTextView, string);
    }

    private void b(String string) {
        this.c.setLayoutManager((RecyclerView.i)new LinearLayoutManager((Context)this));
        this.y = f.c((Context)this);
        this.c.setAdapter((RecyclerView.a)new /* invalid duplicate definition of identical inner class */);
        if (this.y.size() > 0) {
            this.f.setVisibility(8);
            this.w.setVisibility(0);
            this.v.setVisibility(8);
        } else {
            this.f.setVisibility(0);
            this.w.setVisibility(8);
            this.v.setVisibility(0);
        }
        if (string != null) {
            this.a(string, this.y);
        }
    }

    private boolean b(String string, ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            return true;
        }
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            if (!((String)arrayList.get(i2)).equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
    }

    private void c() {
        this.d.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final /* synthetic */ AddTrainActivity a;
            {
                this.a = addTrainActivity;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n2, long l2) {
                if (f.a(this.a.d.getText().toString().toUpperCase())) {
                    AddTrainActivity addTrainActivity = this.a;
                    AddTrainActivity.a(addTrainActivity, addTrainActivity.e, this.a.d.getText().toString().toUpperCase());
                } else {
                    AddTrainActivity addTrainActivity = this.a;
                    AddTrainActivity.b(addTrainActivity, addTrainActivity.e, this.a.d.getText().toString().toUpperCase());
                }
                if (!this.a.e.getText().toString().isEmpty()) {
                    AddTrainActivity addTrainActivity = this.a;
                    AddTrainActivity.a(addTrainActivity, addTrainActivity.d);
                }
            }
        });
        this.e.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final /* synthetic */ AddTrainActivity a;
            {
                this.a = addTrainActivity;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n2, long l2) {
                if (f.a(this.a.e.getText().toString().toUpperCase())) {
                    AddTrainActivity addTrainActivity = this.a;
                    AddTrainActivity.a(addTrainActivity, addTrainActivity.d, this.a.e.getText().toString().toUpperCase());
                } else {
                    AddTrainActivity addTrainActivity = this.a;
                    AddTrainActivity.b(addTrainActivity, addTrainActivity.d, this.a.e.getText().toString().toUpperCase());
                }
                if (!this.a.d.getText().toString().isEmpty()) {
                    AddTrainActivity addTrainActivity = this.a;
                    AddTrainActivity.a(addTrainActivity, addTrainActivity.e);
                }
            }
        });
        this.d.addTextChangedListener(new TextWatcher(this){
            final /* synthetic */ AddTrainActivity a;
            {
                this.a = addTrainActivity;
            }

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            }

            public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
                if (charSequence.toString().trim().isEmpty()) {
                    AddTrainActivity addTrainActivity = this.a;
                    ArrayAdapter arrayAdapter = new ArrayAdapter((Context)addTrainActivity, 17367043, addTrainActivity.h);
                    this.a.e.setAdapter((ListAdapter)arrayAdapter);
                }
            }
        });
        this.e.addTextChangedListener(new TextWatcher(this){
            final /* synthetic */ AddTrainActivity a;
            {
                this.a = addTrainActivity;
            }

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            }

            public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
                if (charSequence.toString().trim().isEmpty()) {
                    AddTrainActivity addTrainActivity = this.a;
                    ArrayAdapter arrayAdapter = new ArrayAdapter((Context)addTrainActivity, 17367043, addTrainActivity.h);
                    this.a.d.setAdapter((ListAdapter)arrayAdapter);
                }
            }
        });
    }

    private void d() {
        if (this.m.size() > 0) {
            this.n.clear();
            this.n.addAll(this.m);
            this.f();
            if (this.n.size() > 0) {
                this.f.setVisibility(8);
                this.c.setAdapter((RecyclerView.a)new RecyclerView.a<a>(){
                    int a = Color.rgb((int)0, (int)175, (int)0);

                    public a a(ViewGroup viewGroup, int n2) {
                        return new a(LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131492931, null));
                    }

                    public void a(a a2, int n2) {
                        if (n2 % 2 == 0) {
                            a2.e.setBackgroundResource(2131230838);
                        } else {
                            a2.e.setBackgroundResource(2131231006);
                        }
                        d d2 = (d)AddTrainActivity.this.n.get(n2);
                        if (d2.o == 1) {
                            a2.d.setBackgroundColor(this.a);
                        } else if (d2.o == 2) {
                            a2.d.setBackgroundColor(-65536);
                        }
                        if (d2.c.contains((CharSequence)"Ladies")) {
                            a2.d.setBackgroundColor(-38476);
                        }
                        if (d2.c.contains((CharSequence)"HARBOUR")) {
                            a2.d.setBackgroundColor(-10855846);
                        }
                        if (d2.c.contains((CharSequence)"AC ") || d2.c.startsWith("AC")) {
                            a2.d.setBackgroundColor(-16725249);
                        }
                        a2.a.setText((CharSequence)d2.b);
                        a2.b.setText((CharSequence)d2.c);
                        a2.c.setVisibility(0);
                        a2.c.setOnClickListener(new View.OnClickListener(this, n2){
                            final /* synthetic */ int a;
                            final /* synthetic */ a b;
                            {
                                this.b = a2;
                                this.a = n2;
                            }

                            public void onClick(View view) {
                                AddTrainActivity.a(this.b.AddTrainActivity.this, this.a);
                            }
                        });
                    }

                    public int getItemCount() {
                        return AddTrainActivity.this.n.size();
                    }

                    public /* synthetic */ void onBindViewHolder(RecyclerView.x x2, int n2) {
                        this.a((a)x2, n2);
                    }

                    public /* synthetic */ RecyclerView.x onCreateViewHolder(ViewGroup viewGroup, int n2) {
                        return this.a(viewGroup, n2);
                    }

                    public class a
                    extends RecyclerView.x {
                        TextView a;
                        TextView b;
                        TextView c;
                        View d;
                        View e;

                        public a(View view) {
                            super(view);
                            this.d = view.findViewById(2131296571);
                            this.e = view.findViewById(2131296974);
                            this.a = (TextView)view.findViewById(2131297550);
                            this.b = (TextView)view.findViewById(2131297544);
                            this.c = (TextView)view.findViewById(2131296436);
                        }
                    }

                });
                return;
            }
            this.e();
            return;
        }
        this.e();
    }

    private void e() {
        this.n.clear();
        if (this.c.getAdapter() != null) {
            this.c.getAdapter().notifyDataSetChanged();
        }
        this.f.setText((CharSequence)"No Direct Trains Found");
        this.f.setVisibility(0);
    }

    private void f() {
        block0 : for (int i2 = 0; i2 < this.y.size(); ++i2) {
            String string = ((d)this.y.get((int)i2)).s;
            for (int i3 = 0; i3 < this.n.size(); ++i3) {
                if (!string.equals((Object)((d)this.n.get((int)i3)).s)) continue;
                this.n.remove(i3);
                continue block0;
            }
        }
    }

    private void g() {
        this.b((String)null);
    }

    public Activity a() {
        return this;
    }

    public void a(Activity activity, View view) {
        if (view != null) {
            ((InputMethodManager)activity.getSystemService("input_method")).showSoftInput(view, 0);
        }
    }

    public void a(String string) {
        this.i.clear();
        if (this.j == null) {
            this.j = com.mulo.a.d.b.a((Object)this, "local/sdr");
        }
        String[] arrstring = string.split("\n");
        this.h = new ArrayList();
        String string2 = this.getSharedPreferences("m-indicator", 0).getString("city", "mumbai").toLowerCase();
        int n2 = 0;
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            String[] arrstring2 = arrstring[i2].split(",");
            String string3 = arrstring2[0];
            if (string2.equals((Object)"mumbai") ? f.a(k.b(string3)) : string2.equals((Object)"pune") && !f.a(k.b(string3))) continue;
            this.h.add((Object)string3);
            c c2 = new c(string3);
            String string4 = string3.toUpperCase();
            if (this.j.contains((Object)string4)) {
                c2.a.add((Object)"Destination");
            }
            for (int i3 = 0; i3 < arrstring2.length; ++i3) {
                if (i3 == 0) continue;
                c2.a.add((Object)arrstring2[i3]);
            }
            c2.a.add((Object)"Station Map");
            SparseArray<c> sparseArray = this.i;
            int n3 = n2 + 1;
            sparseArray.append(n2, (Object)c2);
            this.l.put((Object)string3.toUpperCase(), (Object)c2);
            n2 = n3;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter((Context)this, 17367043, this.h);
        this.d.setAdapter((ListAdapter)arrayAdapter);
        this.e.setAdapter((ListAdapter)arrayAdapter);
    }

    public void onBackPressed() {
        if (this.v.getVisibility() == 0 && this.y.size() > 0) {
            this.g();
            return;
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492892);
        this.z = this.getIntent().getStringExtra("tntoscroll");
        this.t = (TextView)this.findViewById(2131296425);
        this.u = (TextView)this.findViewById(2131297607);
        this.t.setText((CharSequence)"How it works ?");
        this.t.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ AddTrainActivity a;
            {
                this.a = addTrainActivity;
            }

            public void onClick(View view) {
                AddTrainActivity addTrainActivity = this.a;
                AddTrainActivity.a(addTrainActivity, (Context)addTrainActivity);
            }
        });
        this.b();
        k = this.g;
        this.a(k);
        String string = this.z;
        if (string == null) {
            this.g();
            return;
        }
        this.b(string);
    }

    protected void onDestroy() {
        TextToSpeech textToSpeech = this.x;
        if (textToSpeech != null) {
            textToSpeech.stop();
            this.x.shutdown();
        }
        super.onDestroy();
    }

}

