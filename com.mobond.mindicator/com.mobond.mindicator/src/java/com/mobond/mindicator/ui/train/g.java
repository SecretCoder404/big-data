/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextWatcher
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.Window
 *  android.widget.EditText
 *  android.widget.ExpandableListAdapter
 *  android.widget.ExpandableListView
 *  android.widget.ExpandableListView$OnGroupClickListener
 *  android.widget.ExpandableListView$OnGroupExpandListener
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.fragment.app.d
 *  androidx.fragment.app.e
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Hashtable
 *  java.util.List
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.train;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextWatcher;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mobond.mindicator.ConfigurationManager;
import com.mobond.mindicator.b;
import com.mobond.mindicator.ui.ExpandableHeightListView;
import com.mobond.mindicator.ui.train.TrainActivity;
import com.mobond.mindicator.ui.train.c;
import com.mobond.mindicator.ui.train.d;
import com.mobond.mindicator.ui.train.g;
import com.mobond.mindicator.ui.train.j;
import com.mulo.a.d.f;
import com.mulo.a.d.h;
import com.mulo.b.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class g
extends androidx.fragment.app.d {
    private static boolean C;
    private static String D;
    public static String a;
    static Hashtable<Integer, g> b;
    Activity A;
    private int B = -1;
    private EditText E = null;
    private TextWatcher F = new TextWatcher(this){
        final /* synthetic */ g a;
        {
            this.a = g2;
        }

        public void afterTextChanged(android.text.Editable editable) {
            ((d)this.a.j.getExpandableListAdapter()).getFilter().filter((CharSequence)editable.toString());
            int n2 = this.a.j.getExpandableListAdapter().getGroupCount();
            for (int i2 = 0; i2 < n2; ++i2) {
                this.a.j.collapseGroup(i2);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
        }

        public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
        }
    };
    public String c = "Airoli,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nAman Lodge,Matheran:UP:NM,Neral:DOWN:NM,,,,\nAmbernath,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nAmbivli,CSMT:UP:C,Kasara:DOWN:C,,,,\nAndheri,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nApta,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nAsangaon,CSMT:UP:C,Kasara:DOWN:C,,,,\nAtgaon,CSMT:UP:C,Kasara:DOWN:C,,,,\nBadlapur,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nBamandongri,Kharkopar:DOWN:U,Nerul/Belapur CBD:UP:U,,,,\nBandra,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nBelapur CBD,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nBhandup,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nBhayander,Churchgate:UP:W,Virar:DOWN:W,,,,\nBhivpuri Road,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nBhiwandi Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nBoisar,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nBorivali,Churchgate:UP:W,Virar/Dahanu:DOWN:W,,,,\nByculla,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nCSMT,Kalyan/Khopoli/Kasara:DOWN:C,Panvel/Andheri/Goregaon:DOWN:H,,,,\nCharni Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nChembur,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nChinchpokli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nChunabhatti,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nChurchgate,Borivali/Virar/Dahanu:DOWN:W,,,,,\nCotton Green,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nCurrey Road,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nDadar,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,\nDahanu Road,Churchgate/Virar:UP:W,Panvel:DOWN:DVP,,,,\nDahisar,Churchgate:UP:W,Virar:DOWN:W,,,,\nDativali,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nDiva Jn,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Panvel/Roha:UP:DPR,Vasai Road:UP:DVP,,\nDockyard Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nDolavli,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nDombivli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Virar/Boisar:UP:DVP,,,\nGTB Nagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nGhansoli,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nGhatkopar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nGoregaon,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,,,\nGovandi,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nGrant Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nHamarapur,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nJite,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nJogeshwari,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,,\nJuchandra Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nJuinagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nJumapatti,Matheran:UP:NM,Neral:DOWN:NM,,,,\nKalamboli,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nKalva,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nKalyan,CSMT:UP:C,Khopoli/Kasara:DOWN:C,,,,\nKaman Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nKandivali,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nKanjur Marg,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nKarjat,CSMT:UP:C,Khopoli:DOWN:C,,,,\nKasara,CSMT:UP:C,,,,,\nKasu,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nKelavli,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nKelva Road,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nKhadavli,CSMT:UP:C,Kasara:DOWN:C,,,,\nKhandeshwar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nKhar Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nKharbao,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nKhardi,CSMT:UP:C,Kasara:DOWN:C,,,,\nKharghar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nKharkopar,Nerul/Belapur CBD:UP:U,,,,,\nKhopoli,CSMT/Karjat:UP:C,,,,,\nKings Circle,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,,,\nKopar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Vasai/Dahanu:UP:DVP,Panvel:DOWN:DVP,,\nKoparkhairne,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nKurla,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel:DOWN:H,Andheri:UP:H,\nLower Parel,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nLowjee,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nMahalakshmi,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMahim Jn,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nMalad,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nManasarovar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nMankhurd,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nMarine Lines,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMasjid,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,\nMatheran,Aman Lodge:DOWN:NM,Neral:DOWN:NM,,,,\nMatunga,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nMatunga Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMira Road,Churchgate:UP:W,Virar:DOWN:W,,,,\nMulund,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nMumbai Central,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,,,,\nMumbra,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nNagothane,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nNahur,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nNaigaon,Churchgate:UP:W,Virar:DOWN:W,,,,\nNalla Sopara,Churchgate:UP:W,Virar:DOWN:W,Panvel:DOWN:DVP,Dahanu-Shuttle:UP:DVP,,\nNavade Road,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nNeral,CSMT:UP:C,Karjat/Khopoli:DOWN:C,Matheran:UP:NM,,,\nNerul,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nNidi,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nNilje,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nUmbermali,CSMT:UP:C,Kasara:DOWN:C,,,,\nPalasdhari,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nPalghar,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nPanvel,CSMT:UP:H,Andheri:UP:H,Thane:UP:T,Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP\nParel,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nPen,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nPrabhadevi,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nRabale,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nRam Mandir,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,,\nRasayani,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nReay Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nRoha,Panvel/Diva:DOWN:DPR,,,,,\nSandhurst Road,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,\nSanpada,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nSanta Cruz,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nSaphale,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nSeawood Darave,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nSewri,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nShahad,CSMT:UP:C,Kasara:DOWN:C,,,,\nShelu,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nSion,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nSomtane,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nTaloja Panchanand,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nThakurli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nThane,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Vashi/Nerul/Panvel:DOWN:T,,,\nThansit,CSMT:UP:C,Kasara:DOWN:C,,,,\nTilaknagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nTitwala,CSMT:UP:C,Kasara:DOWN:C,,,,\nTurbhe,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nUlhas Nagar,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nUmroli Road,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVadala Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nVaitarana,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVangani,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nVangaon,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVasai Road,Churchgate:UP:W,Virar/Dahanu:DOWN:W,Panvel:DOWN:DVP,Dahanu-Shuttle:UP:DVP,,\nVashi,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nVasind,CSMT:UP:C,Kasara:DOWN:C,,,,\nVidyavihar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nVikhroli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nVile Parle,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nVirar,Churchgate:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVithalwadi,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nWaterpipe,Matheran:UP:NM,Neral:DOWN:NM,,,,\nPune,Lonavla:DOWN:P,,,,,\nShivaji Nagar,Pune:UP:P,Lonavla:DOWN:P,,,,\nKhadki,Pune:UP:P,Lonavla:DOWN:P,,,,\nDapodi,Pune:UP:P,Lonavla:DOWN:P,,,,\nKasarwadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nPimpri,Pune:UP:P,Lonavla:DOWN:P,,,,\nChinchwad,Pune:UP:P,Lonavla:DOWN:P,,,,\nAkurdi,Pune:UP:P,Lonavla:DOWN:P,,,,\nDehu Road,Pune:UP:P,Lonavla:DOWN:P,,,,\nBegdewadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nGhorawadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nTalegaon,Pune:UP:P,Lonavla:DOWN:P,,,,\nVadgaon,Pune:UP:P,Lonavla:DOWN:P,,,,\nKanhe,Pune:UP:P,Lonavla:DOWN:P,,,,\nKamshet,Pune:UP:P,Lonavla:DOWN:P,,,,\nMalavli,Pune:UP:P,Lonavla:DOWN:P,,,,\nLonavla,Pune:UP:P,,,,,";
    public ArrayList<String> d = new ArrayList();
    public SparseArray<c> e = new SparseArray();
    public ArrayList<String> f = new ArrayList();
    public ArrayList<String> g = new ArrayList();
    public boolean h = true;
    public int i = -1;
    ExpandableListView j;
    b k;
    String l;
    ImageView m;
    LinearLayout n;
    LinearLayout o;
    View p;
    LinearLayout q;
    String r = null;
    String s = null;
    int t = Color.parseColor((String)"#969696");
    int u = Color.parseColor((String)"#FFFFFF");
    int v = Color.parseColor((String)"#000000");
    Vector<String> w;
    j x;
    ExpandableHeightListView y;
    Boolean z = true;

    static /* synthetic */ int a(g g2) {
        return g2.B;
    }

    static /* synthetic */ int a(g g2, int n2) {
        g2.B = n2;
        return n2;
    }

    public static g a(int n2, boolean bl, boolean bl2, String string) {
        g g2;
        if (b == null) {
            b = new Hashtable();
        }
        if (bl) {
            b.clear();
        }
        if ((g2 = (g)((Object)b.get((Object)n2))) == null) {
            g2 = new g();
            Bundle bundle = new Bundle();
            bundle.putInt("section_number", n2);
            g2.setArguments(bundle);
            b.put((Object)n2, (Object)g2);
        }
        C = bl2;
        if (string != null) {
            D = string;
        }
        return g2;
    }

    public static Vector<String> a(Context context) {
        try {
            Vector<String> vector = com.mobond.mindicator.ui.lt.trainutils.a.a.b(context);
            return vector;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    static /* synthetic */ EditText b(g g2) {
        return g2.E;
    }

    public void a() {
        ((TextView)this.p.findViewById(2131297680)).setTextColor(this.t);
        ((TextView)this.p.findViewById(2131297680)).setTypeface(Typeface.DEFAULT);
        ((TextView)this.p.findViewById(2131296502)).setTextColor(this.t);
        ((TextView)this.p.findViewById(2131296502)).setTypeface(Typeface.DEFAULT);
        ((TextView)this.p.findViewById(2131296823)).setTextColor(this.t);
        ((TextView)this.p.findViewById(2131296823)).setTypeface(Typeface.DEFAULT);
        ((TextView)this.p.findViewById(2131297501)).setTextColor(this.t);
        ((TextView)this.p.findViewById(2131297501)).setTypeface(Typeface.DEFAULT);
        ((TextView)this.p.findViewById(2131297017)).setTextColor(this.t);
        ((TextView)this.p.findViewById(2131297017)).setTypeface(Typeface.DEFAULT);
        ((TextView)this.p.findViewById(2131297133)).setTextColor(this.t);
        ((TextView)this.p.findViewById(2131297133)).setTypeface(Typeface.DEFAULT);
        ((TextView)this.p.findViewById(2131296371)).setTextColor(this.t);
        ((TextView)this.p.findViewById(2131296371)).setTypeface(Typeface.DEFAULT);
        ((TextView)this.p.findViewById(2131296601)).setTextColor(this.u);
        ((TextView)this.p.findViewById(2131296601)).setTypeface(Typeface.DEFAULT);
        ((TextView)this.p.findViewById(2131296658)).setTextColor(this.u);
        ((TextView)this.p.findViewById(2131296658)).setTypeface(Typeface.DEFAULT);
        ((TextView)this.p.findViewById(2131296660)).setTextColor(this.u);
        ((TextView)this.p.findViewById(2131296660)).setTypeface(Typeface.DEFAULT);
        ((TextView)this.p.findViewById(2131296662)).setTextColor(this.u);
        ((TextView)this.p.findViewById(2131296662)).setTypeface(Typeface.DEFAULT);
        ((TextView)this.p.findViewById(2131296664)).setTextColor(this.u);
        ((TextView)this.p.findViewById(2131296664)).setTypeface(Typeface.DEFAULT);
        ((TextView)this.p.findViewById(2131296666)).setTextColor(this.u);
        ((TextView)this.p.findViewById(2131296666)).setTypeface(Typeface.DEFAULT);
        ((TextView)this.p.findViewById(2131296668)).setTextColor(this.u);
        ((TextView)this.p.findViewById(2131296668)).setTypeface(Typeface.DEFAULT);
        ((TextView)this.p.findViewById(2131296670)).setTextColor(this.v);
        ((TextView)this.p.findViewById(2131296670)).setTypeface(Typeface.DEFAULT);
    }

    public void a(View view) {
        String string;
        block24 : {
            String string2;
            int n2 = view.getId();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("resid ");
            stringBuilder.append(null);
            Log.d((String)"resid", (String)stringBuilder.toString());
            this.a();
            LinearLayout linearLayout = (LinearLayout)view;
            ((TextView)linearLayout.getChildAt(0)).setTypeface(null, 1);
            ((TextView)linearLayout.getChildAt(0)).setTextColor(-1);
            switch (n2) {
                default: {
                    string = null;
                    break block24;
                }
                case 2131297682: {
                    string = "W";
                    this.E.setHint((CharSequence)this.getString(2131755549));
                    this.E.setText((CharSequence)"");
                    break block24;
                }
                case 2131297502: {
                    string = "T";
                    this.E.setHint((CharSequence)this.getString(2131755535));
                    this.E.setText((CharSequence)"");
                    break block24;
                }
                case 2131297135: {
                    string = "P";
                    this.E.setHint((CharSequence)this.getString(2131755457));
                    this.E.setText((CharSequence)"");
                    break block24;
                }
                case 2131297018: {
                    string = "U";
                    this.E.setHint((CharSequence)this.getString(2131755539));
                    this.E.setText((CharSequence)"");
                    break block24;
                }
                case 2131296825: {
                    string = "H";
                    this.E.setHint((CharSequence)this.getString(2131755193));
                    this.E.setText((CharSequence)"");
                    break block24;
                }
                case 2131296671: {
                    string = "DL_YELLOW";
                    this.E.setHint((CharSequence)"Yellow Line");
                    this.E.setText((CharSequence)"");
                    break block24;
                }
                case 2131296669: {
                    string = "DL_VIOLET";
                    this.E.setHint((CharSequence)"Violet Line");
                    this.E.setText((CharSequence)"");
                    break block24;
                }
                case 2131296667: {
                    string = "DL_RED";
                    this.E.setHint((CharSequence)"Red Line");
                    this.E.setText((CharSequence)"");
                    break block24;
                }
                case 2131296665: {
                    string = "DL_RAPID";
                    this.E.setHint((CharSequence)"Rapid Line");
                    this.E.setText((CharSequence)"");
                    break block24;
                }
                case 2131296663: {
                    string = "DL_ORANGE";
                    this.E.setHint((CharSequence)"Orange Line");
                    this.E.setText((CharSequence)"");
                    break block24;
                }
                case 2131296661: {
                    string = "DL_GREEN";
                    this.E.setHint((CharSequence)"GREEN Line");
                    this.E.setText((CharSequence)"");
                    break block24;
                }
                case 2131296659: {
                    string = "DL_BLUE";
                    this.E.setHint((CharSequence)"Blue Line");
                    this.E.setText((CharSequence)"");
                    break block24;
                }
                case 2131296604: {
                    string2 = "ALL";
                    this.E.setHint((CharSequence)this.getString(2131755558));
                    this.E.setText((CharSequence)"");
                    if (e.a() != null) {
                        this.r = com.mulo.util.e.a(e.a(), null);
                    }
                    if (e.a == null) break;
                    this.s = com.mulo.util.e.a(e.a, null);
                    break;
                }
                case 2131296504: {
                    string = "C";
                    this.E.setHint((CharSequence)this.getString(2131755088));
                    this.E.setText((CharSequence)"");
                    break block24;
                }
                case 2131296373: {
                    string2 = "ALL";
                    this.E.setHint((CharSequence)this.getString(2131755558));
                    this.E.setText((CharSequence)"");
                    if (e.a() != null) {
                        this.r = com.mulo.util.e.a(e.a(), null);
                    }
                    if (e.a == null) break;
                    this.s = com.mulo.util.e.a(e.a(), null);
                }
            }
            string = string2;
        }
        ((TrainActivity)this.getActivity()).e.setText((CharSequence)ConfigurationManager.c(this.getContext()));
        if (string != null) {
            if (string.equals((Object)"ALL")) {
                this.a(a, true, false, true);
                return;
            }
            f f2 = h.b(string, (Object)this.getActivity());
            if (f2 != null) {
                String[] arrstring = f2.a();
                String[] arrstring2 = a.split("\n");
                StringBuilder stringBuilder = new StringBuilder();
                block17 : for (String string3 : arrstring) {
                    for (String string4 : arrstring2) {
                        if (!string4.toLowerCase().startsWith(string3.toLowerCase())) continue;
                        stringBuilder.append(string4);
                        stringBuilder.append("\n");
                        continue block17;
                    }
                }
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                this.a(stringBuilder.toString(), false, true, false);
            }
        }
    }

    public void a(String string, boolean bl, boolean bl2, boolean bl3) {
        int n2;
        Vector<String> vector = g.a((Context)this.getActivity());
        this.e.clear();
        if (this.w == null) {
            this.w = com.mulo.a.d.b.a((Object)this.getActivity(), "local/sdr");
        }
        String[] arrstring = string.split("\n");
        this.d = new ArrayList();
        if (bl) {
            Vector vector2 = new Vector();
            if (vector != null) {
                vector2.addAll(vector);
            }
            vector2.addAll(j.a((Context)this.getActivity(), vector));
            if (e.a() != null) {
                boolean bl4;
                block20 : {
                    String string2 = e.a().toLowerCase();
                    for (int i2 = 0; i2 < vector2.size(); ++i2) {
                        if (!((String)vector2.get(i2)).toLowerCase().startsWith(string2)) continue;
                        vector2.remove(i2);
                        vector2.insertElementAt((Object)e.a(), 0);
                        bl4 = true;
                        break block20;
                    }
                    bl4 = false;
                }
                if (!bl4) {
                    vector2.insertElementAt((Object)e.a(), 0);
                }
            }
            n2 = 0;
            block1 : for (int i3 = 0; i3 < vector2.size(); ++i3) {
                String string3 = (String)vector2.elementAt(i3);
                for (int i4 = 0; i4 < arrstring.length; ++i4) {
                    String[] arrstring2 = arrstring[i4].split(",");
                    String string4 = arrstring2[0].toUpperCase();
                    if (!string4.equals((Object)string3)) continue;
                    c c2 = new c(arrstring2[0]);
                    this.d.add((Object)string4);
                    if (this.w.contains((Object)string4)) {
                        c2.a.add((Object)"Destination");
                    }
                    for (int i5 = 0; i5 < arrstring2.length; ++i5) {
                        if (i5 == 0) continue;
                        c2.a.add((Object)arrstring2[i5]);
                    }
                    c2.a.add((Object)"Station Map");
                    c2.c = true;
                    SparseArray<c> sparseArray = this.e;
                    int n3 = n2 + 1;
                    sparseArray.append(n2, (Object)c2);
                    n2 = n3;
                    continue block1;
                }
            }
        } else {
            n2 = 0;
        }
        if (!bl3) {
            if (e.a() != null) {
                this.r = com.mulo.util.e.a(e.a(), null);
            }
            if (e.a != null) {
                this.s = com.mulo.util.e.a(e.a, null);
            }
        }
        int n4 = n2;
        boolean bl5 = false;
        int n5 = 0;
        for (int i6 = 0; i6 < arrstring.length; ++i6) {
            String[] arrstring3 = arrstring[i6].split(",");
            String string5 = arrstring3[0];
            this.d.add((Object)string5);
            c c3 = new c(string5);
            String string6 = string5.toUpperCase();
            if (this.w.contains((Object)string6)) {
                c3.a.add((Object)"Destination");
            }
            for (int i7 = 0; i7 < arrstring3.length; ++i7) {
                if (i7 == 0) continue;
                c3.a.add((Object)arrstring3[i7]);
            }
            c3.a.add((Object)"Station Map");
            SparseArray<c> sparseArray = this.e;
            int n6 = n4 + 1;
            sparseArray.append(n4, (Object)c3);
            if (!bl3 && (c3.b.equals((Object)this.r) || c3.b.equals((Object)this.s))) {
                n5 = i6;
                bl5 = true;
            }
            n4 = n6;
        }
        d d2 = new d((Activity)this.getActivity(), this.e, bl2, bl3);
        this.j.setAdapter((ExpandableListAdapter)d2);
        if (!bl3 && bl5) {
            d2.e = n5;
            if (n5 == 0) {
                this.j.setSelectedGroup(n5);
                return;
            }
            this.j.setSelectedGroup(n5 - 1);
        }
    }

    /*
     * Exception decompiling
     */
    public void b() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl80 : ALOAD_3 : trying to set 1 previously set to 0
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        this.A = this.getActivity();
        this.k = com.mobond.mindicator.a.a((Activity)this.getActivity());
        this.l = ConfigurationManager.b(this.getContext());
        View view = layoutInflater.inflate(2131493130, viewGroup, false);
        if (this.l.equals((Object)"mumbai")) {
            this.o = (LinearLayout)view.findViewById(2131297575);
            this.c = "Airoli,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nAman Lodge,Matheran:UP:NM,Neral:DOWN:NM,,,,\nAmbernath,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nAmbivli,CSMT:UP:C,Kasara:DOWN:C,,,,\nAndheri,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nApta,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nAsangaon,CSMT:UP:C,Kasara:DOWN:C,,,,\nAtgaon,CSMT:UP:C,Kasara:DOWN:C,,,,\nBadlapur,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nBamandongri,Kharkopar:DOWN:U,Nerul/Belapur CBD:UP:U,,,,\nBandra,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nBelapur CBD,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nBhandup,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nBhayander,Churchgate:UP:W,Virar:DOWN:W,,,,\nBhivpuri Road,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nBhiwandi Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nBoisar,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nBorivali,Churchgate:UP:W,Virar/Dahanu:DOWN:W,,,,\nByculla,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nCSMT,Kalyan/Khopoli/Kasara:DOWN:C,Panvel/Andheri/Goregaon:DOWN:H,,,,\nCharni Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nChembur,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nChinchpokli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nChunabhatti,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nChurchgate,Borivali/Virar/Dahanu:DOWN:W,,,,,\nCotton Green,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nCurrey Road,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nDadar,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,\nDahanu Road,Churchgate/Virar:UP:W,Panvel:DOWN:DVP,,,,\nDahisar,Churchgate:UP:W,Virar:DOWN:W,,,,\nDativali,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nDiva Jn,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Panvel/Roha:UP:DPR,Vasai Road:UP:DVP,,\nDockyard Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nDolavli,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nDombivli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Virar/Boisar:UP:DVP,,,\nGTB Nagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nGhansoli,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nGhatkopar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nGoregaon,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,,,\nGovandi,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nGrant Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nHamarapur,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nJite,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nJogeshwari,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,,\nJuchandra Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nJuinagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nJumapatti,Matheran:UP:NM,Neral:DOWN:NM,,,,\nKalamboli,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nKalva,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nKalyan,CSMT:UP:C,Khopoli/Kasara:DOWN:C,,,,\nKaman Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nKandivali,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nKanjur Marg,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nKarjat,CSMT:UP:C,Khopoli:DOWN:C,,,,\nKasara,CSMT:UP:C,,,,,\nKasu,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nKelavli,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nKelva Road,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nKhadavli,CSMT:UP:C,Kasara:DOWN:C,,,,\nKhandeshwar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nKhar Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nKharbao,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nKhardi,CSMT:UP:C,Kasara:DOWN:C,,,,\nKharghar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nKharkopar,Nerul/Belapur CBD:UP:U,,,,,\nKhopoli,CSMT/Karjat:UP:C,,,,,\nKings Circle,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,,,\nKopar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Vasai/Dahanu:UP:DVP,Panvel:DOWN:DVP,,\nKoparkhairne,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nKurla,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel:DOWN:H,Andheri:UP:H,\nLower Parel,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nLowjee,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nMahalakshmi,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMahim Jn,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nMalad,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nManasarovar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nMankhurd,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nMarine Lines,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMasjid,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,\nMatheran,Aman Lodge:DOWN:NM,Neral:DOWN:NM,,,,\nMatunga,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nMatunga Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMira Road,Churchgate:UP:W,Virar:DOWN:W,,,,\nMulund,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nMumbai Central,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,,,,\nMumbra,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nNagothane,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nNahur,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nNaigaon,Churchgate:UP:W,Virar:DOWN:W,,,,\nNalla Sopara,Churchgate:UP:W,Virar:DOWN:W,Panvel:DOWN:DVP,Dahanu-Shuttle:UP:DVP,,\nNavade Road,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nNeral,CSMT:UP:C,Karjat/Khopoli:DOWN:C,Matheran:UP:NM,,,\nNerul,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nNidi,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nNilje,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nUmbermali,CSMT:UP:C,Kasara:DOWN:C,,,,\nPalasdhari,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nPalghar,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nPanvel,CSMT:UP:H,Andheri:UP:H,Thane:UP:T,Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP\nParel,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nPen,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nPrabhadevi,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nRabale,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nRam Mandir,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,,\nRasayani,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nReay Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nRoha,Panvel/Diva:DOWN:DPR,,,,,\nSandhurst Road,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,\nSanpada,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nSanta Cruz,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nSaphale,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nSeawood Darave,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nSewri,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nShahad,CSMT:UP:C,Kasara:DOWN:C,,,,\nShelu,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nSion,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nSomtane,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nTaloja Panchanand,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nThakurli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nThane,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Vashi/Nerul/Panvel:DOWN:T,,,\nThansit,CSMT:UP:C,Kasara:DOWN:C,,,,\nTilaknagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nTitwala,CSMT:UP:C,Kasara:DOWN:C,,,,\nTurbhe,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nUlhas Nagar,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nUmroli Road,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVadala Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nVaitarana,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVangani,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nVangaon,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVasai Road,Churchgate:UP:W,Virar/Dahanu:DOWN:W,Panvel:DOWN:DVP,Dahanu-Shuttle:UP:DVP,,\nVashi,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nVasind,CSMT:UP:C,Kasara:DOWN:C,,,,\nVidyavihar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nVikhroli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nVile Parle,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nVirar,Churchgate:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVithalwadi,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nWaterpipe,Matheran:UP:NM,Neral:DOWN:NM,,,,\nPune,Lonavla:DOWN:P,,,,,\nShivaji Nagar,Pune:UP:P,Lonavla:DOWN:P,,,,\nKhadki,Pune:UP:P,Lonavla:DOWN:P,,,,\nDapodi,Pune:UP:P,Lonavla:DOWN:P,,,,\nKasarwadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nPimpri,Pune:UP:P,Lonavla:DOWN:P,,,,\nChinchwad,Pune:UP:P,Lonavla:DOWN:P,,,,\nAkurdi,Pune:UP:P,Lonavla:DOWN:P,,,,\nDehu Road,Pune:UP:P,Lonavla:DOWN:P,,,,\nBegdewadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nGhorawadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nTalegaon,Pune:UP:P,Lonavla:DOWN:P,,,,\nVadgaon,Pune:UP:P,Lonavla:DOWN:P,,,,\nKanhe,Pune:UP:P,Lonavla:DOWN:P,,,,\nKamshet,Pune:UP:P,Lonavla:DOWN:P,,,,\nMalavli,Pune:UP:P,Lonavla:DOWN:P,,,,\nLonavla,Pune:UP:P,,,,,";
            Log.d((String)"watchbar", (String)"traintabs");
        } else if (this.l.equals((Object)"delhi")) {
            this.c = "Adarsh Nagar,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nAIIMS,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nAkshardham,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nAnand Vihar ISBT,Vaishali:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nArjangarh,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nAshok Park Main,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nAzadpur,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nBadarpur,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nBadkal Mor,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nBarakhamba Road,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nBata Chowk,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nBelvedere Towers,Sikanderpur Down:DOWN:DL_RAPID,Sikanderpur Up:UP:DL_RAPID,,\nBotanical Garden,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nCentral Secretariate,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,Huda City Centre:DOWN:DL_YELLOW,Huda City Centre:UP:DL_YELLOW\nChandni Chowk,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nChawri Bazar,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nChhattarpur,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nCivil Lines,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nCyber City,Sikanderpur Down:DOWN:DL_RAPID,Sikanderpur Up:UP:DL_RAPID,,\nDelhi Aero City,Dwarka Sector 21:DOWN:DL_ORANGE,New Delhi:UP:DL_ORANGE,,\nDhaula Kuan,Dwarka Sector 21:DOWN:DL_ORANGE,New Delhi:UP:DL_ORANGE,,\nDilshad Garden,Rithala:UP:DL_RED,,,\nDwarka,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwarka Sector 10,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwarka Sector 11,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwarka Sector 12,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwarka Sector 13,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwarka Sector 14,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwarka Sector 21,Vaishali/Noida City Centre:DOWN:DL_BLUE,New Delhi:UP:DL_ORANGE,,\nDwarka Sector 8,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwarka Sector 9,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nDwraka Mor,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nEscorts Mujesar,ITO:UP:DL_VIOLET,,,\nGTB Nagar,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nGhitorni,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nGolf Course,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nGovind Puri,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nGreen Park,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nGuru Dronacharya,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nHaiderpur,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nHauz Khas,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nHuda City Centre,Samaypur Badli:UP:DL_YELLOW,,,\nIGI Airport,Dwarka Sector 21:DOWN:DL_ORANGE,New Delhi:UP:DL_ORANGE,,\nIFFCO Chowk,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nINA,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nInderlok,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED\nIndraprastha,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nITO,Escorts Mujesar:DOWN:DL_VIOLET,,,\nJahangir Puri,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nJanakpuri East,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nJanakpuri West,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nJangpura,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nJanpath,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nJasola Appllo,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nJhandewalan,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nJhilmil,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nJLN Stadium,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nJor Bagh,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nKailash Colony,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nKalkaji Mandir,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nKanhaiya Nagar,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nKarkarduma,Vaishali:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nKarol Bagh,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nKashmere Gate,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,Huda City Centre:DOWN:DL_YELLOW,Huda City Centre:UP:DL_YELLOW\nKaushabi,Vaishali:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nKeshav Puram,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nKhan Market,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nKirti Nagar,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,Mundka:UP:DL_GREEN,\nKohat Enclave,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nLajpat Nagar,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nLaxmi Nagar,Vaishali:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nM G Road,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nMadipur,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nMalviya Nagar,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nMandi House,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET\nMansarovar Park,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nMayur Vihar,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nMayur Vihar Extension,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nMewala Maharajpur,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nModel Town,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nMohan Estate,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nMoolchand,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nMoti Nagar,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nMoulsari Avenue,Sikanderpur Down:DOWN:DL_RAPID,Sikanderpur Up:UP:DL_RAPID,,\nMundka,Kirti Nagar:DOWN:DL_GREEN,,,\nNangloi,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nNangloi Railway Station,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nNawada,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nNeelam Chowk,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nNehru Place,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nNetaji Subhash Place,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nNew Ashok Nagar,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nNew Delhi,Dwarka Sector 21:DOWN:DL_ORANGE,Samaypur Badli:UP:DL_YELLOW,Huda City Centre:DOWN:DL_YELLOW,\nNHPC Chowk,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nNirman Vihar,Vaishali:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nNoida City Centre,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nNoida Sector 15,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nNoida Sector 16,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nNoida Sector 18,Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nOkhla,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nOld Faridabad,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nPashchim Vihar East,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nPashchim Vihar West,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nPatel Chowk,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nPatel Nagar,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nPeeragarhi,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nPhase 2,Sikanderpur Down:DOWN:DL_RAPID,Sikanderpur Up:UP:DL_RAPID,,\nPhase 3,Sikanderpur Down:DOWN:DL_RAPID,Sikanderpur Up:UP:DL_RAPID,,\nPitampura,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nPragati Maidan,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nPratap Nagar,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nPreet Vihar,Vaishali:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nPulbangash,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nPunjabi Bagh,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nQutub Minar,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nRace Course,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nRajdhani Park,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nRajendra Place,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nRajiv Chowk,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,Huda City Centre:DOWN:DL_YELLOW,Huda City Centre:UP:DL_YELLOW\nRajouri Garden,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nRamesh Nagar,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nRamkrishna Ashram Marg,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nRithala,Dilshad Garden:DOWN:DL_RED,,,\nRohini East,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nRohini Sector 18,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nRohini West,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nSaket,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nSamaypur Badli,Huda City Centre:DOWN:DL_YELLOW,,,\nSarai,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nSarita Vihar,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nSatguru Ram Sigh Marg,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nSector 28,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nSeelampur,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nShadipur,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nShahdara,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nShastri Nagar,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nShastri Park,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nShivaji Park,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nShivaji Stadium,Dwarka Sector 21:DOWN:DL_ORANGE,New Delhi:UP:DL_ORANGE,,\nSikanderpur,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nSikanderpur Down,Sikanderpur Up:UP:DL_RAPID,,,\nSikanderpur Up,Sikanderpur Down:DOWN:DL_RAPID,,,\nSubhash Nagar,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nSultanpur,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nSurajmal Stadium,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nTagore Garden,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nTilak Nagar,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nTis Hazari,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nTughlakabad,Escorts Mujesar:DOWN:DL_VIOLET,ITO:UP:DL_VIOLET,,\nUdyog Bhavan,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nUdyog Nagar,Kirti Nagar:DOWN:DL_GREEN,Mundka:UP:DL_GREEN,,\nUttam Nagar East,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nUttam Nagar West,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,\nVaishali,Dwarka Sector 21:UP:DL_BLUE,,,\nVidhan Sabha,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nVishwavidyalaya,Huda City Centre:DOWN:DL_YELLOW,Samaypur Badli:UP:DL_YELLOW,,\nWelcome,Dilshad Garden:DOWN:DL_RED,Rithala:UP:DL_RED,,\nYamuna Bank,Vaishali/Noida City Centre:DOWN:DL_BLUE,Dwarka Sector 21:UP:DL_BLUE,,";
            this.o = (LinearLayout)view.findViewById(2131297576);
            ((ImageButton)view.findViewById(2131296932)).setVisibility(8);
            Log.d((String)"watchbar", (String)"traintabsdelhi");
        } else {
            this.c = "Airoli,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nAman Lodge,Matheran:UP:NM,Neral:DOWN:NM,,,,\nAmbernath,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nAmbivli,CSMT:UP:C,Kasara:DOWN:C,,,,\nAndheri,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nApta,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nAsangaon,CSMT:UP:C,Kasara:DOWN:C,,,,\nAtgaon,CSMT:UP:C,Kasara:DOWN:C,,,,\nBadlapur,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nBamandongri,Kharkopar:DOWN:U,Nerul/Belapur CBD:UP:U,,,,\nBandra,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nBelapur CBD,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nBhandup,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nBhayander,Churchgate:UP:W,Virar:DOWN:W,,,,\nBhivpuri Road,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nBhiwandi Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nBoisar,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nBorivali,Churchgate:UP:W,Virar/Dahanu:DOWN:W,,,,\nByculla,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nCSMT,Kalyan/Khopoli/Kasara:DOWN:C,Panvel/Andheri/Goregaon:DOWN:H,,,,\nCharni Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nChembur,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nChinchpokli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nChunabhatti,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nChurchgate,Borivali/Virar/Dahanu:DOWN:W,,,,,\nCotton Green,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nCurrey Road,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nDadar,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,\nDahanu Road,Churchgate/Virar:UP:W,Panvel:DOWN:DVP,,,,\nDahisar,Churchgate:UP:W,Virar:DOWN:W,,,,\nDativali,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nDiva Jn,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Panvel/Roha:UP:DPR,Vasai Road:UP:DVP,,\nDockyard Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nDolavli,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nDombivli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Virar/Boisar:UP:DVP,,,\nGTB Nagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nGhansoli,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nGhatkopar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nGoregaon,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,,,\nGovandi,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nGrant Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nHamarapur,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nJite,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nJogeshwari,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,,\nJuchandra Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nJuinagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nJumapatti,Matheran:UP:NM,Neral:DOWN:NM,,,,\nKalamboli,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nKalva,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nKalyan,CSMT:UP:C,Khopoli/Kasara:DOWN:C,,,,\nKaman Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nKandivali,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nKanjur Marg,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nKarjat,CSMT:UP:C,Khopoli:DOWN:C,,,,\nKasara,CSMT:UP:C,,,,,\nKasu,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nKelavli,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nKelva Road,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nKhadavli,CSMT:UP:C,Kasara:DOWN:C,,,,\nKhandeshwar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nKhar Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nKharbao,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nKhardi,CSMT:UP:C,Kasara:DOWN:C,,,,\nKharghar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nKharkopar,Nerul/Belapur CBD:UP:U,,,,,\nKhopoli,CSMT/Karjat:UP:C,,,,,\nKings Circle,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,,,\nKopar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Vasai/Dahanu:UP:DVP,Panvel:DOWN:DVP,,\nKoparkhairne,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nKurla,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel:DOWN:H,Andheri:UP:H,\nLower Parel,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nLowjee,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nMahalakshmi,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMahim Jn,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nMalad,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nManasarovar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nMankhurd,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nMarine Lines,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMasjid,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,\nMatheran,Aman Lodge:DOWN:NM,Neral:DOWN:NM,,,,\nMatunga,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nMatunga Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMira Road,Churchgate:UP:W,Virar:DOWN:W,,,,\nMulund,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nMumbai Central,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,,,,\nMumbra,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nNagothane,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nNahur,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nNaigaon,Churchgate:UP:W,Virar:DOWN:W,,,,\nNalla Sopara,Churchgate:UP:W,Virar:DOWN:W,Panvel:DOWN:DVP,Dahanu-Shuttle:UP:DVP,,\nNavade Road,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nNeral,CSMT:UP:C,Karjat/Khopoli:DOWN:C,Matheran:UP:NM,,,\nNerul,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nNidi,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nNilje,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nUmbermali,CSMT:UP:C,Kasara:DOWN:C,,,,\nPalasdhari,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nPalghar,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nPanvel,CSMT:UP:H,Andheri:UP:H,Thane:UP:T,Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP\nParel,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nPen,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nPrabhadevi,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nRabale,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nRam Mandir,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,,\nRasayani,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nReay Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nRoha,Panvel/Diva:DOWN:DPR,,,,,\nSandhurst Road,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,\nSanpada,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nSanta Cruz,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nSaphale,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nSeawood Darave,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nSewri,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nShahad,CSMT:UP:C,Kasara:DOWN:C,,,,\nShelu,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nSion,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nSomtane,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nTaloja Panchanand,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nThakurli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nThane,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Vashi/Nerul/Panvel:DOWN:T,,,\nThansit,CSMT:UP:C,Kasara:DOWN:C,,,,\nTilaknagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nTitwala,CSMT:UP:C,Kasara:DOWN:C,,,,\nTurbhe,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nUlhas Nagar,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nUmroli Road,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVadala Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nVaitarana,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVangani,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nVangaon,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVasai Road,Churchgate:UP:W,Virar/Dahanu:DOWN:W,Panvel:DOWN:DVP,Dahanu-Shuttle:UP:DVP,,\nVashi,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nVasind,CSMT:UP:C,Kasara:DOWN:C,,,,\nVidyavihar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nVikhroli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nVile Parle,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nVirar,Churchgate:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVithalwadi,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nWaterpipe,Matheran:UP:NM,Neral:DOWN:NM,,,,\nPune,Lonavla:DOWN:P,,,,,\nShivaji Nagar,Pune:UP:P,Lonavla:DOWN:P,,,,\nKhadki,Pune:UP:P,Lonavla:DOWN:P,,,,\nDapodi,Pune:UP:P,Lonavla:DOWN:P,,,,\nKasarwadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nPimpri,Pune:UP:P,Lonavla:DOWN:P,,,,\nChinchwad,Pune:UP:P,Lonavla:DOWN:P,,,,\nAkurdi,Pune:UP:P,Lonavla:DOWN:P,,,,\nDehu Road,Pune:UP:P,Lonavla:DOWN:P,,,,\nBegdewadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nGhorawadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nTalegaon,Pune:UP:P,Lonavla:DOWN:P,,,,\nVadgaon,Pune:UP:P,Lonavla:DOWN:P,,,,\nKanhe,Pune:UP:P,Lonavla:DOWN:P,,,,\nKamshet,Pune:UP:P,Lonavla:DOWN:P,,,,\nMalavli,Pune:UP:P,Lonavla:DOWN:P,,,,\nLonavla,Pune:UP:P,,,,,";
            this.o = (LinearLayout)view.findViewById(2131297575);
            Log.d((String)"watchbar", (String)"traintabselse");
        }
        a = this.c;
        if (!ConfigurationManager.b(this.getContext()).equalsIgnoreCase("pune")) {
            this.o.setVisibility(0);
            this.z = Boolean.TRUE;
        } else {
            this.o.setVisibility(8);
            this.z = Boolean.FALSE;
        }
        this.n = (LinearLayout)view.findViewById(2131296925);
        this.q = (LinearLayout)view.findViewById(2131296373);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this, view){
            final /* synthetic */ View a;
            final /* synthetic */ g b;
            {
                this.b = g2;
                this.a = view;
            }

            public void onGlobalLayout() {
                android.graphics.Rect rect = new android.graphics.Rect();
                this.a.getWindowVisibleDisplayFrame(rect);
                int n2 = this.a.getRootView().getHeight();
                double d2 = n2 - rect.bottom;
                double d3 = n2;
                java.lang.Double.isNaN((double)d3);
                if (d2 > d3 * 0.15) {
                    this.b.o.setVisibility(8);
                    this.b.n.setVisibility(8);
                    TrainActivity trainActivity = (TrainActivity)this.b.getActivity();
                    if (trainActivity != null) {
                        trainActivity.c();
                        return;
                    }
                } else {
                    TrainActivity trainActivity;
                    if (this.b.z.booleanValue()) {
                        this.b.o.setVisibility(0);
                        this.b.n.setVisibility(0);
                    }
                    if ((trainActivity = (TrainActivity)this.b.getActivity()) != null) {
                        trainActivity.b();
                    }
                }
            }
        });
        this.E = (EditText)view.findViewById(2131297278);
        this.E.addTextChangedListener(this.F);
        this.g = new ArrayList(this.f);
        this.m = (ImageView)view.findViewById(2131296755);
        this.j = (ExpandableListView)view.findViewById(2131296935);
        this.a(this.c, true, false, true);
        if (C && (string = D) != null) {
            int n2 = this.d.indexOf((Object)string);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("stationArrayList.indexOf(");
            stringBuilder.append(D);
            stringBuilder.append("): ");
            stringBuilder.append(n2);
            Log.d((String)"select_station_fragment", (String)stringBuilder.toString());
            this.j.setSelection(n2);
            if (Build.VERSION.SDK_INT >= 14) {
                this.j.expandGroup(n2, true);
            } else {
                this.j.expandGroup(n2);
            }
            this.B = n2;
        }
        this.j.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public boolean onGroupClick(ExpandableListView expandableListView, View view, int n2, long l2) {
                Log.d((String)"group111", (String)"setOnGroupClickListener called");
                if (g.a(this.a) != -1 && g.a(this.a) != n2) {
                    this.a.j.collapseGroup(g.a(this.a));
                    Log.d((String)"group111", (String)"000");
                }
                if (this.a.j.isGroupExpanded(n2)) {
                    this.a.j.collapseGroup(n2);
                    Log.d((String)"group111", (String)"111");
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 14) {
                    this.a.j.expandGroup(n2, true);
                } else {
                    this.a.j.expandGroup(n2);
                }
                Log.d((String)"group111", (String)"222");
                return true;
            }
        });
        this.j.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onGroupExpand(int n2) {
                Log.d((String)"group111", (String)"setOnGroupExpandListener called");
                this.a.j.setSelection(n2);
                g.a(this.a, n2);
                ((android.view.inputmethod.InputMethodManager)this.a.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(g.b(this.a).getWindowToken(), 0);
            }
        });
        this.getActivity().getWindow().setSoftInputMode(3);
        view.findViewById(2131297682).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        view.findViewById(2131296504).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        view.findViewById(2131296825).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        view.findViewById(2131297502).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        view.findViewById(2131297018).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        view.findViewById(2131297135).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        view.findViewById(2131296373).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        view.findViewById(2131296604).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        view.findViewById(2131296659).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        view.findViewById(2131296661).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        view.findViewById(2131296663).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        view.findViewById(2131296665).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        view.findViewById(2131296667).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        view.findViewById(2131296669).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        view.findViewById(2131296671).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.a(view);
            }
        });
        this.p = view;
        if (ConfigurationManager.b(this.getContext()).equalsIgnoreCase("pune")) {
            view.findViewById(2131297135).performClick();
            this.n.setVisibility(8);
        }
        this.m.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ g a;
            {
                this.a = g2;
            }

            public void onClick(View view) {
                this.a.b();
            }
        });
        this.getActivity();
        return view;
    }

}

