/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Log
 *  androidx.core.app.e
 *  com.mobond.mindicator.ui.train.TrainsAtStationUI
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Vector
 */
package com.mobond.mindicator.ui.lt.trainutils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.e;
import com.mobond.mindicator.ui.d;
import com.mobond.mindicator.ui.lt.trainutils.a;
import com.mobond.mindicator.ui.lt.trainutils.f;
import com.mobond.mindicator.ui.train.TrainsAtStationUI;
import com.mulo.a.d.b;
import com.mulo.a.d.h;
import com.mulo.a.d.i;
import com.mulo.a.d.k;
import com.mulo.a.d.l;
import java.util.Vector;

public class GetAlertJobIntentService
extends e {
    public static int a(String string, String string2, String string3, String string4, Context context) {
        if (f.a(string)) {
            return f.a(string, string2);
        }
        l l2 = b.b(string, string2, "Direct Train", 120, false, (Object)context);
        if (l2 != null) {
            return ((i)l2.d.get((int)0)).n;
        }
        String[] arrstring = "Airoli,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nAman Lodge,Matheran:UP:NM,Neral:DOWN:NM,,,,\nAmbernath,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nAmbivli,CSMT:UP:C,Kasara:DOWN:C,,,,\nAndheri,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nApta,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nAsangaon,CSMT:UP:C,Kasara:DOWN:C,,,,\nAtgaon,CSMT:UP:C,Kasara:DOWN:C,,,,\nBadlapur,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nBamandongri,Kharkopar:DOWN:U,Nerul/Belapur CBD:UP:U,,,,\nBandra,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nBelapur CBD,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nBhandup,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nBhayander,Churchgate:UP:W,Virar:DOWN:W,,,,\nBhivpuri Road,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nBhiwandi Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nBoisar,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nBorivali,Churchgate:UP:W,Virar/Dahanu:DOWN:W,,,,\nByculla,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nCSMT,Kalyan/Khopoli/Kasara:DOWN:C,Panvel/Andheri/Goregaon:DOWN:H,,,,\nCharni Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nChembur,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nChinchpokli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nChunabhatti,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nChurchgate,Borivali/Virar/Dahanu:DOWN:W,,,,,\nCotton Green,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nCurrey Road,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nDadar,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,\nDahanu Road,Churchgate/Virar:UP:W,Panvel:DOWN:DVP,,,,\nDahisar,Churchgate:UP:W,Virar:DOWN:W,,,,\nDativali,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nDiva Jn,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Panvel/Roha:UP:DPR,Vasai Road:UP:DVP,,\nDockyard Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nDolavli,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nDombivli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Virar/Boisar:UP:DVP,,,\nGTB Nagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nGhansoli,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nGhatkopar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nGoregaon,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,,,\nGovandi,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nGrant Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nHamarapur,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nJite,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nJogeshwari,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,,\nJuchandra Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nJuinagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nJumapatti,Matheran:UP:NM,Neral:DOWN:NM,,,,\nKalamboli,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nKalva,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nKalyan,CSMT:UP:C,Khopoli/Kasara:DOWN:C,,,,\nKaman Road,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nKandivali,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nKanjur Marg,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nKarjat,CSMT:UP:C,Khopoli:DOWN:C,,,,\nKasara,CSMT:UP:C,,,,,\nKasu,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nKelavli,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nKelva Road,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nKhadavli,CSMT:UP:C,Kasara:DOWN:C,,,,\nKhandeshwar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nKhar Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nKharbao,Vasai/Dahanu:UP:DVP,Diva/Panvel:DOWN:DVP,,,,\nKhardi,CSMT:UP:C,Kasara:DOWN:C,,,,\nKharghar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nKharkopar,Nerul/Belapur CBD:UP:U,,,,,\nKhopoli,CSMT/Karjat:UP:C,,,,,\nKings Circle,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,,,\nKopar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Vasai/Dahanu:UP:DVP,Panvel:DOWN:DVP,,\nKoparkhairne,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nKurla,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel:DOWN:H,Andheri:UP:H,\nLower Parel,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nLowjee,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nMahalakshmi,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMahim Jn,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nMalad,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nManasarovar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nMankhurd,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nMarine Lines,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMasjid,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,\nMatheran,Aman Lodge:DOWN:NM,Neral:DOWN:NM,,,,\nMatunga,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nMatunga Road,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nMira Road,Churchgate:UP:W,Virar:DOWN:W,,,,\nMulund,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nMumbai Central,Churchgate:UP:W,Borivali/Virar/Dahanu:DOWN:W,,,,\nMumbra,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nNagothane,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nNahur,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nNaigaon,Churchgate:UP:W,Virar:DOWN:W,,,,\nNalla Sopara,Churchgate:UP:W,Virar:DOWN:W,Panvel:DOWN:DVP,Dahanu-Shuttle:UP:DVP,,\nNavade Road,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nNeral,CSMT:UP:C,Karjat/Khopoli:DOWN:C,Matheran:UP:NM,,,\nNerul,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nNidi,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nNilje,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nUmbermali,CSMT:UP:C,Kasara:DOWN:C,,,,\nPalasdhari,CSMT/Karjat:UP:C,Khopoli:DOWN:C,,,,\nPalghar,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nPanvel,CSMT:UP:H,Andheri:UP:H,Thane:UP:T,Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP\nParel,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nPen,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nPrabhadevi,Churchgate:UP:W,Borivali/Virar:DOWN:W,,,,\nRabale,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nRam Mandir,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Goregaon-Harbour:DOWN:H,,\nRasayani,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nReay Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nRoha,Panvel/Diva:DOWN:DPR,,,,,\nSandhurst Road,CSMT-Central:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,CSMT-Harbour:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,\nSanpada,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nSanta Cruz,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nSaphale,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nSeawood Darave,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,Kharkopar:DOWN:U,\nSewri,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nShahad,CSMT:UP:C,Kasara:DOWN:C,,,,\nShelu,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nSion,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nSomtane,Roha:UP:DPR,Panvel/Diva:DOWN:DPR,,,,\nTaloja Panchanand,Panvel/Roha:UP:DPR,Diva:DOWN:DPR,Vasai/Dahanu:UP:DVP,,,\nThakurli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nThane,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,Vashi/Nerul/Panvel:DOWN:T,,,\nThansit,CSMT:UP:C,Kasara:DOWN:C,,,,\nTilaknagar,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,,,\nTitwala,CSMT:UP:C,Kasara:DOWN:C,,,,\nTurbhe,Thane:UP:T,Vashi/Nerul/Panvel:DOWN:T,,,,\nUlhas Nagar,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nUmroli Road,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVadala Road,CSMT:UP:H,Panvel/Andheri/Goregaon:DOWN:H,,,,\nVaitarana,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVangani,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nVangaon,Churchgate/Virar:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVasai Road,Churchgate:UP:W,Virar/Dahanu:DOWN:W,Panvel:DOWN:DVP,Dahanu-Shuttle:UP:DVP,,\nVashi,CSMT:UP:H,Panvel:DOWN:H,Andheri:UP:H,Thane:UP:T,,\nVasind,CSMT:UP:C,Kasara:DOWN:C,,,,\nVidyavihar,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nVikhroli,CSMT:UP:C,Kalyan/Khopoli/Kasara:DOWN:C,,,,\nVile Parle,Churchgate:UP:W,Borivali/Virar:DOWN:W,CSMT:UP:H,Andheri/Goregaon-Harbour:DOWN:H,Panvel:DOWN:H,\nVirar,Churchgate:UP:W,Dahanu:DOWN:W,Panvel:DOWN:DVP,,,\nVithalwadi,CSMT:UP:C,Karjat/Khopoli:DOWN:C,,,,\nWaterpipe,Matheran:UP:NM,Neral:DOWN:NM,,,,\nPune,Lonavla:DOWN:P,,,,,\nShivaji Nagar,Pune:UP:P,Lonavla:DOWN:P,,,,\nKhadki,Pune:UP:P,Lonavla:DOWN:P,,,,\nDapodi,Pune:UP:P,Lonavla:DOWN:P,,,,\nKasarwadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nPimpri,Pune:UP:P,Lonavla:DOWN:P,,,,\nChinchwad,Pune:UP:P,Lonavla:DOWN:P,,,,\nAkurdi,Pune:UP:P,Lonavla:DOWN:P,,,,\nDehu Road,Pune:UP:P,Lonavla:DOWN:P,,,,\nBegdewadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nGhorawadi,Pune:UP:P,Lonavla:DOWN:P,,,,\nTalegaon,Pune:UP:P,Lonavla:DOWN:P,,,,\nVadgaon,Pune:UP:P,Lonavla:DOWN:P,,,,\nKanhe,Pune:UP:P,Lonavla:DOWN:P,,,,\nKamshet,Pune:UP:P,Lonavla:DOWN:P,,,,\nMalavli,Pune:UP:P,Lonavla:DOWN:P,,,,\nLonavla,Pune:UP:P,,,,,".split("\n");
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!string.equals((Object)k.b(arrstring[i2].split(",")[0]))) continue;
            String[] arrstring2 = arrstring[i2].split(",");
            for (int i3 = 1; i3 < arrstring2.length; ++i3) {
                String[] arrstring3 = arrstring2[i3].split(":")[0].split("/");
                for (int i4 = 0; i4 < arrstring3.length; ++i4) {
                    String string5 = arrstring3[i4];
                    String[] arrstring4 = h.a(string3, string4, (Object)context);
                    boolean bl = false;
                    for (int i5 = 0; i5 < arrstring4.length; ++i5) {
                        if (!string2.equals((Object)arrstring4[i5].split("#")[2])) continue;
                        bl = true;
                    }
                    if (!string2.equals((Object)k.b(string5)) && !bl) {
                        continue;
                    }
                    String string6 = arrstring2[i3].split(":")[1];
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("direction ");
                    stringBuilder.append(string6);
                    Log.d((String)"55555", (String)stringBuilder.toString());
                    int n2 = h.f;
                    if (string6.equals((Object)"UP")) {
                        return h.d;
                    }
                    if (string6.equals((Object)"DOWN")) {
                        return h.e;
                    }
                    if (string6.equals((Object)"NEUTRAL")) {
                        n2 = h.f;
                    }
                    return n2;
                }
            }
        }
        return -1;
    }

    public static void a(Context context, Intent intent) {
        GetAlertJobIntentService.a((Context)context, GetAlertJobIntentService.class, (int)105, (Intent)intent);
    }

    private void a(final d d2, final Context context) {
        a.a(d2.s, d2.v.split("-")[0].trim(), d2.b, new com.mulo.b.a(){

            @Override
            public void a() {
            }

            @Override
            public void a(byte[] arrby, byte[] arrby2, Object object) {
                String string = new String(arrby);
                GetAlertJobIntentService.this.a(string, d2, context);
            }
        }, null);
    }

    private void a(String string, d d2, Context context) {
        if (!string.isEmpty()) {
            String string2 = d2.v.split("-")[0].trim();
            String[] arrstring = d2.c.split("\n");
            String string3 = arrstring[arrstring.length - 1];
            String string4 = string3.split("-")[0].trim();
            String string5 = string3.split("-")[1].trim();
            int n2 = d2.x;
            if (n2 == -1) {
                n2 = GetAlertJobIntentService.a(string4, string5, d2.w, d2.p, context);
            }
            if (n2 != -1) {
                Intent intent = new Intent(context, TrainsAtStationUI.class);
                intent.putExtra("selected_route", d2.w);
                intent.putExtra("you_are_at", string2);
                intent.putExtra("iscallfromfav", false);
                intent.putExtra("selected_direction", n2);
                intent.putExtra("selected_direction_end_stations", string5);
                intent.putExtra("tn", d2.s);
                intent.putExtra("isTrainAlert", true);
                intent.putExtra("extra_rsp", string);
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        }
    }

    protected void a(Intent intent) {
        d d2 = f.b(intent.getStringExtra("tn"), (Context)this);
        if (d2 != null) {
            this.a(d2, (Context)this);
        }
    }

}

